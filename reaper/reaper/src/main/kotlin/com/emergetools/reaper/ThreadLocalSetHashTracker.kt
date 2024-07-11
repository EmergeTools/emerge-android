package com.emergetools.reaper

class ThreadLocalSetHashTracker(private var onFlush: (Collection<Long>) -> Unit) : HashTracker {
  override val name = "ThreadLocalSetHashTracker"

  // TODO(chromy): Should be a weak ref?
  private val sets = mutableListOf<MutableSet<Long>>()
  private val perThread = ThreadLocal.withInitial {
    val set = mutableSetOf<Long>()
    synchronized(sets) {
      sets.add(set)
    }
    set
  }

  override fun logMethodEntry(methodHash: Long) {
    val set = perThread.get()!!
    synchronized(set) {
      set.add(methodHash)
    }
  }

  override fun flush() {
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
