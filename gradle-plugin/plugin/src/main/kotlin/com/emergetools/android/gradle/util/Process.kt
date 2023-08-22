package com.emergetools.android.gradle.util

import org.gradle.process.ExecOperations
import java.io.ByteArrayOutputStream

fun ExecOperations.execute(command: String): String? {
  val outputStream = ByteArrayOutputStream()
  exec {
    it.commandLine(command.split(" "))
    it.standardOutput = outputStream
  }

  val output = String(outputStream.toByteArray(), Charsets.UTF_8).trimEnd()
  if (output.isEmpty()) {
    return null
  }
  return output
}
