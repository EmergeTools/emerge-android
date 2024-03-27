package com.emergetools.snapshots.compose

import androidx.compose.runtime.currentComposer
import androidx.compose.ui.test.junit4.ComposeContentTestRule
import androidx.compose.ui.test.junit4.createComposeRule
import androidx.test.ext.junit.runners.AndroidJUnit4
import androidx.test.platform.app.InstrumentationRegistry
import com.emergetools.snapshots.shared.ComposeSnapshots
import com.emergetools.snapshots.EmergeSnapshots
import kotlinx.serialization.json.Json
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith
import java.io.File

@RunWith(AndroidJUnit4::class)
class EmergeComposeSnapshotReflectiveInvoker {

  companion object {
    const val ARG_INVOKE_DATA_PATH = "invoke_data_path"
  }

  private val args: ComposeSnapshots
    get() {
      val args = InstrumentationRegistry.getArguments()

      val invokeDataPath = args.getString(ARG_INVOKE_DATA_PATH) ?: throw IllegalArgumentException("Missing invoke_data_path arg")

      val invokeDataFile = File(invokeDataPath)
      if (!invokeDataFile.exists()) {
        error("Unable to find file at $invokeDataPath")
      }

      val json = Json {
        ignoreUnknownKeys = true
      }

      return json.decodeFromString<ComposeSnapshots>(invokeDataFile.readText())
    }

  @get:Rule
  val composeRule: ComposeContentTestRule = createComposeRule()

  @get:Rule
  val snapshotRule: EmergeSnapshots = EmergeSnapshots()

  @Test
  fun reflectiveComposableInvoker() {
    args.snapshots.forEach { previewConfig ->
      composeRule.setContent {
        val klass = Class.forName(previewConfig.originalFqn.substringBeforeLast("."))
        val composableMethod = klass.methods.find { it.name == previewConfig.originalFqn.substringAfterLast(".") }

        composableMethod?.let {
          it.isAccessible = true
          SnapshotVariantProvider(previewConfig) {
            // later versions of compose added some int arguments for whether the compose updated
            it.invoke(null, currentComposer, 0)
          }
        }
      }
      snapshotRule.take(composeRule, previewConfig)
    }
  }
}
