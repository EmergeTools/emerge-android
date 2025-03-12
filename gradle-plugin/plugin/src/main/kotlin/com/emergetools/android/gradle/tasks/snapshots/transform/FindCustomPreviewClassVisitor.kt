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
    } else if (descriptor == PREVIEW_ANNOTATION_DESC) {
      currentAnnotation.hasPreviewAnnotation = true

      // Capture preview parameters
      return object : AnnotationVisitor(api) {
        override fun visit(name: String?, value: Any?) {
          capturePreviewParameter(currentAnnotation, name, value)
          super.visit(name, value)
        }
      }
    } else if (descriptor == PREVIEW_LIGHT_DARK_ANNOTATION_DESC) {
      // Handle PreviewLightDark annotation - add two configs
      currentAnnotation.hasPreviewArray = true

      // Light mode configuration
      val lightConfig = PreviewConfig()
      lightConfig.name = "light"
      currentAnnotation.previewConfigs.add(lightConfig)

      // Dark mode configuration
      val darkConfig = PreviewConfig()
      darkConfig.name = "dark"
      darkConfig.uiMode = UI_MODE_NIGHT_YES or UI_MODE_TYPE_NORMAL
      currentAnnotation.previewConfigs.add(darkConfig)
    } else if (descriptor == PREVIEW_FONT_SCALE_ANNOTATION_DESC) {
      // Handle PreviewFontScale annotation - add multiple configs for different font scales
      currentAnnotation.hasPreviewArray = true

      // Add configuration for each font scale
      addFontScaleConfig("85%", 0.85f)
      addFontScaleConfig("100%", 1.0f)
      addFontScaleConfig("115%", 1.15f)
      addFontScaleConfig("130%", 1.3f)
      addFontScaleConfig("150%", 1.5f)
      addFontScaleConfig("180%", 1.8f)
      addFontScaleConfig("200%", 2f)
    } else if (descriptor == PREVIEW_SCREEN_SIZES_ANNOTATION_DESC) {
      // Handle PreviewScreenSizes annotation - add configs for different device sizes
      currentAnnotation.hasPreviewArray = true

      // Phone configuration
      addDeviceConfig("Phone", PHONE, true)

      // Phone Landscape configuration
      addDeviceConfig(
        "Phone - Landscape",
        "spec:width = 411dp, height = 891dp, orientation = landscape, dpi = 420",
        true
      )

      // Foldable configuration
      addDeviceConfig("Unfolded Foldable", FOLDABLE, true)

      // Tablet configuration
      addDeviceConfig("Tablet", TABLET, true)

      // Desktop configuration
      addDeviceConfig("Desktop", DESKTOP, true)
    } else if (customPreviewAnnotations.containsKey(descriptor)) {
      // If this annotation references another custom annotation we've already found,
      // copy all its properties to the current annotation
      val sourceAnnotation = customPreviewAnnotations[descriptor]!!

      if (sourceAnnotation.hasPreviewAnnotation) {
        currentAnnotation.hasPreviewAnnotation = true
      }

      if (sourceAnnotation.hasPreviewArray) {
        currentAnnotation.hasPreviewArray = true
      }

      if (sourceAnnotation.isAppStoreSnapshot) {
        currentAnnotation.isAppStoreSnapshot = true
      }

      // Copy all the preview configs
      currentAnnotation.previewConfigs.addAll(sourceAnnotation.previewConfigs)
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

  /**
   * Helper to add a font scale configuration
   */
  private fun addFontScaleConfig(name: String, fontScale: Float) {
    val config = PreviewConfig()
    config.name = name
    config.fontScale = fontScale
    currentAnnotation.previewConfigs.add(config)
  }

  /**
   * Helper to add a device configuration
   */
  private fun addDeviceConfig(name: String, device: String, showSystemUi: Boolean) {
    val config = PreviewConfig()
    config.name = name
    config.device = device
    config.showSystemUi = showSystemUi
    currentAnnotation.previewConfigs.add(config)
  }

  /**
   * Helper to capture preview parameters for a PreviewConfig or CustomPreviewAnnotation
   */
  private fun capturePreviewParameter(target: Any, name: String?, value: Any?) {
    when (target) {
      is CustomPreviewAnnotation -> {
        when (name) {
          "name" -> if (value is String) target.name = value
          "group" -> if (value is String) target.group = value
          "showBackground" -> if (value is Boolean) target.showBackground = value
          "backgroundColor" -> if (value is Int) target.backgroundColor = value.toLong()
          "widthDp" -> if (value is Int) target.widthDp = value
          "heightDp" -> if (value is Int) target.heightDp = value
          "showSystemUi" -> if (value is Boolean) target.showSystemUi = value
          "device" -> if (value is String) target.device = value
          "fontScale" -> if (value is Float) target.fontScale = value
          "locale" -> if (value is String) target.locale = value
          "uiMode" -> if (value is Int) target.uiMode = value
          "apiLevel" -> if (value is Int) target.apiLevel = value
          "wallpaper" -> if (value is Int) target.wallpaper = value
        }
      }
      is PreviewConfig -> {
        target.captureParameter(name, value)
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
      customPreviewAnnotations[descriptor] = currentAnnotation.copy() // Create a copy to avoid shared reference issues
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
