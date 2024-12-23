package com.emergetools.snapshots.rules

import androidx.compose.ui.tooling.PreviewActivity
import androidx.test.core.app.ActivityScenario
import org.junit.rules.ExternalResource

class EmergeActivityScenarioRule : ExternalResource() {
  lateinit var scenario: ActivityScenario<PreviewActivity>

  override fun before() {
    super.before()
    scenario = ActivityScenario.launch(PreviewActivity::class.java)
  }

  // Explicitly skip the after() method to avoid closing the activity
}
