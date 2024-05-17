package com.emergetools.snapshots.compose

import android.util.Log
import androidx.compose.runtime.currentComposer
import androidx.compose.ui.test.junit4.ComposeContentTestRule
import androidx.compose.ui.test.junit4.createComposeRule
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
class EmergeComposeSnapshotReflectiveParameterizedInvoker(private val previewConfig: ComposePreviewSnapshotConfig) {
  companion object {
    const val TAG = "EmergeComposeSnapshotReflectiveParameterizedInvoker"
    const val ARG_REFLECTIVE_INVOKE_DATA_PATH = "invoke_data_path"

    @JvmStatic
    @Parameterized.Parameters
    fun data(): Iterable<ComposePreviewSnapshotConfig> {
      val args = InstrumentationRegistry.getArguments()

      val invokeDataPath = args.getString(ARG_REFLECTIVE_INVOKE_DATA_PATH) ?: throw IllegalArgumentException(
        "Missing invoke_data_path arg"
      )

      val invokeDataFile = File(invokeDataPath)
      if (!invokeDataFile.exists()) {
        error("Unable to find file at $invokeDataPath")
      }

      val json = Json {
        ignoreUnknownKeys = true
      }

      return json.decodeFromString<ComposeSnapshots>(invokeDataFile.readText()).snapshots
    }
  }

  @get:Rule
  val composeRule: ComposeContentTestRule = createComposeRule()

  @get:Rule
  val snapshotRule: EmergeSnapshots = EmergeSnapshots()

  @Test
  fun reflectiveComposableInvoker() {
    composeRule.setContent {
      val klass = Class.forName(previewConfig.fullyQualifiedClassName)
      val composableMethod = klass.methods.find {
        it.name == previewConfig.originalFqn.substringAfterLast(".")
      }

      Log.d(TAG, "Invoking composable method: $composableMethod")

      composableMethod?.let {
        it.isAccessible = true
        SnapshotVariantProvider(previewConfig) {
          it.invoke(null, currentComposer, 0)
        }
      } ?: run {
        // TODO: Ryan look to write error to file for better debugging
        error("Unable to find composable method: ${previewConfig.originalFqn}")
      }
    }
    snapshotRule.take(composeRule, previewConfig)
  }
}
