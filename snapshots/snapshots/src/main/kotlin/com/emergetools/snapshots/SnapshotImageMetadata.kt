package com.emergetools.snapshots

import com.emergetools.snapshots.shared.ComposePreviewSnapshotConfig
import kotlinx.serialization.Serializable

enum class SnapshotType {
  COMPOSABLE,
  VIEW,
  ACTIVITY,
}

sealed class SnapshotMetadata {
  abstract val name: String
  abstract val displayName: String?
  abstract val fqn: String
  abstract val type: SnapshotType
  abstract val composePreviewSnapshotConfig: ComposePreviewSnapshotConfig?
}

@Serializable
internal data class SnapshotImageMetadata(
  // Used as the primary key
  override val name: String,
  @Deprecated("Use name instead")
  val keyName: String,
  // User defined name, or set to defaults by our backend
  override val displayName: String?,
  // Filename of the outputted image
  val filename: String,
  // FQN of the test class
  override val fqn: String,
  override val type: SnapshotType,
  // Compose-specific metadata, only set if type == COMPOSABLE
  override val composePreviewSnapshotConfig: ComposePreviewSnapshotConfig? = null,
): SnapshotMetadata()

@Serializable
internal data class SnapshotErrorMetadata(
  // Used as the primary key
  override val name: String,
  // User defined name, or set to defaults by our backend
  override val displayName: String?,
  // FQN of the test class
  override val fqn: String,
  override val type: SnapshotType,
  // Compose-specific metadata, only set if type == COMPOSABLE
  override val composePreviewSnapshotConfig: ComposePreviewSnapshotConfig? = null,
): SnapshotMetadata()
