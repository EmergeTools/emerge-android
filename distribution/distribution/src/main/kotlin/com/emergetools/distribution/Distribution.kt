package com.emergetools.distribution

import android.content.Context
import com.emergetools.distribution.internal.DistributionInternal
import okhttp3.OkHttpClient

/**
 * The public Android SDK for Emerge Tools Build Distribution.
 */
object Distribution {
  /**
   * Initialize build distribution. This should be called once in each process.
   * This method may be called from any thread with a Looper. It is safe to
   * call this from the main thread. Options may be passed if you want to override the default values.
   * @param context Android context
   * @param options Override distribution settings
   */
  fun init(context: Context, options: DistributionOptions? = null) {
    DistributionInternal.init(context, options ?: DistributionOptions())
  }

  /**
   *
   */
  suspend fun checkForUpdate(context: Context, apiKey: String? = null): UpdateStatus {
    return DistributionInternal.checkForUpdate(context, apiKey)
  }
}

/**
 * Optional settings for build distribution.
 */
data class DistributionOptions(
  /**
   * Pass an existing OkHttpClient. If null Distribution will create it's own OkHttpClient.
   * This allows reuse of existing OkHttpClient thread pools etc.
   */
  val okHttpClient: OkHttpClient? = null,
)

sealed class UpdateStatus {
  class Error(val message: String) : UpdateStatus()
  class NewRelease(
    val id: String,
    val tag: String,
    val version: String,
    val appId: String,
    val downloadUrl: String
  ) : UpdateStatus()
  object UpToDate : UpdateStatus()
}
