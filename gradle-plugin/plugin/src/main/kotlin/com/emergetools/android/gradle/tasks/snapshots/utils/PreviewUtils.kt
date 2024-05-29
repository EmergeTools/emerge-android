package com.emergetools.android.gradle.tasks.snapshots.utils

import org.jf.dexlib2.DexFileFactory
import org.jf.dexlib2.dexbacked.DexBackedClassDef
import org.jf.dexlib2.dexbacked.DexBackedMethod
import org.jf.dexlib2.iface.Annotation
import org.jf.dexlib2.iface.DexFile
import org.jf.dexlib2.iface.value.AnnotationEncodedValue
import org.jf.dexlib2.iface.value.ArrayEncodedValue
import org.jf.dexlib2.iface.value.FloatEncodedValue
import org.jf.dexlib2.iface.value.IntEncodedValue
import org.jf.dexlib2.iface.value.StringEncodedValue
import org.slf4j.Logger
import java.io.File

object PreviewUtils {

  const val PREVIEW_ANNOTATION = "Landroidx/compose/ui/tooling/preview/Preview;"
  const val PREVIEW_CONTAINER_ANNOTATION =
    "Landroidx/compose/ui/tooling/preview/Preview\$Container;"
  const val IGNORE_SNAPSHOT_ANNOTATION =
    "Lcom/emergetools/snapshots/annotations/IgnoreEmergeSnapshot;"

  const val COMPOSER_SIGNATURE = "Landroidx/compose/runtime/Composer;"

  val previewSignatures = listOf(PREVIEW_ANNOTATION, PREVIEW_CONTAINER_ANNOTATION)

  fun findPreviews(
    extractedApkDirectory: File,
    logger: Logger,
  ): ComposeSnapshots {

    val classSignatureMap = mutableMapOf<String, DexBackedClassDef>()
    extractedApkDirectory.listFiles { file -> file.extension == "dex" }?.forEach { dexFile ->
      val dexBackedDexFile: DexFile = DexFileFactory.loadDexFile(dexFile, null)
      dexBackedDexFile.classes.forEach { classDef ->
        // A quick performance optimization so we don't need to re-iterate through all classes later
        // when handling multipreviews
        classSignatureMap[classDef.type] = classDef as DexBackedClassDef
      }
    }

    val methodsWithConfigs = mutableMapOf<String, List<ComposePreviewSnapshotConfig>>()

    classSignatureMap.values.forEach { classDef ->
      classDef.methods.forEach { method ->
        val classFqn = classSignatureToFqn(method.definingClass)
        val methodKey = "$classFqn.${method.name}"

        val previewAnnotations = method.annotations.flatMap { annotation ->
          findAllDirectOrTransitivePreviewAnnotations(classSignatureMap, annotation)
        }

        if (previewAnnotations.isEmpty()) {
          return@forEach
        }

        if (method.annotations.any { it.type == IGNORE_SNAPSHOT_ANNOTATION }) {
          logger.info(
            "Ignoring snapshot for method: $methodKey as it has the @IgnoreEmergeSnapshot annotation"
          )
          return@forEach
        }

        if (method.parameters.size != 2 || method.parameters.map { it.type } != listOf(
            COMPOSER_SIGNATURE, "I"
          )) {
          logger.info(
            "Ignoring snapshot for method: $methodKey as it does not have a no-arg signature"
          )
          return@forEach
        }

        val configs = previewAnnotations.flatMap { previewAnnotation ->
          composePreviewSnapshotConfigsFromPreviewAnnotation(method, previewAnnotation)
        }

        methodsWithConfigs[methodKey] = configs
      }
    }

    return ComposeSnapshots(
      snapshots = methodsWithConfigs.values.flatten()
    )
  }

  private fun classSignatureToFqn(signature: String): String {
    return signature.replace('/', '.').substring(1, signature.length - 1)
  }

  /**
   * Strip Kt synthetic suffix from class name if it exists to ensure FQN matches the source package.
   */
  private fun fqnForPreviewMethod(method: DexBackedMethod): String {
    val classFqn = classSignatureToFqn(method.definingClass)
    val splits = classFqn.split('.')
    val className = splits.last()

    return if (className.endsWith("Kt")) {
      "${splits.dropLast(1).joinToString(".")}.${method.name}"
    } else {
      "$classFqn.${method.name}"
    }
  }

  private fun findAllDirectOrTransitivePreviewAnnotations(
    classSignatureMap: Map<String, DexBackedClassDef>,
    annotation: Annotation,
    seenAnnotations: MutableSet<String> = mutableSetOf(),
  ): List<Annotation> {
    val annotationClassDef = classSignatureMap[annotation.type]
    val isPreviewAnnotation = previewSignatures.contains(annotation.type)

    if (annotationClassDef == null || (seenAnnotations.contains(
        annotation.type
      ) && !isPreviewAnnotation)
    ) {
      return emptyList()
    }

    seenAnnotations.add(annotation.type)

    val currentPreviewAnnotations = if (previewSignatures.contains(annotationClassDef.type)) {
      listOf(annotation)
    } else {
      emptyList()
    }

    val nestedPreviewAnnotations = annotationClassDef.annotations.flatMap { nestedAnnotation ->
      findAllDirectOrTransitivePreviewAnnotations(
        classSignatureMap, nestedAnnotation, seenAnnotations
      )
    }

    return currentPreviewAnnotations + nestedPreviewAnnotations
  }

  private fun composePreviewSnapshotConfigsFromPreviewAnnotation(
    method: DexBackedMethod,
    annotation: Annotation,
  ): List<ComposePreviewSnapshotConfig> {
    val className = classSignatureToFqn(method.definingClass)
    val originalFqn = fqnForPreviewMethod(method)

    return when (annotation.type) {
      PREVIEW_ANNOTATION -> listOf(
        ComposePreviewSnapshotConfig(
          originalFqn = originalFqn,
          fullyQualifiedClassName = className,
          name = (annotation.elements.firstOrNull { it.name == "name" }?.value as? StringEncodedValue)?.value,
          group = (annotation.elements.firstOrNull { it.name == "group" }?.value as? StringEncodedValue)?.value,
          uiMode = (annotation.elements.firstOrNull { it.name == "uiMode" }?.value as? IntEncodedValue)?.value,
          locale = (annotation.elements.firstOrNull { it.name == "locale" }?.value as? StringEncodedValue)?.value,
          fontScale = (annotation.elements.firstOrNull { it.name == "fontScale" }?.value as? FloatEncodedValue)?.value,
        )
      )

      PREVIEW_CONTAINER_ANNOTATION -> {
        val arrayEncodedValue =
          annotation.elements.firstOrNull { it.name == "value" }?.value as? ArrayEncodedValue
        arrayEncodedValue?.value?.mapNotNull { it as? AnnotationEncodedValue }?.map { preview ->
          ComposePreviewSnapshotConfig(
            originalFqn = originalFqn,
            fullyQualifiedClassName = className,
            name = (preview.elements.firstOrNull { it.name == "name" }?.value as? StringEncodedValue)?.value,
            group = (preview.elements.firstOrNull { it.name == "group" }?.value as? StringEncodedValue)?.value,
            uiMode = (preview.elements.firstOrNull { it.name == "uiMode" }?.value as? IntEncodedValue)?.value,
            locale = (preview.elements.firstOrNull { it.name == "locale" }?.value as? StringEncodedValue)?.value,
            fontScale = (preview.elements.firstOrNull { it.name == "fontScale" }?.value as? FloatEncodedValue)?.value,
          )
        }.orEmpty()
      }

      else -> emptyList()
    }
  }
}
