package com.emergetools.snapshots.util

import android.content.Context
import android.os.Bundle
import android.util.Log
import androidx.test.platform.app.InstrumentationRegistry
import com.emergetools.snapshots.models.ComposePreviewSnapshotConfig
import org.junit.rules.TestRule
import org.junit.runner.Description
import org.junit.runners.model.Statement
import java.io.File
import java.nio.charset.Charset

/**
 * Helper to generate a simple folded stacks flamegraph of a given test.
 *
 * Note: While we wanted to use Profiler.trace(lambda: () -> Unit) for this, the lambda wrapping
 * seems to cause issues in timing/the rendering pipeling which manifest in tiny
 * rendering diffs (i.e. no anti-aliasing). This is a simpler version that just
 * requires manual startSpan/endSpan calls to avoid
 */
class Profiler(
  private val parameter: ComposePreviewSnapshotConfig,
) : TestRule {

  companion object {
    private const val TAG = "Profiler"
    private const val ARG_KEY_SAVE_PROFILE = "save_profile"

    @Volatile
    private var instance: Profiler? = null

    fun getInstance(previewConfig: ComposePreviewSnapshotConfig): Profiler =
      instance ?: synchronized(this) {
        instance ?: Profiler(previewConfig).also { instance = it }
      }

    fun startSpan(name: String) {
      return instance?.startSpanInternal(name) ?: Unit
    }

    fun endSpan() {
      return instance?.endSpanInternal() ?: Unit
    }
  }

  private val targetContext: Context
    get() = InstrumentationRegistry.getInstrumentation().targetContext

  private val filesDir: File
    get() = targetContext.getExternalFilesDir(null) ?: error("External files dir is null")

  private val args: Bundle
    get() = InstrumentationRegistry.getArguments()

  private val profilingEnabled: Boolean by lazy {
    args.getBoolean(ARG_KEY_SAVE_PROFILE, false) ||
      args.getString(ARG_KEY_SAVE_PROFILE, "false").toBoolean()
  }

  private data class SpanInfo(
    val name: String,
    val startTime: Long
  )

  private val stack = mutableListOf<SpanInfo>()
  private val foldedStacks = mutableListOf<String>()

  override fun apply(base: Statement, description: Description): Statement {
    return object : Statement() {
      @Throws(Throwable::class)
      override fun evaluate() {
        try {
          startSpanInternal(parameter.keyName())
          base.evaluate()
          endSpanInternal()
        } finally {
          saveProfile()
          // Reset the instance to ensure future tests
          instance = null
        }
      }
    }
  }

  private fun startSpanInternal(name: String) {
    if (!profilingEnabled) {
      Log.d(TAG, "Profiling disabled, skipping startSpan")
      return
    }

    stack.add(
      SpanInfo(
        name = name,
        startTime = System.currentTimeMillis()
      )
    )
  }

  private fun endSpanInternal() {
    if (!profilingEnabled) {
      Log.d(TAG, "Profiling disabled, skipping stopSpan")
      return
    }

    if (stack.isNotEmpty()) {
      val endTime = System.currentTimeMillis()
      val spanInfo = stack.removeAt(stack.size - 1)

      var foldedStack = stack.joinToString(";") { it.name }
      if (foldedStack.isNotEmpty()) {
        foldedStack = "$foldedStack;"
      }

      val duration = endTime - spanInfo.startTime
      foldedStacks.add("$foldedStack${spanInfo.name} $duration")
    }
  }

  fun saveProfile() {
    while (stack.isNotEmpty()) {
      // Finish any hanging stacks
      endSpanInternal()
    }

    if (foldedStacks.isEmpty()) {
      Log.d(TAG, "No profiling data to save")
      return
    }

    val snapshotsDir = File(filesDir, "snapshots")
    if (!snapshotsDir.exists() && !snapshotsDir.mkdirs()) {
      error("Unable to create snapshots storage directory.")
    }

    val outputFileName = "${parameter.keyName()}.folded"
    val outputFile = File(snapshotsDir, outputFileName)

    if (outputFile.exists()) {
      Log.e(TAG, "File with name $outputFileName already exists, skipping save.")
      return
    }

    Log.d(TAG, "Saving profile to ${outputFile.path}")

    val profileData = foldedStacks.joinToString("\n")
    outputFile.outputStream().use { it.write(profileData.toByteArray(Charset.defaultCharset())) }
  }
}
