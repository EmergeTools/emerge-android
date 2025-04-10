package com.emergetools.snapshots.models

// Keep parity with
// https://cs.android.com/androidx/platform/frameworks/support/+/androidx-main:compose/ui/ui-tooling-preview/src/androidMain/kotlin/androidx/compose/ui/tooling/preview/Preview.kt
data class ComposePreviewSnapshotConfig(
  val fullyQualifiedClassName: String,
  val originalFqn: String,
  val isAppStoreSnapshot: Boolean? = null,
  val previewParameter: PreviewParameter? = null,
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
  val apiLevel: Int? = null,
  val wallpaper: Int? = null,
) {
  val functionName: String
    get() = originalFqn.substringAfterLast(".")

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
      device == null &&
      apiLevel == null &&
      wallpaper == null &&
      previewParameter == null
  }

  /**
   * Stable key name generation that takes into account all diff-relevant variants.
   */
  fun keyName(baseKey: String = originalFqn): String {
    if (isDefault()) {
      return baseKey
    }

    return buildString {
      append(baseKey)
      uiMode?.let { append("_uim_$it") }
      locale?.let { append("_loc_$it") }
      fontScale?.let { append("_fsc_$it") }
      widthDp?.let { append("_wdp_$it") }
      heightDp?.let { append("_hdp_$it") }
      showBackground?.let { append("_bg_$it") }
      backgroundColor?.let { append("_bgc_$it") }
      showSystemUi?.let { append("_sysui_$it") }
      device?.let { append("_dev_$it") }
      apiLevel?.let { append("_api_$it") }
      wallpaper?.let { append("_wp_$it") }
      previewParameter?.let {
        append("_param_${it.parameterName}")
        it.index?.let { idx -> append("_idx_$idx") }
      }
    }
  }
}

data class PreviewParameter(
  val parameterName: String,
  val providerClassFqn: String,
  val limit: Int? = null,
  val index: Int? = null,
)
