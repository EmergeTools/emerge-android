package com.emergetools.android.gradle

import com.emergetools.android.gradle.base.EmergeGradleRunner
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class LoggingEmergePluginTest : EmergePluginTest() {

  // Write a test that verifies that executing the task 'logExtension' prints the extension to the console.
  @Test
  fun logExtension() {
    val result = EmergeGradleRunner.create("simple")
      .withArguments("logExtension")
      .build()
      .assertSuccessfulTask(":logExtension")

    Assertions.assertTrue(
      result.output.contains(
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
          "╠═ includePreviewParamPreviews: \n" +
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
          "╠═ prNumber: \n" +
          "╠═ gitHubOptions\n" +
          "╠═ repoOwner: repoOwner\n" +
          "╠═ repoName: repoName\n" +
          "╠═ includeEventInformation: true\n" +
          "╠═ gitLabOptions\n" +
          "╚═ projectId: "
      )
    )
  }
}
