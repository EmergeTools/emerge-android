# 🛸 Emerge Android

Emerge Android tooling & Gradle plugin for using Emerge's suite of products:

- ⚖️ Size analysis
- 🏎 Performance testing
- 📸 End-to-end snapshot testing

## Getting started

Using Emerge's Android tooling requires an Emerge account and Emerge offers generous trial & indie tiers to get started. 

To sign up, visit [emergetools.com](https://www.emergetools.com/).

## 🐘 Emerge Gradle Plugin

The Emerge Gradle Plugin provides many helper tasks and functionality for integrating Emerge into
your Android project.

See [gradle-plugin](./gradle-plugin/README.md) for more information.

## 🏎 Performance

Emerge offers tooling for performance testing custom startup and UI tests.

Emerge tests on real, physical devices and handles variance control, statistical measurements and
more to ensure you get 99% accurate performance measurements.

See [performance](./performance/README.md) for full documentation.

## 📸 Snapshots

Emerge offers a full end-to-end snapshot testing solution using compose `@Preview` functions with only about 10 minutes of setup.

Emerge handles the heavy lifting of generating, diffing and hosting the snapshots for each build,
allowing you to focus on building beautiful UI components.

See [snapshots](./snapshots/README.md) for full documentation.

## Artifacts & versions

| Artifact                                        | Description                                     | Latest                                                                                                                                                                                                             | Min SDK |
|-------------------------------------------------|-------------------------------------------------|--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|---------|
| `com.emergetools.android`                       | Emerge Gradle Plugin                            | 3.0.0                                                                                                                                                                                                              | N/A     |
| `com.emergetools.test:performance`              | Performance testing SDK                         | [![Maven Central](https://maven-badges.herokuapp.com/maven-central/com.emergetools.test/performance/badge.svg)](https://maven-badges.herokuapp.com/maven-central/com.emergetools.test/performance)                 | 23      |
| `com.emergetools.snapshots:snapshots`           | Snapshot testing SDK                            | [![Maven Central](https://maven-badges.herokuapp.com/maven-central/com.emergetools.snapshots/snapshots/badge.svg)](https://maven-badges.herokuapp.com/maven-central/com.emergetools.snapshots/snapshots)           | 23      |
| `com.emergetools.snapshots:snapshots-processor` | Snapshot KSP processor for Composable snapshots | [![Maven Central](https://maven-badges.herokuapp.com/maven-central/com.emergetools.snapshots/snapshots-processor/badge.svg)](https://maven-badges.herokuapp.com/maven-central/com.emergetools.snapshots/snapshots) | N/A     |
