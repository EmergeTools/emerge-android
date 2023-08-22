package com.emergetools.android.gradle.util

import org.gradle.process.ExecOperations

internal class Git(private val execOperations: ExecOperations) {

  fun currentBranch(): String? {
    return execOperations.execute("git rev-parse --abbrev-ref HEAD")
  }

  fun currentSha(): String? {
    return execOperations.execute("git rev-parse HEAD")
  }

  fun baseSha(): String? {
    val baseSha = execOperations.execute("git merge-base ${remoteHeadBranch()} ${currentBranch()}")
    // Consider blank (empty or whitespace) base sha as null
    if (baseSha?.isBlank() == true) return null
    return baseSha
  }

  fun remoteUrl(remote: String? = primaryRemote()): String? {
    if (remote == null) return null
    return execOperations.execute("git config --get remote.$remote.url")
  }

  private fun remote(): List<String>? {
    return execOperations.execute("git remote")?.split("\n")
  }

  private fun primaryRemote(): String? {
    val remote = remote() ?: return null
    return if (remote.contains("origin")) {
      "origin"
    } else {
      remote.first()
    }
  }

  private fun remoteHeadBranch(remote: String? = primaryRemote()): String? {
    if (remote == null) return null
    val show = execOperations.execute("git remote show $remote") ?: return null
    return show.split("\n").asSequence()
      .map { it.trim() }
      .firstOrNull { it.startsWith("HEAD branch: ") }
      ?.split(' ')
      ?.last()
  }
}
