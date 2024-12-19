package com.emergetools.snapshots

import android.content.Context
import android.graphics.Bitmap
import android.os.Bundle
import android.util.Log
import androidx.test.platform.app.InstrumentationRegistry
import com.emergetools.snapshots.shared.ComposePreviewSnapshotConfig
import com.emergetools.snapshots.util.Profiler
import kotlinx.serialization.encodeToString
import kotlinx.serialization.json.Json
import java.io.File
import java.io.FileOutputStream
import java.nio.charset.Charset

internal object SnapshotSaver {

  private const val DEFAULT_PNG_QUALITY = 100
  private const val SNAPSHOTS_DIR_NAME = "snapshots"
  private const val ARG_KEY_SAVE_METADATA = "save_metadata"
  private const val TAG = "SnapshotSaver"

  private val targetContext: Context
    get() = InstrumentationRegistry.getInstrumentation().targetContext

  private val filesDir: File
    get() = targetContext.getExternalFilesDir(null) ?: error("External files dir is null")

  private val args: Bundle
    get() = InstrumentationRegistry.getArguments()

  private val saveMetadata: Boolean
    get() = args.getBoolean(ARG_KEY_SAVE_METADATA, false) ||
      args.getString(ARG_KEY_SAVE_METADATA, "false").toBoolean()

  fun save(
    displayName: String?,
    bitmap: Bitmap,
    fqn: String,
    composePreviewSnapshotConfig: ComposePreviewSnapshotConfig,
  ) {
    Profiler.startSpan("save")
    val snapshotsDir = File(filesDir, SNAPSHOTS_DIR_NAME)
    if (!snapshotsDir.exists() && !snapshotsDir.mkdirs()) {
      error("Unable to create snapshots storage directory.")
    }

    // We need a stable key to use for the filename and comparison
    // For composables, see [ComposePreviewSnapshotConfig.keyName]
    // For non-composables, we use the normalized displayName
    val keyName = composePreviewSnapshotConfig.keyName()
    saveImage(
      snapshotsDir = snapshotsDir,
      keyName = keyName,
      bitmap = bitmap
    )

    if (saveMetadata) {
      saveMetadata(
        snapshotsDir = snapshotsDir,
        displayName = displayName,
        keyName = keyName,
        fqn = fqn,
        composePreviewSnapshotConfig = composePreviewSnapshotConfig,
      )
    }
    Profiler.endSpan()
  }

  fun saveError(
    displayName: String?,
    fqn: String,
    errorType: SnapshotErrorType,
    composePreviewSnapshotConfig: ComposePreviewSnapshotConfig,
  ) {
    Profiler.startSpan("saveError")
    val snapshotsDir = File(filesDir, SNAPSHOTS_DIR_NAME)
    if (!snapshotsDir.exists() && !snapshotsDir.mkdirs()) {
      error("Unable to create snapshots storage directory.")
    }

    if (saveMetadata) {
      saveErrorMetadata(
        snapshotsDir = snapshotsDir,
        displayName = displayName,
        fqn = fqn,
        errorType = errorType,
        composePreviewSnapshotConfig = composePreviewSnapshotConfig,
      )
    }
    Profiler.endSpan()
  }

  private fun saveImage(
    snapshotsDir: File,
    keyName: String,
    bitmap: Bitmap,
  ) {
    Profiler.startSpan("saveImage")
    saveFile(snapshotsDir, "$keyName$PNG_EXTENSION") {
      bitmap.compress(Bitmap.CompressFormat.PNG, DEFAULT_PNG_QUALITY, this)
    }
    Profiler.endSpan()
  }

  private fun saveMetadata(
    snapshotsDir: File,
    keyName: String,
    displayName: String?,
    fqn: String,
    composePreviewSnapshotConfig: ComposePreviewSnapshotConfig,
  ) {
    Profiler.startSpan("saveMetadata")
    val metadata: SnapshotMetadata = SnapshotMetadata.SuccessMetadata(
      name = keyName,
      displayName = displayName,
      filename = "$keyName$PNG_EXTENSION",
      fqn = fqn,
      composePreviewSnapshotConfig = composePreviewSnapshotConfig,
    )

    Log.d(TAG, "Saving metadata for $keyName")
    val jsonString = Json.encodeToString(metadata)

    saveFile(snapshotsDir, "$keyName$JSON_EXTENSION") {
      write(jsonString.toByteArray(Charset.defaultCharset()))
    }
    Profiler.endSpan()
  }

  private fun saveErrorMetadata(
    snapshotsDir: File,
    displayName: String?,
    fqn: String,
    errorType: SnapshotErrorType,
    composePreviewSnapshotConfig: ComposePreviewSnapshotConfig,
  ) {
    Profiler.startSpan("saveErrorMetadata")
    val keyName = composePreviewSnapshotConfig.keyName()
    val metadata: SnapshotMetadata = SnapshotMetadata.ErrorMetadata(
      name = composePreviewSnapshotConfig.keyName(),
      displayName = displayName,
      fqn = fqn,
      errorType = errorType,
      composePreviewSnapshotConfig = composePreviewSnapshotConfig,
    )

    Log.d(TAG, "Saving error metadata for $keyName")
    val jsonString = Json.encodeToString(metadata)

    saveFile(snapshotsDir, "$keyName$JSON_EXTENSION") {
      write(jsonString.toByteArray(Charset.defaultCharset()))
    }
    Profiler.endSpan()
  }

  private fun saveFile(
    dir: File,
    filenameWithExtension: String,
    writer: FileOutputStream.() -> Unit,
  ) {
    Profiler.startSpan("saveFile")
    val outputFile = File(dir, filenameWithExtension)

    if (outputFile.exists()) {
      Log.e(TAG, "File with name $filenameWithExtension already exists, skipping save.")
      return
    }

    Log.d(TAG, "Saving file to ${outputFile.path}")
    outputFile.outputStream().use { writer(it) }
    Profiler.endSpan()
  }

  private const val PNG_EXTENSION = ".png"
  private const val JSON_EXTENSION = ".json"
}
