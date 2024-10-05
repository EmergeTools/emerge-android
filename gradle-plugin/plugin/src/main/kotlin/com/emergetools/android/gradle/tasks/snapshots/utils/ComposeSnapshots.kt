package com.emergetools.android.gradle.tasks.snapshots.utils

import kotlinx.serialization.Serializable

// TODO: (ryan) leverage snapshots-shared for data models once 1.0 published
@Serializable
data class ComposeSnapshots(
  val snapshots: List<ComposePreviewSnapshotConfig>,
)

@Serializable
data class ComposePreviewSnapshotConfig(
  val originalFqn: String,
  val fullyQualifiedClassName: String,
  val previewParameter: PreviewParameter? = null,
  // Preview annotation params:
  val name: String?,
  val group: String?,
  val uiMode: Int?,
  val locale: String?,
  val fontScale: Float?,
  val heightDp: Int?,
  val widthDp: Int?,
  val showBackground: Boolean?,
  val backgroundColor: Long?,
  val showSystemUi: Boolean?,
  val device: String? = null,
  val apiLevel: Int? = null,
  val wallpaper: Int? = null,
)

@Serializable
data class PreviewParameter(
  val parameterName: String,
  val providerClassFqn: String,
  val limit: Int? = null,
  val index: Int? = null,
)
