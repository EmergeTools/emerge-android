package com.emergetools.android.gradle.base

import com.autonomousapps.kit.GradleBuilder
import org.gradle.testkit.runner.BuildResult
import org.gradle.util.GradleVersion
import java.io.File

/**
 * Like EmergeGradleRunner but decouples the runner from the server and the gradle project
 */
class EmergeGradleRunner2(projectDir: File, gradleVersion: GradleVersion = GradleVersion.current()) {

  val runner = GradleBuilder.runner(gradleVersion, projectDir)

  fun withArguments(vararg args: String): EmergeGradleRunner2 {
    runner.withArguments(*args)
    return this
  }

  fun withGithubPR() : EmergeGradleRunner2 {
    val resource = this.javaClass.getResource("/github-event-mocks/mock_pr_event.json")!!
    val jsonFile = File(resource.toURI())

    runner.withEnvironment(mapOf(
      "GITHUB_EVENT_NAME" to "pull_request",
      "GITHUB_EVENT_PATH" to jsonFile.path,
    ))
    return this
  }

  fun withGitHubPushEvent(): EmergeGradleRunner2 {
    val resource = this.javaClass.getResource("/github-event-mocks/mock_push_event.json")!!
    val jsonFile = File(resource.toURI())

    runner.withEnvironment(mapOf(
      "GITHUB_EVENT_NAME" to "push",
      "GITHUB_EVENT_PATH" to jsonFile.path,
      "GITHUB_SHA" to "github_env_sha",
    ))
    return this
  }

  fun build(): BuildResult {
    return runner.build()
  }

  fun buildAndFail() : BuildResult {
    return runner.buildAndFail()
  }
}
