package com.emergetools.android.gradle.tasks.snapshots

import com.emergetools.android.gradle.tasks.base.BasePreflightTask
import com.emergetools.android.gradle.util.preflight.Preflight
import com.emergetools.android.gradle.util.preflight.PreflightFailure
import com.emergetools.android.gradle.util.preflight.PreflightWarning
import org.gradle.api.provider.Property
import org.gradle.api.tasks.Input
import org.gradle.api.tasks.Optional
import org.gradle.api.tasks.TaskAction

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
  fun execute() {
    val preflight = Preflight("Snapshots preflight")

    val hasEmergeApiToken = hasEmergeApiToken.getOrElse(false)
    preflight.add("Emerge API token set") {
      if (!hasEmergeApiToken) {
        throw PreflightFailure("Emerge API token not set. See https://docs.emergetools.com/docs/uploading-basics#obtain-an-api-key")
      }
    }

    val snapshotsEnabled = snapshotsEnabled.getOrElse(false)
    preflight.add("Snapshots enabled") {
      if (!snapshotsEnabled) {
        throw PreflightFailure("Snapshots not enabled. Make sure `snapshots.enabled` is set to true in the emerge configuration block.")
      }
    }

    val hasSnapshotsAndroidTestImplementationDependency =
      hasSnapshotsAndroidTestImplementationDependency.getOrElse(false)
    preflight.add("Snapshots SDK is an androidTestImplementation dependency") {
      if (!hasSnapshotsAndroidTestImplementationDependency) {
        throw PreflightFailure("Snapshots androidTestImplementation dependency not set. See https://docs.emergetools.com/docs/android-snapshots-v1#add-snapshot-sdk")
      }
    }

    val vcsPreflight = Preflight("VCS Info")
    vcsPreflight.add("SHA: ${sha.getOrElse("Not set")}") {
      if (sha.getOrElse("").isBlank()) {
        throw PreflightWarning("Emerge won't be able to post status checks or comments without a value.")
      }
    }

    vcsPreflight.add("Base SHA: ${baseSha.getOrElse("Not set")}") {
      if (baseSha.getOrElse("").isBlank()) {
        throw PreflightWarning("Emerge won't be able to post status checks or comments without a value.")
      }
    }

    vcsPreflight.add("Branch name: ${branchName.getOrElse("Not set")}") {
      if (branchName.getOrElse("") == "HEAD") {
        throw PreflightWarning("Branch could be in a detached head state which could lead to trouble posting status checks. Make sure to check your sha matches the commit sha on your branch.")
      }

      if (branchName.getOrElse("").isBlank()) {
        throw PreflightWarning("Emerge won't be able to post status checks or comments without a value.")
      }
    }

    vcsPreflight.add("PR number: ${prNumber.getOrElse("Not set")}") {
      if (prNumber.getOrElse("").isBlank()) {
        throw PreflightWarning("Emerge won't be able to post status checks or comments without a value.")
      }
    }

    vcsPreflight.add("[GitHub only] GitHub repo name: ${gitHubRepoName.getOrElse("Not set")}") {
      if (gitHubRepoName.getOrElse("").isBlank()) {
        throw PreflightWarning("Emerge won't be able to post status checks or comments without a value.")
      }
    }

    vcsPreflight.add("[GitHub only] GitHub repo owner: ${gitHubRepoOwner.getOrElse("Not set")}") {
      if (gitHubRepoOwner.getOrElse("").isBlank()) {
        throw PreflightWarning("Emerge won't be able to post status checks or comments without a value.")
      }
    }

    vcsPreflight.add("[GitLab only] GitLab project ID: ${gitLabProjectId.getOrElse("Not set")}") {
      if (gitLabProjectId.getOrElse("").isBlank()) {
        throw PreflightWarning("Emerge won't be able to post status checks or comments without a value.")
      }
    }
    preflight.addSubPreflight(vcsPreflight)

    preflight.logOutput(
      logger,
      additionalSuccessLogging = {
        val localTaskName = getSnapshotLocalTaskName(variantName.get())
        val localTaskInstructions =
          "Check snapshots locally with ./gradlew ${appProjectPath.get()}:${localTaskName} (make sure to have an emulator or connected device running)"

        val uploadTaskName = getSnapshotUploadTaskName(variantName.get())
        val uploadTaskInstructions =
          "Upload & run snapshots on Emerge with ./gradlew ${appProjectPath.get()}:${uploadTaskName}"

        buildString {
          append("Snapshots preflight was successful!")
          append("\n")
          append(localTaskInstructions)
          append("\n")
          append(uploadTaskInstructions)
          append("\n")
        }
      }
    )
  }
}
