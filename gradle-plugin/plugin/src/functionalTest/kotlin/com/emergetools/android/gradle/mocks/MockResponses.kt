package com.emergetools.android.gradle.mocks

import okhttp3.HttpUrl
import okhttp3.mockwebserver.Dispatcher
import okhttp3.mockwebserver.MockResponse
import okhttp3.mockwebserver.RecordedRequest
import okhttp3.mockwebserver.SocketPolicy

/**
 * For proper mocking of the signedUrl upload, we need a signedUrl to be returned
 * matching the mockwebserver baseUrl. The only way we can do this is by mocking the
 * signedUrl we return from the initial /upload request to have the same baseUrl.
 */
fun getSuccessfulUpload(baseUrl: HttpUrl): MockResponse {
  return MockResponse().apply {
    setResponseCode(200)
    setBody("{\"uploadURL\":\"${baseUrl.resolve("signed_url")}\", \"upload_id\":\"123\"}")
  }
}

val mockSuccessfulSignedUrlUpload =
  MockResponse().apply {
    setResponseCode(200)
  }

fun getEmergeDispatcher(
  baseUrl: HttpUrl,
  timeout: Boolean = false,
): Dispatcher {
  return object : Dispatcher() {
    @Throws(InterruptedException::class)
    override fun dispatch(request: RecordedRequest): MockResponse {
      val response =
        when (request.requestUrl?.host) {
          "localhost" ->
            when (request.path?.substringBefore("?")) {
              "/upload" -> getSuccessfulUpload(baseUrl)
              "/signed_url" -> mockSuccessfulSignedUrlUpload
              else -> MockResponse().setResponseCode(404)
            }

          else -> MockResponse().setResponseCode(404)
        }

      if (timeout) {
        response.setSocketPolicy(SocketPolicy.NO_RESPONSE)
      }

      return response
    }
  }
}
