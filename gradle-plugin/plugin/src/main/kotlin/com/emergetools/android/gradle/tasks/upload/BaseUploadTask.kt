package com.emergetools.android.gradle.tasks.upload

import com.android.build.api.variant.Variant
import com.emergetools.android.gradle.BuildConfig
import com.emergetools.android.gradle.EmergePlugin
import com.emergetools.android.gradle.EmergePluginExtension
import com.emergetools.android.gradle.ProductOptions
import com.emergetools.android.gradle.util.AgpVersions
import com.emergetools.android.gradle.util.dependencies.ARTIFACT_ASSETS
import com.emergetools.android.gradle.util.dependencies.ARTIFACT_CLASSES
import com.emergetools.android.gradle.util.dependencies.ARTIFACT_JNI
import com.emergetools.android.gradle.util.dependencies.ARTIFACT_RESOURCES
import com.emergetools.android.gradle.util.dependencies.Dependencies
import com.emergetools.android.gradle.util.dependencies.buildDependencies
import com.emergetools.android.gradle.util.network.EmergeUploadRequestData
import com.emergetools.android.gradle.util.network.EmergeUploadResponse
import com.emergetools.android.gradle.util.network.SOURCE_GRADLE_PLUGIN
import com.emergetools.android.gradle.util.network.fetchSignedUrl
import com.emergetools.android.gradle.util.network.postFile
import kotlinx.serialization.encodeToString
import kotlinx.serialization.json.Json
import okhttp3.HttpUrl.Companion.toHttpUrlOrNull
import okhttp3.OkHttpClient
import org.gradle.api.DefaultTask
import org.gradle.api.Project
import org.gradle.api.artifacts.ArtifactCollection
import org.gradle.api.attributes.Attribute
import org.gradle.api.file.DirectoryProperty
import org.gradle.api.provider.Property
import org.gradle.api.tasks.Input
import org.gradle.api.tasks.Optional
import org.gradle.api.tasks.OutputDirectory
import java.io.BufferedOutputStream
import java.io.File
import java.util.concurrent.TimeUnit
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
  abstract val gitHubIncludeEventInformation: Property<Boolean>

  @get:Input
  @get:Optional
  abstract val gitLabProjectId: Property<String>

  @get:Input
  abstract val includeDependencyInformation: Property<Boolean>

  @get:Input
  @get:Optional
  abstract val appModuleName: Property<String>

  @get:Input
  @get:Optional
  abstract val appModulePath: Property<String>

  private lateinit var artifacts: List<ArtifactCollection>

  fun setArtifacts(artifacts: List<ArtifactCollection>) {
    this.artifacts = artifacts
  }

  /**
   * Internal only for testing.
   */
  @get:Input
  @get:Optional
  abstract val baseUrl: Property<String>

  protected fun upload(
    artifactMetadata: ArtifactMetadata,
    onSuccessfulUpload: (EmergeUploadResponse) -> Unit,
  ) {
    check(!apiToken.getOrElse(System.getenv(DEFAULT_API_TOKEN_ENV_KEY)).isNullOrBlank()) {
      "Missing API token. Please set the 'apiToken' property in the emerge {} extension block or" +
        " ensure an 'EMERGE_API_TOKEN' environment variable is set with a valid API token." +
        " See https://docs.emergetools.com/docs/gradle-plugin for more information."
    }

    val outputDir = outputDir.get().asFile
    outputDir.mkdirs()

    val zipFile = File(createTempDirectory("").absolutePathString(), OUTPUT_FILE_NAME)
    logger.debug("Creating Emerge upload zip: ${zipFile.path}")

    ZipOutputStream(BufferedOutputStream(zipFile.outputStream())).use { zos ->
      includeFilesInUpload(zos)

      var finalArtifactMetadata = artifactMetadata

      if (includeDependencyInformation.get()) {
        checkNotNull(appModuleName.orNull) {
          "appModuleName must be set when includeDependencyInformation is true"
        }
        checkNotNull(appModulePath.orNull) {
          "appModulePath must be set when includeDependencyInformation is true"
        }

        val dependencies = buildDependencies(
          artifacts = artifacts,
          defaultModuleName = appModuleName.get(),
          defaultModulePath = appModulePath.get(),
          logger = logger,
        )
        val dependenciesJson = Json.encodeToString(dependencies)
        val dependenciesFile = File(outputDir, Dependencies.JSON_FILE_NAME).also {
          it.createNewFile()
          it.writeText(dependenciesJson)
        }

        if (dependenciesFile.exists()) {
          dependenciesFile.inputStream().use { inputStream ->
            zos.putNextEntry(ZipEntry(dependenciesFile.name))
            inputStream.copyTo(zos)
            zos.closeEntry()
          }
          finalArtifactMetadata = artifactMetadata.copy(
            dependencyMetadataZipPath = dependenciesFile.name,
          )
        }
      }

      if (gitHubIncludeEventInformation.getOrElse(true)) {
        val gitHubEventPath = System.getenv("GITHUB_EVENT_PATH")
        gitHubEventPath?.let {
          val githubEventFile = File(gitHubEventPath)
          if (githubEventFile.exists()) {
            val githubEventDataFile = File(outputDir, CIDebugData.GITHUB_EVENT_DATA_FILE_NAME).also {
              githubEventFile.copyTo(it)
            }
            githubEventDataFile.inputStream().use { inputStream ->
              zos.putNextEntry(ZipEntry(githubEventDataFile.name))
              inputStream.copyTo(zos)
              zos.closeEntry()
            }
            finalArtifactMetadata = artifactMetadata.copy(
              ciDebugData = CIDebugData(
                gitHubEventDataPath = githubEventDataFile.name,
              ),
            )
          }
        }
      }

      val json = Json.encodeToString(finalArtifactMetadata)
      val appMetadataFile = File(outputDir, ArtifactMetadata.JSON_FILE_NAME).also {
        it.createNewFile()
        it.writeText(json)
      }
      appMetadataFile.inputStream().use { inputStream ->
        zos.putNextEntry(ZipEntry(appMetadataFile.name))
        inputStream.copyTo(zos)
        zos.closeEntry()
      }
    }

    if (dryRun.getOrElse(false)) {
      val outputFilePath = File(outputDir, zipFile.name)
      zipFile.copyTo(outputFilePath, overwrite = true)
      logger.lifecycle("Dry run complete. Zip file created at: ${outputFilePath.path}")
      return
    }

    val response = uploadFile(zipFile)
    // Write the upload response to a file so it can be read by clients should they want to ingest
    // the uploadId or url
    File(outputDir, UPLOAD_RESPONSE_FILE_NAME).also {
      it.createNewFile()
      it.writeText(Json.encodeToString(response))
    }
    onSuccessfulUpload(response)
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

  private fun uploadFile(file: File): EmergeUploadResponse {
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

    fun BaseUploadTask.setUploadTaskInputs(
      extension: EmergePluginExtension,
      project: Project,
      variant: Variant,
    ) {
      val emergeOutputDir =
        File(project.layout.buildDirectory.asFile.get(), ARTIFACT_OUTPUT_DIR).also(File::mkdirs)
      dryRun.set(extension.dryRun)
      apiToken.set(extension.apiToken)
      agpVersion.set(AgpVersions.CURRENT.toString())
      outputDir.set(emergeOutputDir)

      sha.set(extension.vcsOptions.sha)
      baseSha.set(extension.vcsOptions.baseSha)
      branchName.set(extension.vcsOptions.branchName)
      prNumber.set(extension.vcsOptions.prNumber)
      gitHubRepoOwner.set(extension.vcsOptions.gitHubOptions.repoOwner)
      gitHubRepoName.set(extension.vcsOptions.gitHubOptions.repoName)
      gitHubIncludeEventInformation.set(extension.vcsOptions.gitHubOptions.includeEventInformation)
      gitLabProjectId.set(extension.vcsOptions.gitLabOptions.projectId)

      if (project.hasProperty(BASE_URL_ARG_KEY)) {
        baseUrl.set(project.property(BASE_URL_ARG_KEY) as String)
      }

      includeDependencyInformation.set(extension.includeDependencyInformation.get())
      if (extension.includeDependencyInformation.get()) {
        appModuleName.set(project.name)
        appModulePath.set(project.path)

        val runtimeClasspathConfiguration =
          project.configurations.getByName("${variant.name}RuntimeClasspath")

        val artifacts = listOf(
          ARTIFACT_RESOURCES,
          ARTIFACT_CLASSES,
          ARTIFACT_ASSETS,
          ARTIFACT_JNI,
        ).map { artifactType ->
          runtimeClasspathConfiguration.incoming.artifactView { viewConfiguration ->
            viewConfiguration.attributes { attributeContainer ->
              attributeContainer.attribute(
                Attribute.of("artifactType", String::class.java),
                artifactType
              )
            }
          }.artifacts
        }
        setArtifacts(artifacts)
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
