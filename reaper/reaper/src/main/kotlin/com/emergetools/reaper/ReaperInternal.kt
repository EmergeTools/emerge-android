// We catch very generic exceptions on purpose. We need to avoid
// crashing the host app.
@file:Suppress("MagicNumber", "TooGenericExceptionCaught", "TooManyFunctions")

package com.emergetools.reaper

import android.app.Application
import android.content.Context
import android.content.pm.ApplicationInfo
import android.content.pm.PackageManager
import android.os.Build
import android.os.Handler
import android.os.HandlerThread
import android.os.Looper
import android.system.ErrnoException
import android.util.Log
import androidx.annotation.MainThread
import androidx.lifecycle.ProcessLifecycleOwner
import androidx.work.Constraints
import androidx.work.NetworkType
import androidx.work.OneTimeWorkRequest
import androidx.work.WorkManager
import androidx.work.workDataOf
import java.io.File
import java.io.FileNotFoundException
import java.io.IOException

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
  fun init(context: Context, options: ReaperOptions) {
    synchronized(this) {
      androidTrace("Reaper#init") {
        initSynchronized(context, options)
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
      sendError(context, e.toString())
    }
  }

  private fun initSynchronized(context: Context, options: ReaperOptions) {
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

    val delegate = ReaperImplDelegate(context.applicationContext, options)
    val theImpl = ReaperImpl(
      tracker = tracker,
      delegate = delegate,
      apiKey = apiKey,
      isDebug = isDebug,
      baseUrl = baseUrl,
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

private class ReaperImplDelegate(private val context: Context, options: ReaperOptions) : ReaperImpl.Delegate {
  val logLevel = options.logLevel

  override fun startReport(id: String): File? {
    ensureDirectories(context)
    val name = getReportName(id)
    val file = File(getCurrentDir(context), name)
    try {
      file.delete()
      file.createNewFile()
    } catch (e: IOException) {
      e("Failed to create report $e")
      return null
    } catch (e: FileNotFoundException) {
      e("Failed to create report $e")
      return null
    } catch (e: ErrnoException) {
      e("Failed to create report $e")
      return null
    }
    return file
  }

  override fun deleteReport(id: String) {
    ensureDirectories(context)
    val name = getReportName(id)
    // Try to delete from both directories:
    File(getCurrentDir(context), name).delete()
    File(getPendingDir(context), name).delete()
  }

  override fun markReportPending(id: String) {
    ensureDirectories(context)
    val name = getReportName(id)
    val current = File(getCurrentDir(context), name)
    val pending = File(getPendingDir(context), name)
    current.renameTo(pending)
  }

  override fun listCurrentReports(): Collection<String> {
    ensureDirectories(context)
    return listReports(getCurrentDir(context))
  }

  override fun listPendingReports(): Collection<String> {
    ensureDirectories(context)
    return listReports(getPendingDir(context))
  }

  private fun listReports(dir: File): Collection<String> {
    val files = dir.listFiles() ?: emptyArray<File>()
    val prefix = getReportPrefix()
    val reports = mutableListOf<String>()
    for (file in files) {
      if (file.name.startsWith(prefix)) {
        val id = getIdFromName(file.name)
        if (id != null) {
          reports.add(id)
        }
      }
    }
    return reports
  }

  override fun requestUpload(apiKey: String, baseUrl: String, isDebug: Boolean) {
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

  override fun sendError(message: String) {
    sendError(context, message)
  }

  override fun d(message: String) {
    when (logLevel) {
      ReaperLogLevel.ALL -> Log.d(TAG, message)
      ReaperLogLevel.NONE, ReaperLogLevel.ERRORS -> {}
    }
  }

  override fun e(message: String) {
    when (logLevel) {
      ReaperLogLevel.ALL, ReaperLogLevel.ERRORS -> Log.e(TAG, message)
      ReaperLogLevel.NONE -> {}
    }
  }

  override fun <T> trace(name: String, block: () -> T): T {
    return androidTrace(name, block)
  }

  private fun getReportPrefix(): String {
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

  private fun getReportName(id: String): String {
    return "${getReportPrefix()}_$id"
  }

  private fun getIdFromName(name: String): String? {
    return name.split("_").lastOrNull()
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

@MainThread
private fun mainThreadStart(context: Context, impl: ReaperImpl) {
  impl.delegate.d("Reaper#mainThreadStart")
  impl.delegate.trace("Reaper#mainThreadStart") {
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
        impl.finalizeReport()
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
    sendError(context, e.toString())
  }
}

private fun workerThreadStart(context: Context, looper: Looper, impl: ReaperImpl) {
  impl.delegate.d("Reaper#workerThreadStart")
  impl.delegate.trace("Reaper#workerThreadStart") {
    // If Reaper was running previously but we did not get a chance to finalize the report we may
    // end up with reports 'stuck' in current which will never be finalized. Schedule those for
    // upload.
    wrap(context) {
      impl.sweepReports()
    }

    wrap(context) {
      val path = impl.startReport()
      if (path == null) {
        impl.delegate.e("Failed to start report")
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
