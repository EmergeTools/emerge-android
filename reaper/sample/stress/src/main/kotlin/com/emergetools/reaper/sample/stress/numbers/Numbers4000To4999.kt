package com.emergetools.reaper.sample.stress.numbers

class Number4000 : StressfulInteger {

  companion object {
    private var VALUE = 4000
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2000()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number8001()
      val right = Number8002()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number3999()
    val b = Number3998()
    return a.fib() + b.fib()
  }

}

class Number4001 : StressfulInteger {

  companion object {
    private var VALUE = 4001
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2000()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number8003()
      val right = Number8004()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4000()
    val b = Number3999()
    return a.fib() + b.fib()
  }

}

class Number4002 : StressfulInteger {

  companion object {
    private var VALUE = 4002
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2001()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number8005()
      val right = Number8006()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4001()
    val b = Number4000()
    return a.fib() + b.fib()
  }

}

class Number4003 : StressfulInteger {

  companion object {
    private var VALUE = 4003
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2001()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number8007()
      val right = Number8008()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4002()
    val b = Number4001()
    return a.fib() + b.fib()
  }

}

class Number4004 : StressfulInteger {

  companion object {
    private var VALUE = 4004
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2002()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number8009()
      val right = Number8010()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4003()
    val b = Number4002()
    return a.fib() + b.fib()
  }

}

class Number4005 : StressfulInteger {

  companion object {
    private var VALUE = 4005
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2002()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number8011()
      val right = Number8012()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4004()
    val b = Number4003()
    return a.fib() + b.fib()
  }

}

class Number4006 : StressfulInteger {

  companion object {
    private var VALUE = 4006
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2003()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number8013()
      val right = Number8014()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4005()
    val b = Number4004()
    return a.fib() + b.fib()
  }

}

class Number4007 : StressfulInteger {

  companion object {
    private var VALUE = 4007
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2003()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number8015()
      val right = Number8016()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4006()
    val b = Number4005()
    return a.fib() + b.fib()
  }

}

class Number4008 : StressfulInteger {

  companion object {
    private var VALUE = 4008
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2004()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number8017()
      val right = Number8018()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4007()
    val b = Number4006()
    return a.fib() + b.fib()
  }

}

class Number4009 : StressfulInteger {

  companion object {
    private var VALUE = 4009
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2004()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number8019()
      val right = Number8020()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4008()
    val b = Number4007()
    return a.fib() + b.fib()
  }

}

class Number4010 : StressfulInteger {

  companion object {
    private var VALUE = 4010
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2005()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number8021()
      val right = Number8022()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4009()
    val b = Number4008()
    return a.fib() + b.fib()
  }

}

class Number4011 : StressfulInteger {

  companion object {
    private var VALUE = 4011
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2005()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number8023()
      val right = Number8024()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4010()
    val b = Number4009()
    return a.fib() + b.fib()
  }

}

class Number4012 : StressfulInteger {

  companion object {
    private var VALUE = 4012
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2006()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number8025()
      val right = Number8026()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4011()
    val b = Number4010()
    return a.fib() + b.fib()
  }

}

class Number4013 : StressfulInteger {

  companion object {
    private var VALUE = 4013
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2006()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number8027()
      val right = Number8028()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4012()
    val b = Number4011()
    return a.fib() + b.fib()
  }

}

class Number4014 : StressfulInteger {

  companion object {
    private var VALUE = 4014
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2007()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number8029()
      val right = Number8030()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4013()
    val b = Number4012()
    return a.fib() + b.fib()
  }

}

class Number4015 : StressfulInteger {

  companion object {
    private var VALUE = 4015
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2007()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number8031()
      val right = Number8032()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4014()
    val b = Number4013()
    return a.fib() + b.fib()
  }

}

class Number4016 : StressfulInteger {

  companion object {
    private var VALUE = 4016
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2008()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number8033()
      val right = Number8034()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4015()
    val b = Number4014()
    return a.fib() + b.fib()
  }

}

class Number4017 : StressfulInteger {

  companion object {
    private var VALUE = 4017
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2008()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number8035()
      val right = Number8036()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4016()
    val b = Number4015()
    return a.fib() + b.fib()
  }

}

class Number4018 : StressfulInteger {

  companion object {
    private var VALUE = 4018
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2009()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number8037()
      val right = Number8038()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4017()
    val b = Number4016()
    return a.fib() + b.fib()
  }

}

class Number4019 : StressfulInteger {

  companion object {
    private var VALUE = 4019
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2009()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number8039()
      val right = Number8040()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4018()
    val b = Number4017()
    return a.fib() + b.fib()
  }

}

class Number4020 : StressfulInteger {

  companion object {
    private var VALUE = 4020
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2010()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number8041()
      val right = Number8042()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4019()
    val b = Number4018()
    return a.fib() + b.fib()
  }

}

class Number4021 : StressfulInteger {

  companion object {
    private var VALUE = 4021
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2010()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number8043()
      val right = Number8044()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4020()
    val b = Number4019()
    return a.fib() + b.fib()
  }

}

class Number4022 : StressfulInteger {

  companion object {
    private var VALUE = 4022
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2011()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number8045()
      val right = Number8046()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4021()
    val b = Number4020()
    return a.fib() + b.fib()
  }

}

class Number4023 : StressfulInteger {

  companion object {
    private var VALUE = 4023
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2011()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number8047()
      val right = Number8048()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4022()
    val b = Number4021()
    return a.fib() + b.fib()
  }

}

class Number4024 : StressfulInteger {

  companion object {
    private var VALUE = 4024
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2012()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number8049()
      val right = Number8050()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4023()
    val b = Number4022()
    return a.fib() + b.fib()
  }

}

class Number4025 : StressfulInteger {

  companion object {
    private var VALUE = 4025
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2012()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number8051()
      val right = Number8052()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4024()
    val b = Number4023()
    return a.fib() + b.fib()
  }

}

class Number4026 : StressfulInteger {

  companion object {
    private var VALUE = 4026
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2013()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number8053()
      val right = Number8054()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4025()
    val b = Number4024()
    return a.fib() + b.fib()
  }

}

class Number4027 : StressfulInteger {

  companion object {
    private var VALUE = 4027
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2013()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number8055()
      val right = Number8056()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4026()
    val b = Number4025()
    return a.fib() + b.fib()
  }

}

class Number4028 : StressfulInteger {

  companion object {
    private var VALUE = 4028
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2014()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number8057()
      val right = Number8058()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4027()
    val b = Number4026()
    return a.fib() + b.fib()
  }

}

class Number4029 : StressfulInteger {

  companion object {
    private var VALUE = 4029
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2014()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number8059()
      val right = Number8060()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4028()
    val b = Number4027()
    return a.fib() + b.fib()
  }

}

class Number4030 : StressfulInteger {

  companion object {
    private var VALUE = 4030
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2015()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number8061()
      val right = Number8062()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4029()
    val b = Number4028()
    return a.fib() + b.fib()
  }

}

class Number4031 : StressfulInteger {

  companion object {
    private var VALUE = 4031
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2015()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number8063()
      val right = Number8064()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4030()
    val b = Number4029()
    return a.fib() + b.fib()
  }

}

class Number4032 : StressfulInteger {

  companion object {
    private var VALUE = 4032
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2016()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number8065()
      val right = Number8066()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4031()
    val b = Number4030()
    return a.fib() + b.fib()
  }

}

class Number4033 : StressfulInteger {

  companion object {
    private var VALUE = 4033
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2016()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number8067()
      val right = Number8068()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4032()
    val b = Number4031()
    return a.fib() + b.fib()
  }

}

class Number4034 : StressfulInteger {

  companion object {
    private var VALUE = 4034
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2017()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number8069()
      val right = Number8070()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4033()
    val b = Number4032()
    return a.fib() + b.fib()
  }

}

class Number4035 : StressfulInteger {

  companion object {
    private var VALUE = 4035
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2017()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number8071()
      val right = Number8072()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4034()
    val b = Number4033()
    return a.fib() + b.fib()
  }

}

class Number4036 : StressfulInteger {

  companion object {
    private var VALUE = 4036
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2018()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number8073()
      val right = Number8074()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4035()
    val b = Number4034()
    return a.fib() + b.fib()
  }

}

class Number4037 : StressfulInteger {

  companion object {
    private var VALUE = 4037
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2018()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number8075()
      val right = Number8076()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4036()
    val b = Number4035()
    return a.fib() + b.fib()
  }

}

class Number4038 : StressfulInteger {

  companion object {
    private var VALUE = 4038
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2019()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number8077()
      val right = Number8078()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4037()
    val b = Number4036()
    return a.fib() + b.fib()
  }

}

class Number4039 : StressfulInteger {

  companion object {
    private var VALUE = 4039
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2019()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number8079()
      val right = Number8080()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4038()
    val b = Number4037()
    return a.fib() + b.fib()
  }

}

class Number4040 : StressfulInteger {

  companion object {
    private var VALUE = 4040
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2020()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number8081()
      val right = Number8082()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4039()
    val b = Number4038()
    return a.fib() + b.fib()
  }

}

class Number4041 : StressfulInteger {

  companion object {
    private var VALUE = 4041
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2020()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number8083()
      val right = Number8084()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4040()
    val b = Number4039()
    return a.fib() + b.fib()
  }

}

class Number4042 : StressfulInteger {

  companion object {
    private var VALUE = 4042
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2021()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number8085()
      val right = Number8086()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4041()
    val b = Number4040()
    return a.fib() + b.fib()
  }

}

class Number4043 : StressfulInteger {

  companion object {
    private var VALUE = 4043
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2021()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number8087()
      val right = Number8088()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4042()
    val b = Number4041()
    return a.fib() + b.fib()
  }

}

class Number4044 : StressfulInteger {

  companion object {
    private var VALUE = 4044
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2022()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number8089()
      val right = Number8090()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4043()
    val b = Number4042()
    return a.fib() + b.fib()
  }

}

class Number4045 : StressfulInteger {

  companion object {
    private var VALUE = 4045
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2022()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number8091()
      val right = Number8092()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4044()
    val b = Number4043()
    return a.fib() + b.fib()
  }

}

class Number4046 : StressfulInteger {

  companion object {
    private var VALUE = 4046
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2023()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number8093()
      val right = Number8094()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4045()
    val b = Number4044()
    return a.fib() + b.fib()
  }

}

class Number4047 : StressfulInteger {

  companion object {
    private var VALUE = 4047
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2023()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number8095()
      val right = Number8096()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4046()
    val b = Number4045()
    return a.fib() + b.fib()
  }

}

class Number4048 : StressfulInteger {

  companion object {
    private var VALUE = 4048
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2024()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number8097()
      val right = Number8098()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4047()
    val b = Number4046()
    return a.fib() + b.fib()
  }

}

class Number4049 : StressfulInteger {

  companion object {
    private var VALUE = 4049
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2024()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number8099()
      val right = Number8100()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4048()
    val b = Number4047()
    return a.fib() + b.fib()
  }

}

class Number4050 : StressfulInteger {

  companion object {
    private var VALUE = 4050
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2025()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number8101()
      val right = Number8102()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4049()
    val b = Number4048()
    return a.fib() + b.fib()
  }

}

class Number4051 : StressfulInteger {

  companion object {
    private var VALUE = 4051
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2025()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number8103()
      val right = Number8104()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4050()
    val b = Number4049()
    return a.fib() + b.fib()
  }

}

class Number4052 : StressfulInteger {

  companion object {
    private var VALUE = 4052
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2026()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number8105()
      val right = Number8106()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4051()
    val b = Number4050()
    return a.fib() + b.fib()
  }

}

class Number4053 : StressfulInteger {

  companion object {
    private var VALUE = 4053
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2026()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number8107()
      val right = Number8108()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4052()
    val b = Number4051()
    return a.fib() + b.fib()
  }

}

class Number4054 : StressfulInteger {

  companion object {
    private var VALUE = 4054
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2027()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number8109()
      val right = Number8110()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4053()
    val b = Number4052()
    return a.fib() + b.fib()
  }

}

class Number4055 : StressfulInteger {

  companion object {
    private var VALUE = 4055
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2027()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number8111()
      val right = Number8112()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4054()
    val b = Number4053()
    return a.fib() + b.fib()
  }

}

class Number4056 : StressfulInteger {

  companion object {
    private var VALUE = 4056
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2028()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number8113()
      val right = Number8114()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4055()
    val b = Number4054()
    return a.fib() + b.fib()
  }

}

class Number4057 : StressfulInteger {

  companion object {
    private var VALUE = 4057
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2028()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number8115()
      val right = Number8116()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4056()
    val b = Number4055()
    return a.fib() + b.fib()
  }

}

class Number4058 : StressfulInteger {

  companion object {
    private var VALUE = 4058
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2029()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number8117()
      val right = Number8118()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4057()
    val b = Number4056()
    return a.fib() + b.fib()
  }

}

class Number4059 : StressfulInteger {

  companion object {
    private var VALUE = 4059
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2029()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number8119()
      val right = Number8120()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4058()
    val b = Number4057()
    return a.fib() + b.fib()
  }

}

class Number4060 : StressfulInteger {

  companion object {
    private var VALUE = 4060
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2030()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number8121()
      val right = Number8122()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4059()
    val b = Number4058()
    return a.fib() + b.fib()
  }

}

class Number4061 : StressfulInteger {

  companion object {
    private var VALUE = 4061
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2030()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number8123()
      val right = Number8124()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4060()
    val b = Number4059()
    return a.fib() + b.fib()
  }

}

class Number4062 : StressfulInteger {

  companion object {
    private var VALUE = 4062
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2031()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number8125()
      val right = Number8126()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4061()
    val b = Number4060()
    return a.fib() + b.fib()
  }

}

class Number4063 : StressfulInteger {

  companion object {
    private var VALUE = 4063
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2031()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number8127()
      val right = Number8128()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4062()
    val b = Number4061()
    return a.fib() + b.fib()
  }

}

class Number4064 : StressfulInteger {

  companion object {
    private var VALUE = 4064
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2032()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number8129()
      val right = Number8130()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4063()
    val b = Number4062()
    return a.fib() + b.fib()
  }

}

class Number4065 : StressfulInteger {

  companion object {
    private var VALUE = 4065
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2032()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number8131()
      val right = Number8132()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4064()
    val b = Number4063()
    return a.fib() + b.fib()
  }

}

class Number4066 : StressfulInteger {

  companion object {
    private var VALUE = 4066
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2033()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number8133()
      val right = Number8134()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4065()
    val b = Number4064()
    return a.fib() + b.fib()
  }

}

class Number4067 : StressfulInteger {

  companion object {
    private var VALUE = 4067
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2033()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number8135()
      val right = Number8136()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4066()
    val b = Number4065()
    return a.fib() + b.fib()
  }

}

class Number4068 : StressfulInteger {

  companion object {
    private var VALUE = 4068
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2034()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number8137()
      val right = Number8138()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4067()
    val b = Number4066()
    return a.fib() + b.fib()
  }

}

class Number4069 : StressfulInteger {

  companion object {
    private var VALUE = 4069
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2034()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number8139()
      val right = Number8140()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4068()
    val b = Number4067()
    return a.fib() + b.fib()
  }

}

class Number4070 : StressfulInteger {

  companion object {
    private var VALUE = 4070
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2035()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number8141()
      val right = Number8142()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4069()
    val b = Number4068()
    return a.fib() + b.fib()
  }

}

class Number4071 : StressfulInteger {

  companion object {
    private var VALUE = 4071
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2035()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number8143()
      val right = Number8144()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4070()
    val b = Number4069()
    return a.fib() + b.fib()
  }

}

class Number4072 : StressfulInteger {

  companion object {
    private var VALUE = 4072
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2036()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number8145()
      val right = Number8146()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4071()
    val b = Number4070()
    return a.fib() + b.fib()
  }

}

class Number4073 : StressfulInteger {

  companion object {
    private var VALUE = 4073
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2036()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number8147()
      val right = Number8148()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4072()
    val b = Number4071()
    return a.fib() + b.fib()
  }

}

class Number4074 : StressfulInteger {

  companion object {
    private var VALUE = 4074
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2037()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number8149()
      val right = Number8150()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4073()
    val b = Number4072()
    return a.fib() + b.fib()
  }

}

class Number4075 : StressfulInteger {

  companion object {
    private var VALUE = 4075
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2037()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number8151()
      val right = Number8152()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4074()
    val b = Number4073()
    return a.fib() + b.fib()
  }

}

class Number4076 : StressfulInteger {

  companion object {
    private var VALUE = 4076
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2038()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number8153()
      val right = Number8154()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4075()
    val b = Number4074()
    return a.fib() + b.fib()
  }

}

class Number4077 : StressfulInteger {

  companion object {
    private var VALUE = 4077
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2038()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number8155()
      val right = Number8156()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4076()
    val b = Number4075()
    return a.fib() + b.fib()
  }

}

class Number4078 : StressfulInteger {

  companion object {
    private var VALUE = 4078
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2039()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number8157()
      val right = Number8158()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4077()
    val b = Number4076()
    return a.fib() + b.fib()
  }

}

class Number4079 : StressfulInteger {

  companion object {
    private var VALUE = 4079
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2039()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number8159()
      val right = Number8160()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4078()
    val b = Number4077()
    return a.fib() + b.fib()
  }

}

class Number4080 : StressfulInteger {

  companion object {
    private var VALUE = 4080
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2040()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number8161()
      val right = Number8162()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4079()
    val b = Number4078()
    return a.fib() + b.fib()
  }

}

class Number4081 : StressfulInteger {

  companion object {
    private var VALUE = 4081
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2040()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number8163()
      val right = Number8164()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4080()
    val b = Number4079()
    return a.fib() + b.fib()
  }

}

class Number4082 : StressfulInteger {

  companion object {
    private var VALUE = 4082
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2041()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number8165()
      val right = Number8166()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4081()
    val b = Number4080()
    return a.fib() + b.fib()
  }

}

class Number4083 : StressfulInteger {

  companion object {
    private var VALUE = 4083
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2041()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number8167()
      val right = Number8168()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4082()
    val b = Number4081()
    return a.fib() + b.fib()
  }

}

class Number4084 : StressfulInteger {

  companion object {
    private var VALUE = 4084
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2042()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number8169()
      val right = Number8170()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4083()
    val b = Number4082()
    return a.fib() + b.fib()
  }

}

class Number4085 : StressfulInteger {

  companion object {
    private var VALUE = 4085
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2042()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number8171()
      val right = Number8172()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4084()
    val b = Number4083()
    return a.fib() + b.fib()
  }

}

class Number4086 : StressfulInteger {

  companion object {
    private var VALUE = 4086
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2043()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number8173()
      val right = Number8174()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4085()
    val b = Number4084()
    return a.fib() + b.fib()
  }

}

class Number4087 : StressfulInteger {

  companion object {
    private var VALUE = 4087
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2043()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number8175()
      val right = Number8176()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4086()
    val b = Number4085()
    return a.fib() + b.fib()
  }

}

class Number4088 : StressfulInteger {

  companion object {
    private var VALUE = 4088
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2044()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number8177()
      val right = Number8178()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4087()
    val b = Number4086()
    return a.fib() + b.fib()
  }

}

class Number4089 : StressfulInteger {

  companion object {
    private var VALUE = 4089
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2044()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number8179()
      val right = Number8180()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4088()
    val b = Number4087()
    return a.fib() + b.fib()
  }

}

class Number4090 : StressfulInteger {

  companion object {
    private var VALUE = 4090
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2045()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number8181()
      val right = Number8182()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4089()
    val b = Number4088()
    return a.fib() + b.fib()
  }

}

class Number4091 : StressfulInteger {

  companion object {
    private var VALUE = 4091
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2045()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number8183()
      val right = Number8184()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4090()
    val b = Number4089()
    return a.fib() + b.fib()
  }

}

class Number4092 : StressfulInteger {

  companion object {
    private var VALUE = 4092
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2046()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number8185()
      val right = Number8186()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4091()
    val b = Number4090()
    return a.fib() + b.fib()
  }

}

class Number4093 : StressfulInteger {

  companion object {
    private var VALUE = 4093
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2046()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number8187()
      val right = Number8188()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4092()
    val b = Number4091()
    return a.fib() + b.fib()
  }

}

class Number4094 : StressfulInteger {

  companion object {
    private var VALUE = 4094
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2047()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number8189()
      val right = Number8190()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4093()
    val b = Number4092()
    return a.fib() + b.fib()
  }

}

class Number4095 : StressfulInteger {

  companion object {
    private var VALUE = 4095
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2047()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number8191()
      val right = Number8192()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4094()
    val b = Number4093()
    return a.fib() + b.fib()
  }

}

class Number4096 : StressfulInteger {

  companion object {
    private var VALUE = 4096
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2048()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number8193()
      val right = Number8194()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4095()
    val b = Number4094()
    return a.fib() + b.fib()
  }

}

class Number4097 : StressfulInteger {

  companion object {
    private var VALUE = 4097
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2048()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number8195()
      val right = Number8196()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4096()
    val b = Number4095()
    return a.fib() + b.fib()
  }

}

class Number4098 : StressfulInteger {

  companion object {
    private var VALUE = 4098
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2049()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number8197()
      val right = Number8198()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4097()
    val b = Number4096()
    return a.fib() + b.fib()
  }

}

class Number4099 : StressfulInteger {

  companion object {
    private var VALUE = 4099
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2049()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number8199()
      val right = Number8200()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4098()
    val b = Number4097()
    return a.fib() + b.fib()
  }

}

class Number4100 : StressfulInteger {

  companion object {
    private var VALUE = 4100
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2050()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number8201()
      val right = Number8202()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4099()
    val b = Number4098()
    return a.fib() + b.fib()
  }

}

class Number4101 : StressfulInteger {

  companion object {
    private var VALUE = 4101
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2050()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number8203()
      val right = Number8204()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4100()
    val b = Number4099()
    return a.fib() + b.fib()
  }

}

class Number4102 : StressfulInteger {

  companion object {
    private var VALUE = 4102
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2051()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number8205()
      val right = Number8206()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4101()
    val b = Number4100()
    return a.fib() + b.fib()
  }

}

class Number4103 : StressfulInteger {

  companion object {
    private var VALUE = 4103
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2051()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number8207()
      val right = Number8208()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4102()
    val b = Number4101()
    return a.fib() + b.fib()
  }

}

class Number4104 : StressfulInteger {

  companion object {
    private var VALUE = 4104
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2052()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number8209()
      val right = Number8210()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4103()
    val b = Number4102()
    return a.fib() + b.fib()
  }

}

class Number4105 : StressfulInteger {

  companion object {
    private var VALUE = 4105
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2052()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number8211()
      val right = Number8212()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4104()
    val b = Number4103()
    return a.fib() + b.fib()
  }

}

class Number4106 : StressfulInteger {

  companion object {
    private var VALUE = 4106
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2053()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number8213()
      val right = Number8214()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4105()
    val b = Number4104()
    return a.fib() + b.fib()
  }

}

class Number4107 : StressfulInteger {

  companion object {
    private var VALUE = 4107
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2053()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number8215()
      val right = Number8216()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4106()
    val b = Number4105()
    return a.fib() + b.fib()
  }

}

class Number4108 : StressfulInteger {

  companion object {
    private var VALUE = 4108
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2054()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number8217()
      val right = Number8218()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4107()
    val b = Number4106()
    return a.fib() + b.fib()
  }

}

class Number4109 : StressfulInteger {

  companion object {
    private var VALUE = 4109
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2054()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number8219()
      val right = Number8220()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4108()
    val b = Number4107()
    return a.fib() + b.fib()
  }

}

class Number4110 : StressfulInteger {

  companion object {
    private var VALUE = 4110
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2055()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number8221()
      val right = Number8222()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4109()
    val b = Number4108()
    return a.fib() + b.fib()
  }

}

class Number4111 : StressfulInteger {

  companion object {
    private var VALUE = 4111
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2055()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number8223()
      val right = Number8224()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4110()
    val b = Number4109()
    return a.fib() + b.fib()
  }

}

class Number4112 : StressfulInteger {

  companion object {
    private var VALUE = 4112
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2056()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number8225()
      val right = Number8226()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4111()
    val b = Number4110()
    return a.fib() + b.fib()
  }

}

class Number4113 : StressfulInteger {

  companion object {
    private var VALUE = 4113
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2056()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number8227()
      val right = Number8228()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4112()
    val b = Number4111()
    return a.fib() + b.fib()
  }

}

class Number4114 : StressfulInteger {

  companion object {
    private var VALUE = 4114
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2057()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number8229()
      val right = Number8230()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4113()
    val b = Number4112()
    return a.fib() + b.fib()
  }

}

class Number4115 : StressfulInteger {

  companion object {
    private var VALUE = 4115
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2057()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number8231()
      val right = Number8232()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4114()
    val b = Number4113()
    return a.fib() + b.fib()
  }

}

class Number4116 : StressfulInteger {

  companion object {
    private var VALUE = 4116
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2058()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number8233()
      val right = Number8234()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4115()
    val b = Number4114()
    return a.fib() + b.fib()
  }

}

class Number4117 : StressfulInteger {

  companion object {
    private var VALUE = 4117
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2058()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number8235()
      val right = Number8236()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4116()
    val b = Number4115()
    return a.fib() + b.fib()
  }

}

class Number4118 : StressfulInteger {

  companion object {
    private var VALUE = 4118
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2059()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number8237()
      val right = Number8238()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4117()
    val b = Number4116()
    return a.fib() + b.fib()
  }

}

class Number4119 : StressfulInteger {

  companion object {
    private var VALUE = 4119
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2059()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number8239()
      val right = Number8240()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4118()
    val b = Number4117()
    return a.fib() + b.fib()
  }

}

class Number4120 : StressfulInteger {

  companion object {
    private var VALUE = 4120
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2060()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number8241()
      val right = Number8242()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4119()
    val b = Number4118()
    return a.fib() + b.fib()
  }

}

class Number4121 : StressfulInteger {

  companion object {
    private var VALUE = 4121
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2060()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number8243()
      val right = Number8244()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4120()
    val b = Number4119()
    return a.fib() + b.fib()
  }

}

class Number4122 : StressfulInteger {

  companion object {
    private var VALUE = 4122
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2061()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number8245()
      val right = Number8246()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4121()
    val b = Number4120()
    return a.fib() + b.fib()
  }

}

class Number4123 : StressfulInteger {

  companion object {
    private var VALUE = 4123
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2061()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number8247()
      val right = Number8248()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4122()
    val b = Number4121()
    return a.fib() + b.fib()
  }

}

class Number4124 : StressfulInteger {

  companion object {
    private var VALUE = 4124
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2062()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number8249()
      val right = Number8250()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4123()
    val b = Number4122()
    return a.fib() + b.fib()
  }

}

class Number4125 : StressfulInteger {

  companion object {
    private var VALUE = 4125
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2062()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number8251()
      val right = Number8252()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4124()
    val b = Number4123()
    return a.fib() + b.fib()
  }

}

class Number4126 : StressfulInteger {

  companion object {
    private var VALUE = 4126
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2063()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number8253()
      val right = Number8254()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4125()
    val b = Number4124()
    return a.fib() + b.fib()
  }

}

class Number4127 : StressfulInteger {

  companion object {
    private var VALUE = 4127
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2063()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number8255()
      val right = Number8256()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4126()
    val b = Number4125()
    return a.fib() + b.fib()
  }

}

class Number4128 : StressfulInteger {

  companion object {
    private var VALUE = 4128
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2064()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number8257()
      val right = Number8258()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4127()
    val b = Number4126()
    return a.fib() + b.fib()
  }

}

class Number4129 : StressfulInteger {

  companion object {
    private var VALUE = 4129
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2064()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number8259()
      val right = Number8260()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4128()
    val b = Number4127()
    return a.fib() + b.fib()
  }

}

class Number4130 : StressfulInteger {

  companion object {
    private var VALUE = 4130
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2065()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number8261()
      val right = Number8262()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4129()
    val b = Number4128()
    return a.fib() + b.fib()
  }

}

class Number4131 : StressfulInteger {

  companion object {
    private var VALUE = 4131
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2065()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number8263()
      val right = Number8264()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4130()
    val b = Number4129()
    return a.fib() + b.fib()
  }

}

class Number4132 : StressfulInteger {

  companion object {
    private var VALUE = 4132
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2066()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number8265()
      val right = Number8266()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4131()
    val b = Number4130()
    return a.fib() + b.fib()
  }

}

class Number4133 : StressfulInteger {

  companion object {
    private var VALUE = 4133
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2066()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number8267()
      val right = Number8268()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4132()
    val b = Number4131()
    return a.fib() + b.fib()
  }

}

class Number4134 : StressfulInteger {

  companion object {
    private var VALUE = 4134
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2067()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number8269()
      val right = Number8270()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4133()
    val b = Number4132()
    return a.fib() + b.fib()
  }

}

class Number4135 : StressfulInteger {

  companion object {
    private var VALUE = 4135
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2067()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number8271()
      val right = Number8272()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4134()
    val b = Number4133()
    return a.fib() + b.fib()
  }

}

class Number4136 : StressfulInteger {

  companion object {
    private var VALUE = 4136
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2068()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number8273()
      val right = Number8274()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4135()
    val b = Number4134()
    return a.fib() + b.fib()
  }

}

class Number4137 : StressfulInteger {

  companion object {
    private var VALUE = 4137
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2068()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number8275()
      val right = Number8276()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4136()
    val b = Number4135()
    return a.fib() + b.fib()
  }

}

class Number4138 : StressfulInteger {

  companion object {
    private var VALUE = 4138
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2069()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number8277()
      val right = Number8278()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4137()
    val b = Number4136()
    return a.fib() + b.fib()
  }

}

class Number4139 : StressfulInteger {

  companion object {
    private var VALUE = 4139
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2069()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number8279()
      val right = Number8280()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4138()
    val b = Number4137()
    return a.fib() + b.fib()
  }

}

class Number4140 : StressfulInteger {

  companion object {
    private var VALUE = 4140
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2070()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number8281()
      val right = Number8282()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4139()
    val b = Number4138()
    return a.fib() + b.fib()
  }

}

class Number4141 : StressfulInteger {

  companion object {
    private var VALUE = 4141
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2070()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number8283()
      val right = Number8284()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4140()
    val b = Number4139()
    return a.fib() + b.fib()
  }

}

class Number4142 : StressfulInteger {

  companion object {
    private var VALUE = 4142
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2071()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number8285()
      val right = Number8286()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4141()
    val b = Number4140()
    return a.fib() + b.fib()
  }

}

class Number4143 : StressfulInteger {

  companion object {
    private var VALUE = 4143
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2071()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number8287()
      val right = Number8288()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4142()
    val b = Number4141()
    return a.fib() + b.fib()
  }

}

class Number4144 : StressfulInteger {

  companion object {
    private var VALUE = 4144
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2072()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number8289()
      val right = Number8290()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4143()
    val b = Number4142()
    return a.fib() + b.fib()
  }

}

class Number4145 : StressfulInteger {

  companion object {
    private var VALUE = 4145
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2072()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number8291()
      val right = Number8292()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4144()
    val b = Number4143()
    return a.fib() + b.fib()
  }

}

class Number4146 : StressfulInteger {

  companion object {
    private var VALUE = 4146
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2073()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number8293()
      val right = Number8294()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4145()
    val b = Number4144()
    return a.fib() + b.fib()
  }

}

class Number4147 : StressfulInteger {

  companion object {
    private var VALUE = 4147
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2073()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number8295()
      val right = Number8296()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4146()
    val b = Number4145()
    return a.fib() + b.fib()
  }

}

class Number4148 : StressfulInteger {

  companion object {
    private var VALUE = 4148
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2074()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number8297()
      val right = Number8298()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4147()
    val b = Number4146()
    return a.fib() + b.fib()
  }

}

class Number4149 : StressfulInteger {

  companion object {
    private var VALUE = 4149
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2074()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number8299()
      val right = Number8300()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4148()
    val b = Number4147()
    return a.fib() + b.fib()
  }

}

class Number4150 : StressfulInteger {

  companion object {
    private var VALUE = 4150
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2075()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number8301()
      val right = Number8302()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4149()
    val b = Number4148()
    return a.fib() + b.fib()
  }

}

class Number4151 : StressfulInteger {

  companion object {
    private var VALUE = 4151
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2075()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number8303()
      val right = Number8304()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4150()
    val b = Number4149()
    return a.fib() + b.fib()
  }

}

class Number4152 : StressfulInteger {

  companion object {
    private var VALUE = 4152
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2076()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number8305()
      val right = Number8306()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4151()
    val b = Number4150()
    return a.fib() + b.fib()
  }

}

class Number4153 : StressfulInteger {

  companion object {
    private var VALUE = 4153
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2076()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number8307()
      val right = Number8308()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4152()
    val b = Number4151()
    return a.fib() + b.fib()
  }

}

class Number4154 : StressfulInteger {

  companion object {
    private var VALUE = 4154
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2077()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number8309()
      val right = Number8310()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4153()
    val b = Number4152()
    return a.fib() + b.fib()
  }

}

class Number4155 : StressfulInteger {

  companion object {
    private var VALUE = 4155
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2077()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number8311()
      val right = Number8312()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4154()
    val b = Number4153()
    return a.fib() + b.fib()
  }

}

class Number4156 : StressfulInteger {

  companion object {
    private var VALUE = 4156
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2078()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number8313()
      val right = Number8314()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4155()
    val b = Number4154()
    return a.fib() + b.fib()
  }

}

class Number4157 : StressfulInteger {

  companion object {
    private var VALUE = 4157
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2078()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number8315()
      val right = Number8316()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4156()
    val b = Number4155()
    return a.fib() + b.fib()
  }

}

class Number4158 : StressfulInteger {

  companion object {
    private var VALUE = 4158
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2079()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number8317()
      val right = Number8318()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4157()
    val b = Number4156()
    return a.fib() + b.fib()
  }

}

class Number4159 : StressfulInteger {

  companion object {
    private var VALUE = 4159
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2079()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number8319()
      val right = Number8320()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4158()
    val b = Number4157()
    return a.fib() + b.fib()
  }

}

class Number4160 : StressfulInteger {

  companion object {
    private var VALUE = 4160
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2080()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number8321()
      val right = Number8322()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4159()
    val b = Number4158()
    return a.fib() + b.fib()
  }

}

class Number4161 : StressfulInteger {

  companion object {
    private var VALUE = 4161
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2080()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number8323()
      val right = Number8324()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4160()
    val b = Number4159()
    return a.fib() + b.fib()
  }

}

class Number4162 : StressfulInteger {

  companion object {
    private var VALUE = 4162
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2081()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number8325()
      val right = Number8326()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4161()
    val b = Number4160()
    return a.fib() + b.fib()
  }

}

class Number4163 : StressfulInteger {

  companion object {
    private var VALUE = 4163
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2081()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number8327()
      val right = Number8328()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4162()
    val b = Number4161()
    return a.fib() + b.fib()
  }

}

class Number4164 : StressfulInteger {

  companion object {
    private var VALUE = 4164
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2082()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number8329()
      val right = Number8330()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4163()
    val b = Number4162()
    return a.fib() + b.fib()
  }

}

class Number4165 : StressfulInteger {

  companion object {
    private var VALUE = 4165
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2082()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number8331()
      val right = Number8332()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4164()
    val b = Number4163()
    return a.fib() + b.fib()
  }

}

class Number4166 : StressfulInteger {

  companion object {
    private var VALUE = 4166
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2083()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number8333()
      val right = Number8334()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4165()
    val b = Number4164()
    return a.fib() + b.fib()
  }

}

class Number4167 : StressfulInteger {

  companion object {
    private var VALUE = 4167
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2083()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number8335()
      val right = Number8336()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4166()
    val b = Number4165()
    return a.fib() + b.fib()
  }

}

class Number4168 : StressfulInteger {

  companion object {
    private var VALUE = 4168
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2084()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number8337()
      val right = Number8338()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4167()
    val b = Number4166()
    return a.fib() + b.fib()
  }

}

class Number4169 : StressfulInteger {

  companion object {
    private var VALUE = 4169
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2084()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number8339()
      val right = Number8340()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4168()
    val b = Number4167()
    return a.fib() + b.fib()
  }

}

class Number4170 : StressfulInteger {

  companion object {
    private var VALUE = 4170
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2085()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number8341()
      val right = Number8342()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4169()
    val b = Number4168()
    return a.fib() + b.fib()
  }

}

class Number4171 : StressfulInteger {

  companion object {
    private var VALUE = 4171
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2085()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number8343()
      val right = Number8344()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4170()
    val b = Number4169()
    return a.fib() + b.fib()
  }

}

class Number4172 : StressfulInteger {

  companion object {
    private var VALUE = 4172
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2086()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number8345()
      val right = Number8346()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4171()
    val b = Number4170()
    return a.fib() + b.fib()
  }

}

class Number4173 : StressfulInteger {

  companion object {
    private var VALUE = 4173
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2086()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number8347()
      val right = Number8348()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4172()
    val b = Number4171()
    return a.fib() + b.fib()
  }

}

class Number4174 : StressfulInteger {

  companion object {
    private var VALUE = 4174
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2087()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number8349()
      val right = Number8350()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4173()
    val b = Number4172()
    return a.fib() + b.fib()
  }

}

class Number4175 : StressfulInteger {

  companion object {
    private var VALUE = 4175
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2087()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number8351()
      val right = Number8352()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4174()
    val b = Number4173()
    return a.fib() + b.fib()
  }

}

class Number4176 : StressfulInteger {

  companion object {
    private var VALUE = 4176
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2088()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number8353()
      val right = Number8354()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4175()
    val b = Number4174()
    return a.fib() + b.fib()
  }

}

class Number4177 : StressfulInteger {

  companion object {
    private var VALUE = 4177
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2088()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number8355()
      val right = Number8356()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4176()
    val b = Number4175()
    return a.fib() + b.fib()
  }

}

class Number4178 : StressfulInteger {

  companion object {
    private var VALUE = 4178
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2089()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number8357()
      val right = Number8358()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4177()
    val b = Number4176()
    return a.fib() + b.fib()
  }

}

class Number4179 : StressfulInteger {

  companion object {
    private var VALUE = 4179
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2089()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number8359()
      val right = Number8360()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4178()
    val b = Number4177()
    return a.fib() + b.fib()
  }

}

class Number4180 : StressfulInteger {

  companion object {
    private var VALUE = 4180
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2090()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number8361()
      val right = Number8362()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4179()
    val b = Number4178()
    return a.fib() + b.fib()
  }

}

class Number4181 : StressfulInteger {

  companion object {
    private var VALUE = 4181
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2090()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number8363()
      val right = Number8364()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4180()
    val b = Number4179()
    return a.fib() + b.fib()
  }

}

class Number4182 : StressfulInteger {

  companion object {
    private var VALUE = 4182
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2091()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number8365()
      val right = Number8366()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4181()
    val b = Number4180()
    return a.fib() + b.fib()
  }

}

class Number4183 : StressfulInteger {

  companion object {
    private var VALUE = 4183
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2091()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number8367()
      val right = Number8368()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4182()
    val b = Number4181()
    return a.fib() + b.fib()
  }

}

class Number4184 : StressfulInteger {

  companion object {
    private var VALUE = 4184
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2092()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number8369()
      val right = Number8370()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4183()
    val b = Number4182()
    return a.fib() + b.fib()
  }

}

class Number4185 : StressfulInteger {

  companion object {
    private var VALUE = 4185
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2092()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number8371()
      val right = Number8372()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4184()
    val b = Number4183()
    return a.fib() + b.fib()
  }

}

class Number4186 : StressfulInteger {

  companion object {
    private var VALUE = 4186
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2093()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number8373()
      val right = Number8374()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4185()
    val b = Number4184()
    return a.fib() + b.fib()
  }

}

class Number4187 : StressfulInteger {

  companion object {
    private var VALUE = 4187
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2093()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number8375()
      val right = Number8376()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4186()
    val b = Number4185()
    return a.fib() + b.fib()
  }

}

class Number4188 : StressfulInteger {

  companion object {
    private var VALUE = 4188
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2094()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number8377()
      val right = Number8378()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4187()
    val b = Number4186()
    return a.fib() + b.fib()
  }

}

class Number4189 : StressfulInteger {

  companion object {
    private var VALUE = 4189
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2094()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number8379()
      val right = Number8380()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4188()
    val b = Number4187()
    return a.fib() + b.fib()
  }

}

class Number4190 : StressfulInteger {

  companion object {
    private var VALUE = 4190
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2095()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number8381()
      val right = Number8382()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4189()
    val b = Number4188()
    return a.fib() + b.fib()
  }

}

class Number4191 : StressfulInteger {

  companion object {
    private var VALUE = 4191
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2095()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number8383()
      val right = Number8384()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4190()
    val b = Number4189()
    return a.fib() + b.fib()
  }

}

class Number4192 : StressfulInteger {

  companion object {
    private var VALUE = 4192
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2096()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number8385()
      val right = Number8386()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4191()
    val b = Number4190()
    return a.fib() + b.fib()
  }

}

class Number4193 : StressfulInteger {

  companion object {
    private var VALUE = 4193
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2096()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number8387()
      val right = Number8388()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4192()
    val b = Number4191()
    return a.fib() + b.fib()
  }

}

class Number4194 : StressfulInteger {

  companion object {
    private var VALUE = 4194
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2097()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number8389()
      val right = Number8390()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4193()
    val b = Number4192()
    return a.fib() + b.fib()
  }

}

class Number4195 : StressfulInteger {

  companion object {
    private var VALUE = 4195
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2097()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number8391()
      val right = Number8392()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4194()
    val b = Number4193()
    return a.fib() + b.fib()
  }

}

class Number4196 : StressfulInteger {

  companion object {
    private var VALUE = 4196
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2098()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number8393()
      val right = Number8394()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4195()
    val b = Number4194()
    return a.fib() + b.fib()
  }

}

class Number4197 : StressfulInteger {

  companion object {
    private var VALUE = 4197
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2098()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number8395()
      val right = Number8396()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4196()
    val b = Number4195()
    return a.fib() + b.fib()
  }

}

class Number4198 : StressfulInteger {

  companion object {
    private var VALUE = 4198
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2099()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number8397()
      val right = Number8398()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4197()
    val b = Number4196()
    return a.fib() + b.fib()
  }

}

class Number4199 : StressfulInteger {

  companion object {
    private var VALUE = 4199
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2099()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number8399()
      val right = Number8400()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4198()
    val b = Number4197()
    return a.fib() + b.fib()
  }

}

class Number4200 : StressfulInteger {

  companion object {
    private var VALUE = 4200
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2100()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number8401()
      val right = Number8402()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4199()
    val b = Number4198()
    return a.fib() + b.fib()
  }

}

class Number4201 : StressfulInteger {

  companion object {
    private var VALUE = 4201
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2100()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number8403()
      val right = Number8404()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4200()
    val b = Number4199()
    return a.fib() + b.fib()
  }

}

class Number4202 : StressfulInteger {

  companion object {
    private var VALUE = 4202
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2101()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number8405()
      val right = Number8406()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4201()
    val b = Number4200()
    return a.fib() + b.fib()
  }

}

class Number4203 : StressfulInteger {

  companion object {
    private var VALUE = 4203
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2101()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number8407()
      val right = Number8408()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4202()
    val b = Number4201()
    return a.fib() + b.fib()
  }

}

class Number4204 : StressfulInteger {

  companion object {
    private var VALUE = 4204
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2102()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number8409()
      val right = Number8410()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4203()
    val b = Number4202()
    return a.fib() + b.fib()
  }

}

class Number4205 : StressfulInteger {

  companion object {
    private var VALUE = 4205
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2102()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number8411()
      val right = Number8412()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4204()
    val b = Number4203()
    return a.fib() + b.fib()
  }

}

class Number4206 : StressfulInteger {

  companion object {
    private var VALUE = 4206
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2103()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number8413()
      val right = Number8414()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4205()
    val b = Number4204()
    return a.fib() + b.fib()
  }

}

class Number4207 : StressfulInteger {

  companion object {
    private var VALUE = 4207
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2103()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number8415()
      val right = Number8416()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4206()
    val b = Number4205()
    return a.fib() + b.fib()
  }

}

class Number4208 : StressfulInteger {

  companion object {
    private var VALUE = 4208
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2104()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number8417()
      val right = Number8418()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4207()
    val b = Number4206()
    return a.fib() + b.fib()
  }

}

class Number4209 : StressfulInteger {

  companion object {
    private var VALUE = 4209
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2104()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number8419()
      val right = Number8420()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4208()
    val b = Number4207()
    return a.fib() + b.fib()
  }

}

class Number4210 : StressfulInteger {

  companion object {
    private var VALUE = 4210
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2105()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number8421()
      val right = Number8422()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4209()
    val b = Number4208()
    return a.fib() + b.fib()
  }

}

class Number4211 : StressfulInteger {

  companion object {
    private var VALUE = 4211
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2105()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number8423()
      val right = Number8424()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4210()
    val b = Number4209()
    return a.fib() + b.fib()
  }

}

class Number4212 : StressfulInteger {

  companion object {
    private var VALUE = 4212
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2106()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number8425()
      val right = Number8426()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4211()
    val b = Number4210()
    return a.fib() + b.fib()
  }

}

class Number4213 : StressfulInteger {

  companion object {
    private var VALUE = 4213
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2106()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number8427()
      val right = Number8428()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4212()
    val b = Number4211()
    return a.fib() + b.fib()
  }

}

class Number4214 : StressfulInteger {

  companion object {
    private var VALUE = 4214
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2107()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number8429()
      val right = Number8430()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4213()
    val b = Number4212()
    return a.fib() + b.fib()
  }

}

class Number4215 : StressfulInteger {

  companion object {
    private var VALUE = 4215
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2107()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number8431()
      val right = Number8432()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4214()
    val b = Number4213()
    return a.fib() + b.fib()
  }

}

class Number4216 : StressfulInteger {

  companion object {
    private var VALUE = 4216
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2108()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number8433()
      val right = Number8434()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4215()
    val b = Number4214()
    return a.fib() + b.fib()
  }

}

class Number4217 : StressfulInteger {

  companion object {
    private var VALUE = 4217
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2108()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number8435()
      val right = Number8436()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4216()
    val b = Number4215()
    return a.fib() + b.fib()
  }

}

class Number4218 : StressfulInteger {

  companion object {
    private var VALUE = 4218
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2109()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number8437()
      val right = Number8438()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4217()
    val b = Number4216()
    return a.fib() + b.fib()
  }

}

class Number4219 : StressfulInteger {

  companion object {
    private var VALUE = 4219
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2109()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number8439()
      val right = Number8440()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4218()
    val b = Number4217()
    return a.fib() + b.fib()
  }

}

class Number4220 : StressfulInteger {

  companion object {
    private var VALUE = 4220
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2110()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number8441()
      val right = Number8442()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4219()
    val b = Number4218()
    return a.fib() + b.fib()
  }

}

class Number4221 : StressfulInteger {

  companion object {
    private var VALUE = 4221
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2110()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number8443()
      val right = Number8444()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4220()
    val b = Number4219()
    return a.fib() + b.fib()
  }

}

class Number4222 : StressfulInteger {

  companion object {
    private var VALUE = 4222
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2111()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number8445()
      val right = Number8446()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4221()
    val b = Number4220()
    return a.fib() + b.fib()
  }

}

class Number4223 : StressfulInteger {

  companion object {
    private var VALUE = 4223
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2111()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number8447()
      val right = Number8448()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4222()
    val b = Number4221()
    return a.fib() + b.fib()
  }

}

class Number4224 : StressfulInteger {

  companion object {
    private var VALUE = 4224
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2112()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number8449()
      val right = Number8450()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4223()
    val b = Number4222()
    return a.fib() + b.fib()
  }

}

class Number4225 : StressfulInteger {

  companion object {
    private var VALUE = 4225
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2112()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number8451()
      val right = Number8452()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4224()
    val b = Number4223()
    return a.fib() + b.fib()
  }

}

class Number4226 : StressfulInteger {

  companion object {
    private var VALUE = 4226
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2113()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number8453()
      val right = Number8454()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4225()
    val b = Number4224()
    return a.fib() + b.fib()
  }

}

class Number4227 : StressfulInteger {

  companion object {
    private var VALUE = 4227
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2113()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number8455()
      val right = Number8456()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4226()
    val b = Number4225()
    return a.fib() + b.fib()
  }

}

class Number4228 : StressfulInteger {

  companion object {
    private var VALUE = 4228
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2114()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number8457()
      val right = Number8458()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4227()
    val b = Number4226()
    return a.fib() + b.fib()
  }

}

class Number4229 : StressfulInteger {

  companion object {
    private var VALUE = 4229
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2114()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number8459()
      val right = Number8460()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4228()
    val b = Number4227()
    return a.fib() + b.fib()
  }

}

class Number4230 : StressfulInteger {

  companion object {
    private var VALUE = 4230
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2115()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number8461()
      val right = Number8462()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4229()
    val b = Number4228()
    return a.fib() + b.fib()
  }

}

class Number4231 : StressfulInteger {

  companion object {
    private var VALUE = 4231
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2115()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number8463()
      val right = Number8464()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4230()
    val b = Number4229()
    return a.fib() + b.fib()
  }

}

class Number4232 : StressfulInteger {

  companion object {
    private var VALUE = 4232
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2116()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number8465()
      val right = Number8466()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4231()
    val b = Number4230()
    return a.fib() + b.fib()
  }

}

class Number4233 : StressfulInteger {

  companion object {
    private var VALUE = 4233
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2116()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number8467()
      val right = Number8468()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4232()
    val b = Number4231()
    return a.fib() + b.fib()
  }

}

class Number4234 : StressfulInteger {

  companion object {
    private var VALUE = 4234
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2117()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number8469()
      val right = Number8470()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4233()
    val b = Number4232()
    return a.fib() + b.fib()
  }

}

class Number4235 : StressfulInteger {

  companion object {
    private var VALUE = 4235
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2117()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number8471()
      val right = Number8472()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4234()
    val b = Number4233()
    return a.fib() + b.fib()
  }

}

class Number4236 : StressfulInteger {

  companion object {
    private var VALUE = 4236
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2118()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number8473()
      val right = Number8474()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4235()
    val b = Number4234()
    return a.fib() + b.fib()
  }

}

class Number4237 : StressfulInteger {

  companion object {
    private var VALUE = 4237
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2118()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number8475()
      val right = Number8476()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4236()
    val b = Number4235()
    return a.fib() + b.fib()
  }

}

class Number4238 : StressfulInteger {

  companion object {
    private var VALUE = 4238
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2119()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number8477()
      val right = Number8478()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4237()
    val b = Number4236()
    return a.fib() + b.fib()
  }

}

class Number4239 : StressfulInteger {

  companion object {
    private var VALUE = 4239
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2119()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number8479()
      val right = Number8480()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4238()
    val b = Number4237()
    return a.fib() + b.fib()
  }

}

class Number4240 : StressfulInteger {

  companion object {
    private var VALUE = 4240
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2120()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number8481()
      val right = Number8482()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4239()
    val b = Number4238()
    return a.fib() + b.fib()
  }

}

class Number4241 : StressfulInteger {

  companion object {
    private var VALUE = 4241
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2120()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number8483()
      val right = Number8484()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4240()
    val b = Number4239()
    return a.fib() + b.fib()
  }

}

class Number4242 : StressfulInteger {

  companion object {
    private var VALUE = 4242
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2121()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number8485()
      val right = Number8486()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4241()
    val b = Number4240()
    return a.fib() + b.fib()
  }

}

class Number4243 : StressfulInteger {

  companion object {
    private var VALUE = 4243
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2121()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number8487()
      val right = Number8488()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4242()
    val b = Number4241()
    return a.fib() + b.fib()
  }

}

class Number4244 : StressfulInteger {

  companion object {
    private var VALUE = 4244
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2122()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number8489()
      val right = Number8490()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4243()
    val b = Number4242()
    return a.fib() + b.fib()
  }

}

class Number4245 : StressfulInteger {

  companion object {
    private var VALUE = 4245
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2122()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number8491()
      val right = Number8492()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4244()
    val b = Number4243()
    return a.fib() + b.fib()
  }

}

class Number4246 : StressfulInteger {

  companion object {
    private var VALUE = 4246
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2123()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number8493()
      val right = Number8494()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4245()
    val b = Number4244()
    return a.fib() + b.fib()
  }

}

class Number4247 : StressfulInteger {

  companion object {
    private var VALUE = 4247
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2123()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number8495()
      val right = Number8496()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4246()
    val b = Number4245()
    return a.fib() + b.fib()
  }

}

class Number4248 : StressfulInteger {

  companion object {
    private var VALUE = 4248
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2124()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number8497()
      val right = Number8498()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4247()
    val b = Number4246()
    return a.fib() + b.fib()
  }

}

class Number4249 : StressfulInteger {

  companion object {
    private var VALUE = 4249
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2124()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number8499()
      val right = Number8500()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4248()
    val b = Number4247()
    return a.fib() + b.fib()
  }

}

class Number4250 : StressfulInteger {

  companion object {
    private var VALUE = 4250
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2125()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number8501()
      val right = Number8502()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4249()
    val b = Number4248()
    return a.fib() + b.fib()
  }

}

class Number4251 : StressfulInteger {

  companion object {
    private var VALUE = 4251
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2125()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number8503()
      val right = Number8504()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4250()
    val b = Number4249()
    return a.fib() + b.fib()
  }

}

class Number4252 : StressfulInteger {

  companion object {
    private var VALUE = 4252
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2126()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number8505()
      val right = Number8506()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4251()
    val b = Number4250()
    return a.fib() + b.fib()
  }

}

class Number4253 : StressfulInteger {

  companion object {
    private var VALUE = 4253
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2126()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number8507()
      val right = Number8508()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4252()
    val b = Number4251()
    return a.fib() + b.fib()
  }

}

class Number4254 : StressfulInteger {

  companion object {
    private var VALUE = 4254
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2127()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number8509()
      val right = Number8510()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4253()
    val b = Number4252()
    return a.fib() + b.fib()
  }

}

class Number4255 : StressfulInteger {

  companion object {
    private var VALUE = 4255
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2127()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number8511()
      val right = Number8512()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4254()
    val b = Number4253()
    return a.fib() + b.fib()
  }

}

class Number4256 : StressfulInteger {

  companion object {
    private var VALUE = 4256
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2128()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number8513()
      val right = Number8514()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4255()
    val b = Number4254()
    return a.fib() + b.fib()
  }

}

class Number4257 : StressfulInteger {

  companion object {
    private var VALUE = 4257
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2128()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number8515()
      val right = Number8516()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4256()
    val b = Number4255()
    return a.fib() + b.fib()
  }

}

class Number4258 : StressfulInteger {

  companion object {
    private var VALUE = 4258
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2129()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number8517()
      val right = Number8518()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4257()
    val b = Number4256()
    return a.fib() + b.fib()
  }

}

class Number4259 : StressfulInteger {

  companion object {
    private var VALUE = 4259
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2129()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number8519()
      val right = Number8520()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4258()
    val b = Number4257()
    return a.fib() + b.fib()
  }

}

class Number4260 : StressfulInteger {

  companion object {
    private var VALUE = 4260
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2130()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number8521()
      val right = Number8522()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4259()
    val b = Number4258()
    return a.fib() + b.fib()
  }

}

class Number4261 : StressfulInteger {

  companion object {
    private var VALUE = 4261
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2130()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number8523()
      val right = Number8524()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4260()
    val b = Number4259()
    return a.fib() + b.fib()
  }

}

class Number4262 : StressfulInteger {

  companion object {
    private var VALUE = 4262
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2131()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number8525()
      val right = Number8526()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4261()
    val b = Number4260()
    return a.fib() + b.fib()
  }

}

class Number4263 : StressfulInteger {

  companion object {
    private var VALUE = 4263
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2131()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number8527()
      val right = Number8528()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4262()
    val b = Number4261()
    return a.fib() + b.fib()
  }

}

class Number4264 : StressfulInteger {

  companion object {
    private var VALUE = 4264
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2132()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number8529()
      val right = Number8530()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4263()
    val b = Number4262()
    return a.fib() + b.fib()
  }

}

class Number4265 : StressfulInteger {

  companion object {
    private var VALUE = 4265
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2132()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number8531()
      val right = Number8532()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4264()
    val b = Number4263()
    return a.fib() + b.fib()
  }

}

class Number4266 : StressfulInteger {

  companion object {
    private var VALUE = 4266
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2133()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number8533()
      val right = Number8534()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4265()
    val b = Number4264()
    return a.fib() + b.fib()
  }

}

class Number4267 : StressfulInteger {

  companion object {
    private var VALUE = 4267
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2133()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number8535()
      val right = Number8536()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4266()
    val b = Number4265()
    return a.fib() + b.fib()
  }

}

class Number4268 : StressfulInteger {

  companion object {
    private var VALUE = 4268
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2134()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number8537()
      val right = Number8538()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4267()
    val b = Number4266()
    return a.fib() + b.fib()
  }

}

class Number4269 : StressfulInteger {

  companion object {
    private var VALUE = 4269
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2134()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number8539()
      val right = Number8540()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4268()
    val b = Number4267()
    return a.fib() + b.fib()
  }

}

class Number4270 : StressfulInteger {

  companion object {
    private var VALUE = 4270
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2135()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number8541()
      val right = Number8542()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4269()
    val b = Number4268()
    return a.fib() + b.fib()
  }

}

class Number4271 : StressfulInteger {

  companion object {
    private var VALUE = 4271
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2135()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number8543()
      val right = Number8544()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4270()
    val b = Number4269()
    return a.fib() + b.fib()
  }

}

class Number4272 : StressfulInteger {

  companion object {
    private var VALUE = 4272
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2136()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number8545()
      val right = Number8546()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4271()
    val b = Number4270()
    return a.fib() + b.fib()
  }

}

class Number4273 : StressfulInteger {

  companion object {
    private var VALUE = 4273
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2136()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number8547()
      val right = Number8548()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4272()
    val b = Number4271()
    return a.fib() + b.fib()
  }

}

class Number4274 : StressfulInteger {

  companion object {
    private var VALUE = 4274
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2137()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number8549()
      val right = Number8550()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4273()
    val b = Number4272()
    return a.fib() + b.fib()
  }

}

class Number4275 : StressfulInteger {

  companion object {
    private var VALUE = 4275
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2137()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number8551()
      val right = Number8552()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4274()
    val b = Number4273()
    return a.fib() + b.fib()
  }

}

class Number4276 : StressfulInteger {

  companion object {
    private var VALUE = 4276
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2138()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number8553()
      val right = Number8554()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4275()
    val b = Number4274()
    return a.fib() + b.fib()
  }

}

class Number4277 : StressfulInteger {

  companion object {
    private var VALUE = 4277
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2138()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number8555()
      val right = Number8556()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4276()
    val b = Number4275()
    return a.fib() + b.fib()
  }

}

class Number4278 : StressfulInteger {

  companion object {
    private var VALUE = 4278
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2139()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number8557()
      val right = Number8558()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4277()
    val b = Number4276()
    return a.fib() + b.fib()
  }

}

class Number4279 : StressfulInteger {

  companion object {
    private var VALUE = 4279
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2139()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number8559()
      val right = Number8560()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4278()
    val b = Number4277()
    return a.fib() + b.fib()
  }

}

class Number4280 : StressfulInteger {

  companion object {
    private var VALUE = 4280
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2140()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number8561()
      val right = Number8562()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4279()
    val b = Number4278()
    return a.fib() + b.fib()
  }

}

class Number4281 : StressfulInteger {

  companion object {
    private var VALUE = 4281
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2140()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number8563()
      val right = Number8564()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4280()
    val b = Number4279()
    return a.fib() + b.fib()
  }

}

class Number4282 : StressfulInteger {

  companion object {
    private var VALUE = 4282
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2141()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number8565()
      val right = Number8566()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4281()
    val b = Number4280()
    return a.fib() + b.fib()
  }

}

class Number4283 : StressfulInteger {

  companion object {
    private var VALUE = 4283
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2141()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number8567()
      val right = Number8568()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4282()
    val b = Number4281()
    return a.fib() + b.fib()
  }

}

class Number4284 : StressfulInteger {

  companion object {
    private var VALUE = 4284
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2142()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number8569()
      val right = Number8570()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4283()
    val b = Number4282()
    return a.fib() + b.fib()
  }

}

class Number4285 : StressfulInteger {

  companion object {
    private var VALUE = 4285
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2142()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number8571()
      val right = Number8572()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4284()
    val b = Number4283()
    return a.fib() + b.fib()
  }

}

class Number4286 : StressfulInteger {

  companion object {
    private var VALUE = 4286
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2143()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number8573()
      val right = Number8574()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4285()
    val b = Number4284()
    return a.fib() + b.fib()
  }

}

class Number4287 : StressfulInteger {

  companion object {
    private var VALUE = 4287
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2143()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number8575()
      val right = Number8576()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4286()
    val b = Number4285()
    return a.fib() + b.fib()
  }

}

class Number4288 : StressfulInteger {

  companion object {
    private var VALUE = 4288
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2144()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number8577()
      val right = Number8578()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4287()
    val b = Number4286()
    return a.fib() + b.fib()
  }

}

class Number4289 : StressfulInteger {

  companion object {
    private var VALUE = 4289
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2144()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number8579()
      val right = Number8580()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4288()
    val b = Number4287()
    return a.fib() + b.fib()
  }

}

class Number4290 : StressfulInteger {

  companion object {
    private var VALUE = 4290
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2145()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number8581()
      val right = Number8582()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4289()
    val b = Number4288()
    return a.fib() + b.fib()
  }

}

class Number4291 : StressfulInteger {

  companion object {
    private var VALUE = 4291
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2145()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number8583()
      val right = Number8584()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4290()
    val b = Number4289()
    return a.fib() + b.fib()
  }

}

class Number4292 : StressfulInteger {

  companion object {
    private var VALUE = 4292
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2146()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number8585()
      val right = Number8586()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4291()
    val b = Number4290()
    return a.fib() + b.fib()
  }

}

class Number4293 : StressfulInteger {

  companion object {
    private var VALUE = 4293
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2146()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number8587()
      val right = Number8588()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4292()
    val b = Number4291()
    return a.fib() + b.fib()
  }

}

class Number4294 : StressfulInteger {

  companion object {
    private var VALUE = 4294
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2147()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number8589()
      val right = Number8590()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4293()
    val b = Number4292()
    return a.fib() + b.fib()
  }

}

class Number4295 : StressfulInteger {

  companion object {
    private var VALUE = 4295
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2147()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number8591()
      val right = Number8592()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4294()
    val b = Number4293()
    return a.fib() + b.fib()
  }

}

class Number4296 : StressfulInteger {

  companion object {
    private var VALUE = 4296
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2148()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number8593()
      val right = Number8594()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4295()
    val b = Number4294()
    return a.fib() + b.fib()
  }

}

class Number4297 : StressfulInteger {

  companion object {
    private var VALUE = 4297
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2148()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number8595()
      val right = Number8596()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4296()
    val b = Number4295()
    return a.fib() + b.fib()
  }

}

class Number4298 : StressfulInteger {

  companion object {
    private var VALUE = 4298
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2149()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number8597()
      val right = Number8598()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4297()
    val b = Number4296()
    return a.fib() + b.fib()
  }

}

class Number4299 : StressfulInteger {

  companion object {
    private var VALUE = 4299
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2149()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number8599()
      val right = Number8600()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4298()
    val b = Number4297()
    return a.fib() + b.fib()
  }

}

class Number4300 : StressfulInteger {

  companion object {
    private var VALUE = 4300
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2150()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number8601()
      val right = Number8602()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4299()
    val b = Number4298()
    return a.fib() + b.fib()
  }

}

class Number4301 : StressfulInteger {

  companion object {
    private var VALUE = 4301
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2150()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number8603()
      val right = Number8604()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4300()
    val b = Number4299()
    return a.fib() + b.fib()
  }

}

class Number4302 : StressfulInteger {

  companion object {
    private var VALUE = 4302
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2151()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number8605()
      val right = Number8606()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4301()
    val b = Number4300()
    return a.fib() + b.fib()
  }

}

class Number4303 : StressfulInteger {

  companion object {
    private var VALUE = 4303
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2151()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number8607()
      val right = Number8608()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4302()
    val b = Number4301()
    return a.fib() + b.fib()
  }

}

class Number4304 : StressfulInteger {

  companion object {
    private var VALUE = 4304
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2152()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number8609()
      val right = Number8610()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4303()
    val b = Number4302()
    return a.fib() + b.fib()
  }

}

class Number4305 : StressfulInteger {

  companion object {
    private var VALUE = 4305
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2152()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number8611()
      val right = Number8612()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4304()
    val b = Number4303()
    return a.fib() + b.fib()
  }

}

class Number4306 : StressfulInteger {

  companion object {
    private var VALUE = 4306
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2153()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number8613()
      val right = Number8614()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4305()
    val b = Number4304()
    return a.fib() + b.fib()
  }

}

class Number4307 : StressfulInteger {

  companion object {
    private var VALUE = 4307
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2153()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number8615()
      val right = Number8616()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4306()
    val b = Number4305()
    return a.fib() + b.fib()
  }

}

class Number4308 : StressfulInteger {

  companion object {
    private var VALUE = 4308
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2154()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number8617()
      val right = Number8618()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4307()
    val b = Number4306()
    return a.fib() + b.fib()
  }

}

class Number4309 : StressfulInteger {

  companion object {
    private var VALUE = 4309
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2154()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number8619()
      val right = Number8620()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4308()
    val b = Number4307()
    return a.fib() + b.fib()
  }

}

class Number4310 : StressfulInteger {

  companion object {
    private var VALUE = 4310
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2155()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number8621()
      val right = Number8622()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4309()
    val b = Number4308()
    return a.fib() + b.fib()
  }

}

class Number4311 : StressfulInteger {

  companion object {
    private var VALUE = 4311
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2155()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number8623()
      val right = Number8624()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4310()
    val b = Number4309()
    return a.fib() + b.fib()
  }

}

class Number4312 : StressfulInteger {

  companion object {
    private var VALUE = 4312
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2156()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number8625()
      val right = Number8626()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4311()
    val b = Number4310()
    return a.fib() + b.fib()
  }

}

class Number4313 : StressfulInteger {

  companion object {
    private var VALUE = 4313
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2156()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number8627()
      val right = Number8628()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4312()
    val b = Number4311()
    return a.fib() + b.fib()
  }

}

class Number4314 : StressfulInteger {

  companion object {
    private var VALUE = 4314
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2157()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number8629()
      val right = Number8630()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4313()
    val b = Number4312()
    return a.fib() + b.fib()
  }

}

class Number4315 : StressfulInteger {

  companion object {
    private var VALUE = 4315
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2157()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number8631()
      val right = Number8632()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4314()
    val b = Number4313()
    return a.fib() + b.fib()
  }

}

class Number4316 : StressfulInteger {

  companion object {
    private var VALUE = 4316
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2158()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number8633()
      val right = Number8634()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4315()
    val b = Number4314()
    return a.fib() + b.fib()
  }

}

class Number4317 : StressfulInteger {

  companion object {
    private var VALUE = 4317
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2158()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number8635()
      val right = Number8636()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4316()
    val b = Number4315()
    return a.fib() + b.fib()
  }

}

class Number4318 : StressfulInteger {

  companion object {
    private var VALUE = 4318
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2159()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number8637()
      val right = Number8638()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4317()
    val b = Number4316()
    return a.fib() + b.fib()
  }

}

class Number4319 : StressfulInteger {

  companion object {
    private var VALUE = 4319
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2159()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number8639()
      val right = Number8640()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4318()
    val b = Number4317()
    return a.fib() + b.fib()
  }

}

class Number4320 : StressfulInteger {

  companion object {
    private var VALUE = 4320
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2160()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number8641()
      val right = Number8642()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4319()
    val b = Number4318()
    return a.fib() + b.fib()
  }

}

class Number4321 : StressfulInteger {

  companion object {
    private var VALUE = 4321
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2160()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number8643()
      val right = Number8644()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4320()
    val b = Number4319()
    return a.fib() + b.fib()
  }

}

class Number4322 : StressfulInteger {

  companion object {
    private var VALUE = 4322
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2161()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number8645()
      val right = Number8646()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4321()
    val b = Number4320()
    return a.fib() + b.fib()
  }

}

class Number4323 : StressfulInteger {

  companion object {
    private var VALUE = 4323
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2161()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number8647()
      val right = Number8648()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4322()
    val b = Number4321()
    return a.fib() + b.fib()
  }

}

class Number4324 : StressfulInteger {

  companion object {
    private var VALUE = 4324
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2162()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number8649()
      val right = Number8650()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4323()
    val b = Number4322()
    return a.fib() + b.fib()
  }

}

class Number4325 : StressfulInteger {

  companion object {
    private var VALUE = 4325
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2162()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number8651()
      val right = Number8652()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4324()
    val b = Number4323()
    return a.fib() + b.fib()
  }

}

class Number4326 : StressfulInteger {

  companion object {
    private var VALUE = 4326
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2163()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number8653()
      val right = Number8654()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4325()
    val b = Number4324()
    return a.fib() + b.fib()
  }

}

class Number4327 : StressfulInteger {

  companion object {
    private var VALUE = 4327
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2163()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number8655()
      val right = Number8656()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4326()
    val b = Number4325()
    return a.fib() + b.fib()
  }

}

class Number4328 : StressfulInteger {

  companion object {
    private var VALUE = 4328
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2164()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number8657()
      val right = Number8658()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4327()
    val b = Number4326()
    return a.fib() + b.fib()
  }

}

class Number4329 : StressfulInteger {

  companion object {
    private var VALUE = 4329
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2164()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number8659()
      val right = Number8660()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4328()
    val b = Number4327()
    return a.fib() + b.fib()
  }

}

class Number4330 : StressfulInteger {

  companion object {
    private var VALUE = 4330
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2165()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number8661()
      val right = Number8662()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4329()
    val b = Number4328()
    return a.fib() + b.fib()
  }

}

class Number4331 : StressfulInteger {

  companion object {
    private var VALUE = 4331
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2165()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number8663()
      val right = Number8664()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4330()
    val b = Number4329()
    return a.fib() + b.fib()
  }

}

class Number4332 : StressfulInteger {

  companion object {
    private var VALUE = 4332
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2166()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number8665()
      val right = Number8666()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4331()
    val b = Number4330()
    return a.fib() + b.fib()
  }

}

class Number4333 : StressfulInteger {

  companion object {
    private var VALUE = 4333
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2166()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number8667()
      val right = Number8668()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4332()
    val b = Number4331()
    return a.fib() + b.fib()
  }

}

class Number4334 : StressfulInteger {

  companion object {
    private var VALUE = 4334
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2167()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number8669()
      val right = Number8670()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4333()
    val b = Number4332()
    return a.fib() + b.fib()
  }

}

class Number4335 : StressfulInteger {

  companion object {
    private var VALUE = 4335
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2167()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number8671()
      val right = Number8672()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4334()
    val b = Number4333()
    return a.fib() + b.fib()
  }

}

class Number4336 : StressfulInteger {

  companion object {
    private var VALUE = 4336
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2168()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number8673()
      val right = Number8674()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4335()
    val b = Number4334()
    return a.fib() + b.fib()
  }

}

class Number4337 : StressfulInteger {

  companion object {
    private var VALUE = 4337
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2168()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number8675()
      val right = Number8676()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4336()
    val b = Number4335()
    return a.fib() + b.fib()
  }

}

class Number4338 : StressfulInteger {

  companion object {
    private var VALUE = 4338
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2169()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number8677()
      val right = Number8678()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4337()
    val b = Number4336()
    return a.fib() + b.fib()
  }

}

class Number4339 : StressfulInteger {

  companion object {
    private var VALUE = 4339
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2169()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number8679()
      val right = Number8680()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4338()
    val b = Number4337()
    return a.fib() + b.fib()
  }

}

class Number4340 : StressfulInteger {

  companion object {
    private var VALUE = 4340
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2170()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number8681()
      val right = Number8682()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4339()
    val b = Number4338()
    return a.fib() + b.fib()
  }

}

class Number4341 : StressfulInteger {

  companion object {
    private var VALUE = 4341
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2170()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number8683()
      val right = Number8684()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4340()
    val b = Number4339()
    return a.fib() + b.fib()
  }

}

class Number4342 : StressfulInteger {

  companion object {
    private var VALUE = 4342
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2171()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number8685()
      val right = Number8686()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4341()
    val b = Number4340()
    return a.fib() + b.fib()
  }

}

class Number4343 : StressfulInteger {

  companion object {
    private var VALUE = 4343
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2171()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number8687()
      val right = Number8688()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4342()
    val b = Number4341()
    return a.fib() + b.fib()
  }

}

class Number4344 : StressfulInteger {

  companion object {
    private var VALUE = 4344
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2172()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number8689()
      val right = Number8690()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4343()
    val b = Number4342()
    return a.fib() + b.fib()
  }

}

class Number4345 : StressfulInteger {

  companion object {
    private var VALUE = 4345
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2172()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number8691()
      val right = Number8692()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4344()
    val b = Number4343()
    return a.fib() + b.fib()
  }

}

class Number4346 : StressfulInteger {

  companion object {
    private var VALUE = 4346
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2173()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number8693()
      val right = Number8694()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4345()
    val b = Number4344()
    return a.fib() + b.fib()
  }

}

class Number4347 : StressfulInteger {

  companion object {
    private var VALUE = 4347
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2173()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number8695()
      val right = Number8696()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4346()
    val b = Number4345()
    return a.fib() + b.fib()
  }

}

class Number4348 : StressfulInteger {

  companion object {
    private var VALUE = 4348
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2174()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number8697()
      val right = Number8698()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4347()
    val b = Number4346()
    return a.fib() + b.fib()
  }

}

class Number4349 : StressfulInteger {

  companion object {
    private var VALUE = 4349
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2174()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number8699()
      val right = Number8700()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4348()
    val b = Number4347()
    return a.fib() + b.fib()
  }

}

class Number4350 : StressfulInteger {

  companion object {
    private var VALUE = 4350
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2175()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number8701()
      val right = Number8702()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4349()
    val b = Number4348()
    return a.fib() + b.fib()
  }

}

class Number4351 : StressfulInteger {

  companion object {
    private var VALUE = 4351
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2175()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number8703()
      val right = Number8704()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4350()
    val b = Number4349()
    return a.fib() + b.fib()
  }

}

class Number4352 : StressfulInteger {

  companion object {
    private var VALUE = 4352
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2176()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number8705()
      val right = Number8706()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4351()
    val b = Number4350()
    return a.fib() + b.fib()
  }

}

class Number4353 : StressfulInteger {

  companion object {
    private var VALUE = 4353
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2176()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number8707()
      val right = Number8708()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4352()
    val b = Number4351()
    return a.fib() + b.fib()
  }

}

class Number4354 : StressfulInteger {

  companion object {
    private var VALUE = 4354
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2177()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number8709()
      val right = Number8710()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4353()
    val b = Number4352()
    return a.fib() + b.fib()
  }

}

class Number4355 : StressfulInteger {

  companion object {
    private var VALUE = 4355
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2177()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number8711()
      val right = Number8712()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4354()
    val b = Number4353()
    return a.fib() + b.fib()
  }

}

class Number4356 : StressfulInteger {

  companion object {
    private var VALUE = 4356
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2178()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number8713()
      val right = Number8714()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4355()
    val b = Number4354()
    return a.fib() + b.fib()
  }

}

class Number4357 : StressfulInteger {

  companion object {
    private var VALUE = 4357
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2178()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number8715()
      val right = Number8716()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4356()
    val b = Number4355()
    return a.fib() + b.fib()
  }

}

class Number4358 : StressfulInteger {

  companion object {
    private var VALUE = 4358
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2179()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number8717()
      val right = Number8718()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4357()
    val b = Number4356()
    return a.fib() + b.fib()
  }

}

class Number4359 : StressfulInteger {

  companion object {
    private var VALUE = 4359
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2179()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number8719()
      val right = Number8720()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4358()
    val b = Number4357()
    return a.fib() + b.fib()
  }

}

class Number4360 : StressfulInteger {

  companion object {
    private var VALUE = 4360
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2180()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number8721()
      val right = Number8722()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4359()
    val b = Number4358()
    return a.fib() + b.fib()
  }

}

class Number4361 : StressfulInteger {

  companion object {
    private var VALUE = 4361
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2180()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number8723()
      val right = Number8724()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4360()
    val b = Number4359()
    return a.fib() + b.fib()
  }

}

class Number4362 : StressfulInteger {

  companion object {
    private var VALUE = 4362
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2181()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number8725()
      val right = Number8726()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4361()
    val b = Number4360()
    return a.fib() + b.fib()
  }

}

class Number4363 : StressfulInteger {

  companion object {
    private var VALUE = 4363
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2181()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number8727()
      val right = Number8728()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4362()
    val b = Number4361()
    return a.fib() + b.fib()
  }

}

class Number4364 : StressfulInteger {

  companion object {
    private var VALUE = 4364
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2182()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number8729()
      val right = Number8730()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4363()
    val b = Number4362()
    return a.fib() + b.fib()
  }

}

class Number4365 : StressfulInteger {

  companion object {
    private var VALUE = 4365
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2182()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number8731()
      val right = Number8732()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4364()
    val b = Number4363()
    return a.fib() + b.fib()
  }

}

class Number4366 : StressfulInteger {

  companion object {
    private var VALUE = 4366
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2183()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number8733()
      val right = Number8734()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4365()
    val b = Number4364()
    return a.fib() + b.fib()
  }

}

class Number4367 : StressfulInteger {

  companion object {
    private var VALUE = 4367
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2183()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number8735()
      val right = Number8736()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4366()
    val b = Number4365()
    return a.fib() + b.fib()
  }

}

class Number4368 : StressfulInteger {

  companion object {
    private var VALUE = 4368
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2184()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number8737()
      val right = Number8738()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4367()
    val b = Number4366()
    return a.fib() + b.fib()
  }

}

class Number4369 : StressfulInteger {

  companion object {
    private var VALUE = 4369
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2184()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number8739()
      val right = Number8740()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4368()
    val b = Number4367()
    return a.fib() + b.fib()
  }

}

class Number4370 : StressfulInteger {

  companion object {
    private var VALUE = 4370
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2185()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number8741()
      val right = Number8742()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4369()
    val b = Number4368()
    return a.fib() + b.fib()
  }

}

class Number4371 : StressfulInteger {

  companion object {
    private var VALUE = 4371
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2185()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number8743()
      val right = Number8744()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4370()
    val b = Number4369()
    return a.fib() + b.fib()
  }

}

class Number4372 : StressfulInteger {

  companion object {
    private var VALUE = 4372
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2186()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number8745()
      val right = Number8746()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4371()
    val b = Number4370()
    return a.fib() + b.fib()
  }

}

class Number4373 : StressfulInteger {

  companion object {
    private var VALUE = 4373
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2186()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number8747()
      val right = Number8748()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4372()
    val b = Number4371()
    return a.fib() + b.fib()
  }

}

class Number4374 : StressfulInteger {

  companion object {
    private var VALUE = 4374
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2187()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number8749()
      val right = Number8750()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4373()
    val b = Number4372()
    return a.fib() + b.fib()
  }

}

class Number4375 : StressfulInteger {

  companion object {
    private var VALUE = 4375
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2187()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number8751()
      val right = Number8752()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4374()
    val b = Number4373()
    return a.fib() + b.fib()
  }

}

class Number4376 : StressfulInteger {

  companion object {
    private var VALUE = 4376
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2188()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number8753()
      val right = Number8754()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4375()
    val b = Number4374()
    return a.fib() + b.fib()
  }

}

class Number4377 : StressfulInteger {

  companion object {
    private var VALUE = 4377
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2188()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number8755()
      val right = Number8756()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4376()
    val b = Number4375()
    return a.fib() + b.fib()
  }

}

class Number4378 : StressfulInteger {

  companion object {
    private var VALUE = 4378
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2189()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number8757()
      val right = Number8758()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4377()
    val b = Number4376()
    return a.fib() + b.fib()
  }

}

class Number4379 : StressfulInteger {

  companion object {
    private var VALUE = 4379
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2189()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number8759()
      val right = Number8760()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4378()
    val b = Number4377()
    return a.fib() + b.fib()
  }

}

class Number4380 : StressfulInteger {

  companion object {
    private var VALUE = 4380
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2190()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number8761()
      val right = Number8762()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4379()
    val b = Number4378()
    return a.fib() + b.fib()
  }

}

class Number4381 : StressfulInteger {

  companion object {
    private var VALUE = 4381
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2190()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number8763()
      val right = Number8764()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4380()
    val b = Number4379()
    return a.fib() + b.fib()
  }

}

class Number4382 : StressfulInteger {

  companion object {
    private var VALUE = 4382
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2191()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number8765()
      val right = Number8766()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4381()
    val b = Number4380()
    return a.fib() + b.fib()
  }

}

class Number4383 : StressfulInteger {

  companion object {
    private var VALUE = 4383
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2191()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number8767()
      val right = Number8768()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4382()
    val b = Number4381()
    return a.fib() + b.fib()
  }

}

class Number4384 : StressfulInteger {

  companion object {
    private var VALUE = 4384
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2192()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number8769()
      val right = Number8770()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4383()
    val b = Number4382()
    return a.fib() + b.fib()
  }

}

class Number4385 : StressfulInteger {

  companion object {
    private var VALUE = 4385
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2192()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number8771()
      val right = Number8772()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4384()
    val b = Number4383()
    return a.fib() + b.fib()
  }

}

class Number4386 : StressfulInteger {

  companion object {
    private var VALUE = 4386
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2193()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number8773()
      val right = Number8774()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4385()
    val b = Number4384()
    return a.fib() + b.fib()
  }

}

class Number4387 : StressfulInteger {

  companion object {
    private var VALUE = 4387
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2193()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number8775()
      val right = Number8776()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4386()
    val b = Number4385()
    return a.fib() + b.fib()
  }

}

class Number4388 : StressfulInteger {

  companion object {
    private var VALUE = 4388
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2194()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number8777()
      val right = Number8778()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4387()
    val b = Number4386()
    return a.fib() + b.fib()
  }

}

class Number4389 : StressfulInteger {

  companion object {
    private var VALUE = 4389
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2194()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number8779()
      val right = Number8780()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4388()
    val b = Number4387()
    return a.fib() + b.fib()
  }

}

class Number4390 : StressfulInteger {

  companion object {
    private var VALUE = 4390
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2195()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number8781()
      val right = Number8782()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4389()
    val b = Number4388()
    return a.fib() + b.fib()
  }

}

class Number4391 : StressfulInteger {

  companion object {
    private var VALUE = 4391
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2195()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number8783()
      val right = Number8784()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4390()
    val b = Number4389()
    return a.fib() + b.fib()
  }

}

class Number4392 : StressfulInteger {

  companion object {
    private var VALUE = 4392
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2196()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number8785()
      val right = Number8786()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4391()
    val b = Number4390()
    return a.fib() + b.fib()
  }

}

class Number4393 : StressfulInteger {

  companion object {
    private var VALUE = 4393
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2196()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number8787()
      val right = Number8788()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4392()
    val b = Number4391()
    return a.fib() + b.fib()
  }

}

class Number4394 : StressfulInteger {

  companion object {
    private var VALUE = 4394
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2197()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number8789()
      val right = Number8790()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4393()
    val b = Number4392()
    return a.fib() + b.fib()
  }

}

class Number4395 : StressfulInteger {

  companion object {
    private var VALUE = 4395
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2197()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number8791()
      val right = Number8792()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4394()
    val b = Number4393()
    return a.fib() + b.fib()
  }

}

class Number4396 : StressfulInteger {

  companion object {
    private var VALUE = 4396
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2198()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number8793()
      val right = Number8794()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4395()
    val b = Number4394()
    return a.fib() + b.fib()
  }

}

class Number4397 : StressfulInteger {

  companion object {
    private var VALUE = 4397
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2198()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number8795()
      val right = Number8796()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4396()
    val b = Number4395()
    return a.fib() + b.fib()
  }

}

class Number4398 : StressfulInteger {

  companion object {
    private var VALUE = 4398
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2199()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number8797()
      val right = Number8798()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4397()
    val b = Number4396()
    return a.fib() + b.fib()
  }

}

class Number4399 : StressfulInteger {

  companion object {
    private var VALUE = 4399
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2199()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number8799()
      val right = Number8800()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4398()
    val b = Number4397()
    return a.fib() + b.fib()
  }

}

class Number4400 : StressfulInteger {

  companion object {
    private var VALUE = 4400
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2200()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number8801()
      val right = Number8802()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4399()
    val b = Number4398()
    return a.fib() + b.fib()
  }

}

class Number4401 : StressfulInteger {

  companion object {
    private var VALUE = 4401
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2200()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number8803()
      val right = Number8804()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4400()
    val b = Number4399()
    return a.fib() + b.fib()
  }

}

class Number4402 : StressfulInteger {

  companion object {
    private var VALUE = 4402
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2201()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number8805()
      val right = Number8806()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4401()
    val b = Number4400()
    return a.fib() + b.fib()
  }

}

class Number4403 : StressfulInteger {

  companion object {
    private var VALUE = 4403
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2201()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number8807()
      val right = Number8808()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4402()
    val b = Number4401()
    return a.fib() + b.fib()
  }

}

class Number4404 : StressfulInteger {

  companion object {
    private var VALUE = 4404
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2202()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number8809()
      val right = Number8810()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4403()
    val b = Number4402()
    return a.fib() + b.fib()
  }

}

class Number4405 : StressfulInteger {

  companion object {
    private var VALUE = 4405
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2202()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number8811()
      val right = Number8812()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4404()
    val b = Number4403()
    return a.fib() + b.fib()
  }

}

class Number4406 : StressfulInteger {

  companion object {
    private var VALUE = 4406
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2203()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number8813()
      val right = Number8814()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4405()
    val b = Number4404()
    return a.fib() + b.fib()
  }

}

class Number4407 : StressfulInteger {

  companion object {
    private var VALUE = 4407
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2203()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number8815()
      val right = Number8816()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4406()
    val b = Number4405()
    return a.fib() + b.fib()
  }

}

class Number4408 : StressfulInteger {

  companion object {
    private var VALUE = 4408
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2204()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number8817()
      val right = Number8818()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4407()
    val b = Number4406()
    return a.fib() + b.fib()
  }

}

class Number4409 : StressfulInteger {

  companion object {
    private var VALUE = 4409
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2204()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number8819()
      val right = Number8820()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4408()
    val b = Number4407()
    return a.fib() + b.fib()
  }

}

class Number4410 : StressfulInteger {

  companion object {
    private var VALUE = 4410
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2205()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number8821()
      val right = Number8822()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4409()
    val b = Number4408()
    return a.fib() + b.fib()
  }

}

class Number4411 : StressfulInteger {

  companion object {
    private var VALUE = 4411
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2205()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number8823()
      val right = Number8824()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4410()
    val b = Number4409()
    return a.fib() + b.fib()
  }

}

class Number4412 : StressfulInteger {

  companion object {
    private var VALUE = 4412
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2206()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number8825()
      val right = Number8826()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4411()
    val b = Number4410()
    return a.fib() + b.fib()
  }

}

class Number4413 : StressfulInteger {

  companion object {
    private var VALUE = 4413
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2206()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number8827()
      val right = Number8828()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4412()
    val b = Number4411()
    return a.fib() + b.fib()
  }

}

class Number4414 : StressfulInteger {

  companion object {
    private var VALUE = 4414
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2207()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number8829()
      val right = Number8830()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4413()
    val b = Number4412()
    return a.fib() + b.fib()
  }

}

class Number4415 : StressfulInteger {

  companion object {
    private var VALUE = 4415
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2207()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number8831()
      val right = Number8832()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4414()
    val b = Number4413()
    return a.fib() + b.fib()
  }

}

class Number4416 : StressfulInteger {

  companion object {
    private var VALUE = 4416
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2208()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number8833()
      val right = Number8834()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4415()
    val b = Number4414()
    return a.fib() + b.fib()
  }

}

class Number4417 : StressfulInteger {

  companion object {
    private var VALUE = 4417
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2208()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number8835()
      val right = Number8836()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4416()
    val b = Number4415()
    return a.fib() + b.fib()
  }

}

class Number4418 : StressfulInteger {

  companion object {
    private var VALUE = 4418
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2209()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number8837()
      val right = Number8838()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4417()
    val b = Number4416()
    return a.fib() + b.fib()
  }

}

class Number4419 : StressfulInteger {

  companion object {
    private var VALUE = 4419
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2209()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number8839()
      val right = Number8840()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4418()
    val b = Number4417()
    return a.fib() + b.fib()
  }

}

class Number4420 : StressfulInteger {

  companion object {
    private var VALUE = 4420
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2210()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number8841()
      val right = Number8842()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4419()
    val b = Number4418()
    return a.fib() + b.fib()
  }

}

class Number4421 : StressfulInteger {

  companion object {
    private var VALUE = 4421
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2210()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number8843()
      val right = Number8844()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4420()
    val b = Number4419()
    return a.fib() + b.fib()
  }

}

class Number4422 : StressfulInteger {

  companion object {
    private var VALUE = 4422
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2211()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number8845()
      val right = Number8846()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4421()
    val b = Number4420()
    return a.fib() + b.fib()
  }

}

class Number4423 : StressfulInteger {

  companion object {
    private var VALUE = 4423
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2211()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number8847()
      val right = Number8848()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4422()
    val b = Number4421()
    return a.fib() + b.fib()
  }

}

class Number4424 : StressfulInteger {

  companion object {
    private var VALUE = 4424
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2212()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number8849()
      val right = Number8850()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4423()
    val b = Number4422()
    return a.fib() + b.fib()
  }

}

class Number4425 : StressfulInteger {

  companion object {
    private var VALUE = 4425
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2212()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number8851()
      val right = Number8852()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4424()
    val b = Number4423()
    return a.fib() + b.fib()
  }

}

class Number4426 : StressfulInteger {

  companion object {
    private var VALUE = 4426
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2213()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number8853()
      val right = Number8854()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4425()
    val b = Number4424()
    return a.fib() + b.fib()
  }

}

class Number4427 : StressfulInteger {

  companion object {
    private var VALUE = 4427
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2213()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number8855()
      val right = Number8856()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4426()
    val b = Number4425()
    return a.fib() + b.fib()
  }

}

class Number4428 : StressfulInteger {

  companion object {
    private var VALUE = 4428
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2214()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number8857()
      val right = Number8858()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4427()
    val b = Number4426()
    return a.fib() + b.fib()
  }

}

class Number4429 : StressfulInteger {

  companion object {
    private var VALUE = 4429
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2214()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number8859()
      val right = Number8860()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4428()
    val b = Number4427()
    return a.fib() + b.fib()
  }

}

class Number4430 : StressfulInteger {

  companion object {
    private var VALUE = 4430
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2215()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number8861()
      val right = Number8862()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4429()
    val b = Number4428()
    return a.fib() + b.fib()
  }

}

class Number4431 : StressfulInteger {

  companion object {
    private var VALUE = 4431
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2215()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number8863()
      val right = Number8864()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4430()
    val b = Number4429()
    return a.fib() + b.fib()
  }

}

class Number4432 : StressfulInteger {

  companion object {
    private var VALUE = 4432
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2216()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number8865()
      val right = Number8866()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4431()
    val b = Number4430()
    return a.fib() + b.fib()
  }

}

class Number4433 : StressfulInteger {

  companion object {
    private var VALUE = 4433
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2216()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number8867()
      val right = Number8868()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4432()
    val b = Number4431()
    return a.fib() + b.fib()
  }

}

class Number4434 : StressfulInteger {

  companion object {
    private var VALUE = 4434
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2217()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number8869()
      val right = Number8870()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4433()
    val b = Number4432()
    return a.fib() + b.fib()
  }

}

class Number4435 : StressfulInteger {

  companion object {
    private var VALUE = 4435
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2217()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number8871()
      val right = Number8872()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4434()
    val b = Number4433()
    return a.fib() + b.fib()
  }

}

class Number4436 : StressfulInteger {

  companion object {
    private var VALUE = 4436
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2218()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number8873()
      val right = Number8874()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4435()
    val b = Number4434()
    return a.fib() + b.fib()
  }

}

class Number4437 : StressfulInteger {

  companion object {
    private var VALUE = 4437
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2218()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number8875()
      val right = Number8876()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4436()
    val b = Number4435()
    return a.fib() + b.fib()
  }

}

class Number4438 : StressfulInteger {

  companion object {
    private var VALUE = 4438
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2219()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number8877()
      val right = Number8878()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4437()
    val b = Number4436()
    return a.fib() + b.fib()
  }

}

class Number4439 : StressfulInteger {

  companion object {
    private var VALUE = 4439
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2219()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number8879()
      val right = Number8880()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4438()
    val b = Number4437()
    return a.fib() + b.fib()
  }

}

class Number4440 : StressfulInteger {

  companion object {
    private var VALUE = 4440
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2220()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number8881()
      val right = Number8882()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4439()
    val b = Number4438()
    return a.fib() + b.fib()
  }

}

class Number4441 : StressfulInteger {

  companion object {
    private var VALUE = 4441
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2220()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number8883()
      val right = Number8884()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4440()
    val b = Number4439()
    return a.fib() + b.fib()
  }

}

class Number4442 : StressfulInteger {

  companion object {
    private var VALUE = 4442
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2221()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number8885()
      val right = Number8886()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4441()
    val b = Number4440()
    return a.fib() + b.fib()
  }

}

class Number4443 : StressfulInteger {

  companion object {
    private var VALUE = 4443
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2221()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number8887()
      val right = Number8888()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4442()
    val b = Number4441()
    return a.fib() + b.fib()
  }

}

class Number4444 : StressfulInteger {

  companion object {
    private var VALUE = 4444
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2222()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number8889()
      val right = Number8890()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4443()
    val b = Number4442()
    return a.fib() + b.fib()
  }

}

class Number4445 : StressfulInteger {

  companion object {
    private var VALUE = 4445
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2222()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number8891()
      val right = Number8892()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4444()
    val b = Number4443()
    return a.fib() + b.fib()
  }

}

class Number4446 : StressfulInteger {

  companion object {
    private var VALUE = 4446
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2223()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number8893()
      val right = Number8894()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4445()
    val b = Number4444()
    return a.fib() + b.fib()
  }

}

class Number4447 : StressfulInteger {

  companion object {
    private var VALUE = 4447
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2223()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number8895()
      val right = Number8896()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4446()
    val b = Number4445()
    return a.fib() + b.fib()
  }

}

class Number4448 : StressfulInteger {

  companion object {
    private var VALUE = 4448
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2224()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number8897()
      val right = Number8898()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4447()
    val b = Number4446()
    return a.fib() + b.fib()
  }

}

class Number4449 : StressfulInteger {

  companion object {
    private var VALUE = 4449
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2224()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number8899()
      val right = Number8900()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4448()
    val b = Number4447()
    return a.fib() + b.fib()
  }

}

class Number4450 : StressfulInteger {

  companion object {
    private var VALUE = 4450
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2225()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number8901()
      val right = Number8902()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4449()
    val b = Number4448()
    return a.fib() + b.fib()
  }

}

class Number4451 : StressfulInteger {

  companion object {
    private var VALUE = 4451
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2225()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number8903()
      val right = Number8904()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4450()
    val b = Number4449()
    return a.fib() + b.fib()
  }

}

class Number4452 : StressfulInteger {

  companion object {
    private var VALUE = 4452
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2226()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number8905()
      val right = Number8906()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4451()
    val b = Number4450()
    return a.fib() + b.fib()
  }

}

class Number4453 : StressfulInteger {

  companion object {
    private var VALUE = 4453
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2226()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number8907()
      val right = Number8908()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4452()
    val b = Number4451()
    return a.fib() + b.fib()
  }

}

class Number4454 : StressfulInteger {

  companion object {
    private var VALUE = 4454
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2227()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number8909()
      val right = Number8910()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4453()
    val b = Number4452()
    return a.fib() + b.fib()
  }

}

class Number4455 : StressfulInteger {

  companion object {
    private var VALUE = 4455
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2227()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number8911()
      val right = Number8912()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4454()
    val b = Number4453()
    return a.fib() + b.fib()
  }

}

class Number4456 : StressfulInteger {

  companion object {
    private var VALUE = 4456
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2228()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number8913()
      val right = Number8914()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4455()
    val b = Number4454()
    return a.fib() + b.fib()
  }

}

class Number4457 : StressfulInteger {

  companion object {
    private var VALUE = 4457
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2228()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number8915()
      val right = Number8916()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4456()
    val b = Number4455()
    return a.fib() + b.fib()
  }

}

class Number4458 : StressfulInteger {

  companion object {
    private var VALUE = 4458
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2229()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number8917()
      val right = Number8918()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4457()
    val b = Number4456()
    return a.fib() + b.fib()
  }

}

class Number4459 : StressfulInteger {

  companion object {
    private var VALUE = 4459
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2229()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number8919()
      val right = Number8920()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4458()
    val b = Number4457()
    return a.fib() + b.fib()
  }

}

class Number4460 : StressfulInteger {

  companion object {
    private var VALUE = 4460
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2230()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number8921()
      val right = Number8922()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4459()
    val b = Number4458()
    return a.fib() + b.fib()
  }

}

class Number4461 : StressfulInteger {

  companion object {
    private var VALUE = 4461
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2230()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number8923()
      val right = Number8924()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4460()
    val b = Number4459()
    return a.fib() + b.fib()
  }

}

class Number4462 : StressfulInteger {

  companion object {
    private var VALUE = 4462
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2231()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number8925()
      val right = Number8926()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4461()
    val b = Number4460()
    return a.fib() + b.fib()
  }

}

class Number4463 : StressfulInteger {

  companion object {
    private var VALUE = 4463
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2231()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number8927()
      val right = Number8928()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4462()
    val b = Number4461()
    return a.fib() + b.fib()
  }

}

class Number4464 : StressfulInteger {

  companion object {
    private var VALUE = 4464
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2232()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number8929()
      val right = Number8930()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4463()
    val b = Number4462()
    return a.fib() + b.fib()
  }

}

class Number4465 : StressfulInteger {

  companion object {
    private var VALUE = 4465
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2232()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number8931()
      val right = Number8932()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4464()
    val b = Number4463()
    return a.fib() + b.fib()
  }

}

class Number4466 : StressfulInteger {

  companion object {
    private var VALUE = 4466
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2233()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number8933()
      val right = Number8934()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4465()
    val b = Number4464()
    return a.fib() + b.fib()
  }

}

class Number4467 : StressfulInteger {

  companion object {
    private var VALUE = 4467
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2233()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number8935()
      val right = Number8936()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4466()
    val b = Number4465()
    return a.fib() + b.fib()
  }

}

class Number4468 : StressfulInteger {

  companion object {
    private var VALUE = 4468
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2234()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number8937()
      val right = Number8938()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4467()
    val b = Number4466()
    return a.fib() + b.fib()
  }

}

class Number4469 : StressfulInteger {

  companion object {
    private var VALUE = 4469
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2234()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number8939()
      val right = Number8940()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4468()
    val b = Number4467()
    return a.fib() + b.fib()
  }

}

class Number4470 : StressfulInteger {

  companion object {
    private var VALUE = 4470
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2235()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number8941()
      val right = Number8942()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4469()
    val b = Number4468()
    return a.fib() + b.fib()
  }

}

class Number4471 : StressfulInteger {

  companion object {
    private var VALUE = 4471
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2235()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number8943()
      val right = Number8944()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4470()
    val b = Number4469()
    return a.fib() + b.fib()
  }

}

class Number4472 : StressfulInteger {

  companion object {
    private var VALUE = 4472
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2236()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number8945()
      val right = Number8946()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4471()
    val b = Number4470()
    return a.fib() + b.fib()
  }

}

class Number4473 : StressfulInteger {

  companion object {
    private var VALUE = 4473
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2236()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number8947()
      val right = Number8948()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4472()
    val b = Number4471()
    return a.fib() + b.fib()
  }

}

class Number4474 : StressfulInteger {

  companion object {
    private var VALUE = 4474
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2237()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number8949()
      val right = Number8950()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4473()
    val b = Number4472()
    return a.fib() + b.fib()
  }

}

class Number4475 : StressfulInteger {

  companion object {
    private var VALUE = 4475
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2237()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number8951()
      val right = Number8952()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4474()
    val b = Number4473()
    return a.fib() + b.fib()
  }

}

class Number4476 : StressfulInteger {

  companion object {
    private var VALUE = 4476
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2238()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number8953()
      val right = Number8954()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4475()
    val b = Number4474()
    return a.fib() + b.fib()
  }

}

class Number4477 : StressfulInteger {

  companion object {
    private var VALUE = 4477
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2238()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number8955()
      val right = Number8956()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4476()
    val b = Number4475()
    return a.fib() + b.fib()
  }

}

class Number4478 : StressfulInteger {

  companion object {
    private var VALUE = 4478
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2239()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number8957()
      val right = Number8958()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4477()
    val b = Number4476()
    return a.fib() + b.fib()
  }

}

class Number4479 : StressfulInteger {

  companion object {
    private var VALUE = 4479
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2239()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number8959()
      val right = Number8960()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4478()
    val b = Number4477()
    return a.fib() + b.fib()
  }

}

class Number4480 : StressfulInteger {

  companion object {
    private var VALUE = 4480
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2240()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number8961()
      val right = Number8962()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4479()
    val b = Number4478()
    return a.fib() + b.fib()
  }

}

class Number4481 : StressfulInteger {

  companion object {
    private var VALUE = 4481
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2240()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number8963()
      val right = Number8964()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4480()
    val b = Number4479()
    return a.fib() + b.fib()
  }

}

class Number4482 : StressfulInteger {

  companion object {
    private var VALUE = 4482
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2241()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number8965()
      val right = Number8966()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4481()
    val b = Number4480()
    return a.fib() + b.fib()
  }

}

class Number4483 : StressfulInteger {

  companion object {
    private var VALUE = 4483
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2241()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number8967()
      val right = Number8968()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4482()
    val b = Number4481()
    return a.fib() + b.fib()
  }

}

class Number4484 : StressfulInteger {

  companion object {
    private var VALUE = 4484
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2242()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number8969()
      val right = Number8970()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4483()
    val b = Number4482()
    return a.fib() + b.fib()
  }

}

class Number4485 : StressfulInteger {

  companion object {
    private var VALUE = 4485
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2242()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number8971()
      val right = Number8972()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4484()
    val b = Number4483()
    return a.fib() + b.fib()
  }

}

class Number4486 : StressfulInteger {

  companion object {
    private var VALUE = 4486
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2243()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number8973()
      val right = Number8974()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4485()
    val b = Number4484()
    return a.fib() + b.fib()
  }

}

class Number4487 : StressfulInteger {

  companion object {
    private var VALUE = 4487
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2243()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number8975()
      val right = Number8976()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4486()
    val b = Number4485()
    return a.fib() + b.fib()
  }

}

class Number4488 : StressfulInteger {

  companion object {
    private var VALUE = 4488
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2244()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number8977()
      val right = Number8978()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4487()
    val b = Number4486()
    return a.fib() + b.fib()
  }

}

class Number4489 : StressfulInteger {

  companion object {
    private var VALUE = 4489
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2244()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number8979()
      val right = Number8980()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4488()
    val b = Number4487()
    return a.fib() + b.fib()
  }

}

class Number4490 : StressfulInteger {

  companion object {
    private var VALUE = 4490
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2245()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number8981()
      val right = Number8982()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4489()
    val b = Number4488()
    return a.fib() + b.fib()
  }

}

class Number4491 : StressfulInteger {

  companion object {
    private var VALUE = 4491
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2245()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number8983()
      val right = Number8984()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4490()
    val b = Number4489()
    return a.fib() + b.fib()
  }

}

class Number4492 : StressfulInteger {

  companion object {
    private var VALUE = 4492
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2246()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number8985()
      val right = Number8986()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4491()
    val b = Number4490()
    return a.fib() + b.fib()
  }

}

class Number4493 : StressfulInteger {

  companion object {
    private var VALUE = 4493
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2246()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number8987()
      val right = Number8988()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4492()
    val b = Number4491()
    return a.fib() + b.fib()
  }

}

class Number4494 : StressfulInteger {

  companion object {
    private var VALUE = 4494
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2247()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number8989()
      val right = Number8990()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4493()
    val b = Number4492()
    return a.fib() + b.fib()
  }

}

class Number4495 : StressfulInteger {

  companion object {
    private var VALUE = 4495
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2247()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number8991()
      val right = Number8992()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4494()
    val b = Number4493()
    return a.fib() + b.fib()
  }

}

class Number4496 : StressfulInteger {

  companion object {
    private var VALUE = 4496
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2248()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number8993()
      val right = Number8994()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4495()
    val b = Number4494()
    return a.fib() + b.fib()
  }

}

class Number4497 : StressfulInteger {

  companion object {
    private var VALUE = 4497
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2248()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number8995()
      val right = Number8996()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4496()
    val b = Number4495()
    return a.fib() + b.fib()
  }

}

class Number4498 : StressfulInteger {

  companion object {
    private var VALUE = 4498
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2249()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number8997()
      val right = Number8998()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4497()
    val b = Number4496()
    return a.fib() + b.fib()
  }

}

class Number4499 : StressfulInteger {

  companion object {
    private var VALUE = 4499
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2249()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number8999()
      val right = Number9000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4498()
    val b = Number4497()
    return a.fib() + b.fib()
  }

}

class Number4500 : StressfulInteger {

  companion object {
    private var VALUE = 4500
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2250()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number9001()
      val right = Number9002()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4499()
    val b = Number4498()
    return a.fib() + b.fib()
  }

}

class Number4501 : StressfulInteger {

  companion object {
    private var VALUE = 4501
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2250()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number9003()
      val right = Number9004()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4500()
    val b = Number4499()
    return a.fib() + b.fib()
  }

}

class Number4502 : StressfulInteger {

  companion object {
    private var VALUE = 4502
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2251()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number9005()
      val right = Number9006()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4501()
    val b = Number4500()
    return a.fib() + b.fib()
  }

}

class Number4503 : StressfulInteger {

  companion object {
    private var VALUE = 4503
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2251()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number9007()
      val right = Number9008()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4502()
    val b = Number4501()
    return a.fib() + b.fib()
  }

}

class Number4504 : StressfulInteger {

  companion object {
    private var VALUE = 4504
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2252()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number9009()
      val right = Number9010()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4503()
    val b = Number4502()
    return a.fib() + b.fib()
  }

}

class Number4505 : StressfulInteger {

  companion object {
    private var VALUE = 4505
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2252()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number9011()
      val right = Number9012()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4504()
    val b = Number4503()
    return a.fib() + b.fib()
  }

}

class Number4506 : StressfulInteger {

  companion object {
    private var VALUE = 4506
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2253()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number9013()
      val right = Number9014()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4505()
    val b = Number4504()
    return a.fib() + b.fib()
  }

}

class Number4507 : StressfulInteger {

  companion object {
    private var VALUE = 4507
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2253()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number9015()
      val right = Number9016()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4506()
    val b = Number4505()
    return a.fib() + b.fib()
  }

}

class Number4508 : StressfulInteger {

  companion object {
    private var VALUE = 4508
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2254()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number9017()
      val right = Number9018()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4507()
    val b = Number4506()
    return a.fib() + b.fib()
  }

}

class Number4509 : StressfulInteger {

  companion object {
    private var VALUE = 4509
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2254()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number9019()
      val right = Number9020()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4508()
    val b = Number4507()
    return a.fib() + b.fib()
  }

}

class Number4510 : StressfulInteger {

  companion object {
    private var VALUE = 4510
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2255()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number9021()
      val right = Number9022()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4509()
    val b = Number4508()
    return a.fib() + b.fib()
  }

}

class Number4511 : StressfulInteger {

  companion object {
    private var VALUE = 4511
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2255()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number9023()
      val right = Number9024()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4510()
    val b = Number4509()
    return a.fib() + b.fib()
  }

}

class Number4512 : StressfulInteger {

  companion object {
    private var VALUE = 4512
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2256()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number9025()
      val right = Number9026()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4511()
    val b = Number4510()
    return a.fib() + b.fib()
  }

}

class Number4513 : StressfulInteger {

  companion object {
    private var VALUE = 4513
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2256()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number9027()
      val right = Number9028()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4512()
    val b = Number4511()
    return a.fib() + b.fib()
  }

}

class Number4514 : StressfulInteger {

  companion object {
    private var VALUE = 4514
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2257()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number9029()
      val right = Number9030()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4513()
    val b = Number4512()
    return a.fib() + b.fib()
  }

}

class Number4515 : StressfulInteger {

  companion object {
    private var VALUE = 4515
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2257()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number9031()
      val right = Number9032()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4514()
    val b = Number4513()
    return a.fib() + b.fib()
  }

}

class Number4516 : StressfulInteger {

  companion object {
    private var VALUE = 4516
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2258()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number9033()
      val right = Number9034()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4515()
    val b = Number4514()
    return a.fib() + b.fib()
  }

}

class Number4517 : StressfulInteger {

  companion object {
    private var VALUE = 4517
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2258()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number9035()
      val right = Number9036()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4516()
    val b = Number4515()
    return a.fib() + b.fib()
  }

}

class Number4518 : StressfulInteger {

  companion object {
    private var VALUE = 4518
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2259()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number9037()
      val right = Number9038()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4517()
    val b = Number4516()
    return a.fib() + b.fib()
  }

}

class Number4519 : StressfulInteger {

  companion object {
    private var VALUE = 4519
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2259()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number9039()
      val right = Number9040()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4518()
    val b = Number4517()
    return a.fib() + b.fib()
  }

}

class Number4520 : StressfulInteger {

  companion object {
    private var VALUE = 4520
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2260()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number9041()
      val right = Number9042()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4519()
    val b = Number4518()
    return a.fib() + b.fib()
  }

}

class Number4521 : StressfulInteger {

  companion object {
    private var VALUE = 4521
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2260()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number9043()
      val right = Number9044()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4520()
    val b = Number4519()
    return a.fib() + b.fib()
  }

}

class Number4522 : StressfulInteger {

  companion object {
    private var VALUE = 4522
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2261()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number9045()
      val right = Number9046()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4521()
    val b = Number4520()
    return a.fib() + b.fib()
  }

}

class Number4523 : StressfulInteger {

  companion object {
    private var VALUE = 4523
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2261()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number9047()
      val right = Number9048()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4522()
    val b = Number4521()
    return a.fib() + b.fib()
  }

}

class Number4524 : StressfulInteger {

  companion object {
    private var VALUE = 4524
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2262()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number9049()
      val right = Number9050()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4523()
    val b = Number4522()
    return a.fib() + b.fib()
  }

}

class Number4525 : StressfulInteger {

  companion object {
    private var VALUE = 4525
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2262()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number9051()
      val right = Number9052()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4524()
    val b = Number4523()
    return a.fib() + b.fib()
  }

}

class Number4526 : StressfulInteger {

  companion object {
    private var VALUE = 4526
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2263()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number9053()
      val right = Number9054()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4525()
    val b = Number4524()
    return a.fib() + b.fib()
  }

}

class Number4527 : StressfulInteger {

  companion object {
    private var VALUE = 4527
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2263()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number9055()
      val right = Number9056()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4526()
    val b = Number4525()
    return a.fib() + b.fib()
  }

}

class Number4528 : StressfulInteger {

  companion object {
    private var VALUE = 4528
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2264()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number9057()
      val right = Number9058()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4527()
    val b = Number4526()
    return a.fib() + b.fib()
  }

}

class Number4529 : StressfulInteger {

  companion object {
    private var VALUE = 4529
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2264()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number9059()
      val right = Number9060()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4528()
    val b = Number4527()
    return a.fib() + b.fib()
  }

}

class Number4530 : StressfulInteger {

  companion object {
    private var VALUE = 4530
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2265()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number9061()
      val right = Number9062()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4529()
    val b = Number4528()
    return a.fib() + b.fib()
  }

}

class Number4531 : StressfulInteger {

  companion object {
    private var VALUE = 4531
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2265()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number9063()
      val right = Number9064()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4530()
    val b = Number4529()
    return a.fib() + b.fib()
  }

}

class Number4532 : StressfulInteger {

  companion object {
    private var VALUE = 4532
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2266()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number9065()
      val right = Number9066()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4531()
    val b = Number4530()
    return a.fib() + b.fib()
  }

}

class Number4533 : StressfulInteger {

  companion object {
    private var VALUE = 4533
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2266()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number9067()
      val right = Number9068()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4532()
    val b = Number4531()
    return a.fib() + b.fib()
  }

}

class Number4534 : StressfulInteger {

  companion object {
    private var VALUE = 4534
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2267()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number9069()
      val right = Number9070()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4533()
    val b = Number4532()
    return a.fib() + b.fib()
  }

}

class Number4535 : StressfulInteger {

  companion object {
    private var VALUE = 4535
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2267()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number9071()
      val right = Number9072()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4534()
    val b = Number4533()
    return a.fib() + b.fib()
  }

}

class Number4536 : StressfulInteger {

  companion object {
    private var VALUE = 4536
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2268()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number9073()
      val right = Number9074()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4535()
    val b = Number4534()
    return a.fib() + b.fib()
  }

}

class Number4537 : StressfulInteger {

  companion object {
    private var VALUE = 4537
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2268()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number9075()
      val right = Number9076()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4536()
    val b = Number4535()
    return a.fib() + b.fib()
  }

}

class Number4538 : StressfulInteger {

  companion object {
    private var VALUE = 4538
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2269()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number9077()
      val right = Number9078()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4537()
    val b = Number4536()
    return a.fib() + b.fib()
  }

}

class Number4539 : StressfulInteger {

  companion object {
    private var VALUE = 4539
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2269()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number9079()
      val right = Number9080()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4538()
    val b = Number4537()
    return a.fib() + b.fib()
  }

}

class Number4540 : StressfulInteger {

  companion object {
    private var VALUE = 4540
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2270()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number9081()
      val right = Number9082()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4539()
    val b = Number4538()
    return a.fib() + b.fib()
  }

}

class Number4541 : StressfulInteger {

  companion object {
    private var VALUE = 4541
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2270()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number9083()
      val right = Number9084()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4540()
    val b = Number4539()
    return a.fib() + b.fib()
  }

}

class Number4542 : StressfulInteger {

  companion object {
    private var VALUE = 4542
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2271()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number9085()
      val right = Number9086()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4541()
    val b = Number4540()
    return a.fib() + b.fib()
  }

}

class Number4543 : StressfulInteger {

  companion object {
    private var VALUE = 4543
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2271()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number9087()
      val right = Number9088()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4542()
    val b = Number4541()
    return a.fib() + b.fib()
  }

}

class Number4544 : StressfulInteger {

  companion object {
    private var VALUE = 4544
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2272()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number9089()
      val right = Number9090()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4543()
    val b = Number4542()
    return a.fib() + b.fib()
  }

}

class Number4545 : StressfulInteger {

  companion object {
    private var VALUE = 4545
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2272()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number9091()
      val right = Number9092()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4544()
    val b = Number4543()
    return a.fib() + b.fib()
  }

}

class Number4546 : StressfulInteger {

  companion object {
    private var VALUE = 4546
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2273()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number9093()
      val right = Number9094()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4545()
    val b = Number4544()
    return a.fib() + b.fib()
  }

}

class Number4547 : StressfulInteger {

  companion object {
    private var VALUE = 4547
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2273()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number9095()
      val right = Number9096()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4546()
    val b = Number4545()
    return a.fib() + b.fib()
  }

}

class Number4548 : StressfulInteger {

  companion object {
    private var VALUE = 4548
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2274()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number9097()
      val right = Number9098()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4547()
    val b = Number4546()
    return a.fib() + b.fib()
  }

}

class Number4549 : StressfulInteger {

  companion object {
    private var VALUE = 4549
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2274()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number9099()
      val right = Number9100()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4548()
    val b = Number4547()
    return a.fib() + b.fib()
  }

}

class Number4550 : StressfulInteger {

  companion object {
    private var VALUE = 4550
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2275()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number9101()
      val right = Number9102()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4549()
    val b = Number4548()
    return a.fib() + b.fib()
  }

}

class Number4551 : StressfulInteger {

  companion object {
    private var VALUE = 4551
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2275()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number9103()
      val right = Number9104()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4550()
    val b = Number4549()
    return a.fib() + b.fib()
  }

}

class Number4552 : StressfulInteger {

  companion object {
    private var VALUE = 4552
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2276()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number9105()
      val right = Number9106()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4551()
    val b = Number4550()
    return a.fib() + b.fib()
  }

}

class Number4553 : StressfulInteger {

  companion object {
    private var VALUE = 4553
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2276()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number9107()
      val right = Number9108()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4552()
    val b = Number4551()
    return a.fib() + b.fib()
  }

}

class Number4554 : StressfulInteger {

  companion object {
    private var VALUE = 4554
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2277()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number9109()
      val right = Number9110()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4553()
    val b = Number4552()
    return a.fib() + b.fib()
  }

}

class Number4555 : StressfulInteger {

  companion object {
    private var VALUE = 4555
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2277()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number9111()
      val right = Number9112()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4554()
    val b = Number4553()
    return a.fib() + b.fib()
  }

}

class Number4556 : StressfulInteger {

  companion object {
    private var VALUE = 4556
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2278()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number9113()
      val right = Number9114()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4555()
    val b = Number4554()
    return a.fib() + b.fib()
  }

}

class Number4557 : StressfulInteger {

  companion object {
    private var VALUE = 4557
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2278()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number9115()
      val right = Number9116()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4556()
    val b = Number4555()
    return a.fib() + b.fib()
  }

}

class Number4558 : StressfulInteger {

  companion object {
    private var VALUE = 4558
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2279()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number9117()
      val right = Number9118()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4557()
    val b = Number4556()
    return a.fib() + b.fib()
  }

}

class Number4559 : StressfulInteger {

  companion object {
    private var VALUE = 4559
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2279()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number9119()
      val right = Number9120()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4558()
    val b = Number4557()
    return a.fib() + b.fib()
  }

}

class Number4560 : StressfulInteger {

  companion object {
    private var VALUE = 4560
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2280()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number9121()
      val right = Number9122()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4559()
    val b = Number4558()
    return a.fib() + b.fib()
  }

}

class Number4561 : StressfulInteger {

  companion object {
    private var VALUE = 4561
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2280()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number9123()
      val right = Number9124()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4560()
    val b = Number4559()
    return a.fib() + b.fib()
  }

}

class Number4562 : StressfulInteger {

  companion object {
    private var VALUE = 4562
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2281()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number9125()
      val right = Number9126()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4561()
    val b = Number4560()
    return a.fib() + b.fib()
  }

}

class Number4563 : StressfulInteger {

  companion object {
    private var VALUE = 4563
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2281()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number9127()
      val right = Number9128()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4562()
    val b = Number4561()
    return a.fib() + b.fib()
  }

}

class Number4564 : StressfulInteger {

  companion object {
    private var VALUE = 4564
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2282()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number9129()
      val right = Number9130()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4563()
    val b = Number4562()
    return a.fib() + b.fib()
  }

}

class Number4565 : StressfulInteger {

  companion object {
    private var VALUE = 4565
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2282()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number9131()
      val right = Number9132()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4564()
    val b = Number4563()
    return a.fib() + b.fib()
  }

}

class Number4566 : StressfulInteger {

  companion object {
    private var VALUE = 4566
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2283()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number9133()
      val right = Number9134()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4565()
    val b = Number4564()
    return a.fib() + b.fib()
  }

}

class Number4567 : StressfulInteger {

  companion object {
    private var VALUE = 4567
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2283()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number9135()
      val right = Number9136()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4566()
    val b = Number4565()
    return a.fib() + b.fib()
  }

}

class Number4568 : StressfulInteger {

  companion object {
    private var VALUE = 4568
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2284()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number9137()
      val right = Number9138()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4567()
    val b = Number4566()
    return a.fib() + b.fib()
  }

}

class Number4569 : StressfulInteger {

  companion object {
    private var VALUE = 4569
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2284()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number9139()
      val right = Number9140()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4568()
    val b = Number4567()
    return a.fib() + b.fib()
  }

}

class Number4570 : StressfulInteger {

  companion object {
    private var VALUE = 4570
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2285()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number9141()
      val right = Number9142()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4569()
    val b = Number4568()
    return a.fib() + b.fib()
  }

}

class Number4571 : StressfulInteger {

  companion object {
    private var VALUE = 4571
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2285()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number9143()
      val right = Number9144()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4570()
    val b = Number4569()
    return a.fib() + b.fib()
  }

}

class Number4572 : StressfulInteger {

  companion object {
    private var VALUE = 4572
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2286()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number9145()
      val right = Number9146()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4571()
    val b = Number4570()
    return a.fib() + b.fib()
  }

}

class Number4573 : StressfulInteger {

  companion object {
    private var VALUE = 4573
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2286()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number9147()
      val right = Number9148()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4572()
    val b = Number4571()
    return a.fib() + b.fib()
  }

}

class Number4574 : StressfulInteger {

  companion object {
    private var VALUE = 4574
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2287()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number9149()
      val right = Number9150()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4573()
    val b = Number4572()
    return a.fib() + b.fib()
  }

}

class Number4575 : StressfulInteger {

  companion object {
    private var VALUE = 4575
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2287()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number9151()
      val right = Number9152()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4574()
    val b = Number4573()
    return a.fib() + b.fib()
  }

}

class Number4576 : StressfulInteger {

  companion object {
    private var VALUE = 4576
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2288()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number9153()
      val right = Number9154()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4575()
    val b = Number4574()
    return a.fib() + b.fib()
  }

}

class Number4577 : StressfulInteger {

  companion object {
    private var VALUE = 4577
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2288()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number9155()
      val right = Number9156()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4576()
    val b = Number4575()
    return a.fib() + b.fib()
  }

}

class Number4578 : StressfulInteger {

  companion object {
    private var VALUE = 4578
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2289()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number9157()
      val right = Number9158()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4577()
    val b = Number4576()
    return a.fib() + b.fib()
  }

}

class Number4579 : StressfulInteger {

  companion object {
    private var VALUE = 4579
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2289()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number9159()
      val right = Number9160()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4578()
    val b = Number4577()
    return a.fib() + b.fib()
  }

}

class Number4580 : StressfulInteger {

  companion object {
    private var VALUE = 4580
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2290()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number9161()
      val right = Number9162()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4579()
    val b = Number4578()
    return a.fib() + b.fib()
  }

}

class Number4581 : StressfulInteger {

  companion object {
    private var VALUE = 4581
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2290()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number9163()
      val right = Number9164()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4580()
    val b = Number4579()
    return a.fib() + b.fib()
  }

}

class Number4582 : StressfulInteger {

  companion object {
    private var VALUE = 4582
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2291()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number9165()
      val right = Number9166()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4581()
    val b = Number4580()
    return a.fib() + b.fib()
  }

}

class Number4583 : StressfulInteger {

  companion object {
    private var VALUE = 4583
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2291()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number9167()
      val right = Number9168()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4582()
    val b = Number4581()
    return a.fib() + b.fib()
  }

}

class Number4584 : StressfulInteger {

  companion object {
    private var VALUE = 4584
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2292()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number9169()
      val right = Number9170()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4583()
    val b = Number4582()
    return a.fib() + b.fib()
  }

}

class Number4585 : StressfulInteger {

  companion object {
    private var VALUE = 4585
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2292()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number9171()
      val right = Number9172()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4584()
    val b = Number4583()
    return a.fib() + b.fib()
  }

}

class Number4586 : StressfulInteger {

  companion object {
    private var VALUE = 4586
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2293()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number9173()
      val right = Number9174()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4585()
    val b = Number4584()
    return a.fib() + b.fib()
  }

}

class Number4587 : StressfulInteger {

  companion object {
    private var VALUE = 4587
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2293()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number9175()
      val right = Number9176()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4586()
    val b = Number4585()
    return a.fib() + b.fib()
  }

}

class Number4588 : StressfulInteger {

  companion object {
    private var VALUE = 4588
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2294()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number9177()
      val right = Number9178()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4587()
    val b = Number4586()
    return a.fib() + b.fib()
  }

}

class Number4589 : StressfulInteger {

  companion object {
    private var VALUE = 4589
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2294()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number9179()
      val right = Number9180()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4588()
    val b = Number4587()
    return a.fib() + b.fib()
  }

}

class Number4590 : StressfulInteger {

  companion object {
    private var VALUE = 4590
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2295()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number9181()
      val right = Number9182()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4589()
    val b = Number4588()
    return a.fib() + b.fib()
  }

}

class Number4591 : StressfulInteger {

  companion object {
    private var VALUE = 4591
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2295()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number9183()
      val right = Number9184()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4590()
    val b = Number4589()
    return a.fib() + b.fib()
  }

}

class Number4592 : StressfulInteger {

  companion object {
    private var VALUE = 4592
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2296()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number9185()
      val right = Number9186()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4591()
    val b = Number4590()
    return a.fib() + b.fib()
  }

}

class Number4593 : StressfulInteger {

  companion object {
    private var VALUE = 4593
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2296()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number9187()
      val right = Number9188()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4592()
    val b = Number4591()
    return a.fib() + b.fib()
  }

}

class Number4594 : StressfulInteger {

  companion object {
    private var VALUE = 4594
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2297()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number9189()
      val right = Number9190()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4593()
    val b = Number4592()
    return a.fib() + b.fib()
  }

}

class Number4595 : StressfulInteger {

  companion object {
    private var VALUE = 4595
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2297()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number9191()
      val right = Number9192()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4594()
    val b = Number4593()
    return a.fib() + b.fib()
  }

}

class Number4596 : StressfulInteger {

  companion object {
    private var VALUE = 4596
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2298()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number9193()
      val right = Number9194()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4595()
    val b = Number4594()
    return a.fib() + b.fib()
  }

}

class Number4597 : StressfulInteger {

  companion object {
    private var VALUE = 4597
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2298()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number9195()
      val right = Number9196()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4596()
    val b = Number4595()
    return a.fib() + b.fib()
  }

}

class Number4598 : StressfulInteger {

  companion object {
    private var VALUE = 4598
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2299()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number9197()
      val right = Number9198()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4597()
    val b = Number4596()
    return a.fib() + b.fib()
  }

}

class Number4599 : StressfulInteger {

  companion object {
    private var VALUE = 4599
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2299()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number9199()
      val right = Number9200()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4598()
    val b = Number4597()
    return a.fib() + b.fib()
  }

}

class Number4600 : StressfulInteger {

  companion object {
    private var VALUE = 4600
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2300()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number9201()
      val right = Number9202()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4599()
    val b = Number4598()
    return a.fib() + b.fib()
  }

}

class Number4601 : StressfulInteger {

  companion object {
    private var VALUE = 4601
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2300()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number9203()
      val right = Number9204()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4600()
    val b = Number4599()
    return a.fib() + b.fib()
  }

}

class Number4602 : StressfulInteger {

  companion object {
    private var VALUE = 4602
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2301()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number9205()
      val right = Number9206()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4601()
    val b = Number4600()
    return a.fib() + b.fib()
  }

}

class Number4603 : StressfulInteger {

  companion object {
    private var VALUE = 4603
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2301()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number9207()
      val right = Number9208()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4602()
    val b = Number4601()
    return a.fib() + b.fib()
  }

}

class Number4604 : StressfulInteger {

  companion object {
    private var VALUE = 4604
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2302()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number9209()
      val right = Number9210()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4603()
    val b = Number4602()
    return a.fib() + b.fib()
  }

}

class Number4605 : StressfulInteger {

  companion object {
    private var VALUE = 4605
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2302()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number9211()
      val right = Number9212()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4604()
    val b = Number4603()
    return a.fib() + b.fib()
  }

}

class Number4606 : StressfulInteger {

  companion object {
    private var VALUE = 4606
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2303()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number9213()
      val right = Number9214()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4605()
    val b = Number4604()
    return a.fib() + b.fib()
  }

}

class Number4607 : StressfulInteger {

  companion object {
    private var VALUE = 4607
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2303()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number9215()
      val right = Number9216()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4606()
    val b = Number4605()
    return a.fib() + b.fib()
  }

}

class Number4608 : StressfulInteger {

  companion object {
    private var VALUE = 4608
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2304()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number9217()
      val right = Number9218()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4607()
    val b = Number4606()
    return a.fib() + b.fib()
  }

}

class Number4609 : StressfulInteger {

  companion object {
    private var VALUE = 4609
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2304()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number9219()
      val right = Number9220()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4608()
    val b = Number4607()
    return a.fib() + b.fib()
  }

}

class Number4610 : StressfulInteger {

  companion object {
    private var VALUE = 4610
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2305()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number9221()
      val right = Number9222()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4609()
    val b = Number4608()
    return a.fib() + b.fib()
  }

}

class Number4611 : StressfulInteger {

  companion object {
    private var VALUE = 4611
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2305()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number9223()
      val right = Number9224()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4610()
    val b = Number4609()
    return a.fib() + b.fib()
  }

}

class Number4612 : StressfulInteger {

  companion object {
    private var VALUE = 4612
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2306()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number9225()
      val right = Number9226()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4611()
    val b = Number4610()
    return a.fib() + b.fib()
  }

}

class Number4613 : StressfulInteger {

  companion object {
    private var VALUE = 4613
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2306()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number9227()
      val right = Number9228()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4612()
    val b = Number4611()
    return a.fib() + b.fib()
  }

}

class Number4614 : StressfulInteger {

  companion object {
    private var VALUE = 4614
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2307()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number9229()
      val right = Number9230()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4613()
    val b = Number4612()
    return a.fib() + b.fib()
  }

}

class Number4615 : StressfulInteger {

  companion object {
    private var VALUE = 4615
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2307()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number9231()
      val right = Number9232()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4614()
    val b = Number4613()
    return a.fib() + b.fib()
  }

}

class Number4616 : StressfulInteger {

  companion object {
    private var VALUE = 4616
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2308()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number9233()
      val right = Number9234()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4615()
    val b = Number4614()
    return a.fib() + b.fib()
  }

}

class Number4617 : StressfulInteger {

  companion object {
    private var VALUE = 4617
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2308()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number9235()
      val right = Number9236()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4616()
    val b = Number4615()
    return a.fib() + b.fib()
  }

}

class Number4618 : StressfulInteger {

  companion object {
    private var VALUE = 4618
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2309()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number9237()
      val right = Number9238()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4617()
    val b = Number4616()
    return a.fib() + b.fib()
  }

}

class Number4619 : StressfulInteger {

  companion object {
    private var VALUE = 4619
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2309()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number9239()
      val right = Number9240()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4618()
    val b = Number4617()
    return a.fib() + b.fib()
  }

}

class Number4620 : StressfulInteger {

  companion object {
    private var VALUE = 4620
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2310()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number9241()
      val right = Number9242()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4619()
    val b = Number4618()
    return a.fib() + b.fib()
  }

}

class Number4621 : StressfulInteger {

  companion object {
    private var VALUE = 4621
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2310()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number9243()
      val right = Number9244()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4620()
    val b = Number4619()
    return a.fib() + b.fib()
  }

}

class Number4622 : StressfulInteger {

  companion object {
    private var VALUE = 4622
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2311()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number9245()
      val right = Number9246()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4621()
    val b = Number4620()
    return a.fib() + b.fib()
  }

}

class Number4623 : StressfulInteger {

  companion object {
    private var VALUE = 4623
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2311()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number9247()
      val right = Number9248()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4622()
    val b = Number4621()
    return a.fib() + b.fib()
  }

}

class Number4624 : StressfulInteger {

  companion object {
    private var VALUE = 4624
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2312()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number9249()
      val right = Number9250()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4623()
    val b = Number4622()
    return a.fib() + b.fib()
  }

}

class Number4625 : StressfulInteger {

  companion object {
    private var VALUE = 4625
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2312()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number9251()
      val right = Number9252()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4624()
    val b = Number4623()
    return a.fib() + b.fib()
  }

}

class Number4626 : StressfulInteger {

  companion object {
    private var VALUE = 4626
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2313()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number9253()
      val right = Number9254()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4625()
    val b = Number4624()
    return a.fib() + b.fib()
  }

}

class Number4627 : StressfulInteger {

  companion object {
    private var VALUE = 4627
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2313()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number9255()
      val right = Number9256()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4626()
    val b = Number4625()
    return a.fib() + b.fib()
  }

}

class Number4628 : StressfulInteger {

  companion object {
    private var VALUE = 4628
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2314()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number9257()
      val right = Number9258()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4627()
    val b = Number4626()
    return a.fib() + b.fib()
  }

}

class Number4629 : StressfulInteger {

  companion object {
    private var VALUE = 4629
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2314()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number9259()
      val right = Number9260()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4628()
    val b = Number4627()
    return a.fib() + b.fib()
  }

}

class Number4630 : StressfulInteger {

  companion object {
    private var VALUE = 4630
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2315()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number9261()
      val right = Number9262()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4629()
    val b = Number4628()
    return a.fib() + b.fib()
  }

}

class Number4631 : StressfulInteger {

  companion object {
    private var VALUE = 4631
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2315()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number9263()
      val right = Number9264()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4630()
    val b = Number4629()
    return a.fib() + b.fib()
  }

}

class Number4632 : StressfulInteger {

  companion object {
    private var VALUE = 4632
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2316()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number9265()
      val right = Number9266()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4631()
    val b = Number4630()
    return a.fib() + b.fib()
  }

}

class Number4633 : StressfulInteger {

  companion object {
    private var VALUE = 4633
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2316()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number9267()
      val right = Number9268()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4632()
    val b = Number4631()
    return a.fib() + b.fib()
  }

}

class Number4634 : StressfulInteger {

  companion object {
    private var VALUE = 4634
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2317()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number9269()
      val right = Number9270()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4633()
    val b = Number4632()
    return a.fib() + b.fib()
  }

}

class Number4635 : StressfulInteger {

  companion object {
    private var VALUE = 4635
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2317()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number9271()
      val right = Number9272()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4634()
    val b = Number4633()
    return a.fib() + b.fib()
  }

}

class Number4636 : StressfulInteger {

  companion object {
    private var VALUE = 4636
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2318()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number9273()
      val right = Number9274()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4635()
    val b = Number4634()
    return a.fib() + b.fib()
  }

}

class Number4637 : StressfulInteger {

  companion object {
    private var VALUE = 4637
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2318()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number9275()
      val right = Number9276()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4636()
    val b = Number4635()
    return a.fib() + b.fib()
  }

}

class Number4638 : StressfulInteger {

  companion object {
    private var VALUE = 4638
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2319()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number9277()
      val right = Number9278()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4637()
    val b = Number4636()
    return a.fib() + b.fib()
  }

}

class Number4639 : StressfulInteger {

  companion object {
    private var VALUE = 4639
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2319()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number9279()
      val right = Number9280()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4638()
    val b = Number4637()
    return a.fib() + b.fib()
  }

}

class Number4640 : StressfulInteger {

  companion object {
    private var VALUE = 4640
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2320()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number9281()
      val right = Number9282()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4639()
    val b = Number4638()
    return a.fib() + b.fib()
  }

}

class Number4641 : StressfulInteger {

  companion object {
    private var VALUE = 4641
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2320()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number9283()
      val right = Number9284()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4640()
    val b = Number4639()
    return a.fib() + b.fib()
  }

}

class Number4642 : StressfulInteger {

  companion object {
    private var VALUE = 4642
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2321()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number9285()
      val right = Number9286()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4641()
    val b = Number4640()
    return a.fib() + b.fib()
  }

}

class Number4643 : StressfulInteger {

  companion object {
    private var VALUE = 4643
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2321()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number9287()
      val right = Number9288()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4642()
    val b = Number4641()
    return a.fib() + b.fib()
  }

}

class Number4644 : StressfulInteger {

  companion object {
    private var VALUE = 4644
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2322()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number9289()
      val right = Number9290()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4643()
    val b = Number4642()
    return a.fib() + b.fib()
  }

}

class Number4645 : StressfulInteger {

  companion object {
    private var VALUE = 4645
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2322()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number9291()
      val right = Number9292()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4644()
    val b = Number4643()
    return a.fib() + b.fib()
  }

}

class Number4646 : StressfulInteger {

  companion object {
    private var VALUE = 4646
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2323()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number9293()
      val right = Number9294()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4645()
    val b = Number4644()
    return a.fib() + b.fib()
  }

}

class Number4647 : StressfulInteger {

  companion object {
    private var VALUE = 4647
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2323()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number9295()
      val right = Number9296()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4646()
    val b = Number4645()
    return a.fib() + b.fib()
  }

}

class Number4648 : StressfulInteger {

  companion object {
    private var VALUE = 4648
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2324()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number9297()
      val right = Number9298()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4647()
    val b = Number4646()
    return a.fib() + b.fib()
  }

}

class Number4649 : StressfulInteger {

  companion object {
    private var VALUE = 4649
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2324()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number9299()
      val right = Number9300()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4648()
    val b = Number4647()
    return a.fib() + b.fib()
  }

}

class Number4650 : StressfulInteger {

  companion object {
    private var VALUE = 4650
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2325()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number9301()
      val right = Number9302()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4649()
    val b = Number4648()
    return a.fib() + b.fib()
  }

}

class Number4651 : StressfulInteger {

  companion object {
    private var VALUE = 4651
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2325()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number9303()
      val right = Number9304()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4650()
    val b = Number4649()
    return a.fib() + b.fib()
  }

}

class Number4652 : StressfulInteger {

  companion object {
    private var VALUE = 4652
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2326()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number9305()
      val right = Number9306()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4651()
    val b = Number4650()
    return a.fib() + b.fib()
  }

}

class Number4653 : StressfulInteger {

  companion object {
    private var VALUE = 4653
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2326()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number9307()
      val right = Number9308()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4652()
    val b = Number4651()
    return a.fib() + b.fib()
  }

}

class Number4654 : StressfulInteger {

  companion object {
    private var VALUE = 4654
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2327()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number9309()
      val right = Number9310()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4653()
    val b = Number4652()
    return a.fib() + b.fib()
  }

}

class Number4655 : StressfulInteger {

  companion object {
    private var VALUE = 4655
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2327()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number9311()
      val right = Number9312()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4654()
    val b = Number4653()
    return a.fib() + b.fib()
  }

}

class Number4656 : StressfulInteger {

  companion object {
    private var VALUE = 4656
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2328()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number9313()
      val right = Number9314()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4655()
    val b = Number4654()
    return a.fib() + b.fib()
  }

}

class Number4657 : StressfulInteger {

  companion object {
    private var VALUE = 4657
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2328()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number9315()
      val right = Number9316()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4656()
    val b = Number4655()
    return a.fib() + b.fib()
  }

}

class Number4658 : StressfulInteger {

  companion object {
    private var VALUE = 4658
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2329()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number9317()
      val right = Number9318()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4657()
    val b = Number4656()
    return a.fib() + b.fib()
  }

}

class Number4659 : StressfulInteger {

  companion object {
    private var VALUE = 4659
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2329()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number9319()
      val right = Number9320()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4658()
    val b = Number4657()
    return a.fib() + b.fib()
  }

}

class Number4660 : StressfulInteger {

  companion object {
    private var VALUE = 4660
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2330()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number9321()
      val right = Number9322()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4659()
    val b = Number4658()
    return a.fib() + b.fib()
  }

}

class Number4661 : StressfulInteger {

  companion object {
    private var VALUE = 4661
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2330()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number9323()
      val right = Number9324()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4660()
    val b = Number4659()
    return a.fib() + b.fib()
  }

}

class Number4662 : StressfulInteger {

  companion object {
    private var VALUE = 4662
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2331()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number9325()
      val right = Number9326()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4661()
    val b = Number4660()
    return a.fib() + b.fib()
  }

}

class Number4663 : StressfulInteger {

  companion object {
    private var VALUE = 4663
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2331()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number9327()
      val right = Number9328()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4662()
    val b = Number4661()
    return a.fib() + b.fib()
  }

}

class Number4664 : StressfulInteger {

  companion object {
    private var VALUE = 4664
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2332()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number9329()
      val right = Number9330()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4663()
    val b = Number4662()
    return a.fib() + b.fib()
  }

}

class Number4665 : StressfulInteger {

  companion object {
    private var VALUE = 4665
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2332()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number9331()
      val right = Number9332()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4664()
    val b = Number4663()
    return a.fib() + b.fib()
  }

}

class Number4666 : StressfulInteger {

  companion object {
    private var VALUE = 4666
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2333()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number9333()
      val right = Number9334()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4665()
    val b = Number4664()
    return a.fib() + b.fib()
  }

}

class Number4667 : StressfulInteger {

  companion object {
    private var VALUE = 4667
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2333()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number9335()
      val right = Number9336()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4666()
    val b = Number4665()
    return a.fib() + b.fib()
  }

}

class Number4668 : StressfulInteger {

  companion object {
    private var VALUE = 4668
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2334()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number9337()
      val right = Number9338()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4667()
    val b = Number4666()
    return a.fib() + b.fib()
  }

}

class Number4669 : StressfulInteger {

  companion object {
    private var VALUE = 4669
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2334()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number9339()
      val right = Number9340()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4668()
    val b = Number4667()
    return a.fib() + b.fib()
  }

}

class Number4670 : StressfulInteger {

  companion object {
    private var VALUE = 4670
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2335()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number9341()
      val right = Number9342()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4669()
    val b = Number4668()
    return a.fib() + b.fib()
  }

}

class Number4671 : StressfulInteger {

  companion object {
    private var VALUE = 4671
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2335()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number9343()
      val right = Number9344()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4670()
    val b = Number4669()
    return a.fib() + b.fib()
  }

}

class Number4672 : StressfulInteger {

  companion object {
    private var VALUE = 4672
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2336()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number9345()
      val right = Number9346()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4671()
    val b = Number4670()
    return a.fib() + b.fib()
  }

}

class Number4673 : StressfulInteger {

  companion object {
    private var VALUE = 4673
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2336()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number9347()
      val right = Number9348()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4672()
    val b = Number4671()
    return a.fib() + b.fib()
  }

}

class Number4674 : StressfulInteger {

  companion object {
    private var VALUE = 4674
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2337()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number9349()
      val right = Number9350()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4673()
    val b = Number4672()
    return a.fib() + b.fib()
  }

}

class Number4675 : StressfulInteger {

  companion object {
    private var VALUE = 4675
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2337()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number9351()
      val right = Number9352()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4674()
    val b = Number4673()
    return a.fib() + b.fib()
  }

}

class Number4676 : StressfulInteger {

  companion object {
    private var VALUE = 4676
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2338()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number9353()
      val right = Number9354()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4675()
    val b = Number4674()
    return a.fib() + b.fib()
  }

}

class Number4677 : StressfulInteger {

  companion object {
    private var VALUE = 4677
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2338()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number9355()
      val right = Number9356()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4676()
    val b = Number4675()
    return a.fib() + b.fib()
  }

}

class Number4678 : StressfulInteger {

  companion object {
    private var VALUE = 4678
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2339()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number9357()
      val right = Number9358()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4677()
    val b = Number4676()
    return a.fib() + b.fib()
  }

}

class Number4679 : StressfulInteger {

  companion object {
    private var VALUE = 4679
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2339()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number9359()
      val right = Number9360()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4678()
    val b = Number4677()
    return a.fib() + b.fib()
  }

}

class Number4680 : StressfulInteger {

  companion object {
    private var VALUE = 4680
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2340()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number9361()
      val right = Number9362()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4679()
    val b = Number4678()
    return a.fib() + b.fib()
  }

}

class Number4681 : StressfulInteger {

  companion object {
    private var VALUE = 4681
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2340()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number9363()
      val right = Number9364()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4680()
    val b = Number4679()
    return a.fib() + b.fib()
  }

}

class Number4682 : StressfulInteger {

  companion object {
    private var VALUE = 4682
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2341()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number9365()
      val right = Number9366()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4681()
    val b = Number4680()
    return a.fib() + b.fib()
  }

}

class Number4683 : StressfulInteger {

  companion object {
    private var VALUE = 4683
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2341()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number9367()
      val right = Number9368()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4682()
    val b = Number4681()
    return a.fib() + b.fib()
  }

}

class Number4684 : StressfulInteger {

  companion object {
    private var VALUE = 4684
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2342()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number9369()
      val right = Number9370()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4683()
    val b = Number4682()
    return a.fib() + b.fib()
  }

}

class Number4685 : StressfulInteger {

  companion object {
    private var VALUE = 4685
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2342()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number9371()
      val right = Number9372()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4684()
    val b = Number4683()
    return a.fib() + b.fib()
  }

}

class Number4686 : StressfulInteger {

  companion object {
    private var VALUE = 4686
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2343()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number9373()
      val right = Number9374()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4685()
    val b = Number4684()
    return a.fib() + b.fib()
  }

}

class Number4687 : StressfulInteger {

  companion object {
    private var VALUE = 4687
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2343()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number9375()
      val right = Number9376()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4686()
    val b = Number4685()
    return a.fib() + b.fib()
  }

}

class Number4688 : StressfulInteger {

  companion object {
    private var VALUE = 4688
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2344()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number9377()
      val right = Number9378()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4687()
    val b = Number4686()
    return a.fib() + b.fib()
  }

}

class Number4689 : StressfulInteger {

  companion object {
    private var VALUE = 4689
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2344()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number9379()
      val right = Number9380()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4688()
    val b = Number4687()
    return a.fib() + b.fib()
  }

}

class Number4690 : StressfulInteger {

  companion object {
    private var VALUE = 4690
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2345()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number9381()
      val right = Number9382()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4689()
    val b = Number4688()
    return a.fib() + b.fib()
  }

}

class Number4691 : StressfulInteger {

  companion object {
    private var VALUE = 4691
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2345()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number9383()
      val right = Number9384()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4690()
    val b = Number4689()
    return a.fib() + b.fib()
  }

}

class Number4692 : StressfulInteger {

  companion object {
    private var VALUE = 4692
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2346()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number9385()
      val right = Number9386()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4691()
    val b = Number4690()
    return a.fib() + b.fib()
  }

}

class Number4693 : StressfulInteger {

  companion object {
    private var VALUE = 4693
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2346()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number9387()
      val right = Number9388()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4692()
    val b = Number4691()
    return a.fib() + b.fib()
  }

}

class Number4694 : StressfulInteger {

  companion object {
    private var VALUE = 4694
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2347()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number9389()
      val right = Number9390()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4693()
    val b = Number4692()
    return a.fib() + b.fib()
  }

}

class Number4695 : StressfulInteger {

  companion object {
    private var VALUE = 4695
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2347()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number9391()
      val right = Number9392()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4694()
    val b = Number4693()
    return a.fib() + b.fib()
  }

}

class Number4696 : StressfulInteger {

  companion object {
    private var VALUE = 4696
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2348()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number9393()
      val right = Number9394()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4695()
    val b = Number4694()
    return a.fib() + b.fib()
  }

}

class Number4697 : StressfulInteger {

  companion object {
    private var VALUE = 4697
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2348()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number9395()
      val right = Number9396()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4696()
    val b = Number4695()
    return a.fib() + b.fib()
  }

}

class Number4698 : StressfulInteger {

  companion object {
    private var VALUE = 4698
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2349()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number9397()
      val right = Number9398()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4697()
    val b = Number4696()
    return a.fib() + b.fib()
  }

}

class Number4699 : StressfulInteger {

  companion object {
    private var VALUE = 4699
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2349()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number9399()
      val right = Number9400()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4698()
    val b = Number4697()
    return a.fib() + b.fib()
  }

}

class Number4700 : StressfulInteger {

  companion object {
    private var VALUE = 4700
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2350()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number9401()
      val right = Number9402()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4699()
    val b = Number4698()
    return a.fib() + b.fib()
  }

}

class Number4701 : StressfulInteger {

  companion object {
    private var VALUE = 4701
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2350()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number9403()
      val right = Number9404()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4700()
    val b = Number4699()
    return a.fib() + b.fib()
  }

}

class Number4702 : StressfulInteger {

  companion object {
    private var VALUE = 4702
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2351()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number9405()
      val right = Number9406()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4701()
    val b = Number4700()
    return a.fib() + b.fib()
  }

}

class Number4703 : StressfulInteger {

  companion object {
    private var VALUE = 4703
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2351()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number9407()
      val right = Number9408()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4702()
    val b = Number4701()
    return a.fib() + b.fib()
  }

}

class Number4704 : StressfulInteger {

  companion object {
    private var VALUE = 4704
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2352()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number9409()
      val right = Number9410()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4703()
    val b = Number4702()
    return a.fib() + b.fib()
  }

}

class Number4705 : StressfulInteger {

  companion object {
    private var VALUE = 4705
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2352()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number9411()
      val right = Number9412()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4704()
    val b = Number4703()
    return a.fib() + b.fib()
  }

}

class Number4706 : StressfulInteger {

  companion object {
    private var VALUE = 4706
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2353()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number9413()
      val right = Number9414()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4705()
    val b = Number4704()
    return a.fib() + b.fib()
  }

}

class Number4707 : StressfulInteger {

  companion object {
    private var VALUE = 4707
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2353()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number9415()
      val right = Number9416()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4706()
    val b = Number4705()
    return a.fib() + b.fib()
  }

}

class Number4708 : StressfulInteger {

  companion object {
    private var VALUE = 4708
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2354()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number9417()
      val right = Number9418()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4707()
    val b = Number4706()
    return a.fib() + b.fib()
  }

}

class Number4709 : StressfulInteger {

  companion object {
    private var VALUE = 4709
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2354()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number9419()
      val right = Number9420()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4708()
    val b = Number4707()
    return a.fib() + b.fib()
  }

}

class Number4710 : StressfulInteger {

  companion object {
    private var VALUE = 4710
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2355()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number9421()
      val right = Number9422()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4709()
    val b = Number4708()
    return a.fib() + b.fib()
  }

}

class Number4711 : StressfulInteger {

  companion object {
    private var VALUE = 4711
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2355()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number9423()
      val right = Number9424()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4710()
    val b = Number4709()
    return a.fib() + b.fib()
  }

}

class Number4712 : StressfulInteger {

  companion object {
    private var VALUE = 4712
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2356()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number9425()
      val right = Number9426()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4711()
    val b = Number4710()
    return a.fib() + b.fib()
  }

}

class Number4713 : StressfulInteger {

  companion object {
    private var VALUE = 4713
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2356()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number9427()
      val right = Number9428()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4712()
    val b = Number4711()
    return a.fib() + b.fib()
  }

}

class Number4714 : StressfulInteger {

  companion object {
    private var VALUE = 4714
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2357()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number9429()
      val right = Number9430()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4713()
    val b = Number4712()
    return a.fib() + b.fib()
  }

}

class Number4715 : StressfulInteger {

  companion object {
    private var VALUE = 4715
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2357()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number9431()
      val right = Number9432()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4714()
    val b = Number4713()
    return a.fib() + b.fib()
  }

}

class Number4716 : StressfulInteger {

  companion object {
    private var VALUE = 4716
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2358()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number9433()
      val right = Number9434()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4715()
    val b = Number4714()
    return a.fib() + b.fib()
  }

}

class Number4717 : StressfulInteger {

  companion object {
    private var VALUE = 4717
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2358()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number9435()
      val right = Number9436()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4716()
    val b = Number4715()
    return a.fib() + b.fib()
  }

}

class Number4718 : StressfulInteger {

  companion object {
    private var VALUE = 4718
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2359()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number9437()
      val right = Number9438()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4717()
    val b = Number4716()
    return a.fib() + b.fib()
  }

}

class Number4719 : StressfulInteger {

  companion object {
    private var VALUE = 4719
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2359()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number9439()
      val right = Number9440()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4718()
    val b = Number4717()
    return a.fib() + b.fib()
  }

}

class Number4720 : StressfulInteger {

  companion object {
    private var VALUE = 4720
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2360()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number9441()
      val right = Number9442()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4719()
    val b = Number4718()
    return a.fib() + b.fib()
  }

}

class Number4721 : StressfulInteger {

  companion object {
    private var VALUE = 4721
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2360()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number9443()
      val right = Number9444()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4720()
    val b = Number4719()
    return a.fib() + b.fib()
  }

}

class Number4722 : StressfulInteger {

  companion object {
    private var VALUE = 4722
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2361()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number9445()
      val right = Number9446()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4721()
    val b = Number4720()
    return a.fib() + b.fib()
  }

}

class Number4723 : StressfulInteger {

  companion object {
    private var VALUE = 4723
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2361()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number9447()
      val right = Number9448()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4722()
    val b = Number4721()
    return a.fib() + b.fib()
  }

}

class Number4724 : StressfulInteger {

  companion object {
    private var VALUE = 4724
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2362()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number9449()
      val right = Number9450()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4723()
    val b = Number4722()
    return a.fib() + b.fib()
  }

}

class Number4725 : StressfulInteger {

  companion object {
    private var VALUE = 4725
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2362()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number9451()
      val right = Number9452()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4724()
    val b = Number4723()
    return a.fib() + b.fib()
  }

}

class Number4726 : StressfulInteger {

  companion object {
    private var VALUE = 4726
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2363()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number9453()
      val right = Number9454()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4725()
    val b = Number4724()
    return a.fib() + b.fib()
  }

}

class Number4727 : StressfulInteger {

  companion object {
    private var VALUE = 4727
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2363()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number9455()
      val right = Number9456()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4726()
    val b = Number4725()
    return a.fib() + b.fib()
  }

}

class Number4728 : StressfulInteger {

  companion object {
    private var VALUE = 4728
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2364()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number9457()
      val right = Number9458()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4727()
    val b = Number4726()
    return a.fib() + b.fib()
  }

}

class Number4729 : StressfulInteger {

  companion object {
    private var VALUE = 4729
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2364()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number9459()
      val right = Number9460()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4728()
    val b = Number4727()
    return a.fib() + b.fib()
  }

}

class Number4730 : StressfulInteger {

  companion object {
    private var VALUE = 4730
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2365()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number9461()
      val right = Number9462()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4729()
    val b = Number4728()
    return a.fib() + b.fib()
  }

}

class Number4731 : StressfulInteger {

  companion object {
    private var VALUE = 4731
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2365()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number9463()
      val right = Number9464()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4730()
    val b = Number4729()
    return a.fib() + b.fib()
  }

}

class Number4732 : StressfulInteger {

  companion object {
    private var VALUE = 4732
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2366()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number9465()
      val right = Number9466()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4731()
    val b = Number4730()
    return a.fib() + b.fib()
  }

}

class Number4733 : StressfulInteger {

  companion object {
    private var VALUE = 4733
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2366()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number9467()
      val right = Number9468()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4732()
    val b = Number4731()
    return a.fib() + b.fib()
  }

}

class Number4734 : StressfulInteger {

  companion object {
    private var VALUE = 4734
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2367()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number9469()
      val right = Number9470()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4733()
    val b = Number4732()
    return a.fib() + b.fib()
  }

}

class Number4735 : StressfulInteger {

  companion object {
    private var VALUE = 4735
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2367()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number9471()
      val right = Number9472()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4734()
    val b = Number4733()
    return a.fib() + b.fib()
  }

}

class Number4736 : StressfulInteger {

  companion object {
    private var VALUE = 4736
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2368()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number9473()
      val right = Number9474()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4735()
    val b = Number4734()
    return a.fib() + b.fib()
  }

}

class Number4737 : StressfulInteger {

  companion object {
    private var VALUE = 4737
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2368()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number9475()
      val right = Number9476()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4736()
    val b = Number4735()
    return a.fib() + b.fib()
  }

}

class Number4738 : StressfulInteger {

  companion object {
    private var VALUE = 4738
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2369()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number9477()
      val right = Number9478()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4737()
    val b = Number4736()
    return a.fib() + b.fib()
  }

}

class Number4739 : StressfulInteger {

  companion object {
    private var VALUE = 4739
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2369()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number9479()
      val right = Number9480()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4738()
    val b = Number4737()
    return a.fib() + b.fib()
  }

}

class Number4740 : StressfulInteger {

  companion object {
    private var VALUE = 4740
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2370()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number9481()
      val right = Number9482()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4739()
    val b = Number4738()
    return a.fib() + b.fib()
  }

}

class Number4741 : StressfulInteger {

  companion object {
    private var VALUE = 4741
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2370()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number9483()
      val right = Number9484()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4740()
    val b = Number4739()
    return a.fib() + b.fib()
  }

}

class Number4742 : StressfulInteger {

  companion object {
    private var VALUE = 4742
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2371()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number9485()
      val right = Number9486()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4741()
    val b = Number4740()
    return a.fib() + b.fib()
  }

}

class Number4743 : StressfulInteger {

  companion object {
    private var VALUE = 4743
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2371()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number9487()
      val right = Number9488()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4742()
    val b = Number4741()
    return a.fib() + b.fib()
  }

}

class Number4744 : StressfulInteger {

  companion object {
    private var VALUE = 4744
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2372()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number9489()
      val right = Number9490()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4743()
    val b = Number4742()
    return a.fib() + b.fib()
  }

}

class Number4745 : StressfulInteger {

  companion object {
    private var VALUE = 4745
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2372()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number9491()
      val right = Number9492()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4744()
    val b = Number4743()
    return a.fib() + b.fib()
  }

}

class Number4746 : StressfulInteger {

  companion object {
    private var VALUE = 4746
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2373()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number9493()
      val right = Number9494()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4745()
    val b = Number4744()
    return a.fib() + b.fib()
  }

}

class Number4747 : StressfulInteger {

  companion object {
    private var VALUE = 4747
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2373()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number9495()
      val right = Number9496()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4746()
    val b = Number4745()
    return a.fib() + b.fib()
  }

}

class Number4748 : StressfulInteger {

  companion object {
    private var VALUE = 4748
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2374()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number9497()
      val right = Number9498()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4747()
    val b = Number4746()
    return a.fib() + b.fib()
  }

}

class Number4749 : StressfulInteger {

  companion object {
    private var VALUE = 4749
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2374()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number9499()
      val right = Number9500()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4748()
    val b = Number4747()
    return a.fib() + b.fib()
  }

}

class Number4750 : StressfulInteger {

  companion object {
    private var VALUE = 4750
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2375()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number9501()
      val right = Number9502()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4749()
    val b = Number4748()
    return a.fib() + b.fib()
  }

}

class Number4751 : StressfulInteger {

  companion object {
    private var VALUE = 4751
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2375()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number9503()
      val right = Number9504()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4750()
    val b = Number4749()
    return a.fib() + b.fib()
  }

}

class Number4752 : StressfulInteger {

  companion object {
    private var VALUE = 4752
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2376()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number9505()
      val right = Number9506()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4751()
    val b = Number4750()
    return a.fib() + b.fib()
  }

}

class Number4753 : StressfulInteger {

  companion object {
    private var VALUE = 4753
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2376()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number9507()
      val right = Number9508()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4752()
    val b = Number4751()
    return a.fib() + b.fib()
  }

}

class Number4754 : StressfulInteger {

  companion object {
    private var VALUE = 4754
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2377()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number9509()
      val right = Number9510()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4753()
    val b = Number4752()
    return a.fib() + b.fib()
  }

}

class Number4755 : StressfulInteger {

  companion object {
    private var VALUE = 4755
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2377()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number9511()
      val right = Number9512()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4754()
    val b = Number4753()
    return a.fib() + b.fib()
  }

}

class Number4756 : StressfulInteger {

  companion object {
    private var VALUE = 4756
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2378()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number9513()
      val right = Number9514()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4755()
    val b = Number4754()
    return a.fib() + b.fib()
  }

}

class Number4757 : StressfulInteger {

  companion object {
    private var VALUE = 4757
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2378()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number9515()
      val right = Number9516()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4756()
    val b = Number4755()
    return a.fib() + b.fib()
  }

}

class Number4758 : StressfulInteger {

  companion object {
    private var VALUE = 4758
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2379()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number9517()
      val right = Number9518()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4757()
    val b = Number4756()
    return a.fib() + b.fib()
  }

}

class Number4759 : StressfulInteger {

  companion object {
    private var VALUE = 4759
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2379()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number9519()
      val right = Number9520()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4758()
    val b = Number4757()
    return a.fib() + b.fib()
  }

}

class Number4760 : StressfulInteger {

  companion object {
    private var VALUE = 4760
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2380()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number9521()
      val right = Number9522()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4759()
    val b = Number4758()
    return a.fib() + b.fib()
  }

}

class Number4761 : StressfulInteger {

  companion object {
    private var VALUE = 4761
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2380()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number9523()
      val right = Number9524()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4760()
    val b = Number4759()
    return a.fib() + b.fib()
  }

}

class Number4762 : StressfulInteger {

  companion object {
    private var VALUE = 4762
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2381()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number9525()
      val right = Number9526()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4761()
    val b = Number4760()
    return a.fib() + b.fib()
  }

}

class Number4763 : StressfulInteger {

  companion object {
    private var VALUE = 4763
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2381()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number9527()
      val right = Number9528()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4762()
    val b = Number4761()
    return a.fib() + b.fib()
  }

}

class Number4764 : StressfulInteger {

  companion object {
    private var VALUE = 4764
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2382()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number9529()
      val right = Number9530()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4763()
    val b = Number4762()
    return a.fib() + b.fib()
  }

}

class Number4765 : StressfulInteger {

  companion object {
    private var VALUE = 4765
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2382()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number9531()
      val right = Number9532()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4764()
    val b = Number4763()
    return a.fib() + b.fib()
  }

}

class Number4766 : StressfulInteger {

  companion object {
    private var VALUE = 4766
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2383()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number9533()
      val right = Number9534()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4765()
    val b = Number4764()
    return a.fib() + b.fib()
  }

}

class Number4767 : StressfulInteger {

  companion object {
    private var VALUE = 4767
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2383()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number9535()
      val right = Number9536()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4766()
    val b = Number4765()
    return a.fib() + b.fib()
  }

}

class Number4768 : StressfulInteger {

  companion object {
    private var VALUE = 4768
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2384()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number9537()
      val right = Number9538()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4767()
    val b = Number4766()
    return a.fib() + b.fib()
  }

}

class Number4769 : StressfulInteger {

  companion object {
    private var VALUE = 4769
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2384()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number9539()
      val right = Number9540()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4768()
    val b = Number4767()
    return a.fib() + b.fib()
  }

}

class Number4770 : StressfulInteger {

  companion object {
    private var VALUE = 4770
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2385()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number9541()
      val right = Number9542()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4769()
    val b = Number4768()
    return a.fib() + b.fib()
  }

}

class Number4771 : StressfulInteger {

  companion object {
    private var VALUE = 4771
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2385()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number9543()
      val right = Number9544()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4770()
    val b = Number4769()
    return a.fib() + b.fib()
  }

}

class Number4772 : StressfulInteger {

  companion object {
    private var VALUE = 4772
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2386()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number9545()
      val right = Number9546()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4771()
    val b = Number4770()
    return a.fib() + b.fib()
  }

}

class Number4773 : StressfulInteger {

  companion object {
    private var VALUE = 4773
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2386()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number9547()
      val right = Number9548()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4772()
    val b = Number4771()
    return a.fib() + b.fib()
  }

}

class Number4774 : StressfulInteger {

  companion object {
    private var VALUE = 4774
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2387()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number9549()
      val right = Number9550()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4773()
    val b = Number4772()
    return a.fib() + b.fib()
  }

}

class Number4775 : StressfulInteger {

  companion object {
    private var VALUE = 4775
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2387()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number9551()
      val right = Number9552()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4774()
    val b = Number4773()
    return a.fib() + b.fib()
  }

}

class Number4776 : StressfulInteger {

  companion object {
    private var VALUE = 4776
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2388()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number9553()
      val right = Number9554()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4775()
    val b = Number4774()
    return a.fib() + b.fib()
  }

}

class Number4777 : StressfulInteger {

  companion object {
    private var VALUE = 4777
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2388()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number9555()
      val right = Number9556()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4776()
    val b = Number4775()
    return a.fib() + b.fib()
  }

}

class Number4778 : StressfulInteger {

  companion object {
    private var VALUE = 4778
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2389()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number9557()
      val right = Number9558()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4777()
    val b = Number4776()
    return a.fib() + b.fib()
  }

}

class Number4779 : StressfulInteger {

  companion object {
    private var VALUE = 4779
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2389()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number9559()
      val right = Number9560()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4778()
    val b = Number4777()
    return a.fib() + b.fib()
  }

}

class Number4780 : StressfulInteger {

  companion object {
    private var VALUE = 4780
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2390()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number9561()
      val right = Number9562()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4779()
    val b = Number4778()
    return a.fib() + b.fib()
  }

}

class Number4781 : StressfulInteger {

  companion object {
    private var VALUE = 4781
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2390()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number9563()
      val right = Number9564()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4780()
    val b = Number4779()
    return a.fib() + b.fib()
  }

}

class Number4782 : StressfulInteger {

  companion object {
    private var VALUE = 4782
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2391()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number9565()
      val right = Number9566()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4781()
    val b = Number4780()
    return a.fib() + b.fib()
  }

}

class Number4783 : StressfulInteger {

  companion object {
    private var VALUE = 4783
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2391()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number9567()
      val right = Number9568()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4782()
    val b = Number4781()
    return a.fib() + b.fib()
  }

}

class Number4784 : StressfulInteger {

  companion object {
    private var VALUE = 4784
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2392()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number9569()
      val right = Number9570()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4783()
    val b = Number4782()
    return a.fib() + b.fib()
  }

}

class Number4785 : StressfulInteger {

  companion object {
    private var VALUE = 4785
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2392()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number9571()
      val right = Number9572()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4784()
    val b = Number4783()
    return a.fib() + b.fib()
  }

}

class Number4786 : StressfulInteger {

  companion object {
    private var VALUE = 4786
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2393()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number9573()
      val right = Number9574()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4785()
    val b = Number4784()
    return a.fib() + b.fib()
  }

}

class Number4787 : StressfulInteger {

  companion object {
    private var VALUE = 4787
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2393()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number9575()
      val right = Number9576()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4786()
    val b = Number4785()
    return a.fib() + b.fib()
  }

}

class Number4788 : StressfulInteger {

  companion object {
    private var VALUE = 4788
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2394()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number9577()
      val right = Number9578()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4787()
    val b = Number4786()
    return a.fib() + b.fib()
  }

}

class Number4789 : StressfulInteger {

  companion object {
    private var VALUE = 4789
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2394()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number9579()
      val right = Number9580()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4788()
    val b = Number4787()
    return a.fib() + b.fib()
  }

}

class Number4790 : StressfulInteger {

  companion object {
    private var VALUE = 4790
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2395()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number9581()
      val right = Number9582()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4789()
    val b = Number4788()
    return a.fib() + b.fib()
  }

}

class Number4791 : StressfulInteger {

  companion object {
    private var VALUE = 4791
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2395()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number9583()
      val right = Number9584()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4790()
    val b = Number4789()
    return a.fib() + b.fib()
  }

}

class Number4792 : StressfulInteger {

  companion object {
    private var VALUE = 4792
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2396()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number9585()
      val right = Number9586()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4791()
    val b = Number4790()
    return a.fib() + b.fib()
  }

}

class Number4793 : StressfulInteger {

  companion object {
    private var VALUE = 4793
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2396()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number9587()
      val right = Number9588()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4792()
    val b = Number4791()
    return a.fib() + b.fib()
  }

}

class Number4794 : StressfulInteger {

  companion object {
    private var VALUE = 4794
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2397()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number9589()
      val right = Number9590()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4793()
    val b = Number4792()
    return a.fib() + b.fib()
  }

}

class Number4795 : StressfulInteger {

  companion object {
    private var VALUE = 4795
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2397()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number9591()
      val right = Number9592()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4794()
    val b = Number4793()
    return a.fib() + b.fib()
  }

}

class Number4796 : StressfulInteger {

  companion object {
    private var VALUE = 4796
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2398()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number9593()
      val right = Number9594()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4795()
    val b = Number4794()
    return a.fib() + b.fib()
  }

}

class Number4797 : StressfulInteger {

  companion object {
    private var VALUE = 4797
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2398()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number9595()
      val right = Number9596()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4796()
    val b = Number4795()
    return a.fib() + b.fib()
  }

}

class Number4798 : StressfulInteger {

  companion object {
    private var VALUE = 4798
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2399()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number9597()
      val right = Number9598()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4797()
    val b = Number4796()
    return a.fib() + b.fib()
  }

}

class Number4799 : StressfulInteger {

  companion object {
    private var VALUE = 4799
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2399()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number9599()
      val right = Number9600()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4798()
    val b = Number4797()
    return a.fib() + b.fib()
  }

}

class Number4800 : StressfulInteger {

  companion object {
    private var VALUE = 4800
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2400()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number9601()
      val right = Number9602()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4799()
    val b = Number4798()
    return a.fib() + b.fib()
  }

}

class Number4801 : StressfulInteger {

  companion object {
    private var VALUE = 4801
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2400()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number9603()
      val right = Number9604()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4800()
    val b = Number4799()
    return a.fib() + b.fib()
  }

}

class Number4802 : StressfulInteger {

  companion object {
    private var VALUE = 4802
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2401()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number9605()
      val right = Number9606()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4801()
    val b = Number4800()
    return a.fib() + b.fib()
  }

}

class Number4803 : StressfulInteger {

  companion object {
    private var VALUE = 4803
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2401()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number9607()
      val right = Number9608()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4802()
    val b = Number4801()
    return a.fib() + b.fib()
  }

}

class Number4804 : StressfulInteger {

  companion object {
    private var VALUE = 4804
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2402()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number9609()
      val right = Number9610()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4803()
    val b = Number4802()
    return a.fib() + b.fib()
  }

}

class Number4805 : StressfulInteger {

  companion object {
    private var VALUE = 4805
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2402()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number9611()
      val right = Number9612()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4804()
    val b = Number4803()
    return a.fib() + b.fib()
  }

}

class Number4806 : StressfulInteger {

  companion object {
    private var VALUE = 4806
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2403()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number9613()
      val right = Number9614()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4805()
    val b = Number4804()
    return a.fib() + b.fib()
  }

}

class Number4807 : StressfulInteger {

  companion object {
    private var VALUE = 4807
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2403()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number9615()
      val right = Number9616()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4806()
    val b = Number4805()
    return a.fib() + b.fib()
  }

}

class Number4808 : StressfulInteger {

  companion object {
    private var VALUE = 4808
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2404()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number9617()
      val right = Number9618()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4807()
    val b = Number4806()
    return a.fib() + b.fib()
  }

}

class Number4809 : StressfulInteger {

  companion object {
    private var VALUE = 4809
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2404()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number9619()
      val right = Number9620()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4808()
    val b = Number4807()
    return a.fib() + b.fib()
  }

}

class Number4810 : StressfulInteger {

  companion object {
    private var VALUE = 4810
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2405()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number9621()
      val right = Number9622()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4809()
    val b = Number4808()
    return a.fib() + b.fib()
  }

}

class Number4811 : StressfulInteger {

  companion object {
    private var VALUE = 4811
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2405()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number9623()
      val right = Number9624()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4810()
    val b = Number4809()
    return a.fib() + b.fib()
  }

}

class Number4812 : StressfulInteger {

  companion object {
    private var VALUE = 4812
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2406()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number9625()
      val right = Number9626()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4811()
    val b = Number4810()
    return a.fib() + b.fib()
  }

}

class Number4813 : StressfulInteger {

  companion object {
    private var VALUE = 4813
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2406()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number9627()
      val right = Number9628()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4812()
    val b = Number4811()
    return a.fib() + b.fib()
  }

}

class Number4814 : StressfulInteger {

  companion object {
    private var VALUE = 4814
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2407()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number9629()
      val right = Number9630()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4813()
    val b = Number4812()
    return a.fib() + b.fib()
  }

}

class Number4815 : StressfulInteger {

  companion object {
    private var VALUE = 4815
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2407()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number9631()
      val right = Number9632()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4814()
    val b = Number4813()
    return a.fib() + b.fib()
  }

}

class Number4816 : StressfulInteger {

  companion object {
    private var VALUE = 4816
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2408()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number9633()
      val right = Number9634()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4815()
    val b = Number4814()
    return a.fib() + b.fib()
  }

}

class Number4817 : StressfulInteger {

  companion object {
    private var VALUE = 4817
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2408()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number9635()
      val right = Number9636()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4816()
    val b = Number4815()
    return a.fib() + b.fib()
  }

}

class Number4818 : StressfulInteger {

  companion object {
    private var VALUE = 4818
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2409()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number9637()
      val right = Number9638()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4817()
    val b = Number4816()
    return a.fib() + b.fib()
  }

}

class Number4819 : StressfulInteger {

  companion object {
    private var VALUE = 4819
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2409()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number9639()
      val right = Number9640()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4818()
    val b = Number4817()
    return a.fib() + b.fib()
  }

}

class Number4820 : StressfulInteger {

  companion object {
    private var VALUE = 4820
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2410()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number9641()
      val right = Number9642()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4819()
    val b = Number4818()
    return a.fib() + b.fib()
  }

}

class Number4821 : StressfulInteger {

  companion object {
    private var VALUE = 4821
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2410()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number9643()
      val right = Number9644()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4820()
    val b = Number4819()
    return a.fib() + b.fib()
  }

}

class Number4822 : StressfulInteger {

  companion object {
    private var VALUE = 4822
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2411()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number9645()
      val right = Number9646()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4821()
    val b = Number4820()
    return a.fib() + b.fib()
  }

}

class Number4823 : StressfulInteger {

  companion object {
    private var VALUE = 4823
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2411()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number9647()
      val right = Number9648()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4822()
    val b = Number4821()
    return a.fib() + b.fib()
  }

}

class Number4824 : StressfulInteger {

  companion object {
    private var VALUE = 4824
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2412()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number9649()
      val right = Number9650()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4823()
    val b = Number4822()
    return a.fib() + b.fib()
  }

}

class Number4825 : StressfulInteger {

  companion object {
    private var VALUE = 4825
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2412()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number9651()
      val right = Number9652()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4824()
    val b = Number4823()
    return a.fib() + b.fib()
  }

}

class Number4826 : StressfulInteger {

  companion object {
    private var VALUE = 4826
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2413()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number9653()
      val right = Number9654()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4825()
    val b = Number4824()
    return a.fib() + b.fib()
  }

}

class Number4827 : StressfulInteger {

  companion object {
    private var VALUE = 4827
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2413()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number9655()
      val right = Number9656()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4826()
    val b = Number4825()
    return a.fib() + b.fib()
  }

}

class Number4828 : StressfulInteger {

  companion object {
    private var VALUE = 4828
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2414()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number9657()
      val right = Number9658()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4827()
    val b = Number4826()
    return a.fib() + b.fib()
  }

}

class Number4829 : StressfulInteger {

  companion object {
    private var VALUE = 4829
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2414()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number9659()
      val right = Number9660()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4828()
    val b = Number4827()
    return a.fib() + b.fib()
  }

}

class Number4830 : StressfulInteger {

  companion object {
    private var VALUE = 4830
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2415()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number9661()
      val right = Number9662()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4829()
    val b = Number4828()
    return a.fib() + b.fib()
  }

}

class Number4831 : StressfulInteger {

  companion object {
    private var VALUE = 4831
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2415()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number9663()
      val right = Number9664()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4830()
    val b = Number4829()
    return a.fib() + b.fib()
  }

}

class Number4832 : StressfulInteger {

  companion object {
    private var VALUE = 4832
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2416()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number9665()
      val right = Number9666()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4831()
    val b = Number4830()
    return a.fib() + b.fib()
  }

}

class Number4833 : StressfulInteger {

  companion object {
    private var VALUE = 4833
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2416()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number9667()
      val right = Number9668()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4832()
    val b = Number4831()
    return a.fib() + b.fib()
  }

}

class Number4834 : StressfulInteger {

  companion object {
    private var VALUE = 4834
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2417()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number9669()
      val right = Number9670()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4833()
    val b = Number4832()
    return a.fib() + b.fib()
  }

}

class Number4835 : StressfulInteger {

  companion object {
    private var VALUE = 4835
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2417()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number9671()
      val right = Number9672()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4834()
    val b = Number4833()
    return a.fib() + b.fib()
  }

}

class Number4836 : StressfulInteger {

  companion object {
    private var VALUE = 4836
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2418()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number9673()
      val right = Number9674()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4835()
    val b = Number4834()
    return a.fib() + b.fib()
  }

}

class Number4837 : StressfulInteger {

  companion object {
    private var VALUE = 4837
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2418()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number9675()
      val right = Number9676()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4836()
    val b = Number4835()
    return a.fib() + b.fib()
  }

}

class Number4838 : StressfulInteger {

  companion object {
    private var VALUE = 4838
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2419()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number9677()
      val right = Number9678()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4837()
    val b = Number4836()
    return a.fib() + b.fib()
  }

}

class Number4839 : StressfulInteger {

  companion object {
    private var VALUE = 4839
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2419()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number9679()
      val right = Number9680()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4838()
    val b = Number4837()
    return a.fib() + b.fib()
  }

}

class Number4840 : StressfulInteger {

  companion object {
    private var VALUE = 4840
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2420()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number9681()
      val right = Number9682()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4839()
    val b = Number4838()
    return a.fib() + b.fib()
  }

}

class Number4841 : StressfulInteger {

  companion object {
    private var VALUE = 4841
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2420()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number9683()
      val right = Number9684()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4840()
    val b = Number4839()
    return a.fib() + b.fib()
  }

}

class Number4842 : StressfulInteger {

  companion object {
    private var VALUE = 4842
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2421()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number9685()
      val right = Number9686()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4841()
    val b = Number4840()
    return a.fib() + b.fib()
  }

}

class Number4843 : StressfulInteger {

  companion object {
    private var VALUE = 4843
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2421()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number9687()
      val right = Number9688()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4842()
    val b = Number4841()
    return a.fib() + b.fib()
  }

}

class Number4844 : StressfulInteger {

  companion object {
    private var VALUE = 4844
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2422()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number9689()
      val right = Number9690()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4843()
    val b = Number4842()
    return a.fib() + b.fib()
  }

}

class Number4845 : StressfulInteger {

  companion object {
    private var VALUE = 4845
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2422()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number9691()
      val right = Number9692()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4844()
    val b = Number4843()
    return a.fib() + b.fib()
  }

}

class Number4846 : StressfulInteger {

  companion object {
    private var VALUE = 4846
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2423()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number9693()
      val right = Number9694()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4845()
    val b = Number4844()
    return a.fib() + b.fib()
  }

}

class Number4847 : StressfulInteger {

  companion object {
    private var VALUE = 4847
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2423()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number9695()
      val right = Number9696()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4846()
    val b = Number4845()
    return a.fib() + b.fib()
  }

}

class Number4848 : StressfulInteger {

  companion object {
    private var VALUE = 4848
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2424()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number9697()
      val right = Number9698()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4847()
    val b = Number4846()
    return a.fib() + b.fib()
  }

}

class Number4849 : StressfulInteger {

  companion object {
    private var VALUE = 4849
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2424()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number9699()
      val right = Number9700()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4848()
    val b = Number4847()
    return a.fib() + b.fib()
  }

}

class Number4850 : StressfulInteger {

  companion object {
    private var VALUE = 4850
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2425()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number9701()
      val right = Number9702()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4849()
    val b = Number4848()
    return a.fib() + b.fib()
  }

}

class Number4851 : StressfulInteger {

  companion object {
    private var VALUE = 4851
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2425()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number9703()
      val right = Number9704()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4850()
    val b = Number4849()
    return a.fib() + b.fib()
  }

}

class Number4852 : StressfulInteger {

  companion object {
    private var VALUE = 4852
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2426()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number9705()
      val right = Number9706()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4851()
    val b = Number4850()
    return a.fib() + b.fib()
  }

}

class Number4853 : StressfulInteger {

  companion object {
    private var VALUE = 4853
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2426()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number9707()
      val right = Number9708()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4852()
    val b = Number4851()
    return a.fib() + b.fib()
  }

}

class Number4854 : StressfulInteger {

  companion object {
    private var VALUE = 4854
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2427()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number9709()
      val right = Number9710()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4853()
    val b = Number4852()
    return a.fib() + b.fib()
  }

}

class Number4855 : StressfulInteger {

  companion object {
    private var VALUE = 4855
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2427()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number9711()
      val right = Number9712()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4854()
    val b = Number4853()
    return a.fib() + b.fib()
  }

}

class Number4856 : StressfulInteger {

  companion object {
    private var VALUE = 4856
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2428()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number9713()
      val right = Number9714()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4855()
    val b = Number4854()
    return a.fib() + b.fib()
  }

}

class Number4857 : StressfulInteger {

  companion object {
    private var VALUE = 4857
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2428()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number9715()
      val right = Number9716()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4856()
    val b = Number4855()
    return a.fib() + b.fib()
  }

}

class Number4858 : StressfulInteger {

  companion object {
    private var VALUE = 4858
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2429()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number9717()
      val right = Number9718()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4857()
    val b = Number4856()
    return a.fib() + b.fib()
  }

}

class Number4859 : StressfulInteger {

  companion object {
    private var VALUE = 4859
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2429()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number9719()
      val right = Number9720()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4858()
    val b = Number4857()
    return a.fib() + b.fib()
  }

}

class Number4860 : StressfulInteger {

  companion object {
    private var VALUE = 4860
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2430()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number9721()
      val right = Number9722()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4859()
    val b = Number4858()
    return a.fib() + b.fib()
  }

}

class Number4861 : StressfulInteger {

  companion object {
    private var VALUE = 4861
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2430()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number9723()
      val right = Number9724()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4860()
    val b = Number4859()
    return a.fib() + b.fib()
  }

}

class Number4862 : StressfulInteger {

  companion object {
    private var VALUE = 4862
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2431()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number9725()
      val right = Number9726()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4861()
    val b = Number4860()
    return a.fib() + b.fib()
  }

}

class Number4863 : StressfulInteger {

  companion object {
    private var VALUE = 4863
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2431()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number9727()
      val right = Number9728()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4862()
    val b = Number4861()
    return a.fib() + b.fib()
  }

}

class Number4864 : StressfulInteger {

  companion object {
    private var VALUE = 4864
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2432()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number9729()
      val right = Number9730()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4863()
    val b = Number4862()
    return a.fib() + b.fib()
  }

}

class Number4865 : StressfulInteger {

  companion object {
    private var VALUE = 4865
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2432()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number9731()
      val right = Number9732()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4864()
    val b = Number4863()
    return a.fib() + b.fib()
  }

}

class Number4866 : StressfulInteger {

  companion object {
    private var VALUE = 4866
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2433()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number9733()
      val right = Number9734()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4865()
    val b = Number4864()
    return a.fib() + b.fib()
  }

}

class Number4867 : StressfulInteger {

  companion object {
    private var VALUE = 4867
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2433()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number9735()
      val right = Number9736()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4866()
    val b = Number4865()
    return a.fib() + b.fib()
  }

}

class Number4868 : StressfulInteger {

  companion object {
    private var VALUE = 4868
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2434()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number9737()
      val right = Number9738()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4867()
    val b = Number4866()
    return a.fib() + b.fib()
  }

}

class Number4869 : StressfulInteger {

  companion object {
    private var VALUE = 4869
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2434()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number9739()
      val right = Number9740()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4868()
    val b = Number4867()
    return a.fib() + b.fib()
  }

}

class Number4870 : StressfulInteger {

  companion object {
    private var VALUE = 4870
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2435()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number9741()
      val right = Number9742()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4869()
    val b = Number4868()
    return a.fib() + b.fib()
  }

}

class Number4871 : StressfulInteger {

  companion object {
    private var VALUE = 4871
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2435()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number9743()
      val right = Number9744()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4870()
    val b = Number4869()
    return a.fib() + b.fib()
  }

}

class Number4872 : StressfulInteger {

  companion object {
    private var VALUE = 4872
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2436()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number9745()
      val right = Number9746()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4871()
    val b = Number4870()
    return a.fib() + b.fib()
  }

}

class Number4873 : StressfulInteger {

  companion object {
    private var VALUE = 4873
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2436()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number9747()
      val right = Number9748()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4872()
    val b = Number4871()
    return a.fib() + b.fib()
  }

}

class Number4874 : StressfulInteger {

  companion object {
    private var VALUE = 4874
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2437()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number9749()
      val right = Number9750()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4873()
    val b = Number4872()
    return a.fib() + b.fib()
  }

}

class Number4875 : StressfulInteger {

  companion object {
    private var VALUE = 4875
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2437()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number9751()
      val right = Number9752()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4874()
    val b = Number4873()
    return a.fib() + b.fib()
  }

}

class Number4876 : StressfulInteger {

  companion object {
    private var VALUE = 4876
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2438()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number9753()
      val right = Number9754()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4875()
    val b = Number4874()
    return a.fib() + b.fib()
  }

}

class Number4877 : StressfulInteger {

  companion object {
    private var VALUE = 4877
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2438()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number9755()
      val right = Number9756()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4876()
    val b = Number4875()
    return a.fib() + b.fib()
  }

}

class Number4878 : StressfulInteger {

  companion object {
    private var VALUE = 4878
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2439()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number9757()
      val right = Number9758()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4877()
    val b = Number4876()
    return a.fib() + b.fib()
  }

}

class Number4879 : StressfulInteger {

  companion object {
    private var VALUE = 4879
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2439()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number9759()
      val right = Number9760()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4878()
    val b = Number4877()
    return a.fib() + b.fib()
  }

}

class Number4880 : StressfulInteger {

  companion object {
    private var VALUE = 4880
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2440()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number9761()
      val right = Number9762()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4879()
    val b = Number4878()
    return a.fib() + b.fib()
  }

}

class Number4881 : StressfulInteger {

  companion object {
    private var VALUE = 4881
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2440()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number9763()
      val right = Number9764()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4880()
    val b = Number4879()
    return a.fib() + b.fib()
  }

}

class Number4882 : StressfulInteger {

  companion object {
    private var VALUE = 4882
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2441()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number9765()
      val right = Number9766()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4881()
    val b = Number4880()
    return a.fib() + b.fib()
  }

}

class Number4883 : StressfulInteger {

  companion object {
    private var VALUE = 4883
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2441()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number9767()
      val right = Number9768()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4882()
    val b = Number4881()
    return a.fib() + b.fib()
  }

}

class Number4884 : StressfulInteger {

  companion object {
    private var VALUE = 4884
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2442()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number9769()
      val right = Number9770()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4883()
    val b = Number4882()
    return a.fib() + b.fib()
  }

}

class Number4885 : StressfulInteger {

  companion object {
    private var VALUE = 4885
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2442()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number9771()
      val right = Number9772()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4884()
    val b = Number4883()
    return a.fib() + b.fib()
  }

}

class Number4886 : StressfulInteger {

  companion object {
    private var VALUE = 4886
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2443()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number9773()
      val right = Number9774()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4885()
    val b = Number4884()
    return a.fib() + b.fib()
  }

}

class Number4887 : StressfulInteger {

  companion object {
    private var VALUE = 4887
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2443()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number9775()
      val right = Number9776()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4886()
    val b = Number4885()
    return a.fib() + b.fib()
  }

}

class Number4888 : StressfulInteger {

  companion object {
    private var VALUE = 4888
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2444()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number9777()
      val right = Number9778()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4887()
    val b = Number4886()
    return a.fib() + b.fib()
  }

}

class Number4889 : StressfulInteger {

  companion object {
    private var VALUE = 4889
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2444()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number9779()
      val right = Number9780()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4888()
    val b = Number4887()
    return a.fib() + b.fib()
  }

}

class Number4890 : StressfulInteger {

  companion object {
    private var VALUE = 4890
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2445()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number9781()
      val right = Number9782()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4889()
    val b = Number4888()
    return a.fib() + b.fib()
  }

}

class Number4891 : StressfulInteger {

  companion object {
    private var VALUE = 4891
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2445()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number9783()
      val right = Number9784()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4890()
    val b = Number4889()
    return a.fib() + b.fib()
  }

}

class Number4892 : StressfulInteger {

  companion object {
    private var VALUE = 4892
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2446()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number9785()
      val right = Number9786()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4891()
    val b = Number4890()
    return a.fib() + b.fib()
  }

}

class Number4893 : StressfulInteger {

  companion object {
    private var VALUE = 4893
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2446()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number9787()
      val right = Number9788()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4892()
    val b = Number4891()
    return a.fib() + b.fib()
  }

}

class Number4894 : StressfulInteger {

  companion object {
    private var VALUE = 4894
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2447()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number9789()
      val right = Number9790()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4893()
    val b = Number4892()
    return a.fib() + b.fib()
  }

}

class Number4895 : StressfulInteger {

  companion object {
    private var VALUE = 4895
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2447()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number9791()
      val right = Number9792()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4894()
    val b = Number4893()
    return a.fib() + b.fib()
  }

}

class Number4896 : StressfulInteger {

  companion object {
    private var VALUE = 4896
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2448()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number9793()
      val right = Number9794()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4895()
    val b = Number4894()
    return a.fib() + b.fib()
  }

}

class Number4897 : StressfulInteger {

  companion object {
    private var VALUE = 4897
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2448()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number9795()
      val right = Number9796()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4896()
    val b = Number4895()
    return a.fib() + b.fib()
  }

}

class Number4898 : StressfulInteger {

  companion object {
    private var VALUE = 4898
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2449()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number9797()
      val right = Number9798()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4897()
    val b = Number4896()
    return a.fib() + b.fib()
  }

}

class Number4899 : StressfulInteger {

  companion object {
    private var VALUE = 4899
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2449()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number9799()
      val right = Number9800()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4898()
    val b = Number4897()
    return a.fib() + b.fib()
  }

}

class Number4900 : StressfulInteger {

  companion object {
    private var VALUE = 4900
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2450()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number9801()
      val right = Number9802()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4899()
    val b = Number4898()
    return a.fib() + b.fib()
  }

}

class Number4901 : StressfulInteger {

  companion object {
    private var VALUE = 4901
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2450()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number9803()
      val right = Number9804()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4900()
    val b = Number4899()
    return a.fib() + b.fib()
  }

}

class Number4902 : StressfulInteger {

  companion object {
    private var VALUE = 4902
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2451()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number9805()
      val right = Number9806()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4901()
    val b = Number4900()
    return a.fib() + b.fib()
  }

}

class Number4903 : StressfulInteger {

  companion object {
    private var VALUE = 4903
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2451()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number9807()
      val right = Number9808()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4902()
    val b = Number4901()
    return a.fib() + b.fib()
  }

}

class Number4904 : StressfulInteger {

  companion object {
    private var VALUE = 4904
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2452()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number9809()
      val right = Number9810()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4903()
    val b = Number4902()
    return a.fib() + b.fib()
  }

}

class Number4905 : StressfulInteger {

  companion object {
    private var VALUE = 4905
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2452()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number9811()
      val right = Number9812()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4904()
    val b = Number4903()
    return a.fib() + b.fib()
  }

}

class Number4906 : StressfulInteger {

  companion object {
    private var VALUE = 4906
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2453()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number9813()
      val right = Number9814()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4905()
    val b = Number4904()
    return a.fib() + b.fib()
  }

}

class Number4907 : StressfulInteger {

  companion object {
    private var VALUE = 4907
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2453()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number9815()
      val right = Number9816()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4906()
    val b = Number4905()
    return a.fib() + b.fib()
  }

}

class Number4908 : StressfulInteger {

  companion object {
    private var VALUE = 4908
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2454()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number9817()
      val right = Number9818()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4907()
    val b = Number4906()
    return a.fib() + b.fib()
  }

}

class Number4909 : StressfulInteger {

  companion object {
    private var VALUE = 4909
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2454()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number9819()
      val right = Number9820()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4908()
    val b = Number4907()
    return a.fib() + b.fib()
  }

}

class Number4910 : StressfulInteger {

  companion object {
    private var VALUE = 4910
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2455()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number9821()
      val right = Number9822()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4909()
    val b = Number4908()
    return a.fib() + b.fib()
  }

}

class Number4911 : StressfulInteger {

  companion object {
    private var VALUE = 4911
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2455()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number9823()
      val right = Number9824()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4910()
    val b = Number4909()
    return a.fib() + b.fib()
  }

}

class Number4912 : StressfulInteger {

  companion object {
    private var VALUE = 4912
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2456()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number9825()
      val right = Number9826()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4911()
    val b = Number4910()
    return a.fib() + b.fib()
  }

}

class Number4913 : StressfulInteger {

  companion object {
    private var VALUE = 4913
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2456()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number9827()
      val right = Number9828()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4912()
    val b = Number4911()
    return a.fib() + b.fib()
  }

}

class Number4914 : StressfulInteger {

  companion object {
    private var VALUE = 4914
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2457()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number9829()
      val right = Number9830()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4913()
    val b = Number4912()
    return a.fib() + b.fib()
  }

}

class Number4915 : StressfulInteger {

  companion object {
    private var VALUE = 4915
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2457()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number9831()
      val right = Number9832()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4914()
    val b = Number4913()
    return a.fib() + b.fib()
  }

}

class Number4916 : StressfulInteger {

  companion object {
    private var VALUE = 4916
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2458()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number9833()
      val right = Number9834()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4915()
    val b = Number4914()
    return a.fib() + b.fib()
  }

}

class Number4917 : StressfulInteger {

  companion object {
    private var VALUE = 4917
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2458()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number9835()
      val right = Number9836()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4916()
    val b = Number4915()
    return a.fib() + b.fib()
  }

}

class Number4918 : StressfulInteger {

  companion object {
    private var VALUE = 4918
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2459()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number9837()
      val right = Number9838()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4917()
    val b = Number4916()
    return a.fib() + b.fib()
  }

}

class Number4919 : StressfulInteger {

  companion object {
    private var VALUE = 4919
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2459()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number9839()
      val right = Number9840()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4918()
    val b = Number4917()
    return a.fib() + b.fib()
  }

}

class Number4920 : StressfulInteger {

  companion object {
    private var VALUE = 4920
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2460()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number9841()
      val right = Number9842()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4919()
    val b = Number4918()
    return a.fib() + b.fib()
  }

}

class Number4921 : StressfulInteger {

  companion object {
    private var VALUE = 4921
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2460()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number9843()
      val right = Number9844()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4920()
    val b = Number4919()
    return a.fib() + b.fib()
  }

}

class Number4922 : StressfulInteger {

  companion object {
    private var VALUE = 4922
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2461()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number9845()
      val right = Number9846()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4921()
    val b = Number4920()
    return a.fib() + b.fib()
  }

}

class Number4923 : StressfulInteger {

  companion object {
    private var VALUE = 4923
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2461()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number9847()
      val right = Number9848()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4922()
    val b = Number4921()
    return a.fib() + b.fib()
  }

}

class Number4924 : StressfulInteger {

  companion object {
    private var VALUE = 4924
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2462()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number9849()
      val right = Number9850()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4923()
    val b = Number4922()
    return a.fib() + b.fib()
  }

}

class Number4925 : StressfulInteger {

  companion object {
    private var VALUE = 4925
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2462()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number9851()
      val right = Number9852()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4924()
    val b = Number4923()
    return a.fib() + b.fib()
  }

}

class Number4926 : StressfulInteger {

  companion object {
    private var VALUE = 4926
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2463()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number9853()
      val right = Number9854()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4925()
    val b = Number4924()
    return a.fib() + b.fib()
  }

}

class Number4927 : StressfulInteger {

  companion object {
    private var VALUE = 4927
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2463()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number9855()
      val right = Number9856()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4926()
    val b = Number4925()
    return a.fib() + b.fib()
  }

}

class Number4928 : StressfulInteger {

  companion object {
    private var VALUE = 4928
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2464()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number9857()
      val right = Number9858()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4927()
    val b = Number4926()
    return a.fib() + b.fib()
  }

}

class Number4929 : StressfulInteger {

  companion object {
    private var VALUE = 4929
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2464()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number9859()
      val right = Number9860()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4928()
    val b = Number4927()
    return a.fib() + b.fib()
  }

}

class Number4930 : StressfulInteger {

  companion object {
    private var VALUE = 4930
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2465()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number9861()
      val right = Number9862()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4929()
    val b = Number4928()
    return a.fib() + b.fib()
  }

}

class Number4931 : StressfulInteger {

  companion object {
    private var VALUE = 4931
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2465()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number9863()
      val right = Number9864()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4930()
    val b = Number4929()
    return a.fib() + b.fib()
  }

}

class Number4932 : StressfulInteger {

  companion object {
    private var VALUE = 4932
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2466()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number9865()
      val right = Number9866()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4931()
    val b = Number4930()
    return a.fib() + b.fib()
  }

}

class Number4933 : StressfulInteger {

  companion object {
    private var VALUE = 4933
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2466()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number9867()
      val right = Number9868()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4932()
    val b = Number4931()
    return a.fib() + b.fib()
  }

}

class Number4934 : StressfulInteger {

  companion object {
    private var VALUE = 4934
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2467()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number9869()
      val right = Number9870()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4933()
    val b = Number4932()
    return a.fib() + b.fib()
  }

}

class Number4935 : StressfulInteger {

  companion object {
    private var VALUE = 4935
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2467()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number9871()
      val right = Number9872()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4934()
    val b = Number4933()
    return a.fib() + b.fib()
  }

}

class Number4936 : StressfulInteger {

  companion object {
    private var VALUE = 4936
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2468()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number9873()
      val right = Number9874()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4935()
    val b = Number4934()
    return a.fib() + b.fib()
  }

}

class Number4937 : StressfulInteger {

  companion object {
    private var VALUE = 4937
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2468()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number9875()
      val right = Number9876()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4936()
    val b = Number4935()
    return a.fib() + b.fib()
  }

}

class Number4938 : StressfulInteger {

  companion object {
    private var VALUE = 4938
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2469()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number9877()
      val right = Number9878()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4937()
    val b = Number4936()
    return a.fib() + b.fib()
  }

}

class Number4939 : StressfulInteger {

  companion object {
    private var VALUE = 4939
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2469()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number9879()
      val right = Number9880()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4938()
    val b = Number4937()
    return a.fib() + b.fib()
  }

}

class Number4940 : StressfulInteger {

  companion object {
    private var VALUE = 4940
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2470()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number9881()
      val right = Number9882()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4939()
    val b = Number4938()
    return a.fib() + b.fib()
  }

}

class Number4941 : StressfulInteger {

  companion object {
    private var VALUE = 4941
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2470()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number9883()
      val right = Number9884()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4940()
    val b = Number4939()
    return a.fib() + b.fib()
  }

}

class Number4942 : StressfulInteger {

  companion object {
    private var VALUE = 4942
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2471()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number9885()
      val right = Number9886()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4941()
    val b = Number4940()
    return a.fib() + b.fib()
  }

}

class Number4943 : StressfulInteger {

  companion object {
    private var VALUE = 4943
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2471()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number9887()
      val right = Number9888()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4942()
    val b = Number4941()
    return a.fib() + b.fib()
  }

}

class Number4944 : StressfulInteger {

  companion object {
    private var VALUE = 4944
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2472()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number9889()
      val right = Number9890()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4943()
    val b = Number4942()
    return a.fib() + b.fib()
  }

}

class Number4945 : StressfulInteger {

  companion object {
    private var VALUE = 4945
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2472()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number9891()
      val right = Number9892()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4944()
    val b = Number4943()
    return a.fib() + b.fib()
  }

}

class Number4946 : StressfulInteger {

  companion object {
    private var VALUE = 4946
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2473()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number9893()
      val right = Number9894()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4945()
    val b = Number4944()
    return a.fib() + b.fib()
  }

}

class Number4947 : StressfulInteger {

  companion object {
    private var VALUE = 4947
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2473()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number9895()
      val right = Number9896()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4946()
    val b = Number4945()
    return a.fib() + b.fib()
  }

}

class Number4948 : StressfulInteger {

  companion object {
    private var VALUE = 4948
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2474()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number9897()
      val right = Number9898()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4947()
    val b = Number4946()
    return a.fib() + b.fib()
  }

}

class Number4949 : StressfulInteger {

  companion object {
    private var VALUE = 4949
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2474()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number9899()
      val right = Number9900()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4948()
    val b = Number4947()
    return a.fib() + b.fib()
  }

}

class Number4950 : StressfulInteger {

  companion object {
    private var VALUE = 4950
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2475()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number9901()
      val right = Number9902()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4949()
    val b = Number4948()
    return a.fib() + b.fib()
  }

}

class Number4951 : StressfulInteger {

  companion object {
    private var VALUE = 4951
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2475()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number9903()
      val right = Number9904()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4950()
    val b = Number4949()
    return a.fib() + b.fib()
  }

}

class Number4952 : StressfulInteger {

  companion object {
    private var VALUE = 4952
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2476()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number9905()
      val right = Number9906()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4951()
    val b = Number4950()
    return a.fib() + b.fib()
  }

}

class Number4953 : StressfulInteger {

  companion object {
    private var VALUE = 4953
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2476()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number9907()
      val right = Number9908()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4952()
    val b = Number4951()
    return a.fib() + b.fib()
  }

}

class Number4954 : StressfulInteger {

  companion object {
    private var VALUE = 4954
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2477()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number9909()
      val right = Number9910()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4953()
    val b = Number4952()
    return a.fib() + b.fib()
  }

}

class Number4955 : StressfulInteger {

  companion object {
    private var VALUE = 4955
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2477()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number9911()
      val right = Number9912()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4954()
    val b = Number4953()
    return a.fib() + b.fib()
  }

}

class Number4956 : StressfulInteger {

  companion object {
    private var VALUE = 4956
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2478()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number9913()
      val right = Number9914()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4955()
    val b = Number4954()
    return a.fib() + b.fib()
  }

}

class Number4957 : StressfulInteger {

  companion object {
    private var VALUE = 4957
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2478()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number9915()
      val right = Number9916()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4956()
    val b = Number4955()
    return a.fib() + b.fib()
  }

}

class Number4958 : StressfulInteger {

  companion object {
    private var VALUE = 4958
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2479()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number9917()
      val right = Number9918()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4957()
    val b = Number4956()
    return a.fib() + b.fib()
  }

}

class Number4959 : StressfulInteger {

  companion object {
    private var VALUE = 4959
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2479()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number9919()
      val right = Number9920()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4958()
    val b = Number4957()
    return a.fib() + b.fib()
  }

}

class Number4960 : StressfulInteger {

  companion object {
    private var VALUE = 4960
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2480()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number9921()
      val right = Number9922()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4959()
    val b = Number4958()
    return a.fib() + b.fib()
  }

}

class Number4961 : StressfulInteger {

  companion object {
    private var VALUE = 4961
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2480()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number9923()
      val right = Number9924()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4960()
    val b = Number4959()
    return a.fib() + b.fib()
  }

}

class Number4962 : StressfulInteger {

  companion object {
    private var VALUE = 4962
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2481()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number9925()
      val right = Number9926()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4961()
    val b = Number4960()
    return a.fib() + b.fib()
  }

}

class Number4963 : StressfulInteger {

  companion object {
    private var VALUE = 4963
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2481()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number9927()
      val right = Number9928()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4962()
    val b = Number4961()
    return a.fib() + b.fib()
  }

}

class Number4964 : StressfulInteger {

  companion object {
    private var VALUE = 4964
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2482()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number9929()
      val right = Number9930()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4963()
    val b = Number4962()
    return a.fib() + b.fib()
  }

}

class Number4965 : StressfulInteger {

  companion object {
    private var VALUE = 4965
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2482()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number9931()
      val right = Number9932()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4964()
    val b = Number4963()
    return a.fib() + b.fib()
  }

}

class Number4966 : StressfulInteger {

  companion object {
    private var VALUE = 4966
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2483()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number9933()
      val right = Number9934()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4965()
    val b = Number4964()
    return a.fib() + b.fib()
  }

}

class Number4967 : StressfulInteger {

  companion object {
    private var VALUE = 4967
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2483()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number9935()
      val right = Number9936()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4966()
    val b = Number4965()
    return a.fib() + b.fib()
  }

}

class Number4968 : StressfulInteger {

  companion object {
    private var VALUE = 4968
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2484()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number9937()
      val right = Number9938()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4967()
    val b = Number4966()
    return a.fib() + b.fib()
  }

}

class Number4969 : StressfulInteger {

  companion object {
    private var VALUE = 4969
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2484()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number9939()
      val right = Number9940()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4968()
    val b = Number4967()
    return a.fib() + b.fib()
  }

}

class Number4970 : StressfulInteger {

  companion object {
    private var VALUE = 4970
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2485()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number9941()
      val right = Number9942()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4969()
    val b = Number4968()
    return a.fib() + b.fib()
  }

}

class Number4971 : StressfulInteger {

  companion object {
    private var VALUE = 4971
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2485()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number9943()
      val right = Number9944()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4970()
    val b = Number4969()
    return a.fib() + b.fib()
  }

}

class Number4972 : StressfulInteger {

  companion object {
    private var VALUE = 4972
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2486()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number9945()
      val right = Number9946()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4971()
    val b = Number4970()
    return a.fib() + b.fib()
  }

}

class Number4973 : StressfulInteger {

  companion object {
    private var VALUE = 4973
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2486()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number9947()
      val right = Number9948()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4972()
    val b = Number4971()
    return a.fib() + b.fib()
  }

}

class Number4974 : StressfulInteger {

  companion object {
    private var VALUE = 4974
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2487()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number9949()
      val right = Number9950()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4973()
    val b = Number4972()
    return a.fib() + b.fib()
  }

}

class Number4975 : StressfulInteger {

  companion object {
    private var VALUE = 4975
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2487()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number9951()
      val right = Number9952()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4974()
    val b = Number4973()
    return a.fib() + b.fib()
  }

}

class Number4976 : StressfulInteger {

  companion object {
    private var VALUE = 4976
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2488()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number9953()
      val right = Number9954()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4975()
    val b = Number4974()
    return a.fib() + b.fib()
  }

}

class Number4977 : StressfulInteger {

  companion object {
    private var VALUE = 4977
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2488()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number9955()
      val right = Number9956()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4976()
    val b = Number4975()
    return a.fib() + b.fib()
  }

}

class Number4978 : StressfulInteger {

  companion object {
    private var VALUE = 4978
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2489()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number9957()
      val right = Number9958()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4977()
    val b = Number4976()
    return a.fib() + b.fib()
  }

}

class Number4979 : StressfulInteger {

  companion object {
    private var VALUE = 4979
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2489()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number9959()
      val right = Number9960()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4978()
    val b = Number4977()
    return a.fib() + b.fib()
  }

}

class Number4980 : StressfulInteger {

  companion object {
    private var VALUE = 4980
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2490()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number9961()
      val right = Number9962()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4979()
    val b = Number4978()
    return a.fib() + b.fib()
  }

}

class Number4981 : StressfulInteger {

  companion object {
    private var VALUE = 4981
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2490()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number9963()
      val right = Number9964()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4980()
    val b = Number4979()
    return a.fib() + b.fib()
  }

}

class Number4982 : StressfulInteger {

  companion object {
    private var VALUE = 4982
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2491()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number9965()
      val right = Number9966()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4981()
    val b = Number4980()
    return a.fib() + b.fib()
  }

}

class Number4983 : StressfulInteger {

  companion object {
    private var VALUE = 4983
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2491()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number9967()
      val right = Number9968()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4982()
    val b = Number4981()
    return a.fib() + b.fib()
  }

}

class Number4984 : StressfulInteger {

  companion object {
    private var VALUE = 4984
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2492()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number9969()
      val right = Number9970()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4983()
    val b = Number4982()
    return a.fib() + b.fib()
  }

}

class Number4985 : StressfulInteger {

  companion object {
    private var VALUE = 4985
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2492()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number9971()
      val right = Number9972()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4984()
    val b = Number4983()
    return a.fib() + b.fib()
  }

}

class Number4986 : StressfulInteger {

  companion object {
    private var VALUE = 4986
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2493()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number9973()
      val right = Number9974()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4985()
    val b = Number4984()
    return a.fib() + b.fib()
  }

}

class Number4987 : StressfulInteger {

  companion object {
    private var VALUE = 4987
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2493()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number9975()
      val right = Number9976()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4986()
    val b = Number4985()
    return a.fib() + b.fib()
  }

}

class Number4988 : StressfulInteger {

  companion object {
    private var VALUE = 4988
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2494()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number9977()
      val right = Number9978()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4987()
    val b = Number4986()
    return a.fib() + b.fib()
  }

}

class Number4989 : StressfulInteger {

  companion object {
    private var VALUE = 4989
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2494()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number9979()
      val right = Number9980()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4988()
    val b = Number4987()
    return a.fib() + b.fib()
  }

}

class Number4990 : StressfulInteger {

  companion object {
    private var VALUE = 4990
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2495()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number9981()
      val right = Number9982()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4989()
    val b = Number4988()
    return a.fib() + b.fib()
  }

}

class Number4991 : StressfulInteger {

  companion object {
    private var VALUE = 4991
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2495()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number9983()
      val right = Number9984()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4990()
    val b = Number4989()
    return a.fib() + b.fib()
  }

}

class Number4992 : StressfulInteger {

  companion object {
    private var VALUE = 4992
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2496()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number9985()
      val right = Number9986()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4991()
    val b = Number4990()
    return a.fib() + b.fib()
  }

}

class Number4993 : StressfulInteger {

  companion object {
    private var VALUE = 4993
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2496()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number9987()
      val right = Number9988()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4992()
    val b = Number4991()
    return a.fib() + b.fib()
  }

}

class Number4994 : StressfulInteger {

  companion object {
    private var VALUE = 4994
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2497()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number9989()
      val right = Number9990()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4993()
    val b = Number4992()
    return a.fib() + b.fib()
  }

}

class Number4995 : StressfulInteger {

  companion object {
    private var VALUE = 4995
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2497()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number9991()
      val right = Number9992()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4994()
    val b = Number4993()
    return a.fib() + b.fib()
  }

}

class Number4996 : StressfulInteger {

  companion object {
    private var VALUE = 4996
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2498()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number9993()
      val right = Number9994()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4995()
    val b = Number4994()
    return a.fib() + b.fib()
  }

}

class Number4997 : StressfulInteger {

  companion object {
    private var VALUE = 4997
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2498()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number9995()
      val right = Number9996()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4996()
    val b = Number4995()
    return a.fib() + b.fib()
  }

}

class Number4998 : StressfulInteger {

  companion object {
    private var VALUE = 4998
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2499()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number9997()
      val right = Number9998()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4997()
    val b = Number4996()
    return a.fib() + b.fib()
  }

}

class Number4999 : StressfulInteger {

  companion object {
    private var VALUE = 4999
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number2499()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number9999()
      val right = Number10000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number4998()
    val b = Number4997()
    return a.fib() + b.fib()
  }

}

