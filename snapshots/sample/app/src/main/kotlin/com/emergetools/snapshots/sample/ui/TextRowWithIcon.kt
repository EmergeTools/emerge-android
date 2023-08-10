package com.emergetools.snapshots.sample.ui

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.emergetools.snapshots.annotations.IgnoreEmergeSnapshot

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

// Should not be snapshotted as this is marked to be ignored
@Preview
@IgnoreEmergeSnapshot
@Composable
fun TextRowWithIconPreviewFromMainIgnored() {
  TextRowWithIcon(
    titleText = "Title (ignored)",
    subtitleText = "Subtitle (ignored)"
  )
}
