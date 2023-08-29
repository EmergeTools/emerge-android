package com.emergetools.snapshots.processor

import org.junit.rules.TestWatcher
import org.junit.runner.Description

class TestNameRule : TestWatcher() {
  /**
   * @return the name of the currently-running test method
   */
  lateinit var methodName: String
    private set

  lateinit var className: String

  override fun starting(d: Description) {
    methodName = d.methodName
    className = d.className
  }
}
