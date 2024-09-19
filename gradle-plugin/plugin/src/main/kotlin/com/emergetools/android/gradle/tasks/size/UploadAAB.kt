package com.emergetools.android.gradle.tasks.size

import com.emergetools.android.gradle.BuildConfig
import com.emergetools.android.gradle.tasks.base.ArtifactMetadata
import com.emergetools.android.gradle.tasks.base.BaseUploadTask
import kotlinx.datetime.Clock
import org.gradle.api.file.RegularFileProperty
import org.gradle.api.tasks.InputFile
import org.gradle.api.tasks.PathSensitive
import org.gradle.api.tasks.PathSensitivity
import org.gradle.api.tasks.TaskAction
import java.util.zip.ZipEntry
import java.util.zip.ZipOutputStream

abstract class UploadAAB : BaseUploadTask() {

  @get:InputFile
  @get:PathSensitive(PathSensitivity.NAME_ONLY)
  abstract val artifact: RegularFileProperty

  override fun includeFilesInUpload(zos: ZipOutputStream) {
    artifact.get().asFile.inputStream().use { inputStream ->
      zos.putNextEntry(ZipEntry(artifact.get().asFile.name))
      inputStream.copyTo(zos)
      zos.closeEntry()
    }
  }

  @TaskAction
  open fun execute() {
    val artifactName = artifact.get().asFile.name
    val artifactMetadata = ArtifactMetadata(
      created = Clock.System.now(),
      emergeGradlePluginVersion = BuildConfig.VERSION,
      androidGradlePluginVersion = agpVersion.get(),
      targetArtifactZipPath = artifactName,
      proguardMappingsZipPath = "$artifactName/$AAB_PROGUARD_PATH",
    )

    upload(artifactMetadata) { response ->
      logger.lifecycle("AAB Upload successful! View Emerge's size analysis at the following url:")
      logger.lifecycle("https://emergetools.com/build/${response.uploadId}")
      logger.lifecycle("Size processing can take up to 10 minutes.")
    }
  }

  companion object {
    const val AAB_PROGUARD_PATH =
      "BUNDLE-METADATA/com.android.tools.build.obfuscation/proguard.map"
  }
}
