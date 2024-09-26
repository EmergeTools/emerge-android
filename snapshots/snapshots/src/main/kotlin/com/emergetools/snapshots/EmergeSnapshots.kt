package com.emergetools.snapshots

import android.graphics.Bitmap
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
    bitmap: Bitmap,
    composePreviewSnapshotConfig: ComposePreviewSnapshotConfig,
  ) {
    SnapshotSaver.save(
      // DisplayName not used for composables
      displayName = null,
      bitmap = bitmap,
      fqn = fqn,
      composePreviewSnapshotConfig = composePreviewSnapshotConfig,
    )
  }

  internal fun saveError(
    errorType: SnapshotErrorType,
    composePreviewSnapshotConfig: ComposePreviewSnapshotConfig,
  ) {
    SnapshotSaver.saveError(
      displayName = null,
      fqn = fqn,
      errorType = errorType,
      composePreviewSnapshotConfig = composePreviewSnapshotConfig,
    )
  }
}
