@file:Suppress("MatchingDeclarationName")

package com.emergetools.reaper.sample.stress.screen

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import kotlinx.serialization.Serializable

@Serializable
object StoryList

val mockStories = listOf(
  Story(
    title = "Story 1",
    author = "Author 1",
    subtitle = "Subtitle 1"
  ),
  Story(
    title = "Story 2",
    author = "Author 2",
    subtitle = "Subtitle 2"
  ),
  Story(
    title = "Story 3",
    author = "Author 3",
    subtitle = "Subtitle 3"
  ),
  Story(
    title = "Story 4",
    author = "Author 4",
    subtitle = "Subtitle 4"
  ),
)

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun StoryListScreen(
  title: String,
  navController: NavController,
) {
  Scaffold(
    topBar = {
      TopAppBar(
        title = { Text(title) }
      )
    },
  ) { contentPadding ->
    LazyColumn(
      modifier = Modifier.padding(contentPadding),
    ) {
      items(mockStories) { story ->
        StoryItem(
          story = story,
          onClick = navController::navigate
        )
      }
    }
  }
}

@Composable
fun StoryItem(
  story: Story,
  onClick: (Story) -> Unit,
) {
  Row(
    modifier = Modifier
      .clickable {
        onClick(story)
      },
  ) {
    Column(
      modifier = Modifier
        .padding(8.dp)
        .fillMaxWidth()
        .padding(8.dp),
    ) {
      Text(text = story.title, style = MaterialTheme.typography.titleSmall)
      Spacer(modifier = Modifier.height(4.dp))
      Text(text = story.author, style = MaterialTheme.typography.bodySmall)
    }
  }
}
