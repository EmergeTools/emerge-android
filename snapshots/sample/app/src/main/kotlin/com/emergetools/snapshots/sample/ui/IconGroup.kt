@file:Suppress("MagicNumber")

package com.emergetools.snapshots.sample.ui

import androidx.annotation.IntRange
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.tooling.preview.PreviewParameter
import androidx.compose.ui.tooling.preview.PreviewParameterProvider
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.times
import com.emergetools.snapshots.sample.ui.theme.SnapshotsSampleTheme

private class CompletedWorkoutsDataForPreview : PreviewParameterProvider<Int> {
  override val values: Sequence<Int>
    get() = sequenceOf(1, 2, 3, 4, 5)
}

@Preview(showBackground = true, backgroundColor = 0xFFFFFFFF)
@Composable
fun CompletedIconPilePreview(
  @PreviewParameter(CompletedWorkoutsDataForPreview::class) completedWorkouts: Int,
) {
  SnapshotsSampleTheme {
    IconGroup(
      completedCount = completedWorkouts,
    )
  }
}

@Composable
fun IconGroup(
  @IntRange(from = 1) completedCount: Int,
) {
  // Display up to 9 icons
  val resultCompletedCount = completedCount.coerceAtMost(9)
  val iconSize = 48.dp
  val borderSize = 2.dp
  val boxSize = iconSize + borderSize
  val overlapSize = -1 * 20.dp

  Row(
    verticalAlignment = Alignment.CenterVertically,
    horizontalArrangement = Arrangement.spacedBy(overlapSize),
  ) {
    repeat(resultCompletedCount) {
      Box(
        modifier = Modifier
          .clip(CircleShape)
          .background(Color.Blue)
          .border(borderSize, Color.White, CircleShape)
          .size(boxSize),
        contentAlignment = Alignment.Center,
      ) {
        Icon(
          painter = painterResource(com.emergetools.snapshots.sample.R.drawable.ic_launcher_foreground),
          contentDescription = null,
          modifier = Modifier.size(iconSize),
        )
      }
    }
  }
}
