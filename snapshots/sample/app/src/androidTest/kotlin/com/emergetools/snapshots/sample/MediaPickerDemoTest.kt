package com.emergetools.snapshots.sample

import androidx.compose.ui.test.junit4.ComposeContentTestRule
import androidx.compose.ui.test.junit4.createComposeRule
import androidx.test.ext.junit.runners.AndroidJUnit4
import com.emergetools.snapshots.EmergeSnapshots
import com.emergetools.snapshots.compose.SnapshotVariantProvider
import com.emergetools.snapshots.sample.ui.MediaPickerDemo
import com.emergetools.snapshots.shared.ComposePreviewSnapshotConfig
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

// This particular Composable was giving us trouble, so this is more an example of how we can
// reproduce the issue in our sample project, copy the generated test case, and debug it here.
@RunWith(AndroidJUnit4::class)
public class MediaPickerDemoTest {
  @get:Rule
  public val composeRule: ComposeContentTestRule = createComposeRule()

  public val previewConfig: ComposePreviewSnapshotConfig = ComposePreviewSnapshotConfig(originalFqn
  = "com.emergetools.snapshots.sample.ui.MediaPickerDemo")

  @get:Rule
  public val snapshotRule: EmergeSnapshots = EmergeSnapshots()

  @Test
  public fun MediaPickerDemo_GenSnapshot() {
    composeRule.setContent {
      SnapshotVariantProvider(previewConfig) {
        MediaPickerDemo()
      }
    }
    snapshotRule.take(composeRule, previewConfig)
  }
}
