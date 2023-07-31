package com.emergetools.android.gradle.tasks.internal

import com.emergetools.android.gradle.EmergePluginExtension
import com.emergetools.android.gradle.GitHubOptions
import com.emergetools.android.gradle.GitLabOptions
import com.emergetools.android.gradle.PerfOptions
import com.emergetools.android.gradle.SizeOptions
import com.emergetools.android.gradle.SnapshotOptions
import com.emergetools.android.gradle.VCSOptions
import kotlinx.serialization.Serializable
import kotlinx.serialization.encodeToString
import kotlinx.serialization.json.Json
import org.gradle.api.DefaultTask
import org.gradle.api.provider.Property
import org.gradle.api.tasks.Input
import org.gradle.api.tasks.TaskAction
import org.gradle.api.tasks.options.Option
import java.io.File

/**
 * Internal-only debug task for saving the [EmergePluginExtension] to a json file for
 * testing.
 *
 * The test runner itself has no way to inspect the extension, so this task is used
 * as a workaround to write the extension to JSON, where we can later assert on the
 * contents of the JSON file to ensure our config is handled properly.
 */
abstract class SaveExtensionConfigTask : DefaultTask() {

  @get:Input
  abstract val emergePluginExtension: Property<EmergePluginExtension>

  private var outputPath: String? = null

  @Option(option = "outputPath", description = "Output path for configuration JSON file")
  fun setOutputPath(outputPath: String) {
    check(outputPath.isNotBlank()) { "Output path cannot be blank" }
    this.outputPath = outputPath
  }

  @TaskAction
  fun saveConfig() {
    val extensionData = emergePluginExtension.get().dataFromExtension()
    val configJson = Json.encodeToString(extensionData)
    val outputFile = File(outputPath).also {
      it.createNewFile()
      it.writeText(configJson)
    }
    logger.lifecycle("Saved extension config to $outputFile")
  }

  companion object {

    @Serializable
    data class EmergePluginExtensionData(
      val apiToken: String?,
      val sizeOptions: SizeOptionsData?,
      val perfOptions: PerfOptionsData?,
      val snapshotOptions: SnapshotOptionsData?,
      val vcsOptions: VCSOptionsData?,
    )

    private fun EmergePluginExtension.dataFromExtension(): EmergePluginExtensionData {
      return EmergePluginExtensionData(
        apiToken = apiToken.orNull,
        vcsOptions = vcsOptions.dataFromExtension(),
        sizeOptions = sizeOptions.dataFromExtension(),
        perfOptions = perfOptions.dataFromExtension(),
        snapshotOptions = snapshotOptions.dataFromExtension(),
      )
    }

    @Serializable
    data class VCSOptionsData(
      val sha: String?,
      val baseSha: String?,
      val branchName: String?,
      val prNumber: String?,
      val gitHubOptions: GitHubOptionsData?,
      val gitLabOptions: GitLabOptionsData?,
    )

    private fun VCSOptions.dataFromExtension(): VCSOptionsData {
      return VCSOptionsData(
        sha = sha.orNull,
        baseSha = baseSha.orNull,
        branchName = branchName.orNull,
        prNumber = prNumber.orNull,
        gitHubOptions = gitHubOptions.dataFromExtension(),
        gitLabOptions = gitLabOptions.dataFromExtension()
      )
    }

    @Serializable
    data class GitHubOptionsData(
      val repoOwner: String?,
      val repoName: String?,
    )

    private fun GitHubOptions.dataFromExtension(): GitHubOptionsData {
      return GitHubOptionsData(
        repoOwner = repoOwner.orNull,
        repoName = repoName.orNull,
      )
    }

    @Serializable
    data class GitLabOptionsData(
      val projectId: String?,
    )

    private fun GitLabOptions.dataFromExtension(): GitLabOptionsData {
      return GitLabOptionsData(
        projectId = projectId.orNull,
      )
    }

    @Serializable
    data class SizeOptionsData(
      val buildType: String?,
    )

    private fun SizeOptions.dataFromExtension(): SizeOptionsData {
      return SizeOptionsData(
        buildType = buildType.orNull,
      )
    }

    @Serializable
    data class PerfOptionsData(
      val buildType: String?,
      val projectPath: String?,
    )

    private fun PerfOptions.dataFromExtension(): PerfOptionsData {
      return PerfOptionsData(
        buildType = buildType.orNull,
        projectPath = projectPath.orNull,
      )
    }

    @Serializable
    data class SnapshotOptionsData(
      val buildType: String?,
      val snapshotsStorageDirectory: String?,
    )

    private fun SnapshotOptions.dataFromExtension(): SnapshotOptionsData {
      return SnapshotOptionsData(
        buildType = buildType.orNull,
        snapshotsStorageDirectory = snapshotsStorageDirectory.orNull?.asFile?.path,
      )
    }
  }
}
