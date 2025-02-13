package com.emergetools.distribution.integration

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import com.emergetools.distribution.Distribution
import com.emergetools.distribution.UpdateStatus
import kotlinx.coroutines.launch

class MainActivity : ComponentActivity() {
  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContent {
      MyApp()
    }
  }
}

@Composable
fun MyApp() {
  MaterialTheme {
    Box(
      contentAlignment = Alignment.Center,
      modifier = Modifier.fillMaxSize()
    ) {
      MyCustomUpdaterButton()
    }
  }
}

@Composable
fun MyCustomUpdaterButton() {
  val context = LocalContext.current
  Box {
    val scope = rememberCoroutineScope()
    var isLoading by remember { mutableStateOf(false) }
    var status by remember { mutableStateOf<UpdateStatus?>(null) }
    Button(onClick = {
      scope.launch {
        isLoading = true
        status = null
        status = Distribution.checkForUpdate(context)
        isLoading = false
      }
    }) {
      when (isLoading) {
        true -> Text(text = "Loading...")
        false -> when (status) {
          is UpdateStatus.UpToDate -> Text(text = "Up to date!")
          is UpdateStatus.Error -> Text(text = (status as UpdateStatus.Error).message)
          is UpdateStatus.NewRelease -> Text(text = "New release!")
          else -> Text(text = "Check for updates")
        }
      }
    }
  }
}
