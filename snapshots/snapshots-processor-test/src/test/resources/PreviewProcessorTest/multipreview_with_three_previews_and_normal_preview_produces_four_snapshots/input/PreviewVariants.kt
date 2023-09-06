package PreviewProcessorTest.multipreview_with_three_previews_and_normal_preview_produces_four_snapshots.input

import android.content.res.Configuration
import androidx.compose.ui.tooling.preview.Preview

@Preview(
  name = "Default",
  group = "Default",
)
@Preview(
  name = "Dark Mode",
  group = "Dark Mode",
  uiMode = Configuration.UI_MODE_NIGHT_YES,
)
@Preview(
  name = "Large Font",
  group = "Large Font",
  fontScale = 1.5f,
)
annotation class PreviewVariants
