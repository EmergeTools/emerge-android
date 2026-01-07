package com.emergetools.android.gradle.util.providers

import com.emergetools.android.gradle.util.Git
import com.emergetools.android.gradle.util.GitHub
import org.gradle.api.provider.ValueSource
import org.gradle.process.ExecOperations
import javax.inject.Inject

abstract class GitBaseShaValueSource : ValueSource<String, EmptyParameters> {
  @get:Inject
  abstract val execOperations: ExecOperations

  override fun obtain(): String {
    val git = Git(execOperations)
    val gitHub = GitHub(execOperations)

    // GitHub workflows for pull_requests are invoked on a merge commit rather than branch commit.
    return if (gitHub.isSupportedGitHubEvent()) {
      gitHub.baseSha() ?: ""
    } else {
      git.baseSha() ?: ""
    }
  }
}
