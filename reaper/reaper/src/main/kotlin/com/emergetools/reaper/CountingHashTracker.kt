package com.emergetools.reaper

class CountingHashTracker : HashTracker {
  override val name = "CountingHashTracker"
  private var count = 0L

  override fun logMethodEntry(methodHash: Long) {
    count++
  }

  override fun flush(onFlush: (Collection<Long>) -> Unit) {
    onFlush(mutableSetOf(count))
  }
}
