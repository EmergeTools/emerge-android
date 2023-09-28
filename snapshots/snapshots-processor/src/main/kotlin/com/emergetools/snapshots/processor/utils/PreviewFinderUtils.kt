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

fun List<KSAnnotated>.functionsWithMultiPreviewAnnotations(resolver: Resolver, logger: KSPLogger): Map<KSFunctionDeclaration, List<ComposePreviewSnapshotConfig>> {
  val uniqueSnapshotConfigs = filterIsInstance<KSFunctionDeclaration>()
    .map { function ->
      val allPreviewAnnotations = function.annotations.flatMap { resolver.findPreviewAnnotations(it) }.toList()
      logger.info("telkins function annotations ${allPreviewAnnotations}")
      function to getUniqueSnapshotConfigsFromMultiPreviewAnnotation(
        annotations = allPreviewAnnotations,
        previewFunction = function,
      )
    }

  // The same function declaration can show up multiple times, so ensure the values are merged together
  val mergedConfigs = mutableMapOf<KSFunctionDeclaration, List<ComposePreviewSnapshotConfig>>()
  uniqueSnapshotConfigs.forEach {
    mergedConfigs.putOrAppend(it.first, it.second)
  }

  return mergedConfigs
}

fun Resolver.getSymbolsWithMultiPreviewAnnotations(logger: KSPLogger): List<KSAnnotated> {
  return getMultiPreviewAnnotations(logger)
    .mapNotNull { annotation ->
      val annotationQN = annotation.annotationType.resolve().declaration.qualifiedName
      logger.info("telkins found multipreview annotation ${annotationQN?.asString()} ")
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
      val annotationClassDecl = annotationQN?.let { qualifiedName -> getClassDeclarationByName(qualifiedName) }
      annotationClassDecl?.let { classDecl -> hasDirectOrTransitivePreviewAnnotation(logger, classDecl) } ?: false
    }
    .toList()
    .sortedBy { it.shortName.asString() }
}

fun Resolver.hasDirectOrTransitivePreviewAnnotation(logger: KSPLogger, declaration: KSAnnotated, seenAnnotations: MutableSet<KSAnnotated> = mutableSetOf()): Boolean {
  if (declaration in seenAnnotations) {
    return false
  }

  if (declaration.annotations.any { it.annotationType.resolve().declaration.qualifiedName?.asString() == COMPOSE_PREVIEW_ANNOTATION_NAME }) {
    return true
  }

  seenAnnotations.add(declaration)

  return declaration.annotations.any { annotation ->
    val annotationQualifiedName = annotation.annotationType.resolve().declaration.qualifiedName
    val classDeclaration = annotationQualifiedName?.let { getClassDeclarationByName(it) }
    classDeclaration?.let { hasDirectOrTransitivePreviewAnnotation(logger, classDeclaration, seenAnnotations) } ?: false
  }
}

fun Resolver.findPreviewAnnotations2(annotation: KSAnnotation, seenAnnotations: MutableSet<KSClassDeclaration> = mutableSetOf()): List<KSAnnotation> {
  val classDeclaration = annotation.annotationType.resolve().declaration.qualifiedName?.let { getClassDeclarationByName(it) }
  if (classDeclaration == null) {
    return emptyList()
  }

  val hasDirectAnnotation = annotation
  return emptyList()
}

fun Resolver.findPreviewAnnotations(annotation: KSAnnotation, seenAnnotations: MutableSet<KSClassDeclaration> = mutableSetOf()): List<KSAnnotation> {
  val classDeclaration = annotation.annotationType.resolve().declaration.qualifiedName?.let { getClassDeclarationByName(it) }

  if (classDeclaration == null || classDeclaration in seenAnnotations) {
    return emptyList()
  }

  seenAnnotations.add(classDeclaration) // mark the current declaration as seen

  // Check if the current annotation declaration has a @Preview annotation
  val hasPreview = classDeclaration.annotations.any {
    it.annotationType.resolve().declaration.qualifiedName?.asString() == COMPOSE_PREVIEW_ANNOTATION_NAME
  }
  if (hasPreview) {
    return listOf(annotation) // return the parent annotation
  }

  // Recursively check annotations of the current annotation
  val nestedAnnotationsWithPreview = classDeclaration.annotations.flatMap {
    findPreviewAnnotations(it, seenAnnotations)
  }

  return nestedAnnotationsWithPreview.toList()
}
