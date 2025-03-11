package com.emergetools.android.gradle.tasks.snapshots.transform

import org.objectweb.asm.AnnotationVisitor
import org.objectweb.asm.ClassVisitor

/**
 * First pass visitor that identifies custom annotations (like @AppStoreScreenshotPreviews) that are
 * themselves annotated with @Preview or @EmergeAppStoreSnapshot.
 */
class FindCustomPreviewClassVisitor(
  api: Int,
  private val customPreviewAnnotations: MutableMap<String, CustomPreviewAnnotation>
) : ClassVisitor(api) {

  private val currentAnnotation = CustomPreviewAnnotation()
  private lateinit var currentClassName: String

  override fun visit(
    version: Int,
    access: Int,
    name: String,
    signature: String?,
    superName: String?,
    interfaces: Array<out String>?
  ) {
    super.visit(version, access, name, signature, superName, interfaces)
    currentClassName = name
  }

  override fun visitAnnotation(descriptor: String?, visible: Boolean): AnnotationVisitor? {
    if (descriptor == EMERGE_APP_STORE_SNAPSHOT) {
      currentAnnotation.isAppStoreSnapshot = true
    } else if (customPreviewAnnotations.containsKey(descriptor)) {
      currentAnnotation.hasPreviewAnnotation = true
      currentAnnotation.hasPreviewArray = true
      currentAnnotation.previewConfigs.addAll(customPreviewAnnotations[descriptor]!!.previewConfigs)
    }

    return object : AnnotationVisitor(api, super.visitAnnotation(descriptor, visible)) {
      override fun visitArray(name: String?): AnnotationVisitor? {
        if (name == "value") {
          return object : AnnotationVisitor(api) {
            override fun visitAnnotation(name: String?, descriptor: String?): AnnotationVisitor? {
              if (descriptor == PREVIEW_ANNOTATION_DESC) {
                currentAnnotation.hasPreviewArray = true

                // Create a preview configuration to capture parameters
                val previewConfig = PreviewConfig()
                currentAnnotation.previewConfigs.add(previewConfig)

                // Capture the preview parameters
                return object : AnnotationVisitor(api) {
                  override fun visit(name: String?, value: Any?) {
                    previewConfig.captureParameter(name, value)
                    super.visit(name, value)
                  }
                }
              }
              return super.visitAnnotation(name, descriptor)
            }
          }
        }
        return super.visitArray(name)
      }
    }
  }

  override fun visitEnd() {
    // If this is an annotation with previews, add it to our map
    if (currentAnnotation.hasPreviewAnnotation ||
      currentAnnotation.hasPreviewArray ||
      currentAnnotation.isAppStoreSnapshot
    ) {
      val descriptor = "L$currentClassName;"
      customPreviewAnnotations[descriptor] = currentAnnotation
    }
    super.visitEnd()
  }
}

/**
 * Data class to store information about a custom annotation like @AppStoreScreenshotPreviews
 */
data class CustomPreviewAnnotation(
  var hasPreviewAnnotation: Boolean = false,
  var hasPreviewArray: Boolean = false,
  var isAppStoreSnapshot: Boolean = false,
  var name: String? = null,
  var group: String? = null,
  var showBackground: Boolean? = null,
  var backgroundColor: Long? = null,
  var widthDp: Int? = null,
  var heightDp: Int? = null,
  var showSystemUi: Boolean? = null,
  var device: String? = null,
  var fontScale: Float? = null,
  var locale: String? = null,
  var uiMode: Int? = null,
  var apiLevel: Int? = null,
  var wallpaper: Int? = null,
  val previewConfigs: MutableList<PreviewConfig> = mutableListOf()
)

/**
 * Data class to store preview configuration parameters for each @Preview in an array
 */
data class PreviewConfig(
  var name: String? = null,
  var group: String? = null,
  var showBackground: Boolean? = null,
  var backgroundColor: Long? = null,
  var widthDp: Int? = null,
  var heightDp: Int? = null,
  var showSystemUi: Boolean? = null,
  var device: String? = null,
  var fontScale: Float? = null,
  var locale: String? = null,
  var uiMode: Int? = null,
  var apiLevel: Int? = null,
  var wallpaper: Int? = null
) {
  /**
   * Capture a preview parameter from an annotation
   */
  @Suppress("detekt.CyclomaticComplexMethod")
  fun captureParameter(name: String?, value: Any?) {
    when (name) {
      "name" -> if (value is String) this.name = value
      "group" -> if (value is String) this.group = value
      "showBackground" -> if (value is Boolean) this.showBackground = value
      "backgroundColor" -> if (value is Int) this.backgroundColor = value.toLong()
      "widthDp" -> if (value is Int) this.widthDp = value
      "heightDp" -> if (value is Int) this.heightDp = value
      "showSystemUi" -> if (value is Boolean) this.showSystemUi = value
      "device" -> if (value is String) this.device = value
      "fontScale" -> if (value is Float) this.fontScale = value
      "locale" -> if (value is String) this.locale = value
      "uiMode" -> if (value is Int) this.uiMode = value
      "apiLevel" -> if (value is Int) this.apiLevel = value
      "wallpaper" -> if (value is Int) this.wallpaper = value
    }
  }
}
