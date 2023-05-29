package com.emergetools.snapshots.sample.ui

import androidx.test.ext.junit.rules.ActivityScenarioRule
import androidx.test.ext.junit.runners.AndroidJUnit4
import com.emergetools.snapshots.sample.MainActivity
import com.emergetools.snapshots.EmergeSnapshots
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
class ExampleMainActivityTest {

  @get:Rule
  val activityScenarioRule = ActivityScenarioRule(MainActivity::class.java)

  @get:Rule
  val snapshots = EmergeSnapshots()

  @Test
  fun basicActivityView() {
    val scenario = activityScenarioRule.scenario
    scenario.onActivity {
      snapshots.take("Main Activity", it)
    }
  }
}
