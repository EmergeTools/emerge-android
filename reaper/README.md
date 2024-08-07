# 💀 Emerge Reaper

Reaper is an SDK that uses production data for detecting dead code.

## Features

- Automatically detect and delete dead code in production.
- View statistics on real-world code usage.
- (Upcoming) Automated code deletion.

For full details,
see [the Emerge Reaper docs](https://docs.emergetools.com/docs/reaper-setup-android).

## Quickstart (~10 min)

### Setup Emerge Gradle plugin

Add the Emerge Gradle plugin to your application's `build.gradle.kts` file:

```kotlin
plugins {
  id("com.emergetools.android")
}

emerge {
  // Emerge uses the EMERGE_API_TOKEN env variable by default, so no need to set env explicitly
  apiToken.set(System.getenv("EMERGE_API_TOKEN"))

  reaper {
    enabled.set(true)
    publishableApiKey.set(System.getenv("EMERGE_PUBLISHABLE_API_KEY"))
  }
}
```

You must set `enabled` to be `true` for reaper to work properly. Behind the scenes, the Emerge
Gradle plugin will instrument your code to drop breadcrumbs that Reaper can use to detect dead code
when this property is set. _You can set `enabled` to false when building debug builds to avoid
instrumenting your code for all builds._

`publishableApiKey` is a token included with reports uploaded from the field to Emerge.
Your team's key can be
found [here](https://emergetools.com/settings?tab=feature-configuration&cards=reaper_enabled).

**Emerge recommends enabling reaper on any release build run.**

See [gradle-plugin](../gradle-plugin/README.md) for more information.

### Add Reaper SDK

Add the Reaper SDK to your application's `build.gradle.kts` file:

```kotlin

dependencies {
  implementation("com.emergetools.reaper:reaper:<latest_version>")
}
```

### Build a release build

Emerge needs a valid release AAB to generate a list of all possible classes within your app.

```shell
./gradlew :app:bundleRelease
```

By setting the `reaper.enabled` property to `true`, the Emerge Gradle plugin will instrument your
release app's code and upload the resulting AAB from the `bundle` task to Emerge.

Emerge will then analyze the AAB, parsing all classes in the app. This process can take a few
minutes. Upon receiving Reaper reports from production data, Emerge will automatically mark used
classes as used.

### Release your app with Reaper

That's it! Build and ship the AAB you generated in the previous step with Reaper enabled to start
detecting dead code.

As reports come in, Emerge's Reaper UI will show unused code from real user reports. We recommend
waiting a few days after a release before acting on the data to ensure enough time for a wide range
of user sessions to have used your app.

## How it works

Reaper uses production data to detect dead code by determining what code is used at runtime.

It works by instrumenting code using our Gradle plugin, which instruments class initialization
functions. Upon a class being initialized, Emerge will mark that class as used in an in-memory
store. This marking is done by recording a hash of the class name, so no actual class names are
recorded.

Upon a user backgrounding the application, Emerge will send the list of hashes of used classes to
the Emerge backend. Emerge will then process each report received, marking classes as used if any
user session reports that class being used.

## Releasing

### Releasing a new version

1. Update the `emerge-reaper` version in `/gradle/libs.versions.toml`
2. Update the `/reaper/CHANGELOG.md`
3. `gt c -am "Prepare for Reaper release X.Y.Z"` (where X.Y.Z is the version set in step 1)
4. `gt ss`
5. Get PR approved and merge
6. Create a new release on GitHub
7. Tag version `reaper-vX.Y.Z`
8. Release title `Reaper vX.Y.Z`
9. Paste the content from `/reaper/CHANGELOG.md` as the description

The `reaper-release` workflow will automatically publish the new version to Sonatype upon new
release publish.

From there, the release will need to be promoted to the main repository from the Sonatype UI.

