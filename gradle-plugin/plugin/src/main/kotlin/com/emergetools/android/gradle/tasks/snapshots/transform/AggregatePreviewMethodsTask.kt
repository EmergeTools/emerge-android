package com.emergetools.android.gradle.tasks.snapshots.transform

import kotlinx.serialization.ExperimentalSerializationApi
import kotlinx.serialization.encodeToString
import kotlinx.serialization.json.Json
import kotlinx.serialization.json.decodeFromStream
import org.gradle.api.DefaultTask
import org.gradle.api.file.ConfigurableFileCollection
import org.gradle.api.file.RegularFileProperty
import org.gradle.api.tasks.InputFiles
import org.gradle.api.tasks.OutputFile
import org.gradle.api.tasks.TaskAction

@OptIn(ExperimentalSerializationApi::class)
abstract class AggregatePreviewMethodsTask : DefaultTask() {
  @get:InputFiles
  abstract val inputFiles: ConfigurableFileCollection

  @get:OutputFile
  abstract val outputFile: RegularFileProperty

  @TaskAction
  fun aggregate() {
    val output = outputFile.get().asFile
    output.parentFile.mkdirs()

    output.writeText("")

    // Aggregate all preview method files
    val list = inputFiles.flatMap { Json.decodeFromStream<List<ComposePreviewSnapshotConfig>>(it.inputStream()) }
    output.writeText(Json.encodeToString(list))
  }
}
