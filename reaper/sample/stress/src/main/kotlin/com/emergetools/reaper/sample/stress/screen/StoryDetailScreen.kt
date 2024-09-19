@file:Suppress("MatchingDeclarationName")

package com.emergetools.reaper.sample.stress.screen

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
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
data class Story(
  val title: String,
  val author: String,
  val subtitle: String?,
)

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun StoryDetailScreen(
  story: Story,
  navController: NavController,
) {
  Scaffold(
    topBar = {
      TopAppBar(
        navigationIcon = {
          IconButton(
            onClick = { navController.popBackStack() }
          ) {
            Icon(
              imageVector = Icons.Default.ArrowBack,
              contentDescription = "Back",
            )
          }
        },
        title = {}
      )
    },
  ) { contentPadding ->
    Column(
      modifier = Modifier
        .padding(contentPadding)
        .padding(horizontal = 16.dp),
    ) {
      Text(
        text = "${story.title} detail",
        style = MaterialTheme.typography.displayLarge,
      )
      story.subtitle?.let {
        Spacer(modifier = Modifier.height(8.dp))
        Text(
          text = it,
        )
      }
    }
  }
}
