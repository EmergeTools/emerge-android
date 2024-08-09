package com.emergetools.reaper.sample.stress.numbers

class Number5000 : StressfulInteger {

  companion object {
    private var VALUE = 5000
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2500()
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
    val a = Number4999()
    val b = Number4998()
    return a.fib() + b.fib()
  }

}

class Number5001 : StressfulInteger {

  companion object {
    private var VALUE = 5001
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2500()
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
    val a = Number5000()
    val b = Number4999()
    return a.fib() + b.fib()
  }

}

class Number5002 : StressfulInteger {

  companion object {
    private var VALUE = 5002
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2501()
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
    val a = Number5001()
    val b = Number5000()
    return a.fib() + b.fib()
  }

}

class Number5003 : StressfulInteger {

  companion object {
    private var VALUE = 5003
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2501()
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
    val a = Number5002()
    val b = Number5001()
    return a.fib() + b.fib()
  }

}

class Number5004 : StressfulInteger {

  companion object {
    private var VALUE = 5004
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2502()
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
    val a = Number5003()
    val b = Number5002()
    return a.fib() + b.fib()
  }

}

class Number5005 : StressfulInteger {

  companion object {
    private var VALUE = 5005
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2502()
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
    val a = Number5004()
    val b = Number5003()
    return a.fib() + b.fib()
  }

}

class Number5006 : StressfulInteger {

  companion object {
    private var VALUE = 5006
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2503()
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
    val a = Number5005()
    val b = Number5004()
    return a.fib() + b.fib()
  }

}

class Number5007 : StressfulInteger {

  companion object {
    private var VALUE = 5007
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2503()
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
    val a = Number5006()
    val b = Number5005()
    return a.fib() + b.fib()
  }

}

class Number5008 : StressfulInteger {

  companion object {
    private var VALUE = 5008
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2504()
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
    val a = Number5007()
    val b = Number5006()
    return a.fib() + b.fib()
  }

}

class Number5009 : StressfulInteger {

  companion object {
    private var VALUE = 5009
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2504()
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
    val a = Number5008()
    val b = Number5007()
    return a.fib() + b.fib()
  }

}

class Number5010 : StressfulInteger {

  companion object {
    private var VALUE = 5010
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2505()
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
    val a = Number5009()
    val b = Number5008()
    return a.fib() + b.fib()
  }

}

class Number5011 : StressfulInteger {

  companion object {
    private var VALUE = 5011
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2505()
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
    val a = Number5010()
    val b = Number5009()
    return a.fib() + b.fib()
  }

}

class Number5012 : StressfulInteger {

  companion object {
    private var VALUE = 5012
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2506()
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
    val a = Number5011()
    val b = Number5010()
    return a.fib() + b.fib()
  }

}

class Number5013 : StressfulInteger {

  companion object {
    private var VALUE = 5013
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2506()
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
    val a = Number5012()
    val b = Number5011()
    return a.fib() + b.fib()
  }

}

class Number5014 : StressfulInteger {

  companion object {
    private var VALUE = 5014
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2507()
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
    val a = Number5013()
    val b = Number5012()
    return a.fib() + b.fib()
  }

}

class Number5015 : StressfulInteger {

  companion object {
    private var VALUE = 5015
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2507()
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
    val a = Number5014()
    val b = Number5013()
    return a.fib() + b.fib()
  }

}

class Number5016 : StressfulInteger {

  companion object {
    private var VALUE = 5016
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2508()
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
    val a = Number5015()
    val b = Number5014()
    return a.fib() + b.fib()
  }

}

class Number5017 : StressfulInteger {

  companion object {
    private var VALUE = 5017
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2508()
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
    val a = Number5016()
    val b = Number5015()
    return a.fib() + b.fib()
  }

}

class Number5018 : StressfulInteger {

  companion object {
    private var VALUE = 5018
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2509()
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
    val a = Number5017()
    val b = Number5016()
    return a.fib() + b.fib()
  }

}

class Number5019 : StressfulInteger {

  companion object {
    private var VALUE = 5019
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2509()
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
    val a = Number5018()
    val b = Number5017()
    return a.fib() + b.fib()
  }

}

class Number5020 : StressfulInteger {

  companion object {
    private var VALUE = 5020
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2510()
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
    val a = Number5019()
    val b = Number5018()
    return a.fib() + b.fib()
  }

}

class Number5021 : StressfulInteger {

  companion object {
    private var VALUE = 5021
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2510()
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
    val a = Number5020()
    val b = Number5019()
    return a.fib() + b.fib()
  }

}

class Number5022 : StressfulInteger {

  companion object {
    private var VALUE = 5022
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2511()
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
    val a = Number5021()
    val b = Number5020()
    return a.fib() + b.fib()
  }

}

class Number5023 : StressfulInteger {

  companion object {
    private var VALUE = 5023
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2511()
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
    val a = Number5022()
    val b = Number5021()
    return a.fib() + b.fib()
  }

}

class Number5024 : StressfulInteger {

  companion object {
    private var VALUE = 5024
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2512()
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
    val a = Number5023()
    val b = Number5022()
    return a.fib() + b.fib()
  }

}

class Number5025 : StressfulInteger {

  companion object {
    private var VALUE = 5025
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2512()
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
    val a = Number5024()
    val b = Number5023()
    return a.fib() + b.fib()
  }

}

class Number5026 : StressfulInteger {

  companion object {
    private var VALUE = 5026
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2513()
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
    val a = Number5025()
    val b = Number5024()
    return a.fib() + b.fib()
  }

}

class Number5027 : StressfulInteger {

  companion object {
    private var VALUE = 5027
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2513()
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
    val a = Number5026()
    val b = Number5025()
    return a.fib() + b.fib()
  }

}

class Number5028 : StressfulInteger {

  companion object {
    private var VALUE = 5028
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2514()
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
    val a = Number5027()
    val b = Number5026()
    return a.fib() + b.fib()
  }

}

class Number5029 : StressfulInteger {

  companion object {
    private var VALUE = 5029
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2514()
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
    val a = Number5028()
    val b = Number5027()
    return a.fib() + b.fib()
  }

}

class Number5030 : StressfulInteger {

  companion object {
    private var VALUE = 5030
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2515()
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
    val a = Number5029()
    val b = Number5028()
    return a.fib() + b.fib()
  }

}

class Number5031 : StressfulInteger {

  companion object {
    private var VALUE = 5031
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2515()
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
    val a = Number5030()
    val b = Number5029()
    return a.fib() + b.fib()
  }

}

class Number5032 : StressfulInteger {

  companion object {
    private var VALUE = 5032
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2516()
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
    val a = Number5031()
    val b = Number5030()
    return a.fib() + b.fib()
  }

}

class Number5033 : StressfulInteger {

  companion object {
    private var VALUE = 5033
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2516()
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
    val a = Number5032()
    val b = Number5031()
    return a.fib() + b.fib()
  }

}

class Number5034 : StressfulInteger {

  companion object {
    private var VALUE = 5034
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2517()
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
    val a = Number5033()
    val b = Number5032()
    return a.fib() + b.fib()
  }

}

class Number5035 : StressfulInteger {

  companion object {
    private var VALUE = 5035
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2517()
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
    val a = Number5034()
    val b = Number5033()
    return a.fib() + b.fib()
  }

}

class Number5036 : StressfulInteger {

  companion object {
    private var VALUE = 5036
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2518()
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
    val a = Number5035()
    val b = Number5034()
    return a.fib() + b.fib()
  }

}

class Number5037 : StressfulInteger {

  companion object {
    private var VALUE = 5037
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2518()
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
    val a = Number5036()
    val b = Number5035()
    return a.fib() + b.fib()
  }

}

class Number5038 : StressfulInteger {

  companion object {
    private var VALUE = 5038
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2519()
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
    val a = Number5037()
    val b = Number5036()
    return a.fib() + b.fib()
  }

}

class Number5039 : StressfulInteger {

  companion object {
    private var VALUE = 5039
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2519()
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
    val a = Number5038()
    val b = Number5037()
    return a.fib() + b.fib()
  }

}

class Number5040 : StressfulInteger {

  companion object {
    private var VALUE = 5040
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2520()
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
    val a = Number5039()
    val b = Number5038()
    return a.fib() + b.fib()
  }

}

class Number5041 : StressfulInteger {

  companion object {
    private var VALUE = 5041
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2520()
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
    val a = Number5040()
    val b = Number5039()
    return a.fib() + b.fib()
  }

}

class Number5042 : StressfulInteger {

  companion object {
    private var VALUE = 5042
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2521()
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
    val a = Number5041()
    val b = Number5040()
    return a.fib() + b.fib()
  }

}

class Number5043 : StressfulInteger {

  companion object {
    private var VALUE = 5043
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2521()
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
    val a = Number5042()
    val b = Number5041()
    return a.fib() + b.fib()
  }

}

class Number5044 : StressfulInteger {

  companion object {
    private var VALUE = 5044
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2522()
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
    val a = Number5043()
    val b = Number5042()
    return a.fib() + b.fib()
  }

}

class Number5045 : StressfulInteger {

  companion object {
    private var VALUE = 5045
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2522()
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
    val a = Number5044()
    val b = Number5043()
    return a.fib() + b.fib()
  }

}

class Number5046 : StressfulInteger {

  companion object {
    private var VALUE = 5046
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2523()
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
    val a = Number5045()
    val b = Number5044()
    return a.fib() + b.fib()
  }

}

class Number5047 : StressfulInteger {

  companion object {
    private var VALUE = 5047
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2523()
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
    val a = Number5046()
    val b = Number5045()
    return a.fib() + b.fib()
  }

}

class Number5048 : StressfulInteger {

  companion object {
    private var VALUE = 5048
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2524()
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
    val a = Number5047()
    val b = Number5046()
    return a.fib() + b.fib()
  }

}

class Number5049 : StressfulInteger {

  companion object {
    private var VALUE = 5049
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2524()
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
    val a = Number5048()
    val b = Number5047()
    return a.fib() + b.fib()
  }

}

class Number5050 : StressfulInteger {

  companion object {
    private var VALUE = 5050
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2525()
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
    val a = Number5049()
    val b = Number5048()
    return a.fib() + b.fib()
  }

}

class Number5051 : StressfulInteger {

  companion object {
    private var VALUE = 5051
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2525()
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
    val a = Number5050()
    val b = Number5049()
    return a.fib() + b.fib()
  }

}

class Number5052 : StressfulInteger {

  companion object {
    private var VALUE = 5052
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2526()
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
    val a = Number5051()
    val b = Number5050()
    return a.fib() + b.fib()
  }

}

class Number5053 : StressfulInteger {

  companion object {
    private var VALUE = 5053
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2526()
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
    val a = Number5052()
    val b = Number5051()
    return a.fib() + b.fib()
  }

}

class Number5054 : StressfulInteger {

  companion object {
    private var VALUE = 5054
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2527()
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
    val a = Number5053()
    val b = Number5052()
    return a.fib() + b.fib()
  }

}

class Number5055 : StressfulInteger {

  companion object {
    private var VALUE = 5055
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2527()
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
    val a = Number5054()
    val b = Number5053()
    return a.fib() + b.fib()
  }

}

class Number5056 : StressfulInteger {

  companion object {
    private var VALUE = 5056
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2528()
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
    val a = Number5055()
    val b = Number5054()
    return a.fib() + b.fib()
  }

}

class Number5057 : StressfulInteger {

  companion object {
    private var VALUE = 5057
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2528()
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
    val a = Number5056()
    val b = Number5055()
    return a.fib() + b.fib()
  }

}

class Number5058 : StressfulInteger {

  companion object {
    private var VALUE = 5058
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2529()
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
    val a = Number5057()
    val b = Number5056()
    return a.fib() + b.fib()
  }

}

class Number5059 : StressfulInteger {

  companion object {
    private var VALUE = 5059
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2529()
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
    val a = Number5058()
    val b = Number5057()
    return a.fib() + b.fib()
  }

}

class Number5060 : StressfulInteger {

  companion object {
    private var VALUE = 5060
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2530()
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
    val a = Number5059()
    val b = Number5058()
    return a.fib() + b.fib()
  }

}

class Number5061 : StressfulInteger {

  companion object {
    private var VALUE = 5061
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2530()
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
    val a = Number5060()
    val b = Number5059()
    return a.fib() + b.fib()
  }

}

class Number5062 : StressfulInteger {

  companion object {
    private var VALUE = 5062
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2531()
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
    val a = Number5061()
    val b = Number5060()
    return a.fib() + b.fib()
  }

}

class Number5063 : StressfulInteger {

  companion object {
    private var VALUE = 5063
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2531()
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
    val a = Number5062()
    val b = Number5061()
    return a.fib() + b.fib()
  }

}

class Number5064 : StressfulInteger {

  companion object {
    private var VALUE = 5064
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2532()
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
    val a = Number5063()
    val b = Number5062()
    return a.fib() + b.fib()
  }

}

class Number5065 : StressfulInteger {

  companion object {
    private var VALUE = 5065
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2532()
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
    val a = Number5064()
    val b = Number5063()
    return a.fib() + b.fib()
  }

}

class Number5066 : StressfulInteger {

  companion object {
    private var VALUE = 5066
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2533()
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
    val a = Number5065()
    val b = Number5064()
    return a.fib() + b.fib()
  }

}

class Number5067 : StressfulInteger {

  companion object {
    private var VALUE = 5067
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2533()
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
    val a = Number5066()
    val b = Number5065()
    return a.fib() + b.fib()
  }

}

class Number5068 : StressfulInteger {

  companion object {
    private var VALUE = 5068
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2534()
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
    val a = Number5067()
    val b = Number5066()
    return a.fib() + b.fib()
  }

}

class Number5069 : StressfulInteger {

  companion object {
    private var VALUE = 5069
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2534()
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
    val a = Number5068()
    val b = Number5067()
    return a.fib() + b.fib()
  }

}

class Number5070 : StressfulInteger {

  companion object {
    private var VALUE = 5070
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2535()
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
    val a = Number5069()
    val b = Number5068()
    return a.fib() + b.fib()
  }

}

class Number5071 : StressfulInteger {

  companion object {
    private var VALUE = 5071
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2535()
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
    val a = Number5070()
    val b = Number5069()
    return a.fib() + b.fib()
  }

}

class Number5072 : StressfulInteger {

  companion object {
    private var VALUE = 5072
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2536()
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
    val a = Number5071()
    val b = Number5070()
    return a.fib() + b.fib()
  }

}

class Number5073 : StressfulInteger {

  companion object {
    private var VALUE = 5073
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2536()
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
    val a = Number5072()
    val b = Number5071()
    return a.fib() + b.fib()
  }

}

class Number5074 : StressfulInteger {

  companion object {
    private var VALUE = 5074
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2537()
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
    val a = Number5073()
    val b = Number5072()
    return a.fib() + b.fib()
  }

}

class Number5075 : StressfulInteger {

  companion object {
    private var VALUE = 5075
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2537()
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
    val a = Number5074()
    val b = Number5073()
    return a.fib() + b.fib()
  }

}

class Number5076 : StressfulInteger {

  companion object {
    private var VALUE = 5076
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2538()
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
    val a = Number5075()
    val b = Number5074()
    return a.fib() + b.fib()
  }

}

class Number5077 : StressfulInteger {

  companion object {
    private var VALUE = 5077
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2538()
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
    val a = Number5076()
    val b = Number5075()
    return a.fib() + b.fib()
  }

}

class Number5078 : StressfulInteger {

  companion object {
    private var VALUE = 5078
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2539()
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
    val a = Number5077()
    val b = Number5076()
    return a.fib() + b.fib()
  }

}

class Number5079 : StressfulInteger {

  companion object {
    private var VALUE = 5079
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2539()
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
    val a = Number5078()
    val b = Number5077()
    return a.fib() + b.fib()
  }

}

class Number5080 : StressfulInteger {

  companion object {
    private var VALUE = 5080
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2540()
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
    val a = Number5079()
    val b = Number5078()
    return a.fib() + b.fib()
  }

}

class Number5081 : StressfulInteger {

  companion object {
    private var VALUE = 5081
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2540()
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
    val a = Number5080()
    val b = Number5079()
    return a.fib() + b.fib()
  }

}

class Number5082 : StressfulInteger {

  companion object {
    private var VALUE = 5082
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2541()
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
    val a = Number5081()
    val b = Number5080()
    return a.fib() + b.fib()
  }

}

class Number5083 : StressfulInteger {

  companion object {
    private var VALUE = 5083
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2541()
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
    val a = Number5082()
    val b = Number5081()
    return a.fib() + b.fib()
  }

}

class Number5084 : StressfulInteger {

  companion object {
    private var VALUE = 5084
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2542()
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
    val a = Number5083()
    val b = Number5082()
    return a.fib() + b.fib()
  }

}

class Number5085 : StressfulInteger {

  companion object {
    private var VALUE = 5085
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2542()
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
    val a = Number5084()
    val b = Number5083()
    return a.fib() + b.fib()
  }

}

class Number5086 : StressfulInteger {

  companion object {
    private var VALUE = 5086
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2543()
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
    val a = Number5085()
    val b = Number5084()
    return a.fib() + b.fib()
  }

}

class Number5087 : StressfulInteger {

  companion object {
    private var VALUE = 5087
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2543()
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
    val a = Number5086()
    val b = Number5085()
    return a.fib() + b.fib()
  }

}

class Number5088 : StressfulInteger {

  companion object {
    private var VALUE = 5088
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2544()
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
    val a = Number5087()
    val b = Number5086()
    return a.fib() + b.fib()
  }

}

class Number5089 : StressfulInteger {

  companion object {
    private var VALUE = 5089
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2544()
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
    val a = Number5088()
    val b = Number5087()
    return a.fib() + b.fib()
  }

}

class Number5090 : StressfulInteger {

  companion object {
    private var VALUE = 5090
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2545()
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
    val a = Number5089()
    val b = Number5088()
    return a.fib() + b.fib()
  }

}

class Number5091 : StressfulInteger {

  companion object {
    private var VALUE = 5091
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2545()
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
    val a = Number5090()
    val b = Number5089()
    return a.fib() + b.fib()
  }

}

class Number5092 : StressfulInteger {

  companion object {
    private var VALUE = 5092
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2546()
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
    val a = Number5091()
    val b = Number5090()
    return a.fib() + b.fib()
  }

}

class Number5093 : StressfulInteger {

  companion object {
    private var VALUE = 5093
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2546()
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
    val a = Number5092()
    val b = Number5091()
    return a.fib() + b.fib()
  }

}

class Number5094 : StressfulInteger {

  companion object {
    private var VALUE = 5094
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2547()
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
    val a = Number5093()
    val b = Number5092()
    return a.fib() + b.fib()
  }

}

class Number5095 : StressfulInteger {

  companion object {
    private var VALUE = 5095
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2547()
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
    val a = Number5094()
    val b = Number5093()
    return a.fib() + b.fib()
  }

}

class Number5096 : StressfulInteger {

  companion object {
    private var VALUE = 5096
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2548()
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
    val a = Number5095()
    val b = Number5094()
    return a.fib() + b.fib()
  }

}

class Number5097 : StressfulInteger {

  companion object {
    private var VALUE = 5097
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2548()
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
    val a = Number5096()
    val b = Number5095()
    return a.fib() + b.fib()
  }

}

class Number5098 : StressfulInteger {

  companion object {
    private var VALUE = 5098
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2549()
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
    val a = Number5097()
    val b = Number5096()
    return a.fib() + b.fib()
  }

}

class Number5099 : StressfulInteger {

  companion object {
    private var VALUE = 5099
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2549()
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
    val a = Number5098()
    val b = Number5097()
    return a.fib() + b.fib()
  }

}

class Number5100 : StressfulInteger {

  companion object {
    private var VALUE = 5100
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2550()
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
    val a = Number5099()
    val b = Number5098()
    return a.fib() + b.fib()
  }

}

class Number5101 : StressfulInteger {

  companion object {
    private var VALUE = 5101
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2550()
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
    val a = Number5100()
    val b = Number5099()
    return a.fib() + b.fib()
  }

}

class Number5102 : StressfulInteger {

  companion object {
    private var VALUE = 5102
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2551()
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
    val a = Number5101()
    val b = Number5100()
    return a.fib() + b.fib()
  }

}

class Number5103 : StressfulInteger {

  companion object {
    private var VALUE = 5103
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2551()
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
    val a = Number5102()
    val b = Number5101()
    return a.fib() + b.fib()
  }

}

class Number5104 : StressfulInteger {

  companion object {
    private var VALUE = 5104
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2552()
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
    val a = Number5103()
    val b = Number5102()
    return a.fib() + b.fib()
  }

}

class Number5105 : StressfulInteger {

  companion object {
    private var VALUE = 5105
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2552()
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
    val a = Number5104()
    val b = Number5103()
    return a.fib() + b.fib()
  }

}

class Number5106 : StressfulInteger {

  companion object {
    private var VALUE = 5106
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2553()
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
    val a = Number5105()
    val b = Number5104()
    return a.fib() + b.fib()
  }

}

class Number5107 : StressfulInteger {

  companion object {
    private var VALUE = 5107
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2553()
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
    val a = Number5106()
    val b = Number5105()
    return a.fib() + b.fib()
  }

}

class Number5108 : StressfulInteger {

  companion object {
    private var VALUE = 5108
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2554()
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
    val a = Number5107()
    val b = Number5106()
    return a.fib() + b.fib()
  }

}

class Number5109 : StressfulInteger {

  companion object {
    private var VALUE = 5109
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2554()
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
    val a = Number5108()
    val b = Number5107()
    return a.fib() + b.fib()
  }

}

class Number5110 : StressfulInteger {

  companion object {
    private var VALUE = 5110
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2555()
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
    val a = Number5109()
    val b = Number5108()
    return a.fib() + b.fib()
  }

}

class Number5111 : StressfulInteger {

  companion object {
    private var VALUE = 5111
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2555()
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
    val a = Number5110()
    val b = Number5109()
    return a.fib() + b.fib()
  }

}

class Number5112 : StressfulInteger {

  companion object {
    private var VALUE = 5112
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2556()
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
    val a = Number5111()
    val b = Number5110()
    return a.fib() + b.fib()
  }

}

class Number5113 : StressfulInteger {

  companion object {
    private var VALUE = 5113
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2556()
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
    val a = Number5112()
    val b = Number5111()
    return a.fib() + b.fib()
  }

}

class Number5114 : StressfulInteger {

  companion object {
    private var VALUE = 5114
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2557()
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
    val a = Number5113()
    val b = Number5112()
    return a.fib() + b.fib()
  }

}

class Number5115 : StressfulInteger {

  companion object {
    private var VALUE = 5115
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2557()
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
    val a = Number5114()
    val b = Number5113()
    return a.fib() + b.fib()
  }

}

class Number5116 : StressfulInteger {

  companion object {
    private var VALUE = 5116
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2558()
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
    val a = Number5115()
    val b = Number5114()
    return a.fib() + b.fib()
  }

}

class Number5117 : StressfulInteger {

  companion object {
    private var VALUE = 5117
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2558()
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
    val a = Number5116()
    val b = Number5115()
    return a.fib() + b.fib()
  }

}

class Number5118 : StressfulInteger {

  companion object {
    private var VALUE = 5118
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2559()
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
    val a = Number5117()
    val b = Number5116()
    return a.fib() + b.fib()
  }

}

class Number5119 : StressfulInteger {

  companion object {
    private var VALUE = 5119
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2559()
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
    val a = Number5118()
    val b = Number5117()
    return a.fib() + b.fib()
  }

}

class Number5120 : StressfulInteger {

  companion object {
    private var VALUE = 5120
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2560()
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
    val a = Number5119()
    val b = Number5118()
    return a.fib() + b.fib()
  }

}

class Number5121 : StressfulInteger {

  companion object {
    private var VALUE = 5121
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2560()
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
    val a = Number5120()
    val b = Number5119()
    return a.fib() + b.fib()
  }

}

class Number5122 : StressfulInteger {

  companion object {
    private var VALUE = 5122
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2561()
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
    val a = Number5121()
    val b = Number5120()
    return a.fib() + b.fib()
  }

}

class Number5123 : StressfulInteger {

  companion object {
    private var VALUE = 5123
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2561()
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
    val a = Number5122()
    val b = Number5121()
    return a.fib() + b.fib()
  }

}

class Number5124 : StressfulInteger {

  companion object {
    private var VALUE = 5124
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2562()
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
    val a = Number5123()
    val b = Number5122()
    return a.fib() + b.fib()
  }

}

class Number5125 : StressfulInteger {

  companion object {
    private var VALUE = 5125
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2562()
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
    val a = Number5124()
    val b = Number5123()
    return a.fib() + b.fib()
  }

}

class Number5126 : StressfulInteger {

  companion object {
    private var VALUE = 5126
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2563()
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
    val a = Number5125()
    val b = Number5124()
    return a.fib() + b.fib()
  }

}

class Number5127 : StressfulInteger {

  companion object {
    private var VALUE = 5127
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2563()
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
    val a = Number5126()
    val b = Number5125()
    return a.fib() + b.fib()
  }

}

class Number5128 : StressfulInteger {

  companion object {
    private var VALUE = 5128
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2564()
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
    val a = Number5127()
    val b = Number5126()
    return a.fib() + b.fib()
  }

}

class Number5129 : StressfulInteger {

  companion object {
    private var VALUE = 5129
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2564()
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
    val a = Number5128()
    val b = Number5127()
    return a.fib() + b.fib()
  }

}

class Number5130 : StressfulInteger {

  companion object {
    private var VALUE = 5130
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2565()
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
    val a = Number5129()
    val b = Number5128()
    return a.fib() + b.fib()
  }

}

class Number5131 : StressfulInteger {

  companion object {
    private var VALUE = 5131
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2565()
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
    val a = Number5130()
    val b = Number5129()
    return a.fib() + b.fib()
  }

}

class Number5132 : StressfulInteger {

  companion object {
    private var VALUE = 5132
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2566()
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
    val a = Number5131()
    val b = Number5130()
    return a.fib() + b.fib()
  }

}

class Number5133 : StressfulInteger {

  companion object {
    private var VALUE = 5133
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2566()
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
    val a = Number5132()
    val b = Number5131()
    return a.fib() + b.fib()
  }

}

class Number5134 : StressfulInteger {

  companion object {
    private var VALUE = 5134
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2567()
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
    val a = Number5133()
    val b = Number5132()
    return a.fib() + b.fib()
  }

}

class Number5135 : StressfulInteger {

  companion object {
    private var VALUE = 5135
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2567()
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
    val a = Number5134()
    val b = Number5133()
    return a.fib() + b.fib()
  }

}

class Number5136 : StressfulInteger {

  companion object {
    private var VALUE = 5136
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2568()
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
    val a = Number5135()
    val b = Number5134()
    return a.fib() + b.fib()
  }

}

class Number5137 : StressfulInteger {

  companion object {
    private var VALUE = 5137
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2568()
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
    val a = Number5136()
    val b = Number5135()
    return a.fib() + b.fib()
  }

}

class Number5138 : StressfulInteger {

  companion object {
    private var VALUE = 5138
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2569()
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
    val a = Number5137()
    val b = Number5136()
    return a.fib() + b.fib()
  }

}

class Number5139 : StressfulInteger {

  companion object {
    private var VALUE = 5139
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2569()
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
    val a = Number5138()
    val b = Number5137()
    return a.fib() + b.fib()
  }

}

class Number5140 : StressfulInteger {

  companion object {
    private var VALUE = 5140
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2570()
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
    val a = Number5139()
    val b = Number5138()
    return a.fib() + b.fib()
  }

}

class Number5141 : StressfulInteger {

  companion object {
    private var VALUE = 5141
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2570()
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
    val a = Number5140()
    val b = Number5139()
    return a.fib() + b.fib()
  }

}

class Number5142 : StressfulInteger {

  companion object {
    private var VALUE = 5142
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2571()
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
    val a = Number5141()
    val b = Number5140()
    return a.fib() + b.fib()
  }

}

class Number5143 : StressfulInteger {

  companion object {
    private var VALUE = 5143
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2571()
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
    val a = Number5142()
    val b = Number5141()
    return a.fib() + b.fib()
  }

}

class Number5144 : StressfulInteger {

  companion object {
    private var VALUE = 5144
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2572()
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
    val a = Number5143()
    val b = Number5142()
    return a.fib() + b.fib()
  }

}

class Number5145 : StressfulInteger {

  companion object {
    private var VALUE = 5145
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2572()
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
    val a = Number5144()
    val b = Number5143()
    return a.fib() + b.fib()
  }

}

class Number5146 : StressfulInteger {

  companion object {
    private var VALUE = 5146
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2573()
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
    val a = Number5145()
    val b = Number5144()
    return a.fib() + b.fib()
  }

}

class Number5147 : StressfulInteger {

  companion object {
    private var VALUE = 5147
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2573()
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
    val a = Number5146()
    val b = Number5145()
    return a.fib() + b.fib()
  }

}

class Number5148 : StressfulInteger {

  companion object {
    private var VALUE = 5148
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2574()
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
    val a = Number5147()
    val b = Number5146()
    return a.fib() + b.fib()
  }

}

class Number5149 : StressfulInteger {

  companion object {
    private var VALUE = 5149
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2574()
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
    val a = Number5148()
    val b = Number5147()
    return a.fib() + b.fib()
  }

}

class Number5150 : StressfulInteger {

  companion object {
    private var VALUE = 5150
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2575()
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
    val a = Number5149()
    val b = Number5148()
    return a.fib() + b.fib()
  }

}

class Number5151 : StressfulInteger {

  companion object {
    private var VALUE = 5151
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2575()
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
    val a = Number5150()
    val b = Number5149()
    return a.fib() + b.fib()
  }

}

class Number5152 : StressfulInteger {

  companion object {
    private var VALUE = 5152
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2576()
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
    val a = Number5151()
    val b = Number5150()
    return a.fib() + b.fib()
  }

}

class Number5153 : StressfulInteger {

  companion object {
    private var VALUE = 5153
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2576()
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
    val a = Number5152()
    val b = Number5151()
    return a.fib() + b.fib()
  }

}

class Number5154 : StressfulInteger {

  companion object {
    private var VALUE = 5154
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2577()
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
    val a = Number5153()
    val b = Number5152()
    return a.fib() + b.fib()
  }

}

class Number5155 : StressfulInteger {

  companion object {
    private var VALUE = 5155
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2577()
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
    val a = Number5154()
    val b = Number5153()
    return a.fib() + b.fib()
  }

}

class Number5156 : StressfulInteger {

  companion object {
    private var VALUE = 5156
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2578()
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
    val a = Number5155()
    val b = Number5154()
    return a.fib() + b.fib()
  }

}

class Number5157 : StressfulInteger {

  companion object {
    private var VALUE = 5157
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2578()
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
    val a = Number5156()
    val b = Number5155()
    return a.fib() + b.fib()
  }

}

class Number5158 : StressfulInteger {

  companion object {
    private var VALUE = 5158
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2579()
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
    val a = Number5157()
    val b = Number5156()
    return a.fib() + b.fib()
  }

}

class Number5159 : StressfulInteger {

  companion object {
    private var VALUE = 5159
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2579()
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
    val a = Number5158()
    val b = Number5157()
    return a.fib() + b.fib()
  }

}

class Number5160 : StressfulInteger {

  companion object {
    private var VALUE = 5160
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2580()
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
    val a = Number5159()
    val b = Number5158()
    return a.fib() + b.fib()
  }

}

class Number5161 : StressfulInteger {

  companion object {
    private var VALUE = 5161
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2580()
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
    val a = Number5160()
    val b = Number5159()
    return a.fib() + b.fib()
  }

}

class Number5162 : StressfulInteger {

  companion object {
    private var VALUE = 5162
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2581()
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
    val a = Number5161()
    val b = Number5160()
    return a.fib() + b.fib()
  }

}

class Number5163 : StressfulInteger {

  companion object {
    private var VALUE = 5163
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2581()
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
    val a = Number5162()
    val b = Number5161()
    return a.fib() + b.fib()
  }

}

class Number5164 : StressfulInteger {

  companion object {
    private var VALUE = 5164
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2582()
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
    val a = Number5163()
    val b = Number5162()
    return a.fib() + b.fib()
  }

}

class Number5165 : StressfulInteger {

  companion object {
    private var VALUE = 5165
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2582()
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
    val a = Number5164()
    val b = Number5163()
    return a.fib() + b.fib()
  }

}

class Number5166 : StressfulInteger {

  companion object {
    private var VALUE = 5166
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2583()
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
    val a = Number5165()
    val b = Number5164()
    return a.fib() + b.fib()
  }

}

class Number5167 : StressfulInteger {

  companion object {
    private var VALUE = 5167
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2583()
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
    val a = Number5166()
    val b = Number5165()
    return a.fib() + b.fib()
  }

}

class Number5168 : StressfulInteger {

  companion object {
    private var VALUE = 5168
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2584()
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
    val a = Number5167()
    val b = Number5166()
    return a.fib() + b.fib()
  }

}

class Number5169 : StressfulInteger {

  companion object {
    private var VALUE = 5169
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2584()
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
    val a = Number5168()
    val b = Number5167()
    return a.fib() + b.fib()
  }

}

class Number5170 : StressfulInteger {

  companion object {
    private var VALUE = 5170
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2585()
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
    val a = Number5169()
    val b = Number5168()
    return a.fib() + b.fib()
  }

}

class Number5171 : StressfulInteger {

  companion object {
    private var VALUE = 5171
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2585()
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
    val a = Number5170()
    val b = Number5169()
    return a.fib() + b.fib()
  }

}

class Number5172 : StressfulInteger {

  companion object {
    private var VALUE = 5172
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2586()
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
    val a = Number5171()
    val b = Number5170()
    return a.fib() + b.fib()
  }

}

class Number5173 : StressfulInteger {

  companion object {
    private var VALUE = 5173
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2586()
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
    val a = Number5172()
    val b = Number5171()
    return a.fib() + b.fib()
  }

}

class Number5174 : StressfulInteger {

  companion object {
    private var VALUE = 5174
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2587()
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
    val a = Number5173()
    val b = Number5172()
    return a.fib() + b.fib()
  }

}

class Number5175 : StressfulInteger {

  companion object {
    private var VALUE = 5175
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2587()
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
    val a = Number5174()
    val b = Number5173()
    return a.fib() + b.fib()
  }

}

class Number5176 : StressfulInteger {

  companion object {
    private var VALUE = 5176
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2588()
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
    val a = Number5175()
    val b = Number5174()
    return a.fib() + b.fib()
  }

}

class Number5177 : StressfulInteger {

  companion object {
    private var VALUE = 5177
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2588()
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
    val a = Number5176()
    val b = Number5175()
    return a.fib() + b.fib()
  }

}

class Number5178 : StressfulInteger {

  companion object {
    private var VALUE = 5178
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2589()
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
    val a = Number5177()
    val b = Number5176()
    return a.fib() + b.fib()
  }

}

class Number5179 : StressfulInteger {

  companion object {
    private var VALUE = 5179
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2589()
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
    val a = Number5178()
    val b = Number5177()
    return a.fib() + b.fib()
  }

}

class Number5180 : StressfulInteger {

  companion object {
    private var VALUE = 5180
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2590()
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
    val a = Number5179()
    val b = Number5178()
    return a.fib() + b.fib()
  }

}

class Number5181 : StressfulInteger {

  companion object {
    private var VALUE = 5181
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2590()
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
    val a = Number5180()
    val b = Number5179()
    return a.fib() + b.fib()
  }

}

class Number5182 : StressfulInteger {

  companion object {
    private var VALUE = 5182
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2591()
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
    val a = Number5181()
    val b = Number5180()
    return a.fib() + b.fib()
  }

}

class Number5183 : StressfulInteger {

  companion object {
    private var VALUE = 5183
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2591()
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
    val a = Number5182()
    val b = Number5181()
    return a.fib() + b.fib()
  }

}

class Number5184 : StressfulInteger {

  companion object {
    private var VALUE = 5184
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2592()
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
    val a = Number5183()
    val b = Number5182()
    return a.fib() + b.fib()
  }

}

class Number5185 : StressfulInteger {

  companion object {
    private var VALUE = 5185
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2592()
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
    val a = Number5184()
    val b = Number5183()
    return a.fib() + b.fib()
  }

}

class Number5186 : StressfulInteger {

  companion object {
    private var VALUE = 5186
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2593()
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
    val a = Number5185()
    val b = Number5184()
    return a.fib() + b.fib()
  }

}

class Number5187 : StressfulInteger {

  companion object {
    private var VALUE = 5187
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2593()
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
    val a = Number5186()
    val b = Number5185()
    return a.fib() + b.fib()
  }

}

class Number5188 : StressfulInteger {

  companion object {
    private var VALUE = 5188
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2594()
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
    val a = Number5187()
    val b = Number5186()
    return a.fib() + b.fib()
  }

}

class Number5189 : StressfulInteger {

  companion object {
    private var VALUE = 5189
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2594()
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
    val a = Number5188()
    val b = Number5187()
    return a.fib() + b.fib()
  }

}

class Number5190 : StressfulInteger {

  companion object {
    private var VALUE = 5190
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2595()
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
    val a = Number5189()
    val b = Number5188()
    return a.fib() + b.fib()
  }

}

class Number5191 : StressfulInteger {

  companion object {
    private var VALUE = 5191
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2595()
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
    val a = Number5190()
    val b = Number5189()
    return a.fib() + b.fib()
  }

}

class Number5192 : StressfulInteger {

  companion object {
    private var VALUE = 5192
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2596()
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
    val a = Number5191()
    val b = Number5190()
    return a.fib() + b.fib()
  }

}

class Number5193 : StressfulInteger {

  companion object {
    private var VALUE = 5193
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2596()
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
    val a = Number5192()
    val b = Number5191()
    return a.fib() + b.fib()
  }

}

class Number5194 : StressfulInteger {

  companion object {
    private var VALUE = 5194
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2597()
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
    val a = Number5193()
    val b = Number5192()
    return a.fib() + b.fib()
  }

}

class Number5195 : StressfulInteger {

  companion object {
    private var VALUE = 5195
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2597()
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
    val a = Number5194()
    val b = Number5193()
    return a.fib() + b.fib()
  }

}

class Number5196 : StressfulInteger {

  companion object {
    private var VALUE = 5196
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2598()
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
    val a = Number5195()
    val b = Number5194()
    return a.fib() + b.fib()
  }

}

class Number5197 : StressfulInteger {

  companion object {
    private var VALUE = 5197
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2598()
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
    val a = Number5196()
    val b = Number5195()
    return a.fib() + b.fib()
  }

}

class Number5198 : StressfulInteger {

  companion object {
    private var VALUE = 5198
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2599()
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
    val a = Number5197()
    val b = Number5196()
    return a.fib() + b.fib()
  }

}

class Number5199 : StressfulInteger {

  companion object {
    private var VALUE = 5199
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2599()
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
    val a = Number5198()
    val b = Number5197()
    return a.fib() + b.fib()
  }

}

class Number5200 : StressfulInteger {

  companion object {
    private var VALUE = 5200
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2600()
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
    val a = Number5199()
    val b = Number5198()
    return a.fib() + b.fib()
  }

}

class Number5201 : StressfulInteger {

  companion object {
    private var VALUE = 5201
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2600()
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
    val a = Number5200()
    val b = Number5199()
    return a.fib() + b.fib()
  }

}

class Number5202 : StressfulInteger {

  companion object {
    private var VALUE = 5202
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2601()
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
    val a = Number5201()
    val b = Number5200()
    return a.fib() + b.fib()
  }

}

class Number5203 : StressfulInteger {

  companion object {
    private var VALUE = 5203
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2601()
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
    val a = Number5202()
    val b = Number5201()
    return a.fib() + b.fib()
  }

}

class Number5204 : StressfulInteger {

  companion object {
    private var VALUE = 5204
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2602()
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
    val a = Number5203()
    val b = Number5202()
    return a.fib() + b.fib()
  }

}

class Number5205 : StressfulInteger {

  companion object {
    private var VALUE = 5205
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2602()
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
    val a = Number5204()
    val b = Number5203()
    return a.fib() + b.fib()
  }

}

class Number5206 : StressfulInteger {

  companion object {
    private var VALUE = 5206
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2603()
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
    val a = Number5205()
    val b = Number5204()
    return a.fib() + b.fib()
  }

}

class Number5207 : StressfulInteger {

  companion object {
    private var VALUE = 5207
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2603()
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
    val a = Number5206()
    val b = Number5205()
    return a.fib() + b.fib()
  }

}

class Number5208 : StressfulInteger {

  companion object {
    private var VALUE = 5208
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2604()
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
    val a = Number5207()
    val b = Number5206()
    return a.fib() + b.fib()
  }

}

class Number5209 : StressfulInteger {

  companion object {
    private var VALUE = 5209
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2604()
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
    val a = Number5208()
    val b = Number5207()
    return a.fib() + b.fib()
  }

}

class Number5210 : StressfulInteger {

  companion object {
    private var VALUE = 5210
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2605()
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
    val a = Number5209()
    val b = Number5208()
    return a.fib() + b.fib()
  }

}

class Number5211 : StressfulInteger {

  companion object {
    private var VALUE = 5211
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2605()
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
    val a = Number5210()
    val b = Number5209()
    return a.fib() + b.fib()
  }

}

class Number5212 : StressfulInteger {

  companion object {
    private var VALUE = 5212
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2606()
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
    val a = Number5211()
    val b = Number5210()
    return a.fib() + b.fib()
  }

}

class Number5213 : StressfulInteger {

  companion object {
    private var VALUE = 5213
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2606()
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
    val a = Number5212()
    val b = Number5211()
    return a.fib() + b.fib()
  }

}

class Number5214 : StressfulInteger {

  companion object {
    private var VALUE = 5214
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2607()
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
    val a = Number5213()
    val b = Number5212()
    return a.fib() + b.fib()
  }

}

class Number5215 : StressfulInteger {

  companion object {
    private var VALUE = 5215
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2607()
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
    val a = Number5214()
    val b = Number5213()
    return a.fib() + b.fib()
  }

}

class Number5216 : StressfulInteger {

  companion object {
    private var VALUE = 5216
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2608()
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
    val a = Number5215()
    val b = Number5214()
    return a.fib() + b.fib()
  }

}

class Number5217 : StressfulInteger {

  companion object {
    private var VALUE = 5217
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2608()
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
    val a = Number5216()
    val b = Number5215()
    return a.fib() + b.fib()
  }

}

class Number5218 : StressfulInteger {

  companion object {
    private var VALUE = 5218
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2609()
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
    val a = Number5217()
    val b = Number5216()
    return a.fib() + b.fib()
  }

}

class Number5219 : StressfulInteger {

  companion object {
    private var VALUE = 5219
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2609()
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
    val a = Number5218()
    val b = Number5217()
    return a.fib() + b.fib()
  }

}

class Number5220 : StressfulInteger {

  companion object {
    private var VALUE = 5220
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2610()
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
    val a = Number5219()
    val b = Number5218()
    return a.fib() + b.fib()
  }

}

class Number5221 : StressfulInteger {

  companion object {
    private var VALUE = 5221
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2610()
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
    val a = Number5220()
    val b = Number5219()
    return a.fib() + b.fib()
  }

}

class Number5222 : StressfulInteger {

  companion object {
    private var VALUE = 5222
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2611()
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
    val a = Number5221()
    val b = Number5220()
    return a.fib() + b.fib()
  }

}

class Number5223 : StressfulInteger {

  companion object {
    private var VALUE = 5223
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2611()
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
    val a = Number5222()
    val b = Number5221()
    return a.fib() + b.fib()
  }

}

class Number5224 : StressfulInteger {

  companion object {
    private var VALUE = 5224
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2612()
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
    val a = Number5223()
    val b = Number5222()
    return a.fib() + b.fib()
  }

}

class Number5225 : StressfulInteger {

  companion object {
    private var VALUE = 5225
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2612()
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
    val a = Number5224()
    val b = Number5223()
    return a.fib() + b.fib()
  }

}

class Number5226 : StressfulInteger {

  companion object {
    private var VALUE = 5226
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2613()
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
    val a = Number5225()
    val b = Number5224()
    return a.fib() + b.fib()
  }

}

class Number5227 : StressfulInteger {

  companion object {
    private var VALUE = 5227
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2613()
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
    val a = Number5226()
    val b = Number5225()
    return a.fib() + b.fib()
  }

}

class Number5228 : StressfulInteger {

  companion object {
    private var VALUE = 5228
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2614()
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
    val a = Number5227()
    val b = Number5226()
    return a.fib() + b.fib()
  }

}

class Number5229 : StressfulInteger {

  companion object {
    private var VALUE = 5229
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2614()
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
    val a = Number5228()
    val b = Number5227()
    return a.fib() + b.fib()
  }

}

class Number5230 : StressfulInteger {

  companion object {
    private var VALUE = 5230
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2615()
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
    val a = Number5229()
    val b = Number5228()
    return a.fib() + b.fib()
  }

}

class Number5231 : StressfulInteger {

  companion object {
    private var VALUE = 5231
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2615()
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
    val a = Number5230()
    val b = Number5229()
    return a.fib() + b.fib()
  }

}

class Number5232 : StressfulInteger {

  companion object {
    private var VALUE = 5232
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2616()
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
    val a = Number5231()
    val b = Number5230()
    return a.fib() + b.fib()
  }

}

class Number5233 : StressfulInteger {

  companion object {
    private var VALUE = 5233
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2616()
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
    val a = Number5232()
    val b = Number5231()
    return a.fib() + b.fib()
  }

}

class Number5234 : StressfulInteger {

  companion object {
    private var VALUE = 5234
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2617()
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
    val a = Number5233()
    val b = Number5232()
    return a.fib() + b.fib()
  }

}

class Number5235 : StressfulInteger {

  companion object {
    private var VALUE = 5235
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2617()
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
    val a = Number5234()
    val b = Number5233()
    return a.fib() + b.fib()
  }

}

class Number5236 : StressfulInteger {

  companion object {
    private var VALUE = 5236
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2618()
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
    val a = Number5235()
    val b = Number5234()
    return a.fib() + b.fib()
  }

}

class Number5237 : StressfulInteger {

  companion object {
    private var VALUE = 5237
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2618()
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
    val a = Number5236()
    val b = Number5235()
    return a.fib() + b.fib()
  }

}

class Number5238 : StressfulInteger {

  companion object {
    private var VALUE = 5238
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2619()
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
    val a = Number5237()
    val b = Number5236()
    return a.fib() + b.fib()
  }

}

class Number5239 : StressfulInteger {

  companion object {
    private var VALUE = 5239
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2619()
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
    val a = Number5238()
    val b = Number5237()
    return a.fib() + b.fib()
  }

}

class Number5240 : StressfulInteger {

  companion object {
    private var VALUE = 5240
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2620()
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
    val a = Number5239()
    val b = Number5238()
    return a.fib() + b.fib()
  }

}

class Number5241 : StressfulInteger {

  companion object {
    private var VALUE = 5241
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2620()
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
    val a = Number5240()
    val b = Number5239()
    return a.fib() + b.fib()
  }

}

class Number5242 : StressfulInteger {

  companion object {
    private var VALUE = 5242
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2621()
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
    val a = Number5241()
    val b = Number5240()
    return a.fib() + b.fib()
  }

}

class Number5243 : StressfulInteger {

  companion object {
    private var VALUE = 5243
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2621()
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
    val a = Number5242()
    val b = Number5241()
    return a.fib() + b.fib()
  }

}

class Number5244 : StressfulInteger {

  companion object {
    private var VALUE = 5244
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2622()
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
    val a = Number5243()
    val b = Number5242()
    return a.fib() + b.fib()
  }

}

class Number5245 : StressfulInteger {

  companion object {
    private var VALUE = 5245
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2622()
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
    val a = Number5244()
    val b = Number5243()
    return a.fib() + b.fib()
  }

}

class Number5246 : StressfulInteger {

  companion object {
    private var VALUE = 5246
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2623()
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
    val a = Number5245()
    val b = Number5244()
    return a.fib() + b.fib()
  }

}

class Number5247 : StressfulInteger {

  companion object {
    private var VALUE = 5247
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2623()
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
    val a = Number5246()
    val b = Number5245()
    return a.fib() + b.fib()
  }

}

class Number5248 : StressfulInteger {

  companion object {
    private var VALUE = 5248
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2624()
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
    val a = Number5247()
    val b = Number5246()
    return a.fib() + b.fib()
  }

}

class Number5249 : StressfulInteger {

  companion object {
    private var VALUE = 5249
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2624()
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
    val a = Number5248()
    val b = Number5247()
    return a.fib() + b.fib()
  }

}

class Number5250 : StressfulInteger {

  companion object {
    private var VALUE = 5250
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2625()
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
    val a = Number5249()
    val b = Number5248()
    return a.fib() + b.fib()
  }

}

class Number5251 : StressfulInteger {

  companion object {
    private var VALUE = 5251
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2625()
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
    val a = Number5250()
    val b = Number5249()
    return a.fib() + b.fib()
  }

}

class Number5252 : StressfulInteger {

  companion object {
    private var VALUE = 5252
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2626()
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
    val a = Number5251()
    val b = Number5250()
    return a.fib() + b.fib()
  }

}

class Number5253 : StressfulInteger {

  companion object {
    private var VALUE = 5253
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2626()
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
    val a = Number5252()
    val b = Number5251()
    return a.fib() + b.fib()
  }

}

class Number5254 : StressfulInteger {

  companion object {
    private var VALUE = 5254
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2627()
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
    val a = Number5253()
    val b = Number5252()
    return a.fib() + b.fib()
  }

}

class Number5255 : StressfulInteger {

  companion object {
    private var VALUE = 5255
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2627()
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
    val a = Number5254()
    val b = Number5253()
    return a.fib() + b.fib()
  }

}

class Number5256 : StressfulInteger {

  companion object {
    private var VALUE = 5256
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2628()
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
    val a = Number5255()
    val b = Number5254()
    return a.fib() + b.fib()
  }

}

class Number5257 : StressfulInteger {

  companion object {
    private var VALUE = 5257
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2628()
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
    val a = Number5256()
    val b = Number5255()
    return a.fib() + b.fib()
  }

}

class Number5258 : StressfulInteger {

  companion object {
    private var VALUE = 5258
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2629()
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
    val a = Number5257()
    val b = Number5256()
    return a.fib() + b.fib()
  }

}

class Number5259 : StressfulInteger {

  companion object {
    private var VALUE = 5259
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2629()
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
    val a = Number5258()
    val b = Number5257()
    return a.fib() + b.fib()
  }

}

class Number5260 : StressfulInteger {

  companion object {
    private var VALUE = 5260
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2630()
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
    val a = Number5259()
    val b = Number5258()
    return a.fib() + b.fib()
  }

}

class Number5261 : StressfulInteger {

  companion object {
    private var VALUE = 5261
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2630()
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
    val a = Number5260()
    val b = Number5259()
    return a.fib() + b.fib()
  }

}

class Number5262 : StressfulInteger {

  companion object {
    private var VALUE = 5262
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2631()
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
    val a = Number5261()
    val b = Number5260()
    return a.fib() + b.fib()
  }

}

class Number5263 : StressfulInteger {

  companion object {
    private var VALUE = 5263
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2631()
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
    val a = Number5262()
    val b = Number5261()
    return a.fib() + b.fib()
  }

}

class Number5264 : StressfulInteger {

  companion object {
    private var VALUE = 5264
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2632()
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
    val a = Number5263()
    val b = Number5262()
    return a.fib() + b.fib()
  }

}

class Number5265 : StressfulInteger {

  companion object {
    private var VALUE = 5265
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2632()
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
    val a = Number5264()
    val b = Number5263()
    return a.fib() + b.fib()
  }

}

class Number5266 : StressfulInteger {

  companion object {
    private var VALUE = 5266
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2633()
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
    val a = Number5265()
    val b = Number5264()
    return a.fib() + b.fib()
  }

}

class Number5267 : StressfulInteger {

  companion object {
    private var VALUE = 5267
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2633()
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
    val a = Number5266()
    val b = Number5265()
    return a.fib() + b.fib()
  }

}

class Number5268 : StressfulInteger {

  companion object {
    private var VALUE = 5268
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2634()
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
    val a = Number5267()
    val b = Number5266()
    return a.fib() + b.fib()
  }

}

class Number5269 : StressfulInteger {

  companion object {
    private var VALUE = 5269
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2634()
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
    val a = Number5268()
    val b = Number5267()
    return a.fib() + b.fib()
  }

}

class Number5270 : StressfulInteger {

  companion object {
    private var VALUE = 5270
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2635()
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
    val a = Number5269()
    val b = Number5268()
    return a.fib() + b.fib()
  }

}

class Number5271 : StressfulInteger {

  companion object {
    private var VALUE = 5271
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2635()
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
    val a = Number5270()
    val b = Number5269()
    return a.fib() + b.fib()
  }

}

class Number5272 : StressfulInteger {

  companion object {
    private var VALUE = 5272
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2636()
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
    val a = Number5271()
    val b = Number5270()
    return a.fib() + b.fib()
  }

}

class Number5273 : StressfulInteger {

  companion object {
    private var VALUE = 5273
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2636()
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
    val a = Number5272()
    val b = Number5271()
    return a.fib() + b.fib()
  }

}

class Number5274 : StressfulInteger {

  companion object {
    private var VALUE = 5274
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2637()
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
    val a = Number5273()
    val b = Number5272()
    return a.fib() + b.fib()
  }

}

class Number5275 : StressfulInteger {

  companion object {
    private var VALUE = 5275
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2637()
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
    val a = Number5274()
    val b = Number5273()
    return a.fib() + b.fib()
  }

}

class Number5276 : StressfulInteger {

  companion object {
    private var VALUE = 5276
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2638()
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
    val a = Number5275()
    val b = Number5274()
    return a.fib() + b.fib()
  }

}

class Number5277 : StressfulInteger {

  companion object {
    private var VALUE = 5277
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2638()
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
    val a = Number5276()
    val b = Number5275()
    return a.fib() + b.fib()
  }

}

class Number5278 : StressfulInteger {

  companion object {
    private var VALUE = 5278
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2639()
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
    val a = Number5277()
    val b = Number5276()
    return a.fib() + b.fib()
  }

}

class Number5279 : StressfulInteger {

  companion object {
    private var VALUE = 5279
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2639()
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
    val a = Number5278()
    val b = Number5277()
    return a.fib() + b.fib()
  }

}

class Number5280 : StressfulInteger {

  companion object {
    private var VALUE = 5280
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2640()
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
    val a = Number5279()
    val b = Number5278()
    return a.fib() + b.fib()
  }

}

class Number5281 : StressfulInteger {

  companion object {
    private var VALUE = 5281
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2640()
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
    val a = Number5280()
    val b = Number5279()
    return a.fib() + b.fib()
  }

}

class Number5282 : StressfulInteger {

  companion object {
    private var VALUE = 5282
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2641()
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
    val a = Number5281()
    val b = Number5280()
    return a.fib() + b.fib()
  }

}

class Number5283 : StressfulInteger {

  companion object {
    private var VALUE = 5283
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2641()
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
    val a = Number5282()
    val b = Number5281()
    return a.fib() + b.fib()
  }

}

class Number5284 : StressfulInteger {

  companion object {
    private var VALUE = 5284
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2642()
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
    val a = Number5283()
    val b = Number5282()
    return a.fib() + b.fib()
  }

}

class Number5285 : StressfulInteger {

  companion object {
    private var VALUE = 5285
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2642()
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
    val a = Number5284()
    val b = Number5283()
    return a.fib() + b.fib()
  }

}

class Number5286 : StressfulInteger {

  companion object {
    private var VALUE = 5286
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2643()
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
    val a = Number5285()
    val b = Number5284()
    return a.fib() + b.fib()
  }

}

class Number5287 : StressfulInteger {

  companion object {
    private var VALUE = 5287
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2643()
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
    val a = Number5286()
    val b = Number5285()
    return a.fib() + b.fib()
  }

}

class Number5288 : StressfulInteger {

  companion object {
    private var VALUE = 5288
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2644()
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
    val a = Number5287()
    val b = Number5286()
    return a.fib() + b.fib()
  }

}

class Number5289 : StressfulInteger {

  companion object {
    private var VALUE = 5289
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2644()
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
    val a = Number5288()
    val b = Number5287()
    return a.fib() + b.fib()
  }

}

class Number5290 : StressfulInteger {

  companion object {
    private var VALUE = 5290
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2645()
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
    val a = Number5289()
    val b = Number5288()
    return a.fib() + b.fib()
  }

}

class Number5291 : StressfulInteger {

  companion object {
    private var VALUE = 5291
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2645()
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
    val a = Number5290()
    val b = Number5289()
    return a.fib() + b.fib()
  }

}

class Number5292 : StressfulInteger {

  companion object {
    private var VALUE = 5292
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2646()
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
    val a = Number5291()
    val b = Number5290()
    return a.fib() + b.fib()
  }

}

class Number5293 : StressfulInteger {

  companion object {
    private var VALUE = 5293
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2646()
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
    val a = Number5292()
    val b = Number5291()
    return a.fib() + b.fib()
  }

}

class Number5294 : StressfulInteger {

  companion object {
    private var VALUE = 5294
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2647()
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
    val a = Number5293()
    val b = Number5292()
    return a.fib() + b.fib()
  }

}

class Number5295 : StressfulInteger {

  companion object {
    private var VALUE = 5295
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2647()
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
    val a = Number5294()
    val b = Number5293()
    return a.fib() + b.fib()
  }

}

class Number5296 : StressfulInteger {

  companion object {
    private var VALUE = 5296
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2648()
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
    val a = Number5295()
    val b = Number5294()
    return a.fib() + b.fib()
  }

}

class Number5297 : StressfulInteger {

  companion object {
    private var VALUE = 5297
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2648()
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
    val a = Number5296()
    val b = Number5295()
    return a.fib() + b.fib()
  }

}

class Number5298 : StressfulInteger {

  companion object {
    private var VALUE = 5298
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2649()
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
    val a = Number5297()
    val b = Number5296()
    return a.fib() + b.fib()
  }

}

class Number5299 : StressfulInteger {

  companion object {
    private var VALUE = 5299
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2649()
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
    val a = Number5298()
    val b = Number5297()
    return a.fib() + b.fib()
  }

}

class Number5300 : StressfulInteger {

  companion object {
    private var VALUE = 5300
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2650()
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
    val a = Number5299()
    val b = Number5298()
    return a.fib() + b.fib()
  }

}

class Number5301 : StressfulInteger {

  companion object {
    private var VALUE = 5301
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2650()
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
    val a = Number5300()
    val b = Number5299()
    return a.fib() + b.fib()
  }

}

class Number5302 : StressfulInteger {

  companion object {
    private var VALUE = 5302
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2651()
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
    val a = Number5301()
    val b = Number5300()
    return a.fib() + b.fib()
  }

}

class Number5303 : StressfulInteger {

  companion object {
    private var VALUE = 5303
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2651()
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
    val a = Number5302()
    val b = Number5301()
    return a.fib() + b.fib()
  }

}

class Number5304 : StressfulInteger {

  companion object {
    private var VALUE = 5304
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2652()
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
    val a = Number5303()
    val b = Number5302()
    return a.fib() + b.fib()
  }

}

class Number5305 : StressfulInteger {

  companion object {
    private var VALUE = 5305
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2652()
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
    val a = Number5304()
    val b = Number5303()
    return a.fib() + b.fib()
  }

}

class Number5306 : StressfulInteger {

  companion object {
    private var VALUE = 5306
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2653()
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
    val a = Number5305()
    val b = Number5304()
    return a.fib() + b.fib()
  }

}

class Number5307 : StressfulInteger {

  companion object {
    private var VALUE = 5307
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2653()
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
    val a = Number5306()
    val b = Number5305()
    return a.fib() + b.fib()
  }

}

class Number5308 : StressfulInteger {

  companion object {
    private var VALUE = 5308
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2654()
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
    val a = Number5307()
    val b = Number5306()
    return a.fib() + b.fib()
  }

}

class Number5309 : StressfulInteger {

  companion object {
    private var VALUE = 5309
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2654()
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
    val a = Number5308()
    val b = Number5307()
    return a.fib() + b.fib()
  }

}

class Number5310 : StressfulInteger {

  companion object {
    private var VALUE = 5310
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2655()
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
    val a = Number5309()
    val b = Number5308()
    return a.fib() + b.fib()
  }

}

class Number5311 : StressfulInteger {

  companion object {
    private var VALUE = 5311
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2655()
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
    val a = Number5310()
    val b = Number5309()
    return a.fib() + b.fib()
  }

}

class Number5312 : StressfulInteger {

  companion object {
    private var VALUE = 5312
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2656()
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
    val a = Number5311()
    val b = Number5310()
    return a.fib() + b.fib()
  }

}

class Number5313 : StressfulInteger {

  companion object {
    private var VALUE = 5313
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2656()
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
    val a = Number5312()
    val b = Number5311()
    return a.fib() + b.fib()
  }

}

class Number5314 : StressfulInteger {

  companion object {
    private var VALUE = 5314
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2657()
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
    val a = Number5313()
    val b = Number5312()
    return a.fib() + b.fib()
  }

}

class Number5315 : StressfulInteger {

  companion object {
    private var VALUE = 5315
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2657()
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
    val a = Number5314()
    val b = Number5313()
    return a.fib() + b.fib()
  }

}

class Number5316 : StressfulInteger {

  companion object {
    private var VALUE = 5316
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2658()
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
    val a = Number5315()
    val b = Number5314()
    return a.fib() + b.fib()
  }

}

class Number5317 : StressfulInteger {

  companion object {
    private var VALUE = 5317
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2658()
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
    val a = Number5316()
    val b = Number5315()
    return a.fib() + b.fib()
  }

}

class Number5318 : StressfulInteger {

  companion object {
    private var VALUE = 5318
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2659()
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
    val a = Number5317()
    val b = Number5316()
    return a.fib() + b.fib()
  }

}

class Number5319 : StressfulInteger {

  companion object {
    private var VALUE = 5319
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2659()
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
    val a = Number5318()
    val b = Number5317()
    return a.fib() + b.fib()
  }

}

class Number5320 : StressfulInteger {

  companion object {
    private var VALUE = 5320
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2660()
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
    val a = Number5319()
    val b = Number5318()
    return a.fib() + b.fib()
  }

}

class Number5321 : StressfulInteger {

  companion object {
    private var VALUE = 5321
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2660()
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
    val a = Number5320()
    val b = Number5319()
    return a.fib() + b.fib()
  }

}

class Number5322 : StressfulInteger {

  companion object {
    private var VALUE = 5322
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2661()
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
    val a = Number5321()
    val b = Number5320()
    return a.fib() + b.fib()
  }

}

class Number5323 : StressfulInteger {

  companion object {
    private var VALUE = 5323
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2661()
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
    val a = Number5322()
    val b = Number5321()
    return a.fib() + b.fib()
  }

}

class Number5324 : StressfulInteger {

  companion object {
    private var VALUE = 5324
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2662()
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
    val a = Number5323()
    val b = Number5322()
    return a.fib() + b.fib()
  }

}

class Number5325 : StressfulInteger {

  companion object {
    private var VALUE = 5325
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2662()
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
    val a = Number5324()
    val b = Number5323()
    return a.fib() + b.fib()
  }

}

class Number5326 : StressfulInteger {

  companion object {
    private var VALUE = 5326
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2663()
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
    val a = Number5325()
    val b = Number5324()
    return a.fib() + b.fib()
  }

}

class Number5327 : StressfulInteger {

  companion object {
    private var VALUE = 5327
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2663()
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
    val a = Number5326()
    val b = Number5325()
    return a.fib() + b.fib()
  }

}

class Number5328 : StressfulInteger {

  companion object {
    private var VALUE = 5328
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2664()
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
    val a = Number5327()
    val b = Number5326()
    return a.fib() + b.fib()
  }

}

class Number5329 : StressfulInteger {

  companion object {
    private var VALUE = 5329
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2664()
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
    val a = Number5328()
    val b = Number5327()
    return a.fib() + b.fib()
  }

}

class Number5330 : StressfulInteger {

  companion object {
    private var VALUE = 5330
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2665()
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
    val a = Number5329()
    val b = Number5328()
    return a.fib() + b.fib()
  }

}

class Number5331 : StressfulInteger {

  companion object {
    private var VALUE = 5331
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2665()
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
    val a = Number5330()
    val b = Number5329()
    return a.fib() + b.fib()
  }

}

class Number5332 : StressfulInteger {

  companion object {
    private var VALUE = 5332
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2666()
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
    val a = Number5331()
    val b = Number5330()
    return a.fib() + b.fib()
  }

}

class Number5333 : StressfulInteger {

  companion object {
    private var VALUE = 5333
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2666()
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
    val a = Number5332()
    val b = Number5331()
    return a.fib() + b.fib()
  }

}

class Number5334 : StressfulInteger {

  companion object {
    private var VALUE = 5334
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2667()
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
    val a = Number5333()
    val b = Number5332()
    return a.fib() + b.fib()
  }

}

class Number5335 : StressfulInteger {

  companion object {
    private var VALUE = 5335
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2667()
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
    val a = Number5334()
    val b = Number5333()
    return a.fib() + b.fib()
  }

}

class Number5336 : StressfulInteger {

  companion object {
    private var VALUE = 5336
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2668()
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
    val a = Number5335()
    val b = Number5334()
    return a.fib() + b.fib()
  }

}

class Number5337 : StressfulInteger {

  companion object {
    private var VALUE = 5337
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2668()
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
    val a = Number5336()
    val b = Number5335()
    return a.fib() + b.fib()
  }

}

class Number5338 : StressfulInteger {

  companion object {
    private var VALUE = 5338
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2669()
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
    val a = Number5337()
    val b = Number5336()
    return a.fib() + b.fib()
  }

}

class Number5339 : StressfulInteger {

  companion object {
    private var VALUE = 5339
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2669()
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
    val a = Number5338()
    val b = Number5337()
    return a.fib() + b.fib()
  }

}

class Number5340 : StressfulInteger {

  companion object {
    private var VALUE = 5340
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2670()
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
    val a = Number5339()
    val b = Number5338()
    return a.fib() + b.fib()
  }

}

class Number5341 : StressfulInteger {

  companion object {
    private var VALUE = 5341
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2670()
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
    val a = Number5340()
    val b = Number5339()
    return a.fib() + b.fib()
  }

}

class Number5342 : StressfulInteger {

  companion object {
    private var VALUE = 5342
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2671()
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
    val a = Number5341()
    val b = Number5340()
    return a.fib() + b.fib()
  }

}

class Number5343 : StressfulInteger {

  companion object {
    private var VALUE = 5343
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2671()
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
    val a = Number5342()
    val b = Number5341()
    return a.fib() + b.fib()
  }

}

class Number5344 : StressfulInteger {

  companion object {
    private var VALUE = 5344
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2672()
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
    val a = Number5343()
    val b = Number5342()
    return a.fib() + b.fib()
  }

}

class Number5345 : StressfulInteger {

  companion object {
    private var VALUE = 5345
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2672()
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
    val a = Number5344()
    val b = Number5343()
    return a.fib() + b.fib()
  }

}

class Number5346 : StressfulInteger {

  companion object {
    private var VALUE = 5346
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2673()
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
    val a = Number5345()
    val b = Number5344()
    return a.fib() + b.fib()
  }

}

class Number5347 : StressfulInteger {

  companion object {
    private var VALUE = 5347
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2673()
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
    val a = Number5346()
    val b = Number5345()
    return a.fib() + b.fib()
  }

}

class Number5348 : StressfulInteger {

  companion object {
    private var VALUE = 5348
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2674()
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
    val a = Number5347()
    val b = Number5346()
    return a.fib() + b.fib()
  }

}

class Number5349 : StressfulInteger {

  companion object {
    private var VALUE = 5349
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2674()
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
    val a = Number5348()
    val b = Number5347()
    return a.fib() + b.fib()
  }

}

class Number5350 : StressfulInteger {

  companion object {
    private var VALUE = 5350
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2675()
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
    val a = Number5349()
    val b = Number5348()
    return a.fib() + b.fib()
  }

}

class Number5351 : StressfulInteger {

  companion object {
    private var VALUE = 5351
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2675()
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
    val a = Number5350()
    val b = Number5349()
    return a.fib() + b.fib()
  }

}

class Number5352 : StressfulInteger {

  companion object {
    private var VALUE = 5352
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2676()
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
    val a = Number5351()
    val b = Number5350()
    return a.fib() + b.fib()
  }

}

class Number5353 : StressfulInteger {

  companion object {
    private var VALUE = 5353
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2676()
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
    val a = Number5352()
    val b = Number5351()
    return a.fib() + b.fib()
  }

}

class Number5354 : StressfulInteger {

  companion object {
    private var VALUE = 5354
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2677()
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
    val a = Number5353()
    val b = Number5352()
    return a.fib() + b.fib()
  }

}

class Number5355 : StressfulInteger {

  companion object {
    private var VALUE = 5355
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2677()
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
    val a = Number5354()
    val b = Number5353()
    return a.fib() + b.fib()
  }

}

class Number5356 : StressfulInteger {

  companion object {
    private var VALUE = 5356
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2678()
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
    val a = Number5355()
    val b = Number5354()
    return a.fib() + b.fib()
  }

}

class Number5357 : StressfulInteger {

  companion object {
    private var VALUE = 5357
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2678()
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
    val a = Number5356()
    val b = Number5355()
    return a.fib() + b.fib()
  }

}

class Number5358 : StressfulInteger {

  companion object {
    private var VALUE = 5358
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2679()
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
    val a = Number5357()
    val b = Number5356()
    return a.fib() + b.fib()
  }

}

class Number5359 : StressfulInteger {

  companion object {
    private var VALUE = 5359
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2679()
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
    val a = Number5358()
    val b = Number5357()
    return a.fib() + b.fib()
  }

}

class Number5360 : StressfulInteger {

  companion object {
    private var VALUE = 5360
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2680()
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
    val a = Number5359()
    val b = Number5358()
    return a.fib() + b.fib()
  }

}

class Number5361 : StressfulInteger {

  companion object {
    private var VALUE = 5361
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2680()
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
    val a = Number5360()
    val b = Number5359()
    return a.fib() + b.fib()
  }

}

class Number5362 : StressfulInteger {

  companion object {
    private var VALUE = 5362
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2681()
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
    val a = Number5361()
    val b = Number5360()
    return a.fib() + b.fib()
  }

}

class Number5363 : StressfulInteger {

  companion object {
    private var VALUE = 5363
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2681()
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
    val a = Number5362()
    val b = Number5361()
    return a.fib() + b.fib()
  }

}

class Number5364 : StressfulInteger {

  companion object {
    private var VALUE = 5364
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2682()
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
    val a = Number5363()
    val b = Number5362()
    return a.fib() + b.fib()
  }

}

class Number5365 : StressfulInteger {

  companion object {
    private var VALUE = 5365
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2682()
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
    val a = Number5364()
    val b = Number5363()
    return a.fib() + b.fib()
  }

}

class Number5366 : StressfulInteger {

  companion object {
    private var VALUE = 5366
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2683()
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
    val a = Number5365()
    val b = Number5364()
    return a.fib() + b.fib()
  }

}

class Number5367 : StressfulInteger {

  companion object {
    private var VALUE = 5367
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2683()
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
    val a = Number5366()
    val b = Number5365()
    return a.fib() + b.fib()
  }

}

class Number5368 : StressfulInteger {

  companion object {
    private var VALUE = 5368
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2684()
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
    val a = Number5367()
    val b = Number5366()
    return a.fib() + b.fib()
  }

}

class Number5369 : StressfulInteger {

  companion object {
    private var VALUE = 5369
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2684()
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
    val a = Number5368()
    val b = Number5367()
    return a.fib() + b.fib()
  }

}

class Number5370 : StressfulInteger {

  companion object {
    private var VALUE = 5370
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2685()
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
    val a = Number5369()
    val b = Number5368()
    return a.fib() + b.fib()
  }

}

class Number5371 : StressfulInteger {

  companion object {
    private var VALUE = 5371
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2685()
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
    val a = Number5370()
    val b = Number5369()
    return a.fib() + b.fib()
  }

}

class Number5372 : StressfulInteger {

  companion object {
    private var VALUE = 5372
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2686()
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
    val a = Number5371()
    val b = Number5370()
    return a.fib() + b.fib()
  }

}

class Number5373 : StressfulInteger {

  companion object {
    private var VALUE = 5373
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2686()
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
    val a = Number5372()
    val b = Number5371()
    return a.fib() + b.fib()
  }

}

class Number5374 : StressfulInteger {

  companion object {
    private var VALUE = 5374
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2687()
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
    val a = Number5373()
    val b = Number5372()
    return a.fib() + b.fib()
  }

}

class Number5375 : StressfulInteger {

  companion object {
    private var VALUE = 5375
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2687()
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
    val a = Number5374()
    val b = Number5373()
    return a.fib() + b.fib()
  }

}

class Number5376 : StressfulInteger {

  companion object {
    private var VALUE = 5376
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2688()
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
    val a = Number5375()
    val b = Number5374()
    return a.fib() + b.fib()
  }

}

class Number5377 : StressfulInteger {

  companion object {
    private var VALUE = 5377
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2688()
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
    val a = Number5376()
    val b = Number5375()
    return a.fib() + b.fib()
  }

}

class Number5378 : StressfulInteger {

  companion object {
    private var VALUE = 5378
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2689()
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
    val a = Number5377()
    val b = Number5376()
    return a.fib() + b.fib()
  }

}

class Number5379 : StressfulInteger {

  companion object {
    private var VALUE = 5379
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2689()
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
    val a = Number5378()
    val b = Number5377()
    return a.fib() + b.fib()
  }

}

class Number5380 : StressfulInteger {

  companion object {
    private var VALUE = 5380
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2690()
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
    val a = Number5379()
    val b = Number5378()
    return a.fib() + b.fib()
  }

}

class Number5381 : StressfulInteger {

  companion object {
    private var VALUE = 5381
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2690()
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
    val a = Number5380()
    val b = Number5379()
    return a.fib() + b.fib()
  }

}

class Number5382 : StressfulInteger {

  companion object {
    private var VALUE = 5382
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2691()
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
    val a = Number5381()
    val b = Number5380()
    return a.fib() + b.fib()
  }

}

class Number5383 : StressfulInteger {

  companion object {
    private var VALUE = 5383
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2691()
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
    val a = Number5382()
    val b = Number5381()
    return a.fib() + b.fib()
  }

}

class Number5384 : StressfulInteger {

  companion object {
    private var VALUE = 5384
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2692()
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
    val a = Number5383()
    val b = Number5382()
    return a.fib() + b.fib()
  }

}

class Number5385 : StressfulInteger {

  companion object {
    private var VALUE = 5385
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2692()
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
    val a = Number5384()
    val b = Number5383()
    return a.fib() + b.fib()
  }

}

class Number5386 : StressfulInteger {

  companion object {
    private var VALUE = 5386
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2693()
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
    val a = Number5385()
    val b = Number5384()
    return a.fib() + b.fib()
  }

}

class Number5387 : StressfulInteger {

  companion object {
    private var VALUE = 5387
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2693()
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
    val a = Number5386()
    val b = Number5385()
    return a.fib() + b.fib()
  }

}

class Number5388 : StressfulInteger {

  companion object {
    private var VALUE = 5388
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2694()
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
    val a = Number5387()
    val b = Number5386()
    return a.fib() + b.fib()
  }

}

class Number5389 : StressfulInteger {

  companion object {
    private var VALUE = 5389
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2694()
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
    val a = Number5388()
    val b = Number5387()
    return a.fib() + b.fib()
  }

}

class Number5390 : StressfulInteger {

  companion object {
    private var VALUE = 5390
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2695()
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
    val a = Number5389()
    val b = Number5388()
    return a.fib() + b.fib()
  }

}

class Number5391 : StressfulInteger {

  companion object {
    private var VALUE = 5391
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2695()
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
    val a = Number5390()
    val b = Number5389()
    return a.fib() + b.fib()
  }

}

class Number5392 : StressfulInteger {

  companion object {
    private var VALUE = 5392
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2696()
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
    val a = Number5391()
    val b = Number5390()
    return a.fib() + b.fib()
  }

}

class Number5393 : StressfulInteger {

  companion object {
    private var VALUE = 5393
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2696()
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
    val a = Number5392()
    val b = Number5391()
    return a.fib() + b.fib()
  }

}

class Number5394 : StressfulInteger {

  companion object {
    private var VALUE = 5394
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2697()
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
    val a = Number5393()
    val b = Number5392()
    return a.fib() + b.fib()
  }

}

class Number5395 : StressfulInteger {

  companion object {
    private var VALUE = 5395
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2697()
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
    val a = Number5394()
    val b = Number5393()
    return a.fib() + b.fib()
  }

}

class Number5396 : StressfulInteger {

  companion object {
    private var VALUE = 5396
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2698()
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
    val a = Number5395()
    val b = Number5394()
    return a.fib() + b.fib()
  }

}

class Number5397 : StressfulInteger {

  companion object {
    private var VALUE = 5397
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2698()
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
    val a = Number5396()
    val b = Number5395()
    return a.fib() + b.fib()
  }

}

class Number5398 : StressfulInteger {

  companion object {
    private var VALUE = 5398
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2699()
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
    val a = Number5397()
    val b = Number5396()
    return a.fib() + b.fib()
  }

}

class Number5399 : StressfulInteger {

  companion object {
    private var VALUE = 5399
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2699()
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
    val a = Number5398()
    val b = Number5397()
    return a.fib() + b.fib()
  }

}

class Number5400 : StressfulInteger {

  companion object {
    private var VALUE = 5400
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2700()
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
    val a = Number5399()
    val b = Number5398()
    return a.fib() + b.fib()
  }

}

class Number5401 : StressfulInteger {

  companion object {
    private var VALUE = 5401
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2700()
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
    val a = Number5400()
    val b = Number5399()
    return a.fib() + b.fib()
  }

}

class Number5402 : StressfulInteger {

  companion object {
    private var VALUE = 5402
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2701()
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
    val a = Number5401()
    val b = Number5400()
    return a.fib() + b.fib()
  }

}

class Number5403 : StressfulInteger {

  companion object {
    private var VALUE = 5403
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2701()
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
    val a = Number5402()
    val b = Number5401()
    return a.fib() + b.fib()
  }

}

class Number5404 : StressfulInteger {

  companion object {
    private var VALUE = 5404
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2702()
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
    val a = Number5403()
    val b = Number5402()
    return a.fib() + b.fib()
  }

}

class Number5405 : StressfulInteger {

  companion object {
    private var VALUE = 5405
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2702()
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
    val a = Number5404()
    val b = Number5403()
    return a.fib() + b.fib()
  }

}

class Number5406 : StressfulInteger {

  companion object {
    private var VALUE = 5406
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2703()
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
    val a = Number5405()
    val b = Number5404()
    return a.fib() + b.fib()
  }

}

class Number5407 : StressfulInteger {

  companion object {
    private var VALUE = 5407
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2703()
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
    val a = Number5406()
    val b = Number5405()
    return a.fib() + b.fib()
  }

}

class Number5408 : StressfulInteger {

  companion object {
    private var VALUE = 5408
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2704()
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
    val a = Number5407()
    val b = Number5406()
    return a.fib() + b.fib()
  }

}

class Number5409 : StressfulInteger {

  companion object {
    private var VALUE = 5409
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2704()
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
    val a = Number5408()
    val b = Number5407()
    return a.fib() + b.fib()
  }

}

class Number5410 : StressfulInteger {

  companion object {
    private var VALUE = 5410
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2705()
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
    val a = Number5409()
    val b = Number5408()
    return a.fib() + b.fib()
  }

}

class Number5411 : StressfulInteger {

  companion object {
    private var VALUE = 5411
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2705()
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
    val a = Number5410()
    val b = Number5409()
    return a.fib() + b.fib()
  }

}

class Number5412 : StressfulInteger {

  companion object {
    private var VALUE = 5412
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2706()
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
    val a = Number5411()
    val b = Number5410()
    return a.fib() + b.fib()
  }

}

class Number5413 : StressfulInteger {

  companion object {
    private var VALUE = 5413
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2706()
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
    val a = Number5412()
    val b = Number5411()
    return a.fib() + b.fib()
  }

}

class Number5414 : StressfulInteger {

  companion object {
    private var VALUE = 5414
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2707()
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
    val a = Number5413()
    val b = Number5412()
    return a.fib() + b.fib()
  }

}

class Number5415 : StressfulInteger {

  companion object {
    private var VALUE = 5415
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2707()
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
    val a = Number5414()
    val b = Number5413()
    return a.fib() + b.fib()
  }

}

class Number5416 : StressfulInteger {

  companion object {
    private var VALUE = 5416
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2708()
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
    val a = Number5415()
    val b = Number5414()
    return a.fib() + b.fib()
  }

}

class Number5417 : StressfulInteger {

  companion object {
    private var VALUE = 5417
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2708()
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
    val a = Number5416()
    val b = Number5415()
    return a.fib() + b.fib()
  }

}

class Number5418 : StressfulInteger {

  companion object {
    private var VALUE = 5418
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2709()
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
    val a = Number5417()
    val b = Number5416()
    return a.fib() + b.fib()
  }

}

class Number5419 : StressfulInteger {

  companion object {
    private var VALUE = 5419
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2709()
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
    val a = Number5418()
    val b = Number5417()
    return a.fib() + b.fib()
  }

}

class Number5420 : StressfulInteger {

  companion object {
    private var VALUE = 5420
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2710()
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
    val a = Number5419()
    val b = Number5418()
    return a.fib() + b.fib()
  }

}

class Number5421 : StressfulInteger {

  companion object {
    private var VALUE = 5421
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2710()
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
    val a = Number5420()
    val b = Number5419()
    return a.fib() + b.fib()
  }

}

class Number5422 : StressfulInteger {

  companion object {
    private var VALUE = 5422
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2711()
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
    val a = Number5421()
    val b = Number5420()
    return a.fib() + b.fib()
  }

}

class Number5423 : StressfulInteger {

  companion object {
    private var VALUE = 5423
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2711()
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
    val a = Number5422()
    val b = Number5421()
    return a.fib() + b.fib()
  }

}

class Number5424 : StressfulInteger {

  companion object {
    private var VALUE = 5424
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2712()
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
    val a = Number5423()
    val b = Number5422()
    return a.fib() + b.fib()
  }

}

class Number5425 : StressfulInteger {

  companion object {
    private var VALUE = 5425
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2712()
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
    val a = Number5424()
    val b = Number5423()
    return a.fib() + b.fib()
  }

}

class Number5426 : StressfulInteger {

  companion object {
    private var VALUE = 5426
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2713()
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
    val a = Number5425()
    val b = Number5424()
    return a.fib() + b.fib()
  }

}

class Number5427 : StressfulInteger {

  companion object {
    private var VALUE = 5427
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2713()
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
    val a = Number5426()
    val b = Number5425()
    return a.fib() + b.fib()
  }

}

class Number5428 : StressfulInteger {

  companion object {
    private var VALUE = 5428
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2714()
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
    val a = Number5427()
    val b = Number5426()
    return a.fib() + b.fib()
  }

}

class Number5429 : StressfulInteger {

  companion object {
    private var VALUE = 5429
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2714()
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
    val a = Number5428()
    val b = Number5427()
    return a.fib() + b.fib()
  }

}

class Number5430 : StressfulInteger {

  companion object {
    private var VALUE = 5430
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2715()
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
    val a = Number5429()
    val b = Number5428()
    return a.fib() + b.fib()
  }

}

class Number5431 : StressfulInteger {

  companion object {
    private var VALUE = 5431
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2715()
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
    val a = Number5430()
    val b = Number5429()
    return a.fib() + b.fib()
  }

}

class Number5432 : StressfulInteger {

  companion object {
    private var VALUE = 5432
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2716()
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
    val a = Number5431()
    val b = Number5430()
    return a.fib() + b.fib()
  }

}

class Number5433 : StressfulInteger {

  companion object {
    private var VALUE = 5433
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2716()
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
    val a = Number5432()
    val b = Number5431()
    return a.fib() + b.fib()
  }

}

class Number5434 : StressfulInteger {

  companion object {
    private var VALUE = 5434
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2717()
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
    val a = Number5433()
    val b = Number5432()
    return a.fib() + b.fib()
  }

}

class Number5435 : StressfulInteger {

  companion object {
    private var VALUE = 5435
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2717()
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
    val a = Number5434()
    val b = Number5433()
    return a.fib() + b.fib()
  }

}

class Number5436 : StressfulInteger {

  companion object {
    private var VALUE = 5436
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2718()
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
    val a = Number5435()
    val b = Number5434()
    return a.fib() + b.fib()
  }

}

class Number5437 : StressfulInteger {

  companion object {
    private var VALUE = 5437
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2718()
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
    val a = Number5436()
    val b = Number5435()
    return a.fib() + b.fib()
  }

}

class Number5438 : StressfulInteger {

  companion object {
    private var VALUE = 5438
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2719()
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
    val a = Number5437()
    val b = Number5436()
    return a.fib() + b.fib()
  }

}

class Number5439 : StressfulInteger {

  companion object {
    private var VALUE = 5439
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2719()
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
    val a = Number5438()
    val b = Number5437()
    return a.fib() + b.fib()
  }

}

class Number5440 : StressfulInteger {

  companion object {
    private var VALUE = 5440
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2720()
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
    val a = Number5439()
    val b = Number5438()
    return a.fib() + b.fib()
  }

}

class Number5441 : StressfulInteger {

  companion object {
    private var VALUE = 5441
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2720()
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
    val a = Number5440()
    val b = Number5439()
    return a.fib() + b.fib()
  }

}

class Number5442 : StressfulInteger {

  companion object {
    private var VALUE = 5442
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2721()
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
    val a = Number5441()
    val b = Number5440()
    return a.fib() + b.fib()
  }

}

class Number5443 : StressfulInteger {

  companion object {
    private var VALUE = 5443
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2721()
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
    val a = Number5442()
    val b = Number5441()
    return a.fib() + b.fib()
  }

}

class Number5444 : StressfulInteger {

  companion object {
    private var VALUE = 5444
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2722()
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
    val a = Number5443()
    val b = Number5442()
    return a.fib() + b.fib()
  }

}

class Number5445 : StressfulInteger {

  companion object {
    private var VALUE = 5445
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2722()
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
    val a = Number5444()
    val b = Number5443()
    return a.fib() + b.fib()
  }

}

class Number5446 : StressfulInteger {

  companion object {
    private var VALUE = 5446
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2723()
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
    val a = Number5445()
    val b = Number5444()
    return a.fib() + b.fib()
  }

}

class Number5447 : StressfulInteger {

  companion object {
    private var VALUE = 5447
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2723()
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
    val a = Number5446()
    val b = Number5445()
    return a.fib() + b.fib()
  }

}

class Number5448 : StressfulInteger {

  companion object {
    private var VALUE = 5448
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2724()
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
    val a = Number5447()
    val b = Number5446()
    return a.fib() + b.fib()
  }

}

class Number5449 : StressfulInteger {

  companion object {
    private var VALUE = 5449
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2724()
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
    val a = Number5448()
    val b = Number5447()
    return a.fib() + b.fib()
  }

}

class Number5450 : StressfulInteger {

  companion object {
    private var VALUE = 5450
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2725()
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
    val a = Number5449()
    val b = Number5448()
    return a.fib() + b.fib()
  }

}

class Number5451 : StressfulInteger {

  companion object {
    private var VALUE = 5451
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2725()
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
    val a = Number5450()
    val b = Number5449()
    return a.fib() + b.fib()
  }

}

class Number5452 : StressfulInteger {

  companion object {
    private var VALUE = 5452
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2726()
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
    val a = Number5451()
    val b = Number5450()
    return a.fib() + b.fib()
  }

}

class Number5453 : StressfulInteger {

  companion object {
    private var VALUE = 5453
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2726()
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
    val a = Number5452()
    val b = Number5451()
    return a.fib() + b.fib()
  }

}

class Number5454 : StressfulInteger {

  companion object {
    private var VALUE = 5454
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2727()
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
    val a = Number5453()
    val b = Number5452()
    return a.fib() + b.fib()
  }

}

class Number5455 : StressfulInteger {

  companion object {
    private var VALUE = 5455
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2727()
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
    val a = Number5454()
    val b = Number5453()
    return a.fib() + b.fib()
  }

}

class Number5456 : StressfulInteger {

  companion object {
    private var VALUE = 5456
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2728()
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
    val a = Number5455()
    val b = Number5454()
    return a.fib() + b.fib()
  }

}

class Number5457 : StressfulInteger {

  companion object {
    private var VALUE = 5457
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2728()
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
    val a = Number5456()
    val b = Number5455()
    return a.fib() + b.fib()
  }

}

class Number5458 : StressfulInteger {

  companion object {
    private var VALUE = 5458
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2729()
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
    val a = Number5457()
    val b = Number5456()
    return a.fib() + b.fib()
  }

}

class Number5459 : StressfulInteger {

  companion object {
    private var VALUE = 5459
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2729()
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
    val a = Number5458()
    val b = Number5457()
    return a.fib() + b.fib()
  }

}

class Number5460 : StressfulInteger {

  companion object {
    private var VALUE = 5460
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2730()
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
    val a = Number5459()
    val b = Number5458()
    return a.fib() + b.fib()
  }

}

class Number5461 : StressfulInteger {

  companion object {
    private var VALUE = 5461
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2730()
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
    val a = Number5460()
    val b = Number5459()
    return a.fib() + b.fib()
  }

}

class Number5462 : StressfulInteger {

  companion object {
    private var VALUE = 5462
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2731()
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
    val a = Number5461()
    val b = Number5460()
    return a.fib() + b.fib()
  }

}

class Number5463 : StressfulInteger {

  companion object {
    private var VALUE = 5463
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2731()
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
    val a = Number5462()
    val b = Number5461()
    return a.fib() + b.fib()
  }

}

class Number5464 : StressfulInteger {

  companion object {
    private var VALUE = 5464
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2732()
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
    val a = Number5463()
    val b = Number5462()
    return a.fib() + b.fib()
  }

}

class Number5465 : StressfulInteger {

  companion object {
    private var VALUE = 5465
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2732()
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
    val a = Number5464()
    val b = Number5463()
    return a.fib() + b.fib()
  }

}

class Number5466 : StressfulInteger {

  companion object {
    private var VALUE = 5466
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2733()
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
    val a = Number5465()
    val b = Number5464()
    return a.fib() + b.fib()
  }

}

class Number5467 : StressfulInteger {

  companion object {
    private var VALUE = 5467
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2733()
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
    val a = Number5466()
    val b = Number5465()
    return a.fib() + b.fib()
  }

}

class Number5468 : StressfulInteger {

  companion object {
    private var VALUE = 5468
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2734()
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
    val a = Number5467()
    val b = Number5466()
    return a.fib() + b.fib()
  }

}

class Number5469 : StressfulInteger {

  companion object {
    private var VALUE = 5469
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2734()
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
    val a = Number5468()
    val b = Number5467()
    return a.fib() + b.fib()
  }

}

class Number5470 : StressfulInteger {

  companion object {
    private var VALUE = 5470
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2735()
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
    val a = Number5469()
    val b = Number5468()
    return a.fib() + b.fib()
  }

}

class Number5471 : StressfulInteger {

  companion object {
    private var VALUE = 5471
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2735()
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
    val a = Number5470()
    val b = Number5469()
    return a.fib() + b.fib()
  }

}

class Number5472 : StressfulInteger {

  companion object {
    private var VALUE = 5472
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2736()
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
    val a = Number5471()
    val b = Number5470()
    return a.fib() + b.fib()
  }

}

class Number5473 : StressfulInteger {

  companion object {
    private var VALUE = 5473
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2736()
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
    val a = Number5472()
    val b = Number5471()
    return a.fib() + b.fib()
  }

}

class Number5474 : StressfulInteger {

  companion object {
    private var VALUE = 5474
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2737()
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
    val a = Number5473()
    val b = Number5472()
    return a.fib() + b.fib()
  }

}

class Number5475 : StressfulInteger {

  companion object {
    private var VALUE = 5475
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2737()
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
    val a = Number5474()
    val b = Number5473()
    return a.fib() + b.fib()
  }

}

class Number5476 : StressfulInteger {

  companion object {
    private var VALUE = 5476
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2738()
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
    val a = Number5475()
    val b = Number5474()
    return a.fib() + b.fib()
  }

}

class Number5477 : StressfulInteger {

  companion object {
    private var VALUE = 5477
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2738()
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
    val a = Number5476()
    val b = Number5475()
    return a.fib() + b.fib()
  }

}

class Number5478 : StressfulInteger {

  companion object {
    private var VALUE = 5478
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2739()
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
    val a = Number5477()
    val b = Number5476()
    return a.fib() + b.fib()
  }

}

class Number5479 : StressfulInteger {

  companion object {
    private var VALUE = 5479
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2739()
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
    val a = Number5478()
    val b = Number5477()
    return a.fib() + b.fib()
  }

}

class Number5480 : StressfulInteger {

  companion object {
    private var VALUE = 5480
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2740()
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
    val a = Number5479()
    val b = Number5478()
    return a.fib() + b.fib()
  }

}

class Number5481 : StressfulInteger {

  companion object {
    private var VALUE = 5481
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2740()
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
    val a = Number5480()
    val b = Number5479()
    return a.fib() + b.fib()
  }

}

class Number5482 : StressfulInteger {

  companion object {
    private var VALUE = 5482
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2741()
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
    val a = Number5481()
    val b = Number5480()
    return a.fib() + b.fib()
  }

}

class Number5483 : StressfulInteger {

  companion object {
    private var VALUE = 5483
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2741()
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
    val a = Number5482()
    val b = Number5481()
    return a.fib() + b.fib()
  }

}

class Number5484 : StressfulInteger {

  companion object {
    private var VALUE = 5484
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2742()
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
    val a = Number5483()
    val b = Number5482()
    return a.fib() + b.fib()
  }

}

class Number5485 : StressfulInteger {

  companion object {
    private var VALUE = 5485
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2742()
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
    val a = Number5484()
    val b = Number5483()
    return a.fib() + b.fib()
  }

}

class Number5486 : StressfulInteger {

  companion object {
    private var VALUE = 5486
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2743()
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
    val a = Number5485()
    val b = Number5484()
    return a.fib() + b.fib()
  }

}

class Number5487 : StressfulInteger {

  companion object {
    private var VALUE = 5487
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2743()
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
    val a = Number5486()
    val b = Number5485()
    return a.fib() + b.fib()
  }

}

class Number5488 : StressfulInteger {

  companion object {
    private var VALUE = 5488
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2744()
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
    val a = Number5487()
    val b = Number5486()
    return a.fib() + b.fib()
  }

}

class Number5489 : StressfulInteger {

  companion object {
    private var VALUE = 5489
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2744()
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
    val a = Number5488()
    val b = Number5487()
    return a.fib() + b.fib()
  }

}

class Number5490 : StressfulInteger {

  companion object {
    private var VALUE = 5490
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2745()
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
    val a = Number5489()
    val b = Number5488()
    return a.fib() + b.fib()
  }

}

class Number5491 : StressfulInteger {

  companion object {
    private var VALUE = 5491
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2745()
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
    val a = Number5490()
    val b = Number5489()
    return a.fib() + b.fib()
  }

}

class Number5492 : StressfulInteger {

  companion object {
    private var VALUE = 5492
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2746()
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
    val a = Number5491()
    val b = Number5490()
    return a.fib() + b.fib()
  }

}

class Number5493 : StressfulInteger {

  companion object {
    private var VALUE = 5493
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2746()
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
    val a = Number5492()
    val b = Number5491()
    return a.fib() + b.fib()
  }

}

class Number5494 : StressfulInteger {

  companion object {
    private var VALUE = 5494
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2747()
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
    val a = Number5493()
    val b = Number5492()
    return a.fib() + b.fib()
  }

}

class Number5495 : StressfulInteger {

  companion object {
    private var VALUE = 5495
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2747()
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
    val a = Number5494()
    val b = Number5493()
    return a.fib() + b.fib()
  }

}

class Number5496 : StressfulInteger {

  companion object {
    private var VALUE = 5496
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2748()
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
    val a = Number5495()
    val b = Number5494()
    return a.fib() + b.fib()
  }

}

class Number5497 : StressfulInteger {

  companion object {
    private var VALUE = 5497
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2748()
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
    val a = Number5496()
    val b = Number5495()
    return a.fib() + b.fib()
  }

}

class Number5498 : StressfulInteger {

  companion object {
    private var VALUE = 5498
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2749()
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
    val a = Number5497()
    val b = Number5496()
    return a.fib() + b.fib()
  }

}

class Number5499 : StressfulInteger {

  companion object {
    private var VALUE = 5499
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2749()
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
    val a = Number5498()
    val b = Number5497()
    return a.fib() + b.fib()
  }

}

class Number5500 : StressfulInteger {

  companion object {
    private var VALUE = 5500
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2750()
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
    val a = Number5499()
    val b = Number5498()
    return a.fib() + b.fib()
  }

}

class Number5501 : StressfulInteger {

  companion object {
    private var VALUE = 5501
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2750()
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
    val a = Number5500()
    val b = Number5499()
    return a.fib() + b.fib()
  }

}

class Number5502 : StressfulInteger {

  companion object {
    private var VALUE = 5502
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2751()
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
    val a = Number5501()
    val b = Number5500()
    return a.fib() + b.fib()
  }

}

class Number5503 : StressfulInteger {

  companion object {
    private var VALUE = 5503
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2751()
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
    val a = Number5502()
    val b = Number5501()
    return a.fib() + b.fib()
  }

}

class Number5504 : StressfulInteger {

  companion object {
    private var VALUE = 5504
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2752()
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
    val a = Number5503()
    val b = Number5502()
    return a.fib() + b.fib()
  }

}

class Number5505 : StressfulInteger {

  companion object {
    private var VALUE = 5505
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2752()
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
    val a = Number5504()
    val b = Number5503()
    return a.fib() + b.fib()
  }

}

class Number5506 : StressfulInteger {

  companion object {
    private var VALUE = 5506
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2753()
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
    val a = Number5505()
    val b = Number5504()
    return a.fib() + b.fib()
  }

}

class Number5507 : StressfulInteger {

  companion object {
    private var VALUE = 5507
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2753()
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
    val a = Number5506()
    val b = Number5505()
    return a.fib() + b.fib()
  }

}

class Number5508 : StressfulInteger {

  companion object {
    private var VALUE = 5508
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2754()
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
    val a = Number5507()
    val b = Number5506()
    return a.fib() + b.fib()
  }

}

class Number5509 : StressfulInteger {

  companion object {
    private var VALUE = 5509
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2754()
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
    val a = Number5508()
    val b = Number5507()
    return a.fib() + b.fib()
  }

}

class Number5510 : StressfulInteger {

  companion object {
    private var VALUE = 5510
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2755()
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
    val a = Number5509()
    val b = Number5508()
    return a.fib() + b.fib()
  }

}

class Number5511 : StressfulInteger {

  companion object {
    private var VALUE = 5511
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2755()
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
    val a = Number5510()
    val b = Number5509()
    return a.fib() + b.fib()
  }

}

class Number5512 : StressfulInteger {

  companion object {
    private var VALUE = 5512
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2756()
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
    val a = Number5511()
    val b = Number5510()
    return a.fib() + b.fib()
  }

}

class Number5513 : StressfulInteger {

  companion object {
    private var VALUE = 5513
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2756()
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
    val a = Number5512()
    val b = Number5511()
    return a.fib() + b.fib()
  }

}

class Number5514 : StressfulInteger {

  companion object {
    private var VALUE = 5514
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2757()
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
    val a = Number5513()
    val b = Number5512()
    return a.fib() + b.fib()
  }

}

class Number5515 : StressfulInteger {

  companion object {
    private var VALUE = 5515
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2757()
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
    val a = Number5514()
    val b = Number5513()
    return a.fib() + b.fib()
  }

}

class Number5516 : StressfulInteger {

  companion object {
    private var VALUE = 5516
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2758()
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
    val a = Number5515()
    val b = Number5514()
    return a.fib() + b.fib()
  }

}

class Number5517 : StressfulInteger {

  companion object {
    private var VALUE = 5517
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2758()
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
    val a = Number5516()
    val b = Number5515()
    return a.fib() + b.fib()
  }

}

class Number5518 : StressfulInteger {

  companion object {
    private var VALUE = 5518
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2759()
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
    val a = Number5517()
    val b = Number5516()
    return a.fib() + b.fib()
  }

}

class Number5519 : StressfulInteger {

  companion object {
    private var VALUE = 5519
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2759()
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
    val a = Number5518()
    val b = Number5517()
    return a.fib() + b.fib()
  }

}

class Number5520 : StressfulInteger {

  companion object {
    private var VALUE = 5520
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2760()
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
    val a = Number5519()
    val b = Number5518()
    return a.fib() + b.fib()
  }

}

class Number5521 : StressfulInteger {

  companion object {
    private var VALUE = 5521
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2760()
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
    val a = Number5520()
    val b = Number5519()
    return a.fib() + b.fib()
  }

}

class Number5522 : StressfulInteger {

  companion object {
    private var VALUE = 5522
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2761()
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
    val a = Number5521()
    val b = Number5520()
    return a.fib() + b.fib()
  }

}

class Number5523 : StressfulInteger {

  companion object {
    private var VALUE = 5523
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2761()
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
    val a = Number5522()
    val b = Number5521()
    return a.fib() + b.fib()
  }

}

class Number5524 : StressfulInteger {

  companion object {
    private var VALUE = 5524
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2762()
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
    val a = Number5523()
    val b = Number5522()
    return a.fib() + b.fib()
  }

}

class Number5525 : StressfulInteger {

  companion object {
    private var VALUE = 5525
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2762()
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
    val a = Number5524()
    val b = Number5523()
    return a.fib() + b.fib()
  }

}

class Number5526 : StressfulInteger {

  companion object {
    private var VALUE = 5526
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2763()
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
    val a = Number5525()
    val b = Number5524()
    return a.fib() + b.fib()
  }

}

class Number5527 : StressfulInteger {

  companion object {
    private var VALUE = 5527
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2763()
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
    val a = Number5526()
    val b = Number5525()
    return a.fib() + b.fib()
  }

}

class Number5528 : StressfulInteger {

  companion object {
    private var VALUE = 5528
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2764()
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
    val a = Number5527()
    val b = Number5526()
    return a.fib() + b.fib()
  }

}

class Number5529 : StressfulInteger {

  companion object {
    private var VALUE = 5529
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2764()
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
    val a = Number5528()
    val b = Number5527()
    return a.fib() + b.fib()
  }

}

class Number5530 : StressfulInteger {

  companion object {
    private var VALUE = 5530
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2765()
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
    val a = Number5529()
    val b = Number5528()
    return a.fib() + b.fib()
  }

}

class Number5531 : StressfulInteger {

  companion object {
    private var VALUE = 5531
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2765()
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
    val a = Number5530()
    val b = Number5529()
    return a.fib() + b.fib()
  }

}

class Number5532 : StressfulInteger {

  companion object {
    private var VALUE = 5532
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2766()
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
    val a = Number5531()
    val b = Number5530()
    return a.fib() + b.fib()
  }

}

class Number5533 : StressfulInteger {

  companion object {
    private var VALUE = 5533
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2766()
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
    val a = Number5532()
    val b = Number5531()
    return a.fib() + b.fib()
  }

}

class Number5534 : StressfulInteger {

  companion object {
    private var VALUE = 5534
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2767()
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
    val a = Number5533()
    val b = Number5532()
    return a.fib() + b.fib()
  }

}

class Number5535 : StressfulInteger {

  companion object {
    private var VALUE = 5535
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2767()
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
    val a = Number5534()
    val b = Number5533()
    return a.fib() + b.fib()
  }

}

class Number5536 : StressfulInteger {

  companion object {
    private var VALUE = 5536
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2768()
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
    val a = Number5535()
    val b = Number5534()
    return a.fib() + b.fib()
  }

}

class Number5537 : StressfulInteger {

  companion object {
    private var VALUE = 5537
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2768()
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
    val a = Number5536()
    val b = Number5535()
    return a.fib() + b.fib()
  }

}

class Number5538 : StressfulInteger {

  companion object {
    private var VALUE = 5538
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2769()
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
    val a = Number5537()
    val b = Number5536()
    return a.fib() + b.fib()
  }

}

class Number5539 : StressfulInteger {

  companion object {
    private var VALUE = 5539
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2769()
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
    val a = Number5538()
    val b = Number5537()
    return a.fib() + b.fib()
  }

}

class Number5540 : StressfulInteger {

  companion object {
    private var VALUE = 5540
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2770()
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
    val a = Number5539()
    val b = Number5538()
    return a.fib() + b.fib()
  }

}

class Number5541 : StressfulInteger {

  companion object {
    private var VALUE = 5541
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2770()
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
    val a = Number5540()
    val b = Number5539()
    return a.fib() + b.fib()
  }

}

class Number5542 : StressfulInteger {

  companion object {
    private var VALUE = 5542
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2771()
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
    val a = Number5541()
    val b = Number5540()
    return a.fib() + b.fib()
  }

}

class Number5543 : StressfulInteger {

  companion object {
    private var VALUE = 5543
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2771()
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
    val a = Number5542()
    val b = Number5541()
    return a.fib() + b.fib()
  }

}

class Number5544 : StressfulInteger {

  companion object {
    private var VALUE = 5544
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2772()
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
    val a = Number5543()
    val b = Number5542()
    return a.fib() + b.fib()
  }

}

class Number5545 : StressfulInteger {

  companion object {
    private var VALUE = 5545
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2772()
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
    val a = Number5544()
    val b = Number5543()
    return a.fib() + b.fib()
  }

}

class Number5546 : StressfulInteger {

  companion object {
    private var VALUE = 5546
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2773()
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
    val a = Number5545()
    val b = Number5544()
    return a.fib() + b.fib()
  }

}

class Number5547 : StressfulInteger {

  companion object {
    private var VALUE = 5547
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2773()
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
    val a = Number5546()
    val b = Number5545()
    return a.fib() + b.fib()
  }

}

class Number5548 : StressfulInteger {

  companion object {
    private var VALUE = 5548
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2774()
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
    val a = Number5547()
    val b = Number5546()
    return a.fib() + b.fib()
  }

}

class Number5549 : StressfulInteger {

  companion object {
    private var VALUE = 5549
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2774()
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
    val a = Number5548()
    val b = Number5547()
    return a.fib() + b.fib()
  }

}

class Number5550 : StressfulInteger {

  companion object {
    private var VALUE = 5550
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2775()
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
    val a = Number5549()
    val b = Number5548()
    return a.fib() + b.fib()
  }

}

class Number5551 : StressfulInteger {

  companion object {
    private var VALUE = 5551
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2775()
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
    val a = Number5550()
    val b = Number5549()
    return a.fib() + b.fib()
  }

}

class Number5552 : StressfulInteger {

  companion object {
    private var VALUE = 5552
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2776()
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
    val a = Number5551()
    val b = Number5550()
    return a.fib() + b.fib()
  }

}

class Number5553 : StressfulInteger {

  companion object {
    private var VALUE = 5553
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2776()
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
    val a = Number5552()
    val b = Number5551()
    return a.fib() + b.fib()
  }

}

class Number5554 : StressfulInteger {

  companion object {
    private var VALUE = 5554
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2777()
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
    val a = Number5553()
    val b = Number5552()
    return a.fib() + b.fib()
  }

}

class Number5555 : StressfulInteger {

  companion object {
    private var VALUE = 5555
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2777()
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
    val a = Number5554()
    val b = Number5553()
    return a.fib() + b.fib()
  }

}

class Number5556 : StressfulInteger {

  companion object {
    private var VALUE = 5556
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2778()
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
    val a = Number5555()
    val b = Number5554()
    return a.fib() + b.fib()
  }

}

class Number5557 : StressfulInteger {

  companion object {
    private var VALUE = 5557
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2778()
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
    val a = Number5556()
    val b = Number5555()
    return a.fib() + b.fib()
  }

}

class Number5558 : StressfulInteger {

  companion object {
    private var VALUE = 5558
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2779()
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
    val a = Number5557()
    val b = Number5556()
    return a.fib() + b.fib()
  }

}

class Number5559 : StressfulInteger {

  companion object {
    private var VALUE = 5559
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2779()
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
    val a = Number5558()
    val b = Number5557()
    return a.fib() + b.fib()
  }

}

class Number5560 : StressfulInteger {

  companion object {
    private var VALUE = 5560
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2780()
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
    val a = Number5559()
    val b = Number5558()
    return a.fib() + b.fib()
  }

}

class Number5561 : StressfulInteger {

  companion object {
    private var VALUE = 5561
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2780()
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
    val a = Number5560()
    val b = Number5559()
    return a.fib() + b.fib()
  }

}

class Number5562 : StressfulInteger {

  companion object {
    private var VALUE = 5562
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2781()
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
    val a = Number5561()
    val b = Number5560()
    return a.fib() + b.fib()
  }

}

class Number5563 : StressfulInteger {

  companion object {
    private var VALUE = 5563
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2781()
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
    val a = Number5562()
    val b = Number5561()
    return a.fib() + b.fib()
  }

}

class Number5564 : StressfulInteger {

  companion object {
    private var VALUE = 5564
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2782()
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
    val a = Number5563()
    val b = Number5562()
    return a.fib() + b.fib()
  }

}

class Number5565 : StressfulInteger {

  companion object {
    private var VALUE = 5565
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2782()
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
    val a = Number5564()
    val b = Number5563()
    return a.fib() + b.fib()
  }

}

class Number5566 : StressfulInteger {

  companion object {
    private var VALUE = 5566
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2783()
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
    val a = Number5565()
    val b = Number5564()
    return a.fib() + b.fib()
  }

}

class Number5567 : StressfulInteger {

  companion object {
    private var VALUE = 5567
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2783()
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
    val a = Number5566()
    val b = Number5565()
    return a.fib() + b.fib()
  }

}

class Number5568 : StressfulInteger {

  companion object {
    private var VALUE = 5568
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2784()
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
    val a = Number5567()
    val b = Number5566()
    return a.fib() + b.fib()
  }

}

class Number5569 : StressfulInteger {

  companion object {
    private var VALUE = 5569
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2784()
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
    val a = Number5568()
    val b = Number5567()
    return a.fib() + b.fib()
  }

}

class Number5570 : StressfulInteger {

  companion object {
    private var VALUE = 5570
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2785()
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
    val a = Number5569()
    val b = Number5568()
    return a.fib() + b.fib()
  }

}

class Number5571 : StressfulInteger {

  companion object {
    private var VALUE = 5571
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2785()
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
    val a = Number5570()
    val b = Number5569()
    return a.fib() + b.fib()
  }

}

class Number5572 : StressfulInteger {

  companion object {
    private var VALUE = 5572
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2786()
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
    val a = Number5571()
    val b = Number5570()
    return a.fib() + b.fib()
  }

}

class Number5573 : StressfulInteger {

  companion object {
    private var VALUE = 5573
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2786()
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
    val a = Number5572()
    val b = Number5571()
    return a.fib() + b.fib()
  }

}

class Number5574 : StressfulInteger {

  companion object {
    private var VALUE = 5574
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2787()
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
    val a = Number5573()
    val b = Number5572()
    return a.fib() + b.fib()
  }

}

class Number5575 : StressfulInteger {

  companion object {
    private var VALUE = 5575
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2787()
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
    val a = Number5574()
    val b = Number5573()
    return a.fib() + b.fib()
  }

}

class Number5576 : StressfulInteger {

  companion object {
    private var VALUE = 5576
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2788()
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
    val a = Number5575()
    val b = Number5574()
    return a.fib() + b.fib()
  }

}

class Number5577 : StressfulInteger {

  companion object {
    private var VALUE = 5577
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2788()
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
    val a = Number5576()
    val b = Number5575()
    return a.fib() + b.fib()
  }

}

class Number5578 : StressfulInteger {

  companion object {
    private var VALUE = 5578
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2789()
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
    val a = Number5577()
    val b = Number5576()
    return a.fib() + b.fib()
  }

}

class Number5579 : StressfulInteger {

  companion object {
    private var VALUE = 5579
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2789()
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
    val a = Number5578()
    val b = Number5577()
    return a.fib() + b.fib()
  }

}

class Number5580 : StressfulInteger {

  companion object {
    private var VALUE = 5580
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2790()
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
    val a = Number5579()
    val b = Number5578()
    return a.fib() + b.fib()
  }

}

class Number5581 : StressfulInteger {

  companion object {
    private var VALUE = 5581
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2790()
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
    val a = Number5580()
    val b = Number5579()
    return a.fib() + b.fib()
  }

}

class Number5582 : StressfulInteger {

  companion object {
    private var VALUE = 5582
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2791()
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
    val a = Number5581()
    val b = Number5580()
    return a.fib() + b.fib()
  }

}

class Number5583 : StressfulInteger {

  companion object {
    private var VALUE = 5583
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2791()
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
    val a = Number5582()
    val b = Number5581()
    return a.fib() + b.fib()
  }

}

class Number5584 : StressfulInteger {

  companion object {
    private var VALUE = 5584
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2792()
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
    val a = Number5583()
    val b = Number5582()
    return a.fib() + b.fib()
  }

}

class Number5585 : StressfulInteger {

  companion object {
    private var VALUE = 5585
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2792()
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
    val a = Number5584()
    val b = Number5583()
    return a.fib() + b.fib()
  }

}

class Number5586 : StressfulInteger {

  companion object {
    private var VALUE = 5586
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2793()
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
    val a = Number5585()
    val b = Number5584()
    return a.fib() + b.fib()
  }

}

class Number5587 : StressfulInteger {

  companion object {
    private var VALUE = 5587
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2793()
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
    val a = Number5586()
    val b = Number5585()
    return a.fib() + b.fib()
  }

}

class Number5588 : StressfulInteger {

  companion object {
    private var VALUE = 5588
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2794()
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
    val a = Number5587()
    val b = Number5586()
    return a.fib() + b.fib()
  }

}

class Number5589 : StressfulInteger {

  companion object {
    private var VALUE = 5589
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2794()
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
    val a = Number5588()
    val b = Number5587()
    return a.fib() + b.fib()
  }

}

class Number5590 : StressfulInteger {

  companion object {
    private var VALUE = 5590
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2795()
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
    val a = Number5589()
    val b = Number5588()
    return a.fib() + b.fib()
  }

}

class Number5591 : StressfulInteger {

  companion object {
    private var VALUE = 5591
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2795()
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
    val a = Number5590()
    val b = Number5589()
    return a.fib() + b.fib()
  }

}

class Number5592 : StressfulInteger {

  companion object {
    private var VALUE = 5592
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2796()
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
    val a = Number5591()
    val b = Number5590()
    return a.fib() + b.fib()
  }

}

class Number5593 : StressfulInteger {

  companion object {
    private var VALUE = 5593
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2796()
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
    val a = Number5592()
    val b = Number5591()
    return a.fib() + b.fib()
  }

}

class Number5594 : StressfulInteger {

  companion object {
    private var VALUE = 5594
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2797()
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
    val a = Number5593()
    val b = Number5592()
    return a.fib() + b.fib()
  }

}

class Number5595 : StressfulInteger {

  companion object {
    private var VALUE = 5595
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2797()
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
    val a = Number5594()
    val b = Number5593()
    return a.fib() + b.fib()
  }

}

class Number5596 : StressfulInteger {

  companion object {
    private var VALUE = 5596
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2798()
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
    val a = Number5595()
    val b = Number5594()
    return a.fib() + b.fib()
  }

}

class Number5597 : StressfulInteger {

  companion object {
    private var VALUE = 5597
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2798()
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
    val a = Number5596()
    val b = Number5595()
    return a.fib() + b.fib()
  }

}

class Number5598 : StressfulInteger {

  companion object {
    private var VALUE = 5598
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2799()
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
    val a = Number5597()
    val b = Number5596()
    return a.fib() + b.fib()
  }

}

class Number5599 : StressfulInteger {

  companion object {
    private var VALUE = 5599
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2799()
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
    val a = Number5598()
    val b = Number5597()
    return a.fib() + b.fib()
  }

}

class Number5600 : StressfulInteger {

  companion object {
    private var VALUE = 5600
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2800()
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
    val a = Number5599()
    val b = Number5598()
    return a.fib() + b.fib()
  }

}

class Number5601 : StressfulInteger {

  companion object {
    private var VALUE = 5601
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2800()
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
    val a = Number5600()
    val b = Number5599()
    return a.fib() + b.fib()
  }

}

class Number5602 : StressfulInteger {

  companion object {
    private var VALUE = 5602
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2801()
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
    val a = Number5601()
    val b = Number5600()
    return a.fib() + b.fib()
  }

}

class Number5603 : StressfulInteger {

  companion object {
    private var VALUE = 5603
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2801()
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
    val a = Number5602()
    val b = Number5601()
    return a.fib() + b.fib()
  }

}

class Number5604 : StressfulInteger {

  companion object {
    private var VALUE = 5604
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2802()
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
    val a = Number5603()
    val b = Number5602()
    return a.fib() + b.fib()
  }

}

class Number5605 : StressfulInteger {

  companion object {
    private var VALUE = 5605
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2802()
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
    val a = Number5604()
    val b = Number5603()
    return a.fib() + b.fib()
  }

}

class Number5606 : StressfulInteger {

  companion object {
    private var VALUE = 5606
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2803()
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
    val a = Number5605()
    val b = Number5604()
    return a.fib() + b.fib()
  }

}

class Number5607 : StressfulInteger {

  companion object {
    private var VALUE = 5607
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2803()
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
    val a = Number5606()
    val b = Number5605()
    return a.fib() + b.fib()
  }

}

class Number5608 : StressfulInteger {

  companion object {
    private var VALUE = 5608
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2804()
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
    val a = Number5607()
    val b = Number5606()
    return a.fib() + b.fib()
  }

}

class Number5609 : StressfulInteger {

  companion object {
    private var VALUE = 5609
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2804()
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
    val a = Number5608()
    val b = Number5607()
    return a.fib() + b.fib()
  }

}

class Number5610 : StressfulInteger {

  companion object {
    private var VALUE = 5610
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2805()
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
    val a = Number5609()
    val b = Number5608()
    return a.fib() + b.fib()
  }

}

class Number5611 : StressfulInteger {

  companion object {
    private var VALUE = 5611
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2805()
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
    val a = Number5610()
    val b = Number5609()
    return a.fib() + b.fib()
  }

}

class Number5612 : StressfulInteger {

  companion object {
    private var VALUE = 5612
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2806()
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
    val a = Number5611()
    val b = Number5610()
    return a.fib() + b.fib()
  }

}

class Number5613 : StressfulInteger {

  companion object {
    private var VALUE = 5613
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2806()
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
    val a = Number5612()
    val b = Number5611()
    return a.fib() + b.fib()
  }

}

class Number5614 : StressfulInteger {

  companion object {
    private var VALUE = 5614
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2807()
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
    val a = Number5613()
    val b = Number5612()
    return a.fib() + b.fib()
  }

}

class Number5615 : StressfulInteger {

  companion object {
    private var VALUE = 5615
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2807()
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
    val a = Number5614()
    val b = Number5613()
    return a.fib() + b.fib()
  }

}

class Number5616 : StressfulInteger {

  companion object {
    private var VALUE = 5616
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2808()
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
    val a = Number5615()
    val b = Number5614()
    return a.fib() + b.fib()
  }

}

class Number5617 : StressfulInteger {

  companion object {
    private var VALUE = 5617
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2808()
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
    val a = Number5616()
    val b = Number5615()
    return a.fib() + b.fib()
  }

}

class Number5618 : StressfulInteger {

  companion object {
    private var VALUE = 5618
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2809()
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
    val a = Number5617()
    val b = Number5616()
    return a.fib() + b.fib()
  }

}

class Number5619 : StressfulInteger {

  companion object {
    private var VALUE = 5619
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2809()
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
    val a = Number5618()
    val b = Number5617()
    return a.fib() + b.fib()
  }

}

class Number5620 : StressfulInteger {

  companion object {
    private var VALUE = 5620
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2810()
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
    val a = Number5619()
    val b = Number5618()
    return a.fib() + b.fib()
  }

}

class Number5621 : StressfulInteger {

  companion object {
    private var VALUE = 5621
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2810()
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
    val a = Number5620()
    val b = Number5619()
    return a.fib() + b.fib()
  }

}

class Number5622 : StressfulInteger {

  companion object {
    private var VALUE = 5622
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2811()
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
    val a = Number5621()
    val b = Number5620()
    return a.fib() + b.fib()
  }

}

class Number5623 : StressfulInteger {

  companion object {
    private var VALUE = 5623
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2811()
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
    val a = Number5622()
    val b = Number5621()
    return a.fib() + b.fib()
  }

}

class Number5624 : StressfulInteger {

  companion object {
    private var VALUE = 5624
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2812()
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
    val a = Number5623()
    val b = Number5622()
    return a.fib() + b.fib()
  }

}

class Number5625 : StressfulInteger {

  companion object {
    private var VALUE = 5625
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2812()
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
    val a = Number5624()
    val b = Number5623()
    return a.fib() + b.fib()
  }

}

class Number5626 : StressfulInteger {

  companion object {
    private var VALUE = 5626
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2813()
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
    val a = Number5625()
    val b = Number5624()
    return a.fib() + b.fib()
  }

}

class Number5627 : StressfulInteger {

  companion object {
    private var VALUE = 5627
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2813()
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
    val a = Number5626()
    val b = Number5625()
    return a.fib() + b.fib()
  }

}

class Number5628 : StressfulInteger {

  companion object {
    private var VALUE = 5628
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2814()
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
    val a = Number5627()
    val b = Number5626()
    return a.fib() + b.fib()
  }

}

class Number5629 : StressfulInteger {

  companion object {
    private var VALUE = 5629
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2814()
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
    val a = Number5628()
    val b = Number5627()
    return a.fib() + b.fib()
  }

}

class Number5630 : StressfulInteger {

  companion object {
    private var VALUE = 5630
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2815()
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
    val a = Number5629()
    val b = Number5628()
    return a.fib() + b.fib()
  }

}

class Number5631 : StressfulInteger {

  companion object {
    private var VALUE = 5631
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2815()
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
    val a = Number5630()
    val b = Number5629()
    return a.fib() + b.fib()
  }

}

class Number5632 : StressfulInteger {

  companion object {
    private var VALUE = 5632
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2816()
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
    val a = Number5631()
    val b = Number5630()
    return a.fib() + b.fib()
  }

}

class Number5633 : StressfulInteger {

  companion object {
    private var VALUE = 5633
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2816()
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
    val a = Number5632()
    val b = Number5631()
    return a.fib() + b.fib()
  }

}

class Number5634 : StressfulInteger {

  companion object {
    private var VALUE = 5634
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2817()
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
    val a = Number5633()
    val b = Number5632()
    return a.fib() + b.fib()
  }

}

class Number5635 : StressfulInteger {

  companion object {
    private var VALUE = 5635
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2817()
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
    val a = Number5634()
    val b = Number5633()
    return a.fib() + b.fib()
  }

}

class Number5636 : StressfulInteger {

  companion object {
    private var VALUE = 5636
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2818()
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
    val a = Number5635()
    val b = Number5634()
    return a.fib() + b.fib()
  }

}

class Number5637 : StressfulInteger {

  companion object {
    private var VALUE = 5637
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2818()
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
    val a = Number5636()
    val b = Number5635()
    return a.fib() + b.fib()
  }

}

class Number5638 : StressfulInteger {

  companion object {
    private var VALUE = 5638
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2819()
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
    val a = Number5637()
    val b = Number5636()
    return a.fib() + b.fib()
  }

}

class Number5639 : StressfulInteger {

  companion object {
    private var VALUE = 5639
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2819()
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
    val a = Number5638()
    val b = Number5637()
    return a.fib() + b.fib()
  }

}

class Number5640 : StressfulInteger {

  companion object {
    private var VALUE = 5640
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2820()
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
    val a = Number5639()
    val b = Number5638()
    return a.fib() + b.fib()
  }

}

class Number5641 : StressfulInteger {

  companion object {
    private var VALUE = 5641
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2820()
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
    val a = Number5640()
    val b = Number5639()
    return a.fib() + b.fib()
  }

}

class Number5642 : StressfulInteger {

  companion object {
    private var VALUE = 5642
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2821()
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
    val a = Number5641()
    val b = Number5640()
    return a.fib() + b.fib()
  }

}

class Number5643 : StressfulInteger {

  companion object {
    private var VALUE = 5643
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2821()
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
    val a = Number5642()
    val b = Number5641()
    return a.fib() + b.fib()
  }

}

class Number5644 : StressfulInteger {

  companion object {
    private var VALUE = 5644
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2822()
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
    val a = Number5643()
    val b = Number5642()
    return a.fib() + b.fib()
  }

}

class Number5645 : StressfulInteger {

  companion object {
    private var VALUE = 5645
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2822()
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
    val a = Number5644()
    val b = Number5643()
    return a.fib() + b.fib()
  }

}

class Number5646 : StressfulInteger {

  companion object {
    private var VALUE = 5646
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2823()
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
    val a = Number5645()
    val b = Number5644()
    return a.fib() + b.fib()
  }

}

class Number5647 : StressfulInteger {

  companion object {
    private var VALUE = 5647
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2823()
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
    val a = Number5646()
    val b = Number5645()
    return a.fib() + b.fib()
  }

}

class Number5648 : StressfulInteger {

  companion object {
    private var VALUE = 5648
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2824()
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
    val a = Number5647()
    val b = Number5646()
    return a.fib() + b.fib()
  }

}

class Number5649 : StressfulInteger {

  companion object {
    private var VALUE = 5649
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2824()
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
    val a = Number5648()
    val b = Number5647()
    return a.fib() + b.fib()
  }

}

class Number5650 : StressfulInteger {

  companion object {
    private var VALUE = 5650
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2825()
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
    val a = Number5649()
    val b = Number5648()
    return a.fib() + b.fib()
  }

}

class Number5651 : StressfulInteger {

  companion object {
    private var VALUE = 5651
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2825()
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
    val a = Number5650()
    val b = Number5649()
    return a.fib() + b.fib()
  }

}

class Number5652 : StressfulInteger {

  companion object {
    private var VALUE = 5652
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2826()
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
    val a = Number5651()
    val b = Number5650()
    return a.fib() + b.fib()
  }

}

class Number5653 : StressfulInteger {

  companion object {
    private var VALUE = 5653
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2826()
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
    val a = Number5652()
    val b = Number5651()
    return a.fib() + b.fib()
  }

}

class Number5654 : StressfulInteger {

  companion object {
    private var VALUE = 5654
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2827()
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
    val a = Number5653()
    val b = Number5652()
    return a.fib() + b.fib()
  }

}

class Number5655 : StressfulInteger {

  companion object {
    private var VALUE = 5655
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2827()
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
    val a = Number5654()
    val b = Number5653()
    return a.fib() + b.fib()
  }

}

class Number5656 : StressfulInteger {

  companion object {
    private var VALUE = 5656
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2828()
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
    val a = Number5655()
    val b = Number5654()
    return a.fib() + b.fib()
  }

}

class Number5657 : StressfulInteger {

  companion object {
    private var VALUE = 5657
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2828()
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
    val a = Number5656()
    val b = Number5655()
    return a.fib() + b.fib()
  }

}

class Number5658 : StressfulInteger {

  companion object {
    private var VALUE = 5658
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2829()
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
    val a = Number5657()
    val b = Number5656()
    return a.fib() + b.fib()
  }

}

class Number5659 : StressfulInteger {

  companion object {
    private var VALUE = 5659
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2829()
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
    val a = Number5658()
    val b = Number5657()
    return a.fib() + b.fib()
  }

}

class Number5660 : StressfulInteger {

  companion object {
    private var VALUE = 5660
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2830()
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
    val a = Number5659()
    val b = Number5658()
    return a.fib() + b.fib()
  }

}

class Number5661 : StressfulInteger {

  companion object {
    private var VALUE = 5661
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2830()
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
    val a = Number5660()
    val b = Number5659()
    return a.fib() + b.fib()
  }

}

class Number5662 : StressfulInteger {

  companion object {
    private var VALUE = 5662
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2831()
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
    val a = Number5661()
    val b = Number5660()
    return a.fib() + b.fib()
  }

}

class Number5663 : StressfulInteger {

  companion object {
    private var VALUE = 5663
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2831()
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
    val a = Number5662()
    val b = Number5661()
    return a.fib() + b.fib()
  }

}

class Number5664 : StressfulInteger {

  companion object {
    private var VALUE = 5664
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2832()
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
    val a = Number5663()
    val b = Number5662()
    return a.fib() + b.fib()
  }

}

class Number5665 : StressfulInteger {

  companion object {
    private var VALUE = 5665
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2832()
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
    val a = Number5664()
    val b = Number5663()
    return a.fib() + b.fib()
  }

}

class Number5666 : StressfulInteger {

  companion object {
    private var VALUE = 5666
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2833()
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
    val a = Number5665()
    val b = Number5664()
    return a.fib() + b.fib()
  }

}

class Number5667 : StressfulInteger {

  companion object {
    private var VALUE = 5667
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2833()
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
    val a = Number5666()
    val b = Number5665()
    return a.fib() + b.fib()
  }

}

class Number5668 : StressfulInteger {

  companion object {
    private var VALUE = 5668
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2834()
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
    val a = Number5667()
    val b = Number5666()
    return a.fib() + b.fib()
  }

}

class Number5669 : StressfulInteger {

  companion object {
    private var VALUE = 5669
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2834()
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
    val a = Number5668()
    val b = Number5667()
    return a.fib() + b.fib()
  }

}

class Number5670 : StressfulInteger {

  companion object {
    private var VALUE = 5670
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2835()
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
    val a = Number5669()
    val b = Number5668()
    return a.fib() + b.fib()
  }

}

class Number5671 : StressfulInteger {

  companion object {
    private var VALUE = 5671
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2835()
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
    val a = Number5670()
    val b = Number5669()
    return a.fib() + b.fib()
  }

}

class Number5672 : StressfulInteger {

  companion object {
    private var VALUE = 5672
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2836()
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
    val a = Number5671()
    val b = Number5670()
    return a.fib() + b.fib()
  }

}

class Number5673 : StressfulInteger {

  companion object {
    private var VALUE = 5673
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2836()
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
    val a = Number5672()
    val b = Number5671()
    return a.fib() + b.fib()
  }

}

class Number5674 : StressfulInteger {

  companion object {
    private var VALUE = 5674
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2837()
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
    val a = Number5673()
    val b = Number5672()
    return a.fib() + b.fib()
  }

}

class Number5675 : StressfulInteger {

  companion object {
    private var VALUE = 5675
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2837()
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
    val a = Number5674()
    val b = Number5673()
    return a.fib() + b.fib()
  }

}

class Number5676 : StressfulInteger {

  companion object {
    private var VALUE = 5676
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2838()
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
    val a = Number5675()
    val b = Number5674()
    return a.fib() + b.fib()
  }

}

class Number5677 : StressfulInteger {

  companion object {
    private var VALUE = 5677
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2838()
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
    val a = Number5676()
    val b = Number5675()
    return a.fib() + b.fib()
  }

}

class Number5678 : StressfulInteger {

  companion object {
    private var VALUE = 5678
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2839()
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
    val a = Number5677()
    val b = Number5676()
    return a.fib() + b.fib()
  }

}

class Number5679 : StressfulInteger {

  companion object {
    private var VALUE = 5679
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2839()
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
    val a = Number5678()
    val b = Number5677()
    return a.fib() + b.fib()
  }

}

class Number5680 : StressfulInteger {

  companion object {
    private var VALUE = 5680
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2840()
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
    val a = Number5679()
    val b = Number5678()
    return a.fib() + b.fib()
  }

}

class Number5681 : StressfulInteger {

  companion object {
    private var VALUE = 5681
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2840()
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
    val a = Number5680()
    val b = Number5679()
    return a.fib() + b.fib()
  }

}

class Number5682 : StressfulInteger {

  companion object {
    private var VALUE = 5682
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2841()
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
    val a = Number5681()
    val b = Number5680()
    return a.fib() + b.fib()
  }

}

class Number5683 : StressfulInteger {

  companion object {
    private var VALUE = 5683
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2841()
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
    val a = Number5682()
    val b = Number5681()
    return a.fib() + b.fib()
  }

}

class Number5684 : StressfulInteger {

  companion object {
    private var VALUE = 5684
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2842()
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
    val a = Number5683()
    val b = Number5682()
    return a.fib() + b.fib()
  }

}

class Number5685 : StressfulInteger {

  companion object {
    private var VALUE = 5685
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2842()
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
    val a = Number5684()
    val b = Number5683()
    return a.fib() + b.fib()
  }

}

class Number5686 : StressfulInteger {

  companion object {
    private var VALUE = 5686
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2843()
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
    val a = Number5685()
    val b = Number5684()
    return a.fib() + b.fib()
  }

}

class Number5687 : StressfulInteger {

  companion object {
    private var VALUE = 5687
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2843()
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
    val a = Number5686()
    val b = Number5685()
    return a.fib() + b.fib()
  }

}

class Number5688 : StressfulInteger {

  companion object {
    private var VALUE = 5688
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2844()
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
    val a = Number5687()
    val b = Number5686()
    return a.fib() + b.fib()
  }

}

class Number5689 : StressfulInteger {

  companion object {
    private var VALUE = 5689
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2844()
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
    val a = Number5688()
    val b = Number5687()
    return a.fib() + b.fib()
  }

}

class Number5690 : StressfulInteger {

  companion object {
    private var VALUE = 5690
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2845()
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
    val a = Number5689()
    val b = Number5688()
    return a.fib() + b.fib()
  }

}

class Number5691 : StressfulInteger {

  companion object {
    private var VALUE = 5691
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2845()
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
    val a = Number5690()
    val b = Number5689()
    return a.fib() + b.fib()
  }

}

class Number5692 : StressfulInteger {

  companion object {
    private var VALUE = 5692
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2846()
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
    val a = Number5691()
    val b = Number5690()
    return a.fib() + b.fib()
  }

}

class Number5693 : StressfulInteger {

  companion object {
    private var VALUE = 5693
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2846()
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
    val a = Number5692()
    val b = Number5691()
    return a.fib() + b.fib()
  }

}

class Number5694 : StressfulInteger {

  companion object {
    private var VALUE = 5694
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2847()
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
    val a = Number5693()
    val b = Number5692()
    return a.fib() + b.fib()
  }

}

class Number5695 : StressfulInteger {

  companion object {
    private var VALUE = 5695
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2847()
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
    val a = Number5694()
    val b = Number5693()
    return a.fib() + b.fib()
  }

}

class Number5696 : StressfulInteger {

  companion object {
    private var VALUE = 5696
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2848()
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
    val a = Number5695()
    val b = Number5694()
    return a.fib() + b.fib()
  }

}

class Number5697 : StressfulInteger {

  companion object {
    private var VALUE = 5697
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2848()
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
    val a = Number5696()
    val b = Number5695()
    return a.fib() + b.fib()
  }

}

class Number5698 : StressfulInteger {

  companion object {
    private var VALUE = 5698
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2849()
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
    val a = Number5697()
    val b = Number5696()
    return a.fib() + b.fib()
  }

}

class Number5699 : StressfulInteger {

  companion object {
    private var VALUE = 5699
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2849()
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
    val a = Number5698()
    val b = Number5697()
    return a.fib() + b.fib()
  }

}

class Number5700 : StressfulInteger {

  companion object {
    private var VALUE = 5700
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2850()
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
    val a = Number5699()
    val b = Number5698()
    return a.fib() + b.fib()
  }

}

class Number5701 : StressfulInteger {

  companion object {
    private var VALUE = 5701
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2850()
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
    val a = Number5700()
    val b = Number5699()
    return a.fib() + b.fib()
  }

}

class Number5702 : StressfulInteger {

  companion object {
    private var VALUE = 5702
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2851()
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
    val a = Number5701()
    val b = Number5700()
    return a.fib() + b.fib()
  }

}

class Number5703 : StressfulInteger {

  companion object {
    private var VALUE = 5703
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2851()
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
    val a = Number5702()
    val b = Number5701()
    return a.fib() + b.fib()
  }

}

class Number5704 : StressfulInteger {

  companion object {
    private var VALUE = 5704
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2852()
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
    val a = Number5703()
    val b = Number5702()
    return a.fib() + b.fib()
  }

}

class Number5705 : StressfulInteger {

  companion object {
    private var VALUE = 5705
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2852()
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
    val a = Number5704()
    val b = Number5703()
    return a.fib() + b.fib()
  }

}

class Number5706 : StressfulInteger {

  companion object {
    private var VALUE = 5706
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2853()
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
    val a = Number5705()
    val b = Number5704()
    return a.fib() + b.fib()
  }

}

class Number5707 : StressfulInteger {

  companion object {
    private var VALUE = 5707
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2853()
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
    val a = Number5706()
    val b = Number5705()
    return a.fib() + b.fib()
  }

}

class Number5708 : StressfulInteger {

  companion object {
    private var VALUE = 5708
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2854()
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
    val a = Number5707()
    val b = Number5706()
    return a.fib() + b.fib()
  }

}

class Number5709 : StressfulInteger {

  companion object {
    private var VALUE = 5709
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2854()
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
    val a = Number5708()
    val b = Number5707()
    return a.fib() + b.fib()
  }

}

class Number5710 : StressfulInteger {

  companion object {
    private var VALUE = 5710
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2855()
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
    val a = Number5709()
    val b = Number5708()
    return a.fib() + b.fib()
  }

}

class Number5711 : StressfulInteger {

  companion object {
    private var VALUE = 5711
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2855()
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
    val a = Number5710()
    val b = Number5709()
    return a.fib() + b.fib()
  }

}

class Number5712 : StressfulInteger {

  companion object {
    private var VALUE = 5712
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2856()
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
    val a = Number5711()
    val b = Number5710()
    return a.fib() + b.fib()
  }

}

class Number5713 : StressfulInteger {

  companion object {
    private var VALUE = 5713
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2856()
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
    val a = Number5712()
    val b = Number5711()
    return a.fib() + b.fib()
  }

}

class Number5714 : StressfulInteger {

  companion object {
    private var VALUE = 5714
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2857()
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
    val a = Number5713()
    val b = Number5712()
    return a.fib() + b.fib()
  }

}

class Number5715 : StressfulInteger {

  companion object {
    private var VALUE = 5715
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2857()
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
    val a = Number5714()
    val b = Number5713()
    return a.fib() + b.fib()
  }

}

class Number5716 : StressfulInteger {

  companion object {
    private var VALUE = 5716
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2858()
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
    val a = Number5715()
    val b = Number5714()
    return a.fib() + b.fib()
  }

}

class Number5717 : StressfulInteger {

  companion object {
    private var VALUE = 5717
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2858()
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
    val a = Number5716()
    val b = Number5715()
    return a.fib() + b.fib()
  }

}

class Number5718 : StressfulInteger {

  companion object {
    private var VALUE = 5718
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2859()
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
    val a = Number5717()
    val b = Number5716()
    return a.fib() + b.fib()
  }

}

class Number5719 : StressfulInteger {

  companion object {
    private var VALUE = 5719
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2859()
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
    val a = Number5718()
    val b = Number5717()
    return a.fib() + b.fib()
  }

}

class Number5720 : StressfulInteger {

  companion object {
    private var VALUE = 5720
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2860()
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
    val a = Number5719()
    val b = Number5718()
    return a.fib() + b.fib()
  }

}

class Number5721 : StressfulInteger {

  companion object {
    private var VALUE = 5721
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2860()
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
    val a = Number5720()
    val b = Number5719()
    return a.fib() + b.fib()
  }

}

class Number5722 : StressfulInteger {

  companion object {
    private var VALUE = 5722
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2861()
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
    val a = Number5721()
    val b = Number5720()
    return a.fib() + b.fib()
  }

}

class Number5723 : StressfulInteger {

  companion object {
    private var VALUE = 5723
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2861()
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
    val a = Number5722()
    val b = Number5721()
    return a.fib() + b.fib()
  }

}

class Number5724 : StressfulInteger {

  companion object {
    private var VALUE = 5724
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2862()
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
    val a = Number5723()
    val b = Number5722()
    return a.fib() + b.fib()
  }

}

class Number5725 : StressfulInteger {

  companion object {
    private var VALUE = 5725
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2862()
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
    val a = Number5724()
    val b = Number5723()
    return a.fib() + b.fib()
  }

}

class Number5726 : StressfulInteger {

  companion object {
    private var VALUE = 5726
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2863()
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
    val a = Number5725()
    val b = Number5724()
    return a.fib() + b.fib()
  }

}

class Number5727 : StressfulInteger {

  companion object {
    private var VALUE = 5727
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2863()
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
    val a = Number5726()
    val b = Number5725()
    return a.fib() + b.fib()
  }

}

class Number5728 : StressfulInteger {

  companion object {
    private var VALUE = 5728
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2864()
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
    val a = Number5727()
    val b = Number5726()
    return a.fib() + b.fib()
  }

}

class Number5729 : StressfulInteger {

  companion object {
    private var VALUE = 5729
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2864()
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
    val a = Number5728()
    val b = Number5727()
    return a.fib() + b.fib()
  }

}

class Number5730 : StressfulInteger {

  companion object {
    private var VALUE = 5730
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2865()
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
    val a = Number5729()
    val b = Number5728()
    return a.fib() + b.fib()
  }

}

class Number5731 : StressfulInteger {

  companion object {
    private var VALUE = 5731
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2865()
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
    val a = Number5730()
    val b = Number5729()
    return a.fib() + b.fib()
  }

}

class Number5732 : StressfulInteger {

  companion object {
    private var VALUE = 5732
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2866()
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
    val a = Number5731()
    val b = Number5730()
    return a.fib() + b.fib()
  }

}

class Number5733 : StressfulInteger {

  companion object {
    private var VALUE = 5733
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2866()
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
    val a = Number5732()
    val b = Number5731()
    return a.fib() + b.fib()
  }

}

class Number5734 : StressfulInteger {

  companion object {
    private var VALUE = 5734
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2867()
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
    val a = Number5733()
    val b = Number5732()
    return a.fib() + b.fib()
  }

}

class Number5735 : StressfulInteger {

  companion object {
    private var VALUE = 5735
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2867()
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
    val a = Number5734()
    val b = Number5733()
    return a.fib() + b.fib()
  }

}

class Number5736 : StressfulInteger {

  companion object {
    private var VALUE = 5736
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2868()
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
    val a = Number5735()
    val b = Number5734()
    return a.fib() + b.fib()
  }

}

class Number5737 : StressfulInteger {

  companion object {
    private var VALUE = 5737
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2868()
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
    val a = Number5736()
    val b = Number5735()
    return a.fib() + b.fib()
  }

}

class Number5738 : StressfulInteger {

  companion object {
    private var VALUE = 5738
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2869()
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
    val a = Number5737()
    val b = Number5736()
    return a.fib() + b.fib()
  }

}

class Number5739 : StressfulInteger {

  companion object {
    private var VALUE = 5739
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2869()
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
    val a = Number5738()
    val b = Number5737()
    return a.fib() + b.fib()
  }

}

class Number5740 : StressfulInteger {

  companion object {
    private var VALUE = 5740
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2870()
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
    val a = Number5739()
    val b = Number5738()
    return a.fib() + b.fib()
  }

}

class Number5741 : StressfulInteger {

  companion object {
    private var VALUE = 5741
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2870()
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
    val a = Number5740()
    val b = Number5739()
    return a.fib() + b.fib()
  }

}

class Number5742 : StressfulInteger {

  companion object {
    private var VALUE = 5742
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2871()
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
    val a = Number5741()
    val b = Number5740()
    return a.fib() + b.fib()
  }

}

class Number5743 : StressfulInteger {

  companion object {
    private var VALUE = 5743
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2871()
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
    val a = Number5742()
    val b = Number5741()
    return a.fib() + b.fib()
  }

}

class Number5744 : StressfulInteger {

  companion object {
    private var VALUE = 5744
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2872()
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
    val a = Number5743()
    val b = Number5742()
    return a.fib() + b.fib()
  }

}

class Number5745 : StressfulInteger {

  companion object {
    private var VALUE = 5745
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2872()
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
    val a = Number5744()
    val b = Number5743()
    return a.fib() + b.fib()
  }

}

class Number5746 : StressfulInteger {

  companion object {
    private var VALUE = 5746
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2873()
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
    val a = Number5745()
    val b = Number5744()
    return a.fib() + b.fib()
  }

}

class Number5747 : StressfulInteger {

  companion object {
    private var VALUE = 5747
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2873()
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
    val a = Number5746()
    val b = Number5745()
    return a.fib() + b.fib()
  }

}

class Number5748 : StressfulInteger {

  companion object {
    private var VALUE = 5748
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2874()
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
    val a = Number5747()
    val b = Number5746()
    return a.fib() + b.fib()
  }

}

class Number5749 : StressfulInteger {

  companion object {
    private var VALUE = 5749
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2874()
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
    val a = Number5748()
    val b = Number5747()
    return a.fib() + b.fib()
  }

}

class Number5750 : StressfulInteger {

  companion object {
    private var VALUE = 5750
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2875()
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
    val a = Number5749()
    val b = Number5748()
    return a.fib() + b.fib()
  }

}

class Number5751 : StressfulInteger {

  companion object {
    private var VALUE = 5751
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2875()
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
    val a = Number5750()
    val b = Number5749()
    return a.fib() + b.fib()
  }

}

class Number5752 : StressfulInteger {

  companion object {
    private var VALUE = 5752
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2876()
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
    val a = Number5751()
    val b = Number5750()
    return a.fib() + b.fib()
  }

}

class Number5753 : StressfulInteger {

  companion object {
    private var VALUE = 5753
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2876()
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
    val a = Number5752()
    val b = Number5751()
    return a.fib() + b.fib()
  }

}

class Number5754 : StressfulInteger {

  companion object {
    private var VALUE = 5754
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2877()
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
    val a = Number5753()
    val b = Number5752()
    return a.fib() + b.fib()
  }

}

class Number5755 : StressfulInteger {

  companion object {
    private var VALUE = 5755
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2877()
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
    val a = Number5754()
    val b = Number5753()
    return a.fib() + b.fib()
  }

}

class Number5756 : StressfulInteger {

  companion object {
    private var VALUE = 5756
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2878()
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
    val a = Number5755()
    val b = Number5754()
    return a.fib() + b.fib()
  }

}

class Number5757 : StressfulInteger {

  companion object {
    private var VALUE = 5757
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2878()
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
    val a = Number5756()
    val b = Number5755()
    return a.fib() + b.fib()
  }

}

class Number5758 : StressfulInteger {

  companion object {
    private var VALUE = 5758
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2879()
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
    val a = Number5757()
    val b = Number5756()
    return a.fib() + b.fib()
  }

}

class Number5759 : StressfulInteger {

  companion object {
    private var VALUE = 5759
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2879()
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
    val a = Number5758()
    val b = Number5757()
    return a.fib() + b.fib()
  }

}

class Number5760 : StressfulInteger {

  companion object {
    private var VALUE = 5760
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2880()
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
    val a = Number5759()
    val b = Number5758()
    return a.fib() + b.fib()
  }

}

class Number5761 : StressfulInteger {

  companion object {
    private var VALUE = 5761
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2880()
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
    val a = Number5760()
    val b = Number5759()
    return a.fib() + b.fib()
  }

}

class Number5762 : StressfulInteger {

  companion object {
    private var VALUE = 5762
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2881()
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
    val a = Number5761()
    val b = Number5760()
    return a.fib() + b.fib()
  }

}

class Number5763 : StressfulInteger {

  companion object {
    private var VALUE = 5763
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2881()
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
    val a = Number5762()
    val b = Number5761()
    return a.fib() + b.fib()
  }

}

class Number5764 : StressfulInteger {

  companion object {
    private var VALUE = 5764
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2882()
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
    val a = Number5763()
    val b = Number5762()
    return a.fib() + b.fib()
  }

}

class Number5765 : StressfulInteger {

  companion object {
    private var VALUE = 5765
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2882()
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
    val a = Number5764()
    val b = Number5763()
    return a.fib() + b.fib()
  }

}

class Number5766 : StressfulInteger {

  companion object {
    private var VALUE = 5766
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2883()
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
    val a = Number5765()
    val b = Number5764()
    return a.fib() + b.fib()
  }

}

class Number5767 : StressfulInteger {

  companion object {
    private var VALUE = 5767
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2883()
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
    val a = Number5766()
    val b = Number5765()
    return a.fib() + b.fib()
  }

}

class Number5768 : StressfulInteger {

  companion object {
    private var VALUE = 5768
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2884()
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
    val a = Number5767()
    val b = Number5766()
    return a.fib() + b.fib()
  }

}

class Number5769 : StressfulInteger {

  companion object {
    private var VALUE = 5769
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2884()
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
    val a = Number5768()
    val b = Number5767()
    return a.fib() + b.fib()
  }

}

class Number5770 : StressfulInteger {

  companion object {
    private var VALUE = 5770
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2885()
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
    val a = Number5769()
    val b = Number5768()
    return a.fib() + b.fib()
  }

}

class Number5771 : StressfulInteger {

  companion object {
    private var VALUE = 5771
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2885()
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
    val a = Number5770()
    val b = Number5769()
    return a.fib() + b.fib()
  }

}

class Number5772 : StressfulInteger {

  companion object {
    private var VALUE = 5772
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2886()
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
    val a = Number5771()
    val b = Number5770()
    return a.fib() + b.fib()
  }

}

class Number5773 : StressfulInteger {

  companion object {
    private var VALUE = 5773
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2886()
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
    val a = Number5772()
    val b = Number5771()
    return a.fib() + b.fib()
  }

}

class Number5774 : StressfulInteger {

  companion object {
    private var VALUE = 5774
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2887()
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
    val a = Number5773()
    val b = Number5772()
    return a.fib() + b.fib()
  }

}

class Number5775 : StressfulInteger {

  companion object {
    private var VALUE = 5775
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2887()
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
    val a = Number5774()
    val b = Number5773()
    return a.fib() + b.fib()
  }

}

class Number5776 : StressfulInteger {

  companion object {
    private var VALUE = 5776
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2888()
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
    val a = Number5775()
    val b = Number5774()
    return a.fib() + b.fib()
  }

}

class Number5777 : StressfulInteger {

  companion object {
    private var VALUE = 5777
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2888()
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
    val a = Number5776()
    val b = Number5775()
    return a.fib() + b.fib()
  }

}

class Number5778 : StressfulInteger {

  companion object {
    private var VALUE = 5778
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2889()
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
    val a = Number5777()
    val b = Number5776()
    return a.fib() + b.fib()
  }

}

class Number5779 : StressfulInteger {

  companion object {
    private var VALUE = 5779
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2889()
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
    val a = Number5778()
    val b = Number5777()
    return a.fib() + b.fib()
  }

}

class Number5780 : StressfulInteger {

  companion object {
    private var VALUE = 5780
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2890()
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
    val a = Number5779()
    val b = Number5778()
    return a.fib() + b.fib()
  }

}

class Number5781 : StressfulInteger {

  companion object {
    private var VALUE = 5781
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2890()
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
    val a = Number5780()
    val b = Number5779()
    return a.fib() + b.fib()
  }

}

class Number5782 : StressfulInteger {

  companion object {
    private var VALUE = 5782
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2891()
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
    val a = Number5781()
    val b = Number5780()
    return a.fib() + b.fib()
  }

}

class Number5783 : StressfulInteger {

  companion object {
    private var VALUE = 5783
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2891()
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
    val a = Number5782()
    val b = Number5781()
    return a.fib() + b.fib()
  }

}

class Number5784 : StressfulInteger {

  companion object {
    private var VALUE = 5784
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2892()
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
    val a = Number5783()
    val b = Number5782()
    return a.fib() + b.fib()
  }

}

class Number5785 : StressfulInteger {

  companion object {
    private var VALUE = 5785
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2892()
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
    val a = Number5784()
    val b = Number5783()
    return a.fib() + b.fib()
  }

}

class Number5786 : StressfulInteger {

  companion object {
    private var VALUE = 5786
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2893()
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
    val a = Number5785()
    val b = Number5784()
    return a.fib() + b.fib()
  }

}

class Number5787 : StressfulInteger {

  companion object {
    private var VALUE = 5787
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2893()
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
    val a = Number5786()
    val b = Number5785()
    return a.fib() + b.fib()
  }

}

class Number5788 : StressfulInteger {

  companion object {
    private var VALUE = 5788
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2894()
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
    val a = Number5787()
    val b = Number5786()
    return a.fib() + b.fib()
  }

}

class Number5789 : StressfulInteger {

  companion object {
    private var VALUE = 5789
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2894()
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
    val a = Number5788()
    val b = Number5787()
    return a.fib() + b.fib()
  }

}

class Number5790 : StressfulInteger {

  companion object {
    private var VALUE = 5790
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2895()
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
    val a = Number5789()
    val b = Number5788()
    return a.fib() + b.fib()
  }

}

class Number5791 : StressfulInteger {

  companion object {
    private var VALUE = 5791
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2895()
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
    val a = Number5790()
    val b = Number5789()
    return a.fib() + b.fib()
  }

}

class Number5792 : StressfulInteger {

  companion object {
    private var VALUE = 5792
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2896()
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
    val a = Number5791()
    val b = Number5790()
    return a.fib() + b.fib()
  }

}

class Number5793 : StressfulInteger {

  companion object {
    private var VALUE = 5793
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2896()
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
    val a = Number5792()
    val b = Number5791()
    return a.fib() + b.fib()
  }

}

class Number5794 : StressfulInteger {

  companion object {
    private var VALUE = 5794
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2897()
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
    val a = Number5793()
    val b = Number5792()
    return a.fib() + b.fib()
  }

}

class Number5795 : StressfulInteger {

  companion object {
    private var VALUE = 5795
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2897()
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
    val a = Number5794()
    val b = Number5793()
    return a.fib() + b.fib()
  }

}

class Number5796 : StressfulInteger {

  companion object {
    private var VALUE = 5796
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2898()
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
    val a = Number5795()
    val b = Number5794()
    return a.fib() + b.fib()
  }

}

class Number5797 : StressfulInteger {

  companion object {
    private var VALUE = 5797
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2898()
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
    val a = Number5796()
    val b = Number5795()
    return a.fib() + b.fib()
  }

}

class Number5798 : StressfulInteger {

  companion object {
    private var VALUE = 5798
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2899()
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
    val a = Number5797()
    val b = Number5796()
    return a.fib() + b.fib()
  }

}

class Number5799 : StressfulInteger {

  companion object {
    private var VALUE = 5799
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2899()
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
    val a = Number5798()
    val b = Number5797()
    return a.fib() + b.fib()
  }

}

class Number5800 : StressfulInteger {

  companion object {
    private var VALUE = 5800
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2900()
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
    val a = Number5799()
    val b = Number5798()
    return a.fib() + b.fib()
  }

}

class Number5801 : StressfulInteger {

  companion object {
    private var VALUE = 5801
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2900()
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
    val a = Number5800()
    val b = Number5799()
    return a.fib() + b.fib()
  }

}

class Number5802 : StressfulInteger {

  companion object {
    private var VALUE = 5802
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2901()
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
    val a = Number5801()
    val b = Number5800()
    return a.fib() + b.fib()
  }

}

class Number5803 : StressfulInteger {

  companion object {
    private var VALUE = 5803
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2901()
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
    val a = Number5802()
    val b = Number5801()
    return a.fib() + b.fib()
  }

}

class Number5804 : StressfulInteger {

  companion object {
    private var VALUE = 5804
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2902()
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
    val a = Number5803()
    val b = Number5802()
    return a.fib() + b.fib()
  }

}

class Number5805 : StressfulInteger {

  companion object {
    private var VALUE = 5805
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2902()
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
    val a = Number5804()
    val b = Number5803()
    return a.fib() + b.fib()
  }

}

class Number5806 : StressfulInteger {

  companion object {
    private var VALUE = 5806
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2903()
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
    val a = Number5805()
    val b = Number5804()
    return a.fib() + b.fib()
  }

}

class Number5807 : StressfulInteger {

  companion object {
    private var VALUE = 5807
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2903()
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
    val a = Number5806()
    val b = Number5805()
    return a.fib() + b.fib()
  }

}

class Number5808 : StressfulInteger {

  companion object {
    private var VALUE = 5808
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2904()
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
    val a = Number5807()
    val b = Number5806()
    return a.fib() + b.fib()
  }

}

class Number5809 : StressfulInteger {

  companion object {
    private var VALUE = 5809
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2904()
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
    val a = Number5808()
    val b = Number5807()
    return a.fib() + b.fib()
  }

}

class Number5810 : StressfulInteger {

  companion object {
    private var VALUE = 5810
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2905()
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
    val a = Number5809()
    val b = Number5808()
    return a.fib() + b.fib()
  }

}

class Number5811 : StressfulInteger {

  companion object {
    private var VALUE = 5811
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2905()
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
    val a = Number5810()
    val b = Number5809()
    return a.fib() + b.fib()
  }

}

class Number5812 : StressfulInteger {

  companion object {
    private var VALUE = 5812
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2906()
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
    val a = Number5811()
    val b = Number5810()
    return a.fib() + b.fib()
  }

}

class Number5813 : StressfulInteger {

  companion object {
    private var VALUE = 5813
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2906()
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
    val a = Number5812()
    val b = Number5811()
    return a.fib() + b.fib()
  }

}

class Number5814 : StressfulInteger {

  companion object {
    private var VALUE = 5814
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2907()
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
    val a = Number5813()
    val b = Number5812()
    return a.fib() + b.fib()
  }

}

class Number5815 : StressfulInteger {

  companion object {
    private var VALUE = 5815
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2907()
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
    val a = Number5814()
    val b = Number5813()
    return a.fib() + b.fib()
  }

}

class Number5816 : StressfulInteger {

  companion object {
    private var VALUE = 5816
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2908()
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
    val a = Number5815()
    val b = Number5814()
    return a.fib() + b.fib()
  }

}

class Number5817 : StressfulInteger {

  companion object {
    private var VALUE = 5817
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2908()
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
    val a = Number5816()
    val b = Number5815()
    return a.fib() + b.fib()
  }

}

class Number5818 : StressfulInteger {

  companion object {
    private var VALUE = 5818
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2909()
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
    val a = Number5817()
    val b = Number5816()
    return a.fib() + b.fib()
  }

}

class Number5819 : StressfulInteger {

  companion object {
    private var VALUE = 5819
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2909()
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
    val a = Number5818()
    val b = Number5817()
    return a.fib() + b.fib()
  }

}

class Number5820 : StressfulInteger {

  companion object {
    private var VALUE = 5820
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2910()
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
    val a = Number5819()
    val b = Number5818()
    return a.fib() + b.fib()
  }

}

class Number5821 : StressfulInteger {

  companion object {
    private var VALUE = 5821
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2910()
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
    val a = Number5820()
    val b = Number5819()
    return a.fib() + b.fib()
  }

}

class Number5822 : StressfulInteger {

  companion object {
    private var VALUE = 5822
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2911()
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
    val a = Number5821()
    val b = Number5820()
    return a.fib() + b.fib()
  }

}

class Number5823 : StressfulInteger {

  companion object {
    private var VALUE = 5823
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2911()
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
    val a = Number5822()
    val b = Number5821()
    return a.fib() + b.fib()
  }

}

class Number5824 : StressfulInteger {

  companion object {
    private var VALUE = 5824
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2912()
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
    val a = Number5823()
    val b = Number5822()
    return a.fib() + b.fib()
  }

}

class Number5825 : StressfulInteger {

  companion object {
    private var VALUE = 5825
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2912()
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
    val a = Number5824()
    val b = Number5823()
    return a.fib() + b.fib()
  }

}

class Number5826 : StressfulInteger {

  companion object {
    private var VALUE = 5826
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2913()
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
    val a = Number5825()
    val b = Number5824()
    return a.fib() + b.fib()
  }

}

class Number5827 : StressfulInteger {

  companion object {
    private var VALUE = 5827
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2913()
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
    val a = Number5826()
    val b = Number5825()
    return a.fib() + b.fib()
  }

}

class Number5828 : StressfulInteger {

  companion object {
    private var VALUE = 5828
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2914()
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
    val a = Number5827()
    val b = Number5826()
    return a.fib() + b.fib()
  }

}

class Number5829 : StressfulInteger {

  companion object {
    private var VALUE = 5829
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2914()
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
    val a = Number5828()
    val b = Number5827()
    return a.fib() + b.fib()
  }

}

class Number5830 : StressfulInteger {

  companion object {
    private var VALUE = 5830
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2915()
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
    val a = Number5829()
    val b = Number5828()
    return a.fib() + b.fib()
  }

}

class Number5831 : StressfulInteger {

  companion object {
    private var VALUE = 5831
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2915()
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
    val a = Number5830()
    val b = Number5829()
    return a.fib() + b.fib()
  }

}

class Number5832 : StressfulInteger {

  companion object {
    private var VALUE = 5832
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2916()
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
    val a = Number5831()
    val b = Number5830()
    return a.fib() + b.fib()
  }

}

class Number5833 : StressfulInteger {

  companion object {
    private var VALUE = 5833
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2916()
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
    val a = Number5832()
    val b = Number5831()
    return a.fib() + b.fib()
  }

}

class Number5834 : StressfulInteger {

  companion object {
    private var VALUE = 5834
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2917()
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
    val a = Number5833()
    val b = Number5832()
    return a.fib() + b.fib()
  }

}

class Number5835 : StressfulInteger {

  companion object {
    private var VALUE = 5835
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2917()
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
    val a = Number5834()
    val b = Number5833()
    return a.fib() + b.fib()
  }

}

class Number5836 : StressfulInteger {

  companion object {
    private var VALUE = 5836
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2918()
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
    val a = Number5835()
    val b = Number5834()
    return a.fib() + b.fib()
  }

}

class Number5837 : StressfulInteger {

  companion object {
    private var VALUE = 5837
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2918()
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
    val a = Number5836()
    val b = Number5835()
    return a.fib() + b.fib()
  }

}

class Number5838 : StressfulInteger {

  companion object {
    private var VALUE = 5838
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2919()
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
    val a = Number5837()
    val b = Number5836()
    return a.fib() + b.fib()
  }

}

class Number5839 : StressfulInteger {

  companion object {
    private var VALUE = 5839
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2919()
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
    val a = Number5838()
    val b = Number5837()
    return a.fib() + b.fib()
  }

}

class Number5840 : StressfulInteger {

  companion object {
    private var VALUE = 5840
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2920()
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
    val a = Number5839()
    val b = Number5838()
    return a.fib() + b.fib()
  }

}

class Number5841 : StressfulInteger {

  companion object {
    private var VALUE = 5841
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2920()
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
    val a = Number5840()
    val b = Number5839()
    return a.fib() + b.fib()
  }

}

class Number5842 : StressfulInteger {

  companion object {
    private var VALUE = 5842
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2921()
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
    val a = Number5841()
    val b = Number5840()
    return a.fib() + b.fib()
  }

}

class Number5843 : StressfulInteger {

  companion object {
    private var VALUE = 5843
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2921()
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
    val a = Number5842()
    val b = Number5841()
    return a.fib() + b.fib()
  }

}

class Number5844 : StressfulInteger {

  companion object {
    private var VALUE = 5844
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2922()
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
    val a = Number5843()
    val b = Number5842()
    return a.fib() + b.fib()
  }

}

class Number5845 : StressfulInteger {

  companion object {
    private var VALUE = 5845
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2922()
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
    val a = Number5844()
    val b = Number5843()
    return a.fib() + b.fib()
  }

}

class Number5846 : StressfulInteger {

  companion object {
    private var VALUE = 5846
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2923()
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
    val a = Number5845()
    val b = Number5844()
    return a.fib() + b.fib()
  }

}

class Number5847 : StressfulInteger {

  companion object {
    private var VALUE = 5847
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2923()
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
    val a = Number5846()
    val b = Number5845()
    return a.fib() + b.fib()
  }

}

class Number5848 : StressfulInteger {

  companion object {
    private var VALUE = 5848
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2924()
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
    val a = Number5847()
    val b = Number5846()
    return a.fib() + b.fib()
  }

}

class Number5849 : StressfulInteger {

  companion object {
    private var VALUE = 5849
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2924()
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
    val a = Number5848()
    val b = Number5847()
    return a.fib() + b.fib()
  }

}

class Number5850 : StressfulInteger {

  companion object {
    private var VALUE = 5850
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2925()
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
    val a = Number5849()
    val b = Number5848()
    return a.fib() + b.fib()
  }

}

class Number5851 : StressfulInteger {

  companion object {
    private var VALUE = 5851
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2925()
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
    val a = Number5850()
    val b = Number5849()
    return a.fib() + b.fib()
  }

}

class Number5852 : StressfulInteger {

  companion object {
    private var VALUE = 5852
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2926()
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
    val a = Number5851()
    val b = Number5850()
    return a.fib() + b.fib()
  }

}

class Number5853 : StressfulInteger {

  companion object {
    private var VALUE = 5853
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2926()
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
    val a = Number5852()
    val b = Number5851()
    return a.fib() + b.fib()
  }

}

class Number5854 : StressfulInteger {

  companion object {
    private var VALUE = 5854
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2927()
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
    val a = Number5853()
    val b = Number5852()
    return a.fib() + b.fib()
  }

}

class Number5855 : StressfulInteger {

  companion object {
    private var VALUE = 5855
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2927()
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
    val a = Number5854()
    val b = Number5853()
    return a.fib() + b.fib()
  }

}

class Number5856 : StressfulInteger {

  companion object {
    private var VALUE = 5856
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2928()
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
    val a = Number5855()
    val b = Number5854()
    return a.fib() + b.fib()
  }

}

class Number5857 : StressfulInteger {

  companion object {
    private var VALUE = 5857
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2928()
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
    val a = Number5856()
    val b = Number5855()
    return a.fib() + b.fib()
  }

}

class Number5858 : StressfulInteger {

  companion object {
    private var VALUE = 5858
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2929()
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
    val a = Number5857()
    val b = Number5856()
    return a.fib() + b.fib()
  }

}

class Number5859 : StressfulInteger {

  companion object {
    private var VALUE = 5859
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2929()
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
    val a = Number5858()
    val b = Number5857()
    return a.fib() + b.fib()
  }

}

class Number5860 : StressfulInteger {

  companion object {
    private var VALUE = 5860
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2930()
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
    val a = Number5859()
    val b = Number5858()
    return a.fib() + b.fib()
  }

}

class Number5861 : StressfulInteger {

  companion object {
    private var VALUE = 5861
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2930()
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
    val a = Number5860()
    val b = Number5859()
    return a.fib() + b.fib()
  }

}

class Number5862 : StressfulInteger {

  companion object {
    private var VALUE = 5862
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2931()
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
    val a = Number5861()
    val b = Number5860()
    return a.fib() + b.fib()
  }

}

class Number5863 : StressfulInteger {

  companion object {
    private var VALUE = 5863
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2931()
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
    val a = Number5862()
    val b = Number5861()
    return a.fib() + b.fib()
  }

}

class Number5864 : StressfulInteger {

  companion object {
    private var VALUE = 5864
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2932()
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
    val a = Number5863()
    val b = Number5862()
    return a.fib() + b.fib()
  }

}

class Number5865 : StressfulInteger {

  companion object {
    private var VALUE = 5865
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2932()
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
    val a = Number5864()
    val b = Number5863()
    return a.fib() + b.fib()
  }

}

class Number5866 : StressfulInteger {

  companion object {
    private var VALUE = 5866
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2933()
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
    val a = Number5865()
    val b = Number5864()
    return a.fib() + b.fib()
  }

}

class Number5867 : StressfulInteger {

  companion object {
    private var VALUE = 5867
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2933()
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
    val a = Number5866()
    val b = Number5865()
    return a.fib() + b.fib()
  }

}

class Number5868 : StressfulInteger {

  companion object {
    private var VALUE = 5868
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2934()
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
    val a = Number5867()
    val b = Number5866()
    return a.fib() + b.fib()
  }

}

class Number5869 : StressfulInteger {

  companion object {
    private var VALUE = 5869
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2934()
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
    val a = Number5868()
    val b = Number5867()
    return a.fib() + b.fib()
  }

}

class Number5870 : StressfulInteger {

  companion object {
    private var VALUE = 5870
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2935()
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
    val a = Number5869()
    val b = Number5868()
    return a.fib() + b.fib()
  }

}

class Number5871 : StressfulInteger {

  companion object {
    private var VALUE = 5871
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2935()
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
    val a = Number5870()
    val b = Number5869()
    return a.fib() + b.fib()
  }

}

class Number5872 : StressfulInteger {

  companion object {
    private var VALUE = 5872
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2936()
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
    val a = Number5871()
    val b = Number5870()
    return a.fib() + b.fib()
  }

}

class Number5873 : StressfulInteger {

  companion object {
    private var VALUE = 5873
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2936()
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
    val a = Number5872()
    val b = Number5871()
    return a.fib() + b.fib()
  }

}

class Number5874 : StressfulInteger {

  companion object {
    private var VALUE = 5874
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2937()
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
    val a = Number5873()
    val b = Number5872()
    return a.fib() + b.fib()
  }

}

class Number5875 : StressfulInteger {

  companion object {
    private var VALUE = 5875
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2937()
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
    val a = Number5874()
    val b = Number5873()
    return a.fib() + b.fib()
  }

}

class Number5876 : StressfulInteger {

  companion object {
    private var VALUE = 5876
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2938()
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
    val a = Number5875()
    val b = Number5874()
    return a.fib() + b.fib()
  }

}

class Number5877 : StressfulInteger {

  companion object {
    private var VALUE = 5877
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2938()
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
    val a = Number5876()
    val b = Number5875()
    return a.fib() + b.fib()
  }

}

class Number5878 : StressfulInteger {

  companion object {
    private var VALUE = 5878
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2939()
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
    val a = Number5877()
    val b = Number5876()
    return a.fib() + b.fib()
  }

}

class Number5879 : StressfulInteger {

  companion object {
    private var VALUE = 5879
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2939()
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
    val a = Number5878()
    val b = Number5877()
    return a.fib() + b.fib()
  }

}

class Number5880 : StressfulInteger {

  companion object {
    private var VALUE = 5880
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2940()
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
    val a = Number5879()
    val b = Number5878()
    return a.fib() + b.fib()
  }

}

class Number5881 : StressfulInteger {

  companion object {
    private var VALUE = 5881
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2940()
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
    val a = Number5880()
    val b = Number5879()
    return a.fib() + b.fib()
  }

}

class Number5882 : StressfulInteger {

  companion object {
    private var VALUE = 5882
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2941()
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
    val a = Number5881()
    val b = Number5880()
    return a.fib() + b.fib()
  }

}

class Number5883 : StressfulInteger {

  companion object {
    private var VALUE = 5883
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2941()
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
    val a = Number5882()
    val b = Number5881()
    return a.fib() + b.fib()
  }

}

class Number5884 : StressfulInteger {

  companion object {
    private var VALUE = 5884
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2942()
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
    val a = Number5883()
    val b = Number5882()
    return a.fib() + b.fib()
  }

}

class Number5885 : StressfulInteger {

  companion object {
    private var VALUE = 5885
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2942()
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
    val a = Number5884()
    val b = Number5883()
    return a.fib() + b.fib()
  }

}

class Number5886 : StressfulInteger {

  companion object {
    private var VALUE = 5886
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2943()
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
    val a = Number5885()
    val b = Number5884()
    return a.fib() + b.fib()
  }

}

class Number5887 : StressfulInteger {

  companion object {
    private var VALUE = 5887
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2943()
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
    val a = Number5886()
    val b = Number5885()
    return a.fib() + b.fib()
  }

}

class Number5888 : StressfulInteger {

  companion object {
    private var VALUE = 5888
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2944()
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
    val a = Number5887()
    val b = Number5886()
    return a.fib() + b.fib()
  }

}

class Number5889 : StressfulInteger {

  companion object {
    private var VALUE = 5889
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2944()
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
    val a = Number5888()
    val b = Number5887()
    return a.fib() + b.fib()
  }

}

class Number5890 : StressfulInteger {

  companion object {
    private var VALUE = 5890
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2945()
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
    val a = Number5889()
    val b = Number5888()
    return a.fib() + b.fib()
  }

}

class Number5891 : StressfulInteger {

  companion object {
    private var VALUE = 5891
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2945()
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
    val a = Number5890()
    val b = Number5889()
    return a.fib() + b.fib()
  }

}

class Number5892 : StressfulInteger {

  companion object {
    private var VALUE = 5892
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2946()
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
    val a = Number5891()
    val b = Number5890()
    return a.fib() + b.fib()
  }

}

class Number5893 : StressfulInteger {

  companion object {
    private var VALUE = 5893
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2946()
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
    val a = Number5892()
    val b = Number5891()
    return a.fib() + b.fib()
  }

}

class Number5894 : StressfulInteger {

  companion object {
    private var VALUE = 5894
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2947()
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
    val a = Number5893()
    val b = Number5892()
    return a.fib() + b.fib()
  }

}

class Number5895 : StressfulInteger {

  companion object {
    private var VALUE = 5895
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2947()
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
    val a = Number5894()
    val b = Number5893()
    return a.fib() + b.fib()
  }

}

class Number5896 : StressfulInteger {

  companion object {
    private var VALUE = 5896
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2948()
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
    val a = Number5895()
    val b = Number5894()
    return a.fib() + b.fib()
  }

}

class Number5897 : StressfulInteger {

  companion object {
    private var VALUE = 5897
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2948()
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
    val a = Number5896()
    val b = Number5895()
    return a.fib() + b.fib()
  }

}

class Number5898 : StressfulInteger {

  companion object {
    private var VALUE = 5898
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2949()
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
    val a = Number5897()
    val b = Number5896()
    return a.fib() + b.fib()
  }

}

class Number5899 : StressfulInteger {

  companion object {
    private var VALUE = 5899
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2949()
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
    val a = Number5898()
    val b = Number5897()
    return a.fib() + b.fib()
  }

}

class Number5900 : StressfulInteger {

  companion object {
    private var VALUE = 5900
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2950()
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
    val a = Number5899()
    val b = Number5898()
    return a.fib() + b.fib()
  }

}

class Number5901 : StressfulInteger {

  companion object {
    private var VALUE = 5901
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2950()
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
    val a = Number5900()
    val b = Number5899()
    return a.fib() + b.fib()
  }

}

class Number5902 : StressfulInteger {

  companion object {
    private var VALUE = 5902
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2951()
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
    val a = Number5901()
    val b = Number5900()
    return a.fib() + b.fib()
  }

}

class Number5903 : StressfulInteger {

  companion object {
    private var VALUE = 5903
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2951()
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
    val a = Number5902()
    val b = Number5901()
    return a.fib() + b.fib()
  }

}

class Number5904 : StressfulInteger {

  companion object {
    private var VALUE = 5904
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2952()
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
    val a = Number5903()
    val b = Number5902()
    return a.fib() + b.fib()
  }

}

class Number5905 : StressfulInteger {

  companion object {
    private var VALUE = 5905
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2952()
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
    val a = Number5904()
    val b = Number5903()
    return a.fib() + b.fib()
  }

}

class Number5906 : StressfulInteger {

  companion object {
    private var VALUE = 5906
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2953()
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
    val a = Number5905()
    val b = Number5904()
    return a.fib() + b.fib()
  }

}

class Number5907 : StressfulInteger {

  companion object {
    private var VALUE = 5907
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2953()
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
    val a = Number5906()
    val b = Number5905()
    return a.fib() + b.fib()
  }

}

class Number5908 : StressfulInteger {

  companion object {
    private var VALUE = 5908
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2954()
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
    val a = Number5907()
    val b = Number5906()
    return a.fib() + b.fib()
  }

}

class Number5909 : StressfulInteger {

  companion object {
    private var VALUE = 5909
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2954()
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
    val a = Number5908()
    val b = Number5907()
    return a.fib() + b.fib()
  }

}

class Number5910 : StressfulInteger {

  companion object {
    private var VALUE = 5910
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2955()
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
    val a = Number5909()
    val b = Number5908()
    return a.fib() + b.fib()
  }

}

class Number5911 : StressfulInteger {

  companion object {
    private var VALUE = 5911
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2955()
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
    val a = Number5910()
    val b = Number5909()
    return a.fib() + b.fib()
  }

}

class Number5912 : StressfulInteger {

  companion object {
    private var VALUE = 5912
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2956()
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
    val a = Number5911()
    val b = Number5910()
    return a.fib() + b.fib()
  }

}

class Number5913 : StressfulInteger {

  companion object {
    private var VALUE = 5913
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2956()
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
    val a = Number5912()
    val b = Number5911()
    return a.fib() + b.fib()
  }

}

class Number5914 : StressfulInteger {

  companion object {
    private var VALUE = 5914
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2957()
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
    val a = Number5913()
    val b = Number5912()
    return a.fib() + b.fib()
  }

}

class Number5915 : StressfulInteger {

  companion object {
    private var VALUE = 5915
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2957()
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
    val a = Number5914()
    val b = Number5913()
    return a.fib() + b.fib()
  }

}

class Number5916 : StressfulInteger {

  companion object {
    private var VALUE = 5916
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2958()
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
    val a = Number5915()
    val b = Number5914()
    return a.fib() + b.fib()
  }

}

class Number5917 : StressfulInteger {

  companion object {
    private var VALUE = 5917
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2958()
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
    val a = Number5916()
    val b = Number5915()
    return a.fib() + b.fib()
  }

}

class Number5918 : StressfulInteger {

  companion object {
    private var VALUE = 5918
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2959()
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
    val a = Number5917()
    val b = Number5916()
    return a.fib() + b.fib()
  }

}

class Number5919 : StressfulInteger {

  companion object {
    private var VALUE = 5919
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2959()
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
    val a = Number5918()
    val b = Number5917()
    return a.fib() + b.fib()
  }

}

class Number5920 : StressfulInteger {

  companion object {
    private var VALUE = 5920
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2960()
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
    val a = Number5919()
    val b = Number5918()
    return a.fib() + b.fib()
  }

}

class Number5921 : StressfulInteger {

  companion object {
    private var VALUE = 5921
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2960()
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
    val a = Number5920()
    val b = Number5919()
    return a.fib() + b.fib()
  }

}

class Number5922 : StressfulInteger {

  companion object {
    private var VALUE = 5922
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2961()
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
    val a = Number5921()
    val b = Number5920()
    return a.fib() + b.fib()
  }

}

class Number5923 : StressfulInteger {

  companion object {
    private var VALUE = 5923
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2961()
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
    val a = Number5922()
    val b = Number5921()
    return a.fib() + b.fib()
  }

}

class Number5924 : StressfulInteger {

  companion object {
    private var VALUE = 5924
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2962()
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
    val a = Number5923()
    val b = Number5922()
    return a.fib() + b.fib()
  }

}

class Number5925 : StressfulInteger {

  companion object {
    private var VALUE = 5925
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2962()
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
    val a = Number5924()
    val b = Number5923()
    return a.fib() + b.fib()
  }

}

class Number5926 : StressfulInteger {

  companion object {
    private var VALUE = 5926
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2963()
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
    val a = Number5925()
    val b = Number5924()
    return a.fib() + b.fib()
  }

}

class Number5927 : StressfulInteger {

  companion object {
    private var VALUE = 5927
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2963()
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
    val a = Number5926()
    val b = Number5925()
    return a.fib() + b.fib()
  }

}

class Number5928 : StressfulInteger {

  companion object {
    private var VALUE = 5928
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2964()
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
    val a = Number5927()
    val b = Number5926()
    return a.fib() + b.fib()
  }

}

class Number5929 : StressfulInteger {

  companion object {
    private var VALUE = 5929
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2964()
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
    val a = Number5928()
    val b = Number5927()
    return a.fib() + b.fib()
  }

}

class Number5930 : StressfulInteger {

  companion object {
    private var VALUE = 5930
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2965()
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
    val a = Number5929()
    val b = Number5928()
    return a.fib() + b.fib()
  }

}

class Number5931 : StressfulInteger {

  companion object {
    private var VALUE = 5931
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2965()
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
    val a = Number5930()
    val b = Number5929()
    return a.fib() + b.fib()
  }

}

class Number5932 : StressfulInteger {

  companion object {
    private var VALUE = 5932
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2966()
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
    val a = Number5931()
    val b = Number5930()
    return a.fib() + b.fib()
  }

}

class Number5933 : StressfulInteger {

  companion object {
    private var VALUE = 5933
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2966()
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
    val a = Number5932()
    val b = Number5931()
    return a.fib() + b.fib()
  }

}

class Number5934 : StressfulInteger {

  companion object {
    private var VALUE = 5934
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2967()
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
    val a = Number5933()
    val b = Number5932()
    return a.fib() + b.fib()
  }

}

class Number5935 : StressfulInteger {

  companion object {
    private var VALUE = 5935
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2967()
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
    val a = Number5934()
    val b = Number5933()
    return a.fib() + b.fib()
  }

}

class Number5936 : StressfulInteger {

  companion object {
    private var VALUE = 5936
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2968()
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
    val a = Number5935()
    val b = Number5934()
    return a.fib() + b.fib()
  }

}

class Number5937 : StressfulInteger {

  companion object {
    private var VALUE = 5937
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2968()
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
    val a = Number5936()
    val b = Number5935()
    return a.fib() + b.fib()
  }

}

class Number5938 : StressfulInteger {

  companion object {
    private var VALUE = 5938
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2969()
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
    val a = Number5937()
    val b = Number5936()
    return a.fib() + b.fib()
  }

}

class Number5939 : StressfulInteger {

  companion object {
    private var VALUE = 5939
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2969()
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
    val a = Number5938()
    val b = Number5937()
    return a.fib() + b.fib()
  }

}

class Number5940 : StressfulInteger {

  companion object {
    private var VALUE = 5940
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2970()
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
    val a = Number5939()
    val b = Number5938()
    return a.fib() + b.fib()
  }

}

class Number5941 : StressfulInteger {

  companion object {
    private var VALUE = 5941
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2970()
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
    val a = Number5940()
    val b = Number5939()
    return a.fib() + b.fib()
  }

}

class Number5942 : StressfulInteger {

  companion object {
    private var VALUE = 5942
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2971()
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
    val a = Number5941()
    val b = Number5940()
    return a.fib() + b.fib()
  }

}

class Number5943 : StressfulInteger {

  companion object {
    private var VALUE = 5943
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2971()
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
    val a = Number5942()
    val b = Number5941()
    return a.fib() + b.fib()
  }

}

class Number5944 : StressfulInteger {

  companion object {
    private var VALUE = 5944
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2972()
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
    val a = Number5943()
    val b = Number5942()
    return a.fib() + b.fib()
  }

}

class Number5945 : StressfulInteger {

  companion object {
    private var VALUE = 5945
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2972()
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
    val a = Number5944()
    val b = Number5943()
    return a.fib() + b.fib()
  }

}

class Number5946 : StressfulInteger {

  companion object {
    private var VALUE = 5946
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2973()
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
    val a = Number5945()
    val b = Number5944()
    return a.fib() + b.fib()
  }

}

class Number5947 : StressfulInteger {

  companion object {
    private var VALUE = 5947
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2973()
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
    val a = Number5946()
    val b = Number5945()
    return a.fib() + b.fib()
  }

}

class Number5948 : StressfulInteger {

  companion object {
    private var VALUE = 5948
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2974()
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
    val a = Number5947()
    val b = Number5946()
    return a.fib() + b.fib()
  }

}

class Number5949 : StressfulInteger {

  companion object {
    private var VALUE = 5949
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2974()
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
    val a = Number5948()
    val b = Number5947()
    return a.fib() + b.fib()
  }

}

class Number5950 : StressfulInteger {

  companion object {
    private var VALUE = 5950
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2975()
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
    val a = Number5949()
    val b = Number5948()
    return a.fib() + b.fib()
  }

}

class Number5951 : StressfulInteger {

  companion object {
    private var VALUE = 5951
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2975()
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
    val a = Number5950()
    val b = Number5949()
    return a.fib() + b.fib()
  }

}

class Number5952 : StressfulInteger {

  companion object {
    private var VALUE = 5952
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2976()
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
    val a = Number5951()
    val b = Number5950()
    return a.fib() + b.fib()
  }

}

class Number5953 : StressfulInteger {

  companion object {
    private var VALUE = 5953
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2976()
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
    val a = Number5952()
    val b = Number5951()
    return a.fib() + b.fib()
  }

}

class Number5954 : StressfulInteger {

  companion object {
    private var VALUE = 5954
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2977()
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
    val a = Number5953()
    val b = Number5952()
    return a.fib() + b.fib()
  }

}

class Number5955 : StressfulInteger {

  companion object {
    private var VALUE = 5955
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2977()
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
    val a = Number5954()
    val b = Number5953()
    return a.fib() + b.fib()
  }

}

class Number5956 : StressfulInteger {

  companion object {
    private var VALUE = 5956
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2978()
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
    val a = Number5955()
    val b = Number5954()
    return a.fib() + b.fib()
  }

}

class Number5957 : StressfulInteger {

  companion object {
    private var VALUE = 5957
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2978()
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
    val a = Number5956()
    val b = Number5955()
    return a.fib() + b.fib()
  }

}

class Number5958 : StressfulInteger {

  companion object {
    private var VALUE = 5958
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2979()
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
    val a = Number5957()
    val b = Number5956()
    return a.fib() + b.fib()
  }

}

class Number5959 : StressfulInteger {

  companion object {
    private var VALUE = 5959
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2979()
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
    val a = Number5958()
    val b = Number5957()
    return a.fib() + b.fib()
  }

}

class Number5960 : StressfulInteger {

  companion object {
    private var VALUE = 5960
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2980()
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
    val a = Number5959()
    val b = Number5958()
    return a.fib() + b.fib()
  }

}

class Number5961 : StressfulInteger {

  companion object {
    private var VALUE = 5961
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2980()
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
    val a = Number5960()
    val b = Number5959()
    return a.fib() + b.fib()
  }

}

class Number5962 : StressfulInteger {

  companion object {
    private var VALUE = 5962
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2981()
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
    val a = Number5961()
    val b = Number5960()
    return a.fib() + b.fib()
  }

}

class Number5963 : StressfulInteger {

  companion object {
    private var VALUE = 5963
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2981()
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
    val a = Number5962()
    val b = Number5961()
    return a.fib() + b.fib()
  }

}

class Number5964 : StressfulInteger {

  companion object {
    private var VALUE = 5964
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2982()
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
    val a = Number5963()
    val b = Number5962()
    return a.fib() + b.fib()
  }

}

class Number5965 : StressfulInteger {

  companion object {
    private var VALUE = 5965
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2982()
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
    val a = Number5964()
    val b = Number5963()
    return a.fib() + b.fib()
  }

}

class Number5966 : StressfulInteger {

  companion object {
    private var VALUE = 5966
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2983()
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
    val a = Number5965()
    val b = Number5964()
    return a.fib() + b.fib()
  }

}

class Number5967 : StressfulInteger {

  companion object {
    private var VALUE = 5967
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2983()
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
    val a = Number5966()
    val b = Number5965()
    return a.fib() + b.fib()
  }

}

class Number5968 : StressfulInteger {

  companion object {
    private var VALUE = 5968
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2984()
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
    val a = Number5967()
    val b = Number5966()
    return a.fib() + b.fib()
  }

}

class Number5969 : StressfulInteger {

  companion object {
    private var VALUE = 5969
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2984()
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
    val a = Number5968()
    val b = Number5967()
    return a.fib() + b.fib()
  }

}

class Number5970 : StressfulInteger {

  companion object {
    private var VALUE = 5970
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2985()
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
    val a = Number5969()
    val b = Number5968()
    return a.fib() + b.fib()
  }

}

class Number5971 : StressfulInteger {

  companion object {
    private var VALUE = 5971
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2985()
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
    val a = Number5970()
    val b = Number5969()
    return a.fib() + b.fib()
  }

}

class Number5972 : StressfulInteger {

  companion object {
    private var VALUE = 5972
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2986()
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
    val a = Number5971()
    val b = Number5970()
    return a.fib() + b.fib()
  }

}

class Number5973 : StressfulInteger {

  companion object {
    private var VALUE = 5973
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2986()
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
    val a = Number5972()
    val b = Number5971()
    return a.fib() + b.fib()
  }

}

class Number5974 : StressfulInteger {

  companion object {
    private var VALUE = 5974
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2987()
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
    val a = Number5973()
    val b = Number5972()
    return a.fib() + b.fib()
  }

}

class Number5975 : StressfulInteger {

  companion object {
    private var VALUE = 5975
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2987()
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
    val a = Number5974()
    val b = Number5973()
    return a.fib() + b.fib()
  }

}

class Number5976 : StressfulInteger {

  companion object {
    private var VALUE = 5976
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2988()
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
    val a = Number5975()
    val b = Number5974()
    return a.fib() + b.fib()
  }

}

class Number5977 : StressfulInteger {

  companion object {
    private var VALUE = 5977
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2988()
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
    val a = Number5976()
    val b = Number5975()
    return a.fib() + b.fib()
  }

}

class Number5978 : StressfulInteger {

  companion object {
    private var VALUE = 5978
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2989()
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
    val a = Number5977()
    val b = Number5976()
    return a.fib() + b.fib()
  }

}

class Number5979 : StressfulInteger {

  companion object {
    private var VALUE = 5979
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2989()
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
    val a = Number5978()
    val b = Number5977()
    return a.fib() + b.fib()
  }

}

class Number5980 : StressfulInteger {

  companion object {
    private var VALUE = 5980
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2990()
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
    val a = Number5979()
    val b = Number5978()
    return a.fib() + b.fib()
  }

}

class Number5981 : StressfulInteger {

  companion object {
    private var VALUE = 5981
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2990()
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
    val a = Number5980()
    val b = Number5979()
    return a.fib() + b.fib()
  }

}

class Number5982 : StressfulInteger {

  companion object {
    private var VALUE = 5982
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2991()
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
    val a = Number5981()
    val b = Number5980()
    return a.fib() + b.fib()
  }

}

class Number5983 : StressfulInteger {

  companion object {
    private var VALUE = 5983
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2991()
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
    val a = Number5982()
    val b = Number5981()
    return a.fib() + b.fib()
  }

}

class Number5984 : StressfulInteger {

  companion object {
    private var VALUE = 5984
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2992()
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
    val a = Number5983()
    val b = Number5982()
    return a.fib() + b.fib()
  }

}

class Number5985 : StressfulInteger {

  companion object {
    private var VALUE = 5985
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2992()
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
    val a = Number5984()
    val b = Number5983()
    return a.fib() + b.fib()
  }

}

class Number5986 : StressfulInteger {

  companion object {
    private var VALUE = 5986
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2993()
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
    val a = Number5985()
    val b = Number5984()
    return a.fib() + b.fib()
  }

}

class Number5987 : StressfulInteger {

  companion object {
    private var VALUE = 5987
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2993()
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
    val a = Number5986()
    val b = Number5985()
    return a.fib() + b.fib()
  }

}

class Number5988 : StressfulInteger {

  companion object {
    private var VALUE = 5988
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2994()
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
    val a = Number5987()
    val b = Number5986()
    return a.fib() + b.fib()
  }

}

class Number5989 : StressfulInteger {

  companion object {
    private var VALUE = 5989
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2994()
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
    val a = Number5988()
    val b = Number5987()
    return a.fib() + b.fib()
  }

}

class Number5990 : StressfulInteger {

  companion object {
    private var VALUE = 5990
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2995()
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
    val a = Number5989()
    val b = Number5988()
    return a.fib() + b.fib()
  }

}

class Number5991 : StressfulInteger {

  companion object {
    private var VALUE = 5991
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2995()
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
    val a = Number5990()
    val b = Number5989()
    return a.fib() + b.fib()
  }

}

class Number5992 : StressfulInteger {

  companion object {
    private var VALUE = 5992
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2996()
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
    val a = Number5991()
    val b = Number5990()
    return a.fib() + b.fib()
  }

}

class Number5993 : StressfulInteger {

  companion object {
    private var VALUE = 5993
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2996()
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
    val a = Number5992()
    val b = Number5991()
    return a.fib() + b.fib()
  }

}

class Number5994 : StressfulInteger {

  companion object {
    private var VALUE = 5994
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2997()
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
    val a = Number5993()
    val b = Number5992()
    return a.fib() + b.fib()
  }

}

class Number5995 : StressfulInteger {

  companion object {
    private var VALUE = 5995
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2997()
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
    val a = Number5994()
    val b = Number5993()
    return a.fib() + b.fib()
  }

}

class Number5996 : StressfulInteger {

  companion object {
    private var VALUE = 5996
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2998()
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
    val a = Number5995()
    val b = Number5994()
    return a.fib() + b.fib()
  }

}

class Number5997 : StressfulInteger {

  companion object {
    private var VALUE = 5997
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2998()
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
    val a = Number5996()
    val b = Number5995()
    return a.fib() + b.fib()
  }

}

class Number5998 : StressfulInteger {

  companion object {
    private var VALUE = 5998
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2999()
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
    val a = Number5997()
    val b = Number5996()
    return a.fib() + b.fib()
  }

}

class Number5999 : StressfulInteger {

  companion object {
    private var VALUE = 5999
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2999()
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
    val a = Number5998()
    val b = Number5997()
    return a.fib() + b.fib()
  }

}

