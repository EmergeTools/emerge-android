package com.emergetools.snapshots.util

import android.content.Context
import android.os.Bundle
import android.util.Log
import androidx.test.platform.app.InstrumentationRegistry
import com.emergetools.snapshots.shared.ComposePreviewSnapshotConfig
import org.junit.rules.TestRule
import org.junit.runner.Description
import org.junit.runners.model.Statement
import java.io.File
import java.nio.charset.Charset

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

    fun <T> trace(name: String, block: () -> T): T {
      return instance?.traceInternal(name, block) ?: block()
    }

    fun startSpan(name: String) {
      return instance?.startSpanInternal(name) ?: Unit
    }

    fun stopSpan() {
      return instance?.stopSpanInternal() ?: Unit
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

  private val stack = mutableListOf<String>()
  private val foldedStacks = mutableListOf<String>()

  private var startTime = 0L

  override fun apply(base: Statement, description: Description): Statement {
    return object : Statement() {
      @Throws(Throwable::class)
      override fun evaluate() {
        try {
          traceInternal(parameter.keyName()) {
            base.evaluate()
          }
        } finally {
          saveProfile()
          // Reset the instance to ensure future tests
          instance = null
        }
      }
    }
  }

  private fun <T> traceInternal(name: String, block: () -> T): T {
    if (!profilingEnabled) {
      Log.d(TAG, "Profiling disabled, skipping trace")
      return block()
    }

    startSpanInternal(name)
    return try {
      block()
    } finally {
      stopSpanInternal()
    }
  }

  private fun startSpanInternal(name: String) {
    if (!profilingEnabled) {
      Log.d(TAG, "Profiling disabled, skipping startSpan")
      return
    }

    if (stack.isEmpty()) {
      startTime = System.currentTimeMillis()
    }
    stack.add(name)
  }

  private fun stopSpanInternal() {
    if (!profilingEnabled) {
      Log.d(TAG, "Profiling disabled, skipping stopSpan")
      return
    }

    if (stack.isNotEmpty()) {
      val endTime = System.currentTimeMillis()
      val spanName = stack.removeAt(stack.size - 1)
      var foldedStack = stack.joinToString(";")
      if (foldedStack.isNotEmpty()) {
        foldedStack = "$foldedStack;"
      }
      val duration = endTime - startTime
      foldedStacks.add("$foldedStack$spanName $duration")
    }
  }

  fun saveProfile() {
    while (stack.isNotEmpty()) {
      // Finish any hanging stacks
      stopSpanInternal()
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
