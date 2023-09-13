package com.emergetools.performance.sample

import android.os.Build.VERSION
import android.os.Build.VERSION_CODES
import android.os.Bundle
import android.os.Trace
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import com.emergetools.performance.sample.ui.TextRowWithIcon

class MainActivity : ComponentActivity() {

  override fun onCreate(savedInstanceState: Bundle?) {
    Trace.beginSection("MainActivity.onCreate")
    if (VERSION.SDK_INT >= VERSION_CODES.Q) {
      Trace.beginAsyncSection("MainActivity.onCreateAsync", 1)
    }
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
    if (VERSION.SDK_INT >= VERSION_CODES.Q) {
      Trace.endAsyncSection("MainActivity.onCreateAsync", 1)
    }
  }
}
