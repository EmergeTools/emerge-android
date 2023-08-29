package com.emergetools.android.standalone_preview_function_compiles_ok

import androidx.compose.runtime.Composable
import androidx.compose.ui.test.junit4.ComposeContentTestRule
import androidx.compose.ui.test.junit4.createComposeRule
import androidx.test.ext.junit.runners.AndroidJUnit4
import com.emergetools.android.standalone_preview_function_compiles_ok.TestComposable2
import com.emergetools.snapshots.EmergeSnapshots
import com.emergetools.snapshots.compose.SnapshotVariantProvider
import com.emergetools.snapshots.shared.ComposePreviewSnapshotConfig
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
public class TestComposable2_GenSnapshot {
  @get:Rule
  public val composeRule: ComposeContentTestRule = createComposeRule()

  public val previewConfig: ComposePreviewSnapshotConfig = ComposePreviewSnapshotConfig(originalFqn
      = "com.emergetools.android.standalone_preview_function_compiles_ok.TestComposable2")

  @get:Rule
  public val snapshotRule: EmergeSnapshots = EmergeSnapshots()

  @Test
  public fun TestComposable2_GenSnapshot() {
    composeRule.setContent {
      SnapshotVariantProvider(previewConfig) {
        TestComposable2()
      }
    }
    snapshotRule.take(composeRule, previewConfig)
  }
}
