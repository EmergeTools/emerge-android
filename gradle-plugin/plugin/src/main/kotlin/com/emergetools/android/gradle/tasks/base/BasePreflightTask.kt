package com.emergetools.android.gradle.tasks.base

import com.emergetools.android.gradle.EmergePluginExtension
import com.emergetools.android.gradle.util.preflight.Preflight
import com.emergetools.android.gradle.util.preflight.PreflightWarning
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

  protected fun buildVcsPreflight(): Preflight {
    val vcsPreflight = Preflight("VCS Info check")
    vcsPreflight.add("SHA: ${sha.getOrElse("Not set")}") {
      if (sha.getOrElse("").isBlank()) {
        throw PreflightWarning("Emerge is unable to post status checks/comments without a value.")
      }
    }

    vcsPreflight.add("Base SHA: ${baseSha.getOrElse("Not set")}") {
      if (baseSha.getOrElse("").isBlank()) {
        throw PreflightWarning("Emerge is unable to post status checks/comments without a value.")
      }
    }

    vcsPreflight.add("Branch name: ${branchName.getOrElse("Not set")}") {
      if (branchName.getOrElse("") == "HEAD") {
        throw PreflightWarning("Branch could be in a detached head state which could lead to trouble posting status checks. Make sure to check your sha matches the commit sha on your branch.")
      }

      if (branchName.getOrElse("").isBlank()) {
        throw PreflightWarning("Emerge is unable to post status checks/comments without a value.")
      }
    }

    vcsPreflight.add("PR number: ${prNumber.getOrElse("Not set")}") {
      if (prNumber.getOrElse("").isBlank()) {
        throw PreflightWarning("Emerge is unable to post status checks/comments without a value. Emerge will try to set automatically in GitHub environments using PR event data.")
      }
    }

    val hasGitLabProjectId = gitLabProjectId.getOrElse("").isBlank()

    vcsPreflight.add("[GitHub only] GitHub repo name: ${gitHubRepoName.getOrElse("Not set")}") {
      // Don't warn if GitLab info set and repoName empty
      if (!hasGitLabProjectId && gitHubRepoName.getOrElse("").isBlank()) {
        throw PreflightWarning("Emerge is unable to post status checks/comments without a value.")
      }
    }

    vcsPreflight.add("[GitHub only] GitHub repo owner: ${gitHubRepoOwner.getOrElse("Not set")}") {
      // Don't warn if GitLab info set and repoOwner empty
      if (!hasGitLabProjectId && gitHubRepoOwner.getOrElse("").isBlank()) {
        throw PreflightWarning("Emerge is unable to post status checks/comments without a value.")
      }
    }

    val hasGitHubRepoInfo = gitHubRepoOwner.getOrElse("").isNotBlank() || gitHubRepoName.getOrElse("").isNotBlank()
    vcsPreflight.add("[GitLab only] GitLab project ID: ${gitLabProjectId.getOrElse("Not set")}") {
      // Don't warn if GitHub info set and projectId empty
      if (!hasGitHubRepoInfo && gitLabProjectId.getOrElse("").isBlank()) {
        throw PreflightWarning("Emerge is unable to post status checks/comments without a value.")
      }
    }

    return vcsPreflight
  }

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
