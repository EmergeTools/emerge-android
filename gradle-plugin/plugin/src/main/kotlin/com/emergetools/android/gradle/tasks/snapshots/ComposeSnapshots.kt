package com.emergetools.android.gradle.tasks.snapshots

import kotlinx.serialization.Serializable

// TODO: Depend on snapshots-shared once published latest version
@Serializable
data class ComposeSnapshots(
  val snapshots: List<ComposePreviewSnapshotConfig>,
)
