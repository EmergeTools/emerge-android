package com.emergetools.test

import android.os.Bundle
import androidx.test.runner.AndroidJUnitRunner

/**
 * A simple wrapper around [AndroidJUnitRunner] that sets the correct arguments to run Emerge tests
 * locally by default.
 */
class EmergeJUnitRunner : AndroidJUnitRunner() {

  companion object {
    private const val ARGUMENT_LISTENER = "listener"
    private const val ARGUMENT_RUNNER_BUILDER = "runnerBuilder"
  }

  override fun onCreate(arguments: Bundle) {
    // By default the listener and runnerBuilder that allow running Emerge tests locally are
    // used.
    val hasCustomListenerOrRunnerBuilder = arguments.containsKey(ARGUMENT_LISTENER) ||
      arguments.containsKey(ARGUMENT_RUNNER_BUILDER)
    if (!hasCustomListenerOrRunnerBuilder) {
      arguments.putString(
        ARGUMENT_LISTENER,
        EmergeLocalInstrumentationResultPrinter::class.java.canonicalName
      )
      arguments.putString(
        ARGUMENT_RUNNER_BUILDER,
        EmergeLocalJUnit4Builder::class.java.canonicalName
      )
    }
    super.onCreate(arguments)
  }
}
