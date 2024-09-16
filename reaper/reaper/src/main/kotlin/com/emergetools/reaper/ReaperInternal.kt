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
import android.os.HandlerThread
import android.os.Looper
import android.util.Log
import androidx.annotation.MainThread
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

private const val DEFERRED_START_MS = 5L * 1000L
private const val FLUSH_PERIOD_MS = 60L * 1000L

/**
 * Internal counterpart to [com.emergetools.reaper.Reaper]
 */
internal object ReaperInternal {
  // The tracker has to be statically initialized to avoid needing to check in every call to
  // logMethodEntry if it exists.
  private val tracker = ThreadLocalSetHashTracker()

  // impl should only be accessed while holding the lock for this object. Set by init().
  private var impl: ReaperImpl? = null

  /**
   * The fast path where we see new hashes. This is called directly by the instrumentation bytecode.
   */
  @JvmStatic
  fun logMethodEntry(methodHash: Long) {
    tracker.logMethodEntry(methodHash)
  }

  /**
   * There are two methods for initializing Reaper:
   * 1. Manually via [Reaper.init]
   * 2. Automatically via [ReaperInitializer]
   * Either way this method is invoked.
   * The startup flow is as follows,
   * - This method creates [ReaperImpl]
   * - then schedules the remaining startup to happen in [DEFERRED_START_MS] via [Handler.postDelayed].
   * - The deferred startup ([mainThreadStart]) runs on the main thread and:
   * - Creates a thread with a [Looper] named `ReaperWorker`
   * - Sets up an [OnStopLifecycleObserver] to call [ReaperImpl.finalizeReport]
   * - And finally posts a message to `ReaperWorker` ([workerThreadStart])
   * - [workerThreadStart] calls
   * - [ReaperImpl.sweepReports] to action reports left from previous sessions
   * - [ReaperImpl.startReport] to start the current report
   * - Sets up a recurring call to [ReaperImpl.flush] every [FLUSH_PERIOD_MS]
   */
  fun init(context: Context) {
    synchronized(this) {
      trace("Reaper#init") {
        initSynchronized(context)
      }
    }
  }

  /**
   * Flush all pending hashes to the report on disk.
   */
  fun flush(context: Context) {
    wrap(context) { it.flush() }
  }

  /**
   * Helper for common logic that should exist on most public methods. Takes a lambda and:
   * 1. aborts with log message if not initialized
   * 2. takes the lock
   * 3. otherwise runs the lambda (passing impl)
   * 4. catching and reporting any errors
   */
  private fun wrap(context: Context, lambda: (impl: ReaperImpl) -> Unit) {
    try {
      synchronized(this) {
        val theImpl = impl
        if (theImpl == null) {
          Log.e(TAG, "Reaper not initialized")
          return
        }
        lambda(theImpl)
      }
    } catch (e: Exception) {
      reportError(context, e.toString())
    }
  }

  private fun initSynchronized(context: Context) {
    if (impl != null) {
      Log.e(TAG, "Reaper already initialized, ignoring Reaper.init().")
      return
    }

    val metaData = context.packageManager.getApplicationInfo(
      context.packageName,
      PackageManager.GET_META_DATA
    ).metaData

    if (!isInstrumented(metaData)) {
      // Explicitly don't use fatalError to ensure we don't crash other variants
      Log.w(
        TAG,
        "Reaper is not enabled, ensure this variant is specified in the reaper.enabledVariants" +
          " list in the Emerge gradle plugin configuration block." +
          " See https://docs.emergetools.com/docs/reaper-setup-android#configure-the-sdk."
      )
      return
    }

    val apiKey = getApiKey(metaData)
    if (apiKey == "") {
      fatalError(context, "Manifest com.emergetools.PUBLISHABLE_API_KEY must be set and non-empty.")
    }

    val isDebug = isDebug(metaData)
    val baseUrl = getBaseUrl(metaData)

    val theImpl = ReaperImpl(
      tracker = tracker,
      isDebug = isDebug,
      baseUrl = baseUrl,
      apiKey = apiKey,
    )
    impl = theImpl

    // Defer remaining main thread startup work (starting the worker thread
    // and creating the lifecycle observer) till some time later - hopefully
    // after startup is done. This must happen on the main thread since we
    // add ProcessLifecycleOwner which must be done from the main thread.
    Handler(Looper.getMainLooper()).postDelayed({
      mainThreadStart(context.applicationContext, theImpl)
    }, DEFERRED_START_MS)
  }
}

// The Reaper report currently in progress:
private class Report(
  val stream: FileOutputStream,
  val dataStream: DataOutputStream,
  val path: File
) {
  // All the hashes we have written so far.
  val written = mutableSetOf<Long>()
}

private fun fatalError(context: Context, message: String) {
  val isRelease = 0 == context.applicationInfo.flags and ApplicationInfo.FLAG_DEBUGGABLE
  if (isRelease) {
    Log.e(TAG, message)
  } else {
    error(message)
  }
}

internal class ReaperImpl(
  val tracker: HashTracker,
  val baseUrl: String = ReaperConfig.EMERGE_BASE_URL,
  val apiKey: String,
  val isDebug: Boolean = false,
) {

  companion object {
    private const val PENDING_REPORTS_LIMIT = 20
  }

  // Set by startReport() and reset on finalizeReport().
  private var report: Report? = null

  init {
    Log.d(
      TAG,
      "Reaper initialized. backend=${this.baseUrl} tracker=${tracker.name}"
    )
  }

  // Our internal API. Each of the methods must be thread safe.
  @Synchronized
  fun flush() {
    val report = this.report
    trace("Reaper#flush") {
      if (report == null) {
        Log.e(TAG, "No report to flush")
        return@trace
      } else {
        Log.d(TAG, "Flushing report ${report.path.absolutePath}")
      }

      // Hashes observed since the last flush() this will normally be a mixture of hashes we
      // already saw and new hashes.
      tracker.flush {
        it.forEach { hash ->
          if (!report.written.contains(hash)) {
            report.dataStream.writeLong(hash)
            report.written.add(hash)
          }
        }
      }

      // Flush the underlying file.
      report.dataStream.flush()
      report.stream.flush()
    }
  }

  /**
   * 1. If there more than PENDING_REPORTS_LIMIT reports pending delete all pending reports.
   * 2. Move all current reports for this process to pending.
   * 3. Schedule an upload job.
   */
  @Synchronized
  fun sweepReports(context: Context) {
    trace("Reaper#sweepReports") {
      // In case directories got deleted between init() and now:
      ensureDirectories(context)

      val pendingDir = getPendingDir(context)
      val pendingFiles = pendingDir.listFiles() ?: emptyArray<File>()
      if (pendingFiles.size > PENDING_REPORTS_LIMIT) {
        for (pending in pendingFiles) {
          pending.delete()
        }
      }

      val currentDir = getCurrentDir(context)
      val currentFiles = currentDir.listFiles() ?: emptyArray<File>()
      val prefix = getReportPrefix(context)
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
  }

  @Synchronized
  fun startReport(context: Context): String? {
    return trace("Reaper#startReport") {
      if (!ensureDirectories(context)) {
        return@trace null
      }

      val shortUuid = UUID.randomUUID().toString().substring(0, 8)
      val name = "${getReportPrefix(context)}_$shortUuid"
      val path = File(getCurrentDir(context), name)
      val stream = FileOutputStream(path)
      val absolutePath = path.absolutePath

      if (!stream.fd.valid()) {
        Log.e(TAG, "Failed to open Reaper report for writing $absolutePath")
        return@trace null
      }
      report = Report(stream, DataOutputStream(stream), path)

      Log.d(
        TAG,
        "Reaper report started. report=$absolutePath backend=$baseUrl tracker=${tracker.name}"
      )

      return@trace absolutePath
    }
  }

  @Synchronized
  fun finalizeReport(context: Context) {
    trace("Reaper#finalizeReport") {
      // Flush any remaining hashes:
      flush()

      val report = this.report
      this.report = null
      if (report == null) {
        Log.e(TAG, "No report to finalize")
        return@trace
      } else {
        Log.d(TAG, "Finalizing report ${report.path.absolutePath}")
      }

      // Move report to pending and schedule upload.
      sweepReports(context)

      // Start a file for the next report:
      startReport(context)
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

@MainThread
private fun mainThreadStart(context: Context, impl: ReaperImpl) {
  trace("Reaper#mainThreadStart") {
    val thread = HandlerThread("ReaperWorker")
    thread.start()

    val looper = thread.looper
    if (looper == null) {
      fatalError(context, "Could not initialize Reaper worker")
      return@trace
    }
    val handler = Handler(looper)

    // Finalize on onStop:
    // This observer has to be added from the main thread.
    val observer = OnStopLifecycleObserver {
      handler.post {
        impl.finalizeReport(context)
      }
    }
    ProcessLifecycleOwner.get().lifecycle.addObserver(observer)

    Handler(looper).post {
      workerThreadStart(context, looper, impl)
    }
  }
}

private fun wrap(context: Context, lambda: () -> Unit) {
  try {
    lambda()
  } catch (e: Exception) {
    reportError(context, e.toString())
  }
}

private fun workerThreadStart(context: Context, looper: Looper, impl: ReaperImpl) {
  Log.d(TAG, "Reaper#workerThreadStart")
  val observer = OnStopLifecycleObserver {
    Handler(looper).post {
      impl.finalizeReport(context)
    }
  }
  ProcessLifecycleOwner.get().lifecycle.addObserver(observer)
  trace("Reaper#workerThreadStart") {
    // If Reaper was running previously but we did not get a chance to finalize the report we may
    // end up with reports 'stuck' in current which will never be finalized. Schedule those for
    // upload.
    wrap(context) {
      impl.sweepReports(context)
    }

    wrap(context) {
      val path = impl.startReport(context)
      if (path == null) {
        Log.e(TAG, "Failed to start report")
      } else {
        // Schedule flushes every FLUSH_PERIOD_MS
        scheduleFlush(context, Handler(looper), impl)
      }
    }
  }
}

private fun scheduleFlush(context: Context, handler: Handler, impl: ReaperImpl) {
  handler.postDelayed({
    wrap(context) {
      impl.flush()
      scheduleFlush(context, handler, impl)
    }
  }, FLUSH_PERIOD_MS)
}
