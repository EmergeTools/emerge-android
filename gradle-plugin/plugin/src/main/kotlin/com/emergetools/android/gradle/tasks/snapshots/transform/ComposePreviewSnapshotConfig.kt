package com.emergetools.android.gradle.tasks.snapshots.transform

import kotlinx.serialization.Serializable

@Serializable
data class ComposePreviewSnapshotConfig(
  val fullyQualifiedClassName: String? = null,
  val originalFqn: String,
  val sourceFileName: String? = null,
  var isAppStoreSnapshot: Boolean? = null,
  val previewParameter: PreviewParameter? = null,
  var name: String? = null,
  var group: String? = null,
  var uiMode: Int? = null,
  var locale: String? = null,
  var fontScale: Float? = null,
  var heightDp: Int? = null,
  var widthDp: Int? = null,
  var showBackground: Boolean? = null,
  var backgroundColor: Int? = null,
  var showSystemUi: Boolean? = null,
  var device: String? = null,
  var apiLevel: Int? = null,
  var wallpaper: Int? = null,
)

@Serializable
data class PreviewParameter(
  val parameterName: String,
  val providerClassFqn: String,
  val limit: Int? = null,
  val index: Int? = null
)

fun String.cleanName(): String {
  var newName = this.replace("/", ".")
  // Strip .class suffix
  if (newName.endsWith(".class")) {
    newName = newName.substring(0, newName.length - 6)
  }
  return newName
}

fun String.removeClassName(): String {
  return this.substringBeforeLast(".")
}
