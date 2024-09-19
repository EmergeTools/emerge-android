package com.emergetools.reaper.sample.stress

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.toRoute
import com.emergetools.reaper.sample.stress.numbers.Number0
import com.emergetools.reaper.sample.stress.numbers.Number19
import com.emergetools.reaper.sample.stress.numbers.Number9999
import com.emergetools.reaper.sample.stress.screen.Story
import com.emergetools.reaper.sample.stress.screen.StoryDetailScreen
import com.emergetools.reaper.sample.stress.screen.StoryList
import com.emergetools.reaper.sample.stress.screen.StoryListScreen

class MainActivity : ComponentActivity() {
  public override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)

    val a = Number19()
    val b = Number9999()
    val title = "fib(${a.value()}) = ${a.fib()}, sumTo(0, ${b.value()}) = ${Number0().sumTo(b)}"

    setContent {
      val navController = rememberNavController()

      NavHost(
        navController = navController,
        startDestination = StoryList,
      ) {
        composable<StoryList> {
          StoryListScreen(
            title = title,
            navController = navController,
          )
        }
        composable<Story> { backStackEntry ->
          val story: Story = backStackEntry.toRoute()
          StoryDetailScreen(
            story = story,
            navController = navController,
          )
        }
      }
    }
  }
}
