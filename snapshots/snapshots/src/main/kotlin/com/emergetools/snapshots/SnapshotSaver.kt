package com.emergetools.snapshots

import android.content.Context
import android.graphics.Bitmap
import android.os.Bundle
import android.util.Log
import androidx.annotation.VisibleForTesting
import androidx.test.platform.app.InstrumentationRegistry
import com.emergetools.snapshots.shared.ComposePreviewSnapshotConfig
import com.emergetools.snapshots.shared.ComposePreviewSnapshotConfig.Companion.DEFAULT
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

  fun save(
    displayName: String,
    bitmap: Bitmap,
    fqn: String,
    type: SnapshotType,
    composePreviewSnapshotConfig: ComposePreviewSnapshotConfig? = null,
  ) {
    val snapshotsDir = File(filesDir, SNAPSHOTS_DIR_NAME)
    if (!snapshotsDir.exists() && !snapshotsDir.mkdirs()) {
      error("Unable to create snapshots storage directory.")
    }

    val keyName = keyName(displayName, composePreviewSnapshotConfig)
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
    displayName: String,
    keyName: String,
    fqn: String,
    type: SnapshotType,
    composePreviewSnapshotConfig: ComposePreviewSnapshotConfig? = null,
  ) {
    val metadata = SnapshotImageMetadata(
      displayName = displayName,
      keyName = keyName,
      filename = "$keyName$PNG_EXTENSION",
      fqn = fqn,
      type = type,
      composePreviewSnapshotConfig = composePreviewSnapshotConfig,
    )

    val jsonString = Json.encodeToString(metadata)

    saveFile(snapshotsDir, "$keyName$JSON_EXTENSION") {
      write(jsonString.toByteArray(Charset.defaultCharset()))
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
   * Normalize the user defined name to be used as a filename/key for comparisons.
   * This ensures uniqueness across test classes and methods & user-defined names.
   *
   * We intentionally don't account for FQN here as we still want to diff an image if
   * the test might move packages, which user-defined name ensures.
   */
  @VisibleForTesting
  fun keyName(
    displayName: String,
    composePreviewSnapshotConfig: ComposePreviewSnapshotConfig? = null,
  ): String {
    val normalizedDisplayName = displayName.normalize()
      .take(MAX_NAME_LENGTH)

    return composePreviewSnapshotConfig?.let {
      // If not default, we'll append the hashcode to the name to ensure uniqueness based on config
      // Hashcode should preserve equality across field additions/removals in the future.
      if (it.hashCode() != DEFAULT.hashCode()) {
        "${normalizedDisplayName}_${it.hashCode()}"
      } else {
        normalizedDisplayName
      }
    } ?: normalizedDisplayName
  }

  @VisibleForTesting
  fun String.normalize(): String {
    return replace(Regex("[ .-]"), "_")
      //  lowercase the string
      .lowercase()
  }

  @VisibleForTesting
  const val MAX_NAME_LENGTH = 128
  private const val PNG_EXTENSION = ".png"
  private const val JSON_EXTENSION = ".json"
}
