package com.emergetools.snapshots.processor.utils

import com.emergetools.snapshots.processor.preview.ComposePreviewUtils.getUniqueSnapshotConfigsFromMultiPreviewAnnotation
import com.emergetools.snapshots.processor.preview.ComposePreviewUtils.getUniqueSnapshotConfigsFromPreviewAnnotations
import com.emergetools.snapshots.shared.ComposePreviewSnapshotConfig
import com.google.devtools.ksp.processing.KSPLogger
import com.google.devtools.ksp.processing.Resolver
import com.google.devtools.ksp.symbol.KSAnnotated
import com.google.devtools.ksp.symbol.KSAnnotation
import com.google.devtools.ksp.symbol.KSClassDeclaration
import com.google.devtools.ksp.symbol.KSFunctionDeclaration

const val COMPOSE_PREVIEW_ANNOTATION_NAME =
  "androidx.compose.ui.tooling.preview.Preview"

fun List<KSAnnotated>.functionsWithPreviewAnnotation(): Map<KSFunctionDeclaration, List<ComposePreviewSnapshotConfig>> {
  return filterIsInstance<KSFunctionDeclaration>()
    .associateWith { getUniqueSnapshotConfigsFromPreviewAnnotations(it) }
}

fun List<KSAnnotated>.functionsWithMultiPreviewAnnotations(
  resolver: Resolver,
  logger: KSPLogger,
): Map<KSFunctionDeclaration, List<ComposePreviewSnapshotConfig>> {
  val uniqueSnapshotConfigs = filterIsInstance<KSFunctionDeclaration>()
    .map { function ->
      val allPreviewAnnotations = function.annotations.flatMap {
        resolver.findAllDirectOrTransitivePreviewAnnotations(
          annotation = it,
          logger = logger,
        )
      }.toList()
      function to getUniqueSnapshotConfigsFromMultiPreviewAnnotation(
        annotations = allPreviewAnnotations,
        previewFunction = function,
      )
    }

  // The same function declaration can show up multiple times, so ensure the values are merged together
  val mergedConfigs = mutableMapOf<KSFunctionDeclaration, List<ComposePreviewSnapshotConfig>>()
  uniqueSnapshotConfigs.forEach {
    logger.info(
      "Found multipreview function: ${it.first.simpleName.asString()} with configs: ${it.second.joinToString()}"
    )
    mergedConfigs.putOrAppend(it.first, it.second)
  }

  return mergedConfigs
}

fun Resolver.getSymbolsWithMultiPreviewAnnotations(logger: KSPLogger): List<KSAnnotated> {
  return getMultiPreviewAnnotations(logger)
    .mapNotNull { annotation ->
      val annotationQN = annotation.annotationType.resolve().declaration.qualifiedName
      annotationQN?.let { getSymbolsWithAnnotation(it.asString()) }
    }
    .flatMap { it }
}

fun Resolver.getMultiPreviewAnnotations(logger: KSPLogger): List<KSAnnotation> {
  return getAllFiles()
    .flatMap { it.declarations }
    .flatMap { it.annotations }
    .toSet()
    .filter {
      val annotationQN = it.annotationType.resolve().declaration.qualifiedName
      val annotationClassDecl = annotationQN?.let { qualifiedName ->
        getClassDeclarationByName(qualifiedName)
      }
      annotationClassDecl?.let { classDecl ->
        val hasPreviewAnnotation = hasDirectOrTransitivePreviewAnnotation(classDecl)
        logger.info(
          "Checking annotation for preview annotation: ${classDecl.qualifiedName?.asString()}, $hasPreviewAnnotation"
        )
        hasPreviewAnnotation
      } ?: false
    }
    .toList()
    .sortedBy { it.shortName.asString() }
}

fun Resolver.hasDirectOrTransitivePreviewAnnotation(
  declaration: KSAnnotated,
  seenAnnotations: MutableSet<KSAnnotated> = mutableSetOf(),
): Boolean {
  if (declaration in seenAnnotations) {
    return false
  }

  val hasPreviewAnnotation = declaration.annotations.any {
    it.annotationType.resolve().declaration.qualifiedName?.asString() ==
      COMPOSE_PREVIEW_ANNOTATION_NAME
  }
  if (hasPreviewAnnotation) {
    return true
  }

  seenAnnotations.add(declaration)

  return declaration.annotations.any { annotation ->
    val annotationQualifiedName = annotation.annotationType.resolve().declaration.qualifiedName
    val classDeclaration = annotationQualifiedName?.let { getClassDeclarationByName(it) }
    classDeclaration?.let {
      hasDirectOrTransitivePreviewAnnotation(classDeclaration, seenAnnotations)
    } ?: false
  }
}

fun Resolver.findAllDirectOrTransitivePreviewAnnotations(
  annotation: KSAnnotation,
  seenAnnotations: MutableSet<KSClassDeclaration> = mutableSetOf(),
  logger: KSPLogger,
): List<KSAnnotation> {
  val classDeclaration = annotation.annotationType.resolve().declaration.qualifiedName?.let {
    getClassDeclarationByName(it)
  }
  val isPreviewAnnotation =
    classDeclaration?.qualifiedName?.asString() == COMPOSE_PREVIEW_ANNOTATION_NAME

  // Annotations can recursively reference each other so be sure to have a base recursion case
  // @Preview itself can't have a recursive relation so we can exclude them from our check
  if (classDeclaration == null || (classDeclaration in seenAnnotations && !isPreviewAnnotation)) {
    return emptyList()
  }

  logger.info(
    "Found preview or multipreview annotation: ${classDeclaration.qualifiedName?.asString()}"
  )
  seenAnnotations.add(classDeclaration)

  val currentPreviewAnnotations =
    if (classDeclaration.qualifiedName?.asString() == COMPOSE_PREVIEW_ANNOTATION_NAME) {
      listOf(annotation)
    } else {
      emptyList()
    }

  val nestedPreviewAnnotations = classDeclaration.annotations.flatMap {
    findAllDirectOrTransitivePreviewAnnotations(it, seenAnnotations, logger)
  }

  return currentPreviewAnnotations + nestedPreviewAnnotations
}
