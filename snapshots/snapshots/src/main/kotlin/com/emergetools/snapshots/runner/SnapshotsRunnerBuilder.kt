package com.emergetools.snapshots.runner

import android.util.Log
import org.junit.Test
import org.junit.internal.builders.JUnit4Builder
import org.junit.runner.Runner

class SnapshotsRunnerBuilder : JUnit4Builder() {
  override fun runnerForClass(testClass: Class<*>): Runner? {
    // If one method in the class has a @Test method, we can safely assume it's a test class
    // and the SnapshotRunner should handle.
    return if (isTestClass(testClass)) {
      Log.d(TAG, "Using SnapshotsRunner for class: ${testClass.simpleName}")
      SnapshotsRunner(testClass)
    } else {
      // Fallback to allow AndroidRunnerBuilder to handle the class.
      Log.d(TAG, "Using default runner for class: ${testClass.simpleName}")
      null
    }
  }

  companion object {
    const val TAG = "SnapshotsRunnerBuilder"

    private fun isTestClass(testClass: Class<*>): Boolean {
      // Check if the class has a method annotated with @Test
      return testClass.methods.any {
        val annotatedWithTest = it.isAnnotationPresent(Test::class.java)
        Log.d(TAG, "${testClass.simpleName} method ${it.name} annotated with test: $annotatedWithTest")
        annotatedWithTest
      }
    }
  }
}
