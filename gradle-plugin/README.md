# Emerge Gradle Plugin

## Overview

The Emerge Gradle Plugin provides many helper tasks and functionality for integrating Emerge into
your Android project.

## Getting started

### Add the Gradle plugin portal to your plugin repositories

The Emerge Gradle plugin is hosted by
the [Gradle plugin portal](https://plugins.gradle.org/plugin/com.emergetools.android). In new
projects it should already be part of the plugin repositories. If not, you'll need to add it
in `settings.gradle(.kts)`:

```kotlin settings.gradle.kts
pluginManagement {
  repositories {
    gradlePluginPortal()
  }
}
```

### Apply the Emerge Gradle plugin to your top-level project

In your application-level `build.gradle(.kts)`:

```kotlin build.gradle.kts (app)
plugins {
  id("com.emergetools.android") version "{latest_version}"
}

emerge {
  // Emerge uses the EMERGE_API_TOKEN env variable by default, so no need to set env explicitly
  apiToken.set(System.getenv("EMERGE_API_TOKEN"))
}
```

Only the `apiToken` property is required. By default, without any property set, `apiToken` will
attempt to use the `EMERGE_API_TOKEN` env variable. Other configuration properties are
documented below.

### Obtain an API key

Follow our guide
on [obtaining an API key](https://docs.emergetools.com/docs/uploading-basics#obtain-an-api-key).

We recommend storing this token in a secrets store, an environment variable, or a Gradle property
file. The example in this guide uses the `EMERGE_API_TOKEN` environment variable.

### VCS

Emerge is best designed to work as part of your CI workflow for diffing and comparing size,
performance and snapshots. To ensure these comparisons are accurate, Emerge leverages VCS
information to accurately determine the proper comparison builds.

#### Configuration

**By default, necessary Git values are set automatically for you.** If you need to override these
values, you can do so using the `vcs` extension.

```kotlin
emerge {
  // ..

  vcs {
    sha.set("..")
    baseSha.set("..")
    branchName.set("my-feature")
    prNumber.set("123")
  }
}
```

#### GitHub

The GitHub sub-extension can be used to set GitHub-specific values. These are set automatically
using `repoId` information from Git's remoteUrl for you if not specified.

These are used for CI integrations, like posting GitHub comments and status checks.

```kotlin
emerge {
  // ..

  vcs {
    // ..

    gitHub {
      repoOwner.set("..")
      repoName.set("..")
    }
  }
}
```

#### GitLab

The GitLab sub-extension can be used to set GitLab-specific values. Unlikely GitHub values, these
are not set automatically and will need to be set manually for GitLab CI integration.

```kotlin
emerge {
  // ..

  vcs {
    // ..

    gitLab {
      projectId.set("..")
    }
  }
}
```

##### Properties

| Field              | Type     | Default                | Description                                       |
|--------------------|----------|------------------------|---------------------------------------------------|
| `sha`              | `String` | HEAD branch commit sha | The Git sha of the HEAD build.                    |
| `baseSha`          | `String` | base branch commit sha | The Git sha of the base build to compare against. |
| `branchName`       | `String` | Current branch name    | The name of the branch being built.               |
| `prNumber`         | `String` |                        | The number of the pull request being built.       |
| `gitHub.repoOwner` | `String` | Repo ID before '/'     | The owner of the GitHub repository.               |
| `gitHub.repoName`  | `String` | Repo ID after '/'      | The name of the GitHub repository.                |
| `gitLab.projectId` | `String` |                        | The ID of the GitLab repository.                  |

## App size

#### Tasks

| Task                       | Description                                                               |
|----------------------------|---------------------------------------------------------------------------|
| `emergeUpload{Variant}Apk` | Upload an APK matching the specified variant to Emerge for size analysis. |
| `emergeUpload{Variant}Aab` | Upload an AAB matching the specified variant to Emerge for size analysis. |

#### Configuration

The `size` extension allows you to configure size-specific fields.

```kotlin
emerge {
  // ..

  size {
    // Tag to use for grouping builds in the Emerge dashboard
    tag.set("release")
    // Alternatively, use `setFromVariant()` to set the tag from the Android build variant
    tag.setFromVariant()

    // If size tasks/project configuration are enabled.
    enabled.set(true)
  }
}
```

##### Fields

| Field     | Type      | Default   | Description                                                 |
|-----------|-----------|-----------|-------------------------------------------------------------|
| `tag`     | `String`  | `release` | The tag to use for grouping builds in the Emerge dashboard. |
| `enabled` | `boolean` | `true`    | If size tasks/project configuration are enabled.            |

### Performance

#### Tasks

| Task                               | Description                                                                                                                         |
|------------------------------------|-------------------------------------------------------------------------------------------------------------------------------------|
| `emergeGeneratePerformanceProject` | Create a pre-configured Emerge performance module. Only available if `performance.projectPath` value is set and doesn't yet exist . |
| `emergeUpload{Variant}PerfBundle`  | Upload an AAB matching the specified variant to Emerge packaged with the `performance.projectPath`'s test APK.                      |
| `emergeLocal{Variant}Test`         | Run performance tests from `performance.projectPath` locally for debugging & testing.                                               |

#### Configuration

By default, Emerge will automatically add the necessary build configuration needed for the
specified `projectPath` module.

Additionally, the `performance` extension allows you to configure perf-specific fields.

```kotlin
emerge {
  // ..

  performance {
    // REQUIRED - Relative gradle path from root project to the Emerge performance module
    projectPath.set(":perf")

    // Tag to use for grouping builds in the Emerge dashboard
    tag.set("release")
    // Alternatively, use `setFromVariant()` to set the tag from the Android build variant
    tag.setFromVariant()

    // If performance tasks/project configuration are enabled.
    enabled.set(true)
  }
}
```

##### Fields

| Field         | Type      | Default   | Description                                                          |
|---------------|-----------|-----------|----------------------------------------------------------------------|
| `projectPath` | `String`  |           | The relative gradle path from root to the Emerge performance module. |
| `tag`         | `String`  | `release` | The tag to use for grouping builds in the Emerge dashboard.          |
| `enabled`     | `boolean` | `true`    | If performance tasks/project configuration are enabled.              |

### Snapshots

#### Tasks

| Task                                  | Description                                                                                                                             |
|---------------------------------------|-----------------------------------------------------------------------------------------------------------------------------------------|
| `emergeLocalSnapshots{Variant}`       | Run snapshot tests locally.                                                                                                             |
| `emergeUploadSnapshotBundle{Variant}` | Builds & uploads target & test APKs for the specified variant. Snapshots will be generated & saved in Emerge's cloud snapshot offering. |

#### Configuration

The `snapshot` extension allows you to configure snapshot-specific fields.

```kotlin
emerge {
  // ..

  snapshots {
    // Path to local snapshot image storage, defaults to `/build/emerge/snapshots/outputs`
    snapshotsStorageDirectory.set("/src/main/snapshots")

    // Android API version to run snapshots on, must be 29, 31, 33 or 34.
    apiVersion.set(33)

    // Include private previews in snapshot generation - defaults to true
    includePrivatePreviews.set(false)

    // Tag to use for grouping builds in the Emerge dashboard
    tag.set("snapshots")
    // Alternatively, use `setFromVariant()` to set the tag from the Android build variant
    tag.setFromVariant()

    // If performance tasks/project configuration are enabled.
    enabled.set(true)
  }
}
```

For `apiVersion`, Emerge currently only supports APIs 29, 31, 33 & 34. For an easy mapping of API
versions to releases & names, see [Android API levels](https://apilevels.com/).

##### Fields

| Field                       | Type      | Default                           | Description                                                                                       |
|-----------------------------|-----------|-----------------------------------|---------------------------------------------------------------------------------------------------|
| `tag`                       | `String`  | `release`                         | The build tag to use for grouping builds in the Emerge dashboard.                                 |
| `snapshotsStorageDirectory` | `String`  | `/build/emerge/snapshots/outputs` | The path to local snapshot storage. Only used for local snapshot generation.                      |
| `apiVersion`                | `Int`     | `34`                              | The Android API version to use for snapshot generation. Must be an int value in 29, 31, 33 or 34. |
| `enabled`                   | `boolean` | `true`                            | If snapshot tasks/project configuration are enabled.                                              |
| `includePrivatePreviews`    | `boolean` | `true`                            | If Emerge should snapshot `private` annotated `@Preview` functions.                               |

## Full configuration

```kotlin
emerge {
  // Emerge uses the EMERGE_API_TOKEN env variable by default, so no need to set env explicitly
  apiToken.set(System.getenv("EMERGE_API_TOKEN"))

  vcs {
    // Optional, will be set automatically using Git information.
    sha.set("..")
    // Optional, will be set automatically using Git information.
    baseSha.set("..")
    // Optional, will be set automatically using Git information.
    branchName.set("my-feature")
    prNumber.set("123")

    gitHub {
      // Required for CI status checks (only if using GitHub)
      repoOwner.set("..")
      // Required for CI status checks (only if using GitHub)
      repoName.set("..")
    }

    gitLab {
      // Required for CI status checks (only if using GitLab)
      projectId.set("..")
    }
  }

  size {
    // Optional, defaults to 'release'
    tag.set("release")
    // Alternatively, use `setFromVariant()` to set the tag from the Android build variant name
    tag.setFromVariant()

    // If size tasks/project configuration are enabled.
    enabled.set(true)
  }

  performance {
    // Required for performance testing
    projectPath.set(":perf")

    // Optional, defaults to 'release'
    tag.set("release")
    // Alternatively, use `setFromVariant()` to set the tag from the Android build variant
    tag.setFromVariant()

    // If performance tasks/project configuration are enabled.
    enabled.set(true)
  }

  snapshots {
    // Storage of locally generated snapshots
    snapshotsStorageDirectory.set("/src/main/snapshots")
    // Android API version to run snapshots on, must be 29, 31, 33 or 34.
    apiVersion.set(33)
    // Include private previews in snapshot generation - defaults to true
    includePrivatePreviews.set(false)

    // Optional, snapshots use debug builds, we recommend using a separate tag.
    tag.set("snapshots")
    // Alternatively, use `setFromVariant()` to set the tag from the Android build variant name
    tag.setFromVariant()

    // If snapshot tasks/project configuration are enabled.
    enabled.set(true)
  }
}
```

## Gradle configuration cache

- The Emerge Gradle Plugin is compatible with
  the [Gradle configuration cache](https://docs.gradle.org/current/userguide/configuration_cache.html).

## Migration from 1.X

Breaking changes:

#### General

- Root-project configuration is no longer supported. Users should move the Emerge plugin's
  configuration to the application module(s) they wish to use with Emerge.
- Top-level `buildType` field has been removed in favor of per-product `buildType` setting
  - We recommend setting any existing `buildType` values as `size.buildType`.
- Top-level `performanceProjectPath` has been moved to `performance.projectPath`.

#### VCS

- `vcsOptions` has become `vcs`.
- `vcsOptions.gitHubOptions` has become `vcs.gitHub`.
- `vcsOptions.gitLabOptions` has become `vcs.gitLab`.

#### Performance

- Users must now add the kotlin-android plugin to their performance module:

```kotlin
plugins {
  id("org.jetbrains.kotlin.android")
}
```

- Users must now add the Emerge perf test SDK dependency to their performance module:

```kotlin
dependencies {
  implementation("com.emergetools.test:performance:{version}")
}
```

#### Launch booster

- Removal of `launchBooster` extension.
- Removal of `emergeGenerate{Variant}BaselineProfile` task.

# Maintenance

## Testing

Java 11 & Java 17 must be installed and respective environment variables must be set:

- `JAVA_HOME_11_{arch}`, ex `JAVA_HOME_11_aarch64`
- `JAVA_HOME_17_{arch}`, ex `JAVA_HOME_17_aarch64`

Both Java 17 & Java 11 must be installed as we test against both AGP 7 & 8, which requires Java 11 &
17 respectively.

Additionally, `ANDROID_SDK_ROOT` must be set and point to the Android SDK location to run tests.

```
./gradlew functionalTest
```

## Releasing

### Releasing a new version

1. Update the `emerge-gradle-plugin` version in `/gradle/libs.versions.toml`
2. Update the plugin version in documentation.
3. Update the `/gradle-plugin/CHANGELOG.md`
3. `gt c -am "Prepare for Gradle plugin release X.Y.Z"` (where X.Y.Z is the version set in step 1)
1. Alt
1. `git add *`
2. `git commit -m "Prepare for Gradle plugin release X.Y.Z"`
4. `gt ss`
1. Alt:
1. `git push`
2. Open PR
6. Get PR approved and merge
7. Create a new release on GitHub
8. Tag version `gradle-plugin-vX.Y.Z`
9. Release title `Gradle Plugin vX.Y.Z`
10. Paste the content from `/gradle-plugin/CHANGELOG.md` as the description

The `gradle-plugin-release` workflow will automatically publish the new version to the Gradle Plugin
portal upon new release publish.
