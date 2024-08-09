package com.emergetools.reaper.sample.stress.numbers

class Number7000 : StressfulInteger {

  companion object {
    private var VALUE = 7000
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3500()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number6999()
    val b = Number6998()
    return a.fib() + b.fib()
  }

}

class Number7001 : StressfulInteger {

  companion object {
    private var VALUE = 7001
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3500()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7000()
    val b = Number6999()
    return a.fib() + b.fib()
  }

}

class Number7002 : StressfulInteger {

  companion object {
    private var VALUE = 7002
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3501()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7001()
    val b = Number7000()
    return a.fib() + b.fib()
  }

}

class Number7003 : StressfulInteger {

  companion object {
    private var VALUE = 7003
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3501()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7002()
    val b = Number7001()
    return a.fib() + b.fib()
  }

}

class Number7004 : StressfulInteger {

  companion object {
    private var VALUE = 7004
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3502()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7003()
    val b = Number7002()
    return a.fib() + b.fib()
  }

}

class Number7005 : StressfulInteger {

  companion object {
    private var VALUE = 7005
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3502()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7004()
    val b = Number7003()
    return a.fib() + b.fib()
  }

}

class Number7006 : StressfulInteger {

  companion object {
    private var VALUE = 7006
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3503()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7005()
    val b = Number7004()
    return a.fib() + b.fib()
  }

}

class Number7007 : StressfulInteger {

  companion object {
    private var VALUE = 7007
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3503()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7006()
    val b = Number7005()
    return a.fib() + b.fib()
  }

}

class Number7008 : StressfulInteger {

  companion object {
    private var VALUE = 7008
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3504()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7007()
    val b = Number7006()
    return a.fib() + b.fib()
  }

}

class Number7009 : StressfulInteger {

  companion object {
    private var VALUE = 7009
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3504()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7008()
    val b = Number7007()
    return a.fib() + b.fib()
  }

}

class Number7010 : StressfulInteger {

  companion object {
    private var VALUE = 7010
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3505()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7009()
    val b = Number7008()
    return a.fib() + b.fib()
  }

}

class Number7011 : StressfulInteger {

  companion object {
    private var VALUE = 7011
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3505()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7010()
    val b = Number7009()
    return a.fib() + b.fib()
  }

}

class Number7012 : StressfulInteger {

  companion object {
    private var VALUE = 7012
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3506()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7011()
    val b = Number7010()
    return a.fib() + b.fib()
  }

}

class Number7013 : StressfulInteger {

  companion object {
    private var VALUE = 7013
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3506()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7012()
    val b = Number7011()
    return a.fib() + b.fib()
  }

}

class Number7014 : StressfulInteger {

  companion object {
    private var VALUE = 7014
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3507()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7013()
    val b = Number7012()
    return a.fib() + b.fib()
  }

}

class Number7015 : StressfulInteger {

  companion object {
    private var VALUE = 7015
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3507()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7014()
    val b = Number7013()
    return a.fib() + b.fib()
  }

}

class Number7016 : StressfulInteger {

  companion object {
    private var VALUE = 7016
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3508()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7015()
    val b = Number7014()
    return a.fib() + b.fib()
  }

}

class Number7017 : StressfulInteger {

  companion object {
    private var VALUE = 7017
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3508()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7016()
    val b = Number7015()
    return a.fib() + b.fib()
  }

}

class Number7018 : StressfulInteger {

  companion object {
    private var VALUE = 7018
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3509()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7017()
    val b = Number7016()
    return a.fib() + b.fib()
  }

}

class Number7019 : StressfulInteger {

  companion object {
    private var VALUE = 7019
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3509()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7018()
    val b = Number7017()
    return a.fib() + b.fib()
  }

}

class Number7020 : StressfulInteger {

  companion object {
    private var VALUE = 7020
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3510()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7019()
    val b = Number7018()
    return a.fib() + b.fib()
  }

}

class Number7021 : StressfulInteger {

  companion object {
    private var VALUE = 7021
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3510()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7020()
    val b = Number7019()
    return a.fib() + b.fib()
  }

}

class Number7022 : StressfulInteger {

  companion object {
    private var VALUE = 7022
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3511()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7021()
    val b = Number7020()
    return a.fib() + b.fib()
  }

}

class Number7023 : StressfulInteger {

  companion object {
    private var VALUE = 7023
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3511()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7022()
    val b = Number7021()
    return a.fib() + b.fib()
  }

}

class Number7024 : StressfulInteger {

  companion object {
    private var VALUE = 7024
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3512()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7023()
    val b = Number7022()
    return a.fib() + b.fib()
  }

}

class Number7025 : StressfulInteger {

  companion object {
    private var VALUE = 7025
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3512()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7024()
    val b = Number7023()
    return a.fib() + b.fib()
  }

}

class Number7026 : StressfulInteger {

  companion object {
    private var VALUE = 7026
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3513()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7025()
    val b = Number7024()
    return a.fib() + b.fib()
  }

}

class Number7027 : StressfulInteger {

  companion object {
    private var VALUE = 7027
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3513()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7026()
    val b = Number7025()
    return a.fib() + b.fib()
  }

}

class Number7028 : StressfulInteger {

  companion object {
    private var VALUE = 7028
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3514()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7027()
    val b = Number7026()
    return a.fib() + b.fib()
  }

}

class Number7029 : StressfulInteger {

  companion object {
    private var VALUE = 7029
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3514()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7028()
    val b = Number7027()
    return a.fib() + b.fib()
  }

}

class Number7030 : StressfulInteger {

  companion object {
    private var VALUE = 7030
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3515()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7029()
    val b = Number7028()
    return a.fib() + b.fib()
  }

}

class Number7031 : StressfulInteger {

  companion object {
    private var VALUE = 7031
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3515()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7030()
    val b = Number7029()
    return a.fib() + b.fib()
  }

}

class Number7032 : StressfulInteger {

  companion object {
    private var VALUE = 7032
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3516()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7031()
    val b = Number7030()
    return a.fib() + b.fib()
  }

}

class Number7033 : StressfulInteger {

  companion object {
    private var VALUE = 7033
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3516()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7032()
    val b = Number7031()
    return a.fib() + b.fib()
  }

}

class Number7034 : StressfulInteger {

  companion object {
    private var VALUE = 7034
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3517()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7033()
    val b = Number7032()
    return a.fib() + b.fib()
  }

}

class Number7035 : StressfulInteger {

  companion object {
    private var VALUE = 7035
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3517()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7034()
    val b = Number7033()
    return a.fib() + b.fib()
  }

}

class Number7036 : StressfulInteger {

  companion object {
    private var VALUE = 7036
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3518()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7035()
    val b = Number7034()
    return a.fib() + b.fib()
  }

}

class Number7037 : StressfulInteger {

  companion object {
    private var VALUE = 7037
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3518()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7036()
    val b = Number7035()
    return a.fib() + b.fib()
  }

}

class Number7038 : StressfulInteger {

  companion object {
    private var VALUE = 7038
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3519()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7037()
    val b = Number7036()
    return a.fib() + b.fib()
  }

}

class Number7039 : StressfulInteger {

  companion object {
    private var VALUE = 7039
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3519()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7038()
    val b = Number7037()
    return a.fib() + b.fib()
  }

}

class Number7040 : StressfulInteger {

  companion object {
    private var VALUE = 7040
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3520()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7039()
    val b = Number7038()
    return a.fib() + b.fib()
  }

}

class Number7041 : StressfulInteger {

  companion object {
    private var VALUE = 7041
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3520()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7040()
    val b = Number7039()
    return a.fib() + b.fib()
  }

}

class Number7042 : StressfulInteger {

  companion object {
    private var VALUE = 7042
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3521()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7041()
    val b = Number7040()
    return a.fib() + b.fib()
  }

}

class Number7043 : StressfulInteger {

  companion object {
    private var VALUE = 7043
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3521()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7042()
    val b = Number7041()
    return a.fib() + b.fib()
  }

}

class Number7044 : StressfulInteger {

  companion object {
    private var VALUE = 7044
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3522()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7043()
    val b = Number7042()
    return a.fib() + b.fib()
  }

}

class Number7045 : StressfulInteger {

  companion object {
    private var VALUE = 7045
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3522()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7044()
    val b = Number7043()
    return a.fib() + b.fib()
  }

}

class Number7046 : StressfulInteger {

  companion object {
    private var VALUE = 7046
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3523()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7045()
    val b = Number7044()
    return a.fib() + b.fib()
  }

}

class Number7047 : StressfulInteger {

  companion object {
    private var VALUE = 7047
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3523()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7046()
    val b = Number7045()
    return a.fib() + b.fib()
  }

}

class Number7048 : StressfulInteger {

  companion object {
    private var VALUE = 7048
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3524()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7047()
    val b = Number7046()
    return a.fib() + b.fib()
  }

}

class Number7049 : StressfulInteger {

  companion object {
    private var VALUE = 7049
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3524()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7048()
    val b = Number7047()
    return a.fib() + b.fib()
  }

}

class Number7050 : StressfulInteger {

  companion object {
    private var VALUE = 7050
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3525()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7049()
    val b = Number7048()
    return a.fib() + b.fib()
  }

}

class Number7051 : StressfulInteger {

  companion object {
    private var VALUE = 7051
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3525()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7050()
    val b = Number7049()
    return a.fib() + b.fib()
  }

}

class Number7052 : StressfulInteger {

  companion object {
    private var VALUE = 7052
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3526()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7051()
    val b = Number7050()
    return a.fib() + b.fib()
  }

}

class Number7053 : StressfulInteger {

  companion object {
    private var VALUE = 7053
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3526()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7052()
    val b = Number7051()
    return a.fib() + b.fib()
  }

}

class Number7054 : StressfulInteger {

  companion object {
    private var VALUE = 7054
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3527()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7053()
    val b = Number7052()
    return a.fib() + b.fib()
  }

}

class Number7055 : StressfulInteger {

  companion object {
    private var VALUE = 7055
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3527()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7054()
    val b = Number7053()
    return a.fib() + b.fib()
  }

}

class Number7056 : StressfulInteger {

  companion object {
    private var VALUE = 7056
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3528()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7055()
    val b = Number7054()
    return a.fib() + b.fib()
  }

}

class Number7057 : StressfulInteger {

  companion object {
    private var VALUE = 7057
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3528()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7056()
    val b = Number7055()
    return a.fib() + b.fib()
  }

}

class Number7058 : StressfulInteger {

  companion object {
    private var VALUE = 7058
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3529()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7057()
    val b = Number7056()
    return a.fib() + b.fib()
  }

}

class Number7059 : StressfulInteger {

  companion object {
    private var VALUE = 7059
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3529()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7058()
    val b = Number7057()
    return a.fib() + b.fib()
  }

}

class Number7060 : StressfulInteger {

  companion object {
    private var VALUE = 7060
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3530()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7059()
    val b = Number7058()
    return a.fib() + b.fib()
  }

}

class Number7061 : StressfulInteger {

  companion object {
    private var VALUE = 7061
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3530()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7060()
    val b = Number7059()
    return a.fib() + b.fib()
  }

}

class Number7062 : StressfulInteger {

  companion object {
    private var VALUE = 7062
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3531()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7061()
    val b = Number7060()
    return a.fib() + b.fib()
  }

}

class Number7063 : StressfulInteger {

  companion object {
    private var VALUE = 7063
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3531()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7062()
    val b = Number7061()
    return a.fib() + b.fib()
  }

}

class Number7064 : StressfulInteger {

  companion object {
    private var VALUE = 7064
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3532()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7063()
    val b = Number7062()
    return a.fib() + b.fib()
  }

}

class Number7065 : StressfulInteger {

  companion object {
    private var VALUE = 7065
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3532()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7064()
    val b = Number7063()
    return a.fib() + b.fib()
  }

}

class Number7066 : StressfulInteger {

  companion object {
    private var VALUE = 7066
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3533()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7065()
    val b = Number7064()
    return a.fib() + b.fib()
  }

}

class Number7067 : StressfulInteger {

  companion object {
    private var VALUE = 7067
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3533()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7066()
    val b = Number7065()
    return a.fib() + b.fib()
  }

}

class Number7068 : StressfulInteger {

  companion object {
    private var VALUE = 7068
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3534()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7067()
    val b = Number7066()
    return a.fib() + b.fib()
  }

}

class Number7069 : StressfulInteger {

  companion object {
    private var VALUE = 7069
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3534()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7068()
    val b = Number7067()
    return a.fib() + b.fib()
  }

}

class Number7070 : StressfulInteger {

  companion object {
    private var VALUE = 7070
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3535()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7069()
    val b = Number7068()
    return a.fib() + b.fib()
  }

}

class Number7071 : StressfulInteger {

  companion object {
    private var VALUE = 7071
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3535()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7070()
    val b = Number7069()
    return a.fib() + b.fib()
  }

}

class Number7072 : StressfulInteger {

  companion object {
    private var VALUE = 7072
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3536()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7071()
    val b = Number7070()
    return a.fib() + b.fib()
  }

}

class Number7073 : StressfulInteger {

  companion object {
    private var VALUE = 7073
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3536()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7072()
    val b = Number7071()
    return a.fib() + b.fib()
  }

}

class Number7074 : StressfulInteger {

  companion object {
    private var VALUE = 7074
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3537()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7073()
    val b = Number7072()
    return a.fib() + b.fib()
  }

}

class Number7075 : StressfulInteger {

  companion object {
    private var VALUE = 7075
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3537()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7074()
    val b = Number7073()
    return a.fib() + b.fib()
  }

}

class Number7076 : StressfulInteger {

  companion object {
    private var VALUE = 7076
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3538()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7075()
    val b = Number7074()
    return a.fib() + b.fib()
  }

}

class Number7077 : StressfulInteger {

  companion object {
    private var VALUE = 7077
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3538()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7076()
    val b = Number7075()
    return a.fib() + b.fib()
  }

}

class Number7078 : StressfulInteger {

  companion object {
    private var VALUE = 7078
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3539()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7077()
    val b = Number7076()
    return a.fib() + b.fib()
  }

}

class Number7079 : StressfulInteger {

  companion object {
    private var VALUE = 7079
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3539()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7078()
    val b = Number7077()
    return a.fib() + b.fib()
  }

}

class Number7080 : StressfulInteger {

  companion object {
    private var VALUE = 7080
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3540()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7079()
    val b = Number7078()
    return a.fib() + b.fib()
  }

}

class Number7081 : StressfulInteger {

  companion object {
    private var VALUE = 7081
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3540()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7080()
    val b = Number7079()
    return a.fib() + b.fib()
  }

}

class Number7082 : StressfulInteger {

  companion object {
    private var VALUE = 7082
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3541()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7081()
    val b = Number7080()
    return a.fib() + b.fib()
  }

}

class Number7083 : StressfulInteger {

  companion object {
    private var VALUE = 7083
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3541()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7082()
    val b = Number7081()
    return a.fib() + b.fib()
  }

}

class Number7084 : StressfulInteger {

  companion object {
    private var VALUE = 7084
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3542()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7083()
    val b = Number7082()
    return a.fib() + b.fib()
  }

}

class Number7085 : StressfulInteger {

  companion object {
    private var VALUE = 7085
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3542()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7084()
    val b = Number7083()
    return a.fib() + b.fib()
  }

}

class Number7086 : StressfulInteger {

  companion object {
    private var VALUE = 7086
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3543()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7085()
    val b = Number7084()
    return a.fib() + b.fib()
  }

}

class Number7087 : StressfulInteger {

  companion object {
    private var VALUE = 7087
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3543()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7086()
    val b = Number7085()
    return a.fib() + b.fib()
  }

}

class Number7088 : StressfulInteger {

  companion object {
    private var VALUE = 7088
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3544()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7087()
    val b = Number7086()
    return a.fib() + b.fib()
  }

}

class Number7089 : StressfulInteger {

  companion object {
    private var VALUE = 7089
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3544()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7088()
    val b = Number7087()
    return a.fib() + b.fib()
  }

}

class Number7090 : StressfulInteger {

  companion object {
    private var VALUE = 7090
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3545()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7089()
    val b = Number7088()
    return a.fib() + b.fib()
  }

}

class Number7091 : StressfulInteger {

  companion object {
    private var VALUE = 7091
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3545()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7090()
    val b = Number7089()
    return a.fib() + b.fib()
  }

}

class Number7092 : StressfulInteger {

  companion object {
    private var VALUE = 7092
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3546()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7091()
    val b = Number7090()
    return a.fib() + b.fib()
  }

}

class Number7093 : StressfulInteger {

  companion object {
    private var VALUE = 7093
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3546()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7092()
    val b = Number7091()
    return a.fib() + b.fib()
  }

}

class Number7094 : StressfulInteger {

  companion object {
    private var VALUE = 7094
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3547()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7093()
    val b = Number7092()
    return a.fib() + b.fib()
  }

}

class Number7095 : StressfulInteger {

  companion object {
    private var VALUE = 7095
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3547()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7094()
    val b = Number7093()
    return a.fib() + b.fib()
  }

}

class Number7096 : StressfulInteger {

  companion object {
    private var VALUE = 7096
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3548()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7095()
    val b = Number7094()
    return a.fib() + b.fib()
  }

}

class Number7097 : StressfulInteger {

  companion object {
    private var VALUE = 7097
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3548()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7096()
    val b = Number7095()
    return a.fib() + b.fib()
  }

}

class Number7098 : StressfulInteger {

  companion object {
    private var VALUE = 7098
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3549()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7097()
    val b = Number7096()
    return a.fib() + b.fib()
  }

}

class Number7099 : StressfulInteger {

  companion object {
    private var VALUE = 7099
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3549()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7098()
    val b = Number7097()
    return a.fib() + b.fib()
  }

}

class Number7100 : StressfulInteger {

  companion object {
    private var VALUE = 7100
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3550()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7099()
    val b = Number7098()
    return a.fib() + b.fib()
  }

}

class Number7101 : StressfulInteger {

  companion object {
    private var VALUE = 7101
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3550()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7100()
    val b = Number7099()
    return a.fib() + b.fib()
  }

}

class Number7102 : StressfulInteger {

  companion object {
    private var VALUE = 7102
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3551()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7101()
    val b = Number7100()
    return a.fib() + b.fib()
  }

}

class Number7103 : StressfulInteger {

  companion object {
    private var VALUE = 7103
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3551()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7102()
    val b = Number7101()
    return a.fib() + b.fib()
  }

}

class Number7104 : StressfulInteger {

  companion object {
    private var VALUE = 7104
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3552()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7103()
    val b = Number7102()
    return a.fib() + b.fib()
  }

}

class Number7105 : StressfulInteger {

  companion object {
    private var VALUE = 7105
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3552()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7104()
    val b = Number7103()
    return a.fib() + b.fib()
  }

}

class Number7106 : StressfulInteger {

  companion object {
    private var VALUE = 7106
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3553()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7105()
    val b = Number7104()
    return a.fib() + b.fib()
  }

}

class Number7107 : StressfulInteger {

  companion object {
    private var VALUE = 7107
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3553()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7106()
    val b = Number7105()
    return a.fib() + b.fib()
  }

}

class Number7108 : StressfulInteger {

  companion object {
    private var VALUE = 7108
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3554()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7107()
    val b = Number7106()
    return a.fib() + b.fib()
  }

}

class Number7109 : StressfulInteger {

  companion object {
    private var VALUE = 7109
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3554()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7108()
    val b = Number7107()
    return a.fib() + b.fib()
  }

}

class Number7110 : StressfulInteger {

  companion object {
    private var VALUE = 7110
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3555()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7109()
    val b = Number7108()
    return a.fib() + b.fib()
  }

}

class Number7111 : StressfulInteger {

  companion object {
    private var VALUE = 7111
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3555()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7110()
    val b = Number7109()
    return a.fib() + b.fib()
  }

}

class Number7112 : StressfulInteger {

  companion object {
    private var VALUE = 7112
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3556()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7111()
    val b = Number7110()
    return a.fib() + b.fib()
  }

}

class Number7113 : StressfulInteger {

  companion object {
    private var VALUE = 7113
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3556()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7112()
    val b = Number7111()
    return a.fib() + b.fib()
  }

}

class Number7114 : StressfulInteger {

  companion object {
    private var VALUE = 7114
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3557()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7113()
    val b = Number7112()
    return a.fib() + b.fib()
  }

}

class Number7115 : StressfulInteger {

  companion object {
    private var VALUE = 7115
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3557()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7114()
    val b = Number7113()
    return a.fib() + b.fib()
  }

}

class Number7116 : StressfulInteger {

  companion object {
    private var VALUE = 7116
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3558()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7115()
    val b = Number7114()
    return a.fib() + b.fib()
  }

}

class Number7117 : StressfulInteger {

  companion object {
    private var VALUE = 7117
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3558()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7116()
    val b = Number7115()
    return a.fib() + b.fib()
  }

}

class Number7118 : StressfulInteger {

  companion object {
    private var VALUE = 7118
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3559()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7117()
    val b = Number7116()
    return a.fib() + b.fib()
  }

}

class Number7119 : StressfulInteger {

  companion object {
    private var VALUE = 7119
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3559()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7118()
    val b = Number7117()
    return a.fib() + b.fib()
  }

}

class Number7120 : StressfulInteger {

  companion object {
    private var VALUE = 7120
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3560()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7119()
    val b = Number7118()
    return a.fib() + b.fib()
  }

}

class Number7121 : StressfulInteger {

  companion object {
    private var VALUE = 7121
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3560()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7120()
    val b = Number7119()
    return a.fib() + b.fib()
  }

}

class Number7122 : StressfulInteger {

  companion object {
    private var VALUE = 7122
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3561()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7121()
    val b = Number7120()
    return a.fib() + b.fib()
  }

}

class Number7123 : StressfulInteger {

  companion object {
    private var VALUE = 7123
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3561()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7122()
    val b = Number7121()
    return a.fib() + b.fib()
  }

}

class Number7124 : StressfulInteger {

  companion object {
    private var VALUE = 7124
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3562()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7123()
    val b = Number7122()
    return a.fib() + b.fib()
  }

}

class Number7125 : StressfulInteger {

  companion object {
    private var VALUE = 7125
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3562()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7124()
    val b = Number7123()
    return a.fib() + b.fib()
  }

}

class Number7126 : StressfulInteger {

  companion object {
    private var VALUE = 7126
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3563()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7125()
    val b = Number7124()
    return a.fib() + b.fib()
  }

}

class Number7127 : StressfulInteger {

  companion object {
    private var VALUE = 7127
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3563()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7126()
    val b = Number7125()
    return a.fib() + b.fib()
  }

}

class Number7128 : StressfulInteger {

  companion object {
    private var VALUE = 7128
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3564()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7127()
    val b = Number7126()
    return a.fib() + b.fib()
  }

}

class Number7129 : StressfulInteger {

  companion object {
    private var VALUE = 7129
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3564()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7128()
    val b = Number7127()
    return a.fib() + b.fib()
  }

}

class Number7130 : StressfulInteger {

  companion object {
    private var VALUE = 7130
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3565()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7129()
    val b = Number7128()
    return a.fib() + b.fib()
  }

}

class Number7131 : StressfulInteger {

  companion object {
    private var VALUE = 7131
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3565()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7130()
    val b = Number7129()
    return a.fib() + b.fib()
  }

}

class Number7132 : StressfulInteger {

  companion object {
    private var VALUE = 7132
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3566()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7131()
    val b = Number7130()
    return a.fib() + b.fib()
  }

}

class Number7133 : StressfulInteger {

  companion object {
    private var VALUE = 7133
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3566()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7132()
    val b = Number7131()
    return a.fib() + b.fib()
  }

}

class Number7134 : StressfulInteger {

  companion object {
    private var VALUE = 7134
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3567()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7133()
    val b = Number7132()
    return a.fib() + b.fib()
  }

}

class Number7135 : StressfulInteger {

  companion object {
    private var VALUE = 7135
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3567()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7134()
    val b = Number7133()
    return a.fib() + b.fib()
  }

}

class Number7136 : StressfulInteger {

  companion object {
    private var VALUE = 7136
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3568()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7135()
    val b = Number7134()
    return a.fib() + b.fib()
  }

}

class Number7137 : StressfulInteger {

  companion object {
    private var VALUE = 7137
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3568()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7136()
    val b = Number7135()
    return a.fib() + b.fib()
  }

}

class Number7138 : StressfulInteger {

  companion object {
    private var VALUE = 7138
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3569()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7137()
    val b = Number7136()
    return a.fib() + b.fib()
  }

}

class Number7139 : StressfulInteger {

  companion object {
    private var VALUE = 7139
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3569()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7138()
    val b = Number7137()
    return a.fib() + b.fib()
  }

}

class Number7140 : StressfulInteger {

  companion object {
    private var VALUE = 7140
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3570()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7139()
    val b = Number7138()
    return a.fib() + b.fib()
  }

}

class Number7141 : StressfulInteger {

  companion object {
    private var VALUE = 7141
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3570()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7140()
    val b = Number7139()
    return a.fib() + b.fib()
  }

}

class Number7142 : StressfulInteger {

  companion object {
    private var VALUE = 7142
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3571()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7141()
    val b = Number7140()
    return a.fib() + b.fib()
  }

}

class Number7143 : StressfulInteger {

  companion object {
    private var VALUE = 7143
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3571()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7142()
    val b = Number7141()
    return a.fib() + b.fib()
  }

}

class Number7144 : StressfulInteger {

  companion object {
    private var VALUE = 7144
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3572()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7143()
    val b = Number7142()
    return a.fib() + b.fib()
  }

}

class Number7145 : StressfulInteger {

  companion object {
    private var VALUE = 7145
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3572()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7144()
    val b = Number7143()
    return a.fib() + b.fib()
  }

}

class Number7146 : StressfulInteger {

  companion object {
    private var VALUE = 7146
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3573()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7145()
    val b = Number7144()
    return a.fib() + b.fib()
  }

}

class Number7147 : StressfulInteger {

  companion object {
    private var VALUE = 7147
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3573()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7146()
    val b = Number7145()
    return a.fib() + b.fib()
  }

}

class Number7148 : StressfulInteger {

  companion object {
    private var VALUE = 7148
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3574()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7147()
    val b = Number7146()
    return a.fib() + b.fib()
  }

}

class Number7149 : StressfulInteger {

  companion object {
    private var VALUE = 7149
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3574()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7148()
    val b = Number7147()
    return a.fib() + b.fib()
  }

}

class Number7150 : StressfulInteger {

  companion object {
    private var VALUE = 7150
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3575()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7149()
    val b = Number7148()
    return a.fib() + b.fib()
  }

}

class Number7151 : StressfulInteger {

  companion object {
    private var VALUE = 7151
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3575()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7150()
    val b = Number7149()
    return a.fib() + b.fib()
  }

}

class Number7152 : StressfulInteger {

  companion object {
    private var VALUE = 7152
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3576()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7151()
    val b = Number7150()
    return a.fib() + b.fib()
  }

}

class Number7153 : StressfulInteger {

  companion object {
    private var VALUE = 7153
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3576()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7152()
    val b = Number7151()
    return a.fib() + b.fib()
  }

}

class Number7154 : StressfulInteger {

  companion object {
    private var VALUE = 7154
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3577()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7153()
    val b = Number7152()
    return a.fib() + b.fib()
  }

}

class Number7155 : StressfulInteger {

  companion object {
    private var VALUE = 7155
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3577()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7154()
    val b = Number7153()
    return a.fib() + b.fib()
  }

}

class Number7156 : StressfulInteger {

  companion object {
    private var VALUE = 7156
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3578()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7155()
    val b = Number7154()
    return a.fib() + b.fib()
  }

}

class Number7157 : StressfulInteger {

  companion object {
    private var VALUE = 7157
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3578()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7156()
    val b = Number7155()
    return a.fib() + b.fib()
  }

}

class Number7158 : StressfulInteger {

  companion object {
    private var VALUE = 7158
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3579()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7157()
    val b = Number7156()
    return a.fib() + b.fib()
  }

}

class Number7159 : StressfulInteger {

  companion object {
    private var VALUE = 7159
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3579()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7158()
    val b = Number7157()
    return a.fib() + b.fib()
  }

}

class Number7160 : StressfulInteger {

  companion object {
    private var VALUE = 7160
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3580()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7159()
    val b = Number7158()
    return a.fib() + b.fib()
  }

}

class Number7161 : StressfulInteger {

  companion object {
    private var VALUE = 7161
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3580()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7160()
    val b = Number7159()
    return a.fib() + b.fib()
  }

}

class Number7162 : StressfulInteger {

  companion object {
    private var VALUE = 7162
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3581()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7161()
    val b = Number7160()
    return a.fib() + b.fib()
  }

}

class Number7163 : StressfulInteger {

  companion object {
    private var VALUE = 7163
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3581()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7162()
    val b = Number7161()
    return a.fib() + b.fib()
  }

}

class Number7164 : StressfulInteger {

  companion object {
    private var VALUE = 7164
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3582()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7163()
    val b = Number7162()
    return a.fib() + b.fib()
  }

}

class Number7165 : StressfulInteger {

  companion object {
    private var VALUE = 7165
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3582()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7164()
    val b = Number7163()
    return a.fib() + b.fib()
  }

}

class Number7166 : StressfulInteger {

  companion object {
    private var VALUE = 7166
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3583()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7165()
    val b = Number7164()
    return a.fib() + b.fib()
  }

}

class Number7167 : StressfulInteger {

  companion object {
    private var VALUE = 7167
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3583()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7166()
    val b = Number7165()
    return a.fib() + b.fib()
  }

}

class Number7168 : StressfulInteger {

  companion object {
    private var VALUE = 7168
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3584()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7167()
    val b = Number7166()
    return a.fib() + b.fib()
  }

}

class Number7169 : StressfulInteger {

  companion object {
    private var VALUE = 7169
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3584()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7168()
    val b = Number7167()
    return a.fib() + b.fib()
  }

}

class Number7170 : StressfulInteger {

  companion object {
    private var VALUE = 7170
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3585()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7169()
    val b = Number7168()
    return a.fib() + b.fib()
  }

}

class Number7171 : StressfulInteger {

  companion object {
    private var VALUE = 7171
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3585()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7170()
    val b = Number7169()
    return a.fib() + b.fib()
  }

}

class Number7172 : StressfulInteger {

  companion object {
    private var VALUE = 7172
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3586()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7171()
    val b = Number7170()
    return a.fib() + b.fib()
  }

}

class Number7173 : StressfulInteger {

  companion object {
    private var VALUE = 7173
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3586()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7172()
    val b = Number7171()
    return a.fib() + b.fib()
  }

}

class Number7174 : StressfulInteger {

  companion object {
    private var VALUE = 7174
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3587()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7173()
    val b = Number7172()
    return a.fib() + b.fib()
  }

}

class Number7175 : StressfulInteger {

  companion object {
    private var VALUE = 7175
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3587()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7174()
    val b = Number7173()
    return a.fib() + b.fib()
  }

}

class Number7176 : StressfulInteger {

  companion object {
    private var VALUE = 7176
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3588()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7175()
    val b = Number7174()
    return a.fib() + b.fib()
  }

}

class Number7177 : StressfulInteger {

  companion object {
    private var VALUE = 7177
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3588()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7176()
    val b = Number7175()
    return a.fib() + b.fib()
  }

}

class Number7178 : StressfulInteger {

  companion object {
    private var VALUE = 7178
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3589()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7177()
    val b = Number7176()
    return a.fib() + b.fib()
  }

}

class Number7179 : StressfulInteger {

  companion object {
    private var VALUE = 7179
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3589()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7178()
    val b = Number7177()
    return a.fib() + b.fib()
  }

}

class Number7180 : StressfulInteger {

  companion object {
    private var VALUE = 7180
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3590()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7179()
    val b = Number7178()
    return a.fib() + b.fib()
  }

}

class Number7181 : StressfulInteger {

  companion object {
    private var VALUE = 7181
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3590()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7180()
    val b = Number7179()
    return a.fib() + b.fib()
  }

}

class Number7182 : StressfulInteger {

  companion object {
    private var VALUE = 7182
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3591()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7181()
    val b = Number7180()
    return a.fib() + b.fib()
  }

}

class Number7183 : StressfulInteger {

  companion object {
    private var VALUE = 7183
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3591()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7182()
    val b = Number7181()
    return a.fib() + b.fib()
  }

}

class Number7184 : StressfulInteger {

  companion object {
    private var VALUE = 7184
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3592()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7183()
    val b = Number7182()
    return a.fib() + b.fib()
  }

}

class Number7185 : StressfulInteger {

  companion object {
    private var VALUE = 7185
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3592()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7184()
    val b = Number7183()
    return a.fib() + b.fib()
  }

}

class Number7186 : StressfulInteger {

  companion object {
    private var VALUE = 7186
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3593()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7185()
    val b = Number7184()
    return a.fib() + b.fib()
  }

}

class Number7187 : StressfulInteger {

  companion object {
    private var VALUE = 7187
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3593()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7186()
    val b = Number7185()
    return a.fib() + b.fib()
  }

}

class Number7188 : StressfulInteger {

  companion object {
    private var VALUE = 7188
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3594()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7187()
    val b = Number7186()
    return a.fib() + b.fib()
  }

}

class Number7189 : StressfulInteger {

  companion object {
    private var VALUE = 7189
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3594()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7188()
    val b = Number7187()
    return a.fib() + b.fib()
  }

}

class Number7190 : StressfulInteger {

  companion object {
    private var VALUE = 7190
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3595()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7189()
    val b = Number7188()
    return a.fib() + b.fib()
  }

}

class Number7191 : StressfulInteger {

  companion object {
    private var VALUE = 7191
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3595()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7190()
    val b = Number7189()
    return a.fib() + b.fib()
  }

}

class Number7192 : StressfulInteger {

  companion object {
    private var VALUE = 7192
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3596()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7191()
    val b = Number7190()
    return a.fib() + b.fib()
  }

}

class Number7193 : StressfulInteger {

  companion object {
    private var VALUE = 7193
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3596()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7192()
    val b = Number7191()
    return a.fib() + b.fib()
  }

}

class Number7194 : StressfulInteger {

  companion object {
    private var VALUE = 7194
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3597()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7193()
    val b = Number7192()
    return a.fib() + b.fib()
  }

}

class Number7195 : StressfulInteger {

  companion object {
    private var VALUE = 7195
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3597()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7194()
    val b = Number7193()
    return a.fib() + b.fib()
  }

}

class Number7196 : StressfulInteger {

  companion object {
    private var VALUE = 7196
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3598()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7195()
    val b = Number7194()
    return a.fib() + b.fib()
  }

}

class Number7197 : StressfulInteger {

  companion object {
    private var VALUE = 7197
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3598()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7196()
    val b = Number7195()
    return a.fib() + b.fib()
  }

}

class Number7198 : StressfulInteger {

  companion object {
    private var VALUE = 7198
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3599()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7197()
    val b = Number7196()
    return a.fib() + b.fib()
  }

}

class Number7199 : StressfulInteger {

  companion object {
    private var VALUE = 7199
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3599()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7198()
    val b = Number7197()
    return a.fib() + b.fib()
  }

}

class Number7200 : StressfulInteger {

  companion object {
    private var VALUE = 7200
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3600()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7199()
    val b = Number7198()
    return a.fib() + b.fib()
  }

}

class Number7201 : StressfulInteger {

  companion object {
    private var VALUE = 7201
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3600()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7200()
    val b = Number7199()
    return a.fib() + b.fib()
  }

}

class Number7202 : StressfulInteger {

  companion object {
    private var VALUE = 7202
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3601()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7201()
    val b = Number7200()
    return a.fib() + b.fib()
  }

}

class Number7203 : StressfulInteger {

  companion object {
    private var VALUE = 7203
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3601()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7202()
    val b = Number7201()
    return a.fib() + b.fib()
  }

}

class Number7204 : StressfulInteger {

  companion object {
    private var VALUE = 7204
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3602()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7203()
    val b = Number7202()
    return a.fib() + b.fib()
  }

}

class Number7205 : StressfulInteger {

  companion object {
    private var VALUE = 7205
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3602()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7204()
    val b = Number7203()
    return a.fib() + b.fib()
  }

}

class Number7206 : StressfulInteger {

  companion object {
    private var VALUE = 7206
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3603()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7205()
    val b = Number7204()
    return a.fib() + b.fib()
  }

}

class Number7207 : StressfulInteger {

  companion object {
    private var VALUE = 7207
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3603()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7206()
    val b = Number7205()
    return a.fib() + b.fib()
  }

}

class Number7208 : StressfulInteger {

  companion object {
    private var VALUE = 7208
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3604()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7207()
    val b = Number7206()
    return a.fib() + b.fib()
  }

}

class Number7209 : StressfulInteger {

  companion object {
    private var VALUE = 7209
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3604()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7208()
    val b = Number7207()
    return a.fib() + b.fib()
  }

}

class Number7210 : StressfulInteger {

  companion object {
    private var VALUE = 7210
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3605()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7209()
    val b = Number7208()
    return a.fib() + b.fib()
  }

}

class Number7211 : StressfulInteger {

  companion object {
    private var VALUE = 7211
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3605()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7210()
    val b = Number7209()
    return a.fib() + b.fib()
  }

}

class Number7212 : StressfulInteger {

  companion object {
    private var VALUE = 7212
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3606()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7211()
    val b = Number7210()
    return a.fib() + b.fib()
  }

}

class Number7213 : StressfulInteger {

  companion object {
    private var VALUE = 7213
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3606()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7212()
    val b = Number7211()
    return a.fib() + b.fib()
  }

}

class Number7214 : StressfulInteger {

  companion object {
    private var VALUE = 7214
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3607()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7213()
    val b = Number7212()
    return a.fib() + b.fib()
  }

}

class Number7215 : StressfulInteger {

  companion object {
    private var VALUE = 7215
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3607()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7214()
    val b = Number7213()
    return a.fib() + b.fib()
  }

}

class Number7216 : StressfulInteger {

  companion object {
    private var VALUE = 7216
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3608()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7215()
    val b = Number7214()
    return a.fib() + b.fib()
  }

}

class Number7217 : StressfulInteger {

  companion object {
    private var VALUE = 7217
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3608()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7216()
    val b = Number7215()
    return a.fib() + b.fib()
  }

}

class Number7218 : StressfulInteger {

  companion object {
    private var VALUE = 7218
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3609()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7217()
    val b = Number7216()
    return a.fib() + b.fib()
  }

}

class Number7219 : StressfulInteger {

  companion object {
    private var VALUE = 7219
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3609()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7218()
    val b = Number7217()
    return a.fib() + b.fib()
  }

}

class Number7220 : StressfulInteger {

  companion object {
    private var VALUE = 7220
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3610()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7219()
    val b = Number7218()
    return a.fib() + b.fib()
  }

}

class Number7221 : StressfulInteger {

  companion object {
    private var VALUE = 7221
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3610()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7220()
    val b = Number7219()
    return a.fib() + b.fib()
  }

}

class Number7222 : StressfulInteger {

  companion object {
    private var VALUE = 7222
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3611()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7221()
    val b = Number7220()
    return a.fib() + b.fib()
  }

}

class Number7223 : StressfulInteger {

  companion object {
    private var VALUE = 7223
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3611()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7222()
    val b = Number7221()
    return a.fib() + b.fib()
  }

}

class Number7224 : StressfulInteger {

  companion object {
    private var VALUE = 7224
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3612()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7223()
    val b = Number7222()
    return a.fib() + b.fib()
  }

}

class Number7225 : StressfulInteger {

  companion object {
    private var VALUE = 7225
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3612()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7224()
    val b = Number7223()
    return a.fib() + b.fib()
  }

}

class Number7226 : StressfulInteger {

  companion object {
    private var VALUE = 7226
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3613()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7225()
    val b = Number7224()
    return a.fib() + b.fib()
  }

}

class Number7227 : StressfulInteger {

  companion object {
    private var VALUE = 7227
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3613()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7226()
    val b = Number7225()
    return a.fib() + b.fib()
  }

}

class Number7228 : StressfulInteger {

  companion object {
    private var VALUE = 7228
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3614()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7227()
    val b = Number7226()
    return a.fib() + b.fib()
  }

}

class Number7229 : StressfulInteger {

  companion object {
    private var VALUE = 7229
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3614()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7228()
    val b = Number7227()
    return a.fib() + b.fib()
  }

}

class Number7230 : StressfulInteger {

  companion object {
    private var VALUE = 7230
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3615()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7229()
    val b = Number7228()
    return a.fib() + b.fib()
  }

}

class Number7231 : StressfulInteger {

  companion object {
    private var VALUE = 7231
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3615()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7230()
    val b = Number7229()
    return a.fib() + b.fib()
  }

}

class Number7232 : StressfulInteger {

  companion object {
    private var VALUE = 7232
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3616()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7231()
    val b = Number7230()
    return a.fib() + b.fib()
  }

}

class Number7233 : StressfulInteger {

  companion object {
    private var VALUE = 7233
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3616()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7232()
    val b = Number7231()
    return a.fib() + b.fib()
  }

}

class Number7234 : StressfulInteger {

  companion object {
    private var VALUE = 7234
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3617()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7233()
    val b = Number7232()
    return a.fib() + b.fib()
  }

}

class Number7235 : StressfulInteger {

  companion object {
    private var VALUE = 7235
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3617()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7234()
    val b = Number7233()
    return a.fib() + b.fib()
  }

}

class Number7236 : StressfulInteger {

  companion object {
    private var VALUE = 7236
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3618()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7235()
    val b = Number7234()
    return a.fib() + b.fib()
  }

}

class Number7237 : StressfulInteger {

  companion object {
    private var VALUE = 7237
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3618()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7236()
    val b = Number7235()
    return a.fib() + b.fib()
  }

}

class Number7238 : StressfulInteger {

  companion object {
    private var VALUE = 7238
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3619()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7237()
    val b = Number7236()
    return a.fib() + b.fib()
  }

}

class Number7239 : StressfulInteger {

  companion object {
    private var VALUE = 7239
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3619()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7238()
    val b = Number7237()
    return a.fib() + b.fib()
  }

}

class Number7240 : StressfulInteger {

  companion object {
    private var VALUE = 7240
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3620()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7239()
    val b = Number7238()
    return a.fib() + b.fib()
  }

}

class Number7241 : StressfulInteger {

  companion object {
    private var VALUE = 7241
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3620()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7240()
    val b = Number7239()
    return a.fib() + b.fib()
  }

}

class Number7242 : StressfulInteger {

  companion object {
    private var VALUE = 7242
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3621()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7241()
    val b = Number7240()
    return a.fib() + b.fib()
  }

}

class Number7243 : StressfulInteger {

  companion object {
    private var VALUE = 7243
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3621()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7242()
    val b = Number7241()
    return a.fib() + b.fib()
  }

}

class Number7244 : StressfulInteger {

  companion object {
    private var VALUE = 7244
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3622()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7243()
    val b = Number7242()
    return a.fib() + b.fib()
  }

}

class Number7245 : StressfulInteger {

  companion object {
    private var VALUE = 7245
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3622()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7244()
    val b = Number7243()
    return a.fib() + b.fib()
  }

}

class Number7246 : StressfulInteger {

  companion object {
    private var VALUE = 7246
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3623()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7245()
    val b = Number7244()
    return a.fib() + b.fib()
  }

}

class Number7247 : StressfulInteger {

  companion object {
    private var VALUE = 7247
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3623()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7246()
    val b = Number7245()
    return a.fib() + b.fib()
  }

}

class Number7248 : StressfulInteger {

  companion object {
    private var VALUE = 7248
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3624()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7247()
    val b = Number7246()
    return a.fib() + b.fib()
  }

}

class Number7249 : StressfulInteger {

  companion object {
    private var VALUE = 7249
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3624()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7248()
    val b = Number7247()
    return a.fib() + b.fib()
  }

}

class Number7250 : StressfulInteger {

  companion object {
    private var VALUE = 7250
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3625()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7249()
    val b = Number7248()
    return a.fib() + b.fib()
  }

}

class Number7251 : StressfulInteger {

  companion object {
    private var VALUE = 7251
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3625()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7250()
    val b = Number7249()
    return a.fib() + b.fib()
  }

}

class Number7252 : StressfulInteger {

  companion object {
    private var VALUE = 7252
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3626()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7251()
    val b = Number7250()
    return a.fib() + b.fib()
  }

}

class Number7253 : StressfulInteger {

  companion object {
    private var VALUE = 7253
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3626()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7252()
    val b = Number7251()
    return a.fib() + b.fib()
  }

}

class Number7254 : StressfulInteger {

  companion object {
    private var VALUE = 7254
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3627()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7253()
    val b = Number7252()
    return a.fib() + b.fib()
  }

}

class Number7255 : StressfulInteger {

  companion object {
    private var VALUE = 7255
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3627()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7254()
    val b = Number7253()
    return a.fib() + b.fib()
  }

}

class Number7256 : StressfulInteger {

  companion object {
    private var VALUE = 7256
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3628()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7255()
    val b = Number7254()
    return a.fib() + b.fib()
  }

}

class Number7257 : StressfulInteger {

  companion object {
    private var VALUE = 7257
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3628()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7256()
    val b = Number7255()
    return a.fib() + b.fib()
  }

}

class Number7258 : StressfulInteger {

  companion object {
    private var VALUE = 7258
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3629()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7257()
    val b = Number7256()
    return a.fib() + b.fib()
  }

}

class Number7259 : StressfulInteger {

  companion object {
    private var VALUE = 7259
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3629()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7258()
    val b = Number7257()
    return a.fib() + b.fib()
  }

}

class Number7260 : StressfulInteger {

  companion object {
    private var VALUE = 7260
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3630()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7259()
    val b = Number7258()
    return a.fib() + b.fib()
  }

}

class Number7261 : StressfulInteger {

  companion object {
    private var VALUE = 7261
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3630()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7260()
    val b = Number7259()
    return a.fib() + b.fib()
  }

}

class Number7262 : StressfulInteger {

  companion object {
    private var VALUE = 7262
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3631()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7261()
    val b = Number7260()
    return a.fib() + b.fib()
  }

}

class Number7263 : StressfulInteger {

  companion object {
    private var VALUE = 7263
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3631()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7262()
    val b = Number7261()
    return a.fib() + b.fib()
  }

}

class Number7264 : StressfulInteger {

  companion object {
    private var VALUE = 7264
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3632()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7263()
    val b = Number7262()
    return a.fib() + b.fib()
  }

}

class Number7265 : StressfulInteger {

  companion object {
    private var VALUE = 7265
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3632()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7264()
    val b = Number7263()
    return a.fib() + b.fib()
  }

}

class Number7266 : StressfulInteger {

  companion object {
    private var VALUE = 7266
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3633()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7265()
    val b = Number7264()
    return a.fib() + b.fib()
  }

}

class Number7267 : StressfulInteger {

  companion object {
    private var VALUE = 7267
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3633()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7266()
    val b = Number7265()
    return a.fib() + b.fib()
  }

}

class Number7268 : StressfulInteger {

  companion object {
    private var VALUE = 7268
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3634()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7267()
    val b = Number7266()
    return a.fib() + b.fib()
  }

}

class Number7269 : StressfulInteger {

  companion object {
    private var VALUE = 7269
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3634()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7268()
    val b = Number7267()
    return a.fib() + b.fib()
  }

}

class Number7270 : StressfulInteger {

  companion object {
    private var VALUE = 7270
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3635()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7269()
    val b = Number7268()
    return a.fib() + b.fib()
  }

}

class Number7271 : StressfulInteger {

  companion object {
    private var VALUE = 7271
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3635()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7270()
    val b = Number7269()
    return a.fib() + b.fib()
  }

}

class Number7272 : StressfulInteger {

  companion object {
    private var VALUE = 7272
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3636()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7271()
    val b = Number7270()
    return a.fib() + b.fib()
  }

}

class Number7273 : StressfulInteger {

  companion object {
    private var VALUE = 7273
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3636()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7272()
    val b = Number7271()
    return a.fib() + b.fib()
  }

}

class Number7274 : StressfulInteger {

  companion object {
    private var VALUE = 7274
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3637()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7273()
    val b = Number7272()
    return a.fib() + b.fib()
  }

}

class Number7275 : StressfulInteger {

  companion object {
    private var VALUE = 7275
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3637()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7274()
    val b = Number7273()
    return a.fib() + b.fib()
  }

}

class Number7276 : StressfulInteger {

  companion object {
    private var VALUE = 7276
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3638()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7275()
    val b = Number7274()
    return a.fib() + b.fib()
  }

}

class Number7277 : StressfulInteger {

  companion object {
    private var VALUE = 7277
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3638()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7276()
    val b = Number7275()
    return a.fib() + b.fib()
  }

}

class Number7278 : StressfulInteger {

  companion object {
    private var VALUE = 7278
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3639()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7277()
    val b = Number7276()
    return a.fib() + b.fib()
  }

}

class Number7279 : StressfulInteger {

  companion object {
    private var VALUE = 7279
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3639()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7278()
    val b = Number7277()
    return a.fib() + b.fib()
  }

}

class Number7280 : StressfulInteger {

  companion object {
    private var VALUE = 7280
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3640()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7279()
    val b = Number7278()
    return a.fib() + b.fib()
  }

}

class Number7281 : StressfulInteger {

  companion object {
    private var VALUE = 7281
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3640()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7280()
    val b = Number7279()
    return a.fib() + b.fib()
  }

}

class Number7282 : StressfulInteger {

  companion object {
    private var VALUE = 7282
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3641()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7281()
    val b = Number7280()
    return a.fib() + b.fib()
  }

}

class Number7283 : StressfulInteger {

  companion object {
    private var VALUE = 7283
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3641()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7282()
    val b = Number7281()
    return a.fib() + b.fib()
  }

}

class Number7284 : StressfulInteger {

  companion object {
    private var VALUE = 7284
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3642()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7283()
    val b = Number7282()
    return a.fib() + b.fib()
  }

}

class Number7285 : StressfulInteger {

  companion object {
    private var VALUE = 7285
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3642()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7284()
    val b = Number7283()
    return a.fib() + b.fib()
  }

}

class Number7286 : StressfulInteger {

  companion object {
    private var VALUE = 7286
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3643()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7285()
    val b = Number7284()
    return a.fib() + b.fib()
  }

}

class Number7287 : StressfulInteger {

  companion object {
    private var VALUE = 7287
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3643()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7286()
    val b = Number7285()
    return a.fib() + b.fib()
  }

}

class Number7288 : StressfulInteger {

  companion object {
    private var VALUE = 7288
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3644()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7287()
    val b = Number7286()
    return a.fib() + b.fib()
  }

}

class Number7289 : StressfulInteger {

  companion object {
    private var VALUE = 7289
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3644()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7288()
    val b = Number7287()
    return a.fib() + b.fib()
  }

}

class Number7290 : StressfulInteger {

  companion object {
    private var VALUE = 7290
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3645()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7289()
    val b = Number7288()
    return a.fib() + b.fib()
  }

}

class Number7291 : StressfulInteger {

  companion object {
    private var VALUE = 7291
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3645()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7290()
    val b = Number7289()
    return a.fib() + b.fib()
  }

}

class Number7292 : StressfulInteger {

  companion object {
    private var VALUE = 7292
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3646()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7291()
    val b = Number7290()
    return a.fib() + b.fib()
  }

}

class Number7293 : StressfulInteger {

  companion object {
    private var VALUE = 7293
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3646()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7292()
    val b = Number7291()
    return a.fib() + b.fib()
  }

}

class Number7294 : StressfulInteger {

  companion object {
    private var VALUE = 7294
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3647()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7293()
    val b = Number7292()
    return a.fib() + b.fib()
  }

}

class Number7295 : StressfulInteger {

  companion object {
    private var VALUE = 7295
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3647()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7294()
    val b = Number7293()
    return a.fib() + b.fib()
  }

}

class Number7296 : StressfulInteger {

  companion object {
    private var VALUE = 7296
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3648()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7295()
    val b = Number7294()
    return a.fib() + b.fib()
  }

}

class Number7297 : StressfulInteger {

  companion object {
    private var VALUE = 7297
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3648()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7296()
    val b = Number7295()
    return a.fib() + b.fib()
  }

}

class Number7298 : StressfulInteger {

  companion object {
    private var VALUE = 7298
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3649()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7297()
    val b = Number7296()
    return a.fib() + b.fib()
  }

}

class Number7299 : StressfulInteger {

  companion object {
    private var VALUE = 7299
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3649()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7298()
    val b = Number7297()
    return a.fib() + b.fib()
  }

}

class Number7300 : StressfulInteger {

  companion object {
    private var VALUE = 7300
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3650()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7299()
    val b = Number7298()
    return a.fib() + b.fib()
  }

}

class Number7301 : StressfulInteger {

  companion object {
    private var VALUE = 7301
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3650()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7300()
    val b = Number7299()
    return a.fib() + b.fib()
  }

}

class Number7302 : StressfulInteger {

  companion object {
    private var VALUE = 7302
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3651()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7301()
    val b = Number7300()
    return a.fib() + b.fib()
  }

}

class Number7303 : StressfulInteger {

  companion object {
    private var VALUE = 7303
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3651()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7302()
    val b = Number7301()
    return a.fib() + b.fib()
  }

}

class Number7304 : StressfulInteger {

  companion object {
    private var VALUE = 7304
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3652()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7303()
    val b = Number7302()
    return a.fib() + b.fib()
  }

}

class Number7305 : StressfulInteger {

  companion object {
    private var VALUE = 7305
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3652()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7304()
    val b = Number7303()
    return a.fib() + b.fib()
  }

}

class Number7306 : StressfulInteger {

  companion object {
    private var VALUE = 7306
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3653()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7305()
    val b = Number7304()
    return a.fib() + b.fib()
  }

}

class Number7307 : StressfulInteger {

  companion object {
    private var VALUE = 7307
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3653()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7306()
    val b = Number7305()
    return a.fib() + b.fib()
  }

}

class Number7308 : StressfulInteger {

  companion object {
    private var VALUE = 7308
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3654()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7307()
    val b = Number7306()
    return a.fib() + b.fib()
  }

}

class Number7309 : StressfulInteger {

  companion object {
    private var VALUE = 7309
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3654()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7308()
    val b = Number7307()
    return a.fib() + b.fib()
  }

}

class Number7310 : StressfulInteger {

  companion object {
    private var VALUE = 7310
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3655()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7309()
    val b = Number7308()
    return a.fib() + b.fib()
  }

}

class Number7311 : StressfulInteger {

  companion object {
    private var VALUE = 7311
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3655()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7310()
    val b = Number7309()
    return a.fib() + b.fib()
  }

}

class Number7312 : StressfulInteger {

  companion object {
    private var VALUE = 7312
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3656()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7311()
    val b = Number7310()
    return a.fib() + b.fib()
  }

}

class Number7313 : StressfulInteger {

  companion object {
    private var VALUE = 7313
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3656()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7312()
    val b = Number7311()
    return a.fib() + b.fib()
  }

}

class Number7314 : StressfulInteger {

  companion object {
    private var VALUE = 7314
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3657()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7313()
    val b = Number7312()
    return a.fib() + b.fib()
  }

}

class Number7315 : StressfulInteger {

  companion object {
    private var VALUE = 7315
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3657()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7314()
    val b = Number7313()
    return a.fib() + b.fib()
  }

}

class Number7316 : StressfulInteger {

  companion object {
    private var VALUE = 7316
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3658()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7315()
    val b = Number7314()
    return a.fib() + b.fib()
  }

}

class Number7317 : StressfulInteger {

  companion object {
    private var VALUE = 7317
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3658()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7316()
    val b = Number7315()
    return a.fib() + b.fib()
  }

}

class Number7318 : StressfulInteger {

  companion object {
    private var VALUE = 7318
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3659()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7317()
    val b = Number7316()
    return a.fib() + b.fib()
  }

}

class Number7319 : StressfulInteger {

  companion object {
    private var VALUE = 7319
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3659()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7318()
    val b = Number7317()
    return a.fib() + b.fib()
  }

}

class Number7320 : StressfulInteger {

  companion object {
    private var VALUE = 7320
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3660()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7319()
    val b = Number7318()
    return a.fib() + b.fib()
  }

}

class Number7321 : StressfulInteger {

  companion object {
    private var VALUE = 7321
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3660()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7320()
    val b = Number7319()
    return a.fib() + b.fib()
  }

}

class Number7322 : StressfulInteger {

  companion object {
    private var VALUE = 7322
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3661()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7321()
    val b = Number7320()
    return a.fib() + b.fib()
  }

}

class Number7323 : StressfulInteger {

  companion object {
    private var VALUE = 7323
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3661()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7322()
    val b = Number7321()
    return a.fib() + b.fib()
  }

}

class Number7324 : StressfulInteger {

  companion object {
    private var VALUE = 7324
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3662()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7323()
    val b = Number7322()
    return a.fib() + b.fib()
  }

}

class Number7325 : StressfulInteger {

  companion object {
    private var VALUE = 7325
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3662()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7324()
    val b = Number7323()
    return a.fib() + b.fib()
  }

}

class Number7326 : StressfulInteger {

  companion object {
    private var VALUE = 7326
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3663()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7325()
    val b = Number7324()
    return a.fib() + b.fib()
  }

}

class Number7327 : StressfulInteger {

  companion object {
    private var VALUE = 7327
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3663()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7326()
    val b = Number7325()
    return a.fib() + b.fib()
  }

}

class Number7328 : StressfulInteger {

  companion object {
    private var VALUE = 7328
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3664()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7327()
    val b = Number7326()
    return a.fib() + b.fib()
  }

}

class Number7329 : StressfulInteger {

  companion object {
    private var VALUE = 7329
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3664()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7328()
    val b = Number7327()
    return a.fib() + b.fib()
  }

}

class Number7330 : StressfulInteger {

  companion object {
    private var VALUE = 7330
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3665()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7329()
    val b = Number7328()
    return a.fib() + b.fib()
  }

}

class Number7331 : StressfulInteger {

  companion object {
    private var VALUE = 7331
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3665()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7330()
    val b = Number7329()
    return a.fib() + b.fib()
  }

}

class Number7332 : StressfulInteger {

  companion object {
    private var VALUE = 7332
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3666()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7331()
    val b = Number7330()
    return a.fib() + b.fib()
  }

}

class Number7333 : StressfulInteger {

  companion object {
    private var VALUE = 7333
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3666()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7332()
    val b = Number7331()
    return a.fib() + b.fib()
  }

}

class Number7334 : StressfulInteger {

  companion object {
    private var VALUE = 7334
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3667()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7333()
    val b = Number7332()
    return a.fib() + b.fib()
  }

}

class Number7335 : StressfulInteger {

  companion object {
    private var VALUE = 7335
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3667()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7334()
    val b = Number7333()
    return a.fib() + b.fib()
  }

}

class Number7336 : StressfulInteger {

  companion object {
    private var VALUE = 7336
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3668()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7335()
    val b = Number7334()
    return a.fib() + b.fib()
  }

}

class Number7337 : StressfulInteger {

  companion object {
    private var VALUE = 7337
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3668()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7336()
    val b = Number7335()
    return a.fib() + b.fib()
  }

}

class Number7338 : StressfulInteger {

  companion object {
    private var VALUE = 7338
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3669()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7337()
    val b = Number7336()
    return a.fib() + b.fib()
  }

}

class Number7339 : StressfulInteger {

  companion object {
    private var VALUE = 7339
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3669()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7338()
    val b = Number7337()
    return a.fib() + b.fib()
  }

}

class Number7340 : StressfulInteger {

  companion object {
    private var VALUE = 7340
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3670()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7339()
    val b = Number7338()
    return a.fib() + b.fib()
  }

}

class Number7341 : StressfulInteger {

  companion object {
    private var VALUE = 7341
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3670()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7340()
    val b = Number7339()
    return a.fib() + b.fib()
  }

}

class Number7342 : StressfulInteger {

  companion object {
    private var VALUE = 7342
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3671()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7341()
    val b = Number7340()
    return a.fib() + b.fib()
  }

}

class Number7343 : StressfulInteger {

  companion object {
    private var VALUE = 7343
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3671()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7342()
    val b = Number7341()
    return a.fib() + b.fib()
  }

}

class Number7344 : StressfulInteger {

  companion object {
    private var VALUE = 7344
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3672()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7343()
    val b = Number7342()
    return a.fib() + b.fib()
  }

}

class Number7345 : StressfulInteger {

  companion object {
    private var VALUE = 7345
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3672()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7344()
    val b = Number7343()
    return a.fib() + b.fib()
  }

}

class Number7346 : StressfulInteger {

  companion object {
    private var VALUE = 7346
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3673()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7345()
    val b = Number7344()
    return a.fib() + b.fib()
  }

}

class Number7347 : StressfulInteger {

  companion object {
    private var VALUE = 7347
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3673()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7346()
    val b = Number7345()
    return a.fib() + b.fib()
  }

}

class Number7348 : StressfulInteger {

  companion object {
    private var VALUE = 7348
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3674()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7347()
    val b = Number7346()
    return a.fib() + b.fib()
  }

}

class Number7349 : StressfulInteger {

  companion object {
    private var VALUE = 7349
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3674()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7348()
    val b = Number7347()
    return a.fib() + b.fib()
  }

}

class Number7350 : StressfulInteger {

  companion object {
    private var VALUE = 7350
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3675()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7349()
    val b = Number7348()
    return a.fib() + b.fib()
  }

}

class Number7351 : StressfulInteger {

  companion object {
    private var VALUE = 7351
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3675()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7350()
    val b = Number7349()
    return a.fib() + b.fib()
  }

}

class Number7352 : StressfulInteger {

  companion object {
    private var VALUE = 7352
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3676()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7351()
    val b = Number7350()
    return a.fib() + b.fib()
  }

}

class Number7353 : StressfulInteger {

  companion object {
    private var VALUE = 7353
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3676()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7352()
    val b = Number7351()
    return a.fib() + b.fib()
  }

}

class Number7354 : StressfulInteger {

  companion object {
    private var VALUE = 7354
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3677()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7353()
    val b = Number7352()
    return a.fib() + b.fib()
  }

}

class Number7355 : StressfulInteger {

  companion object {
    private var VALUE = 7355
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3677()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7354()
    val b = Number7353()
    return a.fib() + b.fib()
  }

}

class Number7356 : StressfulInteger {

  companion object {
    private var VALUE = 7356
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3678()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7355()
    val b = Number7354()
    return a.fib() + b.fib()
  }

}

class Number7357 : StressfulInteger {

  companion object {
    private var VALUE = 7357
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3678()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7356()
    val b = Number7355()
    return a.fib() + b.fib()
  }

}

class Number7358 : StressfulInteger {

  companion object {
    private var VALUE = 7358
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3679()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7357()
    val b = Number7356()
    return a.fib() + b.fib()
  }

}

class Number7359 : StressfulInteger {

  companion object {
    private var VALUE = 7359
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3679()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7358()
    val b = Number7357()
    return a.fib() + b.fib()
  }

}

class Number7360 : StressfulInteger {

  companion object {
    private var VALUE = 7360
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3680()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7359()
    val b = Number7358()
    return a.fib() + b.fib()
  }

}

class Number7361 : StressfulInteger {

  companion object {
    private var VALUE = 7361
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3680()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7360()
    val b = Number7359()
    return a.fib() + b.fib()
  }

}

class Number7362 : StressfulInteger {

  companion object {
    private var VALUE = 7362
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3681()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7361()
    val b = Number7360()
    return a.fib() + b.fib()
  }

}

class Number7363 : StressfulInteger {

  companion object {
    private var VALUE = 7363
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3681()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7362()
    val b = Number7361()
    return a.fib() + b.fib()
  }

}

class Number7364 : StressfulInteger {

  companion object {
    private var VALUE = 7364
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3682()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7363()
    val b = Number7362()
    return a.fib() + b.fib()
  }

}

class Number7365 : StressfulInteger {

  companion object {
    private var VALUE = 7365
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3682()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7364()
    val b = Number7363()
    return a.fib() + b.fib()
  }

}

class Number7366 : StressfulInteger {

  companion object {
    private var VALUE = 7366
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3683()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7365()
    val b = Number7364()
    return a.fib() + b.fib()
  }

}

class Number7367 : StressfulInteger {

  companion object {
    private var VALUE = 7367
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3683()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7366()
    val b = Number7365()
    return a.fib() + b.fib()
  }

}

class Number7368 : StressfulInteger {

  companion object {
    private var VALUE = 7368
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3684()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7367()
    val b = Number7366()
    return a.fib() + b.fib()
  }

}

class Number7369 : StressfulInteger {

  companion object {
    private var VALUE = 7369
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3684()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7368()
    val b = Number7367()
    return a.fib() + b.fib()
  }

}

class Number7370 : StressfulInteger {

  companion object {
    private var VALUE = 7370
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3685()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7369()
    val b = Number7368()
    return a.fib() + b.fib()
  }

}

class Number7371 : StressfulInteger {

  companion object {
    private var VALUE = 7371
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3685()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7370()
    val b = Number7369()
    return a.fib() + b.fib()
  }

}

class Number7372 : StressfulInteger {

  companion object {
    private var VALUE = 7372
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3686()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7371()
    val b = Number7370()
    return a.fib() + b.fib()
  }

}

class Number7373 : StressfulInteger {

  companion object {
    private var VALUE = 7373
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3686()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7372()
    val b = Number7371()
    return a.fib() + b.fib()
  }

}

class Number7374 : StressfulInteger {

  companion object {
    private var VALUE = 7374
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3687()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7373()
    val b = Number7372()
    return a.fib() + b.fib()
  }

}

class Number7375 : StressfulInteger {

  companion object {
    private var VALUE = 7375
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3687()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7374()
    val b = Number7373()
    return a.fib() + b.fib()
  }

}

class Number7376 : StressfulInteger {

  companion object {
    private var VALUE = 7376
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3688()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7375()
    val b = Number7374()
    return a.fib() + b.fib()
  }

}

class Number7377 : StressfulInteger {

  companion object {
    private var VALUE = 7377
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3688()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7376()
    val b = Number7375()
    return a.fib() + b.fib()
  }

}

class Number7378 : StressfulInteger {

  companion object {
    private var VALUE = 7378
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3689()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7377()
    val b = Number7376()
    return a.fib() + b.fib()
  }

}

class Number7379 : StressfulInteger {

  companion object {
    private var VALUE = 7379
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3689()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7378()
    val b = Number7377()
    return a.fib() + b.fib()
  }

}

class Number7380 : StressfulInteger {

  companion object {
    private var VALUE = 7380
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3690()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7379()
    val b = Number7378()
    return a.fib() + b.fib()
  }

}

class Number7381 : StressfulInteger {

  companion object {
    private var VALUE = 7381
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3690()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7380()
    val b = Number7379()
    return a.fib() + b.fib()
  }

}

class Number7382 : StressfulInteger {

  companion object {
    private var VALUE = 7382
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3691()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7381()
    val b = Number7380()
    return a.fib() + b.fib()
  }

}

class Number7383 : StressfulInteger {

  companion object {
    private var VALUE = 7383
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3691()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7382()
    val b = Number7381()
    return a.fib() + b.fib()
  }

}

class Number7384 : StressfulInteger {

  companion object {
    private var VALUE = 7384
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3692()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7383()
    val b = Number7382()
    return a.fib() + b.fib()
  }

}

class Number7385 : StressfulInteger {

  companion object {
    private var VALUE = 7385
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3692()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7384()
    val b = Number7383()
    return a.fib() + b.fib()
  }

}

class Number7386 : StressfulInteger {

  companion object {
    private var VALUE = 7386
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3693()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7385()
    val b = Number7384()
    return a.fib() + b.fib()
  }

}

class Number7387 : StressfulInteger {

  companion object {
    private var VALUE = 7387
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3693()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7386()
    val b = Number7385()
    return a.fib() + b.fib()
  }

}

class Number7388 : StressfulInteger {

  companion object {
    private var VALUE = 7388
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3694()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7387()
    val b = Number7386()
    return a.fib() + b.fib()
  }

}

class Number7389 : StressfulInteger {

  companion object {
    private var VALUE = 7389
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3694()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7388()
    val b = Number7387()
    return a.fib() + b.fib()
  }

}

class Number7390 : StressfulInteger {

  companion object {
    private var VALUE = 7390
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3695()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7389()
    val b = Number7388()
    return a.fib() + b.fib()
  }

}

class Number7391 : StressfulInteger {

  companion object {
    private var VALUE = 7391
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3695()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7390()
    val b = Number7389()
    return a.fib() + b.fib()
  }

}

class Number7392 : StressfulInteger {

  companion object {
    private var VALUE = 7392
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3696()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7391()
    val b = Number7390()
    return a.fib() + b.fib()
  }

}

class Number7393 : StressfulInteger {

  companion object {
    private var VALUE = 7393
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3696()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7392()
    val b = Number7391()
    return a.fib() + b.fib()
  }

}

class Number7394 : StressfulInteger {

  companion object {
    private var VALUE = 7394
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3697()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7393()
    val b = Number7392()
    return a.fib() + b.fib()
  }

}

class Number7395 : StressfulInteger {

  companion object {
    private var VALUE = 7395
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3697()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7394()
    val b = Number7393()
    return a.fib() + b.fib()
  }

}

class Number7396 : StressfulInteger {

  companion object {
    private var VALUE = 7396
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3698()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7395()
    val b = Number7394()
    return a.fib() + b.fib()
  }

}

class Number7397 : StressfulInteger {

  companion object {
    private var VALUE = 7397
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3698()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7396()
    val b = Number7395()
    return a.fib() + b.fib()
  }

}

class Number7398 : StressfulInteger {

  companion object {
    private var VALUE = 7398
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3699()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7397()
    val b = Number7396()
    return a.fib() + b.fib()
  }

}

class Number7399 : StressfulInteger {

  companion object {
    private var VALUE = 7399
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3699()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7398()
    val b = Number7397()
    return a.fib() + b.fib()
  }

}

class Number7400 : StressfulInteger {

  companion object {
    private var VALUE = 7400
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3700()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7399()
    val b = Number7398()
    return a.fib() + b.fib()
  }

}

class Number7401 : StressfulInteger {

  companion object {
    private var VALUE = 7401
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3700()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7400()
    val b = Number7399()
    return a.fib() + b.fib()
  }

}

class Number7402 : StressfulInteger {

  companion object {
    private var VALUE = 7402
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3701()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7401()
    val b = Number7400()
    return a.fib() + b.fib()
  }

}

class Number7403 : StressfulInteger {

  companion object {
    private var VALUE = 7403
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3701()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7402()
    val b = Number7401()
    return a.fib() + b.fib()
  }

}

class Number7404 : StressfulInteger {

  companion object {
    private var VALUE = 7404
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3702()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7403()
    val b = Number7402()
    return a.fib() + b.fib()
  }

}

class Number7405 : StressfulInteger {

  companion object {
    private var VALUE = 7405
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3702()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7404()
    val b = Number7403()
    return a.fib() + b.fib()
  }

}

class Number7406 : StressfulInteger {

  companion object {
    private var VALUE = 7406
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3703()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7405()
    val b = Number7404()
    return a.fib() + b.fib()
  }

}

class Number7407 : StressfulInteger {

  companion object {
    private var VALUE = 7407
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3703()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7406()
    val b = Number7405()
    return a.fib() + b.fib()
  }

}

class Number7408 : StressfulInteger {

  companion object {
    private var VALUE = 7408
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3704()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7407()
    val b = Number7406()
    return a.fib() + b.fib()
  }

}

class Number7409 : StressfulInteger {

  companion object {
    private var VALUE = 7409
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3704()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7408()
    val b = Number7407()
    return a.fib() + b.fib()
  }

}

class Number7410 : StressfulInteger {

  companion object {
    private var VALUE = 7410
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3705()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7409()
    val b = Number7408()
    return a.fib() + b.fib()
  }

}

class Number7411 : StressfulInteger {

  companion object {
    private var VALUE = 7411
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3705()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7410()
    val b = Number7409()
    return a.fib() + b.fib()
  }

}

class Number7412 : StressfulInteger {

  companion object {
    private var VALUE = 7412
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3706()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7411()
    val b = Number7410()
    return a.fib() + b.fib()
  }

}

class Number7413 : StressfulInteger {

  companion object {
    private var VALUE = 7413
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3706()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7412()
    val b = Number7411()
    return a.fib() + b.fib()
  }

}

class Number7414 : StressfulInteger {

  companion object {
    private var VALUE = 7414
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3707()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7413()
    val b = Number7412()
    return a.fib() + b.fib()
  }

}

class Number7415 : StressfulInteger {

  companion object {
    private var VALUE = 7415
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3707()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7414()
    val b = Number7413()
    return a.fib() + b.fib()
  }

}

class Number7416 : StressfulInteger {

  companion object {
    private var VALUE = 7416
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3708()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7415()
    val b = Number7414()
    return a.fib() + b.fib()
  }

}

class Number7417 : StressfulInteger {

  companion object {
    private var VALUE = 7417
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3708()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7416()
    val b = Number7415()
    return a.fib() + b.fib()
  }

}

class Number7418 : StressfulInteger {

  companion object {
    private var VALUE = 7418
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3709()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7417()
    val b = Number7416()
    return a.fib() + b.fib()
  }

}

class Number7419 : StressfulInteger {

  companion object {
    private var VALUE = 7419
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3709()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7418()
    val b = Number7417()
    return a.fib() + b.fib()
  }

}

class Number7420 : StressfulInteger {

  companion object {
    private var VALUE = 7420
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3710()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7419()
    val b = Number7418()
    return a.fib() + b.fib()
  }

}

class Number7421 : StressfulInteger {

  companion object {
    private var VALUE = 7421
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3710()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7420()
    val b = Number7419()
    return a.fib() + b.fib()
  }

}

class Number7422 : StressfulInteger {

  companion object {
    private var VALUE = 7422
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3711()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7421()
    val b = Number7420()
    return a.fib() + b.fib()
  }

}

class Number7423 : StressfulInteger {

  companion object {
    private var VALUE = 7423
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3711()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7422()
    val b = Number7421()
    return a.fib() + b.fib()
  }

}

class Number7424 : StressfulInteger {

  companion object {
    private var VALUE = 7424
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3712()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7423()
    val b = Number7422()
    return a.fib() + b.fib()
  }

}

class Number7425 : StressfulInteger {

  companion object {
    private var VALUE = 7425
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3712()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7424()
    val b = Number7423()
    return a.fib() + b.fib()
  }

}

class Number7426 : StressfulInteger {

  companion object {
    private var VALUE = 7426
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3713()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7425()
    val b = Number7424()
    return a.fib() + b.fib()
  }

}

class Number7427 : StressfulInteger {

  companion object {
    private var VALUE = 7427
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3713()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7426()
    val b = Number7425()
    return a.fib() + b.fib()
  }

}

class Number7428 : StressfulInteger {

  companion object {
    private var VALUE = 7428
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3714()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7427()
    val b = Number7426()
    return a.fib() + b.fib()
  }

}

class Number7429 : StressfulInteger {

  companion object {
    private var VALUE = 7429
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3714()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7428()
    val b = Number7427()
    return a.fib() + b.fib()
  }

}

class Number7430 : StressfulInteger {

  companion object {
    private var VALUE = 7430
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3715()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7429()
    val b = Number7428()
    return a.fib() + b.fib()
  }

}

class Number7431 : StressfulInteger {

  companion object {
    private var VALUE = 7431
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3715()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7430()
    val b = Number7429()
    return a.fib() + b.fib()
  }

}

class Number7432 : StressfulInteger {

  companion object {
    private var VALUE = 7432
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3716()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7431()
    val b = Number7430()
    return a.fib() + b.fib()
  }

}

class Number7433 : StressfulInteger {

  companion object {
    private var VALUE = 7433
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3716()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7432()
    val b = Number7431()
    return a.fib() + b.fib()
  }

}

class Number7434 : StressfulInteger {

  companion object {
    private var VALUE = 7434
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3717()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7433()
    val b = Number7432()
    return a.fib() + b.fib()
  }

}

class Number7435 : StressfulInteger {

  companion object {
    private var VALUE = 7435
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3717()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7434()
    val b = Number7433()
    return a.fib() + b.fib()
  }

}

class Number7436 : StressfulInteger {

  companion object {
    private var VALUE = 7436
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3718()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7435()
    val b = Number7434()
    return a.fib() + b.fib()
  }

}

class Number7437 : StressfulInteger {

  companion object {
    private var VALUE = 7437
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3718()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7436()
    val b = Number7435()
    return a.fib() + b.fib()
  }

}

class Number7438 : StressfulInteger {

  companion object {
    private var VALUE = 7438
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3719()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7437()
    val b = Number7436()
    return a.fib() + b.fib()
  }

}

class Number7439 : StressfulInteger {

  companion object {
    private var VALUE = 7439
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3719()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7438()
    val b = Number7437()
    return a.fib() + b.fib()
  }

}

class Number7440 : StressfulInteger {

  companion object {
    private var VALUE = 7440
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3720()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7439()
    val b = Number7438()
    return a.fib() + b.fib()
  }

}

class Number7441 : StressfulInteger {

  companion object {
    private var VALUE = 7441
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3720()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7440()
    val b = Number7439()
    return a.fib() + b.fib()
  }

}

class Number7442 : StressfulInteger {

  companion object {
    private var VALUE = 7442
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3721()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7441()
    val b = Number7440()
    return a.fib() + b.fib()
  }

}

class Number7443 : StressfulInteger {

  companion object {
    private var VALUE = 7443
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3721()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7442()
    val b = Number7441()
    return a.fib() + b.fib()
  }

}

class Number7444 : StressfulInteger {

  companion object {
    private var VALUE = 7444
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3722()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7443()
    val b = Number7442()
    return a.fib() + b.fib()
  }

}

class Number7445 : StressfulInteger {

  companion object {
    private var VALUE = 7445
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3722()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7444()
    val b = Number7443()
    return a.fib() + b.fib()
  }

}

class Number7446 : StressfulInteger {

  companion object {
    private var VALUE = 7446
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3723()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7445()
    val b = Number7444()
    return a.fib() + b.fib()
  }

}

class Number7447 : StressfulInteger {

  companion object {
    private var VALUE = 7447
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3723()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7446()
    val b = Number7445()
    return a.fib() + b.fib()
  }

}

class Number7448 : StressfulInteger {

  companion object {
    private var VALUE = 7448
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3724()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7447()
    val b = Number7446()
    return a.fib() + b.fib()
  }

}

class Number7449 : StressfulInteger {

  companion object {
    private var VALUE = 7449
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3724()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7448()
    val b = Number7447()
    return a.fib() + b.fib()
  }

}

class Number7450 : StressfulInteger {

  companion object {
    private var VALUE = 7450
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3725()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7449()
    val b = Number7448()
    return a.fib() + b.fib()
  }

}

class Number7451 : StressfulInteger {

  companion object {
    private var VALUE = 7451
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3725()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7450()
    val b = Number7449()
    return a.fib() + b.fib()
  }

}

class Number7452 : StressfulInteger {

  companion object {
    private var VALUE = 7452
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3726()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7451()
    val b = Number7450()
    return a.fib() + b.fib()
  }

}

class Number7453 : StressfulInteger {

  companion object {
    private var VALUE = 7453
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3726()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7452()
    val b = Number7451()
    return a.fib() + b.fib()
  }

}

class Number7454 : StressfulInteger {

  companion object {
    private var VALUE = 7454
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3727()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7453()
    val b = Number7452()
    return a.fib() + b.fib()
  }

}

class Number7455 : StressfulInteger {

  companion object {
    private var VALUE = 7455
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3727()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7454()
    val b = Number7453()
    return a.fib() + b.fib()
  }

}

class Number7456 : StressfulInteger {

  companion object {
    private var VALUE = 7456
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3728()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7455()
    val b = Number7454()
    return a.fib() + b.fib()
  }

}

class Number7457 : StressfulInteger {

  companion object {
    private var VALUE = 7457
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3728()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7456()
    val b = Number7455()
    return a.fib() + b.fib()
  }

}

class Number7458 : StressfulInteger {

  companion object {
    private var VALUE = 7458
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3729()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7457()
    val b = Number7456()
    return a.fib() + b.fib()
  }

}

class Number7459 : StressfulInteger {

  companion object {
    private var VALUE = 7459
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3729()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7458()
    val b = Number7457()
    return a.fib() + b.fib()
  }

}

class Number7460 : StressfulInteger {

  companion object {
    private var VALUE = 7460
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3730()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7459()
    val b = Number7458()
    return a.fib() + b.fib()
  }

}

class Number7461 : StressfulInteger {

  companion object {
    private var VALUE = 7461
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3730()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7460()
    val b = Number7459()
    return a.fib() + b.fib()
  }

}

class Number7462 : StressfulInteger {

  companion object {
    private var VALUE = 7462
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3731()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7461()
    val b = Number7460()
    return a.fib() + b.fib()
  }

}

class Number7463 : StressfulInteger {

  companion object {
    private var VALUE = 7463
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3731()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7462()
    val b = Number7461()
    return a.fib() + b.fib()
  }

}

class Number7464 : StressfulInteger {

  companion object {
    private var VALUE = 7464
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3732()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7463()
    val b = Number7462()
    return a.fib() + b.fib()
  }

}

class Number7465 : StressfulInteger {

  companion object {
    private var VALUE = 7465
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3732()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7464()
    val b = Number7463()
    return a.fib() + b.fib()
  }

}

class Number7466 : StressfulInteger {

  companion object {
    private var VALUE = 7466
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3733()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7465()
    val b = Number7464()
    return a.fib() + b.fib()
  }

}

class Number7467 : StressfulInteger {

  companion object {
    private var VALUE = 7467
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3733()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7466()
    val b = Number7465()
    return a.fib() + b.fib()
  }

}

class Number7468 : StressfulInteger {

  companion object {
    private var VALUE = 7468
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3734()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7467()
    val b = Number7466()
    return a.fib() + b.fib()
  }

}

class Number7469 : StressfulInteger {

  companion object {
    private var VALUE = 7469
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3734()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7468()
    val b = Number7467()
    return a.fib() + b.fib()
  }

}

class Number7470 : StressfulInteger {

  companion object {
    private var VALUE = 7470
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3735()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7469()
    val b = Number7468()
    return a.fib() + b.fib()
  }

}

class Number7471 : StressfulInteger {

  companion object {
    private var VALUE = 7471
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3735()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7470()
    val b = Number7469()
    return a.fib() + b.fib()
  }

}

class Number7472 : StressfulInteger {

  companion object {
    private var VALUE = 7472
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3736()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7471()
    val b = Number7470()
    return a.fib() + b.fib()
  }

}

class Number7473 : StressfulInteger {

  companion object {
    private var VALUE = 7473
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3736()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7472()
    val b = Number7471()
    return a.fib() + b.fib()
  }

}

class Number7474 : StressfulInteger {

  companion object {
    private var VALUE = 7474
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3737()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7473()
    val b = Number7472()
    return a.fib() + b.fib()
  }

}

class Number7475 : StressfulInteger {

  companion object {
    private var VALUE = 7475
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3737()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7474()
    val b = Number7473()
    return a.fib() + b.fib()
  }

}

class Number7476 : StressfulInteger {

  companion object {
    private var VALUE = 7476
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3738()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7475()
    val b = Number7474()
    return a.fib() + b.fib()
  }

}

class Number7477 : StressfulInteger {

  companion object {
    private var VALUE = 7477
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3738()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7476()
    val b = Number7475()
    return a.fib() + b.fib()
  }

}

class Number7478 : StressfulInteger {

  companion object {
    private var VALUE = 7478
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3739()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7477()
    val b = Number7476()
    return a.fib() + b.fib()
  }

}

class Number7479 : StressfulInteger {

  companion object {
    private var VALUE = 7479
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3739()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7478()
    val b = Number7477()
    return a.fib() + b.fib()
  }

}

class Number7480 : StressfulInteger {

  companion object {
    private var VALUE = 7480
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3740()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7479()
    val b = Number7478()
    return a.fib() + b.fib()
  }

}

class Number7481 : StressfulInteger {

  companion object {
    private var VALUE = 7481
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3740()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7480()
    val b = Number7479()
    return a.fib() + b.fib()
  }

}

class Number7482 : StressfulInteger {

  companion object {
    private var VALUE = 7482
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3741()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7481()
    val b = Number7480()
    return a.fib() + b.fib()
  }

}

class Number7483 : StressfulInteger {

  companion object {
    private var VALUE = 7483
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3741()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7482()
    val b = Number7481()
    return a.fib() + b.fib()
  }

}

class Number7484 : StressfulInteger {

  companion object {
    private var VALUE = 7484
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3742()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7483()
    val b = Number7482()
    return a.fib() + b.fib()
  }

}

class Number7485 : StressfulInteger {

  companion object {
    private var VALUE = 7485
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3742()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7484()
    val b = Number7483()
    return a.fib() + b.fib()
  }

}

class Number7486 : StressfulInteger {

  companion object {
    private var VALUE = 7486
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3743()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7485()
    val b = Number7484()
    return a.fib() + b.fib()
  }

}

class Number7487 : StressfulInteger {

  companion object {
    private var VALUE = 7487
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3743()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7486()
    val b = Number7485()
    return a.fib() + b.fib()
  }

}

class Number7488 : StressfulInteger {

  companion object {
    private var VALUE = 7488
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3744()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7487()
    val b = Number7486()
    return a.fib() + b.fib()
  }

}

class Number7489 : StressfulInteger {

  companion object {
    private var VALUE = 7489
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3744()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7488()
    val b = Number7487()
    return a.fib() + b.fib()
  }

}

class Number7490 : StressfulInteger {

  companion object {
    private var VALUE = 7490
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3745()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7489()
    val b = Number7488()
    return a.fib() + b.fib()
  }

}

class Number7491 : StressfulInteger {

  companion object {
    private var VALUE = 7491
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3745()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7490()
    val b = Number7489()
    return a.fib() + b.fib()
  }

}

class Number7492 : StressfulInteger {

  companion object {
    private var VALUE = 7492
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3746()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7491()
    val b = Number7490()
    return a.fib() + b.fib()
  }

}

class Number7493 : StressfulInteger {

  companion object {
    private var VALUE = 7493
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3746()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7492()
    val b = Number7491()
    return a.fib() + b.fib()
  }

}

class Number7494 : StressfulInteger {

  companion object {
    private var VALUE = 7494
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3747()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7493()
    val b = Number7492()
    return a.fib() + b.fib()
  }

}

class Number7495 : StressfulInteger {

  companion object {
    private var VALUE = 7495
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3747()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7494()
    val b = Number7493()
    return a.fib() + b.fib()
  }

}

class Number7496 : StressfulInteger {

  companion object {
    private var VALUE = 7496
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3748()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7495()
    val b = Number7494()
    return a.fib() + b.fib()
  }

}

class Number7497 : StressfulInteger {

  companion object {
    private var VALUE = 7497
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3748()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7496()
    val b = Number7495()
    return a.fib() + b.fib()
  }

}

class Number7498 : StressfulInteger {

  companion object {
    private var VALUE = 7498
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3749()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7497()
    val b = Number7496()
    return a.fib() + b.fib()
  }

}

class Number7499 : StressfulInteger {

  companion object {
    private var VALUE = 7499
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3749()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7498()
    val b = Number7497()
    return a.fib() + b.fib()
  }

}

class Number7500 : StressfulInteger {

  companion object {
    private var VALUE = 7500
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3750()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7499()
    val b = Number7498()
    return a.fib() + b.fib()
  }

}

class Number7501 : StressfulInteger {

  companion object {
    private var VALUE = 7501
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3750()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7500()
    val b = Number7499()
    return a.fib() + b.fib()
  }

}

class Number7502 : StressfulInteger {

  companion object {
    private var VALUE = 7502
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3751()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7501()
    val b = Number7500()
    return a.fib() + b.fib()
  }

}

class Number7503 : StressfulInteger {

  companion object {
    private var VALUE = 7503
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3751()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7502()
    val b = Number7501()
    return a.fib() + b.fib()
  }

}

class Number7504 : StressfulInteger {

  companion object {
    private var VALUE = 7504
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3752()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7503()
    val b = Number7502()
    return a.fib() + b.fib()
  }

}

class Number7505 : StressfulInteger {

  companion object {
    private var VALUE = 7505
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3752()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7504()
    val b = Number7503()
    return a.fib() + b.fib()
  }

}

class Number7506 : StressfulInteger {

  companion object {
    private var VALUE = 7506
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3753()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7505()
    val b = Number7504()
    return a.fib() + b.fib()
  }

}

class Number7507 : StressfulInteger {

  companion object {
    private var VALUE = 7507
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3753()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7506()
    val b = Number7505()
    return a.fib() + b.fib()
  }

}

class Number7508 : StressfulInteger {

  companion object {
    private var VALUE = 7508
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3754()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7507()
    val b = Number7506()
    return a.fib() + b.fib()
  }

}

class Number7509 : StressfulInteger {

  companion object {
    private var VALUE = 7509
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3754()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7508()
    val b = Number7507()
    return a.fib() + b.fib()
  }

}

class Number7510 : StressfulInteger {

  companion object {
    private var VALUE = 7510
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3755()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7509()
    val b = Number7508()
    return a.fib() + b.fib()
  }

}

class Number7511 : StressfulInteger {

  companion object {
    private var VALUE = 7511
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3755()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7510()
    val b = Number7509()
    return a.fib() + b.fib()
  }

}

class Number7512 : StressfulInteger {

  companion object {
    private var VALUE = 7512
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3756()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7511()
    val b = Number7510()
    return a.fib() + b.fib()
  }

}

class Number7513 : StressfulInteger {

  companion object {
    private var VALUE = 7513
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3756()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7512()
    val b = Number7511()
    return a.fib() + b.fib()
  }

}

class Number7514 : StressfulInteger {

  companion object {
    private var VALUE = 7514
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3757()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7513()
    val b = Number7512()
    return a.fib() + b.fib()
  }

}

class Number7515 : StressfulInteger {

  companion object {
    private var VALUE = 7515
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3757()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7514()
    val b = Number7513()
    return a.fib() + b.fib()
  }

}

class Number7516 : StressfulInteger {

  companion object {
    private var VALUE = 7516
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3758()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7515()
    val b = Number7514()
    return a.fib() + b.fib()
  }

}

class Number7517 : StressfulInteger {

  companion object {
    private var VALUE = 7517
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3758()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7516()
    val b = Number7515()
    return a.fib() + b.fib()
  }

}

class Number7518 : StressfulInteger {

  companion object {
    private var VALUE = 7518
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3759()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7517()
    val b = Number7516()
    return a.fib() + b.fib()
  }

}

class Number7519 : StressfulInteger {

  companion object {
    private var VALUE = 7519
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3759()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7518()
    val b = Number7517()
    return a.fib() + b.fib()
  }

}

class Number7520 : StressfulInteger {

  companion object {
    private var VALUE = 7520
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3760()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7519()
    val b = Number7518()
    return a.fib() + b.fib()
  }

}

class Number7521 : StressfulInteger {

  companion object {
    private var VALUE = 7521
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3760()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7520()
    val b = Number7519()
    return a.fib() + b.fib()
  }

}

class Number7522 : StressfulInteger {

  companion object {
    private var VALUE = 7522
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3761()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7521()
    val b = Number7520()
    return a.fib() + b.fib()
  }

}

class Number7523 : StressfulInteger {

  companion object {
    private var VALUE = 7523
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3761()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7522()
    val b = Number7521()
    return a.fib() + b.fib()
  }

}

class Number7524 : StressfulInteger {

  companion object {
    private var VALUE = 7524
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3762()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7523()
    val b = Number7522()
    return a.fib() + b.fib()
  }

}

class Number7525 : StressfulInteger {

  companion object {
    private var VALUE = 7525
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3762()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7524()
    val b = Number7523()
    return a.fib() + b.fib()
  }

}

class Number7526 : StressfulInteger {

  companion object {
    private var VALUE = 7526
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3763()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7525()
    val b = Number7524()
    return a.fib() + b.fib()
  }

}

class Number7527 : StressfulInteger {

  companion object {
    private var VALUE = 7527
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3763()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7526()
    val b = Number7525()
    return a.fib() + b.fib()
  }

}

class Number7528 : StressfulInteger {

  companion object {
    private var VALUE = 7528
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3764()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7527()
    val b = Number7526()
    return a.fib() + b.fib()
  }

}

class Number7529 : StressfulInteger {

  companion object {
    private var VALUE = 7529
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3764()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7528()
    val b = Number7527()
    return a.fib() + b.fib()
  }

}

class Number7530 : StressfulInteger {

  companion object {
    private var VALUE = 7530
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3765()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7529()
    val b = Number7528()
    return a.fib() + b.fib()
  }

}

class Number7531 : StressfulInteger {

  companion object {
    private var VALUE = 7531
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3765()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7530()
    val b = Number7529()
    return a.fib() + b.fib()
  }

}

class Number7532 : StressfulInteger {

  companion object {
    private var VALUE = 7532
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3766()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7531()
    val b = Number7530()
    return a.fib() + b.fib()
  }

}

class Number7533 : StressfulInteger {

  companion object {
    private var VALUE = 7533
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3766()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7532()
    val b = Number7531()
    return a.fib() + b.fib()
  }

}

class Number7534 : StressfulInteger {

  companion object {
    private var VALUE = 7534
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3767()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7533()
    val b = Number7532()
    return a.fib() + b.fib()
  }

}

class Number7535 : StressfulInteger {

  companion object {
    private var VALUE = 7535
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3767()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7534()
    val b = Number7533()
    return a.fib() + b.fib()
  }

}

class Number7536 : StressfulInteger {

  companion object {
    private var VALUE = 7536
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3768()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7535()
    val b = Number7534()
    return a.fib() + b.fib()
  }

}

class Number7537 : StressfulInteger {

  companion object {
    private var VALUE = 7537
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3768()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7536()
    val b = Number7535()
    return a.fib() + b.fib()
  }

}

class Number7538 : StressfulInteger {

  companion object {
    private var VALUE = 7538
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3769()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7537()
    val b = Number7536()
    return a.fib() + b.fib()
  }

}

class Number7539 : StressfulInteger {

  companion object {
    private var VALUE = 7539
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3769()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7538()
    val b = Number7537()
    return a.fib() + b.fib()
  }

}

class Number7540 : StressfulInteger {

  companion object {
    private var VALUE = 7540
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3770()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7539()
    val b = Number7538()
    return a.fib() + b.fib()
  }

}

class Number7541 : StressfulInteger {

  companion object {
    private var VALUE = 7541
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3770()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7540()
    val b = Number7539()
    return a.fib() + b.fib()
  }

}

class Number7542 : StressfulInteger {

  companion object {
    private var VALUE = 7542
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3771()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7541()
    val b = Number7540()
    return a.fib() + b.fib()
  }

}

class Number7543 : StressfulInteger {

  companion object {
    private var VALUE = 7543
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3771()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7542()
    val b = Number7541()
    return a.fib() + b.fib()
  }

}

class Number7544 : StressfulInteger {

  companion object {
    private var VALUE = 7544
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3772()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7543()
    val b = Number7542()
    return a.fib() + b.fib()
  }

}

class Number7545 : StressfulInteger {

  companion object {
    private var VALUE = 7545
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3772()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7544()
    val b = Number7543()
    return a.fib() + b.fib()
  }

}

class Number7546 : StressfulInteger {

  companion object {
    private var VALUE = 7546
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3773()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7545()
    val b = Number7544()
    return a.fib() + b.fib()
  }

}

class Number7547 : StressfulInteger {

  companion object {
    private var VALUE = 7547
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3773()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7546()
    val b = Number7545()
    return a.fib() + b.fib()
  }

}

class Number7548 : StressfulInteger {

  companion object {
    private var VALUE = 7548
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3774()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7547()
    val b = Number7546()
    return a.fib() + b.fib()
  }

}

class Number7549 : StressfulInteger {

  companion object {
    private var VALUE = 7549
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3774()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7548()
    val b = Number7547()
    return a.fib() + b.fib()
  }

}

class Number7550 : StressfulInteger {

  companion object {
    private var VALUE = 7550
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3775()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7549()
    val b = Number7548()
    return a.fib() + b.fib()
  }

}

class Number7551 : StressfulInteger {

  companion object {
    private var VALUE = 7551
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3775()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7550()
    val b = Number7549()
    return a.fib() + b.fib()
  }

}

class Number7552 : StressfulInteger {

  companion object {
    private var VALUE = 7552
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3776()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7551()
    val b = Number7550()
    return a.fib() + b.fib()
  }

}

class Number7553 : StressfulInteger {

  companion object {
    private var VALUE = 7553
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3776()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7552()
    val b = Number7551()
    return a.fib() + b.fib()
  }

}

class Number7554 : StressfulInteger {

  companion object {
    private var VALUE = 7554
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3777()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7553()
    val b = Number7552()
    return a.fib() + b.fib()
  }

}

class Number7555 : StressfulInteger {

  companion object {
    private var VALUE = 7555
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3777()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7554()
    val b = Number7553()
    return a.fib() + b.fib()
  }

}

class Number7556 : StressfulInteger {

  companion object {
    private var VALUE = 7556
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3778()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7555()
    val b = Number7554()
    return a.fib() + b.fib()
  }

}

class Number7557 : StressfulInteger {

  companion object {
    private var VALUE = 7557
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3778()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7556()
    val b = Number7555()
    return a.fib() + b.fib()
  }

}

class Number7558 : StressfulInteger {

  companion object {
    private var VALUE = 7558
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3779()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7557()
    val b = Number7556()
    return a.fib() + b.fib()
  }

}

class Number7559 : StressfulInteger {

  companion object {
    private var VALUE = 7559
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3779()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7558()
    val b = Number7557()
    return a.fib() + b.fib()
  }

}

class Number7560 : StressfulInteger {

  companion object {
    private var VALUE = 7560
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3780()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7559()
    val b = Number7558()
    return a.fib() + b.fib()
  }

}

class Number7561 : StressfulInteger {

  companion object {
    private var VALUE = 7561
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3780()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7560()
    val b = Number7559()
    return a.fib() + b.fib()
  }

}

class Number7562 : StressfulInteger {

  companion object {
    private var VALUE = 7562
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3781()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7561()
    val b = Number7560()
    return a.fib() + b.fib()
  }

}

class Number7563 : StressfulInteger {

  companion object {
    private var VALUE = 7563
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3781()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7562()
    val b = Number7561()
    return a.fib() + b.fib()
  }

}

class Number7564 : StressfulInteger {

  companion object {
    private var VALUE = 7564
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3782()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7563()
    val b = Number7562()
    return a.fib() + b.fib()
  }

}

class Number7565 : StressfulInteger {

  companion object {
    private var VALUE = 7565
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3782()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7564()
    val b = Number7563()
    return a.fib() + b.fib()
  }

}

class Number7566 : StressfulInteger {

  companion object {
    private var VALUE = 7566
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3783()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7565()
    val b = Number7564()
    return a.fib() + b.fib()
  }

}

class Number7567 : StressfulInteger {

  companion object {
    private var VALUE = 7567
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3783()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7566()
    val b = Number7565()
    return a.fib() + b.fib()
  }

}

class Number7568 : StressfulInteger {

  companion object {
    private var VALUE = 7568
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3784()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7567()
    val b = Number7566()
    return a.fib() + b.fib()
  }

}

class Number7569 : StressfulInteger {

  companion object {
    private var VALUE = 7569
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3784()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7568()
    val b = Number7567()
    return a.fib() + b.fib()
  }

}

class Number7570 : StressfulInteger {

  companion object {
    private var VALUE = 7570
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3785()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7569()
    val b = Number7568()
    return a.fib() + b.fib()
  }

}

class Number7571 : StressfulInteger {

  companion object {
    private var VALUE = 7571
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3785()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7570()
    val b = Number7569()
    return a.fib() + b.fib()
  }

}

class Number7572 : StressfulInteger {

  companion object {
    private var VALUE = 7572
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3786()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7571()
    val b = Number7570()
    return a.fib() + b.fib()
  }

}

class Number7573 : StressfulInteger {

  companion object {
    private var VALUE = 7573
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3786()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7572()
    val b = Number7571()
    return a.fib() + b.fib()
  }

}

class Number7574 : StressfulInteger {

  companion object {
    private var VALUE = 7574
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3787()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7573()
    val b = Number7572()
    return a.fib() + b.fib()
  }

}

class Number7575 : StressfulInteger {

  companion object {
    private var VALUE = 7575
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3787()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7574()
    val b = Number7573()
    return a.fib() + b.fib()
  }

}

class Number7576 : StressfulInteger {

  companion object {
    private var VALUE = 7576
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3788()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7575()
    val b = Number7574()
    return a.fib() + b.fib()
  }

}

class Number7577 : StressfulInteger {

  companion object {
    private var VALUE = 7577
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3788()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7576()
    val b = Number7575()
    return a.fib() + b.fib()
  }

}

class Number7578 : StressfulInteger {

  companion object {
    private var VALUE = 7578
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3789()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7577()
    val b = Number7576()
    return a.fib() + b.fib()
  }

}

class Number7579 : StressfulInteger {

  companion object {
    private var VALUE = 7579
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3789()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7578()
    val b = Number7577()
    return a.fib() + b.fib()
  }

}

class Number7580 : StressfulInteger {

  companion object {
    private var VALUE = 7580
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3790()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7579()
    val b = Number7578()
    return a.fib() + b.fib()
  }

}

class Number7581 : StressfulInteger {

  companion object {
    private var VALUE = 7581
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3790()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7580()
    val b = Number7579()
    return a.fib() + b.fib()
  }

}

class Number7582 : StressfulInteger {

  companion object {
    private var VALUE = 7582
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3791()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7581()
    val b = Number7580()
    return a.fib() + b.fib()
  }

}

class Number7583 : StressfulInteger {

  companion object {
    private var VALUE = 7583
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3791()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7582()
    val b = Number7581()
    return a.fib() + b.fib()
  }

}

class Number7584 : StressfulInteger {

  companion object {
    private var VALUE = 7584
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3792()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7583()
    val b = Number7582()
    return a.fib() + b.fib()
  }

}

class Number7585 : StressfulInteger {

  companion object {
    private var VALUE = 7585
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3792()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7584()
    val b = Number7583()
    return a.fib() + b.fib()
  }

}

class Number7586 : StressfulInteger {

  companion object {
    private var VALUE = 7586
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3793()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7585()
    val b = Number7584()
    return a.fib() + b.fib()
  }

}

class Number7587 : StressfulInteger {

  companion object {
    private var VALUE = 7587
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3793()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7586()
    val b = Number7585()
    return a.fib() + b.fib()
  }

}

class Number7588 : StressfulInteger {

  companion object {
    private var VALUE = 7588
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3794()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7587()
    val b = Number7586()
    return a.fib() + b.fib()
  }

}

class Number7589 : StressfulInteger {

  companion object {
    private var VALUE = 7589
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3794()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7588()
    val b = Number7587()
    return a.fib() + b.fib()
  }

}

class Number7590 : StressfulInteger {

  companion object {
    private var VALUE = 7590
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3795()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7589()
    val b = Number7588()
    return a.fib() + b.fib()
  }

}

class Number7591 : StressfulInteger {

  companion object {
    private var VALUE = 7591
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3795()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7590()
    val b = Number7589()
    return a.fib() + b.fib()
  }

}

class Number7592 : StressfulInteger {

  companion object {
    private var VALUE = 7592
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3796()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7591()
    val b = Number7590()
    return a.fib() + b.fib()
  }

}

class Number7593 : StressfulInteger {

  companion object {
    private var VALUE = 7593
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3796()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7592()
    val b = Number7591()
    return a.fib() + b.fib()
  }

}

class Number7594 : StressfulInteger {

  companion object {
    private var VALUE = 7594
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3797()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7593()
    val b = Number7592()
    return a.fib() + b.fib()
  }

}

class Number7595 : StressfulInteger {

  companion object {
    private var VALUE = 7595
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3797()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7594()
    val b = Number7593()
    return a.fib() + b.fib()
  }

}

class Number7596 : StressfulInteger {

  companion object {
    private var VALUE = 7596
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3798()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7595()
    val b = Number7594()
    return a.fib() + b.fib()
  }

}

class Number7597 : StressfulInteger {

  companion object {
    private var VALUE = 7597
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3798()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7596()
    val b = Number7595()
    return a.fib() + b.fib()
  }

}

class Number7598 : StressfulInteger {

  companion object {
    private var VALUE = 7598
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3799()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7597()
    val b = Number7596()
    return a.fib() + b.fib()
  }

}

class Number7599 : StressfulInteger {

  companion object {
    private var VALUE = 7599
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3799()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7598()
    val b = Number7597()
    return a.fib() + b.fib()
  }

}

class Number7600 : StressfulInteger {

  companion object {
    private var VALUE = 7600
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3800()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7599()
    val b = Number7598()
    return a.fib() + b.fib()
  }

}

class Number7601 : StressfulInteger {

  companion object {
    private var VALUE = 7601
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3800()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7600()
    val b = Number7599()
    return a.fib() + b.fib()
  }

}

class Number7602 : StressfulInteger {

  companion object {
    private var VALUE = 7602
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3801()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7601()
    val b = Number7600()
    return a.fib() + b.fib()
  }

}

class Number7603 : StressfulInteger {

  companion object {
    private var VALUE = 7603
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3801()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7602()
    val b = Number7601()
    return a.fib() + b.fib()
  }

}

class Number7604 : StressfulInteger {

  companion object {
    private var VALUE = 7604
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3802()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7603()
    val b = Number7602()
    return a.fib() + b.fib()
  }

}

class Number7605 : StressfulInteger {

  companion object {
    private var VALUE = 7605
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3802()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7604()
    val b = Number7603()
    return a.fib() + b.fib()
  }

}

class Number7606 : StressfulInteger {

  companion object {
    private var VALUE = 7606
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3803()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7605()
    val b = Number7604()
    return a.fib() + b.fib()
  }

}

class Number7607 : StressfulInteger {

  companion object {
    private var VALUE = 7607
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3803()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7606()
    val b = Number7605()
    return a.fib() + b.fib()
  }

}

class Number7608 : StressfulInteger {

  companion object {
    private var VALUE = 7608
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3804()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7607()
    val b = Number7606()
    return a.fib() + b.fib()
  }

}

class Number7609 : StressfulInteger {

  companion object {
    private var VALUE = 7609
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3804()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7608()
    val b = Number7607()
    return a.fib() + b.fib()
  }

}

class Number7610 : StressfulInteger {

  companion object {
    private var VALUE = 7610
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3805()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7609()
    val b = Number7608()
    return a.fib() + b.fib()
  }

}

class Number7611 : StressfulInteger {

  companion object {
    private var VALUE = 7611
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3805()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7610()
    val b = Number7609()
    return a.fib() + b.fib()
  }

}

class Number7612 : StressfulInteger {

  companion object {
    private var VALUE = 7612
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3806()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7611()
    val b = Number7610()
    return a.fib() + b.fib()
  }

}

class Number7613 : StressfulInteger {

  companion object {
    private var VALUE = 7613
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3806()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7612()
    val b = Number7611()
    return a.fib() + b.fib()
  }

}

class Number7614 : StressfulInteger {

  companion object {
    private var VALUE = 7614
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3807()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7613()
    val b = Number7612()
    return a.fib() + b.fib()
  }

}

class Number7615 : StressfulInteger {

  companion object {
    private var VALUE = 7615
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3807()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7614()
    val b = Number7613()
    return a.fib() + b.fib()
  }

}

class Number7616 : StressfulInteger {

  companion object {
    private var VALUE = 7616
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3808()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7615()
    val b = Number7614()
    return a.fib() + b.fib()
  }

}

class Number7617 : StressfulInteger {

  companion object {
    private var VALUE = 7617
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3808()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7616()
    val b = Number7615()
    return a.fib() + b.fib()
  }

}

class Number7618 : StressfulInteger {

  companion object {
    private var VALUE = 7618
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3809()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7617()
    val b = Number7616()
    return a.fib() + b.fib()
  }

}

class Number7619 : StressfulInteger {

  companion object {
    private var VALUE = 7619
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3809()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7618()
    val b = Number7617()
    return a.fib() + b.fib()
  }

}

class Number7620 : StressfulInteger {

  companion object {
    private var VALUE = 7620
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3810()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7619()
    val b = Number7618()
    return a.fib() + b.fib()
  }

}

class Number7621 : StressfulInteger {

  companion object {
    private var VALUE = 7621
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3810()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7620()
    val b = Number7619()
    return a.fib() + b.fib()
  }

}

class Number7622 : StressfulInteger {

  companion object {
    private var VALUE = 7622
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3811()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7621()
    val b = Number7620()
    return a.fib() + b.fib()
  }

}

class Number7623 : StressfulInteger {

  companion object {
    private var VALUE = 7623
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3811()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7622()
    val b = Number7621()
    return a.fib() + b.fib()
  }

}

class Number7624 : StressfulInteger {

  companion object {
    private var VALUE = 7624
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3812()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7623()
    val b = Number7622()
    return a.fib() + b.fib()
  }

}

class Number7625 : StressfulInteger {

  companion object {
    private var VALUE = 7625
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3812()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7624()
    val b = Number7623()
    return a.fib() + b.fib()
  }

}

class Number7626 : StressfulInteger {

  companion object {
    private var VALUE = 7626
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3813()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7625()
    val b = Number7624()
    return a.fib() + b.fib()
  }

}

class Number7627 : StressfulInteger {

  companion object {
    private var VALUE = 7627
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3813()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7626()
    val b = Number7625()
    return a.fib() + b.fib()
  }

}

class Number7628 : StressfulInteger {

  companion object {
    private var VALUE = 7628
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3814()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7627()
    val b = Number7626()
    return a.fib() + b.fib()
  }

}

class Number7629 : StressfulInteger {

  companion object {
    private var VALUE = 7629
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3814()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7628()
    val b = Number7627()
    return a.fib() + b.fib()
  }

}

class Number7630 : StressfulInteger {

  companion object {
    private var VALUE = 7630
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3815()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7629()
    val b = Number7628()
    return a.fib() + b.fib()
  }

}

class Number7631 : StressfulInteger {

  companion object {
    private var VALUE = 7631
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3815()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7630()
    val b = Number7629()
    return a.fib() + b.fib()
  }

}

class Number7632 : StressfulInteger {

  companion object {
    private var VALUE = 7632
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3816()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7631()
    val b = Number7630()
    return a.fib() + b.fib()
  }

}

class Number7633 : StressfulInteger {

  companion object {
    private var VALUE = 7633
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3816()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7632()
    val b = Number7631()
    return a.fib() + b.fib()
  }

}

class Number7634 : StressfulInteger {

  companion object {
    private var VALUE = 7634
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3817()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7633()
    val b = Number7632()
    return a.fib() + b.fib()
  }

}

class Number7635 : StressfulInteger {

  companion object {
    private var VALUE = 7635
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3817()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7634()
    val b = Number7633()
    return a.fib() + b.fib()
  }

}

class Number7636 : StressfulInteger {

  companion object {
    private var VALUE = 7636
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3818()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7635()
    val b = Number7634()
    return a.fib() + b.fib()
  }

}

class Number7637 : StressfulInteger {

  companion object {
    private var VALUE = 7637
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3818()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7636()
    val b = Number7635()
    return a.fib() + b.fib()
  }

}

class Number7638 : StressfulInteger {

  companion object {
    private var VALUE = 7638
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3819()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7637()
    val b = Number7636()
    return a.fib() + b.fib()
  }

}

class Number7639 : StressfulInteger {

  companion object {
    private var VALUE = 7639
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3819()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7638()
    val b = Number7637()
    return a.fib() + b.fib()
  }

}

class Number7640 : StressfulInteger {

  companion object {
    private var VALUE = 7640
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3820()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7639()
    val b = Number7638()
    return a.fib() + b.fib()
  }

}

class Number7641 : StressfulInteger {

  companion object {
    private var VALUE = 7641
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3820()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7640()
    val b = Number7639()
    return a.fib() + b.fib()
  }

}

class Number7642 : StressfulInteger {

  companion object {
    private var VALUE = 7642
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3821()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7641()
    val b = Number7640()
    return a.fib() + b.fib()
  }

}

class Number7643 : StressfulInteger {

  companion object {
    private var VALUE = 7643
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3821()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7642()
    val b = Number7641()
    return a.fib() + b.fib()
  }

}

class Number7644 : StressfulInteger {

  companion object {
    private var VALUE = 7644
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3822()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7643()
    val b = Number7642()
    return a.fib() + b.fib()
  }

}

class Number7645 : StressfulInteger {

  companion object {
    private var VALUE = 7645
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3822()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7644()
    val b = Number7643()
    return a.fib() + b.fib()
  }

}

class Number7646 : StressfulInteger {

  companion object {
    private var VALUE = 7646
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3823()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7645()
    val b = Number7644()
    return a.fib() + b.fib()
  }

}

class Number7647 : StressfulInteger {

  companion object {
    private var VALUE = 7647
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3823()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7646()
    val b = Number7645()
    return a.fib() + b.fib()
  }

}

class Number7648 : StressfulInteger {

  companion object {
    private var VALUE = 7648
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3824()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7647()
    val b = Number7646()
    return a.fib() + b.fib()
  }

}

class Number7649 : StressfulInteger {

  companion object {
    private var VALUE = 7649
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3824()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7648()
    val b = Number7647()
    return a.fib() + b.fib()
  }

}

class Number7650 : StressfulInteger {

  companion object {
    private var VALUE = 7650
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3825()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7649()
    val b = Number7648()
    return a.fib() + b.fib()
  }

}

class Number7651 : StressfulInteger {

  companion object {
    private var VALUE = 7651
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3825()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7650()
    val b = Number7649()
    return a.fib() + b.fib()
  }

}

class Number7652 : StressfulInteger {

  companion object {
    private var VALUE = 7652
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3826()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7651()
    val b = Number7650()
    return a.fib() + b.fib()
  }

}

class Number7653 : StressfulInteger {

  companion object {
    private var VALUE = 7653
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3826()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7652()
    val b = Number7651()
    return a.fib() + b.fib()
  }

}

class Number7654 : StressfulInteger {

  companion object {
    private var VALUE = 7654
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3827()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7653()
    val b = Number7652()
    return a.fib() + b.fib()
  }

}

class Number7655 : StressfulInteger {

  companion object {
    private var VALUE = 7655
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3827()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7654()
    val b = Number7653()
    return a.fib() + b.fib()
  }

}

class Number7656 : StressfulInteger {

  companion object {
    private var VALUE = 7656
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3828()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7655()
    val b = Number7654()
    return a.fib() + b.fib()
  }

}

class Number7657 : StressfulInteger {

  companion object {
    private var VALUE = 7657
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3828()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7656()
    val b = Number7655()
    return a.fib() + b.fib()
  }

}

class Number7658 : StressfulInteger {

  companion object {
    private var VALUE = 7658
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3829()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7657()
    val b = Number7656()
    return a.fib() + b.fib()
  }

}

class Number7659 : StressfulInteger {

  companion object {
    private var VALUE = 7659
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3829()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7658()
    val b = Number7657()
    return a.fib() + b.fib()
  }

}

class Number7660 : StressfulInteger {

  companion object {
    private var VALUE = 7660
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3830()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7659()
    val b = Number7658()
    return a.fib() + b.fib()
  }

}

class Number7661 : StressfulInteger {

  companion object {
    private var VALUE = 7661
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3830()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7660()
    val b = Number7659()
    return a.fib() + b.fib()
  }

}

class Number7662 : StressfulInteger {

  companion object {
    private var VALUE = 7662
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3831()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7661()
    val b = Number7660()
    return a.fib() + b.fib()
  }

}

class Number7663 : StressfulInteger {

  companion object {
    private var VALUE = 7663
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3831()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7662()
    val b = Number7661()
    return a.fib() + b.fib()
  }

}

class Number7664 : StressfulInteger {

  companion object {
    private var VALUE = 7664
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3832()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7663()
    val b = Number7662()
    return a.fib() + b.fib()
  }

}

class Number7665 : StressfulInteger {

  companion object {
    private var VALUE = 7665
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3832()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7664()
    val b = Number7663()
    return a.fib() + b.fib()
  }

}

class Number7666 : StressfulInteger {

  companion object {
    private var VALUE = 7666
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3833()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7665()
    val b = Number7664()
    return a.fib() + b.fib()
  }

}

class Number7667 : StressfulInteger {

  companion object {
    private var VALUE = 7667
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3833()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7666()
    val b = Number7665()
    return a.fib() + b.fib()
  }

}

class Number7668 : StressfulInteger {

  companion object {
    private var VALUE = 7668
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3834()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7667()
    val b = Number7666()
    return a.fib() + b.fib()
  }

}

class Number7669 : StressfulInteger {

  companion object {
    private var VALUE = 7669
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3834()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7668()
    val b = Number7667()
    return a.fib() + b.fib()
  }

}

class Number7670 : StressfulInteger {

  companion object {
    private var VALUE = 7670
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3835()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7669()
    val b = Number7668()
    return a.fib() + b.fib()
  }

}

class Number7671 : StressfulInteger {

  companion object {
    private var VALUE = 7671
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3835()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7670()
    val b = Number7669()
    return a.fib() + b.fib()
  }

}

class Number7672 : StressfulInteger {

  companion object {
    private var VALUE = 7672
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3836()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7671()
    val b = Number7670()
    return a.fib() + b.fib()
  }

}

class Number7673 : StressfulInteger {

  companion object {
    private var VALUE = 7673
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3836()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7672()
    val b = Number7671()
    return a.fib() + b.fib()
  }

}

class Number7674 : StressfulInteger {

  companion object {
    private var VALUE = 7674
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3837()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7673()
    val b = Number7672()
    return a.fib() + b.fib()
  }

}

class Number7675 : StressfulInteger {

  companion object {
    private var VALUE = 7675
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3837()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7674()
    val b = Number7673()
    return a.fib() + b.fib()
  }

}

class Number7676 : StressfulInteger {

  companion object {
    private var VALUE = 7676
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3838()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7675()
    val b = Number7674()
    return a.fib() + b.fib()
  }

}

class Number7677 : StressfulInteger {

  companion object {
    private var VALUE = 7677
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3838()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7676()
    val b = Number7675()
    return a.fib() + b.fib()
  }

}

class Number7678 : StressfulInteger {

  companion object {
    private var VALUE = 7678
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3839()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7677()
    val b = Number7676()
    return a.fib() + b.fib()
  }

}

class Number7679 : StressfulInteger {

  companion object {
    private var VALUE = 7679
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3839()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7678()
    val b = Number7677()
    return a.fib() + b.fib()
  }

}

class Number7680 : StressfulInteger {

  companion object {
    private var VALUE = 7680
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3840()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7679()
    val b = Number7678()
    return a.fib() + b.fib()
  }

}

class Number7681 : StressfulInteger {

  companion object {
    private var VALUE = 7681
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3840()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7680()
    val b = Number7679()
    return a.fib() + b.fib()
  }

}

class Number7682 : StressfulInteger {

  companion object {
    private var VALUE = 7682
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3841()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7681()
    val b = Number7680()
    return a.fib() + b.fib()
  }

}

class Number7683 : StressfulInteger {

  companion object {
    private var VALUE = 7683
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3841()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7682()
    val b = Number7681()
    return a.fib() + b.fib()
  }

}

class Number7684 : StressfulInteger {

  companion object {
    private var VALUE = 7684
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3842()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7683()
    val b = Number7682()
    return a.fib() + b.fib()
  }

}

class Number7685 : StressfulInteger {

  companion object {
    private var VALUE = 7685
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3842()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7684()
    val b = Number7683()
    return a.fib() + b.fib()
  }

}

class Number7686 : StressfulInteger {

  companion object {
    private var VALUE = 7686
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3843()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7685()
    val b = Number7684()
    return a.fib() + b.fib()
  }

}

class Number7687 : StressfulInteger {

  companion object {
    private var VALUE = 7687
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3843()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7686()
    val b = Number7685()
    return a.fib() + b.fib()
  }

}

class Number7688 : StressfulInteger {

  companion object {
    private var VALUE = 7688
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3844()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7687()
    val b = Number7686()
    return a.fib() + b.fib()
  }

}

class Number7689 : StressfulInteger {

  companion object {
    private var VALUE = 7689
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3844()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7688()
    val b = Number7687()
    return a.fib() + b.fib()
  }

}

class Number7690 : StressfulInteger {

  companion object {
    private var VALUE = 7690
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3845()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7689()
    val b = Number7688()
    return a.fib() + b.fib()
  }

}

class Number7691 : StressfulInteger {

  companion object {
    private var VALUE = 7691
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3845()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7690()
    val b = Number7689()
    return a.fib() + b.fib()
  }

}

class Number7692 : StressfulInteger {

  companion object {
    private var VALUE = 7692
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3846()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7691()
    val b = Number7690()
    return a.fib() + b.fib()
  }

}

class Number7693 : StressfulInteger {

  companion object {
    private var VALUE = 7693
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3846()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7692()
    val b = Number7691()
    return a.fib() + b.fib()
  }

}

class Number7694 : StressfulInteger {

  companion object {
    private var VALUE = 7694
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3847()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7693()
    val b = Number7692()
    return a.fib() + b.fib()
  }

}

class Number7695 : StressfulInteger {

  companion object {
    private var VALUE = 7695
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3847()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7694()
    val b = Number7693()
    return a.fib() + b.fib()
  }

}

class Number7696 : StressfulInteger {

  companion object {
    private var VALUE = 7696
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3848()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7695()
    val b = Number7694()
    return a.fib() + b.fib()
  }

}

class Number7697 : StressfulInteger {

  companion object {
    private var VALUE = 7697
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3848()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7696()
    val b = Number7695()
    return a.fib() + b.fib()
  }

}

class Number7698 : StressfulInteger {

  companion object {
    private var VALUE = 7698
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3849()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7697()
    val b = Number7696()
    return a.fib() + b.fib()
  }

}

class Number7699 : StressfulInteger {

  companion object {
    private var VALUE = 7699
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3849()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7698()
    val b = Number7697()
    return a.fib() + b.fib()
  }

}

class Number7700 : StressfulInteger {

  companion object {
    private var VALUE = 7700
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3850()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7699()
    val b = Number7698()
    return a.fib() + b.fib()
  }

}

class Number7701 : StressfulInteger {

  companion object {
    private var VALUE = 7701
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3850()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7700()
    val b = Number7699()
    return a.fib() + b.fib()
  }

}

class Number7702 : StressfulInteger {

  companion object {
    private var VALUE = 7702
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3851()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7701()
    val b = Number7700()
    return a.fib() + b.fib()
  }

}

class Number7703 : StressfulInteger {

  companion object {
    private var VALUE = 7703
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3851()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7702()
    val b = Number7701()
    return a.fib() + b.fib()
  }

}

class Number7704 : StressfulInteger {

  companion object {
    private var VALUE = 7704
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3852()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7703()
    val b = Number7702()
    return a.fib() + b.fib()
  }

}

class Number7705 : StressfulInteger {

  companion object {
    private var VALUE = 7705
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3852()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7704()
    val b = Number7703()
    return a.fib() + b.fib()
  }

}

class Number7706 : StressfulInteger {

  companion object {
    private var VALUE = 7706
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3853()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7705()
    val b = Number7704()
    return a.fib() + b.fib()
  }

}

class Number7707 : StressfulInteger {

  companion object {
    private var VALUE = 7707
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3853()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7706()
    val b = Number7705()
    return a.fib() + b.fib()
  }

}

class Number7708 : StressfulInteger {

  companion object {
    private var VALUE = 7708
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3854()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7707()
    val b = Number7706()
    return a.fib() + b.fib()
  }

}

class Number7709 : StressfulInteger {

  companion object {
    private var VALUE = 7709
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3854()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7708()
    val b = Number7707()
    return a.fib() + b.fib()
  }

}

class Number7710 : StressfulInteger {

  companion object {
    private var VALUE = 7710
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3855()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7709()
    val b = Number7708()
    return a.fib() + b.fib()
  }

}

class Number7711 : StressfulInteger {

  companion object {
    private var VALUE = 7711
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3855()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7710()
    val b = Number7709()
    return a.fib() + b.fib()
  }

}

class Number7712 : StressfulInteger {

  companion object {
    private var VALUE = 7712
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3856()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7711()
    val b = Number7710()
    return a.fib() + b.fib()
  }

}

class Number7713 : StressfulInteger {

  companion object {
    private var VALUE = 7713
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3856()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7712()
    val b = Number7711()
    return a.fib() + b.fib()
  }

}

class Number7714 : StressfulInteger {

  companion object {
    private var VALUE = 7714
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3857()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7713()
    val b = Number7712()
    return a.fib() + b.fib()
  }

}

class Number7715 : StressfulInteger {

  companion object {
    private var VALUE = 7715
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3857()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7714()
    val b = Number7713()
    return a.fib() + b.fib()
  }

}

class Number7716 : StressfulInteger {

  companion object {
    private var VALUE = 7716
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3858()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7715()
    val b = Number7714()
    return a.fib() + b.fib()
  }

}

class Number7717 : StressfulInteger {

  companion object {
    private var VALUE = 7717
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3858()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7716()
    val b = Number7715()
    return a.fib() + b.fib()
  }

}

class Number7718 : StressfulInteger {

  companion object {
    private var VALUE = 7718
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3859()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7717()
    val b = Number7716()
    return a.fib() + b.fib()
  }

}

class Number7719 : StressfulInteger {

  companion object {
    private var VALUE = 7719
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3859()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7718()
    val b = Number7717()
    return a.fib() + b.fib()
  }

}

class Number7720 : StressfulInteger {

  companion object {
    private var VALUE = 7720
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3860()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7719()
    val b = Number7718()
    return a.fib() + b.fib()
  }

}

class Number7721 : StressfulInteger {

  companion object {
    private var VALUE = 7721
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3860()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7720()
    val b = Number7719()
    return a.fib() + b.fib()
  }

}

class Number7722 : StressfulInteger {

  companion object {
    private var VALUE = 7722
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3861()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7721()
    val b = Number7720()
    return a.fib() + b.fib()
  }

}

class Number7723 : StressfulInteger {

  companion object {
    private var VALUE = 7723
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3861()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7722()
    val b = Number7721()
    return a.fib() + b.fib()
  }

}

class Number7724 : StressfulInteger {

  companion object {
    private var VALUE = 7724
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3862()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7723()
    val b = Number7722()
    return a.fib() + b.fib()
  }

}

class Number7725 : StressfulInteger {

  companion object {
    private var VALUE = 7725
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3862()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7724()
    val b = Number7723()
    return a.fib() + b.fib()
  }

}

class Number7726 : StressfulInteger {

  companion object {
    private var VALUE = 7726
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3863()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7725()
    val b = Number7724()
    return a.fib() + b.fib()
  }

}

class Number7727 : StressfulInteger {

  companion object {
    private var VALUE = 7727
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3863()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7726()
    val b = Number7725()
    return a.fib() + b.fib()
  }

}

class Number7728 : StressfulInteger {

  companion object {
    private var VALUE = 7728
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3864()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7727()
    val b = Number7726()
    return a.fib() + b.fib()
  }

}

class Number7729 : StressfulInteger {

  companion object {
    private var VALUE = 7729
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3864()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7728()
    val b = Number7727()
    return a.fib() + b.fib()
  }

}

class Number7730 : StressfulInteger {

  companion object {
    private var VALUE = 7730
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3865()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7729()
    val b = Number7728()
    return a.fib() + b.fib()
  }

}

class Number7731 : StressfulInteger {

  companion object {
    private var VALUE = 7731
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3865()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7730()
    val b = Number7729()
    return a.fib() + b.fib()
  }

}

class Number7732 : StressfulInteger {

  companion object {
    private var VALUE = 7732
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3866()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7731()
    val b = Number7730()
    return a.fib() + b.fib()
  }

}

class Number7733 : StressfulInteger {

  companion object {
    private var VALUE = 7733
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3866()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7732()
    val b = Number7731()
    return a.fib() + b.fib()
  }

}

class Number7734 : StressfulInteger {

  companion object {
    private var VALUE = 7734
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3867()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7733()
    val b = Number7732()
    return a.fib() + b.fib()
  }

}

class Number7735 : StressfulInteger {

  companion object {
    private var VALUE = 7735
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3867()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7734()
    val b = Number7733()
    return a.fib() + b.fib()
  }

}

class Number7736 : StressfulInteger {

  companion object {
    private var VALUE = 7736
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3868()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7735()
    val b = Number7734()
    return a.fib() + b.fib()
  }

}

class Number7737 : StressfulInteger {

  companion object {
    private var VALUE = 7737
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3868()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7736()
    val b = Number7735()
    return a.fib() + b.fib()
  }

}

class Number7738 : StressfulInteger {

  companion object {
    private var VALUE = 7738
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3869()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7737()
    val b = Number7736()
    return a.fib() + b.fib()
  }

}

class Number7739 : StressfulInteger {

  companion object {
    private var VALUE = 7739
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3869()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7738()
    val b = Number7737()
    return a.fib() + b.fib()
  }

}

class Number7740 : StressfulInteger {

  companion object {
    private var VALUE = 7740
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3870()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7739()
    val b = Number7738()
    return a.fib() + b.fib()
  }

}

class Number7741 : StressfulInteger {

  companion object {
    private var VALUE = 7741
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3870()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7740()
    val b = Number7739()
    return a.fib() + b.fib()
  }

}

class Number7742 : StressfulInteger {

  companion object {
    private var VALUE = 7742
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3871()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7741()
    val b = Number7740()
    return a.fib() + b.fib()
  }

}

class Number7743 : StressfulInteger {

  companion object {
    private var VALUE = 7743
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3871()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7742()
    val b = Number7741()
    return a.fib() + b.fib()
  }

}

class Number7744 : StressfulInteger {

  companion object {
    private var VALUE = 7744
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3872()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7743()
    val b = Number7742()
    return a.fib() + b.fib()
  }

}

class Number7745 : StressfulInteger {

  companion object {
    private var VALUE = 7745
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3872()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7744()
    val b = Number7743()
    return a.fib() + b.fib()
  }

}

class Number7746 : StressfulInteger {

  companion object {
    private var VALUE = 7746
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3873()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7745()
    val b = Number7744()
    return a.fib() + b.fib()
  }

}

class Number7747 : StressfulInteger {

  companion object {
    private var VALUE = 7747
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3873()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7746()
    val b = Number7745()
    return a.fib() + b.fib()
  }

}

class Number7748 : StressfulInteger {

  companion object {
    private var VALUE = 7748
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3874()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7747()
    val b = Number7746()
    return a.fib() + b.fib()
  }

}

class Number7749 : StressfulInteger {

  companion object {
    private var VALUE = 7749
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3874()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7748()
    val b = Number7747()
    return a.fib() + b.fib()
  }

}

class Number7750 : StressfulInteger {

  companion object {
    private var VALUE = 7750
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3875()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7749()
    val b = Number7748()
    return a.fib() + b.fib()
  }

}

class Number7751 : StressfulInteger {

  companion object {
    private var VALUE = 7751
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3875()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7750()
    val b = Number7749()
    return a.fib() + b.fib()
  }

}

class Number7752 : StressfulInteger {

  companion object {
    private var VALUE = 7752
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3876()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7751()
    val b = Number7750()
    return a.fib() + b.fib()
  }

}

class Number7753 : StressfulInteger {

  companion object {
    private var VALUE = 7753
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3876()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7752()
    val b = Number7751()
    return a.fib() + b.fib()
  }

}

class Number7754 : StressfulInteger {

  companion object {
    private var VALUE = 7754
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3877()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7753()
    val b = Number7752()
    return a.fib() + b.fib()
  }

}

class Number7755 : StressfulInteger {

  companion object {
    private var VALUE = 7755
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3877()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7754()
    val b = Number7753()
    return a.fib() + b.fib()
  }

}

class Number7756 : StressfulInteger {

  companion object {
    private var VALUE = 7756
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3878()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7755()
    val b = Number7754()
    return a.fib() + b.fib()
  }

}

class Number7757 : StressfulInteger {

  companion object {
    private var VALUE = 7757
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3878()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7756()
    val b = Number7755()
    return a.fib() + b.fib()
  }

}

class Number7758 : StressfulInteger {

  companion object {
    private var VALUE = 7758
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3879()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7757()
    val b = Number7756()
    return a.fib() + b.fib()
  }

}

class Number7759 : StressfulInteger {

  companion object {
    private var VALUE = 7759
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3879()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7758()
    val b = Number7757()
    return a.fib() + b.fib()
  }

}

class Number7760 : StressfulInteger {

  companion object {
    private var VALUE = 7760
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3880()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7759()
    val b = Number7758()
    return a.fib() + b.fib()
  }

}

class Number7761 : StressfulInteger {

  companion object {
    private var VALUE = 7761
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3880()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7760()
    val b = Number7759()
    return a.fib() + b.fib()
  }

}

class Number7762 : StressfulInteger {

  companion object {
    private var VALUE = 7762
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3881()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7761()
    val b = Number7760()
    return a.fib() + b.fib()
  }

}

class Number7763 : StressfulInteger {

  companion object {
    private var VALUE = 7763
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3881()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7762()
    val b = Number7761()
    return a.fib() + b.fib()
  }

}

class Number7764 : StressfulInteger {

  companion object {
    private var VALUE = 7764
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3882()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7763()
    val b = Number7762()
    return a.fib() + b.fib()
  }

}

class Number7765 : StressfulInteger {

  companion object {
    private var VALUE = 7765
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3882()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7764()
    val b = Number7763()
    return a.fib() + b.fib()
  }

}

class Number7766 : StressfulInteger {

  companion object {
    private var VALUE = 7766
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3883()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7765()
    val b = Number7764()
    return a.fib() + b.fib()
  }

}

class Number7767 : StressfulInteger {

  companion object {
    private var VALUE = 7767
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3883()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7766()
    val b = Number7765()
    return a.fib() + b.fib()
  }

}

class Number7768 : StressfulInteger {

  companion object {
    private var VALUE = 7768
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3884()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7767()
    val b = Number7766()
    return a.fib() + b.fib()
  }

}

class Number7769 : StressfulInteger {

  companion object {
    private var VALUE = 7769
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3884()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7768()
    val b = Number7767()
    return a.fib() + b.fib()
  }

}

class Number7770 : StressfulInteger {

  companion object {
    private var VALUE = 7770
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3885()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7769()
    val b = Number7768()
    return a.fib() + b.fib()
  }

}

class Number7771 : StressfulInteger {

  companion object {
    private var VALUE = 7771
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3885()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7770()
    val b = Number7769()
    return a.fib() + b.fib()
  }

}

class Number7772 : StressfulInteger {

  companion object {
    private var VALUE = 7772
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3886()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7771()
    val b = Number7770()
    return a.fib() + b.fib()
  }

}

class Number7773 : StressfulInteger {

  companion object {
    private var VALUE = 7773
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3886()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7772()
    val b = Number7771()
    return a.fib() + b.fib()
  }

}

class Number7774 : StressfulInteger {

  companion object {
    private var VALUE = 7774
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3887()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7773()
    val b = Number7772()
    return a.fib() + b.fib()
  }

}

class Number7775 : StressfulInteger {

  companion object {
    private var VALUE = 7775
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3887()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7774()
    val b = Number7773()
    return a.fib() + b.fib()
  }

}

class Number7776 : StressfulInteger {

  companion object {
    private var VALUE = 7776
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3888()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7775()
    val b = Number7774()
    return a.fib() + b.fib()
  }

}

class Number7777 : StressfulInteger {

  companion object {
    private var VALUE = 7777
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3888()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7776()
    val b = Number7775()
    return a.fib() + b.fib()
  }

}

class Number7778 : StressfulInteger {

  companion object {
    private var VALUE = 7778
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3889()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7777()
    val b = Number7776()
    return a.fib() + b.fib()
  }

}

class Number7779 : StressfulInteger {

  companion object {
    private var VALUE = 7779
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3889()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7778()
    val b = Number7777()
    return a.fib() + b.fib()
  }

}

class Number7780 : StressfulInteger {

  companion object {
    private var VALUE = 7780
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3890()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7779()
    val b = Number7778()
    return a.fib() + b.fib()
  }

}

class Number7781 : StressfulInteger {

  companion object {
    private var VALUE = 7781
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3890()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7780()
    val b = Number7779()
    return a.fib() + b.fib()
  }

}

class Number7782 : StressfulInteger {

  companion object {
    private var VALUE = 7782
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3891()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7781()
    val b = Number7780()
    return a.fib() + b.fib()
  }

}

class Number7783 : StressfulInteger {

  companion object {
    private var VALUE = 7783
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3891()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7782()
    val b = Number7781()
    return a.fib() + b.fib()
  }

}

class Number7784 : StressfulInteger {

  companion object {
    private var VALUE = 7784
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3892()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7783()
    val b = Number7782()
    return a.fib() + b.fib()
  }

}

class Number7785 : StressfulInteger {

  companion object {
    private var VALUE = 7785
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3892()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7784()
    val b = Number7783()
    return a.fib() + b.fib()
  }

}

class Number7786 : StressfulInteger {

  companion object {
    private var VALUE = 7786
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3893()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7785()
    val b = Number7784()
    return a.fib() + b.fib()
  }

}

class Number7787 : StressfulInteger {

  companion object {
    private var VALUE = 7787
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3893()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7786()
    val b = Number7785()
    return a.fib() + b.fib()
  }

}

class Number7788 : StressfulInteger {

  companion object {
    private var VALUE = 7788
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3894()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7787()
    val b = Number7786()
    return a.fib() + b.fib()
  }

}

class Number7789 : StressfulInteger {

  companion object {
    private var VALUE = 7789
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3894()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7788()
    val b = Number7787()
    return a.fib() + b.fib()
  }

}

class Number7790 : StressfulInteger {

  companion object {
    private var VALUE = 7790
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3895()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7789()
    val b = Number7788()
    return a.fib() + b.fib()
  }

}

class Number7791 : StressfulInteger {

  companion object {
    private var VALUE = 7791
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3895()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7790()
    val b = Number7789()
    return a.fib() + b.fib()
  }

}

class Number7792 : StressfulInteger {

  companion object {
    private var VALUE = 7792
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3896()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7791()
    val b = Number7790()
    return a.fib() + b.fib()
  }

}

class Number7793 : StressfulInteger {

  companion object {
    private var VALUE = 7793
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3896()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7792()
    val b = Number7791()
    return a.fib() + b.fib()
  }

}

class Number7794 : StressfulInteger {

  companion object {
    private var VALUE = 7794
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3897()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7793()
    val b = Number7792()
    return a.fib() + b.fib()
  }

}

class Number7795 : StressfulInteger {

  companion object {
    private var VALUE = 7795
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3897()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7794()
    val b = Number7793()
    return a.fib() + b.fib()
  }

}

class Number7796 : StressfulInteger {

  companion object {
    private var VALUE = 7796
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3898()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7795()
    val b = Number7794()
    return a.fib() + b.fib()
  }

}

class Number7797 : StressfulInteger {

  companion object {
    private var VALUE = 7797
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3898()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7796()
    val b = Number7795()
    return a.fib() + b.fib()
  }

}

class Number7798 : StressfulInteger {

  companion object {
    private var VALUE = 7798
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3899()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7797()
    val b = Number7796()
    return a.fib() + b.fib()
  }

}

class Number7799 : StressfulInteger {

  companion object {
    private var VALUE = 7799
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3899()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7798()
    val b = Number7797()
    return a.fib() + b.fib()
  }

}

class Number7800 : StressfulInteger {

  companion object {
    private var VALUE = 7800
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3900()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7799()
    val b = Number7798()
    return a.fib() + b.fib()
  }

}

class Number7801 : StressfulInteger {

  companion object {
    private var VALUE = 7801
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3900()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7800()
    val b = Number7799()
    return a.fib() + b.fib()
  }

}

class Number7802 : StressfulInteger {

  companion object {
    private var VALUE = 7802
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3901()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7801()
    val b = Number7800()
    return a.fib() + b.fib()
  }

}

class Number7803 : StressfulInteger {

  companion object {
    private var VALUE = 7803
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3901()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7802()
    val b = Number7801()
    return a.fib() + b.fib()
  }

}

class Number7804 : StressfulInteger {

  companion object {
    private var VALUE = 7804
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3902()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7803()
    val b = Number7802()
    return a.fib() + b.fib()
  }

}

class Number7805 : StressfulInteger {

  companion object {
    private var VALUE = 7805
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3902()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7804()
    val b = Number7803()
    return a.fib() + b.fib()
  }

}

class Number7806 : StressfulInteger {

  companion object {
    private var VALUE = 7806
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3903()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7805()
    val b = Number7804()
    return a.fib() + b.fib()
  }

}

class Number7807 : StressfulInteger {

  companion object {
    private var VALUE = 7807
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3903()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7806()
    val b = Number7805()
    return a.fib() + b.fib()
  }

}

class Number7808 : StressfulInteger {

  companion object {
    private var VALUE = 7808
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3904()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7807()
    val b = Number7806()
    return a.fib() + b.fib()
  }

}

class Number7809 : StressfulInteger {

  companion object {
    private var VALUE = 7809
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3904()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7808()
    val b = Number7807()
    return a.fib() + b.fib()
  }

}

class Number7810 : StressfulInteger {

  companion object {
    private var VALUE = 7810
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3905()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7809()
    val b = Number7808()
    return a.fib() + b.fib()
  }

}

class Number7811 : StressfulInteger {

  companion object {
    private var VALUE = 7811
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3905()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7810()
    val b = Number7809()
    return a.fib() + b.fib()
  }

}

class Number7812 : StressfulInteger {

  companion object {
    private var VALUE = 7812
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3906()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7811()
    val b = Number7810()
    return a.fib() + b.fib()
  }

}

class Number7813 : StressfulInteger {

  companion object {
    private var VALUE = 7813
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3906()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7812()
    val b = Number7811()
    return a.fib() + b.fib()
  }

}

class Number7814 : StressfulInteger {

  companion object {
    private var VALUE = 7814
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3907()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7813()
    val b = Number7812()
    return a.fib() + b.fib()
  }

}

class Number7815 : StressfulInteger {

  companion object {
    private var VALUE = 7815
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3907()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7814()
    val b = Number7813()
    return a.fib() + b.fib()
  }

}

class Number7816 : StressfulInteger {

  companion object {
    private var VALUE = 7816
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3908()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7815()
    val b = Number7814()
    return a.fib() + b.fib()
  }

}

class Number7817 : StressfulInteger {

  companion object {
    private var VALUE = 7817
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3908()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7816()
    val b = Number7815()
    return a.fib() + b.fib()
  }

}

class Number7818 : StressfulInteger {

  companion object {
    private var VALUE = 7818
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3909()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7817()
    val b = Number7816()
    return a.fib() + b.fib()
  }

}

class Number7819 : StressfulInteger {

  companion object {
    private var VALUE = 7819
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3909()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7818()
    val b = Number7817()
    return a.fib() + b.fib()
  }

}

class Number7820 : StressfulInteger {

  companion object {
    private var VALUE = 7820
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3910()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7819()
    val b = Number7818()
    return a.fib() + b.fib()
  }

}

class Number7821 : StressfulInteger {

  companion object {
    private var VALUE = 7821
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3910()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7820()
    val b = Number7819()
    return a.fib() + b.fib()
  }

}

class Number7822 : StressfulInteger {

  companion object {
    private var VALUE = 7822
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3911()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7821()
    val b = Number7820()
    return a.fib() + b.fib()
  }

}

class Number7823 : StressfulInteger {

  companion object {
    private var VALUE = 7823
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3911()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7822()
    val b = Number7821()
    return a.fib() + b.fib()
  }

}

class Number7824 : StressfulInteger {

  companion object {
    private var VALUE = 7824
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3912()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7823()
    val b = Number7822()
    return a.fib() + b.fib()
  }

}

class Number7825 : StressfulInteger {

  companion object {
    private var VALUE = 7825
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3912()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7824()
    val b = Number7823()
    return a.fib() + b.fib()
  }

}

class Number7826 : StressfulInteger {

  companion object {
    private var VALUE = 7826
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3913()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7825()
    val b = Number7824()
    return a.fib() + b.fib()
  }

}

class Number7827 : StressfulInteger {

  companion object {
    private var VALUE = 7827
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3913()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7826()
    val b = Number7825()
    return a.fib() + b.fib()
  }

}

class Number7828 : StressfulInteger {

  companion object {
    private var VALUE = 7828
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3914()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7827()
    val b = Number7826()
    return a.fib() + b.fib()
  }

}

class Number7829 : StressfulInteger {

  companion object {
    private var VALUE = 7829
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3914()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7828()
    val b = Number7827()
    return a.fib() + b.fib()
  }

}

class Number7830 : StressfulInteger {

  companion object {
    private var VALUE = 7830
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3915()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7829()
    val b = Number7828()
    return a.fib() + b.fib()
  }

}

class Number7831 : StressfulInteger {

  companion object {
    private var VALUE = 7831
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3915()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7830()
    val b = Number7829()
    return a.fib() + b.fib()
  }

}

class Number7832 : StressfulInteger {

  companion object {
    private var VALUE = 7832
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3916()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7831()
    val b = Number7830()
    return a.fib() + b.fib()
  }

}

class Number7833 : StressfulInteger {

  companion object {
    private var VALUE = 7833
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3916()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7832()
    val b = Number7831()
    return a.fib() + b.fib()
  }

}

class Number7834 : StressfulInteger {

  companion object {
    private var VALUE = 7834
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3917()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7833()
    val b = Number7832()
    return a.fib() + b.fib()
  }

}

class Number7835 : StressfulInteger {

  companion object {
    private var VALUE = 7835
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3917()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7834()
    val b = Number7833()
    return a.fib() + b.fib()
  }

}

class Number7836 : StressfulInteger {

  companion object {
    private var VALUE = 7836
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3918()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7835()
    val b = Number7834()
    return a.fib() + b.fib()
  }

}

class Number7837 : StressfulInteger {

  companion object {
    private var VALUE = 7837
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3918()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7836()
    val b = Number7835()
    return a.fib() + b.fib()
  }

}

class Number7838 : StressfulInteger {

  companion object {
    private var VALUE = 7838
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3919()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7837()
    val b = Number7836()
    return a.fib() + b.fib()
  }

}

class Number7839 : StressfulInteger {

  companion object {
    private var VALUE = 7839
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3919()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7838()
    val b = Number7837()
    return a.fib() + b.fib()
  }

}

class Number7840 : StressfulInteger {

  companion object {
    private var VALUE = 7840
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3920()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7839()
    val b = Number7838()
    return a.fib() + b.fib()
  }

}

class Number7841 : StressfulInteger {

  companion object {
    private var VALUE = 7841
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3920()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7840()
    val b = Number7839()
    return a.fib() + b.fib()
  }

}

class Number7842 : StressfulInteger {

  companion object {
    private var VALUE = 7842
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3921()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7841()
    val b = Number7840()
    return a.fib() + b.fib()
  }

}

class Number7843 : StressfulInteger {

  companion object {
    private var VALUE = 7843
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3921()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7842()
    val b = Number7841()
    return a.fib() + b.fib()
  }

}

class Number7844 : StressfulInteger {

  companion object {
    private var VALUE = 7844
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3922()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7843()
    val b = Number7842()
    return a.fib() + b.fib()
  }

}

class Number7845 : StressfulInteger {

  companion object {
    private var VALUE = 7845
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3922()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7844()
    val b = Number7843()
    return a.fib() + b.fib()
  }

}

class Number7846 : StressfulInteger {

  companion object {
    private var VALUE = 7846
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3923()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7845()
    val b = Number7844()
    return a.fib() + b.fib()
  }

}

class Number7847 : StressfulInteger {

  companion object {
    private var VALUE = 7847
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3923()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7846()
    val b = Number7845()
    return a.fib() + b.fib()
  }

}

class Number7848 : StressfulInteger {

  companion object {
    private var VALUE = 7848
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3924()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7847()
    val b = Number7846()
    return a.fib() + b.fib()
  }

}

class Number7849 : StressfulInteger {

  companion object {
    private var VALUE = 7849
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3924()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7848()
    val b = Number7847()
    return a.fib() + b.fib()
  }

}

class Number7850 : StressfulInteger {

  companion object {
    private var VALUE = 7850
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3925()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7849()
    val b = Number7848()
    return a.fib() + b.fib()
  }

}

class Number7851 : StressfulInteger {

  companion object {
    private var VALUE = 7851
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3925()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7850()
    val b = Number7849()
    return a.fib() + b.fib()
  }

}

class Number7852 : StressfulInteger {

  companion object {
    private var VALUE = 7852
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3926()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7851()
    val b = Number7850()
    return a.fib() + b.fib()
  }

}

class Number7853 : StressfulInteger {

  companion object {
    private var VALUE = 7853
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3926()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7852()
    val b = Number7851()
    return a.fib() + b.fib()
  }

}

class Number7854 : StressfulInteger {

  companion object {
    private var VALUE = 7854
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3927()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7853()
    val b = Number7852()
    return a.fib() + b.fib()
  }

}

class Number7855 : StressfulInteger {

  companion object {
    private var VALUE = 7855
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3927()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7854()
    val b = Number7853()
    return a.fib() + b.fib()
  }

}

class Number7856 : StressfulInteger {

  companion object {
    private var VALUE = 7856
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3928()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7855()
    val b = Number7854()
    return a.fib() + b.fib()
  }

}

class Number7857 : StressfulInteger {

  companion object {
    private var VALUE = 7857
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3928()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7856()
    val b = Number7855()
    return a.fib() + b.fib()
  }

}

class Number7858 : StressfulInteger {

  companion object {
    private var VALUE = 7858
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3929()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7857()
    val b = Number7856()
    return a.fib() + b.fib()
  }

}

class Number7859 : StressfulInteger {

  companion object {
    private var VALUE = 7859
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3929()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7858()
    val b = Number7857()
    return a.fib() + b.fib()
  }

}

class Number7860 : StressfulInteger {

  companion object {
    private var VALUE = 7860
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3930()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7859()
    val b = Number7858()
    return a.fib() + b.fib()
  }

}

class Number7861 : StressfulInteger {

  companion object {
    private var VALUE = 7861
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3930()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7860()
    val b = Number7859()
    return a.fib() + b.fib()
  }

}

class Number7862 : StressfulInteger {

  companion object {
    private var VALUE = 7862
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3931()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7861()
    val b = Number7860()
    return a.fib() + b.fib()
  }

}

class Number7863 : StressfulInteger {

  companion object {
    private var VALUE = 7863
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3931()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7862()
    val b = Number7861()
    return a.fib() + b.fib()
  }

}

class Number7864 : StressfulInteger {

  companion object {
    private var VALUE = 7864
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3932()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7863()
    val b = Number7862()
    return a.fib() + b.fib()
  }

}

class Number7865 : StressfulInteger {

  companion object {
    private var VALUE = 7865
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3932()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7864()
    val b = Number7863()
    return a.fib() + b.fib()
  }

}

class Number7866 : StressfulInteger {

  companion object {
    private var VALUE = 7866
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3933()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7865()
    val b = Number7864()
    return a.fib() + b.fib()
  }

}

class Number7867 : StressfulInteger {

  companion object {
    private var VALUE = 7867
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3933()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7866()
    val b = Number7865()
    return a.fib() + b.fib()
  }

}

class Number7868 : StressfulInteger {

  companion object {
    private var VALUE = 7868
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3934()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7867()
    val b = Number7866()
    return a.fib() + b.fib()
  }

}

class Number7869 : StressfulInteger {

  companion object {
    private var VALUE = 7869
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3934()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7868()
    val b = Number7867()
    return a.fib() + b.fib()
  }

}

class Number7870 : StressfulInteger {

  companion object {
    private var VALUE = 7870
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3935()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7869()
    val b = Number7868()
    return a.fib() + b.fib()
  }

}

class Number7871 : StressfulInteger {

  companion object {
    private var VALUE = 7871
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3935()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7870()
    val b = Number7869()
    return a.fib() + b.fib()
  }

}

class Number7872 : StressfulInteger {

  companion object {
    private var VALUE = 7872
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3936()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7871()
    val b = Number7870()
    return a.fib() + b.fib()
  }

}

class Number7873 : StressfulInteger {

  companion object {
    private var VALUE = 7873
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3936()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7872()
    val b = Number7871()
    return a.fib() + b.fib()
  }

}

class Number7874 : StressfulInteger {

  companion object {
    private var VALUE = 7874
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3937()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7873()
    val b = Number7872()
    return a.fib() + b.fib()
  }

}

class Number7875 : StressfulInteger {

  companion object {
    private var VALUE = 7875
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3937()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7874()
    val b = Number7873()
    return a.fib() + b.fib()
  }

}

class Number7876 : StressfulInteger {

  companion object {
    private var VALUE = 7876
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3938()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7875()
    val b = Number7874()
    return a.fib() + b.fib()
  }

}

class Number7877 : StressfulInteger {

  companion object {
    private var VALUE = 7877
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3938()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7876()
    val b = Number7875()
    return a.fib() + b.fib()
  }

}

class Number7878 : StressfulInteger {

  companion object {
    private var VALUE = 7878
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3939()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7877()
    val b = Number7876()
    return a.fib() + b.fib()
  }

}

class Number7879 : StressfulInteger {

  companion object {
    private var VALUE = 7879
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3939()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7878()
    val b = Number7877()
    return a.fib() + b.fib()
  }

}

class Number7880 : StressfulInteger {

  companion object {
    private var VALUE = 7880
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3940()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7879()
    val b = Number7878()
    return a.fib() + b.fib()
  }

}

class Number7881 : StressfulInteger {

  companion object {
    private var VALUE = 7881
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3940()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7880()
    val b = Number7879()
    return a.fib() + b.fib()
  }

}

class Number7882 : StressfulInteger {

  companion object {
    private var VALUE = 7882
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3941()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7881()
    val b = Number7880()
    return a.fib() + b.fib()
  }

}

class Number7883 : StressfulInteger {

  companion object {
    private var VALUE = 7883
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3941()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7882()
    val b = Number7881()
    return a.fib() + b.fib()
  }

}

class Number7884 : StressfulInteger {

  companion object {
    private var VALUE = 7884
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3942()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7883()
    val b = Number7882()
    return a.fib() + b.fib()
  }

}

class Number7885 : StressfulInteger {

  companion object {
    private var VALUE = 7885
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3942()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7884()
    val b = Number7883()
    return a.fib() + b.fib()
  }

}

class Number7886 : StressfulInteger {

  companion object {
    private var VALUE = 7886
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3943()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7885()
    val b = Number7884()
    return a.fib() + b.fib()
  }

}

class Number7887 : StressfulInteger {

  companion object {
    private var VALUE = 7887
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3943()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7886()
    val b = Number7885()
    return a.fib() + b.fib()
  }

}

class Number7888 : StressfulInteger {

  companion object {
    private var VALUE = 7888
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3944()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7887()
    val b = Number7886()
    return a.fib() + b.fib()
  }

}

class Number7889 : StressfulInteger {

  companion object {
    private var VALUE = 7889
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3944()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7888()
    val b = Number7887()
    return a.fib() + b.fib()
  }

}

class Number7890 : StressfulInteger {

  companion object {
    private var VALUE = 7890
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3945()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7889()
    val b = Number7888()
    return a.fib() + b.fib()
  }

}

class Number7891 : StressfulInteger {

  companion object {
    private var VALUE = 7891
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3945()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7890()
    val b = Number7889()
    return a.fib() + b.fib()
  }

}

class Number7892 : StressfulInteger {

  companion object {
    private var VALUE = 7892
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3946()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7891()
    val b = Number7890()
    return a.fib() + b.fib()
  }

}

class Number7893 : StressfulInteger {

  companion object {
    private var VALUE = 7893
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3946()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7892()
    val b = Number7891()
    return a.fib() + b.fib()
  }

}

class Number7894 : StressfulInteger {

  companion object {
    private var VALUE = 7894
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3947()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7893()
    val b = Number7892()
    return a.fib() + b.fib()
  }

}

class Number7895 : StressfulInteger {

  companion object {
    private var VALUE = 7895
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3947()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7894()
    val b = Number7893()
    return a.fib() + b.fib()
  }

}

class Number7896 : StressfulInteger {

  companion object {
    private var VALUE = 7896
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3948()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7895()
    val b = Number7894()
    return a.fib() + b.fib()
  }

}

class Number7897 : StressfulInteger {

  companion object {
    private var VALUE = 7897
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3948()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7896()
    val b = Number7895()
    return a.fib() + b.fib()
  }

}

class Number7898 : StressfulInteger {

  companion object {
    private var VALUE = 7898
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3949()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7897()
    val b = Number7896()
    return a.fib() + b.fib()
  }

}

class Number7899 : StressfulInteger {

  companion object {
    private var VALUE = 7899
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3949()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7898()
    val b = Number7897()
    return a.fib() + b.fib()
  }

}

class Number7900 : StressfulInteger {

  companion object {
    private var VALUE = 7900
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3950()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7899()
    val b = Number7898()
    return a.fib() + b.fib()
  }

}

class Number7901 : StressfulInteger {

  companion object {
    private var VALUE = 7901
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3950()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7900()
    val b = Number7899()
    return a.fib() + b.fib()
  }

}

class Number7902 : StressfulInteger {

  companion object {
    private var VALUE = 7902
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3951()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7901()
    val b = Number7900()
    return a.fib() + b.fib()
  }

}

class Number7903 : StressfulInteger {

  companion object {
    private var VALUE = 7903
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3951()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7902()
    val b = Number7901()
    return a.fib() + b.fib()
  }

}

class Number7904 : StressfulInteger {

  companion object {
    private var VALUE = 7904
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3952()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7903()
    val b = Number7902()
    return a.fib() + b.fib()
  }

}

class Number7905 : StressfulInteger {

  companion object {
    private var VALUE = 7905
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3952()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7904()
    val b = Number7903()
    return a.fib() + b.fib()
  }

}

class Number7906 : StressfulInteger {

  companion object {
    private var VALUE = 7906
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3953()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7905()
    val b = Number7904()
    return a.fib() + b.fib()
  }

}

class Number7907 : StressfulInteger {

  companion object {
    private var VALUE = 7907
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3953()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7906()
    val b = Number7905()
    return a.fib() + b.fib()
  }

}

class Number7908 : StressfulInteger {

  companion object {
    private var VALUE = 7908
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3954()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7907()
    val b = Number7906()
    return a.fib() + b.fib()
  }

}

class Number7909 : StressfulInteger {

  companion object {
    private var VALUE = 7909
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3954()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7908()
    val b = Number7907()
    return a.fib() + b.fib()
  }

}

class Number7910 : StressfulInteger {

  companion object {
    private var VALUE = 7910
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3955()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7909()
    val b = Number7908()
    return a.fib() + b.fib()
  }

}

class Number7911 : StressfulInteger {

  companion object {
    private var VALUE = 7911
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3955()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7910()
    val b = Number7909()
    return a.fib() + b.fib()
  }

}

class Number7912 : StressfulInteger {

  companion object {
    private var VALUE = 7912
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3956()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7911()
    val b = Number7910()
    return a.fib() + b.fib()
  }

}

class Number7913 : StressfulInteger {

  companion object {
    private var VALUE = 7913
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3956()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7912()
    val b = Number7911()
    return a.fib() + b.fib()
  }

}

class Number7914 : StressfulInteger {

  companion object {
    private var VALUE = 7914
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3957()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7913()
    val b = Number7912()
    return a.fib() + b.fib()
  }

}

class Number7915 : StressfulInteger {

  companion object {
    private var VALUE = 7915
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3957()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7914()
    val b = Number7913()
    return a.fib() + b.fib()
  }

}

class Number7916 : StressfulInteger {

  companion object {
    private var VALUE = 7916
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3958()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7915()
    val b = Number7914()
    return a.fib() + b.fib()
  }

}

class Number7917 : StressfulInteger {

  companion object {
    private var VALUE = 7917
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3958()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7916()
    val b = Number7915()
    return a.fib() + b.fib()
  }

}

class Number7918 : StressfulInteger {

  companion object {
    private var VALUE = 7918
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3959()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7917()
    val b = Number7916()
    return a.fib() + b.fib()
  }

}

class Number7919 : StressfulInteger {

  companion object {
    private var VALUE = 7919
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3959()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7918()
    val b = Number7917()
    return a.fib() + b.fib()
  }

}

class Number7920 : StressfulInteger {

  companion object {
    private var VALUE = 7920
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3960()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7919()
    val b = Number7918()
    return a.fib() + b.fib()
  }

}

class Number7921 : StressfulInteger {

  companion object {
    private var VALUE = 7921
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3960()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7920()
    val b = Number7919()
    return a.fib() + b.fib()
  }

}

class Number7922 : StressfulInteger {

  companion object {
    private var VALUE = 7922
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3961()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7921()
    val b = Number7920()
    return a.fib() + b.fib()
  }

}

class Number7923 : StressfulInteger {

  companion object {
    private var VALUE = 7923
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3961()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7922()
    val b = Number7921()
    return a.fib() + b.fib()
  }

}

class Number7924 : StressfulInteger {

  companion object {
    private var VALUE = 7924
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3962()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7923()
    val b = Number7922()
    return a.fib() + b.fib()
  }

}

class Number7925 : StressfulInteger {

  companion object {
    private var VALUE = 7925
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3962()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7924()
    val b = Number7923()
    return a.fib() + b.fib()
  }

}

class Number7926 : StressfulInteger {

  companion object {
    private var VALUE = 7926
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3963()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7925()
    val b = Number7924()
    return a.fib() + b.fib()
  }

}

class Number7927 : StressfulInteger {

  companion object {
    private var VALUE = 7927
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3963()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7926()
    val b = Number7925()
    return a.fib() + b.fib()
  }

}

class Number7928 : StressfulInteger {

  companion object {
    private var VALUE = 7928
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3964()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7927()
    val b = Number7926()
    return a.fib() + b.fib()
  }

}

class Number7929 : StressfulInteger {

  companion object {
    private var VALUE = 7929
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3964()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7928()
    val b = Number7927()
    return a.fib() + b.fib()
  }

}

class Number7930 : StressfulInteger {

  companion object {
    private var VALUE = 7930
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3965()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7929()
    val b = Number7928()
    return a.fib() + b.fib()
  }

}

class Number7931 : StressfulInteger {

  companion object {
    private var VALUE = 7931
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3965()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7930()
    val b = Number7929()
    return a.fib() + b.fib()
  }

}

class Number7932 : StressfulInteger {

  companion object {
    private var VALUE = 7932
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3966()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7931()
    val b = Number7930()
    return a.fib() + b.fib()
  }

}

class Number7933 : StressfulInteger {

  companion object {
    private var VALUE = 7933
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3966()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7932()
    val b = Number7931()
    return a.fib() + b.fib()
  }

}

class Number7934 : StressfulInteger {

  companion object {
    private var VALUE = 7934
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3967()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7933()
    val b = Number7932()
    return a.fib() + b.fib()
  }

}

class Number7935 : StressfulInteger {

  companion object {
    private var VALUE = 7935
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3967()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7934()
    val b = Number7933()
    return a.fib() + b.fib()
  }

}

class Number7936 : StressfulInteger {

  companion object {
    private var VALUE = 7936
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3968()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7935()
    val b = Number7934()
    return a.fib() + b.fib()
  }

}

class Number7937 : StressfulInteger {

  companion object {
    private var VALUE = 7937
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3968()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7936()
    val b = Number7935()
    return a.fib() + b.fib()
  }

}

class Number7938 : StressfulInteger {

  companion object {
    private var VALUE = 7938
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3969()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7937()
    val b = Number7936()
    return a.fib() + b.fib()
  }

}

class Number7939 : StressfulInteger {

  companion object {
    private var VALUE = 7939
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3969()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7938()
    val b = Number7937()
    return a.fib() + b.fib()
  }

}

class Number7940 : StressfulInteger {

  companion object {
    private var VALUE = 7940
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3970()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7939()
    val b = Number7938()
    return a.fib() + b.fib()
  }

}

class Number7941 : StressfulInteger {

  companion object {
    private var VALUE = 7941
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3970()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7940()
    val b = Number7939()
    return a.fib() + b.fib()
  }

}

class Number7942 : StressfulInteger {

  companion object {
    private var VALUE = 7942
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3971()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7941()
    val b = Number7940()
    return a.fib() + b.fib()
  }

}

class Number7943 : StressfulInteger {

  companion object {
    private var VALUE = 7943
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3971()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7942()
    val b = Number7941()
    return a.fib() + b.fib()
  }

}

class Number7944 : StressfulInteger {

  companion object {
    private var VALUE = 7944
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3972()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7943()
    val b = Number7942()
    return a.fib() + b.fib()
  }

}

class Number7945 : StressfulInteger {

  companion object {
    private var VALUE = 7945
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3972()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7944()
    val b = Number7943()
    return a.fib() + b.fib()
  }

}

class Number7946 : StressfulInteger {

  companion object {
    private var VALUE = 7946
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3973()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7945()
    val b = Number7944()
    return a.fib() + b.fib()
  }

}

class Number7947 : StressfulInteger {

  companion object {
    private var VALUE = 7947
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3973()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7946()
    val b = Number7945()
    return a.fib() + b.fib()
  }

}

class Number7948 : StressfulInteger {

  companion object {
    private var VALUE = 7948
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3974()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7947()
    val b = Number7946()
    return a.fib() + b.fib()
  }

}

class Number7949 : StressfulInteger {

  companion object {
    private var VALUE = 7949
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3974()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7948()
    val b = Number7947()
    return a.fib() + b.fib()
  }

}

class Number7950 : StressfulInteger {

  companion object {
    private var VALUE = 7950
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3975()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7949()
    val b = Number7948()
    return a.fib() + b.fib()
  }

}

class Number7951 : StressfulInteger {

  companion object {
    private var VALUE = 7951
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3975()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7950()
    val b = Number7949()
    return a.fib() + b.fib()
  }

}

class Number7952 : StressfulInteger {

  companion object {
    private var VALUE = 7952
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3976()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7951()
    val b = Number7950()
    return a.fib() + b.fib()
  }

}

class Number7953 : StressfulInteger {

  companion object {
    private var VALUE = 7953
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3976()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7952()
    val b = Number7951()
    return a.fib() + b.fib()
  }

}

class Number7954 : StressfulInteger {

  companion object {
    private var VALUE = 7954
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3977()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7953()
    val b = Number7952()
    return a.fib() + b.fib()
  }

}

class Number7955 : StressfulInteger {

  companion object {
    private var VALUE = 7955
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3977()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7954()
    val b = Number7953()
    return a.fib() + b.fib()
  }

}

class Number7956 : StressfulInteger {

  companion object {
    private var VALUE = 7956
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3978()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7955()
    val b = Number7954()
    return a.fib() + b.fib()
  }

}

class Number7957 : StressfulInteger {

  companion object {
    private var VALUE = 7957
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3978()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7956()
    val b = Number7955()
    return a.fib() + b.fib()
  }

}

class Number7958 : StressfulInteger {

  companion object {
    private var VALUE = 7958
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3979()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7957()
    val b = Number7956()
    return a.fib() + b.fib()
  }

}

class Number7959 : StressfulInteger {

  companion object {
    private var VALUE = 7959
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3979()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7958()
    val b = Number7957()
    return a.fib() + b.fib()
  }

}

class Number7960 : StressfulInteger {

  companion object {
    private var VALUE = 7960
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3980()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7959()
    val b = Number7958()
    return a.fib() + b.fib()
  }

}

class Number7961 : StressfulInteger {

  companion object {
    private var VALUE = 7961
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3980()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7960()
    val b = Number7959()
    return a.fib() + b.fib()
  }

}

class Number7962 : StressfulInteger {

  companion object {
    private var VALUE = 7962
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3981()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7961()
    val b = Number7960()
    return a.fib() + b.fib()
  }

}

class Number7963 : StressfulInteger {

  companion object {
    private var VALUE = 7963
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3981()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7962()
    val b = Number7961()
    return a.fib() + b.fib()
  }

}

class Number7964 : StressfulInteger {

  companion object {
    private var VALUE = 7964
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3982()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7963()
    val b = Number7962()
    return a.fib() + b.fib()
  }

}

class Number7965 : StressfulInteger {

  companion object {
    private var VALUE = 7965
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3982()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7964()
    val b = Number7963()
    return a.fib() + b.fib()
  }

}

class Number7966 : StressfulInteger {

  companion object {
    private var VALUE = 7966
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3983()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7965()
    val b = Number7964()
    return a.fib() + b.fib()
  }

}

class Number7967 : StressfulInteger {

  companion object {
    private var VALUE = 7967
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3983()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7966()
    val b = Number7965()
    return a.fib() + b.fib()
  }

}

class Number7968 : StressfulInteger {

  companion object {
    private var VALUE = 7968
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3984()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7967()
    val b = Number7966()
    return a.fib() + b.fib()
  }

}

class Number7969 : StressfulInteger {

  companion object {
    private var VALUE = 7969
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3984()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7968()
    val b = Number7967()
    return a.fib() + b.fib()
  }

}

class Number7970 : StressfulInteger {

  companion object {
    private var VALUE = 7970
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3985()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7969()
    val b = Number7968()
    return a.fib() + b.fib()
  }

}

class Number7971 : StressfulInteger {

  companion object {
    private var VALUE = 7971
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3985()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7970()
    val b = Number7969()
    return a.fib() + b.fib()
  }

}

class Number7972 : StressfulInteger {

  companion object {
    private var VALUE = 7972
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3986()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7971()
    val b = Number7970()
    return a.fib() + b.fib()
  }

}

class Number7973 : StressfulInteger {

  companion object {
    private var VALUE = 7973
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3986()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7972()
    val b = Number7971()
    return a.fib() + b.fib()
  }

}

class Number7974 : StressfulInteger {

  companion object {
    private var VALUE = 7974
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3987()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7973()
    val b = Number7972()
    return a.fib() + b.fib()
  }

}

class Number7975 : StressfulInteger {

  companion object {
    private var VALUE = 7975
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3987()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7974()
    val b = Number7973()
    return a.fib() + b.fib()
  }

}

class Number7976 : StressfulInteger {

  companion object {
    private var VALUE = 7976
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3988()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7975()
    val b = Number7974()
    return a.fib() + b.fib()
  }

}

class Number7977 : StressfulInteger {

  companion object {
    private var VALUE = 7977
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3988()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7976()
    val b = Number7975()
    return a.fib() + b.fib()
  }

}

class Number7978 : StressfulInteger {

  companion object {
    private var VALUE = 7978
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3989()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7977()
    val b = Number7976()
    return a.fib() + b.fib()
  }

}

class Number7979 : StressfulInteger {

  companion object {
    private var VALUE = 7979
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3989()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7978()
    val b = Number7977()
    return a.fib() + b.fib()
  }

}

class Number7980 : StressfulInteger {

  companion object {
    private var VALUE = 7980
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3990()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7979()
    val b = Number7978()
    return a.fib() + b.fib()
  }

}

class Number7981 : StressfulInteger {

  companion object {
    private var VALUE = 7981
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3990()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7980()
    val b = Number7979()
    return a.fib() + b.fib()
  }

}

class Number7982 : StressfulInteger {

  companion object {
    private var VALUE = 7982
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3991()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7981()
    val b = Number7980()
    return a.fib() + b.fib()
  }

}

class Number7983 : StressfulInteger {

  companion object {
    private var VALUE = 7983
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3991()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7982()
    val b = Number7981()
    return a.fib() + b.fib()
  }

}

class Number7984 : StressfulInteger {

  companion object {
    private var VALUE = 7984
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3992()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7983()
    val b = Number7982()
    return a.fib() + b.fib()
  }

}

class Number7985 : StressfulInteger {

  companion object {
    private var VALUE = 7985
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3992()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7984()
    val b = Number7983()
    return a.fib() + b.fib()
  }

}

class Number7986 : StressfulInteger {

  companion object {
    private var VALUE = 7986
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3993()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7985()
    val b = Number7984()
    return a.fib() + b.fib()
  }

}

class Number7987 : StressfulInteger {

  companion object {
    private var VALUE = 7987
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3993()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7986()
    val b = Number7985()
    return a.fib() + b.fib()
  }

}

class Number7988 : StressfulInteger {

  companion object {
    private var VALUE = 7988
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3994()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7987()
    val b = Number7986()
    return a.fib() + b.fib()
  }

}

class Number7989 : StressfulInteger {

  companion object {
    private var VALUE = 7989
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3994()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7988()
    val b = Number7987()
    return a.fib() + b.fib()
  }

}

class Number7990 : StressfulInteger {

  companion object {
    private var VALUE = 7990
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3995()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7989()
    val b = Number7988()
    return a.fib() + b.fib()
  }

}

class Number7991 : StressfulInteger {

  companion object {
    private var VALUE = 7991
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3995()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7990()
    val b = Number7989()
    return a.fib() + b.fib()
  }

}

class Number7992 : StressfulInteger {

  companion object {
    private var VALUE = 7992
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3996()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7991()
    val b = Number7990()
    return a.fib() + b.fib()
  }

}

class Number7993 : StressfulInteger {

  companion object {
    private var VALUE = 7993
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3996()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7992()
    val b = Number7991()
    return a.fib() + b.fib()
  }

}

class Number7994 : StressfulInteger {

  companion object {
    private var VALUE = 7994
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3997()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7993()
    val b = Number7992()
    return a.fib() + b.fib()
  }

}

class Number7995 : StressfulInteger {

  companion object {
    private var VALUE = 7995
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3997()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7994()
    val b = Number7993()
    return a.fib() + b.fib()
  }

}

class Number7996 : StressfulInteger {

  companion object {
    private var VALUE = 7996
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3998()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7995()
    val b = Number7994()
    return a.fib() + b.fib()
  }

}

class Number7997 : StressfulInteger {

  companion object {
    private var VALUE = 7997
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3998()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7996()
    val b = Number7995()
    return a.fib() + b.fib()
  }

}

class Number7998 : StressfulInteger {

  companion object {
    private var VALUE = 7998
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3999()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7997()
    val b = Number7996()
    return a.fib() + b.fib()
  }

}

class Number7999 : StressfulInteger {

  companion object {
    private var VALUE = 7999
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number3999()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number10000()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number7998()
    val b = Number7997()
    return a.fib() + b.fib()
  }

}

