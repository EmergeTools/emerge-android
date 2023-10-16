package com.emergetools.snapshots.featurea.ui

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun FeatureAGreeting(name: String, modifier: Modifier = Modifier) {
  Text(
    text = "Hello $name!",
    modifier = modifier
  )
}

// Will not be included in the snapshot since it's in main source set
@Preview
@Composable
fun GreetingPreviewFromFeatureAModuleMain() {
  FeatureAGreeting("Feature A Module Main")
}
