package com.emergetools.android.gradle.tasks.snapshots.transform

import org.gradle.api.DefaultTask
import org.gradle.api.file.ConfigurableFileCollection
import org.gradle.api.file.DirectoryProperty
import org.gradle.api.tasks.CacheableTask
import org.gradle.api.tasks.InputFiles
import org.gradle.api.tasks.OutputDirectory
import org.gradle.api.tasks.TaskAction
import java.io.File
import java.util.zip.ZipFile

@CacheableTask
abstract class MergeClasses : DefaultTask() {
  @get:InputFiles
  abstract val inputFiles: ConfigurableFileCollection // JARs and directories

  @get:OutputDirectory
  abstract val outputDir: DirectoryProperty // Directory containing merged class files

  @TaskAction
  fun mergeClassesAction() {
    val outputDirectory = outputDir.get().asFile

    val seenEntries = mutableSetOf<String>() // Track added files to avoid duplicates

    inputFiles.files.forEach { file ->
      if (file.isDirectory) {
        processDirectory(file, outputDirectory, seenEntries) // Merge class files from directories
      } else if (file.extension == "jar") {
        processJar(file, outputDirectory, seenEntries) // Merge class files from JARs
      }
    }
  }

  private fun processDirectory(
    inputDir: File,
    outputDirectory: File,
    seenEntries: MutableSet<String>
  ) {
    inputDir.walkTopDown()
      .filter { it.isFile && it.extension == "class" }
      .forEach { classFile ->
        val relativePath = classFile.relativeTo(inputDir).path
        val targetFile = File(outputDirectory, relativePath)

        if (relativePath !in seenEntries) {
          seenEntries.add(relativePath)
          targetFile.parentFile.mkdirs()
          classFile.copyTo(targetFile, overwrite = true)
        }
      }
  }

  @Suppress("detekt.NestedBlockDepth")
  private fun processJar(jar: File, outputDirectory: File, seenEntries: MutableSet<String>) {
    ZipFile(jar).use { zip ->
      zip.entries().asSequence()
        .filter { !it.isDirectory && it.name.endsWith(".class") }
        .forEach { entry ->
          if (entry.name !in seenEntries) {
            seenEntries.add(entry.name)
            val targetFile = File(outputDirectory, entry.name)
            targetFile.parentFile.mkdirs()
            zip.getInputStream(entry).use { input ->
              targetFile.outputStream().use { output -> input.copyTo(output) }
            }
          }
        }
    }
  }
}
