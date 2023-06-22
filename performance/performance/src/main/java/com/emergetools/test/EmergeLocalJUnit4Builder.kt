package com.emergetools.test

import com.emergetools.test.utils.hasEmergeStartupTestMethods
import com.emergetools.test.utils.hasEmergeTestMethods
import org.junit.internal.builders.JUnit4Builder
import org.junit.runner.Runner

/**
 * @see AndroidJUnit4Builder
 */
class EmergeLocalJUnit4Builder : JUnit4Builder() {

  override fun runnerForClass(testClass: Class<*>): Runner? {
    return if (hasEmergeTestMethods(testClass) || hasEmergeStartupTestMethods(testClass)) {
      EmergeLocalJUnit4ClassRunner(testClass)
    } else {
      // By returning null here we're letting AndroidRunnerBuilder potentially use a
      // different runner for this test class.
      null
    }
  }
}
