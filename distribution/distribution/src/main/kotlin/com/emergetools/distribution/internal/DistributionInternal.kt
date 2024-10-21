// We catch very generic exceptions on purpose. We need to avoid crashing the app.
@file:Suppress("TooGenericExceptionCaught")

package com.emergetools.distribution.internal

import android.content.Context
import android.content.pm.PackageManager
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.util.Log
import com.emergetools.distribution.DistributionOptions
import com.emergetools.distribution.UpdateInfo
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

private const val MANIFEST_TAG_API_KEY = "com.emergetools.distribution.API_KEY"

internal fun getApiKey(metadata: Bundle): String? {
  val apiKey = metadata.getString(MANIFEST_TAG_API_KEY, null)
  if (apiKey == "") {
    return null
  }
  return apiKey
}

@Serializable
internal data class CheckForUpdatesMessageResult(
  val message: String
)

@Serializable
internal data class CheckForUpdatesSuccessResult(
  val updateInfo: UpdateInfo
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

  val success = tryDecode<CheckForUpdatesSuccessResult>(body)
  if (success !== null) {
    return UpdateStatus.NewRelease(success.updateInfo)
  }

  val message = tryDecode<CheckForUpdatesMessageResult>(body)
  if (message !== null) {
    return UpdateStatus.Error(message.message)
  }

  return UpdateStatus.Error("Unexpected response $body")
}

private class State(
  val handler: Handler,
  val tag: String,
  val apiKey: String?,
  private var okHttpClient: OkHttpClient?
) {

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

    // apiKey may be null if
    val metaData = context.packageManager.getApplicationInfo(
      context.packageName,
      PackageManager.GET_META_DATA
    ).metaData
    val apiKey = getApiKey(metaData)

    val tag = options.tag ?: "release"

    state = State(handler, tag, apiKey, options.okHttpClient)
  }

  private fun getState(): State? {
    var theState: State?
    synchronized(this) {
      theState = state
    }
    return theState
  }

  suspend fun checkForUpdate(context: Context): UpdateStatus {
    try {
      val state = getState()
      if (state == null) {
        Log.e(TAG, "Build distribution not initialized")
        return UpdateStatus.Error("Build distribution not initialized")
      }
      return doCheckForUpdate(context, state)
    } catch (e: Exception) {
      Log.e(TAG, "Error: $e")
      return UpdateStatus.Error("Error: $e")
    }
  }

  fun isEnabled(): Boolean {
    try {
      val state = getState()
      return state?.apiKey != null
    } catch (e: Exception) {
      Log.e(TAG, "Error: $e")
      return false
    }
  }
}

@OptIn(ExperimentalCoroutinesApi::class)
private suspend fun doCheckForUpdate(context: Context, state: State): UpdateStatus {
  // Despite the name context.packageName is the actually the application id.
  val applicationId = context.packageName
  val apiKey = state.apiKey
  if (apiKey == null) {
    Log.e(TAG, "No API key available")
    return UpdateStatus.Error("No API key available")
  }

  val url = HttpUrl.Builder().apply {
    scheme("https")
    host("api.emergetools.com")
    addPathSegment("distribution")
    addPathSegment("checkForUpdates")
    addQueryParameter("apiKey", apiKey)
    addQueryParameter("tag", state.tag)
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
