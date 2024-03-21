package com.emergetools.snapshots

import android.app.Activity
import android.view.View
import androidx.compose.ui.graphics.asAndroidBitmap
import androidx.compose.ui.test.captureToImage
import androidx.compose.ui.test.junit4.ComposeTestRule
import androidx.compose.ui.test.onRoot
import androidx.test.runner.screenshot.Screenshot
import com.emergetools.snapshots.shared.ComposePreviewSnapshotConfig
import org.junit.rules.TestRule
import org.junit.runner.Description
import org.junit.runners.model.Statement

class EmergeSnapshots : TestRule {

  private lateinit var fqn: String

  override fun apply(
    base: Statement,
    description: Description,
  ): Statement {
    fqn = "${description.className}.${description.methodName}"
    return base
  }

  fun take(
    name: String,
    view: View,
  ) = SnapshotSaver.save(
    displayName = name,
    bitmap = Screenshot.capture(view).bitmap,
    fqn = fqn,
    type = SnapshotType.VIEW,
  )

  fun take(
    name: String,
    activity: Activity,
  ) = SnapshotSaver.save(
    displayName = name,
    bitmap = Screenshot.capture(activity).bitmap,
    fqn = fqn,
    type = SnapshotType.ACTIVITY,
  )

  fun take(
    composeTestRule: ComposeTestRule,
    composePreviewSnapshotConfig: ComposePreviewSnapshotConfig,
  ) {
    composeTestRule.waitForIdle()
    composeTestRule.mainClock.autoAdvance = false
    SnapshotSaver.save(
      // DisplayName not used for composables
      displayName = null,
      bitmap = composeTestRule.onRoot().captureToImage().asAndroidBitmap(),
      fqn = fqn,
      type = SnapshotType.COMPOSABLE,
      composePreviewSnapshotConfig = composePreviewSnapshotConfig,
    )
  }
}
