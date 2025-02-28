@file:Suppress("EmptyFunctionBlock")

package com.emergetools.reaper

import java.util.Collections

class NullHashTracker : HashTracker {
  override val name = "NullHashTracker"

  override fun logMethodEntry(methodHash: Long) {}

  override fun flush(onFlush: (Collection<Long>) -> Unit) {
    onFlush(Collections.emptyList())
  }
}
