package com.emergetools.snapshots.runner

import android.util.Log
import androidx.test.internal.runner.junit4.AndroidJUnit4ClassRunner
import com.emergetools.snapshots.EmergeSnapshots
import org.junit.Rule
import org.junit.runner.notification.RunNotifier

/**
 * Simple runner that will run a test class if it has a @Rule annotation of type [EmergeSnapshots].
 * Otherwise it will skip the test as we're only interested in running Snapshot tests and not
 * unrelated instrumentation tests.
 */
internal class SnapshotsRunner(private val testClass: Class<*>) : AndroidJUnit4ClassRunner(
  testClass
) {

  override fun run(notifier: RunNotifier) {
    if (hasEmergeSnapshotRule(testClass)) {
      super.run(notifier)
    } else {
      notifier.fireTestIgnored(description)
    }
  }

  companion object {
    private fun hasEmergeSnapshotRule(testClass: Class<*>): Boolean {
      return testClass.methods.any {
        it.isAnnotationPresent(Rule::class.java) && it.returnType == EmergeSnapshots::class.java
      }
    }
  }
}
