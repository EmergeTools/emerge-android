# Emerge Android

Emerge Android SDK & tooling.

## Getting started

Emerge offers a suite of products to help optimize app size, performance and quality. This
repository contains all publicly available Emerge Android products and integrations.

### Artifacts

| Artifact                                        | Description                                                     | Latest                                                                                                                                                                                                             | Min SDK |
|-------------------------------------------------|-----------------------------------------------------------------|--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|---------|
| `com.emergetools.android`                       | Emerge Gradle Plugin                                            | 2.0.0-beta01                                                                                                                                                                                                       | N/A     |
| `com.emergetools.snapshots:snapshots`           | Snapshot testing SDK                                            | [![Maven Central](https://maven-badges.herokuapp.com/maven-central/com.emergetools.snapshots/snapshots/badge.svg)](https://maven-badges.herokuapp.com/maven-central/com.emergetools.snapshots/snapshots)           | 26      |
| `com.emergetools.snapshots:snapshots-processor` | Snapshot KSP processor for generating Composable snapshot tests | [![Maven Central](https://maven-badges.herokuapp.com/maven-central/com.emergetools.snapshots/snapshots-processor/badge.svg)](https://maven-badges.herokuapp.com/maven-central/com.emergetools.snapshots/snapshots) | N/A     |

## Emerge Gradle Plugin

The Emerge Gradle Plugin provides many helper tasks and functionality for integrating Emerge into
your Android project.

See [gradle-plugin](./gradle-plugin/README.md) for more information.

## Snapshots

**⚠️ Emerge snapshots are currently in beta and is subject changes.**

Emerge offers tooling to snapshot your Android UI components, including Compose previews, activities
and legacy views.

Emerge handles the heavy lifting of snapshotting, diffing and hosting the snapshots for each build,
allowing you to focus on building beautiful UI components.

See [snapshots](./snapshots/README.md) for more information.
