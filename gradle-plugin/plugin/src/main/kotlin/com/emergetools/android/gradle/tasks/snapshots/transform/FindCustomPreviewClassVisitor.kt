package com.emergetools.android.gradle.tasks.snapshots.transform

import org.objectweb.asm.AnnotationVisitor
import org.objectweb.asm.ClassVisitor
import org.objectweb.asm.Opcodes

/**
 * First pass visitor that identifies custom annotations (like @AppStoreScreenshotPreviews) that are
 * themselves annotated with @Preview, @EmergeAppStoreSnapshot or @EmergeSnapshotConfig.
 */
class FindCustomPreviewClassVisitor(
  private val customPreviewAnnotations: MutableMap<String, CustomPreviewAnnotation>
) : ClassVisitor(Opcodes.ASM9) {

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
    if (descriptor == EMERGE_APP_STORE_SNAPSHOT || descriptor == EMERGE_RUNTIME_APP_STORE_SNAPSHOT) {
      currentAnnotation.isAppStoreSnapshot = true
    } else if (descriptor == EMERGE_SNAPSHOT_CONFIG || descriptor == EMERGE_RUNTIME_SNAPSHOT_CONFIG) {
      return object : AnnotationVisitor(Opcodes.ASM9) {
        override fun visit(name: String?, value: Any?) {
          if (name == "precision") {
            currentAnnotation.precision = value as? Float ?: 1.0f
          } else if (name == "ignore") {
            currentAnnotation.ignored = value as? Boolean ?: false
          }
          return super.visit(name, value)
        }
      }
    } else if (descriptor == PREVIEW_ANNOTATION_DESC) {
      val newConfig = PreviewConfig()
      currentAnnotation.previewConfigs.add(newConfig)
      return PreviewAnnotationVisitor(newConfig)
    } else if (customPreviewAnnotations.containsKey(descriptor)) {
      // If this annotation references another custom annotation we've already found,
      // copy all its properties to the current annotation
      val sourceAnnotation = customPreviewAnnotations[descriptor]!!

      if (sourceAnnotation.isAppStoreSnapshot) {
        currentAnnotation.isAppStoreSnapshot = true
      }

      // Copy all the preview configs
      currentAnnotation.previewConfigs.addAll(sourceAnnotation.previewConfigs)
    }
    val previewConfigs = previewConfigForAnnotation(descriptor)
    if (previewConfigs != null) {
      currentAnnotation.previewConfigs.addAll(previewConfigs)
    }

    return object : AnnotationVisitor(api, super.visitAnnotation(descriptor, visible)) {
      override fun visitArray(name: String?): AnnotationVisitor? {
        if (name == "value") {
          return object : AnnotationVisitor(api) {
            override fun visitAnnotation(name: String?, descriptor: String?): AnnotationVisitor? {
              if (descriptor == PREVIEW_ANNOTATION_DESC) {
                val previewConfig = PreviewConfig()
                currentAnnotation.previewConfigs.add(previewConfig)
                return PreviewAnnotationVisitor(previewConfig)
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
    val descriptor = "L$currentClassName;"
    customPreviewAnnotations[descriptor] = currentAnnotation
    super.visitEnd()
  }
}

/**
 * Data class to store information about a custom annotation like @AppStoreScreenshotPreviews
 */
data class CustomPreviewAnnotation(
  var isAppStoreSnapshot: Boolean = false,
  var ignored: Boolean = false,
  var precision: Float = 1.0f,
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
)
