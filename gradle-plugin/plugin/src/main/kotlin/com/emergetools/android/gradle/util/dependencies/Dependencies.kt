package com.emergetools.android.gradle.util.dependencies

import kotlinx.serialization.Serializable

@Serializable
data class Dependencies(
  val modules: List<Module>,
  val libraries: List<Library>,
) {

  companion object {
    const val JSON_FILE_NAME = "dependencies.json"
  }
}

@Serializable
data class Module(
  val name: String,
  val path: String,
  val isRoot: Boolean = false,
  val entries: List<String>,
)

@Serializable
data class Library(
  val groupId: String,
  val artifactId: String,
  val version: String,
  val entries: List<String>,
)
