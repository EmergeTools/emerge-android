# 🛰️ Emerge build distribution

Emerge build distribution is a library for distributing Beta, Alpha, and test
builds.

## Features

## Quickstart (~10 min)

### Add build distribution library

Add the Build Distribution library to your application's `build.gradle.kts` file:

```kotlin

dependencies {
  implementation("com.emergetools.distribution:distribution:<latest_version>")
}
```

## Releasing Build Distribution library

### Releasing a new version

1. Update the `emerge-distribution` version in `/gradle/libs.versions.toml`
2. Update the `/distribution/CHANGELOG.md`
3. `gt c -am "Prepare for Distribution release X.Y.Z"` (where X.Y.Z is the version set in step 1)
4. `gt ss`
5. Get PR approved and merge
6. Create a new release on GitHub
7. Tag version `distribution-vX.Y.Z`
8. Release title `Distribution vX.Y.Z`
9. Paste the content from `/distribution/CHANGELOG.md` as the description

The `distribution-release` workflow will automatically publish the new version to Sonatype upon new
release publish.

From there, the release will need to be promoted to the main repository from the Sonatype UI.

