package com.emergetools.snapshots.processor

import com.google.common.io.Resources
import com.tschuchort.compiletesting.KotlinCompilation
import com.tschuchort.compiletesting.SourceFile
import com.tschuchort.compiletesting.kspArgs
import com.tschuchort.compiletesting.kspSourcesDir
import com.tschuchort.compiletesting.symbolProcessorProviders
import junit.framework.Assert.assertEquals
import junit.framework.Assert.assertTrue
import org.assertj.core.api.Assertions.assertThat
import org.junit.Rule
import org.junit.Test
import java.io.File

class PreviewProcessorTest {

  companion object {
    // Set to true to overwrite the test outputs with those generated from tests above.
    const val UPDATE_TEST_OUTPUTS = false
  }

  @Rule
  @JvmField
  val testNameRule = TestNameRule()

  @Test
  fun `standalone preview function produces one snapshot test`() {
    compileInputsAndVerifyOutputs()
  }

  @Test
  fun `standalone preview function with two previews produces two snapshot tests`() {
    compileInputsAndVerifyOutputs()
  }

  @Test
  fun `two preview functions produces two snapshot tests`() {
    compileInputsAndVerifyOutputs()
  }

  @Test
  fun `standalone preview function with private preview produces no snapshot test`() {
    compileInputsAndVerifyOutputs()
  }

  @Test
  fun `standalone preview function with internal preview produces one snapshot test`() {
    compileInputsAndVerifyOutputs(
      mutableMapOf("emerge.experimentalInternalEnabled" to "true")
    )
  }

  @Test
  fun `multipreview function with two previews produces two snapshots`() {
    compileInputsAndVerifyOutputs()
  }

  @Test
  fun `multipreview internal function with two previews produces two snapshots`() {
    compileInputsAndVerifyOutputs(
      mutableMapOf("emerge.experimentalInternalEnabled" to "true")
    )
  }

  @Test
  fun `multipreview function with two previews and additional preview produces three snapshots`() {
    compileInputsAndVerifyOutputs()
  }

  @Test
  fun `multipreview with three previews and normal preview produces four snapshots`() {
    compileInputsAndVerifyOutputs()
  }

  @Test
  fun `stacked multipreview five total previews produces five snapshots`() {
    compileInputsAndVerifyOutputs()
  }

  private fun compileInputs(
    options: MutableMap<String, String> = mutableMapOf(),
    onCompilation: (compilation: KotlinCompilation, result: KotlinCompilation.Result) -> Unit,
  ) {
    val testResourcesDir = getTestResourcesDirectory(getRootResourcesDir())

    val inputDir = File(testResourcesDir, "input")
    inputDir.mkdirs()

    val compilation = KotlinCompilation().apply {
      sources = inputDir.listFiles()?.toList().orEmpty().map(SourceFile::fromPath)
      symbolProcessorProviders = listOf(PreviewProcessorProvider())
      kspArgs = options
      inheritClassPath = true
      messageOutputStream = System.out
    }

    val result = compilation.compile()
    onCompilation(compilation, result)
  }

  @Suppress("UnusedPrivateMember")
  private fun assertCompilationFails(errorMessage: String) {
    compileInputs { _, result ->
      assertEquals(KotlinCompilation.ExitCode.COMPILATION_ERROR, result.exitCode)

      assertTrue(result.messages.contains(errorMessage))
    }
  }

  private fun compileInputsAndVerifyOutputs(
    options: MutableMap<String, String> = mutableMapOf(),
  ) {
    compileInputs(options = options) { compilation, result ->
      result.assertGeneratedSources(compilation)
    }
  }

  /**
   * Collects the files in the "output" directory of this test's resources directory
   * and validates that they match the generated sources of this compilation result.
   */
  private fun KotlinCompilation.Result.assertGeneratedSources(
    compilation: KotlinCompilation,
  ) {
    assertEquals(KotlinCompilation.ExitCode.OK, exitCode)

    val testResourcesDir = getTestResourcesDirectory(getRootResourcesDir())
    val outputDir = File(testResourcesDir, "output")

    if (UPDATE_TEST_OUTPUTS) {
      outputDir.deleteRecursively()
    }
    outputDir.mkdirs()

    val generatedSources = compilation.kspSourcesDir.walk().filter { it.isFile }.toList()
    if (UPDATE_TEST_OUTPUTS) {
      generatedSources.forEach {
        it.copyTo(File(outputDir, it.name))
      }
    } else {
      assertEquals(outputDir.listFiles()?.size ?: 0, generatedSources.size)

      generatedSources.forEach { actualFile ->
        val expectedFile = File(outputDir, actualFile.name)
        assertTrue(expectedFile.exists())
        assertThat(actualFile).hasSameTextualContentAs(expectedFile)
      }
    }
  }

  private fun getRootResourcesDir(): File {
    val path = Resources.getResource("")
      .path
      .substringBefore("/build/")
      .plus("/src/test/resources")

    return File(path)
  }

  private fun getTestResourcesDirectory(rootResourcesDir: File): File {
    val methodName = testNameRule
      .methodName
      .replace(" ", "_")

    val className = testNameRule.className.substringAfterLast(".")
    return File(rootResourcesDir, "$className/$methodName")
  }
}
