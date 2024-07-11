package com.emergetools.reaper

import com.google.common.truth.Truth.assertThat
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.EnumSource
import kotlin.concurrent.thread
import kotlin.random.Random

enum class TrackerImplementation {
  SYNCHRONIZED_SET {
    override fun make(onFlush: (Collection<Long>) -> Unit): SynchronizedSetHashTracker {
      return SynchronizedSetHashTracker(onFlush)
    }
  },
  THREAD_LOCAL_SET {
    override fun make(onFlush: (Collection<Long>) -> Unit): ThreadLocalSetHashTracker {
      return ThreadLocalSetHashTracker(onFlush)
    }
  };

  abstract fun make(onFlush: (Collection<Long>) -> Unit): HashTracker
}

class HashTrackerTest {
  @ParameterizedTest
  @EnumSource(TrackerImplementation::class)
  fun `returns nothing when nothing logged`(implementation: TrackerImplementation) {
    var observedHashes: Collection<Long>? = null
    val tracker = implementation.make { observedHashes = it }
    tracker.flush()
    assertThat(observedHashes).isEmpty()
  }

  @ParameterizedTest
  @EnumSource(TrackerImplementation::class)
  fun `returns logged hashes`(implementation: TrackerImplementation) {
    var observedHashes: Collection<Long>? = null
    val tracker = implementation.make { observedHashes = it }
    tracker.logMethodEntry(42)
    tracker.flush()
    assertThat(observedHashes).containsExactly(42L)
  }

  @ParameterizedTest
  @EnumSource(TrackerImplementation::class)
  fun `returns multiple logged hashes`(implementation: TrackerImplementation) {
    var observedHashes: Collection<Long>? = null
    val tracker = implementation.make { observedHashes = it }

    tracker.logMethodEntry(42)
    tracker.logMethodEntry(43)
    tracker.flush()

    assertThat(observedHashes).containsExactly(42L, 43L)
  }

  @ParameterizedTest
  @EnumSource(TrackerImplementation::class)
  fun `reports hashes only once`(implementation: TrackerImplementation) {
    var observedHashes: Collection<Long>? = null
    val tracker = implementation.make { observedHashes = it }

    tracker.logMethodEntry(1)
    tracker.logMethodEntry(1)
    tracker.logMethodEntry(1)
    tracker.logMethodEntry(1)
    tracker.logMethodEntry(1)
    tracker.flush()

    assertThat(observedHashes).containsExactly(1L)
  }

  @ParameterizedTest
  @EnumSource(TrackerImplementation::class)
  fun `forgets hashes after flushing`(implementation: TrackerImplementation) {
    var observedHashes: Collection<Long>? = null
    val tracker = implementation.make { observedHashes = it }

    tracker.logMethodEntry(1)
    tracker.flush()
    tracker.logMethodEntry(2)
    tracker.flush()

    assertThat(observedHashes).containsExactly(2L)
  }

  @ParameterizedTest
  @EnumSource(TrackerImplementation::class)
  fun `handles logging from concurrent threads`(implementation: TrackerImplementation) {
    var observedHashes: Collection<Long>? = null
    val tracker = implementation.make { observedHashes = it }

    val threadCount = 10
    val methodCount = 1000
    val threads = mutableListOf<Thread>()
    for (i in 0 until threadCount) {
      threads.add(
        thread {
          for (j in 0 until methodCount) {
            tracker.logMethodEntry((i * methodCount + j + 1).toLong())
          }
        }
      )
      Thread.yield()
    }

    for (thread in threads) {
      thread.join()
    }

    tracker.flush()

    for (i in 1..threadCount * methodCount) {
      assertThat(observedHashes).contains(i.toLong())
    }
  }

  @ParameterizedTest
  @EnumSource(TrackerImplementation::class)
  fun `handles overlapping logging from concurrent threads`(implementation: TrackerImplementation) {
    var observedHashes: Collection<Long>? = null
    val tracker = implementation.make { observedHashes = it }

    val methodCount = 10000
    // Generate a bunch of hashes every thread will log:
    val commonHashes = getHashes(methodCount, 42)
    val allHashes = mutableSetOf<Long>()
    allHashes.addAll(commonHashes)

    val threadCount = 10
    val threads = mutableListOf<Thread>()
    for (i in 0 until threadCount) {
      // Generate hashes that only thread i will log:
      val myHashes = getHashes(methodCount, i)
      allHashes.addAll(myHashes)

      threads.add(
        thread {
          for (j in 0 until methodCount) {
            tracker.logMethodEntry(commonHashes[j])
            tracker.logMethodEntry(myHashes[j])
            Thread.yield()
          }
        }
      )

      Thread.yield()
    }

    for (thread in threads) {
      thread.join()
    }

    tracker.flush()

    assertThat(observedHashes).containsExactlyElementsIn(allHashes)
  }

  @ParameterizedTest
  @EnumSource(TrackerImplementation::class)
  fun `handles interleaved logging and flush`(implementation: TrackerImplementation) {
    val observedHashes = mutableSetOf<Long>()
    val tracker = implementation.make {
      synchronized(observedHashes) {
        observedHashes.addAll(it)
      }
    }

    val methodCount = 1000
    val commonHashes = getHashes(methodCount, 42)
    val allHashes = mutableSetOf<Long>()
    allHashes.addAll(commonHashes)

    val threadCount = 10
    val threads = mutableListOf<Thread>()
    for (i in 0 until threadCount) {
      val myHashes = getHashes(methodCount, i)
      allHashes.addAll(myHashes)

      threads.add(
        thread {
          for (j in 0 until methodCount) {
            tracker.logMethodEntry(commonHashes[j])
            tracker.logMethodEntry(myHashes[j])
            tracker.flush()
          }
        }
      )

      Thread.yield()
    }

    for (thread in threads) {
      thread.join()
    }

    synchronized(observedHashes) {
      assertThat(observedHashes).containsExactlyElementsIn(allHashes)
    }
  }

  private fun getHashes(n: Int, seed: Int = 42): List<Long> {
    val rng = Random(seed)
    val hashes = ArrayList<Long>()
    for (i in 0 until n) {
      hashes.add(rng.nextLong())
    }
    return hashes
  }
}
