package com.emergetools.android.gradle.tasks.snapshots.transform

import org.objectweb.asm.AnnotationVisitor
import org.objectweb.asm.ClassVisitor

/**
 * First pass visitor that identifies custom annotations (like @AppStoreScreenshotPreviews) that are
 * themselves annotated with @Preview or @EmergeAppStoreSnapshot.
 */
class FindCustomPreviewClassVisitor(
  api: Int,
  // We need to store the custom annotation classes with their metadata
  private val customPreviewAnnotations: MutableMap<String, CustomPreviewAnnotation>
) : ClassVisitor(api) {

  // Boolean to track if the current class is an annotation
  private var isAnnotationClass = false

  // State for the current annotation being processed
  private var currentAnnotation = CustomPreviewAnnotation()
  private var currentClassName = ""

  companion object {
    // Java class signature for annotation types
    const val ANNOTATION_TYPE_SIGNATURE = "Ljava/lang/annotation/Retention;"
  }

  override fun visit(
    version: Int,
    access: Int,
    name: String,
    signature: String?,
    superName: String?,
    interfaces: Array<out String>?
  ) {
    super.visit(version, access, name, signature, superName, interfaces)

    // Reset state for this class
    isAnnotationClass = false
    currentAnnotation = CustomPreviewAnnotation()
    currentClassName = name

    // Check if this is an annotation class (has the annotation interfaces)
    if (interfaces != null && interfaces.contains("java/lang/annotation/Annotation")) {
      isAnnotationClass = true
    }
  }

  override fun visitAnnotation(descriptor: String?, visible: Boolean): AnnotationVisitor? {
    // Only process annotations if this is an annotation class itself
    if (!isAnnotationClass) {
      return super.visitAnnotation(descriptor, visible)
    }

    // Check for key annotations we care about
    when (descriptor) {
      ANNOTATION_TYPE_SIGNATURE -> {
        // Confirms this is definitely an annotation
        isAnnotationClass = true
      }

      PREVIEW_ANNOTATION_DESC -> {
        // This annotation has a @Preview directly on it
        currentAnnotation.hasPreviewAnnotation = true

        // Capture the preview parameters
        return object : AnnotationVisitor(api) {
          override fun visit(name: String?, value: Any?) {
            capturePreviewParameter(name, value)
            super.visit(name, value)
          }
        }
      }

      EMERGE_APP_STORE_SNAPSHOT -> {
        // This annotation has @EmergeAppStoreSnapshot
        currentAnnotation.isAppStoreSnapshot = true
      }
    }

    // Special handler for annotations that might contain arrays of @Preview
    return object : AnnotationVisitor(api, super.visitAnnotation(descriptor, visible)) {
      override fun visitArray(name: String?): AnnotationVisitor? {
        if (name == "value") {
          return object : AnnotationVisitor(api) {
            override fun visitAnnotation(name: String?, descriptor: String?): AnnotationVisitor? {
              if (descriptor == PREVIEW_ANNOTATION_DESC) {
                // This annotation contains an array of @Preview annotations
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
    if (isAnnotationClass && (currentAnnotation.hasPreviewAnnotation ||
                              currentAnnotation.hasPreviewArray ||
                              currentAnnotation.isAppStoreSnapshot)) {
      val descriptor = "L$currentClassName;"
      customPreviewAnnotations[descriptor] = currentAnnotation
    }
    super.visitEnd()
  }

  /**
   * Capture preview parameters from an annotation
   */
  private fun capturePreviewParameter(name: String?, value: Any?) {
    when (name) {
      "name" -> if (value is String) currentAnnotation.name = value
      "group" -> if (value is String) currentAnnotation.group = value
      "showBackground" -> if (value is Boolean) currentAnnotation.showBackground = value
      "backgroundColor" -> if (value is Int) currentAnnotation.backgroundColor = value.toLong()
      "widthDp" -> if (value is Int) currentAnnotation.widthDp = value
      "heightDp" -> if (value is Int) currentAnnotation.heightDp = value
      "showSystemUi" -> if (value is Boolean) currentAnnotation.showSystemUi = value
      "device" -> if (value is String) currentAnnotation.device = value
      "fontScale" -> if (value is Float) currentAnnotation.fontScale = value
      "locale" -> if (value is String) currentAnnotation.locale = value
      "uiMode" -> if (value is Int) currentAnnotation.uiMode = value
      "apiLevel" -> if (value is Int) currentAnnotation.apiLevel = value
      "wallpaper" -> if (value is Int) currentAnnotation.wallpaper = value
    }
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
