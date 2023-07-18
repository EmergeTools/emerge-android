# 🛰️ Emerge Snapshot Testing

An all-in-one Android snapshot testing solution.

**⚠️ Emerge snapshots are currently in beta and are subject to changes.**

## Features

- Automatically generate snapshots of composable previews.
- Built-in support for Activity & View snapshotting.
- Gradle plugin for easy setup & helper tasks (see below for full documentation).

## Quickstart

### Setup Emerge Gradle plugin

Add the Emerge Gradle plugin to your application's `build.gradle.kts` file:

```kotlin
plugins {
  id("com.emergetools.android") version "2.0.0-rc03"
}

emerge {
  // Emerge uses the EMERGE_API_TOKEN env variable by default, so no need to set env explicitly
  apiToken.set(System.getenv("EMERGE_API_TOKEN"))
}
```

See [gradle-plugin](../gradle-plugin/README.md) for more information.

### Add Snapshot SDK(s)

Add the Emerge snapshot SDK(s) as `androidTest` dependencies to your application module:

```kotlin
plugins {
  // For Compose @Preview snapshot generation:
  id("com.google.devtools.ksp")
}

dependencies {
  androidTestImplementation("com.emergetools.snapshots:snapshots:0.5.2")
  // For Compose @Preview snapshot generation:
  kspAndroidTest("com.emergetools.snapshots:snapshots-processor:0.5.2")
}
```

A KSP compiler plugin is leveraged to automatically generate snapshot tests for compose previews.

### Compose snapshotting

Add compose `@Preview` annotated methods directly to your `androidTest` source set.

```kotlin
@Preview
@Composable
fun MyComposablePreview() {
  MyComposable(
    text = "Hello, World!"
  )
}
```

That's it! Using KSP, `snapshot-processor` will automatically generate snapshot tests for
all `@Preview` annotated functions in the `androidTest` source set.

We recommend creating `@Preview` functions in the `androidTest` source set that depend directly on
composables located in your `main` source set.

_⚠️ Currently only no-arg, public `@Preview` annotated composable functions are supported._

#### Generating Preview snapshots from the main source set

While we recommend Previews intended for snapshot testing to live in the `androidTest` source set,
Preview snapshots can be generated directly from Composable Previews in the `main` source set.

```kotlin
plugins {
  id("com.emergetools.android") version "2.0.0-rc03"
  id("com.google.devtools.ksp")
}

emerge {
  // ..
}

dependencies {
  androidTestImplementation("com.emergetools.snapshots:snapshots:0.5.2")
  // For Compose @Preview snapshot generation from main source set:
  ksp("com.emergetools.snapshots:snapshots-processor:0.5.2")
}
```

Emerge relies on a custom source set that generated snapshot tests are moved to before
compilation to get around KSP cross-source set generation restrictions.

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
Add the Emerge gradle plugin to your top-level build.gradle(.kts) file:

```kotlin
plugins {
  id("com.emergetools.android") version "2.0.0-rc03"
}

emerge {
  apiToken.set(System.getenv("EMERGE_API_TOKEN"))

  // Optional
  snapshots {
    buildType.set("snapshots") // To ensure Emerge size dashboard is not mixed with snapshot builds
  }
}
```

_Snapshot support was added in Emerge gradle plugin v2.0.0, versions below 2.X do not support
snapshots._

Then, run the `emergeLocalSnapshots<variant>` task to generate snapshots. You'll need a connected
device or emulator actively running.

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

#### Image Keys

Emerge uses the `name` set in the `take()` block as the "key" for storage and diffing.

```kotlin
class ExampleMainActivityTest {

  @get:Rule
  val snapshots = EmergeSnapshots()

  @Test
  fun basicActivityView() {
    // ..

    // The primary key for saving/diffing this snapshot is the "Main Activity" string.
    snapshots.take("Main Activity", activity)
  }
}
```

For generated composable snapshots, the name is the composable function's name.

```kotlin
/**
 * If Composable snapshot generation is enabled, Emerge will generate a snapshot test
 * for this composable with the name "TextRowWithIconPreview".
 */
@Preview
@Composable
fun TextRowWithIconPreview() {
  TextRowWithIcon(
    titleText = "Title",
    subtitleText = "Subtitle"
  )
}
```

## Releasing

### Releasing a new version

1. Update the `emerge-snapshots` version in `/gradle/libs.versions.toml`
2. Update the `/snapshots/CHANGELOG.md`
3. `gt bc -a -m "Prepare for Snapshots release X.Y.Z"` (where X.Y.Z is the version set in step 1)
4. `gt ss`
5. Get PR approved and merge
6. Create a new release on GitHub
7. Tag version `snapshots-vX.Y.Z`
8. Release title `Snapshots vX.Y.Z`
9. Paste the content from `/snapshots/CHANGELOG.md` as the description

The `snapshots-release` workflow will automatically publish the new version to Sonatype upon new
release publish.

From there, the release will need to be promoted to the main repository from the Sonatype UI.

