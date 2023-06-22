package com.emergetools.test.utils

import androidx.test.platform.app.InstrumentationRegistry
import androidx.test.uiautomator.UiDevice

/**
 * Only works if packageName is provided as an instrumentation argument
 */
fun maybeForceStopApp() {
  InstrumentationRegistry.getArguments().getString("packageName")?.let { packageName ->
    UiDevice.getInstance(InstrumentationRegistry.getInstrumentation())
      .executeShellCommand("am force-stop $packageName")
  }
}

/**
 * Clears the test app (target since it's self targeted) data if packageName is provided as an
 */
fun clearTargetAppData() {
  InstrumentationRegistry.getArguments().getString("packageName")?.let { packageName ->
    UiDevice.getInstance(InstrumentationRegistry.getInstrumentation())
      .executeShellCommand("pm clear $packageName")
  }
}
