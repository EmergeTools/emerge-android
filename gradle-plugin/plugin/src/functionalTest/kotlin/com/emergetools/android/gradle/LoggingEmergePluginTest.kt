package com.emergetools.android.gradle

import com.emergetools.android.gradle.base.EmergeGradleRunner
import org.junit.jupiter.api.Test

class LoggingEmergePluginTest : EmergePluginTest() {

  /**
   * If the info logging level is enabled we print out the plugin configuration. This tests that it doesn't cause any crashes.
   */
  @Test
  fun infoLogLevel() {
    EmergeGradleRunner.create("simple")
      .withArguments("tasks", "-i")
      .build()
  }
}
