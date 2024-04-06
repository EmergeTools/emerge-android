package com.emergetools.android.gradle.tasks.snapshots

import com.emergetools.android.gradle.EmergePlugin
import com.emergetools.android.gradle.tasks.upload.ArtifactMetadata
import com.emergetools.android.gradle.util.adb.AdbHelper
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
import org.gradle.api.tasks.options.Option
import org.gradle.process.ExecOperations
import javax.inject.Inject

abstract class LocalSnapshots : DefaultTask() {

  private val arguments = mutableMapOf<String, String>()

  @Option(
    option = "class",
    description = "A single class, a single method or a comma-separated list of classes"
  )
  fun setClazz(clazz: String) {
    arguments["class"] = clazz
  }

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

      val instrumentationArgs = mutableListOf("am", "instrument", "-w", "-e", "debug", "false").also {
        arguments.forEach { (key, value) ->
          it.add("-e")
          it.add(key)
          it.add(value)
        }
        it.add("-e")
        it.add("runnerBuilder")
        it.add("com.emergetools.snapshots.runner.SnapshotsRunnerBuilder")
        it.add("${testAppId}/${testInstrumentationRunner.get()}")
      }

      logger.lifecycle("Command: ${instrumentationArgs.joinToString(" ")}")
      val output = shell(instrumentationArgs)
      logger.lifecycle(output)

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
