package PreviewProcessorTest.multipreview_function_with_two_previews_and_additional_preview_produces_three_snapshots.input

import PreviewProcessorTest.multipreview_function_with_two_previews_and_additional_preview_produces_three_snapshots.input.MultiPreviewComposable
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
public class MultiPreviewComposable_GenSnapshot {
  @get:Rule
  public val composeRule: ComposeContentTestRule = createComposeRule()

  public val previewConfig: ComposePreviewSnapshotConfig = ComposePreviewSnapshotConfig(originalFqn
      =
      "PreviewProcessorTest.multipreview_function_with_two_previews_and_additional_preview_produces_three_snapshots.input.MultiPreviewComposable")

  @get:Rule
  public val snapshotRule: EmergeSnapshots = EmergeSnapshots()

  @Test
  public fun MultiPreviewComposable_GenSnapshot() {
    composeRule.setContent {
      SnapshotVariantProvider(previewConfig) {
        MultiPreviewComposable()
      }
    }
    snapshotRule.take(composeRule, previewConfig)
  }
}
