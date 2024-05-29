package com.emergetools.snapshots.compose

import android.util.Log
import androidx.compose.runtime.Composer
import androidx.compose.runtime.currentComposer
import androidx.compose.ui.test.junit4.ComposeContentTestRule
import androidx.compose.ui.test.junit4.createComposeRule
import androidx.test.platform.app.InstrumentationRegistry
import com.emergetools.snapshots.EmergeSnapshots
import com.emergetools.snapshots.SnapshotType.COMPOSABLE
import com.emergetools.snapshots.shared.ComposePreviewSnapshotConfig
import com.emergetools.snapshots.shared.ComposeSnapshots
import kotlinx.serialization.json.Json
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith
import org.junit.runners.Parameterized
import java.io.File

@RunWith(Parameterized::class)
class EmergeComposeSnapshotReflectiveParameterizedInvoker(private val parameter: EmergeComposeSnapshotReflectiveParameters) {

  // Wrapper class to give us better parameterized test naming
  data class EmergeComposeSnapshotReflectiveParameters(
    val previewConfig: ComposePreviewSnapshotConfig
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
  val composeRule: ComposeContentTestRule = createComposeRule()

  @get:Rule
  val snapshotRule: EmergeSnapshots = EmergeSnapshots()

  @Test
  @Suppress("TooGenericExceptionCaught")
  fun reflectiveComposableInvoker() {
    val previewConfig = parameter.previewConfig
    try {
      composeRule.setContent {
        val klass = Class.forName(previewConfig.fullyQualifiedClassName)
        Log.d(TAG, "Found class for ${previewConfig.fullyQualifiedClassName}: ${klass.name}")
        val methodName = previewConfig.originalFqn.substringAfterLast(".")
        val composableMethod = klass.methods.find {
          Log.d(TAG, "Checking method in class ${klass.name}: ${it.name}")
          it.name == methodName
        } ?: klass.getDeclaredMethod(methodName, Composer::class.java, Int::class.javaPrimitiveType)

        if (composableMethod != null && !composableMethod.isAccessible) {
          Log.e(TAG, "Marking composable method as accessible: ${previewConfig.originalFqn}")
          composableMethod.isAccessible = true
        }

        Log.d(TAG, "Invoking composable method: ${composableMethod?.name}")

        composableMethod?.let {
          it.isAccessible = true
          SnapshotVariantProvider(previewConfig) {
            it.invoke(null, currentComposer, 0)
          }
        } ?: error("Unable to find composable method: ${previewConfig.originalFqn}")
      }
      snapshotRule.take(composeRule, previewConfig)
    } catch (e: Exception) {
      Log.e(TAG, "Error invoking composable method", e)
      snapshotRule.saveError(COMPOSABLE, previewConfig)
      // Re-throw to fail the test
      throw e
    }
  }
}
