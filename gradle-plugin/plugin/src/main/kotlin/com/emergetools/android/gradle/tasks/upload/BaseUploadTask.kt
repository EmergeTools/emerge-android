package com.emergetools.android.gradle.tasks.upload

import com.emergetools.android.gradle.BuildConfig
import com.emergetools.android.gradle.EmergePlugin
import com.emergetools.android.gradle.EmergePluginExtension
import com.emergetools.android.gradle.util.AgpVersions
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
  abstract val buildType: Property<String>

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

	@get:Input
	@get:Optional
	abstract val snapshotsEnabled: Property<Boolean>

  /**
   * Internal only for testing.
   */
  @get:Input
  @get:Optional
  abstract val baseUrl: Property<String>

  protected fun upload(artifactMetadata: ArtifactMetadata): EmergeUploadResponse? {
    check(apiToken.get().isNotEmpty()) {
      "Missing API token. Please set the 'apiToken' property in the emerge {} extension block." +
        " See https://docs.emergetools.com/gradle-plugin/configuration for more information."
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
    }

    return uploadFile(zipFile, outputDir)
  }

  /**
   * Helper for including additional files in the zip file uploaded to Emerge.
   */
  abstract fun includeFilesInUpload(zos: ZipOutputStream)

  private fun uploadFile(
    file: File,
    outputDir: File,
  ): EmergeUploadResponse? {
    val repoName = if (
      gitHubRepoOwner.orNull.isNullOrEmpty() ||
      gitHubRepoName.orNull.isNullOrBlank()
    ) {
      null
    } else {
      "${gitHubRepoName.get()}/${gitHubRepoOwner.get()}"
    }

    val uploadRequestData = EmergeUploadRequestData(
      apiToken = apiToken.get(),
      filename = file.name,
      sha = sha.get(),
      baseSha = baseSha.get(),
      branch = branchName.get(),
      repoName = repoName,
      prNumber = prNumber.orNull,
      buildType = buildType.orNull,
      gitlabProjectId = gitLabProjectId.orNull,
			androidSnapshotsEnabled = snapshotsEnabled.getOrElse(false),
      source = "${SOURCE_GRADLE_PLUGIN}_${BuildConfig.VERSION}"
    )

    if (dryRun.get()) {
      file.copyTo(File(outputDir, "/${file.name}"), overwrite = true)
      return null
    } else {
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
        uploadData = uploadRequestData,
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
  }

  companion object {
    const val OUTPUT_FILE_NAME = "emerge.zip"

    private const val BASE_URL_ARG_KEY = "baseUrl"

    fun BaseUploadTask.setUploadTaskInputs(
      extension: EmergePluginExtension,
      project: Project,
    ) {
      dryRun.set(extension.dryRun)
      apiToken.set(extension.apiToken)
      agpVersion.set(AgpVersions.CURRENT.toString())
      outputDir.set(File(project.buildDir, EmergePlugin.OUTPUT_DIR_NAME).also(File::mkdirs))

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
  }
}
