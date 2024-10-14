package com.emergetools.android.gradle.utils

import com.emergetools.android.gradle.base.EmergeGradleRunner
import java.io.File

object EnvUtils {

  fun EmergeGradleRunner.withGitHubPREvent(): EmergeGradleRunner {

    val resource = this.javaClass.getResource("/github-event-mocks/mock_pr_event.json")
    val jsonFile = File(resource.toURI())

    return withEnvironment(
      "GITHUB_EVENT_NAME" to "pull_request",
      "GITHUB_EVENT_PATH" to jsonFile.path,
    )
  }

  fun EmergeGradleRunner.withGitHubPREventNoBefore(): EmergeGradleRunner {

    val resource = this.javaClass.getResource("/github-event-mocks/mock_pr_event_no_before.json")
    val jsonFile = File(resource.toURI())

    return withEnvironment(
      "GITHUB_EVENT_NAME" to "pull_request",
      "GITHUB_EVENT_PATH" to jsonFile.path,
    )
  }

  fun EmergeGradleRunner.withGitHubPushEvent(): EmergeGradleRunner {

    val resource = this.javaClass.getResource("/github-event-mocks/mock_push_event.json")
    val jsonFile = File(resource.toURI())

    return withEnvironment(
      "GITHUB_EVENT_NAME" to "push",
      "GITHUB_EVENT_PATH" to jsonFile.path,
      "GITHUB_SHA" to "github_env_sha",
    )
  }
}
