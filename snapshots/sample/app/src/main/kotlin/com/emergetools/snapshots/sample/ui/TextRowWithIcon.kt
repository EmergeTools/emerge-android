package com.emergetools.snapshots.sample.ui

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.res.stringResource
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
@Preview(locale = "es-rES")
@LocalePreviews
@FontScalePreviews
@Composable
fun TextRowWithIconPreviewFromMain() {
  TextRowWithIcon(
    titleText = stringResource(com.emergetools.snapshots.sample.R.string.sample_title),
    subtitleText = stringResource(com.emergetools.snapshots.sample.R.string.sample_subtitle)
  )
}

@Preview
@Composable
internal fun TextRowWithIconPreviewFromMainInternalFunction() {
  TextRowWithIcon(
    titleText = stringResource(com.emergetools.snapshots.sample.R.string.sample_title),
    subtitleText = stringResource(com.emergetools.snapshots.sample.R.string.sample_subtitle)
  )
}

@SnapshotTestingPreview
@Composable
internal fun TextRowWithIconPreviewFromMainInternalFunctionMultiPreview() {
  TextRowWithIcon(
    titleText = stringResource(com.emergetools.snapshots.sample.R.string.sample_title),
    subtitleText = stringResource(com.emergetools.snapshots.sample.R.string.sample_subtitle)
  )
}

@SnapshotTestingPreview
@Composable
private fun TextRowWithIconPreviewFromMainPrivateFunctionMultiPreview() {
  TextRowWithIcon(
    titleText = stringResource(com.emergetools.snapshots.sample.R.string.sample_title),
    subtitleText = stringResource(com.emergetools.snapshots.sample.R.string.sample_subtitle)
  )
}

@LocalePreviews
@FontScalePreviews
@Composable
fun TextRowWithIconPreviewFromMainJustStackedMultiPreview() {
  TextRowWithIcon(
    titleText = stringResource(com.emergetools.snapshots.sample.R.string.sample_title),
    subtitleText = stringResource(com.emergetools.snapshots.sample.R.string.sample_subtitle)
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
