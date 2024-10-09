package com.emergetools.distribution.sample

import android.app.Activity
import android.os.Bundle
import android.widget.TextView
import androidx.activity.ComponentActivity
import androidx.navigation.compose.rememberNavController

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
