package com.emergetools.performance.sample

import android.annotation.SuppressLint
import android.os.Build.VERSION
import android.os.Build.VERSION_CODES
import android.os.Bundle
import android.os.Trace
import android.util.Log
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

    // You should not normally need to detect if you are running under Emergetools
    // perf test infra however it can be helpful in some situations. In these cases
    // the recommend method is to check the "debug.emergetools.is_perf" build
    // property as follows:
    if (isPerfTest()) {
      Log.i("PerformanceSample", "Running an Emergetools perf test")
    } else {
      Log.i("PerformanceSample", "Not running an Emergetools perftest")
    }

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

  @SuppressLint("PrivateApi")
  @Suppress("SwallowedException", "TooGenericExceptionCaught")
  fun isPerfTest(): Boolean {
    var value: String? = null
    val key = "debug.emergetools.is_perf"
    try {
      value = Class.forName("android.os.SystemProperties")
        .getMethod("get", String::class.java).invoke(null, key) as String
    } catch (e: Exception) {
      return false
    }
    return value == "1"
  }
}
