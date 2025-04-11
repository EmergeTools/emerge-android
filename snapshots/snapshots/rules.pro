#noinspection ShrinkerUnresolvedReference

# Keep kotlin metadata so that the Kotlin compiler knows about top level functions such as
#  Line 1: import com.apollographql.apollo.gradle.api.kotlinMultiplatformExtension
#                                                      ^ Unresolved reference: kotlinMultiplatformExtension
-keep class kotlin.Metadata { *; }
-keep class kotlin.Unit { *; }

# Keep the @RequiresOptIn annotation so we get proper warnings in gradle build files
-keep class kotlin.RequiresOptIn { *; }

-keep class com.emergetools.snapshots.** { *; }
-keep interface com.emergetools.snapshots.** { *; }
-keep class kotlin.jvm.internal.** { *; }
-keep interface kotlin.jvm.internal.** { *; }
-keep class kotlin.reflect.** { *; }
