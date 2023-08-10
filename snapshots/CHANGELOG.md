# Emerge Snapshots Changelog

All notable changes to snapshots & snapshots-processor will be documented in this file.

The format is based on [Keep a Changelog](https://keepachangelog.com/en/1.0.0/),
and this project adheres to [Semantic Versioning](https://semver.org/spec/v2.0.0.html).

## 0.7.2 - 2023-08-10

### Added

- Adds `snapshots-annotations` module with annotations intended to be used where `@Preview`
  annotations are used.  [#46](https://github.com/EmergeTools/emerge-android/pull/46)
- Adds `@IgnoreEmergeSnapshot` annotation which will prevent `snapshots-processor` from generating a
  snapshot test. [#46](https://github.com/EmergeTools/emerge-android/pull/46)
- Add support to `snapshots-processor` to handle `@IgnoreEmergeSnapshot`
  annotation. [#46](https://github.com/EmergeTools/emerge-android/pull/46)

## 0.7.1 - 2023-07-26

### Added

- Shared `snapshots-shared` module with separate deploy for sharing code/usage from Emerge's
  backend.  [#40](https://github.com/EmergeTools/emerge-android/pull/40)

## 0.7.0 - 2023-07-21

### Changed

- Composable FQN support. [#37](https://github.com/EmergeTools/emerge-android/pull/37)
- Composable keyname changes (will break
  comparisons) [#38](https://github.com/EmergeTools/emerge-android/pull/38)
- DisplayName changes for compose
  tests  [#38](https://github.com/EmergeTools/emerge-android/pull/38)
- Compose test generation to support
  above.  [#38](https://github.com/EmergeTools/emerge-android/pull/38)

## 0.6.0 - 2023-07-19

### Changed

- [Snapshots] Support minSdk 23. [#35](https://github.com/EmergeTools/emerge-android/pull/35)

## 0.5.2 - 2023-07-12

### Changed

- [Processor] Skip private Preview composable test generation as Kotlin compilation will fail and we
  don't support private previews yet. [#30](https://github.com/EmergeTools/emerge-android/pull/30)

## 0.5.1 - 2023-07-12

### Fixed

- Remove usage of shared library to prevent dependency resolution issues as we didn't intend to
  publish the shared code and
  shadowJar/fatAAR. [#26](https://github.com/EmergeTools/emerge-android/pull/26)

## 0.5.0 - 2023-07-11

### Added

- [Processor] Add support for generating `@Preview` snapshots from main
  source set. [#20](https://github.com/EmergeTools/emerge-android/pull/20)

