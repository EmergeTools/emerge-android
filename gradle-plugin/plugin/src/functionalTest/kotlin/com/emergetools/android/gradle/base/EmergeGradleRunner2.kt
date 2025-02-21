package com.emergetools.android.gradle.base

import com.autonomousapps.kit.GradleBuilder
import org.gradle.testkit.runner.BuildResult
import org.gradle.util.GradleVersion
import java.io.File

/**
 * Like EmergeGradleRunner but decouples the runner from the server and the gradle project
 */
class EmergeGradleRunner2(projectDir: File, gradleVersion: GradleVersion = GradleVersion.current()) {

  val runner = GradleBuilder.runner(gradleVersion, projectDir)

  fun withArguments(vararg args: String): EmergeGradleRunner2 {
    runner.withArguments(*args)
    return this
  }

  fun build(): BuildResult {
    return runner.build()
  }

  fun buildAndFail() : BuildResult {
    return runner.buildAndFail()
  }
}
