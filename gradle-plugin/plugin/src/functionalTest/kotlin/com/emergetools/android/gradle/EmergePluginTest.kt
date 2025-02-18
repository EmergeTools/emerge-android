package com.emergetools.android.gradle

import com.autonomousapps.kit.truth.TestKitTruth.Companion.assertThat
import com.emergetools.android.gradle.base.EmergeGradleRunner
import com.emergetools.android.gradle.mocks.getEmergeDispatcher
import org.gradle.testkit.runner.BuildResult

abstract class EmergePluginTest {
  protected fun EmergeGradleRunner.withDefaultServer(timeout: Boolean = false) =
    withServer { baseUrl ->
      this.dispatcher = getEmergeDispatcher(baseUrl, timeout)
    }

  @Deprecated("Use TestKitTruth.assertThat instead",
    ReplaceWith("com.autonomousapps.kit.truth.TestKitTruth.assertThat(this).task(name).succeeded()")
  )
  protected fun BuildResult.assertSuccessfulTask(name: String): BuildResult {
    assertThat(this).task(name).succeeded()
    return this
  }

  @Deprecated("Use TestKitTruth.assertThat instead",
    ReplaceWith("com.autonomousapps.kit.truth.TestKitTruth.assertThat(this).task(name).failed()")
  )
  protected fun BuildResult.assertFailedTask(name: String): BuildResult {
    assertThat(this).task(name).failed()
    return this
  }
}
