package com.emergetools.android.gradle.util

internal object GitHub {

  fun repoId(): String? {
    val remoteUrl = Git.remoteUrl() ?: return null
    val result = Regex("[/:]([^/]+/[^/.]+)\\.git$").find(remoteUrl) ?: return null
    return result.groupValues[1]
  }

  fun repoOwner() = repoId()?.split('/')?.get(0)

  fun repoName() = repoId()?.split('/')?.get(1)
}
