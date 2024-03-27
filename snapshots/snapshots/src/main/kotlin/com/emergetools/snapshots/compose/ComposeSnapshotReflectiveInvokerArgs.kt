package com.emergetools.snapshots.compose

import android.content.Context
import android.os.Bundle
import com.emergetools.snapshots.shared.ComposePreviewSnapshotConfig
import kotlinx.serialization.Serializable
import kotlinx.serialization.json.Json
import java.io.File

@Serializable
data class ComposeSnapshotReflectiveSnapshotBatch(
  val snapshots: List<ComposePreviewSnapshotConfig>,
) {
  companion object {
    const val ARG_INVOKE_DATA_PATH = "invoke_data_path"


    fun fromArgs(context: Context, args: Bundle): ComposeSnapshotReflectiveSnapshotBatch {
      val invokeDataPath = args.getString(ARG_INVOKE_DATA_PATH) ?: throw IllegalArgumentException("Missing invoke_data_path arg")

      val invokeDataFile = File(context.getExternalFilesDir(null), invokeDataPath)
      if (!invokeDataFile.exists()) {
        error("Unable to find file at $invokeDataPath")
      }

      val json = Json {
        ignoreUnknownKeys = true
      }

      return json.decodeFromString<ComposeSnapshotReflectiveSnapshotBatch>(invokeDataFile.readText())
    }
  }
}
