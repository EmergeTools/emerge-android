package com.emergetools.android.gradle.tasks.snapshots

import com.emergetools.android.gradle.tasks.base.ArtifactMetadata
import com.emergetools.android.gradle.tasks.base.BaseUploadTask
import com.emergetools.android.gradle.util.network.EmergeUploadRequestData
import kotlinx.datetime.Clock
import kotlinx.serialization.json.Json
import org.gradle.api.file.DirectoryProperty
import org.gradle.api.file.RegularFileProperty
import org.gradle.api.provider.Property
import org.gradle.api.tasks.Input
import org.gradle.api.tasks.InputDirectory
import org.gradle.api.tasks.InputFile
import org.gradle.api.tasks.Optional
import org.gradle.api.tasks.PathSensitive
import org.gradle.api.tasks.PathSensitivity
import org.gradle.api.tasks.TaskAction
import org.gradle.work.DisableCachingByDefault
import java.io.File
import java.util.zip.ZipEntry
import java.util.zip.ZipOutputStream

@DisableCachingByDefault(because = "Uploading snapshot bundles should not be cached.")
abstract class UploadSnapshotBundle : BaseUploadTask() {
  @get:InputDirectory
  @get:PathSensitive(PathSensitivity.NAME_ONLY)
  abstract val packageDir: DirectoryProperty

  @get:Input
  @get:Optional
  abstract val apiVersion: Property<Int>

  @get:Input
  @get:Optional
  abstract val includePrivatePreviews: Property<Boolean>

  @get:Input
  @get:Optional
  abstract val includePreviewParamPreviews: Property<Boolean>

  @get:InputFile
  @get:PathSensitive(PathSensitivity.RELATIVE)
  abstract val artifactMetadataPath: RegularFileProperty

  override fun includeFilesInUpload(zos: ZipOutputStream) {
    val artifactMetadataFilePath =
      checkNotNull(artifactMetadataPath.asFile.orNull) {
        "Artifact metadata file must be provided to upload snapshot bundle."
      }
    check(artifactMetadataFilePath.exists()) {
      "Artifact metadata file does not exist: ${artifactMetadataFilePath.absolutePath}"
    }
    val artifactMetadata: ArtifactMetadata = Json.decodeFromString(artifactMetadataFilePath.readText())

    val targetApk =
      packageDir.asFileTree.matching { it.include("*.apk") }.files
        .first { it.name == artifactMetadata.targetArtifactZipPath }

    val testApk =
      packageDir.asFileTree.matching { it.include("*.apk") }.files
        .first { it.name == artifactMetadata.testArtifactZipPath }

    val composePreview = packageDir.asFileTree.matching { it.include("*.json") }.files
      .first { it.name == artifactMetadata.composePreviewsConfigPath }

    targetApk.inputStream().use {
      zos.putNextEntry(ZipEntry(targetApk.name))
      it.copyTo(zos)
      zos.closeEntry()
    }

    testApk.inputStream().use {
      zos.putNextEntry(ZipEntry(testApk.name))
      it.copyTo(zos)
      zos.closeEntry()
    }

    composePreview.inputStream().use {
      zos.putNextEntry(ZipEntry(composePreview.name))
      it.copyTo(zos)
      zos.closeEntry()
    }
  }

  override fun uploadRequestData(file: File): EmergeUploadRequestData {
    return super.uploadRequestData(file).copy(
      androidSnapshotsEnabled = true,
      androidSnapshotsApiVersion = apiVersion.orNull,
      androidSnapshotsPrivateEnabled = includePrivatePreviews.getOrElse(true),
      androidSnapshotsPreviewParamsEnabled = includePreviewParamPreviews.getOrElse(true),
    )
  }

  @TaskAction
  fun execute() {
    val artifactMetadataFilePath =
      checkNotNull(artifactMetadataPath.asFile.orNull) {
        "Artifact metadata file must be provided to upload snapshot bundle."
      }
    check(artifactMetadataFilePath.exists()) {
      "Artifact metadata file does not exist: ${artifactMetadataFilePath.absolutePath}"
    }
    val artifactMetadata: ArtifactMetadata = Json.decodeFromString(artifactMetadataFilePath.readText())

    upload(
      artifactMetadata =
      artifactMetadata.copy(
        created = Clock.System.now(),
      ),
    ) { response ->
      logger.lifecycle(
        "Snapshot bundle upload successful! View snapshots at the following url:",
      )
      logger.lifecycle("https://emergetools.com/snapshot/${response.uploadId}")
      logger.lifecycle("Snapshot generations usually take ~10 minutes or less.")
    }
  }
}
