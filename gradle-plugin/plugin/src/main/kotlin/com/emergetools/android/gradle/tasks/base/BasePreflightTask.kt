package com.emergetools.android.gradle.tasks.base

import com.emergetools.android.gradle.EmergePluginExtension
import org.gradle.api.DefaultTask
import org.gradle.api.provider.Property
import org.gradle.api.tasks.Input
import org.gradle.api.tasks.Optional


abstract class BasePreflightTask : DefaultTask() {

  @get:Input
  @get:Optional
  abstract val sha: Property<String>

  @get:Input
  @get:Optional
  abstract val baseSha: Property<String>

  @get:Input
  @get:Optional
  abstract val branchName: Property<String>

  @get:Input
  @get:Optional
  abstract val prNumber: Property<String>

  @get:Input
  @get:Optional
  abstract val gitHubRepoOwner: Property<String>

  @get:Input
  @get:Optional
  abstract val gitHubRepoName: Property<String>

  @get:Input
  @get:Optional
  abstract val gitLabProjectId: Property<String>

  companion object {

    fun BasePreflightTask.setPreflightTaskInputs(
      extension: EmergePluginExtension,
    ) {
      sha.set(extension.vcsOptions.sha)
      baseSha.set(extension.vcsOptions.baseSha)
      branchName.set(extension.vcsOptions.branchName)
      prNumber.set(extension.vcsOptions.prNumber)
      gitHubRepoOwner.set(extension.vcsOptions.gitHubOptions.repoOwner)
      gitHubRepoName.set(extension.vcsOptions.gitHubOptions.repoName)
      gitLabProjectId.set(extension.vcsOptions.gitLabOptions.projectId)
    }
  }
}
