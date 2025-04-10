package com.emergetools.snapshots

import com.emergetools.snapshots.models.ComposePreviewSnapshotConfig

enum class SnapshotErrorType {
  EMPTY_SNAPSHOT,
  GENERAL,
}

sealed class SnapshotMetadata {
  abstract val name: String
  abstract val displayName: String?
  abstract val fqn: String
  abstract val composePreviewSnapshotConfig: ComposePreviewSnapshotConfig

  internal class SuccessMetadata(
    // Used as the primary key
    override val name: String,
    // User defined name, or set to defaults by our backend
    override val displayName: String?,
    // Filename of the outputted image
    val filename: String,
    // FQN of the test class
    override val fqn: String,
    // Compose-specific metadata, only set if type == COMPOSABLE
    override val composePreviewSnapshotConfig: ComposePreviewSnapshotConfig,
  ) : SnapshotMetadata()

  internal class ErrorMetadata(
    // Used as the primary key
    override val name: String,
    // User defined name, or set to defaults by our backend
    override val displayName: String?,
    // FQN of the test class
    override val fqn: String,
    val errorType: SnapshotErrorType,
    // Compose-specific metadata, only set if type == COMPOSABLE
    override val composePreviewSnapshotConfig: ComposePreviewSnapshotConfig,
  ) : SnapshotMetadata()
}
