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
)
