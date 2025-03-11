package com.emergetools.android.gradle.tasks.snapshots.transform

import org.objectweb.asm.ClassReader
import org.objectweb.asm.Opcodes
import java.io.File

fun File.findPreviewMethodsInDirectory(): Sequence<ComposePreviewSnapshotConfig> {
  return walk()
    .filter { it.name.endsWith(".class") }
    .flatMap { classFile ->
      extractPreviewMethodsFromBytes(classFile.name, classFile.readBytes())
    }
}

fun extractPreviewMethodsFromBytes(
  fileName: String,
  byteStream: ByteArray
): List<ComposePreviewSnapshotConfig> {
  val classReader = ClassReader(byteStream)
  val methodNames = mutableListOf<ComposePreviewSnapshotConfig>()

  val visitor =
    SnapshotAggregatorClassVisitor(Opcodes.ASM9, fileName, classReader.className, methodNames)

  classReader.accept(visitor, ClassReader.EXPAND_FRAMES)

  return methodNames
}
