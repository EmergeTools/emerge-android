package com.emergetools.android.gradle.tasks.snapshots.transform

import org.objectweb.asm.AnnotationVisitor
import org.objectweb.asm.Label
import org.objectweb.asm.MethodVisitor
import org.objectweb.asm.Type

/**
 * This class finds methods annotated with `@Preview` and variants of it and adds them to the passed in list.
 */
class AnnotatedMethodVisitor(
  api: Int,
  private val methodName: String,
  private val className: String,
  private val fileName: String,
  private val fullPreviewConfigList: MutableList<ComposePreviewSnapshotConfig>,
  private val customPreviewAnnotations: Map<String, CustomPreviewAnnotation> = emptyMap()
) : MethodVisitor(api) {

  private val methodNamesToAdd = mutableListOf<ComposePreviewSnapshotConfig>()
  private var foundIgnoreAnnotation = false

  // Parameter and preview parameter info
  private val parameterPreviewInfoMap = mutableMapOf<Int, PreviewParameterInfo>()
  private val parameterNames = mutableMapOf<Int, String>()

  // Temporarily store information about a parameter with @PreviewParameter annotation
  private data class PreviewParameterInfo(
    val providerClassFqn: String,
    val limit: Int? = null,
    val index: Int? = null
  )

  @Suppress("detekt.ReturnCount", "detekt.ThrowsCount")
  private fun createComposePreviewConfigs(forAnnotation: String): List<ComposePreviewSnapshotConfig> {
    val composeConfig = ComposePreviewSnapshotConfig(
      originalFqn = className.cleanName().removeClassName() + "." + methodName,
      sourceFileName = fileName.cleanName().cleanFileName(),
      fullyQualifiedClassName = className.cleanName(),
    )

    when (forAnnotation) {
      PREVIEW_ANNOTATION_DESC -> {
        return listOf(composeConfig)
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
          composeConfig.copy(
            name = "Phone - Landscape",
            device = "spec:width = 411dp, height = 891dp, orientation = landscape, dpi = 420",
            showSystemUi = true
          ),
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
        throw IllegalArgumentException("Emerge app store snapshot should should be handled elsewhere")
      }

      EMERGE_IGNORE_SNAPSHOT -> {
        throw IllegalArgumentException("Emerge ignore snapshot should should be handled elsewhere")
      }

      PREVIEW_CONTAINER_ANNOTATION_DESC -> {
        throw IllegalArgumentException("Preview container annotation should be handled as individual annotations")
      }

      else -> {
        // Check if this is a custom preview annotations
        val customAnnotation = customPreviewAnnotations[forAnnotation]
        if (customAnnotation != null) {
          // Create configs based on the custom annotation
          return createConfigsFromCustomAnnotation(composeConfig, customAnnotation)
        }
        return emptyList()
      }
    }
  }

  /**
   * Creates ComposePreviewSnapshotConfig objects from a custom annotation
   */
  private fun createConfigsFromCustomAnnotation(
    baseConfig: ComposePreviewSnapshotConfig,
    customAnnotation: CustomPreviewAnnotation
  ): List<ComposePreviewSnapshotConfig> {
    val configs = mutableListOf<ComposePreviewSnapshotConfig>()

    if (customAnnotation.hasPreviewArray && customAnnotation.previewConfigs.isNotEmpty()) {
      // Create a config for each @Preview in the array
      for ((index, previewConfig) in customAnnotation.previewConfigs.withIndex()) {
        val name = previewConfig.name ?: "preview-${index + 1}"

        configs.add(
          baseConfig.copy(
            name = name,
            group = previewConfig.group,
            showBackground = previewConfig.showBackground,
            backgroundColor = previewConfig.backgroundColor,
            widthDp = previewConfig.widthDp,
            heightDp = previewConfig.heightDp,
            showSystemUi = previewConfig.showSystemUi,
            device = previewConfig.device,
            fontScale = previewConfig.fontScale,
            locale = previewConfig.locale,
            uiMode = previewConfig.uiMode,
            apiLevel = previewConfig.apiLevel,
            wallpaper = previewConfig.wallpaper,
            isAppStoreSnapshot = customAnnotation.isAppStoreSnapshot
          )
        )
      }
    } else if (customAnnotation.hasPreviewAnnotation) {
      // Create a single config for the direct @Preview
      configs.add(
        baseConfig.copy(
          name = customAnnotation.name,
          group = customAnnotation.group,
          showBackground = customAnnotation.showBackground,
          backgroundColor = customAnnotation.backgroundColor,
          widthDp = customAnnotation.widthDp,
          heightDp = customAnnotation.heightDp,
          showSystemUi = customAnnotation.showSystemUi,
          device = customAnnotation.device,
          fontScale = customAnnotation.fontScale,
          locale = customAnnotation.locale,
          uiMode = customAnnotation.uiMode,
          apiLevel = customAnnotation.apiLevel,
          wallpaper = customAnnotation.wallpaper,
          isAppStoreSnapshot = customAnnotation.isAppStoreSnapshot
        )
      )
    } else if (customAnnotation.isAppStoreSnapshot) {
      // Only has @EmergeAppStoreSnapshot
      configs.add(baseConfig.copy(isAppStoreSnapshot = true))
    }

    return configs
  }

  @Suppress("detekt.ReturnCount")
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

      EMERGE_APP_STORE_SNAPSHOT -> {
        val snapshotConfig = createComposePreviewConfigs(EMERGE_APP_STORE_SNAPSHOT)
        methodNamesToAdd.addAll(snapshotConfig)
        return super.visitAnnotation(descriptor, visible)
      }

      EMERGE_IGNORE_SNAPSHOT -> {
        foundIgnoreAnnotation = true
        return super.visitAnnotation(descriptor, visible)
      }

      PREVIEW_CONTAINER_ANNOTATION_DESC -> {
        return object : AnnotationVisitor(api) {
          override fun visitArray(name: String?): AnnotationVisitor? {
            if (name == "value") {
              return object : AnnotationVisitor(api) {
                override fun visitAnnotation(
                  name: String?,
                  descriptor: String?
                ): AnnotationVisitor? {
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
        // Check if this is a custom preview annotation we discovered in the first pass
        // Handle null descriptor safely
        if (descriptor != null && customPreviewAnnotations.containsKey(descriptor)) {
          val configs = createComposePreviewConfigs(descriptor)
          methodNamesToAdd.addAll(configs)

          // If it's a custom annotation with arrays, we need to handle those
          return object : AnnotationVisitor(api) {
            override fun visitArray(name: String?): AnnotationVisitor? {
              // Handle any arrays in the annotation if needed
              return super.visitArray(name)
            }
          }
        }

        // This is just another annotation or it could be a custom annotation that includes a preview.
        return super.visitAnnotation(descriptor, visible)
      }
    }
  }

  override fun visitParameterAnnotation(
    parameter: Int,
    descriptor: String?,
    visible: Boolean
  ): AnnotationVisitor? {
    if (descriptor == PREVIEW_PARAMETER_ANNOTATION_DESC) {
      // Create a visitor to collect preview parameter information
      return object : AnnotationVisitor(api) {
        private var providerClassFqn: String? = null
        private var limit: Int? = null
        private var index: Int? = null

        override fun visit(name: String?, value: Any?) {
          when (name) {
            "limit" -> limit = value as? Int
            "index" -> index = value as? Int
            "provider" -> {
              // This handles the provider class which is the main parameter
              if (value is Type) {
                providerClassFqn = value.className
              }
            }
          }
          super.visit(name, value)
        }

        override fun visitEnd() {
          if (providerClassFqn != null) {
            parameterPreviewInfoMap[parameter] = PreviewParameterInfo(
              providerClassFqn = providerClassFqn!!,
              limit = limit,
              index = index
            )
          }
          super.visitEnd()
        }
      }
    }
    return super.visitParameterAnnotation(parameter, descriptor, visible)
  }

  /**
   * Capture local variable information, which includes parameter names
   * In debug builds, this information is available
   */
  override fun visitLocalVariable(
    name: String?,
    descriptor: String?,
    signature: String?,
    start: Label?,
    end: Label?,
    index: Int
  ) {
    if (name != null) {
      parameterNames[index] = name
    }

    super.visitLocalVariable(name, descriptor, signature, start, end, index)
  }

  override fun visitEnd() {
    // Apply any preview parameter information to the configs
    if (parameterPreviewInfoMap.isNotEmpty()) {
      applyPreviewParameterInfo()
    }

    // We only add the method names in the end in case we find the ignore annotation and then we ignore what we found.
    if (!foundIgnoreAnnotation) {
      fullPreviewConfigList.addAll(methodNamesToAdd)
    }
    super.visitEnd()
  }

  /**
   * Apply the preview parameter information to all method configs.
   */
  private fun applyPreviewParameterInfo() {
    // We only handle the first preview parameter for simplicity.
    require(
      parameterPreviewInfoMap.entries.size == 1
    ) {
      "Only one @PreviewParameter annotation is supported per method, " +
        "found ${parameterPreviewInfoMap.entries.size}"
    }
    val (paramIndex, previewInfo) = parameterPreviewInfoMap.entries.first()

    val paramName = parameterNames[paramIndex]!!

    val previewParam = PreviewParameter(
      parameterName = paramName,
      providerClassFqn = previewInfo.providerClassFqn,
      limit = previewInfo.limit,
      index = previewInfo.index
    )

    val updatedConfigs = methodNamesToAdd.map { config ->
      config.copy(previewParameter = previewParam)
    }

    // Replace the old configs with the updated ones
    methodNamesToAdd.clear()
    methodNamesToAdd.addAll(updatedConfigs)
  }
}
