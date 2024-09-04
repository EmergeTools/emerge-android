# 🛰️ Emerge Snapshot Testing

All-in-one Android snapshot testing with 2 lines of code.

## Features

Emerge offers a full-suite snapshotting solution on Android, allowing for snapshotting of
Composables, Activities, and Views. Emerge handles **everything** for you, including:

- Automatic snapshot testing of Compose Previews
- Fully managed snapshot generation in CI
- Hosted UI for comparing diffs, sharing snapshots, and approving changes
- Snapshot image file storage
- Image comparisons & diffs
- Posting status checks & comments to pull requests in GitHub or GitLab

And many more features!

## Quickstart (<10 minutes)

This is a quick setup guide to set up end-to-end snapshots in about 10 minutes. For a full
guide on setting up Emerge snapshots, see
the [full documentation](https://docs.emergetools.com/docs/android-snapshots-v1).

### Setup Emerge Gradle plugin

Add the Emerge Gradle plugin to your application's `build.gradle.kts` file:

```kotlin
plugins {
  id("com.emergetools.android")
}

emerge {
  // If not explicitly set, Emerge uses the EMERGE_API_TOKEN env variable
  apiToken.set(System.getenv("EMERGE_API_TOKEN"))
}
```

See [gradle-plugin](../gradle-plugin/README.md) for more information.

### Add Snapshots SDK

Emerge snapshot SDKs are published to Maven Central and should be added as dependencies to your
app's `build.gradle.kts` file.

Compose `@Preview` snapshot generation relies on a Gradle plugin instrumentation to modify Compose
Previews to be visible at runtime. Our snapshot SDK can then handle everything else, invoking the
Compose Preview and saving the resulting snapshot image.

```kotlin build.gradle.kts (app module)
dependencies {
  // ..

  androidTestImplementation("com.emergetools.snapshots:snapshots:<latest_version>")
}
```

Latest
version: [![Maven Central](https://maven-badges.herokuapp.com/maven-central/com.emergetools.snapshots/snapshots/badge.svg)](https://maven-badges.herokuapp.com/maven-central/com.emergetools.snapshots/snapshots)

### Run preflight check

Let's check that everything's set up properly by running the snapshots preflight task. A preflight
check is automatically generated for all debug variants of your app:

`./gradlew :<app>:emergeSnapshotsPreflightDebug`

The preflight task will give detailed output about the Emerge snapshots integration:

```shell
› ./gradlew :app:emergeSnapshotsPreflightDebug

> Task :app:emergeSnapshotsPreflightDebug

╔════════════════════════════════════════════════╗
║ Snapshots preflight check was successful (3/3) ║
╠════════════════════════════════════════════════╝
╠═ ✅ Emerge API token set
╠═ ✅ Snapshots enabled
╚═ ✅ Snapshots SDK is an androidTestImplementation dependency

╔═════════════════════════════════════╗
║ VCS Info check was successful (4/4) ║
╠═════════════════════════════════════╝
╠═ ✅ SHA: 123456789..
╠═ ✅ Base SHA: 987654321..
╠═ ✅ Branch name: main
╚═ ✅ PR number: 123

Snapshots preflight was successful!
Check snapshots locally with ./gradlew :app:emergeLocalSnapshotsDebug (make sure to have an emulator or connected device running)
Upload & run snapshots on Emerge with ./gradlew :app:emergeUploadSnapshotBundleDebug
```

If there are any issues or warnings, the preflight task should help you identify and address them
before uploading to Emerge.

### Upload to Emerge

The Emerge Gradle plugin offers a single command to build & upload snapshot tests to Emerge.

```shell Shell
./gradlew :app:emergeUploadSnapshotBundleDebug
```

Emerge will handle generating, storing, and diffing the snapshots against a base build by git
information for you.

Once uploaded, snapshots and diffs are viewable directly in the Emerge UI. You can find a link to
the build in the Gradle output.

For integrating snapshots in CI, Emerge recommends the following order:

1. Adding snapshots to the main branch. This ensures all PRs have a base build to diff against.
2. Adding snapshots to all commits on PRs. This ensures that snapshots are generated for every
   commit, allowing for diffing any changes.

> [!TIP]
> **👍 That's it!**
> Emerge recommends running snapshot tests on every commit. Emerge will handle generating, storing
> and diffing based on Git information.
> Continue reading for full details on how Emerge generates and manages snapshots.

## Details

### Compose snapshotting

Emerge's Gradle plugin (3.0+) automatically snapshots all `@Preview` annotated
composables in your `main` source set.

No additional setup is required!

```kotlin
// src/main/com/myapp/MyComposable.kt

@Preview
@Composable
fun MyComposablePreview() {
  MyComposable(
    text = "Hello, World!"
  )
}
```

_⚠️ Currently only no-arg preview functions are supported. `@PreviewParameter` annotated arguments
like the below example are not yet supported._

```kotlin

@Preview
@Composable
fun MyComposablePreview(
  // NOT YET SUPPORTED
  @PreviewParameter(UserPreviewParameterProvider::class) user: User
) {
  MyComposable(user)
}
```

#### Variant support

Emerge currently supports all `@Preview` annotation parameters except for `wallpaper`
and `showSystemUi`.

Emerge will automatically generate a snapshot test for each Preview annotation present. For example,
for the following composable:

```kotlin
// src/main/com/myapp/MyComposable.kt

@Preview
@Preview(fontScale = 1.5f)
@Composable
fun MyComposablePreview() {
  MyComposable(
    text = "Hello, World!"
  )
}
```

Emerge will generate two snapshots, one default (no-arg `@Preview`), and one with `1.5f` font
scale (`@Preview` with `fontScale` param).

#### Ignoring previews from snapshotting

Not all Previews might need to be snapshotted. To ignore a preview from snapshotting, add
the `@IgnoreEmergeSnapshot` annotation to the preview function.

```kotlin
@Preview
@IgnoreEmergeSnapshot
@Composable
fun MyComposablePreview() {
  MyComposable(
    text = "Hello, World!"
  )
}
```

You'll need to add a dependency on the `snapshots-annotations` artifact to use the
`@IgnoreEmergeSnapshot` annotation. This is a lightweight library only containing annotations
the `snapshots-processor` leverages.

```kotlin
dependencies {
  debugImplementation("com.emergetools.snapshots:snapshots-annotations:{latest_version}")
}
```

Latest annotations
version: [![Maven Central](https://maven-badges.herokuapp.com/maven-central/com.emergetools.snapshots/snapshots-annotations/badge.svg)](https://maven-badges.herokuapp.com/maven-central/com.emergetools.snapshots/snapshots-annotations)

##### Ignoring private previews

Emerge can snapshot Compose previews with any visibility, like `private` or `internal`. But for some
projects, you might not want to snapshot private previews for various reasons.

Emerge's gradle plugin has an option to include private previews, which can be set to false to
disable snapshotting `private` visibility preview functions.

```kotlin
emerge {
  // ...

  snapshots {
    includePrivatePreviews.set(false) // true by default - set to false to exclude private previews from snapshotting
  }
}
```

### Activities & View snapshotting

Create a basic instrumentation test class that uses the `EmergeSnapshot` rule to generate snapshots.

```kotlin
@RunWith(AndroidJUnit4::class)
class MainActivityTest {

  @get:Rule
  val activityScenarioRule = ActivityScenarioRule(MainActivity::class.java)

  @get:Rule
  val snapshots = EmergeSnapshot()

  @Test
  fun mainActivitySnapshot() {
    val scenario = activityScenarioRule.scenario
    scenario.onActivity {
      snapshots.take(name = "MainActivity", activity = it)
    }
  }

  @Test
  fun customViewSnapshot() {
    val view = CustomView(InstrumentationRegistry.getInstrumentation().targetContext)
    snapshots.take(name = "CustomView", view = view)
  }
}
```

_Each `name` parameter must be unique as it's used as the primary key for saving & diffing._

## Gradle plugin

The Emerge Gradle plugin provides a task to generate snapshots locally for snapshot tests.
Add the Emerge gradle plugin to your app-level `build.gradle(.kts)` file:

```kotlin
plugins {
  id("com.emergetools.android")
}

emerge {

  // Optional
  snapshots {
    tag.set("snapshots") // To ensure Emerge size dashboard is not mixed with snapshot builds
  }
}
```

_Snapshot support was added in Emerge gradle plugin v2.0.0, versions below 2.0.0 do not support
snapshots._

Then, run the `emergeLocalSnapshots<variant>` task to generate snapshots. You'll need a connected
device or emulator actively running and `ANDROID_HOME` set to the location of the Android SDK is on
your `PATH`.

```shell
./gradlew :snapshots:snapshots-sample:emergeLocalSnapshotsDebug
```

## Cloud support

Emerge supports generating, hosting & diffing screenshots as part of our Cloud snapshotting service.

Using the Emerge Gradle plugin, you can upload snapshots to the cloud using
the `emergeUploadSnapshotBundle<variant>` task.

```shell
./gradlew :snapshots:snapshots-sample:emergeUploadSnapshotBundleDebug
```

For full documentation on Emerge's cloud snapshotting service,
see [the Emerge Snapshots documentation](https://docs.emergetools.com/docs/android-snapshots).

### Diffing

To properly diff snapshots, Emerge needs to know which snapshots to compare against. This is done
using Git information, which is set automatically for you.

See [gradle-plugin](../gradle-plugin) documentation for a full list of configuration VCS
configuration options.

## Full documentation

For more details on Emerge's snapshotting service, see
the [full documentation](https://docs.emergetools.com/docs/android-snapshots-v1).

## Artifacts & versions

| Artifact                                          | Description                     | Latest                                                                                                                                                                                                                           | Min SDK |
|---------------------------------------------------|---------------------------------|----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|---------|
| `com.emergetools.snapshots:snapshots`             | Snapshot testing SDK            | [![Maven Central](https://maven-badges.herokuapp.com/maven-central/com.emergetools.snapshots/snapshots/badge.svg)](https://maven-badges.herokuapp.com/maven-central/com.emergetools.snapshots/snapshots)                         | 23      |
| `com.emergetools.snapshots:snapshots-annotations` | Additional snapshot annotations | [![Maven Central](https://maven-badges.herokuapp.com/maven-central/com.emergetools.snapshots/snapshots-annotations/badge.svg)](https://maven-badges.herokuapp.com/maven-central/com.emergetools.snapshots/snapshots-annotations) | 23      |

## Releasing

### Releasing a new version

1. Update the `emerge-snapshots` version in `/gradle/libs.versions.toml`
2. Update the `/snapshots/CHANGELOG.md`
3. `gt c -am "Prepare for Snapshots release X.Y.Z"` (where X.Y.Z is the version set in step 1)
1. Alt
   1. `git add *`
   2. `git commit -m "Prepare for Snapshots release X.Y.Z"`
4. `gt ss`
1. Alt:
   1. `git push`
   2. Open PR
5. Get PR approved and merge
6. Create a new release on GitHub
7. Tag version `snapshots-vX.Y.Z`
8. Release title `Snapshots vX.Y.Z`
9. Paste the content from `/snapshots/CHANGELOG.md` as the description

The `snapshots-release` workflow will automatically publish the new version to Sonatype upon new
release publish.

From there, the release will need to be promoted to the main repository from
the [Sonatype UI](https://s01.oss.sonatype.org/).

