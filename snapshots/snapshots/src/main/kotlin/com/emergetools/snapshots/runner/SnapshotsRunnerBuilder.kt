package com.emergetools.snapshots.runner

import org.junit.Test
import org.junit.internal.builders.JUnit4Builder
import org.junit.runner.Runner

class SnapshotsRunnerBuilder : JUnit4Builder() {
  override fun runnerForClass(testClass: Class<*>): Runner? {
    // If one method in the class has a @Test method, we can safely assume it's a test class
    // and the SnapshotRunner should handle.
    return if (isTestClass(testClass)) {
      SnapshotsRunner(testClass)
    } else {
      // Fallback to allow AndroidRunnerBuilder to handle the class.
      null
    }
  }

  companion object {

    private fun isTestClass(testClass: Class<*>): Boolean {
      // Check if the class has a method annotated with @Test
      return testClass.methods.any { it.isAnnotationPresent(Test::class.java) }
    }
  }
}
