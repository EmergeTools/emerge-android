package com.emergetools.performance.sample

import android.os.Bundle
import android.os.Trace
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import com.emergetools.performance.sample.ui.TextRowWithIcon

class MainActivity : ComponentActivity() {

  override fun onCreate(savedInstanceState: Bundle?) {
    Trace.beginSection("MainActivity.onCreate")
    super.onCreate(savedInstanceState)

    setContent {
      Column {
        TextRowWithIcon(
          titleText = "Performance Sample",
          subtitleText = "A quick example of Emerge's performance testing"
        )
      }
    }

    Trace.endSection()
  }
}
