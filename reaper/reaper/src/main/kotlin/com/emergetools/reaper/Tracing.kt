package com.emergetools.reaper

import android.os.SystemClock.sleep
import android.os.Trace

internal fun <T> trace(name: String, block: () -> T): T {
  try {
    Trace.beginSection(name)
    return block()
  } finally {
    Trace.endSection()
  }
}

fun block(ms: Long) {
  trace("sleep") {
    sleep(ms)
  }
}
