package com.emergetools.reaper.sample.stress.numbers


interface StressfulInteger {
  // Return k where k=this.
  fun value(): Int

  // Return floor(k/2)
  fun half(): StressfulInteger

  // Computes fib(k) instantiating ~1.6^k objects of k unique classes.
  // This stress tests many objects being allocated for a small number of classes.
  fun fib(): Int

  // Sum the numbers i where k <= i < n instantiating n - k objects
  // using n - k unique classes.
  fun sumTo(limit: StressfulInteger): Int
}
