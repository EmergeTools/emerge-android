package com.emergetools.snapshots.processor.preview

import com.emergetools.snapshots.shared.ComposePreviewSnapshotConfig
import com.google.devtools.ksp.closestClassDeclaration
import com.google.devtools.ksp.symbol.KSAnnotation
import com.google.devtools.ksp.symbol.KSFile
import com.google.devtools.ksp.symbol.KSFunctionDeclaration
import com.google.devtools.ksp.symbol.KSValueArgument

object ComposePreviewUtils {

  private const val PREVIEW_ANNOTATION_SIMPLE_NAME = "Preview"
  private const val PREVIEW_NAME_ARGUMENT_NAME = "name"
  private const val PREVIEW_GROUP_ARGUMENT_NAME = "group"
  private const val PREVIEW_LOCALE_ARGUMENT_NAME = "locale"
  private const val PREVIEW_FONT_SCALE_ARGUMENT_NAME = "fontScale"
  private const val PREVIEW_UI_MODE_ARGUMENT_NAME = "uiMode"

  /**
   * Simple helper to get unique preview annotations for a given function.
   * A unique preview annotation is one that has a unique combination of name, group, locale,
   * fontScale and uiMode, the current supported arguments for Emerge snapshots of the @Preview
   * annotation.
   */
  fun getUniqueSnapshotConfigsFromPreviewAnnotations(
    previewFunction: KSFunctionDeclaration,
  ): List<ComposePreviewSnapshotConfig> = previewFunction.annotations.filter {
    it.shortName.asString() == PREVIEW_ANNOTATION_SIMPLE_NAME
  }.map { composePreviewShapshotConfigFromPreviewAnnotation(previewFunction, it) }
    .distinct()
    .toList()

  fun getUniqueSnapshotConfigsFromMultiPreviewAnnotation(
    annotations: List<KSAnnotation>,
    previewFunction: KSFunctionDeclaration,
  ): List<ComposePreviewSnapshotConfig> {
    return annotations.map {
      composePreviewShapshotConfigFromPreviewAnnotation(previewFunction, it)
    }.distinct()
      .toList()
  }

  private fun composePreviewShapshotConfigFromPreviewAnnotation(
    previewFunction: KSFunctionDeclaration,
    previewAnnotation: KSAnnotation,
  ): ComposePreviewSnapshotConfig {
    // We need to explicitly check for nulls here so we don't set a default unintentionally and
    // so we don't default to the Preview annotation default empty values.
    val nameArgument = previewAnnotation.argumentForName(PREVIEW_NAME_ARGUMENT_NAME)
    val nameValue =
      nameArgument?.value?.takeIf { (it as? String)?.isNotBlank() == true }?.toString()

    val groupArgument = previewAnnotation.argumentForName(PREVIEW_GROUP_ARGUMENT_NAME)
    val groupValue =
      groupArgument?.value?.takeIf { (it as? String)?.isNotBlank() == true }?.toString()

    val localeArgument = previewAnnotation.argumentForName(PREVIEW_LOCALE_ARGUMENT_NAME)
    val localeValue =
      localeArgument?.value?.takeIf { (it as? String)?.isNotBlank() == true }?.toString()

    val fontScaleArgument = previewAnnotation.argumentForName(PREVIEW_FONT_SCALE_ARGUMENT_NAME)
    val fontScaleValue = fontScaleArgument?.value?.takeIf {
      (it as? Float) != 1.0f
    }?.let { it as Float }

    val uiModeArgument = previewAnnotation.argumentForName(PREVIEW_UI_MODE_ARGUMENT_NAME)
    val uiModeValue = uiModeArgument?.value?.takeIf { (it as? Int) != 0 }?.let { it as Int }

    val originalFqn = previewFunction.qualifiedName?.asString()
      ?: "${previewFunction.packageName.asString()}.${previewFunction.simpleName.asString()}}"

    val containingFile = previewFunction.containingFile
    if (containingFile == null) {
      throw IllegalStateException("Preview function must have a containing file")
    }

    val fullyQualifiedClassName = previewFunction.closestClassDeclaration()?.qualifiedName?.asString()
      ?: previewFunction.containingFile?.fullyQualifiedClassName()
      ?: throw IllegalStateException("Preview function must be contained in a class or file")

    return ComposePreviewSnapshotConfig(
      fullyQualifiedClassName = fullyQualifiedClassName,
      originalFqn = originalFqn,
      name = nameValue,
      group = groupValue,
      locale = localeValue,
      fontScale = fontScaleValue,
      uiMode = uiModeValue,
    )
  }

  private fun KSAnnotation.argumentForName(name: String): KSValueArgument? {
    return arguments.firstOrNull { it.name?.asString() == name }
  }

  private fun KSFile.fullyQualifiedClassName(): String {
    val fileNameAsKtClass = if (fileName.endsWith(".kt")) {
      "${fileName.removeSuffix(".kt")}Kt"
    } else {
      fileName
    }
    return "${packageName.asString()}.${fileNameAsKtClass}"
  }
}

