package com.emergetools.snapshots.compose.previewparams

import android.util.Log
import androidx.compose.ui.tooling.preview.PreviewParameterProvider
import com.emergetools.snapshots.shared.ComposePreviewSnapshotConfig

// Inspired by https://cs.android.com/androidx/platform/frameworks/support/+/androidx-main:compose/ui/ui-tooling/src/androidMain/kotlin/androidx/compose/ui/tooling/PreviewUtils.android.kt
object PreviewParamUtils {
  private const val TAG = "PreviewParamUtils"

  @Suppress("ReturnCount")
  internal fun getPreviewProviderParameters(
    previewConfig: ComposePreviewSnapshotConfig
  ): Array<Any?>? {
    if (previewConfig.previewParameter == null) {
      Log.d(TAG, "No PreviewParameterProvider found for ${previewConfig.originalFqn}")
      return null
    }

    if (previewConfig.previewParameter?.providerClassFqn.isNullOrEmpty()) {
      Log.e(TAG, "PreviewParameterProvider class name is empty for ${previewConfig.originalFqn}")
      return null
    }

    val paramProviderClass = try {
      Class.forName(previewConfig.previewParameter!!.providerClassFqn) as? Class<out PreviewParameterProvider<*>>
    } catch (e: ClassNotFoundException) {
      Log.e(
        TAG,
        "Unable to find PreviewProvider '${previewConfig.previewParameter!!.providerClassFqn}'" +
          " for ${previewConfig.originalFqn}",
        e
      )
      return null
    }

    if (paramProviderClass == null) {
      Log.e(
        TAG,
        "PreviewProvider '${previewConfig.previewParameter!!.providerClassFqn}'" +
          " is not a PreviewParameterProvider for ${previewConfig.originalFqn}"
      )
      return null
    }

    val constructor = paramProviderClass.constructors
      .singleOrNull { it.parameterTypes.isEmpty() }
      ?.apply { isAccessible = true }
      ?: throw IllegalArgumentException(
        "PreviewParameterProvider constructor can not" + " have parameters"
      )
    val params = constructor.newInstance() as PreviewParameterProvider<*>

    return params.values.toArray(params.count)
      .map { unwrapIfInline(it) }
      .toTypedArray()
  }

  private fun Sequence<Any?>.toArray(size: Int): Array<Any?> {
    val iterator = iterator()
    return Array(size) { iterator.next() }
  }

  /**
   * Checks if the object is of inlined value type. If yes, unwraps and returns the packed value If
   * not, returns the object as it is
   */
  private fun unwrapIfInline(classToCheck: Any?): Any? {
    // At the moment is not possible to use classToCheck::class.isValue, even if it works when
    // running tests, is not working once trying to run the Preview instead.
    // it would be possible in the future.
    // see also https://kotlinlang.org/docs/inline-classes.html
    if (classToCheck != null && classToCheck::class.java.annotations.any { it is JvmInline }) {
      // The first primitive declared field in the class is the value wrapped
      val fieldName: String =
        classToCheck::class.java.declaredFields.first { it.type.isPrimitive }.name
      return classToCheck::class
        .java
        .getDeclaredField(fieldName)
        .also { it.isAccessible = true }
        .get(classToCheck)
    }
    return classToCheck
  }
}
