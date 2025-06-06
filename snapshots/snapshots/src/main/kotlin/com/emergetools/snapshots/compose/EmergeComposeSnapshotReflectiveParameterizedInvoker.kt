package com.emergetools.snapshots.compose

import android.content.pm.ApplicationInfo
import android.util.Log
import androidx.compose.ui.tooling.PreviewActivity
import androidx.test.ext.junit.rules.ActivityScenarioRule
import androidx.test.platform.app.InstrumentationRegistry
import com.emergetools.snapshots.EmergeSnapshots
import com.emergetools.snapshots.models.ComposePreviewSnapshotConfig
import com.emergetools.snapshots.models.ComposeSnapshots
import com.emergetools.snapshots.util.Profiler
import com.squareup.moshi.Moshi
import com.squareup.moshi.adapter
import com.squareup.moshi.kotlin.reflect.KotlinJsonAdapterFactory
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith
import org.junit.runners.Parameterized
import java.io.File

@RunWith(Parameterized::class)
class EmergeComposeSnapshotReflectiveParameterizedInvoker(
  private val parameter: EmergeComposeSnapshotReflectiveParameters,
) {

  // Wrapper class to give us better parameterized test naming
  data class EmergeComposeSnapshotReflectiveParameters(
    val previewConfig: ComposePreviewSnapshotConfig,
  ) {
    // AndroidTestOrchestrator requires a max name of ~127 from trial/error inclusive of
    // EmergeComposeSnapshotReflectiveParameterizedInvoker.reflectiveComposableInvoker[12345_].
    // This gives us a max limit of ~40 characters for the parameter name, which we'll trim to
    // be safe and for best debuggability so we can at least see a bit of the keyName.
    // Different issues online have presented different limits, so we'll be conservative here.
    // https://github.com/android/android-test/issues/1935 is one reference issue
    override fun toString(): String {
      val key = previewConfig.keyName(baseKey = previewConfig.functionName)
      if (key.length > MAX_PARAM_NAME_LENGTH) {
        return key.substring(
          0,
          MAX_PARAM_NAME_LENGTH - ELLIPSIS_SIZE
        ) + ".".repeat(ELLIPSIS_SIZE)
      }
      return key
    }
  }

  companion object {
    const val TAG = "EmergeComposeSnapshotReflectiveParameterizedInvoker"
    const val ARG_REFLECTIVE_INVOKE_DATA_PATH = "invoke_data_path"
    const val ELLIPSIS_SIZE = 3
    const val MAX_PARAM_NAME_LENGTH = 40

    @OptIn(ExperimentalStdlibApi::class)
    @JvmStatic
    @Parameterized.Parameters(name = "{index}_{0}")
    fun data(): Iterable<EmergeComposeSnapshotReflectiveParameters> {
      val args = InstrumentationRegistry.getArguments()

      val invokeDataPath = args.getString(ARG_REFLECTIVE_INVOKE_DATA_PATH) ?: run {
        Log.w(TAG, "Missing invoke_data_path arg")
        return emptyList()
      }

      val invokeDataFile = File(invokeDataPath)
      if (!invokeDataFile.exists()) {
        error("Unable to find file at $invokeDataPath")
      }

      val moshi = Moshi.Builder()
        .add(KotlinJsonAdapterFactory())
        .build()
      val adapter = moshi.adapter<List<ComposePreviewSnapshotConfig>>()

      val fileContent = invokeDataFile.readText()
      @Suppress("TooGenericExceptionCaught")
      return try {
        // First try to parse directly as List<ComposePreviewSnapshotConfig>
        adapter.fromJson(invokeDataFile.readText())!!.map {
          EmergeComposeSnapshotReflectiveParameters(it)
        }
      } catch (e: Exception) {
        // Fallback to parsing as ComposeSnapshots
        Log.d(TAG, "Failed to parse as List<ComposePreviewSnapshotConfig>, falling back to ComposeSnapshots", e)
        moshi.adapter<ComposeSnapshots>().fromJson(fileContent)!!.snapshots.map {
          EmergeComposeSnapshotReflectiveParameters(it)
        }
      }
    }
  }

  @get:Rule
  val scenarioRule = ActivityScenarioRule(PreviewActivity::class.java)

  @get:Rule
  val snapshotRule: EmergeSnapshots = EmergeSnapshots()

  @get:Rule
  val profiler = Profiler.getInstance(parameter.previewConfig)

  @Test
  fun reflectiveComposableInvoker() {
    Profiler.startSpan("reflectiveComposableInvoker")
    Log.i(TAG, "Running snapshot test ${parameter.previewConfig.keyName()}")
    // Force application to be debuggable to ensure PreviewActivity doesn't early exit
    val applicationInfo = InstrumentationRegistry.getInstrumentation().targetContext.applicationInfo
    applicationInfo.flags = applicationInfo.flags or ApplicationInfo.FLAG_DEBUGGABLE

    val previewConfig = parameter.previewConfig
    scenarioRule.scenario.onActivity { activity ->
      snapshotComposable(snapshotRule, activity, previewConfig)
    }
    Profiler.endSpan()
  }
}
