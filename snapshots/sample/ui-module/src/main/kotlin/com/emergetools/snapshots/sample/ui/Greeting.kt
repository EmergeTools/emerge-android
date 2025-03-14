package com.emergetools.snapshots.sample.ui

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.wear.compose.ui.tooling.preview.WearPreviewLargeRound
import androidx.wear.compose.ui.tooling.preview.WearPreviewSmallRound
import androidx.wear.compose.ui.tooling.preview.WearPreviewSquare

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
  Text(
    text = "Hello $name!",
    modifier = modifier
  )
}

// Will not be included in the snapshot since it's in main source set
@Preview
@Composable
fun GreetingPreviewFromMain() {
  Greeting("Main")
}

@WearPreviewSquare
@WearPreviewLargeRound
@WearPreviewSmallRound
@Composable
fun MyWearDevicesPreview() {
  Greeting("Wear OS")
}
