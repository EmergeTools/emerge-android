package com.emergetools.reaper.sample.stress

import android.app.Activity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import com.emergetools.reaper.sample.stress.numbers.Number0
import com.emergetools.reaper.sample.stress.numbers.Number19
import com.emergetools.reaper.sample.stress.numbers.Number9999

class MainActivity : Activity() {
  public override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)

    val label = TextView(this)
    val a = Number19()
    val b = Number9999()
    var total = 0
    for (i in 0..1000) {
      total += Number0().sumTo(b)
    }
    label.text = "fib(${a.value()}) = ${a.fib()}, sumTo(0, ${b.value()}) = ${Number0().sumTo(b)}, $total"

    setContentView(label)
  }
}
