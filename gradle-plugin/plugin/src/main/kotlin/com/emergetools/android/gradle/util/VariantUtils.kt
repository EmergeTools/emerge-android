package com.emergetools.android.gradle.util

import com.android.build.api.variant.AndroidTest
import com.android.build.api.variant.Variant
import org.gradle.api.Project

fun hasDependency(
  project: Project,
  variant: Variant,
  dependencyGroup: String,
  dependencyName: String,
  androidTest: AndroidTest? = null,
): Boolean {
  fun MutableList<String>.addIfNotBlank(
    value: String?,
    formatter: (String) -> String,
  ) {
    value?.takeIf { it.isNotBlank() }?.let { add(formatter(it)) }
  }

  val configsToCheck =
    buildList {
      add("implementation")
      addIfNotBlank(variant.flavorName) { "${it}Implementation" }
      addIfNotBlank(variant.buildType) { "${it}Implementation" }
      addIfNotBlank(variant.name) { "${it}Implementation" }
      androidTest?.let { test ->
        add("androidTestImplementation")
        addIfNotBlank(test.flavorName) { "${it}Implementation" }
        addIfNotBlank(test.buildType) { "${it}Implementation" }
        addIfNotBlank(test.name) { "${it}Implementation" }
      }
    }

  project.logger.lifecycle("Checking for dependency $dependencyGroup:$dependencyName in configurations $configsToCheck")

  return configsToCheck.any { configName ->
    project.configurations.findByName(configName)?.dependencies?.any { dep ->
      dep.group == dependencyGroup && dep.name == dependencyName
    } ?: false
  }
}
