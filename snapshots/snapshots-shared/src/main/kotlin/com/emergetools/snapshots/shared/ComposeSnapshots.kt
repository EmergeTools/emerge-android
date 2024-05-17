package com.emergetools.snapshots.shared

import kotlinx.serialization.Serializable

@Serializable
data class ComposeSnapshots(
  val snapshots: List<ComposePreviewSnapshotConfig>,
)
