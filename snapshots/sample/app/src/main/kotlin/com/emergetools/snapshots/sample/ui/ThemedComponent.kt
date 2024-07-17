package com.emergetools.snapshots.sample.ui

import android.content.res.Configuration.UI_MODE_NIGHT_NO
import android.content.res.Configuration.UI_MODE_NIGHT_YES
import androidx.compose.foundation.Canvas
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Devices
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.tooling.preview.PreviewLightDark
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.emergetools.snapshots.annotations.EmergeAppStoreSnapshot
import com.emergetools.snapshots.sample.ui.theme.SnapshotsSampleTheme

@PreviewLightDark
@Composable
fun ThemedComponent() {
  val backgroundColor = LocalContext.current.resources.getColor(
    com.emergetools.snapshots.sample.R.color.background_color,
    null
  )
  val textColor = LocalContext.current.resources.getColor(
    com.emergetools.snapshots.sample.R.color.text_color,
    null
  )

  Box(
    modifier = Modifier
      .fillMaxSize()
      .background(color = Color(backgroundColor))
  ) {
    Text(
      text = "This is a themed component",
      color = Color(textColor),
      modifier = Modifier.align(Alignment.Center)
    )
  }
}

@Preview(name = "tall", heightDp = 1000)
@Preview(name = "tall sysui", heightDp = 1000, showSystemUi = true)
@Preview(name = "wide", widthDp = 1000)
@Preview(
  name = "tall and wide",
  widthDp = 1000,
  heightDp = 1000
)
@Preview(uiMode = UI_MODE_NIGHT_YES)
@Preview(uiMode = UI_MODE_NIGHT_NO)
@Composable
fun MaterialThemedComponent() {
  SnapshotsSampleTheme {
    Box(
      modifier = Modifier
        .fillMaxSize()
        .background(color = MaterialTheme.colorScheme.background)
    ) {
      Text(
        text = "This is a themed component",
        color = MaterialTheme.colorScheme.primary,
        modifier = Modifier.align(Alignment.Center)
      )
    }
  }
}

@Composable
fun SampleShapeWithText() {
  Box(
    modifier = Modifier
      .fillMaxSize()
      .background(Color.LightGray)
  ) {
    Canvas(modifier = Modifier.fillMaxSize()) {
      val centerX = size.width / 2
      val centerY = size.height / 2
      val radius = size.width / 4

      drawCircle(
        color = Color.Blue,
        center = Offset(centerX, centerY),
        radius = radius
      )
    }

    Text(
      text = "Welcome to My App!",
      color = Color.Yellow,
      fontSize = 24.sp,
      fontWeight = FontWeight.Bold,
      modifier = Modifier.align(Alignment.Center)
    )

    Text(
      text = "Powered by Jetpack Compose",
      color = Color.LightGray,
      fontSize = 16.sp,
      modifier = Modifier
        .align(Alignment.BottomCenter)
        .padding(bottom = 16.dp)
    )
  }
}

@Preview(showBackground = true, device = Devices.PIXEL, showSystemUi = true)
@Preview(showBackground = true, device = Devices.TABLET, showSystemUi = true)
@EmergeAppStoreSnapshot
@Composable
fun SampleShapeWithTextPreview() {
  SnapshotsSampleTheme {
    SampleShapeWithText()
  }
}
