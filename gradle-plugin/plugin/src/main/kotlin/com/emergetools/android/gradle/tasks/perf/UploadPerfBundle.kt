package com.emergetools.android.gradle.tasks.perf

import com.emergetools.android.gradle.BuildConfig
import com.emergetools.android.gradle.tasks.size.UploadAAB
import com.emergetools.android.gradle.tasks.size.UploadAPK
import com.emergetools.android.gradle.tasks.upload.ArtifactMetadata
import com.emergetools.android.gradle.tasks.upload.BaseUploadTask
import kotlinx.datetime.Clock
import org.gradle.api.file.DirectoryProperty
import org.gradle.api.file.RegularFileProperty
import org.gradle.api.tasks.InputDirectory
import org.gradle.api.tasks.InputFile
import org.gradle.api.tasks.PathSensitive
import org.gradle.api.tasks.PathSensitivity
import org.gradle.api.tasks.TaskAction
import java.io.File
import java.util.zip.ZipEntry
import java.util.zip.ZipOutputStream

abstract class UploadPerfBundle : BaseUploadTask() {

  @get:InputFile
  @get:PathSensitive(PathSensitivity.NAME_ONLY)
  abstract val artifact: RegularFileProperty

  @get:InputDirectory
  @get:PathSensitive(PathSensitivity.NAME_ONLY)
  abstract val perfArtifactDir: DirectoryProperty

  private val perfArtifact: File
    get() {
      val apks = perfArtifactDir.get().asFileTree.filter { it.extension == UploadAPK.APK_EXTENSION }
      check(apks.files.size < 2) {
        "Multiple APKs found in perf artifacts directory: ${apks.files}," +
          " only one test APK is currently supported"
      }

      return apks.singleFile
    }

  override fun includeFilesInUpload(zos: ZipOutputStream) {
    artifact.get().asFile.inputStream().use { inputStream ->
      zos.putNextEntry(ZipEntry(artifact.get().asFile.name))
      inputStream.copyTo(zos)
      zos.closeEntry()
    }

    perfArtifact.inputStream().use { inputStream ->
      zos.putNextEntry(ZipEntry(perfArtifact.name))
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
      testArtifactZipPath = perfArtifact.name,
      // Primary artifact is always an AAB for this task
      proguardMappingsZipPath = "$artifactName/${UploadAAB.AAB_PROGUARD_PATH}",
    )

    upload(artifactMetadata) { response ->
      logger.lifecycle(
        "Performance bundle upload successful! " +
          "View Emerge's performance analysis at the following url:"
      )
      logger.lifecycle("https://emergetools.com/performance/compare/${response.uploadId}")
      logger.lifecycle("Performance testing usually takes around 30 minutes or less.")
    }
  }
}
