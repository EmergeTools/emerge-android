package com.emergetools.android.gradle.tasks.snapshots.transform

import org.objectweb.asm.AnnotationVisitor
import org.objectweb.asm.MethodVisitor

/**
 * This class finds methods annotated with `@Preview` and variants of it and adds them to the passed in list.
 */
class AnnotatedMethodVisitor(
  api: Int,
  private val methodName: String,
  private val className: String,
  private val fileName: String,
  private val fullPreviewConfigList: MutableList<ComposePreviewSnapshotConfig>
) : MethodVisitor(api) {

  private val methodNamesToAdd = mutableListOf<ComposePreviewSnapshotConfig>()
  private var foundIgnoreAnnotation = false

  private fun createComposePreviewConfigs(forAnnotation: String) : List<ComposePreviewSnapshotConfig>{
    val composeConfig = ComposePreviewSnapshotConfig(
      originalFqn = className.cleanName().removeClassName() + "." + methodName,
      sourceFileName = fileName.cleanName().cleanFileName(),
      fullyQualifiedClassName = className.cleanName(),
    )

    when(forAnnotation){
      PREVIEW_ANNOTATION_DESC -> {
        return listOf(composeConfig);
      }
      PREVIEW_LIGHT_DARK_ANNOTATION_DESC -> {
        return listOf(
          composeConfig.copy(name = "light"),
          composeConfig.copy(name = "dark", uiMode = UI_MODE_NIGHT_YES or UI_MODE_TYPE_NORMAL)
        )
      }
      PREVIEW_SCREEN_SIZES_ANNOTATION_DESC -> {
        return listOf(
          composeConfig.copy(name = "Phone", device = PHONE, showSystemUi = true),
          composeConfig.copy(name = "Phone - Landscape",
            device = "spec:width = 411dp, height = 891dp, orientation = landscape, dpi = 420",
            showSystemUi = true),
          composeConfig.copy(name = "Unfolded Foldable", device = FOLDABLE, showSystemUi = true),
          composeConfig.copy(name = "Tablet", device = TABLET, showSystemUi = true),
          composeConfig.copy(name = "Desktop", device = DESKTOP, showSystemUi = true)
        )
      }
      PREVIEW_FONT_SCALE_ANNOTATION_DESC -> {
          return listOf(
            composeConfig.copy(name = "85%", fontScale = 0.85f),
            composeConfig.copy(name = "100%", fontScale = 1.0f),
            composeConfig.copy(name = "115%", fontScale = 1.15f),
            composeConfig.copy(name = "130%", fontScale = 1.3f),
            composeConfig.copy(name = "150%", fontScale = 1.5f),
            composeConfig.copy(name = "180%", fontScale = 1.8f),
            composeConfig.copy(name = "200%", fontScale = 2f)
          )
      }
      EMERGE_APP_STORE_SNAPSHOT -> {
        return listOf(composeConfig.copy(isAppStoreSnapshot = true))
      }
      EMERGE_IGNORE_SNAPSHOT -> {
        return emptyList()
      }
      PREVIEW_CONTAINER_ANNOTATION_DESC -> {
        throw IllegalArgumentException("Preview container annotation should be handled as individual annotations")
      }
      else -> {
        return emptyList()
      }
    }
  }

  override fun visitAnnotation(descriptor: String?, visible: Boolean): AnnotationVisitor? {
    return when (descriptor) {
      PREVIEW_ANNOTATION_DESC -> {
        val previewConfig = createComposePreviewConfigs(PREVIEW_ANNOTATION_DESC).first()
        methodNamesToAdd.add(previewConfig)
        return PreviewAnnotationVisitor(api, previewConfig)
      }
      PREVIEW_LIGHT_DARK_ANNOTATION_DESC -> {
        val snapshotConfig = createComposePreviewConfigs(PREVIEW_LIGHT_DARK_ANNOTATION_DESC)
        methodNamesToAdd.addAll(snapshotConfig)
        return super.visitAnnotation(descriptor, visible)
      }
      PREVIEW_FONT_SCALE_ANNOTATION_DESC -> {
        val snapshotConfig = createComposePreviewConfigs(PREVIEW_FONT_SCALE_ANNOTATION_DESC)
        methodNamesToAdd.addAll(snapshotConfig)
        return super.visitAnnotation(descriptor, visible)
      }
      PREVIEW_CONTAINER_ANNOTATION_DESC -> {
        return object : AnnotationVisitor(api) {
          override fun visitArray(name: String?): AnnotationVisitor? {
            if (name == "value") {
              return object : AnnotationVisitor(api) {
                override fun visitAnnotation(name: String?, descriptor: String?): AnnotationVisitor? {
                  if (descriptor == PREVIEW_ANNOTATION_DESC) {
                    val config = createComposePreviewConfigs(descriptor).first()
                    methodNamesToAdd.add(config)
                    return PreviewAnnotationVisitor(api, config)
                  }
                  return super.visitAnnotation(name, descriptor)
                }
              }
            }
            return super.visitArray(name)
          }
        }
      }
      else -> {
        // This is just another annotation or it could be a custom annotation that includes a preview.
        return super.visitAnnotation(descriptor, visible)
      }
    }
  }

  override fun visitEnd() {
    // We only add the method names in the end in case we find the ignore annotation and then we ignore what we found.
    if (!foundIgnoreAnnotation) {
      fullPreviewConfigList.addAll(methodNamesToAdd)
    }
    super.visitEnd()
  }
}
