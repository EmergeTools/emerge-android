package com.emergetools.android.gradle.tasks.reaper

import com.emergetools.android.gradle.BuildConfig
import com.emergetools.android.gradle.tasks.upload.ArtifactMetadata
import com.emergetools.android.gradle.tasks.upload.BaseUploadTask
import com.emergetools.android.gradle.util.network.EmergeUploadResponse
import com.emergetools.android.gradle.util.preflight.Preflight
import com.emergetools.android.gradle.util.preflight.PreflightFailure
import kotlinx.datetime.Clock
import org.gradle.api.GradleException
import org.gradle.api.file.RegularFileProperty
import org.gradle.api.provider.Property
import org.gradle.api.tasks.Input
import org.gradle.api.tasks.InputFile
import org.gradle.api.tasks.PathSensitive
import org.gradle.api.tasks.PathSensitivity
import org.gradle.api.tasks.TaskAction
import java.util.zip.ZipEntry
import java.util.zip.ZipOutputStream

abstract class InitializeReaper : BaseUploadTask() {

  @get:InputFile
  @get:PathSensitive(PathSensitivity.NAME_ONLY)
  abstract val artifact: RegularFileProperty

  @get:Input
  abstract val reaperPublishableApiKey: Property<String>

  @get:Input
  abstract val reaperEnabled: Property<Boolean>

  override fun includeFilesInUpload(zos: ZipOutputStream) {
    artifact.get().asFile.inputStream().use { inputStream ->
      zos.putNextEntry(ZipEntry(artifact.get().asFile.name))
      inputStream.copyTo(zos)
      zos.closeEntry()
    }
  }

  @TaskAction
  fun execute() {
    val artifactName = artifact.get().asFile.name
    val artifactMetadata = ArtifactMetadata(
      created = Clock.System.now(),
      emergeGradlePluginVersion = BuildConfig.VERSION,
      androidGradlePluginVersion = agpVersion.get(),
      targetArtifactZipPath = artifactName,
      proguardMappingsZipPath = "$artifactName/$AAB_PROGUARD_PATH",
    )

    val preflight = Preflight("Reaper")

    preflight.add("Reaper enabled") {
      if (!reaperEnabled.getOrElse(false)) {
        throw PreflightFailure("Reaper not enabled!")
      }
    }

    preflight.add("reaper.publishableApiKey set") {
      val key = reaperPublishableApiKey.orNull
      if (key == null) {
        throw PreflightFailure("reaper.publishableApiKey not set")
      }
      if (key == "") {
        throw PreflightFailure("reaper.publishableApiKey must not be empty")
      }
    }

    var response: EmergeUploadResponse? = null

    preflight.add("Build uploaded successful") {
      response = upload(artifactMetadata)
      checkNotNull(response) {
        "Upload failed, please check your network connection and try again. ${response.toString()}"
      }
    }

    logger.lifecycle("")
    logger.lifecycle(preflight.render())
    logger.lifecycle("")

    if (preflight.isSuccessful()) {
      logger.lifecycle("Reaper initialized. View Reaper status at the url:")
      logger.lifecycle("https://emergetools.com/reaper/${response!!.uploadId}")
      logger.lifecycle("Reaper processing can take up to 10 minutes.")
    } else {
      throw GradleException(preflight.renderErrors())
    }
  }

  companion object {
    const val AAB_PROGUARD_PATH =
      "BUNDLE-METADATA/com.android.tools.build.obfuscation/proguard.map"
  }
}
