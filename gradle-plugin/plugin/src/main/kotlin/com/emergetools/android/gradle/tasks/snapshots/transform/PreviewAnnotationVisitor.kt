package com.emergetools.android.gradle.tasks.snapshots.transform

import org.objectweb.asm.AnnotationVisitor

/**
 * This class captures annotation parameters for the `@Preview` annotation and puts them in
 * the [ComposePreviewSnapshotConfig] object.
 */
class PreviewAnnotationVisitor(api: Int, val previewData: ComposePreviewSnapshotConfig) :
  AnnotationVisitor(api) {
  @Suppress("detekt:CyclomaticComplexMethod")
  override fun visit(name: String?, value: Any?) {
    when (name) {
      "name" -> if (value is String) previewData.name = value
      "uiMode" -> if (value is Int) previewData.uiMode = value
      "group" -> if (value is String) previewData.group = value
      "apiLevel" -> if (value is Int) previewData.apiLevel = value
      "widthDp" -> if (value is Int) previewData.widthDp = value
      "heightDp" -> if (value is Int) previewData.heightDp = value
      "locale" -> if (value is String) previewData.locale = value
      "fontScale" -> if (value is Float) previewData.fontScale = value
      "showSystemUi" -> if (value is Boolean) previewData.showSystemUi = value
      "showBackground" -> if (value is Boolean) previewData.showBackground = value
      "device" -> if (value is String) previewData.device = value
      "wallpaper" -> if (value is Int) previewData.wallpaper = value
    }
    super.visit(name, value)
  }
}
