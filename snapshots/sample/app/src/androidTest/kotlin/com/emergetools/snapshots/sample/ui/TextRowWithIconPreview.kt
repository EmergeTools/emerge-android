package com.emergetools.snapshots.sample.ui

import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview

@Preview
@Preview(
  fontScale = 1.5f
)
@Composable
fun TextRowWithIconPreviewFromAndroidTest() {
  TextRowWithIcon(
    titleText = "Title",
    subtitleText = "Subtitle"
  )
}
