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

  private val json =
    Json {
      ignoreUnknownKeys = true
    }

  private fun repoId(): List<String>? {
    return git.remoteUrl()?.toWebRepoUri()?.encodedPathSegments
  }

  fun repoOwner() = repoId()?.firstOrNull()

  fun repoName() = repoId()?.get(1)

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
      isPullRequest() -> getPullRequestEventData().pr.head.sha
      else -> null
    }
  }

  /**
   * Similar to [sha], but returns the base sha for the PR based on GH event data.
   */
  fun baseSha(): String? {
    return when {
      isPullRequest() -> getPullRequestEventData().pr.base.sha
      // By default, we don't automatically set a base sha for push events as it could trigger
      // unexpected main branch comparison.
      isPush() -> null
      else -> null
    }
  }

  /**
   * Similar to [sha], but returns the sha for the commit right before the current one.
   */
  fun previousSha(): String? {
    return when {
      isPush() -> getPushEventData().before
      // In the case of branches, `before` can't be relied on from GitHub event data, so we'll skip
      // previousSha for now on `pull_request` events
      else -> null
    }
  }

  fun prNumber(): Int? {
    if (!isPullRequest()) return null
    return getPullRequestEventData().number
  }

  private fun getPushEventData(): GitHubPushEvent {
    return json.decodeFromString(getEventDataString())
  }

  private fun getPullRequestEventData(): GitHubPullRequestEvent {
    return json.decodeFromString(getEventDataString())
  }

  private fun getEventDataString(): String {
    val gitHubEventPath =
      checkNotNull(System.getenv("GITHUB_EVENT_PATH")) {
        "GITHUB_EVENT_PATH is not set"
      }
    val file = File(gitHubEventPath)
    check(file.exists()) {
      "File $gitHubEventPath doesn't exist"
    }

    return file.readText()
  }

  @Serializable
  data class GitHubPushEvent(
    val before: String,
  )

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
