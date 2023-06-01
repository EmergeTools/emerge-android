package com.emergetools.snapshots.processor

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
import com.squareup.kotlinpoet.PropertySpec
import com.squareup.kotlinpoet.TypeSpec
import com.squareup.kotlinpoet.ksp.writeTo

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
    val packageName = previewFunction.containingFile!!.packageName.asString()
    val functionName = previewFunction.simpleName.asString()
    val testClassName = "${functionName}_EmergeSnapshot"

    val testAnnotation = AnnotationSpec.builder(JUNIT_TEST_ANNOTATION_CLASSNAME)
      .build()

    val ruleAnnotation = AnnotationSpec.builder(JUNIT_RULE_ANNOTATION_CLASSNAME)
      .useSiteTarget(AnnotationSpec.UseSiteTarget.GET)
      .build()

    val snapshotsRuleProperty =
      PropertySpec.builder("snapshots", EMERGE_SNAPSHOTS_CLASSNAME)
        .initializer("EmergeSnapshots()")
        .addAnnotation(ruleAnnotation)
        .build()

    val funSpec = FunSpec.builder("${functionName}EmergeSnapshot")
      .addAnnotation(testAnnotation)
      .addStatement("composeRule.setContent { $functionName() }")
      .addStatement("snapshots.take(\"$functionName\", composeRule)")
      .build()

    val composeRuleProperty =
      PropertySpec.builder("composeRule", COMPOSE_CONTENT_TEST_RULE_CLASSNAME)
        .addAnnotation(ruleAnnotation)
        .initializer("%T()", CREATE_COMPOSE_RULE_FUNCTION_CLASSNAME)
        .build()

    val testRunnerAnnotation = AnnotationSpec.builder(ClassName("org.junit.runner", "RunWith"))
      .addMember("%T::class", ANDROID_JUNIT_RUNNER_CLASSNAME)
      .build()

    val typeSpec = TypeSpec.classBuilder(testClassName)
      .addFunction(funSpec)
      .addAnnotation(testRunnerAnnotation)
      .addProperty(composeRuleProperty)
      .addProperty(snapshotsRuleProperty)
      .build()

    val fileSpec = FileSpec.builder(packageName, testClassName)
      .addType(typeSpec)
      .addImport("androidx.compose.runtime", "Composable")
      .build()

    fileSpec.writeTo(codeGenerator, Dependencies(false))
  }

  companion object {
    private const val COMPOSE_PREVIEW_ANNOTATION_NAME =
      "androidx.compose.ui.tooling.preview.Preview"

    private val EMERGE_SNAPSHOTS_CLASSNAME =
      ClassName("com.emergetools.snapshots", "EmergeSnapshots")

    private val COMPOSE_CONTENT_TEST_RULE_CLASSNAME =
      ClassName("androidx.compose.ui.test.junit4", "ComposeContentTestRule")
    private val CREATE_COMPOSE_RULE_FUNCTION_CLASSNAME =
      ClassName("androidx.compose.ui.test.junit4", "createComposeRule")

    private val ANDROID_JUNIT_RUNNER_CLASSNAME =
      ClassName("androidx.test.ext.junit.runners", "AndroidJUnit4")
    private val JUNIT_TEST_ANNOTATION_CLASSNAME = ClassName("org.junit", "Test")
    private val JUNIT_RULE_ANNOTATION_CLASSNAME = ClassName("org.junit", "Rule")
  }
}

class PreviewProcessorProvider : SymbolProcessorProvider {

  override fun create(environment: SymbolProcessorEnvironment): SymbolProcessor {
    return PreviewProcessor(environment)
  }
}
