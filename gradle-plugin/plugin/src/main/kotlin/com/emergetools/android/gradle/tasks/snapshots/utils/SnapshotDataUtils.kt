package com.emergetools.android.gradle.tasks.snapshots.utils

import com.emergetools.android.gradle.tasks.snapshots.ComposePreviewSnapshotConfig
import com.emergetools.android.gradle.tasks.snapshots.ComposeSnapshots
import kotlinx.serialization.json.Json
import java.nio.file.Files
import java.nio.file.Path
import kotlin.io.path.exists
import kotlin.io.path.pathString
import kotlin.io.path.readText
import kotlin.streams.toList as streamToList

object SnapshotDataUtils {
  const val SNAPSHOTS_FILE_NAME = "snapshots.json"

  val json = Json {
    ignoreUnknownKeys = true
  }

  fun getAllSnapshots(outputFolder: Path): ComposeSnapshots {
    check(outputFolder.exists()) {
      "No folder found at ${outputFolder.pathString}"
    }

    val snapshots = Files.walk(outputFolder)
      .filter { path ->
        path.pathString.endsWith(".json") && Files.isRegularFile(path)
      }
      .map {
        val previewConfig = json.decodeFromString<ComposePreviewSnapshotConfig>(it.readText())
        previewConfig
      }.streamToList()

    return ComposeSnapshots(snapshots = snapshots)
  }
}
