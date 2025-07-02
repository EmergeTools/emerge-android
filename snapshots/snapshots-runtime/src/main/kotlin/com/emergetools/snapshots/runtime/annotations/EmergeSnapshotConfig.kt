// Intentionally not `runtime` package to be backwards compatible with
// snapshots-annotation legacy dependency
package com.emergetools.snapshots.annotations

import androidx.annotation.FloatRange

/**
 * Emerge-specific snapshot configuration options for the annotated Preview.
 */
@Target(AnnotationTarget.FUNCTION)
annotation class EmergeSnapshotConfig(
  /**
   * The precision level for the snapshot comparison, with lower values allowing for more
   * room for visual difference.
   */
  @FloatRange(from = 0.01, to = 1.0)
  val precision: Float = 1f,
  /**
   * Ignore this snapshot entirely.
   */
  val ignore: Boolean = false,
)
