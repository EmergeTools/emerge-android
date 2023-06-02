# 🛰️ Emerge Snapshot Testing

An all-in-one Android snapshot testing solution.

**⚠️ Emerge snapshots are currently in an experimental state and are subject to breaking changes.**

## Features

- Automatically generate snapshots of composable previews.
- Built-in support for Activity & View snapshotting.
- Gradle plugin for easy setup & helper tasks (see below for full documentation).

## Quickstart

Add the Emerge Gradle plugin and `androidTest` dependencies to your application module:

```kotlin
plugins {
  id("com.emergetools.android") version "2.0.0-alpha02"
}

android {

  buildTypes {
    ...
    // Add generated sources to the `androidTest` sourceSet.
    debug {
      sourceSets {
        getByName("androidTest") {
          java.srcDir("generated/ksp/debugAndroidTest/kotlin")
        }
      }
    }
  }
}

dependencies {
  androidTestImplementation("com.emergetools.snapshots:snapshots:0.3.0")
  // For Compose @Preview support:
  kspAndroidTest("com.emergetools.snapshots:snapshots-processor:0.3.0")
}
```

A KSP compiler plugin is leveraged to automatically generate snapshot tests for your compose
previews. By design, snapshots are only generated from the `androidTest` sourceSet. This
is so snapshot tests are explicitly separate from application code.

### Compose

Add compose `@Preview` annotated methods to your `androidTest` sourceSet.

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
all `@Preview` annotated functions in the `androidTest` sourceSet.

We recommend creating `@Preview` functions in the `androidTest` sourceSet that depend directly on
composables located in your `main` sourceSet.

_⚠️ Currently only no-arg `@Preview` annotated composables with a default configuration are supported._

### Activities & Views

Create a basic test class that uses the `EmergeSnapshot` rule to generate snapshots.

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
      snapshots.snapshot(name = "MainActivity", activity = it)
    }
  }

  @Test
  fun customViewSnapshot() {
    val view = CustomView(InstrumentationRegistry.getInstrumentation().targetContext)
    snapshots.snapshot(name = "CustomView", view = view)
  }
}
```

_Each `name` parameter must be unique as it's used as the primary key for saving & diffing._

## Gradle plugin

The Emerge Gradle plugin provides a task to generate snapshots locally for snapshot tests.
Add the Emerge gradle plugin to your top-level build.gradle(.kts) file:

```kotlin
plugins {
  id("com.emergetools.android") version "2.0.0-alpha02"
}

emerge {
  appProjectPath.set(":app")
  apiToken.set(System.getenv("EMERGE_API_TOKEN"))

  // Optional
  snapshots {
    buildType.set("snapshots") // To ensure Emerge size dashboard is not mixed with snapshot builds
  }
}
```

_Snapshot support was added in 2.0.0, versions below 2.X do not support snapshots._

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

### Configuration

To properly diff snapshots, Emerge needs to know which snapshots to compare against. This is done
using Git information, which is set automatically for you.

See [gradle-plugin](../gradle-plugin) documentation for a full list of configuration VCS
configuration options.
