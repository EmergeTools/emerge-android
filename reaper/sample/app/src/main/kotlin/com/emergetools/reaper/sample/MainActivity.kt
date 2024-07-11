package com.emergetools.reaper.sample

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.toRoute
import com.emergetools.reaper.sample.screen.Story
import com.emergetools.reaper.sample.screen.StoryDetailScreen
import com.emergetools.reaper.sample.screen.StoryList
import com.emergetools.reaper.sample.screen.StoryListScreen

class MainActivity : ComponentActivity() {

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)

    setContent {
      val navController = rememberNavController()

      NavHost(
        navController = navController,
        startDestination = StoryList,
      ) {
        composable<StoryList> {
          StoryListScreen(
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
