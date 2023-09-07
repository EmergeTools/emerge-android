package com.emergetools.android.gradle.tasks.upload

import com.android.build.api.variant.Variant
import com.emergetools.android.gradle.BuildConfig
import com.emergetools.android.gradle.EmergePlugin
import com.emergetools.android.gradle.EmergePluginExtension
import com.emergetools.android.gradle.ProductOptions
import com.emergetools.android.gradle.util.AgpVersions
import com.emergetools.android.gradle.util.dependencies.Dependencies
import com.emergetools.android.gradle.util.dependencies.Library
import com.emergetools.android.gradle.util.dependencies.Module
import com.emergetools.android.gradle.util.network.EmergeUploadRequestData
import com.emergetools.android.gradle.util.network.EmergeUploadResponse
import com.emergetools.android.gradle.util.network.SOURCE_GRADLE_PLUGIN
import com.emergetools.android.gradle.util.network.fetchSignedUrl
import com.emergetools.android.gradle.util.network.postFile
import com.emergetools.android.gradle.util.putOrAppend
import kotlinx.serialization.encodeToString
import kotlinx.serialization.json.Json
import okhttp3.HttpUrl.Companion.toHttpUrlOrNull
import okhttp3.OkHttpClient
import org.gradle.api.DefaultTask
import org.gradle.api.Project
import org.gradle.api.attributes.Attribute
import org.gradle.api.file.DirectoryProperty
import org.gradle.api.provider.Property
import org.gradle.api.tasks.Input
import org.gradle.api.tasks.Optional
import org.gradle.api.tasks.OutputDirectory
import java.io.BufferedOutputStream
import java.io.File
import java.util.concurrent.TimeUnit
import java.util.jar.JarEntry
import java.util.jar.JarFile
import java.util.zip.ZipEntry
import java.util.zip.ZipOutputStream
import kotlin.io.path.absolutePathString
import kotlin.io.path.createTempDirectory

abstract class BaseUploadTask : DefaultTask() {

  @get:Input
  abstract val apiToken: Property<String>

  @get:OutputDirectory
  abstract val outputDir: DirectoryProperty

  @get:Input
  abstract val agpVersion: Property<String>

  @get:Input
  abstract val variantName: Property<String>

  @get:Input
  @get:Optional
  abstract val tag: Property<String>

  @get:Input
  @get:Optional
  abstract val dryRun: Property<Boolean>

  @get:Input
  @get:Optional
  abstract val sha: Property<String>

  @get:Input
  @get:Optional
  abstract val baseSha: Property<String>

  @get:Input
  @get:Optional
  abstract val branchName: Property<String>

  @get:Input
  @get:Optional
  abstract val prNumber: Property<String>

  @get:Input
  @get:Optional
  abstract val gitHubRepoOwner: Property<String>

  @get:Input
  @get:Optional
  abstract val gitHubRepoName: Property<String>

  @get:Input
  @get:Optional
  abstract val gitLabProjectId: Property<String>

  /**
   * Internal only for testing.
   */
  @get:Input
  @get:Optional
  abstract val baseUrl: Property<String>

  protected fun upload(artifactMetadata: ArtifactMetadata): EmergeUploadResponse? {
    check(!apiToken.getOrElse(System.getenv(DEFAULT_API_TOKEN_ENV_KEY)).isNullOrBlank()) {
      "Missing API token. Please set the 'apiToken' property in the emerge {} extension block or" +
        " ensure an 'EMERGE_API_TOKEN' environment variable is set with a valid API token." +
        " See https://docs.emergetools.com/docs/gradle-plugin for more information."
    }

    val outputDir = outputDir.get().asFile
    outputDir.mkdirs()

    val zipFile = File(createTempDirectory("").absolutePathString(), OUTPUT_FILE_NAME)

    ZipOutputStream(BufferedOutputStream(zipFile.outputStream())).use { zos ->
      includeFilesInUpload(zos)

      val json = Json.encodeToString(artifactMetadata)
      val appMetadataFile = File(outputDir, ArtifactMetadata.JSON_FILE_NAME).also {
        it.createNewFile()
        it.writeText(json)
      }
      appMetadataFile.inputStream().use { inputStream ->
        zos.putNextEntry(ZipEntry(appMetadataFile.name))
        inputStream.copyTo(zos)
        zos.closeEntry()
      }

      val dependenciesJson = Json.encodeToString(dependencies())
      val dependenciesFile = File(outputDir, Dependencies.JSON_FILE_NAME).also {
        it.createNewFile()
        it.writeText(dependenciesJson)
      }
      dependenciesFile.inputStream().use { inputStream ->
        zos.putNextEntry(ZipEntry(dependenciesFile.name))
        inputStream.copyTo(zos)
        zos.closeEntry()
      }
    }

    // Write the upload response to a file so it can be read by clients should they want to ingest
    // the buildId or url
    val response = uploadFile(zipFile, outputDir)
    File(outputDir, UPLOAD_RESPONSE_FILE_NAME).also {
      it.createNewFile()
      it.writeText(Json.encodeToString(response))
    }

    return response
  }

  private fun dependencies(): Dependencies {
    val dependencies = mutableMapOf<String, List<String>>()

    val runtimeClasspathConfig =
      project.configurations.getByName("${variantName.get()}RuntimeClasspath")
    listOf(
      ARTIFACT_RESOURCES,
      ARTIFACT_CLASSES,
      ARTIFACT_ASSETS,
      ARTIFACT_JNI,
    ).forEach { artifactType ->
      runtimeClasspathConfig.incoming.artifactView { viewConfiguration ->
        viewConfiguration.attributes { attributeContainer ->
          attributeContainer.attribute(
            Attribute.of("artifactType", String::class.java), artifactType
          )
        }
      }.artifacts.artifacts.forEach { resolvedArtifact ->
        val id = resolvedArtifact.id.componentIdentifier
        val dependencyEntries = resolvedArtifact.file
          .walkTopDown()
          .filter(File::isFile)
          .flatMap { artifactFile ->
            // Normalize the name to remove the leading path, so it's relative to the module root.
            val name = artifactFile.absolutePath.removePrefix(resolvedArtifact.file.absolutePath)
            when (artifactFile.extension) {
              // If the artifact is a jar, we want to include all the entries in the jar
              "jar" -> JarFile(artifactFile).use { jarFile ->
                jarFile.entries()
                  .asSequence()
                  .filterNot(JarEntry::isDirectory)
                  .map(JarEntry::getName)
                  .toList()
              }

              else -> listOf(name)
            }
          }.toList()

        if (dependencyEntries.isNotEmpty()) {
          dependencies.putOrAppend(id.displayName, dependencyEntries)
        }
      }
    }

    val libraries = mutableListOf<Library>()
    val modules = mutableListOf(
      Module(
        name = project.name,
        path = project.path,
        entries = emptyList(),
        isRoot = true,
      )
    )
    dependencies.entries.mapNotNull {
      val keySplits = it.key.split(":")
      if (it.key.startsWith("project ")) {
        modules.add(
          Module(
            name = keySplits.last(),
            path = it.key.substringAfter("project "),
            entries = it.value,
          )
        )
      } else {
        // Check to ensure the dependency is in the format group:name:version
        if (keySplits.size != 3) {
          logger.warn(
            "Skipping invalid dependency: ${it.key}, expected format: group:name:version, please let the Emerge team know of this!"
          )
          return@mapNotNull null
        }

        libraries.add(
          Library(
            groupId = keySplits[0],
            artifactId = keySplits[1],
            version = keySplits[2],
            entries = it.value
          )
        )
      }
    }

    return Dependencies(
      libraries = libraries,
      modules = modules,
    )
  }

  /**
   * Helper for including additional files in the zip file uploaded to Emerge.
   */
  abstract fun includeFilesInUpload(zos: ZipOutputStream)

  open fun uploadRequestData(file: File): EmergeUploadRequestData {
    val repoName = if (
      gitHubRepoOwner.orNull.isNullOrEmpty() ||
      gitHubRepoName.orNull.isNullOrBlank()
    ) null else "${gitHubRepoOwner.get()}/${gitHubRepoName.get()}"

    return EmergeUploadRequestData(
      apiToken = apiToken.get(),
      filename = file.name,
      sha = sha.orNull,
      baseSha = baseSha.orNull,
      branch = branchName.orNull,
      repoName = repoName,
      prNumber = prNumber.orNull,
      tag = tag.orNull,
      gitlabProjectId = gitLabProjectId.orNull,
      androidSnapshotsEnabled = false,
      source = "${SOURCE_GRADLE_PLUGIN}_${BuildConfig.VERSION}"
    )
  }

  private fun uploadFile(
    file: File,
    outputDir: File,
  ): EmergeUploadResponse? {
    if (dryRun.get()) {
      file.copyTo(File(outputDir, "/${file.name}"), overwrite = true)
      return null
    }

    val okHttpClient = OkHttpClient.Builder()
      .connectTimeout(30, TimeUnit.SECONDS)
      .readTimeout(30, TimeUnit.SECONDS)
      .writeTimeout(30, TimeUnit.SECONDS)
      .build()

    val baseUrl = baseUrl.getOrElse(BuildConfig.EMERGE_BASE_URL)
    val baseHttpUrl = baseUrl.toHttpUrlOrNull()
      ?: error("Invalid baseUrl provided: $baseUrl")

    val uploadResponse = fetchSignedUrl(
      client = okHttpClient,
      uploadData = uploadRequestData(file),
      baseUrl = baseHttpUrl
    )
    val signedUrl = uploadResponse.uploadUrl.toHttpUrlOrNull()
      ?: error("Error parsing uploadUrl: ${uploadResponse.uploadUrl}")

    logger.debug("Uploading file to Emerge: ${file.path}")

    postFile(
      client = okHttpClient,
      file = file,
      signedUrl = signedUrl
    )
    return uploadResponse
  }

  companion object {
    const val OUTPUT_FILE_NAME = "emerge.zip"
    const val UPLOAD_RESPONSE_FILE_NAME = "upload_response.json"
    const val DEFAULT_API_TOKEN_ENV_KEY = "EMERGE_API_TOKEN"
    private const val ARTIFACT_OUTPUT_DIR = "${EmergePlugin.BUILD_OUTPUT_DIR_NAME}/artifacts"

    private const val BASE_URL_ARG_KEY = "baseUrl"

    // Taken from com.android.build.gradle.internal.publishing.AndroidArtifacts
    const val ARTIFACT_CLASSES = "android-classes"
    const val ARTIFACT_RESOURCES = "android-res"
    const val ARTIFACT_ASSETS = "android-assets"
    const val ARTIFACT_JNI = "android-jni"
    // Intentionally skipping aidl, renderscript and other minors as we haven't seen occurrences yet

    fun BaseUploadTask.setUploadTaskInputs(
      extension: EmergePluginExtension,
      project: Project,
      variant: Variant,
    ) {
      dryRun.set(extension.dryRun)
      apiToken.set(extension.apiToken)
      agpVersion.set(AgpVersions.CURRENT.toString())
      outputDir.set(File(project.buildDir, ARTIFACT_OUTPUT_DIR).also(File::mkdirs))
      variantName.set(variant.name)

      sha.set(extension.vcsOptions.sha)
      baseSha.set(extension.vcsOptions.baseSha)
      branchName.set(extension.vcsOptions.branchName)
      prNumber.set(extension.vcsOptions.prNumber)
      gitHubRepoOwner.set(extension.vcsOptions.gitHubOptions.repoOwner)
      gitHubRepoName.set(extension.vcsOptions.gitHubOptions.repoName)
      gitLabProjectId.set(extension.vcsOptions.gitLabOptions.projectId)

      if (project.hasProperty(BASE_URL_ARG_KEY)) {
        baseUrl.set(project.property(BASE_URL_ARG_KEY) as String)
      }
    }

    fun BaseUploadTask.setTagFromProductOptions(
      productOptions: ProductOptions,
      variant: Variant,
    ) {
      if (productOptions.tagFromVariant.getOrElse(false)) {
        tag.set(variant.name)
      } else {
        tag.set(productOptions.tag)
      }
    }
  }
}
