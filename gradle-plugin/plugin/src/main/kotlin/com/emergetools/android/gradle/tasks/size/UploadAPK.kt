package com.emergetools.android.gradle.tasks.size

import com.emergetools.android.gradle.BuildConfig
import com.emergetools.android.gradle.tasks.base.ArtifactMetadata
import com.emergetools.android.gradle.tasks.base.BaseUploadTask
import kotlinx.datetime.Clock
import org.gradle.api.file.DirectoryProperty
import org.gradle.api.file.RegularFileProperty
import org.gradle.api.tasks.InputDirectory
import org.gradle.api.tasks.InputFile
import org.gradle.api.tasks.Optional
import org.gradle.api.tasks.PathSensitive
import org.gradle.api.tasks.PathSensitivity
import org.gradle.api.tasks.TaskAction
import java.io.File
import java.util.zip.ZipEntry
import java.util.zip.ZipOutputStream

abstract class UploadAPK : BaseUploadTask() {

  @get:InputDirectory
  @get:PathSensitive(PathSensitivity.NAME_ONLY)
  abstract val artifactDir: DirectoryProperty

  @get:InputFile
  @get:Optional
  @get:PathSensitive(PathSensitivity.NAME_ONLY)
  abstract val proguardMapping: RegularFileProperty

  private val primaryArtifact: File
    get() {
      val apks = artifactDir.get().asFileTree.filter { it.extension == APK_EXTENSION }
      check(apks.files.size < 2) {
        "Multiple APKs found in artifact directory: ${apks.files}, only one APK currently supported"
      }

      return apks.singleFile
    }

  override fun includeFilesInUpload(zos: ZipOutputStream) {
    primaryArtifact.inputStream().use { inputStream ->
      zos.putNextEntry(ZipEntry(primaryArtifact.name))
      inputStream.copyTo(zos)
      zos.closeEntry()
    }

    proguardMapping.asFile.orNull?.let {
      it.inputStream().use { inputStream ->
        zos.putNextEntry(ZipEntry(it.name))
        inputStream.copyTo(zos)
        zos.closeEntry()
      }
    }
  }

  @TaskAction
  fun doExecute() {
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
      logger.lifecycle("APK Upload successful! View Emerge's size analysis at the following url:")
      logger.lifecycle("https://emergetools.com/build/${response.uploadId}")
      logger.lifecycle("Size processing can take up to 10 minutes.")
    }
  }

  companion object {
    const val APK_EXTENSION = "apk"
  }
}
