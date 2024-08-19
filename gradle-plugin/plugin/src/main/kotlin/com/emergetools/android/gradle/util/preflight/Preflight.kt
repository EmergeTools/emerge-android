package com.emergetools.android.gradle.util.preflight

import com.emergetools.android.gradle.tasks.base.BasePreflightTask
import org.gradle.api.GradleException
import org.gradle.api.logging.Logger

private data class Item(val description: String, val result: Result<Unit>) {
  val isFailure = result.isFailure
  val isSuccess = result.isSuccess
}

class PreflightFailure(message: String) : Exception(message)

data class PreflightVcsInfo(
  val sha: String? = null,
  val baseSha: String? = null,
  val branchName: String? = null,
  val prNumber: String? = null,
  val gitHubRepoName: String? = null,
  val gitHubRepoOwner: String? = null,
  val gitLabProjectId: String? = null,
) {
  companion object {
    fun BasePreflightTask.setFromBasePreflightTask(): PreflightVcsInfo {
      return PreflightVcsInfo(
        sha = sha.orNull,
        baseSha = baseSha.orNull,
        branchName = branchName.orNull,
        prNumber = prNumber.orNull,
        gitHubRepoName = gitHubRepoName.orNull,
        gitHubRepoOwner = gitHubRepoOwner.orNull,
        gitLabProjectId = gitLabProjectId.orNull,
      )
    }
  }
}

class Preflight(
  private val title: String,
  private val vcsInfo: PreflightVcsInfo? = null,
) {
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

    val lines = mutableListOf(
      getHeadingTop(heading),
      heading,
      getHeadingBottom(heading)
    )

    for (item in items) {
      val isLast = items.last() == item
      val box = if (isLast) "╚═" else "╠═"
      val emoji = if (item.isSuccess) "✅" else "❌"
      val description = item.description
      lines.add("$box $emoji $description")
    }

    vcsInfo?.let { vcsInfo ->
      val vcsHeading = "║ VCS Info ║"
      lines.add("\n")
      lines.add(getHeadingTop(vcsHeading))
      lines.add(vcsHeading)
      lines.add(getHeadingBottom(vcsHeading))

      val vcsItems = mutableListOf<String>()
      vcsItems.add("SHA: ${vcsInfo.sha ?: "Empty"}")
      vcsItems.add("Base SHA: ${vcsInfo.baseSha ?: "Empty"}")
      vcsItems.add("Branch: ${vcsInfo.branchName ?: "Empty"}")
      vcsItems.add("PR number: ${vcsInfo.prNumber ?: "Not set"}")
      vcsItems.add("GitHub")
      vcsItems.add("Repo name: ${vcsInfo.gitHubRepoName ?: "Not set"}")
      vcsItems.add("Repo owner: ${vcsInfo.gitHubRepoOwner ?: "Not set"}")
      vcsItems.add("GitLab")
      vcsItems.add("Project ID: ${vcsInfo.gitLabProjectId ?: "Not set"}")
      vcsItems.forEach { item ->
        val isLast = vcsItems.last() == item
        val box = if (isLast) "╚═" else "╠═"
        lines.add("$box $item")
      }
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
      val message = item.result.exceptionOrNull()?.message ?: continue
      errors.add("  ❌ " + message)
    }
    return errors.joinToString(separator = "\n")
  }
}
