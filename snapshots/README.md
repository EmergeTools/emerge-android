# 🛰️ Emerge Snapshot Testing

All-in-one Android snapshot testing.

## Features

- **Automatically generate** snapshots of composable previews, including previews in the main source
  set.
- Built-in support for Activity & View snapshotting.
- Gradle plugin for easy setup & helper tasks (see below for full documentation).

## Quickstart

### Setup Emerge Gradle plugin

Add the Emerge Gradle plugin to your application's `build.gradle.kts` file:

```kotlin
plugins {
  id("com.emergetools.android")
}

emerge {
  // Emerge uses the EMERGE_API_TOKEN env variable by default, so no need to set env explicitly
  apiToken.set(System.getenv("EMERGE_API_TOKEN"))
}
```

See [gradle-plugin](../gradle-plugin/README.md) for more information.

### Add Snapshot SDK(s)

Add the Emerge snapshot SDK as an `androidTest` dependency to your application module. For automatic
compose `@Preview` snapshot generation, add the KSP processor as a `ksp` dependency.

```kotlin
plugins {
  // For Compose @Preview snapshot generation:
  id("com.google.devtools.ksp")
}

dependencies {
  androidTestImplementation("com.emergetools.snapshots:snapshots:{latest_version}")
  // For Compose @Preview snapshot generation from the main source set:
  ksp("com.emergetools.snapshots:snapshots-processor:{latest_version}")
}
```

### Compose snapshotting

Emerge's KSP `snapshot-processor` automatically generates snapshot tests for compose previews in the
source set the KSP processor is applied to. No additional setup work needs to be done!

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

_⚠️ Currently only no-arg, public `@Preview` annotated composable functions are supported._

#### Variant support

Emerge currently supports a subset of `@Preview` annotation parameters:

- `fontScale`
- `locale`
- `uiMode` (dark/light mode)

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

Not all Previews might need to be snapshot tested. To ignore a preview from snapshotting, add
the `@IgnoreEmergeSnapshot` annotation to the preview function.

```kotlin
@Preview
@EmergeIgnoreSnapshot
@Composable
fun MyComposablePreview() {
  MyComposable(
    text = "Hello, World!"
  )
}
```

You'll need to add a dependency on the `snapshots-annotations` artifact to use the
`@IgnoreEmergeSnapshot` annotation. This is a lightweight dependency only containing annotations
the `snapshots-processor` leverages.

```kotlin
dependencies {
  implementation("com.emergetools.snapshots:snapshots-annotations:{latest_version}")
}
```

#### Generating Preview snapshots from the androidTest source set

Emerge can automatically generate snapshot tests for all composable previews in the `main` source
set, but sometimes creating explicit previews for snapshot testing is more desired.

Simply apply the Emerge KSP processor as a `kspAndroidTest` dependency instead of `ksp` to generate
snapshot tests from the `androidTest` source set.

```kotlin
plugins {
  id("com.emergetools.android")
  id("com.google.devtools.ksp")
}

emerge {
  // ..
}

dependencies {
  androidTestImplementation("com.emergetools.snapshots:snapshots:{latest_version}")
  // For Compose @Preview snapshot generation from androidTest source set:
  kspAndroidTest("com.emergetools.snapshots:snapshots-processor:{latest_version}")
}
```

And as an example, assuming the following preview lives in the `androidTest` source set:

```kotlin
// src/androidTest/com/myapp/MyComposablePreviewTest.kt

@Preview
@Composable
fun MyComposablePreviewTest() {
  MyComposable(
    text = "Hello, World!"
  )
}
```

Emerge will automatically generate a preview snapshot test for `MyComposablePreviewTest()`.

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
  apiToken.set(System.getenv("EMERGE_API_TOKEN"))

  // Optional
  snapshots {
    tag.set("snapshots") // To ensure Emerge size dashboard is not mixed with snapshot builds
  }
}
```

_Snapshot support was added in Emerge gradle plugin v2.0.0, versions below 2.0.0 do not support
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

##### Composable Preview snapshots

For generated composable snapshots, the image key is the composable preview function's
fully-qualified name.

For example, given the following function:

```kotlin
// src/main/com/myapp/TextRowWithIcon.kt

@Preview
@Composable
fun TextRowWithIconPreview() {
  TextRowWithIcon(
    titleText = "Title",
    subtitleText = "Subtitle"
  )
}
```

The key used for snapshot diffing will be `com.myapp.TextRowWithIconPreview`. If any parameters are
present in the `@Preview` annotation, a stable hash for the parameters will be appended to the key.

##### Activity & View snapshots

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

