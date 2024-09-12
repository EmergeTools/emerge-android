package com.emergetools.reaper

import android.os.Trace
import java.lang.Thread.sleep

internal fun <T> androidTrace(name: String, block: () -> T): T {
  try {
    Trace.beginSection(name)
    return block()
  } finally {
    Trace.endSection()
  }
}

internal fun block(ms: Long) {
  androidTrace("sleep") {
    sleep(ms)
  }
}
