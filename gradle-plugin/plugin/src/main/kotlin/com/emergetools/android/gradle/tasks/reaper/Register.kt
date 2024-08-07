package com.emergetools.android.gradle.tasks.reaper

import com.android.build.api.artifact.SingleArtifact
import com.android.build.api.variant.Variant
import com.emergetools.android.gradle.EmergePlugin.Companion.EMERGE_TASK_PREFIX
import com.emergetools.android.gradle.EmergePluginExtension
import com.emergetools.android.gradle.tasks.upload.BaseUploadTask.Companion.setTagFromProductOptions
import com.emergetools.android.gradle.tasks.upload.BaseUploadTask.Companion.setUploadTaskInputs
import com.emergetools.android.gradle.util.capitalize
import org.gradle.api.Project

const val EMERGE_REAPER_TASK_GROUP = "Emerge reaper"

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
  val preflightTaskName = "${EMERGE_TASK_PREFIX}ValidateReaper${variant.name.capitalize()}"
  appProject.tasks.register(preflightTaskName, PreflightReaper::class.java) {
    it.group = EMERGE_REAPER_TASK_GROUP
    it.description = "Validate Reaper is properly set up for variant ${variant.name}"
    it.variantName.set(variant.name)
    it.reaperEnabled.set(extension.reaperOptions.enabledVariants.getOrElse(emptyList()).contains(variant.name))
    it.reaperPublishableApiKey.set(extension.reaperOptions.publishableApiKey)
    it.mergedManifestFile.set(variant.artifacts.get(SingleArtifact.MERGED_MANIFEST))

    // We want preflight to happen pretty early so we can detect error conditions and give them
    // nice messages. Specifically we need it to occur prior to 'linking' steps which we detect
    // that the Reaper added instrumentation calls methods in the SDK to avoid confusing error
    // messages.
    val minifyTaskName = "minify${variant.name.capitalize()}WithR8"
    val minifyTasks = appProject.getTasksByName(minifyTaskName, false)
    if (minifyTasks.size != 0) {
      minifyTasks.forEach { minifyTask -> minifyTask.dependsOn(it) }
    }
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
      it.setUploadTaskInputs(extension, appProject, variant)
      it.setTagFromProductOptions(extension.reaperOptions, variant)
    }
  // Hook the bundle tasks to run the reaper upload task after they complete.
  appProject.afterEvaluate { project ->
    val bundleTask = project.tasks.named("bundle${variant.name.capitalize()}")
    bundleTask.configure { it.finalizedBy(uploadReaperAabTask) }
  }
}
