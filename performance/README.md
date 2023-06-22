# 🏎️ Emerge Performance Testing

## Features

- 99% accurate performance measurements
- Full main thread stacktrace comparison with differential flamegraphs
- Span support for narrowing performance measurements
- Support for custom startup & UI test scenarios

## Quickstart (~10 min)

### Setup Emerge Gradle plugin

If you haven't already, add the Emerge Gradle plugin to your root-level `build.gradle.kts` file:

```kotlin
plugins {
  id("com.emergetools.android") version "2.0.0-beta02"
}

emerge {
  appProjectPath.set(":app") // Your application module
  apiToken.set(System.getenv("EMERGE_API_TOKEN"))
}
```

See [gradle-plugin](../gradle-plugin/README.md) for more information.

### Generate performance project

The Emerge Gradle plugin automatically generates the full performance project for you. To generate
the performance project manually, first add a the performance extension block and define the module
path you'd like to create the performance project at:

```kotlin
emerge {
  // ...

  performance {
    perfProjectPath.set(":perf") // The performance module to create
  }
}
```

Then run the `emergeGeneratePerformanceProject` Gradle task, specifying the `packageName` of the
test APK:

```shell
./gradlew emergeGeneratePerformanceProject --package com.myapp.performance
```

This creates the subproject with an example performance test and adds it to settings.gradle(.kts):

![Example perf module](/docs/assets/sample_perf_project.png)

_"Sync Project with Gradle Files" for your IDE to recognize the new subproject._

### Create your first performance test

Open the newly generated `ExamplePerformanceTest` file. The Emerge SDK provides method annotations
that work similarly to the JUnit annotations you may be used to:

- `@EmergeTest`/`@EmergeStartupTest` defines performance test methods. Each test method is run
  multiple times on an isolated device in order to detect significant performance changes. Typically
  this is where you would launch your app or perform an operation whose performance is critical.
  - See [Startup testing](#startup-testing) for more information on `@EmergeStartupTest` annotated
    tests.
  - See [Custom flow testing](#custom-flow-testing) for more information on `@EmergeTest` annotated
    tests.
- The `@EmergeSetup` method is executed once before each test `@EmergeTest` iteration. It is not run
  for `@EmergeStartupTest` methods. It is optional and is typically used to navigate to the screen
  where the performance testing should start. Only one setup method per class is allowed.
- The `@EmergeInit` method is executed just once after the app is installed. It is optional and is
  typically used to log into the app or for one-time setup, if needed. Only one init method per
  class is allowed.

![Lifecycle of a custom perf test](/docs/assets/lifecycle_of_perf_test.png)

### Verify perf tests locally

Emerge goes through great lengths to make performance tests reliable, like using one real device for
each test, running every test dozens of times, etc.

As such it is not possible to run a true performance test on your local machine. However it is
possible to run your performance tests locally to ensure that they are set up correctly and can
complete successfully:

```shell
./gradlew emergeLocalReleaseTest
```

### Run performance tests on Emerge's cloud perf testing suite

Once you've verified that your performance tests are set up correctly, you can run them on Emerge's
cloud perf testing suite:

```shell
./gradlew emergeUpload{Variant}PerfBundle
```

This will build the specific variant of your target app (specified by the `appProjectPath`
property) as well as the `perfTestProject` test APK. It will then upload both to Emerge, where
Emerge will run your performance tests on real, physical devices with 99% accuracy.

A link will be outputted in the console to the view the test upon a successful upload:

```shell
Performance bundle Upload successful! View Emerge's analysis analysis at the following url:
https://emergetools.com/build/{build_id}?buildContent=comparison
```

### View performance results

Performance tests run numerous iterations of base & head to ensure accuracy and statistical
significance. Typically, tests will complete in about 10-15 minutes, but can take longer depending
on test duration & required samples.

Once complete, you can view the results in the Emerge dashboard:

![Performance test results](/docs/assets/emerge_perf_results.png)

## Startup testing

Emerge startup testing can detect improvements or regression in cold startup performance. By
default, Emerge measures startup performance
as [time to initial display](https://developer.android.com/topic/performance/vitals/launch-time#time-initial),
being process start to the end of the first frame rendering.

Emerge runs numerous iterations of base & head on real, physical devices, controlling numerous
aspects of device performance to ensure we're only measuring code execution changes and to ensure
accuracy and statistical significance:
![Lifecycle of a startup perf test](/docs/assets/lifecycle_of_startup_perf_test.png)

### Default startup

By default, Emerge can run a standard startup performance test for your app without any additional
configuration. Simply let the Emerge team know and we can enable for your uploads!

### Custom startup scenarios

Emerge supports custom startup scenarios for apps that require more complex startup scenarios, like
launching from deeplinks or other entrypoints. For custom startup scenarios, use the
`@EmergeStartupTest` annotation with a custom startup test method:

```kotlin
class MyCustomPerformanceTest {

  @EmergeInit
  fun login() {
    // OPTIONAL - Perform one-time setup, like logging in
  }

  @EmergeStartupTest
  fun customStartupTest() {
    // Ex: Launch app from deeplink or other entrypoint
  }
}
```

Emerge will run the `@EmergeInit` method once after the app is installed, then run the
`@EmergeStartupTest` method multiple times on an isolated device in order to detect any potential
performance regression.

## Custom flow testing

By default, Emerge will measure the performance of your overall UI test's duration. Similar to
startup testing, Emerge runs numerous iterations of base & head, controlling for device conditions
and gathering a large enough sample size to ensure statistical significance.

![Lifecycle of a custom perf test](/docs/assets/lifecycle_of_perf_test.png)

⚠️Use of the Espresso testing framework is strongly discouraged as it can significantly degrade
performance during tests. Please use UI Automator or UI Automator-based libraries
like [Relax](https://github.com/EmergeTools/relax)
or [Kaspresso's Kautomator](https://kasperskylab.github.io/Kaspresso/Tutorial/UiAutomator/) instead.

### Spans

If specific measurements are desired outside of overall duration, Emerge's performance testing can
measure the duration of specific spans from your app,
leveraging [Android.Trace](https://developer.android.com/reference/android/os/Trace)\|[AndroidX.Trace](https://developer.android.com/reference/androidx/tracing/Trace)
functionality to mark the start and end of specific spans.

**Specifying spans requires adding tracing code to the app you're measuring the performance of,
using stock Android|AndroidX functionality. **

### 1. Wrap the code you wish to measure in a `Trace` call:

From your app's source code, you'll need to mark the start and end of any trace
using [Android.Trace](https://developer.android.com/reference/android/os/Trace)
or [AndroidX.Trace](https://developer.android.com/reference/androidx/tracing/Trace) calls.

Emerge expects **exactly one** start/end for any specified span.

```kotlin MainActivity.kt
import androidx.tracing.trace

class MainActivity {

  override fun onCreate(savedInstanceState: Bundle?) {
    trace("main_activity_init") {
      initMyActivity()
    }
  }

  fun initMyActivity() {
    // Performance sensitive code we want to measure
  }
}
```

### 2. Specify the span name(s) to Emerge to record.

Emerge needs a way to find your desired span, which can be provided as part of the `span` parameter
to the `@EmergeTest` annotation.

```kotlin MainActivityInitTest.kt
class MainActivityInitTest {

  @EmergeTest(spans = ["main_activity_init"])
  fun myTest() {
    // Example launching with Emerge's Relax library: https://github.com/EmergeTools/relax
    Relax("com.example.myapp") {
      pressHome()
      launch()
    }
  }
}
```

That's it! Emerge will automatically measure any specified spans measured from your UI test.

