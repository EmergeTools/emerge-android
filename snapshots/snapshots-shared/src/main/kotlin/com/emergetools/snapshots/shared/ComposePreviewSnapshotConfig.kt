package com.emergetools.snapshots.shared

import kotlinx.serialization.Serializable

// Keep parity with
// https://cs.android.com/androidx/platform/frameworks/support/+/androidx-main:compose/ui/ui-tooling-preview/src/androidMain/kotlin/androidx/compose/ui/tooling/preview/Preview.kt
@Serializable
data class ComposePreviewSnapshotConfig(
  val originalFqn: String,
  val name: String? = null,
  val group: String? = null,
  val uiMode: Int? = null,
  val locale: String? = null,
  val fontScale: Float? = null,
) {

  /**
   * We consider the "default" config to be one where no variants are set.
   */
  fun isDefault(): Boolean {
    return uiMode == null &&
      locale == null &&
      fontScale == null
  }

  /**
   * Stable key name generation that takes into account all diff-relevant variants.
   */
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
