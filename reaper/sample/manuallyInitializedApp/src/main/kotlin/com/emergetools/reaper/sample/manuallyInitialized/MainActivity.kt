package com.emergetools.reaper.sample.manuallyInitialized

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import com.emergetools.reaper.Reaper

class MainActivity : ComponentActivity() {

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContent {
      Button(onClick = { onClick() }) {
        Text("Initialize Reaper")
      }
    }
  }

  private fun onClick() {
    Reaper.init(this)
  }
}
