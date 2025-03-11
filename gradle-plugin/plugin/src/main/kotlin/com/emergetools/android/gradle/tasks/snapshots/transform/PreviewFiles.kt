package com.emergetools.android.gradle.tasks.snapshots.transform

import org.objectweb.asm.ClassReader
import org.objectweb.asm.Opcodes
import java.io.File
import java.util.concurrent.ConcurrentHashMap

/**
 * Find preview methods in a directory using a two-pass approach:
 * 1. First pass: Find custom preview annotations
 * 2. Second pass: Find methods with preview annotations, including custom ones
 */
fun File.findPreviewMethodsInDirectory(): Sequence<ComposePreviewSnapshotConfig> {
  // First pass: Find all custom annotation classes that are themselves annotated with @Preview
  val customPreviewAnnotations = findCustomPreviewAnnotationsInDirectory()

  // Second pass: Find all methods with preview annotations (both standard and custom)
  return walk()
    .filter { it.name.endsWith(".class") }
    .flatMap { classFile ->
      extractPreviewMethodsFromBytes(
        classFile.name,
        classFile.readBytes(),
        customPreviewAnnotations
      )
    }
}

/**
 * First pass: Scan all class files in a directory to find custom preview annotations
 * Returns a map of custom preview annotation descriptors to their metadata
 */
private fun File.findCustomPreviewAnnotationsInDirectory(): Map<String, CustomPreviewAnnotation> {
  val customPreviewAnnotations = ConcurrentHashMap<String, CustomPreviewAnnotation>()

  walk()
    .filter { it.name.endsWith(".class") }
    .forEach { classFile ->
      findCustomPreviewAnnotationsInBytes(classFile.readBytes(), customPreviewAnnotations)
    }

  return customPreviewAnnotations
}

/**
 * Extract custom preview annotations from class bytes
 */
private fun findCustomPreviewAnnotationsInBytes(
  byteStream: ByteArray,
  customPreviewAnnotations: MutableMap<String, CustomPreviewAnnotation>
) {
  val classReader = ClassReader(byteStream)

  val visitor = FindCustomPreviewClassVisitor(Opcodes.ASM9, customPreviewAnnotations)
  classReader.accept(visitor, ClassReader.EXPAND_FRAMES)
}

/**
 * Extract preview methods from class bytes (second pass)
 */
fun extractPreviewMethodsFromBytes(
  fileName: String,
  byteStream: ByteArray,
  customPreviewAnnotations: Map<String, CustomPreviewAnnotation> = emptyMap()
): List<ComposePreviewSnapshotConfig> {
  val classReader = ClassReader(byteStream)
  val methodNames = mutableListOf<ComposePreviewSnapshotConfig>()

  val visitor =
    SnapshotAggregatorClassVisitor(
      Opcodes.ASM9,
      fileName,
      classReader.className,
      methodNames,
      customPreviewAnnotations
    )

  classReader.accept(visitor, ClassReader.EXPAND_FRAMES)

  return methodNames
}
