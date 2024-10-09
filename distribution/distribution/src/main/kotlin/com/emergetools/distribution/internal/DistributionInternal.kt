// We catch very generic exceptions on purpose. We need to avoid crashing the app.
@file:Suppress("TooGenericExceptionCaught")

package com.emergetools.distribution.internal

import android.content.Context
import android.os.Handler
import android.os.Looper
import android.util.Log
import com.emergetools.distribution.DistributionOptions
import com.emergetools.distribution.UpdateStatus
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.ExperimentalCoroutinesApi
import kotlinx.coroutines.suspendCancellableCoroutine
import kotlinx.coroutines.withContext
import kotlinx.serialization.Serializable
import kotlinx.serialization.SerializationException
import kotlinx.serialization.json.Json
import okhttp3.Call
import okhttp3.Callback
import okhttp3.HttpUrl
import okhttp3.OkHttpClient
import okhttp3.Request
import okhttp3.Response
import okhttp3.internal.closeQuietly
import java.io.IOException
import kotlin.coroutines.resumeWithException

@Serializable
internal data class CheckForUpdatesMessageResult(
  val message: String
)

private inline fun <reified T> tryDecode(s: String): T? {
  return try {
    Json.decodeFromString<T>(s)
  } catch (_: SerializationException) {
    null
  } catch (_: IllegalArgumentException) {
    null
  }
}

private fun decodeResult(body: String?): UpdateStatus {
  if (body == null) {
    return UpdateStatus.Error("Empty response from server")
  }

  val message = tryDecode<CheckForUpdatesMessageResult>(body)
  if (message !== null) {
    return UpdateStatus.Error(message.message)
  }

  return UpdateStatus.Error("Unexpected response $body")
}

private class State(val handler: Handler, private var okHttpClient: OkHttpClient?) {

  @Synchronized
  fun getOkHttpClient(): OkHttpClient {
    var client = okHttpClient
    if (client == null) {
      client = OkHttpClient()
      okHttpClient = client
    }
    return client
  }
}

object DistributionInternal {
  private var state: State? = null

  @Synchronized
  @Suppress("unused")
  fun init(context: Context, options: DistributionOptions) {
    if (state != null) {
      Log.e(TAG, "Distribution already initialized, ignoring Distribution.init().")
      return
    }

    val looper = Looper.myLooper()
    if (looper == null) {
      Log.e(TAG, "Distribution.init() must be called from a thread with a Looper.")
      return
    }

    val handler = Handler(looper)
    state = State(handler, options.okHttpClient)
  }

  private fun getState(): State? {
    var theState: State?
    synchronized(this) {
      theState = state
    }
    return theState
  }

  suspend fun checkForUpdate(context: Context, apiKey: String?): UpdateStatus {
    try {
      val state = getState()
      if (state == null) {
        Log.e(TAG, "Build distribution not initialized")
        return UpdateStatus.Error("Build distribution not initialized")
      }
      if (apiKey == null) {
        Log.e(TAG, "No API key available")
        return UpdateStatus.Error("No API key available")
      }
      return doCheckForUpdate(context, state, apiKey)
    } catch (e: Exception) {
      Log.e(TAG, "Error: $e")
      return UpdateStatus.Error("Error: $e")
    }
  }
}

@OptIn(ExperimentalCoroutinesApi::class)
private suspend fun doCheckForUpdate(context: Context, state: State, apiKey: String): UpdateStatus {
  // Despite the name context.packageName is the actually the application id.
  val applicationId = context.packageName

  val url = HttpUrl.Builder().apply {
    scheme("https")
    host("api.emergetools.com")
    addPathSegment("distribution")
    addPathSegment("checkForUpdates")
    addQueryParameter("apiKey", apiKey)
    addQueryParameter("binaryIdentifier", "polar bears")
    addQueryParameter("appId", applicationId)
    addQueryParameter("platform", "android")
  }.build()

  val request = Request.Builder().apply {
    url(url)
  }.build()

  val client = state.getOkHttpClient()
  val call = client.newCall(request)
  executeAsync(call).use { response ->
    return withContext(Dispatchers.IO) {
      val body = response.body?.string()
      println(body)
      return@withContext decodeResult(body)
    }
  }
}

@ExperimentalCoroutinesApi // resume with a resource cleanup.
suspend fun executeAsync(call: Call): Response =
  suspendCancellableCoroutine { continuation ->
    continuation.invokeOnCancellation {
      call.cancel()
    }
    call.enqueue(
      object : Callback {
        override fun onFailure(
          call: Call,
          e: IOException,
        ) {
          continuation.resumeWithException(e)
        }

        override fun onResponse(
          call: Call,
          response: Response,
        ) {
          continuation.resume(response) {
            response.closeQuietly()
          }
        }
      },
    )
  }
