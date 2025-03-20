package com.emergetools.android.gradle.tasks.snapshots.transform

import kotlinx.serialization.Serializable

@Serializable
data class ComposePreviewSnapshotConfig(
  val fullyQualifiedClassName: String? = null,
  val originalFqn: String,
  val sourceFileName: String? = null,
  var isAppStoreSnapshot: Boolean? = null,
  var precision: Float? = null,
  val previewParameter: PreviewParameter? = null,
  var name: String? = null,
  var group: String? = null,
  var uiMode: Int? = null,
  var locale: String? = null,
  var fontScale: Float? = null,
  var heightDp: Int? = null,
  var widthDp: Int? = null,
  var showBackground: Boolean? = null,
  var backgroundColor: Long? = null,
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

const val CLASS_CHARS_LENGTH = 6

fun String.cleanName(): String {
  var newName = this.replace("/", ".")
  if (newName.endsWith(".class")) {
    newName = newName.substring(0, newName.length - CLASS_CHARS_LENGTH)
  }
  return newName
}

fun String.cleanFileName(): String {
  val newName = this.substringAfterLast(".")
  return newName.replace("Kt", ".kt")
}

fun String.removeClassName(): String {
  return this.substringBeforeLast(".")
}
