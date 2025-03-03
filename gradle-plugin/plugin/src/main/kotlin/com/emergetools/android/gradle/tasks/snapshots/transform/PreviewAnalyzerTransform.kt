package com.emergetools.android.gradle.tasks.snapshots.transform

import kotlinx.serialization.encodeToString
import kotlinx.serialization.json.Json
import org.gradle.api.artifacts.transform.InputArtifact
import org.gradle.api.artifacts.transform.TransformAction
import org.gradle.api.artifacts.transform.TransformOutputs
import org.gradle.api.artifacts.transform.TransformParameters
import org.gradle.api.file.FileSystemLocation
import org.gradle.api.provider.Provider
import org.objectweb.asm.ClassReader
import org.objectweb.asm.Opcodes
import org.objectweb.asm.tree.AnnotationNode
import org.objectweb.asm.tree.ClassNode
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

    val outputFile = outputs.file("output.txt")

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
    TODO("analzying aar file not yet implemented")
    // Implementation of AAR analysis using ZipFile to avoid copying to temp dir
    // This is more configuration cache friendly than using Project.zipTree
  }



  companion object {
    fun File.findPreviewMethodsInDirectory(): Sequence<ComposePreviewSnapshotConfig> {
      return walk()
        .filter { it.name.endsWith(".class") }
        .flatMap { classFile ->
          extractPreviewMethodsFromBytes(classFile.name, classFile.readBytes())
        }
    }

    fun extractPreviewMethodsFromBytes(fileName: String, byteStream: ByteArray): List<ComposePreviewSnapshotConfig> {
      val classReader = ClassReader(byteStream)
      val methodNames = mutableListOf<ComposePreviewSnapshotConfig>()

      val visitor = SnapshotAggregatorClassVisitor(Opcodes.ASM9, fileName, classReader.className, methodNames)

      classReader.accept(visitor, ClassReader.EXPAND_FRAMES)

      return methodNames
    }
  }
}

