package com.emergetools.test

import android.os.Bundle
import androidx.test.internal.runner.listener.InstrumentationRunListener
import org.junit.runner.Result
import java.io.PrintStream

/**
 * Prints out the Emerge test functions summary at the end of instrumentation runs.
 */
class EmergeLocalInstrumentationResultPrinter : InstrumentationRunListener() {

  companion object {

    private val summaries = mutableMapOf<String, String>()

    private val result: String
      get() {
        return StringBuilder().apply {
          if (summaries.isNotEmpty()) {
            summaries.forEach { (_, summary) ->
              appendLine()
              appendLine(summary)
            }
          } else {
            appendLine()
            appendLine("No Emerge test classes detected.")
          }
        }.toString()
      }

    fun addSummary(testKey: String, summary: String) {
      summaries[testKey] = summary
    }
  }

  override fun instrumentationRunFinished(
    streamResult: PrintStream,
    resultBundle: Bundle,
    junitResults: Result
  ) {
    streamResult.println(result)
  }
}
