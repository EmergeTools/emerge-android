package com.emergetools.snapshots

import com.emergetools.snapshots.shared.ComposePreviewSnapshotConfig
import kotlinx.serialization.Serializable

enum class SnapshotType {
  COMPOSABLE,
  VIEW,
  ACTIVITY,
}

@Serializable
internal data class SnapshotImageMetadata(
  val keyName: String,
  val displayName: String,
  val filename: String,
  // FQN of the test class
  val fqn: String,
  val type: SnapshotType,
  val composePreviewSnapshotConfig: ComposePreviewSnapshotConfig? = null,
)
