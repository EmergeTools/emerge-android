# Emerge Gradle Plugin Changelog

All notable changes to this project will be documented in this file.

The format is based on [Keep a Changelog](https://keepachangelog.com/en/1.0.0/),
and this project adheres to [Semantic Versioning](https://semver.org/spec/v2.0.0.html).

## 2.2.0 - 2024-02-22

- Uses `tag` in favor of deprecated `buildType` field. [#118](https://github.com/EmergeTools/emerge-android/pull/118)
- Updates the generated snapshot URL. [#119](https://github.com/EmergeTools/emerge-android/pull/119)

## 2.1.6 - 2023-11-13

- Fix for Git configuration cache issues. [#52](https://github.com/EmergeTools/emerge-android/pull/52)

## 2.1.5 - 2023-11-03

- Add `apiVersion` param for
  snapshots. [#109](https://github.com/EmergeTools/emerge-android/pull/109)

## 2.1.4 - 2023-10-19

- Additional debug logging. [#94](https://github.com/EmergeTools/emerge-android/pull/94)
- Add new `snapshots.experimentalInternalSnapshotsEnabled` property for generating snapshots from
  internal Preview functions. [#92](https://github.com/EmergeTools/emerge-android/pull/92)

## 2.1.3 - 2023-10-09

### Added

- Additional debug logging. [#83](https://github.com/EmergeTools/emerge-android/pull/83)

## 2.1.2 - 2023-10-09

### Added

- Additional debug logging. [#80](https://github.com/EmergeTools/emerge-android/pull/80)

## 2.1.1 - 2023-10-06

### Added

- Additional debug logging. [#78](https://github.com/EmergeTools/emerge-android/pull/78)

## 2.1.0 - 2023-10-05

### Changed

- [Breaking] Moves emergeLocal<variant>Test task to app
  module. [#76](https://github.com/EmergeTools/emerge-android/pull/76)
- Updates AGP, Kotlin & KSP versions. [#74](https://github.com/EmergeTools/emerge-android/pull/74)

## 2.0.1 - 2023-09-07

### Fixed

- Issue where baseSha (among other extension properties) would throw an error if Git/GitHub
  fallbacks were not available. [#63](https://github.com/EmergeTools/emerge-android/pull/63)

## 2.0.0 - 2023-08-14

### Added

- Support for outputting upload response info to build
  folder. [#48](https://github.com/EmergeTools/emerge-android/pull/48)

### Fixed

- Configuration cache issue due to not
  using `@Internal` [#44](https://github.com/EmergeTools/emerge-android/pull/44)

## 2.0.0-rc03 - 2023-07-18

### Added

- Support for generating snapshot tests from dependent
  modules. [#32](https://github.com/EmergeTools/emerge-android/pull/32)

## 2.0.0-rc02 - 2023-07-11

### Added

- Support for generating snapshot tests from main
  sourceSet. [#20](https://github.com/EmergeTools/emerge-android/pull/20)
