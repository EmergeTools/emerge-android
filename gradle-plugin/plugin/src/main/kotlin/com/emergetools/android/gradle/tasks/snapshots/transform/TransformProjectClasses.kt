package com.emergetools.android.gradle.tasks.snapshots.transform

import com.emergetools.android.gradle.tasks.snapshots.transform.PreviewAnalyzerTransform.Companion.findPreviewMethodsInDirectory
import kotlinx.serialization.encodeToString
import kotlinx.serialization.json.Json
import org.gradle.api.DefaultTask
import org.gradle.api.file.DirectoryProperty
import org.gradle.api.file.RegularFileProperty
import org.gradle.api.tasks.InputDirectory
import org.gradle.api.tasks.OutputFile
import org.gradle.api.tasks.TaskAction

abstract class TransformProjectClasses : DefaultTask() {

  @get:InputDirectory
  abstract val inputDir: DirectoryProperty

  @get:OutputFile
  abstract val outputFile: RegularFileProperty

  @TaskAction
  fun transform() {
    val input = inputDir.get().asFile

    if (!input.exists()) {
      println("⚠️ Warning: No compiled class files found in ${input.absolutePath}")
      return
    }

    val methods = input.findPreviewMethodsInDirectory()

    // Write aggregated preview methods to a file
    val outputFile = outputFile.get().asFile
    outputFile.writeText(Json.encodeToString(methods.toList()))
  }
}
