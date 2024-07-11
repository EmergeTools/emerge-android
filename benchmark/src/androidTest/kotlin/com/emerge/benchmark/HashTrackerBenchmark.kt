package com.emerge.benchmark

import androidx.benchmark.junit4.BenchmarkRule
import androidx.benchmark.junit4.measureRepeated
import androidx.test.ext.junit.runners.AndroidJUnit4
import com.emergetools.reaper.CountingHashTracker
import com.emergetools.reaper.HashTracker
import com.emergetools.reaper.SynchronizedSetHashTracker
import com.emergetools.reaper.ThreadLocalSetHashTracker
import junit.framework.TestCase.assertEquals
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith
import java.util.concurrent.atomic.AtomicBoolean
import kotlin.concurrent.thread
import kotlin.random.Random

const val THREAD_COUNT = 4
const val HASH_COUNT = 10000
class Contend(tracker: HashTracker, hashes: List<Long>, threadCount: Int) {
  private val running = AtomicBoolean(true)
  private val threads = mutableListOf<Thread>()
  init {
    for (i in 0 until threadCount) {
      val t = thread {
        var j = 0
        while (running.get()) {
          tracker.logMethodEntry(hashes[j++])
          j %= hashes.size
          Thread.yield()
        }
      }
      threads.add(t)
    }
  }

  fun stop() {
    running.set(false)
    for (worker in threads) {
      worker.join()
    }
  }
}

@RunWith(AndroidJUnit4::class)
class HashTrackerBenchmark {

  @get:Rule
  val benchmarkRule = BenchmarkRule()

  private fun benchmarkWithContention(hashes: List<Long>, tracker: HashTracker) {
    var i = 0
    val contend = Contend(tracker, hashes, THREAD_COUNT)
    benchmarkRule.measureRepeated {
      tracker.logMethodEntry(hashes[i++]);
      i %= hashes.size
      if (i == 0) {
        Thread.yield()
      }
    }
    contend.stop()
    tracker.flush()
  }

  @Test
  fun synchronizedSet() {
    val seen = mutableSetOf<Long>()
    val hashes = getHashes(HASH_COUNT)
    val tracker = SynchronizedSetHashTracker { seen.addAll(it) }
    benchmarkWithContention(hashes, tracker);
    assertEquals(seen.size, hashes.size)
  }

  @Test
  fun threadLocalSet() {
    val seen = mutableSetOf<Long>()
    val hashes = getHashes(HASH_COUNT)
    val tracker = ThreadLocalSetHashTracker { seen.addAll(it) }
    benchmarkWithContention(hashes, tracker);
    assertEquals(seen.size, hashes.size)
  }

  @Test
  fun counting() {
    val seen = mutableSetOf<Long>()
    val hashes = getHashes(HASH_COUNT)
    val tracker = CountingHashTracker { seen.addAll(it) }
    benchmarkWithContention(hashes, tracker);
    // Not asserting on purpose. CountingHashTracker doesn't store hashes it just counts the number
    // of calls to logMethodEntry.
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
