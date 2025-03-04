package com.emergetools.android.gradle.tasks.snapshots.transform

import kotlinx.serialization.json.Json
import org.gradle.api.DefaultTask
import org.gradle.api.file.DirectoryProperty
import org.gradle.api.file.RegularFileProperty
import org.gradle.api.tasks.CacheableTask
import org.gradle.api.tasks.InputDirectory
import org.gradle.api.tasks.OutputFile
import org.gradle.api.tasks.PathSensitive
import org.gradle.api.tasks.PathSensitivity
import org.gradle.api.tasks.TaskAction

@CacheableTask
abstract class TransformProjectClasses : DefaultTask() {

  @get:PathSensitive(PathSensitivity.NAME_ONLY)
  @get:InputDirectory
  abstract val inputDir: DirectoryProperty

  @get:OutputFile
  abstract val outputFile: RegularFileProperty

  @TaskAction
  fun transform() {
    val input = inputDir.get().asFile

    if (!input.exists()) {
      logger.warn("⚠️ Warning: No compiled class files found in ${input.absolutePath}")
      return
    }

    val methods = input.findPreviewMethodsInDirectory()

    // Write aggregated preview methods to a file
    val outputFile = outputFile.get().asFile
    outputFile.writeText(Json.encodeToString(methods.toList()))
  }
}
