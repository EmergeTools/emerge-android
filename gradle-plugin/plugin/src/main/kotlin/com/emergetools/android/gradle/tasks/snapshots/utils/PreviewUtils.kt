package com.emergetools.android.gradle.tasks.snapshots.utils

import org.jf.dexlib2.AccessFlags
import org.jf.dexlib2.DexFileFactory
import org.jf.dexlib2.dexbacked.DexBackedClassDef
import org.jf.dexlib2.dexbacked.DexBackedMethod
import org.jf.dexlib2.dexbacked.value.DexBackedTypeEncodedValue
import org.jf.dexlib2.iface.Annotation
import org.jf.dexlib2.iface.DexFile
import org.jf.dexlib2.iface.value.AnnotationEncodedValue
import org.jf.dexlib2.iface.value.ArrayEncodedValue
import org.jf.dexlib2.iface.value.BooleanEncodedValue
import org.jf.dexlib2.iface.value.FloatEncodedValue
import org.jf.dexlib2.iface.value.IntEncodedValue
import org.jf.dexlib2.iface.value.LongEncodedValue
import org.jf.dexlib2.iface.value.StringEncodedValue
import org.slf4j.Logger
import java.io.File
import kotlin.math.log

object PreviewUtils {

  const val PREVIEW_ANNOTATION = "Landroidx/compose/ui/tooling/preview/Preview;"
  const val PREVIEW_CONTAINER_ANNOTATION =
    "Landroidx/compose/ui/tooling/preview/Preview\$Container;"
  const val IGNORE_SNAPSHOT_ANNOTATION =
    "Lcom/emergetools/snapshots/annotations/IgnoreEmergeSnapshot;"
  const val PREVIEW_PARAMETER_ANNOTATION = "Landroidx/compose/ui/tooling/preview/PreviewParameter;"

  const val COMPOSER_SIGNATURE = "Landroidx/compose/runtime/Composer;"

  val previewSignatures = listOf(PREVIEW_ANNOTATION, PREVIEW_CONTAINER_ANNOTATION)

  fun findPreviews(
    extractedApkDirectory: File,
    includePrivatePreviews: Boolean,
    previewFunctions: List<String>,
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

        if (!includePrivatePreviews && AccessFlags.PRIVATE.isSet(method.accessFlags)) {
          logger.info(
            "Ignoring snapshot for method: $methodKey as it is private and includePrivatePreviews is set to false"
          )
          return@forEach
        }

        if (method.annotations.any { it.type == IGNORE_SNAPSHOT_ANNOTATION }) {
          logger.info(
            "Ignoring snapshot for method: $methodKey as it has the @IgnoreEmergeSnapshot annotation"
          )
          return@forEach
        }

        if (!hasSupportedMethodParameters(method, logger)) {
          logger.info("Ignoring snapshot for method: $methodKey as params are not supported.")
          return@forEach
        }

        val configs = previewAnnotations.flatMap { previewAnnotation ->
          composePreviewSnapshotConfigsFromPreviewAnnotation(method, previewAnnotation, logger)
        }

        methodsWithConfigs[methodKey] = configs
      }
    }

    val methods = methodsWithConfigs.values.flatten().filter {
      logger.info("Found preview method: ${previewFunctions.contains(it.originalFqn)} $it matching functions ${previewFunctions.joinToString()}")
      previewFunctions.isEmpty() || previewFunctions.contains(it.originalFqn)
    }

    return ComposeSnapshots(
      snapshots = methods
    )
  }

  private fun classSignatureToFqn(signature: String): String {
    return signature.replace('/', '.').substring(1, signature.length - 1)
  }

  private fun hasSupportedMethodParameters(method: DexBackedMethod, logger: Logger): Boolean {
    // Only supporting 0-1 preview params
    val methodParamCount = method.parameters.size
    if (methodParamCount < 2 || methodParamCount > 3) {
      logger.info("Method ${method.name} has $methodParamCount parameters, expected 2 or 3")
      return false
    }

    // Check last 2 params are (Composer, int)
    val paramTypes = method.parameters.map { it.type }
    if (paramTypes.takeLast(2) != listOf(COMPOSER_SIGNATURE, "I")) {
      logger.info("Method ${method.name} has unsupported parameter types: $paramTypes")
      return false
    }

    if (methodParamCount == 3) {
      // Check first param annotated with @PreviewParameter
      val firstParam = method.parameters[0]
      val hasPreviewParameterAnnotation = firstParam.annotations.any { annotation ->
        annotation.type == PREVIEW_PARAMETER_ANNOTATION
      }

      if (!hasPreviewParameterAnnotation) {
        logger.info("Method ${method.name} has 3 parameters, but the first one is not annotated with @PreviewParameter")
        return false
      }

      logger.info("Method ${method.name} has 3 parameters, and the first one is annotated with @PreviewParameter!")
    }

    logger.info("Method ${method.name} has supported parameters!")
    return true
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
    logger: Logger,
  ): List<ComposePreviewSnapshotConfig> {
    val className = classSignatureToFqn(method.definingClass)
    val originalFqn = fqnForPreviewMethod(method)

    var previewParameter: PreviewParameter? = null
    if (method.parameters.size == 3) {
      val firstParam =  method.parameters[0]
      val paramName = firstParam.name ?: throw IllegalStateException("Preview parameter must have a name")

      val previewParamAnnotation = firstParam.annotations.first { it.type == PREVIEW_PARAMETER_ANNOTATION }
      val providerClassSignature = previewParamAnnotation.elements.first { it.name == "provider" }.value as DexBackedTypeEncodedValue
      val previewParamLimit = previewParamAnnotation.elements.firstOrNull { it.name == "limit" }?.value as? IntEncodedValue

      logger.info("Found @PreviewParameter annotation for method ${method.name}, parameter: $paramName, provider: ${providerClassSignature.value}, limit: ${previewParamLimit?.value}")
      previewParameter = PreviewParameter(
        parameterName = paramName,
        providerClassFqn = classSignatureToFqn(providerClassSignature.value),
        limit = previewParamLimit?.value,
      )
    }

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
          heightDp = (annotation.elements.firstOrNull { it.name == "heightDp" }?.value as? IntEncodedValue)?.value,
          widthDp = (annotation.elements.firstOrNull { it.name == "widthDp" }?.value as? IntEncodedValue)?.value,
          showBackground = (annotation.elements.firstOrNull { it.name == "showBackground" }?.value as? BooleanEncodedValue)?.value,
          backgroundColor = (annotation.elements.firstOrNull { it.name == "backgroundColor" }?.value as? LongEncodedValue)?.value,
          showSystemUi = (annotation.elements.firstOrNull { it.name == "showSystemUi" }?.value as? BooleanEncodedValue)?.value,
          device = (annotation.elements.firstOrNull { it.name == "device" }?.value as? StringEncodedValue)?.value,
          previewParameter = previewParameter,
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
            heightDp = (preview.elements.firstOrNull { it.name == "heightDp" }?.value as? IntEncodedValue)?.value,
            widthDp = (preview.elements.firstOrNull { it.name == "widthDp" }?.value as? IntEncodedValue)?.value,
            showBackground = (preview.elements.firstOrNull { it.name == "showBackground" }?.value as? BooleanEncodedValue)?.value,
            backgroundColor = (preview.elements.firstOrNull { it.name == "backgroundColor" }?.value as? LongEncodedValue)?.value,
            showSystemUi = (preview.elements.firstOrNull { it.name == "showSystemUi" }?.value as? BooleanEncodedValue)?.value,
            device = (preview.elements.firstOrNull { it.name == "device" }?.value as? StringEncodedValue)?.value,
            previewParameter = previewParameter,
          )
        }.orEmpty()
      }

      else -> emptyList()
    }
  }
}
