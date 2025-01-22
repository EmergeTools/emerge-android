package com.emergetools.android.gradle.tasks.distribution

import com.emergetools.android.gradle.tasks.base.BasePreflightTask
import com.emergetools.android.gradle.util.preflight.Preflight
import com.emergetools.android.gradle.util.preflight.PreflightFailure
import org.gradle.api.provider.Property
import org.gradle.api.tasks.Input
import org.gradle.api.tasks.Optional
import org.gradle.api.tasks.TaskAction

abstract class DistributionPreflight : BasePreflightTask() {

  @get:Input
  @get:Optional
  abstract val hasEmergeApiToken: Property<Boolean>

  @get:Input
  @get:Optional
  abstract val distributionApiKey: Property<String>

  @get:Input
  @get:Optional
  abstract val distributionTag: Property<String>

  @get:Input
  @get:Optional
  abstract val distributionEnabled: Property<Boolean>

  @get:Input
  abstract val variantName: Property<String>

  @get:Input
  abstract val hasDistributionImplementationDependency: Property<Boolean>

  @TaskAction
  fun execute() {
    val preflight = Preflight("Distribution preflight check")

    val hasEmergeApiToken = hasEmergeApiToken.getOrElse(false)
    preflight.add("Emerge API token set") {
      if (!hasEmergeApiToken) {
        throw PreflightFailure("Emerge API token not set. See https://docs.emergetools.com/docs/uploading-basics#obtain-an-api-key")
      }
    }

    val variantName = variantName.get()
    preflight.add("enabled for variant: $variantName") {
      if (!distributionEnabled.getOrElse(false)) {
        throw PreflightFailure("Distribution not enabled for variant $variantName. Make sure \"${variantName}\" is included in `distribution.enabledVariants`")
      }
    }

    preflight.add("apiKey set") {
      val key = distributionApiKey.orNull
      if (key == null) {
        throw PreflightFailure("apiKey not set. See https://docs.emergetools.com/docs/distribution-setup-android#configure-the-sdk")
      }
      if (key == "") {
        throw PreflightFailure("apiKey must not be empty. See https://docs.emergetools.com/docs/distribution-setup-android#configure-the-sdk")
      }
    }

    preflight.add("Runtime SDK added") {
      if (!hasDistributionImplementationDependency.getOrElse(false)) {
        throw PreflightFailure("Distribution runtime SDK missing as an implementation dependency. See https://docs.emergetools.com/docs/distribution-setup-android#install-the-sdk")
      }
    }

    preflight.addSubPreflight(buildVcsPreflight())
    preflight.logOutput(logger)
  }
}
