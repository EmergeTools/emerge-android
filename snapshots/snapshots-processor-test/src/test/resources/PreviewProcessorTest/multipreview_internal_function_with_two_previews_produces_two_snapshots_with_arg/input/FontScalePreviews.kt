package PreviewProcessorTest.multipreview_internal_function_with_two_previews_produces_two_snapshots_with_arg.input

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
