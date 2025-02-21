package com.emergetools.android.gradle

import com.autonomousapps.kit.truth.TestKitTruth.Companion.assertThat
import com.emergetools.android.gradle.base.EmergeGradleRunner
import com.emergetools.android.gradle.mocks.getEmergeDispatcher
import okhttp3.HttpUrl
import okhttp3.mockwebserver.MockWebServer
import org.gradle.testkit.runner.BuildResult
import org.junit.jupiter.api.AfterEach
import org.junit.jupiter.api.BeforeEach

abstract class EmergePluginTest {

  val server = MockWebServer()
  lateinit var baseUrl: HttpUrl

  @BeforeEach
  fun setup() {
    baseUrl = server.url("/")
    server.dispatcher = getEmergeDispatcher(baseUrl, false)
  }

  @AfterEach
  fun shutdown() {
    server.shutdown()
  }

  protected fun enableServerTimeout() {
    server.dispatcher = getEmergeDispatcher(baseUrl, true)
  }

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
