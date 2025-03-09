package com.emergetools.android.gradle.tasks.snapshots.transform

import kotlinx.serialization.json.Json
import org.gradle.api.DefaultTask
import org.gradle.api.file.ConfigurableFileCollection
import org.gradle.api.file.RegularFileProperty
import org.gradle.api.tasks.CacheableTask
import org.gradle.api.tasks.InputFiles
import org.gradle.api.tasks.OutputFile
import org.gradle.api.tasks.PathSensitive
import org.gradle.api.tasks.PathSensitivity
import org.gradle.api.tasks.TaskAction

@CacheableTask
abstract class FindPreviewsAcrossProjects : DefaultTask() {
  @get:InputFiles
  @get:PathSensitive(PathSensitivity.NAME_ONLY)
  abstract val inputFiles: ConfigurableFileCollection

  @get:OutputFile
  abstract val outputFile: RegularFileProperty

  @TaskAction
  fun findPreviews() {
    val output = outputFile.get().asFile
    output.parentFile.mkdirs()

    // Clear any existing content
    output.writeText("")

    // Merge all input files (classes) in to a single directory

    val listOfPreviews =
      inputFiles.flatMap { file ->
        val previewMethods = when {
          file.isDirectory -> file.findPreviewMethodsInDirectory()
          file.name.endsWith(".jar") -> analyzeJarFile(file)
          else -> throw IllegalArgumentException("Unsupported input type: $file")
        }
        previewMethods.toList()
      }
    output.writeText(Json.encodeToString(listOfPreviews))
  }
}
