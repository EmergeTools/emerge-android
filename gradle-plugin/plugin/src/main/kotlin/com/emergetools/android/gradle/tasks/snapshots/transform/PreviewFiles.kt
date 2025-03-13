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

  // Do a second pass in order to prevent file ordering problems
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

  val visitor = FindCustomPreviewClassVisitor(customPreviewAnnotations)
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

/**
 * Return a list of PreviewConfigs based on the passed in annotation
 */
@Suppress("detekt.ReturnCount")
fun previewConfigForAnnotation(forAnnotation: String?): List<PreviewConfig>? {
  when (forAnnotation) {
    PREVIEW_LIGHT_DARK_ANNOTATION_DESC -> {
      return listOf(
        PreviewConfig(name = "light"),
        PreviewConfig(name = "dark", uiMode = UI_MODE_NIGHT_YES or UI_MODE_TYPE_NORMAL)
      )
    }

    PREVIEW_SCREEN_SIZES_ANNOTATION_DESC -> {
      return listOf(
        PreviewConfig(name = "Phone", device = PHONE, showSystemUi = true),
        PreviewConfig(
          name = "Phone - Landscape",
          device = "spec:width = 411dp, height = 891dp, orientation = landscape, dpi = 420",
          showSystemUi = true
        ),
        PreviewConfig(name = "Unfolded Foldable", device = FOLDABLE, showSystemUi = true),
        PreviewConfig(name = "Tablet", device = TABLET, showSystemUi = true),
        PreviewConfig(name = "Desktop", device = DESKTOP, showSystemUi = true)
      )
    }

    PREVIEW_FONT_SCALE_ANNOTATION_DESC -> {
      return listOf(
        PreviewConfig(name = "85%", fontScale = 0.85f),
        PreviewConfig(name = "100%", fontScale = 1.0f),
        PreviewConfig(name = "115%", fontScale = 1.15f),
        PreviewConfig(name = "130%", fontScale = 1.3f),
        PreviewConfig(name = "150%", fontScale = 1.5f),
        PreviewConfig(name = "180%", fontScale = 1.8f),
        PreviewConfig(name = "200%", fontScale = 2f)
      )
    }
    PREVIEW_DYNAMIC_COLORS_ANNOTATION_DESC -> {
      return listOf(
        PreviewConfig(name = "Red", wallpaper = 0),
        PreviewConfig(name = "Blue", wallpaper = 1),
        PreviewConfig(name = "Green", wallpaper = 2),
        PreviewConfig(name = "Yellow", wallpaper = 3)
      )
    }

    else -> {
      return null
    }
  }
}
