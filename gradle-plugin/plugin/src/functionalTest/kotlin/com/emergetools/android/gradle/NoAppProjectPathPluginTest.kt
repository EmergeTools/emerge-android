package com.emergetools.android.gradle

import com.emergetools.android.gradle.base.EmergeGradleRunner
import org.junit.jupiter.api.Test

class NoAppProjectPathPluginTest : EmergePluginTest() {
  @Test
  fun noAppProjectPath() {
    EmergeGradleRunner.create("no-app-project-path")
      .withArguments("uploadReleaseAabToEmerge")
      .withDefaultServer()
      .buildAndFail()
  }
}
