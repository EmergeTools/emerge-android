package com.emergetools.android.gradle.util

internal object Git {

  fun currentBranch(): String? {
    return "git rev-parse --abbrev-ref HEAD".execute().trimmedText
  }

  fun currentSha(): String? {
    return "git rev-parse HEAD".execute().trimmedText
  }

  fun baseSha(): String? {
    val baseSha = "git merge-base ${remoteHeadBranch()} ${currentBranch()}".execute().trimmedText
    // Consider blank (empty or whitespace) base sha as null
    if (baseSha?.isBlank() == true) return null
    return baseSha
  }

  fun remoteUrl(remote: String? = primaryRemote()): String? {
    if (remote == null) return null
    return "git config --get remote.$remote.url".execute().trimmedText
  }

  private fun remote(): List<String>? {
    return "git remote".execute().trimmedText?.split("\n")
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
    val show = "git remote show $remote".execute().trimmedText ?: return null
    return show.split("\n").asSequence()
      .map { it.trim() }
      .firstOrNull { it.startsWith("HEAD branch: ") }
      ?.split(' ')
      ?.last()
  }
}
