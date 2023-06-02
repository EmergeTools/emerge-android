package com.emergetools.snapshots

import android.content.Context
import android.graphics.Bitmap
import android.os.Bundle
import android.util.Log
import androidx.test.platform.app.InstrumentationRegistry
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

  fun save(
    displayName: String,
    bitmap: Bitmap,
    fqn: String,
    type: SnapshotType,
  ) {
    val snapshotsDir = File(filesDir, SNAPSHOTS_DIR_NAME)
    if (!snapshotsDir.exists() && !snapshotsDir.mkdirs()) {
      error("Unable to create snapshots storage directory.")
    }

    val keyName = keyName(
      displayName = displayName,
      fqn = fqn
    )
    saveImage(
      snapshotsDir = snapshotsDir,
      keyName = keyName,
      bitmap = bitmap
    )
    if (
      args.getBoolean(ARG_KEY_SAVE_METADATA, false) ||
      args.getString(ARG_KEY_SAVE_METADATA, "false").toBoolean()
    ) {
      saveMetadata(
        snapshotsDir = snapshotsDir,
        displayName = displayName,
        keyName = keyName,
        type = type,
        fqn = fqn,
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
    displayName: String,
    keyName: String,
    fqn: String,
    type: SnapshotType,
  ) {
    val metadata = SnapshotImageMetadata(
      displayName = displayName,
      keyName = keyName,
      filename = "$keyName$PNG_EXTENSION",
      fqn = fqn,
      type = type,
    )
    saveFile(snapshotsDir, "$keyName$JSON_EXTENSION") {
      write(metadata.toJsonString().toByteArray(Charset.defaultCharset()))
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

  /**
   * Normalize the user defined & fully qualified name to be used as a filename/key for comparisons.
   * This ensures uniqueness across test classes and methods & user-defined names.
   */
  private fun keyName(
    displayName: String,
    fqn: String,
  ): String {
    val combined = "${fqn.take(FQN_TRIM_LENGTH)}_${displayName.take(DISPLAY_NAME_TRIM_LENGTH)}"
    // Replace spaces & periods with underscores and lowercase the string
    val keyName = combined.replace(Regex("[ .]"), "_")
      .lowercase()

    if (keyName.length <= MAX_NAME_LENGTH) return keyName
    // If the string is still too long, shorten to 32 characters
    return keyName.substring(0, MAX_NAME_LENGTH)
  }

  private const val MAX_NAME_LENGTH = 64
  private const val FQN_TRIM_LENGTH = 31
  private const val DISPLAY_NAME_TRIM_LENGTH = 32
  private const val PNG_EXTENSION = ".png"
  private const val JSON_EXTENSION = ".json"
}
