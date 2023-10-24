package com.emergetools.snapshots.sample.ui

import android.net.Uri
import androidx.activity.compose.rememberLauncherForActivityResult
import androidx.activity.result.contract.ActivityResultContract
import androidx.activity.result.contract.ActivityResultContracts
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
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

@LocalePreviews
@FontScalePreviews
@Composable
fun TextRowWithIconPreviewFromMainJustStackedMultiPreview() {
  TextRowWithIcon(
    titleText = stringResource(com.emergetools.snapshots.sample.R.string.sample_title),
    subtitleText = stringResource(com.emergetools.snapshots.sample.R.string.sample_subtitle)
  )
}

@SnapshotTestingPreview
@Composable
fun TextRowWithIconPreviewFromMainJustSnapshotTestingPreview() {
  TextRowWithIcon(
    titleText = "Title SnapshotTestingPreview",
    subtitleText = "Subtitle SnapshotTestingPreview"
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
