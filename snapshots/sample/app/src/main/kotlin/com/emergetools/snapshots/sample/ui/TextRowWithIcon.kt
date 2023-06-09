package com.emergetools.snapshots.sample.ui

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun TextRowWithIcon(
  titleText: String,
  subtitleText: String?,
) {
  Column {
    Text(
      text = titleText,
    )
    subtitleText?.let {
      Text(
        text = subtitleText,
      )
    }
  }
}

// Should not be snapshotted as this is in the main source set
@Preview
@Preview(
  fontScale = 1.5f
)
@Composable
fun TextRowWithIconPreviewFromMain() {
  TextRowWithIcon(
    titleText = "Title",
    subtitleText = "Subtitle"
  )
}
