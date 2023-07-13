# Emerge Snapshots Changelog

All notable changes to snapshots & snapshots-processor will be documented in this file.

The format is based on [Keep a Changelog](https://keepachangelog.com/en/1.0.0/),
and this project adheres to [Semantic Versioning](https://semver.org/spec/v2.0.0.html).

## 0.5.2 - 2023-07-12

### Changed

- [Processor] Skip private Preview composable test generation as Kotlin compilation will fail and we
  don't support private previews yet. ()[]

## 0.5.1 - 2023-07-12

### Fixed

- Remove usage of shared library to prevent dependency resolution issues as we didn't intend to
  publish the shared code and
  shadowJar/fatAAR. [#26](https://github.com/EmergeTools/emerge-android/pull/26)

## 0.5.0 - 2023-07-11

### Added

- [Processor] Add support for generating `@Preview` snapshots from main
  source set. [#20](https://github.com/EmergeTools/emerge-android/pull/20)

