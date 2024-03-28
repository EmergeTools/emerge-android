package com.emergetools.snapshots.runner

import android.util.Log
import androidx.test.internal.runner.junit4.AndroidJUnit4ClassRunner
import com.emergetools.snapshots.EmergeSnapshots
import com.emergetools.snapshots.compose.EmergeComposeSnapshotReflectiveParameterizedInvoker
import org.junit.Rule
import org.junit.runner.notification.RunNotifier

/**
 * Simple runner that will run a test class if it has a @Rule annotation of type [EmergeSnapshots].
 * Otherwise it will skip the test as we're only interested in running Snapshot tests and not
 * unrelated instrumentation tests.
 */
internal class SnapshotsRunner(private val testClass: Class<*>, private val useReflectiveInvoke: Boolean) : AndroidJUnit4ClassRunner(
  testClass
) {

  override fun run(notifier: RunNotifier) {
    val hasEmergeSnapshotRule = hasEmergeSnapshotRule(testClass)
    val isReflectiveInvoker = testClass == EmergeComposeSnapshotReflectiveParameterizedInvoker::class.java

    if (hasEmergeSnapshotRule || (useReflectiveInvoke && isReflectiveInvoker)) {
      Log.d(TAG, "Running test class: ${testClass.simpleName}")
      super.run(notifier)
    } else {
      Log.d(TAG, "Ignoring test class: ${testClass.simpleName}")
      notifier.fireTestIgnored(description)
    }
  }

  companion object {
    const val TAG = "SnapshotsRunner"

    private fun hasEmergeSnapshotRule(testClass: Class<*>): Boolean {
      return testClass.methods.any {
        val hasEmergeSnapshotRule =
          it.isAnnotationPresent(Rule::class.java) && it.returnType == EmergeSnapshots::class.java
        Log.d(
          TAG,
          "${testClass.simpleName} method ${it.name} hasEmergeSnapshotRule: $hasEmergeSnapshotRule"
        )
        hasEmergeSnapshotRule
      }
    }
  }
}
