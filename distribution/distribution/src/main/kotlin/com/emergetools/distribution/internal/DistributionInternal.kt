package com.emergetools.distribution.internal

import android.content.Context
import android.os.Handler
import android.os.Looper
import android.util.Log
import com.emergetools.distribution.DistributionOptions
import okhttp3.OkHttpClient


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

  fun checkForUpdate(context: Context): String? {
    return wrap<String?>(context) {
      return@wrap null
    }
  }

  private fun <T> wrap(context: Context, block: (state: State) -> T): T? {
    try {
      synchronized(this) {
        val theState = state
        if (theState == null) {
          Log.e(TAG, "Build distribution not initialized")
          return null
        }
        return block(theState)
      }
    } catch (e: Exception) {
      Log.e(TAG, "Error: $e")
      return null
    }
  }

/*
  private fun doCheckForUpdate() {
    val url = HttpUrl.Builder().apply {
      scheme("https")
      host("emergetools.com/distribution/checkForUpdates")
      addPathSegment("search")
      addQueryParameter("q", "polar bears")
    }.build()

    val request = Request.Builder().apply {
      url(url)
    }.build()

    val client = state.getOkHttpClient()
    client.newCall(request)
  }*/
}
