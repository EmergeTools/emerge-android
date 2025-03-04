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
const val EMERGE_APP_STORE_SNAPSHOT =
  "Lcom/emergetools/snapshots/annotations/EmergeAppStoreSnapshot;"
const val EMERGE_IGNORE_SNAPSHOT =
  "Lcom/emergetools/snapshots/annotations/IgnoreEmergeSnapshot;"

const val UI_MODE_NIGHT_YES: Int = 32
const val UI_MODE_TYPE_NORMAL: Int = 1

const val PHONE = "spec:id=reference_phone,shape=Normal,width=411,height=891,unit=dp,dpi=420"
const val FOLDABLE =
  "spec:id=reference_foldable,shape=Normal,width=673,height=841,unit=dp,dpi=420"
const val TABLET = "spec:id=reference_tablet,shape=Normal,width=1280,height=800,unit=dp,dpi=240"
const val DESKTOP =
  "spec:id=reference_desktop,shape=Normal,width=1920,height=1080,unit=dp,dpi=160"
