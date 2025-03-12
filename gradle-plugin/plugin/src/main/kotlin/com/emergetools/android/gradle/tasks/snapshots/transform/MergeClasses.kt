package com.emergetools.android.gradle.tasks.snapshots.transform

import org.gradle.api.DefaultTask
import org.gradle.api.file.ConfigurableFileCollection
import org.gradle.api.file.Directory
import org.gradle.api.file.DirectoryProperty
import org.gradle.api.file.RegularFile
import org.gradle.api.provider.ListProperty
import org.gradle.api.tasks.CacheableTask
import org.gradle.api.tasks.InputFiles
import org.gradle.api.tasks.OutputDirectory
import org.gradle.api.tasks.PathSensitive
import org.gradle.api.tasks.PathSensitivity
import org.gradle.api.tasks.TaskAction
import java.io.File
import java.util.zip.ZipInputStream

@CacheableTask
abstract class MergeClasses : DefaultTask() {
  @get:PathSensitive(PathSensitivity.NAME_ONLY)
  @get:InputFiles
  abstract val dependencyJars: ConfigurableFileCollection // JARs and directories

  /** Will be empty for this task. */
  @get:PathSensitive(PathSensitivity.RELATIVE)
  @get:InputFiles
  abstract val unusedJar: ListProperty<RegularFile>

  /** May be empty. */
  @get:PathSensitive(PathSensitivity.RELATIVE)
  @get:InputFiles
  abstract val projectDirs: ListProperty<Directory>

  @get:OutputDirectory
  abstract val outputDir: DirectoryProperty // Directory containing merged class files

  @TaskAction
  fun mergeClassesAction() {
    val outputDirectory = outputDir.get().asFile
    outputDirectory.deleteRecursively()

    val seenEntries = mutableSetOf<String>() // Track added files to avoid duplicates

    dependencyJars.forEach { file ->
      if (file.isDirectory) {
        processDirectory(file, outputDirectory, seenEntries)
      } else {
        processJar(file, outputDirectory, seenEntries)
      }
    }

    projectDirs.get().forEach {
      processDirectory(it.asFile, outputDirectory, seenEntries)
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
          classFile.copyTo(targetFile)
        }
      }
  }

  @Suppress("detekt.NestedBlockDepth")
  private fun processJar(jar: File, outputDirectory: File, seenEntries: MutableSet<String>) {
    jar.inputStream().use { fis ->
      // ZipInputStream streams data instead of loading the full JAR into memory
      ZipInputStream(fis).use { zis ->
        generateSequence { zis.nextEntry }
          // There's a chance that these filtered out entries are not closed but it should be fine
          // since the zip stream is closed.
          .filter { entry -> !entry.isDirectory && entry.name.endsWith(".class") }
          .filter { entry -> seenEntries.add(entry.name) }
          .forEach { entry ->
            val targetFile = File(outputDirectory, entry.name)
            targetFile.parentFile.mkdirs()
            targetFile.outputStream().use { output -> zis.copyTo(output) }
            zis.closeEntry()
          }
      }
    }
  }
}
