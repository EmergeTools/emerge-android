package com.emergetools.distribution.sample

import android.app.Activity
import android.os.Bundle
import android.widget.TextView

class MainActivity : Activity() {
  public override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)

    val label = TextView(this)
    label.text = "Hello world!"

    setContentView(label)
  }
}
