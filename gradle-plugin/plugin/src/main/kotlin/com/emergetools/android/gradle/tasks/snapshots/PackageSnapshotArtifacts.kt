package com.emergetools.android.gradle.tasks.snapshots

import com.emergetools.android.gradle.BuildConfig
import com.emergetools.android.gradle.tasks.snapshots.utils.SnapshotDataUtils
import com.emergetools.android.gradle.tasks.upload.ArtifactMetadata
import kotlinx.serialization.encodeToString
import kotlinx.serialization.json.Json
import org.gradle.api.DefaultTask
import org.gradle.api.file.DirectoryProperty
import org.gradle.api.provider.Property
import org.gradle.api.tasks.Input
import org.gradle.api.tasks.InputDirectory
import org.gradle.api.tasks.OutputDirectory
import org.gradle.api.tasks.PathSensitive
import org.gradle.api.tasks.PathSensitivity
import org.gradle.api.tasks.TaskAction
import java.nio.file.Path

/**
 * Basic task that will validate snapshot artifacts and move to Emerge directory with
 * proper metadata associated.
 * Intended to be dependent of LocalSnapshot task and UploadSnapshots task.
 */
abstract class PackageSnapshotArtifacts : DefaultTask() {

  @get:Input
  abstract val agpVersion: Property<String>

  @get:InputDirectory
  @get:PathSensitive(PathSensitivity.NAME_ONLY)
  abstract val artifactDir: DirectoryProperty

  @get:InputDirectory
  @get:PathSensitive(PathSensitivity.NAME_ONLY)
  abstract val testArtifactDir: DirectoryProperty

  @get:OutputDirectory
  abstract val outputDirectory: DirectoryProperty

  @get:Input
  abstract val useReflectiveInvocation: Property<Boolean>

  @TaskAction
  fun execute() {
    val targetApks = artifactDir.asFileTree.matching { it.include(APK_GLOB) }
    check(targetApks.files.size < 2) { "Cannot run snapshots with more than one target APK" }
    val targetApk = targetApks.singleFile

    val testApks = testArtifactDir.asFileTree.matching { it.include(APK_GLOB) }
    check(testApks.files.size < 2) { "Cannot run snapshots with more than one test APK" }
    val testApk = testApks.singleFile

    outputDirectory.get().asFile.mkdirs()
    targetApk.copyTo(outputDirectory.get().asFile.resolve(targetApk.name), overwrite = true)
    testApk.copyTo(outputDirectory.get().asFile.resolve(testApk.name), overwrite = true)

    val metadata = ArtifactMetadata(
      emergeGradlePluginVersion = BuildConfig.VERSION,
      androidGradlePluginVersion = agpVersion.get(),
      targetArtifactZipPath = targetApk.name,
      testArtifactZipPath = testApk.name,
    )
    val metadataString = Json.encodeToString(metadata)
    outputDirectory.get().asFile.resolve(ArtifactMetadata.JSON_FILE_NAME).writeText(metadataString)

    if (useReflectiveInvocation.getOrElse(false)) {
      val outputFolder = Path.of("${project.rootProject.buildDir}/emergetools")
      val composeSnapshots = SnapshotDataUtils.getAllSnapshots(outputFolder)
      outputDirectory.get().asFile.resolve(SnapshotDataUtils.SNAPSHOTS_FILE_NAME)
        .writeText(SnapshotDataUtils.json.encodeToString(composeSnapshots))
    }
  }

  companion object {
    const val APK_GLOB = "**/*.apk"
  }
}
