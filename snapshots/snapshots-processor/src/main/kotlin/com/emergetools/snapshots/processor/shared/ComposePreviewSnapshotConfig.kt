package com.emergetools.snapshots.processor.shared

import kotlinx.serialization.Serializable

// Keep parity with
// https://cs.android.com/androidx/platform/frameworks/support/+/androidx-main:compose/ui/ui-tooling-preview/src/androidMain/kotlin/androidx/compose/ui/tooling/preview/Preview.kt

// Keep in sync with snapshots/src/main/kotlin/com/emergetools/snapshots/shared/ComposePreviewSnapshotConfig.kt
@Serializable
data class ComposePreviewSnapshotConfig(
  val originalFqn: String,
  val name: String? = null,
  val group: String? = null,
  val uiMode: Int? = null,
  val locale: String? = null,
  val fontScale: Float? = null,
) {

  fun isDefault(): Boolean {
    return uiMode == null &&
      locale == null &&
      fontScale == null
  }
  fun keyName(): String {
    if (isDefault()) {
      return originalFqn
    }

    return buildString {
      append(originalFqn)
      uiMode?.let { append("_uim_$it") }
      locale?.let { append("_loc_$it") }
      fontScale?.let { append("_fsc_$it") }
    }
  }
}
