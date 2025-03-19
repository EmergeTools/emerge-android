package com.emergetools.android.gradle.tasks.snapshots.transform

import kotlinx.serialization.json.Json
import org.gradle.api.DefaultTask
import org.gradle.api.file.DirectoryProperty
import org.gradle.api.file.RegularFileProperty
import org.gradle.api.provider.Property
import org.gradle.api.tasks.CacheableTask
import org.gradle.api.tasks.Input
import org.gradle.api.tasks.InputFiles
import org.gradle.api.tasks.Optional
import org.gradle.api.tasks.OutputFile
import org.gradle.api.tasks.PathSensitive
import org.gradle.api.tasks.PathSensitivity
import org.gradle.api.tasks.TaskAction

@CacheableTask
abstract class FindPreviewsAcrossProjects : DefaultTask() {
  @get:InputFiles
  @get:PathSensitive(PathSensitivity.RELATIVE)
  abstract val inputDirectory: DirectoryProperty

  @get:OutputFile
  abstract val outputFile: RegularFileProperty

  @get:Input
  @get:Optional
  abstract val includePrivatePreviews: Property<Boolean>

  @TaskAction
  fun findPreviews() {
    val output = outputFile.get().asFile
    output.parentFile.mkdirs()

    // Clear any existing content
    output.writeText("")

    val listOfPreviews = inputDirectory.get().asFile.findPreviewMethodsInDirectory(
      includePrivatePreviews.getOrElse(true)
    ).toList()
    output.writeText(Json.encodeToString(listOfPreviews))
  }
}
