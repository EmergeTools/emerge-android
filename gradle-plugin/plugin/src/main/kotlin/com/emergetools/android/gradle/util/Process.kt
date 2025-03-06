package com.emergetools.android.gradle.util

import org.gradle.api.logging.Logging
import org.gradle.process.ExecOperations
import java.io.ByteArrayOutputStream

fun ExecOperations.executeWithSilentFailures(command: String): String? {
  val logger = Logging.getLogger(this::class.java)
  val outputStream = ByteArrayOutputStream()
  val errorOutputStream = ByteArrayOutputStream()
  exec {
    it.commandLine(command.split(" "))
    it.standardOutput = outputStream
    it.errorOutput = errorOutputStream
    // Intentionally ignore exceptions and swallow to prevent plugin operations from hard failing
    it.isIgnoreExitValue = true
  }

  val errorOutput = String(errorOutputStream.toByteArray()).trimEnd()
  if (errorOutput.isNotBlank()) {
    logger.warn("Error running $command: $errorOutput")
  }

  val output = String(outputStream.toByteArray()).trimEnd()
  if (output.isEmpty()) {
    return null
  }
  return output
}
