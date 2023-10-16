package com.emergetools.snapshots.featurea.ui

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.emergetools.snapshots.sample.ui.FontScalePreviews
import com.emergetools.snapshots.sample.ui.Header

@Composable
fun CustomScreen() {
  Column(
    modifier = Modifier
      .fillMaxSize()
  ) {
    Header(title = "Custom Screen Header")

    // Add more composables or content specific to your CustomScreen here
    Text(
      text = "Welcome to Custom Screen",
      fontSize = 24.sp,
      modifier = Modifier
        .fillMaxWidth()
        .padding(16.dp)
    )
  }
}

@FontScalePreviews
@Composable
fun CustomScreenPreview() {
  CustomScreen()
}
