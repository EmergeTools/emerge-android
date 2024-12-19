package com.emergetools.snapshots.compose

import android.app.Activity
import android.graphics.Bitmap
import android.graphics.Canvas
import android.util.Log
import android.view.View
import android.view.ViewGroup
import android.view.ViewGroup.LayoutParams
import androidx.compose.runtime.currentComposer
import androidx.compose.ui.platform.ComposeView
import androidx.compose.ui.tooling.PreviewActivity
import androidx.compose.ui.unit.IntSize
import com.emergetools.snapshots.EmergeSnapshots
import com.emergetools.snapshots.SnapshotErrorType
import com.emergetools.snapshots.compose.previewparams.PreviewParamUtils
import com.emergetools.snapshots.shared.ComposePreviewSnapshotConfig
import com.emergetools.snapshots.util.Profiler

@Suppress("TooGenericExceptionCaught")
fun snapshotComposable(
  snapshotRule: EmergeSnapshots,
  activity: PreviewActivity,
  previewConfig: ComposePreviewSnapshotConfig,
) {
  Profiler.startSpan("snapshotComposable")
  try {
    snapshot(
      activity = activity,
      snapshotRule = snapshotRule,
      previewConfig = previewConfig,
    )
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
  } finally {
    Profiler.endSpan()
  }
}

private fun snapshot(
  activity: Activity,
  snapshotRule: EmergeSnapshots,
  previewConfig: ComposePreviewSnapshotConfig,
) {
  // If no preview params, fallback to a single array of one null item to ensure we
  // snapshot the composable.
  val previewParameters =
    PreviewParamUtils.getPreviewProviderParameters(previewConfig) ?: arrayOf<Any?>(null)

  Profiler.startSpan("configToDeviceSpec")
  val deviceSpec = configToDeviceSpec(previewConfig)
  Profiler.endSpan()

  for (index in previewParameters.indices) {
    Profiler.startSpan("previewParam_$index")
    val prevParam = previewParameters[index]
    Log.d(
      EmergeComposeSnapshotReflectiveParameterizedInvoker.TAG,
      "Invoking composable method with preview parameter: $prevParam"
    )

    Profiler.startSpan("setupComposeView")

    val composeView = ComposeView(activity)
    composeView.layoutParams = LayoutParams(LayoutParams.WRAP_CONTENT, LayoutParams.WRAP_CONTENT)
    val args = if (prevParam != null) arrayOf(prevParam) else emptyArray()

    val saveablePreviewConfig = previewConfig.copy(
      previewParameter = previewConfig.previewParameter?.copy(index = index)
    )

    Profiler.endSpan()

    // Update activity window size if device is specified
    if (deviceSpec != null) {
      updateActivityBounds(activity, deviceSpec)
    }

    composeView.setContent {
      SnapshotVariantProvider(previewConfig, deviceSpec?.scalingFactor) {
        ComposableInvoker.invokeComposable(
          className = previewConfig.fullyQualifiedClassName,
          methodName = previewConfig.originalFqn.substringAfterLast("."),
          composer = currentComposer,
          args = args,
        )
      }
    }

    // Add the ComposeView to the activity
    Profiler.startSpan("addContentView")
    activity.addContentView(
      composeView,
      LayoutParams(LayoutParams.WRAP_CONTENT, LayoutParams.WRAP_CONTENT)
    )
    Profiler.endSpan()

    composeView.post {
      Profiler.startSpan("post")
      val size = measureViewSize(composeView, previewConfig)
      val bitmap = captureBitmap(composeView, size.width, size.height)

      bitmap?.let {
        snapshotRule.take(it, saveablePreviewConfig)
      } ?: run {
        snapshotRule.saveError(
          errorType = SnapshotErrorType.EMPTY_SNAPSHOT,
          composePreviewSnapshotConfig = saveablePreviewConfig
        )
      }

      // Reset activity content view
      (composeView.parent as? ViewGroup)?.removeView(composeView)
      Profiler.endSpan()
    }
    Profiler.endSpan()
  }
}

private fun measureViewSize(
  view: View,
  previewConfig: ComposePreviewSnapshotConfig
): IntSize {
  Profiler.startSpan("measureViewSize")
  val deviceSpec = configToDeviceSpec(previewConfig)

  // Use exact measurements when we have them
  val scalingFactor = deviceSpec?.scalingFactor ?: view.resources.displayMetrics.density

  val widthMeasureSpec = when {
    previewConfig.widthDp != null -> {
      View.MeasureSpec.makeMeasureSpec(
        dpToPx(previewConfig.widthDp!!, scalingFactor),
        View.MeasureSpec.EXACTLY
      )
    }

    deviceSpec?.widthPixels != null && deviceSpec.widthPixels > 0 ->
      View.MeasureSpec.makeMeasureSpec(deviceSpec.widthPixels, View.MeasureSpec.EXACTLY)

    else ->
      View.MeasureSpec.makeMeasureSpec(view.width, View.MeasureSpec.AT_MOST)
  }

  val heightMeasureSpec = when {
    previewConfig.heightDp != null -> {
      View.MeasureSpec.makeMeasureSpec(
        dpToPx(previewConfig.heightDp!!, scalingFactor),
        View.MeasureSpec.EXACTLY
      )
    }

    deviceSpec?.heightPixels != null && deviceSpec.heightPixels > 0 ->
      View.MeasureSpec.makeMeasureSpec(deviceSpec.heightPixels, View.MeasureSpec.EXACTLY)

    else ->
      View.MeasureSpec.makeMeasureSpec(view.height, View.MeasureSpec.AT_MOST)
  }

  Profiler.startSpan("view.measure")
  view.measure(widthMeasureSpec, heightMeasureSpec)
  Profiler.endSpan()

  val size = IntSize(view.measuredWidth, view.measuredHeight)
  Profiler.endSpan()
  return size
}

private fun updateActivityBounds(activity: Activity, deviceSpec: DeviceSpec) {
  Profiler.startSpan("updateActivityBounds")
  // Apply the device spec dimensions to the activity window
  val width = deviceSpec.widthPixels
  val height = deviceSpec.heightPixels

  if (width > 0 && height > 0) {
    activity.window.setLayout(width, height)
  }
  Profiler.endSpan()
}

private fun dpToPx(dp: Int, scalingFactor: Float): Int {
  return (dp * scalingFactor).toInt()
}

fun captureBitmap(
  view: View,
  width: Int,
  height: Int,
): Bitmap? {
  Profiler.startSpan("captureBitmap")
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
  } finally {
    Profiler.endSpan()
  }
}
