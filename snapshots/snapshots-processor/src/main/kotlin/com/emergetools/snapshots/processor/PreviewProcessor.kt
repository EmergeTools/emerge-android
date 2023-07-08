package com.emergetools.snapshots.processor

import com.emergetools.snapshots.processor.preview.ComposablePreviewSnapshotBuilder.addComposableSnapshotBlock
import com.emergetools.snapshots.processor.preview.ComposablePreviewSnapshotBuilder.addComposeRuleProperty
import com.emergetools.snapshots.processor.preview.ComposablePreviewSnapshotBuilder.addEmergeSnapshotRuleProperty
import com.emergetools.snapshots.processor.preview.ComposablePreviewSnapshotBuilder.addPreviewConfigProperty
import com.emergetools.snapshots.processor.preview.ComposePreviewUtils.getUniqueSnapshotConfigsFromPreviewAnnotations
import com.emergetools.snapshots.shared.ComposePreviewSnapshotConfig
import com.google.devtools.ksp.processing.CodeGenerator
import com.google.devtools.ksp.processing.Dependencies
import com.google.devtools.ksp.processing.Resolver
import com.google.devtools.ksp.processing.SymbolProcessor
import com.google.devtools.ksp.processing.SymbolProcessorEnvironment
import com.google.devtools.ksp.processing.SymbolProcessorProvider
import com.google.devtools.ksp.symbol.KSAnnotated
import com.google.devtools.ksp.symbol.KSFunctionDeclaration
import com.squareup.kotlinpoet.AnnotationSpec
import com.squareup.kotlinpoet.ClassName
import com.squareup.kotlinpoet.FileSpec
import com.squareup.kotlinpoet.FunSpec
import com.squareup.kotlinpoet.TypeSpec
import com.squareup.kotlinpoet.ksp.writeTo

/**
 * A generally simple processor, finds all functions annotated with `@Preview`, filters to unique
 * preview configurations and generates a test class that takes a snapshot of each.
 */
class PreviewProcessor(
  private val environment: SymbolProcessorEnvironment,
) : SymbolProcessor {

  private val logger = environment.logger

  override fun process(resolver: Resolver): List<KSAnnotated> {
    val previewFunctions = resolver
      .getSymbolsWithAnnotation(COMPOSE_PREVIEW_ANNOTATION_NAME)
      .filterIsInstance<KSFunctionDeclaration>()

    val codeGenerator = environment.codeGenerator
    previewFunctions.forEach { previewFunction ->
      // Intentionally skipping functions with parameters for now.
      if (previewFunction.parameters.isNotEmpty()) {
        logger.info("Skipping ${previewFunction.simpleName.asString()} because it has parameters")
        return@forEach
      }
      generateEmergeSnapshotTest(codeGenerator, previewFunction)
    }
    return emptyList()
  }

  private fun generateEmergeSnapshotTest(
    codeGenerator: CodeGenerator,
    previewFunction: KSFunctionDeclaration,
  ) {
    val previewConfigs = getUniqueSnapshotConfigsFromPreviewAnnotations(previewFunction)
    previewConfigs.forEach { previewConfig ->
      val packageName = previewFunction.containingFile!!.packageName.asString()
      val functionName = previewFunction.simpleName.asString()

      val testClassName = getTestClassName(functionName, previewConfig)
      val testAnnotation = AnnotationSpec.builder(JUNIT_TEST_ANNOTATION_CLASSNAME)
        .build()

      var snapshotName = functionName
      val previewName = previewConfig.name
      if (!previewName.isNullOrBlank()) {
        snapshotName += " - $previewName"
      }

      val testFunctionSpec = FunSpec.builder("${functionName}_GenSnapshot").apply {
        addAnnotation(testAnnotation)
        addComposableSnapshotBlock(functionName, snapshotName)
      }.build()

      val testRunnerAnnotation = AnnotationSpec.builder(ClassName("org.junit.runner", "RunWith"))
        .addMember("%T::class", ANDROID_JUNIT_RUNNER_CLASSNAME)
        .build()

      val typeSpec = TypeSpec.classBuilder(testClassName).apply {
        addFunction(testFunctionSpec)
        addAnnotation(testRunnerAnnotation)
        addComposeRuleProperty()
        addPreviewConfigProperty(previewConfig)
        addEmergeSnapshotRuleProperty()
      }.build()

      val fileSpec = FileSpec.builder(packageName, testClassName).apply {
        addType(typeSpec)
        addImport("androidx.compose.runtime", "Composable")
        previewFunction.qualifiedName?.asString()?.let {
          addImport(previewFunction.packageName.asString(), functionName)
        }
        addImport("com.emergetools.snapshots.compose", "SnapshotVariantProvider")
      }.build()

      fileSpec.writeTo(codeGenerator, Dependencies(false))
    }
  }

  /**
   * Helper to create a unique testClass name. We do so by appending the hashcode of the Preview
   * config if the config is not a default preview, to ensure test names are unique.
   */
  private fun getTestClassName(
    composableFunctionName: String,
    previewConfig: ComposePreviewSnapshotConfig,
  ): String {
    var testFunctionName = composableFunctionName
    if (previewConfig.hashCode() != ComposePreviewSnapshotConfig.DEFAULT.hashCode()) {
      testFunctionName += "_${previewConfig.hashCode()}"
    }
    return "${testFunctionName}_GenSnapshot"
  }

  companion object {
    private const val COMPOSE_PREVIEW_ANNOTATION_NAME =
      "androidx.compose.ui.tooling.preview.Preview"

    private val ANDROID_JUNIT_RUNNER_CLASSNAME =
      ClassName("androidx.test.ext.junit.runners", "AndroidJUnit4")
    private val JUNIT_TEST_ANNOTATION_CLASSNAME = ClassName("org.junit", "Test")
  }
}

class PreviewProcessorProvider : SymbolProcessorProvider {

  override fun create(environment: SymbolProcessorEnvironment): SymbolProcessor {
    return PreviewProcessor(environment)
  }
}
