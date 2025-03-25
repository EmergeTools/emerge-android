# Emerge Snapshots Changelog

All notable changes to snapshots & snapshots-processor will be documented in this file.

The format is based on [Keep a Changelog](https://keepachangelog.com/en/1.0.0/),
and this project adheres to [Semantic Versioning](https://semver.org/spec/v2.0.0.html).

## Unreleased

## 1.4.0 - 2025-03-25

- Remove `snapshots-shared`
  module/dependency. [#550](https://github.com/EmergeTools/emerge-android/pull/550)
- Add `@EmergeSnapshotConfig` annotation for setting `ignore` and
  `precision`. [#538](https://github.com/EmergeTools/emerge-android/pull/538)
- Deprecate `@IgnoreEmergeSnapshot` in favor of
  `@EmergeSnapshotConfig`. [#538](https://github.com/EmergeTools/emerge-android/pull/538)
- Support existing `ComposeSnapshots` json and `List<ComposePreviewSnapshotConfig>` json for local
  invoking. [#533](https://github.com/EmergeTools/emerge-android/pull/533)

## 1.3.3 - 2025-02-19

- Fix RTL language layout direction. [#460](https://github.com/EmergeTools/emerge-android/pull/460)

## 1.3.2 - 2025-01-27

- Add support for Wear devices. [#431](https://github.com/EmergeTools/emerge-android/pull/431)

## 1.3.1 - 2025-01-09

- Add default exception handler to catch exceptions that could take down instrumentation
  process. [#324](https://github.com/EmergeTools/emerge-android/pull/324)

## 1.3.0 - 2024-12-13

> [!IMPORTANT]
> Note: Existing previews with custom `device` specs will have expected diffs.
> 1.3.0 fixes an issue where `device` specs did not produce expected dimensions.
> Emerge recommends merging the 1.3 update and rebasing PRs with unexpected diffs onto the main base
> commit with 1.3.
> All future diffs should be stable once rebased!

1.3.0 brings big improvements, notably:

- Tests are now siloed, using AndroidTestOrchestrator. This means crashing tests no longer can bring
  other tests down too.
- Previews with `device` parameters are now 1:1 with their exact dimensions.
- `@PreviewParameter` annotated params are now supported and will generate a unique snapshot for
  each.

## 1.3.0-rc03 - 2024-11-06

- Lower compose-bom to 1.6.8 to avoid breaking change in
  1.7.0. [#301](https://github.com/EmergeTools/emerge-android/pull/301)
- Use compose compiler gradle plugin. [#300](https://github.com/EmergeTools/emerge-android/pull/300)

## 1.3.0-rc02 - 2024-10-25

- Bug fixes for PreviewParameters with nested types (i.e. `List<*>`) and
  primitives. [#290](https://github.com/EmergeTools/emerge-android/pull/290)
- Bug fixes for reflective invoking. [#296](https://github.com/EmergeTools/emerge-android/pull/296)

## 1.3.0-rc01 - 2024-10-22

- Support `@PreviewParameter` annotated
  params. [#271](https://github.com/EmergeTools/emerge-android/pull/271)
- Remove whitespace from parameterized test names to support
  orchestrator. [#267](https://github.com/EmergeTools/emerge-android/pull/267)
- Fix bugs that blocked use of Android test
  orchestrator. [#273](https://github.com/EmergeTools/emerge-android/pull/273)
- Remove unused runners. [#275](https://github.com/EmergeTools/emerge-android/pull/275)
- Fix device specs. [#285](https://github.com/EmergeTools/emerge-android/pull/285)
- Remove manual activity & view
  snapshotting. [#265](https://github.com/EmergeTools/emerge-android/pull/265)

## 1.3.0-beta01 - 2024-09-04

- Remove skipping logic and ignore a test entirely if not a snapshot
  test. [#253](https://github.com/EmergeTools/emerge-android/pull/253)
- Fix custom device specs. [#243](https://github.com/EmergeTools/emerge-android/pull/243)
- Add apiLevel & wallpaper params to key to ensure we don't clobber other
  previews. [#241](https://github.com/EmergeTools/emerge-android/pull/241)
- Don't hard error on file already
  existing. [#235](https://github.com/EmergeTools/emerge-android/pull/235)

## 1.2.0 - 2024-07-31

Note: Existing previews with `device` parameters will have expected diffs. 1.2.0 fixes an issue
where `device` dimensions did not match expected dimensions. Emerge recommends merging the 1.2
update and rebasing PRs with unexpected diffs onto the main base commit with 1.2.

- Temporarily remove support
  for `showSystemUi`. [#212](https://github.com/EmergeTools/emerge-android/pull/212)
- Add support for reporting snapshot error
  types. [#207](https://github.com/EmergeTools/emerge-android/pull/207)
- Add `isAppstoreSnapshot` to config. [#210](https://github.com/EmergeTools/emerge-android/pull/210)
- Fix `device` dimensions. [#206](https://github.com/EmergeTools/emerge-android/pull/206)

## 1.1.4 - 2024-07-23

- Add experimental `EmergeAppStoreSnapshot`
  annotation. [#193](https://github.com/EmergeTools/emerge-android/pull/193)

## 1.1.3 - 2024-07-10

- Support `device` Preview annotation parameter in local
  snapshotting. [#183](https://github.com/EmergeTools/emerge-android/pull/183)

## 1.1.2 - 2024-06-27

- Use `PreviewActivity`
  over `ComponentActivity`. [#178](https://github.com/EmergeTools/emerge-android/pull/178)
- Force target app to be debuggable. [#179](https://github.com/EmergeTools/emerge-android/pull/179)

## 1.1.1 - 2024-06-24

- Fix bug when snapshotting empty 0x0
  previews. [#173](https://github.com/EmergeTools/emerge-android/pull/173)

## 1.1.0 - 2024-06-13

❗Note: This release removes a default white background previous versions of Emerge snapshots
includes. This is to bring parity with default AS preview behavior. We recommend updating snapshots
to 1.1 as part of a single PR and rebasing changes to avoid unexpected diffs.

- Support `heightDp`, `widthDp`, `showBackground`, `backgroundColor` preview annotation
  parameters. [#167](https://github.com/EmergeTools/emerge-android/pull/167)
- Support `showSystemUi` preview annotation
  parameter. [#169](https://github.com/EmergeTools/emerge-android/pull/169)

## 1.0.0 - 2024-05-29

- Adds support for better compose preview error
  reporting. [#155](https://github.com/EmergeTools/emerge-android/pull/155)
- Adds support for direct compose preview invoking without needing
  KSP. [#123](https://github.com/EmergeTools/emerge-android/pull/123)
- Handle snapshotting private previews and improve parameterized test
  naming [#165](https://github.com/EmergeTools/emerge-android/pull/165)
- Update readme for 1.0.0 release. [#163](https://github.com/EmergeTools/emerge-android/pull/163)

## 1.0.0-rc02 - 2024-05-24

- Adds support for better compose preview error
  reporting. [#155](https://github.com/EmergeTools/emerge-android/pull/155)

## 1.0.0-rc01 - 2024-05-23

- Adds support for direct compose preview invoking without needing
  KSP. [#123](https://github.com/EmergeTools/emerge-android/pull/123)

## 0.8.5 - 2023-11-13

### Added

- Language support for Kotlin 1.7 . [#112](https://github.com/EmergeTools/emerge-android/pull/112)

## 0.8.4 - 2023-11-03

### Fixed

- Fix dark mode issues. [#105](https://github.com/EmergeTools/emerge-android/pull/105)

### Changed

- API dependency compose dependencies [#108](https://github.com/EmergeTools/emerge-android/pull/109)
- Use LocalInspectionMode. [#107](https://github.com/EmergeTools/emerge-android/pull/107)

## 0.8.3 - 2023-10-27

### Fixed

- Provide result registry for
  CompositionLocal. [#98](https://github.com/EmergeTools/emerge-android/pull/98)
- Add api dependencies
  for `androidx.activity` &
  `androidx.test.runner`. [#99](https://github.com/EmergeTools/emerge-android/pull/99)
- Add additional logging to snapshots. [#97](https://github.com/EmergeTools/emerge-android/pull/97)
- API dep for `androidx.test.rules`. [#100](https://github.com/EmergeTools/emerge-android/pull/100)

### Changed

- API dependency for
  androidx.activity & . [#93](https://github.com/EmergeTools/emerge-android/pull/93)
- Gate internal previews with KSP argument from Gradle
  plugin [#92](https://github.com/EmergeTools/emerge-android/pull/92)

## 0.8.2 - 2023-10-19

### Added

- Additional debug logging. [#93](https://github.com/EmergeTools/emerge-android/pull/93)
- Gate internal previews with KSP argument from Gradle
  plugin [#92](https://github.com/EmergeTools/emerge-android/pull/92)

## 0.8.1 - 2023-09-28

### Added

- Multipreview support from multipreviews that live in
  submodules. [#69](https://github.com/EmergeTools/emerge-android/pull/69)
- Stacked multipreview support. [#71](https://github.com/EmergeTools/emerge-android/pull/71)

### Fixed

- Bug in locale varaints not reflecting locale due to resources not
  updating. [#70](https://github.com/EmergeTools/emerge-android/pull/70)

## 0.8.0 - 2023-08-31

### Added

- Multipreview support. [#56](https://github.com/EmergeTools/emerge-android/pull/56)

### Changed

- Adds numerous tests for KSP
  processor. [#55](https://github.com/EmergeTools/emerge-android/pull/55)

## 0.7.3 - 2023-08-22

### Changed

- Updates to Kotlin `1.9.0`, KSP `1.9.0-1.0.13` and compose compiler
  extension `1.5.1` [#51](https://github.com/EmergeTools/emerge-android/pull/51).

### Fixed

- Fixes bug where code generated by other KSP plugins would also be copied to Emerge's test build
  directory. [#50](https://github.com/EmergeTools/emerge-android/pull/50)

## 0.7.2 - 2023-08-10

### Added

- Adds `snapshots-annotations` module with annotations intended to be used where `@Preview`
  annotations are used. [#46](https://github.com/EmergeTools/emerge-android/pull/46)
- Adds `@IgnoreEmergeSnapshot` annotation which will prevent `snapshots-processor` from generating a
  snapshot test. [#46](https://github.com/EmergeTools/emerge-android/pull/46)
- Add support to `snapshots-processor` to handle `@IgnoreEmergeSnapshot`
  annotation. [#46](https://github.com/EmergeTools/emerge-android/pull/46)

## 0.7.1 - 2023-07-26

### Added

- Shared `snapshots-shared` module with separate deploy for sharing code/usage from Emerge's
  backend. [#40](https://github.com/EmergeTools/emerge-android/pull/40)

## 0.7.0 - 2023-07-21

### Changed

- Composable FQN support. [#37](https://github.com/EmergeTools/emerge-android/pull/37)
- Composable keyname changes (will break
  comparisons) [#38](https://github.com/EmergeTools/emerge-android/pull/38)
- DisplayName changes for compose
  tests. [#38](https://github.com/EmergeTools/emerge-android/pull/38)
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

