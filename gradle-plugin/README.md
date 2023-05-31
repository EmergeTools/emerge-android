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

In your root project's `build.gradle(.kts)`:

```kotlin build.gradle.kts (root)
plugins {
  id("com.emergetools.android") version "2.0.0-alpha02"
}

emerge {
  appProjectPath.set(":app") // Your primary application module
  apiToken.set(System.getenv("EMERGE_API_TOKEN"))
}
```

_Gradle plugins are often applied and configured in the `build.gradle(.kts)` file of subprojects.
*It is highly recommended to apply the Emerge plugin to the root project, ie. the
top-level `build.gradle(.kts)`.* This facilitates cross-project features like performance analysis._

`appProjectPath` and `apiToken` are required. Other configuration properties are documented below.

### Obtain an API key

Follow our guide
on [obtaining an API key](https://docs.emergetools.com/docs/uploading-basics#obtain-an-api-key).

We recommend storing this token in a secrets store, an environment variable, or a Gradle property
file. The example in this guide uses the `EMERGE_API_TOKEN` environment variable.

### VCS

Emerge is designed to work as part of your CI workflow for diffing and comparing size, performance
and snapshots. To ensure these comparisons are accurate, Emerge leverages VCS information to
accurately determine the proper comparison builds.

#### Configuration

By default, necessary Git values are set automatically for you. If you need to override these
values, you can do so using the `vcs` extension.

```kotlin
emerge {
  ...

  vcs {
    sha.set("...")
    baseSha.set("...")
    branchName.set("my-feature")
    prNumber.set("123")
  }
}
```

#### GitHub

The GitHub sub-extension can be used to set GitHub-specific values. These are set automatically for
you if not specified using repoId information from Git's remoteUrl.

These are used for CI integrations, like posting GitHub comments and status checks.

```kotlin
emerge {
  ...

  vcs {
    ...

    gitHub {
      repoOwner.set("...")
      repoName.set("...")
    }
  }
}
```

#### GitLab

The GitLab sub-extension can be used to set GitLab-specific values. Unlikely GitHub values, these
are not set automatically and will need to be set manually for GitLab CI integration.

```kotlin
emerge {
  ...

  vcs {
    ...

    gitLab {
      projectId.set("...")
    }
  }
}
```

##### Fields

| Field                | Type     | Default                | Description                                       |
|----------------------|----------|------------------------|---------------------------------------------------|
| `sha`                | `String` | HEAD branch commit sha | The Git sha of the HEAD build.                    |
| `baseSha`            | `String` | base branch commit sha | The Git sha of the base build to compare against. |
| `branchName`         | `String` | Current branch name    | The name of the branch being built.               |
| `prNumber`           | `String` |                        | The number of the pull request being built.       |
| `gitHub.repoOwner`   | `String` | Repo ID before '/'     | The owner of the GitHub repository.               |
| `gitHub.repoName`    | `String` | Repo ID after '/'      | The name of the GitHub repository.                |
| `gitLab.[projectId]` | `String` |                        | The ID of the GitLab repository.                  |

### App size

#### Tasks

| Task                       | Description                                                               |
|----------------------------|---------------------------------------------------------------------------|
| `emergeUpload{Variant}Apk` | Upload an APK matching the specified variant to Emerge for size analysis. |
| `emergeUpload{Variant}Aab` | Upload an AAB matching the specified variant to Emerge for size analysis. |

#### Configuration

The `size` extension allows you to configure size-specific fields.

```kotlin
emerge {
  ...

  size {
    buildType.set("release") // Build type to use for grouping builds in the Emerge dashboard
  }
}
```

##### Fields

| Field       | Type     | Default   | Description                                                        |
|-------------|----------|-----------|--------------------------------------------------------------------|
| `buildType` | `String` | `release` | The build type to use for grouping builds in the Emerge dashboard. |

### Performance

#### Tasks

| Task                               | Description                                                                                                                 |
|------------------------------------|-----------------------------------------------------------------------------------------------------------------------------|
| `emergeGeneratePerformanceProject` | Create a pre-configured Emerge performance module. Only available if `perfProjectPath` value is set and doesn't yet exist . |
| `emergeUpload{Variant}PerfBundle`  | Upload an AAB matching the specified variant to Emerge packaged with the `perfProjectPath`'s test APK.                      |
| `emergeLocal{Variant}Test`         | Run performance tests from `perfProjectPath` locally for debugging & testing.                                               |

#### Configuration

By default, Emerge will automatically add the necessary build configuration needed for the
specified `perfProjectPath` module.

Additionally, the `performance` extension allows you to configure perf-specific fields.

```kotlin
emerge {
  ...

  performance {
    perfProjectPath.set(":perf") // REQUIRED - Module path to the Emerge performance module
    buildType.set("release") // Build type to use for grouping builds in the Emerge dashboard
  }
}
```

##### Fields

| Field             | Type     | Default   | Description                                                        |
|-------------------|----------|-----------|--------------------------------------------------------------------|
| `perfProjectPath` | `String` |           | The module path to the Emerge performance module.                  |
| `buildType`       | `String` | `release` | The build type to use for grouping builds in the Emerge dashboard. |

### Snapshots

#### Tasks

| Task                                  | Description                                                                                                                 |
|---------------------------------------|-----------------------------------------------------------------------------------------------------------------------------|
| `emergeUploadSnapshotBundle{Variant}` | Builds & uploads target & test APKs for the specified variant. Snapshots will be generated & saved on Emerge's cloud infra. |
| `emergeLocalSnapshots{Variant}`       | Run snapshot tests locally.                                                                                                 |

#### Configuration

The `snapshot` extension allows you to configure snapshot-specific fields.

```kotlin
emerge {
  ...

  snapshots {
    snapshotsStorageDirectory.set(
      "/src/main/snapshots"
    ) // Path to local snapshot image storage, defaults to `/build/emerge/snapshots/outputs`
    buildType.set("snapshots") // Build type to use for grouping builds in the Emerge dashboard
  }
}
```

##### Fields

| Field                       | Type     | Default                           | Description                                                                  |
|-----------------------------|----------|-----------------------------------|------------------------------------------------------------------------------|
| `snapshotsStorageDirectory` | `String` | `/build/emerge/snapshots/outputs` | The path to local snapshot storage. Only used for local snapshot generation. |
| `buildType`                 | `String` | `release`                         | The build type to use for grouping builds in the Emerge dashboard.           |

## Full configuration example

```kotlin
emerge {

  appProjectPath.set(":app")
  apiToken.set(System.getenv("EMERGE_API_TOKEN")) // Required

  vcs {
    sha.set("...") // Optional, will be set automatically using Git information.
    baseSha.set("...") // Optional, will be set automatically using Git information.
    branchName.set("my-feature") // Optional, will be set automatically using Git information.
    prNumber.set("123")

    gitHub {
      repoOwner.set("...") // Required for CI status checks (only if using GitHub)
      repoName.set("...") // Required for CI status checks (only if using GitHub)
    }

    gitLab {
      projectId.set("...") // Required for CI status checks (only if using GitLab)
    }
  }

  size {
    buildType.set("release")
  }

  performance {
    buildType.set("release")
    perfProjectPath.set(":perf")
  }

  snapshots {
    buildType.set("snapshots") // Snapshots use debug builds, recommend using a separate build type.
    snapshotsStorageDirectory.set("/src/main/snapshots") // Storage of locally generated snapshots
  }
}
```

## Migration from 1.X

TODO: Migration guide

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

### Prerequisites

- The following Gradle properties must be set:
  - `gradle.publish.key`
  - `gradle.publish.secret`

### Releasing a new version

1. Update the version in `build.gradle.kts`
2. Update the `CHANGELOG.md`
3. `gt bc -a -m "Prepare for release X.Y.Z"` (where X.Y.Z is the version set in step 1)
4. `gt ss`
5. Get PR approved and merge
6. Create a new release on GitHub
  1. Tag version `vX.Y.Z`
  2. Release title `vX.Y.Z`
  3. Paste the content from `CHANGELOG.md` as the description
7. `./gradlew publishPlugins`
