package com.emergetools.snapshots.sample.ui

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
  Text(
    text = "Hello $name!",
    modifier = modifier
  )
}

// Will not be included in the snapshot since it's in main sourceSet
@Preview
@Composable
fun GreetingPreviewFromMain() {
  Greeting("Main")
}
