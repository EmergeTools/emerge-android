package com.emergetools.snapshots.compose

import androidx.compose.runtime.currentComposer
import androidx.compose.ui.test.junit4.ComposeContentTestRule
import androidx.compose.ui.test.junit4.createComposeRule
import androidx.test.ext.junit.runners.AndroidJUnit4
import androidx.test.platform.app.InstrumentationRegistry
import com.emergetools.snapshots.EmergeSnapshots
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
class EmergeComposeSnapshotReflectiveInvoker {

  private val args: ComposeSnapshotReflectiveSnapshotBatch
    get() {
      val args = InstrumentationRegistry.getArguments()
      return ComposeSnapshotReflectiveSnapshotBatch.fromArgs(args)
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
