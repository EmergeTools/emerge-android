package com.emergetools.android.gradle.tasks.reaper

import com.emergetools.android.gradle.util.preflight.Preflight
import com.emergetools.android.gradle.util.preflight.PreflightFailure
import org.gradle.api.DefaultTask
import org.gradle.api.GradleException
import org.gradle.api.file.RegularFile
import org.gradle.api.file.RegularFileProperty
import org.gradle.api.internal.artifacts.configurations.Configurations
import org.gradle.api.internal.artifacts.configurations.ConfigurationsProvider
import org.gradle.api.provider.ListProperty
import org.gradle.api.provider.Property
import org.gradle.api.tasks.Input
import org.gradle.api.tasks.InputFile
import org.gradle.api.tasks.InputFiles
import org.gradle.api.tasks.Optional
import org.gradle.api.tasks.TaskAction

abstract class PreflightReaper : DefaultTask() {

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
    val preflight = Preflight("Reaper")

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

    logger.lifecycle("")
    logger.lifecycle(preflight.render())
    logger.lifecycle("")

    if (!preflight.isSuccessful()) {
      throw GradleException(preflight.renderErrors())
    }
  }
}
