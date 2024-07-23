package com.emergetools.android.gradle.tasks.reaper

import com.emergetools.android.gradle.util.preflight.Preflight
import com.emergetools.android.gradle.util.preflight.PreflightFailure
import org.gradle.api.DefaultTask
import org.gradle.api.GradleException
import org.gradle.api.file.RegularFileProperty
import org.gradle.api.provider.Property
import org.gradle.api.tasks.Input
import org.gradle.api.tasks.InputFile
import org.gradle.api.tasks.TaskAction

abstract class PreflightReaper : DefaultTask() {

  @get:Input
  abstract val reaperEnabled: Property<Boolean>

  @get:Input
  abstract val reaperPublishableApiKey: Property<String>

  @get:InputFile
  abstract val mergedManifestFile: RegularFileProperty

  @TaskAction
  fun execute() {
    val preflight = Preflight("Reaper")

    preflight.add("Reaper enabled") {
      if (!reaperEnabled.getOrElse(false)) {
        throw PreflightFailure("Reaper not enabled. See https://docs.emergetools.com/docs/reaper-setup-android#configure-the-sdk")
      }
    }

    preflight.add("reaper.publishableApiKey set") {
      val key = reaperPublishableApiKey.orNull
      if (key == null) {
        throw PreflightFailure("reaper.publishableApiKey not set. See https://docs.emergetools.com/docs/reaper-setup-android#configure-the-sdk")
      }
      if (key == "") {
        throw PreflightFailure("reaper.publishableApiKey must not be empty. See https://docs.emergetools.com/docs/reaper-setup-android#configure-the-sdk")
      }
    }

    preflight.add("Reaper runtime SDK added") {
      val manifest = mergedManifestFile.get()
      val text = manifest.asFile.readText()
      if (!text.contains("com.emergetools.reaper.REAPER_INSTRUMENTED")) {
        throw PreflightFailure("Reaper runtime SDK missing. See https://docs.emergetools.com/docs/reaper-setup-android#install-the-sdk")
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
