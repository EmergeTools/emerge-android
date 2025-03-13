package com.emergetools.android.gradle.tasks.snapshots.transform

import org.objectweb.asm.AnnotationVisitor
import org.objectweb.asm.Opcodes

/**
 * This class captures annotation parameters for the `@Preview` annotation and puts them in
 * the [ComposePreviewSnapshotConfig] object.
 */
class PreviewAnnotationVisitor(private val previewData: PreviewConfig) :
  AnnotationVisitor(Opcodes.ASM9) {
  @Suppress("detekt:CyclomaticComplexMethod")
  override fun visit(name: String?, value: Any?) {
    when (name) {
      "name" -> if (value is String) previewData.name = value
      "group" -> if (value is String) previewData.group = value
      "uiMode" -> if (value is Int) previewData.uiMode = value
      "locale" -> if (value is String) previewData.locale = value
      "fontScale" -> if (value is Float) previewData.fontScale = value
      "heightDp" -> if (value is Int) previewData.heightDp = value
      "widthDp" -> if (value is Int) previewData.widthDp = value
      "showBackground" -> if (value is Boolean) previewData.showBackground = value
      "backgroundColor" -> if (value is Long) previewData.backgroundColor = value
      "showSystemUi" -> if (value is Boolean) previewData.showSystemUi = value
      "device" -> if (value is String) previewData.device = value
      "apiLevel" -> if (value is Int) previewData.apiLevel = value
      "wallpaper" -> if (value is Int) previewData.wallpaper = value
    }
    super.visit(name, value)
  }
}
