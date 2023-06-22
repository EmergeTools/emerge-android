# Emerge Android

Emerge Android SDK & tooling.

## Getting started

Emerge offers a suite of products to help optimize app size, performance and quality. This
repository contains all publicly available Emerge Android products and integrations.

### Artifacts

| Artifact                                        | Description                                     | Latest                                                                                                                                                                                                             | Min SDK |
|-------------------------------------------------|-------------------------------------------------|--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|---------|
| `com.emergetools.android`                       | Emerge Gradle Plugin                            | 2.0.0-beta02                                                                                                                                                                                                       | N/A     |
| `com.emergetools.test:performance`              | Performance testing SDK                         | [![Maven Central](https://maven-badges.herokuapp.com/maven-central/com.emergetools.snapshots/snapshots/badge.svg)](https://maven-badges.herokuapp.com/maven-central/com.emergetools.test/performance)              | 23      |
| `com.emergetools.snapshots:snapshots`           | Snapshot testing SDK                            | [![Maven Central](https://maven-badges.herokuapp.com/maven-central/com.emergetools.snapshots/snapshots/badge.svg)](https://maven-badges.herokuapp.com/maven-central/com.emergetools.snapshots/snapshots)           | 26      |
| `com.emergetools.snapshots:snapshots-processor` | Snapshot KSP processor for Composable snapshots | [![Maven Central](https://maven-badges.herokuapp.com/maven-central/com.emergetools.snapshots/snapshots-processor/badge.svg)](https://maven-badges.herokuapp.com/maven-central/com.emergetools.snapshots/snapshots) | N/A     |

## Emerge Gradle Plugin

The Emerge Gradle Plugin provides many helper tasks and functionality for integrating Emerge into
your Android project.

See [gradle-plugin](./gradle-plugin/README.md) for more information.

## 🏎 Performance

Emerge offers tooling for performance testing custom startup and UI tests.

Emerge tests on real, physical devices and handles variance control, statistical measurements and
more to ensure you get 99% accurate performance measurements.

See [performance](./performance/README.md) for full documentation.

## 🛰 Snapshots

**⚠️ Emerge snapshots are currently in beta and are subject to changes.**

Emerge offers tooling to snapshot your Android UI components, including Compose previews, activities
and legacy views.

Emerge handles the heavy lifting of generating, diffing and hosting the snapshots for each build,
allowing you to focus on building beautiful UI components.

See [snapshots](./snapshots/README.md) for full documentation.
