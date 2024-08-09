package com.emergetools.reaper.sample.stress.numbers

class Number10000 : StressfulInteger {

  companion object {
    private var VALUE = 10000
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number5000()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number9999()
    val b = Number9998()
    return a.fib() + b.fib()
  }

}

