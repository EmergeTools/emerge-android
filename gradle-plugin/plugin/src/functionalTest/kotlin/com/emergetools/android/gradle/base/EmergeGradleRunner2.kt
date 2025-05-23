package com.emergetools.android.gradle.base

import com.autonomousapps.kit.GradleBuilder
import org.gradle.testkit.runner.BuildResult
import org.gradle.util.GradleVersion
import java.io.File

class EmergeGradleRunner2(projectDir: File, gradleVersion: GradleVersion = GradleVersion.current()) {
  private val runner = GradleBuilder.runner(gradleVersion, projectDir)

  init {
    appendEnvironment(System.getenv())
  }

  fun withArguments(vararg args: String): EmergeGradleRunner2 {
    runner.withArguments(*args)
    return this
  }

  fun withGithubPR(): EmergeGradleRunner2 {
    val resource = this.javaClass.getResource("/github-event-mocks/mock_pr_event.json")!!
    val jsonFile = File(resource.toURI())

    return appendEnvironment(
      "GITHUB_EVENT_NAME" to "pull_request",
      "GITHUB_EVENT_PATH" to jsonFile.path,
    )
  }

  fun withGitHubPushEvent(): EmergeGradleRunner2 {
    val resource = this.javaClass.getResource("/github-event-mocks/mock_push_event.json")!!
    val jsonFile = File(resource.toURI())

    return appendEnvironment(
      "GITHUB_EVENT_NAME" to "push",
      "GITHUB_EVENT_PATH" to jsonFile.path,
      "GITHUB_SHA" to "github_env_sha",
    )
  }

  private fun appendEnvironment(vararg pairs: Pair<String, String>) : EmergeGradleRunner2 {
    val currentEnv = runner.environment?.toMutableMap() ?: mutableMapOf()
    runner.withEnvironment(currentEnv.plus(pairs))
    return this
  }

  private fun appendEnvironment(map: Map<String, String>) : EmergeGradleRunner2 {
    val currentEnv = runner.environment?.toMutableMap() ?: mutableMapOf()
    runner.withEnvironment(currentEnv.plus(map))
    return this
  }

  fun build(): BuildResult {
    return runner.build()
  }

  fun buildAndFail() : BuildResult {
    return runner.buildAndFail()
  }
}
