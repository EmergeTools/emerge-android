package com.emergetools.android.gradle.tasks.snapshots

import com.emergetools.android.gradle.tasks.upload.ArtifactMetadata
import com.emergetools.android.gradle.tasks.upload.BaseUploadTask
import kotlinx.serialization.json.Json
import org.gradle.api.file.DirectoryProperty
import org.gradle.api.provider.Property
import org.gradle.api.tasks.InputDirectory
import org.gradle.api.tasks.Internal
import org.gradle.api.tasks.PathSensitive
import org.gradle.api.tasks.PathSensitivity
import org.gradle.api.tasks.TaskAction
import java.util.zip.ZipEntry
import java.util.zip.ZipOutputStream

abstract class UploadSnapshotBundle : BaseUploadTask() {

  @get:InputDirectory
  @get:PathSensitive(PathSensitivity.NAME_ONLY)
  abstract val packageDir: DirectoryProperty

  @get:Internal
  override val snapshotsEnabled: Property<Boolean>
    get() = project.objects.property(Boolean::class.java).convention(true)

  /**
   * ArtifactMetadata has already been written as a part of [PackageSnapshotArtifacts].
   * Therefore just parse the file upon first need to use it, and pass to upload to be
   * included in upload bundle.
   */
  @get:Internal
  val artifactMetadata: ArtifactMetadata by lazy {
    val artifactMetadataFiles = packageDir.asFileTree.matching {
      it.include(ArtifactMetadata.JSON_FILE_NAME)
    }
    check(artifactMetadataFiles.files.size < 2) { "Multiple artifact metadata files found" }

    check(artifactMetadataFiles.singleFile.exists()) { "Artifact metadata file not found" }

    Json.decodeFromString(artifactMetadataFiles.singleFile.readText())
  }

  override fun includeFilesInUpload(zos: ZipOutputStream) {
    val targetApk = packageDir.asFileTree.matching { it.include("*.apk") }.files
      .first { it.name == artifactMetadata.targetArtifactZipPath }

    val testApk = packageDir.asFileTree.matching { it.include("*.apk") }.files
      .first { it.name == artifactMetadata.testArtifactZipPath }

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
  }

  @TaskAction
  fun execute() {
    val response = upload(artifactMetadata)
    checkNotNull(response) {
      "Upload failed, please check your network connection and try again."
    }

    logger.lifecycle(
      "Snapshot bundle upload successful! View snapshots at the following url:"
    )
    logger.lifecycle("https://emergetools.com/build/${response.uploadId}?buildContent=snapshots")
    logger.lifecycle("Snapshot generations usually take ~10 minutes or less.")
  }
}
