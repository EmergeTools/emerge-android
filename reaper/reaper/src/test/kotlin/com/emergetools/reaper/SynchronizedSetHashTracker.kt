package com.emergetools.reaper

class SynchronizedSetHashTracker : HashTracker {
  override val name = "SynchronizedSetHashTracker"
  private val observedHashes = mutableSetOf<Long>()

  override fun logMethodEntry(methodHash: Long) {
    synchronized(observedHashes) {
      observedHashes.add(methodHash)
    }
  }

  override fun flush(onFlush: (Collection<Long>) -> Unit) {
    val observedHashesCopy: Set<Long>
    synchronized(observedHashes) {
      observedHashesCopy = observedHashes.toSet()
      observedHashes.clear()
    }
    onFlush(observedHashesCopy)
  }
}
