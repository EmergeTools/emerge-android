-repackageclasses com.emergetools.snapshots

-keep class androidx.compose.runtime.Composable
-keepclassmembers class * {
    @androidx.compose.runtime.Composable *;
}

-keep class com.emergetools.snapshots.** { *; }

-dontwarn java.lang.invoke.**
