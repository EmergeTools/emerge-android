package com.emergetools.snapshots.sample.ui

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

@Composable
fun Header(title: String) {
  Box(
    modifier = Modifier
      .fillMaxWidth()
      .background(Color.Gray)
  ) {
    Text(
      text = title,
      color = Color.White,
      modifier = Modifier
        .padding(16.dp)
    )
  }
}
