package com.emergetools.android.gradle

import com.autonomousapps.kit.truth.TestKitTruth.Companion.assertThat
import com.emergetools.android.gradle.base.EmergeGradleRunner2
import com.emergetools.android.gradle.projects.SimpleGradleProject
import org.junit.jupiter.api.Test

class IsolatedProjectsTest : EmergePluginTest() {
  @Test
  fun uploadAabUnderIsolatedProjectsWithDevelocity() {
    val project = SimpleGradleProject.createWithVcsInExtension(
      this,
      agpVersion = "8.9.0",
      develocityVersion = "4.1.1",
    )

    val result = EmergeGradleRunner2(project.gradleProject.rootDir)
      .withArguments(
        ":app:emergeUploadReleaseAab",
        "-x", ":app:lintVitalRelease",
        "-Dorg.gradle.unsafe.isolated-projects=true",
        "-PbaseUrl=$baseUrl",
      )
      .build()

    // A successful build under -Dorg.gradle.unsafe.isolated-projects=true is
    // already proof that no Isolated Projects violations were emitted. IP
    // violations fail the configuration cache, which makes runner.build()
    // throw UnexpectedBuildFailure before reaching this point.
    assertThat(result).task(":app:emergeUploadReleaseAab").succeeded()
  }
}
