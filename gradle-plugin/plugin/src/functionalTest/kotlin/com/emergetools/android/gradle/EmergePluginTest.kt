package com.emergetools.android.gradle

import com.emergetools.android.gradle.base.EmergeGradleRunner
import com.emergetools.android.gradle.mocks.getEmergeDispatcher
import org.gradle.testkit.runner.BuildResult
import org.gradle.testkit.runner.BuildTask
import org.gradle.testkit.runner.TaskOutcome
import org.junit.Assert.assertTrue
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Assertions.assertNotNull

abstract class EmergePluginTest {

  protected fun EmergeGradleRunner.withDefaultServer(timeout: Boolean = false) =
    withServer { baseUrl ->
      this.dispatcher = getEmergeDispatcher(baseUrl, timeout)
    }

  protected fun BuildResult.executedTask(name: String): BuildTask {
    val task = task(name)
    assertNotNull(task, "Task \"$name\" did not run. Tasks that did run: ${tasks.joinToString()}")
    return task!!
  }

  protected fun BuildResult.assertSuccessfulTask(name: String) : BuildResult {
    val task = executedTask(name)
    assertEquals(TaskOutcome.SUCCESS, task.outcome, "Task \"$name\" was not successful")
    assertTrue(output.contains("SUCCESSFUL"))
    return this
  }

  protected fun BuildResult.assertFailedTask(name: String) : BuildResult {
    val task = executedTask(name)
    assertEquals(TaskOutcome.FAILED, task.outcome, "Task \"$name\" did not fail")
    return this
  }
}
