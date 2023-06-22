package com.emergetools.test

import com.emergetools.test.runner.EmergeJUnit4ClientClassRunner
import com.emergetools.test.runner.EmergeTestClient
import com.emergetools.test.utils.hasEmergeStartupTestMethods
import com.emergetools.test.utils.hasEmergeTestMethods
import org.junit.internal.builders.JUnit4Builder
import org.junit.runner.Runner

class EmergeJUnit4ClientBuilder : JUnit4Builder() {

  override fun runnerForClass(testClass: Class<*>): Runner? {
    return EmergeTestClient.INSTANCE.trace("$TAG.runnerForClass") {
      if (hasEmergeTestMethods(testClass) || hasEmergeStartupTestMethods(testClass)) {
        EmergeJUnit4ClientClassRunner(
          EmergeTestClient.INSTANCE,
          testClass,
        )
      } else {
        // By returning null here we're letting AndroidRunnerBuilder potentially use a
        // different runner for this class.
        null
      }
    }
  }

  companion object {
    private const val TAG = "EmergeJUnit4ClientBuilder"
  }
}
