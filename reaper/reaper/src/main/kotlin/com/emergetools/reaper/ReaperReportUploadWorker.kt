// We catch very generic exceptions on purpose. We need to avoid
// crashing the host app.
@file:Suppress("TooGenericExceptionCaught", "MagicNumber")

package com.emergetools.reaper

import android.content.Context
import android.util.Base64
import android.util.Log
import androidx.work.CoroutineWorker
import androidx.work.WorkerParameters
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.ExperimentalCoroutinesApi
import kotlinx.coroutines.suspendCancellableCoroutine
import kotlinx.coroutines.withContext
import kotlinx.serialization.encodeToString
import kotlinx.serialization.json.Json
import okhttp3.Call
import okhttp3.Callback
import okhttp3.MediaType.Companion.toMediaTypeOrNull
import okhttp3.OkHttpClient
import okhttp3.Request
import okhttp3.RequestBody.Companion.toRequestBody
import okhttp3.Response
import okhttp3.internal.closeQuietly
import java.io.DataInputStream
import java.io.EOFException
import java.io.File
import java.io.FileInputStream
import java.io.FileOutputStream
import java.io.IOException
import kotlin.coroutines.resumeWithException

internal class ReaperReportUploadWorker(
  private val context: Context,
  params: WorkerParameters,
) : CoroutineWorker(context, params) {

  companion object {
    const val EXTRA_API_KEY = "REAPER_API_KEY"
    const val EXTRA_BASE_URL = "REAPER_BASE_URL"
    const val EXTRA_DEBUG = "REAPER_DEBUG"
  }

  private val client = OkHttpClient()

  override suspend fun doWork(): Result = withContext(Dispatchers.IO) {
    Log.d(
      TAG,
      "ReaperReportUploadWorker"
    )

    ensureDirectories(context)

    val apiKey = inputData.getString(EXTRA_API_KEY)
    if (apiKey == null) {
      Log.e(TAG, "EXTRA_API_KEY not set")
      return@withContext Result.failure()
    }
    val baseUrl = inputData.getString(EXTRA_BASE_URL)
    if (baseUrl == null) {
      Log.e(TAG, "EXTRA_BASE_URL not set")
      return@withContext Result.failure()
    }
    val isDebug = inputData.getBoolean(EXTRA_DEBUG, false)

    val pendingDir = getPendingDir(context)
    val files = pendingDir.listFiles()
    if (files == null) {
      Log.e(TAG, "No directory ${pendingDir.absolutePath}")
      return@withContext Result.failure()
    } else {
      Log.d(TAG, "${files.size} pending reports")
    }

    var success = true
    for (file in files) {
      try {
        createAndUploadReport(apiKey = apiKey, baseUrl = baseUrl, isDebug = isDebug, file = file)
      } catch (e: Exception) {
        Log.e(TAG, "Failed to report ${file.absolutePath}")
        success = false
      }
      try {
        file.delete()
      } catch (e: Exception) {
        Log.e(TAG, "Failed to delete ${file.absolutePath}")
        success = false
      }
    }

    if (success) {
      Result.success()
    } else {
      Result.failure()
    }
  }

  private suspend fun createAndUploadReport(
    apiKey: String,
    baseUrl: String,
    isDebug: Boolean,
    file: File
  ): Unit =
    withContext(Dispatchers.IO) {
      if (file.exists()) {
        Log.d(
          TAG,
          "Reporting ${file.absolutePath} to $baseUrl with key $apiKey"
        )
      } else {
        Log.e(
          TAG,
          "Reaper report file does not exist ${file.absolutePath}"
        )
      }

      val seen = mutableListOf<String>()
      FileInputStream(file).use { input ->
        DataInputStream(input).use { data ->
          while (true) {
            try {
              val hash = data.readLong()
              val hashAsBase64 = longToBase64(hash)
              seen.add(hashAsBase64)
            } catch (_: EOFException) {
              break
            }
          }
        }
      }

      val report = ReaperReport(
        packageName = applicationContext.packageName,
        version = applicationContext.packageManager.getPackageInfo(
          applicationContext.packageName,
          0
        ).versionName!!,
        apiKey = apiKey,
        seen = seen,

        metadata = Metadata(
          manufacturer = android.os.Build.MANUFACTURER,
          model = android.os.Build.MODEL,
          osVersion = android.os.Build.VERSION.RELEASE,
        ),
      )

      uploadReaperReport(
        apiKey = apiKey,
        report = report,
        baseUrl = baseUrl,
        isDebug = isDebug,
        reportName = file.name,
      )
    }

  private suspend fun uploadReaperReport(
    apiKey: String,
    report: ReaperReport,
    baseUrl: String,
    isDebug: Boolean,
    reportName: String,
  ) {
    val json = Json {
      encodeDefaults = true
      ignoreUnknownKeys = true
    }

    val reportString = json.encodeToString(report)

    if (isDebug) {
      val path = File(getDebugDir(context), "$reportName.json")
      val stream = FileOutputStream(path)
      stream.write(reportString.encodeToByteArray())
    }

    val url = "$baseUrl/report"
    val request = Request.Builder().apply {
      header("Authorization", "Bearer $apiKey")
      url(url)
      post(reportString.toRequestBody("application/json; charset=utf-8".toMediaTypeOrNull()))
    }.build()

    client.newCall(request).executeAsync().use { response ->
      if (response.isSuccessful) {
        Log.d(TAG, "Reaper report response: $response")
      } else if (response.code == 404) {
        Log.e(
          TAG,
          "Upload failed, backend or apiKey unknown. backend=$baseUrl apiKey=$apiKey"
        )
      } else {
        reportError(applicationContext, baseUrl, apiKey, response.toString())
      }
    }
  }

  @OptIn(ExperimentalCoroutinesApi::class)
  private suspend fun Call.executeAsync(): Response = suspendCancellableCoroutine { continuation ->
    continuation.invokeOnCancellation {
      this.cancel()
    }
    this.enqueue(
      object : Callback {
        override fun onFailure(
          call: Call,
          e: IOException,
        ) {
          continuation.resumeWithException(e)
        }

        override fun onResponse(
          call: Call,
          response: Response,
        ) {
          continuation.resume(response) {
            response.closeQuietly()
          }
        }
      },
    )
  }
}

fun longToBase64(hash: Long): String {
  val buf = ByteArray(8)
  for (i in 0..7) {
    buf[i] = ((hash shr i * 8) and 0xFFL).toByte()
  }
  val hashAsBase64 = Base64.encodeToString(buf, Base64.NO_WRAP)
  return hashAsBase64.strip()
}
