package com.emergetools.snapshots.compose

import android.app.Activity
import android.graphics.Bitmap
import android.graphics.Canvas
import android.util.Log
import android.view.View
import android.view.ViewGroup.LayoutParams
import androidx.compose.runtime.Composer
import androidx.compose.runtime.currentComposer
import androidx.compose.ui.platform.ComposeView
import androidx.compose.ui.unit.IntSize
import com.emergetools.snapshots.EmergeSnapshots
import com.emergetools.snapshots.SnapshotErrorType
import com.emergetools.snapshots.shared.ComposePreviewSnapshotConfig
import kotlin.math.max

@Suppress("TooGenericExceptionCaught")
fun snapshotComposable(
  snapshotRule: EmergeSnapshots,
  activity: Activity,
  previewConfig: ComposePreviewSnapshotConfig,
) {
  try {
    val klass = Class.forName(previewConfig.fullyQualifiedClassName)
    Log.d(
      EmergeComposeSnapshotReflectiveParameterizedInvoker.TAG,
      "Found class for ${previewConfig.fullyQualifiedClassName}: ${klass.name}"
    )
    val methodName = previewConfig.originalFqn.substringAfterLast(".")
    val composableMethod = klass.methods.find {
      Log.d(
        EmergeComposeSnapshotReflectiveParameterizedInvoker.TAG,
        "Checking method in class ${klass.name}: ${it.name}"
      )
      it.name == methodName
    } ?: klass.getDeclaredMethod(methodName, Composer::class.java, Int::class.javaPrimitiveType)

    if (composableMethod != null && !composableMethod.isAccessible) {
      Log.i(
        EmergeComposeSnapshotReflectiveParameterizedInvoker.TAG,
        "Marking composable method as accessible: ${previewConfig.originalFqn}"
      )
      composableMethod.isAccessible = true
    }

    Log.d(
      EmergeComposeSnapshotReflectiveParameterizedInvoker.TAG,
      "Invoking composable method: ${composableMethod?.name}"
    )

    val composeView = ComposeView(activity)
    composeView.layoutParams =
      LayoutParams(LayoutParams.WRAP_CONTENT, LayoutParams.WRAP_CONTENT)

    composeView.setContent {
      composableMethod?.let {
        it.isAccessible = true
        SnapshotVariantProvider(previewConfig) {
          it.invoke(null, currentComposer, 0)
        }
      } ?: error("Unable to find composable method: ${previewConfig.originalFqn}")
    }

    activity.setContentView(composeView)

    composeView.post {
      // Measure the composable agnostic of the parent constraints to layout properly in activity
      val composableSize = measureComposableSize(composeView, previewConfig)
      val bitmap = captureBitmap(
        view = composeView,
        width = composableSize.width,
        height = composableSize.height,
      )
      bitmap?.let {
        snapshotRule.take(bitmap, previewConfig)
      } ?: run {
        snapshotRule.saveError(
          errorType = SnapshotErrorType.EMPTY_SNAPSHOT,
          composePreviewSnapshotConfig = previewConfig,
        )
      }
    }
  } catch (e: Exception) {
    Log.e(
      EmergeComposeSnapshotReflectiveParameterizedInvoker.TAG,
      "Error invoking composable method",
      e,
    )
    snapshotRule.saveError(
      errorType = SnapshotErrorType.GENERAL,
      composePreviewSnapshotConfig = previewConfig,
    )
    // Re-throw to fail the test
    throw e
  }
}

const val DEFAULT_DENSITY_PPI = 160

private fun measureComposableSize(
  view: ComposeView,
  previewConfig: ComposePreviewSnapshotConfig,
): IntSize {
  if (previewConfig.device != null) {
    val deviceSpec = configToDeviceSpec(previewConfig)
    if (deviceSpec != null) {
      // Measure the composable with the device dimensions
      // Override the width and height if set in preview annotation
      val deviceDpScale = deviceSpec.densityPpi / DEFAULT_DENSITY_PPI
      val widthPixels = previewConfig.widthDp?.let { it * deviceDpScale } ?: deviceSpec.widthPixels
      val heightPixels =
        previewConfig.heightDp?.let { it * deviceDpScale } ?: deviceSpec.heightPixels
      Log.i(
        EmergeComposeSnapshotReflectiveParameterizedInvoker.TAG,
        "Measuring composable with device dimensions: $widthPixels x $heightPixels"
      )
      view.measure(
        View.MeasureSpec.makeMeasureSpec(widthPixels, View.MeasureSpec.EXACTLY),
        View.MeasureSpec.makeMeasureSpec(heightPixels, View.MeasureSpec.EXACTLY),
      )
      return IntSize(view.measuredWidth, view.measuredHeight)
    } else {
      Log.e(
        EmergeComposeSnapshotReflectiveParameterizedInvoker.TAG,
        "Device not found for preview annotation: ${previewConfig.device}"
      )
    }
  }

  // Default to 0 if not set which will allow parent to impose constraints on child when
  // AT_MOST set.
  val emulatorDensity = view.resources.displayMetrics.density
  val heightPx = (previewConfig.heightDp ?: 0) * emulatorDensity
  val widthPx = (previewConfig.widthDp ?: 0) * emulatorDensity

  // If width or height is set in preview annotation, measure with unspecified to allow
  // stretching past bounds of parent.
  // Otherwise, use AT_MOST to allow parent to impose constraints on child.
  val widthMeasureSpec =
    previewConfig.widthDp?.let { View.MeasureSpec.UNSPECIFIED } ?: View.MeasureSpec.AT_MOST
  val heightMeasureSpec =
    previewConfig.heightDp?.let { View.MeasureSpec.UNSPECIFIED } ?: View.MeasureSpec.AT_MOST

  view.measure(
    View.MeasureSpec.makeMeasureSpec(max(view.width, widthPx.toInt()), widthMeasureSpec),
    View.MeasureSpec.makeMeasureSpec(max(view.height, heightPx.toInt()), heightMeasureSpec),
  )
  return IntSize(view.measuredWidth, view.measuredHeight)
}

fun captureBitmap(
  view: View,
  width: Int,
  height: Int,
): Bitmap? {
  try {
    val bitmap = Bitmap.createBitmap(width, height, Bitmap.Config.ARGB_8888)
    val canvas = Canvas(bitmap)
    view.layout(0, 0, width, height)
    view.draw(canvas)
    return bitmap
  } catch (e: IllegalArgumentException) {
    Log.e(
      EmergeComposeSnapshotReflectiveParameterizedInvoker.TAG,
      "Error capturing bitmap",
      e,
    )
    return null
  }
}
