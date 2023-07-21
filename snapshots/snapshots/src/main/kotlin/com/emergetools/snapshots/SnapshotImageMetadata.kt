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
  // Used as the primary key
  val name: String,
  @Deprecated("Use name instead")
  val keyName: String,
  // User defined name, or set to defaults by our backend
  val displayName: String?,
  // Filename of the outputted image
  val filename: String,
  // FQN of the test class
  val fqn: String,
  val type: SnapshotType,
  // Compose-specific metadata, only set if type == COMPOSABLE
  val composePreviewSnapshotConfig: ComposePreviewSnapshotConfig? = null,
)
