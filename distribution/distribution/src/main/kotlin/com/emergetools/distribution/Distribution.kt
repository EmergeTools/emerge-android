package com.emergetools.distribution

import android.content.Context
import android.content.Intent
import android.net.Uri
import com.emergetools.distribution.internal.DistributionInternal
import kotlinx.serialization.Serializable
import okhttp3.OkHttpClient
import java.util.concurrent.CompletableFuture

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
   * Allows testing if build distribution is in use.
   * @return true iff build distribution is enabled
   */
  fun isEnabled(): Boolean {
    return DistributionInternal.isEnabled()
  }

  /**
   * Check to see if an updated version of the current app exists.
   * A suspendable function which asynchronously finds the latest available version by querying
   * the Emerge
   * @return The current
   */
  suspend fun checkForUpdate(context: Context): UpdateStatus {
    return DistributionInternal.checkForUpdate(context)
  }

  /**
   * A non-coroutine, non-blocking version of `checkForUpdate` designed for use with Jetpack
   * Compose.
   */
  fun checkForUpdateCompletableFuture(context: Context): CompletableFuture<UpdateStatus> {
    return DistributionInternal.checkForUpdateCompletableFuture(context)
  }

  /**
   * Download the provided update.
   */
  fun downloadUpdate(context: Context, info: UpdateInfo) {
    val browserIntent = Intent(Intent.ACTION_VIEW, Uri.parse(info.downloadUrl))
    context.startActivity(browserIntent)
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

  /**
   * Emerge Tools build tag used to find the desired next build.
   */
  val tag: String? = null,
)

/**
 * An available update that it is possible to upgrade to.
 */
@Serializable
data class UpdateInfo(
  /**
   * The Emerge id for the update build.
   */
  val id: String,

  /**
   * The Emerge tag for the update build.
   */
  val tag: String,

  /**
   * The version of the update.
   */
  val version: String,

  /**
   * The package name of the update app.
   */
  val appId: String,

  /**
   * A signed URL for downloading the update.
   */
  val downloadUrl: String,
)

/**
 * The result of checking for an update.
 */
sealed class UpdateStatus {
  class Error(val message: String) : UpdateStatus()
  class NewRelease(val info: UpdateInfo) : UpdateStatus()
  object UpToDate : UpdateStatus()
}
