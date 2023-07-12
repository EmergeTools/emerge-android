package com.emergetools.snapshots.shared

import kotlinx.serialization.Serializable

// Keep parity with
// https://cs.android.com/androidx/platform/frameworks/support/+/androidx-main:compose/ui/ui-tooling-preview/src/androidMain/kotlin/androidx/compose/ui/tooling/preview/Preview.kt

// Keep in sync with snapshots-processor/src/main/kotlin/com/emergetools/snapshots/processor/shared/ComposePreviewSnapshotConfig.kt
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
