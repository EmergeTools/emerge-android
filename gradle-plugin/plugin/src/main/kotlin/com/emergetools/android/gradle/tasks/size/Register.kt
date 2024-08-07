package com.emergetools.android.gradle.tasks.size

import com.android.build.api.artifact.SingleArtifact
import com.android.build.api.variant.Variant
import com.emergetools.android.gradle.EmergePlugin.Companion.EMERGE_TASK_PREFIX
import com.emergetools.android.gradle.EmergePluginExtension
import com.emergetools.android.gradle.tasks.upload.BaseUploadTask.Companion.setTagFromProductOptions
import com.emergetools.android.gradle.tasks.upload.BaseUploadTask.Companion.setUploadTaskInputs
import com.emergetools.android.gradle.util.capitalize
import org.gradle.api.Project

const val EMERGE_SIZE_TASK_GROUP = "Emerge size analysis"

fun registerSizeTasks(
  appProject: Project,
  extension: EmergePluginExtension,
  variant: Variant,
) {
  appProject.logger.debug(
    "Registering size tasks for variant ${variant.name} in project ${appProject.path}"
  )

  registerUploadAPKTask(appProject, extension, variant)
  registerUploadAABTask(appProject, extension, variant)
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
  }
}

private fun registerUploadAABTask(
  appProject: Project,
  extension: EmergePluginExtension,
  variant: Variant,
) {
  val taskName = "${EMERGE_TASK_PREFIX}Upload${variant.name.capitalize()}Aab"

  appProject.tasks.register(taskName, UploadAAB::class.java) {
    it.group = EMERGE_SIZE_TASK_GROUP
    it.description = "Builds and uploads an AAB for variant ${variant.name} to Emerge."
    it.artifact.set(variant.artifacts.get(SingleArtifact.BUNDLE))
    it.setUploadTaskInputs(extension, appProject, variant)
    it.setTagFromProductOptions(extension.sizeOptions, variant)
  }
}
