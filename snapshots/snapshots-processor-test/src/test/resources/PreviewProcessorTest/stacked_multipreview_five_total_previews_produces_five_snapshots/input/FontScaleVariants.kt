package PreviewProcessorTest.stacked_multipreview_five_total_previews_produces_five_snapshots.input

import androidx.compose.ui.tooling.preview.Preview

@Preview(
  name = "Normal font",
  group = "Font scale",
  fontScale = 1f,
)
@Preview(
  name = "Large font",
  group = "Font scale",
  fontScale = 1.5f,
)
@Preview(
  name = "Small font",
  group = "Font scale",
  fontScale = .5f,
)
annotation class FontScaleVariants
