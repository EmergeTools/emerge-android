@file:Suppress("TooManyFunctions")

package com.emergetools.snapshots.sample.ui

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Devices
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.emergetools.snapshots.runtime.LocalEmergeSnapshotMode
import com.emergetools.snapshots.runtime.annotations.EmergeSnapshotConfig
import com.emergetools.snapshots.sample.ui.theme.SnapshotsSampleTheme

@Composable
fun TextRowWithIcon(
  titleText: String,
  subtitleText: String?,
) {
  Column(Modifier.width(150.dp)) {
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

@Suppress("UnusedPrivateMember")
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
@EmergeSnapshotConfig(
  ignore = true,
)
@Composable
fun TextRowWithIconPreviewFromMainIgnored() {
  TextRowWithIcon(
    titleText = "Title (ignored)",
    subtitleText = "Subtitle (ignored)"
  )
}

@Preview
@EmergeSnapshotConfig(
  precision = .95f,
)
@Composable
fun TextRowWithIconPreviewFromMainPrecision() {
  TextRowWithIcon(
    titleText = "Title (precision)",
    subtitleText = "Subtitle (precision)"
  )
}

@Preview(
  backgroundColor = 0xFF00FF00,
  showBackground = true,
)
@Preview(
  name = "No showBackground set",
  backgroundColor = 0xFF00FF00,
)
@Preview(
  name = "No bg color set",
  showBackground = true,
)
@Composable
fun TextRowWithIconPreviewFromMainBg() {
  SnapshotsSampleTheme {
    val titleText = if (LocalEmergeSnapshotMode.current) {
      "Emerge Snapshot title"
    } else {
      "Title"
    }
    TextRowWithIcon(
      titleText = titleText,
      subtitleText = "Subtitle"
    )
  }
}

@Preview(
  device = Devices.PIXEL,
)
@Preview(
  device = Devices.NEXUS_7_2013,
  showSystemUi = true,
)
@Preview(
  device = Devices.PIXEL_3,
  widthDp = 1000,
)
@Preview(
  device = Devices.PIXEL_3,
  fontScale = 2f,
  showSystemUi = true,
)
@Preview(
  device = Devices.PIXEL_TABLET,
  showSystemUi = true,
)
@Composable
fun TextRowWithIconPreviewFromMainDevices() {
  SnapshotsSampleTheme {
    TextRowWithIcon(
      titleText = "Title",
      subtitleText = "Subtitle"
    )
  }
}

// To ensure we properly handle a 0x0 snapshot
@Suppress("EmptyFunctionBlock")
@Preview
@Composable
fun EmptyPreview() {
}
