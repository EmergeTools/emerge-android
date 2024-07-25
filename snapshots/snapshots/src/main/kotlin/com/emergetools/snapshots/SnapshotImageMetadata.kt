package com.emergetools.snapshots

import com.emergetools.snapshots.shared.ComposePreviewSnapshotConfig
import kotlinx.serialization.ExperimentalSerializationApi
import kotlinx.serialization.Serializable
import kotlinx.serialization.json.JsonClassDiscriminator

enum class SnapshotType {
  COMPOSABLE,
  VIEW,
  ACTIVITY,
}

enum class SnapshotErrorType {
  EMPTY_SNAPSHOT,
  GENERAL,
}

@OptIn(ExperimentalSerializationApi::class)
@Serializable
@JsonClassDiscriminator("metadataType")
sealed class SnapshotMetadata {
  abstract val name: String
  abstract val displayName: String?
  abstract val fqn: String
  abstract val type: SnapshotType
  abstract val composePreviewSnapshotConfig: ComposePreviewSnapshotConfig?

  @Serializable
  internal class SuccessMetadata(
    // Used as the primary key
    override val name: String,
    // User defined name, or set to defaults by our backend
    override val displayName: String?,
    // Filename of the outputted image
    val filename: String,
    // FQN of the test class
    override val fqn: String,
    override val type: SnapshotType,
    // Compose-specific metadata, only set if type == COMPOSABLE
    override val composePreviewSnapshotConfig: ComposePreviewSnapshotConfig? = null,
  ) : SnapshotMetadata()

  @Serializable
  internal class ErrorMetadata(
    // Used as the primary key
    override val name: String,
    // User defined name, or set to defaults by our backend
    override val displayName: String?,
    // FQN of the test class
    override val fqn: String,
    override val type: SnapshotType,
    val errorType: SnapshotErrorType,
    // Compose-specific metadata, only set if type == COMPOSABLE
    override val composePreviewSnapshotConfig: ComposePreviewSnapshotConfig? = null,
  ) : SnapshotMetadata()
}
