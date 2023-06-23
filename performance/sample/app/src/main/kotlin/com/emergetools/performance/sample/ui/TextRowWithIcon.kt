package com.emergetools.performance.sample.ui

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

// Should not be snapshotted as this is in the main sourceSet
@Preview
@Composable
fun TextRowWithIconPreview() {
  TextRowWithIcon(
    titleText = "Title",
    subtitleText = "Subtitle"
  )
}
