package com.emergetools.android.gradle

import com.emergetools.android.gradle.mocks.getEmergeDispatcher
import okhttp3.HttpUrl
import okhttp3.mockwebserver.MockWebServer
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
}
