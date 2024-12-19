package com.emergetools.snapshots.v2


import android.content.ComponentCallbacks2
import android.content.Context
import android.content.pm.ApplicationInfo
import android.content.res.Configuration
import android.util.Log
import androidx.compose.ui.tooling.PreviewActivity
import androidx.test.core.app.ApplicationProvider
import androidx.test.ext.junit.rules.ActivityScenarioRule
import androidx.test.platform.app.InstrumentationRegistry
import com.emergetools.snapshots.EmergeSnapshots
import com.emergetools.snapshots.shared.ComposeSnapshots
import kotlinx.coroutines.runBlocking
import kotlinx.serialization.json.Json
import org.junit.Before
import org.junit.Rule
import org.junit.Test
import java.io.File

class EmergeComposeSnapshotInvoker {

  companion object {
    const val TAG = "EmergeComposeSnapshotInvoker"
    const val ARG_REFLECTIVE_INVOKE_DATA_PATH = "invoke_data_path"
  }

  lateinit var testCaseContext: SnapshotTestCaseContext

  @get:Rule
  val scenarioRule = ActivityScenarioRule(PreviewActivity::class.java)

  @get:Rule
  val snapshotRule: EmergeSnapshots = EmergeSnapshots()

  @Before
  fun setup() {
    val context = ApplicationProvider.getApplicationContext<Context>()
    testCaseContext = object : SnapshotTestCaseContext {
      override val context: Context = context
      override val snapshotRule: EmergeSnapshots = this@EmergeComposeSnapshotInvoker.snapshotRule
      override val bitmapPool: BitmapPool = BitmapPool()
      override fun onActivity(callback: (PreviewActivity) -> Unit) {
        scenarioRule.scenario.onActivity(callback)
      }
    }
    scenarioRule.scenario.onActivity { activity ->
      activity.registerComponentCallbacks(object : ComponentCallbacks2 {
        override fun onConfigurationChanged(newConfig: Configuration) {}

        override fun onLowMemory() {
          testCaseContext.bitmapPool.clear()
        }

        override fun onTrimMemory(level: Int) {
          testCaseContext.bitmapPool.clear()
        }

      })
    }
  }

  @Test
  fun composableInvoker() = runBlocking {
    // Force application to be debuggable to ensure PreviewActivity doesn't early exit
    val applicationInfo = InstrumentationRegistry.getInstrumentation().targetContext.applicationInfo
    applicationInfo.flags = applicationInfo.flags or ApplicationInfo.FLAG_DEBUGGABLE

    val args = InstrumentationRegistry.getArguments()
    val invokeDataPath = args.getString(ARG_REFLECTIVE_INVOKE_DATA_PATH) ?: run {
      Log.w(TAG, "Missing invoke_data_path arg")
      return@runBlocking
    }

    val invokeDataFile = File(invokeDataPath)
    if (!invokeDataFile.exists()) {
      error("Unable to find file at $invokeDataPath")
    }

    val json = Json {
      ignoreUnknownKeys = true
    }

    val snapshots = json.decodeFromString<ComposeSnapshots>(invokeDataFile.readText()).snapshots

    snapshots.forEach { previewConfig ->
      Log.i(TAG, "Running snapshot test ${previewConfig.keyName()}")
      testCaseContext.snapshotComposable(previewConfig)
    }
  }
}
