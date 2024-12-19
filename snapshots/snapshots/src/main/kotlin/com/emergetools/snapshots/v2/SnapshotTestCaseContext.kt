package com.emergetools.snapshots.v2

import android.content.Context
import android.content.MutableContextWrapper
import android.graphics.Canvas
import android.util.Log
import android.view.View
import android.view.ViewGroup
import android.view.ViewGroup.LayoutParams
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.currentComposer
import androidx.compose.runtime.getValue
import androidx.compose.ui.platform.ComposeView
import androidx.compose.ui.tooling.PreviewActivity
import com.emergetools.snapshots.EmergeSnapshots
import com.emergetools.snapshots.SnapshotErrorType
import com.emergetools.snapshots.compose.ComposableInvoker
import com.emergetools.snapshots.compose.SnapshotVariantProvider
import com.emergetools.snapshots.compose.configToDeviceSpec
import com.emergetools.snapshots.compose.previewparams.PreviewParamUtils
import com.emergetools.snapshots.shared.ComposePreviewSnapshotConfig
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.first
import kotlinx.coroutines.suspendCancellableCoroutine
import kotlinx.coroutines.withContext
import kotlin.coroutines.resume


interface SnapshotTestCaseContext {
  val context: Context
  val snapshotRule: EmergeSnapshots
  val bitmapPool: BitmapPool
  fun onActivity(callback: (PreviewActivity) -> Unit)
}

/**
 * Use this to signal that the composition is not ready to be snapshot yet.
 * This use useful if you are using things like `rememberLottieComposition` which parses a composition asynchronously.
 */
//val LocalSnapshotReady = compositionLocalOf { MutableStateFlow<Boolean?>(true) }

suspend fun SnapshotTestCaseContext.snapshotComposable(
  previewConfig: ComposePreviewSnapshotConfig,
) = withContext(Dispatchers.Default) {
  val previewParameters =
    PreviewParamUtils.getPreviewProviderParameters(previewConfig) ?: arrayOf<Any?>(null)

  val deviceSpec = configToDeviceSpec(previewConfig)

  for (index in previewParameters.indices) {
    val prevParam = previewParameters[index]
    Log.d(
      "EmergeComposeSnapshotInvoker (V2)",
      "Invoking composable method with preview parameter: $prevParam"
    )
    val mutableContext = MutableContextWrapper(context)
    val composeView = ComposeView(mutableContext)
    composeView.layoutParams = LayoutParams(LayoutParams.WRAP_CONTENT, LayoutParams.WRAP_CONTENT)
    val args = if (prevParam != null) arrayOf(prevParam) else emptyArray()

    val saveablePreviewConfig = previewConfig.copy(
      previewParameter = previewConfig.previewParameter?.copy(index = index)
    )

    // Update activity window size if device is specified
    val readyFlow = MutableStateFlow<Boolean?>(null)
    composeView.setContent {
      SnapshotVariantProvider(previewConfig, deviceSpec?.scalingFactor) {
        ComposableInvoker.invokeComposable(
          className = previewConfig.fullyQualifiedClassName,
          methodName = previewConfig.originalFqn.substringAfterLast("."),
          composer = currentComposer,
          args = args,
        )
      }
      val readyFlowValue by readyFlow.collectAsState()
      LaunchedEffect(readyFlowValue) {
        if (readyFlowValue == null) {
          readyFlow.value = true
        }
      }
    }
    onActivity { activity ->
      if (deviceSpec != null) {
        updateActivityBounds(activity, deviceSpec)
      }
      mutableContext.baseContext = activity
      activity.addContentView(
        composeView,
        LayoutParams(LayoutParams.WRAP_CONTENT, LayoutParams.WRAP_CONTENT)
      )
    }
    readyFlow.first { it == true }
    composeView.awaitFrame()
    Log.d("SnapshotTestCaseContext", "Drawing ${previewConfig.keyName()}")

    // val size = measureViewSize(composeView, previewConfig)
    var bitmap = bitmapPool.acquire(composeView.width, composeView.height)
    var canvas = Canvas(bitmap)
    withContext(Dispatchers.Main) {
      composeView.draw(canvas)
    }
    bitmap?.let {
      snapshotRule.take(it, saveablePreviewConfig)
    } ?: run {
      snapshotRule.saveError(
        errorType = SnapshotErrorType.EMPTY_SNAPSHOT,
        composePreviewSnapshotConfig = saveablePreviewConfig
      )
    }
    bitmapPool.release(bitmap)

    onActivity { _ ->
      // Reset activity content view
      (composeView.parent as? ViewGroup)?.removeView(composeView)
    }
  }
}

private suspend fun View.awaitFrame() {
  suspendCancellableCoroutine { cont ->
    post {
      cont.resume(Unit)
    }
  }
}
