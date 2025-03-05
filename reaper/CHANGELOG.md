# Emerge Reaper Changelog

All notable changes to reaper will be documented in this file.

The format is based on [Keep a Changelog](https://keepachangelog.com/en/1.0.0/),
and this project adheres to [Semantic Versioning](https://semver.org/spec/v2.0.0.html).

## 1.0.1 - 2025-03-05

- Add `Reaper.fuseOff()`. [#491](https://github.com/EmergeTools/emerge-android/pull/491)

## 1.0.0 - 2024-12-02

- Initial release.
- Update API endpoint from https://api.emergetools.com to https://reaper.emergetools.com
    both endpoints will continue to accept reports. [#316](https://github.com/EmergeTools/emerge-android/pull/316)

## 1.0.0-rc03 - 2024-09-24

- Fix crash with missing OkHttp util when using non-4x
  versions. [#289](https://github.com/EmergeTools/emerge-android/pull/289)
- Add option to use existing
  OkHttpClient. [#270](https://github.com/EmergeTools/emerge-android/pull/272)
- Add option to control log level. [#269](https://github.com/EmergeTools/emerge-android/pull/269)

## 1.0.0-rc02 - 2024-09-18

- Handle I/O errors (I/O crash fix). [#262](https://github.com/EmergeTools/emerge-android/pull/262)
- Split Reaper business logic from
  I/O. [#261](https://github.com/EmergeTools/emerge-android/pull/261)
- Fix typo that prevented limiting pending
  reports. [#260](https://github.com/EmergeTools/emerge-android/pull/260)
- Move most work off main thread (ANR
  fix). [#259](https://github.com/EmergeTools/emerge-android/pull/259)
- Remove unnecessary manifest
  properties. [#257](https://github.com/EmergeTools/emerge-android/pull/257)
- Pass `onFlush` directly to `flush`. [#258](https://github.com/EmergeTools/emerge-android/pull/258)

## 1.0.0-rc01 - 2024-08-09

- Remove fatal exit if `publishableApiKey` is not
  set. [#232](https://github.com/EmergeTools/emerge-android/pull/232)
- Add debug mode. [#215](https://github.com/EmergeTools/emerge-android/pull/215)

## 1.0.0-beta03 - 2024-07-31

- Strips newline from reports. [#214](https://github.com/EmergeTools/emerge-android/pull/214)

## 1.0.0-beta02 - 2024-07-24

- Add `@JvmStatic` so Reaper instrumentation can use invoke-static rather than
  invoke-virtual. [#199](https://github.com/EmergeTools/emerge-android/pull/199)
- Lower minSdk to 21. [#198](https://github.com/EmergeTools/emerge-android/pull/198)
- Handle 404 response to not report Reaper
  error. [#196](https://github.com/EmergeTools/emerge-android/pull/196)

## 1.0.0-beta01 - 2024-07-10

- Initial public release of Reaper for Android.
