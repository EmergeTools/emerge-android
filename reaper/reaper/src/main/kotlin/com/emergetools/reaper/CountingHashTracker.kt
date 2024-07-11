package com.emergetools.reaper

class CountingHashTracker(private var onFlush: (Collection<Long>) -> Unit) : HashTracker {
  override val name = "CountingHashTracker"
  private var count = 0L

  override fun logMethodEntry(methodHash: Long) {
    count++
  }

  override fun flush() {
    onFlush(mutableSetOf(count))
  }
}
