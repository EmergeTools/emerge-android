package PreviewProcessorTest.multipreview_function_with_two_previews_produces_two_snapshots.input

import androidx.compose.ui.tooling.preview.Preview

@Preview(
  name = "Small font",
  fontScale = 0.5f,
)
@Preview(
  name = "Large font",
  fontScale = 1.5f,
)
annotation class FontScalePreviews
