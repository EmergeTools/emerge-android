package com.emergetools.android.gradle.util.preflight

import org.gradle.api.GradleException
import org.gradle.api.logging.Logger

sealed class Result<T> {
  class Success<T>(value: T) : Result<T>()
  class Warning<T>(val message: String) : Result<T>()
  class Failure<T>(val message: String) : Result<T>()
}

private data class Item(val description: String, val result: Result<Unit>) {
  val isSuccess: Boolean
    get() = result !is Result.Failure
  val isFailure: Boolean
    get() = result is Result.Failure
  val isWarning: Boolean
    get() = result is Result.Warning
}
class PreflightWarning(message: String) : Exception(message)
class PreflightFailure(message: String) : Exception(message)

inline fun <R> runCatching(block: () -> R): Result<R> {
  return try {
    Result.Success(block())
  } catch (e: PreflightWarning) {
    Result.Warning(e.message!!)
  } catch (e: Throwable) {
    Result.Failure(e.message!!)
  }
}

class Preflight(private val title: String) {
  private val items = mutableListOf<Item>()

  private val subPreflights = mutableListOf<Preflight>()

  fun add(description: String, check: () -> Unit = {}) {
    items.add(Item(description, runCatching(check)))
  }

  fun addSubPreflight(preflight: Preflight) {
    subPreflights.add(preflight)
  }

  fun isSuccessful(): Boolean {
    for (item in items) {
      if (item.isFailure) {
        return false
      }
    }
    for (subPreflight in subPreflights) {
      if (!subPreflight.isSuccessful()) {
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
    val heading = "║ $title $result ($successCount/${totalCount}) ║"

    val lines = mutableListOf(
      getHeadingTop(heading),
      heading,
      getHeadingBottom(heading)
    )

    for (item in items) {
      val isLast = items.last() == item
      val box = if (isLast) "╚═" else "╠═"
      val emoji = when {
        item.isWarning -> "⚠️"
        item.isSuccess -> "✅"
        else -> "❌"
      }
      val description = item.description
      val line = buildString {
        append(box)
        append(" ")
        append(emoji)
        append(" ")
        append(description)
        if (item.isWarning) {
          append(" - ")
          append((item.result as Result.Warning).message)
        }
      }
      lines.add(line)
    }

    for (subPreflight in subPreflights) {
      lines.add("\n")
      lines.add(subPreflight.render())
    }

    return lines.joinToString(separator = "\n")
  }

  private fun getHeadingTop(heading: String): String {
    return (CharArray(heading.length) {
      if (it == 0) {
        return@CharArray '╔'
      }
      if (it == heading.length - 1) {
        return@CharArray '╗'
      }
      return@CharArray '═'
    }).joinToString("")
  }

  private fun getHeadingBottom(heading: String): String {
    return (CharArray(heading.length) {
      if (it == 0) {
        return@CharArray '╠'
      }
      if (it == heading.length - 1) {
        return@CharArray '╝'
      }
      return@CharArray '═'
    }).joinToString("")
  }

  fun renderErrors(): String {
    val errors = mutableListOf("Errors:")
    for (item in items) {
      val message = (item.result as? Result.Failure)?.message ?: continue
      errors.add("  ❌ " + message)
    }
    return errors.joinToString(separator = "\n")
  }
}
