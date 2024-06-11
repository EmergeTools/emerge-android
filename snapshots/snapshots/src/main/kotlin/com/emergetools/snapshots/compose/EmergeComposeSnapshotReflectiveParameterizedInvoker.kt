package com.emergetools.snapshots.compose

import android.util.Log
import androidx.activity.ComponentActivity
import androidx.test.ext.junit.rules.ActivityScenarioRule
import androidx.test.platform.app.InstrumentationRegistry
import com.emergetools.snapshots.EmergeSnapshots
import com.emergetools.snapshots.shared.ComposePreviewSnapshotConfig
import com.emergetools.snapshots.shared.ComposeSnapshots
import kotlinx.serialization.json.Json
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
    override fun toString(): String = previewConfig.keyName()
  }

  companion object {
    const val TAG = "EmergeComposeSnapshotReflectiveParameterizedInvoker"
    const val ARG_REFLECTIVE_INVOKE_DATA_PATH = "invoke_data_path"

    @JvmStatic
    @Parameterized.Parameters(name = "{index} {0}")
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

      val json = Json {
        ignoreUnknownKeys = true
      }

      return json.decodeFromString<ComposeSnapshots>(invokeDataFile.readText()).snapshots.map {
        EmergeComposeSnapshotReflectiveParameters(it)
      }
    }
  }

  @get:Rule
  val scenarioRule = ActivityScenarioRule(ComponentActivity::class.java)

  @get:Rule
  val snapshotRule: EmergeSnapshots = EmergeSnapshots()

  @Test
  fun reflectiveComposableInvoker() {
    val previewConfig = parameter.previewConfig
    scenarioRule.scenario.onActivity { activity ->
      snapshotComposable(snapshotRule, activity, previewConfig)
    }
  }
}
