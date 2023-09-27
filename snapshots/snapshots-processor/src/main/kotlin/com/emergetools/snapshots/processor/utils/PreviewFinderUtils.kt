package com.emergetools.snapshots.processor.utils

import com.emergetools.snapshots.processor.preview.ComposePreviewUtils.getUniqueSnapshotConfigsFromMultiPreviewAnnotation
import com.emergetools.snapshots.processor.preview.ComposePreviewUtils.getUniqueSnapshotConfigsFromPreviewAnnotations
import com.emergetools.snapshots.shared.ComposePreviewSnapshotConfig
import com.google.devtools.ksp.processing.KSPLogger
import com.google.devtools.ksp.processing.Resolver
import com.google.devtools.ksp.symbol.ClassKind
import com.google.devtools.ksp.symbol.KSAnnotated
import com.google.devtools.ksp.symbol.KSClassDeclaration
import com.google.devtools.ksp.symbol.KSFunctionDeclaration
import com.squareup.kotlinpoet.ksp.toTypeName

const val COMPOSE_PREVIEW_ANNOTATION_NAME =
  "androidx.compose.ui.tooling.preview.Preview"

fun List<KSAnnotated>.functionsWithPreviewAnnotation(): Map<KSFunctionDeclaration, List<ComposePreviewSnapshotConfig>> {
  return filterIsInstance<KSFunctionDeclaration>()
    .associateWith { getUniqueSnapshotConfigsFromPreviewAnnotations(it) }
}

fun List<KSAnnotated>.functionsWithMultiPreviewAnnotation(
  resolver: Resolver,
): Map<KSFunctionDeclaration, List<ComposePreviewSnapshotConfig>> {
  val uniqueSnapshotConfigs = filterIsInstance<KSClassDeclaration>()
    .filter { it.classKind == ClassKind.ANNOTATION_CLASS }
    .flatMap { annotation ->
      val multiPreviewAnnotationPreviewAnnotations = annotation.annotations.filter {
        it.annotationType.resolve().declaration.qualifiedName?.asString() == COMPOSE_PREVIEW_ANNOTATION_NAME
      }.toList()

      val fqn = annotation.asType(emptyList()).toTypeName()
      resolver
        .getSymbolsWithAnnotation(fqn.toString())
        .filterIsInstance<KSFunctionDeclaration>()
        .map { function ->
          function to getUniqueSnapshotConfigsFromMultiPreviewAnnotation(
            annotations = multiPreviewAnnotationPreviewAnnotations,
            previewFunction = function,
          )
        }
    }

  // The same function declaration can show up multiple times, so ensure the values are merged together
  val mergedConfigs = mutableMapOf<KSFunctionDeclaration, List<ComposePreviewSnapshotConfig>>()
  uniqueSnapshotConfigs.forEach {
    mergedConfigs.putOrAppend(it.first, it.second)
  }

  return mergedConfigs
}

fun Resolver.getMultiPreviewAnnotations(logger: KSPLogger): List<KSClassDeclaration> {
  // Find all symbols with annotations and map to the annotation class declarations
  val annotationClassDecls = getAllFiles()
    .flatMap { it.declarations }
    .filter { it.annotations.count() > 0 }
    .flatMap { symbol ->
      symbol.annotations.mapNotNull { annotation ->
        val annotationQN = annotation.annotationType.resolve().declaration.qualifiedName
        annotationQN?.let { qualifiedName ->
          getClassDeclarationByName(qualifiedName)
        }
      }
    }
    .filter { it.classKind == ClassKind.ANNOTATION_CLASS }
    .toSet()

  // Of the annotation classes we found, take those that themselves have a preview annotation.
  // We can assume these are multi-preview annotations.
  return annotationClassDecls
    .filter { hasDirectOrTransitivePreviewAnnotation(logger, it) }
    .toList()
    .sortedBy { it.simpleName.asString() }
}

fun Resolver.hasDirectOrTransitivePreviewAnnotation(logger: KSPLogger, declaration: KSClassDeclaration, seenAnnotations: MutableSet<KSClassDeclaration> = mutableSetOf()): Boolean {
  if (declaration in seenAnnotations) {
    logger.info("telkins found declaration ${declaration.qualifiedName?.asString()} in seen")
    return false
  }

  if (declaration.annotations.any { it.annotationType.resolve().declaration.qualifiedName?.asString() == COMPOSE_PREVIEW_ANNOTATION_NAME }) {
    logger.info("telkins declaration ${declaration.qualifiedName?.asString()} has @Preview annotation!")
    return true
  }

  seenAnnotations.add(declaration)

  logger.info("telkins recursing for ${declaration.qualifiedName?.asString()}")
  return declaration.annotations.any { annotation ->
    val annotationQualifiedName = annotation.annotationType.resolve().declaration.qualifiedName
    val classDeclaration = annotationQualifiedName?.let { getClassDeclarationByName(it) }
    classDeclaration?.let { hasDirectOrTransitivePreviewAnnotation(logger, classDeclaration, seenAnnotations) } ?: false
  }
}
