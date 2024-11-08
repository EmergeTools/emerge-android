package com.emergetools.android.gradle

import com.emergetools.android.gradle.tasks.base.BaseUploadTask
import com.emergetools.android.gradle.util.property
import com.emergetools.android.gradle.util.providers.GitBaseShaValueSource
import com.emergetools.android.gradle.util.providers.GitCurrentBranchValueSource
import com.emergetools.android.gradle.util.providers.GitHubPrNumberValueSource
import com.emergetools.android.gradle.util.providers.GitHubRepoNameValueSource
import com.emergetools.android.gradle.util.providers.GitHubRepoOwnerValueSource
import com.emergetools.android.gradle.util.providers.GitPreviousShaValueSource
import com.emergetools.android.gradle.util.providers.GitShaValueSource
import org.gradle.api.Action
import org.gradle.api.file.DirectoryProperty
import org.gradle.api.model.ObjectFactory
import org.gradle.api.provider.ListProperty
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

  val includeDependencyInformation: Property<Boolean> = objects.property<Boolean>()
    .convention(true)

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
  abstract val reaperOptions: ReaperOptions

  fun reaper(action: Action<ReaperOptions>) {
    action.execute(reaperOptions)
  }

  @get:Nested
  abstract val vcsOptions: VCSOptions

  fun vcs(action: Action<VCSOptions>) {
    action.execute(vcsOptions)
  }

  @get:Nested
  abstract val debugOptions: DebugOptions

  fun debug(action: Action<DebugOptions>) {
    action.execute(debugOptions)
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

  val previousSha: Property<String> = objects.property(String::class.java)
    .convention(providers.of(GitPreviousShaValueSource::class.java) {})

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

  // TODO: Remove in future major version release
  fun gitLabOptions(action: Action<GitLabOptions>) {
    action.execute(gitLabOptions)
  }

  fun gitLab(action: Action<GitLabOptions>) {
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

  val includeEventInformation = objects.property(Boolean::class.java)
    .convention(true)
}

abstract class GitLabOptions {
  abstract val projectId: Property<String>
}

abstract class ProductOptions {
  abstract val tag: Property<String>

  internal abstract val tagFromVariant: Property<Boolean>

  @Suppress("UnusedReceiverParameter")
  fun Property<String>.setFromVariant() {
    tagFromVariant.set(true)
  }
}

abstract class SizeOptions : ProductOptions() {

  /**
   * Whether or not to generate size analysis tasks.
   */
  abstract val enabled: Property<Boolean>
}

abstract class PerfOptions : ProductOptions() {

  /**
   * Whether or not to generate performance analysis tasks.
   */
  abstract val enabled: Property<Boolean>

  /**
   * The module path of the Emerge performance testing module. E.g. `:app:performance`.
   */
  abstract val projectPath: Property<String>
}

abstract class SnapshotOptions : ProductOptions() {

  /**
   * Whether or not to generate snapshot testing tasks.
   */
  abstract val enabled: Property<Boolean>

  /**
   * Path to local snapshot image storage, defaults to /build/emerge/snapshots/outputs
   */
  abstract val snapshotsStorageDirectory: DirectoryProperty

  /**
   * Android API version to run snapshots on, must be 29, 31, 33, 34 or 35, defaults to 34.
   */
  abstract val apiVersion: Property<Int>

  /**
   * Include private previews in snapshot generation, defaults to true
   */
  abstract val includePrivatePreviews: Property<Boolean>

  /**
   * Include previews with PreviewParameter annotated Previews in snapshot generation,
   * defaults to true
   */
  abstract val includePreviewParamPreviews: Property<Boolean>
}

abstract class ReaperOptions : ProductOptions() {

  /**
   * The list of build variants Reaper is enabled for.
   *
   * When Reaper is enabled the application bytecode will be instrumented to support Reaper and the
   * default bundle<variant> task will be hooked to upload the instrumented AAB to Emerge.
   */
  abstract val enabledVariants: ListProperty<String>

  /**
   * The key used to identify Reaper reports for your organization. Emerge recommends setting this
   * from an environment variable to avoid storing keys in plain-text.
   *
   * Note: This key is not the same as the API key used for uploading to Emerge - you can find this
   * in the Emerge Reaper UI or the Emerge settings page.
   */
  abstract val publishableApiKey: Property<String>
}

abstract class DebugOptions : ProductOptions() {

  /**
   * Forces any ASM instrumentation to be applied to the application bytecode even if cached.
   */
  abstract val forceInstrumentation: Property<Boolean>
}
