package com.emergetools.android.gradle.tasks.snapshots.transform

import kotlinx.serialization.json.Json
import org.gradle.api.artifacts.transform.InputArtifact
import org.gradle.api.artifacts.transform.TransformAction
import org.gradle.api.artifacts.transform.TransformOutputs
import org.gradle.api.artifacts.transform.TransformParameters
import org.gradle.api.file.FileSystemLocation
import org.gradle.api.provider.Provider
import java.io.File
import java.util.jar.JarFile

abstract class PreviewAnalyzerTransform : TransformAction<TransformParameters.None> {
  @get:InputArtifact
  abstract val inputArtifact: Provider<FileSystemLocation>

  override fun transform(outputs: TransformOutputs) {
    val input = inputArtifact.get().asFile
    if (!input.name.endsWith(".jar") && !input.name.endsWith(".aar") && !input.isDirectory) {
      return
    }

    val outputFile = outputs.file("composePreviewMethods.json")

    val previewMethods = when {
      input.isDirectory -> findMethodsInDirectory(input)
      input.name.endsWith(".jar") -> analyzeJarFile(input)
      input.name.endsWith(".aar") -> analyzeAarFile(input)
      else -> throw IllegalArgumentException("Unsupported input type: $input")
    }

    val json = Json.encodeToString(previewMethods.toList())

    outputFile.writeText(json)
  }

  private fun analyzeJarFile(inputJar: File): Sequence<ComposePreviewSnapshotConfig> {
    val methods = mutableListOf<ComposePreviewSnapshotConfig>()
    JarFile(inputJar).use { jarFile ->
      jarFile.entries().asSequence()
        .filter { it.name.endsWith(".class") }
        .forEach { classEntry ->
          jarFile.getInputStream(classEntry).use { inputStream ->
            methods.addAll(extractPreviewMethodsFromBytes(classEntry.realName , inputStream.readBytes()))
          }
        }
    }
    return methods.asSequence()
  }

  private fun findMethodsInDirectory(directory: File) : Sequence<ComposePreviewSnapshotConfig> {
    return directory.findPreviewMethodsInDirectory()
  }

  private fun analyzeAarFile(aarFile: File) : Sequence<ComposePreviewSnapshotConfig> {
    throw IllegalArgumentException("Unsupported input type: $aarFile")
  }
}

