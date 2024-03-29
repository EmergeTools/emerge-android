package com.emergetools.snapshots.processor.preview

import com.emergetools.snapshots.shared.ComposePreviewSnapshotConfig
import com.squareup.kotlinpoet.AnnotationSpec
import com.squareup.kotlinpoet.ClassName
import com.squareup.kotlinpoet.CodeBlock
import com.squareup.kotlinpoet.FunSpec
import com.squareup.kotlinpoet.PropertySpec
import com.squareup.kotlinpoet.TypeSpec

object ComposablePreviewSnapshotBuilder {
  private const val PREVIEW_CONFIG_PROPERTY_NAME = "previewConfig"
  private const val SNAPSHOT_RULE_PROPERTY_NAME = "snapshotRule"
  private const val COMPOSE_RULE_PROPERTY_NAME = "composeRule"
  private val SNAPSHOT_VARIANT_PROVIDER_CLASSNAME = ClassName(
    "com.emergetools.snapshots.compose",
    "SnapshotVariantProvider"
  )
  private val EMERGE_SNAPSHOTS_RULE_CLASSNAME =
    ClassName("com.emergetools.snapshots", "EmergeSnapshots")
  private val EMERGE_COMPOSE_PREVIEW_SNAPSHOT_CONFIG_CLASSNAME =
    ClassName("com.emergetools.snapshots.shared", "ComposePreviewSnapshotConfig")

  private val COMPOSE_CONTENT_TEST_RULE_CLASSNAME =
    ClassName("androidx.compose.ui.test.junit4", "ComposeContentTestRule")
  private val COMPOSE_RULE_CREATOR_CLASSNAME =
    ClassName("androidx.compose.ui.test.junit4", "createComposeRule")

  private val JUNIT_RULE_ANNOTATION_CLASSNAME = ClassName("org.junit", "Rule")

  private val ruleAnnotation by lazy {
    AnnotationSpec.builder(JUNIT_RULE_ANNOTATION_CLASSNAME)
      .useSiteTarget(AnnotationSpec.UseSiteTarget.GET)
      .build()
  }

  fun TypeSpec.Builder.addPreviewConfigProperty(config: ComposePreviewSnapshotConfig) {
    val configInitializer = mutableListOf<String>().apply {
      add("originalFqn = \"${config.originalFqn}\"")
      add("fullyQualifiedClassName = \"${config.fullyQualifiedClassName}\"")
      config.name?.let { add("name = \"$it\"") }
      config.group?.let { add("group = \"$it\"") }
      config.uiMode?.let { add("uiMode = $it") }
      config.locale?.let { add("locale = \"$it\"") }
      config.fontScale?.let { add("fontScale = ${it}f") }
    }.joinToString(",\n")

    val property = PropertySpec.builder(
      name = PREVIEW_CONFIG_PROPERTY_NAME,
      type = EMERGE_COMPOSE_PREVIEW_SNAPSHOT_CONFIG_CLASSNAME
    ).initializer("%T($configInitializer)", EMERGE_COMPOSE_PREVIEW_SNAPSHOT_CONFIG_CLASSNAME)
      .build()

    addProperty(property)
  }

  fun TypeSpec.Builder.addComposeRuleProperty() {
    val composeRuleProperty =
      PropertySpec.builder(COMPOSE_RULE_PROPERTY_NAME, COMPOSE_CONTENT_TEST_RULE_CLASSNAME).apply {
        initializer("%T()", COMPOSE_RULE_CREATOR_CLASSNAME)
        addAnnotation(ruleAnnotation)
      }.build()

    addProperty(composeRuleProperty)
  }

  fun TypeSpec.Builder.addEmergeSnapshotRuleProperty() {
    val snapshotsRuleProperty =
      PropertySpec.builder(SNAPSHOT_RULE_PROPERTY_NAME, EMERGE_SNAPSHOTS_RULE_CLASSNAME).apply {
        initializer("%T()", EMERGE_SNAPSHOTS_RULE_CLASSNAME)
        addAnnotation(ruleAnnotation)
      }.build()
    addProperty(snapshotsRuleProperty)
  }

  /**
   * Builds a compositionLocal that sets the Preview configuration for the passed snapshot as well
   * as the snapshotting code.
   */
  fun FunSpec.Builder.addComposableSnapshotBlock(functionName: String) {
    val codeBlock = CodeBlock.builder().apply {
      addStatement("$COMPOSE_RULE_PROPERTY_NAME.setContent {")
      addStatement("  %T($PREVIEW_CONFIG_PROPERTY_NAME) {", SNAPSHOT_VARIANT_PROVIDER_CLASSNAME)
      addStatement("    $functionName()")
      addStatement("  }")
      addStatement("}")
      addStatement("$SNAPSHOT_RULE_PROPERTY_NAME.take(composeRule, $PREVIEW_CONFIG_PROPERTY_NAME)")
    }.build()

    addCode(codeBlock)
  }
}
