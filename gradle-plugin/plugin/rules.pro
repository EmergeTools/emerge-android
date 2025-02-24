#noinspection ShrinkerUnresolvedReference

# Keep kotlin metadata so that the Kotlin compiler knows about top level functions such as
#  Line 1: import com.apollographql.apollo.gradle.api.kotlinMultiplatformExtension
#                                                      ^ Unresolved reference: kotlinMultiplatformExtension
-keep class kotlin.Metadata { *; }
-keep class kotlin.Unit { *; }

# Keep the @RequiresOptIn annotation so we get proper warnings in gradle build files
-keep class kotlin.RequiresOptIn { *; }

# We need to keep type arguments (Signature) for Gradle to be able to instantiate abstract models like `Property`
# Else it fails with
# 'Declaration of property alwaysGenerateTypesMatching does not include any type arguments in its property type interface org.gradle.api.provider.SetProperty'
-keepattributes Signature,InnerClasses,EnclosingMethod
# Similarly, Gradle needs the @Inject annotations
-keepattributes RuntimeVisible*Annotation*
# For debug
-keepattributes SourceFile,LineNumberTable

# kotlinpoet uses EnumSetOf that makes a reflexive access to "values"
# https://github.com/square/kotlinpoet/blob/9952ddcd5095a1fd09c86b9fb07faa347a4c04f0/kotlinpoet/src/main/java/com/squareup/kotlinpoet/PropertySpec.kt#L102
-keepclassmembers class com.squareup.kotlinpoet.KModifier {
    public static **[] values();
}

-dontobfuscate
-repackageclasses com.emergetools.android.gradle

# Keep our public api
-keep class com.emergetools.android.gradle.** { *; }

# The Gradle API jar and other compileOnly dependencies aren't added to the classpath, ignore the missing symbols
# I tried adding them but they duplicate a lot of the program classes and trigger errors in R8.
# A future version could try to remove the intersection between the compileOnly classpath and the runtime one
-dontwarn org.gradle.**
-dontwarn org.jetbrains.kotlin.gradle.**
-dontwarn com.android.build.gradle.**
-dontwarn com.android.builder.**
-dontwarn javax.inject.Inject
-dontwarn kotlin.collections.**
