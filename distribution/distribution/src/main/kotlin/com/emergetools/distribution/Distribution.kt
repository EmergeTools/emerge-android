package com.emergetools.distribution

import android.content.Context
import com.emergetools.distribution.internal.DistributionInternal
import okhttp3.OkHttpClient

/**
 * The is the public Android SDK for Emerge Tools Build Distribution.
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
  fun checkForUpdate(context: Context): String? {
    return DistributionInternal.checkForUpdate(context)
  }
}

/**
 * Optional settings for build distribution.
 */
data class DistributionOptions(
  /**
   * Pass an existing OkHttpClient. If null Reaper will create it's own OkHttpClient.
   * This allows reuse of existing OkHttpClient thread pools etc.
   */
  val okHttpClient: OkHttpClient? = null,
)
