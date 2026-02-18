package com.emergetools.snapshots.sample.ui

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalConfiguration
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun WindowInfoDisplay() {
  val configuration = LocalConfiguration.current

  Column(modifier = Modifier.padding(16.dp)) {
    Text("LocalConfiguration.screenWidthDp:  ${configuration.screenWidthDp}dp")
    Text("LocalConfiguration.screenHeightDp: ${configuration.screenHeightDp}dp")
  }
}

// Validates that LocalConfiguration.screenWidthDp/screenHeightDp reflect the virtual device
// dimensions (1480x1080dp) rather than the real device's dimensions.
@Preview(
  name = "WindowInfo - 1480x1080dp tablet",
  device = "spec:width=1480dp,height=1080dp,dpi=240",
  showBackground = true,
)
@Composable
fun WindowInfoDisplayPreview() {
  Surface {
    WindowInfoDisplay()
  }
}
