package com.emergetools.snapshots.sample.ui

import android.content.res.Configuration.UI_MODE_NIGHT_NO
import android.content.res.Configuration.UI_MODE_NIGHT_YES
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview

@Preview(uiMode = UI_MODE_NIGHT_YES)
@Preview(uiMode = UI_MODE_NIGHT_NO)
@Composable
fun ThemedComponent() {
  val backgroundColor = LocalContext.current.resources.getColor(
    com.emergetools.snapshots.sample.R.color.background_color, null)
  val textColor = LocalContext.current.resources.getColor(
    com.emergetools.snapshots.sample.R.color.text_color, null)

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