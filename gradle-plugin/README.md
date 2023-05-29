# Emerge Gradle Plugin

## Overview

The Emerge Gradle Plugin provides many helper tasks and functionality for integrating Emerge into
your Android project.

### VCS configuration

# TODO

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
		buildType.set("release")
	}
}
```

##### Fields

| Field       | Type     | Default   | Description                                                        |
|-------------|----------|-----------|--------------------------------------------------------------------|
| `buildType` | `String` | `release` | The build type to use for grouping builds in the Emerge dashboard. |

### Performance

TODO: Tasks & config

### Snapshots

TODO: Tasks & config

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
