package com.emergetools.reaper

import java.io.DataOutputStream
import java.io.File
import java.io.FileOutputStream
import java.util.UUID

// The Reaper report currently in progress:
private class Report(
  val stream: FileOutputStream,
  val dataStream: DataOutputStream,
  val path: File
) {
  // All the hashes we have written so far.
  val written = mutableSetOf<Long>()
}

private const val REPORT_SUFFIX_SIZE = 8

internal class ReaperImpl(
  val tracker: HashTracker,
  val delegate: Delegate,
  val apiKey: String,
  val baseUrl: String = ReaperConfig.EMERGE_BASE_URL,
  val isDebug: Boolean = false,
) {
  interface Delegate {
    fun startReport(id: String): File?
    fun deleteReport(id: String)
    fun markReportPending(id: String)
    fun listCurrentReports(): Collection<String>
    fun listPendingReports(): Collection<String>
    fun requestUpload(apiKey: String, baseUrl: String, isDebug: Boolean)
    fun d(message: String)
    fun e(message: String)
    fun <T> trace(name: String, block: () -> T): T
  }

  companion object {
    private const val PENDING_REPORTS_LIMIT = 10
  }

  // Set by startReport() and reset on finalizeReport().
  private var report: Report? = null

  init {
    delegate.d("Reaper initialized. backend=${this.baseUrl} tracker=${tracker.name}")
  }

  // Our internal API. Each of the methods must be thread safe.
  @Synchronized
  fun flush() {
    val report = this.report
    delegate.trace("Reaper#flush") {
      if (report == null) {
        delegate.e("No report to flush")
        return@trace
      } else {
        delegate.d("Flushing report ${report.path.absolutePath}")
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
  fun sweepReports() {
    delegate.trace("Reaper#sweepReports") {
      // If we have too many reports pending upload delete them all:
      val pending = delegate.listPendingReports()
      if (pending.size > PENDING_REPORTS_LIMIT) {
        for (id in pending) {
          delegate.deleteReport(id)
        }
      }

      // Make all current reports to pending.
      val current = delegate.listCurrentReports()
      for (id in current) {
        delegate.markReportPending(id)
      }

      delegate.requestUpload(apiKey = apiKey, baseUrl = baseUrl, isDebug = isDebug)
    }
  }

  @Synchronized
  fun startReport(): String? {
    return delegate.trace("Reaper#startReport") {
      val shortUuid = UUID.randomUUID().toString().substring(0, REPORT_SUFFIX_SIZE)
      val file = delegate.startReport(shortUuid)
      if (file == null) {
        delegate.e("Failed to open Reaper report for writing")
        return@trace null
      }
      val stream = FileOutputStream(file)
      val absolutePath = file.absolutePath

      if (!stream.fd.valid()) {
        delegate.e("Failed to open Reaper report stream for writing $absolutePath")
        return@trace null
      }
      report = Report(stream, DataOutputStream(stream), file)

      delegate.d(
        "Reaper report started. report=$absolutePath backend=$baseUrl tracker=${tracker.name}"
      )
      return@trace absolutePath
    }
  }

  @Synchronized
  fun finalizeReport() {
    delegate.trace("Reaper#finalizeReport") {
      // Flush any remaining hashes:
      flush()

      val report = this.report
      this.report = null
      if (report == null) {
        delegate.e("No report to finalize")
        return@trace
      } else {
        delegate.d("Finalizing report ${report.path.absolutePath}")
      }

      // Move report to pending and schedule upload.
      sweepReports()

      // Start a file for the next report:
      startReport()
    }
  }
}
