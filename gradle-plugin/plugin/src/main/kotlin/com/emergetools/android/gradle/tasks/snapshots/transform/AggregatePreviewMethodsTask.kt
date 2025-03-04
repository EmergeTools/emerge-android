package com.emergetools.android.gradle.tasks.snapshots.transform

import kotlinx.serialization.ExperimentalSerializationApi
import kotlinx.serialization.json.Json
import kotlinx.serialization.json.decodeFromStream
import org.gradle.api.DefaultTask
import org.gradle.api.file.ConfigurableFileCollection
import org.gradle.api.file.RegularFileProperty
import org.gradle.api.tasks.CacheableTask
import org.gradle.api.tasks.InputFiles
import org.gradle.api.tasks.OutputFile
import org.gradle.api.tasks.PathSensitive
import org.gradle.api.tasks.PathSensitivity
import org.gradle.api.tasks.TaskAction

@OptIn(ExperimentalSerializationApi::class)
@CacheableTask
abstract class AggregatePreviewMethodsTask : DefaultTask() {
  @get:InputFiles
  @get:PathSensitive(PathSensitivity.NAME_ONLY)
  abstract val inputFiles: ConfigurableFileCollection

  @get:OutputFile
  abstract val outputFile: RegularFileProperty

  @TaskAction
  fun aggregate() {
    val output = outputFile.get().asFile
    output.parentFile.mkdirs()

    // Clear any existing content
    output.writeText("")

    // Aggregate all preview method files
    val list =
      inputFiles.flatMap { Json.decodeFromStream<List<ComposePreviewSnapshotConfig>>(it.inputStream()) }
    output.writeText(Json.encodeToString(list))
  }
}
