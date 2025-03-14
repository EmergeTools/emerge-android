package com.emergetools.android.gradle.tasks.size

import com.android.build.api.artifact.SingleArtifact
import com.android.build.api.variant.Variant
import com.emergetools.android.gradle.EmergePlugin.Companion.EMERGE_TASK_PREFIX
import com.emergetools.android.gradle.EmergePluginExtension
import com.emergetools.android.gradle.dv.getBuildScan
import com.emergetools.android.gradle.tasks.base.BasePreflightTask.Companion.setPreflightTaskInputs
import com.emergetools.android.gradle.tasks.base.BaseUploadTask.Companion.setTagFromProductOptions
import com.emergetools.android.gradle.tasks.base.BaseUploadTask.Companion.setUploadTaskInputs
import com.emergetools.android.gradle.util.capitalize
import org.gradle.api.Project

const val EMERGE_SIZE_TASK_GROUP = "Emerge size analysis"

fun registerSizeTasks(
  appProject: Project,
  extension: EmergePluginExtension,
  variant: Variant,
) {
  appProject.logger.debug(
    "Registering size tasks for variant ${variant.name} in project ${appProject.path}",
  )

  registerSizeAnalysisPreflightTask(appProject, extension, variant)

  registerUploadAPKTask(appProject, extension, variant)
  registerUploadAABTask(appProject, extension, variant)
}

private fun registerSizeAnalysisPreflightTask(
  appProject: Project,
  extension: EmergePluginExtension,
  variant: Variant,
) {
  val preflightTaskName = "${EMERGE_TASK_PREFIX}SizeAnalysisPreflight${variant.name.capitalize()}"
  appProject.tasks.register(preflightTaskName, SizePreflight::class.java) {
    it.group = EMERGE_SIZE_TASK_GROUP
    it.description = "Validate Size analysis is properly set up for variant ${variant.name}"
    it.variantName.set(variant.name)
    it.appProjectPath.set(appProject.path)
    it.hasEmergeApiToken.set(!extension.apiToken.orNull.isNullOrBlank())
    it.sizeEnabled.set(extension.sizeOptions.enabled.getOrElse(true))
    it.setPreflightTaskInputs(extension)
  }
}

private fun registerUploadAPKTask(
  appProject: Project,
  extension: EmergePluginExtension,
  variant: Variant,
) {
  val taskName = "${EMERGE_TASK_PREFIX}Upload${variant.name.capitalize()}Apk"

  appProject.tasks.register(taskName, UploadAPK::class.java) {
    it.group = EMERGE_SIZE_TASK_GROUP
    it.description = "Builds and uploads an APK for variant ${variant.name} to Emerge."
    it.artifactDir.set(variant.artifacts.get(SingleArtifact.APK))
    it.proguardMapping.set(variant.artifacts.get(SingleArtifact.OBFUSCATION_MAPPING_FILE))
    it.setUploadTaskInputs(extension, appProject, variant)
    it.setTagFromProductOptions(extension.sizeOptions, variant)
    it.buildScan.set(appProject.getBuildScan())
  }
}

private fun registerUploadAABTask(
  appProject: Project,
  extension: EmergePluginExtension,
  variant: Variant,
) {
  val taskName = getUploadAabTaskName(variant.name)

  appProject.tasks.register(taskName, UploadAAB::class.java) {
    it.group = EMERGE_SIZE_TASK_GROUP
    it.description = "Builds and uploads an AAB for variant ${variant.name} to Emerge."
    it.artifact.set(variant.artifacts.get(SingleArtifact.BUNDLE))
    it.setUploadTaskInputs(extension, appProject, variant)
    it.setTagFromProductOptions(extension.sizeOptions, variant)
    it.buildScan.set(appProject.getBuildScan())
  }
}

fun getUploadAabTaskName(variantName: String): String {
  return "${EMERGE_TASK_PREFIX}Upload${variantName.capitalize()}Aab"
}
