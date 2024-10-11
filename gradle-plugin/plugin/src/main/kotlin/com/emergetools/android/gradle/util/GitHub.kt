package com.emergetools.android.gradle.util

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import kotlinx.serialization.json.Json
import org.gradle.process.ExecOperations
import java.io.File

internal class GitHub(private val execOperations: ExecOperations) {

  private val git by lazy {
    Git(execOperations)
  }

  private val json = Json {
    ignoreUnknownKeys = true
  }

  private fun repoId(): String? {
    val remoteUrl = git.remoteUrl() ?: return null
    val result = Regex("[/:]([^/]+/[^/.]+)\\.git$").find(remoteUrl) ?: return null
    return result.groupValues[1]
  }

  fun repoOwner() = repoId()?.split('/')?.get(0)

  fun repoName() = repoId()?.split('/')?.get(1)

  private fun getEvent(): String? {
    return System.getenv("GITHUB_EVENT_NAME")
  }

  fun isSupportedGitHubEvent(): Boolean {
    return isPullRequest() || isPush()
  }

  private fun isPullRequest(): Boolean = getEvent() == GITHUB_EVENT_PR

  private fun isPush(): Boolean = getEvent() == GITHUB_EVENT_PUSH

  /**
   * GitHub workflows for pull_requests are invoked on a merge commit rather than the branch commit.
   * To ensure status checks work along with proper diffing on PRs, we'll attempt to get the sha
   * and bas
   */
  fun sha(): String? {
    return when {
      isPush() -> System.getenv("GITHUB_SHA")
      isPullRequest() -> getGithubEventData().pr.head.sha
      else -> null
    }
  }

  /**
   * Similar to [sha], but returns the base sha for the PR based on GH event data.
   */
  fun baseSha(): String? {
    return when {
      isPush() -> {
        if (execOperations.execute("git rev-parse HEAD^ >/dev/null 2>&1") != null) {
          execOperations.execute("git rev-parse HEAD^")
        } else {
          null
        }
      }
      isPullRequest() -> getGithubEventData().pr.base.sha
      else -> null
    }
  }
  /**
   * Similar to [sha], but returns the sha for the commit right before the current one.
   */
  fun previousSha(): String? {
    return when {
      isPush() -> System.getenv("GITHUB_SHA")
      isPullRequest() -> getGithubEventData().before
      else -> null
    }
  }

  fun prNumber(): Int? {
    if (!isPullRequest()) return null
    return getGithubEventData().number
  }

  private fun getGithubEventData(): GitHubPullRequestEvent {
    val gitHubEventPath = checkNotNull(System.getenv("GITHUB_EVENT_PATH")) {
      "GITHUB_EVENT_PATH is not set"
    }
    val file = File(gitHubEventPath)
    check(file.exists()) {
      "File $gitHubEventPath doesn't exist"
    }

    val fileContent = file.readText()
    return json.decodeFromString(fileContent)
  }

  @Serializable
  data class GitHubPullRequestEvent(
    @SerialName("pull_request")
    val pr: GitHubPullRequest,
    val number: Int,
  )

  @Serializable
  data class GitHubPullRequest(
    val base: GitHubPullRequestCommit,
    val head: GitHubPullRequestCommit,
  )

  @Serializable
  data class GitHubPullRequestCommit(
    val sha: String,
  )

  companion object {
    private const val GITHUB_EVENT_PR = "pull_request"
    private const val GITHUB_EVENT_PUSH = "push"
  }
}
