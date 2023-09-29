package PreviewProcessorTest.stacked_multipreview_five_total_previews_produces_five_snapshots.input

import android.content.res.Configuration
import androidx.compose.ui.tooling.preview.Preview

@Preview(
  name = "Light",
  group = "UIMode",
  uiMode = Configuration.UI_MODE_NIGHT_NO,
)
@Preview(
  name = "Dark",
  group = "UIMode",
  uiMode = Configuration.UI_MODE_NIGHT_YES,
)
annotation class UIModeVariants
