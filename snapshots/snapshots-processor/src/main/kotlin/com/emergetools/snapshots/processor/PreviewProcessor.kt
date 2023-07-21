package com.emergetools.snapshots.processor

import com.emergetools.snapshots.processor.preview.ComposablePreviewSnapshotBuilder.addComposableSnapshotBlock
import com.emergetools.snapshots.processor.preview.ComposablePreviewSnapshotBuilder.addComposeRuleProperty
import com.emergetools.snapshots.processor.preview.ComposablePreviewSnapshotBuilder.addEmergeSnapshotRuleProperty
import com.emergetools.snapshots.processor.preview.ComposablePreviewSnapshotBuilder.addPreviewConfigProperty
import com.emergetools.snapshots.processor.preview.ComposePreviewUtils.getUniqueSnapshotConfigsFromPreviewAnnotations
import com.emergetools.snapshots.processor.shared.ComposePreviewSnapshotConfig
import com.google.devtools.ksp.isPrivate
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
import java.nio.file.Path
import kotlin.io.path.absolutePathString
import kotlin.io.path.createDirectories
import kotlin.io.path.moveTo
import kotlin.io.path.writeText

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

      if (previewFunction.isPrivate()) {
        logger.info("Skipping ${previewFunction.simpleName.asString()} as it is private")
        return@forEach
      }

      generateEmergeSnapshotTest(
        codeGenerator = codeGenerator,
        previewFunction = previewFunction,
      )
    }

    /**
     * KSP currently doesn't allow for generation across source sets, so we have to
     * manually move files to a custom source directory that our plugin sets.
     *
     * This file move must take place as part of the process step to ensure no compilation takes
     * place on the generated files while they're in the default KSP generated source set.
     *
     * Relevant KSP Issues:
     * - https://github.com/google/ksp/issues/799
     * - https://github.com/google/ksp/issues/1037
     */
    val outputSrcDir = environment.options[OUTPUT_SRC_DIR_OPTION_NAME]
    if (outputSrcDir != null) {
      codeGenerator.generatedFile.forEach { generatedFile ->
        moveFile(generatedFile.toPath(), outputSrcDir)
      }
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

      val testFunctionSpec = FunSpec.builder("${functionName}_GenSnapshot").apply {
        addAnnotation(testAnnotation)
        addComposableSnapshotBlock(functionName)
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

  private fun moveFile(
    path: Path,
    outputDir: String,
  ) {
    val pathAfterKotlin = path.absolutePathString().substringAfter("kotlin")

    val newPathFile = Path.of(outputDir, pathAfterKotlin)
    logger.info("Moving generated snapshot test from $path to $newPathFile")
    path.moveTo(newPathFile.apply { parent?.createDirectories() }, true)

    /**
     * Kotlin compilation will fail if test dependencies aren't available for the test class.
     * Deleting these files also won't work as KSP && Kotlin compilation seem to be closely tied
     * together. TODO: Ryan to investigate further to see if we can delete these.
     *
     * In our generated snapshot test cases, without deleting the file, the main source set would
     * need to include test dependencies, which is not ideal.
     *
     * To avoid this, we'll just write a placeholder file that will ensure Kotlin compilation
     * succeeds and won't have any direct impact on the main source set's build.
     */
    path.writeText(
      """
      // This file has been moved to $newPathFile
      // This file acts as a placeholder and will have no effect on the build.
      """.trimIndent(),
    )
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
    if (!previewConfig.isDefault()) {
      // Function name can use hashcode as the saved image key will be
      // the same regardless of test name.
      testFunctionName = "${testFunctionName}_${previewConfig.hashCode()}"
    }
    return "${testFunctionName}_GenSnapshot"
  }

  companion object {
    private const val OUTPUT_SRC_DIR_OPTION_NAME = "emerge.outputDir"

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
