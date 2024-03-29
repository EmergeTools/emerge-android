package com.emergetools.performance.sample.test

import com.emergetools.relax.Relax
import com.emergetools.test.annotations.EmergeTest

private const val APP_PACKAGE_NAME = "com.emergetools.performance.sample"

/**
 * An example performance test class launching a custom deeplink.
 *
 * Performance test classes can have multiple tests, but tests in a given class share @EmergeInit and @EmergeSetup
 * methods. For tests that require a different init or setup multiple test classes are supported.
 *
 * Note that each test (ie. each method annotated with @EmergeTest) will be run on a separate device, they cannot
 * impact each other in any way.
 */
class ExamplePerformanceTest {

  /**
   * Not implemented as this is a simple sample, but this method can be used to set up persistent
   * state, like logging in, before any tests are run.
   */
  // @EmergeInit
  // fun init() {
  // }

  /**
   * An @EmergeTest annotated method will measure the entire duration of the test unless `spans` are
   * specified.
   * If spans are specified, Emerge will measure the duration of each span found from the target
   * app during the test. Each span will have a separate conclusion & flamegraph comparison
   * available in the Emerge UI.
   */
  @EmergeTest(spans = ["MainActivity.onCreate", "MainActivity.onCreateAsync"])
  fun myDeeplinkStartupTest() {
    Relax(APP_PACKAGE_NAME) {
      launchWithLink("emg://emergetools.com/")
    }
  }
}
