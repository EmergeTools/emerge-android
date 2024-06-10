package com.emergetools.snapshots

import android.app.Activity
import android.content.res.Resources
import android.graphics.Bitmap
import android.graphics.Canvas
import android.view.View
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.asAndroidBitmap
import androidx.compose.ui.test.captureToImage
import androidx.compose.ui.test.junit4.ComposeTestRule
import androidx.compose.ui.test.onRoot
import androidx.compose.ui.unit.Constraints
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
    bitmap: Bitmap,
    composePreviewSnapshotConfig: ComposePreviewSnapshotConfig
  ) {
    SnapshotSaver.save(
      // DisplayName not used for composables
      displayName = null,
      bitmap = bitmap,
      fqn = fqn,
      type = SnapshotType.COMPOSABLE,
      composePreviewSnapshotConfig = composePreviewSnapshotConfig,
    )
  }

  internal fun saveError(
    type: SnapshotType,
    composePreviewSnapshotConfig: ComposePreviewSnapshotConfig? = null,
  ) {
    SnapshotSaver.saveError(
      displayName = null,
      fqn = fqn,
      type = type,
      composePreviewSnapshotConfig = composePreviewSnapshotConfig,
    )
  }
}
