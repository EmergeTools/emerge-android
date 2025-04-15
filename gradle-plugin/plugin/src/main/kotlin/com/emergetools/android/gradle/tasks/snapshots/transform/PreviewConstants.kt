package com.emergetools.android.gradle.tasks.snapshots.transform

const val PREVIEW_ANNOTATION_DESC = "Landroidx/compose/ui/tooling/preview/Preview;"
const val PREVIEW_CONTAINER_ANNOTATION_DESC =
  "Landroidx/compose/ui/tooling/preview/Preview\$Container;"

// Supported default multipreview annotations
const val PREVIEW_LIGHT_DARK_ANNOTATION_DESC =
  "Landroidx/compose/ui/tooling/preview/PreviewLightDark;"
const val PREVIEW_FONT_SCALE_ANNOTATION_DESC =
  "Landroidx/compose/ui/tooling/preview/PreviewFontScale;"
const val PREVIEW_SCREEN_SIZES_ANNOTATION_DESC =
  "Landroidx/compose/ui/tooling/preview/PreviewScreenSizes;"
const val PREVIEW_DYNAMIC_COLORS_ANNOTATION_DESC =
  "Landroidx/compose/ui/tooling/preview/PreviewDynamicColors;"
const val PREVIEW_PARAMETER_ANNOTATION_DESC = "Landroidx/compose/ui/tooling/preview/PreviewParameter;"
const val PREVIEW_WEAR_SMALL_ROUND_ANNOTATION_DESC =
  "Landroidx/wear/compose/ui/tooling/preview/WearPreviewSmallRound;"
const val PREVIEW_WEAR_LARGE_ROUND_ANNOTATION_DESC =
  "Landroidx/wear/compose/ui/tooling/preview/WearPreviewLargeRound;"
const val PREVIEW_WEAR_SQUARE_ANNOTATION_DESC =
  "Landroidx/wear/compose/ui/tooling/preview/WearPreviewSquare;"
const val PREVIEW_WEAR_DEVICES_ANNOTATION_DESC =
  "Landroidx/wear/compose/ui/tooling/preview/WearPreviewDevices;"
const val PREVIEW_WEAR_FONT_SCALES = "Landroidx/wear/compose/ui/tooling/preview/WearPreviewFontScales;"
const val EMERGE_APP_STORE_SNAPSHOT =
  "Lcom/emergetools/snapshots/annotations/EmergeAppStoreSnapshot;"
const val EMERGE_IGNORE_SNAPSHOT =
  "Lcom/emergetools/snapshots/annotations/IgnoreEmergeSnapshot;"
const val EMERGE_SNAPSHOT_CONFIG =
  "Lcom/emergetools/snapshots/annotations/EmergeSnapshotConfig;"

// These constants are from:
// https://android.googlesource.com/platform/frameworks/base/+/master/core/java/android/content/res/Configuration.java
const val UI_MODE_NIGHT_YES: Int = 32
const val UI_MODE_TYPE_NORMAL: Int = 1

// These constants are from:
// https://cs.android.com/androidx/platform/frameworks/support/+/androidx-main:compose/ui/ui-tooling-preview/src/androidMain/kotlin/androidx/compose/ui/tooling/preview/Device.android.kt
const val PHONE = "spec:id=reference_phone,shape=Normal,width=411,height=891,unit=dp,dpi=420"
const val FOLDABLE =
  "spec:id=reference_foldable,shape=Normal,width=673,height=841,unit=dp,dpi=420"
const val TABLET = "spec:id=reference_tablet,shape=Normal,width=1280,height=800,unit=dp,dpi=240"
const val DESKTOP =
  "spec:id=reference_desktop,shape=Normal,width=1920,height=1080,unit=dp,dpi=160"

// These constants are from:
// https://cs.android.com/androidx/platform/frameworks/support/+/androidx-main:wear/wear-tooling-preview/src/main/java/androidx/wear/tooling/preview/devices/WearDevice.kt
const val LARGE_ROUND = "id:wearos_large_round"
const val SMALL_ROUND = "id:wearos_small_round"
const val SQUARE = "id:wearos_square"
