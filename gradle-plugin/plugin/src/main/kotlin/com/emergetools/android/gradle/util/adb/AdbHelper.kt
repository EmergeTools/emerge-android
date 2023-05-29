package com.emergetools.android.gradle.util.adb

import com.emergetools.android.gradle.util.execute
import com.emergetools.android.gradle.util.trimmedText
import org.gradle.api.logging.Logger
import java.nio.file.Files
import java.nio.file.Path

// TODO: Let's clean this up a bit
class AdbHelper(
  private val logger: Logger,
  private val path: Path = Path.of("${System.getenv("ANDROID_HOME")}/platform-tools/adb"),
) {

  init {
    check(Files.exists(path)) { "ADB not found at path: $path" }
    logger.debug("ADB Helper initialized with path: $path")
  }

  fun devices(): List<String> {
    val result = checkNotNull(exec("devices")) {
      "Error running adb devices"
    }

    val lines = result.lines()
      .filter { it.isNotBlank() }
      .drop(1)
    return lines.map { it.split("\t").first() }
  }

  fun uninstall(packageName: String) = exec(listOf("uninstall", packageName))

  fun install(path: String) = exec(listOf("install", path))

  fun shell(vararg arguments: String) = exec(listOf("shell") + arguments)

  fun shell(arguments: List<String>) = exec(listOf("shell") + arguments)

  fun pull(
    deviceDir: String,
    localDir: String,
  ) = exec(listOf("pull", "$deviceDir/.", localDir))

  fun exec(vararg args: String) = exec(args.toList())

  fun exec(args: List<String>): String? {
    val command = "$path ${args.joinToString(" ")}"
		logger.lifecycle("Executing command: $command")
    return command.execute().trimmedText
  }
}
