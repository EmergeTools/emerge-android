package com.emergetools.reaper.sample.stress.numbers

class Number0 : StressfulInteger {

  companion object {
    private var VALUE = 0
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number0()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number1()
      val right = Number2()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    return 0
  }

}

class Number1 : StressfulInteger {

  companion object {
    private var VALUE = 1
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number0()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number3()
      val right = Number4()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    return 1
  }

}

class Number2 : StressfulInteger {

  companion object {
    private var VALUE = 2
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number5()
      val right = Number6()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1()
    val b = Number0()
    return a.fib() + b.fib()
  }

}

class Number3 : StressfulInteger {

  companion object {
    private var VALUE = 3
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number7()
      val right = Number8()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2()
    val b = Number1()
    return a.fib() + b.fib()
  }

}

class Number4 : StressfulInteger {

  companion object {
    private var VALUE = 4
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number9()
      val right = Number10()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number3()
    val b = Number2()
    return a.fib() + b.fib()
  }

}

class Number5 : StressfulInteger {

  companion object {
    private var VALUE = 5
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number11()
      val right = Number12()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4()
    val b = Number3()
    return a.fib() + b.fib()
  }

}

class Number6 : StressfulInteger {

  companion object {
    private var VALUE = 6
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number13()
      val right = Number14()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number5()
    val b = Number4()
    return a.fib() + b.fib()
  }

}

class Number7 : StressfulInteger {

  companion object {
    private var VALUE = 7
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number15()
      val right = Number16()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number6()
    val b = Number5()
    return a.fib() + b.fib()
  }

}

class Number8 : StressfulInteger {

  companion object {
    private var VALUE = 8
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number17()
      val right = Number18()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7()
    val b = Number6()
    return a.fib() + b.fib()
  }

}

class Number9 : StressfulInteger {

  companion object {
    private var VALUE = 9
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number19()
      val right = Number20()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8()
    val b = Number7()
    return a.fib() + b.fib()
  }

}

class Number10 : StressfulInteger {

  companion object {
    private var VALUE = 10
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number5()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number21()
      val right = Number22()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number9()
    val b = Number8()
    return a.fib() + b.fib()
  }

}

class Number11 : StressfulInteger {

  companion object {
    private var VALUE = 11
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number5()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number23()
      val right = Number24()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number10()
    val b = Number9()
    return a.fib() + b.fib()
  }

}

class Number12 : StressfulInteger {

  companion object {
    private var VALUE = 12
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number6()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number25()
      val right = Number26()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number11()
    val b = Number10()
    return a.fib() + b.fib()
  }

}

class Number13 : StressfulInteger {

  companion object {
    private var VALUE = 13
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number6()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number27()
      val right = Number28()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number12()
    val b = Number11()
    return a.fib() + b.fib()
  }

}

class Number14 : StressfulInteger {

  companion object {
    private var VALUE = 14
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number7()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number29()
      val right = Number30()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number13()
    val b = Number12()
    return a.fib() + b.fib()
  }

}

class Number15 : StressfulInteger {

  companion object {
    private var VALUE = 15
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number7()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number31()
      val right = Number32()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number14()
    val b = Number13()
    return a.fib() + b.fib()
  }

}

class Number16 : StressfulInteger {

  companion object {
    private var VALUE = 16
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number8()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number33()
      val right = Number34()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number15()
    val b = Number14()
    return a.fib() + b.fib()
  }

}

class Number17 : StressfulInteger {

  companion object {
    private var VALUE = 17
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number8()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number35()
      val right = Number36()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number16()
    val b = Number15()
    return a.fib() + b.fib()
  }

}

class Number18 : StressfulInteger {

  companion object {
    private var VALUE = 18
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number9()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number37()
      val right = Number38()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number17()
    val b = Number16()
    return a.fib() + b.fib()
  }

}

class Number19 : StressfulInteger {

  companion object {
    private var VALUE = 19
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number9()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number39()
      val right = Number40()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number18()
    val b = Number17()
    return a.fib() + b.fib()
  }

}

class Number20 : StressfulInteger {

  companion object {
    private var VALUE = 20
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number10()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number41()
      val right = Number42()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number19()
    val b = Number18()
    return a.fib() + b.fib()
  }

}

class Number21 : StressfulInteger {

  companion object {
    private var VALUE = 21
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number10()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number43()
      val right = Number44()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number20()
    val b = Number19()
    return a.fib() + b.fib()
  }

}

class Number22 : StressfulInteger {

  companion object {
    private var VALUE = 22
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number11()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number45()
      val right = Number46()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number21()
    val b = Number20()
    return a.fib() + b.fib()
  }

}

class Number23 : StressfulInteger {

  companion object {
    private var VALUE = 23
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number11()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number47()
      val right = Number48()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number22()
    val b = Number21()
    return a.fib() + b.fib()
  }

}

class Number24 : StressfulInteger {

  companion object {
    private var VALUE = 24
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number12()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number49()
      val right = Number50()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number23()
    val b = Number22()
    return a.fib() + b.fib()
  }

}

class Number25 : StressfulInteger {

  companion object {
    private var VALUE = 25
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number12()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number51()
      val right = Number52()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number24()
    val b = Number23()
    return a.fib() + b.fib()
  }

}

class Number26 : StressfulInteger {

  companion object {
    private var VALUE = 26
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number13()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number53()
      val right = Number54()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number25()
    val b = Number24()
    return a.fib() + b.fib()
  }

}

class Number27 : StressfulInteger {

  companion object {
    private var VALUE = 27
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number13()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number55()
      val right = Number56()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number26()
    val b = Number25()
    return a.fib() + b.fib()
  }

}

class Number28 : StressfulInteger {

  companion object {
    private var VALUE = 28
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number14()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number57()
      val right = Number58()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number27()
    val b = Number26()
    return a.fib() + b.fib()
  }

}

class Number29 : StressfulInteger {

  companion object {
    private var VALUE = 29
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number14()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number59()
      val right = Number60()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number28()
    val b = Number27()
    return a.fib() + b.fib()
  }

}

class Number30 : StressfulInteger {

  companion object {
    private var VALUE = 30
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number15()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number61()
      val right = Number62()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number29()
    val b = Number28()
    return a.fib() + b.fib()
  }

}

class Number31 : StressfulInteger {

  companion object {
    private var VALUE = 31
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number15()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number63()
      val right = Number64()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number30()
    val b = Number29()
    return a.fib() + b.fib()
  }

}

class Number32 : StressfulInteger {

  companion object {
    private var VALUE = 32
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number16()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number65()
      val right = Number66()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number31()
    val b = Number30()
    return a.fib() + b.fib()
  }

}

class Number33 : StressfulInteger {

  companion object {
    private var VALUE = 33
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number16()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number67()
      val right = Number68()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number32()
    val b = Number31()
    return a.fib() + b.fib()
  }

}

class Number34 : StressfulInteger {

  companion object {
    private var VALUE = 34
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number17()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number69()
      val right = Number70()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number33()
    val b = Number32()
    return a.fib() + b.fib()
  }

}

class Number35 : StressfulInteger {

  companion object {
    private var VALUE = 35
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number17()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number71()
      val right = Number72()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number34()
    val b = Number33()
    return a.fib() + b.fib()
  }

}

class Number36 : StressfulInteger {

  companion object {
    private var VALUE = 36
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number18()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number73()
      val right = Number74()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number35()
    val b = Number34()
    return a.fib() + b.fib()
  }

}

class Number37 : StressfulInteger {

  companion object {
    private var VALUE = 37
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number18()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number75()
      val right = Number76()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number36()
    val b = Number35()
    return a.fib() + b.fib()
  }

}

class Number38 : StressfulInteger {

  companion object {
    private var VALUE = 38
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number19()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number77()
      val right = Number78()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number37()
    val b = Number36()
    return a.fib() + b.fib()
  }

}

class Number39 : StressfulInteger {

  companion object {
    private var VALUE = 39
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number19()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number79()
      val right = Number80()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number38()
    val b = Number37()
    return a.fib() + b.fib()
  }

}

class Number40 : StressfulInteger {

  companion object {
    private var VALUE = 40
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number20()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number81()
      val right = Number82()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number39()
    val b = Number38()
    return a.fib() + b.fib()
  }

}

class Number41 : StressfulInteger {

  companion object {
    private var VALUE = 41
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number20()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number83()
      val right = Number84()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number40()
    val b = Number39()
    return a.fib() + b.fib()
  }

}

class Number42 : StressfulInteger {

  companion object {
    private var VALUE = 42
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number21()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number85()
      val right = Number86()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number41()
    val b = Number40()
    return a.fib() + b.fib()
  }

}

class Number43 : StressfulInteger {

  companion object {
    private var VALUE = 43
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number21()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number87()
      val right = Number88()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number42()
    val b = Number41()
    return a.fib() + b.fib()
  }

}

class Number44 : StressfulInteger {

  companion object {
    private var VALUE = 44
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number22()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number89()
      val right = Number90()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number43()
    val b = Number42()
    return a.fib() + b.fib()
  }

}

class Number45 : StressfulInteger {

  companion object {
    private var VALUE = 45
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number22()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number91()
      val right = Number92()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number44()
    val b = Number43()
    return a.fib() + b.fib()
  }

}

class Number46 : StressfulInteger {

  companion object {
    private var VALUE = 46
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number23()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number93()
      val right = Number94()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number45()
    val b = Number44()
    return a.fib() + b.fib()
  }

}

class Number47 : StressfulInteger {

  companion object {
    private var VALUE = 47
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number23()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number95()
      val right = Number96()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number46()
    val b = Number45()
    return a.fib() + b.fib()
  }

}

class Number48 : StressfulInteger {

  companion object {
    private var VALUE = 48
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number24()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number97()
      val right = Number98()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number47()
    val b = Number46()
    return a.fib() + b.fib()
  }

}

class Number49 : StressfulInteger {

  companion object {
    private var VALUE = 49
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number24()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number99()
      val right = Number100()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number48()
    val b = Number47()
    return a.fib() + b.fib()
  }

}

class Number50 : StressfulInteger {

  companion object {
    private var VALUE = 50
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number25()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number101()
      val right = Number102()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number49()
    val b = Number48()
    return a.fib() + b.fib()
  }

}

class Number51 : StressfulInteger {

  companion object {
    private var VALUE = 51
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number25()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number103()
      val right = Number104()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number50()
    val b = Number49()
    return a.fib() + b.fib()
  }

}

class Number52 : StressfulInteger {

  companion object {
    private var VALUE = 52
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number26()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number105()
      val right = Number106()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number51()
    val b = Number50()
    return a.fib() + b.fib()
  }

}

class Number53 : StressfulInteger {

  companion object {
    private var VALUE = 53
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number26()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number107()
      val right = Number108()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number52()
    val b = Number51()
    return a.fib() + b.fib()
  }

}

class Number54 : StressfulInteger {

  companion object {
    private var VALUE = 54
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number27()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number109()
      val right = Number110()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number53()
    val b = Number52()
    return a.fib() + b.fib()
  }

}

class Number55 : StressfulInteger {

  companion object {
    private var VALUE = 55
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number27()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number111()
      val right = Number112()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number54()
    val b = Number53()
    return a.fib() + b.fib()
  }

}

class Number56 : StressfulInteger {

  companion object {
    private var VALUE = 56
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number28()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number113()
      val right = Number114()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number55()
    val b = Number54()
    return a.fib() + b.fib()
  }

}

class Number57 : StressfulInteger {

  companion object {
    private var VALUE = 57
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number28()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number115()
      val right = Number116()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number56()
    val b = Number55()
    return a.fib() + b.fib()
  }

}

class Number58 : StressfulInteger {

  companion object {
    private var VALUE = 58
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number29()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number117()
      val right = Number118()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number57()
    val b = Number56()
    return a.fib() + b.fib()
  }

}

class Number59 : StressfulInteger {

  companion object {
    private var VALUE = 59
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number29()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number119()
      val right = Number120()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number58()
    val b = Number57()
    return a.fib() + b.fib()
  }

}

class Number60 : StressfulInteger {

  companion object {
    private var VALUE = 60
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number30()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number121()
      val right = Number122()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number59()
    val b = Number58()
    return a.fib() + b.fib()
  }

}

class Number61 : StressfulInteger {

  companion object {
    private var VALUE = 61
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number30()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number123()
      val right = Number124()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number60()
    val b = Number59()
    return a.fib() + b.fib()
  }

}

class Number62 : StressfulInteger {

  companion object {
    private var VALUE = 62
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number31()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number125()
      val right = Number126()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number61()
    val b = Number60()
    return a.fib() + b.fib()
  }

}

class Number63 : StressfulInteger {

  companion object {
    private var VALUE = 63
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number31()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number127()
      val right = Number128()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number62()
    val b = Number61()
    return a.fib() + b.fib()
  }

}

class Number64 : StressfulInteger {

  companion object {
    private var VALUE = 64
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number32()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number129()
      val right = Number130()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number63()
    val b = Number62()
    return a.fib() + b.fib()
  }

}

class Number65 : StressfulInteger {

  companion object {
    private var VALUE = 65
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number32()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number131()
      val right = Number132()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number64()
    val b = Number63()
    return a.fib() + b.fib()
  }

}

class Number66 : StressfulInteger {

  companion object {
    private var VALUE = 66
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number33()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number133()
      val right = Number134()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number65()
    val b = Number64()
    return a.fib() + b.fib()
  }

}

class Number67 : StressfulInteger {

  companion object {
    private var VALUE = 67
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number33()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number135()
      val right = Number136()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number66()
    val b = Number65()
    return a.fib() + b.fib()
  }

}

class Number68 : StressfulInteger {

  companion object {
    private var VALUE = 68
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number34()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number137()
      val right = Number138()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number67()
    val b = Number66()
    return a.fib() + b.fib()
  }

}

class Number69 : StressfulInteger {

  companion object {
    private var VALUE = 69
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number34()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number139()
      val right = Number140()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number68()
    val b = Number67()
    return a.fib() + b.fib()
  }

}

class Number70 : StressfulInteger {

  companion object {
    private var VALUE = 70
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number35()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number141()
      val right = Number142()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number69()
    val b = Number68()
    return a.fib() + b.fib()
  }

}

class Number71 : StressfulInteger {

  companion object {
    private var VALUE = 71
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number35()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number143()
      val right = Number144()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number70()
    val b = Number69()
    return a.fib() + b.fib()
  }

}

class Number72 : StressfulInteger {

  companion object {
    private var VALUE = 72
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number36()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number145()
      val right = Number146()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number71()
    val b = Number70()
    return a.fib() + b.fib()
  }

}

class Number73 : StressfulInteger {

  companion object {
    private var VALUE = 73
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number36()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number147()
      val right = Number148()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number72()
    val b = Number71()
    return a.fib() + b.fib()
  }

}

class Number74 : StressfulInteger {

  companion object {
    private var VALUE = 74
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number37()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number149()
      val right = Number150()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number73()
    val b = Number72()
    return a.fib() + b.fib()
  }

}

class Number75 : StressfulInteger {

  companion object {
    private var VALUE = 75
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number37()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number151()
      val right = Number152()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number74()
    val b = Number73()
    return a.fib() + b.fib()
  }

}

class Number76 : StressfulInteger {

  companion object {
    private var VALUE = 76
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number38()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number153()
      val right = Number154()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number75()
    val b = Number74()
    return a.fib() + b.fib()
  }

}

class Number77 : StressfulInteger {

  companion object {
    private var VALUE = 77
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number38()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number155()
      val right = Number156()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number76()
    val b = Number75()
    return a.fib() + b.fib()
  }

}

class Number78 : StressfulInteger {

  companion object {
    private var VALUE = 78
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number39()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number157()
      val right = Number158()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number77()
    val b = Number76()
    return a.fib() + b.fib()
  }

}

class Number79 : StressfulInteger {

  companion object {
    private var VALUE = 79
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number39()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number159()
      val right = Number160()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number78()
    val b = Number77()
    return a.fib() + b.fib()
  }

}

class Number80 : StressfulInteger {

  companion object {
    private var VALUE = 80
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number40()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number161()
      val right = Number162()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number79()
    val b = Number78()
    return a.fib() + b.fib()
  }

}

class Number81 : StressfulInteger {

  companion object {
    private var VALUE = 81
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number40()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number163()
      val right = Number164()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number80()
    val b = Number79()
    return a.fib() + b.fib()
  }

}

class Number82 : StressfulInteger {

  companion object {
    private var VALUE = 82
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number41()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number165()
      val right = Number166()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number81()
    val b = Number80()
    return a.fib() + b.fib()
  }

}

class Number83 : StressfulInteger {

  companion object {
    private var VALUE = 83
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number41()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number167()
      val right = Number168()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number82()
    val b = Number81()
    return a.fib() + b.fib()
  }

}

class Number84 : StressfulInteger {

  companion object {
    private var VALUE = 84
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number42()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number169()
      val right = Number170()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number83()
    val b = Number82()
    return a.fib() + b.fib()
  }

}

class Number85 : StressfulInteger {

  companion object {
    private var VALUE = 85
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number42()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number171()
      val right = Number172()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number84()
    val b = Number83()
    return a.fib() + b.fib()
  }

}

class Number86 : StressfulInteger {

  companion object {
    private var VALUE = 86
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number43()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number173()
      val right = Number174()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number85()
    val b = Number84()
    return a.fib() + b.fib()
  }

}

class Number87 : StressfulInteger {

  companion object {
    private var VALUE = 87
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number43()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number175()
      val right = Number176()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number86()
    val b = Number85()
    return a.fib() + b.fib()
  }

}

class Number88 : StressfulInteger {

  companion object {
    private var VALUE = 88
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number44()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number177()
      val right = Number178()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number87()
    val b = Number86()
    return a.fib() + b.fib()
  }

}

class Number89 : StressfulInteger {

  companion object {
    private var VALUE = 89
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number44()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number179()
      val right = Number180()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number88()
    val b = Number87()
    return a.fib() + b.fib()
  }

}

class Number90 : StressfulInteger {

  companion object {
    private var VALUE = 90
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number45()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number181()
      val right = Number182()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number89()
    val b = Number88()
    return a.fib() + b.fib()
  }

}

class Number91 : StressfulInteger {

  companion object {
    private var VALUE = 91
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number45()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number183()
      val right = Number184()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number90()
    val b = Number89()
    return a.fib() + b.fib()
  }

}

class Number92 : StressfulInteger {

  companion object {
    private var VALUE = 92
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number46()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number185()
      val right = Number186()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number91()
    val b = Number90()
    return a.fib() + b.fib()
  }

}

class Number93 : StressfulInteger {

  companion object {
    private var VALUE = 93
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number46()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number187()
      val right = Number188()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number92()
    val b = Number91()
    return a.fib() + b.fib()
  }

}

class Number94 : StressfulInteger {

  companion object {
    private var VALUE = 94
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number47()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number189()
      val right = Number190()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number93()
    val b = Number92()
    return a.fib() + b.fib()
  }

}

class Number95 : StressfulInteger {

  companion object {
    private var VALUE = 95
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number47()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number191()
      val right = Number192()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number94()
    val b = Number93()
    return a.fib() + b.fib()
  }

}

class Number96 : StressfulInteger {

  companion object {
    private var VALUE = 96
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number48()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number193()
      val right = Number194()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number95()
    val b = Number94()
    return a.fib() + b.fib()
  }

}

class Number97 : StressfulInteger {

  companion object {
    private var VALUE = 97
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number48()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number195()
      val right = Number196()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number96()
    val b = Number95()
    return a.fib() + b.fib()
  }

}

class Number98 : StressfulInteger {

  companion object {
    private var VALUE = 98
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number49()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number197()
      val right = Number198()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number97()
    val b = Number96()
    return a.fib() + b.fib()
  }

}

class Number99 : StressfulInteger {

  companion object {
    private var VALUE = 99
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number49()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number199()
      val right = Number200()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number98()
    val b = Number97()
    return a.fib() + b.fib()
  }

}

class Number100 : StressfulInteger {

  companion object {
    private var VALUE = 100
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number50()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number201()
      val right = Number202()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number99()
    val b = Number98()
    return a.fib() + b.fib()
  }

}

class Number101 : StressfulInteger {

  companion object {
    private var VALUE = 101
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number50()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number203()
      val right = Number204()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number100()
    val b = Number99()
    return a.fib() + b.fib()
  }

}

class Number102 : StressfulInteger {

  companion object {
    private var VALUE = 102
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number51()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number205()
      val right = Number206()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number101()
    val b = Number100()
    return a.fib() + b.fib()
  }

}

class Number103 : StressfulInteger {

  companion object {
    private var VALUE = 103
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number51()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number207()
      val right = Number208()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number102()
    val b = Number101()
    return a.fib() + b.fib()
  }

}

class Number104 : StressfulInteger {

  companion object {
    private var VALUE = 104
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number52()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number209()
      val right = Number210()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number103()
    val b = Number102()
    return a.fib() + b.fib()
  }

}

class Number105 : StressfulInteger {

  companion object {
    private var VALUE = 105
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number52()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number211()
      val right = Number212()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number104()
    val b = Number103()
    return a.fib() + b.fib()
  }

}

class Number106 : StressfulInteger {

  companion object {
    private var VALUE = 106
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number53()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number213()
      val right = Number214()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number105()
    val b = Number104()
    return a.fib() + b.fib()
  }

}

class Number107 : StressfulInteger {

  companion object {
    private var VALUE = 107
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number53()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number215()
      val right = Number216()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number106()
    val b = Number105()
    return a.fib() + b.fib()
  }

}

class Number108 : StressfulInteger {

  companion object {
    private var VALUE = 108
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number54()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number217()
      val right = Number218()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number107()
    val b = Number106()
    return a.fib() + b.fib()
  }

}

class Number109 : StressfulInteger {

  companion object {
    private var VALUE = 109
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number54()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number219()
      val right = Number220()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number108()
    val b = Number107()
    return a.fib() + b.fib()
  }

}

class Number110 : StressfulInteger {

  companion object {
    private var VALUE = 110
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number55()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number221()
      val right = Number222()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number109()
    val b = Number108()
    return a.fib() + b.fib()
  }

}

class Number111 : StressfulInteger {

  companion object {
    private var VALUE = 111
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number55()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number223()
      val right = Number224()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number110()
    val b = Number109()
    return a.fib() + b.fib()
  }

}

class Number112 : StressfulInteger {

  companion object {
    private var VALUE = 112
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number56()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number225()
      val right = Number226()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number111()
    val b = Number110()
    return a.fib() + b.fib()
  }

}

class Number113 : StressfulInteger {

  companion object {
    private var VALUE = 113
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number56()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number227()
      val right = Number228()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number112()
    val b = Number111()
    return a.fib() + b.fib()
  }

}

class Number114 : StressfulInteger {

  companion object {
    private var VALUE = 114
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number57()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number229()
      val right = Number230()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number113()
    val b = Number112()
    return a.fib() + b.fib()
  }

}

class Number115 : StressfulInteger {

  companion object {
    private var VALUE = 115
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number57()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number231()
      val right = Number232()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number114()
    val b = Number113()
    return a.fib() + b.fib()
  }

}

class Number116 : StressfulInteger {

  companion object {
    private var VALUE = 116
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number58()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number233()
      val right = Number234()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number115()
    val b = Number114()
    return a.fib() + b.fib()
  }

}

class Number117 : StressfulInteger {

  companion object {
    private var VALUE = 117
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number58()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number235()
      val right = Number236()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number116()
    val b = Number115()
    return a.fib() + b.fib()
  }

}

class Number118 : StressfulInteger {

  companion object {
    private var VALUE = 118
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number59()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number237()
      val right = Number238()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number117()
    val b = Number116()
    return a.fib() + b.fib()
  }

}

class Number119 : StressfulInteger {

  companion object {
    private var VALUE = 119
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number59()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number239()
      val right = Number240()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number118()
    val b = Number117()
    return a.fib() + b.fib()
  }

}

class Number120 : StressfulInteger {

  companion object {
    private var VALUE = 120
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number60()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number241()
      val right = Number242()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number119()
    val b = Number118()
    return a.fib() + b.fib()
  }

}

class Number121 : StressfulInteger {

  companion object {
    private var VALUE = 121
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number60()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number243()
      val right = Number244()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number120()
    val b = Number119()
    return a.fib() + b.fib()
  }

}

class Number122 : StressfulInteger {

  companion object {
    private var VALUE = 122
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number61()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number245()
      val right = Number246()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number121()
    val b = Number120()
    return a.fib() + b.fib()
  }

}

class Number123 : StressfulInteger {

  companion object {
    private var VALUE = 123
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number61()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number247()
      val right = Number248()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number122()
    val b = Number121()
    return a.fib() + b.fib()
  }

}

class Number124 : StressfulInteger {

  companion object {
    private var VALUE = 124
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number62()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number249()
      val right = Number250()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number123()
    val b = Number122()
    return a.fib() + b.fib()
  }

}

class Number125 : StressfulInteger {

  companion object {
    private var VALUE = 125
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number62()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number251()
      val right = Number252()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number124()
    val b = Number123()
    return a.fib() + b.fib()
  }

}

class Number126 : StressfulInteger {

  companion object {
    private var VALUE = 126
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number63()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number253()
      val right = Number254()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number125()
    val b = Number124()
    return a.fib() + b.fib()
  }

}

class Number127 : StressfulInteger {

  companion object {
    private var VALUE = 127
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number63()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number255()
      val right = Number256()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number126()
    val b = Number125()
    return a.fib() + b.fib()
  }

}

class Number128 : StressfulInteger {

  companion object {
    private var VALUE = 128
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number64()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number257()
      val right = Number258()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number127()
    val b = Number126()
    return a.fib() + b.fib()
  }

}

class Number129 : StressfulInteger {

  companion object {
    private var VALUE = 129
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number64()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number259()
      val right = Number260()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number128()
    val b = Number127()
    return a.fib() + b.fib()
  }

}

class Number130 : StressfulInteger {

  companion object {
    private var VALUE = 130
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number65()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number261()
      val right = Number262()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number129()
    val b = Number128()
    return a.fib() + b.fib()
  }

}

class Number131 : StressfulInteger {

  companion object {
    private var VALUE = 131
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number65()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number263()
      val right = Number264()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number130()
    val b = Number129()
    return a.fib() + b.fib()
  }

}

class Number132 : StressfulInteger {

  companion object {
    private var VALUE = 132
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number66()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number265()
      val right = Number266()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number131()
    val b = Number130()
    return a.fib() + b.fib()
  }

}

class Number133 : StressfulInteger {

  companion object {
    private var VALUE = 133
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number66()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number267()
      val right = Number268()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number132()
    val b = Number131()
    return a.fib() + b.fib()
  }

}

class Number134 : StressfulInteger {

  companion object {
    private var VALUE = 134
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number67()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number269()
      val right = Number270()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number133()
    val b = Number132()
    return a.fib() + b.fib()
  }

}

class Number135 : StressfulInteger {

  companion object {
    private var VALUE = 135
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number67()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number271()
      val right = Number272()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number134()
    val b = Number133()
    return a.fib() + b.fib()
  }

}

class Number136 : StressfulInteger {

  companion object {
    private var VALUE = 136
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number68()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number273()
      val right = Number274()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number135()
    val b = Number134()
    return a.fib() + b.fib()
  }

}

class Number137 : StressfulInteger {

  companion object {
    private var VALUE = 137
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number68()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number275()
      val right = Number276()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number136()
    val b = Number135()
    return a.fib() + b.fib()
  }

}

class Number138 : StressfulInteger {

  companion object {
    private var VALUE = 138
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number69()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number277()
      val right = Number278()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number137()
    val b = Number136()
    return a.fib() + b.fib()
  }

}

class Number139 : StressfulInteger {

  companion object {
    private var VALUE = 139
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number69()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number279()
      val right = Number280()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number138()
    val b = Number137()
    return a.fib() + b.fib()
  }

}

class Number140 : StressfulInteger {

  companion object {
    private var VALUE = 140
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number70()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number281()
      val right = Number282()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number139()
    val b = Number138()
    return a.fib() + b.fib()
  }

}

class Number141 : StressfulInteger {

  companion object {
    private var VALUE = 141
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number70()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number283()
      val right = Number284()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number140()
    val b = Number139()
    return a.fib() + b.fib()
  }

}

class Number142 : StressfulInteger {

  companion object {
    private var VALUE = 142
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number71()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number285()
      val right = Number286()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number141()
    val b = Number140()
    return a.fib() + b.fib()
  }

}

class Number143 : StressfulInteger {

  companion object {
    private var VALUE = 143
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number71()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number287()
      val right = Number288()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number142()
    val b = Number141()
    return a.fib() + b.fib()
  }

}

class Number144 : StressfulInteger {

  companion object {
    private var VALUE = 144
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number72()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number289()
      val right = Number290()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number143()
    val b = Number142()
    return a.fib() + b.fib()
  }

}

class Number145 : StressfulInteger {

  companion object {
    private var VALUE = 145
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number72()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number291()
      val right = Number292()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number144()
    val b = Number143()
    return a.fib() + b.fib()
  }

}

class Number146 : StressfulInteger {

  companion object {
    private var VALUE = 146
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number73()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number293()
      val right = Number294()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number145()
    val b = Number144()
    return a.fib() + b.fib()
  }

}

class Number147 : StressfulInteger {

  companion object {
    private var VALUE = 147
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number73()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number295()
      val right = Number296()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number146()
    val b = Number145()
    return a.fib() + b.fib()
  }

}

class Number148 : StressfulInteger {

  companion object {
    private var VALUE = 148
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number74()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number297()
      val right = Number298()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number147()
    val b = Number146()
    return a.fib() + b.fib()
  }

}

class Number149 : StressfulInteger {

  companion object {
    private var VALUE = 149
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number74()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number299()
      val right = Number300()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number148()
    val b = Number147()
    return a.fib() + b.fib()
  }

}

class Number150 : StressfulInteger {

  companion object {
    private var VALUE = 150
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number75()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number301()
      val right = Number302()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number149()
    val b = Number148()
    return a.fib() + b.fib()
  }

}

class Number151 : StressfulInteger {

  companion object {
    private var VALUE = 151
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number75()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number303()
      val right = Number304()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number150()
    val b = Number149()
    return a.fib() + b.fib()
  }

}

class Number152 : StressfulInteger {

  companion object {
    private var VALUE = 152
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number76()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number305()
      val right = Number306()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number151()
    val b = Number150()
    return a.fib() + b.fib()
  }

}

class Number153 : StressfulInteger {

  companion object {
    private var VALUE = 153
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number76()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number307()
      val right = Number308()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number152()
    val b = Number151()
    return a.fib() + b.fib()
  }

}

class Number154 : StressfulInteger {

  companion object {
    private var VALUE = 154
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number77()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number309()
      val right = Number310()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number153()
    val b = Number152()
    return a.fib() + b.fib()
  }

}

class Number155 : StressfulInteger {

  companion object {
    private var VALUE = 155
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number77()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number311()
      val right = Number312()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number154()
    val b = Number153()
    return a.fib() + b.fib()
  }

}

class Number156 : StressfulInteger {

  companion object {
    private var VALUE = 156
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number78()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number313()
      val right = Number314()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number155()
    val b = Number154()
    return a.fib() + b.fib()
  }

}

class Number157 : StressfulInteger {

  companion object {
    private var VALUE = 157
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number78()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number315()
      val right = Number316()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number156()
    val b = Number155()
    return a.fib() + b.fib()
  }

}

class Number158 : StressfulInteger {

  companion object {
    private var VALUE = 158
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number79()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number317()
      val right = Number318()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number157()
    val b = Number156()
    return a.fib() + b.fib()
  }

}

class Number159 : StressfulInteger {

  companion object {
    private var VALUE = 159
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number79()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number319()
      val right = Number320()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number158()
    val b = Number157()
    return a.fib() + b.fib()
  }

}

class Number160 : StressfulInteger {

  companion object {
    private var VALUE = 160
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number80()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number321()
      val right = Number322()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number159()
    val b = Number158()
    return a.fib() + b.fib()
  }

}

class Number161 : StressfulInteger {

  companion object {
    private var VALUE = 161
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number80()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number323()
      val right = Number324()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number160()
    val b = Number159()
    return a.fib() + b.fib()
  }

}

class Number162 : StressfulInteger {

  companion object {
    private var VALUE = 162
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number81()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number325()
      val right = Number326()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number161()
    val b = Number160()
    return a.fib() + b.fib()
  }

}

class Number163 : StressfulInteger {

  companion object {
    private var VALUE = 163
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number81()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number327()
      val right = Number328()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number162()
    val b = Number161()
    return a.fib() + b.fib()
  }

}

class Number164 : StressfulInteger {

  companion object {
    private var VALUE = 164
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number82()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number329()
      val right = Number330()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number163()
    val b = Number162()
    return a.fib() + b.fib()
  }

}

class Number165 : StressfulInteger {

  companion object {
    private var VALUE = 165
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number82()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number331()
      val right = Number332()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number164()
    val b = Number163()
    return a.fib() + b.fib()
  }

}

class Number166 : StressfulInteger {

  companion object {
    private var VALUE = 166
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number83()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number333()
      val right = Number334()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number165()
    val b = Number164()
    return a.fib() + b.fib()
  }

}

class Number167 : StressfulInteger {

  companion object {
    private var VALUE = 167
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number83()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number335()
      val right = Number336()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number166()
    val b = Number165()
    return a.fib() + b.fib()
  }

}

class Number168 : StressfulInteger {

  companion object {
    private var VALUE = 168
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number84()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number337()
      val right = Number338()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number167()
    val b = Number166()
    return a.fib() + b.fib()
  }

}

class Number169 : StressfulInteger {

  companion object {
    private var VALUE = 169
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number84()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number339()
      val right = Number340()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number168()
    val b = Number167()
    return a.fib() + b.fib()
  }

}

class Number170 : StressfulInteger {

  companion object {
    private var VALUE = 170
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number85()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number341()
      val right = Number342()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number169()
    val b = Number168()
    return a.fib() + b.fib()
  }

}

class Number171 : StressfulInteger {

  companion object {
    private var VALUE = 171
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number85()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number343()
      val right = Number344()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number170()
    val b = Number169()
    return a.fib() + b.fib()
  }

}

class Number172 : StressfulInteger {

  companion object {
    private var VALUE = 172
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number86()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number345()
      val right = Number346()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number171()
    val b = Number170()
    return a.fib() + b.fib()
  }

}

class Number173 : StressfulInteger {

  companion object {
    private var VALUE = 173
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number86()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number347()
      val right = Number348()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number172()
    val b = Number171()
    return a.fib() + b.fib()
  }

}

class Number174 : StressfulInteger {

  companion object {
    private var VALUE = 174
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number87()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number349()
      val right = Number350()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number173()
    val b = Number172()
    return a.fib() + b.fib()
  }

}

class Number175 : StressfulInteger {

  companion object {
    private var VALUE = 175
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number87()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number351()
      val right = Number352()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number174()
    val b = Number173()
    return a.fib() + b.fib()
  }

}

class Number176 : StressfulInteger {

  companion object {
    private var VALUE = 176
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number88()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number353()
      val right = Number354()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number175()
    val b = Number174()
    return a.fib() + b.fib()
  }

}

class Number177 : StressfulInteger {

  companion object {
    private var VALUE = 177
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number88()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number355()
      val right = Number356()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number176()
    val b = Number175()
    return a.fib() + b.fib()
  }

}

class Number178 : StressfulInteger {

  companion object {
    private var VALUE = 178
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number89()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number357()
      val right = Number358()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number177()
    val b = Number176()
    return a.fib() + b.fib()
  }

}

class Number179 : StressfulInteger {

  companion object {
    private var VALUE = 179
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number89()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number359()
      val right = Number360()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number178()
    val b = Number177()
    return a.fib() + b.fib()
  }

}

class Number180 : StressfulInteger {

  companion object {
    private var VALUE = 180
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number90()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number361()
      val right = Number362()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number179()
    val b = Number178()
    return a.fib() + b.fib()
  }

}

class Number181 : StressfulInteger {

  companion object {
    private var VALUE = 181
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number90()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number363()
      val right = Number364()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number180()
    val b = Number179()
    return a.fib() + b.fib()
  }

}

class Number182 : StressfulInteger {

  companion object {
    private var VALUE = 182
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number91()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number365()
      val right = Number366()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number181()
    val b = Number180()
    return a.fib() + b.fib()
  }

}

class Number183 : StressfulInteger {

  companion object {
    private var VALUE = 183
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number91()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number367()
      val right = Number368()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number182()
    val b = Number181()
    return a.fib() + b.fib()
  }

}

class Number184 : StressfulInteger {

  companion object {
    private var VALUE = 184
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number92()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number369()
      val right = Number370()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number183()
    val b = Number182()
    return a.fib() + b.fib()
  }

}

class Number185 : StressfulInteger {

  companion object {
    private var VALUE = 185
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number92()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number371()
      val right = Number372()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number184()
    val b = Number183()
    return a.fib() + b.fib()
  }

}

class Number186 : StressfulInteger {

  companion object {
    private var VALUE = 186
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number93()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number373()
      val right = Number374()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number185()
    val b = Number184()
    return a.fib() + b.fib()
  }

}

class Number187 : StressfulInteger {

  companion object {
    private var VALUE = 187
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number93()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number375()
      val right = Number376()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number186()
    val b = Number185()
    return a.fib() + b.fib()
  }

}

class Number188 : StressfulInteger {

  companion object {
    private var VALUE = 188
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number94()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number377()
      val right = Number378()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number187()
    val b = Number186()
    return a.fib() + b.fib()
  }

}

class Number189 : StressfulInteger {

  companion object {
    private var VALUE = 189
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number94()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number379()
      val right = Number380()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number188()
    val b = Number187()
    return a.fib() + b.fib()
  }

}

class Number190 : StressfulInteger {

  companion object {
    private var VALUE = 190
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number95()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number381()
      val right = Number382()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number189()
    val b = Number188()
    return a.fib() + b.fib()
  }

}

class Number191 : StressfulInteger {

  companion object {
    private var VALUE = 191
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number95()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number383()
      val right = Number384()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number190()
    val b = Number189()
    return a.fib() + b.fib()
  }

}

class Number192 : StressfulInteger {

  companion object {
    private var VALUE = 192
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number96()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number385()
      val right = Number386()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number191()
    val b = Number190()
    return a.fib() + b.fib()
  }

}

class Number193 : StressfulInteger {

  companion object {
    private var VALUE = 193
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number96()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number387()
      val right = Number388()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number192()
    val b = Number191()
    return a.fib() + b.fib()
  }

}

class Number194 : StressfulInteger {

  companion object {
    private var VALUE = 194
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number97()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number389()
      val right = Number390()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number193()
    val b = Number192()
    return a.fib() + b.fib()
  }

}

class Number195 : StressfulInteger {

  companion object {
    private var VALUE = 195
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number97()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number391()
      val right = Number392()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number194()
    val b = Number193()
    return a.fib() + b.fib()
  }

}

class Number196 : StressfulInteger {

  companion object {
    private var VALUE = 196
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number98()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number393()
      val right = Number394()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number195()
    val b = Number194()
    return a.fib() + b.fib()
  }

}

class Number197 : StressfulInteger {

  companion object {
    private var VALUE = 197
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number98()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number395()
      val right = Number396()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number196()
    val b = Number195()
    return a.fib() + b.fib()
  }

}

class Number198 : StressfulInteger {

  companion object {
    private var VALUE = 198
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number99()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number397()
      val right = Number398()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number197()
    val b = Number196()
    return a.fib() + b.fib()
  }

}

class Number199 : StressfulInteger {

  companion object {
    private var VALUE = 199
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number99()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number399()
      val right = Number400()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number198()
    val b = Number197()
    return a.fib() + b.fib()
  }

}

class Number200 : StressfulInteger {

  companion object {
    private var VALUE = 200
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number100()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number401()
      val right = Number402()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number199()
    val b = Number198()
    return a.fib() + b.fib()
  }

}

class Number201 : StressfulInteger {

  companion object {
    private var VALUE = 201
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number100()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number403()
      val right = Number404()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number200()
    val b = Number199()
    return a.fib() + b.fib()
  }

}

class Number202 : StressfulInteger {

  companion object {
    private var VALUE = 202
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number101()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number405()
      val right = Number406()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number201()
    val b = Number200()
    return a.fib() + b.fib()
  }

}

class Number203 : StressfulInteger {

  companion object {
    private var VALUE = 203
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number101()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number407()
      val right = Number408()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number202()
    val b = Number201()
    return a.fib() + b.fib()
  }

}

class Number204 : StressfulInteger {

  companion object {
    private var VALUE = 204
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number102()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number409()
      val right = Number410()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number203()
    val b = Number202()
    return a.fib() + b.fib()
  }

}

class Number205 : StressfulInteger {

  companion object {
    private var VALUE = 205
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number102()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number411()
      val right = Number412()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number204()
    val b = Number203()
    return a.fib() + b.fib()
  }

}

class Number206 : StressfulInteger {

  companion object {
    private var VALUE = 206
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number103()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number413()
      val right = Number414()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number205()
    val b = Number204()
    return a.fib() + b.fib()
  }

}

class Number207 : StressfulInteger {

  companion object {
    private var VALUE = 207
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number103()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number415()
      val right = Number416()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number206()
    val b = Number205()
    return a.fib() + b.fib()
  }

}

class Number208 : StressfulInteger {

  companion object {
    private var VALUE = 208
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number104()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number417()
      val right = Number418()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number207()
    val b = Number206()
    return a.fib() + b.fib()
  }

}

class Number209 : StressfulInteger {

  companion object {
    private var VALUE = 209
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number104()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number419()
      val right = Number420()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number208()
    val b = Number207()
    return a.fib() + b.fib()
  }

}

class Number210 : StressfulInteger {

  companion object {
    private var VALUE = 210
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number105()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number421()
      val right = Number422()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number209()
    val b = Number208()
    return a.fib() + b.fib()
  }

}

class Number211 : StressfulInteger {

  companion object {
    private var VALUE = 211
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number105()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number423()
      val right = Number424()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number210()
    val b = Number209()
    return a.fib() + b.fib()
  }

}

class Number212 : StressfulInteger {

  companion object {
    private var VALUE = 212
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number106()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number425()
      val right = Number426()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number211()
    val b = Number210()
    return a.fib() + b.fib()
  }

}

class Number213 : StressfulInteger {

  companion object {
    private var VALUE = 213
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number106()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number427()
      val right = Number428()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number212()
    val b = Number211()
    return a.fib() + b.fib()
  }

}

class Number214 : StressfulInteger {

  companion object {
    private var VALUE = 214
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number107()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number429()
      val right = Number430()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number213()
    val b = Number212()
    return a.fib() + b.fib()
  }

}

class Number215 : StressfulInteger {

  companion object {
    private var VALUE = 215
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number107()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number431()
      val right = Number432()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number214()
    val b = Number213()
    return a.fib() + b.fib()
  }

}

class Number216 : StressfulInteger {

  companion object {
    private var VALUE = 216
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number108()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number433()
      val right = Number434()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number215()
    val b = Number214()
    return a.fib() + b.fib()
  }

}

class Number217 : StressfulInteger {

  companion object {
    private var VALUE = 217
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number108()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number435()
      val right = Number436()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number216()
    val b = Number215()
    return a.fib() + b.fib()
  }

}

class Number218 : StressfulInteger {

  companion object {
    private var VALUE = 218
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number109()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number437()
      val right = Number438()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number217()
    val b = Number216()
    return a.fib() + b.fib()
  }

}

class Number219 : StressfulInteger {

  companion object {
    private var VALUE = 219
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number109()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number439()
      val right = Number440()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number218()
    val b = Number217()
    return a.fib() + b.fib()
  }

}

class Number220 : StressfulInteger {

  companion object {
    private var VALUE = 220
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number110()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number441()
      val right = Number442()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number219()
    val b = Number218()
    return a.fib() + b.fib()
  }

}

class Number221 : StressfulInteger {

  companion object {
    private var VALUE = 221
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number110()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number443()
      val right = Number444()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number220()
    val b = Number219()
    return a.fib() + b.fib()
  }

}

class Number222 : StressfulInteger {

  companion object {
    private var VALUE = 222
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number111()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number445()
      val right = Number446()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number221()
    val b = Number220()
    return a.fib() + b.fib()
  }

}

class Number223 : StressfulInteger {

  companion object {
    private var VALUE = 223
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number111()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number447()
      val right = Number448()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number222()
    val b = Number221()
    return a.fib() + b.fib()
  }

}

class Number224 : StressfulInteger {

  companion object {
    private var VALUE = 224
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number112()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number449()
      val right = Number450()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number223()
    val b = Number222()
    return a.fib() + b.fib()
  }

}

class Number225 : StressfulInteger {

  companion object {
    private var VALUE = 225
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number112()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number451()
      val right = Number452()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number224()
    val b = Number223()
    return a.fib() + b.fib()
  }

}

class Number226 : StressfulInteger {

  companion object {
    private var VALUE = 226
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number113()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number453()
      val right = Number454()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number225()
    val b = Number224()
    return a.fib() + b.fib()
  }

}

class Number227 : StressfulInteger {

  companion object {
    private var VALUE = 227
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number113()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number455()
      val right = Number456()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number226()
    val b = Number225()
    return a.fib() + b.fib()
  }

}

class Number228 : StressfulInteger {

  companion object {
    private var VALUE = 228
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number114()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number457()
      val right = Number458()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number227()
    val b = Number226()
    return a.fib() + b.fib()
  }

}

class Number229 : StressfulInteger {

  companion object {
    private var VALUE = 229
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number114()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number459()
      val right = Number460()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number228()
    val b = Number227()
    return a.fib() + b.fib()
  }

}

class Number230 : StressfulInteger {

  companion object {
    private var VALUE = 230
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number115()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number461()
      val right = Number462()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number229()
    val b = Number228()
    return a.fib() + b.fib()
  }

}

class Number231 : StressfulInteger {

  companion object {
    private var VALUE = 231
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number115()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number463()
      val right = Number464()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number230()
    val b = Number229()
    return a.fib() + b.fib()
  }

}

class Number232 : StressfulInteger {

  companion object {
    private var VALUE = 232
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number116()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number465()
      val right = Number466()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number231()
    val b = Number230()
    return a.fib() + b.fib()
  }

}

class Number233 : StressfulInteger {

  companion object {
    private var VALUE = 233
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number116()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number467()
      val right = Number468()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number232()
    val b = Number231()
    return a.fib() + b.fib()
  }

}

class Number234 : StressfulInteger {

  companion object {
    private var VALUE = 234
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number117()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number469()
      val right = Number470()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number233()
    val b = Number232()
    return a.fib() + b.fib()
  }

}

class Number235 : StressfulInteger {

  companion object {
    private var VALUE = 235
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number117()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number471()
      val right = Number472()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number234()
    val b = Number233()
    return a.fib() + b.fib()
  }

}

class Number236 : StressfulInteger {

  companion object {
    private var VALUE = 236
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number118()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number473()
      val right = Number474()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number235()
    val b = Number234()
    return a.fib() + b.fib()
  }

}

class Number237 : StressfulInteger {

  companion object {
    private var VALUE = 237
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number118()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number475()
      val right = Number476()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number236()
    val b = Number235()
    return a.fib() + b.fib()
  }

}

class Number238 : StressfulInteger {

  companion object {
    private var VALUE = 238
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number119()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number477()
      val right = Number478()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number237()
    val b = Number236()
    return a.fib() + b.fib()
  }

}

class Number239 : StressfulInteger {

  companion object {
    private var VALUE = 239
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number119()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number479()
      val right = Number480()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number238()
    val b = Number237()
    return a.fib() + b.fib()
  }

}

class Number240 : StressfulInteger {

  companion object {
    private var VALUE = 240
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number120()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number481()
      val right = Number482()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number239()
    val b = Number238()
    return a.fib() + b.fib()
  }

}

class Number241 : StressfulInteger {

  companion object {
    private var VALUE = 241
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number120()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number483()
      val right = Number484()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number240()
    val b = Number239()
    return a.fib() + b.fib()
  }

}

class Number242 : StressfulInteger {

  companion object {
    private var VALUE = 242
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number121()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number485()
      val right = Number486()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number241()
    val b = Number240()
    return a.fib() + b.fib()
  }

}

class Number243 : StressfulInteger {

  companion object {
    private var VALUE = 243
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number121()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number487()
      val right = Number488()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number242()
    val b = Number241()
    return a.fib() + b.fib()
  }

}

class Number244 : StressfulInteger {

  companion object {
    private var VALUE = 244
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number122()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number489()
      val right = Number490()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number243()
    val b = Number242()
    return a.fib() + b.fib()
  }

}

class Number245 : StressfulInteger {

  companion object {
    private var VALUE = 245
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number122()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number491()
      val right = Number492()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number244()
    val b = Number243()
    return a.fib() + b.fib()
  }

}

class Number246 : StressfulInteger {

  companion object {
    private var VALUE = 246
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number123()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number493()
      val right = Number494()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number245()
    val b = Number244()
    return a.fib() + b.fib()
  }

}

class Number247 : StressfulInteger {

  companion object {
    private var VALUE = 247
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number123()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number495()
      val right = Number496()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number246()
    val b = Number245()
    return a.fib() + b.fib()
  }

}

class Number248 : StressfulInteger {

  companion object {
    private var VALUE = 248
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number124()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number497()
      val right = Number498()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number247()
    val b = Number246()
    return a.fib() + b.fib()
  }

}

class Number249 : StressfulInteger {

  companion object {
    private var VALUE = 249
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number124()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number499()
      val right = Number500()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number248()
    val b = Number247()
    return a.fib() + b.fib()
  }

}

class Number250 : StressfulInteger {

  companion object {
    private var VALUE = 250
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number125()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number501()
      val right = Number502()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number249()
    val b = Number248()
    return a.fib() + b.fib()
  }

}

class Number251 : StressfulInteger {

  companion object {
    private var VALUE = 251
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number125()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number503()
      val right = Number504()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number250()
    val b = Number249()
    return a.fib() + b.fib()
  }

}

class Number252 : StressfulInteger {

  companion object {
    private var VALUE = 252
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number126()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number505()
      val right = Number506()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number251()
    val b = Number250()
    return a.fib() + b.fib()
  }

}

class Number253 : StressfulInteger {

  companion object {
    private var VALUE = 253
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number126()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number507()
      val right = Number508()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number252()
    val b = Number251()
    return a.fib() + b.fib()
  }

}

class Number254 : StressfulInteger {

  companion object {
    private var VALUE = 254
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number127()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number509()
      val right = Number510()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number253()
    val b = Number252()
    return a.fib() + b.fib()
  }

}

class Number255 : StressfulInteger {

  companion object {
    private var VALUE = 255
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number127()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number511()
      val right = Number512()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number254()
    val b = Number253()
    return a.fib() + b.fib()
  }

}

class Number256 : StressfulInteger {

  companion object {
    private var VALUE = 256
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number128()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number513()
      val right = Number514()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number255()
    val b = Number254()
    return a.fib() + b.fib()
  }

}

class Number257 : StressfulInteger {

  companion object {
    private var VALUE = 257
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number128()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number515()
      val right = Number516()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number256()
    val b = Number255()
    return a.fib() + b.fib()
  }

}

class Number258 : StressfulInteger {

  companion object {
    private var VALUE = 258
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number129()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number517()
      val right = Number518()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number257()
    val b = Number256()
    return a.fib() + b.fib()
  }

}

class Number259 : StressfulInteger {

  companion object {
    private var VALUE = 259
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number129()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number519()
      val right = Number520()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number258()
    val b = Number257()
    return a.fib() + b.fib()
  }

}

class Number260 : StressfulInteger {

  companion object {
    private var VALUE = 260
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number130()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number521()
      val right = Number522()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number259()
    val b = Number258()
    return a.fib() + b.fib()
  }

}

class Number261 : StressfulInteger {

  companion object {
    private var VALUE = 261
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number130()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number523()
      val right = Number524()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number260()
    val b = Number259()
    return a.fib() + b.fib()
  }

}

class Number262 : StressfulInteger {

  companion object {
    private var VALUE = 262
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number131()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number525()
      val right = Number526()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number261()
    val b = Number260()
    return a.fib() + b.fib()
  }

}

class Number263 : StressfulInteger {

  companion object {
    private var VALUE = 263
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number131()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number527()
      val right = Number528()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number262()
    val b = Number261()
    return a.fib() + b.fib()
  }

}

class Number264 : StressfulInteger {

  companion object {
    private var VALUE = 264
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number132()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number529()
      val right = Number530()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number263()
    val b = Number262()
    return a.fib() + b.fib()
  }

}

class Number265 : StressfulInteger {

  companion object {
    private var VALUE = 265
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number132()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number531()
      val right = Number532()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number264()
    val b = Number263()
    return a.fib() + b.fib()
  }

}

class Number266 : StressfulInteger {

  companion object {
    private var VALUE = 266
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number133()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number533()
      val right = Number534()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number265()
    val b = Number264()
    return a.fib() + b.fib()
  }

}

class Number267 : StressfulInteger {

  companion object {
    private var VALUE = 267
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number133()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number535()
      val right = Number536()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number266()
    val b = Number265()
    return a.fib() + b.fib()
  }

}

class Number268 : StressfulInteger {

  companion object {
    private var VALUE = 268
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number134()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number537()
      val right = Number538()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number267()
    val b = Number266()
    return a.fib() + b.fib()
  }

}

class Number269 : StressfulInteger {

  companion object {
    private var VALUE = 269
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number134()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number539()
      val right = Number540()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number268()
    val b = Number267()
    return a.fib() + b.fib()
  }

}

class Number270 : StressfulInteger {

  companion object {
    private var VALUE = 270
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number135()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number541()
      val right = Number542()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number269()
    val b = Number268()
    return a.fib() + b.fib()
  }

}

class Number271 : StressfulInteger {

  companion object {
    private var VALUE = 271
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number135()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number543()
      val right = Number544()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number270()
    val b = Number269()
    return a.fib() + b.fib()
  }

}

class Number272 : StressfulInteger {

  companion object {
    private var VALUE = 272
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number136()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number545()
      val right = Number546()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number271()
    val b = Number270()
    return a.fib() + b.fib()
  }

}

class Number273 : StressfulInteger {

  companion object {
    private var VALUE = 273
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number136()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number547()
      val right = Number548()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number272()
    val b = Number271()
    return a.fib() + b.fib()
  }

}

class Number274 : StressfulInteger {

  companion object {
    private var VALUE = 274
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number137()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number549()
      val right = Number550()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number273()
    val b = Number272()
    return a.fib() + b.fib()
  }

}

class Number275 : StressfulInteger {

  companion object {
    private var VALUE = 275
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number137()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number551()
      val right = Number552()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number274()
    val b = Number273()
    return a.fib() + b.fib()
  }

}

class Number276 : StressfulInteger {

  companion object {
    private var VALUE = 276
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number138()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number553()
      val right = Number554()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number275()
    val b = Number274()
    return a.fib() + b.fib()
  }

}

class Number277 : StressfulInteger {

  companion object {
    private var VALUE = 277
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number138()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number555()
      val right = Number556()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number276()
    val b = Number275()
    return a.fib() + b.fib()
  }

}

class Number278 : StressfulInteger {

  companion object {
    private var VALUE = 278
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number139()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number557()
      val right = Number558()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number277()
    val b = Number276()
    return a.fib() + b.fib()
  }

}

class Number279 : StressfulInteger {

  companion object {
    private var VALUE = 279
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number139()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number559()
      val right = Number560()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number278()
    val b = Number277()
    return a.fib() + b.fib()
  }

}

class Number280 : StressfulInteger {

  companion object {
    private var VALUE = 280
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number140()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number561()
      val right = Number562()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number279()
    val b = Number278()
    return a.fib() + b.fib()
  }

}

class Number281 : StressfulInteger {

  companion object {
    private var VALUE = 281
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number140()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number563()
      val right = Number564()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number280()
    val b = Number279()
    return a.fib() + b.fib()
  }

}

class Number282 : StressfulInteger {

  companion object {
    private var VALUE = 282
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number141()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number565()
      val right = Number566()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number281()
    val b = Number280()
    return a.fib() + b.fib()
  }

}

class Number283 : StressfulInteger {

  companion object {
    private var VALUE = 283
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number141()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number567()
      val right = Number568()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number282()
    val b = Number281()
    return a.fib() + b.fib()
  }

}

class Number284 : StressfulInteger {

  companion object {
    private var VALUE = 284
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number142()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number569()
      val right = Number570()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number283()
    val b = Number282()
    return a.fib() + b.fib()
  }

}

class Number285 : StressfulInteger {

  companion object {
    private var VALUE = 285
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number142()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number571()
      val right = Number572()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number284()
    val b = Number283()
    return a.fib() + b.fib()
  }

}

class Number286 : StressfulInteger {

  companion object {
    private var VALUE = 286
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number143()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number573()
      val right = Number574()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number285()
    val b = Number284()
    return a.fib() + b.fib()
  }

}

class Number287 : StressfulInteger {

  companion object {
    private var VALUE = 287
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number143()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number575()
      val right = Number576()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number286()
    val b = Number285()
    return a.fib() + b.fib()
  }

}

class Number288 : StressfulInteger {

  companion object {
    private var VALUE = 288
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number144()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number577()
      val right = Number578()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number287()
    val b = Number286()
    return a.fib() + b.fib()
  }

}

class Number289 : StressfulInteger {

  companion object {
    private var VALUE = 289
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number144()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number579()
      val right = Number580()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number288()
    val b = Number287()
    return a.fib() + b.fib()
  }

}

class Number290 : StressfulInteger {

  companion object {
    private var VALUE = 290
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number145()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number581()
      val right = Number582()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number289()
    val b = Number288()
    return a.fib() + b.fib()
  }

}

class Number291 : StressfulInteger {

  companion object {
    private var VALUE = 291
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number145()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number583()
      val right = Number584()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number290()
    val b = Number289()
    return a.fib() + b.fib()
  }

}

class Number292 : StressfulInteger {

  companion object {
    private var VALUE = 292
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number146()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number585()
      val right = Number586()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number291()
    val b = Number290()
    return a.fib() + b.fib()
  }

}

class Number293 : StressfulInteger {

  companion object {
    private var VALUE = 293
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number146()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number587()
      val right = Number588()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number292()
    val b = Number291()
    return a.fib() + b.fib()
  }

}

class Number294 : StressfulInteger {

  companion object {
    private var VALUE = 294
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number147()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number589()
      val right = Number590()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number293()
    val b = Number292()
    return a.fib() + b.fib()
  }

}

class Number295 : StressfulInteger {

  companion object {
    private var VALUE = 295
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number147()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number591()
      val right = Number592()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number294()
    val b = Number293()
    return a.fib() + b.fib()
  }

}

class Number296 : StressfulInteger {

  companion object {
    private var VALUE = 296
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number148()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number593()
      val right = Number594()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number295()
    val b = Number294()
    return a.fib() + b.fib()
  }

}

class Number297 : StressfulInteger {

  companion object {
    private var VALUE = 297
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number148()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number595()
      val right = Number596()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number296()
    val b = Number295()
    return a.fib() + b.fib()
  }

}

class Number298 : StressfulInteger {

  companion object {
    private var VALUE = 298
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number149()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number597()
      val right = Number598()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number297()
    val b = Number296()
    return a.fib() + b.fib()
  }

}

class Number299 : StressfulInteger {

  companion object {
    private var VALUE = 299
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number149()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number599()
      val right = Number600()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number298()
    val b = Number297()
    return a.fib() + b.fib()
  }

}

class Number300 : StressfulInteger {

  companion object {
    private var VALUE = 300
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number150()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number601()
      val right = Number602()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number299()
    val b = Number298()
    return a.fib() + b.fib()
  }

}

class Number301 : StressfulInteger {

  companion object {
    private var VALUE = 301
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number150()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number603()
      val right = Number604()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number300()
    val b = Number299()
    return a.fib() + b.fib()
  }

}

class Number302 : StressfulInteger {

  companion object {
    private var VALUE = 302
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number151()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number605()
      val right = Number606()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number301()
    val b = Number300()
    return a.fib() + b.fib()
  }

}

class Number303 : StressfulInteger {

  companion object {
    private var VALUE = 303
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number151()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number607()
      val right = Number608()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number302()
    val b = Number301()
    return a.fib() + b.fib()
  }

}

class Number304 : StressfulInteger {

  companion object {
    private var VALUE = 304
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number152()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number609()
      val right = Number610()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number303()
    val b = Number302()
    return a.fib() + b.fib()
  }

}

class Number305 : StressfulInteger {

  companion object {
    private var VALUE = 305
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number152()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number611()
      val right = Number612()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number304()
    val b = Number303()
    return a.fib() + b.fib()
  }

}

class Number306 : StressfulInteger {

  companion object {
    private var VALUE = 306
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number153()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number613()
      val right = Number614()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number305()
    val b = Number304()
    return a.fib() + b.fib()
  }

}

class Number307 : StressfulInteger {

  companion object {
    private var VALUE = 307
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number153()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number615()
      val right = Number616()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number306()
    val b = Number305()
    return a.fib() + b.fib()
  }

}

class Number308 : StressfulInteger {

  companion object {
    private var VALUE = 308
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number154()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number617()
      val right = Number618()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number307()
    val b = Number306()
    return a.fib() + b.fib()
  }

}

class Number309 : StressfulInteger {

  companion object {
    private var VALUE = 309
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number154()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number619()
      val right = Number620()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number308()
    val b = Number307()
    return a.fib() + b.fib()
  }

}

class Number310 : StressfulInteger {

  companion object {
    private var VALUE = 310
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number155()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number621()
      val right = Number622()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number309()
    val b = Number308()
    return a.fib() + b.fib()
  }

}

class Number311 : StressfulInteger {

  companion object {
    private var VALUE = 311
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number155()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number623()
      val right = Number624()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number310()
    val b = Number309()
    return a.fib() + b.fib()
  }

}

class Number312 : StressfulInteger {

  companion object {
    private var VALUE = 312
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number156()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number625()
      val right = Number626()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number311()
    val b = Number310()
    return a.fib() + b.fib()
  }

}

class Number313 : StressfulInteger {

  companion object {
    private var VALUE = 313
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number156()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number627()
      val right = Number628()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number312()
    val b = Number311()
    return a.fib() + b.fib()
  }

}

class Number314 : StressfulInteger {

  companion object {
    private var VALUE = 314
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number157()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number629()
      val right = Number630()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number313()
    val b = Number312()
    return a.fib() + b.fib()
  }

}

class Number315 : StressfulInteger {

  companion object {
    private var VALUE = 315
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number157()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number631()
      val right = Number632()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number314()
    val b = Number313()
    return a.fib() + b.fib()
  }

}

class Number316 : StressfulInteger {

  companion object {
    private var VALUE = 316
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number158()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number633()
      val right = Number634()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number315()
    val b = Number314()
    return a.fib() + b.fib()
  }

}

class Number317 : StressfulInteger {

  companion object {
    private var VALUE = 317
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number158()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number635()
      val right = Number636()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number316()
    val b = Number315()
    return a.fib() + b.fib()
  }

}

class Number318 : StressfulInteger {

  companion object {
    private var VALUE = 318
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number159()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number637()
      val right = Number638()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number317()
    val b = Number316()
    return a.fib() + b.fib()
  }

}

class Number319 : StressfulInteger {

  companion object {
    private var VALUE = 319
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number159()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number639()
      val right = Number640()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number318()
    val b = Number317()
    return a.fib() + b.fib()
  }

}

class Number320 : StressfulInteger {

  companion object {
    private var VALUE = 320
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number160()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number641()
      val right = Number642()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number319()
    val b = Number318()
    return a.fib() + b.fib()
  }

}

class Number321 : StressfulInteger {

  companion object {
    private var VALUE = 321
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number160()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number643()
      val right = Number644()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number320()
    val b = Number319()
    return a.fib() + b.fib()
  }

}

class Number322 : StressfulInteger {

  companion object {
    private var VALUE = 322
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number161()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number645()
      val right = Number646()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number321()
    val b = Number320()
    return a.fib() + b.fib()
  }

}

class Number323 : StressfulInteger {

  companion object {
    private var VALUE = 323
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number161()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number647()
      val right = Number648()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number322()
    val b = Number321()
    return a.fib() + b.fib()
  }

}

class Number324 : StressfulInteger {

  companion object {
    private var VALUE = 324
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number162()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number649()
      val right = Number650()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number323()
    val b = Number322()
    return a.fib() + b.fib()
  }

}

class Number325 : StressfulInteger {

  companion object {
    private var VALUE = 325
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number162()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number651()
      val right = Number652()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number324()
    val b = Number323()
    return a.fib() + b.fib()
  }

}

class Number326 : StressfulInteger {

  companion object {
    private var VALUE = 326
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number163()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number653()
      val right = Number654()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number325()
    val b = Number324()
    return a.fib() + b.fib()
  }

}

class Number327 : StressfulInteger {

  companion object {
    private var VALUE = 327
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number163()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number655()
      val right = Number656()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number326()
    val b = Number325()
    return a.fib() + b.fib()
  }

}

class Number328 : StressfulInteger {

  companion object {
    private var VALUE = 328
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number164()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number657()
      val right = Number658()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number327()
    val b = Number326()
    return a.fib() + b.fib()
  }

}

class Number329 : StressfulInteger {

  companion object {
    private var VALUE = 329
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number164()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number659()
      val right = Number660()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number328()
    val b = Number327()
    return a.fib() + b.fib()
  }

}

class Number330 : StressfulInteger {

  companion object {
    private var VALUE = 330
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number165()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number661()
      val right = Number662()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number329()
    val b = Number328()
    return a.fib() + b.fib()
  }

}

class Number331 : StressfulInteger {

  companion object {
    private var VALUE = 331
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number165()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number663()
      val right = Number664()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number330()
    val b = Number329()
    return a.fib() + b.fib()
  }

}

class Number332 : StressfulInteger {

  companion object {
    private var VALUE = 332
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number166()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number665()
      val right = Number666()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number331()
    val b = Number330()
    return a.fib() + b.fib()
  }

}

class Number333 : StressfulInteger {

  companion object {
    private var VALUE = 333
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number166()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number667()
      val right = Number668()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number332()
    val b = Number331()
    return a.fib() + b.fib()
  }

}

class Number334 : StressfulInteger {

  companion object {
    private var VALUE = 334
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number167()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number669()
      val right = Number670()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number333()
    val b = Number332()
    return a.fib() + b.fib()
  }

}

class Number335 : StressfulInteger {

  companion object {
    private var VALUE = 335
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number167()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number671()
      val right = Number672()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number334()
    val b = Number333()
    return a.fib() + b.fib()
  }

}

class Number336 : StressfulInteger {

  companion object {
    private var VALUE = 336
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number168()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number673()
      val right = Number674()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number335()
    val b = Number334()
    return a.fib() + b.fib()
  }

}

class Number337 : StressfulInteger {

  companion object {
    private var VALUE = 337
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number168()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number675()
      val right = Number676()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number336()
    val b = Number335()
    return a.fib() + b.fib()
  }

}

class Number338 : StressfulInteger {

  companion object {
    private var VALUE = 338
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number169()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number677()
      val right = Number678()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number337()
    val b = Number336()
    return a.fib() + b.fib()
  }

}

class Number339 : StressfulInteger {

  companion object {
    private var VALUE = 339
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number169()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number679()
      val right = Number680()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number338()
    val b = Number337()
    return a.fib() + b.fib()
  }

}

class Number340 : StressfulInteger {

  companion object {
    private var VALUE = 340
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number170()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number681()
      val right = Number682()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number339()
    val b = Number338()
    return a.fib() + b.fib()
  }

}

class Number341 : StressfulInteger {

  companion object {
    private var VALUE = 341
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number170()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number683()
      val right = Number684()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number340()
    val b = Number339()
    return a.fib() + b.fib()
  }

}

class Number342 : StressfulInteger {

  companion object {
    private var VALUE = 342
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number171()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number685()
      val right = Number686()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number341()
    val b = Number340()
    return a.fib() + b.fib()
  }

}

class Number343 : StressfulInteger {

  companion object {
    private var VALUE = 343
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number171()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number687()
      val right = Number688()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number342()
    val b = Number341()
    return a.fib() + b.fib()
  }

}

class Number344 : StressfulInteger {

  companion object {
    private var VALUE = 344
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number172()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number689()
      val right = Number690()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number343()
    val b = Number342()
    return a.fib() + b.fib()
  }

}

class Number345 : StressfulInteger {

  companion object {
    private var VALUE = 345
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number172()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number691()
      val right = Number692()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number344()
    val b = Number343()
    return a.fib() + b.fib()
  }

}

class Number346 : StressfulInteger {

  companion object {
    private var VALUE = 346
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number173()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number693()
      val right = Number694()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number345()
    val b = Number344()
    return a.fib() + b.fib()
  }

}

class Number347 : StressfulInteger {

  companion object {
    private var VALUE = 347
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number173()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number695()
      val right = Number696()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number346()
    val b = Number345()
    return a.fib() + b.fib()
  }

}

class Number348 : StressfulInteger {

  companion object {
    private var VALUE = 348
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number174()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number697()
      val right = Number698()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number347()
    val b = Number346()
    return a.fib() + b.fib()
  }

}

class Number349 : StressfulInteger {

  companion object {
    private var VALUE = 349
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number174()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number699()
      val right = Number700()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number348()
    val b = Number347()
    return a.fib() + b.fib()
  }

}

class Number350 : StressfulInteger {

  companion object {
    private var VALUE = 350
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number175()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number701()
      val right = Number702()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number349()
    val b = Number348()
    return a.fib() + b.fib()
  }

}

class Number351 : StressfulInteger {

  companion object {
    private var VALUE = 351
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number175()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number703()
      val right = Number704()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number350()
    val b = Number349()
    return a.fib() + b.fib()
  }

}

class Number352 : StressfulInteger {

  companion object {
    private var VALUE = 352
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number176()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number705()
      val right = Number706()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number351()
    val b = Number350()
    return a.fib() + b.fib()
  }

}

class Number353 : StressfulInteger {

  companion object {
    private var VALUE = 353
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number176()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number707()
      val right = Number708()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number352()
    val b = Number351()
    return a.fib() + b.fib()
  }

}

class Number354 : StressfulInteger {

  companion object {
    private var VALUE = 354
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number177()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number709()
      val right = Number710()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number353()
    val b = Number352()
    return a.fib() + b.fib()
  }

}

class Number355 : StressfulInteger {

  companion object {
    private var VALUE = 355
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number177()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number711()
      val right = Number712()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number354()
    val b = Number353()
    return a.fib() + b.fib()
  }

}

class Number356 : StressfulInteger {

  companion object {
    private var VALUE = 356
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number178()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number713()
      val right = Number714()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number355()
    val b = Number354()
    return a.fib() + b.fib()
  }

}

class Number357 : StressfulInteger {

  companion object {
    private var VALUE = 357
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number178()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number715()
      val right = Number716()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number356()
    val b = Number355()
    return a.fib() + b.fib()
  }

}

class Number358 : StressfulInteger {

  companion object {
    private var VALUE = 358
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number179()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number717()
      val right = Number718()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number357()
    val b = Number356()
    return a.fib() + b.fib()
  }

}

class Number359 : StressfulInteger {

  companion object {
    private var VALUE = 359
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number179()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number719()
      val right = Number720()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number358()
    val b = Number357()
    return a.fib() + b.fib()
  }

}

class Number360 : StressfulInteger {

  companion object {
    private var VALUE = 360
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number180()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number721()
      val right = Number722()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number359()
    val b = Number358()
    return a.fib() + b.fib()
  }

}

class Number361 : StressfulInteger {

  companion object {
    private var VALUE = 361
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number180()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number723()
      val right = Number724()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number360()
    val b = Number359()
    return a.fib() + b.fib()
  }

}

class Number362 : StressfulInteger {

  companion object {
    private var VALUE = 362
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number181()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number725()
      val right = Number726()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number361()
    val b = Number360()
    return a.fib() + b.fib()
  }

}

class Number363 : StressfulInteger {

  companion object {
    private var VALUE = 363
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number181()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number727()
      val right = Number728()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number362()
    val b = Number361()
    return a.fib() + b.fib()
  }

}

class Number364 : StressfulInteger {

  companion object {
    private var VALUE = 364
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number182()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number729()
      val right = Number730()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number363()
    val b = Number362()
    return a.fib() + b.fib()
  }

}

class Number365 : StressfulInteger {

  companion object {
    private var VALUE = 365
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number182()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number731()
      val right = Number732()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number364()
    val b = Number363()
    return a.fib() + b.fib()
  }

}

class Number366 : StressfulInteger {

  companion object {
    private var VALUE = 366
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number183()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number733()
      val right = Number734()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number365()
    val b = Number364()
    return a.fib() + b.fib()
  }

}

class Number367 : StressfulInteger {

  companion object {
    private var VALUE = 367
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number183()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number735()
      val right = Number736()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number366()
    val b = Number365()
    return a.fib() + b.fib()
  }

}

class Number368 : StressfulInteger {

  companion object {
    private var VALUE = 368
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number184()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number737()
      val right = Number738()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number367()
    val b = Number366()
    return a.fib() + b.fib()
  }

}

class Number369 : StressfulInteger {

  companion object {
    private var VALUE = 369
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number184()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number739()
      val right = Number740()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number368()
    val b = Number367()
    return a.fib() + b.fib()
  }

}

class Number370 : StressfulInteger {

  companion object {
    private var VALUE = 370
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number185()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number741()
      val right = Number742()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number369()
    val b = Number368()
    return a.fib() + b.fib()
  }

}

class Number371 : StressfulInteger {

  companion object {
    private var VALUE = 371
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number185()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number743()
      val right = Number744()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number370()
    val b = Number369()
    return a.fib() + b.fib()
  }

}

class Number372 : StressfulInteger {

  companion object {
    private var VALUE = 372
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number186()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number745()
      val right = Number746()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number371()
    val b = Number370()
    return a.fib() + b.fib()
  }

}

class Number373 : StressfulInteger {

  companion object {
    private var VALUE = 373
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number186()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number747()
      val right = Number748()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number372()
    val b = Number371()
    return a.fib() + b.fib()
  }

}

class Number374 : StressfulInteger {

  companion object {
    private var VALUE = 374
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number187()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number749()
      val right = Number750()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number373()
    val b = Number372()
    return a.fib() + b.fib()
  }

}

class Number375 : StressfulInteger {

  companion object {
    private var VALUE = 375
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number187()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number751()
      val right = Number752()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number374()
    val b = Number373()
    return a.fib() + b.fib()
  }

}

class Number376 : StressfulInteger {

  companion object {
    private var VALUE = 376
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number188()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number753()
      val right = Number754()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number375()
    val b = Number374()
    return a.fib() + b.fib()
  }

}

class Number377 : StressfulInteger {

  companion object {
    private var VALUE = 377
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number188()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number755()
      val right = Number756()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number376()
    val b = Number375()
    return a.fib() + b.fib()
  }

}

class Number378 : StressfulInteger {

  companion object {
    private var VALUE = 378
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number189()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number757()
      val right = Number758()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number377()
    val b = Number376()
    return a.fib() + b.fib()
  }

}

class Number379 : StressfulInteger {

  companion object {
    private var VALUE = 379
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number189()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number759()
      val right = Number760()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number378()
    val b = Number377()
    return a.fib() + b.fib()
  }

}

class Number380 : StressfulInteger {

  companion object {
    private var VALUE = 380
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number190()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number761()
      val right = Number762()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number379()
    val b = Number378()
    return a.fib() + b.fib()
  }

}

class Number381 : StressfulInteger {

  companion object {
    private var VALUE = 381
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number190()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number763()
      val right = Number764()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number380()
    val b = Number379()
    return a.fib() + b.fib()
  }

}

class Number382 : StressfulInteger {

  companion object {
    private var VALUE = 382
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number191()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number765()
      val right = Number766()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number381()
    val b = Number380()
    return a.fib() + b.fib()
  }

}

class Number383 : StressfulInteger {

  companion object {
    private var VALUE = 383
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number191()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number767()
      val right = Number768()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number382()
    val b = Number381()
    return a.fib() + b.fib()
  }

}

class Number384 : StressfulInteger {

  companion object {
    private var VALUE = 384
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number192()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number769()
      val right = Number770()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number383()
    val b = Number382()
    return a.fib() + b.fib()
  }

}

class Number385 : StressfulInteger {

  companion object {
    private var VALUE = 385
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number192()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number771()
      val right = Number772()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number384()
    val b = Number383()
    return a.fib() + b.fib()
  }

}

class Number386 : StressfulInteger {

  companion object {
    private var VALUE = 386
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number193()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number773()
      val right = Number774()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number385()
    val b = Number384()
    return a.fib() + b.fib()
  }

}

class Number387 : StressfulInteger {

  companion object {
    private var VALUE = 387
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number193()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number775()
      val right = Number776()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number386()
    val b = Number385()
    return a.fib() + b.fib()
  }

}

class Number388 : StressfulInteger {

  companion object {
    private var VALUE = 388
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number194()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number777()
      val right = Number778()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number387()
    val b = Number386()
    return a.fib() + b.fib()
  }

}

class Number389 : StressfulInteger {

  companion object {
    private var VALUE = 389
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number194()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number779()
      val right = Number780()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number388()
    val b = Number387()
    return a.fib() + b.fib()
  }

}

class Number390 : StressfulInteger {

  companion object {
    private var VALUE = 390
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number195()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number781()
      val right = Number782()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number389()
    val b = Number388()
    return a.fib() + b.fib()
  }

}

class Number391 : StressfulInteger {

  companion object {
    private var VALUE = 391
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number195()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number783()
      val right = Number784()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number390()
    val b = Number389()
    return a.fib() + b.fib()
  }

}

class Number392 : StressfulInteger {

  companion object {
    private var VALUE = 392
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number196()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number785()
      val right = Number786()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number391()
    val b = Number390()
    return a.fib() + b.fib()
  }

}

class Number393 : StressfulInteger {

  companion object {
    private var VALUE = 393
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number196()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number787()
      val right = Number788()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number392()
    val b = Number391()
    return a.fib() + b.fib()
  }

}

class Number394 : StressfulInteger {

  companion object {
    private var VALUE = 394
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number197()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number789()
      val right = Number790()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number393()
    val b = Number392()
    return a.fib() + b.fib()
  }

}

class Number395 : StressfulInteger {

  companion object {
    private var VALUE = 395
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number197()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number791()
      val right = Number792()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number394()
    val b = Number393()
    return a.fib() + b.fib()
  }

}

class Number396 : StressfulInteger {

  companion object {
    private var VALUE = 396
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number198()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number793()
      val right = Number794()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number395()
    val b = Number394()
    return a.fib() + b.fib()
  }

}

class Number397 : StressfulInteger {

  companion object {
    private var VALUE = 397
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number198()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number795()
      val right = Number796()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number396()
    val b = Number395()
    return a.fib() + b.fib()
  }

}

class Number398 : StressfulInteger {

  companion object {
    private var VALUE = 398
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number199()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number797()
      val right = Number798()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number397()
    val b = Number396()
    return a.fib() + b.fib()
  }

}

class Number399 : StressfulInteger {

  companion object {
    private var VALUE = 399
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number199()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number799()
      val right = Number800()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number398()
    val b = Number397()
    return a.fib() + b.fib()
  }

}

class Number400 : StressfulInteger {

  companion object {
    private var VALUE = 400
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number200()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number801()
      val right = Number802()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number399()
    val b = Number398()
    return a.fib() + b.fib()
  }

}

class Number401 : StressfulInteger {

  companion object {
    private var VALUE = 401
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number200()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number803()
      val right = Number804()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number400()
    val b = Number399()
    return a.fib() + b.fib()
  }

}

class Number402 : StressfulInteger {

  companion object {
    private var VALUE = 402
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number201()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number805()
      val right = Number806()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number401()
    val b = Number400()
    return a.fib() + b.fib()
  }

}

class Number403 : StressfulInteger {

  companion object {
    private var VALUE = 403
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number201()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number807()
      val right = Number808()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number402()
    val b = Number401()
    return a.fib() + b.fib()
  }

}

class Number404 : StressfulInteger {

  companion object {
    private var VALUE = 404
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number202()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number809()
      val right = Number810()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number403()
    val b = Number402()
    return a.fib() + b.fib()
  }

}

class Number405 : StressfulInteger {

  companion object {
    private var VALUE = 405
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number202()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number811()
      val right = Number812()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number404()
    val b = Number403()
    return a.fib() + b.fib()
  }

}

class Number406 : StressfulInteger {

  companion object {
    private var VALUE = 406
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number203()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number813()
      val right = Number814()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number405()
    val b = Number404()
    return a.fib() + b.fib()
  }

}

class Number407 : StressfulInteger {

  companion object {
    private var VALUE = 407
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number203()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number815()
      val right = Number816()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number406()
    val b = Number405()
    return a.fib() + b.fib()
  }

}

class Number408 : StressfulInteger {

  companion object {
    private var VALUE = 408
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number204()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number817()
      val right = Number818()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number407()
    val b = Number406()
    return a.fib() + b.fib()
  }

}

class Number409 : StressfulInteger {

  companion object {
    private var VALUE = 409
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number204()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number819()
      val right = Number820()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number408()
    val b = Number407()
    return a.fib() + b.fib()
  }

}

class Number410 : StressfulInteger {

  companion object {
    private var VALUE = 410
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number205()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number821()
      val right = Number822()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number409()
    val b = Number408()
    return a.fib() + b.fib()
  }

}

class Number411 : StressfulInteger {

  companion object {
    private var VALUE = 411
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number205()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number823()
      val right = Number824()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number410()
    val b = Number409()
    return a.fib() + b.fib()
  }

}

class Number412 : StressfulInteger {

  companion object {
    private var VALUE = 412
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number206()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number825()
      val right = Number826()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number411()
    val b = Number410()
    return a.fib() + b.fib()
  }

}

class Number413 : StressfulInteger {

  companion object {
    private var VALUE = 413
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number206()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number827()
      val right = Number828()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number412()
    val b = Number411()
    return a.fib() + b.fib()
  }

}

class Number414 : StressfulInteger {

  companion object {
    private var VALUE = 414
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number207()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number829()
      val right = Number830()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number413()
    val b = Number412()
    return a.fib() + b.fib()
  }

}

class Number415 : StressfulInteger {

  companion object {
    private var VALUE = 415
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number207()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number831()
      val right = Number832()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number414()
    val b = Number413()
    return a.fib() + b.fib()
  }

}

class Number416 : StressfulInteger {

  companion object {
    private var VALUE = 416
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number208()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number833()
      val right = Number834()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number415()
    val b = Number414()
    return a.fib() + b.fib()
  }

}

class Number417 : StressfulInteger {

  companion object {
    private var VALUE = 417
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number208()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number835()
      val right = Number836()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number416()
    val b = Number415()
    return a.fib() + b.fib()
  }

}

class Number418 : StressfulInteger {

  companion object {
    private var VALUE = 418
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number209()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number837()
      val right = Number838()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number417()
    val b = Number416()
    return a.fib() + b.fib()
  }

}

class Number419 : StressfulInteger {

  companion object {
    private var VALUE = 419
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number209()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number839()
      val right = Number840()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number418()
    val b = Number417()
    return a.fib() + b.fib()
  }

}

class Number420 : StressfulInteger {

  companion object {
    private var VALUE = 420
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number210()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number841()
      val right = Number842()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number419()
    val b = Number418()
    return a.fib() + b.fib()
  }

}

class Number421 : StressfulInteger {

  companion object {
    private var VALUE = 421
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number210()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number843()
      val right = Number844()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number420()
    val b = Number419()
    return a.fib() + b.fib()
  }

}

class Number422 : StressfulInteger {

  companion object {
    private var VALUE = 422
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number211()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number845()
      val right = Number846()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number421()
    val b = Number420()
    return a.fib() + b.fib()
  }

}

class Number423 : StressfulInteger {

  companion object {
    private var VALUE = 423
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number211()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number847()
      val right = Number848()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number422()
    val b = Number421()
    return a.fib() + b.fib()
  }

}

class Number424 : StressfulInteger {

  companion object {
    private var VALUE = 424
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number212()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number849()
      val right = Number850()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number423()
    val b = Number422()
    return a.fib() + b.fib()
  }

}

class Number425 : StressfulInteger {

  companion object {
    private var VALUE = 425
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number212()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number851()
      val right = Number852()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number424()
    val b = Number423()
    return a.fib() + b.fib()
  }

}

class Number426 : StressfulInteger {

  companion object {
    private var VALUE = 426
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number213()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number853()
      val right = Number854()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number425()
    val b = Number424()
    return a.fib() + b.fib()
  }

}

class Number427 : StressfulInteger {

  companion object {
    private var VALUE = 427
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number213()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number855()
      val right = Number856()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number426()
    val b = Number425()
    return a.fib() + b.fib()
  }

}

class Number428 : StressfulInteger {

  companion object {
    private var VALUE = 428
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number214()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number857()
      val right = Number858()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number427()
    val b = Number426()
    return a.fib() + b.fib()
  }

}

class Number429 : StressfulInteger {

  companion object {
    private var VALUE = 429
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number214()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number859()
      val right = Number860()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number428()
    val b = Number427()
    return a.fib() + b.fib()
  }

}

class Number430 : StressfulInteger {

  companion object {
    private var VALUE = 430
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number215()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number861()
      val right = Number862()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number429()
    val b = Number428()
    return a.fib() + b.fib()
  }

}

class Number431 : StressfulInteger {

  companion object {
    private var VALUE = 431
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number215()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number863()
      val right = Number864()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number430()
    val b = Number429()
    return a.fib() + b.fib()
  }

}

class Number432 : StressfulInteger {

  companion object {
    private var VALUE = 432
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number216()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number865()
      val right = Number866()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number431()
    val b = Number430()
    return a.fib() + b.fib()
  }

}

class Number433 : StressfulInteger {

  companion object {
    private var VALUE = 433
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number216()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number867()
      val right = Number868()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number432()
    val b = Number431()
    return a.fib() + b.fib()
  }

}

class Number434 : StressfulInteger {

  companion object {
    private var VALUE = 434
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number217()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number869()
      val right = Number870()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number433()
    val b = Number432()
    return a.fib() + b.fib()
  }

}

class Number435 : StressfulInteger {

  companion object {
    private var VALUE = 435
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number217()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number871()
      val right = Number872()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number434()
    val b = Number433()
    return a.fib() + b.fib()
  }

}

class Number436 : StressfulInteger {

  companion object {
    private var VALUE = 436
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number218()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number873()
      val right = Number874()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number435()
    val b = Number434()
    return a.fib() + b.fib()
  }

}

class Number437 : StressfulInteger {

  companion object {
    private var VALUE = 437
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number218()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number875()
      val right = Number876()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number436()
    val b = Number435()
    return a.fib() + b.fib()
  }

}

class Number438 : StressfulInteger {

  companion object {
    private var VALUE = 438
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number219()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number877()
      val right = Number878()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number437()
    val b = Number436()
    return a.fib() + b.fib()
  }

}

class Number439 : StressfulInteger {

  companion object {
    private var VALUE = 439
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number219()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number879()
      val right = Number880()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number438()
    val b = Number437()
    return a.fib() + b.fib()
  }

}

class Number440 : StressfulInteger {

  companion object {
    private var VALUE = 440
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number220()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number881()
      val right = Number882()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number439()
    val b = Number438()
    return a.fib() + b.fib()
  }

}

class Number441 : StressfulInteger {

  companion object {
    private var VALUE = 441
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number220()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number883()
      val right = Number884()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number440()
    val b = Number439()
    return a.fib() + b.fib()
  }

}

class Number442 : StressfulInteger {

  companion object {
    private var VALUE = 442
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number221()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number885()
      val right = Number886()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number441()
    val b = Number440()
    return a.fib() + b.fib()
  }

}

class Number443 : StressfulInteger {

  companion object {
    private var VALUE = 443
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number221()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number887()
      val right = Number888()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number442()
    val b = Number441()
    return a.fib() + b.fib()
  }

}

class Number444 : StressfulInteger {

  companion object {
    private var VALUE = 444
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number222()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number889()
      val right = Number890()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number443()
    val b = Number442()
    return a.fib() + b.fib()
  }

}

class Number445 : StressfulInteger {

  companion object {
    private var VALUE = 445
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number222()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number891()
      val right = Number892()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number444()
    val b = Number443()
    return a.fib() + b.fib()
  }

}

class Number446 : StressfulInteger {

  companion object {
    private var VALUE = 446
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number223()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number893()
      val right = Number894()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number445()
    val b = Number444()
    return a.fib() + b.fib()
  }

}

class Number447 : StressfulInteger {

  companion object {
    private var VALUE = 447
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number223()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number895()
      val right = Number896()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number446()
    val b = Number445()
    return a.fib() + b.fib()
  }

}

class Number448 : StressfulInteger {

  companion object {
    private var VALUE = 448
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number224()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number897()
      val right = Number898()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number447()
    val b = Number446()
    return a.fib() + b.fib()
  }

}

class Number449 : StressfulInteger {

  companion object {
    private var VALUE = 449
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number224()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number899()
      val right = Number900()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number448()
    val b = Number447()
    return a.fib() + b.fib()
  }

}

class Number450 : StressfulInteger {

  companion object {
    private var VALUE = 450
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number225()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number901()
      val right = Number902()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number449()
    val b = Number448()
    return a.fib() + b.fib()
  }

}

class Number451 : StressfulInteger {

  companion object {
    private var VALUE = 451
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number225()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number903()
      val right = Number904()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number450()
    val b = Number449()
    return a.fib() + b.fib()
  }

}

class Number452 : StressfulInteger {

  companion object {
    private var VALUE = 452
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number226()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number905()
      val right = Number906()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number451()
    val b = Number450()
    return a.fib() + b.fib()
  }

}

class Number453 : StressfulInteger {

  companion object {
    private var VALUE = 453
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number226()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number907()
      val right = Number908()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number452()
    val b = Number451()
    return a.fib() + b.fib()
  }

}

class Number454 : StressfulInteger {

  companion object {
    private var VALUE = 454
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number227()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number909()
      val right = Number910()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number453()
    val b = Number452()
    return a.fib() + b.fib()
  }

}

class Number455 : StressfulInteger {

  companion object {
    private var VALUE = 455
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number227()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number911()
      val right = Number912()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number454()
    val b = Number453()
    return a.fib() + b.fib()
  }

}

class Number456 : StressfulInteger {

  companion object {
    private var VALUE = 456
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number228()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number913()
      val right = Number914()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number455()
    val b = Number454()
    return a.fib() + b.fib()
  }

}

class Number457 : StressfulInteger {

  companion object {
    private var VALUE = 457
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number228()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number915()
      val right = Number916()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number456()
    val b = Number455()
    return a.fib() + b.fib()
  }

}

class Number458 : StressfulInteger {

  companion object {
    private var VALUE = 458
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number229()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number917()
      val right = Number918()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number457()
    val b = Number456()
    return a.fib() + b.fib()
  }

}

class Number459 : StressfulInteger {

  companion object {
    private var VALUE = 459
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number229()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number919()
      val right = Number920()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number458()
    val b = Number457()
    return a.fib() + b.fib()
  }

}

class Number460 : StressfulInteger {

  companion object {
    private var VALUE = 460
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number230()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number921()
      val right = Number922()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number459()
    val b = Number458()
    return a.fib() + b.fib()
  }

}

class Number461 : StressfulInteger {

  companion object {
    private var VALUE = 461
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number230()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number923()
      val right = Number924()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number460()
    val b = Number459()
    return a.fib() + b.fib()
  }

}

class Number462 : StressfulInteger {

  companion object {
    private var VALUE = 462
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number231()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number925()
      val right = Number926()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number461()
    val b = Number460()
    return a.fib() + b.fib()
  }

}

class Number463 : StressfulInteger {

  companion object {
    private var VALUE = 463
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number231()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number927()
      val right = Number928()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number462()
    val b = Number461()
    return a.fib() + b.fib()
  }

}

class Number464 : StressfulInteger {

  companion object {
    private var VALUE = 464
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number232()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number929()
      val right = Number930()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number463()
    val b = Number462()
    return a.fib() + b.fib()
  }

}

class Number465 : StressfulInteger {

  companion object {
    private var VALUE = 465
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number232()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number931()
      val right = Number932()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number464()
    val b = Number463()
    return a.fib() + b.fib()
  }

}

class Number466 : StressfulInteger {

  companion object {
    private var VALUE = 466
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number233()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number933()
      val right = Number934()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number465()
    val b = Number464()
    return a.fib() + b.fib()
  }

}

class Number467 : StressfulInteger {

  companion object {
    private var VALUE = 467
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number233()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number935()
      val right = Number936()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number466()
    val b = Number465()
    return a.fib() + b.fib()
  }

}

class Number468 : StressfulInteger {

  companion object {
    private var VALUE = 468
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number234()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number937()
      val right = Number938()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number467()
    val b = Number466()
    return a.fib() + b.fib()
  }

}

class Number469 : StressfulInteger {

  companion object {
    private var VALUE = 469
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number234()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number939()
      val right = Number940()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number468()
    val b = Number467()
    return a.fib() + b.fib()
  }

}

class Number470 : StressfulInteger {

  companion object {
    private var VALUE = 470
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number235()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number941()
      val right = Number942()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number469()
    val b = Number468()
    return a.fib() + b.fib()
  }

}

class Number471 : StressfulInteger {

  companion object {
    private var VALUE = 471
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number235()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number943()
      val right = Number944()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number470()
    val b = Number469()
    return a.fib() + b.fib()
  }

}

class Number472 : StressfulInteger {

  companion object {
    private var VALUE = 472
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number236()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number945()
      val right = Number946()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number471()
    val b = Number470()
    return a.fib() + b.fib()
  }

}

class Number473 : StressfulInteger {

  companion object {
    private var VALUE = 473
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number236()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number947()
      val right = Number948()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number472()
    val b = Number471()
    return a.fib() + b.fib()
  }

}

class Number474 : StressfulInteger {

  companion object {
    private var VALUE = 474
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number237()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number949()
      val right = Number950()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number473()
    val b = Number472()
    return a.fib() + b.fib()
  }

}

class Number475 : StressfulInteger {

  companion object {
    private var VALUE = 475
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number237()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number951()
      val right = Number952()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number474()
    val b = Number473()
    return a.fib() + b.fib()
  }

}

class Number476 : StressfulInteger {

  companion object {
    private var VALUE = 476
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number238()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number953()
      val right = Number954()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number475()
    val b = Number474()
    return a.fib() + b.fib()
  }

}

class Number477 : StressfulInteger {

  companion object {
    private var VALUE = 477
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number238()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number955()
      val right = Number956()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number476()
    val b = Number475()
    return a.fib() + b.fib()
  }

}

class Number478 : StressfulInteger {

  companion object {
    private var VALUE = 478
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number239()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number957()
      val right = Number958()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number477()
    val b = Number476()
    return a.fib() + b.fib()
  }

}

class Number479 : StressfulInteger {

  companion object {
    private var VALUE = 479
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number239()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number959()
      val right = Number960()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number478()
    val b = Number477()
    return a.fib() + b.fib()
  }

}

class Number480 : StressfulInteger {

  companion object {
    private var VALUE = 480
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number240()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number961()
      val right = Number962()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number479()
    val b = Number478()
    return a.fib() + b.fib()
  }

}

class Number481 : StressfulInteger {

  companion object {
    private var VALUE = 481
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number240()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number963()
      val right = Number964()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number480()
    val b = Number479()
    return a.fib() + b.fib()
  }

}

class Number482 : StressfulInteger {

  companion object {
    private var VALUE = 482
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number241()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number965()
      val right = Number966()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number481()
    val b = Number480()
    return a.fib() + b.fib()
  }

}

class Number483 : StressfulInteger {

  companion object {
    private var VALUE = 483
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number241()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number967()
      val right = Number968()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number482()
    val b = Number481()
    return a.fib() + b.fib()
  }

}

class Number484 : StressfulInteger {

  companion object {
    private var VALUE = 484
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number242()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number969()
      val right = Number970()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number483()
    val b = Number482()
    return a.fib() + b.fib()
  }

}

class Number485 : StressfulInteger {

  companion object {
    private var VALUE = 485
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number242()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number971()
      val right = Number972()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number484()
    val b = Number483()
    return a.fib() + b.fib()
  }

}

class Number486 : StressfulInteger {

  companion object {
    private var VALUE = 486
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number243()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number973()
      val right = Number974()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number485()
    val b = Number484()
    return a.fib() + b.fib()
  }

}

class Number487 : StressfulInteger {

  companion object {
    private var VALUE = 487
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number243()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number975()
      val right = Number976()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number486()
    val b = Number485()
    return a.fib() + b.fib()
  }

}

class Number488 : StressfulInteger {

  companion object {
    private var VALUE = 488
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number244()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number977()
      val right = Number978()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number487()
    val b = Number486()
    return a.fib() + b.fib()
  }

}

class Number489 : StressfulInteger {

  companion object {
    private var VALUE = 489
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number244()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number979()
      val right = Number980()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number488()
    val b = Number487()
    return a.fib() + b.fib()
  }

}

class Number490 : StressfulInteger {

  companion object {
    private var VALUE = 490
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number245()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number981()
      val right = Number982()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number489()
    val b = Number488()
    return a.fib() + b.fib()
  }

}

class Number491 : StressfulInteger {

  companion object {
    private var VALUE = 491
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number245()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number983()
      val right = Number984()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number490()
    val b = Number489()
    return a.fib() + b.fib()
  }

}

class Number492 : StressfulInteger {

  companion object {
    private var VALUE = 492
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number246()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number985()
      val right = Number986()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number491()
    val b = Number490()
    return a.fib() + b.fib()
  }

}

class Number493 : StressfulInteger {

  companion object {
    private var VALUE = 493
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number246()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number987()
      val right = Number988()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number492()
    val b = Number491()
    return a.fib() + b.fib()
  }

}

class Number494 : StressfulInteger {

  companion object {
    private var VALUE = 494
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number247()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number989()
      val right = Number990()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number493()
    val b = Number492()
    return a.fib() + b.fib()
  }

}

class Number495 : StressfulInteger {

  companion object {
    private var VALUE = 495
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number247()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number991()
      val right = Number992()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number494()
    val b = Number493()
    return a.fib() + b.fib()
  }

}

class Number496 : StressfulInteger {

  companion object {
    private var VALUE = 496
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number248()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number993()
      val right = Number994()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number495()
    val b = Number494()
    return a.fib() + b.fib()
  }

}

class Number497 : StressfulInteger {

  companion object {
    private var VALUE = 497
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number248()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number995()
      val right = Number996()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number496()
    val b = Number495()
    return a.fib() + b.fib()
  }

}

class Number498 : StressfulInteger {

  companion object {
    private var VALUE = 498
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number249()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number997()
      val right = Number998()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number497()
    val b = Number496()
    return a.fib() + b.fib()
  }

}

class Number499 : StressfulInteger {

  companion object {
    private var VALUE = 499
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number249()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number999()
      val right = Number1000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number498()
    val b = Number497()
    return a.fib() + b.fib()
  }

}

class Number500 : StressfulInteger {

  companion object {
    private var VALUE = 500
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number250()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number1001()
      val right = Number1002()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number499()
    val b = Number498()
    return a.fib() + b.fib()
  }

}

class Number501 : StressfulInteger {

  companion object {
    private var VALUE = 501
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number250()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number1003()
      val right = Number1004()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number500()
    val b = Number499()
    return a.fib() + b.fib()
  }

}

class Number502 : StressfulInteger {

  companion object {
    private var VALUE = 502
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number251()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number1005()
      val right = Number1006()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number501()
    val b = Number500()
    return a.fib() + b.fib()
  }

}

class Number503 : StressfulInteger {

  companion object {
    private var VALUE = 503
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number251()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number1007()
      val right = Number1008()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number502()
    val b = Number501()
    return a.fib() + b.fib()
  }

}

class Number504 : StressfulInteger {

  companion object {
    private var VALUE = 504
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number252()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number1009()
      val right = Number1010()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number503()
    val b = Number502()
    return a.fib() + b.fib()
  }

}

class Number505 : StressfulInteger {

  companion object {
    private var VALUE = 505
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number252()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number1011()
      val right = Number1012()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number504()
    val b = Number503()
    return a.fib() + b.fib()
  }

}

class Number506 : StressfulInteger {

  companion object {
    private var VALUE = 506
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number253()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number1013()
      val right = Number1014()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number505()
    val b = Number504()
    return a.fib() + b.fib()
  }

}

class Number507 : StressfulInteger {

  companion object {
    private var VALUE = 507
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number253()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number1015()
      val right = Number1016()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number506()
    val b = Number505()
    return a.fib() + b.fib()
  }

}

class Number508 : StressfulInteger {

  companion object {
    private var VALUE = 508
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number254()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number1017()
      val right = Number1018()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number507()
    val b = Number506()
    return a.fib() + b.fib()
  }

}

class Number509 : StressfulInteger {

  companion object {
    private var VALUE = 509
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number254()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number1019()
      val right = Number1020()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number508()
    val b = Number507()
    return a.fib() + b.fib()
  }

}

class Number510 : StressfulInteger {

  companion object {
    private var VALUE = 510
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number255()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number1021()
      val right = Number1022()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number509()
    val b = Number508()
    return a.fib() + b.fib()
  }

}

class Number511 : StressfulInteger {

  companion object {
    private var VALUE = 511
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number255()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number1023()
      val right = Number1024()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number510()
    val b = Number509()
    return a.fib() + b.fib()
  }

}

class Number512 : StressfulInteger {

  companion object {
    private var VALUE = 512
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number256()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number1025()
      val right = Number1026()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number511()
    val b = Number510()
    return a.fib() + b.fib()
  }

}

class Number513 : StressfulInteger {

  companion object {
    private var VALUE = 513
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number256()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number1027()
      val right = Number1028()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number512()
    val b = Number511()
    return a.fib() + b.fib()
  }

}

class Number514 : StressfulInteger {

  companion object {
    private var VALUE = 514
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number257()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number1029()
      val right = Number1030()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number513()
    val b = Number512()
    return a.fib() + b.fib()
  }

}

class Number515 : StressfulInteger {

  companion object {
    private var VALUE = 515
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number257()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number1031()
      val right = Number1032()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number514()
    val b = Number513()
    return a.fib() + b.fib()
  }

}

class Number516 : StressfulInteger {

  companion object {
    private var VALUE = 516
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number258()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number1033()
      val right = Number1034()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number515()
    val b = Number514()
    return a.fib() + b.fib()
  }

}

class Number517 : StressfulInteger {

  companion object {
    private var VALUE = 517
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number258()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number1035()
      val right = Number1036()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number516()
    val b = Number515()
    return a.fib() + b.fib()
  }

}

class Number518 : StressfulInteger {

  companion object {
    private var VALUE = 518
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number259()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number1037()
      val right = Number1038()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number517()
    val b = Number516()
    return a.fib() + b.fib()
  }

}

class Number519 : StressfulInteger {

  companion object {
    private var VALUE = 519
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number259()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number1039()
      val right = Number1040()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number518()
    val b = Number517()
    return a.fib() + b.fib()
  }

}

class Number520 : StressfulInteger {

  companion object {
    private var VALUE = 520
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number260()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number1041()
      val right = Number1042()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number519()
    val b = Number518()
    return a.fib() + b.fib()
  }

}

class Number521 : StressfulInteger {

  companion object {
    private var VALUE = 521
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number260()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number1043()
      val right = Number1044()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number520()
    val b = Number519()
    return a.fib() + b.fib()
  }

}

class Number522 : StressfulInteger {

  companion object {
    private var VALUE = 522
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number261()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number1045()
      val right = Number1046()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number521()
    val b = Number520()
    return a.fib() + b.fib()
  }

}

class Number523 : StressfulInteger {

  companion object {
    private var VALUE = 523
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number261()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number1047()
      val right = Number1048()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number522()
    val b = Number521()
    return a.fib() + b.fib()
  }

}

class Number524 : StressfulInteger {

  companion object {
    private var VALUE = 524
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number262()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number1049()
      val right = Number1050()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number523()
    val b = Number522()
    return a.fib() + b.fib()
  }

}

class Number525 : StressfulInteger {

  companion object {
    private var VALUE = 525
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number262()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number1051()
      val right = Number1052()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number524()
    val b = Number523()
    return a.fib() + b.fib()
  }

}

class Number526 : StressfulInteger {

  companion object {
    private var VALUE = 526
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number263()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number1053()
      val right = Number1054()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number525()
    val b = Number524()
    return a.fib() + b.fib()
  }

}

class Number527 : StressfulInteger {

  companion object {
    private var VALUE = 527
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number263()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number1055()
      val right = Number1056()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number526()
    val b = Number525()
    return a.fib() + b.fib()
  }

}

class Number528 : StressfulInteger {

  companion object {
    private var VALUE = 528
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number264()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number1057()
      val right = Number1058()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number527()
    val b = Number526()
    return a.fib() + b.fib()
  }

}

class Number529 : StressfulInteger {

  companion object {
    private var VALUE = 529
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number264()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number1059()
      val right = Number1060()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number528()
    val b = Number527()
    return a.fib() + b.fib()
  }

}

class Number530 : StressfulInteger {

  companion object {
    private var VALUE = 530
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number265()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number1061()
      val right = Number1062()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number529()
    val b = Number528()
    return a.fib() + b.fib()
  }

}

class Number531 : StressfulInteger {

  companion object {
    private var VALUE = 531
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number265()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number1063()
      val right = Number1064()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number530()
    val b = Number529()
    return a.fib() + b.fib()
  }

}

class Number532 : StressfulInteger {

  companion object {
    private var VALUE = 532
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number266()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number1065()
      val right = Number1066()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number531()
    val b = Number530()
    return a.fib() + b.fib()
  }

}

class Number533 : StressfulInteger {

  companion object {
    private var VALUE = 533
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number266()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number1067()
      val right = Number1068()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number532()
    val b = Number531()
    return a.fib() + b.fib()
  }

}

class Number534 : StressfulInteger {

  companion object {
    private var VALUE = 534
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number267()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number1069()
      val right = Number1070()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number533()
    val b = Number532()
    return a.fib() + b.fib()
  }

}

class Number535 : StressfulInteger {

  companion object {
    private var VALUE = 535
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number267()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number1071()
      val right = Number1072()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number534()
    val b = Number533()
    return a.fib() + b.fib()
  }

}

class Number536 : StressfulInteger {

  companion object {
    private var VALUE = 536
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number268()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number1073()
      val right = Number1074()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number535()
    val b = Number534()
    return a.fib() + b.fib()
  }

}

class Number537 : StressfulInteger {

  companion object {
    private var VALUE = 537
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number268()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number1075()
      val right = Number1076()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number536()
    val b = Number535()
    return a.fib() + b.fib()
  }

}

class Number538 : StressfulInteger {

  companion object {
    private var VALUE = 538
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number269()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number1077()
      val right = Number1078()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number537()
    val b = Number536()
    return a.fib() + b.fib()
  }

}

class Number539 : StressfulInteger {

  companion object {
    private var VALUE = 539
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number269()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number1079()
      val right = Number1080()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number538()
    val b = Number537()
    return a.fib() + b.fib()
  }

}

class Number540 : StressfulInteger {

  companion object {
    private var VALUE = 540
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number270()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number1081()
      val right = Number1082()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number539()
    val b = Number538()
    return a.fib() + b.fib()
  }

}

class Number541 : StressfulInteger {

  companion object {
    private var VALUE = 541
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number270()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number1083()
      val right = Number1084()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number540()
    val b = Number539()
    return a.fib() + b.fib()
  }

}

class Number542 : StressfulInteger {

  companion object {
    private var VALUE = 542
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number271()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number1085()
      val right = Number1086()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number541()
    val b = Number540()
    return a.fib() + b.fib()
  }

}

class Number543 : StressfulInteger {

  companion object {
    private var VALUE = 543
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number271()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number1087()
      val right = Number1088()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number542()
    val b = Number541()
    return a.fib() + b.fib()
  }

}

class Number544 : StressfulInteger {

  companion object {
    private var VALUE = 544
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number272()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number1089()
      val right = Number1090()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number543()
    val b = Number542()
    return a.fib() + b.fib()
  }

}

class Number545 : StressfulInteger {

  companion object {
    private var VALUE = 545
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number272()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number1091()
      val right = Number1092()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number544()
    val b = Number543()
    return a.fib() + b.fib()
  }

}

class Number546 : StressfulInteger {

  companion object {
    private var VALUE = 546
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number273()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number1093()
      val right = Number1094()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number545()
    val b = Number544()
    return a.fib() + b.fib()
  }

}

class Number547 : StressfulInteger {

  companion object {
    private var VALUE = 547
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number273()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number1095()
      val right = Number1096()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number546()
    val b = Number545()
    return a.fib() + b.fib()
  }

}

class Number548 : StressfulInteger {

  companion object {
    private var VALUE = 548
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number274()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number1097()
      val right = Number1098()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number547()
    val b = Number546()
    return a.fib() + b.fib()
  }

}

class Number549 : StressfulInteger {

  companion object {
    private var VALUE = 549
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number274()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number1099()
      val right = Number1100()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number548()
    val b = Number547()
    return a.fib() + b.fib()
  }

}

class Number550 : StressfulInteger {

  companion object {
    private var VALUE = 550
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number275()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number1101()
      val right = Number1102()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number549()
    val b = Number548()
    return a.fib() + b.fib()
  }

}

class Number551 : StressfulInteger {

  companion object {
    private var VALUE = 551
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number275()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number1103()
      val right = Number1104()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number550()
    val b = Number549()
    return a.fib() + b.fib()
  }

}

class Number552 : StressfulInteger {

  companion object {
    private var VALUE = 552
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number276()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number1105()
      val right = Number1106()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number551()
    val b = Number550()
    return a.fib() + b.fib()
  }

}

class Number553 : StressfulInteger {

  companion object {
    private var VALUE = 553
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number276()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number1107()
      val right = Number1108()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number552()
    val b = Number551()
    return a.fib() + b.fib()
  }

}

class Number554 : StressfulInteger {

  companion object {
    private var VALUE = 554
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number277()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number1109()
      val right = Number1110()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number553()
    val b = Number552()
    return a.fib() + b.fib()
  }

}

class Number555 : StressfulInteger {

  companion object {
    private var VALUE = 555
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number277()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number1111()
      val right = Number1112()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number554()
    val b = Number553()
    return a.fib() + b.fib()
  }

}

class Number556 : StressfulInteger {

  companion object {
    private var VALUE = 556
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number278()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number1113()
      val right = Number1114()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number555()
    val b = Number554()
    return a.fib() + b.fib()
  }

}

class Number557 : StressfulInteger {

  companion object {
    private var VALUE = 557
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number278()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number1115()
      val right = Number1116()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number556()
    val b = Number555()
    return a.fib() + b.fib()
  }

}

class Number558 : StressfulInteger {

  companion object {
    private var VALUE = 558
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number279()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number1117()
      val right = Number1118()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number557()
    val b = Number556()
    return a.fib() + b.fib()
  }

}

class Number559 : StressfulInteger {

  companion object {
    private var VALUE = 559
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number279()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number1119()
      val right = Number1120()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number558()
    val b = Number557()
    return a.fib() + b.fib()
  }

}

class Number560 : StressfulInteger {

  companion object {
    private var VALUE = 560
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number280()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number1121()
      val right = Number1122()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number559()
    val b = Number558()
    return a.fib() + b.fib()
  }

}

class Number561 : StressfulInteger {

  companion object {
    private var VALUE = 561
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number280()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number1123()
      val right = Number1124()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number560()
    val b = Number559()
    return a.fib() + b.fib()
  }

}

class Number562 : StressfulInteger {

  companion object {
    private var VALUE = 562
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number281()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number1125()
      val right = Number1126()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number561()
    val b = Number560()
    return a.fib() + b.fib()
  }

}

class Number563 : StressfulInteger {

  companion object {
    private var VALUE = 563
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number281()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number1127()
      val right = Number1128()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number562()
    val b = Number561()
    return a.fib() + b.fib()
  }

}

class Number564 : StressfulInteger {

  companion object {
    private var VALUE = 564
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number282()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number1129()
      val right = Number1130()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number563()
    val b = Number562()
    return a.fib() + b.fib()
  }

}

class Number565 : StressfulInteger {

  companion object {
    private var VALUE = 565
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number282()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number1131()
      val right = Number1132()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number564()
    val b = Number563()
    return a.fib() + b.fib()
  }

}

class Number566 : StressfulInteger {

  companion object {
    private var VALUE = 566
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number283()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number1133()
      val right = Number1134()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number565()
    val b = Number564()
    return a.fib() + b.fib()
  }

}

class Number567 : StressfulInteger {

  companion object {
    private var VALUE = 567
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number283()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number1135()
      val right = Number1136()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number566()
    val b = Number565()
    return a.fib() + b.fib()
  }

}

class Number568 : StressfulInteger {

  companion object {
    private var VALUE = 568
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number284()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number1137()
      val right = Number1138()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number567()
    val b = Number566()
    return a.fib() + b.fib()
  }

}

class Number569 : StressfulInteger {

  companion object {
    private var VALUE = 569
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number284()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number1139()
      val right = Number1140()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number568()
    val b = Number567()
    return a.fib() + b.fib()
  }

}

class Number570 : StressfulInteger {

  companion object {
    private var VALUE = 570
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number285()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number1141()
      val right = Number1142()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number569()
    val b = Number568()
    return a.fib() + b.fib()
  }

}

class Number571 : StressfulInteger {

  companion object {
    private var VALUE = 571
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number285()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number1143()
      val right = Number1144()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number570()
    val b = Number569()
    return a.fib() + b.fib()
  }

}

class Number572 : StressfulInteger {

  companion object {
    private var VALUE = 572
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number286()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number1145()
      val right = Number1146()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number571()
    val b = Number570()
    return a.fib() + b.fib()
  }

}

class Number573 : StressfulInteger {

  companion object {
    private var VALUE = 573
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number286()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number1147()
      val right = Number1148()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number572()
    val b = Number571()
    return a.fib() + b.fib()
  }

}

class Number574 : StressfulInteger {

  companion object {
    private var VALUE = 574
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number287()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number1149()
      val right = Number1150()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number573()
    val b = Number572()
    return a.fib() + b.fib()
  }

}

class Number575 : StressfulInteger {

  companion object {
    private var VALUE = 575
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number287()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number1151()
      val right = Number1152()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number574()
    val b = Number573()
    return a.fib() + b.fib()
  }

}

class Number576 : StressfulInteger {

  companion object {
    private var VALUE = 576
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number288()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number1153()
      val right = Number1154()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number575()
    val b = Number574()
    return a.fib() + b.fib()
  }

}

class Number577 : StressfulInteger {

  companion object {
    private var VALUE = 577
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number288()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number1155()
      val right = Number1156()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number576()
    val b = Number575()
    return a.fib() + b.fib()
  }

}

class Number578 : StressfulInteger {

  companion object {
    private var VALUE = 578
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number289()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number1157()
      val right = Number1158()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number577()
    val b = Number576()
    return a.fib() + b.fib()
  }

}

class Number579 : StressfulInteger {

  companion object {
    private var VALUE = 579
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number289()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number1159()
      val right = Number1160()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number578()
    val b = Number577()
    return a.fib() + b.fib()
  }

}

class Number580 : StressfulInteger {

  companion object {
    private var VALUE = 580
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number290()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number1161()
      val right = Number1162()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number579()
    val b = Number578()
    return a.fib() + b.fib()
  }

}

class Number581 : StressfulInteger {

  companion object {
    private var VALUE = 581
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number290()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number1163()
      val right = Number1164()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number580()
    val b = Number579()
    return a.fib() + b.fib()
  }

}

class Number582 : StressfulInteger {

  companion object {
    private var VALUE = 582
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number291()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number1165()
      val right = Number1166()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number581()
    val b = Number580()
    return a.fib() + b.fib()
  }

}

class Number583 : StressfulInteger {

  companion object {
    private var VALUE = 583
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number291()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number1167()
      val right = Number1168()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number582()
    val b = Number581()
    return a.fib() + b.fib()
  }

}

class Number584 : StressfulInteger {

  companion object {
    private var VALUE = 584
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number292()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number1169()
      val right = Number1170()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number583()
    val b = Number582()
    return a.fib() + b.fib()
  }

}

class Number585 : StressfulInteger {

  companion object {
    private var VALUE = 585
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number292()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number1171()
      val right = Number1172()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number584()
    val b = Number583()
    return a.fib() + b.fib()
  }

}

class Number586 : StressfulInteger {

  companion object {
    private var VALUE = 586
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number293()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number1173()
      val right = Number1174()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number585()
    val b = Number584()
    return a.fib() + b.fib()
  }

}

class Number587 : StressfulInteger {

  companion object {
    private var VALUE = 587
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number293()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number1175()
      val right = Number1176()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number586()
    val b = Number585()
    return a.fib() + b.fib()
  }

}

class Number588 : StressfulInteger {

  companion object {
    private var VALUE = 588
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number294()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number1177()
      val right = Number1178()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number587()
    val b = Number586()
    return a.fib() + b.fib()
  }

}

class Number589 : StressfulInteger {

  companion object {
    private var VALUE = 589
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number294()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number1179()
      val right = Number1180()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number588()
    val b = Number587()
    return a.fib() + b.fib()
  }

}

class Number590 : StressfulInteger {

  companion object {
    private var VALUE = 590
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number295()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number1181()
      val right = Number1182()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number589()
    val b = Number588()
    return a.fib() + b.fib()
  }

}

class Number591 : StressfulInteger {

  companion object {
    private var VALUE = 591
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number295()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number1183()
      val right = Number1184()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number590()
    val b = Number589()
    return a.fib() + b.fib()
  }

}

class Number592 : StressfulInteger {

  companion object {
    private var VALUE = 592
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number296()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number1185()
      val right = Number1186()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number591()
    val b = Number590()
    return a.fib() + b.fib()
  }

}

class Number593 : StressfulInteger {

  companion object {
    private var VALUE = 593
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number296()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number1187()
      val right = Number1188()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number592()
    val b = Number591()
    return a.fib() + b.fib()
  }

}

class Number594 : StressfulInteger {

  companion object {
    private var VALUE = 594
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number297()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number1189()
      val right = Number1190()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number593()
    val b = Number592()
    return a.fib() + b.fib()
  }

}

class Number595 : StressfulInteger {

  companion object {
    private var VALUE = 595
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number297()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number1191()
      val right = Number1192()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number594()
    val b = Number593()
    return a.fib() + b.fib()
  }

}

class Number596 : StressfulInteger {

  companion object {
    private var VALUE = 596
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number298()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number1193()
      val right = Number1194()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number595()
    val b = Number594()
    return a.fib() + b.fib()
  }

}

class Number597 : StressfulInteger {

  companion object {
    private var VALUE = 597
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number298()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number1195()
      val right = Number1196()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number596()
    val b = Number595()
    return a.fib() + b.fib()
  }

}

class Number598 : StressfulInteger {

  companion object {
    private var VALUE = 598
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number299()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number1197()
      val right = Number1198()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number597()
    val b = Number596()
    return a.fib() + b.fib()
  }

}

class Number599 : StressfulInteger {

  companion object {
    private var VALUE = 599
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number299()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number1199()
      val right = Number1200()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number598()
    val b = Number597()
    return a.fib() + b.fib()
  }

}

class Number600 : StressfulInteger {

  companion object {
    private var VALUE = 600
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number300()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number1201()
      val right = Number1202()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number599()
    val b = Number598()
    return a.fib() + b.fib()
  }

}

class Number601 : StressfulInteger {

  companion object {
    private var VALUE = 601
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number300()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number1203()
      val right = Number1204()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number600()
    val b = Number599()
    return a.fib() + b.fib()
  }

}

class Number602 : StressfulInteger {

  companion object {
    private var VALUE = 602
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number301()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number1205()
      val right = Number1206()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number601()
    val b = Number600()
    return a.fib() + b.fib()
  }

}

class Number603 : StressfulInteger {

  companion object {
    private var VALUE = 603
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number301()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number1207()
      val right = Number1208()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number602()
    val b = Number601()
    return a.fib() + b.fib()
  }

}

class Number604 : StressfulInteger {

  companion object {
    private var VALUE = 604
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number302()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number1209()
      val right = Number1210()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number603()
    val b = Number602()
    return a.fib() + b.fib()
  }

}

class Number605 : StressfulInteger {

  companion object {
    private var VALUE = 605
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number302()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number1211()
      val right = Number1212()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number604()
    val b = Number603()
    return a.fib() + b.fib()
  }

}

class Number606 : StressfulInteger {

  companion object {
    private var VALUE = 606
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number303()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number1213()
      val right = Number1214()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number605()
    val b = Number604()
    return a.fib() + b.fib()
  }

}

class Number607 : StressfulInteger {

  companion object {
    private var VALUE = 607
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number303()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number1215()
      val right = Number1216()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number606()
    val b = Number605()
    return a.fib() + b.fib()
  }

}

class Number608 : StressfulInteger {

  companion object {
    private var VALUE = 608
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number304()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number1217()
      val right = Number1218()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number607()
    val b = Number606()
    return a.fib() + b.fib()
  }

}

class Number609 : StressfulInteger {

  companion object {
    private var VALUE = 609
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number304()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number1219()
      val right = Number1220()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number608()
    val b = Number607()
    return a.fib() + b.fib()
  }

}

class Number610 : StressfulInteger {

  companion object {
    private var VALUE = 610
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number305()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number1221()
      val right = Number1222()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number609()
    val b = Number608()
    return a.fib() + b.fib()
  }

}

class Number611 : StressfulInteger {

  companion object {
    private var VALUE = 611
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number305()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number1223()
      val right = Number1224()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number610()
    val b = Number609()
    return a.fib() + b.fib()
  }

}

class Number612 : StressfulInteger {

  companion object {
    private var VALUE = 612
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number306()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number1225()
      val right = Number1226()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number611()
    val b = Number610()
    return a.fib() + b.fib()
  }

}

class Number613 : StressfulInteger {

  companion object {
    private var VALUE = 613
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number306()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number1227()
      val right = Number1228()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number612()
    val b = Number611()
    return a.fib() + b.fib()
  }

}

class Number614 : StressfulInteger {

  companion object {
    private var VALUE = 614
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number307()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number1229()
      val right = Number1230()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number613()
    val b = Number612()
    return a.fib() + b.fib()
  }

}

class Number615 : StressfulInteger {

  companion object {
    private var VALUE = 615
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number307()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number1231()
      val right = Number1232()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number614()
    val b = Number613()
    return a.fib() + b.fib()
  }

}

class Number616 : StressfulInteger {

  companion object {
    private var VALUE = 616
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number308()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number1233()
      val right = Number1234()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number615()
    val b = Number614()
    return a.fib() + b.fib()
  }

}

class Number617 : StressfulInteger {

  companion object {
    private var VALUE = 617
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number308()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number1235()
      val right = Number1236()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number616()
    val b = Number615()
    return a.fib() + b.fib()
  }

}

class Number618 : StressfulInteger {

  companion object {
    private var VALUE = 618
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number309()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number1237()
      val right = Number1238()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number617()
    val b = Number616()
    return a.fib() + b.fib()
  }

}

class Number619 : StressfulInteger {

  companion object {
    private var VALUE = 619
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number309()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number1239()
      val right = Number1240()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number618()
    val b = Number617()
    return a.fib() + b.fib()
  }

}

class Number620 : StressfulInteger {

  companion object {
    private var VALUE = 620
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number310()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number1241()
      val right = Number1242()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number619()
    val b = Number618()
    return a.fib() + b.fib()
  }

}

class Number621 : StressfulInteger {

  companion object {
    private var VALUE = 621
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number310()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number1243()
      val right = Number1244()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number620()
    val b = Number619()
    return a.fib() + b.fib()
  }

}

class Number622 : StressfulInteger {

  companion object {
    private var VALUE = 622
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number311()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number1245()
      val right = Number1246()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number621()
    val b = Number620()
    return a.fib() + b.fib()
  }

}

class Number623 : StressfulInteger {

  companion object {
    private var VALUE = 623
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number311()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number1247()
      val right = Number1248()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number622()
    val b = Number621()
    return a.fib() + b.fib()
  }

}

class Number624 : StressfulInteger {

  companion object {
    private var VALUE = 624
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number312()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number1249()
      val right = Number1250()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number623()
    val b = Number622()
    return a.fib() + b.fib()
  }

}

class Number625 : StressfulInteger {

  companion object {
    private var VALUE = 625
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number312()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number1251()
      val right = Number1252()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number624()
    val b = Number623()
    return a.fib() + b.fib()
  }

}

class Number626 : StressfulInteger {

  companion object {
    private var VALUE = 626
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number313()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number1253()
      val right = Number1254()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number625()
    val b = Number624()
    return a.fib() + b.fib()
  }

}

class Number627 : StressfulInteger {

  companion object {
    private var VALUE = 627
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number313()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number1255()
      val right = Number1256()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number626()
    val b = Number625()
    return a.fib() + b.fib()
  }

}

class Number628 : StressfulInteger {

  companion object {
    private var VALUE = 628
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number314()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number1257()
      val right = Number1258()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number627()
    val b = Number626()
    return a.fib() + b.fib()
  }

}

class Number629 : StressfulInteger {

  companion object {
    private var VALUE = 629
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number314()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number1259()
      val right = Number1260()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number628()
    val b = Number627()
    return a.fib() + b.fib()
  }

}

class Number630 : StressfulInteger {

  companion object {
    private var VALUE = 630
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number315()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number1261()
      val right = Number1262()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number629()
    val b = Number628()
    return a.fib() + b.fib()
  }

}

class Number631 : StressfulInteger {

  companion object {
    private var VALUE = 631
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number315()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number1263()
      val right = Number1264()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number630()
    val b = Number629()
    return a.fib() + b.fib()
  }

}

class Number632 : StressfulInteger {

  companion object {
    private var VALUE = 632
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number316()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number1265()
      val right = Number1266()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number631()
    val b = Number630()
    return a.fib() + b.fib()
  }

}

class Number633 : StressfulInteger {

  companion object {
    private var VALUE = 633
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number316()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number1267()
      val right = Number1268()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number632()
    val b = Number631()
    return a.fib() + b.fib()
  }

}

class Number634 : StressfulInteger {

  companion object {
    private var VALUE = 634
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number317()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number1269()
      val right = Number1270()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number633()
    val b = Number632()
    return a.fib() + b.fib()
  }

}

class Number635 : StressfulInteger {

  companion object {
    private var VALUE = 635
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number317()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number1271()
      val right = Number1272()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number634()
    val b = Number633()
    return a.fib() + b.fib()
  }

}

class Number636 : StressfulInteger {

  companion object {
    private var VALUE = 636
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number318()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number1273()
      val right = Number1274()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number635()
    val b = Number634()
    return a.fib() + b.fib()
  }

}

class Number637 : StressfulInteger {

  companion object {
    private var VALUE = 637
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number318()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number1275()
      val right = Number1276()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number636()
    val b = Number635()
    return a.fib() + b.fib()
  }

}

class Number638 : StressfulInteger {

  companion object {
    private var VALUE = 638
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number319()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number1277()
      val right = Number1278()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number637()
    val b = Number636()
    return a.fib() + b.fib()
  }

}

class Number639 : StressfulInteger {

  companion object {
    private var VALUE = 639
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number319()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number1279()
      val right = Number1280()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number638()
    val b = Number637()
    return a.fib() + b.fib()
  }

}

class Number640 : StressfulInteger {

  companion object {
    private var VALUE = 640
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number320()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number1281()
      val right = Number1282()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number639()
    val b = Number638()
    return a.fib() + b.fib()
  }

}

class Number641 : StressfulInteger {

  companion object {
    private var VALUE = 641
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number320()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number1283()
      val right = Number1284()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number640()
    val b = Number639()
    return a.fib() + b.fib()
  }

}

class Number642 : StressfulInteger {

  companion object {
    private var VALUE = 642
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number321()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number1285()
      val right = Number1286()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number641()
    val b = Number640()
    return a.fib() + b.fib()
  }

}

class Number643 : StressfulInteger {

  companion object {
    private var VALUE = 643
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number321()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number1287()
      val right = Number1288()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number642()
    val b = Number641()
    return a.fib() + b.fib()
  }

}

class Number644 : StressfulInteger {

  companion object {
    private var VALUE = 644
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number322()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number1289()
      val right = Number1290()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number643()
    val b = Number642()
    return a.fib() + b.fib()
  }

}

class Number645 : StressfulInteger {

  companion object {
    private var VALUE = 645
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number322()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number1291()
      val right = Number1292()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number644()
    val b = Number643()
    return a.fib() + b.fib()
  }

}

class Number646 : StressfulInteger {

  companion object {
    private var VALUE = 646
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number323()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number1293()
      val right = Number1294()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number645()
    val b = Number644()
    return a.fib() + b.fib()
  }

}

class Number647 : StressfulInteger {

  companion object {
    private var VALUE = 647
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number323()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number1295()
      val right = Number1296()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number646()
    val b = Number645()
    return a.fib() + b.fib()
  }

}

class Number648 : StressfulInteger {

  companion object {
    private var VALUE = 648
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number324()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number1297()
      val right = Number1298()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number647()
    val b = Number646()
    return a.fib() + b.fib()
  }

}

class Number649 : StressfulInteger {

  companion object {
    private var VALUE = 649
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number324()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number1299()
      val right = Number1300()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number648()
    val b = Number647()
    return a.fib() + b.fib()
  }

}

class Number650 : StressfulInteger {

  companion object {
    private var VALUE = 650
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number325()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number1301()
      val right = Number1302()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number649()
    val b = Number648()
    return a.fib() + b.fib()
  }

}

class Number651 : StressfulInteger {

  companion object {
    private var VALUE = 651
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number325()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number1303()
      val right = Number1304()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number650()
    val b = Number649()
    return a.fib() + b.fib()
  }

}

class Number652 : StressfulInteger {

  companion object {
    private var VALUE = 652
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number326()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number1305()
      val right = Number1306()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number651()
    val b = Number650()
    return a.fib() + b.fib()
  }

}

class Number653 : StressfulInteger {

  companion object {
    private var VALUE = 653
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number326()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number1307()
      val right = Number1308()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number652()
    val b = Number651()
    return a.fib() + b.fib()
  }

}

class Number654 : StressfulInteger {

  companion object {
    private var VALUE = 654
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number327()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number1309()
      val right = Number1310()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number653()
    val b = Number652()
    return a.fib() + b.fib()
  }

}

class Number655 : StressfulInteger {

  companion object {
    private var VALUE = 655
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number327()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number1311()
      val right = Number1312()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number654()
    val b = Number653()
    return a.fib() + b.fib()
  }

}

class Number656 : StressfulInteger {

  companion object {
    private var VALUE = 656
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number328()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number1313()
      val right = Number1314()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number655()
    val b = Number654()
    return a.fib() + b.fib()
  }

}

class Number657 : StressfulInteger {

  companion object {
    private var VALUE = 657
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number328()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number1315()
      val right = Number1316()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number656()
    val b = Number655()
    return a.fib() + b.fib()
  }

}

class Number658 : StressfulInteger {

  companion object {
    private var VALUE = 658
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number329()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number1317()
      val right = Number1318()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number657()
    val b = Number656()
    return a.fib() + b.fib()
  }

}

class Number659 : StressfulInteger {

  companion object {
    private var VALUE = 659
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number329()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number1319()
      val right = Number1320()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number658()
    val b = Number657()
    return a.fib() + b.fib()
  }

}

class Number660 : StressfulInteger {

  companion object {
    private var VALUE = 660
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number330()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number1321()
      val right = Number1322()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number659()
    val b = Number658()
    return a.fib() + b.fib()
  }

}

class Number661 : StressfulInteger {

  companion object {
    private var VALUE = 661
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number330()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number1323()
      val right = Number1324()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number660()
    val b = Number659()
    return a.fib() + b.fib()
  }

}

class Number662 : StressfulInteger {

  companion object {
    private var VALUE = 662
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number331()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number1325()
      val right = Number1326()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number661()
    val b = Number660()
    return a.fib() + b.fib()
  }

}

class Number663 : StressfulInteger {

  companion object {
    private var VALUE = 663
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number331()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number1327()
      val right = Number1328()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number662()
    val b = Number661()
    return a.fib() + b.fib()
  }

}

class Number664 : StressfulInteger {

  companion object {
    private var VALUE = 664
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number332()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number1329()
      val right = Number1330()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number663()
    val b = Number662()
    return a.fib() + b.fib()
  }

}

class Number665 : StressfulInteger {

  companion object {
    private var VALUE = 665
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number332()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number1331()
      val right = Number1332()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number664()
    val b = Number663()
    return a.fib() + b.fib()
  }

}

class Number666 : StressfulInteger {

  companion object {
    private var VALUE = 666
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number333()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number1333()
      val right = Number1334()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number665()
    val b = Number664()
    return a.fib() + b.fib()
  }

}

class Number667 : StressfulInteger {

  companion object {
    private var VALUE = 667
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number333()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number1335()
      val right = Number1336()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number666()
    val b = Number665()
    return a.fib() + b.fib()
  }

}

class Number668 : StressfulInteger {

  companion object {
    private var VALUE = 668
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number334()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number1337()
      val right = Number1338()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number667()
    val b = Number666()
    return a.fib() + b.fib()
  }

}

class Number669 : StressfulInteger {

  companion object {
    private var VALUE = 669
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number334()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number1339()
      val right = Number1340()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number668()
    val b = Number667()
    return a.fib() + b.fib()
  }

}

class Number670 : StressfulInteger {

  companion object {
    private var VALUE = 670
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number335()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number1341()
      val right = Number1342()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number669()
    val b = Number668()
    return a.fib() + b.fib()
  }

}

class Number671 : StressfulInteger {

  companion object {
    private var VALUE = 671
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number335()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number1343()
      val right = Number1344()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number670()
    val b = Number669()
    return a.fib() + b.fib()
  }

}

class Number672 : StressfulInteger {

  companion object {
    private var VALUE = 672
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number336()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number1345()
      val right = Number1346()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number671()
    val b = Number670()
    return a.fib() + b.fib()
  }

}

class Number673 : StressfulInteger {

  companion object {
    private var VALUE = 673
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number336()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number1347()
      val right = Number1348()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number672()
    val b = Number671()
    return a.fib() + b.fib()
  }

}

class Number674 : StressfulInteger {

  companion object {
    private var VALUE = 674
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number337()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number1349()
      val right = Number1350()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number673()
    val b = Number672()
    return a.fib() + b.fib()
  }

}

class Number675 : StressfulInteger {

  companion object {
    private var VALUE = 675
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number337()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number1351()
      val right = Number1352()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number674()
    val b = Number673()
    return a.fib() + b.fib()
  }

}

class Number676 : StressfulInteger {

  companion object {
    private var VALUE = 676
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number338()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number1353()
      val right = Number1354()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number675()
    val b = Number674()
    return a.fib() + b.fib()
  }

}

class Number677 : StressfulInteger {

  companion object {
    private var VALUE = 677
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number338()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number1355()
      val right = Number1356()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number676()
    val b = Number675()
    return a.fib() + b.fib()
  }

}

class Number678 : StressfulInteger {

  companion object {
    private var VALUE = 678
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number339()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number1357()
      val right = Number1358()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number677()
    val b = Number676()
    return a.fib() + b.fib()
  }

}

class Number679 : StressfulInteger {

  companion object {
    private var VALUE = 679
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number339()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number1359()
      val right = Number1360()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number678()
    val b = Number677()
    return a.fib() + b.fib()
  }

}

class Number680 : StressfulInteger {

  companion object {
    private var VALUE = 680
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number340()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number1361()
      val right = Number1362()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number679()
    val b = Number678()
    return a.fib() + b.fib()
  }

}

class Number681 : StressfulInteger {

  companion object {
    private var VALUE = 681
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number340()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number1363()
      val right = Number1364()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number680()
    val b = Number679()
    return a.fib() + b.fib()
  }

}

class Number682 : StressfulInteger {

  companion object {
    private var VALUE = 682
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number341()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number1365()
      val right = Number1366()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number681()
    val b = Number680()
    return a.fib() + b.fib()
  }

}

class Number683 : StressfulInteger {

  companion object {
    private var VALUE = 683
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number341()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number1367()
      val right = Number1368()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number682()
    val b = Number681()
    return a.fib() + b.fib()
  }

}

class Number684 : StressfulInteger {

  companion object {
    private var VALUE = 684
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number342()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number1369()
      val right = Number1370()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number683()
    val b = Number682()
    return a.fib() + b.fib()
  }

}

class Number685 : StressfulInteger {

  companion object {
    private var VALUE = 685
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number342()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number1371()
      val right = Number1372()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number684()
    val b = Number683()
    return a.fib() + b.fib()
  }

}

class Number686 : StressfulInteger {

  companion object {
    private var VALUE = 686
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number343()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number1373()
      val right = Number1374()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number685()
    val b = Number684()
    return a.fib() + b.fib()
  }

}

class Number687 : StressfulInteger {

  companion object {
    private var VALUE = 687
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number343()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number1375()
      val right = Number1376()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number686()
    val b = Number685()
    return a.fib() + b.fib()
  }

}

class Number688 : StressfulInteger {

  companion object {
    private var VALUE = 688
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number344()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number1377()
      val right = Number1378()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number687()
    val b = Number686()
    return a.fib() + b.fib()
  }

}

class Number689 : StressfulInteger {

  companion object {
    private var VALUE = 689
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number344()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number1379()
      val right = Number1380()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number688()
    val b = Number687()
    return a.fib() + b.fib()
  }

}

class Number690 : StressfulInteger {

  companion object {
    private var VALUE = 690
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number345()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number1381()
      val right = Number1382()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number689()
    val b = Number688()
    return a.fib() + b.fib()
  }

}

class Number691 : StressfulInteger {

  companion object {
    private var VALUE = 691
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number345()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number1383()
      val right = Number1384()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number690()
    val b = Number689()
    return a.fib() + b.fib()
  }

}

class Number692 : StressfulInteger {

  companion object {
    private var VALUE = 692
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number346()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number1385()
      val right = Number1386()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number691()
    val b = Number690()
    return a.fib() + b.fib()
  }

}

class Number693 : StressfulInteger {

  companion object {
    private var VALUE = 693
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number346()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number1387()
      val right = Number1388()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number692()
    val b = Number691()
    return a.fib() + b.fib()
  }

}

class Number694 : StressfulInteger {

  companion object {
    private var VALUE = 694
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number347()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number1389()
      val right = Number1390()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number693()
    val b = Number692()
    return a.fib() + b.fib()
  }

}

class Number695 : StressfulInteger {

  companion object {
    private var VALUE = 695
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number347()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number1391()
      val right = Number1392()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number694()
    val b = Number693()
    return a.fib() + b.fib()
  }

}

class Number696 : StressfulInteger {

  companion object {
    private var VALUE = 696
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number348()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number1393()
      val right = Number1394()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number695()
    val b = Number694()
    return a.fib() + b.fib()
  }

}

class Number697 : StressfulInteger {

  companion object {
    private var VALUE = 697
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number348()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number1395()
      val right = Number1396()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number696()
    val b = Number695()
    return a.fib() + b.fib()
  }

}

class Number698 : StressfulInteger {

  companion object {
    private var VALUE = 698
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number349()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number1397()
      val right = Number1398()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number697()
    val b = Number696()
    return a.fib() + b.fib()
  }

}

class Number699 : StressfulInteger {

  companion object {
    private var VALUE = 699
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number349()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number1399()
      val right = Number1400()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number698()
    val b = Number697()
    return a.fib() + b.fib()
  }

}

class Number700 : StressfulInteger {

  companion object {
    private var VALUE = 700
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number350()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number1401()
      val right = Number1402()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number699()
    val b = Number698()
    return a.fib() + b.fib()
  }

}

class Number701 : StressfulInteger {

  companion object {
    private var VALUE = 701
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number350()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number1403()
      val right = Number1404()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number700()
    val b = Number699()
    return a.fib() + b.fib()
  }

}

class Number702 : StressfulInteger {

  companion object {
    private var VALUE = 702
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number351()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number1405()
      val right = Number1406()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number701()
    val b = Number700()
    return a.fib() + b.fib()
  }

}

class Number703 : StressfulInteger {

  companion object {
    private var VALUE = 703
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number351()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number1407()
      val right = Number1408()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number702()
    val b = Number701()
    return a.fib() + b.fib()
  }

}

class Number704 : StressfulInteger {

  companion object {
    private var VALUE = 704
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number352()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number1409()
      val right = Number1410()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number703()
    val b = Number702()
    return a.fib() + b.fib()
  }

}

class Number705 : StressfulInteger {

  companion object {
    private var VALUE = 705
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number352()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number1411()
      val right = Number1412()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number704()
    val b = Number703()
    return a.fib() + b.fib()
  }

}

class Number706 : StressfulInteger {

  companion object {
    private var VALUE = 706
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number353()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number1413()
      val right = Number1414()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number705()
    val b = Number704()
    return a.fib() + b.fib()
  }

}

class Number707 : StressfulInteger {

  companion object {
    private var VALUE = 707
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number353()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number1415()
      val right = Number1416()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number706()
    val b = Number705()
    return a.fib() + b.fib()
  }

}

class Number708 : StressfulInteger {

  companion object {
    private var VALUE = 708
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number354()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number1417()
      val right = Number1418()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number707()
    val b = Number706()
    return a.fib() + b.fib()
  }

}

class Number709 : StressfulInteger {

  companion object {
    private var VALUE = 709
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number354()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number1419()
      val right = Number1420()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number708()
    val b = Number707()
    return a.fib() + b.fib()
  }

}

class Number710 : StressfulInteger {

  companion object {
    private var VALUE = 710
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number355()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number1421()
      val right = Number1422()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number709()
    val b = Number708()
    return a.fib() + b.fib()
  }

}

class Number711 : StressfulInteger {

  companion object {
    private var VALUE = 711
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number355()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number1423()
      val right = Number1424()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number710()
    val b = Number709()
    return a.fib() + b.fib()
  }

}

class Number712 : StressfulInteger {

  companion object {
    private var VALUE = 712
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number356()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number1425()
      val right = Number1426()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number711()
    val b = Number710()
    return a.fib() + b.fib()
  }

}

class Number713 : StressfulInteger {

  companion object {
    private var VALUE = 713
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number356()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number1427()
      val right = Number1428()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number712()
    val b = Number711()
    return a.fib() + b.fib()
  }

}

class Number714 : StressfulInteger {

  companion object {
    private var VALUE = 714
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number357()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number1429()
      val right = Number1430()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number713()
    val b = Number712()
    return a.fib() + b.fib()
  }

}

class Number715 : StressfulInteger {

  companion object {
    private var VALUE = 715
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number357()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number1431()
      val right = Number1432()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number714()
    val b = Number713()
    return a.fib() + b.fib()
  }

}

class Number716 : StressfulInteger {

  companion object {
    private var VALUE = 716
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number358()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number1433()
      val right = Number1434()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number715()
    val b = Number714()
    return a.fib() + b.fib()
  }

}

class Number717 : StressfulInteger {

  companion object {
    private var VALUE = 717
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number358()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number1435()
      val right = Number1436()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number716()
    val b = Number715()
    return a.fib() + b.fib()
  }

}

class Number718 : StressfulInteger {

  companion object {
    private var VALUE = 718
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number359()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number1437()
      val right = Number1438()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number717()
    val b = Number716()
    return a.fib() + b.fib()
  }

}

class Number719 : StressfulInteger {

  companion object {
    private var VALUE = 719
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number359()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number1439()
      val right = Number1440()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number718()
    val b = Number717()
    return a.fib() + b.fib()
  }

}

class Number720 : StressfulInteger {

  companion object {
    private var VALUE = 720
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number360()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number1441()
      val right = Number1442()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number719()
    val b = Number718()
    return a.fib() + b.fib()
  }

}

class Number721 : StressfulInteger {

  companion object {
    private var VALUE = 721
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number360()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number1443()
      val right = Number1444()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number720()
    val b = Number719()
    return a.fib() + b.fib()
  }

}

class Number722 : StressfulInteger {

  companion object {
    private var VALUE = 722
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number361()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number1445()
      val right = Number1446()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number721()
    val b = Number720()
    return a.fib() + b.fib()
  }

}

class Number723 : StressfulInteger {

  companion object {
    private var VALUE = 723
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number361()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number1447()
      val right = Number1448()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number722()
    val b = Number721()
    return a.fib() + b.fib()
  }

}

class Number724 : StressfulInteger {

  companion object {
    private var VALUE = 724
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number362()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number1449()
      val right = Number1450()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number723()
    val b = Number722()
    return a.fib() + b.fib()
  }

}

class Number725 : StressfulInteger {

  companion object {
    private var VALUE = 725
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number362()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number1451()
      val right = Number1452()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number724()
    val b = Number723()
    return a.fib() + b.fib()
  }

}

class Number726 : StressfulInteger {

  companion object {
    private var VALUE = 726
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number363()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number1453()
      val right = Number1454()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number725()
    val b = Number724()
    return a.fib() + b.fib()
  }

}

class Number727 : StressfulInteger {

  companion object {
    private var VALUE = 727
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number363()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number1455()
      val right = Number1456()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number726()
    val b = Number725()
    return a.fib() + b.fib()
  }

}

class Number728 : StressfulInteger {

  companion object {
    private var VALUE = 728
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number364()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number1457()
      val right = Number1458()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number727()
    val b = Number726()
    return a.fib() + b.fib()
  }

}

class Number729 : StressfulInteger {

  companion object {
    private var VALUE = 729
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number364()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number1459()
      val right = Number1460()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number728()
    val b = Number727()
    return a.fib() + b.fib()
  }

}

class Number730 : StressfulInteger {

  companion object {
    private var VALUE = 730
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number365()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number1461()
      val right = Number1462()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number729()
    val b = Number728()
    return a.fib() + b.fib()
  }

}

class Number731 : StressfulInteger {

  companion object {
    private var VALUE = 731
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number365()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number1463()
      val right = Number1464()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number730()
    val b = Number729()
    return a.fib() + b.fib()
  }

}

class Number732 : StressfulInteger {

  companion object {
    private var VALUE = 732
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number366()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number1465()
      val right = Number1466()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number731()
    val b = Number730()
    return a.fib() + b.fib()
  }

}

class Number733 : StressfulInteger {

  companion object {
    private var VALUE = 733
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number366()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number1467()
      val right = Number1468()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number732()
    val b = Number731()
    return a.fib() + b.fib()
  }

}

class Number734 : StressfulInteger {

  companion object {
    private var VALUE = 734
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number367()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number1469()
      val right = Number1470()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number733()
    val b = Number732()
    return a.fib() + b.fib()
  }

}

class Number735 : StressfulInteger {

  companion object {
    private var VALUE = 735
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number367()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number1471()
      val right = Number1472()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number734()
    val b = Number733()
    return a.fib() + b.fib()
  }

}

class Number736 : StressfulInteger {

  companion object {
    private var VALUE = 736
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number368()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number1473()
      val right = Number1474()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number735()
    val b = Number734()
    return a.fib() + b.fib()
  }

}

class Number737 : StressfulInteger {

  companion object {
    private var VALUE = 737
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number368()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number1475()
      val right = Number1476()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number736()
    val b = Number735()
    return a.fib() + b.fib()
  }

}

class Number738 : StressfulInteger {

  companion object {
    private var VALUE = 738
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number369()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number1477()
      val right = Number1478()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number737()
    val b = Number736()
    return a.fib() + b.fib()
  }

}

class Number739 : StressfulInteger {

  companion object {
    private var VALUE = 739
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number369()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number1479()
      val right = Number1480()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number738()
    val b = Number737()
    return a.fib() + b.fib()
  }

}

class Number740 : StressfulInteger {

  companion object {
    private var VALUE = 740
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number370()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number1481()
      val right = Number1482()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number739()
    val b = Number738()
    return a.fib() + b.fib()
  }

}

class Number741 : StressfulInteger {

  companion object {
    private var VALUE = 741
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number370()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number1483()
      val right = Number1484()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number740()
    val b = Number739()
    return a.fib() + b.fib()
  }

}

class Number742 : StressfulInteger {

  companion object {
    private var VALUE = 742
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number371()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number1485()
      val right = Number1486()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number741()
    val b = Number740()
    return a.fib() + b.fib()
  }

}

class Number743 : StressfulInteger {

  companion object {
    private var VALUE = 743
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number371()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number1487()
      val right = Number1488()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number742()
    val b = Number741()
    return a.fib() + b.fib()
  }

}

class Number744 : StressfulInteger {

  companion object {
    private var VALUE = 744
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number372()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number1489()
      val right = Number1490()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number743()
    val b = Number742()
    return a.fib() + b.fib()
  }

}

class Number745 : StressfulInteger {

  companion object {
    private var VALUE = 745
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number372()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number1491()
      val right = Number1492()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number744()
    val b = Number743()
    return a.fib() + b.fib()
  }

}

class Number746 : StressfulInteger {

  companion object {
    private var VALUE = 746
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number373()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number1493()
      val right = Number1494()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number745()
    val b = Number744()
    return a.fib() + b.fib()
  }

}

class Number747 : StressfulInteger {

  companion object {
    private var VALUE = 747
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number373()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number1495()
      val right = Number1496()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number746()
    val b = Number745()
    return a.fib() + b.fib()
  }

}

class Number748 : StressfulInteger {

  companion object {
    private var VALUE = 748
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number374()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number1497()
      val right = Number1498()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number747()
    val b = Number746()
    return a.fib() + b.fib()
  }

}

class Number749 : StressfulInteger {

  companion object {
    private var VALUE = 749
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number374()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number1499()
      val right = Number1500()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number748()
    val b = Number747()
    return a.fib() + b.fib()
  }

}

class Number750 : StressfulInteger {

  companion object {
    private var VALUE = 750
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number375()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number1501()
      val right = Number1502()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number749()
    val b = Number748()
    return a.fib() + b.fib()
  }

}

class Number751 : StressfulInteger {

  companion object {
    private var VALUE = 751
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number375()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number1503()
      val right = Number1504()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number750()
    val b = Number749()
    return a.fib() + b.fib()
  }

}

class Number752 : StressfulInteger {

  companion object {
    private var VALUE = 752
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number376()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number1505()
      val right = Number1506()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number751()
    val b = Number750()
    return a.fib() + b.fib()
  }

}

class Number753 : StressfulInteger {

  companion object {
    private var VALUE = 753
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number376()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number1507()
      val right = Number1508()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number752()
    val b = Number751()
    return a.fib() + b.fib()
  }

}

class Number754 : StressfulInteger {

  companion object {
    private var VALUE = 754
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number377()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number1509()
      val right = Number1510()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number753()
    val b = Number752()
    return a.fib() + b.fib()
  }

}

class Number755 : StressfulInteger {

  companion object {
    private var VALUE = 755
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number377()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number1511()
      val right = Number1512()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number754()
    val b = Number753()
    return a.fib() + b.fib()
  }

}

class Number756 : StressfulInteger {

  companion object {
    private var VALUE = 756
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number378()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number1513()
      val right = Number1514()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number755()
    val b = Number754()
    return a.fib() + b.fib()
  }

}

class Number757 : StressfulInteger {

  companion object {
    private var VALUE = 757
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number378()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number1515()
      val right = Number1516()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number756()
    val b = Number755()
    return a.fib() + b.fib()
  }

}

class Number758 : StressfulInteger {

  companion object {
    private var VALUE = 758
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number379()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number1517()
      val right = Number1518()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number757()
    val b = Number756()
    return a.fib() + b.fib()
  }

}

class Number759 : StressfulInteger {

  companion object {
    private var VALUE = 759
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number379()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number1519()
      val right = Number1520()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number758()
    val b = Number757()
    return a.fib() + b.fib()
  }

}

class Number760 : StressfulInteger {

  companion object {
    private var VALUE = 760
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number380()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number1521()
      val right = Number1522()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number759()
    val b = Number758()
    return a.fib() + b.fib()
  }

}

class Number761 : StressfulInteger {

  companion object {
    private var VALUE = 761
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number380()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number1523()
      val right = Number1524()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number760()
    val b = Number759()
    return a.fib() + b.fib()
  }

}

class Number762 : StressfulInteger {

  companion object {
    private var VALUE = 762
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number381()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number1525()
      val right = Number1526()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number761()
    val b = Number760()
    return a.fib() + b.fib()
  }

}

class Number763 : StressfulInteger {

  companion object {
    private var VALUE = 763
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number381()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number1527()
      val right = Number1528()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number762()
    val b = Number761()
    return a.fib() + b.fib()
  }

}

class Number764 : StressfulInteger {

  companion object {
    private var VALUE = 764
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number382()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number1529()
      val right = Number1530()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number763()
    val b = Number762()
    return a.fib() + b.fib()
  }

}

class Number765 : StressfulInteger {

  companion object {
    private var VALUE = 765
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number382()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number1531()
      val right = Number1532()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number764()
    val b = Number763()
    return a.fib() + b.fib()
  }

}

class Number766 : StressfulInteger {

  companion object {
    private var VALUE = 766
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number383()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number1533()
      val right = Number1534()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number765()
    val b = Number764()
    return a.fib() + b.fib()
  }

}

class Number767 : StressfulInteger {

  companion object {
    private var VALUE = 767
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number383()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number1535()
      val right = Number1536()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number766()
    val b = Number765()
    return a.fib() + b.fib()
  }

}

class Number768 : StressfulInteger {

  companion object {
    private var VALUE = 768
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number384()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number1537()
      val right = Number1538()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number767()
    val b = Number766()
    return a.fib() + b.fib()
  }

}

class Number769 : StressfulInteger {

  companion object {
    private var VALUE = 769
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number384()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number1539()
      val right = Number1540()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number768()
    val b = Number767()
    return a.fib() + b.fib()
  }

}

class Number770 : StressfulInteger {

  companion object {
    private var VALUE = 770
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number385()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number1541()
      val right = Number1542()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number769()
    val b = Number768()
    return a.fib() + b.fib()
  }

}

class Number771 : StressfulInteger {

  companion object {
    private var VALUE = 771
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number385()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number1543()
      val right = Number1544()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number770()
    val b = Number769()
    return a.fib() + b.fib()
  }

}

class Number772 : StressfulInteger {

  companion object {
    private var VALUE = 772
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number386()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number1545()
      val right = Number1546()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number771()
    val b = Number770()
    return a.fib() + b.fib()
  }

}

class Number773 : StressfulInteger {

  companion object {
    private var VALUE = 773
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number386()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number1547()
      val right = Number1548()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number772()
    val b = Number771()
    return a.fib() + b.fib()
  }

}

class Number774 : StressfulInteger {

  companion object {
    private var VALUE = 774
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number387()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number1549()
      val right = Number1550()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number773()
    val b = Number772()
    return a.fib() + b.fib()
  }

}

class Number775 : StressfulInteger {

  companion object {
    private var VALUE = 775
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number387()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number1551()
      val right = Number1552()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number774()
    val b = Number773()
    return a.fib() + b.fib()
  }

}

class Number776 : StressfulInteger {

  companion object {
    private var VALUE = 776
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number388()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number1553()
      val right = Number1554()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number775()
    val b = Number774()
    return a.fib() + b.fib()
  }

}

class Number777 : StressfulInteger {

  companion object {
    private var VALUE = 777
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number388()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number1555()
      val right = Number1556()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number776()
    val b = Number775()
    return a.fib() + b.fib()
  }

}

class Number778 : StressfulInteger {

  companion object {
    private var VALUE = 778
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number389()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number1557()
      val right = Number1558()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number777()
    val b = Number776()
    return a.fib() + b.fib()
  }

}

class Number779 : StressfulInteger {

  companion object {
    private var VALUE = 779
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number389()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number1559()
      val right = Number1560()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number778()
    val b = Number777()
    return a.fib() + b.fib()
  }

}

class Number780 : StressfulInteger {

  companion object {
    private var VALUE = 780
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number390()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number1561()
      val right = Number1562()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number779()
    val b = Number778()
    return a.fib() + b.fib()
  }

}

class Number781 : StressfulInteger {

  companion object {
    private var VALUE = 781
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number390()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number1563()
      val right = Number1564()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number780()
    val b = Number779()
    return a.fib() + b.fib()
  }

}

class Number782 : StressfulInteger {

  companion object {
    private var VALUE = 782
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number391()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number1565()
      val right = Number1566()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number781()
    val b = Number780()
    return a.fib() + b.fib()
  }

}

class Number783 : StressfulInteger {

  companion object {
    private var VALUE = 783
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number391()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number1567()
      val right = Number1568()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number782()
    val b = Number781()
    return a.fib() + b.fib()
  }

}

class Number784 : StressfulInteger {

  companion object {
    private var VALUE = 784
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number392()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number1569()
      val right = Number1570()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number783()
    val b = Number782()
    return a.fib() + b.fib()
  }

}

class Number785 : StressfulInteger {

  companion object {
    private var VALUE = 785
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number392()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number1571()
      val right = Number1572()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number784()
    val b = Number783()
    return a.fib() + b.fib()
  }

}

class Number786 : StressfulInteger {

  companion object {
    private var VALUE = 786
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number393()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number1573()
      val right = Number1574()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number785()
    val b = Number784()
    return a.fib() + b.fib()
  }

}

class Number787 : StressfulInteger {

  companion object {
    private var VALUE = 787
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number393()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number1575()
      val right = Number1576()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number786()
    val b = Number785()
    return a.fib() + b.fib()
  }

}

class Number788 : StressfulInteger {

  companion object {
    private var VALUE = 788
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number394()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number1577()
      val right = Number1578()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number787()
    val b = Number786()
    return a.fib() + b.fib()
  }

}

class Number789 : StressfulInteger {

  companion object {
    private var VALUE = 789
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number394()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number1579()
      val right = Number1580()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number788()
    val b = Number787()
    return a.fib() + b.fib()
  }

}

class Number790 : StressfulInteger {

  companion object {
    private var VALUE = 790
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number395()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number1581()
      val right = Number1582()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number789()
    val b = Number788()
    return a.fib() + b.fib()
  }

}

class Number791 : StressfulInteger {

  companion object {
    private var VALUE = 791
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number395()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number1583()
      val right = Number1584()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number790()
    val b = Number789()
    return a.fib() + b.fib()
  }

}

class Number792 : StressfulInteger {

  companion object {
    private var VALUE = 792
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number396()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number1585()
      val right = Number1586()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number791()
    val b = Number790()
    return a.fib() + b.fib()
  }

}

class Number793 : StressfulInteger {

  companion object {
    private var VALUE = 793
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number396()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number1587()
      val right = Number1588()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number792()
    val b = Number791()
    return a.fib() + b.fib()
  }

}

class Number794 : StressfulInteger {

  companion object {
    private var VALUE = 794
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number397()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number1589()
      val right = Number1590()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number793()
    val b = Number792()
    return a.fib() + b.fib()
  }

}

class Number795 : StressfulInteger {

  companion object {
    private var VALUE = 795
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number397()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number1591()
      val right = Number1592()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number794()
    val b = Number793()
    return a.fib() + b.fib()
  }

}

class Number796 : StressfulInteger {

  companion object {
    private var VALUE = 796
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number398()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number1593()
      val right = Number1594()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number795()
    val b = Number794()
    return a.fib() + b.fib()
  }

}

class Number797 : StressfulInteger {

  companion object {
    private var VALUE = 797
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number398()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number1595()
      val right = Number1596()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number796()
    val b = Number795()
    return a.fib() + b.fib()
  }

}

class Number798 : StressfulInteger {

  companion object {
    private var VALUE = 798
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number399()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number1597()
      val right = Number1598()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number797()
    val b = Number796()
    return a.fib() + b.fib()
  }

}

class Number799 : StressfulInteger {

  companion object {
    private var VALUE = 799
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number399()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number1599()
      val right = Number1600()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number798()
    val b = Number797()
    return a.fib() + b.fib()
  }

}

class Number800 : StressfulInteger {

  companion object {
    private var VALUE = 800
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number400()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number1601()
      val right = Number1602()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number799()
    val b = Number798()
    return a.fib() + b.fib()
  }

}

class Number801 : StressfulInteger {

  companion object {
    private var VALUE = 801
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number400()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number1603()
      val right = Number1604()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number800()
    val b = Number799()
    return a.fib() + b.fib()
  }

}

class Number802 : StressfulInteger {

  companion object {
    private var VALUE = 802
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number401()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number1605()
      val right = Number1606()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number801()
    val b = Number800()
    return a.fib() + b.fib()
  }

}

class Number803 : StressfulInteger {

  companion object {
    private var VALUE = 803
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number401()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number1607()
      val right = Number1608()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number802()
    val b = Number801()
    return a.fib() + b.fib()
  }

}

class Number804 : StressfulInteger {

  companion object {
    private var VALUE = 804
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number402()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number1609()
      val right = Number1610()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number803()
    val b = Number802()
    return a.fib() + b.fib()
  }

}

class Number805 : StressfulInteger {

  companion object {
    private var VALUE = 805
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number402()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number1611()
      val right = Number1612()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number804()
    val b = Number803()
    return a.fib() + b.fib()
  }

}

class Number806 : StressfulInteger {

  companion object {
    private var VALUE = 806
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number403()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number1613()
      val right = Number1614()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number805()
    val b = Number804()
    return a.fib() + b.fib()
  }

}

class Number807 : StressfulInteger {

  companion object {
    private var VALUE = 807
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number403()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number1615()
      val right = Number1616()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number806()
    val b = Number805()
    return a.fib() + b.fib()
  }

}

class Number808 : StressfulInteger {

  companion object {
    private var VALUE = 808
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number404()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number1617()
      val right = Number1618()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number807()
    val b = Number806()
    return a.fib() + b.fib()
  }

}

class Number809 : StressfulInteger {

  companion object {
    private var VALUE = 809
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number404()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number1619()
      val right = Number1620()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number808()
    val b = Number807()
    return a.fib() + b.fib()
  }

}

class Number810 : StressfulInteger {

  companion object {
    private var VALUE = 810
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number405()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number1621()
      val right = Number1622()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number809()
    val b = Number808()
    return a.fib() + b.fib()
  }

}

class Number811 : StressfulInteger {

  companion object {
    private var VALUE = 811
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number405()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number1623()
      val right = Number1624()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number810()
    val b = Number809()
    return a.fib() + b.fib()
  }

}

class Number812 : StressfulInteger {

  companion object {
    private var VALUE = 812
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number406()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number1625()
      val right = Number1626()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number811()
    val b = Number810()
    return a.fib() + b.fib()
  }

}

class Number813 : StressfulInteger {

  companion object {
    private var VALUE = 813
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number406()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number1627()
      val right = Number1628()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number812()
    val b = Number811()
    return a.fib() + b.fib()
  }

}

class Number814 : StressfulInteger {

  companion object {
    private var VALUE = 814
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number407()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number1629()
      val right = Number1630()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number813()
    val b = Number812()
    return a.fib() + b.fib()
  }

}

class Number815 : StressfulInteger {

  companion object {
    private var VALUE = 815
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number407()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number1631()
      val right = Number1632()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number814()
    val b = Number813()
    return a.fib() + b.fib()
  }

}

class Number816 : StressfulInteger {

  companion object {
    private var VALUE = 816
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number408()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number1633()
      val right = Number1634()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number815()
    val b = Number814()
    return a.fib() + b.fib()
  }

}

class Number817 : StressfulInteger {

  companion object {
    private var VALUE = 817
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number408()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number1635()
      val right = Number1636()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number816()
    val b = Number815()
    return a.fib() + b.fib()
  }

}

class Number818 : StressfulInteger {

  companion object {
    private var VALUE = 818
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number409()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number1637()
      val right = Number1638()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number817()
    val b = Number816()
    return a.fib() + b.fib()
  }

}

class Number819 : StressfulInteger {

  companion object {
    private var VALUE = 819
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number409()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number1639()
      val right = Number1640()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number818()
    val b = Number817()
    return a.fib() + b.fib()
  }

}

class Number820 : StressfulInteger {

  companion object {
    private var VALUE = 820
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number410()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number1641()
      val right = Number1642()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number819()
    val b = Number818()
    return a.fib() + b.fib()
  }

}

class Number821 : StressfulInteger {

  companion object {
    private var VALUE = 821
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number410()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number1643()
      val right = Number1644()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number820()
    val b = Number819()
    return a.fib() + b.fib()
  }

}

class Number822 : StressfulInteger {

  companion object {
    private var VALUE = 822
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number411()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number1645()
      val right = Number1646()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number821()
    val b = Number820()
    return a.fib() + b.fib()
  }

}

class Number823 : StressfulInteger {

  companion object {
    private var VALUE = 823
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number411()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number1647()
      val right = Number1648()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number822()
    val b = Number821()
    return a.fib() + b.fib()
  }

}

class Number824 : StressfulInteger {

  companion object {
    private var VALUE = 824
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number412()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number1649()
      val right = Number1650()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number823()
    val b = Number822()
    return a.fib() + b.fib()
  }

}

class Number825 : StressfulInteger {

  companion object {
    private var VALUE = 825
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number412()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number1651()
      val right = Number1652()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number824()
    val b = Number823()
    return a.fib() + b.fib()
  }

}

class Number826 : StressfulInteger {

  companion object {
    private var VALUE = 826
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number413()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number1653()
      val right = Number1654()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number825()
    val b = Number824()
    return a.fib() + b.fib()
  }

}

class Number827 : StressfulInteger {

  companion object {
    private var VALUE = 827
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number413()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number1655()
      val right = Number1656()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number826()
    val b = Number825()
    return a.fib() + b.fib()
  }

}

class Number828 : StressfulInteger {

  companion object {
    private var VALUE = 828
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number414()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number1657()
      val right = Number1658()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number827()
    val b = Number826()
    return a.fib() + b.fib()
  }

}

class Number829 : StressfulInteger {

  companion object {
    private var VALUE = 829
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number414()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number1659()
      val right = Number1660()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number828()
    val b = Number827()
    return a.fib() + b.fib()
  }

}

class Number830 : StressfulInteger {

  companion object {
    private var VALUE = 830
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number415()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number1661()
      val right = Number1662()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number829()
    val b = Number828()
    return a.fib() + b.fib()
  }

}

class Number831 : StressfulInteger {

  companion object {
    private var VALUE = 831
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number415()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number1663()
      val right = Number1664()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number830()
    val b = Number829()
    return a.fib() + b.fib()
  }

}

class Number832 : StressfulInteger {

  companion object {
    private var VALUE = 832
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number416()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number1665()
      val right = Number1666()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number831()
    val b = Number830()
    return a.fib() + b.fib()
  }

}

class Number833 : StressfulInteger {

  companion object {
    private var VALUE = 833
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number416()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number1667()
      val right = Number1668()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number832()
    val b = Number831()
    return a.fib() + b.fib()
  }

}

class Number834 : StressfulInteger {

  companion object {
    private var VALUE = 834
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number417()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number1669()
      val right = Number1670()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number833()
    val b = Number832()
    return a.fib() + b.fib()
  }

}

class Number835 : StressfulInteger {

  companion object {
    private var VALUE = 835
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number417()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number1671()
      val right = Number1672()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number834()
    val b = Number833()
    return a.fib() + b.fib()
  }

}

class Number836 : StressfulInteger {

  companion object {
    private var VALUE = 836
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number418()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number1673()
      val right = Number1674()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number835()
    val b = Number834()
    return a.fib() + b.fib()
  }

}

class Number837 : StressfulInteger {

  companion object {
    private var VALUE = 837
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number418()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number1675()
      val right = Number1676()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number836()
    val b = Number835()
    return a.fib() + b.fib()
  }

}

class Number838 : StressfulInteger {

  companion object {
    private var VALUE = 838
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number419()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number1677()
      val right = Number1678()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number837()
    val b = Number836()
    return a.fib() + b.fib()
  }

}

class Number839 : StressfulInteger {

  companion object {
    private var VALUE = 839
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number419()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number1679()
      val right = Number1680()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number838()
    val b = Number837()
    return a.fib() + b.fib()
  }

}

class Number840 : StressfulInteger {

  companion object {
    private var VALUE = 840
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number420()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number1681()
      val right = Number1682()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number839()
    val b = Number838()
    return a.fib() + b.fib()
  }

}

class Number841 : StressfulInteger {

  companion object {
    private var VALUE = 841
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number420()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number1683()
      val right = Number1684()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number840()
    val b = Number839()
    return a.fib() + b.fib()
  }

}

class Number842 : StressfulInteger {

  companion object {
    private var VALUE = 842
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number421()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number1685()
      val right = Number1686()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number841()
    val b = Number840()
    return a.fib() + b.fib()
  }

}

class Number843 : StressfulInteger {

  companion object {
    private var VALUE = 843
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number421()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number1687()
      val right = Number1688()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number842()
    val b = Number841()
    return a.fib() + b.fib()
  }

}

class Number844 : StressfulInteger {

  companion object {
    private var VALUE = 844
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number422()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number1689()
      val right = Number1690()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number843()
    val b = Number842()
    return a.fib() + b.fib()
  }

}

class Number845 : StressfulInteger {

  companion object {
    private var VALUE = 845
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number422()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number1691()
      val right = Number1692()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number844()
    val b = Number843()
    return a.fib() + b.fib()
  }

}

class Number846 : StressfulInteger {

  companion object {
    private var VALUE = 846
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number423()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number1693()
      val right = Number1694()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number845()
    val b = Number844()
    return a.fib() + b.fib()
  }

}

class Number847 : StressfulInteger {

  companion object {
    private var VALUE = 847
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number423()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number1695()
      val right = Number1696()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number846()
    val b = Number845()
    return a.fib() + b.fib()
  }

}

class Number848 : StressfulInteger {

  companion object {
    private var VALUE = 848
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number424()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number1697()
      val right = Number1698()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number847()
    val b = Number846()
    return a.fib() + b.fib()
  }

}

class Number849 : StressfulInteger {

  companion object {
    private var VALUE = 849
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number424()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number1699()
      val right = Number1700()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number848()
    val b = Number847()
    return a.fib() + b.fib()
  }

}

class Number850 : StressfulInteger {

  companion object {
    private var VALUE = 850
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number425()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number1701()
      val right = Number1702()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number849()
    val b = Number848()
    return a.fib() + b.fib()
  }

}

class Number851 : StressfulInteger {

  companion object {
    private var VALUE = 851
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number425()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number1703()
      val right = Number1704()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number850()
    val b = Number849()
    return a.fib() + b.fib()
  }

}

class Number852 : StressfulInteger {

  companion object {
    private var VALUE = 852
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number426()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number1705()
      val right = Number1706()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number851()
    val b = Number850()
    return a.fib() + b.fib()
  }

}

class Number853 : StressfulInteger {

  companion object {
    private var VALUE = 853
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number426()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number1707()
      val right = Number1708()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number852()
    val b = Number851()
    return a.fib() + b.fib()
  }

}

class Number854 : StressfulInteger {

  companion object {
    private var VALUE = 854
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number427()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number1709()
      val right = Number1710()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number853()
    val b = Number852()
    return a.fib() + b.fib()
  }

}

class Number855 : StressfulInteger {

  companion object {
    private var VALUE = 855
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number427()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number1711()
      val right = Number1712()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number854()
    val b = Number853()
    return a.fib() + b.fib()
  }

}

class Number856 : StressfulInteger {

  companion object {
    private var VALUE = 856
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number428()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number1713()
      val right = Number1714()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number855()
    val b = Number854()
    return a.fib() + b.fib()
  }

}

class Number857 : StressfulInteger {

  companion object {
    private var VALUE = 857
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number428()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number1715()
      val right = Number1716()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number856()
    val b = Number855()
    return a.fib() + b.fib()
  }

}

class Number858 : StressfulInteger {

  companion object {
    private var VALUE = 858
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number429()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number1717()
      val right = Number1718()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number857()
    val b = Number856()
    return a.fib() + b.fib()
  }

}

class Number859 : StressfulInteger {

  companion object {
    private var VALUE = 859
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number429()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number1719()
      val right = Number1720()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number858()
    val b = Number857()
    return a.fib() + b.fib()
  }

}

class Number860 : StressfulInteger {

  companion object {
    private var VALUE = 860
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number430()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number1721()
      val right = Number1722()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number859()
    val b = Number858()
    return a.fib() + b.fib()
  }

}

class Number861 : StressfulInteger {

  companion object {
    private var VALUE = 861
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number430()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number1723()
      val right = Number1724()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number860()
    val b = Number859()
    return a.fib() + b.fib()
  }

}

class Number862 : StressfulInteger {

  companion object {
    private var VALUE = 862
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number431()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number1725()
      val right = Number1726()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number861()
    val b = Number860()
    return a.fib() + b.fib()
  }

}

class Number863 : StressfulInteger {

  companion object {
    private var VALUE = 863
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number431()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number1727()
      val right = Number1728()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number862()
    val b = Number861()
    return a.fib() + b.fib()
  }

}

class Number864 : StressfulInteger {

  companion object {
    private var VALUE = 864
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number432()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number1729()
      val right = Number1730()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number863()
    val b = Number862()
    return a.fib() + b.fib()
  }

}

class Number865 : StressfulInteger {

  companion object {
    private var VALUE = 865
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number432()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number1731()
      val right = Number1732()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number864()
    val b = Number863()
    return a.fib() + b.fib()
  }

}

class Number866 : StressfulInteger {

  companion object {
    private var VALUE = 866
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number433()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number1733()
      val right = Number1734()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number865()
    val b = Number864()
    return a.fib() + b.fib()
  }

}

class Number867 : StressfulInteger {

  companion object {
    private var VALUE = 867
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number433()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number1735()
      val right = Number1736()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number866()
    val b = Number865()
    return a.fib() + b.fib()
  }

}

class Number868 : StressfulInteger {

  companion object {
    private var VALUE = 868
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number434()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number1737()
      val right = Number1738()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number867()
    val b = Number866()
    return a.fib() + b.fib()
  }

}

class Number869 : StressfulInteger {

  companion object {
    private var VALUE = 869
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number434()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number1739()
      val right = Number1740()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number868()
    val b = Number867()
    return a.fib() + b.fib()
  }

}

class Number870 : StressfulInteger {

  companion object {
    private var VALUE = 870
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number435()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number1741()
      val right = Number1742()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number869()
    val b = Number868()
    return a.fib() + b.fib()
  }

}

class Number871 : StressfulInteger {

  companion object {
    private var VALUE = 871
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number435()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number1743()
      val right = Number1744()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number870()
    val b = Number869()
    return a.fib() + b.fib()
  }

}

class Number872 : StressfulInteger {

  companion object {
    private var VALUE = 872
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number436()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number1745()
      val right = Number1746()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number871()
    val b = Number870()
    return a.fib() + b.fib()
  }

}

class Number873 : StressfulInteger {

  companion object {
    private var VALUE = 873
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number436()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number1747()
      val right = Number1748()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number872()
    val b = Number871()
    return a.fib() + b.fib()
  }

}

class Number874 : StressfulInteger {

  companion object {
    private var VALUE = 874
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number437()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number1749()
      val right = Number1750()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number873()
    val b = Number872()
    return a.fib() + b.fib()
  }

}

class Number875 : StressfulInteger {

  companion object {
    private var VALUE = 875
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number437()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number1751()
      val right = Number1752()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number874()
    val b = Number873()
    return a.fib() + b.fib()
  }

}

class Number876 : StressfulInteger {

  companion object {
    private var VALUE = 876
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number438()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number1753()
      val right = Number1754()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number875()
    val b = Number874()
    return a.fib() + b.fib()
  }

}

class Number877 : StressfulInteger {

  companion object {
    private var VALUE = 877
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number438()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number1755()
      val right = Number1756()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number876()
    val b = Number875()
    return a.fib() + b.fib()
  }

}

class Number878 : StressfulInteger {

  companion object {
    private var VALUE = 878
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number439()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number1757()
      val right = Number1758()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number877()
    val b = Number876()
    return a.fib() + b.fib()
  }

}

class Number879 : StressfulInteger {

  companion object {
    private var VALUE = 879
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number439()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number1759()
      val right = Number1760()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number878()
    val b = Number877()
    return a.fib() + b.fib()
  }

}

class Number880 : StressfulInteger {

  companion object {
    private var VALUE = 880
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number440()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number1761()
      val right = Number1762()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number879()
    val b = Number878()
    return a.fib() + b.fib()
  }

}

class Number881 : StressfulInteger {

  companion object {
    private var VALUE = 881
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number440()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number1763()
      val right = Number1764()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number880()
    val b = Number879()
    return a.fib() + b.fib()
  }

}

class Number882 : StressfulInteger {

  companion object {
    private var VALUE = 882
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number441()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number1765()
      val right = Number1766()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number881()
    val b = Number880()
    return a.fib() + b.fib()
  }

}

class Number883 : StressfulInteger {

  companion object {
    private var VALUE = 883
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number441()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number1767()
      val right = Number1768()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number882()
    val b = Number881()
    return a.fib() + b.fib()
  }

}

class Number884 : StressfulInteger {

  companion object {
    private var VALUE = 884
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number442()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number1769()
      val right = Number1770()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number883()
    val b = Number882()
    return a.fib() + b.fib()
  }

}

class Number885 : StressfulInteger {

  companion object {
    private var VALUE = 885
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number442()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number1771()
      val right = Number1772()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number884()
    val b = Number883()
    return a.fib() + b.fib()
  }

}

class Number886 : StressfulInteger {

  companion object {
    private var VALUE = 886
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number443()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number1773()
      val right = Number1774()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number885()
    val b = Number884()
    return a.fib() + b.fib()
  }

}

class Number887 : StressfulInteger {

  companion object {
    private var VALUE = 887
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number443()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number1775()
      val right = Number1776()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number886()
    val b = Number885()
    return a.fib() + b.fib()
  }

}

class Number888 : StressfulInteger {

  companion object {
    private var VALUE = 888
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number444()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number1777()
      val right = Number1778()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number887()
    val b = Number886()
    return a.fib() + b.fib()
  }

}

class Number889 : StressfulInteger {

  companion object {
    private var VALUE = 889
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number444()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number1779()
      val right = Number1780()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number888()
    val b = Number887()
    return a.fib() + b.fib()
  }

}

class Number890 : StressfulInteger {

  companion object {
    private var VALUE = 890
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number445()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number1781()
      val right = Number1782()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number889()
    val b = Number888()
    return a.fib() + b.fib()
  }

}

class Number891 : StressfulInteger {

  companion object {
    private var VALUE = 891
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number445()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number1783()
      val right = Number1784()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number890()
    val b = Number889()
    return a.fib() + b.fib()
  }

}

class Number892 : StressfulInteger {

  companion object {
    private var VALUE = 892
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number446()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number1785()
      val right = Number1786()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number891()
    val b = Number890()
    return a.fib() + b.fib()
  }

}

class Number893 : StressfulInteger {

  companion object {
    private var VALUE = 893
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number446()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number1787()
      val right = Number1788()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number892()
    val b = Number891()
    return a.fib() + b.fib()
  }

}

class Number894 : StressfulInteger {

  companion object {
    private var VALUE = 894
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number447()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number1789()
      val right = Number1790()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number893()
    val b = Number892()
    return a.fib() + b.fib()
  }

}

class Number895 : StressfulInteger {

  companion object {
    private var VALUE = 895
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number447()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number1791()
      val right = Number1792()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number894()
    val b = Number893()
    return a.fib() + b.fib()
  }

}

class Number896 : StressfulInteger {

  companion object {
    private var VALUE = 896
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number448()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number1793()
      val right = Number1794()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number895()
    val b = Number894()
    return a.fib() + b.fib()
  }

}

class Number897 : StressfulInteger {

  companion object {
    private var VALUE = 897
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number448()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number1795()
      val right = Number1796()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number896()
    val b = Number895()
    return a.fib() + b.fib()
  }

}

class Number898 : StressfulInteger {

  companion object {
    private var VALUE = 898
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number449()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number1797()
      val right = Number1798()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number897()
    val b = Number896()
    return a.fib() + b.fib()
  }

}

class Number899 : StressfulInteger {

  companion object {
    private var VALUE = 899
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number449()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number1799()
      val right = Number1800()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number898()
    val b = Number897()
    return a.fib() + b.fib()
  }

}

class Number900 : StressfulInteger {

  companion object {
    private var VALUE = 900
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number450()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number1801()
      val right = Number1802()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number899()
    val b = Number898()
    return a.fib() + b.fib()
  }

}

class Number901 : StressfulInteger {

  companion object {
    private var VALUE = 901
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number450()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number1803()
      val right = Number1804()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number900()
    val b = Number899()
    return a.fib() + b.fib()
  }

}

class Number902 : StressfulInteger {

  companion object {
    private var VALUE = 902
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number451()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number1805()
      val right = Number1806()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number901()
    val b = Number900()
    return a.fib() + b.fib()
  }

}

class Number903 : StressfulInteger {

  companion object {
    private var VALUE = 903
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number451()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number1807()
      val right = Number1808()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number902()
    val b = Number901()
    return a.fib() + b.fib()
  }

}

class Number904 : StressfulInteger {

  companion object {
    private var VALUE = 904
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number452()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number1809()
      val right = Number1810()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number903()
    val b = Number902()
    return a.fib() + b.fib()
  }

}

class Number905 : StressfulInteger {

  companion object {
    private var VALUE = 905
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number452()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number1811()
      val right = Number1812()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number904()
    val b = Number903()
    return a.fib() + b.fib()
  }

}

class Number906 : StressfulInteger {

  companion object {
    private var VALUE = 906
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number453()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number1813()
      val right = Number1814()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number905()
    val b = Number904()
    return a.fib() + b.fib()
  }

}

class Number907 : StressfulInteger {

  companion object {
    private var VALUE = 907
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number453()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number1815()
      val right = Number1816()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number906()
    val b = Number905()
    return a.fib() + b.fib()
  }

}

class Number908 : StressfulInteger {

  companion object {
    private var VALUE = 908
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number454()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number1817()
      val right = Number1818()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number907()
    val b = Number906()
    return a.fib() + b.fib()
  }

}

class Number909 : StressfulInteger {

  companion object {
    private var VALUE = 909
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number454()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number1819()
      val right = Number1820()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number908()
    val b = Number907()
    return a.fib() + b.fib()
  }

}

class Number910 : StressfulInteger {

  companion object {
    private var VALUE = 910
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number455()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number1821()
      val right = Number1822()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number909()
    val b = Number908()
    return a.fib() + b.fib()
  }

}

class Number911 : StressfulInteger {

  companion object {
    private var VALUE = 911
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number455()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number1823()
      val right = Number1824()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number910()
    val b = Number909()
    return a.fib() + b.fib()
  }

}

class Number912 : StressfulInteger {

  companion object {
    private var VALUE = 912
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number456()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number1825()
      val right = Number1826()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number911()
    val b = Number910()
    return a.fib() + b.fib()
  }

}

class Number913 : StressfulInteger {

  companion object {
    private var VALUE = 913
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number456()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number1827()
      val right = Number1828()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number912()
    val b = Number911()
    return a.fib() + b.fib()
  }

}

class Number914 : StressfulInteger {

  companion object {
    private var VALUE = 914
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number457()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number1829()
      val right = Number1830()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number913()
    val b = Number912()
    return a.fib() + b.fib()
  }

}

class Number915 : StressfulInteger {

  companion object {
    private var VALUE = 915
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number457()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number1831()
      val right = Number1832()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number914()
    val b = Number913()
    return a.fib() + b.fib()
  }

}

class Number916 : StressfulInteger {

  companion object {
    private var VALUE = 916
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number458()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number1833()
      val right = Number1834()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number915()
    val b = Number914()
    return a.fib() + b.fib()
  }

}

class Number917 : StressfulInteger {

  companion object {
    private var VALUE = 917
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number458()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number1835()
      val right = Number1836()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number916()
    val b = Number915()
    return a.fib() + b.fib()
  }

}

class Number918 : StressfulInteger {

  companion object {
    private var VALUE = 918
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number459()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number1837()
      val right = Number1838()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number917()
    val b = Number916()
    return a.fib() + b.fib()
  }

}

class Number919 : StressfulInteger {

  companion object {
    private var VALUE = 919
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number459()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number1839()
      val right = Number1840()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number918()
    val b = Number917()
    return a.fib() + b.fib()
  }

}

class Number920 : StressfulInteger {

  companion object {
    private var VALUE = 920
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number460()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number1841()
      val right = Number1842()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number919()
    val b = Number918()
    return a.fib() + b.fib()
  }

}

class Number921 : StressfulInteger {

  companion object {
    private var VALUE = 921
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number460()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number1843()
      val right = Number1844()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number920()
    val b = Number919()
    return a.fib() + b.fib()
  }

}

class Number922 : StressfulInteger {

  companion object {
    private var VALUE = 922
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number461()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number1845()
      val right = Number1846()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number921()
    val b = Number920()
    return a.fib() + b.fib()
  }

}

class Number923 : StressfulInteger {

  companion object {
    private var VALUE = 923
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number461()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number1847()
      val right = Number1848()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number922()
    val b = Number921()
    return a.fib() + b.fib()
  }

}

class Number924 : StressfulInteger {

  companion object {
    private var VALUE = 924
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number462()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number1849()
      val right = Number1850()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number923()
    val b = Number922()
    return a.fib() + b.fib()
  }

}

class Number925 : StressfulInteger {

  companion object {
    private var VALUE = 925
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number462()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number1851()
      val right = Number1852()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number924()
    val b = Number923()
    return a.fib() + b.fib()
  }

}

class Number926 : StressfulInteger {

  companion object {
    private var VALUE = 926
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number463()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number1853()
      val right = Number1854()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number925()
    val b = Number924()
    return a.fib() + b.fib()
  }

}

class Number927 : StressfulInteger {

  companion object {
    private var VALUE = 927
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number463()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number1855()
      val right = Number1856()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number926()
    val b = Number925()
    return a.fib() + b.fib()
  }

}

class Number928 : StressfulInteger {

  companion object {
    private var VALUE = 928
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number464()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number1857()
      val right = Number1858()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number927()
    val b = Number926()
    return a.fib() + b.fib()
  }

}

class Number929 : StressfulInteger {

  companion object {
    private var VALUE = 929
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number464()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number1859()
      val right = Number1860()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number928()
    val b = Number927()
    return a.fib() + b.fib()
  }

}

class Number930 : StressfulInteger {

  companion object {
    private var VALUE = 930
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number465()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number1861()
      val right = Number1862()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number929()
    val b = Number928()
    return a.fib() + b.fib()
  }

}

class Number931 : StressfulInteger {

  companion object {
    private var VALUE = 931
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number465()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number1863()
      val right = Number1864()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number930()
    val b = Number929()
    return a.fib() + b.fib()
  }

}

class Number932 : StressfulInteger {

  companion object {
    private var VALUE = 932
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number466()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number1865()
      val right = Number1866()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number931()
    val b = Number930()
    return a.fib() + b.fib()
  }

}

class Number933 : StressfulInteger {

  companion object {
    private var VALUE = 933
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number466()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number1867()
      val right = Number1868()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number932()
    val b = Number931()
    return a.fib() + b.fib()
  }

}

class Number934 : StressfulInteger {

  companion object {
    private var VALUE = 934
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number467()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number1869()
      val right = Number1870()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number933()
    val b = Number932()
    return a.fib() + b.fib()
  }

}

class Number935 : StressfulInteger {

  companion object {
    private var VALUE = 935
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number467()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number1871()
      val right = Number1872()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number934()
    val b = Number933()
    return a.fib() + b.fib()
  }

}

class Number936 : StressfulInteger {

  companion object {
    private var VALUE = 936
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number468()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number1873()
      val right = Number1874()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number935()
    val b = Number934()
    return a.fib() + b.fib()
  }

}

class Number937 : StressfulInteger {

  companion object {
    private var VALUE = 937
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number468()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number1875()
      val right = Number1876()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number936()
    val b = Number935()
    return a.fib() + b.fib()
  }

}

class Number938 : StressfulInteger {

  companion object {
    private var VALUE = 938
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number469()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number1877()
      val right = Number1878()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number937()
    val b = Number936()
    return a.fib() + b.fib()
  }

}

class Number939 : StressfulInteger {

  companion object {
    private var VALUE = 939
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number469()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number1879()
      val right = Number1880()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number938()
    val b = Number937()
    return a.fib() + b.fib()
  }

}

class Number940 : StressfulInteger {

  companion object {
    private var VALUE = 940
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number470()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number1881()
      val right = Number1882()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number939()
    val b = Number938()
    return a.fib() + b.fib()
  }

}

class Number941 : StressfulInteger {

  companion object {
    private var VALUE = 941
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number470()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number1883()
      val right = Number1884()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number940()
    val b = Number939()
    return a.fib() + b.fib()
  }

}

class Number942 : StressfulInteger {

  companion object {
    private var VALUE = 942
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number471()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number1885()
      val right = Number1886()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number941()
    val b = Number940()
    return a.fib() + b.fib()
  }

}

class Number943 : StressfulInteger {

  companion object {
    private var VALUE = 943
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number471()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number1887()
      val right = Number1888()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number942()
    val b = Number941()
    return a.fib() + b.fib()
  }

}

class Number944 : StressfulInteger {

  companion object {
    private var VALUE = 944
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number472()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number1889()
      val right = Number1890()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number943()
    val b = Number942()
    return a.fib() + b.fib()
  }

}

class Number945 : StressfulInteger {

  companion object {
    private var VALUE = 945
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number472()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number1891()
      val right = Number1892()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number944()
    val b = Number943()
    return a.fib() + b.fib()
  }

}

class Number946 : StressfulInteger {

  companion object {
    private var VALUE = 946
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number473()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number1893()
      val right = Number1894()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number945()
    val b = Number944()
    return a.fib() + b.fib()
  }

}

class Number947 : StressfulInteger {

  companion object {
    private var VALUE = 947
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number473()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number1895()
      val right = Number1896()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number946()
    val b = Number945()
    return a.fib() + b.fib()
  }

}

class Number948 : StressfulInteger {

  companion object {
    private var VALUE = 948
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number474()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number1897()
      val right = Number1898()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number947()
    val b = Number946()
    return a.fib() + b.fib()
  }

}

class Number949 : StressfulInteger {

  companion object {
    private var VALUE = 949
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number474()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number1899()
      val right = Number1900()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number948()
    val b = Number947()
    return a.fib() + b.fib()
  }

}

class Number950 : StressfulInteger {

  companion object {
    private var VALUE = 950
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number475()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number1901()
      val right = Number1902()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number949()
    val b = Number948()
    return a.fib() + b.fib()
  }

}

class Number951 : StressfulInteger {

  companion object {
    private var VALUE = 951
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number475()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number1903()
      val right = Number1904()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number950()
    val b = Number949()
    return a.fib() + b.fib()
  }

}

class Number952 : StressfulInteger {

  companion object {
    private var VALUE = 952
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number476()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number1905()
      val right = Number1906()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number951()
    val b = Number950()
    return a.fib() + b.fib()
  }

}

class Number953 : StressfulInteger {

  companion object {
    private var VALUE = 953
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number476()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number1907()
      val right = Number1908()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number952()
    val b = Number951()
    return a.fib() + b.fib()
  }

}

class Number954 : StressfulInteger {

  companion object {
    private var VALUE = 954
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number477()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number1909()
      val right = Number1910()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number953()
    val b = Number952()
    return a.fib() + b.fib()
  }

}

class Number955 : StressfulInteger {

  companion object {
    private var VALUE = 955
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number477()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number1911()
      val right = Number1912()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number954()
    val b = Number953()
    return a.fib() + b.fib()
  }

}

class Number956 : StressfulInteger {

  companion object {
    private var VALUE = 956
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number478()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number1913()
      val right = Number1914()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number955()
    val b = Number954()
    return a.fib() + b.fib()
  }

}

class Number957 : StressfulInteger {

  companion object {
    private var VALUE = 957
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number478()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number1915()
      val right = Number1916()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number956()
    val b = Number955()
    return a.fib() + b.fib()
  }

}

class Number958 : StressfulInteger {

  companion object {
    private var VALUE = 958
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number479()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number1917()
      val right = Number1918()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number957()
    val b = Number956()
    return a.fib() + b.fib()
  }

}

class Number959 : StressfulInteger {

  companion object {
    private var VALUE = 959
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number479()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number1919()
      val right = Number1920()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number958()
    val b = Number957()
    return a.fib() + b.fib()
  }

}

class Number960 : StressfulInteger {

  companion object {
    private var VALUE = 960
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number480()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number1921()
      val right = Number1922()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number959()
    val b = Number958()
    return a.fib() + b.fib()
  }

}

class Number961 : StressfulInteger {

  companion object {
    private var VALUE = 961
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number480()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number1923()
      val right = Number1924()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number960()
    val b = Number959()
    return a.fib() + b.fib()
  }

}

class Number962 : StressfulInteger {

  companion object {
    private var VALUE = 962
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number481()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number1925()
      val right = Number1926()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number961()
    val b = Number960()
    return a.fib() + b.fib()
  }

}

class Number963 : StressfulInteger {

  companion object {
    private var VALUE = 963
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number481()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number1927()
      val right = Number1928()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number962()
    val b = Number961()
    return a.fib() + b.fib()
  }

}

class Number964 : StressfulInteger {

  companion object {
    private var VALUE = 964
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number482()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number1929()
      val right = Number1930()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number963()
    val b = Number962()
    return a.fib() + b.fib()
  }

}

class Number965 : StressfulInteger {

  companion object {
    private var VALUE = 965
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number482()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number1931()
      val right = Number1932()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number964()
    val b = Number963()
    return a.fib() + b.fib()
  }

}

class Number966 : StressfulInteger {

  companion object {
    private var VALUE = 966
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number483()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number1933()
      val right = Number1934()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number965()
    val b = Number964()
    return a.fib() + b.fib()
  }

}

class Number967 : StressfulInteger {

  companion object {
    private var VALUE = 967
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number483()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number1935()
      val right = Number1936()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number966()
    val b = Number965()
    return a.fib() + b.fib()
  }

}

class Number968 : StressfulInteger {

  companion object {
    private var VALUE = 968
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number484()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number1937()
      val right = Number1938()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number967()
    val b = Number966()
    return a.fib() + b.fib()
  }

}

class Number969 : StressfulInteger {

  companion object {
    private var VALUE = 969
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number484()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number1939()
      val right = Number1940()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number968()
    val b = Number967()
    return a.fib() + b.fib()
  }

}

class Number970 : StressfulInteger {

  companion object {
    private var VALUE = 970
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number485()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number1941()
      val right = Number1942()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number969()
    val b = Number968()
    return a.fib() + b.fib()
  }

}

class Number971 : StressfulInteger {

  companion object {
    private var VALUE = 971
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number485()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number1943()
      val right = Number1944()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number970()
    val b = Number969()
    return a.fib() + b.fib()
  }

}

class Number972 : StressfulInteger {

  companion object {
    private var VALUE = 972
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number486()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number1945()
      val right = Number1946()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number971()
    val b = Number970()
    return a.fib() + b.fib()
  }

}

class Number973 : StressfulInteger {

  companion object {
    private var VALUE = 973
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number486()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number1947()
      val right = Number1948()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number972()
    val b = Number971()
    return a.fib() + b.fib()
  }

}

class Number974 : StressfulInteger {

  companion object {
    private var VALUE = 974
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number487()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number1949()
      val right = Number1950()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number973()
    val b = Number972()
    return a.fib() + b.fib()
  }

}

class Number975 : StressfulInteger {

  companion object {
    private var VALUE = 975
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number487()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number1951()
      val right = Number1952()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number974()
    val b = Number973()
    return a.fib() + b.fib()
  }

}

class Number976 : StressfulInteger {

  companion object {
    private var VALUE = 976
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number488()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number1953()
      val right = Number1954()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number975()
    val b = Number974()
    return a.fib() + b.fib()
  }

}

class Number977 : StressfulInteger {

  companion object {
    private var VALUE = 977
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number488()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number1955()
      val right = Number1956()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number976()
    val b = Number975()
    return a.fib() + b.fib()
  }

}

class Number978 : StressfulInteger {

  companion object {
    private var VALUE = 978
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number489()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number1957()
      val right = Number1958()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number977()
    val b = Number976()
    return a.fib() + b.fib()
  }

}

class Number979 : StressfulInteger {

  companion object {
    private var VALUE = 979
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number489()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number1959()
      val right = Number1960()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number978()
    val b = Number977()
    return a.fib() + b.fib()
  }

}

class Number980 : StressfulInteger {

  companion object {
    private var VALUE = 980
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number490()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number1961()
      val right = Number1962()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number979()
    val b = Number978()
    return a.fib() + b.fib()
  }

}

class Number981 : StressfulInteger {

  companion object {
    private var VALUE = 981
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number490()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number1963()
      val right = Number1964()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number980()
    val b = Number979()
    return a.fib() + b.fib()
  }

}

class Number982 : StressfulInteger {

  companion object {
    private var VALUE = 982
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number491()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number1965()
      val right = Number1966()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number981()
    val b = Number980()
    return a.fib() + b.fib()
  }

}

class Number983 : StressfulInteger {

  companion object {
    private var VALUE = 983
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number491()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number1967()
      val right = Number1968()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number982()
    val b = Number981()
    return a.fib() + b.fib()
  }

}

class Number984 : StressfulInteger {

  companion object {
    private var VALUE = 984
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number492()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number1969()
      val right = Number1970()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number983()
    val b = Number982()
    return a.fib() + b.fib()
  }

}

class Number985 : StressfulInteger {

  companion object {
    private var VALUE = 985
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number492()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number1971()
      val right = Number1972()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number984()
    val b = Number983()
    return a.fib() + b.fib()
  }

}

class Number986 : StressfulInteger {

  companion object {
    private var VALUE = 986
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number493()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number1973()
      val right = Number1974()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number985()
    val b = Number984()
    return a.fib() + b.fib()
  }

}

class Number987 : StressfulInteger {

  companion object {
    private var VALUE = 987
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number493()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number1975()
      val right = Number1976()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number986()
    val b = Number985()
    return a.fib() + b.fib()
  }

}

class Number988 : StressfulInteger {

  companion object {
    private var VALUE = 988
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number494()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number1977()
      val right = Number1978()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number987()
    val b = Number986()
    return a.fib() + b.fib()
  }

}

class Number989 : StressfulInteger {

  companion object {
    private var VALUE = 989
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number494()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number1979()
      val right = Number1980()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number988()
    val b = Number987()
    return a.fib() + b.fib()
  }

}

class Number990 : StressfulInteger {

  companion object {
    private var VALUE = 990
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number495()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number1981()
      val right = Number1982()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number989()
    val b = Number988()
    return a.fib() + b.fib()
  }

}

class Number991 : StressfulInteger {

  companion object {
    private var VALUE = 991
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number495()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number1983()
      val right = Number1984()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number990()
    val b = Number989()
    return a.fib() + b.fib()
  }

}

class Number992 : StressfulInteger {

  companion object {
    private var VALUE = 992
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number496()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number1985()
      val right = Number1986()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number991()
    val b = Number990()
    return a.fib() + b.fib()
  }

}

class Number993 : StressfulInteger {

  companion object {
    private var VALUE = 993
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number496()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number1987()
      val right = Number1988()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number992()
    val b = Number991()
    return a.fib() + b.fib()
  }

}

class Number994 : StressfulInteger {

  companion object {
    private var VALUE = 994
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number497()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number1989()
      val right = Number1990()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number993()
    val b = Number992()
    return a.fib() + b.fib()
  }

}

class Number995 : StressfulInteger {

  companion object {
    private var VALUE = 995
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number497()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number1991()
      val right = Number1992()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number994()
    val b = Number993()
    return a.fib() + b.fib()
  }

}

class Number996 : StressfulInteger {

  companion object {
    private var VALUE = 996
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number498()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number1993()
      val right = Number1994()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number995()
    val b = Number994()
    return a.fib() + b.fib()
  }

}

class Number997 : StressfulInteger {

  companion object {
    private var VALUE = 997
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number498()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number1995()
      val right = Number1996()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number996()
    val b = Number995()
    return a.fib() + b.fib()
  }

}

class Number998 : StressfulInteger {

  companion object {
    private var VALUE = 998
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number499()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number1997()
      val right = Number1998()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number997()
    val b = Number996()
    return a.fib() + b.fib()
  }

}

class Number999 : StressfulInteger {

  companion object {
    private var VALUE = 999
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number499()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number1999()
      val right = Number2000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number998()
    val b = Number997()
    return a.fib() + b.fib()
  }

}

