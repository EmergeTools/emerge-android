package com.emergetools.android.gradle.tasks.reaper

import com.android.build.api.artifact.SingleArtifact
import com.android.build.api.variant.Variant
import com.emergetools.android.gradle.EmergePlugin.Companion.EMERGE_TASK_PREFIX
import com.emergetools.android.gradle.EmergePluginExtension
import com.emergetools.android.gradle.tasks.base.BaseUploadTask.Companion.setTagFromProductOptions
import com.emergetools.android.gradle.tasks.base.BaseUploadTask.Companion.setUploadTaskInputs
import com.emergetools.android.gradle.util.capitalize
import com.emergetools.android.gradle.util.hasDependency
import org.gradle.api.Project

const val EMERGE_REAPER_TASK_GROUP = "Emerge reaper"
const val REAPER_DEP_GROUP = "com.emergetools.reaper"
const val REAPER_DEP_NAME = "reaper"

fun registerReaperTasks(
  appProject: Project,
  extension: EmergePluginExtension,
  variant: Variant,
) {
  appProject.logger.debug(
    "Registering reaper tasks for variant ${variant.name} in project ${appProject.path}"
  )

  registerReaperPreflightTask(appProject, extension, variant)

  val enabledVariants = extension.reaperOptions.enabledVariants.getOrElse(emptyList())
  // Only register upload task if Reaper is enabled for variant
  if (enabledVariants.contains(variant.name)) {
    appProject.logger.debug("Reaper enabled for variant ${variant.name}")
    registerReaperUploadTask(appProject, extension, variant)
  }
}

private fun registerReaperPreflightTask(
  appProject: Project,
  extension: EmergePluginExtension,
  variant: Variant,
) {
  val preflightTaskName = "${EMERGE_TASK_PREFIX}ReaperPreflight${variant.name.capitalize()}"
  appProject.tasks.register(preflightTaskName, ReaperPreflight::class.java) {
    it.group = EMERGE_REAPER_TASK_GROUP
    it.description = "Validate Reaper is properly set up for variant ${variant.name}"
    it.variantName.set(variant.name)
    it.hasEmergeApiToken.set(!extension.apiToken.orNull.isNullOrBlank())
    it.reaperEnabled.set(extension.reaperOptions.enabledVariants.getOrElse(emptyList()).contains(variant.name))
    it.reaperPublishableApiKey.set(extension.reaperOptions.publishableApiKey)
    it.hasReaperImplementationDependency.set(
      hasDependency(appProject, variant, REAPER_DEP_GROUP, REAPER_DEP_NAME)
    )
  }
}

private fun registerReaperUploadTask(
  appProject: Project,
  extension: EmergePluginExtension,
  variant: Variant,
) {
  val uploadReaperAabTaskName = "${EMERGE_TASK_PREFIX}UploadReaperAab${variant.name.capitalize()}"
  val uploadReaperAabTask =
    appProject.tasks.register(uploadReaperAabTaskName, InitializeReaper::class.java) {
      it.artifact.set(variant.artifacts.get(SingleArtifact.BUNDLE))
      it.publishableApiKey.set(extension.reaperOptions.publishableApiKey)
      it.setUploadTaskInputs(extension, appProject, variant)
      it.setTagFromProductOptions(extension.reaperOptions, variant)
    }
  // Hook the bundle tasks to run the reaper upload task after they complete.
  appProject.afterEvaluate { project ->
    val bundleTask = project.tasks.named("bundle${variant.name.capitalize()}")
    bundleTask.configure { it.finalizedBy(uploadReaperAabTask) }
  }
}
