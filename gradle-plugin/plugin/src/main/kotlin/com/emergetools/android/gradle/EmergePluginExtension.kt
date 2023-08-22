package com.emergetools.android.gradle

import com.emergetools.android.gradle.tasks.upload.BaseUploadTask
import com.emergetools.android.gradle.util.property
import com.emergetools.android.gradle.util.providers.GitBaseShaValueSource
import com.emergetools.android.gradle.util.providers.GitCurrentBranchValueSource
import com.emergetools.android.gradle.util.providers.GitHubPrNumberValueSource
import com.emergetools.android.gradle.util.providers.GitHubRepoNameValueSource
import com.emergetools.android.gradle.util.providers.GitHubRepoOwnerValueSource
import com.emergetools.android.gradle.util.providers.GitShaValueSource
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
  val apiToken: Property<String> = objects.property<String>()
    .convention(System.getenv(BaseUploadTask.DEFAULT_API_TOKEN_ENV_KEY))

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
    .convention(providers.of(GitShaValueSource::class.java) {})

  val baseSha: Property<String> = objects.property(String::class.java)
    .convention(providers.of(GitBaseShaValueSource::class.java) {})

  val branchName: Property<String> = objects.property(String::class.java)
    .convention(providers.of(GitCurrentBranchValueSource::class.java) {})

  val prNumber: Property<String> = objects.property(String::class.java)
    .convention(providers.of(GitHubPrNumberValueSource::class.java) {})

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
    .convention(providers.of(GitHubRepoOwnerValueSource::class.java) {})

  val repoName: Property<String> = objects.property(String::class.java)
    .convention(providers.of(GitHubRepoNameValueSource::class.java) {})
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

  abstract val experimentalInternalSnapshotsEnabled: Property<Boolean>

  abstract val apiVersion: Property<Int>
}
