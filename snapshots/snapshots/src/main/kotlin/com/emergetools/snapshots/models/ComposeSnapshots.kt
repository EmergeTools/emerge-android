package com.emergetools.snapshots.models

import kotlinx.serialization.Serializable

@Serializable
data class ComposeSnapshots(
  val snapshots: List<ComposePreviewSnapshotConfig>,
)
