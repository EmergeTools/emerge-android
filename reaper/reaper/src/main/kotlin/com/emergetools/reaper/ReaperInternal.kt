// We catch very generic exceptions on purpose. We need to avoid
// crashing the host app.
@file:Suppress("MagicNumber", "TooGenericExceptionCaught")

package com.emergetools.reaper

import android.app.Application
import android.content.Context
import android.content.pm.ApplicationInfo
import android.content.pm.PackageManager
import android.os.Build
import android.os.Handler
import android.os.Looper
import android.util.Log
import androidx.lifecycle.ProcessLifecycleOwner
import androidx.work.Constraints
import androidx.work.NetworkType
import androidx.work.OneTimeWorkRequest
import androidx.work.WorkManager
import androidx.work.workDataOf
import java.io.DataOutputStream
import java.io.File
import java.io.FileOutputStream
import java.util.UUID

// The Reaper report currently in progress:
private class Report(val stream: FileOutputStream, val dataStream: DataOutputStream, val path: File) {
  // All the hashes we have written so far.
  val written = mutableSetOf<Long>()

  // Hashes we've seen since the last write/flush() this will normally be a mixture of hashes we
  // already saw and new hashes.
  val seenSinceLastWrite = mutableSetOf<Long>()
}

internal object ReaperInternal {
  private const val MANIFEST_TAG_INSTRUMENTED = "com.emergetools.reaper.REAPER_INSTRUMENTED"
  private const val MANIFEST_TAG_PUBLISHABLE_API_KEY = "com.emergetools.reaper.PUBLISHABLE_API_KEY"
  private const val MANIFEST_TAG_OVERRIDE_BASE_URL = "com.emergetools.OVERRIDE_BASE_URL"
  private const val MANIFEST_TAG_DEBUG = "com.emergetools.reaper.DEBUG"
  private const val FLUSH_PERIOD_MS = 60L * 1000L
  private const val PENDING_REPORTS_LIMIT = 20

  private val tracker = ThreadLocalSetHashTracker { onFlush(it) }

  // Members below should only be accessed while holding the lock for this object.
  // Set at init()
  private var isInitialized: Boolean = false
  private var isDebug: Boolean = false
  private var apiKey = ""
  private var baseUrl = ReaperConfig.EMERGE_BASE_URL

  // Set at init() then reset on finalizeReport().
  private var report: Report? = null

  /**
   * The fast path where we see new hashes. This is called directly by the instrumentation bytecode.
   */
  @JvmStatic
  fun logMethodEntry(methodHash: Long) {
    tracker.logMethodEntry(methodHash)
  }

  // Our internal API. Each of the methods must be thread safe.
  fun init(context: Context) {
    // We don't use wrap() here on purpose:
    // - wrap() checks that isInitialized is true and we haven't set that yet.
    // - We don't want to swallow deterministic init() exceptions to make life easier for users to
    //   get the SDK integrated.
    synchronized(this) {
      initSynchronized(context)
    }
  }

  /**
   * Flush all pending hashes to the report on disk.
   */
  fun flush(context: Context) {
    wrap(context) { flushSynchronized(context) }
  }

  fun startReport(context: Context) {
    wrap(context) { startReportSynchronized(context) }
  }

  /**
   * Flush a final time then moving the report from the current to the pending
   * directory. Implicitly starts a new report.
   */
  fun finalizeReport(context: Context) {
    wrap(context) { finalizeReportSynchronized(context) }
  }

  fun sweepReports(context: Context) {
    wrap(context) { sweepReportsSynchronized(context) }
  }

  /**
   * Helper for common logic that should exist on most public methods. Takes a lambda and:
   * 1. Takes the lock
   * 2. aborts with log message if not initialized
   * 3. otherwise runs the lambda
   * 4. catching and reporting any errors
   */
  private fun wrap(context: Context, lambda: () -> Unit) {
    try {
      synchronized(this) {
        if (!isInitialized) {
          Log.e(TAG, "Reaper not initialized")
          return
        }
        lambda()
      }
    } catch (e: Exception) {
      reportError(context, baseUrl, apiKey, e.toString())
    }
  }

  private fun initSynchronized(context: Context) {
    if (isInitialized) {
      Log.e(TAG, "Reaper already initialized, ignoring Reaper.init().")
      return
    }
    apiKey = context.packageManager.getApplicationInfo(
      context.packageName,
      PackageManager.GET_META_DATA
    ).metaData.getString(MANIFEST_TAG_PUBLISHABLE_API_KEY, "")
    if (apiKey == "") {
      fatalError(context, "Manifest com.emergetools.PUBLISHABLE_API_KEY must be set and non-empty.")
    }

    isDebug = context.packageManager.getApplicationInfo(
      context.packageName,
      PackageManager.GET_META_DATA
    ).metaData.getBoolean(MANIFEST_TAG_DEBUG, false)

    this.isInitialized = true

    val isInstrumented = context.packageManager.getApplicationInfo(
      context.packageName,
      PackageManager.GET_META_DATA
    ).metaData.getBoolean(MANIFEST_TAG_INSTRUMENTED)

    this.baseUrl = context.packageManager.getApplicationInfo(
      context.packageName,
      PackageManager.GET_META_DATA
    ).metaData.getString(MANIFEST_TAG_OVERRIDE_BASE_URL, ReaperConfig.EMERGE_BASE_URL)

    // If Reaper was running previously but we did not get a chance to finalize the report we may
    // end up with reports 'stuck' in current which will never be finalized. Schedule those for
    // upload.
    sweepReportsSynchronized(context)

    // TODO(chromy): This is IO in the startup path. Maybe we should move it to later.
    val path = startReportSynchronized(context)
    if (path == null) {
      Log.e(TAG, "Failed to start report")
      return
    }

    if (isInstrumented) {
      Log.d(
        TAG,
        "Reaper initialized. report=$path backend=${this.baseUrl} tracker=${tracker.name}"
      )
      val lifecycleObserver = ReaperLifecycleObserver(context.applicationContext)
      ProcessLifecycleOwner.get().lifecycle.addObserver(lifecycleObserver)
      onFlushPeriod(context)
    } else {
      Log.e(
        TAG,
        "Code not instrumented for Reaper but Reaper was initialized. " +
          "See https://docs.emergetools.com/docs/reaper-setup-android"
      )
    }
  }

  private fun flushSynchronized(context: Context) {
    checkSynchronized(context)
    val report = this.report
    if (report == null) {
      Log.e(TAG, "No report to flush")
      return
    } else {
      Log.d(TAG, "Flushing report ${report.path.absolutePath}")
    }

    // HashTracker calls onFlush which updates report.seenSinceLastWrite
    tracker.flush()

    report.seenSinceLastWrite.forEach { hash ->
      if (!report.written.contains(hash)) {
        report.dataStream.writeLong(hash)
        report.written.add(hash)
      }
    }
    report.seenSinceLastWrite.clear()

    // Flush the underlying file.
    report.dataStream.flush()
    report.stream.flush()
  }

  private fun onFlushPeriod(context: Context) {
    flush(context)
    Handler(Looper.getMainLooper()).postDelayed({
      onFlushPeriod(context)
    }, FLUSH_PERIOD_MS)
  }

  private fun onFlush(hashes: Collection<Long>) {
    val report = this.report ?: return
    report.seenSinceLastWrite.addAll(hashes)
  }

  private fun startReportSynchronized(context: Context): String? {
    checkSynchronized(context)
    if (!ensureDirectories(context)) {
      return null
    }

    val shortUuid = UUID.randomUUID().toString().substring(0, 8)
    val name = "${getReportPrefix(context)}_$shortUuid"
    val path = File(getCurrentDir(context), name)
    val stream = FileOutputStream(path)

    if (!stream.fd.valid()) {
      Log.e(TAG, "Failed to open Reaper report for writing ${path.absolutePath}")
      return null
    }
    report = Report(stream, DataOutputStream(stream), path)

    return path.absolutePath
  }

  private fun finalizeReportSynchronized(context: Context) {
    checkSynchronized(context)

    // Flush any remaining hashes:
    flushSynchronized(context)

    val report = this.report
    this.report = null
    if (report == null) {
      Log.e(TAG, "No report to finalize")
      return
    } else {
      Log.d(TAG, "Finalizing report ${report.path.absolutePath}")
    }

    // Move report to pending and schedule upload.
    sweepReportsSynchronized(context)

    // Start a file for the next report:
    startReportSynchronized(context)
  }

  /**
   * 1. If there more than PENDING_REPORTS_LIMIT reports pending delete all pending reports.
   * 2. Move all current reports for this process to pending.
   * 3. Schedule an upload job.
   */
  private fun sweepReportsSynchronized(context: Context) {
    checkSynchronized(context)

    // In case directories got deleted between init() and now:
    ensureDirectories(context)

    val pendingDir = getPendingDir(context)
    val currentDir = getCurrentDir(context)

    val pendingFiles = currentDir.listFiles() ?: emptyArray<File>()
    val currentFiles = currentDir.listFiles() ?: emptyArray<File>()
    val prefix = getReportPrefix(context)

    if (pendingFiles.size > PENDING_REPORTS_LIMIT) {
      for (pending in pendingFiles) {
        pending.delete()
      }
    }

    // Move all reports into the 'pending' directory:
    for (current in currentFiles) {
      if (current.name.startsWith(prefix)) {
        val pending = File(pendingDir, current.name)
        current.renameTo(pending)
        Log.d(TAG, "Moved ${current.absolutePath} to ${pending.absolutePath}")
      }
    }

    // Schedule upload job:
    val data = workDataOf(
      ReaperReportUploadWorker.EXTRA_API_KEY to apiKey,
      ReaperReportUploadWorker.EXTRA_BASE_URL to baseUrl,
      ReaperReportUploadWorker.EXTRA_DEBUG to isDebug,
    )

    val uploadWorkRequest =
      OneTimeWorkRequest.Builder(ReaperReportUploadWorker::class.java).apply {
        setInputData(data)
        setConstraints(
          Constraints.Builder()
            .setRequiredNetworkType(NetworkType.CONNECTED)
            .build()
        )
      }.build()

    WorkManager.getInstance(context).enqueue(uploadWorkRequest)
  }

  private fun checkSynchronized(context: Context) {
    if (!Thread.holdsLock(this)) {
      fatalError(context, "Unsynchronized call to internal method")
    }
  }

  private fun fatalError(context: Context, message: String) {
    val isRelease = 0 == context.applicationInfo.flags and ApplicationInfo.FLAG_DEBUGGABLE
    if (isRelease) {
      Log.e(TAG, message)
    } else {
      error(message)
    }
  }

  private fun getReportPrefix(context: Context): String {
    var name = context.packageName
    if (Build.VERSION.SDK_INT >= 28) {
      // This will normally be:
      // com.example.foo
      // and sometimes be:
      // com.example.foo:bar
      // for secondary processes. We use this where possible to reduce stomping on secondary
      // process reports.
      name = Application.getProcessName()
    }
    name = name.replace(":", "_")
    name = name.replace(".", "_")
    return "report_$name"
  }
}
