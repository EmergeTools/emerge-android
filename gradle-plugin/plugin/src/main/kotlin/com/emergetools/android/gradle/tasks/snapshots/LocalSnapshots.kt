package com.emergetools.android.gradle.tasks.snapshots

import com.emergetools.android.gradle.tasks.base.ArtifactMetadata
import com.emergetools.android.gradle.util.adb.AdbHelper
import kotlinx.serialization.json.Json
import org.gradle.api.DefaultTask
import org.gradle.api.file.DirectoryProperty
import org.gradle.api.file.RegularFileProperty
import org.gradle.api.provider.Property
import org.gradle.api.tasks.Input
import org.gradle.api.tasks.InputDirectory
import org.gradle.api.tasks.InputFile
import org.gradle.api.tasks.Optional
import org.gradle.api.tasks.OutputDirectory
import org.gradle.api.tasks.PathSensitive
import org.gradle.api.tasks.PathSensitivity
import org.gradle.api.tasks.TaskAction
import org.gradle.api.tasks.options.Option
import org.gradle.process.ExecOperations
import org.gradle.work.DisableCachingByDefault
import javax.inject.Inject

@DisableCachingByDefault(because = "Relies on local emulator state and should not be cached")
abstract class LocalSnapshots : DefaultTask() {
  companion object {
    const val COMPOSE_SNAPSHOTS_FILENAME = "previewSnapshots.json"
  }

  private val arguments = mutableMapOf<String, String>()

  @Option(
    option = "preview",
    description =
      "A single fully qualified preview method" +
        " or a comma-separated list of fully qualified preview methods",
  )
  fun setPreviews(previewFunctions: String) {
    arguments["previews"] = previewFunctions
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

  @get:Input
  @get:Optional
  abstract val profile: Property<Boolean>

  @get:Optional
  @get:InputFile
  @get:PathSensitive(PathSensitivity.NAME_ONLY)
  abstract val snapshotConfigFile: RegularFileProperty

  @TaskAction
  fun execute() {
    val artifactMetadataFiles =
      packageDir.asFileTree.matching {
        it.include(ArtifactMetadata.JSON_FILE_NAME)
      }
    check(artifactMetadataFiles.files.size > 0) { "No artifact metadata files found" }
    check(artifactMetadataFiles.files.size < 2) { "Multiple artifact metadata files found" }
    val artifactMetadataFile = artifactMetadataFiles.singleFile

    val artifactMetadata = Json.decodeFromString<ArtifactMetadata>(artifactMetadataFile.readText())

    val targetApk =
      packageDir.asFileTree.matching { it.include("*.apk") }.files
        .first { it.name == artifactMetadata.targetArtifactZipPath }
    val targetAppId = targetAppId.get()

    val testApk =
      packageDir.asFileTree.matching { it.include("*.apk") }.files
        .first { it.name == artifactMetadata.testArtifactZipPath }
    val testAppId = testAppId.get()

    val snapshotStorageDir = snapshotStorageDirectory.asFile.get()
    snapshotStorageDir.mkdirs()

    check(snapshotConfigFile.isPresent) {
      "Snapshot configuration file not present, make sure the emerge.experimental.firstPartySnapshots property is set in your gradle.properties file"
    }

    val adbHelper = AdbHelper(execOperations, logger)
    adbHelper.apply {
      val deviceCount = devices().size
      check(deviceCount < 2) { "More than one device connected." }
      check(deviceCount > 0) { "No devices connected." }

      shell("logcat -c")

      uninstall(targetAppId)
      install(targetApk.absolutePath)

      uninstall(testAppId)
      install(testApk.absolutePath)

      val instrumentationArgs =
        mutableListOf("am", "instrument", "-w", "-e", "debug", "false").also {
          arguments.forEach { (key, value) ->
            it.add("-e")
            it.add(key)
            it.add(value)
          }
          push(
            localFile = snapshotConfigFile.asFile.get().absolutePath,
            deviceDir = "/data/local/tmp/",
          )
          // Important this is added here as runner needs to be last argument
          it.add("-e")
          it.add("invoke_data_path")
          it.add("/data/local/tmp/$COMPOSE_SNAPSHOTS_FILENAME")
          if (profile.getOrElse(false)) {
            it.add("-e")
            it.add("save_profile")
            it.add("true")
          }
          it.add("$testAppId/${testInstrumentationRunner.get()}")
        }

      val output = shell(instrumentationArgs)
      logger.lifecycle(output)

      val logcatFile = "/storage/emulated/0/Android/data/$targetAppId/files/snapshots/logcat.txt"
      shell("logcat -d > $logcatFile")

      pull(
        deviceDir = "/storage/emulated/0/Android/data/$targetAppId/files/snapshots/",
        localDir = snapshotStorageDir.absolutePath,
      )
      shell("rm -r /storage/emulated/0/Android/data/$targetAppId/files/snapshots/")
      shell("rm /data/local/tmp/$COMPOSE_SNAPSHOTS_FILENAME")

      val count = snapshotStorageDir.listFiles()?.size ?: 0
      logger.lifecycle("Snapshots successful!")
      logger.lifecycle(
        "$count files saved to ${snapshotStorageDir.absolutePath}",
      )
    }
  }
}
