package com.emergetools.reaper

import android.content.Context

/**
 * The is the public SDK for Reaper, an Emergetools service which detects and deletes dead code in
 * production. Reaper works in three parts:
 * - A gradle plugin which instruments JVM bytecode to dected when code is used.
 * - An SDK (this code) which uploads reports based on that instrumention.
 * - A server side component which aggregates those reports and compares the used code to the
 *   code in the app. Code which is not used by any user but exists in the app is decteded,
 *   displayed and can be deleted.
 * See https://docs.emergetools.com/docs/reaper-setup-android for more
 * information.
 */
object Reaper {
  /**
   * Initialize Reaper with the provided apiKey. This should be called once in each process. In
   * addition to calling this method the codebase need be instrumented using the Emergetools
   * gradle plugin. This method may be called from any thread.
   */
  fun init(context: Context) {
    ReaperInternal.init(context)
  }

  /**
   * Flush observed hashes into the current report.
   * This method may be called from any thread.
   */
  fun flush(context: Context) {
    ReaperInternal.flush(context)
  }
}
