package com.emergetools.snapshots

import org.junit.Rule
import org.junit.internal.builders.JUnit4Builder
import org.junit.runner.Runner

class SnapshotsRunnerBuilder : JUnit4Builder() {
  override fun runnerForClass(testClass: Class<*>): Runner? {
    return if (hasSnapshotRule(testClass)) {
      SnapshotsRunner(testClass)
    } else {
      null
    }
  }

  companion object {

    private fun hasSnapshotRule(testClass: Class<*>): Boolean {
      for (field in testClass.fields) {
        if (field.isAnnotationPresent(
            Rule::class.java
          ) && field.type == EmergeSnapshots::class.java
        ) {
          return true
        }
      }
      return false
    }
  }
}
