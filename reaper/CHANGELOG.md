# Emerge Reaper Changelog

All notable changes to reaper will be documented in this file.

The format is based on [Keep a Changelog](https://keepachangelog.com/en/1.0.0/),
and this project adheres to [Semantic Versioning](https://semver.org/spec/v2.0.0.html).

## [Unreleased]

- Fixed a bug that prevented the number of pending reports from being limited. [#260](https://github.com/EmergeTools/emerge-android/pull/260)
- Changed initialization and flushing to move much of the work off the
  startup path and onto a dedicated background thread. [#259](https://github.com/EmergeTools/emerge-android/pull/259)

## 1.0.0-rc01 - 2024-08-09

- Remove fatal exit if `publishableApiKey` is not set. [#232](https://github.com/EmergeTools/emerge-android/pull/232)
- Add debug mode. [#215](https://github.com/EmergeTools/emerge-android/pull/215)

## 1.0.0-beta03 - 2024-07-31

- Strips newline from reports. [#214](https://github.com/EmergeTools/emerge-android/pull/214)

## 1.0.0-beta02 - 2024-07-24

- Add `@JvmStatic` so Reaper instrumentation can use invoke-static rather than invoke-virtual. [#199](https://github.com/EmergeTools/emerge-android/pull/199)
- Lower minSdk to 21. [#198](https://github.com/EmergeTools/emerge-android/pull/198)
- Handle 404 response to not report Reaper error. [#196](https://github.com/EmergeTools/emerge-android/pull/196)

## 1.0.0-beta01 - 2024-07-10

- Initial public release of Reaper for Android.
