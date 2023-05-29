package com.emergetools.android.gradle.util.network

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import kotlinx.serialization.decodeFromString
import kotlinx.serialization.encodeToString
import kotlinx.serialization.json.Json
import okhttp3.HttpUrl
import okhttp3.MediaType.Companion.toMediaType
import okhttp3.OkHttpClient
import okhttp3.Request
import okhttp3.RequestBody.Companion.asRequestBody
import okhttp3.RequestBody.Companion.toRequestBody
import java.io.File

const val SOURCE_GRADLE_PLUGIN = "gradle_plugin"

@Serializable
data class EmergeUploadRequestData(
  val apiToken: String,
  val filename: String,
  val sha: String?,
  val baseSha: String?,
  val branch: String?,
  val repoName: String?,
  val prNumber: String?,
  val buildType: String?,
  val gitlabProjectId: String?,
  val source: String,
	val androidSnapshotsEnabled: Boolean,
)

@Serializable
data class EmergeUploadResponse(
  @SerialName("uploadURL") val uploadUrl: String,
  @SerialName("upload_id") val uploadId: String,
)

fun fetchSignedUrl(
  client: OkHttpClient,
  uploadData: EmergeUploadRequestData,
  baseUrl: HttpUrl,
): EmergeUploadResponse {
  val mediaType = "application/json".toMediaType()
  val json = Json {
    ignoreUnknownKeys = true
  }
  val body = json.encodeToString(uploadData).toRequestBody(mediaType)
  val url = baseUrl.resolve("/upload")
    ?: throw IllegalStateException("Could not resolve /upload for baseUrl: $baseUrl")
  val request: Request = Request.Builder().apply {
    url(url)
    post(body)
    addHeader("Accept", "application/json")
    addHeader("Content-Type", "application/json")
    addHeader("X-API-Token", uploadData.apiToken)
  }.build()

  client.newCall(request).execute().use { response ->
    check(response.isSuccessful) {
      "Unexpected code $response"
    }
    val responseString = checkNotNull(response.body?.string()) {
      "Received null body from upload request"
    }
    return json.decodeFromString(responseString)
  }
}

fun postFile(
  client: OkHttpClient,
  file: File,
  signedUrl: HttpUrl,
) {
  val mediaType = "application/zip".toMediaType()
  val request = Request.Builder().apply {
    addHeader("Content-Type", "application/zip")
    url(signedUrl)
    put(file.asRequestBody(mediaType))
  }.build()

  client.newCall(request).execute().use { response ->
    check(response.isSuccessful) {
      "Unexpected code $response"
    }
  }
}
