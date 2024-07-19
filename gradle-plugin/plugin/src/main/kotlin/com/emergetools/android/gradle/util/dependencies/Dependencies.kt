package com.emergetools.android.gradle.util.dependencies

import kotlinx.serialization.Serializable

@Serializable
data class Dependencies(
  val dependencies: List<Dependency>,
) {

  companion object {
    const val JSON_FILE_NAME = "dependencies.json"
  }
}

@Serializable
sealed class Dependency {
  // abstract val entries: List<String>
}

@Serializable
data class Module(
  val name: String,
  val path: String,
  val isRoot: Boolean = false,
  // override val entries: List<String>,
) : Dependency()

@Serializable
data class Library(
  val groupId: String,
  val artifactId: String,
  val version: String,
  // override val entries: List<String>,
) : Dependency()
