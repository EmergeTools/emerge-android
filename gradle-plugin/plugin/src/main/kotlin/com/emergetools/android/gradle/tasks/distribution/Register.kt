package com.emergetools.android.gradle.tasks.distribution

import com.android.build.api.variant.Variant
import com.emergetools.android.gradle.EmergePlugin.Companion.EMERGE_TASK_PREFIX
import com.emergetools.android.gradle.EmergePluginExtension
import com.emergetools.android.gradle.tasks.base.BasePreflightTask.Companion.setPreflightTaskInputs
import com.emergetools.android.gradle.util.capitalize
import com.emergetools.android.gradle.util.hasDependency
import org.gradle.api.Project

private const val EMERGE_DISTRIBUTION_TASK_GROUP = "Emerge Distribution"
private const val DISTRIBUTION_DEP_GROUP = "com.emergetools.distribution"
private const val DISTRIBUTION_DEP_NAME = "distribution"

private const val PLACEHOLDER_API_KEY = "emerge.distribution.apiKey"
private const val PLACEHOLDER_TAG = "emerge.distribution.tag"

fun registerDistributionTasks(
  appProject: Project,
  extension: EmergePluginExtension,
  variant: Variant,
) {
  appProject.logger.debug(
    "Registering Distribution tasks for variant ${variant.name} in project ${appProject.path}"
  )

  registerDistributionPreflightTask(appProject, extension, variant)

  // Set the build tag:
  variant.manifestPlaceholders.put(
    PLACEHOLDER_TAG, extension.distributionOptions.tag.getOrElse("release")
  )

  // API key is special in that we only want to put it in the manifest if distribution is actually
  // enabled:
  val enabledVariants = extension.distributionOptions.enabledVariants.getOrElse(emptyList())
  if (enabledVariants.contains(variant.name)) {
    appProject.logger.debug("Distribution enabled for variant ${variant.name}")
    variant.manifestPlaceholders.put(PLACEHOLDER_API_KEY, getApiKey() ?: "")
  } else {
    variant.manifestPlaceholders.put(PLACEHOLDER_API_KEY, "")
  }
}

private fun getApiKey(): String? {
  return System.getenv("DISTRIBUTION_API_KEY")
}

private fun registerDistributionPreflightTask(
  appProject: Project,
  extension: EmergePluginExtension,
  variant: Variant,
) {
  val preflightTaskName = "${EMERGE_TASK_PREFIX}DistributionPreflight${variant.name.capitalize()}"
  appProject.tasks.register(preflightTaskName, DistributionPreflight::class.java) {
    it.group = EMERGE_DISTRIBUTION_TASK_GROUP
    it.description = "Validate Distribution is properly set up for variant ${variant.name}"
    it.variantName.set(variant.name)
    it.hasEmergeApiToken.set(!extension.apiToken.orNull.isNullOrBlank())
    it.distributionEnabled.set(
      extension.distributionOptions.enabledVariants.getOrElse(emptyList()).contains(variant.name)
    )
    it.distributionApiKey.set(getApiKey())
    it.distributionTag.set(extension.distributionOptions.tag)
    it.hasDistributionImplementationDependency.set(
      hasDependency(appProject, variant, DISTRIBUTION_DEP_GROUP, DISTRIBUTION_DEP_NAME)
    )
    it.setPreflightTaskInputs(extension)
  }
}
