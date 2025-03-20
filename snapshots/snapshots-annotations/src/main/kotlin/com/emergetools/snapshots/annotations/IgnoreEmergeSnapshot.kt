package com.emergetools.snapshots.annotations

/**
 * Specifies the annotated function is a Preview that should be ignored by Emerge snapshotting.
 */
@Deprecated("Use @EmergeSnapshotConfig with `ignore = true`")
@Target(AnnotationTarget.FUNCTION)
annotation class IgnoreEmergeSnapshot
