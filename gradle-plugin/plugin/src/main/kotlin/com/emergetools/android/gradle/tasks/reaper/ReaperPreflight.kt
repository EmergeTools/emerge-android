package com.emergetools.android.gradle.tasks.reaper

import com.emergetools.android.gradle.util.preflight.Preflight
import com.emergetools.android.gradle.util.preflight.PreflightFailure
import org.gradle.api.DefaultTask
import org.gradle.api.provider.Property
import org.gradle.api.tasks.Input
import org.gradle.api.tasks.Optional
import org.gradle.api.tasks.TaskAction

abstract class ReaperPreflight : DefaultTask() {

  @get:Input
  @get:Optional
  abstract val hasEmergeApiToken: Property<Boolean>

  @get:Input
  @get:Optional
  abstract val reaperEnabled: Property<Boolean>

  @get:Input
  abstract val variantName: Property<String>

  @get:Input
  abstract val hasReaperImplementationDependency: Property<Boolean>

  @get:Input
  @get:Optional
  abstract val reaperPublishableApiKey: Property<String>


  @TaskAction
  fun execute() {
    // Reaper isn't reliant on VCS info so skip to make output cleaner
    val preflight = Preflight("Reaper")

    val hasEmergeApiToken = hasEmergeApiToken.getOrElse(false)
    preflight.add("Emerge API token set") {
      if (!hasEmergeApiToken) {
        throw PreflightFailure("Emerge API token not set. See https://docs.emergetools.com/docs/uploading-basics#obtain-an-api-key")
      }
    }

    val variantName = variantName.get()
    preflight.add("enabled for variant: $variantName") {
      if (!reaperEnabled.getOrElse(false)) {
        throw PreflightFailure("Reaper not enabled for variant $variantName. Make sure \"${variantName}\" is included in `reaper.enabledVariants`")
      }
    }

    preflight.add("publishableApiKey set") {
      val key = reaperPublishableApiKey.orNull
      if (key == null) {
        throw PreflightFailure("publishableApiKey not set. See https://docs.emergetools.com/docs/reaper-setup-android#configure-the-sdk")
      }
      if (key == "") {
        throw PreflightFailure("publishableApiKey must not be empty. See https://docs.emergetools.com/docs/reaper-setup-android#configure-the-sdk")
      }
    }

    preflight.add("Runtime SDK added") {
      if (!hasReaperImplementationDependency.getOrElse(false)) {
        throw PreflightFailure("Reaper runtime SDK missing as an implementation dependency. See https://docs.emergetools.com/docs/reaper-setup-android#install-the-sdk")
      }
    }

    preflight.logOutput(logger)
  }
}
