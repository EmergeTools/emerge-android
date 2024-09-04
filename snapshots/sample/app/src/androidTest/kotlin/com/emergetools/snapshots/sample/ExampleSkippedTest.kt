package com.emergetools.snapshots.sample

import android.util.Log
import androidx.test.ext.junit.rules.ActivityScenarioRule
import androidx.test.ext.junit.runners.AndroidJUnit4
import com.emergetools.snapshots.EmergeSnapshots
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
class ExampleSkippedTest {

  @get:Rule
  val activityScenarioRule = ActivityScenarioRule(MainActivity::class.java)

  @Test
  fun basicActivityView() {
    val scenario = activityScenarioRule.scenario
    scenario.onActivity {
      Log.d("ExampleSkippedTest", "basicActivityView")
    }
  }
}
