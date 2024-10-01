package com.emergetools.reaper

import android.content.Context

/**
 * The is the public SDK for Reaper, an Emergetools service which detects and deletes dead code in
 * production. Reaper works in three parts:
 * - A gradle plugin which instruments JVM bytecode to detect when code is used.
 * - An SDK (this code) which uploads reports based on that instrumentation.
 * - A server side component which aggregates those reports and compares the used code to the
 *   code in the app. Code which is not used by any user but exists in the app is detected,
 *   displayed and can be deleted.
 * See https://docs.emergetools.com/docs/reaper-setup-android for more information.
 */
object Reaper {
  /**
   * Initialize Reaper. This should be called once in each process. In
   * addition to calling this method the codebase must be instrumented using the Emergetools
   * gradle plugin. This method may be called from any thread with a Looper. It is safe to
   * call this from the main thread. Options may be passed if you want to override the default
   * values.
   * @param context Android context
   * @param options Override Reaper settings
   */
  fun init(context: Context, options: ReaperOptions? = null) {
    ReaperInternal.init(context, options ?: ReaperOptions())
  }

  /**
   * Flush observed hashes into the current report if any.
   * This method may be called from any thread.
   * Blocks until the flush is complete.
   * @param context Android context
   */
  fun flush(context: Context) {
    ReaperInternal.flush(context)
  }
}

/**
 * Optional settings for Reaper.
 */
data class ReaperOptions(
  /**
   * Adjust the logcat detail level of Reaper.
   * Reaper uses the tag 'REAPER' for all logcat messages.
   * By default Reaper logs everything to logcat.
   */
  val logLevel: ReaperLogLevel = ReaperLogLevel.ALL,
)

/**
 * Desired logcat level for Reaper.
 */
enum class ReaperLogLevel {
  /**
   * Never log to logcat during operation.
   * Fatal errors during initialization will still log to logcat.
   */
  NONE,

  /**
   *  Log errors (Log.e) and above:
   */
  ERRORS,

  /**
   *  Log everything:
   */
  ALL,
}
