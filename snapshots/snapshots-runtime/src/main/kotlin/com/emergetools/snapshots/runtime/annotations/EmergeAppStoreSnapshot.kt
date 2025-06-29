package com.emergetools.snapshots.runtime.annotations

/**
 * Specifies the annotated function is a Preview that should be used for app store screenshots.
 */
@Target(AnnotationTarget.FUNCTION, AnnotationTarget.CLASS)
@RequiresOptIn(
  level = RequiresOptIn.Level.WARNING,
  message = "This API is experimental and actively being worked on."
)
annotation class EmergeAppStoreSnapshot
