package com.emergetools.android.gradle.tasks.internal

import com.emergetools.android.gradle.EmergePluginExtension
import com.emergetools.android.gradle.util.orEmpty
import com.emergetools.android.gradle.util.treePrinter
import org.gradle.api.DefaultTask
import org.gradle.api.provider.Property
import org.gradle.api.tasks.Input
import org.gradle.api.tasks.TaskAction

abstract class LogExtensionTask : DefaultTask() {
  @get:Input
  abstract val emergePluginExtension: Property<EmergePluginExtension>

  @TaskAction
  fun logExtension() {
    val extension = emergePluginExtension.get()

    val extensionTree =
      treePrinter("Emerge configuration") {
        addItem("apiToken: ${if (extension.apiToken.isPresent) "*****" else "MISSING"}")
        addItem("includeDependencyInformation: ${extension.includeDependencyInformation.getOrElse(true)}")
        addItem("dryRun (optional): ${extension.dryRun.orEmpty()}")
        addItem("verbose (optional): ${extension.verbose.orEmpty()}")

        val sizeHeading = addHeading("size")
        addItem("tag (optional): ${extension.sizeOptions.tag.orEmpty()}", sizeHeading)
        addItem("enabled: ${extension.sizeOptions.enabled.getOrElse(true)}", sizeHeading)

        val snapshotsHeading = addHeading("snapshots")
        addItem(
          "snapshotsStorageDirectory: ${extension.snapshotOptions.snapshotsStorageDirectory.orEmpty()}",
          snapshotsHeading,
        )
        addItem("apiVersion: ${extension.snapshotOptions.apiVersion.orEmpty()}", snapshotsHeading)
        addItem(
          "includePrivatePreviews: ${extension.snapshotOptions.includePrivatePreviews.orEmpty()}",
          snapshotsHeading,
        )
        addItem(
          "includePreviewParamPreviews: ${extension.snapshotOptions.includePreviewParamPreviews.orEmpty()}",
          snapshotsHeading,
        )
        addItem("tag (optional): ${extension.snapshotOptions.tag.orEmpty()}", snapshotsHeading)
        addItem("enabled: ${extension.snapshotOptions.enabled.getOrElse(true)}", snapshotsHeading)
        addItem("profile: ${extension.snapshotOptions.profile.getOrElse(false)}", snapshotsHeading)

        val reaperHeading = addHeading("reaper")
        addItem(
          "enabledVariants: ${extension.reaperOptions.enabledVariants.getOrElse(emptyList())}",
          reaperHeading,
        )
        addItem(
          "publishableApiKey: ${if (extension.reaperOptions.publishableApiKey.isPresent) "*****" else "MISSING"}",
          reaperHeading,
        )
        addItem("tag (optional): ${extension.reaperOptions.tag.orEmpty()}", reaperHeading)

        val performanceHeading = addHeading("performance")
        addItem("projectPath: ${extension.perfOptions.projectPath.orEmpty()}", performanceHeading)
        addItem("tag (optional): ${extension.perfOptions.tag.orEmpty()}", performanceHeading)
        addItem("enabled: ${extension.perfOptions.enabled.getOrElse(true)}", performanceHeading)

        val vcsOptionsHeading = addHeading("vcsOptions (optional, defaults to Git values)")
        addItem("sha: ${extension.vcsOptions.sha.orEmpty()}", vcsOptionsHeading)
        addItem("baseSha: ${extension.vcsOptions.baseSha.orEmpty()}", vcsOptionsHeading)
        addItem("previousSha: ${extension.vcsOptions.previousSha.orEmpty()}", vcsOptionsHeading)
        addItem("branchName: ${extension.vcsOptions.branchName.orEmpty()}", vcsOptionsHeading)
        addItem("prNumber: ${extension.vcsOptions.prNumber.orEmpty()}", vcsOptionsHeading)
        addItem("gitHubOptions", vcsOptionsHeading)
        addItem(
          "repoOwner: ${extension.vcsOptions.gitHubOptions.repoOwner.orEmpty()}",
          vcsOptionsHeading,
        )
        addItem(
          "repoName: ${extension.vcsOptions.gitHubOptions.repoName.orEmpty()}",
          vcsOptionsHeading,
        )
        addItem(
          "includeEventInformation: ${extension.vcsOptions.gitHubOptions.includeEventInformation.orEmpty()}",
          vcsOptionsHeading,
        )
        addItem("gitLabOptions", vcsOptionsHeading)
        addItem(
          "projectId: ${extension.vcsOptions.gitLabOptions.projectId.orEmpty()}",
          vcsOptionsHeading,
        )
      }

    logger.lifecycle(extensionTree)
  }
}
