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
import com.emergetools.snapshots.SnapshotType.COMPOSABLE
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
      val bitmap = if (previewConfig.showSystemUi == true) {
        val rootView = activity.window.decorView.rootView
        captureBitmap(
          view = rootView,
          width = rootView.width,
          height = rootView.height,
        )
      } else {
        captureBitmap(
          view = composeView,
          width = composableSize.width,
          height = composableSize.height,
        )
      }
      bitmap?.let {
        snapshotRule.take(bitmap, previewConfig)
      } ?: snapshotRule.saveError(COMPOSABLE, previewConfig)
    }
  } catch (e: Exception) {
    Log.e(
      EmergeComposeSnapshotReflectiveParameterizedInvoker.TAG,
      "Error invoking composable method",
      e,
    )
    snapshotRule.saveError(
      COMPOSABLE,
      previewConfig
    )
    // Re-throw to fail the test
    throw e
  }
}

private fun measureComposableSize(
  view: ComposeView,
  previewConfig: ComposePreviewSnapshotConfig,
): IntSize {
  // Default to 0 if not set which will allow parent to impose constraints on child when
  // AT_MOST set.
  val heightDpPx: Int =
    (previewConfig.heightDp ?: 0) * view.resources.displayMetrics.density.toInt()
  val widthDpPx: Int =
    (previewConfig.widthDp ?: 0) * view.resources.displayMetrics.density.toInt()

  // If width or height is set in preview annotation, measure with unspecified to allow
  // stretching past bounds of parent.
  // Otherwise, use AT_MOST to allow parent to impose constraints on child.
  val widthMeasureSpec =
    previewConfig.widthDp?.let { View.MeasureSpec.UNSPECIFIED } ?: View.MeasureSpec.AT_MOST
  val heightMeasureSpec =
    previewConfig.heightDp?.let { View.MeasureSpec.UNSPECIFIED } ?: View.MeasureSpec.AT_MOST

  view.measure(
    View.MeasureSpec.makeMeasureSpec(max(view.width, widthDpPx), widthMeasureSpec),
    View.MeasureSpec.makeMeasureSpec(max(view.height, heightDpPx), heightMeasureSpec),
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
