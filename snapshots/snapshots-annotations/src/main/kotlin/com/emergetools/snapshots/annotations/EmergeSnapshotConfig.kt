package com.emergetools.snapshots.annotations

/**
 * Emerge-specific snapshot configuration options for the annotated Preview.
 */
@Target(AnnotationTarget.FUNCTION)
annotation class EmergeSnapshotConfig(
  /**
   * The precision level for the snapshot comparison, with lower values allowing for more
   * room for visual difference.
   */
  val precision: Float = 1f,
  /**
   * Ignore this snapshot entirely.
   */
  val ignore: Boolean = false,
)
