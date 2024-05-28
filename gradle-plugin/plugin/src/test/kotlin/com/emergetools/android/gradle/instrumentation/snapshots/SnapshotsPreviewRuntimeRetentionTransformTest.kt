package com.emergetools.android.gradle.instrumentation.snapshots

import com.emergetools.android.gradle.instrumentation.testutils.isClassAnnotationRuntimeVisible
import com.emergetools.android.gradle.instrumentation.testutils.isMethodAnnotationRuntimeVisible
import org.junit.Assert.assertFalse
import org.junit.Assert.assertTrue
import org.junit.Test
import org.junit.runner.RunWith
import org.junit.runners.JUnit4
import org.objectweb.asm.ClassReader
import org.objectweb.asm.ClassWriter
import org.objectweb.asm.Opcodes
import org.slf4j.LoggerFactory
import java.io.File
import java.io.InputStream

@RunWith(JUnit4::class)
class SnapshotsPreviewRuntimeRetentionTransformTest {

  @Test
  fun `test transform applied correctly on method with preview annotation`() {
    val originalClassBytes = loadClassFile("snapshot-test-classes/TextRowWithIconKt.class")

    // Ensure annotation is not yet runtime visible
    assertFalse(
      isMethodAnnotationRuntimeVisible(
        originalClassBytes,
        "Landroidx/compose/ui/tooling/preview/Preview;",
        "TextRowWithIconPreviewFromMainIgnored",
      )
    )

    val transformedClassBytes = applyTransform(originalClassBytes)

    assertTrue(
      isMethodAnnotationRuntimeVisible(
        transformedClassBytes,
        "Landroidx/compose/ui/tooling/preview/Preview;",
        "TextRowWithIconPreviewFromMainIgnored",
      )
    )
  }

  @Test
  fun `test transform applied correctly on method with preview container annotation`() {
    val originalClassBytes = loadClassFile("snapshot-test-classes/TextRowWithIconKt.class")

    // Ensure annotation is not yet runtime visible
    assertFalse(
      isMethodAnnotationRuntimeVisible(
        originalClassBytes,
        "Landroidx/compose/ui/tooling/preview/Preview\$Container;",
        "TextRowWithIconPreviewFromMain",
      )
    )

    val transformedClassBytes = applyTransform(originalClassBytes)

    assertTrue(
      isMethodAnnotationRuntimeVisible(
        transformedClassBytes,
        "Landroidx/compose/ui/tooling/preview/Preview\$Container;",
        "TextRowWithIconPreviewFromMain",
      )
    )
  }

  @Test
  fun `test transform applied correctly on multipreview class with preview annotation`() {
    val originalClassBytes =
      loadClassFile("snapshot-test-classes/TestSinglePreviewMultiPreview.class")

    // Ensure annotation is not yet runtime visible
    assertFalse(
      isClassAnnotationRuntimeVisible(
        originalClassBytes,
        "Landroidx/compose/ui/tooling/preview/Preview;",
      )
    )

    val transformedClassBytes = applyTransform(originalClassBytes)

    assertTrue(
      isClassAnnotationRuntimeVisible(
        transformedClassBytes,
        "Landroidx/compose/ui/tooling/preview/Preview;",
      )
    )
  }

  @Test
  fun `test transform applied correctly on multipreview class with preview container annotation`() {
    val originalClassBytes = loadClassFile("snapshot-test-classes/TestMultiPreview.class")

    // Ensure annotation is not yet runtime visible
    assertFalse(
      isClassAnnotationRuntimeVisible(
        originalClassBytes,
        "Landroidx/compose/ui/tooling/preview/Preview\$Container;",
      )
    )

    val transformedClassBytes = applyTransform(originalClassBytes)

    assertTrue(
      isClassAnnotationRuntimeVisible(
        transformedClassBytes,
        "Landroidx/compose/ui/tooling/preview/Preview\$Container;",
      )
    )
  }

  private fun loadClassFile(fileName: String): ByteArray {
    val classFile = File(javaClass.getResource("/$fileName").file)
    val inputStream: InputStream = classFile.inputStream()
    return inputStream.readBytes()
  }

  private fun applyTransform(originalClassBytes: ByteArray): ByteArray {
    val classReader = ClassReader(originalClassBytes)
    val classWriter = ClassWriter(classReader, 0)

    val classVisitor = SnapshotsPreviewRuntimeRetentionTransform(
      Opcodes.ASM9,
      classWriter,
      LoggerFactory.getLogger(SnapshotsPreviewRuntimeRetentionTransformTest::class.java)
    )
    classReader.accept(classVisitor, ClassReader.SKIP_FRAMES)
    return classWriter.toByteArray()
  }
}
