package com.emergetools.android.gradle.tasks.snapshots

import com.emergetools.android.gradle.tasks.snapshots.utils.SnapshotDataUtils
import com.emergetools.android.gradle.tasks.upload.ArtifactMetadata
import com.emergetools.android.gradle.util.adb.AdbHelper
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
import org.gradle.process.ExecOperations
import java.nio.file.Path
import javax.inject.Inject
import kotlin.io.path.pathString
import kotlin.io.path.writeText

abstract class LocalSnapshots : DefaultTask() {

  @get:Inject
  abstract val execOperations: ExecOperations

  @get:InputDirectory
  @get:PathSensitive(PathSensitivity.NAME_ONLY)
  abstract val packageDir: DirectoryProperty

  @get:OutputDirectory
  abstract val snapshotStorageDirectory: DirectoryProperty

  @get:Input
  abstract val targetAppId: Property<String>

  @get:Input
  abstract val testAppId: Property<String>

  @get:Input
  abstract val testInstrumentationRunner: Property<String>

  @get:Input
  abstract val useReflectiveInvocation: Property<Boolean>

  @TaskAction
  fun execute() {
    val artifactMetadataFiles = packageDir.asFileTree.matching {
      it.include(ArtifactMetadata.JSON_FILE_NAME)
    }
    check(artifactMetadataFiles.files.size < 2) { "Multiple artifact metadata files found" }
    val artifactMetadataFile = artifactMetadataFiles.singleFile

    val artifactMetadata = Json.decodeFromString<ArtifactMetadata>(artifactMetadataFile.readText())

    val targetApk = packageDir.asFileTree.matching { it.include("*.apk") }.files
      .first { it.name == artifactMetadata.targetArtifactZipPath }
    val targetAppId = targetAppId.get()

    val testApk = packageDir.asFileTree.matching { it.include("*.apk") }.files
      .first { it.name == artifactMetadata.testArtifactZipPath }
    val testAppId = testAppId.get()

    snapshotStorageDirectory.get().asFile.mkdirs()

    val adbHelper = AdbHelper(execOperations, logger)

    adbHelper.apply {
      val deviceCount = devices().size
      check(deviceCount < 2) { "More than one device connected." }
      check(deviceCount > 0) { "No devices connected." }

      uninstall(targetAppId)
      install(targetApk.absolutePath)

      uninstall(testAppId)
      install(testApk.absolutePath)
      val arguments = mutableMapOf<String, String>().apply {
        put("debug", "false")
        put("runnerBuilder", "com.emergetools.snapshots.runner.SnapshotsRunnerBuilder")
      }
      if (useReflectiveInvocation.getOrElse(false)) {
        val outputFolder = Path.of("${project.rootProject.buildDir}/emergetools")

        val composeSnapshots = SnapshotDataUtils.getAllSnapshots(outputFolder)
        logger.lifecycle("Found ${composeSnapshots.snapshots.size} snapshots")

        val jsonPath = Path.of(outputFolder.pathString, SnapshotDataUtils.SNAPSHOTS_FILE_NAME)
        jsonPath.writeText(SnapshotDataUtils.json.encodeToString(composeSnapshots))

        val deviceDir = "/data/local/tmp"
        push(
          localDir = jsonPath.pathString,
          deviceDir = deviceDir
        )

        arguments["invoke_data_path"] = "${deviceDir}/${SnapshotDataUtils.SNAPSHOTS_FILE_NAME}"
      }

      shell(
        "am",
        "instrument",
        "-w",
        *arguments.entries.flatMap { listOf("-e", it.key, it.value) }.toTypedArray(),
        "${testAppId}/${testInstrumentationRunner.get()}"
      )

      pull(
        deviceDir = "/storage/emulated/0/Android/data/${targetAppId}/files/snapshots/",
        localDir = snapshotStorageDirectory.get().asFile.absolutePath,
      )

      val count = snapshotStorageDirectory.get().asFile.listFiles()?.size ?: 0
      logger.lifecycle("Snapshots successful!")
      logger.lifecycle(
        "$count files saved to ${snapshotStorageDirectory.get().asFile.absolutePath}"
      )
    }
  }
}
