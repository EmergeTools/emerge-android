package com.emergetools.snapshots.sample.ui

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.BoxWithConstraints
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Card
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Devices
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun PortraitLandscapeView() {
  BoxWithConstraints(modifier = Modifier.fillMaxSize()) {
    val aspectRatio = maxWidth / maxHeight

    // Repro of client case with different layouts for different screen sizes
    if (maxWidth < 840.dp) {
      Column(
        modifier = Modifier.fillMaxSize()
      ) {
        Box(
          modifier = Modifier
            .fillMaxWidth()
            .weight(1f)
            .background(Color.Blue)
        )

        Card(
          modifier = Modifier
            .fillMaxWidth()
            .weight(1f)
            .padding(16.dp)
        ) {
          Box(modifier = Modifier.fillMaxSize()) // Placeholder for card content
        }
      }
    } else {
      if (aspectRatio >= 2) {
        Row(
          modifier = Modifier.fillMaxSize()
        ) {
          Box(
            modifier = Modifier
              .weight(1f)
              .fillMaxHeight()
              .background(Color.Blue)
          )

          Card(
            modifier = Modifier
              .weight(1f)
              .fillMaxHeight()
              .padding(16.dp)
          ) {
            Box(modifier = Modifier.fillMaxSize()) // Placeholder for card content
          }
        }
      } else {
        Column(
          modifier = Modifier.fillMaxSize()
        ) {
          Box(
            modifier = Modifier
              .fillMaxWidth()
              .weight(1f)
              .background(Color.Blue)
          )

          Card(
            modifier = Modifier
              .fillMaxWidth()
              .weight(1f)
              .padding(16.dp)
          ) {
            Box(modifier = Modifier.fillMaxSize()) // Placeholder for card content
          }
        }
      }
    }
  }
}

@Preview(device = Devices.PIXEL_5)
@Preview(name = "Phone (Landscape)", device = "spec:width=430dp,height=860dp,orientation=landscape")
@Preview(name = "Phone (Portrait)", device = "spec:width=430dp,height=860dp")
@Composable
fun PortraitLandscapeViewPreview() {
  Surface {
    PortraitLandscapeView()
  }
}
