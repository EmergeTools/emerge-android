package com.emergetools.reaper

import android.content.Context
import android.content.pm.PackageManager
import android.util.Log
import androidx.work.Constraints
import androidx.work.CoroutineWorker
import androidx.work.NetworkType
import androidx.work.OneTimeWorkRequest
import androidx.work.WorkManager
import androidx.work.WorkerParameters
import androidx.work.workDataOf
import com.emergetools.reaper.utils.OkHttpUtils.closeQuietly
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.ExperimentalCoroutinesApi
import kotlinx.coroutines.suspendCancellableCoroutine
import kotlinx.coroutines.withContext
import kotlinx.serialization.encodeToString
import kotlinx.serialization.json.Json
import okhttp3.Call
import okhttp3.Callback
import okhttp3.MediaType.Companion.toMediaTypeOrNull
import okhttp3.Request
import okhttp3.RequestBody.Companion.toRequestBody
import okhttp3.Response
import java.io.IOException
import kotlin.coroutines.resumeWithException

class ReaperReportErrorWorker(
  context: Context,
  params: WorkerParameters,
) : CoroutineWorker(context, params) {

  companion object {
    const val EXTRA_API_KEY = "REAPER_API_KEY"
    const val EXTRA_BASE_URL = "REAPER_BASE_URL"
    const val EXTRA_MESSAGE = "REAPER_MESSAGE"
  }

  private val client = WorkerResources.getOkHttpClient()

  override suspend fun doWork(): Result = withContext(Dispatchers.IO) {
    Log.d(
      TAG,
      "ReaperReportErrorWorker"
    )

    val apiKey = inputData.getString(EXTRA_API_KEY) ?: return@withContext Result.failure()
    val baseUrl = inputData.getString(EXTRA_BASE_URL) ?: return@withContext Result.failure()
    val message = inputData.getString(EXTRA_MESSAGE) ?: return@withContext Result.failure()

    val error = ReaperError(
      packageName = applicationContext.packageName,
      version = applicationContext.packageManager.getPackageInfo(
        applicationContext.packageName,
        0
      ).versionName!!,
      apiKey = apiKey,
      message = message,

      metadata = Metadata(
        manufacturer = android.os.Build.MANUFACTURER,
        model = android.os.Build.MODEL,
        osVersion = android.os.Build.VERSION.RELEASE,
      ),
    )

    uploadError(
      baseUrl = baseUrl,
      apiKey = apiKey,
      error = error
    )
    Result.success()
  }

  private suspend fun uploadError(
    baseUrl: String,
    apiKey: String,
    error: ReaperError,
  ) {
    val json = Json {
      encodeDefaults = true
      ignoreUnknownKeys = true
    }

    val errorString = json.encodeToString(error)
    val url = "$baseUrl/reaper/error"
    val request = Request.Builder().apply {
      header("Authorization", "Bearer $apiKey")
      url(url)
      post(errorString.toRequestBody("application/json; charset=utf-8".toMediaTypeOrNull()))
    }.build()

    client.newCall(request).executeAsync().use { response ->
      if (response.isSuccessful) {
        Log.d(TAG, "Reaper error successful: $response")
      } else {
        Log.e(TAG, "Reaper error failed: $response")
        // Failed to report the error. Now we just give up.
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

fun sendError(ctx: Context, message: String) {
  val metaData = ctx.packageManager.getApplicationInfo(
    ctx.packageName,
    PackageManager.GET_META_DATA
  ).metaData

  val baseUrl = getBaseUrl(metaData)
  val apiKey = getApiKey(metaData)

  Log.e(TAG, "ReaperError: backend=$baseUrl message=$message")
  val data = workDataOf(
    ReaperReportErrorWorker.EXTRA_API_KEY to apiKey,
    ReaperReportErrorWorker.EXTRA_BASE_URL to baseUrl,
    ReaperReportErrorWorker.EXTRA_MESSAGE to message
  )

  val workRequest = OneTimeWorkRequest.Builder(ReaperReportErrorWorker::class.java).apply {
    setInputData(data)
    setConstraints(
      Constraints.Builder()
        .setRequiredNetworkType(NetworkType.CONNECTED)
        .build()
    )
  }.build()

  WorkManager.getInstance(ctx).enqueue(workRequest)
}
