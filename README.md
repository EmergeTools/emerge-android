# 🛸 Emerge Android

Emerge Android tooling & Gradle plugin for using Emerge's suite of developer tooling products:

- ⚖️ Size analysis
- 📸 Snapshots: End-to-end snapshot testing
- 💀 Reaper: Dead code detection using production data
- 🏎 Performance testing
- 🛰️ Build distribution

## Getting started

Using Emerge's Android tooling requires an Emerge account. Emerge offers generous trial & indie
tiers to get started!

Create an account for free at [emergetools.com](https://www.emergetools.com/).

## 🐘 Emerge Gradle Plugin

The Emerge Gradle Plugin provides many helper tasks and functionality for integrating Emerge into
your Android project.

See [gradle-plugin](./gradle-plugin/README.md) for more information.

## 📸 Snapshots

Emerge offers a full end-to-end snapshot testing solution using compose `@Preview` functions with
only about 10 minutes of setup.

Emerge handles the heavy lifting of generating, diffing, and hosting the snapshots for each build,
allowing you to focus on building beautiful UI components.

See [snapshots](./snapshots/README.md) for full documentation.

## 💀 Reaper

Reaper is a library you add to your app to detect dead code. In combination with Emerge's Gradle
plugin, Reaper reports class load usages in production, which Emerge uses to detect dead code.

See [reaper](./reaper/README.md) for full documentation.

## 🏎 Performance

Emerge offers tooling for performance testing custom startup and UI tests.

Emerge tests on real, physical devices and handles variance control, statistical measurements and
more to ensure you get 99% accurate performance measurements.

See [performance](./performance/README.md) for full documentation.

## 🛰️ Build Distribution

Distribution is an SDK to distribute alpha, beta, and test builds.

See [distribution](./distribution/README.md) for full documentation.

## Artifacts & versions

| Artifact                                      | Description                 | Latest                                                                                                                                                                                                                   | Min SDK |
|-----------------------------------------------|-----------------------------|--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|---------|
| `com.emergetools.android`                     | Emerge Gradle Plugin        | [![Gradle Plugin Portal Version](https://img.shields.io/gradle-plugin-portal/v/com.emergetools.android)](https://plugins.gradle.org/plugin/com.emergetools.android)                                                      | N/A     |
| `com.emergetools.snapshots:snapshots`         | Snapshot testing library    | [![Maven Central](https://maven-badges.herokuapp.com/maven-central/com.emergetools.snapshots/snapshots/badge.svg)](https://maven-badges.herokuapp.com/maven-central/com.emergetools.snapshots/snapshots)                 | 23      |
| `com.emergetools.snapshots:snapshots-runtime` | Snapshots Runtime           | [![Maven Central](https://maven-badges.herokuapp.com/maven-central/com.emergetools.snapshots/snapshots-runtime/badge.svg)](https://maven-badges.herokuapp.com/maven-central/com.emergetools.snapshots/snapshots-runtime) | 23      |
| `com.emergetools.reaper:reaper`               | Reaper library              | [![Maven Central](https://maven-badges.herokuapp.com/maven-central/com.emergetools.reaper/reaper/badge.svg)](https://maven-badges.herokuapp.com/maven-central/com.emergetools.reaper/reaper)                             | 21      |
| `com.emergetools.test:performance`            | Performance testing library | [![Maven Central](https://maven-badges.herokuapp.com/maven-central/com.emergetools.test/performance/badge.svg)](https://maven-badges.herokuapp.com/maven-central/com.emergetools.test/performance)                       | 23      |
| `com.emergetools.distribution:distribution`   | Build distribution library  | [![Maven Central](https://maven-badges.herokuapp.com/maven-central/com.emergetools.distribution/distribution/badge.svg)](https://maven-badges.herokuapp.com/maven-central/com.emergetools.distribution/distribution)     | 21      |

