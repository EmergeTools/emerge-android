package com.emergetools.test.utils

import android.app.Activity
import android.app.Application
import android.app.KeyguardManager
import android.content.Intent
import android.os.Build
import android.os.Bundle
import android.util.Log
import android.view.WindowManager
import android.widget.TextView
import androidx.annotation.AnyThread
import androidx.annotation.WorkerThread
import androidx.test.platform.app.InstrumentationRegistry
import com.emergetools.test.R
import java.util.concurrent.atomic.AtomicReference

/**
 * Simple opaque activity used to reduce interference from other windows.
 *
 * For example, sources of potential interference:
 * - live wallpaper rendering
 * - homescreen widget updates
 * - hotword detection
 * - status bar repaints
 * - running in background (some cores may be foreground-app only)
 *
 * Taken from https://github.com/androidx/androidx/blob/androidx-main/benchmark/benchmark-common/src/main/java/androidx/benchmark/IsolationActivity.kt
 * and modified for Emerge's specific needs.
 */
class IsolationActivity : Activity() {
  private var destroyed = false

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.emerge_isolation_activity)

    // disable launch animation
    overridePendingTransition(0, 0)

    if (firstInit) {
      application.registerActivityLifecycleCallbacks(activityLifecycleCallbacks)

      // trigger the one missed lifecycle event, from registering the callbacks late
      activityLifecycleCallbacks.onActivityCreated(this, savedInstanceState)
      firstInit = false
    }

    val old = singleton.getAndSet(this)
    if (old != null && !old.destroyed && !old.isFinishing) {
      throw IllegalStateException("Only one IsolationActivity should exist")
    }

    intent?.extras?.getString(KEY_EXTRA_MESSAGE)?.let(::updateMessage)
  }

  fun updateMessage(message: String?) {
    findViewById<TextView>(R.id.message).text = message
  }

  override fun onResume() {
    super.onResume()
    @Suppress("SyntheticAccessor")
    resumed = true
  }

  override fun onPause() {
    super.onPause()
    @Suppress("SyntheticAccessor")
    resumed = false
  }

  override fun onDestroy() {
    super.onDestroy()
    destroyed = true
  }

  /** finish is ignored! we defer until [actuallyFinish] is called. */
  override fun finish() {
  }

  fun actuallyFinish() {
    // disable close animation
    overridePendingTransition(0, 0)
    super.finish()
  }

  companion object {
    private const val KEY_EXTRA_MESSAGE = "message"

    private const val TAG = "Benchmark"
    internal val singleton = AtomicReference<IsolationActivity>()
    private var firstInit = true
    var resumed: Boolean = false
      private set

    @WorkerThread fun launchSingleton(message: String? = null) {
      singleton.get()?.apply {
        // If already open, just update the message
        runOnUiThread { updateMessage(message) }
      } ?: run {
        val intent = Intent(Intent.ACTION_MAIN).apply {
          Log.d(TAG, "launching Benchmark IsolationActivity")
          setClassName(
            InstrumentationRegistry.getInstrumentation().targetContext.packageName,
            IsolationActivity::class.java.name
          )
          addFlags(Intent.FLAG_ACTIVITY_NEW_TASK)
          addFlags(Intent.FLAG_ACTIVITY_SINGLE_TOP)

          message?.let { putExtra(KEY_EXTRA_MESSAGE, it) }
        }

        InstrumentationRegistry.getInstrumentation().startActivitySync(intent)
      }
    }

    @AnyThread fun finishSingleton() {
      Log.d(TAG, "Benchmark runner being destroyed, tearing down activities")
      singleton.getAndSet(null)?.apply {
        runOnUiThread {
          actuallyFinish()
        }
      }
    }

    private val activityLifecycleCallbacks = object : Application.ActivityLifecycleCallbacks {
      override fun onActivityCreated(
        activity: Activity,
        bundle: Bundle?,
      ) {
        // Forcibly wake the device, and keep the screen on to prevent benchmark failures.
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O_MR1) {
          val keyguardManager = activity.getSystemService(KEYGUARD_SERVICE) as KeyguardManager
          keyguardManager.requestDismissKeyguard(activity, null)
          activity.setShowWhenLocked(true)
          activity.setTurnScreenOn(true)
          activity.window.addFlags(WindowManager.LayoutParams.FLAG_KEEP_SCREEN_ON)
        } else {
          @Suppress("DEPRECATION")
          activity.window.addFlags(
            WindowManager.LayoutParams.FLAG_SHOW_WHEN_LOCKED
              or WindowManager.LayoutParams.FLAG_DISMISS_KEYGUARD
              or WindowManager.LayoutParams.FLAG_KEEP_SCREEN_ON
              or WindowManager.LayoutParams.FLAG_TURN_SCREEN_ON
          )
        }
      }

      override fun onActivityDestroyed(activity: Activity) {}
      override fun onActivitySaveInstanceState(
        activity: Activity,
        bundle: Bundle,
      ) {
      }

      override fun onActivityStarted(activity: Activity) {}
      override fun onActivityStopped(activity: Activity) {}
      override fun onActivityPaused(activity: Activity) {}
      override fun onActivityResumed(activity: Activity) {}
    }
  }
}