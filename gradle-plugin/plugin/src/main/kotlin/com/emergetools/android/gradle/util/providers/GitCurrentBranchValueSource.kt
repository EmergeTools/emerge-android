package com.emergetools.android.gradle.util.providers

import com.emergetools.android.gradle.util.Git
import org.gradle.api.provider.ValueSource
import org.gradle.process.ExecOperations
import javax.inject.Inject

abstract class GitCurrentBranchValueSource : ValueSource<String?, EmptyParameters> {
  @get:Inject
  abstract val execOperations: ExecOperations

  override fun obtain(): String? {
    val git = Git(execOperations)
    return git.currentBranch()
  }
}
