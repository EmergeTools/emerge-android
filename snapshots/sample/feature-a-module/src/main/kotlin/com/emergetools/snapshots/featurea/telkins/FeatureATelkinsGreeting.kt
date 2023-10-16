package com.emergetools.snapshots.featurea.telkins

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.emergetools.snapshots.sample.ui.SnapshotTestingPreview

@Composable
fun FeatureATelkinsGreeting(name: String, modifier: Modifier = Modifier) {
  Text(
    text = "Hello $name!",
    modifier = modifier
  )
}

// Will not be included in the snapshot since it's in main source set
@SnapshotTestingPreview
@Composable
fun GreetingPreviewFromFeatureATelkinsGreetingModuleMain() {
  FeatureATelkinsGreeting("Feature A Module Main")
}
