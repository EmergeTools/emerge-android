package com.emergetools.snapshots.shared

import kotlinx.serialization.Serializable

@Serializable
data class ComposePreviewSnapshotConfig(
  val name: String? = null,
  val group: String? = null,
  val uiMode: Int? = null,
  val locale: String? = null,
  val fontScale: Float? = null,
) {

  companion object {
    val DEFAULT = ComposePreviewSnapshotConfig()
  }
}
