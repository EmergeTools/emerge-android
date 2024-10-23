package com.emergetools.snapshots.sample.ui

import android.content.res.Configuration
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.tooling.preview.PreviewParameter
import androidx.compose.ui.tooling.preview.PreviewParameterProvider
import androidx.compose.ui.unit.dp
import com.emergetools.snapshots.sample.ui.theme.SnapshotsSampleTheme

@Composable
fun MultiUserRow(users: List<User>) {
  Column {
    users.forEach { user ->
      Row(
        modifier = Modifier
          .fillMaxWidth()
          .padding(16.dp),
        verticalAlignment = Alignment.CenterVertically
      ) {
        // Profile picture
        Surface(
          modifier = Modifier
            .size(40.dp)
            .clip(CircleShape)
            .background(Color.Cyan),
          color = Color.Transparent
        ) {
          // Center content vertically and horizontally
          Column(
            modifier = Modifier.fillMaxSize(),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
          ) {
            Text(
              text = user.name.firstOrNull()?.uppercase() ?: "",
              style = MaterialTheme.typography.bodyLarge,
              textAlign = TextAlign.Center
            )
          }
        }

        Spacer(modifier = Modifier.width(16.dp))

        // User details
        Column {
          Text(text = user.name, style = MaterialTheme.typography.bodyMedium)
          Text(text = user.email, style = MaterialTheme.typography.bodySmall, color = Color.Gray)
        }
      }
    }
  }
}

@Preview(showBackground = true)
@Preview(uiMode = Configuration.UI_MODE_NIGHT_YES)
@Composable
fun MultiUserRowPreview(
  @PreviewParameter(MultiUserRowPreviewProvider::class) users: List<User>,
) {
  SnapshotsSampleTheme {
    MultiUserRow(users = users)
  }
}

@Preview(showBackground = true)
@Preview(uiMode = Configuration.UI_MODE_NIGHT_YES)
@Composable
fun MultiUserRowPreviewWithLimit(
  @PreviewParameter(MultiUserRowPreviewProvider::class, limit = 2) users: List<User>,
) {
  SnapshotsSampleTheme {
    MultiUserRow(users = users)
  }
}

class MultiUserRowPreviewProvider : PreviewParameterProvider<List<User>> {
  override val values: Sequence<List<User>> = sequenceOf(
    listOf(User(name = "Ryan", email = "ryan@emergetools.com")),
    listOf(
      User(name = "Ryan", email = "ryan@emergetools.com"),
      User(name = "Trevor", email = "trevor@emergetools.com"),
    ),
    listOf(
      User(name = "Ryan", email = "ryan@emergetools.com"),
      User(name = "Trevor", email = "trevor@emergetools.com"),
      User(name = "Josh", email = "josh@emergetools.com"),
    ),
  )
}
