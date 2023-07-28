package com.emergetools.android.gradle.util

import kotlinx.serialization.Serializable
import kotlinx.serialization.json.Json
import kotlinx.serialization.json.decodeFromStream
import java.io.File

internal object GitHub {

  private val json by lazy {
    Json {
      ignoreUnknownKeys = true
    }
  }

  private fun repoId(): String? {
    val remoteUrl = Git.remoteUrl() ?: return null
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
      // By default, we don't set a base sha for push events as it could trigger unexpected
      // main branch comparison.
      else -> null
    }
  }

  fun prNumber(): Int? {
    if (!isPullRequest()) return null
    return getPullRequestEventData().number
  }

  private fun getPullRequestEventData(): GitHubPullRequestEvent {
    val gitHubEventPath = checkNotNull(System.getenv("GITHUB_EVENT_PATH")) {
      "GITHUB_EVENT_PATH is not set"
    }
    val file = File(gitHubEventPath)
    check(file.exists()) {
      "File $gitHubEventPath doesn't exist"
    }

    return json.decodeFromStream(file.inputStream())
  }

  private const val GITHUB_EVENT_PR = "pull_request"
  private const val GITHUB_EVENT_PUSH = "push"

  @Serializable
  data class GitHubPullRequestEvent(
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
}
