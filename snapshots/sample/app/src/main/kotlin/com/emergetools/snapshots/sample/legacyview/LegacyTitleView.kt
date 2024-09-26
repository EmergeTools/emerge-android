package com.emergetools.snapshots.sample.legacyview

import android.content.Context
import android.util.AttributeSet
import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.LinearLayout
import android.widget.TextView
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.viewinterop.AndroidView
import com.emergetools.snapshots.sample.R

class LegacyTitleView @JvmOverloads constructor(
  context: Context,
  attrs: AttributeSet? = null,
  defStyleAttr: Int = 0
) : LinearLayout(context, attrs, defStyleAttr) {

  private val titleTextView: TextView
  private val subtitleTextView: TextView

  init {
    orientation = VERTICAL
    LayoutInflater.from(context).inflate(R.layout.view_legacy_title, this, true)
    titleTextView = findViewById(R.id.titleTextView)
    subtitleTextView = findViewById(R.id.subtitleTextView)
  }

  fun setTitle(title: String) {
    titleTextView.text = title
  }

  fun setSubtitle(subtitle: String) {
    subtitleTextView.text = subtitle
  }
}

@Preview(showBackground = true)
@Composable
fun LegacyTitleViewPreview() {
  AndroidView(
    factory = { context: Context ->
      LegacyTitleView(context).apply {
        layoutParams = ViewGroup.LayoutParams(
          ViewGroup.LayoutParams.WRAP_CONTENT,
          ViewGroup.LayoutParams.WRAP_CONTENT
        )
      }
    },
    update = { view ->
      view.setTitle("Hello, Legacy View!")
      view.setSubtitle("I'm a legacy view in a Compose preview")
    }
  )
}
