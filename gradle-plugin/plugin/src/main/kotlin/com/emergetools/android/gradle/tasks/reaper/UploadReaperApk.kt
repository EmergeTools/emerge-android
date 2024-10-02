package com.emergetools.android.gradle.tasks.reaper

import com.emergetools.android.gradle.BuildConfig
import com.emergetools.android.gradle.tasks.base.ArtifactMetadata
import com.emergetools.android.gradle.tasks.base.BaseUploadTask
import com.emergetools.android.gradle.tasks.size.UploadAPK
import com.emergetools.android.gradle.tasks.size.UploadAPK.Companion.APK_EXTENSION
import kotlinx.datetime.Clock
import org.gradle.api.file.DirectoryProperty
import org.gradle.api.file.RegularFileProperty
import org.gradle.api.provider.Property
import org.gradle.api.tasks.Input
import org.gradle.api.tasks.InputDirectory
import org.gradle.api.tasks.InputFile
import org.gradle.api.tasks.Optional
import org.gradle.api.tasks.PathSensitive
import org.gradle.api.tasks.PathSensitivity
import org.gradle.api.tasks.StopExecutionException
import org.gradle.api.tasks.TaskAction
import java.io.File
import java.util.zip.ZipEntry
import java.util.zip.ZipOutputStream

abstract class UploadReaperApk : UploadAPK() {

  @get:Input
  abstract val publishableApiKey: Property<String>

  @TaskAction
  override fun execute() {
    if (publishableApiKey.orNull == null) {
      throw StopExecutionException("publishableApiKey must be set for Reaper to work properly. See https://docs.emergetools.com/docs/reaper-setup-android#configure-the-sdk.")
    }

    val artifactName = primaryArtifact.name
    val proguardMappingName = proguardMapping.asFile.orNull?.name
    val artifactMetadata = ArtifactMetadata(
      created = Clock.System.now(),
      emergeGradlePluginVersion = BuildConfig.VERSION,
      androidGradlePluginVersion = agpVersion.get(),
      targetArtifactZipPath = artifactName,
      proguardMappingsZipPath = proguardMappingName,
    )

    upload(artifactMetadata) { response ->
      logger.lifecycle("Reaper initialized! View Reaper reports for this version at the following url:")
      logger.lifecycle("https://emergetools.com/reaper/${response.uploadId}")
      logger.lifecycle("Note: Initial Reaper processing can take up to 10 minutes.")
    }
  }
}
