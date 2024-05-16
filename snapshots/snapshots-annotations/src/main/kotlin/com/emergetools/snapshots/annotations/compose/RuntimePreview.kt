package com.emergetools.snapshots.annotations.compose

/**
 * A copy of the androidx.compose.ui.tooling.preview.Preview annotation, with explicit
 * runtime retention.
 * This is a workaround for https://issuetracker.google.com/issues/168524920 to preserve Preview
 * annotations in dex, as D8 strips BINARY retention annotations from dex.
 */
@Retention(AnnotationRetention.RUNTIME)
@Target(
  AnnotationTarget.ANNOTATION_CLASS,
  AnnotationTarget.FUNCTION
)
@Repeatable
annotation class RuntimePreview(
  val name: String = "",
  val group: String = "",
  val apiLevel: Int = -1,
  val widthDp: Int = -1,
  val heightDp: Int = -1,
  val locale: String = "",
  val fontScale: Float = 1f,
  val showSystemUi: Boolean = false,
  val showBackground: Boolean = false,
  val backgroundColor: Long = 0,
  val uiMode: Int = 0,
  val device: String = "",
  val wallpaper: Int = -1,
)
