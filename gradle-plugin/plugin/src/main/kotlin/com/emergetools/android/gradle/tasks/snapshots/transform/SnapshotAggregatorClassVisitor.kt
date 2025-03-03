package com.emergetools.android.gradle.tasks.snapshots.transform

import org.objectweb.asm.AnnotationVisitor
import org.objectweb.asm.ClassVisitor
import org.objectweb.asm.MethodVisitor

class SnapshotAggregatorClassVisitor(
  api: Int,
  val fileName: String,
  val className: String,
  val methodNames: MutableList<ComposePreviewSnapshotConfig>
) : ClassVisitor(api) {
  companion object {
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

    val ANNOTATIONS_TO_TRANSFORM =
      arrayOf(
        PREVIEW_ANNOTATION_DESC,
        PREVIEW_CONTAINER_ANNOTATION_DESC,
        PREVIEW_LIGHT_DARK_ANNOTATION_DESC,
        PREVIEW_FONT_SCALE_ANNOTATION_DESC,
        PREVIEW_SCREEN_SIZES_ANNOTATION_DESC,
        PREVIEW_DYNAMIC_COLORS_ANNOTATION_DESC,
        EMERGE_APP_STORE_SNAPSHOT,
        EMERGE_IGNORE_SNAPSHOT,
      )

    const val TOUCHSCREEN_UNDEFINED: Int = 0
    const val UI_MODE_NIGHT_MASK: Int = 48
    const val UI_MODE_NIGHT_NO: Int = 16
    const val UI_MODE_NIGHT_UNDEFINED: Int = 0
    const val UI_MODE_NIGHT_YES: Int = 32
    const val UI_MODE_TYPE_APPLIANCE: Int = 5
    const val UI_MODE_TYPE_CAR: Int = 3
    const val UI_MODE_TYPE_DESK: Int = 2
    const val UI_MODE_TYPE_MASK: Int = 15
    const val UI_MODE_TYPE_NORMAL: Int = 1
    const val UI_MODE_TYPE_TELEVISION: Int = 4
    const val UI_MODE_TYPE_UNDEFINED: Int = 0
    const val UI_MODE_TYPE_VR_HEADSET: Int = 7
    const val UI_MODE_TYPE_WATCH: Int = 6

    const val PHONE = "spec:id=reference_phone,shape=Normal,width=411,height=891,unit=dp,dpi=420"
    const val FOLDABLE =
      "spec:id=reference_foldable,shape=Normal,width=673,height=841,unit=dp,dpi=420"
    const val TABLET = "spec:id=reference_tablet,shape=Normal,width=1280,height=800,unit=dp,dpi=240"
    const val DESKTOP =
      "spec:id=reference_desktop,shape=Normal,width=1920,height=1080,unit=dp,dpi=160"
  }

  override fun visitMethod(
    access: Int,
    name: String,
    descriptor: String,
    signature: String?,
    exceptions: Array<String>?,
  ): MethodVisitor {
    return MyMethodVisitor(api, name, fileName, className, methodNames)
  }

  // Visitor to capture the Preview annotation parameters.
  class PreviewAnnotationVisitor(api: Int, val previewData: ComposePreviewSnapshotConfig) : AnnotationVisitor(api) {
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

  // Method visitor that checks for our target annotations.
  class MyMethodVisitor(
    api: Int,
    private val methodName: String,
    private val className: String,
    private val fileName: String,
    private val composeSnapshots: MutableList<ComposePreviewSnapshotConfig>
  ) : MethodVisitor(api) {
    fun createComposePreviewConfigs(forAnnotation: String) : List<ComposePreviewSnapshotConfig>{
      val composeConfig = ComposePreviewSnapshotConfig(
        originalFqn = className.cleanName().removeClassName() + "." + methodName,
        sourceFileName =fileName.cleanName().substringAfterLast('.'),
        fullyQualifiedClassName = className.cleanName(),
      )

      when(forAnnotation){
        PREVIEW_ANNOTATION_DESC -> {
          return listOf(composeConfig);
        }
        PREVIEW_LIGHT_DARK_ANNOTATION_DESC -> {
          val light = composeConfig.copy(name = "light")
          val dark = composeConfig.copy(name = "dark", uiMode = UI_MODE_NIGHT_YES or UI_MODE_TYPE_NORMAL)
          return listOf(light, dark)
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
          println("we found a container")
//          TODO("We are not yet properly handling preview containers")
          return emptyList()
        }
        else -> {
          return emptyList()
        }
      }
    }

    override fun visitAnnotation(descriptor: String?, visible: Boolean): AnnotationVisitor? {
      return when (descriptor) {
        // Check for direct Preview annotation.
        PREVIEW_ANNOTATION_DESC -> {
          val previewConfig = createComposePreviewConfigs(PREVIEW_ANNOTATION_DESC).first()
          composeSnapshots.add(previewConfig)
          return PreviewAnnotationVisitor(api, previewConfig)
        }
        // Check for PreviewLightDark.
        PREVIEW_LIGHT_DARK_ANNOTATION_DESC -> {
          val snapshotConfig = createComposePreviewConfigs(PREVIEW_LIGHT_DARK_ANNOTATION_DESC)
          composeSnapshots.addAll(snapshotConfig)
          return super.visitAnnotation(descriptor, visible)
        }
        // Check for PreviewFontScale.
        PREVIEW_FONT_SCALE_ANNOTATION_DESC -> {
          val snapshotConfig = createComposePreviewConfigs(PREVIEW_FONT_SCALE_ANNOTATION_DESC)
          composeSnapshots.addAll(snapshotConfig)
          return super.visitAnnotation(descriptor, visible)
        }
        // Check for container annotation (inner class – note the escaped $).
        PREVIEW_CONTAINER_ANNOTATION_DESC -> {
          // This visitor handles the container's inner array of Preview annotations.
          return object : AnnotationVisitor(api) {
            override fun visitArray(name: String?): AnnotationVisitor? {
              println("calling visit array")
              if (name == "value") {
                // Visit each element in the array.
                return object : AnnotationVisitor(api) {
                  override fun visitAnnotation(name: String?, descriptor: String?): AnnotationVisitor? {
                    if (descriptor == "Landroidx/compose/ui/tooling/preview/Preview;") {
                      val config = createComposePreviewConfigs(PREVIEW_CONTAINER_ANNOTATION_DESC)
//                      val innerVisitor = PreviewAnnotationVisitor(api, config)
//                      return object : AnnotationVisitor(api, innerVisitor) {
//                        override fun visitEnd() {
//                          super.visitEnd()
//                          composeSnapshots.add(innerVisitor.previewData)
//                        }
//                      }
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
          println("found something else: $descriptor")

          return object : AnnotationVisitor(api) {
            override fun visitAnnotation(name: String?, descriptor: String?): AnnotationVisitor {

              println("visiting annotations inside $descriptor")
              return super.visitAnnotation(name, descriptor)
            }

            override fun visit(name: String?, value: Any?) {
              println("visiting thing $name, $value")
              super.visit(name, value)
            }
            override fun visitArray(name: String?): AnnotationVisitor? {
              println("visit array")
              if (name == "value") {
                return object : AnnotationVisitor(api) {
                  override fun visitAnnotation(
                    name: String?,
                    descriptor: String?
                  ): AnnotationVisitor? {
                    println("descriptor = $descriptor")
                    if (descriptor == "Landroidx/compose/ui/tooling/preview/Preview;") {
//                      val config = createComposePreviewConfigs()
//                      val innerVisitor = PreviewAnnotationVisitor(api, config)
//                      return object : AnnotationVisitor(api, innerVisitor) {
//                        override fun visitEnd() {
//                          super.visitEnd()
//                          composeSnapshots.add(innerVisitor.previewData)
//                        }
//                      }
                    }
                    return super.visitAnnotation(name, descriptor)
                  }
                }
              }
              return super.visitAnnotation(name, descriptor)
            }
          }
          return super.visitAnnotation(descriptor, visible)
        }
      }
    }
  }

  override fun visitAnnotation(
    desc: String,
    visible: Boolean,
  ): AnnotationVisitor? {
    // TODO we need to scan for custom annotations and keep track of them here
    return super.visitAnnotation(desc, visible)
  }
}
