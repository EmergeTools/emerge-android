package com.emergetools.android.gradle.util.preflight

import org.gradle.api.GradleException
import org.gradle.api.logging.Logger

private data class Item(val description: String, val result: Result<Unit>) {
  val isFailure = result.isFailure
  val isSuccess = result.isSuccess
}

class PreflightFailure(message: String) : Exception(message)

class Preflight(private val title: String) {
  private val items = mutableListOf<Item>()

  fun add(description: String, check: () -> Unit) {
    items.add(Item(description, runCatching(check)))
  }

  fun isSuccessful(): Boolean {
    for (item in items) {
      if (item.isFailure) {
        return false
      }
    }
    return true
  }

  fun logOutput(
    logger: Logger,
    additionalSuccessLogging: (() -> String)? = null,
    additionalFailureLogging: (() -> String)? = null,
  ) {
    logger.lifecycle("")
    logger.lifecycle(render())
    logger.lifecycle("")

    if (isSuccessful()) {
      additionalSuccessLogging?.let { logger.lifecycle(it()) }
    }

    if (!isSuccessful()) {
      additionalFailureLogging?.let { logger.lifecycle(it()) }
      throw GradleException(renderErrors())
    }
  }

  /**
   * Renders a string like:
   * ╔══════════════════════════════════════════════╗
   * ║ Douglas Adams preflight was successful (3/3) ║
   * ╠══════════════════════════════════════════════╝
   * ╠═ ✅ HHGTTG open to page 42
   * ╠═ ✅ Towel on person
   * ╚═ ✅ Tea hot
   * from the preflight checks.
   */
  fun render(): String {
    val result = if (isSuccessful()) "was successful" else "failed"
    val successCount = items.count { it.isSuccess }
    val totalCount = items.size
    val heading = "║ $title preflight $result ($successCount/${totalCount}) ║"
    val headingTop = (CharArray(heading.length) {
      if (it == 0) {
        return@CharArray '╔'
      }
      if (it == heading.length - 1) {
        return@CharArray '╗'
      }
      return@CharArray '═'
    }).joinToString("");
    val headingBottom = (CharArray(heading.length) {
      if (it == 0) {
        return@CharArray '╠'
      }
      if (it == heading.length - 1) {
        return@CharArray '╝'
      }
      return@CharArray '═'
    }).joinToString("");

    val lines = mutableListOf(headingTop, heading, headingBottom)

    for (item in items) {
      val isLast = items.last() == item
      val box = if (isLast) "╚═" else "╠═"
      val emoji = if (item.isSuccess) "✅" else "❌"
      val description = item.description
      lines.add("$box $emoji $description")
    }
    return lines.joinToString(separator = "\n")
  }

  fun renderErrors(): String {
    val errors = mutableListOf("Errors:")
    for (item in items) {
      val message = item.result.exceptionOrNull()?.message ?: continue
      errors.add("  ❌ " + message)
    }
    return errors.joinToString(separator = "\n")
  }
}
