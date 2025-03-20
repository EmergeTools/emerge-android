package com.emergetools.android.gradle

import com.autonomousapps.kit.truth.TestKitTruth.Companion.assertThat
import com.emergetools.android.gradle.base.EmergeGradleRunner2
import com.emergetools.android.gradle.projects.SimpleGradleProject
import org.junit.jupiter.api.Test

class LoggingEmergePluginTest : EmergePluginTest() {
  // Write a test that verifies that executing the task 'logExtension' prints the extension to the console.
  @Test
  fun logExtension() {
    val project = SimpleGradleProject.createWithVcsInExtension(this)
    val runner = EmergeGradleRunner2(project.gradleProject.rootDir)
      .withArguments("logExtension")
      .withGithubPR()
      .build()

    assertThat(runner).apply {
      task(":app:logExtension").succeeded()
      // Unfortunately, we can't use a raw string here because the trailing whitespaces would be removed
      // Not sure if it is being done by the IDE or by the function `.trimIndent()`
        output().contains(
          "╔══════════════════════╗\n" +
            "║ Emerge configuration ║\n" +
            "╠══════════════════════╝\n" +
            "╠═ apiToken: *****\n" +
            "╠═ includeDependencyInformation: true\n" +
            "╠═ dryRun (optional): false\n" +
            "╠═ verbose (optional): false\n" +
            "╔══════╗\n" +
            "║ size ║\n" +
            "╠══════╝\n" +
            "╠═ tag (optional): \n" +
            "╚═ enabled: true\n" +
            "╔═══════════╗\n" +
            "║ snapshots ║\n" +
            "╠═══════════╝\n" +
            "╠═ snapshotsStorageDirectory: \n" +
            "╠═ apiVersion: \n" +
            "╠═ includePrivatePreviews: \n" +
            "╠═ tag (optional): \n" +
            "╠═ enabled: true\n" +
            "╚═ profile: false\n" +
            "╔════════╗\n" +
            "║ reaper ║\n" +
            "╠════════╝\n" +
            "╠═ enabledVariants: []\n" +
            "╠═ publishableApiKey: MISSING\n" +
            "╚═ tag (optional): \n" +
            "╔═════════════╗\n" +
            "║ performance ║\n" +
            "╠═════════════╝\n" +
            "╠═ projectPath: \n" +
            "╠═ tag (optional): \n" +
            "╚═ enabled: true\n" +
            "╔═══════════════════════════════════════════════╗\n" +
            "║ vcsOptions (optional, defaults to Git values) ║\n" +
            "╠═══════════════════════════════════════════════╝\n" +
            "╠═ sha: testSha\n" +
            "╠═ baseSha: testBaseSha\n" +
            "╠═ previousSha: testPreviousSha\n" +
            "╠═ branchName: testBranchName\n" +
            "╠═ prNumber: 123\n" +
            "╠═ gitHubOptions\n" +
            "╠═ repoOwner: repoOwner\n" +
            "╠═ repoName: repoName\n" +
            "╠═ includeEventInformation: true\n" +
            "╠═ gitLabOptions\n" +
            "╚═ projectId: ",
        )
    }
  }
}
