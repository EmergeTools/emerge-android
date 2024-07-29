package com.emergetools.snapshots

import android.content.Context
import android.graphics.Bitmap
import android.os.Bundle
import android.util.Log
import androidx.annotation.VisibleForTesting
import androidx.test.platform.app.InstrumentationRegistry
import com.emergetools.snapshots.shared.ComposePreviewSnapshotConfig
import com.emergetools.snapshots.shared.MAX_KEY_NAME_LENGTH
import com.emergetools.snapshots.shared.normalize
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
    type: SnapshotType,
    composePreviewSnapshotConfig: ComposePreviewSnapshotConfig? = null,
  ) {
    val snapshotsDir = File(filesDir, SNAPSHOTS_DIR_NAME)
    if (!snapshotsDir.exists() && !snapshotsDir.mkdirs()) {
      error("Unable to create snapshots storage directory.")
    }

    // We need a stable key to use for the filename and comparison
    // For composables, see [ComposePreviewSnapshotConfig.keyName]
    // For non-composables, we use the normalized displayName
    val keyName = keyName(
      type = type,
      displayName = displayName,
      composePreviewSnapshotConfig = composePreviewSnapshotConfig,
    )
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
        type = type,
        fqn = fqn,
        composePreviewSnapshotConfig = composePreviewSnapshotConfig,
      )
    }
  }

  fun saveError(
    displayName: String?,
    fqn: String,
    type: SnapshotType,
    errorType: SnapshotErrorType,
    composePreviewSnapshotConfig: ComposePreviewSnapshotConfig? = null,
  ) {
    val snapshotsDir = File(filesDir, SNAPSHOTS_DIR_NAME)
    if (!snapshotsDir.exists() && !snapshotsDir.mkdirs()) {
      error("Unable to create snapshots storage directory.")
    }

    // We need a stable key to use for the filename and comparison
    // For composables, see [ComposePreviewSnapshotConfig.keyName]
    // For non-composables, we use the normalized displayName
    val keyName = keyName(
      type = type,
      displayName = displayName,
      composePreviewSnapshotConfig = composePreviewSnapshotConfig,
    )
    if (saveMetadata) {
      saveErrorMetadata(
        snapshotsDir = snapshotsDir,
        displayName = displayName,
        keyName = keyName,
        type = type,
        fqn = fqn,
        errorType = errorType,
        composePreviewSnapshotConfig = composePreviewSnapshotConfig,
      )
    }
  }

  private fun saveImage(
    snapshotsDir: File,
    keyName: String,
    bitmap: Bitmap,
  ) {
    saveFile(snapshotsDir, "$keyName$PNG_EXTENSION") {
      bitmap.compress(Bitmap.CompressFormat.PNG, DEFAULT_PNG_QUALITY, this)
    }
  }

  private fun saveMetadata(
    snapshotsDir: File,
    keyName: String,
    displayName: String?,
    fqn: String,
    type: SnapshotType,
    composePreviewSnapshotConfig: ComposePreviewSnapshotConfig? = null,
  ) {
    val metadata: SnapshotMetadata = SnapshotMetadata.SuccessMetadata(
      name = keyName,
      displayName = displayName,
      filename = "$keyName$PNG_EXTENSION",
      fqn = fqn,
      type = type,
      composePreviewSnapshotConfig = composePreviewSnapshotConfig,
    )

    Log.d(TAG, "Saving error metadata for $keyName")
    val jsonString = Json.encodeToString(metadata)

    saveFile(snapshotsDir, "$keyName$JSON_EXTENSION") {
      write(jsonString.toByteArray(Charset.defaultCharset()))
    }
  }

  private fun saveErrorMetadata(
    snapshotsDir: File,
    keyName: String,
    displayName: String?,
    fqn: String,
    type: SnapshotType,
    errorType: SnapshotErrorType,
    composePreviewSnapshotConfig: ComposePreviewSnapshotConfig? = null,
  ) {
    val metadata: SnapshotMetadata = SnapshotMetadata.ErrorMetadata(
      name = keyName,
      displayName = displayName,
      fqn = fqn,
      type = type,
      errorType = errorType,
      composePreviewSnapshotConfig = composePreviewSnapshotConfig,
    )

    Log.d(TAG, "Saving error metadata for $keyName")
    val jsonString = Json.encodeToString(metadata)

    saveFile(snapshotsDir, "$keyName$JSON_EXTENSION") {
      write(jsonString.toByteArray(Charset.defaultCharset()))
    }
  }

  @VisibleForTesting
  fun keyName(
    type: SnapshotType,
    displayName: String?,
    composePreviewSnapshotConfig: ComposePreviewSnapshotConfig? = null,
  ): String {
    return if (type == SnapshotType.COMPOSABLE) {
      checkNotNull(composePreviewSnapshotConfig) {
        "composePreviewSnapshotConfig must be set for COMPOSABLE snapshots"
      }
      composePreviewSnapshotConfig.keyName()
    } else {
      checkNotNull(displayName) {
        "displayName must be set for non-COMPOSABLE snapshots"
      }
      displayName.normalize().take(MAX_KEY_NAME_LENGTH)
    }
  }

  private fun saveFile(
    dir: File,
    filenameWithExtension: String,
    writer: FileOutputStream.() -> Unit,
  ) {
    val outputFile = File(dir, filenameWithExtension)
    check(!outputFile.exists()) {
      "File with name $filenameWithExtension already exists."
    }
    Log.d(TAG, "Saving file to ${outputFile.path}")
    outputFile.outputStream().use { writer(it) }
  }

  private const val PNG_EXTENSION = ".png"
  private const val JSON_EXTENSION = ".json"
}
