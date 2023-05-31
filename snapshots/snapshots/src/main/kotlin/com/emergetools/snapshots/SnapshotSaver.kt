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
    name: String,
    bitmap: Bitmap,
    testClass: String,
    testMethod: String,
  ) {
    val snapshotsDir = File(filesDir, SNAPSHOTS_DIR_NAME)
    if (!snapshotsDir.exists() && !snapshotsDir.mkdirs()) {
      error("Unable to create snapshots storage directory.")
    }

    val safeFileName = safeFilename(name)
    saveImage(snapshotsDir, safeFileName, bitmap)
    if (
      args.getBoolean(ARG_KEY_SAVE_METADATA, false) ||
      args.getString(ARG_KEY_SAVE_METADATA, "false").toBoolean()
    ) {
      saveMetadata(
        snapshotsDir = snapshotsDir,
        userSpecifiedName = name,
        filename = safeFileName,
        testClass = testClass,
        testMethod = testMethod,
      )
    }
  }

  private fun saveImage(
    snapshotsDir: File,
    filename: String,
    bitmap: Bitmap,
  ) {
    saveFile(snapshotsDir, "$filename.png") {
      bitmap.compress(Bitmap.CompressFormat.PNG, DEFAULT_PNG_QUALITY, this)
    }
  }

  private fun saveMetadata(
    snapshotsDir: File,
    userSpecifiedName: String,
    filename: String,
    testClass: String,
    testMethod: String,
  ) {
    val metadata = SnapshotImageMetadata(
      userSpecifiedName = userSpecifiedName,
      filename = "$filename.png",
      testClass = testClass,
      testMethod = testMethod,
    )
    saveFile(snapshotsDir, "$filename.json") {
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

  private fun safeFilename(userDefinedName: String): String {
    // Replace spaces with underscores and lowercase the string
    val safeFilename = userDefinedName.replace(Regex("\\s"), "_") // replace spaces with underscore
      .lowercase()

    if (safeFilename.length <= MAX_FILENAME_LENGTH) return safeFilename
    // If the string is still too long, shorten to 32 characters
    return safeFilename.substring(0, MAX_FILENAME_LENGTH)
  }

  private const val MAX_FILENAME_LENGTH = 32
}
