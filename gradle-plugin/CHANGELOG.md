# Emerge Gradle Plugin Changelog

All notable changes to this project will be documented in this file.

The format is based on [Keep a Changelog](https://keepachangelog.com/en/1.0.0/),
and this project adheres to [Semantic Versioning](https://semver.org/spec/v2.0.0.html).

## 4.0.0-beta03 - 2024-07-30

- Add information for dependency attribution. [#142](https://github.com/EmergeTools/emerge-android/pull/142)
- Add logcat dump to localSnapshots task. [#206](https://github.com/EmergeTools/emerge-android/pull/206)

## 4.0.0-beta02 - 2024-07-24

- Reaper instrumentation to use invoke-static rather than invoke-virtual. [#199](https://github.com/EmergeTools/emerge-android/pull/199)
- Add preflight task for Reaper. [#197](https://github.com/EmergeTools/emerge-android/pull/197)
- Set reaper manifest keys even when not enabled. [#192](https://github.com/EmergeTools/emerge-android/pull/192)

## 4.0.0-beta01 - 2024-07-10

- Add Reaper instrumentation and tasks.

## 3.1.2 - 2024-07-10

- Support `device` Preview annotation parameter in local snapshotting. [#183](https://github.com/EmergeTools/emerge-android/pull/183)

## 3.1.1 - 2024-06-25

- Fix issue where Multipreview templates weren't
  retained. [#176](https://github.com/EmergeTools/emerge-android/pull/176)

## 3.1.0 - 2024-06-13

- Add `includePrivatePreviews` snapshot configuration
  argument. [#168](https://github.com/EmergeTools/emerge-android/pull/168)
- Support `heightDp`, `widthDp`, `showBackground`, `backgroundColor` preview annotation
  parameters. [#167](https://github.com/EmergeTools/emerge-android/pull/167)
- Support `showSystemUi` preview annotation
  parameter. [#169](https://github.com/EmergeTools/emerge-android/pull/169)
- Minor updates to info output. [#170](https://github.com/EmergeTools/emerge-android/pull/170)

## 3.0.0 - 2024-05-29

- Add enabled field to each product configuration
  options. [#158](https://github.com/EmergeTools/emerge-android/pull/158)
- Add unit tests for
  SnapshotsPreviewRuntimeRetentionTransform. [#159](https://github.com/EmergeTools/emerge-android/pull/159)
- Remove plugin KSP setup & make runtime preview transform default
  behavior. [#141](https://github.com/EmergeTools/emerge-android/pull/141)
- Fix issue with ArtifactMetadata
  filename. [#152](https://github.com/EmergeTools/emerge-android/pull/152)
- Adds transform for marking preview annotations as runtime
  retention [#139](https://github.com/EmergeTools/emerge-android/pull/139).
- Adds support for using new snapshot invoking using `LocalSnapshots`
  task [#147](https://github.com/EmergeTools/emerge-android/pull/147).
- Fix configuration cache
  violations. [#143](https://github.com/EmergeTools/emerge-android/pull/143), [#149](https://github.com/EmergeTools/emerge-android/pull/149)
- Consistent build directory [#133](https://github.com/EmergeTools/emerge-android/pull/133)
- Don't skip private previews for `LocalSnapshots`
  task [#164](https://github.com/EmergeTools/emerge-android/pull/164)
- Update readme for 3.0.0 release. [#162](https://github.com/EmergeTools/emerge-android/pull/162)

## 3.0.0-rc03 - 2024-05-24

- Remove plugin KSP setup & make runtime preview transform default
  behavior. [#141](https://github.com/EmergeTools/emerge-android/pull/141)

## 3.0.0-rc02 - 2024-05-23

- Fix issue with ArtifactMetadata
  filename. [#152](https://github.com/EmergeTools/emerge-android/pull/152)

## 3.0.0-rc01 - 2024-05-23

- Adds transform for marking preview annotations as runtime
  retention [#139](https://github.com/EmergeTools/emerge-android/pull/139).
- Adds support for using new snapshot invoking using `LocalSnapshots`
  task [#147](https://github.com/EmergeTools/emerge-android/pull/147).
- Fix configuration cache
  violations. [#143](https://github.com/EmergeTools/emerge-android/pull/143), [#149](https://github.com/EmergeTools/emerge-android/pull/149)
- Consistent build directory [#133](https://github.com/EmergeTools/emerge-android/pull/133)

## 2.2.2 - 2024-04-08

- Add `--class` argument to local snapshots task to allow for specifying specific test
  classes. [#131](https://github.com/EmergeTools/emerge-android/pull/131)

## 2.2.1 - 2024-04-03

- Add `tag.setFromVariant()` helper function to set the tag from the Android build
  variant. [#128](https://github.com/EmergeTools/emerge-android/pull/128)
- Add `gitLab` configration block to match docs & long-term plugin
  plans. [#127](https://github.com/EmergeTools/emerge-android/pull/127)

## 2.2.0 - 2024-02-22

- Uses `tag` in favor of deprecated `buildType`
  field. [#118](https://github.com/EmergeTools/emerge-android/pull/118)
- Set a custom user agent for
  uploads. [#118](https://github.com/EmergeTools/emerge-android/pull/118)
- Updates the generated snapshot URL. [#119](https://github.com/EmergeTools/emerge-android/pull/119)

## 2.1.6 - 2023-11-13

- Fix for Git configuration cache
  issues. [#52](https://github.com/EmergeTools/emerge-android/pull/52)

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
