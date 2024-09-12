package com.emergetools.reaper

class ThreadLocalSetHashTracker : HashTracker {
  override val name = "ThreadLocalSetHashTracker"

  // TODO(chromy): Should be a weak ref?
  private val sets = mutableListOf<MutableSet<Long>>()

  // withInitial which would be nicer here was added in API level 26.
  private val perThread = object : ThreadLocal<MutableSet<Long>>() {
    override fun initialValue(): MutableSet<Long> {
      val seenPerThread = mutableSetOf<Long>()
      synchronized(sets) {
        sets.add(seenPerThread)
      }
      return seenPerThread
    }
  }

  override fun logMethodEntry(methodHash: Long) {
    val set = perThread.get()!!
    synchronized(set) {
      set.add(methodHash)
    }
  }

  override fun flush(onFlush: (Collection<Long>) -> Unit) {
    val seen = mutableSetOf<Long>()

    synchronized(sets) {
      for (set in sets) {
        synchronized(set) {
          seen.addAll(set)
          set.clear()
        }
      }
    }
    onFlush(seen)
  }
}
