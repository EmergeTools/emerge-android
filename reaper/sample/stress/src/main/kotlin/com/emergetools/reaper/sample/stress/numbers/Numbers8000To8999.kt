package com.emergetools.reaper.sample.stress.numbers

class Number8000 : StressfulInteger {

  companion object {
    private var VALUE = 8000
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4000()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7999()
    val b = Number7998()
    return a.fib() + b.fib()
  }

}

class Number8001 : StressfulInteger {

  companion object {
    private var VALUE = 8001
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4000()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8000()
    val b = Number7999()
    return a.fib() + b.fib()
  }

}

class Number8002 : StressfulInteger {

  companion object {
    private var VALUE = 8002
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4001()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8001()
    val b = Number8000()
    return a.fib() + b.fib()
  }

}

class Number8003 : StressfulInteger {

  companion object {
    private var VALUE = 8003
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4001()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8002()
    val b = Number8001()
    return a.fib() + b.fib()
  }

}

class Number8004 : StressfulInteger {

  companion object {
    private var VALUE = 8004
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4002()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8003()
    val b = Number8002()
    return a.fib() + b.fib()
  }

}

class Number8005 : StressfulInteger {

  companion object {
    private var VALUE = 8005
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4002()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8004()
    val b = Number8003()
    return a.fib() + b.fib()
  }

}

class Number8006 : StressfulInteger {

  companion object {
    private var VALUE = 8006
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4003()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8005()
    val b = Number8004()
    return a.fib() + b.fib()
  }

}

class Number8007 : StressfulInteger {

  companion object {
    private var VALUE = 8007
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4003()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8006()
    val b = Number8005()
    return a.fib() + b.fib()
  }

}

class Number8008 : StressfulInteger {

  companion object {
    private var VALUE = 8008
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4004()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8007()
    val b = Number8006()
    return a.fib() + b.fib()
  }

}

class Number8009 : StressfulInteger {

  companion object {
    private var VALUE = 8009
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4004()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8008()
    val b = Number8007()
    return a.fib() + b.fib()
  }

}

class Number8010 : StressfulInteger {

  companion object {
    private var VALUE = 8010
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4005()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8009()
    val b = Number8008()
    return a.fib() + b.fib()
  }

}

class Number8011 : StressfulInteger {

  companion object {
    private var VALUE = 8011
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4005()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8010()
    val b = Number8009()
    return a.fib() + b.fib()
  }

}

class Number8012 : StressfulInteger {

  companion object {
    private var VALUE = 8012
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4006()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8011()
    val b = Number8010()
    return a.fib() + b.fib()
  }

}

class Number8013 : StressfulInteger {

  companion object {
    private var VALUE = 8013
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4006()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8012()
    val b = Number8011()
    return a.fib() + b.fib()
  }

}

class Number8014 : StressfulInteger {

  companion object {
    private var VALUE = 8014
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4007()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8013()
    val b = Number8012()
    return a.fib() + b.fib()
  }

}

class Number8015 : StressfulInteger {

  companion object {
    private var VALUE = 8015
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4007()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8014()
    val b = Number8013()
    return a.fib() + b.fib()
  }

}

class Number8016 : StressfulInteger {

  companion object {
    private var VALUE = 8016
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4008()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8015()
    val b = Number8014()
    return a.fib() + b.fib()
  }

}

class Number8017 : StressfulInteger {

  companion object {
    private var VALUE = 8017
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4008()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8016()
    val b = Number8015()
    return a.fib() + b.fib()
  }

}

class Number8018 : StressfulInteger {

  companion object {
    private var VALUE = 8018
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4009()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8017()
    val b = Number8016()
    return a.fib() + b.fib()
  }

}

class Number8019 : StressfulInteger {

  companion object {
    private var VALUE = 8019
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4009()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8018()
    val b = Number8017()
    return a.fib() + b.fib()
  }

}

class Number8020 : StressfulInteger {

  companion object {
    private var VALUE = 8020
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4010()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8019()
    val b = Number8018()
    return a.fib() + b.fib()
  }

}

class Number8021 : StressfulInteger {

  companion object {
    private var VALUE = 8021
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4010()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8020()
    val b = Number8019()
    return a.fib() + b.fib()
  }

}

class Number8022 : StressfulInteger {

  companion object {
    private var VALUE = 8022
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4011()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8021()
    val b = Number8020()
    return a.fib() + b.fib()
  }

}

class Number8023 : StressfulInteger {

  companion object {
    private var VALUE = 8023
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4011()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8022()
    val b = Number8021()
    return a.fib() + b.fib()
  }

}

class Number8024 : StressfulInteger {

  companion object {
    private var VALUE = 8024
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4012()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8023()
    val b = Number8022()
    return a.fib() + b.fib()
  }

}

class Number8025 : StressfulInteger {

  companion object {
    private var VALUE = 8025
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4012()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8024()
    val b = Number8023()
    return a.fib() + b.fib()
  }

}

class Number8026 : StressfulInteger {

  companion object {
    private var VALUE = 8026
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4013()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8025()
    val b = Number8024()
    return a.fib() + b.fib()
  }

}

class Number8027 : StressfulInteger {

  companion object {
    private var VALUE = 8027
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4013()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8026()
    val b = Number8025()
    return a.fib() + b.fib()
  }

}

class Number8028 : StressfulInteger {

  companion object {
    private var VALUE = 8028
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4014()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8027()
    val b = Number8026()
    return a.fib() + b.fib()
  }

}

class Number8029 : StressfulInteger {

  companion object {
    private var VALUE = 8029
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4014()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8028()
    val b = Number8027()
    return a.fib() + b.fib()
  }

}

class Number8030 : StressfulInteger {

  companion object {
    private var VALUE = 8030
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4015()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8029()
    val b = Number8028()
    return a.fib() + b.fib()
  }

}

class Number8031 : StressfulInteger {

  companion object {
    private var VALUE = 8031
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4015()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8030()
    val b = Number8029()
    return a.fib() + b.fib()
  }

}

class Number8032 : StressfulInteger {

  companion object {
    private var VALUE = 8032
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4016()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8031()
    val b = Number8030()
    return a.fib() + b.fib()
  }

}

class Number8033 : StressfulInteger {

  companion object {
    private var VALUE = 8033
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4016()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8032()
    val b = Number8031()
    return a.fib() + b.fib()
  }

}

class Number8034 : StressfulInteger {

  companion object {
    private var VALUE = 8034
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4017()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8033()
    val b = Number8032()
    return a.fib() + b.fib()
  }

}

class Number8035 : StressfulInteger {

  companion object {
    private var VALUE = 8035
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4017()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8034()
    val b = Number8033()
    return a.fib() + b.fib()
  }

}

class Number8036 : StressfulInteger {

  companion object {
    private var VALUE = 8036
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4018()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8035()
    val b = Number8034()
    return a.fib() + b.fib()
  }

}

class Number8037 : StressfulInteger {

  companion object {
    private var VALUE = 8037
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4018()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8036()
    val b = Number8035()
    return a.fib() + b.fib()
  }

}

class Number8038 : StressfulInteger {

  companion object {
    private var VALUE = 8038
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4019()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8037()
    val b = Number8036()
    return a.fib() + b.fib()
  }

}

class Number8039 : StressfulInteger {

  companion object {
    private var VALUE = 8039
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4019()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8038()
    val b = Number8037()
    return a.fib() + b.fib()
  }

}

class Number8040 : StressfulInteger {

  companion object {
    private var VALUE = 8040
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4020()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8039()
    val b = Number8038()
    return a.fib() + b.fib()
  }

}

class Number8041 : StressfulInteger {

  companion object {
    private var VALUE = 8041
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4020()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8040()
    val b = Number8039()
    return a.fib() + b.fib()
  }

}

class Number8042 : StressfulInteger {

  companion object {
    private var VALUE = 8042
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4021()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8041()
    val b = Number8040()
    return a.fib() + b.fib()
  }

}

class Number8043 : StressfulInteger {

  companion object {
    private var VALUE = 8043
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4021()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8042()
    val b = Number8041()
    return a.fib() + b.fib()
  }

}

class Number8044 : StressfulInteger {

  companion object {
    private var VALUE = 8044
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4022()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8043()
    val b = Number8042()
    return a.fib() + b.fib()
  }

}

class Number8045 : StressfulInteger {

  companion object {
    private var VALUE = 8045
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4022()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8044()
    val b = Number8043()
    return a.fib() + b.fib()
  }

}

class Number8046 : StressfulInteger {

  companion object {
    private var VALUE = 8046
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4023()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8045()
    val b = Number8044()
    return a.fib() + b.fib()
  }

}

class Number8047 : StressfulInteger {

  companion object {
    private var VALUE = 8047
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4023()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8046()
    val b = Number8045()
    return a.fib() + b.fib()
  }

}

class Number8048 : StressfulInteger {

  companion object {
    private var VALUE = 8048
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4024()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8047()
    val b = Number8046()
    return a.fib() + b.fib()
  }

}

class Number8049 : StressfulInteger {

  companion object {
    private var VALUE = 8049
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4024()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8048()
    val b = Number8047()
    return a.fib() + b.fib()
  }

}

class Number8050 : StressfulInteger {

  companion object {
    private var VALUE = 8050
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4025()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8049()
    val b = Number8048()
    return a.fib() + b.fib()
  }

}

class Number8051 : StressfulInteger {

  companion object {
    private var VALUE = 8051
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4025()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8050()
    val b = Number8049()
    return a.fib() + b.fib()
  }

}

class Number8052 : StressfulInteger {

  companion object {
    private var VALUE = 8052
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4026()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8051()
    val b = Number8050()
    return a.fib() + b.fib()
  }

}

class Number8053 : StressfulInteger {

  companion object {
    private var VALUE = 8053
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4026()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8052()
    val b = Number8051()
    return a.fib() + b.fib()
  }

}

class Number8054 : StressfulInteger {

  companion object {
    private var VALUE = 8054
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4027()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8053()
    val b = Number8052()
    return a.fib() + b.fib()
  }

}

class Number8055 : StressfulInteger {

  companion object {
    private var VALUE = 8055
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4027()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8054()
    val b = Number8053()
    return a.fib() + b.fib()
  }

}

class Number8056 : StressfulInteger {

  companion object {
    private var VALUE = 8056
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4028()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8055()
    val b = Number8054()
    return a.fib() + b.fib()
  }

}

class Number8057 : StressfulInteger {

  companion object {
    private var VALUE = 8057
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4028()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8056()
    val b = Number8055()
    return a.fib() + b.fib()
  }

}

class Number8058 : StressfulInteger {

  companion object {
    private var VALUE = 8058
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4029()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8057()
    val b = Number8056()
    return a.fib() + b.fib()
  }

}

class Number8059 : StressfulInteger {

  companion object {
    private var VALUE = 8059
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4029()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8058()
    val b = Number8057()
    return a.fib() + b.fib()
  }

}

class Number8060 : StressfulInteger {

  companion object {
    private var VALUE = 8060
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4030()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8059()
    val b = Number8058()
    return a.fib() + b.fib()
  }

}

class Number8061 : StressfulInteger {

  companion object {
    private var VALUE = 8061
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4030()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8060()
    val b = Number8059()
    return a.fib() + b.fib()
  }

}

class Number8062 : StressfulInteger {

  companion object {
    private var VALUE = 8062
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4031()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8061()
    val b = Number8060()
    return a.fib() + b.fib()
  }

}

class Number8063 : StressfulInteger {

  companion object {
    private var VALUE = 8063
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4031()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8062()
    val b = Number8061()
    return a.fib() + b.fib()
  }

}

class Number8064 : StressfulInteger {

  companion object {
    private var VALUE = 8064
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4032()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8063()
    val b = Number8062()
    return a.fib() + b.fib()
  }

}

class Number8065 : StressfulInteger {

  companion object {
    private var VALUE = 8065
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4032()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8064()
    val b = Number8063()
    return a.fib() + b.fib()
  }

}

class Number8066 : StressfulInteger {

  companion object {
    private var VALUE = 8066
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4033()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8065()
    val b = Number8064()
    return a.fib() + b.fib()
  }

}

class Number8067 : StressfulInteger {

  companion object {
    private var VALUE = 8067
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4033()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8066()
    val b = Number8065()
    return a.fib() + b.fib()
  }

}

class Number8068 : StressfulInteger {

  companion object {
    private var VALUE = 8068
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4034()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8067()
    val b = Number8066()
    return a.fib() + b.fib()
  }

}

class Number8069 : StressfulInteger {

  companion object {
    private var VALUE = 8069
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4034()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8068()
    val b = Number8067()
    return a.fib() + b.fib()
  }

}

class Number8070 : StressfulInteger {

  companion object {
    private var VALUE = 8070
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4035()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8069()
    val b = Number8068()
    return a.fib() + b.fib()
  }

}

class Number8071 : StressfulInteger {

  companion object {
    private var VALUE = 8071
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4035()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8070()
    val b = Number8069()
    return a.fib() + b.fib()
  }

}

class Number8072 : StressfulInteger {

  companion object {
    private var VALUE = 8072
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4036()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8071()
    val b = Number8070()
    return a.fib() + b.fib()
  }

}

class Number8073 : StressfulInteger {

  companion object {
    private var VALUE = 8073
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4036()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8072()
    val b = Number8071()
    return a.fib() + b.fib()
  }

}

class Number8074 : StressfulInteger {

  companion object {
    private var VALUE = 8074
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4037()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8073()
    val b = Number8072()
    return a.fib() + b.fib()
  }

}

class Number8075 : StressfulInteger {

  companion object {
    private var VALUE = 8075
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4037()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8074()
    val b = Number8073()
    return a.fib() + b.fib()
  }

}

class Number8076 : StressfulInteger {

  companion object {
    private var VALUE = 8076
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4038()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8075()
    val b = Number8074()
    return a.fib() + b.fib()
  }

}

class Number8077 : StressfulInteger {

  companion object {
    private var VALUE = 8077
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4038()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8076()
    val b = Number8075()
    return a.fib() + b.fib()
  }

}

class Number8078 : StressfulInteger {

  companion object {
    private var VALUE = 8078
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4039()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8077()
    val b = Number8076()
    return a.fib() + b.fib()
  }

}

class Number8079 : StressfulInteger {

  companion object {
    private var VALUE = 8079
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4039()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8078()
    val b = Number8077()
    return a.fib() + b.fib()
  }

}

class Number8080 : StressfulInteger {

  companion object {
    private var VALUE = 8080
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4040()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8079()
    val b = Number8078()
    return a.fib() + b.fib()
  }

}

class Number8081 : StressfulInteger {

  companion object {
    private var VALUE = 8081
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4040()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8080()
    val b = Number8079()
    return a.fib() + b.fib()
  }

}

class Number8082 : StressfulInteger {

  companion object {
    private var VALUE = 8082
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4041()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8081()
    val b = Number8080()
    return a.fib() + b.fib()
  }

}

class Number8083 : StressfulInteger {

  companion object {
    private var VALUE = 8083
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4041()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8082()
    val b = Number8081()
    return a.fib() + b.fib()
  }

}

class Number8084 : StressfulInteger {

  companion object {
    private var VALUE = 8084
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4042()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8083()
    val b = Number8082()
    return a.fib() + b.fib()
  }

}

class Number8085 : StressfulInteger {

  companion object {
    private var VALUE = 8085
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4042()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8084()
    val b = Number8083()
    return a.fib() + b.fib()
  }

}

class Number8086 : StressfulInteger {

  companion object {
    private var VALUE = 8086
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4043()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8085()
    val b = Number8084()
    return a.fib() + b.fib()
  }

}

class Number8087 : StressfulInteger {

  companion object {
    private var VALUE = 8087
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4043()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8086()
    val b = Number8085()
    return a.fib() + b.fib()
  }

}

class Number8088 : StressfulInteger {

  companion object {
    private var VALUE = 8088
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4044()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8087()
    val b = Number8086()
    return a.fib() + b.fib()
  }

}

class Number8089 : StressfulInteger {

  companion object {
    private var VALUE = 8089
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4044()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8088()
    val b = Number8087()
    return a.fib() + b.fib()
  }

}

class Number8090 : StressfulInteger {

  companion object {
    private var VALUE = 8090
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4045()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8089()
    val b = Number8088()
    return a.fib() + b.fib()
  }

}

class Number8091 : StressfulInteger {

  companion object {
    private var VALUE = 8091
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4045()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8090()
    val b = Number8089()
    return a.fib() + b.fib()
  }

}

class Number8092 : StressfulInteger {

  companion object {
    private var VALUE = 8092
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4046()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8091()
    val b = Number8090()
    return a.fib() + b.fib()
  }

}

class Number8093 : StressfulInteger {

  companion object {
    private var VALUE = 8093
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4046()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8092()
    val b = Number8091()
    return a.fib() + b.fib()
  }

}

class Number8094 : StressfulInteger {

  companion object {
    private var VALUE = 8094
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4047()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8093()
    val b = Number8092()
    return a.fib() + b.fib()
  }

}

class Number8095 : StressfulInteger {

  companion object {
    private var VALUE = 8095
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4047()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8094()
    val b = Number8093()
    return a.fib() + b.fib()
  }

}

class Number8096 : StressfulInteger {

  companion object {
    private var VALUE = 8096
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4048()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8095()
    val b = Number8094()
    return a.fib() + b.fib()
  }

}

class Number8097 : StressfulInteger {

  companion object {
    private var VALUE = 8097
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4048()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8096()
    val b = Number8095()
    return a.fib() + b.fib()
  }

}

class Number8098 : StressfulInteger {

  companion object {
    private var VALUE = 8098
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4049()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8097()
    val b = Number8096()
    return a.fib() + b.fib()
  }

}

class Number8099 : StressfulInteger {

  companion object {
    private var VALUE = 8099
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4049()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8098()
    val b = Number8097()
    return a.fib() + b.fib()
  }

}

class Number8100 : StressfulInteger {

  companion object {
    private var VALUE = 8100
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4050()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8099()
    val b = Number8098()
    return a.fib() + b.fib()
  }

}

class Number8101 : StressfulInteger {

  companion object {
    private var VALUE = 8101
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4050()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8100()
    val b = Number8099()
    return a.fib() + b.fib()
  }

}

class Number8102 : StressfulInteger {

  companion object {
    private var VALUE = 8102
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4051()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8101()
    val b = Number8100()
    return a.fib() + b.fib()
  }

}

class Number8103 : StressfulInteger {

  companion object {
    private var VALUE = 8103
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4051()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8102()
    val b = Number8101()
    return a.fib() + b.fib()
  }

}

class Number8104 : StressfulInteger {

  companion object {
    private var VALUE = 8104
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4052()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8103()
    val b = Number8102()
    return a.fib() + b.fib()
  }

}

class Number8105 : StressfulInteger {

  companion object {
    private var VALUE = 8105
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4052()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8104()
    val b = Number8103()
    return a.fib() + b.fib()
  }

}

class Number8106 : StressfulInteger {

  companion object {
    private var VALUE = 8106
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4053()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8105()
    val b = Number8104()
    return a.fib() + b.fib()
  }

}

class Number8107 : StressfulInteger {

  companion object {
    private var VALUE = 8107
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4053()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8106()
    val b = Number8105()
    return a.fib() + b.fib()
  }

}

class Number8108 : StressfulInteger {

  companion object {
    private var VALUE = 8108
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4054()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8107()
    val b = Number8106()
    return a.fib() + b.fib()
  }

}

class Number8109 : StressfulInteger {

  companion object {
    private var VALUE = 8109
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4054()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8108()
    val b = Number8107()
    return a.fib() + b.fib()
  }

}

class Number8110 : StressfulInteger {

  companion object {
    private var VALUE = 8110
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4055()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8109()
    val b = Number8108()
    return a.fib() + b.fib()
  }

}

class Number8111 : StressfulInteger {

  companion object {
    private var VALUE = 8111
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4055()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8110()
    val b = Number8109()
    return a.fib() + b.fib()
  }

}

class Number8112 : StressfulInteger {

  companion object {
    private var VALUE = 8112
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4056()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8111()
    val b = Number8110()
    return a.fib() + b.fib()
  }

}

class Number8113 : StressfulInteger {

  companion object {
    private var VALUE = 8113
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4056()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8112()
    val b = Number8111()
    return a.fib() + b.fib()
  }

}

class Number8114 : StressfulInteger {

  companion object {
    private var VALUE = 8114
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4057()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8113()
    val b = Number8112()
    return a.fib() + b.fib()
  }

}

class Number8115 : StressfulInteger {

  companion object {
    private var VALUE = 8115
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4057()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8114()
    val b = Number8113()
    return a.fib() + b.fib()
  }

}

class Number8116 : StressfulInteger {

  companion object {
    private var VALUE = 8116
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4058()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8115()
    val b = Number8114()
    return a.fib() + b.fib()
  }

}

class Number8117 : StressfulInteger {

  companion object {
    private var VALUE = 8117
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4058()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8116()
    val b = Number8115()
    return a.fib() + b.fib()
  }

}

class Number8118 : StressfulInteger {

  companion object {
    private var VALUE = 8118
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4059()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8117()
    val b = Number8116()
    return a.fib() + b.fib()
  }

}

class Number8119 : StressfulInteger {

  companion object {
    private var VALUE = 8119
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4059()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8118()
    val b = Number8117()
    return a.fib() + b.fib()
  }

}

class Number8120 : StressfulInteger {

  companion object {
    private var VALUE = 8120
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4060()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8119()
    val b = Number8118()
    return a.fib() + b.fib()
  }

}

class Number8121 : StressfulInteger {

  companion object {
    private var VALUE = 8121
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4060()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8120()
    val b = Number8119()
    return a.fib() + b.fib()
  }

}

class Number8122 : StressfulInteger {

  companion object {
    private var VALUE = 8122
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4061()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8121()
    val b = Number8120()
    return a.fib() + b.fib()
  }

}

class Number8123 : StressfulInteger {

  companion object {
    private var VALUE = 8123
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4061()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8122()
    val b = Number8121()
    return a.fib() + b.fib()
  }

}

class Number8124 : StressfulInteger {

  companion object {
    private var VALUE = 8124
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4062()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8123()
    val b = Number8122()
    return a.fib() + b.fib()
  }

}

class Number8125 : StressfulInteger {

  companion object {
    private var VALUE = 8125
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4062()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8124()
    val b = Number8123()
    return a.fib() + b.fib()
  }

}

class Number8126 : StressfulInteger {

  companion object {
    private var VALUE = 8126
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4063()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8125()
    val b = Number8124()
    return a.fib() + b.fib()
  }

}

class Number8127 : StressfulInteger {

  companion object {
    private var VALUE = 8127
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4063()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8126()
    val b = Number8125()
    return a.fib() + b.fib()
  }

}

class Number8128 : StressfulInteger {

  companion object {
    private var VALUE = 8128
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4064()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8127()
    val b = Number8126()
    return a.fib() + b.fib()
  }

}

class Number8129 : StressfulInteger {

  companion object {
    private var VALUE = 8129
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4064()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8128()
    val b = Number8127()
    return a.fib() + b.fib()
  }

}

class Number8130 : StressfulInteger {

  companion object {
    private var VALUE = 8130
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4065()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8129()
    val b = Number8128()
    return a.fib() + b.fib()
  }

}

class Number8131 : StressfulInteger {

  companion object {
    private var VALUE = 8131
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4065()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8130()
    val b = Number8129()
    return a.fib() + b.fib()
  }

}

class Number8132 : StressfulInteger {

  companion object {
    private var VALUE = 8132
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4066()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8131()
    val b = Number8130()
    return a.fib() + b.fib()
  }

}

class Number8133 : StressfulInteger {

  companion object {
    private var VALUE = 8133
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4066()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8132()
    val b = Number8131()
    return a.fib() + b.fib()
  }

}

class Number8134 : StressfulInteger {

  companion object {
    private var VALUE = 8134
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4067()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8133()
    val b = Number8132()
    return a.fib() + b.fib()
  }

}

class Number8135 : StressfulInteger {

  companion object {
    private var VALUE = 8135
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4067()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8134()
    val b = Number8133()
    return a.fib() + b.fib()
  }

}

class Number8136 : StressfulInteger {

  companion object {
    private var VALUE = 8136
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4068()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8135()
    val b = Number8134()
    return a.fib() + b.fib()
  }

}

class Number8137 : StressfulInteger {

  companion object {
    private var VALUE = 8137
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4068()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8136()
    val b = Number8135()
    return a.fib() + b.fib()
  }

}

class Number8138 : StressfulInteger {

  companion object {
    private var VALUE = 8138
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4069()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8137()
    val b = Number8136()
    return a.fib() + b.fib()
  }

}

class Number8139 : StressfulInteger {

  companion object {
    private var VALUE = 8139
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4069()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8138()
    val b = Number8137()
    return a.fib() + b.fib()
  }

}

class Number8140 : StressfulInteger {

  companion object {
    private var VALUE = 8140
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4070()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8139()
    val b = Number8138()
    return a.fib() + b.fib()
  }

}

class Number8141 : StressfulInteger {

  companion object {
    private var VALUE = 8141
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4070()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8140()
    val b = Number8139()
    return a.fib() + b.fib()
  }

}

class Number8142 : StressfulInteger {

  companion object {
    private var VALUE = 8142
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4071()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8141()
    val b = Number8140()
    return a.fib() + b.fib()
  }

}

class Number8143 : StressfulInteger {

  companion object {
    private var VALUE = 8143
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4071()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8142()
    val b = Number8141()
    return a.fib() + b.fib()
  }

}

class Number8144 : StressfulInteger {

  companion object {
    private var VALUE = 8144
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4072()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8143()
    val b = Number8142()
    return a.fib() + b.fib()
  }

}

class Number8145 : StressfulInteger {

  companion object {
    private var VALUE = 8145
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4072()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8144()
    val b = Number8143()
    return a.fib() + b.fib()
  }

}

class Number8146 : StressfulInteger {

  companion object {
    private var VALUE = 8146
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4073()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8145()
    val b = Number8144()
    return a.fib() + b.fib()
  }

}

class Number8147 : StressfulInteger {

  companion object {
    private var VALUE = 8147
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4073()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8146()
    val b = Number8145()
    return a.fib() + b.fib()
  }

}

class Number8148 : StressfulInteger {

  companion object {
    private var VALUE = 8148
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4074()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8147()
    val b = Number8146()
    return a.fib() + b.fib()
  }

}

class Number8149 : StressfulInteger {

  companion object {
    private var VALUE = 8149
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4074()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8148()
    val b = Number8147()
    return a.fib() + b.fib()
  }

}

class Number8150 : StressfulInteger {

  companion object {
    private var VALUE = 8150
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4075()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8149()
    val b = Number8148()
    return a.fib() + b.fib()
  }

}

class Number8151 : StressfulInteger {

  companion object {
    private var VALUE = 8151
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4075()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8150()
    val b = Number8149()
    return a.fib() + b.fib()
  }

}

class Number8152 : StressfulInteger {

  companion object {
    private var VALUE = 8152
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4076()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8151()
    val b = Number8150()
    return a.fib() + b.fib()
  }

}

class Number8153 : StressfulInteger {

  companion object {
    private var VALUE = 8153
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4076()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8152()
    val b = Number8151()
    return a.fib() + b.fib()
  }

}

class Number8154 : StressfulInteger {

  companion object {
    private var VALUE = 8154
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4077()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8153()
    val b = Number8152()
    return a.fib() + b.fib()
  }

}

class Number8155 : StressfulInteger {

  companion object {
    private var VALUE = 8155
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4077()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8154()
    val b = Number8153()
    return a.fib() + b.fib()
  }

}

class Number8156 : StressfulInteger {

  companion object {
    private var VALUE = 8156
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4078()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8155()
    val b = Number8154()
    return a.fib() + b.fib()
  }

}

class Number8157 : StressfulInteger {

  companion object {
    private var VALUE = 8157
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4078()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8156()
    val b = Number8155()
    return a.fib() + b.fib()
  }

}

class Number8158 : StressfulInteger {

  companion object {
    private var VALUE = 8158
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4079()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8157()
    val b = Number8156()
    return a.fib() + b.fib()
  }

}

class Number8159 : StressfulInteger {

  companion object {
    private var VALUE = 8159
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4079()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8158()
    val b = Number8157()
    return a.fib() + b.fib()
  }

}

class Number8160 : StressfulInteger {

  companion object {
    private var VALUE = 8160
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4080()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8159()
    val b = Number8158()
    return a.fib() + b.fib()
  }

}

class Number8161 : StressfulInteger {

  companion object {
    private var VALUE = 8161
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4080()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8160()
    val b = Number8159()
    return a.fib() + b.fib()
  }

}

class Number8162 : StressfulInteger {

  companion object {
    private var VALUE = 8162
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4081()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8161()
    val b = Number8160()
    return a.fib() + b.fib()
  }

}

class Number8163 : StressfulInteger {

  companion object {
    private var VALUE = 8163
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4081()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8162()
    val b = Number8161()
    return a.fib() + b.fib()
  }

}

class Number8164 : StressfulInteger {

  companion object {
    private var VALUE = 8164
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4082()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8163()
    val b = Number8162()
    return a.fib() + b.fib()
  }

}

class Number8165 : StressfulInteger {

  companion object {
    private var VALUE = 8165
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4082()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8164()
    val b = Number8163()
    return a.fib() + b.fib()
  }

}

class Number8166 : StressfulInteger {

  companion object {
    private var VALUE = 8166
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4083()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8165()
    val b = Number8164()
    return a.fib() + b.fib()
  }

}

class Number8167 : StressfulInteger {

  companion object {
    private var VALUE = 8167
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4083()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8166()
    val b = Number8165()
    return a.fib() + b.fib()
  }

}

class Number8168 : StressfulInteger {

  companion object {
    private var VALUE = 8168
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4084()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8167()
    val b = Number8166()
    return a.fib() + b.fib()
  }

}

class Number8169 : StressfulInteger {

  companion object {
    private var VALUE = 8169
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4084()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8168()
    val b = Number8167()
    return a.fib() + b.fib()
  }

}

class Number8170 : StressfulInteger {

  companion object {
    private var VALUE = 8170
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4085()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8169()
    val b = Number8168()
    return a.fib() + b.fib()
  }

}

class Number8171 : StressfulInteger {

  companion object {
    private var VALUE = 8171
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4085()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8170()
    val b = Number8169()
    return a.fib() + b.fib()
  }

}

class Number8172 : StressfulInteger {

  companion object {
    private var VALUE = 8172
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4086()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8171()
    val b = Number8170()
    return a.fib() + b.fib()
  }

}

class Number8173 : StressfulInteger {

  companion object {
    private var VALUE = 8173
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4086()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8172()
    val b = Number8171()
    return a.fib() + b.fib()
  }

}

class Number8174 : StressfulInteger {

  companion object {
    private var VALUE = 8174
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4087()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8173()
    val b = Number8172()
    return a.fib() + b.fib()
  }

}

class Number8175 : StressfulInteger {

  companion object {
    private var VALUE = 8175
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4087()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8174()
    val b = Number8173()
    return a.fib() + b.fib()
  }

}

class Number8176 : StressfulInteger {

  companion object {
    private var VALUE = 8176
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4088()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8175()
    val b = Number8174()
    return a.fib() + b.fib()
  }

}

class Number8177 : StressfulInteger {

  companion object {
    private var VALUE = 8177
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4088()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8176()
    val b = Number8175()
    return a.fib() + b.fib()
  }

}

class Number8178 : StressfulInteger {

  companion object {
    private var VALUE = 8178
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4089()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8177()
    val b = Number8176()
    return a.fib() + b.fib()
  }

}

class Number8179 : StressfulInteger {

  companion object {
    private var VALUE = 8179
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4089()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8178()
    val b = Number8177()
    return a.fib() + b.fib()
  }

}

class Number8180 : StressfulInteger {

  companion object {
    private var VALUE = 8180
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4090()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8179()
    val b = Number8178()
    return a.fib() + b.fib()
  }

}

class Number8181 : StressfulInteger {

  companion object {
    private var VALUE = 8181
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4090()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8180()
    val b = Number8179()
    return a.fib() + b.fib()
  }

}

class Number8182 : StressfulInteger {

  companion object {
    private var VALUE = 8182
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4091()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8181()
    val b = Number8180()
    return a.fib() + b.fib()
  }

}

class Number8183 : StressfulInteger {

  companion object {
    private var VALUE = 8183
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4091()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8182()
    val b = Number8181()
    return a.fib() + b.fib()
  }

}

class Number8184 : StressfulInteger {

  companion object {
    private var VALUE = 8184
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4092()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8183()
    val b = Number8182()
    return a.fib() + b.fib()
  }

}

class Number8185 : StressfulInteger {

  companion object {
    private var VALUE = 8185
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4092()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8184()
    val b = Number8183()
    return a.fib() + b.fib()
  }

}

class Number8186 : StressfulInteger {

  companion object {
    private var VALUE = 8186
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4093()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8185()
    val b = Number8184()
    return a.fib() + b.fib()
  }

}

class Number8187 : StressfulInteger {

  companion object {
    private var VALUE = 8187
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4093()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8186()
    val b = Number8185()
    return a.fib() + b.fib()
  }

}

class Number8188 : StressfulInteger {

  companion object {
    private var VALUE = 8188
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4094()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8187()
    val b = Number8186()
    return a.fib() + b.fib()
  }

}

class Number8189 : StressfulInteger {

  companion object {
    private var VALUE = 8189
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4094()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8188()
    val b = Number8187()
    return a.fib() + b.fib()
  }

}

class Number8190 : StressfulInteger {

  companion object {
    private var VALUE = 8190
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4095()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8189()
    val b = Number8188()
    return a.fib() + b.fib()
  }

}

class Number8191 : StressfulInteger {

  companion object {
    private var VALUE = 8191
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4095()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8190()
    val b = Number8189()
    return a.fib() + b.fib()
  }

}

class Number8192 : StressfulInteger {

  companion object {
    private var VALUE = 8192
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4096()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8191()
    val b = Number8190()
    return a.fib() + b.fib()
  }

}

class Number8193 : StressfulInteger {

  companion object {
    private var VALUE = 8193
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4096()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8192()
    val b = Number8191()
    return a.fib() + b.fib()
  }

}

class Number8194 : StressfulInteger {

  companion object {
    private var VALUE = 8194
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4097()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8193()
    val b = Number8192()
    return a.fib() + b.fib()
  }

}

class Number8195 : StressfulInteger {

  companion object {
    private var VALUE = 8195
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4097()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8194()
    val b = Number8193()
    return a.fib() + b.fib()
  }

}

class Number8196 : StressfulInteger {

  companion object {
    private var VALUE = 8196
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4098()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8195()
    val b = Number8194()
    return a.fib() + b.fib()
  }

}

class Number8197 : StressfulInteger {

  companion object {
    private var VALUE = 8197
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4098()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8196()
    val b = Number8195()
    return a.fib() + b.fib()
  }

}

class Number8198 : StressfulInteger {

  companion object {
    private var VALUE = 8198
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4099()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8197()
    val b = Number8196()
    return a.fib() + b.fib()
  }

}

class Number8199 : StressfulInteger {

  companion object {
    private var VALUE = 8199
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4099()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8198()
    val b = Number8197()
    return a.fib() + b.fib()
  }

}

class Number8200 : StressfulInteger {

  companion object {
    private var VALUE = 8200
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4100()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8199()
    val b = Number8198()
    return a.fib() + b.fib()
  }

}

class Number8201 : StressfulInteger {

  companion object {
    private var VALUE = 8201
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4100()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8200()
    val b = Number8199()
    return a.fib() + b.fib()
  }

}

class Number8202 : StressfulInteger {

  companion object {
    private var VALUE = 8202
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4101()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8201()
    val b = Number8200()
    return a.fib() + b.fib()
  }

}

class Number8203 : StressfulInteger {

  companion object {
    private var VALUE = 8203
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4101()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8202()
    val b = Number8201()
    return a.fib() + b.fib()
  }

}

class Number8204 : StressfulInteger {

  companion object {
    private var VALUE = 8204
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4102()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8203()
    val b = Number8202()
    return a.fib() + b.fib()
  }

}

class Number8205 : StressfulInteger {

  companion object {
    private var VALUE = 8205
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4102()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8204()
    val b = Number8203()
    return a.fib() + b.fib()
  }

}

class Number8206 : StressfulInteger {

  companion object {
    private var VALUE = 8206
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4103()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8205()
    val b = Number8204()
    return a.fib() + b.fib()
  }

}

class Number8207 : StressfulInteger {

  companion object {
    private var VALUE = 8207
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4103()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8206()
    val b = Number8205()
    return a.fib() + b.fib()
  }

}

class Number8208 : StressfulInteger {

  companion object {
    private var VALUE = 8208
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4104()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8207()
    val b = Number8206()
    return a.fib() + b.fib()
  }

}

class Number8209 : StressfulInteger {

  companion object {
    private var VALUE = 8209
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4104()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8208()
    val b = Number8207()
    return a.fib() + b.fib()
  }

}

class Number8210 : StressfulInteger {

  companion object {
    private var VALUE = 8210
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4105()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8209()
    val b = Number8208()
    return a.fib() + b.fib()
  }

}

class Number8211 : StressfulInteger {

  companion object {
    private var VALUE = 8211
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4105()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8210()
    val b = Number8209()
    return a.fib() + b.fib()
  }

}

class Number8212 : StressfulInteger {

  companion object {
    private var VALUE = 8212
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4106()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8211()
    val b = Number8210()
    return a.fib() + b.fib()
  }

}

class Number8213 : StressfulInteger {

  companion object {
    private var VALUE = 8213
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4106()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8212()
    val b = Number8211()
    return a.fib() + b.fib()
  }

}

class Number8214 : StressfulInteger {

  companion object {
    private var VALUE = 8214
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4107()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8213()
    val b = Number8212()
    return a.fib() + b.fib()
  }

}

class Number8215 : StressfulInteger {

  companion object {
    private var VALUE = 8215
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4107()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8214()
    val b = Number8213()
    return a.fib() + b.fib()
  }

}

class Number8216 : StressfulInteger {

  companion object {
    private var VALUE = 8216
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4108()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8215()
    val b = Number8214()
    return a.fib() + b.fib()
  }

}

class Number8217 : StressfulInteger {

  companion object {
    private var VALUE = 8217
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4108()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8216()
    val b = Number8215()
    return a.fib() + b.fib()
  }

}

class Number8218 : StressfulInteger {

  companion object {
    private var VALUE = 8218
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4109()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8217()
    val b = Number8216()
    return a.fib() + b.fib()
  }

}

class Number8219 : StressfulInteger {

  companion object {
    private var VALUE = 8219
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4109()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8218()
    val b = Number8217()
    return a.fib() + b.fib()
  }

}

class Number8220 : StressfulInteger {

  companion object {
    private var VALUE = 8220
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4110()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8219()
    val b = Number8218()
    return a.fib() + b.fib()
  }

}

class Number8221 : StressfulInteger {

  companion object {
    private var VALUE = 8221
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4110()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8220()
    val b = Number8219()
    return a.fib() + b.fib()
  }

}

class Number8222 : StressfulInteger {

  companion object {
    private var VALUE = 8222
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4111()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8221()
    val b = Number8220()
    return a.fib() + b.fib()
  }

}

class Number8223 : StressfulInteger {

  companion object {
    private var VALUE = 8223
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4111()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8222()
    val b = Number8221()
    return a.fib() + b.fib()
  }

}

class Number8224 : StressfulInteger {

  companion object {
    private var VALUE = 8224
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4112()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8223()
    val b = Number8222()
    return a.fib() + b.fib()
  }

}

class Number8225 : StressfulInteger {

  companion object {
    private var VALUE = 8225
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4112()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8224()
    val b = Number8223()
    return a.fib() + b.fib()
  }

}

class Number8226 : StressfulInteger {

  companion object {
    private var VALUE = 8226
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4113()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8225()
    val b = Number8224()
    return a.fib() + b.fib()
  }

}

class Number8227 : StressfulInteger {

  companion object {
    private var VALUE = 8227
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4113()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8226()
    val b = Number8225()
    return a.fib() + b.fib()
  }

}

class Number8228 : StressfulInteger {

  companion object {
    private var VALUE = 8228
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4114()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8227()
    val b = Number8226()
    return a.fib() + b.fib()
  }

}

class Number8229 : StressfulInteger {

  companion object {
    private var VALUE = 8229
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4114()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8228()
    val b = Number8227()
    return a.fib() + b.fib()
  }

}

class Number8230 : StressfulInteger {

  companion object {
    private var VALUE = 8230
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4115()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8229()
    val b = Number8228()
    return a.fib() + b.fib()
  }

}

class Number8231 : StressfulInteger {

  companion object {
    private var VALUE = 8231
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4115()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8230()
    val b = Number8229()
    return a.fib() + b.fib()
  }

}

class Number8232 : StressfulInteger {

  companion object {
    private var VALUE = 8232
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4116()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8231()
    val b = Number8230()
    return a.fib() + b.fib()
  }

}

class Number8233 : StressfulInteger {

  companion object {
    private var VALUE = 8233
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4116()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8232()
    val b = Number8231()
    return a.fib() + b.fib()
  }

}

class Number8234 : StressfulInteger {

  companion object {
    private var VALUE = 8234
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4117()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8233()
    val b = Number8232()
    return a.fib() + b.fib()
  }

}

class Number8235 : StressfulInteger {

  companion object {
    private var VALUE = 8235
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4117()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8234()
    val b = Number8233()
    return a.fib() + b.fib()
  }

}

class Number8236 : StressfulInteger {

  companion object {
    private var VALUE = 8236
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4118()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8235()
    val b = Number8234()
    return a.fib() + b.fib()
  }

}

class Number8237 : StressfulInteger {

  companion object {
    private var VALUE = 8237
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4118()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8236()
    val b = Number8235()
    return a.fib() + b.fib()
  }

}

class Number8238 : StressfulInteger {

  companion object {
    private var VALUE = 8238
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4119()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8237()
    val b = Number8236()
    return a.fib() + b.fib()
  }

}

class Number8239 : StressfulInteger {

  companion object {
    private var VALUE = 8239
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4119()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8238()
    val b = Number8237()
    return a.fib() + b.fib()
  }

}

class Number8240 : StressfulInteger {

  companion object {
    private var VALUE = 8240
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4120()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8239()
    val b = Number8238()
    return a.fib() + b.fib()
  }

}

class Number8241 : StressfulInteger {

  companion object {
    private var VALUE = 8241
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4120()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8240()
    val b = Number8239()
    return a.fib() + b.fib()
  }

}

class Number8242 : StressfulInteger {

  companion object {
    private var VALUE = 8242
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4121()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8241()
    val b = Number8240()
    return a.fib() + b.fib()
  }

}

class Number8243 : StressfulInteger {

  companion object {
    private var VALUE = 8243
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4121()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8242()
    val b = Number8241()
    return a.fib() + b.fib()
  }

}

class Number8244 : StressfulInteger {

  companion object {
    private var VALUE = 8244
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4122()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8243()
    val b = Number8242()
    return a.fib() + b.fib()
  }

}

class Number8245 : StressfulInteger {

  companion object {
    private var VALUE = 8245
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4122()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8244()
    val b = Number8243()
    return a.fib() + b.fib()
  }

}

class Number8246 : StressfulInteger {

  companion object {
    private var VALUE = 8246
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4123()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8245()
    val b = Number8244()
    return a.fib() + b.fib()
  }

}

class Number8247 : StressfulInteger {

  companion object {
    private var VALUE = 8247
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4123()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8246()
    val b = Number8245()
    return a.fib() + b.fib()
  }

}

class Number8248 : StressfulInteger {

  companion object {
    private var VALUE = 8248
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4124()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8247()
    val b = Number8246()
    return a.fib() + b.fib()
  }

}

class Number8249 : StressfulInteger {

  companion object {
    private var VALUE = 8249
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4124()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8248()
    val b = Number8247()
    return a.fib() + b.fib()
  }

}

class Number8250 : StressfulInteger {

  companion object {
    private var VALUE = 8250
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4125()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8249()
    val b = Number8248()
    return a.fib() + b.fib()
  }

}

class Number8251 : StressfulInteger {

  companion object {
    private var VALUE = 8251
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4125()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8250()
    val b = Number8249()
    return a.fib() + b.fib()
  }

}

class Number8252 : StressfulInteger {

  companion object {
    private var VALUE = 8252
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4126()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8251()
    val b = Number8250()
    return a.fib() + b.fib()
  }

}

class Number8253 : StressfulInteger {

  companion object {
    private var VALUE = 8253
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4126()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8252()
    val b = Number8251()
    return a.fib() + b.fib()
  }

}

class Number8254 : StressfulInteger {

  companion object {
    private var VALUE = 8254
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4127()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8253()
    val b = Number8252()
    return a.fib() + b.fib()
  }

}

class Number8255 : StressfulInteger {

  companion object {
    private var VALUE = 8255
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4127()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8254()
    val b = Number8253()
    return a.fib() + b.fib()
  }

}

class Number8256 : StressfulInteger {

  companion object {
    private var VALUE = 8256
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4128()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8255()
    val b = Number8254()
    return a.fib() + b.fib()
  }

}

class Number8257 : StressfulInteger {

  companion object {
    private var VALUE = 8257
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4128()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8256()
    val b = Number8255()
    return a.fib() + b.fib()
  }

}

class Number8258 : StressfulInteger {

  companion object {
    private var VALUE = 8258
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4129()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8257()
    val b = Number8256()
    return a.fib() + b.fib()
  }

}

class Number8259 : StressfulInteger {

  companion object {
    private var VALUE = 8259
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4129()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8258()
    val b = Number8257()
    return a.fib() + b.fib()
  }

}

class Number8260 : StressfulInteger {

  companion object {
    private var VALUE = 8260
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4130()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8259()
    val b = Number8258()
    return a.fib() + b.fib()
  }

}

class Number8261 : StressfulInteger {

  companion object {
    private var VALUE = 8261
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4130()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8260()
    val b = Number8259()
    return a.fib() + b.fib()
  }

}

class Number8262 : StressfulInteger {

  companion object {
    private var VALUE = 8262
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4131()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8261()
    val b = Number8260()
    return a.fib() + b.fib()
  }

}

class Number8263 : StressfulInteger {

  companion object {
    private var VALUE = 8263
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4131()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8262()
    val b = Number8261()
    return a.fib() + b.fib()
  }

}

class Number8264 : StressfulInteger {

  companion object {
    private var VALUE = 8264
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4132()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8263()
    val b = Number8262()
    return a.fib() + b.fib()
  }

}

class Number8265 : StressfulInteger {

  companion object {
    private var VALUE = 8265
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4132()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8264()
    val b = Number8263()
    return a.fib() + b.fib()
  }

}

class Number8266 : StressfulInteger {

  companion object {
    private var VALUE = 8266
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4133()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8265()
    val b = Number8264()
    return a.fib() + b.fib()
  }

}

class Number8267 : StressfulInteger {

  companion object {
    private var VALUE = 8267
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4133()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8266()
    val b = Number8265()
    return a.fib() + b.fib()
  }

}

class Number8268 : StressfulInteger {

  companion object {
    private var VALUE = 8268
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4134()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8267()
    val b = Number8266()
    return a.fib() + b.fib()
  }

}

class Number8269 : StressfulInteger {

  companion object {
    private var VALUE = 8269
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4134()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8268()
    val b = Number8267()
    return a.fib() + b.fib()
  }

}

class Number8270 : StressfulInteger {

  companion object {
    private var VALUE = 8270
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4135()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8269()
    val b = Number8268()
    return a.fib() + b.fib()
  }

}

class Number8271 : StressfulInteger {

  companion object {
    private var VALUE = 8271
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4135()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8270()
    val b = Number8269()
    return a.fib() + b.fib()
  }

}

class Number8272 : StressfulInteger {

  companion object {
    private var VALUE = 8272
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4136()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8271()
    val b = Number8270()
    return a.fib() + b.fib()
  }

}

class Number8273 : StressfulInteger {

  companion object {
    private var VALUE = 8273
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4136()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8272()
    val b = Number8271()
    return a.fib() + b.fib()
  }

}

class Number8274 : StressfulInteger {

  companion object {
    private var VALUE = 8274
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4137()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8273()
    val b = Number8272()
    return a.fib() + b.fib()
  }

}

class Number8275 : StressfulInteger {

  companion object {
    private var VALUE = 8275
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4137()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8274()
    val b = Number8273()
    return a.fib() + b.fib()
  }

}

class Number8276 : StressfulInteger {

  companion object {
    private var VALUE = 8276
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4138()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8275()
    val b = Number8274()
    return a.fib() + b.fib()
  }

}

class Number8277 : StressfulInteger {

  companion object {
    private var VALUE = 8277
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4138()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8276()
    val b = Number8275()
    return a.fib() + b.fib()
  }

}

class Number8278 : StressfulInteger {

  companion object {
    private var VALUE = 8278
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4139()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8277()
    val b = Number8276()
    return a.fib() + b.fib()
  }

}

class Number8279 : StressfulInteger {

  companion object {
    private var VALUE = 8279
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4139()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8278()
    val b = Number8277()
    return a.fib() + b.fib()
  }

}

class Number8280 : StressfulInteger {

  companion object {
    private var VALUE = 8280
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4140()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8279()
    val b = Number8278()
    return a.fib() + b.fib()
  }

}

class Number8281 : StressfulInteger {

  companion object {
    private var VALUE = 8281
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4140()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8280()
    val b = Number8279()
    return a.fib() + b.fib()
  }

}

class Number8282 : StressfulInteger {

  companion object {
    private var VALUE = 8282
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4141()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8281()
    val b = Number8280()
    return a.fib() + b.fib()
  }

}

class Number8283 : StressfulInteger {

  companion object {
    private var VALUE = 8283
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4141()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8282()
    val b = Number8281()
    return a.fib() + b.fib()
  }

}

class Number8284 : StressfulInteger {

  companion object {
    private var VALUE = 8284
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4142()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8283()
    val b = Number8282()
    return a.fib() + b.fib()
  }

}

class Number8285 : StressfulInteger {

  companion object {
    private var VALUE = 8285
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4142()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8284()
    val b = Number8283()
    return a.fib() + b.fib()
  }

}

class Number8286 : StressfulInteger {

  companion object {
    private var VALUE = 8286
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4143()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8285()
    val b = Number8284()
    return a.fib() + b.fib()
  }

}

class Number8287 : StressfulInteger {

  companion object {
    private var VALUE = 8287
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4143()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8286()
    val b = Number8285()
    return a.fib() + b.fib()
  }

}

class Number8288 : StressfulInteger {

  companion object {
    private var VALUE = 8288
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4144()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8287()
    val b = Number8286()
    return a.fib() + b.fib()
  }

}

class Number8289 : StressfulInteger {

  companion object {
    private var VALUE = 8289
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4144()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8288()
    val b = Number8287()
    return a.fib() + b.fib()
  }

}

class Number8290 : StressfulInteger {

  companion object {
    private var VALUE = 8290
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4145()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8289()
    val b = Number8288()
    return a.fib() + b.fib()
  }

}

class Number8291 : StressfulInteger {

  companion object {
    private var VALUE = 8291
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4145()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8290()
    val b = Number8289()
    return a.fib() + b.fib()
  }

}

class Number8292 : StressfulInteger {

  companion object {
    private var VALUE = 8292
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4146()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8291()
    val b = Number8290()
    return a.fib() + b.fib()
  }

}

class Number8293 : StressfulInteger {

  companion object {
    private var VALUE = 8293
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4146()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8292()
    val b = Number8291()
    return a.fib() + b.fib()
  }

}

class Number8294 : StressfulInteger {

  companion object {
    private var VALUE = 8294
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4147()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8293()
    val b = Number8292()
    return a.fib() + b.fib()
  }

}

class Number8295 : StressfulInteger {

  companion object {
    private var VALUE = 8295
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4147()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8294()
    val b = Number8293()
    return a.fib() + b.fib()
  }

}

class Number8296 : StressfulInteger {

  companion object {
    private var VALUE = 8296
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4148()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8295()
    val b = Number8294()
    return a.fib() + b.fib()
  }

}

class Number8297 : StressfulInteger {

  companion object {
    private var VALUE = 8297
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4148()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8296()
    val b = Number8295()
    return a.fib() + b.fib()
  }

}

class Number8298 : StressfulInteger {

  companion object {
    private var VALUE = 8298
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4149()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8297()
    val b = Number8296()
    return a.fib() + b.fib()
  }

}

class Number8299 : StressfulInteger {

  companion object {
    private var VALUE = 8299
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4149()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8298()
    val b = Number8297()
    return a.fib() + b.fib()
  }

}

class Number8300 : StressfulInteger {

  companion object {
    private var VALUE = 8300
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4150()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8299()
    val b = Number8298()
    return a.fib() + b.fib()
  }

}

class Number8301 : StressfulInteger {

  companion object {
    private var VALUE = 8301
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4150()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8300()
    val b = Number8299()
    return a.fib() + b.fib()
  }

}

class Number8302 : StressfulInteger {

  companion object {
    private var VALUE = 8302
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4151()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8301()
    val b = Number8300()
    return a.fib() + b.fib()
  }

}

class Number8303 : StressfulInteger {

  companion object {
    private var VALUE = 8303
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4151()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8302()
    val b = Number8301()
    return a.fib() + b.fib()
  }

}

class Number8304 : StressfulInteger {

  companion object {
    private var VALUE = 8304
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4152()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8303()
    val b = Number8302()
    return a.fib() + b.fib()
  }

}

class Number8305 : StressfulInteger {

  companion object {
    private var VALUE = 8305
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4152()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8304()
    val b = Number8303()
    return a.fib() + b.fib()
  }

}

class Number8306 : StressfulInteger {

  companion object {
    private var VALUE = 8306
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4153()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8305()
    val b = Number8304()
    return a.fib() + b.fib()
  }

}

class Number8307 : StressfulInteger {

  companion object {
    private var VALUE = 8307
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4153()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8306()
    val b = Number8305()
    return a.fib() + b.fib()
  }

}

class Number8308 : StressfulInteger {

  companion object {
    private var VALUE = 8308
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4154()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8307()
    val b = Number8306()
    return a.fib() + b.fib()
  }

}

class Number8309 : StressfulInteger {

  companion object {
    private var VALUE = 8309
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4154()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8308()
    val b = Number8307()
    return a.fib() + b.fib()
  }

}

class Number8310 : StressfulInteger {

  companion object {
    private var VALUE = 8310
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4155()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8309()
    val b = Number8308()
    return a.fib() + b.fib()
  }

}

class Number8311 : StressfulInteger {

  companion object {
    private var VALUE = 8311
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4155()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8310()
    val b = Number8309()
    return a.fib() + b.fib()
  }

}

class Number8312 : StressfulInteger {

  companion object {
    private var VALUE = 8312
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4156()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8311()
    val b = Number8310()
    return a.fib() + b.fib()
  }

}

class Number8313 : StressfulInteger {

  companion object {
    private var VALUE = 8313
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4156()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8312()
    val b = Number8311()
    return a.fib() + b.fib()
  }

}

class Number8314 : StressfulInteger {

  companion object {
    private var VALUE = 8314
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4157()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8313()
    val b = Number8312()
    return a.fib() + b.fib()
  }

}

class Number8315 : StressfulInteger {

  companion object {
    private var VALUE = 8315
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4157()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8314()
    val b = Number8313()
    return a.fib() + b.fib()
  }

}

class Number8316 : StressfulInteger {

  companion object {
    private var VALUE = 8316
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4158()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8315()
    val b = Number8314()
    return a.fib() + b.fib()
  }

}

class Number8317 : StressfulInteger {

  companion object {
    private var VALUE = 8317
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4158()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8316()
    val b = Number8315()
    return a.fib() + b.fib()
  }

}

class Number8318 : StressfulInteger {

  companion object {
    private var VALUE = 8318
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4159()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8317()
    val b = Number8316()
    return a.fib() + b.fib()
  }

}

class Number8319 : StressfulInteger {

  companion object {
    private var VALUE = 8319
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4159()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8318()
    val b = Number8317()
    return a.fib() + b.fib()
  }

}

class Number8320 : StressfulInteger {

  companion object {
    private var VALUE = 8320
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4160()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8319()
    val b = Number8318()
    return a.fib() + b.fib()
  }

}

class Number8321 : StressfulInteger {

  companion object {
    private var VALUE = 8321
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4160()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8320()
    val b = Number8319()
    return a.fib() + b.fib()
  }

}

class Number8322 : StressfulInteger {

  companion object {
    private var VALUE = 8322
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4161()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8321()
    val b = Number8320()
    return a.fib() + b.fib()
  }

}

class Number8323 : StressfulInteger {

  companion object {
    private var VALUE = 8323
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4161()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8322()
    val b = Number8321()
    return a.fib() + b.fib()
  }

}

class Number8324 : StressfulInteger {

  companion object {
    private var VALUE = 8324
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4162()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8323()
    val b = Number8322()
    return a.fib() + b.fib()
  }

}

class Number8325 : StressfulInteger {

  companion object {
    private var VALUE = 8325
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4162()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8324()
    val b = Number8323()
    return a.fib() + b.fib()
  }

}

class Number8326 : StressfulInteger {

  companion object {
    private var VALUE = 8326
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4163()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8325()
    val b = Number8324()
    return a.fib() + b.fib()
  }

}

class Number8327 : StressfulInteger {

  companion object {
    private var VALUE = 8327
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4163()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8326()
    val b = Number8325()
    return a.fib() + b.fib()
  }

}

class Number8328 : StressfulInteger {

  companion object {
    private var VALUE = 8328
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4164()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8327()
    val b = Number8326()
    return a.fib() + b.fib()
  }

}

class Number8329 : StressfulInteger {

  companion object {
    private var VALUE = 8329
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4164()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8328()
    val b = Number8327()
    return a.fib() + b.fib()
  }

}

class Number8330 : StressfulInteger {

  companion object {
    private var VALUE = 8330
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4165()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8329()
    val b = Number8328()
    return a.fib() + b.fib()
  }

}

class Number8331 : StressfulInteger {

  companion object {
    private var VALUE = 8331
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4165()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8330()
    val b = Number8329()
    return a.fib() + b.fib()
  }

}

class Number8332 : StressfulInteger {

  companion object {
    private var VALUE = 8332
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4166()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8331()
    val b = Number8330()
    return a.fib() + b.fib()
  }

}

class Number8333 : StressfulInteger {

  companion object {
    private var VALUE = 8333
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4166()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8332()
    val b = Number8331()
    return a.fib() + b.fib()
  }

}

class Number8334 : StressfulInteger {

  companion object {
    private var VALUE = 8334
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4167()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8333()
    val b = Number8332()
    return a.fib() + b.fib()
  }

}

class Number8335 : StressfulInteger {

  companion object {
    private var VALUE = 8335
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4167()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8334()
    val b = Number8333()
    return a.fib() + b.fib()
  }

}

class Number8336 : StressfulInteger {

  companion object {
    private var VALUE = 8336
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4168()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8335()
    val b = Number8334()
    return a.fib() + b.fib()
  }

}

class Number8337 : StressfulInteger {

  companion object {
    private var VALUE = 8337
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4168()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8336()
    val b = Number8335()
    return a.fib() + b.fib()
  }

}

class Number8338 : StressfulInteger {

  companion object {
    private var VALUE = 8338
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4169()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8337()
    val b = Number8336()
    return a.fib() + b.fib()
  }

}

class Number8339 : StressfulInteger {

  companion object {
    private var VALUE = 8339
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4169()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8338()
    val b = Number8337()
    return a.fib() + b.fib()
  }

}

class Number8340 : StressfulInteger {

  companion object {
    private var VALUE = 8340
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4170()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8339()
    val b = Number8338()
    return a.fib() + b.fib()
  }

}

class Number8341 : StressfulInteger {

  companion object {
    private var VALUE = 8341
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4170()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8340()
    val b = Number8339()
    return a.fib() + b.fib()
  }

}

class Number8342 : StressfulInteger {

  companion object {
    private var VALUE = 8342
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4171()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8341()
    val b = Number8340()
    return a.fib() + b.fib()
  }

}

class Number8343 : StressfulInteger {

  companion object {
    private var VALUE = 8343
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4171()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8342()
    val b = Number8341()
    return a.fib() + b.fib()
  }

}

class Number8344 : StressfulInteger {

  companion object {
    private var VALUE = 8344
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4172()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8343()
    val b = Number8342()
    return a.fib() + b.fib()
  }

}

class Number8345 : StressfulInteger {

  companion object {
    private var VALUE = 8345
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4172()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8344()
    val b = Number8343()
    return a.fib() + b.fib()
  }

}

class Number8346 : StressfulInteger {

  companion object {
    private var VALUE = 8346
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4173()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8345()
    val b = Number8344()
    return a.fib() + b.fib()
  }

}

class Number8347 : StressfulInteger {

  companion object {
    private var VALUE = 8347
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4173()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8346()
    val b = Number8345()
    return a.fib() + b.fib()
  }

}

class Number8348 : StressfulInteger {

  companion object {
    private var VALUE = 8348
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4174()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8347()
    val b = Number8346()
    return a.fib() + b.fib()
  }

}

class Number8349 : StressfulInteger {

  companion object {
    private var VALUE = 8349
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4174()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8348()
    val b = Number8347()
    return a.fib() + b.fib()
  }

}

class Number8350 : StressfulInteger {

  companion object {
    private var VALUE = 8350
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4175()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8349()
    val b = Number8348()
    return a.fib() + b.fib()
  }

}

class Number8351 : StressfulInteger {

  companion object {
    private var VALUE = 8351
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4175()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8350()
    val b = Number8349()
    return a.fib() + b.fib()
  }

}

class Number8352 : StressfulInteger {

  companion object {
    private var VALUE = 8352
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4176()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8351()
    val b = Number8350()
    return a.fib() + b.fib()
  }

}

class Number8353 : StressfulInteger {

  companion object {
    private var VALUE = 8353
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4176()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8352()
    val b = Number8351()
    return a.fib() + b.fib()
  }

}

class Number8354 : StressfulInteger {

  companion object {
    private var VALUE = 8354
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4177()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8353()
    val b = Number8352()
    return a.fib() + b.fib()
  }

}

class Number8355 : StressfulInteger {

  companion object {
    private var VALUE = 8355
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4177()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8354()
    val b = Number8353()
    return a.fib() + b.fib()
  }

}

class Number8356 : StressfulInteger {

  companion object {
    private var VALUE = 8356
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4178()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8355()
    val b = Number8354()
    return a.fib() + b.fib()
  }

}

class Number8357 : StressfulInteger {

  companion object {
    private var VALUE = 8357
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4178()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8356()
    val b = Number8355()
    return a.fib() + b.fib()
  }

}

class Number8358 : StressfulInteger {

  companion object {
    private var VALUE = 8358
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4179()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8357()
    val b = Number8356()
    return a.fib() + b.fib()
  }

}

class Number8359 : StressfulInteger {

  companion object {
    private var VALUE = 8359
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4179()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8358()
    val b = Number8357()
    return a.fib() + b.fib()
  }

}

class Number8360 : StressfulInteger {

  companion object {
    private var VALUE = 8360
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4180()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8359()
    val b = Number8358()
    return a.fib() + b.fib()
  }

}

class Number8361 : StressfulInteger {

  companion object {
    private var VALUE = 8361
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4180()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8360()
    val b = Number8359()
    return a.fib() + b.fib()
  }

}

class Number8362 : StressfulInteger {

  companion object {
    private var VALUE = 8362
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4181()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8361()
    val b = Number8360()
    return a.fib() + b.fib()
  }

}

class Number8363 : StressfulInteger {

  companion object {
    private var VALUE = 8363
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4181()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8362()
    val b = Number8361()
    return a.fib() + b.fib()
  }

}

class Number8364 : StressfulInteger {

  companion object {
    private var VALUE = 8364
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4182()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8363()
    val b = Number8362()
    return a.fib() + b.fib()
  }

}

class Number8365 : StressfulInteger {

  companion object {
    private var VALUE = 8365
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4182()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8364()
    val b = Number8363()
    return a.fib() + b.fib()
  }

}

class Number8366 : StressfulInteger {

  companion object {
    private var VALUE = 8366
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4183()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8365()
    val b = Number8364()
    return a.fib() + b.fib()
  }

}

class Number8367 : StressfulInteger {

  companion object {
    private var VALUE = 8367
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4183()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8366()
    val b = Number8365()
    return a.fib() + b.fib()
  }

}

class Number8368 : StressfulInteger {

  companion object {
    private var VALUE = 8368
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4184()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8367()
    val b = Number8366()
    return a.fib() + b.fib()
  }

}

class Number8369 : StressfulInteger {

  companion object {
    private var VALUE = 8369
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4184()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8368()
    val b = Number8367()
    return a.fib() + b.fib()
  }

}

class Number8370 : StressfulInteger {

  companion object {
    private var VALUE = 8370
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4185()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8369()
    val b = Number8368()
    return a.fib() + b.fib()
  }

}

class Number8371 : StressfulInteger {

  companion object {
    private var VALUE = 8371
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4185()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8370()
    val b = Number8369()
    return a.fib() + b.fib()
  }

}

class Number8372 : StressfulInteger {

  companion object {
    private var VALUE = 8372
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4186()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8371()
    val b = Number8370()
    return a.fib() + b.fib()
  }

}

class Number8373 : StressfulInteger {

  companion object {
    private var VALUE = 8373
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4186()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8372()
    val b = Number8371()
    return a.fib() + b.fib()
  }

}

class Number8374 : StressfulInteger {

  companion object {
    private var VALUE = 8374
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4187()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8373()
    val b = Number8372()
    return a.fib() + b.fib()
  }

}

class Number8375 : StressfulInteger {

  companion object {
    private var VALUE = 8375
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4187()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8374()
    val b = Number8373()
    return a.fib() + b.fib()
  }

}

class Number8376 : StressfulInteger {

  companion object {
    private var VALUE = 8376
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4188()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8375()
    val b = Number8374()
    return a.fib() + b.fib()
  }

}

class Number8377 : StressfulInteger {

  companion object {
    private var VALUE = 8377
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4188()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8376()
    val b = Number8375()
    return a.fib() + b.fib()
  }

}

class Number8378 : StressfulInteger {

  companion object {
    private var VALUE = 8378
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4189()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8377()
    val b = Number8376()
    return a.fib() + b.fib()
  }

}

class Number8379 : StressfulInteger {

  companion object {
    private var VALUE = 8379
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4189()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8378()
    val b = Number8377()
    return a.fib() + b.fib()
  }

}

class Number8380 : StressfulInteger {

  companion object {
    private var VALUE = 8380
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4190()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8379()
    val b = Number8378()
    return a.fib() + b.fib()
  }

}

class Number8381 : StressfulInteger {

  companion object {
    private var VALUE = 8381
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4190()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8380()
    val b = Number8379()
    return a.fib() + b.fib()
  }

}

class Number8382 : StressfulInteger {

  companion object {
    private var VALUE = 8382
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4191()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8381()
    val b = Number8380()
    return a.fib() + b.fib()
  }

}

class Number8383 : StressfulInteger {

  companion object {
    private var VALUE = 8383
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4191()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8382()
    val b = Number8381()
    return a.fib() + b.fib()
  }

}

class Number8384 : StressfulInteger {

  companion object {
    private var VALUE = 8384
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4192()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8383()
    val b = Number8382()
    return a.fib() + b.fib()
  }

}

class Number8385 : StressfulInteger {

  companion object {
    private var VALUE = 8385
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4192()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8384()
    val b = Number8383()
    return a.fib() + b.fib()
  }

}

class Number8386 : StressfulInteger {

  companion object {
    private var VALUE = 8386
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4193()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8385()
    val b = Number8384()
    return a.fib() + b.fib()
  }

}

class Number8387 : StressfulInteger {

  companion object {
    private var VALUE = 8387
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4193()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8386()
    val b = Number8385()
    return a.fib() + b.fib()
  }

}

class Number8388 : StressfulInteger {

  companion object {
    private var VALUE = 8388
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4194()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8387()
    val b = Number8386()
    return a.fib() + b.fib()
  }

}

class Number8389 : StressfulInteger {

  companion object {
    private var VALUE = 8389
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4194()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8388()
    val b = Number8387()
    return a.fib() + b.fib()
  }

}

class Number8390 : StressfulInteger {

  companion object {
    private var VALUE = 8390
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4195()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8389()
    val b = Number8388()
    return a.fib() + b.fib()
  }

}

class Number8391 : StressfulInteger {

  companion object {
    private var VALUE = 8391
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4195()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8390()
    val b = Number8389()
    return a.fib() + b.fib()
  }

}

class Number8392 : StressfulInteger {

  companion object {
    private var VALUE = 8392
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4196()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8391()
    val b = Number8390()
    return a.fib() + b.fib()
  }

}

class Number8393 : StressfulInteger {

  companion object {
    private var VALUE = 8393
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4196()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8392()
    val b = Number8391()
    return a.fib() + b.fib()
  }

}

class Number8394 : StressfulInteger {

  companion object {
    private var VALUE = 8394
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4197()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8393()
    val b = Number8392()
    return a.fib() + b.fib()
  }

}

class Number8395 : StressfulInteger {

  companion object {
    private var VALUE = 8395
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4197()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8394()
    val b = Number8393()
    return a.fib() + b.fib()
  }

}

class Number8396 : StressfulInteger {

  companion object {
    private var VALUE = 8396
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4198()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8395()
    val b = Number8394()
    return a.fib() + b.fib()
  }

}

class Number8397 : StressfulInteger {

  companion object {
    private var VALUE = 8397
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4198()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8396()
    val b = Number8395()
    return a.fib() + b.fib()
  }

}

class Number8398 : StressfulInteger {

  companion object {
    private var VALUE = 8398
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4199()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8397()
    val b = Number8396()
    return a.fib() + b.fib()
  }

}

class Number8399 : StressfulInteger {

  companion object {
    private var VALUE = 8399
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4199()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8398()
    val b = Number8397()
    return a.fib() + b.fib()
  }

}

class Number8400 : StressfulInteger {

  companion object {
    private var VALUE = 8400
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4200()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8399()
    val b = Number8398()
    return a.fib() + b.fib()
  }

}

class Number8401 : StressfulInteger {

  companion object {
    private var VALUE = 8401
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4200()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8400()
    val b = Number8399()
    return a.fib() + b.fib()
  }

}

class Number8402 : StressfulInteger {

  companion object {
    private var VALUE = 8402
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4201()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8401()
    val b = Number8400()
    return a.fib() + b.fib()
  }

}

class Number8403 : StressfulInteger {

  companion object {
    private var VALUE = 8403
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4201()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8402()
    val b = Number8401()
    return a.fib() + b.fib()
  }

}

class Number8404 : StressfulInteger {

  companion object {
    private var VALUE = 8404
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4202()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8403()
    val b = Number8402()
    return a.fib() + b.fib()
  }

}

class Number8405 : StressfulInteger {

  companion object {
    private var VALUE = 8405
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4202()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8404()
    val b = Number8403()
    return a.fib() + b.fib()
  }

}

class Number8406 : StressfulInteger {

  companion object {
    private var VALUE = 8406
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4203()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8405()
    val b = Number8404()
    return a.fib() + b.fib()
  }

}

class Number8407 : StressfulInteger {

  companion object {
    private var VALUE = 8407
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4203()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8406()
    val b = Number8405()
    return a.fib() + b.fib()
  }

}

class Number8408 : StressfulInteger {

  companion object {
    private var VALUE = 8408
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4204()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8407()
    val b = Number8406()
    return a.fib() + b.fib()
  }

}

class Number8409 : StressfulInteger {

  companion object {
    private var VALUE = 8409
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4204()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8408()
    val b = Number8407()
    return a.fib() + b.fib()
  }

}

class Number8410 : StressfulInteger {

  companion object {
    private var VALUE = 8410
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4205()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8409()
    val b = Number8408()
    return a.fib() + b.fib()
  }

}

class Number8411 : StressfulInteger {

  companion object {
    private var VALUE = 8411
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4205()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8410()
    val b = Number8409()
    return a.fib() + b.fib()
  }

}

class Number8412 : StressfulInteger {

  companion object {
    private var VALUE = 8412
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4206()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8411()
    val b = Number8410()
    return a.fib() + b.fib()
  }

}

class Number8413 : StressfulInteger {

  companion object {
    private var VALUE = 8413
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4206()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8412()
    val b = Number8411()
    return a.fib() + b.fib()
  }

}

class Number8414 : StressfulInteger {

  companion object {
    private var VALUE = 8414
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4207()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8413()
    val b = Number8412()
    return a.fib() + b.fib()
  }

}

class Number8415 : StressfulInteger {

  companion object {
    private var VALUE = 8415
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4207()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8414()
    val b = Number8413()
    return a.fib() + b.fib()
  }

}

class Number8416 : StressfulInteger {

  companion object {
    private var VALUE = 8416
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4208()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8415()
    val b = Number8414()
    return a.fib() + b.fib()
  }

}

class Number8417 : StressfulInteger {

  companion object {
    private var VALUE = 8417
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4208()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8416()
    val b = Number8415()
    return a.fib() + b.fib()
  }

}

class Number8418 : StressfulInteger {

  companion object {
    private var VALUE = 8418
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4209()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8417()
    val b = Number8416()
    return a.fib() + b.fib()
  }

}

class Number8419 : StressfulInteger {

  companion object {
    private var VALUE = 8419
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4209()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8418()
    val b = Number8417()
    return a.fib() + b.fib()
  }

}

class Number8420 : StressfulInteger {

  companion object {
    private var VALUE = 8420
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4210()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8419()
    val b = Number8418()
    return a.fib() + b.fib()
  }

}

class Number8421 : StressfulInteger {

  companion object {
    private var VALUE = 8421
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4210()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8420()
    val b = Number8419()
    return a.fib() + b.fib()
  }

}

class Number8422 : StressfulInteger {

  companion object {
    private var VALUE = 8422
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4211()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8421()
    val b = Number8420()
    return a.fib() + b.fib()
  }

}

class Number8423 : StressfulInteger {

  companion object {
    private var VALUE = 8423
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4211()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8422()
    val b = Number8421()
    return a.fib() + b.fib()
  }

}

class Number8424 : StressfulInteger {

  companion object {
    private var VALUE = 8424
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4212()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8423()
    val b = Number8422()
    return a.fib() + b.fib()
  }

}

class Number8425 : StressfulInteger {

  companion object {
    private var VALUE = 8425
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4212()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8424()
    val b = Number8423()
    return a.fib() + b.fib()
  }

}

class Number8426 : StressfulInteger {

  companion object {
    private var VALUE = 8426
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4213()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8425()
    val b = Number8424()
    return a.fib() + b.fib()
  }

}

class Number8427 : StressfulInteger {

  companion object {
    private var VALUE = 8427
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4213()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8426()
    val b = Number8425()
    return a.fib() + b.fib()
  }

}

class Number8428 : StressfulInteger {

  companion object {
    private var VALUE = 8428
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4214()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8427()
    val b = Number8426()
    return a.fib() + b.fib()
  }

}

class Number8429 : StressfulInteger {

  companion object {
    private var VALUE = 8429
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4214()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8428()
    val b = Number8427()
    return a.fib() + b.fib()
  }

}

class Number8430 : StressfulInteger {

  companion object {
    private var VALUE = 8430
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4215()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8429()
    val b = Number8428()
    return a.fib() + b.fib()
  }

}

class Number8431 : StressfulInteger {

  companion object {
    private var VALUE = 8431
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4215()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8430()
    val b = Number8429()
    return a.fib() + b.fib()
  }

}

class Number8432 : StressfulInteger {

  companion object {
    private var VALUE = 8432
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4216()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8431()
    val b = Number8430()
    return a.fib() + b.fib()
  }

}

class Number8433 : StressfulInteger {

  companion object {
    private var VALUE = 8433
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4216()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8432()
    val b = Number8431()
    return a.fib() + b.fib()
  }

}

class Number8434 : StressfulInteger {

  companion object {
    private var VALUE = 8434
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4217()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8433()
    val b = Number8432()
    return a.fib() + b.fib()
  }

}

class Number8435 : StressfulInteger {

  companion object {
    private var VALUE = 8435
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4217()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8434()
    val b = Number8433()
    return a.fib() + b.fib()
  }

}

class Number8436 : StressfulInteger {

  companion object {
    private var VALUE = 8436
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4218()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8435()
    val b = Number8434()
    return a.fib() + b.fib()
  }

}

class Number8437 : StressfulInteger {

  companion object {
    private var VALUE = 8437
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4218()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8436()
    val b = Number8435()
    return a.fib() + b.fib()
  }

}

class Number8438 : StressfulInteger {

  companion object {
    private var VALUE = 8438
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4219()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8437()
    val b = Number8436()
    return a.fib() + b.fib()
  }

}

class Number8439 : StressfulInteger {

  companion object {
    private var VALUE = 8439
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4219()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8438()
    val b = Number8437()
    return a.fib() + b.fib()
  }

}

class Number8440 : StressfulInteger {

  companion object {
    private var VALUE = 8440
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4220()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8439()
    val b = Number8438()
    return a.fib() + b.fib()
  }

}

class Number8441 : StressfulInteger {

  companion object {
    private var VALUE = 8441
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4220()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8440()
    val b = Number8439()
    return a.fib() + b.fib()
  }

}

class Number8442 : StressfulInteger {

  companion object {
    private var VALUE = 8442
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4221()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8441()
    val b = Number8440()
    return a.fib() + b.fib()
  }

}

class Number8443 : StressfulInteger {

  companion object {
    private var VALUE = 8443
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4221()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8442()
    val b = Number8441()
    return a.fib() + b.fib()
  }

}

class Number8444 : StressfulInteger {

  companion object {
    private var VALUE = 8444
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4222()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8443()
    val b = Number8442()
    return a.fib() + b.fib()
  }

}

class Number8445 : StressfulInteger {

  companion object {
    private var VALUE = 8445
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4222()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8444()
    val b = Number8443()
    return a.fib() + b.fib()
  }

}

class Number8446 : StressfulInteger {

  companion object {
    private var VALUE = 8446
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4223()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8445()
    val b = Number8444()
    return a.fib() + b.fib()
  }

}

class Number8447 : StressfulInteger {

  companion object {
    private var VALUE = 8447
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4223()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8446()
    val b = Number8445()
    return a.fib() + b.fib()
  }

}

class Number8448 : StressfulInteger {

  companion object {
    private var VALUE = 8448
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4224()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8447()
    val b = Number8446()
    return a.fib() + b.fib()
  }

}

class Number8449 : StressfulInteger {

  companion object {
    private var VALUE = 8449
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4224()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8448()
    val b = Number8447()
    return a.fib() + b.fib()
  }

}

class Number8450 : StressfulInteger {

  companion object {
    private var VALUE = 8450
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4225()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8449()
    val b = Number8448()
    return a.fib() + b.fib()
  }

}

class Number8451 : StressfulInteger {

  companion object {
    private var VALUE = 8451
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4225()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8450()
    val b = Number8449()
    return a.fib() + b.fib()
  }

}

class Number8452 : StressfulInteger {

  companion object {
    private var VALUE = 8452
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4226()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8451()
    val b = Number8450()
    return a.fib() + b.fib()
  }

}

class Number8453 : StressfulInteger {

  companion object {
    private var VALUE = 8453
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4226()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8452()
    val b = Number8451()
    return a.fib() + b.fib()
  }

}

class Number8454 : StressfulInteger {

  companion object {
    private var VALUE = 8454
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4227()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8453()
    val b = Number8452()
    return a.fib() + b.fib()
  }

}

class Number8455 : StressfulInteger {

  companion object {
    private var VALUE = 8455
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4227()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8454()
    val b = Number8453()
    return a.fib() + b.fib()
  }

}

class Number8456 : StressfulInteger {

  companion object {
    private var VALUE = 8456
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4228()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8455()
    val b = Number8454()
    return a.fib() + b.fib()
  }

}

class Number8457 : StressfulInteger {

  companion object {
    private var VALUE = 8457
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4228()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8456()
    val b = Number8455()
    return a.fib() + b.fib()
  }

}

class Number8458 : StressfulInteger {

  companion object {
    private var VALUE = 8458
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4229()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8457()
    val b = Number8456()
    return a.fib() + b.fib()
  }

}

class Number8459 : StressfulInteger {

  companion object {
    private var VALUE = 8459
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4229()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8458()
    val b = Number8457()
    return a.fib() + b.fib()
  }

}

class Number8460 : StressfulInteger {

  companion object {
    private var VALUE = 8460
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4230()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8459()
    val b = Number8458()
    return a.fib() + b.fib()
  }

}

class Number8461 : StressfulInteger {

  companion object {
    private var VALUE = 8461
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4230()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8460()
    val b = Number8459()
    return a.fib() + b.fib()
  }

}

class Number8462 : StressfulInteger {

  companion object {
    private var VALUE = 8462
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4231()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8461()
    val b = Number8460()
    return a.fib() + b.fib()
  }

}

class Number8463 : StressfulInteger {

  companion object {
    private var VALUE = 8463
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4231()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8462()
    val b = Number8461()
    return a.fib() + b.fib()
  }

}

class Number8464 : StressfulInteger {

  companion object {
    private var VALUE = 8464
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4232()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8463()
    val b = Number8462()
    return a.fib() + b.fib()
  }

}

class Number8465 : StressfulInteger {

  companion object {
    private var VALUE = 8465
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4232()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8464()
    val b = Number8463()
    return a.fib() + b.fib()
  }

}

class Number8466 : StressfulInteger {

  companion object {
    private var VALUE = 8466
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4233()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8465()
    val b = Number8464()
    return a.fib() + b.fib()
  }

}

class Number8467 : StressfulInteger {

  companion object {
    private var VALUE = 8467
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4233()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8466()
    val b = Number8465()
    return a.fib() + b.fib()
  }

}

class Number8468 : StressfulInteger {

  companion object {
    private var VALUE = 8468
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4234()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8467()
    val b = Number8466()
    return a.fib() + b.fib()
  }

}

class Number8469 : StressfulInteger {

  companion object {
    private var VALUE = 8469
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4234()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8468()
    val b = Number8467()
    return a.fib() + b.fib()
  }

}

class Number8470 : StressfulInteger {

  companion object {
    private var VALUE = 8470
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4235()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8469()
    val b = Number8468()
    return a.fib() + b.fib()
  }

}

class Number8471 : StressfulInteger {

  companion object {
    private var VALUE = 8471
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4235()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8470()
    val b = Number8469()
    return a.fib() + b.fib()
  }

}

class Number8472 : StressfulInteger {

  companion object {
    private var VALUE = 8472
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4236()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8471()
    val b = Number8470()
    return a.fib() + b.fib()
  }

}

class Number8473 : StressfulInteger {

  companion object {
    private var VALUE = 8473
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4236()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8472()
    val b = Number8471()
    return a.fib() + b.fib()
  }

}

class Number8474 : StressfulInteger {

  companion object {
    private var VALUE = 8474
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4237()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8473()
    val b = Number8472()
    return a.fib() + b.fib()
  }

}

class Number8475 : StressfulInteger {

  companion object {
    private var VALUE = 8475
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4237()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8474()
    val b = Number8473()
    return a.fib() + b.fib()
  }

}

class Number8476 : StressfulInteger {

  companion object {
    private var VALUE = 8476
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4238()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8475()
    val b = Number8474()
    return a.fib() + b.fib()
  }

}

class Number8477 : StressfulInteger {

  companion object {
    private var VALUE = 8477
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4238()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8476()
    val b = Number8475()
    return a.fib() + b.fib()
  }

}

class Number8478 : StressfulInteger {

  companion object {
    private var VALUE = 8478
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4239()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8477()
    val b = Number8476()
    return a.fib() + b.fib()
  }

}

class Number8479 : StressfulInteger {

  companion object {
    private var VALUE = 8479
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4239()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8478()
    val b = Number8477()
    return a.fib() + b.fib()
  }

}

class Number8480 : StressfulInteger {

  companion object {
    private var VALUE = 8480
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4240()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8479()
    val b = Number8478()
    return a.fib() + b.fib()
  }

}

class Number8481 : StressfulInteger {

  companion object {
    private var VALUE = 8481
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4240()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8480()
    val b = Number8479()
    return a.fib() + b.fib()
  }

}

class Number8482 : StressfulInteger {

  companion object {
    private var VALUE = 8482
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4241()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8481()
    val b = Number8480()
    return a.fib() + b.fib()
  }

}

class Number8483 : StressfulInteger {

  companion object {
    private var VALUE = 8483
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4241()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8482()
    val b = Number8481()
    return a.fib() + b.fib()
  }

}

class Number8484 : StressfulInteger {

  companion object {
    private var VALUE = 8484
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4242()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8483()
    val b = Number8482()
    return a.fib() + b.fib()
  }

}

class Number8485 : StressfulInteger {

  companion object {
    private var VALUE = 8485
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4242()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8484()
    val b = Number8483()
    return a.fib() + b.fib()
  }

}

class Number8486 : StressfulInteger {

  companion object {
    private var VALUE = 8486
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4243()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8485()
    val b = Number8484()
    return a.fib() + b.fib()
  }

}

class Number8487 : StressfulInteger {

  companion object {
    private var VALUE = 8487
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4243()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8486()
    val b = Number8485()
    return a.fib() + b.fib()
  }

}

class Number8488 : StressfulInteger {

  companion object {
    private var VALUE = 8488
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4244()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8487()
    val b = Number8486()
    return a.fib() + b.fib()
  }

}

class Number8489 : StressfulInteger {

  companion object {
    private var VALUE = 8489
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4244()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8488()
    val b = Number8487()
    return a.fib() + b.fib()
  }

}

class Number8490 : StressfulInteger {

  companion object {
    private var VALUE = 8490
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4245()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8489()
    val b = Number8488()
    return a.fib() + b.fib()
  }

}

class Number8491 : StressfulInteger {

  companion object {
    private var VALUE = 8491
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4245()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8490()
    val b = Number8489()
    return a.fib() + b.fib()
  }

}

class Number8492 : StressfulInteger {

  companion object {
    private var VALUE = 8492
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4246()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8491()
    val b = Number8490()
    return a.fib() + b.fib()
  }

}

class Number8493 : StressfulInteger {

  companion object {
    private var VALUE = 8493
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4246()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8492()
    val b = Number8491()
    return a.fib() + b.fib()
  }

}

class Number8494 : StressfulInteger {

  companion object {
    private var VALUE = 8494
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4247()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8493()
    val b = Number8492()
    return a.fib() + b.fib()
  }

}

class Number8495 : StressfulInteger {

  companion object {
    private var VALUE = 8495
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4247()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8494()
    val b = Number8493()
    return a.fib() + b.fib()
  }

}

class Number8496 : StressfulInteger {

  companion object {
    private var VALUE = 8496
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4248()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8495()
    val b = Number8494()
    return a.fib() + b.fib()
  }

}

class Number8497 : StressfulInteger {

  companion object {
    private var VALUE = 8497
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4248()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8496()
    val b = Number8495()
    return a.fib() + b.fib()
  }

}

class Number8498 : StressfulInteger {

  companion object {
    private var VALUE = 8498
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4249()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8497()
    val b = Number8496()
    return a.fib() + b.fib()
  }

}

class Number8499 : StressfulInteger {

  companion object {
    private var VALUE = 8499
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4249()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8498()
    val b = Number8497()
    return a.fib() + b.fib()
  }

}

class Number8500 : StressfulInteger {

  companion object {
    private var VALUE = 8500
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4250()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8499()
    val b = Number8498()
    return a.fib() + b.fib()
  }

}

class Number8501 : StressfulInteger {

  companion object {
    private var VALUE = 8501
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4250()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8500()
    val b = Number8499()
    return a.fib() + b.fib()
  }

}

class Number8502 : StressfulInteger {

  companion object {
    private var VALUE = 8502
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4251()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8501()
    val b = Number8500()
    return a.fib() + b.fib()
  }

}

class Number8503 : StressfulInteger {

  companion object {
    private var VALUE = 8503
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4251()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8502()
    val b = Number8501()
    return a.fib() + b.fib()
  }

}

class Number8504 : StressfulInteger {

  companion object {
    private var VALUE = 8504
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4252()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8503()
    val b = Number8502()
    return a.fib() + b.fib()
  }

}

class Number8505 : StressfulInteger {

  companion object {
    private var VALUE = 8505
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4252()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8504()
    val b = Number8503()
    return a.fib() + b.fib()
  }

}

class Number8506 : StressfulInteger {

  companion object {
    private var VALUE = 8506
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4253()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8505()
    val b = Number8504()
    return a.fib() + b.fib()
  }

}

class Number8507 : StressfulInteger {

  companion object {
    private var VALUE = 8507
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4253()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8506()
    val b = Number8505()
    return a.fib() + b.fib()
  }

}

class Number8508 : StressfulInteger {

  companion object {
    private var VALUE = 8508
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4254()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8507()
    val b = Number8506()
    return a.fib() + b.fib()
  }

}

class Number8509 : StressfulInteger {

  companion object {
    private var VALUE = 8509
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4254()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8508()
    val b = Number8507()
    return a.fib() + b.fib()
  }

}

class Number8510 : StressfulInteger {

  companion object {
    private var VALUE = 8510
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4255()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8509()
    val b = Number8508()
    return a.fib() + b.fib()
  }

}

class Number8511 : StressfulInteger {

  companion object {
    private var VALUE = 8511
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4255()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8510()
    val b = Number8509()
    return a.fib() + b.fib()
  }

}

class Number8512 : StressfulInteger {

  companion object {
    private var VALUE = 8512
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4256()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8511()
    val b = Number8510()
    return a.fib() + b.fib()
  }

}

class Number8513 : StressfulInteger {

  companion object {
    private var VALUE = 8513
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4256()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8512()
    val b = Number8511()
    return a.fib() + b.fib()
  }

}

class Number8514 : StressfulInteger {

  companion object {
    private var VALUE = 8514
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4257()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8513()
    val b = Number8512()
    return a.fib() + b.fib()
  }

}

class Number8515 : StressfulInteger {

  companion object {
    private var VALUE = 8515
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4257()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8514()
    val b = Number8513()
    return a.fib() + b.fib()
  }

}

class Number8516 : StressfulInteger {

  companion object {
    private var VALUE = 8516
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4258()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8515()
    val b = Number8514()
    return a.fib() + b.fib()
  }

}

class Number8517 : StressfulInteger {

  companion object {
    private var VALUE = 8517
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4258()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8516()
    val b = Number8515()
    return a.fib() + b.fib()
  }

}

class Number8518 : StressfulInteger {

  companion object {
    private var VALUE = 8518
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4259()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8517()
    val b = Number8516()
    return a.fib() + b.fib()
  }

}

class Number8519 : StressfulInteger {

  companion object {
    private var VALUE = 8519
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4259()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8518()
    val b = Number8517()
    return a.fib() + b.fib()
  }

}

class Number8520 : StressfulInteger {

  companion object {
    private var VALUE = 8520
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4260()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8519()
    val b = Number8518()
    return a.fib() + b.fib()
  }

}

class Number8521 : StressfulInteger {

  companion object {
    private var VALUE = 8521
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4260()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8520()
    val b = Number8519()
    return a.fib() + b.fib()
  }

}

class Number8522 : StressfulInteger {

  companion object {
    private var VALUE = 8522
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4261()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8521()
    val b = Number8520()
    return a.fib() + b.fib()
  }

}

class Number8523 : StressfulInteger {

  companion object {
    private var VALUE = 8523
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4261()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8522()
    val b = Number8521()
    return a.fib() + b.fib()
  }

}

class Number8524 : StressfulInteger {

  companion object {
    private var VALUE = 8524
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4262()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8523()
    val b = Number8522()
    return a.fib() + b.fib()
  }

}

class Number8525 : StressfulInteger {

  companion object {
    private var VALUE = 8525
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4262()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8524()
    val b = Number8523()
    return a.fib() + b.fib()
  }

}

class Number8526 : StressfulInteger {

  companion object {
    private var VALUE = 8526
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4263()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8525()
    val b = Number8524()
    return a.fib() + b.fib()
  }

}

class Number8527 : StressfulInteger {

  companion object {
    private var VALUE = 8527
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4263()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8526()
    val b = Number8525()
    return a.fib() + b.fib()
  }

}

class Number8528 : StressfulInteger {

  companion object {
    private var VALUE = 8528
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4264()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8527()
    val b = Number8526()
    return a.fib() + b.fib()
  }

}

class Number8529 : StressfulInteger {

  companion object {
    private var VALUE = 8529
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4264()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8528()
    val b = Number8527()
    return a.fib() + b.fib()
  }

}

class Number8530 : StressfulInteger {

  companion object {
    private var VALUE = 8530
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4265()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8529()
    val b = Number8528()
    return a.fib() + b.fib()
  }

}

class Number8531 : StressfulInteger {

  companion object {
    private var VALUE = 8531
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4265()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8530()
    val b = Number8529()
    return a.fib() + b.fib()
  }

}

class Number8532 : StressfulInteger {

  companion object {
    private var VALUE = 8532
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4266()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8531()
    val b = Number8530()
    return a.fib() + b.fib()
  }

}

class Number8533 : StressfulInteger {

  companion object {
    private var VALUE = 8533
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4266()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8532()
    val b = Number8531()
    return a.fib() + b.fib()
  }

}

class Number8534 : StressfulInteger {

  companion object {
    private var VALUE = 8534
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4267()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8533()
    val b = Number8532()
    return a.fib() + b.fib()
  }

}

class Number8535 : StressfulInteger {

  companion object {
    private var VALUE = 8535
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4267()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8534()
    val b = Number8533()
    return a.fib() + b.fib()
  }

}

class Number8536 : StressfulInteger {

  companion object {
    private var VALUE = 8536
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4268()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8535()
    val b = Number8534()
    return a.fib() + b.fib()
  }

}

class Number8537 : StressfulInteger {

  companion object {
    private var VALUE = 8537
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4268()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8536()
    val b = Number8535()
    return a.fib() + b.fib()
  }

}

class Number8538 : StressfulInteger {

  companion object {
    private var VALUE = 8538
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4269()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8537()
    val b = Number8536()
    return a.fib() + b.fib()
  }

}

class Number8539 : StressfulInteger {

  companion object {
    private var VALUE = 8539
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4269()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8538()
    val b = Number8537()
    return a.fib() + b.fib()
  }

}

class Number8540 : StressfulInteger {

  companion object {
    private var VALUE = 8540
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4270()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8539()
    val b = Number8538()
    return a.fib() + b.fib()
  }

}

class Number8541 : StressfulInteger {

  companion object {
    private var VALUE = 8541
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4270()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8540()
    val b = Number8539()
    return a.fib() + b.fib()
  }

}

class Number8542 : StressfulInteger {

  companion object {
    private var VALUE = 8542
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4271()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8541()
    val b = Number8540()
    return a.fib() + b.fib()
  }

}

class Number8543 : StressfulInteger {

  companion object {
    private var VALUE = 8543
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4271()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8542()
    val b = Number8541()
    return a.fib() + b.fib()
  }

}

class Number8544 : StressfulInteger {

  companion object {
    private var VALUE = 8544
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4272()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8543()
    val b = Number8542()
    return a.fib() + b.fib()
  }

}

class Number8545 : StressfulInteger {

  companion object {
    private var VALUE = 8545
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4272()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8544()
    val b = Number8543()
    return a.fib() + b.fib()
  }

}

class Number8546 : StressfulInteger {

  companion object {
    private var VALUE = 8546
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4273()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8545()
    val b = Number8544()
    return a.fib() + b.fib()
  }

}

class Number8547 : StressfulInteger {

  companion object {
    private var VALUE = 8547
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4273()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8546()
    val b = Number8545()
    return a.fib() + b.fib()
  }

}

class Number8548 : StressfulInteger {

  companion object {
    private var VALUE = 8548
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4274()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8547()
    val b = Number8546()
    return a.fib() + b.fib()
  }

}

class Number8549 : StressfulInteger {

  companion object {
    private var VALUE = 8549
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4274()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8548()
    val b = Number8547()
    return a.fib() + b.fib()
  }

}

class Number8550 : StressfulInteger {

  companion object {
    private var VALUE = 8550
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4275()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8549()
    val b = Number8548()
    return a.fib() + b.fib()
  }

}

class Number8551 : StressfulInteger {

  companion object {
    private var VALUE = 8551
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4275()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8550()
    val b = Number8549()
    return a.fib() + b.fib()
  }

}

class Number8552 : StressfulInteger {

  companion object {
    private var VALUE = 8552
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4276()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8551()
    val b = Number8550()
    return a.fib() + b.fib()
  }

}

class Number8553 : StressfulInteger {

  companion object {
    private var VALUE = 8553
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4276()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8552()
    val b = Number8551()
    return a.fib() + b.fib()
  }

}

class Number8554 : StressfulInteger {

  companion object {
    private var VALUE = 8554
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4277()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8553()
    val b = Number8552()
    return a.fib() + b.fib()
  }

}

class Number8555 : StressfulInteger {

  companion object {
    private var VALUE = 8555
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4277()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8554()
    val b = Number8553()
    return a.fib() + b.fib()
  }

}

class Number8556 : StressfulInteger {

  companion object {
    private var VALUE = 8556
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4278()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8555()
    val b = Number8554()
    return a.fib() + b.fib()
  }

}

class Number8557 : StressfulInteger {

  companion object {
    private var VALUE = 8557
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4278()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8556()
    val b = Number8555()
    return a.fib() + b.fib()
  }

}

class Number8558 : StressfulInteger {

  companion object {
    private var VALUE = 8558
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4279()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8557()
    val b = Number8556()
    return a.fib() + b.fib()
  }

}

class Number8559 : StressfulInteger {

  companion object {
    private var VALUE = 8559
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4279()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8558()
    val b = Number8557()
    return a.fib() + b.fib()
  }

}

class Number8560 : StressfulInteger {

  companion object {
    private var VALUE = 8560
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4280()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8559()
    val b = Number8558()
    return a.fib() + b.fib()
  }

}

class Number8561 : StressfulInteger {

  companion object {
    private var VALUE = 8561
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4280()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8560()
    val b = Number8559()
    return a.fib() + b.fib()
  }

}

class Number8562 : StressfulInteger {

  companion object {
    private var VALUE = 8562
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4281()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8561()
    val b = Number8560()
    return a.fib() + b.fib()
  }

}

class Number8563 : StressfulInteger {

  companion object {
    private var VALUE = 8563
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4281()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8562()
    val b = Number8561()
    return a.fib() + b.fib()
  }

}

class Number8564 : StressfulInteger {

  companion object {
    private var VALUE = 8564
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4282()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8563()
    val b = Number8562()
    return a.fib() + b.fib()
  }

}

class Number8565 : StressfulInteger {

  companion object {
    private var VALUE = 8565
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4282()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8564()
    val b = Number8563()
    return a.fib() + b.fib()
  }

}

class Number8566 : StressfulInteger {

  companion object {
    private var VALUE = 8566
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4283()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8565()
    val b = Number8564()
    return a.fib() + b.fib()
  }

}

class Number8567 : StressfulInteger {

  companion object {
    private var VALUE = 8567
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4283()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8566()
    val b = Number8565()
    return a.fib() + b.fib()
  }

}

class Number8568 : StressfulInteger {

  companion object {
    private var VALUE = 8568
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4284()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8567()
    val b = Number8566()
    return a.fib() + b.fib()
  }

}

class Number8569 : StressfulInteger {

  companion object {
    private var VALUE = 8569
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4284()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8568()
    val b = Number8567()
    return a.fib() + b.fib()
  }

}

class Number8570 : StressfulInteger {

  companion object {
    private var VALUE = 8570
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4285()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8569()
    val b = Number8568()
    return a.fib() + b.fib()
  }

}

class Number8571 : StressfulInteger {

  companion object {
    private var VALUE = 8571
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4285()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8570()
    val b = Number8569()
    return a.fib() + b.fib()
  }

}

class Number8572 : StressfulInteger {

  companion object {
    private var VALUE = 8572
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4286()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8571()
    val b = Number8570()
    return a.fib() + b.fib()
  }

}

class Number8573 : StressfulInteger {

  companion object {
    private var VALUE = 8573
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4286()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8572()
    val b = Number8571()
    return a.fib() + b.fib()
  }

}

class Number8574 : StressfulInteger {

  companion object {
    private var VALUE = 8574
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4287()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8573()
    val b = Number8572()
    return a.fib() + b.fib()
  }

}

class Number8575 : StressfulInteger {

  companion object {
    private var VALUE = 8575
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4287()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8574()
    val b = Number8573()
    return a.fib() + b.fib()
  }

}

class Number8576 : StressfulInteger {

  companion object {
    private var VALUE = 8576
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4288()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8575()
    val b = Number8574()
    return a.fib() + b.fib()
  }

}

class Number8577 : StressfulInteger {

  companion object {
    private var VALUE = 8577
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4288()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8576()
    val b = Number8575()
    return a.fib() + b.fib()
  }

}

class Number8578 : StressfulInteger {

  companion object {
    private var VALUE = 8578
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4289()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8577()
    val b = Number8576()
    return a.fib() + b.fib()
  }

}

class Number8579 : StressfulInteger {

  companion object {
    private var VALUE = 8579
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4289()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8578()
    val b = Number8577()
    return a.fib() + b.fib()
  }

}

class Number8580 : StressfulInteger {

  companion object {
    private var VALUE = 8580
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4290()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8579()
    val b = Number8578()
    return a.fib() + b.fib()
  }

}

class Number8581 : StressfulInteger {

  companion object {
    private var VALUE = 8581
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4290()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8580()
    val b = Number8579()
    return a.fib() + b.fib()
  }

}

class Number8582 : StressfulInteger {

  companion object {
    private var VALUE = 8582
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4291()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8581()
    val b = Number8580()
    return a.fib() + b.fib()
  }

}

class Number8583 : StressfulInteger {

  companion object {
    private var VALUE = 8583
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4291()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8582()
    val b = Number8581()
    return a.fib() + b.fib()
  }

}

class Number8584 : StressfulInteger {

  companion object {
    private var VALUE = 8584
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4292()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8583()
    val b = Number8582()
    return a.fib() + b.fib()
  }

}

class Number8585 : StressfulInteger {

  companion object {
    private var VALUE = 8585
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4292()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8584()
    val b = Number8583()
    return a.fib() + b.fib()
  }

}

class Number8586 : StressfulInteger {

  companion object {
    private var VALUE = 8586
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4293()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8585()
    val b = Number8584()
    return a.fib() + b.fib()
  }

}

class Number8587 : StressfulInteger {

  companion object {
    private var VALUE = 8587
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4293()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8586()
    val b = Number8585()
    return a.fib() + b.fib()
  }

}

class Number8588 : StressfulInteger {

  companion object {
    private var VALUE = 8588
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4294()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8587()
    val b = Number8586()
    return a.fib() + b.fib()
  }

}

class Number8589 : StressfulInteger {

  companion object {
    private var VALUE = 8589
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4294()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8588()
    val b = Number8587()
    return a.fib() + b.fib()
  }

}

class Number8590 : StressfulInteger {

  companion object {
    private var VALUE = 8590
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4295()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8589()
    val b = Number8588()
    return a.fib() + b.fib()
  }

}

class Number8591 : StressfulInteger {

  companion object {
    private var VALUE = 8591
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4295()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8590()
    val b = Number8589()
    return a.fib() + b.fib()
  }

}

class Number8592 : StressfulInteger {

  companion object {
    private var VALUE = 8592
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4296()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8591()
    val b = Number8590()
    return a.fib() + b.fib()
  }

}

class Number8593 : StressfulInteger {

  companion object {
    private var VALUE = 8593
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4296()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8592()
    val b = Number8591()
    return a.fib() + b.fib()
  }

}

class Number8594 : StressfulInteger {

  companion object {
    private var VALUE = 8594
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4297()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8593()
    val b = Number8592()
    return a.fib() + b.fib()
  }

}

class Number8595 : StressfulInteger {

  companion object {
    private var VALUE = 8595
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4297()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8594()
    val b = Number8593()
    return a.fib() + b.fib()
  }

}

class Number8596 : StressfulInteger {

  companion object {
    private var VALUE = 8596
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4298()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8595()
    val b = Number8594()
    return a.fib() + b.fib()
  }

}

class Number8597 : StressfulInteger {

  companion object {
    private var VALUE = 8597
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4298()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8596()
    val b = Number8595()
    return a.fib() + b.fib()
  }

}

class Number8598 : StressfulInteger {

  companion object {
    private var VALUE = 8598
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4299()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8597()
    val b = Number8596()
    return a.fib() + b.fib()
  }

}

class Number8599 : StressfulInteger {

  companion object {
    private var VALUE = 8599
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4299()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8598()
    val b = Number8597()
    return a.fib() + b.fib()
  }

}

class Number8600 : StressfulInteger {

  companion object {
    private var VALUE = 8600
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4300()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8599()
    val b = Number8598()
    return a.fib() + b.fib()
  }

}

class Number8601 : StressfulInteger {

  companion object {
    private var VALUE = 8601
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4300()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8600()
    val b = Number8599()
    return a.fib() + b.fib()
  }

}

class Number8602 : StressfulInteger {

  companion object {
    private var VALUE = 8602
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4301()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8601()
    val b = Number8600()
    return a.fib() + b.fib()
  }

}

class Number8603 : StressfulInteger {

  companion object {
    private var VALUE = 8603
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4301()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8602()
    val b = Number8601()
    return a.fib() + b.fib()
  }

}

class Number8604 : StressfulInteger {

  companion object {
    private var VALUE = 8604
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4302()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8603()
    val b = Number8602()
    return a.fib() + b.fib()
  }

}

class Number8605 : StressfulInteger {

  companion object {
    private var VALUE = 8605
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4302()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8604()
    val b = Number8603()
    return a.fib() + b.fib()
  }

}

class Number8606 : StressfulInteger {

  companion object {
    private var VALUE = 8606
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4303()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8605()
    val b = Number8604()
    return a.fib() + b.fib()
  }

}

class Number8607 : StressfulInteger {

  companion object {
    private var VALUE = 8607
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4303()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8606()
    val b = Number8605()
    return a.fib() + b.fib()
  }

}

class Number8608 : StressfulInteger {

  companion object {
    private var VALUE = 8608
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4304()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8607()
    val b = Number8606()
    return a.fib() + b.fib()
  }

}

class Number8609 : StressfulInteger {

  companion object {
    private var VALUE = 8609
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4304()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8608()
    val b = Number8607()
    return a.fib() + b.fib()
  }

}

class Number8610 : StressfulInteger {

  companion object {
    private var VALUE = 8610
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4305()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8609()
    val b = Number8608()
    return a.fib() + b.fib()
  }

}

class Number8611 : StressfulInteger {

  companion object {
    private var VALUE = 8611
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4305()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8610()
    val b = Number8609()
    return a.fib() + b.fib()
  }

}

class Number8612 : StressfulInteger {

  companion object {
    private var VALUE = 8612
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4306()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8611()
    val b = Number8610()
    return a.fib() + b.fib()
  }

}

class Number8613 : StressfulInteger {

  companion object {
    private var VALUE = 8613
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4306()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8612()
    val b = Number8611()
    return a.fib() + b.fib()
  }

}

class Number8614 : StressfulInteger {

  companion object {
    private var VALUE = 8614
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4307()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8613()
    val b = Number8612()
    return a.fib() + b.fib()
  }

}

class Number8615 : StressfulInteger {

  companion object {
    private var VALUE = 8615
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4307()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8614()
    val b = Number8613()
    return a.fib() + b.fib()
  }

}

class Number8616 : StressfulInteger {

  companion object {
    private var VALUE = 8616
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4308()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8615()
    val b = Number8614()
    return a.fib() + b.fib()
  }

}

class Number8617 : StressfulInteger {

  companion object {
    private var VALUE = 8617
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4308()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8616()
    val b = Number8615()
    return a.fib() + b.fib()
  }

}

class Number8618 : StressfulInteger {

  companion object {
    private var VALUE = 8618
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4309()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8617()
    val b = Number8616()
    return a.fib() + b.fib()
  }

}

class Number8619 : StressfulInteger {

  companion object {
    private var VALUE = 8619
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4309()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8618()
    val b = Number8617()
    return a.fib() + b.fib()
  }

}

class Number8620 : StressfulInteger {

  companion object {
    private var VALUE = 8620
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4310()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8619()
    val b = Number8618()
    return a.fib() + b.fib()
  }

}

class Number8621 : StressfulInteger {

  companion object {
    private var VALUE = 8621
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4310()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8620()
    val b = Number8619()
    return a.fib() + b.fib()
  }

}

class Number8622 : StressfulInteger {

  companion object {
    private var VALUE = 8622
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4311()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8621()
    val b = Number8620()
    return a.fib() + b.fib()
  }

}

class Number8623 : StressfulInteger {

  companion object {
    private var VALUE = 8623
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4311()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8622()
    val b = Number8621()
    return a.fib() + b.fib()
  }

}

class Number8624 : StressfulInteger {

  companion object {
    private var VALUE = 8624
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4312()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8623()
    val b = Number8622()
    return a.fib() + b.fib()
  }

}

class Number8625 : StressfulInteger {

  companion object {
    private var VALUE = 8625
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4312()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8624()
    val b = Number8623()
    return a.fib() + b.fib()
  }

}

class Number8626 : StressfulInteger {

  companion object {
    private var VALUE = 8626
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4313()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8625()
    val b = Number8624()
    return a.fib() + b.fib()
  }

}

class Number8627 : StressfulInteger {

  companion object {
    private var VALUE = 8627
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4313()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8626()
    val b = Number8625()
    return a.fib() + b.fib()
  }

}

class Number8628 : StressfulInteger {

  companion object {
    private var VALUE = 8628
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4314()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8627()
    val b = Number8626()
    return a.fib() + b.fib()
  }

}

class Number8629 : StressfulInteger {

  companion object {
    private var VALUE = 8629
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4314()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8628()
    val b = Number8627()
    return a.fib() + b.fib()
  }

}

class Number8630 : StressfulInteger {

  companion object {
    private var VALUE = 8630
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4315()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8629()
    val b = Number8628()
    return a.fib() + b.fib()
  }

}

class Number8631 : StressfulInteger {

  companion object {
    private var VALUE = 8631
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4315()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8630()
    val b = Number8629()
    return a.fib() + b.fib()
  }

}

class Number8632 : StressfulInteger {

  companion object {
    private var VALUE = 8632
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4316()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8631()
    val b = Number8630()
    return a.fib() + b.fib()
  }

}

class Number8633 : StressfulInteger {

  companion object {
    private var VALUE = 8633
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4316()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8632()
    val b = Number8631()
    return a.fib() + b.fib()
  }

}

class Number8634 : StressfulInteger {

  companion object {
    private var VALUE = 8634
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4317()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8633()
    val b = Number8632()
    return a.fib() + b.fib()
  }

}

class Number8635 : StressfulInteger {

  companion object {
    private var VALUE = 8635
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4317()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8634()
    val b = Number8633()
    return a.fib() + b.fib()
  }

}

class Number8636 : StressfulInteger {

  companion object {
    private var VALUE = 8636
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4318()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8635()
    val b = Number8634()
    return a.fib() + b.fib()
  }

}

class Number8637 : StressfulInteger {

  companion object {
    private var VALUE = 8637
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4318()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8636()
    val b = Number8635()
    return a.fib() + b.fib()
  }

}

class Number8638 : StressfulInteger {

  companion object {
    private var VALUE = 8638
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4319()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8637()
    val b = Number8636()
    return a.fib() + b.fib()
  }

}

class Number8639 : StressfulInteger {

  companion object {
    private var VALUE = 8639
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4319()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8638()
    val b = Number8637()
    return a.fib() + b.fib()
  }

}

class Number8640 : StressfulInteger {

  companion object {
    private var VALUE = 8640
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4320()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8639()
    val b = Number8638()
    return a.fib() + b.fib()
  }

}

class Number8641 : StressfulInteger {

  companion object {
    private var VALUE = 8641
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4320()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8640()
    val b = Number8639()
    return a.fib() + b.fib()
  }

}

class Number8642 : StressfulInteger {

  companion object {
    private var VALUE = 8642
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4321()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8641()
    val b = Number8640()
    return a.fib() + b.fib()
  }

}

class Number8643 : StressfulInteger {

  companion object {
    private var VALUE = 8643
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4321()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8642()
    val b = Number8641()
    return a.fib() + b.fib()
  }

}

class Number8644 : StressfulInteger {

  companion object {
    private var VALUE = 8644
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4322()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8643()
    val b = Number8642()
    return a.fib() + b.fib()
  }

}

class Number8645 : StressfulInteger {

  companion object {
    private var VALUE = 8645
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4322()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8644()
    val b = Number8643()
    return a.fib() + b.fib()
  }

}

class Number8646 : StressfulInteger {

  companion object {
    private var VALUE = 8646
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4323()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8645()
    val b = Number8644()
    return a.fib() + b.fib()
  }

}

class Number8647 : StressfulInteger {

  companion object {
    private var VALUE = 8647
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4323()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8646()
    val b = Number8645()
    return a.fib() + b.fib()
  }

}

class Number8648 : StressfulInteger {

  companion object {
    private var VALUE = 8648
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4324()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8647()
    val b = Number8646()
    return a.fib() + b.fib()
  }

}

class Number8649 : StressfulInteger {

  companion object {
    private var VALUE = 8649
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4324()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8648()
    val b = Number8647()
    return a.fib() + b.fib()
  }

}

class Number8650 : StressfulInteger {

  companion object {
    private var VALUE = 8650
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4325()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8649()
    val b = Number8648()
    return a.fib() + b.fib()
  }

}

class Number8651 : StressfulInteger {

  companion object {
    private var VALUE = 8651
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4325()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8650()
    val b = Number8649()
    return a.fib() + b.fib()
  }

}

class Number8652 : StressfulInteger {

  companion object {
    private var VALUE = 8652
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4326()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8651()
    val b = Number8650()
    return a.fib() + b.fib()
  }

}

class Number8653 : StressfulInteger {

  companion object {
    private var VALUE = 8653
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4326()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8652()
    val b = Number8651()
    return a.fib() + b.fib()
  }

}

class Number8654 : StressfulInteger {

  companion object {
    private var VALUE = 8654
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4327()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8653()
    val b = Number8652()
    return a.fib() + b.fib()
  }

}

class Number8655 : StressfulInteger {

  companion object {
    private var VALUE = 8655
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4327()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8654()
    val b = Number8653()
    return a.fib() + b.fib()
  }

}

class Number8656 : StressfulInteger {

  companion object {
    private var VALUE = 8656
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4328()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8655()
    val b = Number8654()
    return a.fib() + b.fib()
  }

}

class Number8657 : StressfulInteger {

  companion object {
    private var VALUE = 8657
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4328()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8656()
    val b = Number8655()
    return a.fib() + b.fib()
  }

}

class Number8658 : StressfulInteger {

  companion object {
    private var VALUE = 8658
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4329()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8657()
    val b = Number8656()
    return a.fib() + b.fib()
  }

}

class Number8659 : StressfulInteger {

  companion object {
    private var VALUE = 8659
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4329()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8658()
    val b = Number8657()
    return a.fib() + b.fib()
  }

}

class Number8660 : StressfulInteger {

  companion object {
    private var VALUE = 8660
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4330()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8659()
    val b = Number8658()
    return a.fib() + b.fib()
  }

}

class Number8661 : StressfulInteger {

  companion object {
    private var VALUE = 8661
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4330()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8660()
    val b = Number8659()
    return a.fib() + b.fib()
  }

}

class Number8662 : StressfulInteger {

  companion object {
    private var VALUE = 8662
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4331()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8661()
    val b = Number8660()
    return a.fib() + b.fib()
  }

}

class Number8663 : StressfulInteger {

  companion object {
    private var VALUE = 8663
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4331()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8662()
    val b = Number8661()
    return a.fib() + b.fib()
  }

}

class Number8664 : StressfulInteger {

  companion object {
    private var VALUE = 8664
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4332()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8663()
    val b = Number8662()
    return a.fib() + b.fib()
  }

}

class Number8665 : StressfulInteger {

  companion object {
    private var VALUE = 8665
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4332()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8664()
    val b = Number8663()
    return a.fib() + b.fib()
  }

}

class Number8666 : StressfulInteger {

  companion object {
    private var VALUE = 8666
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4333()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8665()
    val b = Number8664()
    return a.fib() + b.fib()
  }

}

class Number8667 : StressfulInteger {

  companion object {
    private var VALUE = 8667
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4333()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8666()
    val b = Number8665()
    return a.fib() + b.fib()
  }

}

class Number8668 : StressfulInteger {

  companion object {
    private var VALUE = 8668
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4334()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8667()
    val b = Number8666()
    return a.fib() + b.fib()
  }

}

class Number8669 : StressfulInteger {

  companion object {
    private var VALUE = 8669
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4334()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8668()
    val b = Number8667()
    return a.fib() + b.fib()
  }

}

class Number8670 : StressfulInteger {

  companion object {
    private var VALUE = 8670
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4335()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8669()
    val b = Number8668()
    return a.fib() + b.fib()
  }

}

class Number8671 : StressfulInteger {

  companion object {
    private var VALUE = 8671
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4335()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8670()
    val b = Number8669()
    return a.fib() + b.fib()
  }

}

class Number8672 : StressfulInteger {

  companion object {
    private var VALUE = 8672
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4336()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8671()
    val b = Number8670()
    return a.fib() + b.fib()
  }

}

class Number8673 : StressfulInteger {

  companion object {
    private var VALUE = 8673
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4336()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8672()
    val b = Number8671()
    return a.fib() + b.fib()
  }

}

class Number8674 : StressfulInteger {

  companion object {
    private var VALUE = 8674
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4337()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8673()
    val b = Number8672()
    return a.fib() + b.fib()
  }

}

class Number8675 : StressfulInteger {

  companion object {
    private var VALUE = 8675
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4337()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8674()
    val b = Number8673()
    return a.fib() + b.fib()
  }

}

class Number8676 : StressfulInteger {

  companion object {
    private var VALUE = 8676
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4338()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8675()
    val b = Number8674()
    return a.fib() + b.fib()
  }

}

class Number8677 : StressfulInteger {

  companion object {
    private var VALUE = 8677
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4338()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8676()
    val b = Number8675()
    return a.fib() + b.fib()
  }

}

class Number8678 : StressfulInteger {

  companion object {
    private var VALUE = 8678
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4339()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8677()
    val b = Number8676()
    return a.fib() + b.fib()
  }

}

class Number8679 : StressfulInteger {

  companion object {
    private var VALUE = 8679
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4339()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8678()
    val b = Number8677()
    return a.fib() + b.fib()
  }

}

class Number8680 : StressfulInteger {

  companion object {
    private var VALUE = 8680
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4340()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8679()
    val b = Number8678()
    return a.fib() + b.fib()
  }

}

class Number8681 : StressfulInteger {

  companion object {
    private var VALUE = 8681
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4340()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8680()
    val b = Number8679()
    return a.fib() + b.fib()
  }

}

class Number8682 : StressfulInteger {

  companion object {
    private var VALUE = 8682
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4341()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8681()
    val b = Number8680()
    return a.fib() + b.fib()
  }

}

class Number8683 : StressfulInteger {

  companion object {
    private var VALUE = 8683
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4341()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8682()
    val b = Number8681()
    return a.fib() + b.fib()
  }

}

class Number8684 : StressfulInteger {

  companion object {
    private var VALUE = 8684
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4342()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8683()
    val b = Number8682()
    return a.fib() + b.fib()
  }

}

class Number8685 : StressfulInteger {

  companion object {
    private var VALUE = 8685
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4342()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8684()
    val b = Number8683()
    return a.fib() + b.fib()
  }

}

class Number8686 : StressfulInteger {

  companion object {
    private var VALUE = 8686
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4343()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8685()
    val b = Number8684()
    return a.fib() + b.fib()
  }

}

class Number8687 : StressfulInteger {

  companion object {
    private var VALUE = 8687
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4343()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8686()
    val b = Number8685()
    return a.fib() + b.fib()
  }

}

class Number8688 : StressfulInteger {

  companion object {
    private var VALUE = 8688
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4344()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8687()
    val b = Number8686()
    return a.fib() + b.fib()
  }

}

class Number8689 : StressfulInteger {

  companion object {
    private var VALUE = 8689
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4344()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8688()
    val b = Number8687()
    return a.fib() + b.fib()
  }

}

class Number8690 : StressfulInteger {

  companion object {
    private var VALUE = 8690
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4345()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8689()
    val b = Number8688()
    return a.fib() + b.fib()
  }

}

class Number8691 : StressfulInteger {

  companion object {
    private var VALUE = 8691
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4345()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8690()
    val b = Number8689()
    return a.fib() + b.fib()
  }

}

class Number8692 : StressfulInteger {

  companion object {
    private var VALUE = 8692
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4346()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8691()
    val b = Number8690()
    return a.fib() + b.fib()
  }

}

class Number8693 : StressfulInteger {

  companion object {
    private var VALUE = 8693
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4346()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8692()
    val b = Number8691()
    return a.fib() + b.fib()
  }

}

class Number8694 : StressfulInteger {

  companion object {
    private var VALUE = 8694
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4347()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8693()
    val b = Number8692()
    return a.fib() + b.fib()
  }

}

class Number8695 : StressfulInteger {

  companion object {
    private var VALUE = 8695
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4347()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8694()
    val b = Number8693()
    return a.fib() + b.fib()
  }

}

class Number8696 : StressfulInteger {

  companion object {
    private var VALUE = 8696
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4348()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8695()
    val b = Number8694()
    return a.fib() + b.fib()
  }

}

class Number8697 : StressfulInteger {

  companion object {
    private var VALUE = 8697
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4348()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8696()
    val b = Number8695()
    return a.fib() + b.fib()
  }

}

class Number8698 : StressfulInteger {

  companion object {
    private var VALUE = 8698
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4349()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8697()
    val b = Number8696()
    return a.fib() + b.fib()
  }

}

class Number8699 : StressfulInteger {

  companion object {
    private var VALUE = 8699
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4349()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8698()
    val b = Number8697()
    return a.fib() + b.fib()
  }

}

class Number8700 : StressfulInteger {

  companion object {
    private var VALUE = 8700
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4350()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8699()
    val b = Number8698()
    return a.fib() + b.fib()
  }

}

class Number8701 : StressfulInteger {

  companion object {
    private var VALUE = 8701
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4350()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8700()
    val b = Number8699()
    return a.fib() + b.fib()
  }

}

class Number8702 : StressfulInteger {

  companion object {
    private var VALUE = 8702
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4351()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8701()
    val b = Number8700()
    return a.fib() + b.fib()
  }

}

class Number8703 : StressfulInteger {

  companion object {
    private var VALUE = 8703
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4351()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8702()
    val b = Number8701()
    return a.fib() + b.fib()
  }

}

class Number8704 : StressfulInteger {

  companion object {
    private var VALUE = 8704
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4352()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8703()
    val b = Number8702()
    return a.fib() + b.fib()
  }

}

class Number8705 : StressfulInteger {

  companion object {
    private var VALUE = 8705
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4352()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8704()
    val b = Number8703()
    return a.fib() + b.fib()
  }

}

class Number8706 : StressfulInteger {

  companion object {
    private var VALUE = 8706
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4353()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8705()
    val b = Number8704()
    return a.fib() + b.fib()
  }

}

class Number8707 : StressfulInteger {

  companion object {
    private var VALUE = 8707
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4353()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8706()
    val b = Number8705()
    return a.fib() + b.fib()
  }

}

class Number8708 : StressfulInteger {

  companion object {
    private var VALUE = 8708
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4354()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8707()
    val b = Number8706()
    return a.fib() + b.fib()
  }

}

class Number8709 : StressfulInteger {

  companion object {
    private var VALUE = 8709
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4354()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8708()
    val b = Number8707()
    return a.fib() + b.fib()
  }

}

class Number8710 : StressfulInteger {

  companion object {
    private var VALUE = 8710
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4355()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8709()
    val b = Number8708()
    return a.fib() + b.fib()
  }

}

class Number8711 : StressfulInteger {

  companion object {
    private var VALUE = 8711
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4355()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8710()
    val b = Number8709()
    return a.fib() + b.fib()
  }

}

class Number8712 : StressfulInteger {

  companion object {
    private var VALUE = 8712
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4356()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8711()
    val b = Number8710()
    return a.fib() + b.fib()
  }

}

class Number8713 : StressfulInteger {

  companion object {
    private var VALUE = 8713
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4356()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8712()
    val b = Number8711()
    return a.fib() + b.fib()
  }

}

class Number8714 : StressfulInteger {

  companion object {
    private var VALUE = 8714
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4357()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8713()
    val b = Number8712()
    return a.fib() + b.fib()
  }

}

class Number8715 : StressfulInteger {

  companion object {
    private var VALUE = 8715
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4357()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8714()
    val b = Number8713()
    return a.fib() + b.fib()
  }

}

class Number8716 : StressfulInteger {

  companion object {
    private var VALUE = 8716
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4358()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8715()
    val b = Number8714()
    return a.fib() + b.fib()
  }

}

class Number8717 : StressfulInteger {

  companion object {
    private var VALUE = 8717
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4358()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8716()
    val b = Number8715()
    return a.fib() + b.fib()
  }

}

class Number8718 : StressfulInteger {

  companion object {
    private var VALUE = 8718
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4359()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8717()
    val b = Number8716()
    return a.fib() + b.fib()
  }

}

class Number8719 : StressfulInteger {

  companion object {
    private var VALUE = 8719
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4359()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8718()
    val b = Number8717()
    return a.fib() + b.fib()
  }

}

class Number8720 : StressfulInteger {

  companion object {
    private var VALUE = 8720
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4360()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8719()
    val b = Number8718()
    return a.fib() + b.fib()
  }

}

class Number8721 : StressfulInteger {

  companion object {
    private var VALUE = 8721
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4360()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8720()
    val b = Number8719()
    return a.fib() + b.fib()
  }

}

class Number8722 : StressfulInteger {

  companion object {
    private var VALUE = 8722
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4361()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8721()
    val b = Number8720()
    return a.fib() + b.fib()
  }

}

class Number8723 : StressfulInteger {

  companion object {
    private var VALUE = 8723
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4361()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8722()
    val b = Number8721()
    return a.fib() + b.fib()
  }

}

class Number8724 : StressfulInteger {

  companion object {
    private var VALUE = 8724
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4362()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8723()
    val b = Number8722()
    return a.fib() + b.fib()
  }

}

class Number8725 : StressfulInteger {

  companion object {
    private var VALUE = 8725
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4362()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8724()
    val b = Number8723()
    return a.fib() + b.fib()
  }

}

class Number8726 : StressfulInteger {

  companion object {
    private var VALUE = 8726
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4363()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8725()
    val b = Number8724()
    return a.fib() + b.fib()
  }

}

class Number8727 : StressfulInteger {

  companion object {
    private var VALUE = 8727
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4363()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8726()
    val b = Number8725()
    return a.fib() + b.fib()
  }

}

class Number8728 : StressfulInteger {

  companion object {
    private var VALUE = 8728
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4364()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8727()
    val b = Number8726()
    return a.fib() + b.fib()
  }

}

class Number8729 : StressfulInteger {

  companion object {
    private var VALUE = 8729
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4364()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8728()
    val b = Number8727()
    return a.fib() + b.fib()
  }

}

class Number8730 : StressfulInteger {

  companion object {
    private var VALUE = 8730
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4365()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8729()
    val b = Number8728()
    return a.fib() + b.fib()
  }

}

class Number8731 : StressfulInteger {

  companion object {
    private var VALUE = 8731
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4365()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8730()
    val b = Number8729()
    return a.fib() + b.fib()
  }

}

class Number8732 : StressfulInteger {

  companion object {
    private var VALUE = 8732
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4366()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8731()
    val b = Number8730()
    return a.fib() + b.fib()
  }

}

class Number8733 : StressfulInteger {

  companion object {
    private var VALUE = 8733
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4366()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8732()
    val b = Number8731()
    return a.fib() + b.fib()
  }

}

class Number8734 : StressfulInteger {

  companion object {
    private var VALUE = 8734
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4367()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8733()
    val b = Number8732()
    return a.fib() + b.fib()
  }

}

class Number8735 : StressfulInteger {

  companion object {
    private var VALUE = 8735
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4367()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8734()
    val b = Number8733()
    return a.fib() + b.fib()
  }

}

class Number8736 : StressfulInteger {

  companion object {
    private var VALUE = 8736
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4368()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8735()
    val b = Number8734()
    return a.fib() + b.fib()
  }

}

class Number8737 : StressfulInteger {

  companion object {
    private var VALUE = 8737
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4368()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8736()
    val b = Number8735()
    return a.fib() + b.fib()
  }

}

class Number8738 : StressfulInteger {

  companion object {
    private var VALUE = 8738
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4369()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8737()
    val b = Number8736()
    return a.fib() + b.fib()
  }

}

class Number8739 : StressfulInteger {

  companion object {
    private var VALUE = 8739
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4369()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8738()
    val b = Number8737()
    return a.fib() + b.fib()
  }

}

class Number8740 : StressfulInteger {

  companion object {
    private var VALUE = 8740
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4370()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8739()
    val b = Number8738()
    return a.fib() + b.fib()
  }

}

class Number8741 : StressfulInteger {

  companion object {
    private var VALUE = 8741
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4370()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8740()
    val b = Number8739()
    return a.fib() + b.fib()
  }

}

class Number8742 : StressfulInteger {

  companion object {
    private var VALUE = 8742
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4371()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8741()
    val b = Number8740()
    return a.fib() + b.fib()
  }

}

class Number8743 : StressfulInteger {

  companion object {
    private var VALUE = 8743
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4371()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8742()
    val b = Number8741()
    return a.fib() + b.fib()
  }

}

class Number8744 : StressfulInteger {

  companion object {
    private var VALUE = 8744
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4372()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8743()
    val b = Number8742()
    return a.fib() + b.fib()
  }

}

class Number8745 : StressfulInteger {

  companion object {
    private var VALUE = 8745
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4372()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8744()
    val b = Number8743()
    return a.fib() + b.fib()
  }

}

class Number8746 : StressfulInteger {

  companion object {
    private var VALUE = 8746
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4373()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8745()
    val b = Number8744()
    return a.fib() + b.fib()
  }

}

class Number8747 : StressfulInteger {

  companion object {
    private var VALUE = 8747
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4373()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8746()
    val b = Number8745()
    return a.fib() + b.fib()
  }

}

class Number8748 : StressfulInteger {

  companion object {
    private var VALUE = 8748
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4374()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8747()
    val b = Number8746()
    return a.fib() + b.fib()
  }

}

class Number8749 : StressfulInteger {

  companion object {
    private var VALUE = 8749
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4374()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8748()
    val b = Number8747()
    return a.fib() + b.fib()
  }

}

class Number8750 : StressfulInteger {

  companion object {
    private var VALUE = 8750
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4375()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8749()
    val b = Number8748()
    return a.fib() + b.fib()
  }

}

class Number8751 : StressfulInteger {

  companion object {
    private var VALUE = 8751
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4375()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8750()
    val b = Number8749()
    return a.fib() + b.fib()
  }

}

class Number8752 : StressfulInteger {

  companion object {
    private var VALUE = 8752
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4376()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8751()
    val b = Number8750()
    return a.fib() + b.fib()
  }

}

class Number8753 : StressfulInteger {

  companion object {
    private var VALUE = 8753
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4376()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8752()
    val b = Number8751()
    return a.fib() + b.fib()
  }

}

class Number8754 : StressfulInteger {

  companion object {
    private var VALUE = 8754
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4377()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8753()
    val b = Number8752()
    return a.fib() + b.fib()
  }

}

class Number8755 : StressfulInteger {

  companion object {
    private var VALUE = 8755
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4377()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8754()
    val b = Number8753()
    return a.fib() + b.fib()
  }

}

class Number8756 : StressfulInteger {

  companion object {
    private var VALUE = 8756
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4378()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8755()
    val b = Number8754()
    return a.fib() + b.fib()
  }

}

class Number8757 : StressfulInteger {

  companion object {
    private var VALUE = 8757
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4378()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8756()
    val b = Number8755()
    return a.fib() + b.fib()
  }

}

class Number8758 : StressfulInteger {

  companion object {
    private var VALUE = 8758
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4379()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8757()
    val b = Number8756()
    return a.fib() + b.fib()
  }

}

class Number8759 : StressfulInteger {

  companion object {
    private var VALUE = 8759
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4379()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8758()
    val b = Number8757()
    return a.fib() + b.fib()
  }

}

class Number8760 : StressfulInteger {

  companion object {
    private var VALUE = 8760
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4380()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8759()
    val b = Number8758()
    return a.fib() + b.fib()
  }

}

class Number8761 : StressfulInteger {

  companion object {
    private var VALUE = 8761
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4380()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8760()
    val b = Number8759()
    return a.fib() + b.fib()
  }

}

class Number8762 : StressfulInteger {

  companion object {
    private var VALUE = 8762
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4381()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8761()
    val b = Number8760()
    return a.fib() + b.fib()
  }

}

class Number8763 : StressfulInteger {

  companion object {
    private var VALUE = 8763
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4381()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8762()
    val b = Number8761()
    return a.fib() + b.fib()
  }

}

class Number8764 : StressfulInteger {

  companion object {
    private var VALUE = 8764
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4382()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8763()
    val b = Number8762()
    return a.fib() + b.fib()
  }

}

class Number8765 : StressfulInteger {

  companion object {
    private var VALUE = 8765
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4382()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8764()
    val b = Number8763()
    return a.fib() + b.fib()
  }

}

class Number8766 : StressfulInteger {

  companion object {
    private var VALUE = 8766
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4383()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8765()
    val b = Number8764()
    return a.fib() + b.fib()
  }

}

class Number8767 : StressfulInteger {

  companion object {
    private var VALUE = 8767
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4383()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8766()
    val b = Number8765()
    return a.fib() + b.fib()
  }

}

class Number8768 : StressfulInteger {

  companion object {
    private var VALUE = 8768
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4384()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8767()
    val b = Number8766()
    return a.fib() + b.fib()
  }

}

class Number8769 : StressfulInteger {

  companion object {
    private var VALUE = 8769
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4384()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8768()
    val b = Number8767()
    return a.fib() + b.fib()
  }

}

class Number8770 : StressfulInteger {

  companion object {
    private var VALUE = 8770
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4385()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8769()
    val b = Number8768()
    return a.fib() + b.fib()
  }

}

class Number8771 : StressfulInteger {

  companion object {
    private var VALUE = 8771
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4385()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8770()
    val b = Number8769()
    return a.fib() + b.fib()
  }

}

class Number8772 : StressfulInteger {

  companion object {
    private var VALUE = 8772
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4386()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8771()
    val b = Number8770()
    return a.fib() + b.fib()
  }

}

class Number8773 : StressfulInteger {

  companion object {
    private var VALUE = 8773
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4386()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8772()
    val b = Number8771()
    return a.fib() + b.fib()
  }

}

class Number8774 : StressfulInteger {

  companion object {
    private var VALUE = 8774
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4387()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8773()
    val b = Number8772()
    return a.fib() + b.fib()
  }

}

class Number8775 : StressfulInteger {

  companion object {
    private var VALUE = 8775
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4387()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8774()
    val b = Number8773()
    return a.fib() + b.fib()
  }

}

class Number8776 : StressfulInteger {

  companion object {
    private var VALUE = 8776
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4388()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8775()
    val b = Number8774()
    return a.fib() + b.fib()
  }

}

class Number8777 : StressfulInteger {

  companion object {
    private var VALUE = 8777
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4388()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8776()
    val b = Number8775()
    return a.fib() + b.fib()
  }

}

class Number8778 : StressfulInteger {

  companion object {
    private var VALUE = 8778
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4389()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8777()
    val b = Number8776()
    return a.fib() + b.fib()
  }

}

class Number8779 : StressfulInteger {

  companion object {
    private var VALUE = 8779
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4389()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8778()
    val b = Number8777()
    return a.fib() + b.fib()
  }

}

class Number8780 : StressfulInteger {

  companion object {
    private var VALUE = 8780
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4390()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8779()
    val b = Number8778()
    return a.fib() + b.fib()
  }

}

class Number8781 : StressfulInteger {

  companion object {
    private var VALUE = 8781
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4390()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8780()
    val b = Number8779()
    return a.fib() + b.fib()
  }

}

class Number8782 : StressfulInteger {

  companion object {
    private var VALUE = 8782
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4391()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8781()
    val b = Number8780()
    return a.fib() + b.fib()
  }

}

class Number8783 : StressfulInteger {

  companion object {
    private var VALUE = 8783
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4391()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8782()
    val b = Number8781()
    return a.fib() + b.fib()
  }

}

class Number8784 : StressfulInteger {

  companion object {
    private var VALUE = 8784
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4392()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8783()
    val b = Number8782()
    return a.fib() + b.fib()
  }

}

class Number8785 : StressfulInteger {

  companion object {
    private var VALUE = 8785
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4392()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8784()
    val b = Number8783()
    return a.fib() + b.fib()
  }

}

class Number8786 : StressfulInteger {

  companion object {
    private var VALUE = 8786
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4393()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8785()
    val b = Number8784()
    return a.fib() + b.fib()
  }

}

class Number8787 : StressfulInteger {

  companion object {
    private var VALUE = 8787
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4393()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8786()
    val b = Number8785()
    return a.fib() + b.fib()
  }

}

class Number8788 : StressfulInteger {

  companion object {
    private var VALUE = 8788
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4394()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8787()
    val b = Number8786()
    return a.fib() + b.fib()
  }

}

class Number8789 : StressfulInteger {

  companion object {
    private var VALUE = 8789
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4394()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8788()
    val b = Number8787()
    return a.fib() + b.fib()
  }

}

class Number8790 : StressfulInteger {

  companion object {
    private var VALUE = 8790
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4395()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8789()
    val b = Number8788()
    return a.fib() + b.fib()
  }

}

class Number8791 : StressfulInteger {

  companion object {
    private var VALUE = 8791
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4395()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8790()
    val b = Number8789()
    return a.fib() + b.fib()
  }

}

class Number8792 : StressfulInteger {

  companion object {
    private var VALUE = 8792
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4396()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8791()
    val b = Number8790()
    return a.fib() + b.fib()
  }

}

class Number8793 : StressfulInteger {

  companion object {
    private var VALUE = 8793
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4396()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8792()
    val b = Number8791()
    return a.fib() + b.fib()
  }

}

class Number8794 : StressfulInteger {

  companion object {
    private var VALUE = 8794
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4397()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8793()
    val b = Number8792()
    return a.fib() + b.fib()
  }

}

class Number8795 : StressfulInteger {

  companion object {
    private var VALUE = 8795
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4397()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8794()
    val b = Number8793()
    return a.fib() + b.fib()
  }

}

class Number8796 : StressfulInteger {

  companion object {
    private var VALUE = 8796
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4398()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8795()
    val b = Number8794()
    return a.fib() + b.fib()
  }

}

class Number8797 : StressfulInteger {

  companion object {
    private var VALUE = 8797
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4398()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8796()
    val b = Number8795()
    return a.fib() + b.fib()
  }

}

class Number8798 : StressfulInteger {

  companion object {
    private var VALUE = 8798
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4399()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8797()
    val b = Number8796()
    return a.fib() + b.fib()
  }

}

class Number8799 : StressfulInteger {

  companion object {
    private var VALUE = 8799
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4399()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8798()
    val b = Number8797()
    return a.fib() + b.fib()
  }

}

class Number8800 : StressfulInteger {

  companion object {
    private var VALUE = 8800
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4400()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8799()
    val b = Number8798()
    return a.fib() + b.fib()
  }

}

class Number8801 : StressfulInteger {

  companion object {
    private var VALUE = 8801
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4400()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8800()
    val b = Number8799()
    return a.fib() + b.fib()
  }

}

class Number8802 : StressfulInteger {

  companion object {
    private var VALUE = 8802
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4401()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8801()
    val b = Number8800()
    return a.fib() + b.fib()
  }

}

class Number8803 : StressfulInteger {

  companion object {
    private var VALUE = 8803
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4401()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8802()
    val b = Number8801()
    return a.fib() + b.fib()
  }

}

class Number8804 : StressfulInteger {

  companion object {
    private var VALUE = 8804
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4402()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8803()
    val b = Number8802()
    return a.fib() + b.fib()
  }

}

class Number8805 : StressfulInteger {

  companion object {
    private var VALUE = 8805
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4402()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8804()
    val b = Number8803()
    return a.fib() + b.fib()
  }

}

class Number8806 : StressfulInteger {

  companion object {
    private var VALUE = 8806
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4403()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8805()
    val b = Number8804()
    return a.fib() + b.fib()
  }

}

class Number8807 : StressfulInteger {

  companion object {
    private var VALUE = 8807
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4403()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8806()
    val b = Number8805()
    return a.fib() + b.fib()
  }

}

class Number8808 : StressfulInteger {

  companion object {
    private var VALUE = 8808
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4404()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8807()
    val b = Number8806()
    return a.fib() + b.fib()
  }

}

class Number8809 : StressfulInteger {

  companion object {
    private var VALUE = 8809
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4404()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8808()
    val b = Number8807()
    return a.fib() + b.fib()
  }

}

class Number8810 : StressfulInteger {

  companion object {
    private var VALUE = 8810
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4405()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8809()
    val b = Number8808()
    return a.fib() + b.fib()
  }

}

class Number8811 : StressfulInteger {

  companion object {
    private var VALUE = 8811
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4405()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8810()
    val b = Number8809()
    return a.fib() + b.fib()
  }

}

class Number8812 : StressfulInteger {

  companion object {
    private var VALUE = 8812
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4406()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8811()
    val b = Number8810()
    return a.fib() + b.fib()
  }

}

class Number8813 : StressfulInteger {

  companion object {
    private var VALUE = 8813
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4406()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8812()
    val b = Number8811()
    return a.fib() + b.fib()
  }

}

class Number8814 : StressfulInteger {

  companion object {
    private var VALUE = 8814
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4407()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8813()
    val b = Number8812()
    return a.fib() + b.fib()
  }

}

class Number8815 : StressfulInteger {

  companion object {
    private var VALUE = 8815
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4407()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8814()
    val b = Number8813()
    return a.fib() + b.fib()
  }

}

class Number8816 : StressfulInteger {

  companion object {
    private var VALUE = 8816
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4408()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8815()
    val b = Number8814()
    return a.fib() + b.fib()
  }

}

class Number8817 : StressfulInteger {

  companion object {
    private var VALUE = 8817
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4408()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8816()
    val b = Number8815()
    return a.fib() + b.fib()
  }

}

class Number8818 : StressfulInteger {

  companion object {
    private var VALUE = 8818
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4409()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8817()
    val b = Number8816()
    return a.fib() + b.fib()
  }

}

class Number8819 : StressfulInteger {

  companion object {
    private var VALUE = 8819
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4409()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8818()
    val b = Number8817()
    return a.fib() + b.fib()
  }

}

class Number8820 : StressfulInteger {

  companion object {
    private var VALUE = 8820
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4410()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8819()
    val b = Number8818()
    return a.fib() + b.fib()
  }

}

class Number8821 : StressfulInteger {

  companion object {
    private var VALUE = 8821
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4410()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8820()
    val b = Number8819()
    return a.fib() + b.fib()
  }

}

class Number8822 : StressfulInteger {

  companion object {
    private var VALUE = 8822
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4411()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8821()
    val b = Number8820()
    return a.fib() + b.fib()
  }

}

class Number8823 : StressfulInteger {

  companion object {
    private var VALUE = 8823
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4411()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8822()
    val b = Number8821()
    return a.fib() + b.fib()
  }

}

class Number8824 : StressfulInteger {

  companion object {
    private var VALUE = 8824
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4412()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8823()
    val b = Number8822()
    return a.fib() + b.fib()
  }

}

class Number8825 : StressfulInteger {

  companion object {
    private var VALUE = 8825
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4412()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8824()
    val b = Number8823()
    return a.fib() + b.fib()
  }

}

class Number8826 : StressfulInteger {

  companion object {
    private var VALUE = 8826
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4413()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8825()
    val b = Number8824()
    return a.fib() + b.fib()
  }

}

class Number8827 : StressfulInteger {

  companion object {
    private var VALUE = 8827
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4413()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8826()
    val b = Number8825()
    return a.fib() + b.fib()
  }

}

class Number8828 : StressfulInteger {

  companion object {
    private var VALUE = 8828
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4414()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8827()
    val b = Number8826()
    return a.fib() + b.fib()
  }

}

class Number8829 : StressfulInteger {

  companion object {
    private var VALUE = 8829
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4414()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8828()
    val b = Number8827()
    return a.fib() + b.fib()
  }

}

class Number8830 : StressfulInteger {

  companion object {
    private var VALUE = 8830
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4415()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8829()
    val b = Number8828()
    return a.fib() + b.fib()
  }

}

class Number8831 : StressfulInteger {

  companion object {
    private var VALUE = 8831
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4415()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8830()
    val b = Number8829()
    return a.fib() + b.fib()
  }

}

class Number8832 : StressfulInteger {

  companion object {
    private var VALUE = 8832
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4416()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8831()
    val b = Number8830()
    return a.fib() + b.fib()
  }

}

class Number8833 : StressfulInteger {

  companion object {
    private var VALUE = 8833
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4416()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8832()
    val b = Number8831()
    return a.fib() + b.fib()
  }

}

class Number8834 : StressfulInteger {

  companion object {
    private var VALUE = 8834
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4417()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8833()
    val b = Number8832()
    return a.fib() + b.fib()
  }

}

class Number8835 : StressfulInteger {

  companion object {
    private var VALUE = 8835
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4417()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8834()
    val b = Number8833()
    return a.fib() + b.fib()
  }

}

class Number8836 : StressfulInteger {

  companion object {
    private var VALUE = 8836
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4418()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8835()
    val b = Number8834()
    return a.fib() + b.fib()
  }

}

class Number8837 : StressfulInteger {

  companion object {
    private var VALUE = 8837
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4418()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8836()
    val b = Number8835()
    return a.fib() + b.fib()
  }

}

class Number8838 : StressfulInteger {

  companion object {
    private var VALUE = 8838
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4419()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8837()
    val b = Number8836()
    return a.fib() + b.fib()
  }

}

class Number8839 : StressfulInteger {

  companion object {
    private var VALUE = 8839
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4419()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8838()
    val b = Number8837()
    return a.fib() + b.fib()
  }

}

class Number8840 : StressfulInteger {

  companion object {
    private var VALUE = 8840
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4420()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8839()
    val b = Number8838()
    return a.fib() + b.fib()
  }

}

class Number8841 : StressfulInteger {

  companion object {
    private var VALUE = 8841
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4420()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8840()
    val b = Number8839()
    return a.fib() + b.fib()
  }

}

class Number8842 : StressfulInteger {

  companion object {
    private var VALUE = 8842
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4421()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8841()
    val b = Number8840()
    return a.fib() + b.fib()
  }

}

class Number8843 : StressfulInteger {

  companion object {
    private var VALUE = 8843
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4421()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8842()
    val b = Number8841()
    return a.fib() + b.fib()
  }

}

class Number8844 : StressfulInteger {

  companion object {
    private var VALUE = 8844
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4422()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8843()
    val b = Number8842()
    return a.fib() + b.fib()
  }

}

class Number8845 : StressfulInteger {

  companion object {
    private var VALUE = 8845
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4422()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8844()
    val b = Number8843()
    return a.fib() + b.fib()
  }

}

class Number8846 : StressfulInteger {

  companion object {
    private var VALUE = 8846
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4423()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8845()
    val b = Number8844()
    return a.fib() + b.fib()
  }

}

class Number8847 : StressfulInteger {

  companion object {
    private var VALUE = 8847
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4423()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8846()
    val b = Number8845()
    return a.fib() + b.fib()
  }

}

class Number8848 : StressfulInteger {

  companion object {
    private var VALUE = 8848
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4424()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8847()
    val b = Number8846()
    return a.fib() + b.fib()
  }

}

class Number8849 : StressfulInteger {

  companion object {
    private var VALUE = 8849
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4424()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8848()
    val b = Number8847()
    return a.fib() + b.fib()
  }

}

class Number8850 : StressfulInteger {

  companion object {
    private var VALUE = 8850
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4425()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8849()
    val b = Number8848()
    return a.fib() + b.fib()
  }

}

class Number8851 : StressfulInteger {

  companion object {
    private var VALUE = 8851
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4425()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8850()
    val b = Number8849()
    return a.fib() + b.fib()
  }

}

class Number8852 : StressfulInteger {

  companion object {
    private var VALUE = 8852
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4426()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8851()
    val b = Number8850()
    return a.fib() + b.fib()
  }

}

class Number8853 : StressfulInteger {

  companion object {
    private var VALUE = 8853
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4426()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8852()
    val b = Number8851()
    return a.fib() + b.fib()
  }

}

class Number8854 : StressfulInteger {

  companion object {
    private var VALUE = 8854
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4427()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8853()
    val b = Number8852()
    return a.fib() + b.fib()
  }

}

class Number8855 : StressfulInteger {

  companion object {
    private var VALUE = 8855
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4427()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8854()
    val b = Number8853()
    return a.fib() + b.fib()
  }

}

class Number8856 : StressfulInteger {

  companion object {
    private var VALUE = 8856
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4428()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8855()
    val b = Number8854()
    return a.fib() + b.fib()
  }

}

class Number8857 : StressfulInteger {

  companion object {
    private var VALUE = 8857
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4428()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8856()
    val b = Number8855()
    return a.fib() + b.fib()
  }

}

class Number8858 : StressfulInteger {

  companion object {
    private var VALUE = 8858
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4429()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8857()
    val b = Number8856()
    return a.fib() + b.fib()
  }

}

class Number8859 : StressfulInteger {

  companion object {
    private var VALUE = 8859
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4429()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8858()
    val b = Number8857()
    return a.fib() + b.fib()
  }

}

class Number8860 : StressfulInteger {

  companion object {
    private var VALUE = 8860
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4430()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8859()
    val b = Number8858()
    return a.fib() + b.fib()
  }

}

class Number8861 : StressfulInteger {

  companion object {
    private var VALUE = 8861
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4430()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8860()
    val b = Number8859()
    return a.fib() + b.fib()
  }

}

class Number8862 : StressfulInteger {

  companion object {
    private var VALUE = 8862
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4431()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8861()
    val b = Number8860()
    return a.fib() + b.fib()
  }

}

class Number8863 : StressfulInteger {

  companion object {
    private var VALUE = 8863
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4431()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8862()
    val b = Number8861()
    return a.fib() + b.fib()
  }

}

class Number8864 : StressfulInteger {

  companion object {
    private var VALUE = 8864
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4432()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8863()
    val b = Number8862()
    return a.fib() + b.fib()
  }

}

class Number8865 : StressfulInteger {

  companion object {
    private var VALUE = 8865
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4432()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8864()
    val b = Number8863()
    return a.fib() + b.fib()
  }

}

class Number8866 : StressfulInteger {

  companion object {
    private var VALUE = 8866
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4433()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8865()
    val b = Number8864()
    return a.fib() + b.fib()
  }

}

class Number8867 : StressfulInteger {

  companion object {
    private var VALUE = 8867
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4433()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8866()
    val b = Number8865()
    return a.fib() + b.fib()
  }

}

class Number8868 : StressfulInteger {

  companion object {
    private var VALUE = 8868
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4434()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8867()
    val b = Number8866()
    return a.fib() + b.fib()
  }

}

class Number8869 : StressfulInteger {

  companion object {
    private var VALUE = 8869
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4434()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8868()
    val b = Number8867()
    return a.fib() + b.fib()
  }

}

class Number8870 : StressfulInteger {

  companion object {
    private var VALUE = 8870
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4435()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8869()
    val b = Number8868()
    return a.fib() + b.fib()
  }

}

class Number8871 : StressfulInteger {

  companion object {
    private var VALUE = 8871
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4435()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8870()
    val b = Number8869()
    return a.fib() + b.fib()
  }

}

class Number8872 : StressfulInteger {

  companion object {
    private var VALUE = 8872
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4436()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8871()
    val b = Number8870()
    return a.fib() + b.fib()
  }

}

class Number8873 : StressfulInteger {

  companion object {
    private var VALUE = 8873
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4436()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8872()
    val b = Number8871()
    return a.fib() + b.fib()
  }

}

class Number8874 : StressfulInteger {

  companion object {
    private var VALUE = 8874
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4437()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8873()
    val b = Number8872()
    return a.fib() + b.fib()
  }

}

class Number8875 : StressfulInteger {

  companion object {
    private var VALUE = 8875
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4437()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8874()
    val b = Number8873()
    return a.fib() + b.fib()
  }

}

class Number8876 : StressfulInteger {

  companion object {
    private var VALUE = 8876
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4438()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8875()
    val b = Number8874()
    return a.fib() + b.fib()
  }

}

class Number8877 : StressfulInteger {

  companion object {
    private var VALUE = 8877
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4438()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8876()
    val b = Number8875()
    return a.fib() + b.fib()
  }

}

class Number8878 : StressfulInteger {

  companion object {
    private var VALUE = 8878
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4439()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8877()
    val b = Number8876()
    return a.fib() + b.fib()
  }

}

class Number8879 : StressfulInteger {

  companion object {
    private var VALUE = 8879
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4439()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8878()
    val b = Number8877()
    return a.fib() + b.fib()
  }

}

class Number8880 : StressfulInteger {

  companion object {
    private var VALUE = 8880
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4440()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8879()
    val b = Number8878()
    return a.fib() + b.fib()
  }

}

class Number8881 : StressfulInteger {

  companion object {
    private var VALUE = 8881
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4440()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8880()
    val b = Number8879()
    return a.fib() + b.fib()
  }

}

class Number8882 : StressfulInteger {

  companion object {
    private var VALUE = 8882
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4441()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8881()
    val b = Number8880()
    return a.fib() + b.fib()
  }

}

class Number8883 : StressfulInteger {

  companion object {
    private var VALUE = 8883
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4441()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8882()
    val b = Number8881()
    return a.fib() + b.fib()
  }

}

class Number8884 : StressfulInteger {

  companion object {
    private var VALUE = 8884
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4442()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8883()
    val b = Number8882()
    return a.fib() + b.fib()
  }

}

class Number8885 : StressfulInteger {

  companion object {
    private var VALUE = 8885
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4442()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8884()
    val b = Number8883()
    return a.fib() + b.fib()
  }

}

class Number8886 : StressfulInteger {

  companion object {
    private var VALUE = 8886
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4443()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8885()
    val b = Number8884()
    return a.fib() + b.fib()
  }

}

class Number8887 : StressfulInteger {

  companion object {
    private var VALUE = 8887
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4443()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8886()
    val b = Number8885()
    return a.fib() + b.fib()
  }

}

class Number8888 : StressfulInteger {

  companion object {
    private var VALUE = 8888
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4444()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8887()
    val b = Number8886()
    return a.fib() + b.fib()
  }

}

class Number8889 : StressfulInteger {

  companion object {
    private var VALUE = 8889
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4444()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8888()
    val b = Number8887()
    return a.fib() + b.fib()
  }

}

class Number8890 : StressfulInteger {

  companion object {
    private var VALUE = 8890
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4445()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8889()
    val b = Number8888()
    return a.fib() + b.fib()
  }

}

class Number8891 : StressfulInteger {

  companion object {
    private var VALUE = 8891
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4445()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8890()
    val b = Number8889()
    return a.fib() + b.fib()
  }

}

class Number8892 : StressfulInteger {

  companion object {
    private var VALUE = 8892
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4446()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8891()
    val b = Number8890()
    return a.fib() + b.fib()
  }

}

class Number8893 : StressfulInteger {

  companion object {
    private var VALUE = 8893
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4446()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8892()
    val b = Number8891()
    return a.fib() + b.fib()
  }

}

class Number8894 : StressfulInteger {

  companion object {
    private var VALUE = 8894
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4447()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8893()
    val b = Number8892()
    return a.fib() + b.fib()
  }

}

class Number8895 : StressfulInteger {

  companion object {
    private var VALUE = 8895
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4447()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8894()
    val b = Number8893()
    return a.fib() + b.fib()
  }

}

class Number8896 : StressfulInteger {

  companion object {
    private var VALUE = 8896
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4448()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8895()
    val b = Number8894()
    return a.fib() + b.fib()
  }

}

class Number8897 : StressfulInteger {

  companion object {
    private var VALUE = 8897
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4448()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8896()
    val b = Number8895()
    return a.fib() + b.fib()
  }

}

class Number8898 : StressfulInteger {

  companion object {
    private var VALUE = 8898
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4449()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8897()
    val b = Number8896()
    return a.fib() + b.fib()
  }

}

class Number8899 : StressfulInteger {

  companion object {
    private var VALUE = 8899
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4449()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8898()
    val b = Number8897()
    return a.fib() + b.fib()
  }

}

class Number8900 : StressfulInteger {

  companion object {
    private var VALUE = 8900
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4450()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8899()
    val b = Number8898()
    return a.fib() + b.fib()
  }

}

class Number8901 : StressfulInteger {

  companion object {
    private var VALUE = 8901
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4450()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8900()
    val b = Number8899()
    return a.fib() + b.fib()
  }

}

class Number8902 : StressfulInteger {

  companion object {
    private var VALUE = 8902
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4451()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8901()
    val b = Number8900()
    return a.fib() + b.fib()
  }

}

class Number8903 : StressfulInteger {

  companion object {
    private var VALUE = 8903
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4451()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8902()
    val b = Number8901()
    return a.fib() + b.fib()
  }

}

class Number8904 : StressfulInteger {

  companion object {
    private var VALUE = 8904
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4452()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8903()
    val b = Number8902()
    return a.fib() + b.fib()
  }

}

class Number8905 : StressfulInteger {

  companion object {
    private var VALUE = 8905
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4452()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8904()
    val b = Number8903()
    return a.fib() + b.fib()
  }

}

class Number8906 : StressfulInteger {

  companion object {
    private var VALUE = 8906
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4453()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8905()
    val b = Number8904()
    return a.fib() + b.fib()
  }

}

class Number8907 : StressfulInteger {

  companion object {
    private var VALUE = 8907
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4453()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8906()
    val b = Number8905()
    return a.fib() + b.fib()
  }

}

class Number8908 : StressfulInteger {

  companion object {
    private var VALUE = 8908
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4454()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8907()
    val b = Number8906()
    return a.fib() + b.fib()
  }

}

class Number8909 : StressfulInteger {

  companion object {
    private var VALUE = 8909
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4454()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8908()
    val b = Number8907()
    return a.fib() + b.fib()
  }

}

class Number8910 : StressfulInteger {

  companion object {
    private var VALUE = 8910
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4455()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8909()
    val b = Number8908()
    return a.fib() + b.fib()
  }

}

class Number8911 : StressfulInteger {

  companion object {
    private var VALUE = 8911
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4455()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8910()
    val b = Number8909()
    return a.fib() + b.fib()
  }

}

class Number8912 : StressfulInteger {

  companion object {
    private var VALUE = 8912
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4456()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8911()
    val b = Number8910()
    return a.fib() + b.fib()
  }

}

class Number8913 : StressfulInteger {

  companion object {
    private var VALUE = 8913
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4456()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8912()
    val b = Number8911()
    return a.fib() + b.fib()
  }

}

class Number8914 : StressfulInteger {

  companion object {
    private var VALUE = 8914
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4457()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8913()
    val b = Number8912()
    return a.fib() + b.fib()
  }

}

class Number8915 : StressfulInteger {

  companion object {
    private var VALUE = 8915
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4457()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8914()
    val b = Number8913()
    return a.fib() + b.fib()
  }

}

class Number8916 : StressfulInteger {

  companion object {
    private var VALUE = 8916
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4458()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8915()
    val b = Number8914()
    return a.fib() + b.fib()
  }

}

class Number8917 : StressfulInteger {

  companion object {
    private var VALUE = 8917
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4458()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8916()
    val b = Number8915()
    return a.fib() + b.fib()
  }

}

class Number8918 : StressfulInteger {

  companion object {
    private var VALUE = 8918
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4459()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8917()
    val b = Number8916()
    return a.fib() + b.fib()
  }

}

class Number8919 : StressfulInteger {

  companion object {
    private var VALUE = 8919
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4459()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8918()
    val b = Number8917()
    return a.fib() + b.fib()
  }

}

class Number8920 : StressfulInteger {

  companion object {
    private var VALUE = 8920
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4460()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8919()
    val b = Number8918()
    return a.fib() + b.fib()
  }

}

class Number8921 : StressfulInteger {

  companion object {
    private var VALUE = 8921
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4460()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8920()
    val b = Number8919()
    return a.fib() + b.fib()
  }

}

class Number8922 : StressfulInteger {

  companion object {
    private var VALUE = 8922
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4461()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8921()
    val b = Number8920()
    return a.fib() + b.fib()
  }

}

class Number8923 : StressfulInteger {

  companion object {
    private var VALUE = 8923
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4461()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8922()
    val b = Number8921()
    return a.fib() + b.fib()
  }

}

class Number8924 : StressfulInteger {

  companion object {
    private var VALUE = 8924
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4462()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8923()
    val b = Number8922()
    return a.fib() + b.fib()
  }

}

class Number8925 : StressfulInteger {

  companion object {
    private var VALUE = 8925
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4462()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8924()
    val b = Number8923()
    return a.fib() + b.fib()
  }

}

class Number8926 : StressfulInteger {

  companion object {
    private var VALUE = 8926
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4463()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8925()
    val b = Number8924()
    return a.fib() + b.fib()
  }

}

class Number8927 : StressfulInteger {

  companion object {
    private var VALUE = 8927
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4463()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8926()
    val b = Number8925()
    return a.fib() + b.fib()
  }

}

class Number8928 : StressfulInteger {

  companion object {
    private var VALUE = 8928
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4464()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8927()
    val b = Number8926()
    return a.fib() + b.fib()
  }

}

class Number8929 : StressfulInteger {

  companion object {
    private var VALUE = 8929
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4464()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8928()
    val b = Number8927()
    return a.fib() + b.fib()
  }

}

class Number8930 : StressfulInteger {

  companion object {
    private var VALUE = 8930
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4465()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8929()
    val b = Number8928()
    return a.fib() + b.fib()
  }

}

class Number8931 : StressfulInteger {

  companion object {
    private var VALUE = 8931
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4465()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8930()
    val b = Number8929()
    return a.fib() + b.fib()
  }

}

class Number8932 : StressfulInteger {

  companion object {
    private var VALUE = 8932
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4466()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8931()
    val b = Number8930()
    return a.fib() + b.fib()
  }

}

class Number8933 : StressfulInteger {

  companion object {
    private var VALUE = 8933
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4466()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8932()
    val b = Number8931()
    return a.fib() + b.fib()
  }

}

class Number8934 : StressfulInteger {

  companion object {
    private var VALUE = 8934
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4467()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8933()
    val b = Number8932()
    return a.fib() + b.fib()
  }

}

class Number8935 : StressfulInteger {

  companion object {
    private var VALUE = 8935
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4467()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8934()
    val b = Number8933()
    return a.fib() + b.fib()
  }

}

class Number8936 : StressfulInteger {

  companion object {
    private var VALUE = 8936
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4468()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8935()
    val b = Number8934()
    return a.fib() + b.fib()
  }

}

class Number8937 : StressfulInteger {

  companion object {
    private var VALUE = 8937
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4468()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8936()
    val b = Number8935()
    return a.fib() + b.fib()
  }

}

class Number8938 : StressfulInteger {

  companion object {
    private var VALUE = 8938
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4469()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8937()
    val b = Number8936()
    return a.fib() + b.fib()
  }

}

class Number8939 : StressfulInteger {

  companion object {
    private var VALUE = 8939
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4469()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8938()
    val b = Number8937()
    return a.fib() + b.fib()
  }

}

class Number8940 : StressfulInteger {

  companion object {
    private var VALUE = 8940
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4470()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8939()
    val b = Number8938()
    return a.fib() + b.fib()
  }

}

class Number8941 : StressfulInteger {

  companion object {
    private var VALUE = 8941
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4470()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8940()
    val b = Number8939()
    return a.fib() + b.fib()
  }

}

class Number8942 : StressfulInteger {

  companion object {
    private var VALUE = 8942
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4471()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8941()
    val b = Number8940()
    return a.fib() + b.fib()
  }

}

class Number8943 : StressfulInteger {

  companion object {
    private var VALUE = 8943
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4471()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8942()
    val b = Number8941()
    return a.fib() + b.fib()
  }

}

class Number8944 : StressfulInteger {

  companion object {
    private var VALUE = 8944
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4472()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8943()
    val b = Number8942()
    return a.fib() + b.fib()
  }

}

class Number8945 : StressfulInteger {

  companion object {
    private var VALUE = 8945
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4472()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8944()
    val b = Number8943()
    return a.fib() + b.fib()
  }

}

class Number8946 : StressfulInteger {

  companion object {
    private var VALUE = 8946
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4473()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8945()
    val b = Number8944()
    return a.fib() + b.fib()
  }

}

class Number8947 : StressfulInteger {

  companion object {
    private var VALUE = 8947
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4473()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8946()
    val b = Number8945()
    return a.fib() + b.fib()
  }

}

class Number8948 : StressfulInteger {

  companion object {
    private var VALUE = 8948
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4474()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8947()
    val b = Number8946()
    return a.fib() + b.fib()
  }

}

class Number8949 : StressfulInteger {

  companion object {
    private var VALUE = 8949
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4474()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8948()
    val b = Number8947()
    return a.fib() + b.fib()
  }

}

class Number8950 : StressfulInteger {

  companion object {
    private var VALUE = 8950
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4475()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8949()
    val b = Number8948()
    return a.fib() + b.fib()
  }

}

class Number8951 : StressfulInteger {

  companion object {
    private var VALUE = 8951
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4475()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8950()
    val b = Number8949()
    return a.fib() + b.fib()
  }

}

class Number8952 : StressfulInteger {

  companion object {
    private var VALUE = 8952
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4476()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8951()
    val b = Number8950()
    return a.fib() + b.fib()
  }

}

class Number8953 : StressfulInteger {

  companion object {
    private var VALUE = 8953
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4476()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8952()
    val b = Number8951()
    return a.fib() + b.fib()
  }

}

class Number8954 : StressfulInteger {

  companion object {
    private var VALUE = 8954
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4477()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8953()
    val b = Number8952()
    return a.fib() + b.fib()
  }

}

class Number8955 : StressfulInteger {

  companion object {
    private var VALUE = 8955
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4477()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8954()
    val b = Number8953()
    return a.fib() + b.fib()
  }

}

class Number8956 : StressfulInteger {

  companion object {
    private var VALUE = 8956
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4478()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8955()
    val b = Number8954()
    return a.fib() + b.fib()
  }

}

class Number8957 : StressfulInteger {

  companion object {
    private var VALUE = 8957
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4478()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8956()
    val b = Number8955()
    return a.fib() + b.fib()
  }

}

class Number8958 : StressfulInteger {

  companion object {
    private var VALUE = 8958
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4479()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8957()
    val b = Number8956()
    return a.fib() + b.fib()
  }

}

class Number8959 : StressfulInteger {

  companion object {
    private var VALUE = 8959
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4479()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8958()
    val b = Number8957()
    return a.fib() + b.fib()
  }

}

class Number8960 : StressfulInteger {

  companion object {
    private var VALUE = 8960
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4480()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8959()
    val b = Number8958()
    return a.fib() + b.fib()
  }

}

class Number8961 : StressfulInteger {

  companion object {
    private var VALUE = 8961
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4480()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8960()
    val b = Number8959()
    return a.fib() + b.fib()
  }

}

class Number8962 : StressfulInteger {

  companion object {
    private var VALUE = 8962
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4481()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8961()
    val b = Number8960()
    return a.fib() + b.fib()
  }

}

class Number8963 : StressfulInteger {

  companion object {
    private var VALUE = 8963
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4481()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8962()
    val b = Number8961()
    return a.fib() + b.fib()
  }

}

class Number8964 : StressfulInteger {

  companion object {
    private var VALUE = 8964
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4482()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8963()
    val b = Number8962()
    return a.fib() + b.fib()
  }

}

class Number8965 : StressfulInteger {

  companion object {
    private var VALUE = 8965
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4482()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8964()
    val b = Number8963()
    return a.fib() + b.fib()
  }

}

class Number8966 : StressfulInteger {

  companion object {
    private var VALUE = 8966
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4483()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8965()
    val b = Number8964()
    return a.fib() + b.fib()
  }

}

class Number8967 : StressfulInteger {

  companion object {
    private var VALUE = 8967
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4483()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8966()
    val b = Number8965()
    return a.fib() + b.fib()
  }

}

class Number8968 : StressfulInteger {

  companion object {
    private var VALUE = 8968
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4484()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8967()
    val b = Number8966()
    return a.fib() + b.fib()
  }

}

class Number8969 : StressfulInteger {

  companion object {
    private var VALUE = 8969
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4484()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8968()
    val b = Number8967()
    return a.fib() + b.fib()
  }

}

class Number8970 : StressfulInteger {

  companion object {
    private var VALUE = 8970
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4485()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8969()
    val b = Number8968()
    return a.fib() + b.fib()
  }

}

class Number8971 : StressfulInteger {

  companion object {
    private var VALUE = 8971
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4485()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8970()
    val b = Number8969()
    return a.fib() + b.fib()
  }

}

class Number8972 : StressfulInteger {

  companion object {
    private var VALUE = 8972
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4486()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8971()
    val b = Number8970()
    return a.fib() + b.fib()
  }

}

class Number8973 : StressfulInteger {

  companion object {
    private var VALUE = 8973
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4486()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8972()
    val b = Number8971()
    return a.fib() + b.fib()
  }

}

class Number8974 : StressfulInteger {

  companion object {
    private var VALUE = 8974
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4487()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8973()
    val b = Number8972()
    return a.fib() + b.fib()
  }

}

class Number8975 : StressfulInteger {

  companion object {
    private var VALUE = 8975
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4487()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8974()
    val b = Number8973()
    return a.fib() + b.fib()
  }

}

class Number8976 : StressfulInteger {

  companion object {
    private var VALUE = 8976
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4488()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8975()
    val b = Number8974()
    return a.fib() + b.fib()
  }

}

class Number8977 : StressfulInteger {

  companion object {
    private var VALUE = 8977
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4488()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8976()
    val b = Number8975()
    return a.fib() + b.fib()
  }

}

class Number8978 : StressfulInteger {

  companion object {
    private var VALUE = 8978
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4489()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8977()
    val b = Number8976()
    return a.fib() + b.fib()
  }

}

class Number8979 : StressfulInteger {

  companion object {
    private var VALUE = 8979
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4489()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8978()
    val b = Number8977()
    return a.fib() + b.fib()
  }

}

class Number8980 : StressfulInteger {

  companion object {
    private var VALUE = 8980
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4490()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8979()
    val b = Number8978()
    return a.fib() + b.fib()
  }

}

class Number8981 : StressfulInteger {

  companion object {
    private var VALUE = 8981
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4490()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8980()
    val b = Number8979()
    return a.fib() + b.fib()
  }

}

class Number8982 : StressfulInteger {

  companion object {
    private var VALUE = 8982
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4491()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8981()
    val b = Number8980()
    return a.fib() + b.fib()
  }

}

class Number8983 : StressfulInteger {

  companion object {
    private var VALUE = 8983
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4491()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8982()
    val b = Number8981()
    return a.fib() + b.fib()
  }

}

class Number8984 : StressfulInteger {

  companion object {
    private var VALUE = 8984
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4492()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8983()
    val b = Number8982()
    return a.fib() + b.fib()
  }

}

class Number8985 : StressfulInteger {

  companion object {
    private var VALUE = 8985
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4492()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8984()
    val b = Number8983()
    return a.fib() + b.fib()
  }

}

class Number8986 : StressfulInteger {

  companion object {
    private var VALUE = 8986
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4493()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8985()
    val b = Number8984()
    return a.fib() + b.fib()
  }

}

class Number8987 : StressfulInteger {

  companion object {
    private var VALUE = 8987
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4493()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8986()
    val b = Number8985()
    return a.fib() + b.fib()
  }

}

class Number8988 : StressfulInteger {

  companion object {
    private var VALUE = 8988
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4494()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8987()
    val b = Number8986()
    return a.fib() + b.fib()
  }

}

class Number8989 : StressfulInteger {

  companion object {
    private var VALUE = 8989
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4494()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8988()
    val b = Number8987()
    return a.fib() + b.fib()
  }

}

class Number8990 : StressfulInteger {

  companion object {
    private var VALUE = 8990
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4495()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8989()
    val b = Number8988()
    return a.fib() + b.fib()
  }

}

class Number8991 : StressfulInteger {

  companion object {
    private var VALUE = 8991
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4495()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8990()
    val b = Number8989()
    return a.fib() + b.fib()
  }

}

class Number8992 : StressfulInteger {

  companion object {
    private var VALUE = 8992
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4496()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8991()
    val b = Number8990()
    return a.fib() + b.fib()
  }

}

class Number8993 : StressfulInteger {

  companion object {
    private var VALUE = 8993
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4496()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8992()
    val b = Number8991()
    return a.fib() + b.fib()
  }

}

class Number8994 : StressfulInteger {

  companion object {
    private var VALUE = 8994
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4497()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8993()
    val b = Number8992()
    return a.fib() + b.fib()
  }

}

class Number8995 : StressfulInteger {

  companion object {
    private var VALUE = 8995
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4497()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8994()
    val b = Number8993()
    return a.fib() + b.fib()
  }

}

class Number8996 : StressfulInteger {

  companion object {
    private var VALUE = 8996
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4498()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8995()
    val b = Number8994()
    return a.fib() + b.fib()
  }

}

class Number8997 : StressfulInteger {

  companion object {
    private var VALUE = 8997
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4498()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8996()
    val b = Number8995()
    return a.fib() + b.fib()
  }

}

class Number8998 : StressfulInteger {

  companion object {
    private var VALUE = 8998
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4499()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8997()
    val b = Number8996()
    return a.fib() + b.fib()
  }

}

class Number8999 : StressfulInteger {

  companion object {
    private var VALUE = 8999
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number4499()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number8998()
    val b = Number8997()
    return a.fib() + b.fib()
  }

}

