# 📸 Emerge Snapshot Testing

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

### Add Snapshots library

Emerge snapshot libraries are published to Maven Central and should be added as dependencies to your
app's `build.gradle.kts` file.

Compose `@Preview` snapshot generation relies on a Gradle plugin instrumentation to modify Compose
Previews to be visible at runtime. Our snapshot library can then handle everything else, invoking
the
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
╚═ ✅ Snapshots library is an androidTestImplementation dependency

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

## Full documentation

For more details on Emerge's snapshotting service, see
the [full documentation](https://docs.emergetools.com/docs/android-snapshots-v1).

## Artifacts & versions

| Artifact                                      | Description                    | Latest                                                                                                                                                                                                                   | Min SDK |
|-----------------------------------------------|--------------------------------|--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|---------|
| `com.emergetools.snapshots:snapshots`         | Snapshot testing library       | [![Maven Central](https://maven-badges.herokuapp.com/maven-central/com.emergetools.snapshots/snapshots/badge.svg)](https://maven-badges.herokuapp.com/maven-central/com.emergetools.snapshots/snapshots)                 | 23      |
| `com.emergetools.snapshots:snapshots-runtime` | Snapshots runtime dependencies | [![Maven Central](https://maven-badges.herokuapp.com/maven-central/com.emergetools.snapshots/snapshots-runtime/badge.svg)](https://maven-badges.herokuapp.com/maven-central/com.emergetools.snapshots/snapshots-runtime) | 23      |

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

