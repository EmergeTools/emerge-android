package com.emergetools.android.gradle.tasks.snapshots

import com.emergetools.android.gradle.BuildConfig
import com.emergetools.android.gradle.tasks.base.ArtifactMetadata
import kotlinx.serialization.json.Json
import org.gradle.api.DefaultTask
import org.gradle.api.file.DirectoryProperty
import org.gradle.api.file.RegularFileProperty
import org.gradle.api.provider.Property
import org.gradle.api.tasks.CacheableTask
import org.gradle.api.tasks.Input
import org.gradle.api.tasks.InputDirectory
import org.gradle.api.tasks.InputFile
import org.gradle.api.tasks.Optional
import org.gradle.api.tasks.OutputDirectory
import org.gradle.api.tasks.OutputFile
import org.gradle.api.tasks.PathSensitive
import org.gradle.api.tasks.PathSensitivity
import org.gradle.api.tasks.TaskAction

/**
 * Basic task that will validate snapshot artifacts and move to Emerge directory with
 * proper metadata associated.
 * Intended to be dependent of LocalSnapshot task and UploadSnapshots task.
 */
@CacheableTask
abstract class PackageSnapshotArtifacts : DefaultTask() {
  @get:Input
  abstract val agpVersion: Property<String>

  @get:InputDirectory
  @get:PathSensitive(PathSensitivity.NAME_ONLY)
  abstract val artifactDir: DirectoryProperty

  @get:InputDirectory
  @get:PathSensitive(PathSensitivity.NAME_ONLY)
  abstract val testArtifactDir: DirectoryProperty

  @get:Optional
  @get:InputFile
  @get:PathSensitive(PathSensitivity.NAME_ONLY)
  abstract val snapshotConfigFile: RegularFileProperty

  @get:OutputDirectory
  abstract val outputDirectory: DirectoryProperty

  @get:OutputFile
  abstract val artifactMetadataPath: RegularFileProperty

  @TaskAction
  fun execute() {
    val targetApks = artifactDir.asFileTree.matching { it.include(APK_GLOB) }
    check(targetApks.files.size < 2) { "Cannot run snapshots with more than one target APK" }
    val targetApk = targetApks.singleFile

    val testApks = testArtifactDir.asFileTree.matching { it.include(APK_GLOB) }
    check(testApks.files.size < 2) { "Cannot run snapshots with more than one test APK" }
    val testApk = testApks.singleFile

    targetApk.copyTo(outputDirectory.get().asFile.resolve(targetApk.name), overwrite = true)
    testApk.copyTo(outputDirectory.get().asFile.resolve(testApk.name), overwrite = true)

    if (snapshotConfigFile.isPresent) {
      snapshotConfigFile.asFile.get().copyTo(
        outputDirectory.get().asFile
          .resolve(
            snapshotConfigFile.asFile.get().name
          ),
        overwrite = true
      )
    }

    val metadata =
      ArtifactMetadata(
        emergeGradlePluginVersion = BuildConfig.VERSION,
        androidGradlePluginVersion = agpVersion.get(),
        targetArtifactZipPath = targetApk.name,
        testArtifactZipPath = testApk.name,
        composePreviewsConfigPath =
        if (snapshotConfigFile.isPresent) {
          snapshotConfigFile.asFile.get().name
        } else {
          null
        },
      )
    val metadataString = Json.encodeToString(metadata)
    artifactMetadataPath.asFile.get().writeText(metadataString)
  }

  companion object {
    const val APK_GLOB = "**/*.apk"
  }
}
