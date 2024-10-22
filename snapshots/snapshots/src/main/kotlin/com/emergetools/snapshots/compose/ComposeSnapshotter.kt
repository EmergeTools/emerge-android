package com.emergetools.snapshots.compose

import android.app.Activity
import android.graphics.Bitmap
import android.graphics.Canvas
import android.util.Log
import android.view.View
import android.view.ViewGroup
import android.view.ViewGroup.LayoutParams
import androidx.compose.runtime.currentComposer
import androidx.compose.runtime.reflect.ComposableMethod
import androidx.compose.runtime.reflect.getDeclaredComposableMethod
import androidx.compose.ui.platform.ComposeView
import androidx.compose.ui.tooling.PreviewActivity
import androidx.compose.ui.tooling.preview.PreviewParameterProvider
import androidx.compose.ui.unit.IntSize
import com.emergetools.snapshots.EmergeSnapshots
import com.emergetools.snapshots.SnapshotErrorType
import com.emergetools.snapshots.shared.ComposePreviewSnapshotConfig
import java.lang.reflect.Modifier
import java.lang.reflect.ParameterizedType

@Suppress("TooGenericExceptionCaught", "ThrowsCount")
fun snapshotComposable(
  snapshotRule: EmergeSnapshots,
  activity: PreviewActivity,
  previewConfig: ComposePreviewSnapshotConfig,
) {
  try {
    val klass = Class.forName(previewConfig.fullyQualifiedClassName)
    Log.d(
      EmergeComposeSnapshotReflectiveParameterizedInvoker.TAG,
      "Found class for ${previewConfig.fullyQualifiedClassName}: ${klass.name}"
    )
    val methodName = previewConfig.originalFqn.substringAfterLast(".")

    val previewProviderClass: Class<out PreviewParameterProvider<*>>? =
      previewConfig.previewParameter?.providerClassFqn?.let {
        val clazz = Class.forName(it)
        require(PreviewParameterProvider::class.java.isAssignableFrom(clazz)) {
          "Preview parameter provider class must implement PreviewParameterProvider"
        }
        clazz as Class<out PreviewParameterProvider<*>>
      }

    val composableMethod: ComposableMethod = previewProviderClass?.let { previewProvider ->
      Log.d(
        EmergeComposeSnapshotReflectiveParameterizedInvoker.TAG,
        "Looking for parameterized composable method: $methodName in class: ${klass.name}"
      )
      val providerType = previewProvider.genericInterfaces
        .filterIsInstance<ParameterizedType>()
        .firstOrNull { it.rawType == PreviewParameterProvider::class.java }
        ?.actualTypeArguments?.firstOrNull() as? Class<*> ?: throw IllegalArgumentException(
        "Unable to determine type argument for PreviewParameterProvider"
      )

      klass.getDeclaredComposableMethod(methodName, providerType)
    } ?: run {
      Log.d(
        EmergeComposeSnapshotReflectiveParameterizedInvoker.TAG,
        "Looking for composable method: $methodName in class: ${klass.name}"
      )
      klass.getDeclaredComposableMethod(methodName)
    }

    Log.d(
      EmergeComposeSnapshotReflectiveParameterizedInvoker.TAG,
      "Found composable method for ${previewConfig.originalFqn}: ${composableMethod.javaClass.simpleName}"
    )
    val backingMethod = composableMethod.asMethod()
    if (!backingMethod.isAccessible) {
      Log.i(
        EmergeComposeSnapshotReflectiveParameterizedInvoker.TAG,
        "Marking composable method as accessible: ${previewConfig.originalFqn}"
      )
      backingMethod.isAccessible = true
    }

    Log.d(
      EmergeComposeSnapshotReflectiveParameterizedInvoker.TAG,
      "Invoking composable method: ${backingMethod.name}"
    )

    // Fallback having a list of a single null item is intentional to ensure we run at least one iteration of previews
    val previewParams = previewProviderClass?.let {
      val params = getPreviewProviderParameters(it)
      val limit = previewConfig.previewParameter?.limit ?: params.size
      params.take(limit)
    } ?: listOf(null)

    Log.d(
      EmergeComposeSnapshotReflectiveParameterizedInvoker.TAG,
      "Found ${previewParams.size} preview parameters for ${previewConfig.originalFqn}"
    )

    snapshot(
      activity = activity,
      snapshotRule = snapshotRule,
      previewConfig = previewConfig,
      composableMethod = composableMethod,
      composableClass = klass,
      previewParams = previewParams,
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
  }
}

private fun getPreviewProviderParameters(
  parameterProviderClass: Class<out PreviewParameterProvider<*>>,
): List<Any?> {
  val constructor = parameterProviderClass.constructors
    .singleOrNull { it.parameterTypes.isEmpty() }
    ?.apply { isAccessible = true }
    ?: throw IllegalArgumentException(
      "PreviewParameterProvider constructor can not have parameters"
    )
  val params = constructor.newInstance() as PreviewParameterProvider<*>
  return params.values.toList()
}

private fun snapshot(
  activity: Activity,
  snapshotRule: EmergeSnapshots,
  composableMethod: ComposableMethod,
  composableClass: Class<*>,
  previewConfig: ComposePreviewSnapshotConfig,
  previewParams: List<Any?> = listOf(null),
) {
  previewParams.forEachIndexed { index, prevParam ->
    val composeView = ComposeView(activity)
    composeView.layoutParams =
      LayoutParams(LayoutParams.WRAP_CONTENT, LayoutParams.WRAP_CONTENT)

    Log.d(
      EmergeComposeSnapshotReflectiveParameterizedInvoker.TAG,
      "Invoking composable method with preview parameter: $prevParam"
    )
    val args = buildList {
      prevParam?.let(this::add)
      add(0)
    }.toTypedArray()

    val deviceSpec = configToDeviceSpec(previewConfig)

    val saveablePreviewConfig = previewConfig.copy(
      previewParameter = previewConfig.previewParameter?.copy(index = index)
    )

    // Update activity window size if device is specified
    if (deviceSpec != null) {
      updateActivityBounds(activity, deviceSpec)
    }

    composeView.setContent {
      SnapshotVariantProvider(previewConfig, deviceSpec?.scalingFactor) {
        @Suppress("SpreadOperator")
        if (Modifier.isStatic(composableMethod.asMethod().modifiers)) {
          // This is a top level or static method
          composableMethod.invoke(currentComposer, null, *args)
        } else {
          // The method is part of a class. We try to instantiate the class with an empty
          // constructor.
          val instance = composableClass.getConstructor().newInstance()
          composableMethod.invoke(currentComposer, instance, *args)
        }
      }
    }

    // Add the ComposeView to the activity
    activity.addContentView(
      composeView,
      LayoutParams(LayoutParams.WRAP_CONTENT, LayoutParams.WRAP_CONTENT)
    )

    composeView.post {
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
    }
  }
}

private fun measureViewSize(
  view: View,
  previewConfig: ComposePreviewSnapshotConfig
): IntSize {
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

  view.measure(widthMeasureSpec, heightMeasureSpec)
  return IntSize(view.measuredWidth, view.measuredHeight)
}

private fun updateActivityBounds(activity: Activity, deviceSpec: DeviceSpec) {
  // Apply the device spec dimensions to the activity window
  val width = deviceSpec.widthPixels
  val height = deviceSpec.heightPixels

  if (width > 0 && height > 0) {
    activity.window.setLayout(width, height)
  }
}

private fun dpToPx(dp: Int, scalingFactor: Float): Int {
  return (dp * scalingFactor).toInt()
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
