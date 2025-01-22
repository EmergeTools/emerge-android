package com.emergetools.android.gradle.tasks.snapshots

import com.emergetools.android.gradle.tasks.base.BasePreflightTask
import com.emergetools.android.gradle.util.preflight.Preflight
import com.emergetools.android.gradle.util.preflight.PreflightFailure
import org.gradle.api.provider.Property
import org.gradle.api.tasks.Input
import org.gradle.api.tasks.Optional
import org.gradle.api.tasks.TaskAction
import org.gradle.work.DisableCachingByDefault

@DisableCachingByDefault(because = "Always runs as a check and has no outputs.")
abstract class SnapshotsPreflight : BasePreflightTask() {
  @get:Input
  @get:Optional
  abstract val snapshotsEnabled: Property<Boolean>

  @get:Input
  @get:Optional
  abstract val hasEmergeApiToken: Property<Boolean>

  @get:Input
  abstract val hasSnapshotsAndroidTestImplementationDependency: Property<Boolean>

  @get:Input
  abstract val appProjectPath: Property<String>

  @get:Input
  abstract val variantName: Property<String>

  @TaskAction
  @Suppress("detekt:ThrowsCount")
  fun execute() {
    val preflight = Preflight("Snapshots preflight check")

    val hasEmergeApiToken = hasEmergeApiToken.getOrElse(false)
    preflight.add("Emerge API token set") {
      if (!hasEmergeApiToken) {
        throw PreflightFailure(
          "Emerge API token not set. See " +
            "https://docs.emergetools.com/docs/uploading-basics#obtain-an-api-key",
        )
      }
    }

    val snapshotsEnabled = snapshotsEnabled.getOrElse(false)
    preflight.add("Snapshots enabled") {
      if (!snapshotsEnabled) {
        throw PreflightFailure(
          "Snapshots not enabled. Make sure `snapshots.enabled` is set to " +
            "true in the emerge configuration block.",
        )
      }
    }

    val hasSnapshotsAndroidTestImplementationDependency =
      hasSnapshotsAndroidTestImplementationDependency.getOrElse(false)
    preflight.add("Snapshots SDK is an androidTestImplementation dependency") {
      if (!hasSnapshotsAndroidTestImplementationDependency) {
        throw PreflightFailure(
          "Snapshots androidTestImplementation dependency not set. See " +
            "https://docs.emergetools.com/docs/android-snapshots-v1#add-snapshot-sdk",
        )
      }
    }

    preflight.addSubPreflight(buildVcsPreflight())

    preflight.logOutput(
      logger,
      additionalSuccessLogging = {
        val localTaskName = getSnapshotLocalTaskName(variantName.get())
        val localTaskInstructions =
          "Check snapshots locally with ./gradlew ${appProjectPath.get()}:$localTaskName " +
            "(make sure to have an emulator or connected device running)"

        val uploadTaskName = getSnapshotUploadTaskName(variantName.get())
        val uploadTaskInstructions =
          "Upload & run snapshots on Emerge with ./gradlew ${appProjectPath.get()}:$uploadTaskName"

        buildString {
          append("Snapshots preflight was successful!")
          append("\n")
          append(localTaskInstructions)
          append("\n")
          append(uploadTaskInstructions)
          append("\n")
        }
      },
    )
  }
}
