package com.emergetools.android.gradle.util

import com.android.build.api.variant.Variant
import org.gradle.api.Project

fun hasDependency(
  project: Project,
  variant: Variant,
  dependencyGroup: String,
  dependencyName: String,
): Boolean {
  val configsToCheck = listOfNotNull(
    variant.flavorName?.let { "${it}Implementation" },
    variant.buildType?.let { "${it}Implementation" },
    "${variant.name}Implementation",
    "implementation",
  )

  return configsToCheck.any { configName ->
    project.configurations.findByName(configName)?.dependencies?.any { dep ->
      dep.group == dependencyGroup && dep.name == dependencyName
    } ?: false
  }
}
