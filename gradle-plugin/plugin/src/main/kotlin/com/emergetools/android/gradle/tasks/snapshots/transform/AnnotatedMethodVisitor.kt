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

  private val methodNamesToAdd = mutableListOf<PreviewConfig>()
  private var foundIgnoreAnnotation = false
  private var foundPrecision: Float = 1.0f
  private var foundAppStoreSnapshot = false

  // Parameter and preview parameter info
  private val parameterPreviewInfoMap = mutableMapOf<Int, PreviewParameterInfo>()
  private val parameterNames = mutableMapOf<Int, String>()

  // Temporarily store information about a parameter with @PreviewParameter annotation
  private data class PreviewParameterInfo(
    val providerClassFqn: String,
    val limit: Int? = null,
    val index: Int? = null
  )

  private fun createComposePreviewConfigs(forAnnotation: String): List<PreviewConfig> {
    val previewConfigs = previewConfigForAnnotation(forAnnotation)
    if (previewConfigs != null) {
      return previewConfigs
    }
    require(forAnnotation != PREVIEW_ANNOTATION_DESC) { "$forAnnotation annotation should be handled in the visitor" }
    require(forAnnotation != EMERGE_APP_STORE_SNAPSHOT) { "$forAnnotation annotation should be handled in the visitor" }
    require(forAnnotation != EMERGE_IGNORE_SNAPSHOT) { "$forAnnotation annotation should be handled in the visitor" }
    require(forAnnotation != PREVIEW_ANNOTATION_DESC) { "$forAnnotation annotation should be handled in the visitor" }
    // Check if this is a custom preview annotations
    val customAnnotation = customPreviewAnnotations[forAnnotation]
    if (customAnnotation != null) {
      if (customAnnotation.isAppStoreSnapshot) {
        foundAppStoreSnapshot = true
      }
      return customAnnotation.previewConfigs
    }
    return emptyList()
  }

  @Suppress("detekt.ReturnCount")
  override fun visitAnnotation(descriptor: String?, visible: Boolean): AnnotationVisitor? {
    return when (descriptor) {
      PREVIEW_ANNOTATION_DESC -> {
        val previewConfig = PreviewConfig()
        methodNamesToAdd.add(previewConfig)
        return PreviewAnnotationVisitor(previewConfig)
      }

      EMERGE_APP_STORE_SNAPSHOT -> {
        foundAppStoreSnapshot = true
        return super.visitAnnotation(descriptor, visible)
      }

      EMERGE_IGNORE_SNAPSHOT -> {
        foundIgnoreAnnotation = true
        return super.visitAnnotation(descriptor, visible)
      }

      EMERGE_SNAPSHOT_CONFIG -> {
        return object : AnnotationVisitor(api) {
          override fun visit(name: String?, value: Any?) {
            if (name == "precision") {
              foundPrecision = value as? Float ?: 1.0f
            } else if (name == "ignore") {
              foundIgnoreAnnotation = value as? Boolean ?: false
            }
            return super.visit(name, value)
          }
        }
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
                    val config = PreviewConfig()
                    methodNamesToAdd.add(config)
                    return PreviewAnnotationVisitor(config)
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
        if (descriptor != null) {
          val previewConfig = createComposePreviewConfigs(descriptor)
          methodNamesToAdd.addAll(previewConfig)
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
    val previewConfigs =
      applyPreviewParameterInfo(methodNamesToAdd.toComposePreviewSnapshotConfig())

    // We only add the method names in the end in case we find the ignore annotation and then we ignore what we found.
    if (!foundIgnoreAnnotation) {
      fullPreviewConfigList.addAll(previewConfigs)
    }
    super.visitEnd()
  }

  private fun applyPreviewParameterInfo(composePreviews: List<ComposePreviewSnapshotConfig>):
    List<ComposePreviewSnapshotConfig> {
    if (parameterPreviewInfoMap.isEmpty()) {
      return composePreviews
    }
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

    val updatedConfigs = composePreviews.map { config ->
      config.copy(previewParameter = previewParam)
    }
    return updatedConfigs
  }

  private fun List<PreviewConfig>.toComposePreviewSnapshotConfig(): List<ComposePreviewSnapshotConfig> {
    return map { previewConfig ->
      ComposePreviewSnapshotConfig(
        fullyQualifiedClassName = className.cleanName(),
        originalFqn = className.cleanName().removeClassName() + "." + methodName,
        sourceFileName = fileName.cleanName().cleanFileName(),
        precision = foundPrecision.takeIf { it != 1.0f },
        name = previewConfig.name,
        group = previewConfig.group,
        uiMode = previewConfig.uiMode,
        locale = previewConfig.locale,
        fontScale = previewConfig.fontScale,
        heightDp = previewConfig.heightDp,
        widthDp = previewConfig.widthDp,
        showBackground = previewConfig.showBackground,
        backgroundColor = previewConfig.backgroundColor,
        showSystemUi = previewConfig.showSystemUi,
        device = previewConfig.device,
        apiLevel = previewConfig.apiLevel,
        wallpaper = previewConfig.wallpaper,
        isAppStoreSnapshot = foundAppStoreSnapshot
      )
    }
  }
}
