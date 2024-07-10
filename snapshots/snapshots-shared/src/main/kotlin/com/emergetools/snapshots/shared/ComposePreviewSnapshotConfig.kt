package com.emergetools.snapshots.shared

import kotlinx.serialization.Serializable

// Keep parity with
// https://cs.android.com/androidx/platform/frameworks/support/+/androidx-main:compose/ui/ui-tooling-preview/src/androidMain/kotlin/androidx/compose/ui/tooling/preview/Preview.kt
@Serializable
data class ComposePreviewSnapshotConfig(
  val fullyQualifiedClassName: String,
  val originalFqn: String,
  // Preview annotation params:
  val name: String? = null,
  val group: String? = null,
  val uiMode: Int? = null,
  val locale: String? = null,
  val fontScale: Float? = null,
  val widthDp: Int? = null,
  val heightDp: Int? = null,
  val showBackground: Boolean? = null,
  val backgroundColor: Long? = null,
  val showSystemUi: Boolean? = null,
  val device: String? = null,
) {

  /**
   * We consider the "default" config to be one where no variants are set.
   */
  fun isDefault(): Boolean {
    return uiMode == null &&
      locale == null &&
      fontScale == null &&
      widthDp == null &&
      heightDp == null &&
      showBackground == null &&
      backgroundColor == null &&
      showSystemUi == null &&
      device == null
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
      widthDp?.let { append("_wdp_$it") }
      heightDp?.let { append("_hdp_$it") }
      showBackground?.let { append("_bg_$it") }
      backgroundColor?.let { append("_bgc_$it") }
      showSystemUi?.let { append("_sysui_$it") }
      device?.let { append("_dev_$it") }
    }
  }
}
