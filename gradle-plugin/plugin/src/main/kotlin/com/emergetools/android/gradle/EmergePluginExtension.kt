package com.emergetools.android.gradle

import com.emergetools.android.gradle.util.Git
import com.emergetools.android.gradle.util.GitHub
import com.emergetools.android.gradle.util.property
import org.gradle.api.Action
import org.gradle.api.file.DirectoryProperty
import org.gradle.api.model.ObjectFactory
import org.gradle.api.provider.Property
import org.gradle.api.provider.ProviderFactory
import org.gradle.api.tasks.Nested
import javax.inject.Inject

abstract class EmergePluginExtension @Inject constructor(objects: ObjectFactory) {

  /**
   * Emerge API token generated from the Emerge profile page.
   * Required.
   */
  abstract val apiToken: Property<String>

  @get:Nested
  abstract val sizeOptions: SizeOptions

  fun size(action: Action<SizeOptions>) {
    action.execute(sizeOptions)
  }

  @get:Nested
  abstract val perfOptions: PerfOptions

  fun performance(action: Action<PerfOptions>) {
    action.execute(perfOptions)
  }

  @get:Nested
  abstract val snapshotOptions: SnapshotOptions

  fun snapshots(action: Action<SnapshotOptions>) {
    action.execute(snapshotOptions)
  }

  @get:Nested
  abstract val vcsOptions: VCSOptions

  fun vcs(action: Action<VCSOptions>) {
    action.execute(vcsOptions)
  }

  /**
   * Optional inputs.
   */

  val dryRun: Property<Boolean> = objects.property<Boolean>()
    .convention(false)

  val verbose: Property<Boolean> = objects.property<Boolean>()
    .convention(false)
}

abstract class VCSOptions @Inject constructor(
  objects: ObjectFactory,
  providers: ProviderFactory,
) {

  val sha: Property<String> = objects.property(String::class.java)
    .convention(providers.provider { Git.currentSha() })

  val baseSha: Property<String> = objects.property(String::class.java)
    .convention(providers.provider { Git.baseSha() })

  val branchName: Property<String> = objects.property(String::class.java)
    .convention(providers.provider { Git.currentBranch() })

  val prNumber: Property<String> = objects.property(String::class.java)

  @get:Nested
  abstract val gitHubOptions: GitHubOptions

  fun gitHub(action: Action<GitHubOptions>) {
    action.execute(gitHubOptions)
  }

  @get:Nested
  abstract val gitLabOptions: GitLabOptions

  fun gitLabOptions(action: Action<GitLabOptions>) {
    action.execute(gitLabOptions)
  }
}

abstract class GitHubOptions @Inject constructor(
  objects: ObjectFactory,
  providers: ProviderFactory,
) {

  val repoOwner: Property<String> = objects.property(String::class.java)
    .convention(providers.provider { GitHub.repoOwner() })

  val repoName: Property<String> = objects.property(String::class.java)
    .convention(providers.provider { GitHub.repoName() })
}

abstract class GitLabOptions {
  abstract val projectId: Property<String>
}

abstract class ProductOptions {
  abstract val buildType: Property<String>
}

abstract class SizeOptions : ProductOptions()

abstract class PerfOptions : ProductOptions() {
  abstract val projectPath: Property<String>
}

abstract class SnapshotOptions : ProductOptions() {

  abstract val snapshotsStorageDirectory: DirectoryProperty
}
