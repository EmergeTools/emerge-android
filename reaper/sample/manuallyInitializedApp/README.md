# Manually initializing Reaper

By default Reaper is initialized automatically as shown in the
`reaper/sample/app` example. However if finer control over
initialization is required then Reaper can be manually initialized
instead. This is demonstrated in this sample app.

Two changes are required compared to `reaper/sample/app`.
1. Update [AndroidManifest.xml](./src/main/AndroidManifest.xml) to remove
  `com.emergetools.reaper.ReaperInitializer` from `androidx.startup.InitializationProvider`.
2. Update [MainActivity.kt](./src/main/kotlin/com/emergetools/reaper/sample/manuallyInitialized/MainActivity.kt) to call `Reaper.init(context)`.

For more detail see
[Disable automatic initialization](https://docs.emergetools.com/docs/reaper-setup-android#disable-automatic-initialization)
and
[Manual initialization](https://docs.emergetools.com/docs/reaper-setup-android#manual-initialization).
