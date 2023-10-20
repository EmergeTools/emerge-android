package PreviewProcessorTest.standalone_preview_function_with_internal_preview_produces_one_snapshot_test_with_arg.input

import PreviewProcessorTest.standalone_preview_function_with_internal_preview_produces_one_snapshot_test_with_arg.input.TestComposable
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
public class TestComposable_GenSnapshot {
  @get:Rule
  public val composeRule: ComposeContentTestRule = createComposeRule()

  public val previewConfig: ComposePreviewSnapshotConfig = ComposePreviewSnapshotConfig(originalFqn
      =
      "PreviewProcessorTest.standalone_preview_function_with_internal_preview_produces_one_snapshot_test_with_arg.input.TestComposable")

  @get:Rule
  public val snapshotRule: EmergeSnapshots = EmergeSnapshots()

  @Test
  public fun TestComposable_GenSnapshot() {
    composeRule.setContent {
      SnapshotVariantProvider(previewConfig) {
        TestComposable()
      }
    }
    snapshotRule.take(composeRule, previewConfig)
  }
}
