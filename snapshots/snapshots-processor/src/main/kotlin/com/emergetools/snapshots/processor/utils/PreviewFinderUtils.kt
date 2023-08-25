package com.emergetools.snapshots.processor.utils

import com.emergetools.snapshots.processor.preview.ComposePreviewUtils
import com.emergetools.snapshots.processor.preview.ComposePreviewUtils.getUniqueSnapshotConfigsFromPreviewAnnotations
import com.emergetools.snapshots.shared.ComposePreviewSnapshotConfig
import com.google.devtools.ksp.processing.Resolver
import com.google.devtools.ksp.symbol.ClassKind
import com.google.devtools.ksp.symbol.KSAnnotated
import com.google.devtools.ksp.symbol.KSClassDeclaration
import com.google.devtools.ksp.symbol.KSFunctionDeclaration
import com.squareup.kotlinpoet.ksp.toTypeName

// TODO: Tests
fun List<KSAnnotated>.functionsWithPreviewAnnotation(): Map<KSFunctionDeclaration, List<ComposePreviewSnapshotConfig>> {
  return filterIsInstance<KSFunctionDeclaration>()
    .associateWith { getUniqueSnapshotConfigsFromPreviewAnnotations(it) }
}

// TODO: Test
fun List<KSAnnotated>.functionsWithMultiPreviewAnnotation(
  resolver: Resolver,
): Map<KSFunctionDeclaration, List<ComposePreviewSnapshotConfig>> {
  return filterIsInstance<KSClassDeclaration>()
    .filter { it.classKind == ClassKind.ANNOTATION_CLASS }
    .flatMap { annotation ->

      val multiPreviewAnnotationPreviewAnnotations = annotation.annotations.filter {
        it.shortName.asString() == "Preview" // TODO: Const
      }.toList()

      val fqn = annotation.asType(emptyList()).toTypeName()
      resolver.getSymbolsWithAnnotation(fqn.toString())
        // TODO: Nested multipreviews?
        // We'd get KSClassDeclarations, then we'd need to process/add

        .filterIsInstance<KSFunctionDeclaration>()
        .toList()
        .map { function ->
          function to ComposePreviewUtils.getUniqueSnapshotConfigsFromMultiPreviewAnnotation(
            multiPreviewAnnotationPreviewAnnotations, function
          )
        }
    }
    .toMap()
}
