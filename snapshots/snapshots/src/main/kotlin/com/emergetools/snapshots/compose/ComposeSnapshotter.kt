package com.emergetools.snapshots.compose

import android.app.Activity
import android.graphics.Bitmap
import android.graphics.Canvas
import android.util.Log
import android.view.View
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
import kotlin.math.max

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
      "PreviewParameterProvider constructor can not" + " have parameters"
    )
  val params = constructor.newInstance() as PreviewParameterProvider<*>
  return params.values.toList()
}

const val DEFAULT_DENSITY_PPI = 160

private fun snapshot(
  activity: Activity,
  snapshotRule: EmergeSnapshots,
  composableMethod: ComposableMethod,
  composableClass: Class<*>,
  previewConfig: ComposePreviewSnapshotConfig,
  previewParams: List<Any?> = listOf(null),
) {
  val composeView = ComposeView(activity)
  composeView.layoutParams =
    LayoutParams(LayoutParams.WRAP_CONTENT, LayoutParams.WRAP_CONTENT)

  previewParams.forEachIndexed { index, prevParam ->
    val args = buildList {
      prevParam?.let(this::add)
      add(0)
    }.toTypedArray()

    composeView.setContent {
      SnapshotVariantProvider(previewConfig) {
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

    activity.setContentView(composeView)

    // Need to update to accommodate param index in case when preview param is present
    val saveablePreviewConfig = previewConfig.copy(
      previewParameter = previewConfig.previewParameter?.copy(index = index)
    )

    composeView.post {
      // Measure the composable agnostic of the parent constraints to layout properly in activity
      val composableSize = measureComposableSize(composeView, saveablePreviewConfig)
      val bitmap = captureBitmap(
        view = composeView,
        width = composableSize.width,
        height = composableSize.height,
      )
      bitmap?.let {
        snapshotRule.take(bitmap, saveablePreviewConfig)
      } ?: run {
        snapshotRule.saveError(
          errorType = SnapshotErrorType.EMPTY_SNAPSHOT,
          composePreviewSnapshotConfig = saveablePreviewConfig,
        )
      }
    }
  }
}

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
