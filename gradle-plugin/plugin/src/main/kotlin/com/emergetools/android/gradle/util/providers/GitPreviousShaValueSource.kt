package com.emergetools.android.gradle.util.providers

import com.emergetools.android.gradle.util.Git
import com.emergetools.android.gradle.util.GitHub
import org.gradle.api.provider.ValueSource
import org.gradle.api.provider.ValueSourceParameters.None
import org.gradle.process.ExecOperations
import javax.inject.Inject

abstract class GitPreviousShaValueSource : ValueSource<String?, None> {
  @get:Inject
  abstract val execOperations: ExecOperations

  override fun obtain(): String? {
    val git = Git(execOperations)
    val gitHub = GitHub(execOperations)

    var previousSha: String? = null
    // GitHub workflows for pull_requests are invoked on a merge commit rather than branch commit.
    if (gitHub.isSupportedGitHubEvent()) {
      gitHub.previousSha()?.let { previousSha = it }
    } else {
      previousSha = git.previousSha()
    }

    return previousSha
  }
}
