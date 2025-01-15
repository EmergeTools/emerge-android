package com.emergetools.android.gradle.tasks.base

import com.emergetools.android.gradle.EmergePluginExtension
import com.emergetools.android.gradle.util.preflight.Preflight
import com.emergetools.android.gradle.util.preflight.PreflightWarning
import org.gradle.api.DefaultTask
import org.gradle.api.provider.Property
import org.gradle.api.tasks.Input
import org.gradle.api.tasks.Optional
import org.gradle.work.DisableCachingByDefault

@DisableCachingByDefault(because = "This task must always run as a check and has no outputs.")
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
        throw PreflightWarning(
          "Branch could be in a detached head state which could lead to trouble posting status " +
            "checks. Make sure to check your sha matches the commit sha on your branch.",
        )
      }

      if (branchName.getOrElse("").isBlank()) {
        throw PreflightWarning("Emerge is unable to post status checks/comments without a value.")
      }
    }

    vcsPreflight.add("PR number: ${prNumber.getOrElse("Not set")}") {
      if (prNumber.getOrElse("").isBlank()) {
        throw PreflightWarning(
          "Emerge is unable to post status checks/comments without a value. Emerge will try to " +
            "set automatically in GitHub environments using PR event data.",
        )
      }
    }

    val hasGitLabProjectId = gitLabProjectId.getOrElse("").isBlank()
    // Don't add if GitLab info set
    if (!hasGitLabProjectId) {
      vcsPreflight.add("[GitHub only] GitHub repo name: ${gitHubRepoName.getOrElse("Not set")}") {
        if (gitHubRepoName.getOrElse("").isBlank()) {
          throw PreflightWarning("Emerge is unable to post status checks/comments without a value.")
        }
      }

      vcsPreflight.add("[GitHub only] GitHub repo owner: ${gitHubRepoOwner.getOrElse("Not set")}") {
        if (gitHubRepoOwner.getOrElse("").isBlank()) {
          throw PreflightWarning("Emerge is unable to post status checks/comments without a value.")
        }
      }
    }

    val hasGitHubRepoInfo =
      gitHubRepoOwner.getOrElse("").isNotBlank() || gitHubRepoName.getOrElse("").isNotBlank()
    // Don't add if GitHub info set
    if (!hasGitHubRepoInfo) {
      vcsPreflight.add("[GitLab only] GitLab project ID: ${gitLabProjectId.getOrElse("Not set")}") {
        if (gitLabProjectId.getOrElse("").isBlank()) {
          throw PreflightWarning("Emerge is unable to post status checks/comments without a value.")
        }
      }
    }

    return vcsPreflight
  }

  companion object {
    fun BasePreflightTask.setPreflightTaskInputs(extension: EmergePluginExtension) {
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
