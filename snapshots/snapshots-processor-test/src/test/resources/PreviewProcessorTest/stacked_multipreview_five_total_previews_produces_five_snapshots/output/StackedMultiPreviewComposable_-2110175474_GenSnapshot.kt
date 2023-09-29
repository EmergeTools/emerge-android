package PreviewProcessorTest.stacked_multipreview_five_total_previews_produces_five_snapshots.input

import PreviewProcessorTest.stacked_multipreview_five_total_previews_produces_five_snapshots.input.StackedMultiPreviewComposable
import androidx.compose.runtime.Composable
import androidx.compose.ui.test.junit4.ComposeContentTestRule
import androidx.compose.ui.test.junit4.createComposeRule
import androidx.test.ext.junit.runners.AndroidJUnit4
import com.emergetools.snapshots.EmergeSnapshots
import com.emergetools.snapshots.compose.SnapshotVariantProvider
import com.emergetools.snapshots.shared.ComposePreviewSnapshotConfig
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
public class `StackedMultiPreviewComposable_-2110175474_GenSnapshot` {
  @get:Rule
  public val composeRule: ComposeContentTestRule = createComposeRule()

  public val previewConfig: ComposePreviewSnapshotConfig = ComposePreviewSnapshotConfig(originalFqn
      =
      "PreviewProcessorTest.stacked_multipreview_five_total_previews_produces_five_snapshots.input.StackedMultiPreviewComposable",
      name = "Large font",
      group = "Font scale",
      fontScale = 1.5f)

  @get:Rule
  public val snapshotRule: EmergeSnapshots = EmergeSnapshots()

  @Test
  public fun StackedMultiPreviewComposable_GenSnapshot() {
    composeRule.setContent {
      SnapshotVariantProvider(previewConfig) {
        StackedMultiPreviewComposable()
      }
    }
    snapshotRule.take(composeRule, previewConfig)
  }
}
