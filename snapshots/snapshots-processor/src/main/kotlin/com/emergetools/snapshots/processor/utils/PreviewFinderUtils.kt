package com.emergetools.snapshots.processor.utils

import com.emergetools.snapshots.processor.preview.ComposePreviewUtils.getUniqueSnapshotConfigsFromMultiPreviewAnnotation
import com.emergetools.snapshots.processor.preview.ComposePreviewUtils.getUniqueSnapshotConfigsFromPreviewAnnotations
import com.emergetools.snapshots.shared.ComposePreviewSnapshotConfig
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
  return filterIsInstance<KSClassDeclaration>()
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
            previewFunction = function
          )
        }
    }
    .toMap()
}
