# Performance Changelog

All notable changes to this project will be documented in this file.

The format is based on [Keep a Changelog](https://keepachangelog.com/en/1.0.0/),
and this project adheres to [Semantic Versioning](https://semver.org/spec/v2.0.0.html).

## 2.1.0 - 2023-09-08

### Added

- Now detects spans as part of the local perf testing run, allowing debugging of span presence and
  length. [#65](https://github.com/EmergeTools/emerge-android/pull/65)

## 2.0.0 - 2023-08-30

### Added

- `@EmergeStartupTest` for custom startup scenarios.

### Changed

- Emerge's test runner is now directly part of SDK, breaking compatibility with 1.0.0 performance
  tests. There should be no breaking changes to existing tests.

## 1.0.0 - 2022-12-19

### Added

- Initial release
