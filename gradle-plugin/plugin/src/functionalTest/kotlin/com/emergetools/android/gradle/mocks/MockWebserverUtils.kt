package com.emergetools.android.gradle.mocks

import okhttp3.mockwebserver.MockWebServer
import org.junit.jupiter.api.Assertions

fun assertSuccessfulUploadRequests(server: MockWebServer) {
  val uploadRequest = server.takeRequest()
  Assertions.assertEquals("/upload", uploadRequest.path)
  Assertions.assertEquals("application/json; charset=utf-8", uploadRequest.headers["Content-Type"])
  val signedUrlRequest = server.takeRequest()
  Assertions.assertEquals("/signed_url", signedUrlRequest.path)
  Assertions.assertEquals("application/zip", signedUrlRequest.headers["Content-Type"])
}
