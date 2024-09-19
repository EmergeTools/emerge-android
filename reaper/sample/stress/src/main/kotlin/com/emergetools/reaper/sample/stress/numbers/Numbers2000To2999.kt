package com.emergetools.reaper.sample.stress.numbers

@Suppress("MatchingDeclarationName")
class Number2000 : StressfulInteger {

  companion object {
    private var VALUE = 2000
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1000()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number4001()
      val right = Number4002()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1999()
    val b = Number1998()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2001 : StressfulInteger {

  companion object {
    private var VALUE = 2001
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1000()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number4003()
      val right = Number4004()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2000()
    val b = Number1999()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2002 : StressfulInteger {

  companion object {
    private var VALUE = 2002
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1001()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number4005()
      val right = Number4006()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2001()
    val b = Number2000()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2003 : StressfulInteger {

  companion object {
    private var VALUE = 2003
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1001()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number4007()
      val right = Number4008()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2002()
    val b = Number2001()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2004 : StressfulInteger {

  companion object {
    private var VALUE = 2004
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1002()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number4009()
      val right = Number4010()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2003()
    val b = Number2002()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2005 : StressfulInteger {

  companion object {
    private var VALUE = 2005
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1002()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number4011()
      val right = Number4012()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2004()
    val b = Number2003()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2006 : StressfulInteger {

  companion object {
    private var VALUE = 2006
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1003()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number4013()
      val right = Number4014()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2005()
    val b = Number2004()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2007 : StressfulInteger {

  companion object {
    private var VALUE = 2007
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1003()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number4015()
      val right = Number4016()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2006()
    val b = Number2005()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2008 : StressfulInteger {

  companion object {
    private var VALUE = 2008
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1004()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number4017()
      val right = Number4018()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2007()
    val b = Number2006()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2009 : StressfulInteger {

  companion object {
    private var VALUE = 2009
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1004()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number4019()
      val right = Number4020()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2008()
    val b = Number2007()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2010 : StressfulInteger {

  companion object {
    private var VALUE = 2010
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1005()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number4021()
      val right = Number4022()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2009()
    val b = Number2008()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2011 : StressfulInteger {

  companion object {
    private var VALUE = 2011
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1005()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number4023()
      val right = Number4024()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2010()
    val b = Number2009()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2012 : StressfulInteger {

  companion object {
    private var VALUE = 2012
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1006()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number4025()
      val right = Number4026()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2011()
    val b = Number2010()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2013 : StressfulInteger {

  companion object {
    private var VALUE = 2013
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1006()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number4027()
      val right = Number4028()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2012()
    val b = Number2011()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2014 : StressfulInteger {

  companion object {
    private var VALUE = 2014
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1007()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number4029()
      val right = Number4030()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2013()
    val b = Number2012()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2015 : StressfulInteger {

  companion object {
    private var VALUE = 2015
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1007()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number4031()
      val right = Number4032()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2014()
    val b = Number2013()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2016 : StressfulInteger {

  companion object {
    private var VALUE = 2016
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1008()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number4033()
      val right = Number4034()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2015()
    val b = Number2014()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2017 : StressfulInteger {

  companion object {
    private var VALUE = 2017
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1008()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number4035()
      val right = Number4036()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2016()
    val b = Number2015()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2018 : StressfulInteger {

  companion object {
    private var VALUE = 2018
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1009()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number4037()
      val right = Number4038()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2017()
    val b = Number2016()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2019 : StressfulInteger {

  companion object {
    private var VALUE = 2019
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1009()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number4039()
      val right = Number4040()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2018()
    val b = Number2017()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2020 : StressfulInteger {

  companion object {
    private var VALUE = 2020
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1010()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number4041()
      val right = Number4042()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2019()
    val b = Number2018()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2021 : StressfulInteger {

  companion object {
    private var VALUE = 2021
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1010()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number4043()
      val right = Number4044()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2020()
    val b = Number2019()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2022 : StressfulInteger {

  companion object {
    private var VALUE = 2022
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1011()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number4045()
      val right = Number4046()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2021()
    val b = Number2020()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2023 : StressfulInteger {

  companion object {
    private var VALUE = 2023
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1011()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number4047()
      val right = Number4048()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2022()
    val b = Number2021()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2024 : StressfulInteger {

  companion object {
    private var VALUE = 2024
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1012()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number4049()
      val right = Number4050()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2023()
    val b = Number2022()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2025 : StressfulInteger {

  companion object {
    private var VALUE = 2025
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1012()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number4051()
      val right = Number4052()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2024()
    val b = Number2023()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2026 : StressfulInteger {

  companion object {
    private var VALUE = 2026
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1013()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number4053()
      val right = Number4054()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2025()
    val b = Number2024()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2027 : StressfulInteger {

  companion object {
    private var VALUE = 2027
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1013()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number4055()
      val right = Number4056()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2026()
    val b = Number2025()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2028 : StressfulInteger {

  companion object {
    private var VALUE = 2028
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1014()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number4057()
      val right = Number4058()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2027()
    val b = Number2026()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2029 : StressfulInteger {

  companion object {
    private var VALUE = 2029
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1014()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number4059()
      val right = Number4060()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2028()
    val b = Number2027()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2030 : StressfulInteger {

  companion object {
    private var VALUE = 2030
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1015()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number4061()
      val right = Number4062()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2029()
    val b = Number2028()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2031 : StressfulInteger {

  companion object {
    private var VALUE = 2031
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1015()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number4063()
      val right = Number4064()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2030()
    val b = Number2029()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2032 : StressfulInteger {

  companion object {
    private var VALUE = 2032
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1016()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number4065()
      val right = Number4066()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2031()
    val b = Number2030()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2033 : StressfulInteger {

  companion object {
    private var VALUE = 2033
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1016()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number4067()
      val right = Number4068()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2032()
    val b = Number2031()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2034 : StressfulInteger {

  companion object {
    private var VALUE = 2034
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1017()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number4069()
      val right = Number4070()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2033()
    val b = Number2032()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2035 : StressfulInteger {

  companion object {
    private var VALUE = 2035
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1017()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number4071()
      val right = Number4072()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2034()
    val b = Number2033()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2036 : StressfulInteger {

  companion object {
    private var VALUE = 2036
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1018()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number4073()
      val right = Number4074()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2035()
    val b = Number2034()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2037 : StressfulInteger {

  companion object {
    private var VALUE = 2037
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1018()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number4075()
      val right = Number4076()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2036()
    val b = Number2035()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2038 : StressfulInteger {

  companion object {
    private var VALUE = 2038
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1019()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number4077()
      val right = Number4078()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2037()
    val b = Number2036()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2039 : StressfulInteger {

  companion object {
    private var VALUE = 2039
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1019()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number4079()
      val right = Number4080()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2038()
    val b = Number2037()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2040 : StressfulInteger {

  companion object {
    private var VALUE = 2040
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1020()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number4081()
      val right = Number4082()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2039()
    val b = Number2038()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2041 : StressfulInteger {

  companion object {
    private var VALUE = 2041
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1020()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number4083()
      val right = Number4084()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2040()
    val b = Number2039()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2042 : StressfulInteger {

  companion object {
    private var VALUE = 2042
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1021()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number4085()
      val right = Number4086()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2041()
    val b = Number2040()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2043 : StressfulInteger {

  companion object {
    private var VALUE = 2043
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1021()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number4087()
      val right = Number4088()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2042()
    val b = Number2041()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2044 : StressfulInteger {

  companion object {
    private var VALUE = 2044
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1022()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number4089()
      val right = Number4090()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2043()
    val b = Number2042()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2045 : StressfulInteger {

  companion object {
    private var VALUE = 2045
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1022()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number4091()
      val right = Number4092()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2044()
    val b = Number2043()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2046 : StressfulInteger {

  companion object {
    private var VALUE = 2046
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1023()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number4093()
      val right = Number4094()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2045()
    val b = Number2044()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2047 : StressfulInteger {

  companion object {
    private var VALUE = 2047
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1023()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number4095()
      val right = Number4096()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2046()
    val b = Number2045()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2048 : StressfulInteger {

  companion object {
    private var VALUE = 2048
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1024()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number4097()
      val right = Number4098()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2047()
    val b = Number2046()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2049 : StressfulInteger {

  companion object {
    private var VALUE = 2049
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1024()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number4099()
      val right = Number4100()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2048()
    val b = Number2047()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2050 : StressfulInteger {

  companion object {
    private var VALUE = 2050
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1025()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number4101()
      val right = Number4102()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2049()
    val b = Number2048()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2051 : StressfulInteger {

  companion object {
    private var VALUE = 2051
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1025()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number4103()
      val right = Number4104()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2050()
    val b = Number2049()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2052 : StressfulInteger {

  companion object {
    private var VALUE = 2052
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1026()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number4105()
      val right = Number4106()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2051()
    val b = Number2050()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2053 : StressfulInteger {

  companion object {
    private var VALUE = 2053
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1026()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number4107()
      val right = Number4108()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2052()
    val b = Number2051()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2054 : StressfulInteger {

  companion object {
    private var VALUE = 2054
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1027()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number4109()
      val right = Number4110()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2053()
    val b = Number2052()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2055 : StressfulInteger {

  companion object {
    private var VALUE = 2055
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1027()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number4111()
      val right = Number4112()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2054()
    val b = Number2053()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2056 : StressfulInteger {

  companion object {
    private var VALUE = 2056
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1028()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number4113()
      val right = Number4114()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2055()
    val b = Number2054()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2057 : StressfulInteger {

  companion object {
    private var VALUE = 2057
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1028()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number4115()
      val right = Number4116()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2056()
    val b = Number2055()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2058 : StressfulInteger {

  companion object {
    private var VALUE = 2058
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1029()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number4117()
      val right = Number4118()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2057()
    val b = Number2056()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2059 : StressfulInteger {

  companion object {
    private var VALUE = 2059
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1029()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number4119()
      val right = Number4120()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2058()
    val b = Number2057()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2060 : StressfulInteger {

  companion object {
    private var VALUE = 2060
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1030()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number4121()
      val right = Number4122()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2059()
    val b = Number2058()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2061 : StressfulInteger {

  companion object {
    private var VALUE = 2061
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1030()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number4123()
      val right = Number4124()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2060()
    val b = Number2059()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2062 : StressfulInteger {

  companion object {
    private var VALUE = 2062
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1031()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number4125()
      val right = Number4126()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2061()
    val b = Number2060()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2063 : StressfulInteger {

  companion object {
    private var VALUE = 2063
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1031()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number4127()
      val right = Number4128()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2062()
    val b = Number2061()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2064 : StressfulInteger {

  companion object {
    private var VALUE = 2064
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1032()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number4129()
      val right = Number4130()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2063()
    val b = Number2062()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2065 : StressfulInteger {

  companion object {
    private var VALUE = 2065
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1032()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number4131()
      val right = Number4132()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2064()
    val b = Number2063()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2066 : StressfulInteger {

  companion object {
    private var VALUE = 2066
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1033()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number4133()
      val right = Number4134()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2065()
    val b = Number2064()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2067 : StressfulInteger {

  companion object {
    private var VALUE = 2067
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1033()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number4135()
      val right = Number4136()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2066()
    val b = Number2065()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2068 : StressfulInteger {

  companion object {
    private var VALUE = 2068
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1034()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number4137()
      val right = Number4138()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2067()
    val b = Number2066()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2069 : StressfulInteger {

  companion object {
    private var VALUE = 2069
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1034()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number4139()
      val right = Number4140()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2068()
    val b = Number2067()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2070 : StressfulInteger {

  companion object {
    private var VALUE = 2070
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1035()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number4141()
      val right = Number4142()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2069()
    val b = Number2068()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2071 : StressfulInteger {

  companion object {
    private var VALUE = 2071
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1035()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number4143()
      val right = Number4144()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2070()
    val b = Number2069()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2072 : StressfulInteger {

  companion object {
    private var VALUE = 2072
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1036()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number4145()
      val right = Number4146()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2071()
    val b = Number2070()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2073 : StressfulInteger {

  companion object {
    private var VALUE = 2073
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1036()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number4147()
      val right = Number4148()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2072()
    val b = Number2071()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2074 : StressfulInteger {

  companion object {
    private var VALUE = 2074
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1037()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number4149()
      val right = Number4150()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2073()
    val b = Number2072()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2075 : StressfulInteger {

  companion object {
    private var VALUE = 2075
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1037()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number4151()
      val right = Number4152()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2074()
    val b = Number2073()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2076 : StressfulInteger {

  companion object {
    private var VALUE = 2076
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1038()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number4153()
      val right = Number4154()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2075()
    val b = Number2074()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2077 : StressfulInteger {

  companion object {
    private var VALUE = 2077
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1038()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number4155()
      val right = Number4156()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2076()
    val b = Number2075()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2078 : StressfulInteger {

  companion object {
    private var VALUE = 2078
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1039()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number4157()
      val right = Number4158()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2077()
    val b = Number2076()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2079 : StressfulInteger {

  companion object {
    private var VALUE = 2079
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1039()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number4159()
      val right = Number4160()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2078()
    val b = Number2077()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2080 : StressfulInteger {

  companion object {
    private var VALUE = 2080
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1040()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number4161()
      val right = Number4162()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2079()
    val b = Number2078()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2081 : StressfulInteger {

  companion object {
    private var VALUE = 2081
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1040()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number4163()
      val right = Number4164()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2080()
    val b = Number2079()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2082 : StressfulInteger {

  companion object {
    private var VALUE = 2082
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1041()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number4165()
      val right = Number4166()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2081()
    val b = Number2080()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2083 : StressfulInteger {

  companion object {
    private var VALUE = 2083
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1041()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number4167()
      val right = Number4168()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2082()
    val b = Number2081()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2084 : StressfulInteger {

  companion object {
    private var VALUE = 2084
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1042()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number4169()
      val right = Number4170()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2083()
    val b = Number2082()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2085 : StressfulInteger {

  companion object {
    private var VALUE = 2085
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1042()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number4171()
      val right = Number4172()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2084()
    val b = Number2083()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2086 : StressfulInteger {

  companion object {
    private var VALUE = 2086
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1043()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number4173()
      val right = Number4174()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2085()
    val b = Number2084()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2087 : StressfulInteger {

  companion object {
    private var VALUE = 2087
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1043()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number4175()
      val right = Number4176()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2086()
    val b = Number2085()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2088 : StressfulInteger {

  companion object {
    private var VALUE = 2088
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1044()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number4177()
      val right = Number4178()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2087()
    val b = Number2086()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2089 : StressfulInteger {

  companion object {
    private var VALUE = 2089
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1044()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number4179()
      val right = Number4180()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2088()
    val b = Number2087()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2090 : StressfulInteger {

  companion object {
    private var VALUE = 2090
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1045()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number4181()
      val right = Number4182()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2089()
    val b = Number2088()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2091 : StressfulInteger {

  companion object {
    private var VALUE = 2091
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1045()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number4183()
      val right = Number4184()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2090()
    val b = Number2089()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2092 : StressfulInteger {

  companion object {
    private var VALUE = 2092
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1046()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number4185()
      val right = Number4186()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2091()
    val b = Number2090()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2093 : StressfulInteger {

  companion object {
    private var VALUE = 2093
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1046()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number4187()
      val right = Number4188()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2092()
    val b = Number2091()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2094 : StressfulInteger {

  companion object {
    private var VALUE = 2094
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1047()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number4189()
      val right = Number4190()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2093()
    val b = Number2092()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2095 : StressfulInteger {

  companion object {
    private var VALUE = 2095
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1047()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number4191()
      val right = Number4192()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2094()
    val b = Number2093()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2096 : StressfulInteger {

  companion object {
    private var VALUE = 2096
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1048()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number4193()
      val right = Number4194()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2095()
    val b = Number2094()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2097 : StressfulInteger {

  companion object {
    private var VALUE = 2097
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1048()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number4195()
      val right = Number4196()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2096()
    val b = Number2095()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2098 : StressfulInteger {

  companion object {
    private var VALUE = 2098
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1049()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number4197()
      val right = Number4198()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2097()
    val b = Number2096()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2099 : StressfulInteger {

  companion object {
    private var VALUE = 2099
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1049()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number4199()
      val right = Number4200()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2098()
    val b = Number2097()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2100 : StressfulInteger {

  companion object {
    private var VALUE = 2100
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1050()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number4201()
      val right = Number4202()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2099()
    val b = Number2098()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2101 : StressfulInteger {

  companion object {
    private var VALUE = 2101
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1050()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number4203()
      val right = Number4204()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2100()
    val b = Number2099()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2102 : StressfulInteger {

  companion object {
    private var VALUE = 2102
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1051()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number4205()
      val right = Number4206()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2101()
    val b = Number2100()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2103 : StressfulInteger {

  companion object {
    private var VALUE = 2103
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1051()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number4207()
      val right = Number4208()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2102()
    val b = Number2101()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2104 : StressfulInteger {

  companion object {
    private var VALUE = 2104
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1052()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number4209()
      val right = Number4210()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2103()
    val b = Number2102()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2105 : StressfulInteger {

  companion object {
    private var VALUE = 2105
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1052()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number4211()
      val right = Number4212()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2104()
    val b = Number2103()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2106 : StressfulInteger {

  companion object {
    private var VALUE = 2106
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1053()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number4213()
      val right = Number4214()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2105()
    val b = Number2104()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2107 : StressfulInteger {

  companion object {
    private var VALUE = 2107
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1053()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number4215()
      val right = Number4216()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2106()
    val b = Number2105()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2108 : StressfulInteger {

  companion object {
    private var VALUE = 2108
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1054()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number4217()
      val right = Number4218()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2107()
    val b = Number2106()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2109 : StressfulInteger {

  companion object {
    private var VALUE = 2109
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1054()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number4219()
      val right = Number4220()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2108()
    val b = Number2107()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2110 : StressfulInteger {

  companion object {
    private var VALUE = 2110
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1055()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number4221()
      val right = Number4222()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2109()
    val b = Number2108()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2111 : StressfulInteger {

  companion object {
    private var VALUE = 2111
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1055()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number4223()
      val right = Number4224()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2110()
    val b = Number2109()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2112 : StressfulInteger {

  companion object {
    private var VALUE = 2112
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1056()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number4225()
      val right = Number4226()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2111()
    val b = Number2110()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2113 : StressfulInteger {

  companion object {
    private var VALUE = 2113
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1056()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number4227()
      val right = Number4228()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2112()
    val b = Number2111()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2114 : StressfulInteger {

  companion object {
    private var VALUE = 2114
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1057()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number4229()
      val right = Number4230()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2113()
    val b = Number2112()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2115 : StressfulInteger {

  companion object {
    private var VALUE = 2115
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1057()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number4231()
      val right = Number4232()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2114()
    val b = Number2113()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2116 : StressfulInteger {

  companion object {
    private var VALUE = 2116
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1058()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number4233()
      val right = Number4234()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2115()
    val b = Number2114()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2117 : StressfulInteger {

  companion object {
    private var VALUE = 2117
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1058()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number4235()
      val right = Number4236()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2116()
    val b = Number2115()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2118 : StressfulInteger {

  companion object {
    private var VALUE = 2118
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1059()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number4237()
      val right = Number4238()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2117()
    val b = Number2116()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2119 : StressfulInteger {

  companion object {
    private var VALUE = 2119
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1059()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number4239()
      val right = Number4240()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2118()
    val b = Number2117()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2120 : StressfulInteger {

  companion object {
    private var VALUE = 2120
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1060()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number4241()
      val right = Number4242()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2119()
    val b = Number2118()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2121 : StressfulInteger {

  companion object {
    private var VALUE = 2121
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1060()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number4243()
      val right = Number4244()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2120()
    val b = Number2119()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2122 : StressfulInteger {

  companion object {
    private var VALUE = 2122
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1061()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number4245()
      val right = Number4246()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2121()
    val b = Number2120()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2123 : StressfulInteger {

  companion object {
    private var VALUE = 2123
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1061()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number4247()
      val right = Number4248()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2122()
    val b = Number2121()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2124 : StressfulInteger {

  companion object {
    private var VALUE = 2124
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1062()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number4249()
      val right = Number4250()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2123()
    val b = Number2122()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2125 : StressfulInteger {

  companion object {
    private var VALUE = 2125
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1062()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number4251()
      val right = Number4252()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2124()
    val b = Number2123()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2126 : StressfulInteger {

  companion object {
    private var VALUE = 2126
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1063()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number4253()
      val right = Number4254()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2125()
    val b = Number2124()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2127 : StressfulInteger {

  companion object {
    private var VALUE = 2127
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1063()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number4255()
      val right = Number4256()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2126()
    val b = Number2125()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2128 : StressfulInteger {

  companion object {
    private var VALUE = 2128
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1064()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number4257()
      val right = Number4258()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2127()
    val b = Number2126()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2129 : StressfulInteger {

  companion object {
    private var VALUE = 2129
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1064()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number4259()
      val right = Number4260()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2128()
    val b = Number2127()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2130 : StressfulInteger {

  companion object {
    private var VALUE = 2130
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1065()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number4261()
      val right = Number4262()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2129()
    val b = Number2128()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2131 : StressfulInteger {

  companion object {
    private var VALUE = 2131
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1065()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number4263()
      val right = Number4264()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2130()
    val b = Number2129()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2132 : StressfulInteger {

  companion object {
    private var VALUE = 2132
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1066()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number4265()
      val right = Number4266()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2131()
    val b = Number2130()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2133 : StressfulInteger {

  companion object {
    private var VALUE = 2133
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1066()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number4267()
      val right = Number4268()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2132()
    val b = Number2131()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2134 : StressfulInteger {

  companion object {
    private var VALUE = 2134
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1067()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number4269()
      val right = Number4270()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2133()
    val b = Number2132()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2135 : StressfulInteger {

  companion object {
    private var VALUE = 2135
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1067()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number4271()
      val right = Number4272()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2134()
    val b = Number2133()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2136 : StressfulInteger {

  companion object {
    private var VALUE = 2136
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1068()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number4273()
      val right = Number4274()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2135()
    val b = Number2134()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2137 : StressfulInteger {

  companion object {
    private var VALUE = 2137
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1068()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number4275()
      val right = Number4276()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2136()
    val b = Number2135()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2138 : StressfulInteger {

  companion object {
    private var VALUE = 2138
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1069()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number4277()
      val right = Number4278()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2137()
    val b = Number2136()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2139 : StressfulInteger {

  companion object {
    private var VALUE = 2139
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1069()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number4279()
      val right = Number4280()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2138()
    val b = Number2137()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2140 : StressfulInteger {

  companion object {
    private var VALUE = 2140
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1070()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number4281()
      val right = Number4282()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2139()
    val b = Number2138()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2141 : StressfulInteger {

  companion object {
    private var VALUE = 2141
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1070()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number4283()
      val right = Number4284()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2140()
    val b = Number2139()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2142 : StressfulInteger {

  companion object {
    private var VALUE = 2142
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1071()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number4285()
      val right = Number4286()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2141()
    val b = Number2140()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2143 : StressfulInteger {

  companion object {
    private var VALUE = 2143
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1071()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number4287()
      val right = Number4288()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2142()
    val b = Number2141()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2144 : StressfulInteger {

  companion object {
    private var VALUE = 2144
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1072()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number4289()
      val right = Number4290()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2143()
    val b = Number2142()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2145 : StressfulInteger {

  companion object {
    private var VALUE = 2145
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1072()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number4291()
      val right = Number4292()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2144()
    val b = Number2143()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2146 : StressfulInteger {

  companion object {
    private var VALUE = 2146
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1073()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number4293()
      val right = Number4294()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2145()
    val b = Number2144()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2147 : StressfulInteger {

  companion object {
    private var VALUE = 2147
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1073()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number4295()
      val right = Number4296()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2146()
    val b = Number2145()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2148 : StressfulInteger {

  companion object {
    private var VALUE = 2148
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1074()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number4297()
      val right = Number4298()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2147()
    val b = Number2146()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2149 : StressfulInteger {

  companion object {
    private var VALUE = 2149
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1074()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number4299()
      val right = Number4300()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2148()
    val b = Number2147()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2150 : StressfulInteger {

  companion object {
    private var VALUE = 2150
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1075()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number4301()
      val right = Number4302()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2149()
    val b = Number2148()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2151 : StressfulInteger {

  companion object {
    private var VALUE = 2151
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1075()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number4303()
      val right = Number4304()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2150()
    val b = Number2149()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2152 : StressfulInteger {

  companion object {
    private var VALUE = 2152
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1076()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number4305()
      val right = Number4306()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2151()
    val b = Number2150()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2153 : StressfulInteger {

  companion object {
    private var VALUE = 2153
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1076()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number4307()
      val right = Number4308()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2152()
    val b = Number2151()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2154 : StressfulInteger {

  companion object {
    private var VALUE = 2154
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1077()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number4309()
      val right = Number4310()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2153()
    val b = Number2152()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2155 : StressfulInteger {

  companion object {
    private var VALUE = 2155
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1077()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number4311()
      val right = Number4312()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2154()
    val b = Number2153()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2156 : StressfulInteger {

  companion object {
    private var VALUE = 2156
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1078()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number4313()
      val right = Number4314()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2155()
    val b = Number2154()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2157 : StressfulInteger {

  companion object {
    private var VALUE = 2157
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1078()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number4315()
      val right = Number4316()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2156()
    val b = Number2155()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2158 : StressfulInteger {

  companion object {
    private var VALUE = 2158
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1079()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number4317()
      val right = Number4318()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2157()
    val b = Number2156()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2159 : StressfulInteger {

  companion object {
    private var VALUE = 2159
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1079()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number4319()
      val right = Number4320()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2158()
    val b = Number2157()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2160 : StressfulInteger {

  companion object {
    private var VALUE = 2160
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1080()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number4321()
      val right = Number4322()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2159()
    val b = Number2158()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2161 : StressfulInteger {

  companion object {
    private var VALUE = 2161
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1080()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number4323()
      val right = Number4324()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2160()
    val b = Number2159()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2162 : StressfulInteger {

  companion object {
    private var VALUE = 2162
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1081()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number4325()
      val right = Number4326()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2161()
    val b = Number2160()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2163 : StressfulInteger {

  companion object {
    private var VALUE = 2163
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1081()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number4327()
      val right = Number4328()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2162()
    val b = Number2161()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2164 : StressfulInteger {

  companion object {
    private var VALUE = 2164
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1082()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number4329()
      val right = Number4330()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2163()
    val b = Number2162()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2165 : StressfulInteger {

  companion object {
    private var VALUE = 2165
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1082()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number4331()
      val right = Number4332()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2164()
    val b = Number2163()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2166 : StressfulInteger {

  companion object {
    private var VALUE = 2166
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1083()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number4333()
      val right = Number4334()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2165()
    val b = Number2164()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2167 : StressfulInteger {

  companion object {
    private var VALUE = 2167
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1083()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number4335()
      val right = Number4336()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2166()
    val b = Number2165()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2168 : StressfulInteger {

  companion object {
    private var VALUE = 2168
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1084()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number4337()
      val right = Number4338()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2167()
    val b = Number2166()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2169 : StressfulInteger {

  companion object {
    private var VALUE = 2169
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1084()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number4339()
      val right = Number4340()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2168()
    val b = Number2167()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2170 : StressfulInteger {

  companion object {
    private var VALUE = 2170
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1085()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number4341()
      val right = Number4342()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2169()
    val b = Number2168()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2171 : StressfulInteger {

  companion object {
    private var VALUE = 2171
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1085()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number4343()
      val right = Number4344()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2170()
    val b = Number2169()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2172 : StressfulInteger {

  companion object {
    private var VALUE = 2172
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1086()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number4345()
      val right = Number4346()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2171()
    val b = Number2170()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2173 : StressfulInteger {

  companion object {
    private var VALUE = 2173
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1086()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number4347()
      val right = Number4348()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2172()
    val b = Number2171()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2174 : StressfulInteger {

  companion object {
    private var VALUE = 2174
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1087()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number4349()
      val right = Number4350()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2173()
    val b = Number2172()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2175 : StressfulInteger {

  companion object {
    private var VALUE = 2175
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1087()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number4351()
      val right = Number4352()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2174()
    val b = Number2173()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2176 : StressfulInteger {

  companion object {
    private var VALUE = 2176
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1088()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number4353()
      val right = Number4354()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2175()
    val b = Number2174()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2177 : StressfulInteger {

  companion object {
    private var VALUE = 2177
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1088()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number4355()
      val right = Number4356()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2176()
    val b = Number2175()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2178 : StressfulInteger {

  companion object {
    private var VALUE = 2178
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1089()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number4357()
      val right = Number4358()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2177()
    val b = Number2176()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2179 : StressfulInteger {

  companion object {
    private var VALUE = 2179
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1089()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number4359()
      val right = Number4360()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2178()
    val b = Number2177()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2180 : StressfulInteger {

  companion object {
    private var VALUE = 2180
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1090()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number4361()
      val right = Number4362()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2179()
    val b = Number2178()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2181 : StressfulInteger {

  companion object {
    private var VALUE = 2181
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1090()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number4363()
      val right = Number4364()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2180()
    val b = Number2179()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2182 : StressfulInteger {

  companion object {
    private var VALUE = 2182
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1091()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number4365()
      val right = Number4366()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2181()
    val b = Number2180()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2183 : StressfulInteger {

  companion object {
    private var VALUE = 2183
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1091()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number4367()
      val right = Number4368()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2182()
    val b = Number2181()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2184 : StressfulInteger {

  companion object {
    private var VALUE = 2184
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1092()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number4369()
      val right = Number4370()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2183()
    val b = Number2182()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2185 : StressfulInteger {

  companion object {
    private var VALUE = 2185
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1092()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number4371()
      val right = Number4372()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2184()
    val b = Number2183()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2186 : StressfulInteger {

  companion object {
    private var VALUE = 2186
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1093()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number4373()
      val right = Number4374()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2185()
    val b = Number2184()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2187 : StressfulInteger {

  companion object {
    private var VALUE = 2187
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1093()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number4375()
      val right = Number4376()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2186()
    val b = Number2185()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2188 : StressfulInteger {

  companion object {
    private var VALUE = 2188
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1094()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number4377()
      val right = Number4378()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2187()
    val b = Number2186()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2189 : StressfulInteger {

  companion object {
    private var VALUE = 2189
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1094()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number4379()
      val right = Number4380()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2188()
    val b = Number2187()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2190 : StressfulInteger {

  companion object {
    private var VALUE = 2190
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1095()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number4381()
      val right = Number4382()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2189()
    val b = Number2188()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2191 : StressfulInteger {

  companion object {
    private var VALUE = 2191
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1095()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number4383()
      val right = Number4384()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2190()
    val b = Number2189()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2192 : StressfulInteger {

  companion object {
    private var VALUE = 2192
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1096()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number4385()
      val right = Number4386()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2191()
    val b = Number2190()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2193 : StressfulInteger {

  companion object {
    private var VALUE = 2193
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1096()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number4387()
      val right = Number4388()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2192()
    val b = Number2191()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2194 : StressfulInteger {

  companion object {
    private var VALUE = 2194
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1097()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number4389()
      val right = Number4390()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2193()
    val b = Number2192()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2195 : StressfulInteger {

  companion object {
    private var VALUE = 2195
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1097()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number4391()
      val right = Number4392()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2194()
    val b = Number2193()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2196 : StressfulInteger {

  companion object {
    private var VALUE = 2196
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1098()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number4393()
      val right = Number4394()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2195()
    val b = Number2194()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2197 : StressfulInteger {

  companion object {
    private var VALUE = 2197
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1098()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number4395()
      val right = Number4396()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2196()
    val b = Number2195()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2198 : StressfulInteger {

  companion object {
    private var VALUE = 2198
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1099()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number4397()
      val right = Number4398()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2197()
    val b = Number2196()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2199 : StressfulInteger {

  companion object {
    private var VALUE = 2199
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1099()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number4399()
      val right = Number4400()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2198()
    val b = Number2197()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2200 : StressfulInteger {

  companion object {
    private var VALUE = 2200
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1100()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number4401()
      val right = Number4402()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2199()
    val b = Number2198()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2201 : StressfulInteger {

  companion object {
    private var VALUE = 2201
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1100()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number4403()
      val right = Number4404()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2200()
    val b = Number2199()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2202 : StressfulInteger {

  companion object {
    private var VALUE = 2202
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1101()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number4405()
      val right = Number4406()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2201()
    val b = Number2200()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2203 : StressfulInteger {

  companion object {
    private var VALUE = 2203
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1101()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number4407()
      val right = Number4408()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2202()
    val b = Number2201()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2204 : StressfulInteger {

  companion object {
    private var VALUE = 2204
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1102()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number4409()
      val right = Number4410()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2203()
    val b = Number2202()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2205 : StressfulInteger {

  companion object {
    private var VALUE = 2205
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1102()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number4411()
      val right = Number4412()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2204()
    val b = Number2203()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2206 : StressfulInteger {

  companion object {
    private var VALUE = 2206
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1103()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number4413()
      val right = Number4414()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2205()
    val b = Number2204()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2207 : StressfulInteger {

  companion object {
    private var VALUE = 2207
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1103()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number4415()
      val right = Number4416()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2206()
    val b = Number2205()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2208 : StressfulInteger {

  companion object {
    private var VALUE = 2208
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1104()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number4417()
      val right = Number4418()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2207()
    val b = Number2206()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2209 : StressfulInteger {

  companion object {
    private var VALUE = 2209
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1104()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number4419()
      val right = Number4420()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2208()
    val b = Number2207()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2210 : StressfulInteger {

  companion object {
    private var VALUE = 2210
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1105()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number4421()
      val right = Number4422()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2209()
    val b = Number2208()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2211 : StressfulInteger {

  companion object {
    private var VALUE = 2211
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1105()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number4423()
      val right = Number4424()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2210()
    val b = Number2209()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2212 : StressfulInteger {

  companion object {
    private var VALUE = 2212
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1106()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number4425()
      val right = Number4426()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2211()
    val b = Number2210()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2213 : StressfulInteger {

  companion object {
    private var VALUE = 2213
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1106()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number4427()
      val right = Number4428()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2212()
    val b = Number2211()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2214 : StressfulInteger {

  companion object {
    private var VALUE = 2214
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1107()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number4429()
      val right = Number4430()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2213()
    val b = Number2212()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2215 : StressfulInteger {

  companion object {
    private var VALUE = 2215
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1107()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number4431()
      val right = Number4432()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2214()
    val b = Number2213()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2216 : StressfulInteger {

  companion object {
    private var VALUE = 2216
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1108()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number4433()
      val right = Number4434()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2215()
    val b = Number2214()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2217 : StressfulInteger {

  companion object {
    private var VALUE = 2217
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1108()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number4435()
      val right = Number4436()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2216()
    val b = Number2215()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2218 : StressfulInteger {

  companion object {
    private var VALUE = 2218
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1109()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number4437()
      val right = Number4438()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2217()
    val b = Number2216()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2219 : StressfulInteger {

  companion object {
    private var VALUE = 2219
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1109()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number4439()
      val right = Number4440()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2218()
    val b = Number2217()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2220 : StressfulInteger {

  companion object {
    private var VALUE = 2220
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1110()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number4441()
      val right = Number4442()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2219()
    val b = Number2218()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2221 : StressfulInteger {

  companion object {
    private var VALUE = 2221
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1110()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number4443()
      val right = Number4444()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2220()
    val b = Number2219()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2222 : StressfulInteger {

  companion object {
    private var VALUE = 2222
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1111()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number4445()
      val right = Number4446()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2221()
    val b = Number2220()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2223 : StressfulInteger {

  companion object {
    private var VALUE = 2223
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1111()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number4447()
      val right = Number4448()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2222()
    val b = Number2221()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2224 : StressfulInteger {

  companion object {
    private var VALUE = 2224
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1112()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number4449()
      val right = Number4450()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2223()
    val b = Number2222()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2225 : StressfulInteger {

  companion object {
    private var VALUE = 2225
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1112()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number4451()
      val right = Number4452()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2224()
    val b = Number2223()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2226 : StressfulInteger {

  companion object {
    private var VALUE = 2226
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1113()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number4453()
      val right = Number4454()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2225()
    val b = Number2224()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2227 : StressfulInteger {

  companion object {
    private var VALUE = 2227
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1113()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number4455()
      val right = Number4456()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2226()
    val b = Number2225()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2228 : StressfulInteger {

  companion object {
    private var VALUE = 2228
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1114()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number4457()
      val right = Number4458()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2227()
    val b = Number2226()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2229 : StressfulInteger {

  companion object {
    private var VALUE = 2229
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1114()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number4459()
      val right = Number4460()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2228()
    val b = Number2227()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2230 : StressfulInteger {

  companion object {
    private var VALUE = 2230
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1115()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number4461()
      val right = Number4462()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2229()
    val b = Number2228()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2231 : StressfulInteger {

  companion object {
    private var VALUE = 2231
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1115()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number4463()
      val right = Number4464()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2230()
    val b = Number2229()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2232 : StressfulInteger {

  companion object {
    private var VALUE = 2232
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1116()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number4465()
      val right = Number4466()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2231()
    val b = Number2230()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2233 : StressfulInteger {

  companion object {
    private var VALUE = 2233
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1116()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number4467()
      val right = Number4468()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2232()
    val b = Number2231()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2234 : StressfulInteger {

  companion object {
    private var VALUE = 2234
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1117()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number4469()
      val right = Number4470()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2233()
    val b = Number2232()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2235 : StressfulInteger {

  companion object {
    private var VALUE = 2235
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1117()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number4471()
      val right = Number4472()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2234()
    val b = Number2233()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2236 : StressfulInteger {

  companion object {
    private var VALUE = 2236
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1118()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number4473()
      val right = Number4474()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2235()
    val b = Number2234()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2237 : StressfulInteger {

  companion object {
    private var VALUE = 2237
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1118()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number4475()
      val right = Number4476()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2236()
    val b = Number2235()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2238 : StressfulInteger {

  companion object {
    private var VALUE = 2238
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1119()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number4477()
      val right = Number4478()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2237()
    val b = Number2236()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2239 : StressfulInteger {

  companion object {
    private var VALUE = 2239
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1119()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number4479()
      val right = Number4480()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2238()
    val b = Number2237()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2240 : StressfulInteger {

  companion object {
    private var VALUE = 2240
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1120()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number4481()
      val right = Number4482()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2239()
    val b = Number2238()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2241 : StressfulInteger {

  companion object {
    private var VALUE = 2241
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1120()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number4483()
      val right = Number4484()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2240()
    val b = Number2239()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2242 : StressfulInteger {

  companion object {
    private var VALUE = 2242
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1121()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number4485()
      val right = Number4486()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2241()
    val b = Number2240()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2243 : StressfulInteger {

  companion object {
    private var VALUE = 2243
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1121()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number4487()
      val right = Number4488()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2242()
    val b = Number2241()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2244 : StressfulInteger {

  companion object {
    private var VALUE = 2244
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1122()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number4489()
      val right = Number4490()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2243()
    val b = Number2242()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2245 : StressfulInteger {

  companion object {
    private var VALUE = 2245
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1122()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number4491()
      val right = Number4492()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2244()
    val b = Number2243()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2246 : StressfulInteger {

  companion object {
    private var VALUE = 2246
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1123()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number4493()
      val right = Number4494()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2245()
    val b = Number2244()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2247 : StressfulInteger {

  companion object {
    private var VALUE = 2247
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1123()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number4495()
      val right = Number4496()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2246()
    val b = Number2245()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2248 : StressfulInteger {

  companion object {
    private var VALUE = 2248
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1124()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number4497()
      val right = Number4498()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2247()
    val b = Number2246()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2249 : StressfulInteger {

  companion object {
    private var VALUE = 2249
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1124()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number4499()
      val right = Number4500()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2248()
    val b = Number2247()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2250 : StressfulInteger {

  companion object {
    private var VALUE = 2250
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1125()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number4501()
      val right = Number4502()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2249()
    val b = Number2248()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2251 : StressfulInteger {

  companion object {
    private var VALUE = 2251
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1125()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number4503()
      val right = Number4504()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2250()
    val b = Number2249()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2252 : StressfulInteger {

  companion object {
    private var VALUE = 2252
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1126()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number4505()
      val right = Number4506()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2251()
    val b = Number2250()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2253 : StressfulInteger {

  companion object {
    private var VALUE = 2253
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1126()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number4507()
      val right = Number4508()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2252()
    val b = Number2251()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2254 : StressfulInteger {

  companion object {
    private var VALUE = 2254
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1127()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number4509()
      val right = Number4510()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2253()
    val b = Number2252()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2255 : StressfulInteger {

  companion object {
    private var VALUE = 2255
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1127()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number4511()
      val right = Number4512()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2254()
    val b = Number2253()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2256 : StressfulInteger {

  companion object {
    private var VALUE = 2256
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1128()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number4513()
      val right = Number4514()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2255()
    val b = Number2254()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2257 : StressfulInteger {

  companion object {
    private var VALUE = 2257
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1128()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number4515()
      val right = Number4516()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2256()
    val b = Number2255()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2258 : StressfulInteger {

  companion object {
    private var VALUE = 2258
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1129()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number4517()
      val right = Number4518()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2257()
    val b = Number2256()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2259 : StressfulInteger {

  companion object {
    private var VALUE = 2259
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1129()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number4519()
      val right = Number4520()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2258()
    val b = Number2257()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2260 : StressfulInteger {

  companion object {
    private var VALUE = 2260
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1130()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number4521()
      val right = Number4522()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2259()
    val b = Number2258()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2261 : StressfulInteger {

  companion object {
    private var VALUE = 2261
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1130()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number4523()
      val right = Number4524()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2260()
    val b = Number2259()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2262 : StressfulInteger {

  companion object {
    private var VALUE = 2262
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1131()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number4525()
      val right = Number4526()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2261()
    val b = Number2260()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2263 : StressfulInteger {

  companion object {
    private var VALUE = 2263
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1131()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number4527()
      val right = Number4528()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2262()
    val b = Number2261()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2264 : StressfulInteger {

  companion object {
    private var VALUE = 2264
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1132()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number4529()
      val right = Number4530()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2263()
    val b = Number2262()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2265 : StressfulInteger {

  companion object {
    private var VALUE = 2265
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1132()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number4531()
      val right = Number4532()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2264()
    val b = Number2263()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2266 : StressfulInteger {

  companion object {
    private var VALUE = 2266
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1133()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number4533()
      val right = Number4534()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2265()
    val b = Number2264()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2267 : StressfulInteger {

  companion object {
    private var VALUE = 2267
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1133()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number4535()
      val right = Number4536()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2266()
    val b = Number2265()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2268 : StressfulInteger {

  companion object {
    private var VALUE = 2268
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1134()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number4537()
      val right = Number4538()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2267()
    val b = Number2266()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2269 : StressfulInteger {

  companion object {
    private var VALUE = 2269
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1134()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number4539()
      val right = Number4540()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2268()
    val b = Number2267()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2270 : StressfulInteger {

  companion object {
    private var VALUE = 2270
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1135()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number4541()
      val right = Number4542()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2269()
    val b = Number2268()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2271 : StressfulInteger {

  companion object {
    private var VALUE = 2271
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1135()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number4543()
      val right = Number4544()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2270()
    val b = Number2269()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2272 : StressfulInteger {

  companion object {
    private var VALUE = 2272
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1136()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number4545()
      val right = Number4546()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2271()
    val b = Number2270()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2273 : StressfulInteger {

  companion object {
    private var VALUE = 2273
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1136()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number4547()
      val right = Number4548()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2272()
    val b = Number2271()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2274 : StressfulInteger {

  companion object {
    private var VALUE = 2274
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1137()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number4549()
      val right = Number4550()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2273()
    val b = Number2272()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2275 : StressfulInteger {

  companion object {
    private var VALUE = 2275
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1137()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number4551()
      val right = Number4552()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2274()
    val b = Number2273()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2276 : StressfulInteger {

  companion object {
    private var VALUE = 2276
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1138()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number4553()
      val right = Number4554()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2275()
    val b = Number2274()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2277 : StressfulInteger {

  companion object {
    private var VALUE = 2277
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1138()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number4555()
      val right = Number4556()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2276()
    val b = Number2275()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2278 : StressfulInteger {

  companion object {
    private var VALUE = 2278
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1139()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number4557()
      val right = Number4558()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2277()
    val b = Number2276()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2279 : StressfulInteger {

  companion object {
    private var VALUE = 2279
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1139()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number4559()
      val right = Number4560()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2278()
    val b = Number2277()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2280 : StressfulInteger {

  companion object {
    private var VALUE = 2280
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1140()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number4561()
      val right = Number4562()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2279()
    val b = Number2278()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2281 : StressfulInteger {

  companion object {
    private var VALUE = 2281
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1140()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number4563()
      val right = Number4564()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2280()
    val b = Number2279()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2282 : StressfulInteger {

  companion object {
    private var VALUE = 2282
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1141()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number4565()
      val right = Number4566()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2281()
    val b = Number2280()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2283 : StressfulInteger {

  companion object {
    private var VALUE = 2283
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1141()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number4567()
      val right = Number4568()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2282()
    val b = Number2281()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2284 : StressfulInteger {

  companion object {
    private var VALUE = 2284
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1142()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number4569()
      val right = Number4570()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2283()
    val b = Number2282()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2285 : StressfulInteger {

  companion object {
    private var VALUE = 2285
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1142()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number4571()
      val right = Number4572()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2284()
    val b = Number2283()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2286 : StressfulInteger {

  companion object {
    private var VALUE = 2286
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1143()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number4573()
      val right = Number4574()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2285()
    val b = Number2284()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2287 : StressfulInteger {

  companion object {
    private var VALUE = 2287
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1143()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number4575()
      val right = Number4576()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2286()
    val b = Number2285()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2288 : StressfulInteger {

  companion object {
    private var VALUE = 2288
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1144()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number4577()
      val right = Number4578()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2287()
    val b = Number2286()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2289 : StressfulInteger {

  companion object {
    private var VALUE = 2289
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1144()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number4579()
      val right = Number4580()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2288()
    val b = Number2287()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2290 : StressfulInteger {

  companion object {
    private var VALUE = 2290
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1145()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number4581()
      val right = Number4582()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2289()
    val b = Number2288()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2291 : StressfulInteger {

  companion object {
    private var VALUE = 2291
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1145()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number4583()
      val right = Number4584()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2290()
    val b = Number2289()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2292 : StressfulInteger {

  companion object {
    private var VALUE = 2292
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1146()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number4585()
      val right = Number4586()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2291()
    val b = Number2290()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2293 : StressfulInteger {

  companion object {
    private var VALUE = 2293
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1146()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number4587()
      val right = Number4588()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2292()
    val b = Number2291()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2294 : StressfulInteger {

  companion object {
    private var VALUE = 2294
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1147()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number4589()
      val right = Number4590()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2293()
    val b = Number2292()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2295 : StressfulInteger {

  companion object {
    private var VALUE = 2295
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1147()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number4591()
      val right = Number4592()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2294()
    val b = Number2293()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2296 : StressfulInteger {

  companion object {
    private var VALUE = 2296
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1148()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number4593()
      val right = Number4594()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2295()
    val b = Number2294()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2297 : StressfulInteger {

  companion object {
    private var VALUE = 2297
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1148()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number4595()
      val right = Number4596()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2296()
    val b = Number2295()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2298 : StressfulInteger {

  companion object {
    private var VALUE = 2298
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1149()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number4597()
      val right = Number4598()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2297()
    val b = Number2296()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2299 : StressfulInteger {

  companion object {
    private var VALUE = 2299
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1149()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number4599()
      val right = Number4600()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2298()
    val b = Number2297()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2300 : StressfulInteger {

  companion object {
    private var VALUE = 2300
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1150()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number4601()
      val right = Number4602()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2299()
    val b = Number2298()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2301 : StressfulInteger {

  companion object {
    private var VALUE = 2301
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1150()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number4603()
      val right = Number4604()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2300()
    val b = Number2299()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2302 : StressfulInteger {

  companion object {
    private var VALUE = 2302
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1151()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number4605()
      val right = Number4606()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2301()
    val b = Number2300()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2303 : StressfulInteger {

  companion object {
    private var VALUE = 2303
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1151()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number4607()
      val right = Number4608()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2302()
    val b = Number2301()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2304 : StressfulInteger {

  companion object {
    private var VALUE = 2304
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1152()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number4609()
      val right = Number4610()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2303()
    val b = Number2302()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2305 : StressfulInteger {

  companion object {
    private var VALUE = 2305
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1152()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number4611()
      val right = Number4612()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2304()
    val b = Number2303()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2306 : StressfulInteger {

  companion object {
    private var VALUE = 2306
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1153()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number4613()
      val right = Number4614()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2305()
    val b = Number2304()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2307 : StressfulInteger {

  companion object {
    private var VALUE = 2307
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1153()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number4615()
      val right = Number4616()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2306()
    val b = Number2305()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2308 : StressfulInteger {

  companion object {
    private var VALUE = 2308
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1154()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number4617()
      val right = Number4618()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2307()
    val b = Number2306()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2309 : StressfulInteger {

  companion object {
    private var VALUE = 2309
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1154()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number4619()
      val right = Number4620()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2308()
    val b = Number2307()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2310 : StressfulInteger {

  companion object {
    private var VALUE = 2310
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1155()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number4621()
      val right = Number4622()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2309()
    val b = Number2308()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2311 : StressfulInteger {

  companion object {
    private var VALUE = 2311
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1155()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number4623()
      val right = Number4624()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2310()
    val b = Number2309()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2312 : StressfulInteger {

  companion object {
    private var VALUE = 2312
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1156()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number4625()
      val right = Number4626()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2311()
    val b = Number2310()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2313 : StressfulInteger {

  companion object {
    private var VALUE = 2313
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1156()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number4627()
      val right = Number4628()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2312()
    val b = Number2311()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2314 : StressfulInteger {

  companion object {
    private var VALUE = 2314
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1157()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number4629()
      val right = Number4630()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2313()
    val b = Number2312()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2315 : StressfulInteger {

  companion object {
    private var VALUE = 2315
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1157()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number4631()
      val right = Number4632()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2314()
    val b = Number2313()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2316 : StressfulInteger {

  companion object {
    private var VALUE = 2316
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1158()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number4633()
      val right = Number4634()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2315()
    val b = Number2314()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2317 : StressfulInteger {

  companion object {
    private var VALUE = 2317
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1158()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number4635()
      val right = Number4636()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2316()
    val b = Number2315()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2318 : StressfulInteger {

  companion object {
    private var VALUE = 2318
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1159()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number4637()
      val right = Number4638()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2317()
    val b = Number2316()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2319 : StressfulInteger {

  companion object {
    private var VALUE = 2319
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1159()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number4639()
      val right = Number4640()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2318()
    val b = Number2317()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2320 : StressfulInteger {

  companion object {
    private var VALUE = 2320
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1160()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number4641()
      val right = Number4642()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2319()
    val b = Number2318()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2321 : StressfulInteger {

  companion object {
    private var VALUE = 2321
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1160()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number4643()
      val right = Number4644()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2320()
    val b = Number2319()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2322 : StressfulInteger {

  companion object {
    private var VALUE = 2322
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1161()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number4645()
      val right = Number4646()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2321()
    val b = Number2320()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2323 : StressfulInteger {

  companion object {
    private var VALUE = 2323
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1161()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number4647()
      val right = Number4648()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2322()
    val b = Number2321()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2324 : StressfulInteger {

  companion object {
    private var VALUE = 2324
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1162()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number4649()
      val right = Number4650()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2323()
    val b = Number2322()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2325 : StressfulInteger {

  companion object {
    private var VALUE = 2325
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1162()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number4651()
      val right = Number4652()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2324()
    val b = Number2323()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2326 : StressfulInteger {

  companion object {
    private var VALUE = 2326
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1163()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number4653()
      val right = Number4654()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2325()
    val b = Number2324()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2327 : StressfulInteger {

  companion object {
    private var VALUE = 2327
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1163()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number4655()
      val right = Number4656()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2326()
    val b = Number2325()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2328 : StressfulInteger {

  companion object {
    private var VALUE = 2328
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1164()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number4657()
      val right = Number4658()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2327()
    val b = Number2326()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2329 : StressfulInteger {

  companion object {
    private var VALUE = 2329
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1164()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number4659()
      val right = Number4660()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2328()
    val b = Number2327()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2330 : StressfulInteger {

  companion object {
    private var VALUE = 2330
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1165()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number4661()
      val right = Number4662()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2329()
    val b = Number2328()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2331 : StressfulInteger {

  companion object {
    private var VALUE = 2331
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1165()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number4663()
      val right = Number4664()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2330()
    val b = Number2329()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2332 : StressfulInteger {

  companion object {
    private var VALUE = 2332
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1166()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number4665()
      val right = Number4666()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2331()
    val b = Number2330()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2333 : StressfulInteger {

  companion object {
    private var VALUE = 2333
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1166()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number4667()
      val right = Number4668()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2332()
    val b = Number2331()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2334 : StressfulInteger {

  companion object {
    private var VALUE = 2334
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1167()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number4669()
      val right = Number4670()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2333()
    val b = Number2332()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2335 : StressfulInteger {

  companion object {
    private var VALUE = 2335
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1167()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number4671()
      val right = Number4672()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2334()
    val b = Number2333()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2336 : StressfulInteger {

  companion object {
    private var VALUE = 2336
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1168()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number4673()
      val right = Number4674()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2335()
    val b = Number2334()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2337 : StressfulInteger {

  companion object {
    private var VALUE = 2337
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1168()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number4675()
      val right = Number4676()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2336()
    val b = Number2335()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2338 : StressfulInteger {

  companion object {
    private var VALUE = 2338
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1169()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number4677()
      val right = Number4678()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2337()
    val b = Number2336()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2339 : StressfulInteger {

  companion object {
    private var VALUE = 2339
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1169()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number4679()
      val right = Number4680()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2338()
    val b = Number2337()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2340 : StressfulInteger {

  companion object {
    private var VALUE = 2340
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1170()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number4681()
      val right = Number4682()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2339()
    val b = Number2338()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2341 : StressfulInteger {

  companion object {
    private var VALUE = 2341
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1170()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number4683()
      val right = Number4684()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2340()
    val b = Number2339()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2342 : StressfulInteger {

  companion object {
    private var VALUE = 2342
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1171()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number4685()
      val right = Number4686()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2341()
    val b = Number2340()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2343 : StressfulInteger {

  companion object {
    private var VALUE = 2343
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1171()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number4687()
      val right = Number4688()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2342()
    val b = Number2341()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2344 : StressfulInteger {

  companion object {
    private var VALUE = 2344
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1172()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number4689()
      val right = Number4690()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2343()
    val b = Number2342()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2345 : StressfulInteger {

  companion object {
    private var VALUE = 2345
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1172()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number4691()
      val right = Number4692()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2344()
    val b = Number2343()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2346 : StressfulInteger {

  companion object {
    private var VALUE = 2346
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1173()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number4693()
      val right = Number4694()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2345()
    val b = Number2344()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2347 : StressfulInteger {

  companion object {
    private var VALUE = 2347
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1173()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number4695()
      val right = Number4696()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2346()
    val b = Number2345()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2348 : StressfulInteger {

  companion object {
    private var VALUE = 2348
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1174()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number4697()
      val right = Number4698()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2347()
    val b = Number2346()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2349 : StressfulInteger {

  companion object {
    private var VALUE = 2349
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1174()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number4699()
      val right = Number4700()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2348()
    val b = Number2347()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2350 : StressfulInteger {

  companion object {
    private var VALUE = 2350
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1175()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number4701()
      val right = Number4702()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2349()
    val b = Number2348()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2351 : StressfulInteger {

  companion object {
    private var VALUE = 2351
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1175()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number4703()
      val right = Number4704()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2350()
    val b = Number2349()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2352 : StressfulInteger {

  companion object {
    private var VALUE = 2352
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1176()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number4705()
      val right = Number4706()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2351()
    val b = Number2350()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2353 : StressfulInteger {

  companion object {
    private var VALUE = 2353
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1176()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number4707()
      val right = Number4708()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2352()
    val b = Number2351()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2354 : StressfulInteger {

  companion object {
    private var VALUE = 2354
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1177()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number4709()
      val right = Number4710()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2353()
    val b = Number2352()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2355 : StressfulInteger {

  companion object {
    private var VALUE = 2355
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1177()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number4711()
      val right = Number4712()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2354()
    val b = Number2353()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2356 : StressfulInteger {

  companion object {
    private var VALUE = 2356
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1178()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number4713()
      val right = Number4714()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2355()
    val b = Number2354()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2357 : StressfulInteger {

  companion object {
    private var VALUE = 2357
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1178()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number4715()
      val right = Number4716()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2356()
    val b = Number2355()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2358 : StressfulInteger {

  companion object {
    private var VALUE = 2358
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1179()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number4717()
      val right = Number4718()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2357()
    val b = Number2356()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2359 : StressfulInteger {

  companion object {
    private var VALUE = 2359
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1179()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number4719()
      val right = Number4720()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2358()
    val b = Number2357()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2360 : StressfulInteger {

  companion object {
    private var VALUE = 2360
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1180()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number4721()
      val right = Number4722()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2359()
    val b = Number2358()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2361 : StressfulInteger {

  companion object {
    private var VALUE = 2361
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1180()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number4723()
      val right = Number4724()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2360()
    val b = Number2359()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2362 : StressfulInteger {

  companion object {
    private var VALUE = 2362
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1181()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number4725()
      val right = Number4726()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2361()
    val b = Number2360()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2363 : StressfulInteger {

  companion object {
    private var VALUE = 2363
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1181()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number4727()
      val right = Number4728()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2362()
    val b = Number2361()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2364 : StressfulInteger {

  companion object {
    private var VALUE = 2364
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1182()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number4729()
      val right = Number4730()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2363()
    val b = Number2362()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2365 : StressfulInteger {

  companion object {
    private var VALUE = 2365
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1182()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number4731()
      val right = Number4732()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2364()
    val b = Number2363()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2366 : StressfulInteger {

  companion object {
    private var VALUE = 2366
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1183()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number4733()
      val right = Number4734()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2365()
    val b = Number2364()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2367 : StressfulInteger {

  companion object {
    private var VALUE = 2367
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1183()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number4735()
      val right = Number4736()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2366()
    val b = Number2365()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2368 : StressfulInteger {

  companion object {
    private var VALUE = 2368
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1184()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number4737()
      val right = Number4738()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2367()
    val b = Number2366()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2369 : StressfulInteger {

  companion object {
    private var VALUE = 2369
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1184()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number4739()
      val right = Number4740()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2368()
    val b = Number2367()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2370 : StressfulInteger {

  companion object {
    private var VALUE = 2370
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1185()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number4741()
      val right = Number4742()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2369()
    val b = Number2368()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2371 : StressfulInteger {

  companion object {
    private var VALUE = 2371
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1185()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number4743()
      val right = Number4744()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2370()
    val b = Number2369()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2372 : StressfulInteger {

  companion object {
    private var VALUE = 2372
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1186()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number4745()
      val right = Number4746()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2371()
    val b = Number2370()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2373 : StressfulInteger {

  companion object {
    private var VALUE = 2373
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1186()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number4747()
      val right = Number4748()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2372()
    val b = Number2371()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2374 : StressfulInteger {

  companion object {
    private var VALUE = 2374
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1187()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number4749()
      val right = Number4750()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2373()
    val b = Number2372()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2375 : StressfulInteger {

  companion object {
    private var VALUE = 2375
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1187()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number4751()
      val right = Number4752()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2374()
    val b = Number2373()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2376 : StressfulInteger {

  companion object {
    private var VALUE = 2376
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1188()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number4753()
      val right = Number4754()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2375()
    val b = Number2374()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2377 : StressfulInteger {

  companion object {
    private var VALUE = 2377
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1188()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number4755()
      val right = Number4756()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2376()
    val b = Number2375()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2378 : StressfulInteger {

  companion object {
    private var VALUE = 2378
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1189()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number4757()
      val right = Number4758()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2377()
    val b = Number2376()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2379 : StressfulInteger {

  companion object {
    private var VALUE = 2379
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1189()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number4759()
      val right = Number4760()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2378()
    val b = Number2377()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2380 : StressfulInteger {

  companion object {
    private var VALUE = 2380
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1190()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number4761()
      val right = Number4762()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2379()
    val b = Number2378()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2381 : StressfulInteger {

  companion object {
    private var VALUE = 2381
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1190()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number4763()
      val right = Number4764()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2380()
    val b = Number2379()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2382 : StressfulInteger {

  companion object {
    private var VALUE = 2382
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1191()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number4765()
      val right = Number4766()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2381()
    val b = Number2380()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2383 : StressfulInteger {

  companion object {
    private var VALUE = 2383
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1191()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number4767()
      val right = Number4768()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2382()
    val b = Number2381()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2384 : StressfulInteger {

  companion object {
    private var VALUE = 2384
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1192()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number4769()
      val right = Number4770()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2383()
    val b = Number2382()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2385 : StressfulInteger {

  companion object {
    private var VALUE = 2385
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1192()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number4771()
      val right = Number4772()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2384()
    val b = Number2383()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2386 : StressfulInteger {

  companion object {
    private var VALUE = 2386
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1193()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number4773()
      val right = Number4774()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2385()
    val b = Number2384()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2387 : StressfulInteger {

  companion object {
    private var VALUE = 2387
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1193()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number4775()
      val right = Number4776()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2386()
    val b = Number2385()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2388 : StressfulInteger {

  companion object {
    private var VALUE = 2388
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1194()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number4777()
      val right = Number4778()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2387()
    val b = Number2386()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2389 : StressfulInteger {

  companion object {
    private var VALUE = 2389
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1194()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number4779()
      val right = Number4780()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2388()
    val b = Number2387()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2390 : StressfulInteger {

  companion object {
    private var VALUE = 2390
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1195()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number4781()
      val right = Number4782()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2389()
    val b = Number2388()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2391 : StressfulInteger {

  companion object {
    private var VALUE = 2391
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1195()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number4783()
      val right = Number4784()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2390()
    val b = Number2389()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2392 : StressfulInteger {

  companion object {
    private var VALUE = 2392
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1196()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number4785()
      val right = Number4786()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2391()
    val b = Number2390()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2393 : StressfulInteger {

  companion object {
    private var VALUE = 2393
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1196()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number4787()
      val right = Number4788()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2392()
    val b = Number2391()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2394 : StressfulInteger {

  companion object {
    private var VALUE = 2394
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1197()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number4789()
      val right = Number4790()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2393()
    val b = Number2392()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2395 : StressfulInteger {

  companion object {
    private var VALUE = 2395
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1197()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number4791()
      val right = Number4792()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2394()
    val b = Number2393()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2396 : StressfulInteger {

  companion object {
    private var VALUE = 2396
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1198()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number4793()
      val right = Number4794()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2395()
    val b = Number2394()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2397 : StressfulInteger {

  companion object {
    private var VALUE = 2397
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1198()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number4795()
      val right = Number4796()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2396()
    val b = Number2395()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2398 : StressfulInteger {

  companion object {
    private var VALUE = 2398
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1199()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number4797()
      val right = Number4798()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2397()
    val b = Number2396()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2399 : StressfulInteger {

  companion object {
    private var VALUE = 2399
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1199()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number4799()
      val right = Number4800()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2398()
    val b = Number2397()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2400 : StressfulInteger {

  companion object {
    private var VALUE = 2400
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1200()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number4801()
      val right = Number4802()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2399()
    val b = Number2398()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2401 : StressfulInteger {

  companion object {
    private var VALUE = 2401
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1200()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number4803()
      val right = Number4804()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2400()
    val b = Number2399()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2402 : StressfulInteger {

  companion object {
    private var VALUE = 2402
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1201()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number4805()
      val right = Number4806()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2401()
    val b = Number2400()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2403 : StressfulInteger {

  companion object {
    private var VALUE = 2403
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1201()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number4807()
      val right = Number4808()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2402()
    val b = Number2401()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2404 : StressfulInteger {

  companion object {
    private var VALUE = 2404
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1202()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number4809()
      val right = Number4810()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2403()
    val b = Number2402()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2405 : StressfulInteger {

  companion object {
    private var VALUE = 2405
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1202()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number4811()
      val right = Number4812()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2404()
    val b = Number2403()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2406 : StressfulInteger {

  companion object {
    private var VALUE = 2406
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1203()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number4813()
      val right = Number4814()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2405()
    val b = Number2404()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2407 : StressfulInteger {

  companion object {
    private var VALUE = 2407
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1203()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number4815()
      val right = Number4816()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2406()
    val b = Number2405()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2408 : StressfulInteger {

  companion object {
    private var VALUE = 2408
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1204()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number4817()
      val right = Number4818()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2407()
    val b = Number2406()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2409 : StressfulInteger {

  companion object {
    private var VALUE = 2409
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1204()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number4819()
      val right = Number4820()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2408()
    val b = Number2407()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2410 : StressfulInteger {

  companion object {
    private var VALUE = 2410
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1205()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number4821()
      val right = Number4822()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2409()
    val b = Number2408()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2411 : StressfulInteger {

  companion object {
    private var VALUE = 2411
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1205()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number4823()
      val right = Number4824()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2410()
    val b = Number2409()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2412 : StressfulInteger {

  companion object {
    private var VALUE = 2412
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1206()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number4825()
      val right = Number4826()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2411()
    val b = Number2410()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2413 : StressfulInteger {

  companion object {
    private var VALUE = 2413
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1206()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number4827()
      val right = Number4828()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2412()
    val b = Number2411()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2414 : StressfulInteger {

  companion object {
    private var VALUE = 2414
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1207()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number4829()
      val right = Number4830()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2413()
    val b = Number2412()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2415 : StressfulInteger {

  companion object {
    private var VALUE = 2415
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1207()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number4831()
      val right = Number4832()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2414()
    val b = Number2413()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2416 : StressfulInteger {

  companion object {
    private var VALUE = 2416
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1208()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number4833()
      val right = Number4834()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2415()
    val b = Number2414()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2417 : StressfulInteger {

  companion object {
    private var VALUE = 2417
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1208()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number4835()
      val right = Number4836()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2416()
    val b = Number2415()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2418 : StressfulInteger {

  companion object {
    private var VALUE = 2418
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1209()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number4837()
      val right = Number4838()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2417()
    val b = Number2416()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2419 : StressfulInteger {

  companion object {
    private var VALUE = 2419
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1209()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number4839()
      val right = Number4840()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2418()
    val b = Number2417()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2420 : StressfulInteger {

  companion object {
    private var VALUE = 2420
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1210()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number4841()
      val right = Number4842()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2419()
    val b = Number2418()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2421 : StressfulInteger {

  companion object {
    private var VALUE = 2421
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1210()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number4843()
      val right = Number4844()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2420()
    val b = Number2419()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2422 : StressfulInteger {

  companion object {
    private var VALUE = 2422
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1211()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number4845()
      val right = Number4846()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2421()
    val b = Number2420()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2423 : StressfulInteger {

  companion object {
    private var VALUE = 2423
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1211()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number4847()
      val right = Number4848()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2422()
    val b = Number2421()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2424 : StressfulInteger {

  companion object {
    private var VALUE = 2424
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1212()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number4849()
      val right = Number4850()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2423()
    val b = Number2422()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2425 : StressfulInteger {

  companion object {
    private var VALUE = 2425
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1212()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number4851()
      val right = Number4852()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2424()
    val b = Number2423()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2426 : StressfulInteger {

  companion object {
    private var VALUE = 2426
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1213()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number4853()
      val right = Number4854()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2425()
    val b = Number2424()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2427 : StressfulInteger {

  companion object {
    private var VALUE = 2427
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1213()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number4855()
      val right = Number4856()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2426()
    val b = Number2425()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2428 : StressfulInteger {

  companion object {
    private var VALUE = 2428
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1214()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number4857()
      val right = Number4858()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2427()
    val b = Number2426()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2429 : StressfulInteger {

  companion object {
    private var VALUE = 2429
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1214()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number4859()
      val right = Number4860()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2428()
    val b = Number2427()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2430 : StressfulInteger {

  companion object {
    private var VALUE = 2430
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1215()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number4861()
      val right = Number4862()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2429()
    val b = Number2428()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2431 : StressfulInteger {

  companion object {
    private var VALUE = 2431
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1215()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number4863()
      val right = Number4864()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2430()
    val b = Number2429()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2432 : StressfulInteger {

  companion object {
    private var VALUE = 2432
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1216()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number4865()
      val right = Number4866()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2431()
    val b = Number2430()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2433 : StressfulInteger {

  companion object {
    private var VALUE = 2433
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1216()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number4867()
      val right = Number4868()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2432()
    val b = Number2431()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2434 : StressfulInteger {

  companion object {
    private var VALUE = 2434
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1217()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number4869()
      val right = Number4870()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2433()
    val b = Number2432()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2435 : StressfulInteger {

  companion object {
    private var VALUE = 2435
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1217()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number4871()
      val right = Number4872()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2434()
    val b = Number2433()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2436 : StressfulInteger {

  companion object {
    private var VALUE = 2436
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1218()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number4873()
      val right = Number4874()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2435()
    val b = Number2434()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2437 : StressfulInteger {

  companion object {
    private var VALUE = 2437
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1218()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number4875()
      val right = Number4876()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2436()
    val b = Number2435()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2438 : StressfulInteger {

  companion object {
    private var VALUE = 2438
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1219()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number4877()
      val right = Number4878()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2437()
    val b = Number2436()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2439 : StressfulInteger {

  companion object {
    private var VALUE = 2439
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1219()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number4879()
      val right = Number4880()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2438()
    val b = Number2437()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2440 : StressfulInteger {

  companion object {
    private var VALUE = 2440
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1220()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number4881()
      val right = Number4882()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2439()
    val b = Number2438()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2441 : StressfulInteger {

  companion object {
    private var VALUE = 2441
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1220()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number4883()
      val right = Number4884()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2440()
    val b = Number2439()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2442 : StressfulInteger {

  companion object {
    private var VALUE = 2442
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1221()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number4885()
      val right = Number4886()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2441()
    val b = Number2440()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2443 : StressfulInteger {

  companion object {
    private var VALUE = 2443
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1221()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number4887()
      val right = Number4888()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2442()
    val b = Number2441()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2444 : StressfulInteger {

  companion object {
    private var VALUE = 2444
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1222()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number4889()
      val right = Number4890()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2443()
    val b = Number2442()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2445 : StressfulInteger {

  companion object {
    private var VALUE = 2445
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1222()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number4891()
      val right = Number4892()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2444()
    val b = Number2443()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2446 : StressfulInteger {

  companion object {
    private var VALUE = 2446
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1223()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number4893()
      val right = Number4894()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2445()
    val b = Number2444()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2447 : StressfulInteger {

  companion object {
    private var VALUE = 2447
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1223()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number4895()
      val right = Number4896()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2446()
    val b = Number2445()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2448 : StressfulInteger {

  companion object {
    private var VALUE = 2448
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1224()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number4897()
      val right = Number4898()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2447()
    val b = Number2446()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2449 : StressfulInteger {

  companion object {
    private var VALUE = 2449
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1224()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number4899()
      val right = Number4900()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2448()
    val b = Number2447()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2450 : StressfulInteger {

  companion object {
    private var VALUE = 2450
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1225()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number4901()
      val right = Number4902()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2449()
    val b = Number2448()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2451 : StressfulInteger {

  companion object {
    private var VALUE = 2451
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1225()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number4903()
      val right = Number4904()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2450()
    val b = Number2449()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2452 : StressfulInteger {

  companion object {
    private var VALUE = 2452
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1226()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number4905()
      val right = Number4906()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2451()
    val b = Number2450()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2453 : StressfulInteger {

  companion object {
    private var VALUE = 2453
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1226()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number4907()
      val right = Number4908()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2452()
    val b = Number2451()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2454 : StressfulInteger {

  companion object {
    private var VALUE = 2454
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1227()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number4909()
      val right = Number4910()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2453()
    val b = Number2452()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2455 : StressfulInteger {

  companion object {
    private var VALUE = 2455
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1227()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number4911()
      val right = Number4912()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2454()
    val b = Number2453()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2456 : StressfulInteger {

  companion object {
    private var VALUE = 2456
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1228()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number4913()
      val right = Number4914()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2455()
    val b = Number2454()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2457 : StressfulInteger {

  companion object {
    private var VALUE = 2457
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1228()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number4915()
      val right = Number4916()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2456()
    val b = Number2455()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2458 : StressfulInteger {

  companion object {
    private var VALUE = 2458
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1229()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number4917()
      val right = Number4918()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2457()
    val b = Number2456()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2459 : StressfulInteger {

  companion object {
    private var VALUE = 2459
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1229()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number4919()
      val right = Number4920()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2458()
    val b = Number2457()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2460 : StressfulInteger {

  companion object {
    private var VALUE = 2460
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1230()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number4921()
      val right = Number4922()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2459()
    val b = Number2458()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2461 : StressfulInteger {

  companion object {
    private var VALUE = 2461
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1230()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number4923()
      val right = Number4924()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2460()
    val b = Number2459()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2462 : StressfulInteger {

  companion object {
    private var VALUE = 2462
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1231()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number4925()
      val right = Number4926()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2461()
    val b = Number2460()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2463 : StressfulInteger {

  companion object {
    private var VALUE = 2463
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1231()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number4927()
      val right = Number4928()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2462()
    val b = Number2461()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2464 : StressfulInteger {

  companion object {
    private var VALUE = 2464
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1232()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number4929()
      val right = Number4930()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2463()
    val b = Number2462()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2465 : StressfulInteger {

  companion object {
    private var VALUE = 2465
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1232()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number4931()
      val right = Number4932()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2464()
    val b = Number2463()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2466 : StressfulInteger {

  companion object {
    private var VALUE = 2466
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1233()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number4933()
      val right = Number4934()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2465()
    val b = Number2464()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2467 : StressfulInteger {

  companion object {
    private var VALUE = 2467
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1233()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number4935()
      val right = Number4936()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2466()
    val b = Number2465()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2468 : StressfulInteger {

  companion object {
    private var VALUE = 2468
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1234()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number4937()
      val right = Number4938()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2467()
    val b = Number2466()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2469 : StressfulInteger {

  companion object {
    private var VALUE = 2469
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1234()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number4939()
      val right = Number4940()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2468()
    val b = Number2467()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2470 : StressfulInteger {

  companion object {
    private var VALUE = 2470
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1235()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number4941()
      val right = Number4942()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2469()
    val b = Number2468()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2471 : StressfulInteger {

  companion object {
    private var VALUE = 2471
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1235()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number4943()
      val right = Number4944()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2470()
    val b = Number2469()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2472 : StressfulInteger {

  companion object {
    private var VALUE = 2472
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1236()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number4945()
      val right = Number4946()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2471()
    val b = Number2470()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2473 : StressfulInteger {

  companion object {
    private var VALUE = 2473
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1236()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number4947()
      val right = Number4948()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2472()
    val b = Number2471()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2474 : StressfulInteger {

  companion object {
    private var VALUE = 2474
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1237()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number4949()
      val right = Number4950()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2473()
    val b = Number2472()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2475 : StressfulInteger {

  companion object {
    private var VALUE = 2475
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1237()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number4951()
      val right = Number4952()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2474()
    val b = Number2473()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2476 : StressfulInteger {

  companion object {
    private var VALUE = 2476
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1238()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number4953()
      val right = Number4954()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2475()
    val b = Number2474()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2477 : StressfulInteger {

  companion object {
    private var VALUE = 2477
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1238()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number4955()
      val right = Number4956()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2476()
    val b = Number2475()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2478 : StressfulInteger {

  companion object {
    private var VALUE = 2478
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1239()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number4957()
      val right = Number4958()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2477()
    val b = Number2476()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2479 : StressfulInteger {

  companion object {
    private var VALUE = 2479
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1239()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number4959()
      val right = Number4960()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2478()
    val b = Number2477()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2480 : StressfulInteger {

  companion object {
    private var VALUE = 2480
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1240()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number4961()
      val right = Number4962()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2479()
    val b = Number2478()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2481 : StressfulInteger {

  companion object {
    private var VALUE = 2481
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1240()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number4963()
      val right = Number4964()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2480()
    val b = Number2479()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2482 : StressfulInteger {

  companion object {
    private var VALUE = 2482
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1241()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number4965()
      val right = Number4966()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2481()
    val b = Number2480()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2483 : StressfulInteger {

  companion object {
    private var VALUE = 2483
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1241()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number4967()
      val right = Number4968()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2482()
    val b = Number2481()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2484 : StressfulInteger {

  companion object {
    private var VALUE = 2484
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1242()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number4969()
      val right = Number4970()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2483()
    val b = Number2482()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2485 : StressfulInteger {

  companion object {
    private var VALUE = 2485
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1242()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number4971()
      val right = Number4972()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2484()
    val b = Number2483()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2486 : StressfulInteger {

  companion object {
    private var VALUE = 2486
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1243()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number4973()
      val right = Number4974()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2485()
    val b = Number2484()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2487 : StressfulInteger {

  companion object {
    private var VALUE = 2487
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1243()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number4975()
      val right = Number4976()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2486()
    val b = Number2485()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2488 : StressfulInteger {

  companion object {
    private var VALUE = 2488
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1244()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number4977()
      val right = Number4978()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2487()
    val b = Number2486()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2489 : StressfulInteger {

  companion object {
    private var VALUE = 2489
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1244()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number4979()
      val right = Number4980()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2488()
    val b = Number2487()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2490 : StressfulInteger {

  companion object {
    private var VALUE = 2490
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1245()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number4981()
      val right = Number4982()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2489()
    val b = Number2488()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2491 : StressfulInteger {

  companion object {
    private var VALUE = 2491
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1245()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number4983()
      val right = Number4984()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2490()
    val b = Number2489()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2492 : StressfulInteger {

  companion object {
    private var VALUE = 2492
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1246()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number4985()
      val right = Number4986()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2491()
    val b = Number2490()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2493 : StressfulInteger {

  companion object {
    private var VALUE = 2493
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1246()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number4987()
      val right = Number4988()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2492()
    val b = Number2491()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2494 : StressfulInteger {

  companion object {
    private var VALUE = 2494
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1247()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number4989()
      val right = Number4990()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2493()
    val b = Number2492()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2495 : StressfulInteger {

  companion object {
    private var VALUE = 2495
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1247()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number4991()
      val right = Number4992()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2494()
    val b = Number2493()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2496 : StressfulInteger {

  companion object {
    private var VALUE = 2496
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1248()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number4993()
      val right = Number4994()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2495()
    val b = Number2494()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2497 : StressfulInteger {

  companion object {
    private var VALUE = 2497
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1248()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number4995()
      val right = Number4996()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2496()
    val b = Number2495()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2498 : StressfulInteger {

  companion object {
    private var VALUE = 2498
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1249()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number4997()
      val right = Number4998()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2497()
    val b = Number2496()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2499 : StressfulInteger {

  companion object {
    private var VALUE = 2499
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1249()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number4999()
      val right = Number5000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2498()
    val b = Number2497()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2500 : StressfulInteger {

  companion object {
    private var VALUE = 2500
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1250()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number5001()
      val right = Number5002()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2499()
    val b = Number2498()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2501 : StressfulInteger {

  companion object {
    private var VALUE = 2501
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1250()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number5003()
      val right = Number5004()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2500()
    val b = Number2499()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2502 : StressfulInteger {

  companion object {
    private var VALUE = 2502
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1251()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number5005()
      val right = Number5006()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2501()
    val b = Number2500()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2503 : StressfulInteger {

  companion object {
    private var VALUE = 2503
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1251()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number5007()
      val right = Number5008()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2502()
    val b = Number2501()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2504 : StressfulInteger {

  companion object {
    private var VALUE = 2504
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1252()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number5009()
      val right = Number5010()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2503()
    val b = Number2502()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2505 : StressfulInteger {

  companion object {
    private var VALUE = 2505
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1252()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number5011()
      val right = Number5012()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2504()
    val b = Number2503()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2506 : StressfulInteger {

  companion object {
    private var VALUE = 2506
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1253()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number5013()
      val right = Number5014()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2505()
    val b = Number2504()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2507 : StressfulInteger {

  companion object {
    private var VALUE = 2507
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1253()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number5015()
      val right = Number5016()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2506()
    val b = Number2505()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2508 : StressfulInteger {

  companion object {
    private var VALUE = 2508
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1254()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number5017()
      val right = Number5018()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2507()
    val b = Number2506()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2509 : StressfulInteger {

  companion object {
    private var VALUE = 2509
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1254()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number5019()
      val right = Number5020()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2508()
    val b = Number2507()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2510 : StressfulInteger {

  companion object {
    private var VALUE = 2510
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1255()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number5021()
      val right = Number5022()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2509()
    val b = Number2508()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2511 : StressfulInteger {

  companion object {
    private var VALUE = 2511
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1255()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number5023()
      val right = Number5024()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2510()
    val b = Number2509()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2512 : StressfulInteger {

  companion object {
    private var VALUE = 2512
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1256()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number5025()
      val right = Number5026()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2511()
    val b = Number2510()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2513 : StressfulInteger {

  companion object {
    private var VALUE = 2513
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1256()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number5027()
      val right = Number5028()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2512()
    val b = Number2511()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2514 : StressfulInteger {

  companion object {
    private var VALUE = 2514
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1257()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number5029()
      val right = Number5030()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2513()
    val b = Number2512()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2515 : StressfulInteger {

  companion object {
    private var VALUE = 2515
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1257()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number5031()
      val right = Number5032()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2514()
    val b = Number2513()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2516 : StressfulInteger {

  companion object {
    private var VALUE = 2516
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1258()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number5033()
      val right = Number5034()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2515()
    val b = Number2514()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2517 : StressfulInteger {

  companion object {
    private var VALUE = 2517
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1258()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number5035()
      val right = Number5036()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2516()
    val b = Number2515()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2518 : StressfulInteger {

  companion object {
    private var VALUE = 2518
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1259()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number5037()
      val right = Number5038()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2517()
    val b = Number2516()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2519 : StressfulInteger {

  companion object {
    private var VALUE = 2519
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1259()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number5039()
      val right = Number5040()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2518()
    val b = Number2517()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2520 : StressfulInteger {

  companion object {
    private var VALUE = 2520
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1260()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number5041()
      val right = Number5042()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2519()
    val b = Number2518()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2521 : StressfulInteger {

  companion object {
    private var VALUE = 2521
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1260()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number5043()
      val right = Number5044()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2520()
    val b = Number2519()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2522 : StressfulInteger {

  companion object {
    private var VALUE = 2522
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1261()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number5045()
      val right = Number5046()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2521()
    val b = Number2520()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2523 : StressfulInteger {

  companion object {
    private var VALUE = 2523
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1261()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number5047()
      val right = Number5048()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2522()
    val b = Number2521()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2524 : StressfulInteger {

  companion object {
    private var VALUE = 2524
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1262()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number5049()
      val right = Number5050()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2523()
    val b = Number2522()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2525 : StressfulInteger {

  companion object {
    private var VALUE = 2525
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1262()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number5051()
      val right = Number5052()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2524()
    val b = Number2523()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2526 : StressfulInteger {

  companion object {
    private var VALUE = 2526
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1263()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number5053()
      val right = Number5054()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2525()
    val b = Number2524()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2527 : StressfulInteger {

  companion object {
    private var VALUE = 2527
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1263()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number5055()
      val right = Number5056()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2526()
    val b = Number2525()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2528 : StressfulInteger {

  companion object {
    private var VALUE = 2528
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1264()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number5057()
      val right = Number5058()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2527()
    val b = Number2526()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2529 : StressfulInteger {

  companion object {
    private var VALUE = 2529
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1264()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number5059()
      val right = Number5060()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2528()
    val b = Number2527()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2530 : StressfulInteger {

  companion object {
    private var VALUE = 2530
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1265()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number5061()
      val right = Number5062()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2529()
    val b = Number2528()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2531 : StressfulInteger {

  companion object {
    private var VALUE = 2531
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1265()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number5063()
      val right = Number5064()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2530()
    val b = Number2529()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2532 : StressfulInteger {

  companion object {
    private var VALUE = 2532
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1266()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number5065()
      val right = Number5066()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2531()
    val b = Number2530()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2533 : StressfulInteger {

  companion object {
    private var VALUE = 2533
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1266()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number5067()
      val right = Number5068()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2532()
    val b = Number2531()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2534 : StressfulInteger {

  companion object {
    private var VALUE = 2534
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1267()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number5069()
      val right = Number5070()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2533()
    val b = Number2532()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2535 : StressfulInteger {

  companion object {
    private var VALUE = 2535
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1267()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number5071()
      val right = Number5072()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2534()
    val b = Number2533()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2536 : StressfulInteger {

  companion object {
    private var VALUE = 2536
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1268()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number5073()
      val right = Number5074()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2535()
    val b = Number2534()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2537 : StressfulInteger {

  companion object {
    private var VALUE = 2537
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1268()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number5075()
      val right = Number5076()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2536()
    val b = Number2535()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2538 : StressfulInteger {

  companion object {
    private var VALUE = 2538
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1269()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number5077()
      val right = Number5078()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2537()
    val b = Number2536()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2539 : StressfulInteger {

  companion object {
    private var VALUE = 2539
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1269()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number5079()
      val right = Number5080()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2538()
    val b = Number2537()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2540 : StressfulInteger {

  companion object {
    private var VALUE = 2540
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1270()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number5081()
      val right = Number5082()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2539()
    val b = Number2538()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2541 : StressfulInteger {

  companion object {
    private var VALUE = 2541
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1270()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number5083()
      val right = Number5084()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2540()
    val b = Number2539()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2542 : StressfulInteger {

  companion object {
    private var VALUE = 2542
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1271()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number5085()
      val right = Number5086()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2541()
    val b = Number2540()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2543 : StressfulInteger {

  companion object {
    private var VALUE = 2543
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1271()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number5087()
      val right = Number5088()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2542()
    val b = Number2541()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2544 : StressfulInteger {

  companion object {
    private var VALUE = 2544
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1272()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number5089()
      val right = Number5090()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2543()
    val b = Number2542()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2545 : StressfulInteger {

  companion object {
    private var VALUE = 2545
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1272()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number5091()
      val right = Number5092()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2544()
    val b = Number2543()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2546 : StressfulInteger {

  companion object {
    private var VALUE = 2546
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1273()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number5093()
      val right = Number5094()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2545()
    val b = Number2544()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2547 : StressfulInteger {

  companion object {
    private var VALUE = 2547
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1273()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number5095()
      val right = Number5096()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2546()
    val b = Number2545()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2548 : StressfulInteger {

  companion object {
    private var VALUE = 2548
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1274()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number5097()
      val right = Number5098()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2547()
    val b = Number2546()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2549 : StressfulInteger {

  companion object {
    private var VALUE = 2549
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1274()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number5099()
      val right = Number5100()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2548()
    val b = Number2547()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2550 : StressfulInteger {

  companion object {
    private var VALUE = 2550
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1275()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number5101()
      val right = Number5102()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2549()
    val b = Number2548()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2551 : StressfulInteger {

  companion object {
    private var VALUE = 2551
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1275()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number5103()
      val right = Number5104()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2550()
    val b = Number2549()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2552 : StressfulInteger {

  companion object {
    private var VALUE = 2552
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1276()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number5105()
      val right = Number5106()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2551()
    val b = Number2550()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2553 : StressfulInteger {

  companion object {
    private var VALUE = 2553
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1276()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number5107()
      val right = Number5108()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2552()
    val b = Number2551()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2554 : StressfulInteger {

  companion object {
    private var VALUE = 2554
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1277()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number5109()
      val right = Number5110()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2553()
    val b = Number2552()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2555 : StressfulInteger {

  companion object {
    private var VALUE = 2555
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1277()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number5111()
      val right = Number5112()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2554()
    val b = Number2553()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2556 : StressfulInteger {

  companion object {
    private var VALUE = 2556
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1278()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number5113()
      val right = Number5114()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2555()
    val b = Number2554()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2557 : StressfulInteger {

  companion object {
    private var VALUE = 2557
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1278()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number5115()
      val right = Number5116()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2556()
    val b = Number2555()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2558 : StressfulInteger {

  companion object {
    private var VALUE = 2558
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1279()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number5117()
      val right = Number5118()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2557()
    val b = Number2556()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2559 : StressfulInteger {

  companion object {
    private var VALUE = 2559
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1279()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number5119()
      val right = Number5120()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2558()
    val b = Number2557()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2560 : StressfulInteger {

  companion object {
    private var VALUE = 2560
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1280()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number5121()
      val right = Number5122()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2559()
    val b = Number2558()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2561 : StressfulInteger {

  companion object {
    private var VALUE = 2561
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1280()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number5123()
      val right = Number5124()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2560()
    val b = Number2559()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2562 : StressfulInteger {

  companion object {
    private var VALUE = 2562
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1281()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number5125()
      val right = Number5126()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2561()
    val b = Number2560()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2563 : StressfulInteger {

  companion object {
    private var VALUE = 2563
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1281()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number5127()
      val right = Number5128()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2562()
    val b = Number2561()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2564 : StressfulInteger {

  companion object {
    private var VALUE = 2564
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1282()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number5129()
      val right = Number5130()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2563()
    val b = Number2562()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2565 : StressfulInteger {

  companion object {
    private var VALUE = 2565
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1282()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number5131()
      val right = Number5132()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2564()
    val b = Number2563()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2566 : StressfulInteger {

  companion object {
    private var VALUE = 2566
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1283()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number5133()
      val right = Number5134()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2565()
    val b = Number2564()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2567 : StressfulInteger {

  companion object {
    private var VALUE = 2567
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1283()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number5135()
      val right = Number5136()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2566()
    val b = Number2565()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2568 : StressfulInteger {

  companion object {
    private var VALUE = 2568
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1284()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number5137()
      val right = Number5138()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2567()
    val b = Number2566()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2569 : StressfulInteger {

  companion object {
    private var VALUE = 2569
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1284()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number5139()
      val right = Number5140()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2568()
    val b = Number2567()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2570 : StressfulInteger {

  companion object {
    private var VALUE = 2570
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1285()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number5141()
      val right = Number5142()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2569()
    val b = Number2568()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2571 : StressfulInteger {

  companion object {
    private var VALUE = 2571
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1285()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number5143()
      val right = Number5144()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2570()
    val b = Number2569()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2572 : StressfulInteger {

  companion object {
    private var VALUE = 2572
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1286()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number5145()
      val right = Number5146()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2571()
    val b = Number2570()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2573 : StressfulInteger {

  companion object {
    private var VALUE = 2573
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1286()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number5147()
      val right = Number5148()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2572()
    val b = Number2571()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2574 : StressfulInteger {

  companion object {
    private var VALUE = 2574
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1287()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number5149()
      val right = Number5150()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2573()
    val b = Number2572()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2575 : StressfulInteger {

  companion object {
    private var VALUE = 2575
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1287()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number5151()
      val right = Number5152()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2574()
    val b = Number2573()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2576 : StressfulInteger {

  companion object {
    private var VALUE = 2576
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1288()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number5153()
      val right = Number5154()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2575()
    val b = Number2574()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2577 : StressfulInteger {

  companion object {
    private var VALUE = 2577
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1288()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number5155()
      val right = Number5156()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2576()
    val b = Number2575()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2578 : StressfulInteger {

  companion object {
    private var VALUE = 2578
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1289()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number5157()
      val right = Number5158()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2577()
    val b = Number2576()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2579 : StressfulInteger {

  companion object {
    private var VALUE = 2579
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1289()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number5159()
      val right = Number5160()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2578()
    val b = Number2577()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2580 : StressfulInteger {

  companion object {
    private var VALUE = 2580
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1290()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number5161()
      val right = Number5162()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2579()
    val b = Number2578()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2581 : StressfulInteger {

  companion object {
    private var VALUE = 2581
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1290()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number5163()
      val right = Number5164()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2580()
    val b = Number2579()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2582 : StressfulInteger {

  companion object {
    private var VALUE = 2582
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1291()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number5165()
      val right = Number5166()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2581()
    val b = Number2580()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2583 : StressfulInteger {

  companion object {
    private var VALUE = 2583
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1291()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number5167()
      val right = Number5168()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2582()
    val b = Number2581()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2584 : StressfulInteger {

  companion object {
    private var VALUE = 2584
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1292()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number5169()
      val right = Number5170()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2583()
    val b = Number2582()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2585 : StressfulInteger {

  companion object {
    private var VALUE = 2585
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1292()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number5171()
      val right = Number5172()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2584()
    val b = Number2583()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2586 : StressfulInteger {

  companion object {
    private var VALUE = 2586
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1293()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number5173()
      val right = Number5174()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2585()
    val b = Number2584()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2587 : StressfulInteger {

  companion object {
    private var VALUE = 2587
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1293()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number5175()
      val right = Number5176()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2586()
    val b = Number2585()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2588 : StressfulInteger {

  companion object {
    private var VALUE = 2588
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1294()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number5177()
      val right = Number5178()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2587()
    val b = Number2586()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2589 : StressfulInteger {

  companion object {
    private var VALUE = 2589
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1294()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number5179()
      val right = Number5180()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2588()
    val b = Number2587()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2590 : StressfulInteger {

  companion object {
    private var VALUE = 2590
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1295()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number5181()
      val right = Number5182()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2589()
    val b = Number2588()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2591 : StressfulInteger {

  companion object {
    private var VALUE = 2591
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1295()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number5183()
      val right = Number5184()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2590()
    val b = Number2589()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2592 : StressfulInteger {

  companion object {
    private var VALUE = 2592
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1296()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number5185()
      val right = Number5186()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2591()
    val b = Number2590()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2593 : StressfulInteger {

  companion object {
    private var VALUE = 2593
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1296()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number5187()
      val right = Number5188()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2592()
    val b = Number2591()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2594 : StressfulInteger {

  companion object {
    private var VALUE = 2594
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1297()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number5189()
      val right = Number5190()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2593()
    val b = Number2592()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2595 : StressfulInteger {

  companion object {
    private var VALUE = 2595
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1297()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number5191()
      val right = Number5192()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2594()
    val b = Number2593()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2596 : StressfulInteger {

  companion object {
    private var VALUE = 2596
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1298()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number5193()
      val right = Number5194()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2595()
    val b = Number2594()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2597 : StressfulInteger {

  companion object {
    private var VALUE = 2597
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1298()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number5195()
      val right = Number5196()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2596()
    val b = Number2595()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2598 : StressfulInteger {

  companion object {
    private var VALUE = 2598
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1299()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number5197()
      val right = Number5198()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2597()
    val b = Number2596()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2599 : StressfulInteger {

  companion object {
    private var VALUE = 2599
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1299()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number5199()
      val right = Number5200()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2598()
    val b = Number2597()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2600 : StressfulInteger {

  companion object {
    private var VALUE = 2600
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1300()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number5201()
      val right = Number5202()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2599()
    val b = Number2598()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2601 : StressfulInteger {

  companion object {
    private var VALUE = 2601
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1300()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number5203()
      val right = Number5204()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2600()
    val b = Number2599()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2602 : StressfulInteger {

  companion object {
    private var VALUE = 2602
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1301()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number5205()
      val right = Number5206()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2601()
    val b = Number2600()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2603 : StressfulInteger {

  companion object {
    private var VALUE = 2603
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1301()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number5207()
      val right = Number5208()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2602()
    val b = Number2601()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2604 : StressfulInteger {

  companion object {
    private var VALUE = 2604
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1302()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number5209()
      val right = Number5210()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2603()
    val b = Number2602()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2605 : StressfulInteger {

  companion object {
    private var VALUE = 2605
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1302()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number5211()
      val right = Number5212()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2604()
    val b = Number2603()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2606 : StressfulInteger {

  companion object {
    private var VALUE = 2606
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1303()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number5213()
      val right = Number5214()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2605()
    val b = Number2604()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2607 : StressfulInteger {

  companion object {
    private var VALUE = 2607
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1303()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number5215()
      val right = Number5216()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2606()
    val b = Number2605()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2608 : StressfulInteger {

  companion object {
    private var VALUE = 2608
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1304()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number5217()
      val right = Number5218()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2607()
    val b = Number2606()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2609 : StressfulInteger {

  companion object {
    private var VALUE = 2609
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1304()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number5219()
      val right = Number5220()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2608()
    val b = Number2607()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2610 : StressfulInteger {

  companion object {
    private var VALUE = 2610
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1305()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number5221()
      val right = Number5222()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2609()
    val b = Number2608()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2611 : StressfulInteger {

  companion object {
    private var VALUE = 2611
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1305()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number5223()
      val right = Number5224()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2610()
    val b = Number2609()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2612 : StressfulInteger {

  companion object {
    private var VALUE = 2612
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1306()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number5225()
      val right = Number5226()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2611()
    val b = Number2610()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2613 : StressfulInteger {

  companion object {
    private var VALUE = 2613
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1306()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number5227()
      val right = Number5228()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2612()
    val b = Number2611()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2614 : StressfulInteger {

  companion object {
    private var VALUE = 2614
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1307()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number5229()
      val right = Number5230()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2613()
    val b = Number2612()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2615 : StressfulInteger {

  companion object {
    private var VALUE = 2615
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1307()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number5231()
      val right = Number5232()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2614()
    val b = Number2613()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2616 : StressfulInteger {

  companion object {
    private var VALUE = 2616
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1308()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number5233()
      val right = Number5234()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2615()
    val b = Number2614()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2617 : StressfulInteger {

  companion object {
    private var VALUE = 2617
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1308()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number5235()
      val right = Number5236()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2616()
    val b = Number2615()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2618 : StressfulInteger {

  companion object {
    private var VALUE = 2618
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1309()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number5237()
      val right = Number5238()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2617()
    val b = Number2616()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2619 : StressfulInteger {

  companion object {
    private var VALUE = 2619
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1309()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number5239()
      val right = Number5240()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2618()
    val b = Number2617()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2620 : StressfulInteger {

  companion object {
    private var VALUE = 2620
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1310()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number5241()
      val right = Number5242()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2619()
    val b = Number2618()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2621 : StressfulInteger {

  companion object {
    private var VALUE = 2621
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1310()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number5243()
      val right = Number5244()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2620()
    val b = Number2619()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2622 : StressfulInteger {

  companion object {
    private var VALUE = 2622
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1311()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number5245()
      val right = Number5246()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2621()
    val b = Number2620()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2623 : StressfulInteger {

  companion object {
    private var VALUE = 2623
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1311()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number5247()
      val right = Number5248()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2622()
    val b = Number2621()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2624 : StressfulInteger {

  companion object {
    private var VALUE = 2624
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1312()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number5249()
      val right = Number5250()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2623()
    val b = Number2622()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2625 : StressfulInteger {

  companion object {
    private var VALUE = 2625
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1312()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number5251()
      val right = Number5252()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2624()
    val b = Number2623()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2626 : StressfulInteger {

  companion object {
    private var VALUE = 2626
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1313()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number5253()
      val right = Number5254()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2625()
    val b = Number2624()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2627 : StressfulInteger {

  companion object {
    private var VALUE = 2627
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1313()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number5255()
      val right = Number5256()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2626()
    val b = Number2625()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2628 : StressfulInteger {

  companion object {
    private var VALUE = 2628
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1314()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number5257()
      val right = Number5258()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2627()
    val b = Number2626()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2629 : StressfulInteger {

  companion object {
    private var VALUE = 2629
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1314()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number5259()
      val right = Number5260()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2628()
    val b = Number2627()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2630 : StressfulInteger {

  companion object {
    private var VALUE = 2630
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1315()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number5261()
      val right = Number5262()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2629()
    val b = Number2628()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2631 : StressfulInteger {

  companion object {
    private var VALUE = 2631
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1315()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number5263()
      val right = Number5264()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2630()
    val b = Number2629()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2632 : StressfulInteger {

  companion object {
    private var VALUE = 2632
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1316()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number5265()
      val right = Number5266()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2631()
    val b = Number2630()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2633 : StressfulInteger {

  companion object {
    private var VALUE = 2633
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1316()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number5267()
      val right = Number5268()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2632()
    val b = Number2631()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2634 : StressfulInteger {

  companion object {
    private var VALUE = 2634
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1317()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number5269()
      val right = Number5270()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2633()
    val b = Number2632()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2635 : StressfulInteger {

  companion object {
    private var VALUE = 2635
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1317()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number5271()
      val right = Number5272()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2634()
    val b = Number2633()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2636 : StressfulInteger {

  companion object {
    private var VALUE = 2636
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1318()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number5273()
      val right = Number5274()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2635()
    val b = Number2634()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2637 : StressfulInteger {

  companion object {
    private var VALUE = 2637
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1318()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number5275()
      val right = Number5276()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2636()
    val b = Number2635()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2638 : StressfulInteger {

  companion object {
    private var VALUE = 2638
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1319()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number5277()
      val right = Number5278()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2637()
    val b = Number2636()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2639 : StressfulInteger {

  companion object {
    private var VALUE = 2639
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1319()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number5279()
      val right = Number5280()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2638()
    val b = Number2637()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2640 : StressfulInteger {

  companion object {
    private var VALUE = 2640
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1320()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number5281()
      val right = Number5282()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2639()
    val b = Number2638()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2641 : StressfulInteger {

  companion object {
    private var VALUE = 2641
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1320()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number5283()
      val right = Number5284()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2640()
    val b = Number2639()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2642 : StressfulInteger {

  companion object {
    private var VALUE = 2642
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1321()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number5285()
      val right = Number5286()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2641()
    val b = Number2640()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2643 : StressfulInteger {

  companion object {
    private var VALUE = 2643
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1321()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number5287()
      val right = Number5288()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2642()
    val b = Number2641()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2644 : StressfulInteger {

  companion object {
    private var VALUE = 2644
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1322()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number5289()
      val right = Number5290()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2643()
    val b = Number2642()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2645 : StressfulInteger {

  companion object {
    private var VALUE = 2645
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1322()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number5291()
      val right = Number5292()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2644()
    val b = Number2643()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2646 : StressfulInteger {

  companion object {
    private var VALUE = 2646
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1323()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number5293()
      val right = Number5294()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2645()
    val b = Number2644()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2647 : StressfulInteger {

  companion object {
    private var VALUE = 2647
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1323()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number5295()
      val right = Number5296()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2646()
    val b = Number2645()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2648 : StressfulInteger {

  companion object {
    private var VALUE = 2648
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1324()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number5297()
      val right = Number5298()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2647()
    val b = Number2646()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2649 : StressfulInteger {

  companion object {
    private var VALUE = 2649
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1324()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number5299()
      val right = Number5300()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2648()
    val b = Number2647()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2650 : StressfulInteger {

  companion object {
    private var VALUE = 2650
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1325()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number5301()
      val right = Number5302()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2649()
    val b = Number2648()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2651 : StressfulInteger {

  companion object {
    private var VALUE = 2651
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1325()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number5303()
      val right = Number5304()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2650()
    val b = Number2649()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2652 : StressfulInteger {

  companion object {
    private var VALUE = 2652
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1326()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number5305()
      val right = Number5306()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2651()
    val b = Number2650()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2653 : StressfulInteger {

  companion object {
    private var VALUE = 2653
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1326()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number5307()
      val right = Number5308()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2652()
    val b = Number2651()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2654 : StressfulInteger {

  companion object {
    private var VALUE = 2654
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1327()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number5309()
      val right = Number5310()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2653()
    val b = Number2652()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2655 : StressfulInteger {

  companion object {
    private var VALUE = 2655
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1327()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number5311()
      val right = Number5312()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2654()
    val b = Number2653()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2656 : StressfulInteger {

  companion object {
    private var VALUE = 2656
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1328()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number5313()
      val right = Number5314()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2655()
    val b = Number2654()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2657 : StressfulInteger {

  companion object {
    private var VALUE = 2657
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1328()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number5315()
      val right = Number5316()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2656()
    val b = Number2655()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2658 : StressfulInteger {

  companion object {
    private var VALUE = 2658
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1329()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number5317()
      val right = Number5318()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2657()
    val b = Number2656()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2659 : StressfulInteger {

  companion object {
    private var VALUE = 2659
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1329()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number5319()
      val right = Number5320()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2658()
    val b = Number2657()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2660 : StressfulInteger {

  companion object {
    private var VALUE = 2660
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1330()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number5321()
      val right = Number5322()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2659()
    val b = Number2658()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2661 : StressfulInteger {

  companion object {
    private var VALUE = 2661
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1330()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number5323()
      val right = Number5324()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2660()
    val b = Number2659()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2662 : StressfulInteger {

  companion object {
    private var VALUE = 2662
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1331()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number5325()
      val right = Number5326()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2661()
    val b = Number2660()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2663 : StressfulInteger {

  companion object {
    private var VALUE = 2663
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1331()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number5327()
      val right = Number5328()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2662()
    val b = Number2661()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2664 : StressfulInteger {

  companion object {
    private var VALUE = 2664
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1332()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number5329()
      val right = Number5330()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2663()
    val b = Number2662()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2665 : StressfulInteger {

  companion object {
    private var VALUE = 2665
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1332()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number5331()
      val right = Number5332()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2664()
    val b = Number2663()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2666 : StressfulInteger {

  companion object {
    private var VALUE = 2666
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1333()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number5333()
      val right = Number5334()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2665()
    val b = Number2664()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2667 : StressfulInteger {

  companion object {
    private var VALUE = 2667
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1333()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number5335()
      val right = Number5336()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2666()
    val b = Number2665()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2668 : StressfulInteger {

  companion object {
    private var VALUE = 2668
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1334()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number5337()
      val right = Number5338()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2667()
    val b = Number2666()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2669 : StressfulInteger {

  companion object {
    private var VALUE = 2669
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1334()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number5339()
      val right = Number5340()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2668()
    val b = Number2667()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2670 : StressfulInteger {

  companion object {
    private var VALUE = 2670
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1335()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number5341()
      val right = Number5342()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2669()
    val b = Number2668()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2671 : StressfulInteger {

  companion object {
    private var VALUE = 2671
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1335()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number5343()
      val right = Number5344()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2670()
    val b = Number2669()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2672 : StressfulInteger {

  companion object {
    private var VALUE = 2672
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1336()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number5345()
      val right = Number5346()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2671()
    val b = Number2670()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2673 : StressfulInteger {

  companion object {
    private var VALUE = 2673
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1336()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number5347()
      val right = Number5348()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2672()
    val b = Number2671()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2674 : StressfulInteger {

  companion object {
    private var VALUE = 2674
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1337()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number5349()
      val right = Number5350()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2673()
    val b = Number2672()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2675 : StressfulInteger {

  companion object {
    private var VALUE = 2675
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1337()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number5351()
      val right = Number5352()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2674()
    val b = Number2673()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2676 : StressfulInteger {

  companion object {
    private var VALUE = 2676
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1338()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number5353()
      val right = Number5354()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2675()
    val b = Number2674()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2677 : StressfulInteger {

  companion object {
    private var VALUE = 2677
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1338()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number5355()
      val right = Number5356()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2676()
    val b = Number2675()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2678 : StressfulInteger {

  companion object {
    private var VALUE = 2678
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1339()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number5357()
      val right = Number5358()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2677()
    val b = Number2676()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2679 : StressfulInteger {

  companion object {
    private var VALUE = 2679
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1339()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number5359()
      val right = Number5360()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2678()
    val b = Number2677()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2680 : StressfulInteger {

  companion object {
    private var VALUE = 2680
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1340()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number5361()
      val right = Number5362()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2679()
    val b = Number2678()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2681 : StressfulInteger {

  companion object {
    private var VALUE = 2681
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1340()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number5363()
      val right = Number5364()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2680()
    val b = Number2679()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2682 : StressfulInteger {

  companion object {
    private var VALUE = 2682
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1341()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number5365()
      val right = Number5366()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2681()
    val b = Number2680()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2683 : StressfulInteger {

  companion object {
    private var VALUE = 2683
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1341()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number5367()
      val right = Number5368()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2682()
    val b = Number2681()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2684 : StressfulInteger {

  companion object {
    private var VALUE = 2684
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1342()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number5369()
      val right = Number5370()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2683()
    val b = Number2682()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2685 : StressfulInteger {

  companion object {
    private var VALUE = 2685
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1342()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number5371()
      val right = Number5372()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2684()
    val b = Number2683()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2686 : StressfulInteger {

  companion object {
    private var VALUE = 2686
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1343()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number5373()
      val right = Number5374()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2685()
    val b = Number2684()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2687 : StressfulInteger {

  companion object {
    private var VALUE = 2687
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1343()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number5375()
      val right = Number5376()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2686()
    val b = Number2685()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2688 : StressfulInteger {

  companion object {
    private var VALUE = 2688
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1344()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number5377()
      val right = Number5378()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2687()
    val b = Number2686()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2689 : StressfulInteger {

  companion object {
    private var VALUE = 2689
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1344()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number5379()
      val right = Number5380()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2688()
    val b = Number2687()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2690 : StressfulInteger {

  companion object {
    private var VALUE = 2690
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1345()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number5381()
      val right = Number5382()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2689()
    val b = Number2688()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2691 : StressfulInteger {

  companion object {
    private var VALUE = 2691
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1345()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number5383()
      val right = Number5384()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2690()
    val b = Number2689()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2692 : StressfulInteger {

  companion object {
    private var VALUE = 2692
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1346()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number5385()
      val right = Number5386()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2691()
    val b = Number2690()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2693 : StressfulInteger {

  companion object {
    private var VALUE = 2693
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1346()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number5387()
      val right = Number5388()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2692()
    val b = Number2691()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2694 : StressfulInteger {

  companion object {
    private var VALUE = 2694
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1347()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number5389()
      val right = Number5390()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2693()
    val b = Number2692()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2695 : StressfulInteger {

  companion object {
    private var VALUE = 2695
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1347()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number5391()
      val right = Number5392()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2694()
    val b = Number2693()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2696 : StressfulInteger {

  companion object {
    private var VALUE = 2696
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1348()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number5393()
      val right = Number5394()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2695()
    val b = Number2694()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2697 : StressfulInteger {

  companion object {
    private var VALUE = 2697
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1348()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number5395()
      val right = Number5396()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2696()
    val b = Number2695()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2698 : StressfulInteger {

  companion object {
    private var VALUE = 2698
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1349()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number5397()
      val right = Number5398()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2697()
    val b = Number2696()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2699 : StressfulInteger {

  companion object {
    private var VALUE = 2699
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1349()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number5399()
      val right = Number5400()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2698()
    val b = Number2697()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2700 : StressfulInteger {

  companion object {
    private var VALUE = 2700
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1350()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number5401()
      val right = Number5402()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2699()
    val b = Number2698()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2701 : StressfulInteger {

  companion object {
    private var VALUE = 2701
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1350()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number5403()
      val right = Number5404()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2700()
    val b = Number2699()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2702 : StressfulInteger {

  companion object {
    private var VALUE = 2702
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1351()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number5405()
      val right = Number5406()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2701()
    val b = Number2700()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2703 : StressfulInteger {

  companion object {
    private var VALUE = 2703
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1351()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number5407()
      val right = Number5408()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2702()
    val b = Number2701()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2704 : StressfulInteger {

  companion object {
    private var VALUE = 2704
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1352()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number5409()
      val right = Number5410()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2703()
    val b = Number2702()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2705 : StressfulInteger {

  companion object {
    private var VALUE = 2705
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1352()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number5411()
      val right = Number5412()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2704()
    val b = Number2703()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2706 : StressfulInteger {

  companion object {
    private var VALUE = 2706
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1353()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number5413()
      val right = Number5414()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2705()
    val b = Number2704()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2707 : StressfulInteger {

  companion object {
    private var VALUE = 2707
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1353()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number5415()
      val right = Number5416()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2706()
    val b = Number2705()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2708 : StressfulInteger {

  companion object {
    private var VALUE = 2708
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1354()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number5417()
      val right = Number5418()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2707()
    val b = Number2706()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2709 : StressfulInteger {

  companion object {
    private var VALUE = 2709
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1354()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number5419()
      val right = Number5420()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2708()
    val b = Number2707()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2710 : StressfulInteger {

  companion object {
    private var VALUE = 2710
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1355()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number5421()
      val right = Number5422()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2709()
    val b = Number2708()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2711 : StressfulInteger {

  companion object {
    private var VALUE = 2711
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1355()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number5423()
      val right = Number5424()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2710()
    val b = Number2709()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2712 : StressfulInteger {

  companion object {
    private var VALUE = 2712
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1356()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number5425()
      val right = Number5426()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2711()
    val b = Number2710()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2713 : StressfulInteger {

  companion object {
    private var VALUE = 2713
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1356()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number5427()
      val right = Number5428()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2712()
    val b = Number2711()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2714 : StressfulInteger {

  companion object {
    private var VALUE = 2714
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1357()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number5429()
      val right = Number5430()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2713()
    val b = Number2712()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2715 : StressfulInteger {

  companion object {
    private var VALUE = 2715
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1357()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number5431()
      val right = Number5432()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2714()
    val b = Number2713()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2716 : StressfulInteger {

  companion object {
    private var VALUE = 2716
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1358()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number5433()
      val right = Number5434()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2715()
    val b = Number2714()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2717 : StressfulInteger {

  companion object {
    private var VALUE = 2717
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1358()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number5435()
      val right = Number5436()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2716()
    val b = Number2715()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2718 : StressfulInteger {

  companion object {
    private var VALUE = 2718
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1359()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number5437()
      val right = Number5438()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2717()
    val b = Number2716()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2719 : StressfulInteger {

  companion object {
    private var VALUE = 2719
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1359()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number5439()
      val right = Number5440()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2718()
    val b = Number2717()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2720 : StressfulInteger {

  companion object {
    private var VALUE = 2720
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1360()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number5441()
      val right = Number5442()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2719()
    val b = Number2718()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2721 : StressfulInteger {

  companion object {
    private var VALUE = 2721
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1360()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number5443()
      val right = Number5444()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2720()
    val b = Number2719()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2722 : StressfulInteger {

  companion object {
    private var VALUE = 2722
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1361()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number5445()
      val right = Number5446()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2721()
    val b = Number2720()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2723 : StressfulInteger {

  companion object {
    private var VALUE = 2723
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1361()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number5447()
      val right = Number5448()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2722()
    val b = Number2721()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2724 : StressfulInteger {

  companion object {
    private var VALUE = 2724
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1362()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number5449()
      val right = Number5450()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2723()
    val b = Number2722()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2725 : StressfulInteger {

  companion object {
    private var VALUE = 2725
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1362()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number5451()
      val right = Number5452()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2724()
    val b = Number2723()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2726 : StressfulInteger {

  companion object {
    private var VALUE = 2726
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1363()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number5453()
      val right = Number5454()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2725()
    val b = Number2724()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2727 : StressfulInteger {

  companion object {
    private var VALUE = 2727
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1363()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number5455()
      val right = Number5456()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2726()
    val b = Number2725()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2728 : StressfulInteger {

  companion object {
    private var VALUE = 2728
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1364()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number5457()
      val right = Number5458()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2727()
    val b = Number2726()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2729 : StressfulInteger {

  companion object {
    private var VALUE = 2729
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1364()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number5459()
      val right = Number5460()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2728()
    val b = Number2727()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2730 : StressfulInteger {

  companion object {
    private var VALUE = 2730
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1365()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number5461()
      val right = Number5462()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2729()
    val b = Number2728()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2731 : StressfulInteger {

  companion object {
    private var VALUE = 2731
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1365()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number5463()
      val right = Number5464()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2730()
    val b = Number2729()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2732 : StressfulInteger {

  companion object {
    private var VALUE = 2732
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1366()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number5465()
      val right = Number5466()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2731()
    val b = Number2730()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2733 : StressfulInteger {

  companion object {
    private var VALUE = 2733
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1366()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number5467()
      val right = Number5468()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2732()
    val b = Number2731()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2734 : StressfulInteger {

  companion object {
    private var VALUE = 2734
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1367()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number5469()
      val right = Number5470()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2733()
    val b = Number2732()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2735 : StressfulInteger {

  companion object {
    private var VALUE = 2735
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1367()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number5471()
      val right = Number5472()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2734()
    val b = Number2733()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2736 : StressfulInteger {

  companion object {
    private var VALUE = 2736
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1368()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number5473()
      val right = Number5474()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2735()
    val b = Number2734()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2737 : StressfulInteger {

  companion object {
    private var VALUE = 2737
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1368()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number5475()
      val right = Number5476()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2736()
    val b = Number2735()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2738 : StressfulInteger {

  companion object {
    private var VALUE = 2738
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1369()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number5477()
      val right = Number5478()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2737()
    val b = Number2736()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2739 : StressfulInteger {

  companion object {
    private var VALUE = 2739
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1369()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number5479()
      val right = Number5480()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2738()
    val b = Number2737()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2740 : StressfulInteger {

  companion object {
    private var VALUE = 2740
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1370()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number5481()
      val right = Number5482()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2739()
    val b = Number2738()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2741 : StressfulInteger {

  companion object {
    private var VALUE = 2741
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1370()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number5483()
      val right = Number5484()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2740()
    val b = Number2739()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2742 : StressfulInteger {

  companion object {
    private var VALUE = 2742
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1371()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number5485()
      val right = Number5486()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2741()
    val b = Number2740()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2743 : StressfulInteger {

  companion object {
    private var VALUE = 2743
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1371()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number5487()
      val right = Number5488()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2742()
    val b = Number2741()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2744 : StressfulInteger {

  companion object {
    private var VALUE = 2744
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1372()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number5489()
      val right = Number5490()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2743()
    val b = Number2742()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2745 : StressfulInteger {

  companion object {
    private var VALUE = 2745
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1372()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number5491()
      val right = Number5492()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2744()
    val b = Number2743()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2746 : StressfulInteger {

  companion object {
    private var VALUE = 2746
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1373()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number5493()
      val right = Number5494()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2745()
    val b = Number2744()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2747 : StressfulInteger {

  companion object {
    private var VALUE = 2747
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1373()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number5495()
      val right = Number5496()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2746()
    val b = Number2745()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2748 : StressfulInteger {

  companion object {
    private var VALUE = 2748
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1374()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number5497()
      val right = Number5498()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2747()
    val b = Number2746()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2749 : StressfulInteger {

  companion object {
    private var VALUE = 2749
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1374()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number5499()
      val right = Number5500()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2748()
    val b = Number2747()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2750 : StressfulInteger {

  companion object {
    private var VALUE = 2750
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1375()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number5501()
      val right = Number5502()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2749()
    val b = Number2748()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2751 : StressfulInteger {

  companion object {
    private var VALUE = 2751
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1375()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number5503()
      val right = Number5504()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2750()
    val b = Number2749()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2752 : StressfulInteger {

  companion object {
    private var VALUE = 2752
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1376()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number5505()
      val right = Number5506()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2751()
    val b = Number2750()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2753 : StressfulInteger {

  companion object {
    private var VALUE = 2753
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1376()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number5507()
      val right = Number5508()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2752()
    val b = Number2751()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2754 : StressfulInteger {

  companion object {
    private var VALUE = 2754
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1377()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number5509()
      val right = Number5510()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2753()
    val b = Number2752()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2755 : StressfulInteger {

  companion object {
    private var VALUE = 2755
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1377()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number5511()
      val right = Number5512()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2754()
    val b = Number2753()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2756 : StressfulInteger {

  companion object {
    private var VALUE = 2756
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1378()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number5513()
      val right = Number5514()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2755()
    val b = Number2754()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2757 : StressfulInteger {

  companion object {
    private var VALUE = 2757
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1378()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number5515()
      val right = Number5516()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2756()
    val b = Number2755()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2758 : StressfulInteger {

  companion object {
    private var VALUE = 2758
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1379()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number5517()
      val right = Number5518()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2757()
    val b = Number2756()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2759 : StressfulInteger {

  companion object {
    private var VALUE = 2759
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1379()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number5519()
      val right = Number5520()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2758()
    val b = Number2757()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2760 : StressfulInteger {

  companion object {
    private var VALUE = 2760
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1380()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number5521()
      val right = Number5522()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2759()
    val b = Number2758()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2761 : StressfulInteger {

  companion object {
    private var VALUE = 2761
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1380()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number5523()
      val right = Number5524()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2760()
    val b = Number2759()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2762 : StressfulInteger {

  companion object {
    private var VALUE = 2762
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1381()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number5525()
      val right = Number5526()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2761()
    val b = Number2760()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2763 : StressfulInteger {

  companion object {
    private var VALUE = 2763
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1381()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number5527()
      val right = Number5528()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2762()
    val b = Number2761()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2764 : StressfulInteger {

  companion object {
    private var VALUE = 2764
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1382()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number5529()
      val right = Number5530()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2763()
    val b = Number2762()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2765 : StressfulInteger {

  companion object {
    private var VALUE = 2765
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1382()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number5531()
      val right = Number5532()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2764()
    val b = Number2763()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2766 : StressfulInteger {

  companion object {
    private var VALUE = 2766
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1383()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number5533()
      val right = Number5534()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2765()
    val b = Number2764()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2767 : StressfulInteger {

  companion object {
    private var VALUE = 2767
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1383()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number5535()
      val right = Number5536()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2766()
    val b = Number2765()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2768 : StressfulInteger {

  companion object {
    private var VALUE = 2768
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1384()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number5537()
      val right = Number5538()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2767()
    val b = Number2766()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2769 : StressfulInteger {

  companion object {
    private var VALUE = 2769
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1384()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number5539()
      val right = Number5540()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2768()
    val b = Number2767()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2770 : StressfulInteger {

  companion object {
    private var VALUE = 2770
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1385()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number5541()
      val right = Number5542()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2769()
    val b = Number2768()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2771 : StressfulInteger {

  companion object {
    private var VALUE = 2771
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1385()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number5543()
      val right = Number5544()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2770()
    val b = Number2769()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2772 : StressfulInteger {

  companion object {
    private var VALUE = 2772
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1386()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number5545()
      val right = Number5546()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2771()
    val b = Number2770()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2773 : StressfulInteger {

  companion object {
    private var VALUE = 2773
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1386()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number5547()
      val right = Number5548()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2772()
    val b = Number2771()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2774 : StressfulInteger {

  companion object {
    private var VALUE = 2774
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1387()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number5549()
      val right = Number5550()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2773()
    val b = Number2772()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2775 : StressfulInteger {

  companion object {
    private var VALUE = 2775
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1387()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number5551()
      val right = Number5552()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2774()
    val b = Number2773()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2776 : StressfulInteger {

  companion object {
    private var VALUE = 2776
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1388()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number5553()
      val right = Number5554()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2775()
    val b = Number2774()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2777 : StressfulInteger {

  companion object {
    private var VALUE = 2777
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1388()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number5555()
      val right = Number5556()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2776()
    val b = Number2775()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2778 : StressfulInteger {

  companion object {
    private var VALUE = 2778
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1389()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number5557()
      val right = Number5558()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2777()
    val b = Number2776()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2779 : StressfulInteger {

  companion object {
    private var VALUE = 2779
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1389()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number5559()
      val right = Number5560()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2778()
    val b = Number2777()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2780 : StressfulInteger {

  companion object {
    private var VALUE = 2780
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1390()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number5561()
      val right = Number5562()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2779()
    val b = Number2778()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2781 : StressfulInteger {

  companion object {
    private var VALUE = 2781
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1390()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number5563()
      val right = Number5564()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2780()
    val b = Number2779()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2782 : StressfulInteger {

  companion object {
    private var VALUE = 2782
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1391()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number5565()
      val right = Number5566()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2781()
    val b = Number2780()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2783 : StressfulInteger {

  companion object {
    private var VALUE = 2783
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1391()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number5567()
      val right = Number5568()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2782()
    val b = Number2781()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2784 : StressfulInteger {

  companion object {
    private var VALUE = 2784
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1392()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number5569()
      val right = Number5570()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2783()
    val b = Number2782()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2785 : StressfulInteger {

  companion object {
    private var VALUE = 2785
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1392()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number5571()
      val right = Number5572()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2784()
    val b = Number2783()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2786 : StressfulInteger {

  companion object {
    private var VALUE = 2786
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1393()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number5573()
      val right = Number5574()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2785()
    val b = Number2784()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2787 : StressfulInteger {

  companion object {
    private var VALUE = 2787
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1393()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number5575()
      val right = Number5576()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2786()
    val b = Number2785()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2788 : StressfulInteger {

  companion object {
    private var VALUE = 2788
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1394()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number5577()
      val right = Number5578()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2787()
    val b = Number2786()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2789 : StressfulInteger {

  companion object {
    private var VALUE = 2789
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1394()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number5579()
      val right = Number5580()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2788()
    val b = Number2787()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2790 : StressfulInteger {

  companion object {
    private var VALUE = 2790
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1395()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number5581()
      val right = Number5582()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2789()
    val b = Number2788()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2791 : StressfulInteger {

  companion object {
    private var VALUE = 2791
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1395()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number5583()
      val right = Number5584()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2790()
    val b = Number2789()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2792 : StressfulInteger {

  companion object {
    private var VALUE = 2792
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1396()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number5585()
      val right = Number5586()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2791()
    val b = Number2790()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2793 : StressfulInteger {

  companion object {
    private var VALUE = 2793
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1396()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number5587()
      val right = Number5588()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2792()
    val b = Number2791()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2794 : StressfulInteger {

  companion object {
    private var VALUE = 2794
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1397()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number5589()
      val right = Number5590()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2793()
    val b = Number2792()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2795 : StressfulInteger {

  companion object {
    private var VALUE = 2795
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1397()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number5591()
      val right = Number5592()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2794()
    val b = Number2793()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2796 : StressfulInteger {

  companion object {
    private var VALUE = 2796
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1398()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number5593()
      val right = Number5594()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2795()
    val b = Number2794()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2797 : StressfulInteger {

  companion object {
    private var VALUE = 2797
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1398()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number5595()
      val right = Number5596()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2796()
    val b = Number2795()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2798 : StressfulInteger {

  companion object {
    private var VALUE = 2798
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1399()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number5597()
      val right = Number5598()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2797()
    val b = Number2796()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2799 : StressfulInteger {

  companion object {
    private var VALUE = 2799
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1399()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number5599()
      val right = Number5600()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2798()
    val b = Number2797()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2800 : StressfulInteger {

  companion object {
    private var VALUE = 2800
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1400()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number5601()
      val right = Number5602()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2799()
    val b = Number2798()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2801 : StressfulInteger {

  companion object {
    private var VALUE = 2801
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1400()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number5603()
      val right = Number5604()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2800()
    val b = Number2799()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2802 : StressfulInteger {

  companion object {
    private var VALUE = 2802
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1401()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number5605()
      val right = Number5606()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2801()
    val b = Number2800()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2803 : StressfulInteger {

  companion object {
    private var VALUE = 2803
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1401()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number5607()
      val right = Number5608()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2802()
    val b = Number2801()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2804 : StressfulInteger {

  companion object {
    private var VALUE = 2804
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1402()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number5609()
      val right = Number5610()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2803()
    val b = Number2802()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2805 : StressfulInteger {

  companion object {
    private var VALUE = 2805
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1402()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number5611()
      val right = Number5612()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2804()
    val b = Number2803()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2806 : StressfulInteger {

  companion object {
    private var VALUE = 2806
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1403()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number5613()
      val right = Number5614()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2805()
    val b = Number2804()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2807 : StressfulInteger {

  companion object {
    private var VALUE = 2807
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1403()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number5615()
      val right = Number5616()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2806()
    val b = Number2805()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2808 : StressfulInteger {

  companion object {
    private var VALUE = 2808
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1404()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number5617()
      val right = Number5618()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2807()
    val b = Number2806()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2809 : StressfulInteger {

  companion object {
    private var VALUE = 2809
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1404()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number5619()
      val right = Number5620()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2808()
    val b = Number2807()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2810 : StressfulInteger {

  companion object {
    private var VALUE = 2810
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1405()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number5621()
      val right = Number5622()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2809()
    val b = Number2808()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2811 : StressfulInteger {

  companion object {
    private var VALUE = 2811
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1405()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number5623()
      val right = Number5624()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2810()
    val b = Number2809()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2812 : StressfulInteger {

  companion object {
    private var VALUE = 2812
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1406()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number5625()
      val right = Number5626()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2811()
    val b = Number2810()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2813 : StressfulInteger {

  companion object {
    private var VALUE = 2813
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1406()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number5627()
      val right = Number5628()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2812()
    val b = Number2811()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2814 : StressfulInteger {

  companion object {
    private var VALUE = 2814
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1407()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number5629()
      val right = Number5630()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2813()
    val b = Number2812()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2815 : StressfulInteger {

  companion object {
    private var VALUE = 2815
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1407()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number5631()
      val right = Number5632()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2814()
    val b = Number2813()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2816 : StressfulInteger {

  companion object {
    private var VALUE = 2816
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1408()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number5633()
      val right = Number5634()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2815()
    val b = Number2814()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2817 : StressfulInteger {

  companion object {
    private var VALUE = 2817
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1408()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number5635()
      val right = Number5636()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2816()
    val b = Number2815()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2818 : StressfulInteger {

  companion object {
    private var VALUE = 2818
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1409()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number5637()
      val right = Number5638()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2817()
    val b = Number2816()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2819 : StressfulInteger {

  companion object {
    private var VALUE = 2819
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1409()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number5639()
      val right = Number5640()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2818()
    val b = Number2817()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2820 : StressfulInteger {

  companion object {
    private var VALUE = 2820
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1410()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number5641()
      val right = Number5642()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2819()
    val b = Number2818()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2821 : StressfulInteger {

  companion object {
    private var VALUE = 2821
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1410()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number5643()
      val right = Number5644()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2820()
    val b = Number2819()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2822 : StressfulInteger {

  companion object {
    private var VALUE = 2822
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1411()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number5645()
      val right = Number5646()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2821()
    val b = Number2820()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2823 : StressfulInteger {

  companion object {
    private var VALUE = 2823
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1411()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number5647()
      val right = Number5648()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2822()
    val b = Number2821()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2824 : StressfulInteger {

  companion object {
    private var VALUE = 2824
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1412()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number5649()
      val right = Number5650()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2823()
    val b = Number2822()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2825 : StressfulInteger {

  companion object {
    private var VALUE = 2825
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1412()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number5651()
      val right = Number5652()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2824()
    val b = Number2823()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2826 : StressfulInteger {

  companion object {
    private var VALUE = 2826
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1413()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number5653()
      val right = Number5654()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2825()
    val b = Number2824()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2827 : StressfulInteger {

  companion object {
    private var VALUE = 2827
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1413()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number5655()
      val right = Number5656()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2826()
    val b = Number2825()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2828 : StressfulInteger {

  companion object {
    private var VALUE = 2828
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1414()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number5657()
      val right = Number5658()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2827()
    val b = Number2826()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2829 : StressfulInteger {

  companion object {
    private var VALUE = 2829
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1414()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number5659()
      val right = Number5660()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2828()
    val b = Number2827()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2830 : StressfulInteger {

  companion object {
    private var VALUE = 2830
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1415()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number5661()
      val right = Number5662()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2829()
    val b = Number2828()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2831 : StressfulInteger {

  companion object {
    private var VALUE = 2831
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1415()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number5663()
      val right = Number5664()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2830()
    val b = Number2829()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2832 : StressfulInteger {

  companion object {
    private var VALUE = 2832
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1416()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number5665()
      val right = Number5666()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2831()
    val b = Number2830()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2833 : StressfulInteger {

  companion object {
    private var VALUE = 2833
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1416()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number5667()
      val right = Number5668()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2832()
    val b = Number2831()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2834 : StressfulInteger {

  companion object {
    private var VALUE = 2834
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1417()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number5669()
      val right = Number5670()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2833()
    val b = Number2832()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2835 : StressfulInteger {

  companion object {
    private var VALUE = 2835
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1417()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number5671()
      val right = Number5672()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2834()
    val b = Number2833()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2836 : StressfulInteger {

  companion object {
    private var VALUE = 2836
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1418()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number5673()
      val right = Number5674()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2835()
    val b = Number2834()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2837 : StressfulInteger {

  companion object {
    private var VALUE = 2837
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1418()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number5675()
      val right = Number5676()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2836()
    val b = Number2835()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2838 : StressfulInteger {

  companion object {
    private var VALUE = 2838
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1419()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number5677()
      val right = Number5678()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2837()
    val b = Number2836()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2839 : StressfulInteger {

  companion object {
    private var VALUE = 2839
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1419()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number5679()
      val right = Number5680()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2838()
    val b = Number2837()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2840 : StressfulInteger {

  companion object {
    private var VALUE = 2840
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1420()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number5681()
      val right = Number5682()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2839()
    val b = Number2838()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2841 : StressfulInteger {

  companion object {
    private var VALUE = 2841
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1420()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number5683()
      val right = Number5684()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2840()
    val b = Number2839()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2842 : StressfulInteger {

  companion object {
    private var VALUE = 2842
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1421()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number5685()
      val right = Number5686()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2841()
    val b = Number2840()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2843 : StressfulInteger {

  companion object {
    private var VALUE = 2843
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1421()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number5687()
      val right = Number5688()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2842()
    val b = Number2841()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2844 : StressfulInteger {

  companion object {
    private var VALUE = 2844
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1422()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number5689()
      val right = Number5690()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2843()
    val b = Number2842()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2845 : StressfulInteger {

  companion object {
    private var VALUE = 2845
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1422()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number5691()
      val right = Number5692()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2844()
    val b = Number2843()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2846 : StressfulInteger {

  companion object {
    private var VALUE = 2846
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1423()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number5693()
      val right = Number5694()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2845()
    val b = Number2844()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2847 : StressfulInteger {

  companion object {
    private var VALUE = 2847
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1423()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number5695()
      val right = Number5696()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2846()
    val b = Number2845()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2848 : StressfulInteger {

  companion object {
    private var VALUE = 2848
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1424()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number5697()
      val right = Number5698()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2847()
    val b = Number2846()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2849 : StressfulInteger {

  companion object {
    private var VALUE = 2849
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1424()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number5699()
      val right = Number5700()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2848()
    val b = Number2847()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2850 : StressfulInteger {

  companion object {
    private var VALUE = 2850
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1425()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number5701()
      val right = Number5702()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2849()
    val b = Number2848()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2851 : StressfulInteger {

  companion object {
    private var VALUE = 2851
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1425()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number5703()
      val right = Number5704()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2850()
    val b = Number2849()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2852 : StressfulInteger {

  companion object {
    private var VALUE = 2852
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1426()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number5705()
      val right = Number5706()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2851()
    val b = Number2850()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2853 : StressfulInteger {

  companion object {
    private var VALUE = 2853
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1426()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number5707()
      val right = Number5708()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2852()
    val b = Number2851()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2854 : StressfulInteger {

  companion object {
    private var VALUE = 2854
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1427()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number5709()
      val right = Number5710()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2853()
    val b = Number2852()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2855 : StressfulInteger {

  companion object {
    private var VALUE = 2855
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1427()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number5711()
      val right = Number5712()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2854()
    val b = Number2853()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2856 : StressfulInteger {

  companion object {
    private var VALUE = 2856
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1428()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number5713()
      val right = Number5714()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2855()
    val b = Number2854()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2857 : StressfulInteger {

  companion object {
    private var VALUE = 2857
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1428()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number5715()
      val right = Number5716()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2856()
    val b = Number2855()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2858 : StressfulInteger {

  companion object {
    private var VALUE = 2858
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1429()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number5717()
      val right = Number5718()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2857()
    val b = Number2856()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2859 : StressfulInteger {

  companion object {
    private var VALUE = 2859
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1429()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number5719()
      val right = Number5720()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2858()
    val b = Number2857()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2860 : StressfulInteger {

  companion object {
    private var VALUE = 2860
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1430()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number5721()
      val right = Number5722()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2859()
    val b = Number2858()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2861 : StressfulInteger {

  companion object {
    private var VALUE = 2861
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1430()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number5723()
      val right = Number5724()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2860()
    val b = Number2859()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2862 : StressfulInteger {

  companion object {
    private var VALUE = 2862
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1431()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number5725()
      val right = Number5726()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2861()
    val b = Number2860()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2863 : StressfulInteger {

  companion object {
    private var VALUE = 2863
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1431()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number5727()
      val right = Number5728()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2862()
    val b = Number2861()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2864 : StressfulInteger {

  companion object {
    private var VALUE = 2864
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1432()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number5729()
      val right = Number5730()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2863()
    val b = Number2862()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2865 : StressfulInteger {

  companion object {
    private var VALUE = 2865
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1432()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number5731()
      val right = Number5732()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2864()
    val b = Number2863()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2866 : StressfulInteger {

  companion object {
    private var VALUE = 2866
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1433()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number5733()
      val right = Number5734()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2865()
    val b = Number2864()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2867 : StressfulInteger {

  companion object {
    private var VALUE = 2867
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1433()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number5735()
      val right = Number5736()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2866()
    val b = Number2865()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2868 : StressfulInteger {

  companion object {
    private var VALUE = 2868
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1434()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number5737()
      val right = Number5738()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2867()
    val b = Number2866()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2869 : StressfulInteger {

  companion object {
    private var VALUE = 2869
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1434()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number5739()
      val right = Number5740()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2868()
    val b = Number2867()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2870 : StressfulInteger {

  companion object {
    private var VALUE = 2870
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1435()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number5741()
      val right = Number5742()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2869()
    val b = Number2868()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2871 : StressfulInteger {

  companion object {
    private var VALUE = 2871
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1435()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number5743()
      val right = Number5744()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2870()
    val b = Number2869()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2872 : StressfulInteger {

  companion object {
    private var VALUE = 2872
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1436()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number5745()
      val right = Number5746()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2871()
    val b = Number2870()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2873 : StressfulInteger {

  companion object {
    private var VALUE = 2873
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1436()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number5747()
      val right = Number5748()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2872()
    val b = Number2871()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2874 : StressfulInteger {

  companion object {
    private var VALUE = 2874
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1437()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number5749()
      val right = Number5750()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2873()
    val b = Number2872()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2875 : StressfulInteger {

  companion object {
    private var VALUE = 2875
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1437()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number5751()
      val right = Number5752()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2874()
    val b = Number2873()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2876 : StressfulInteger {

  companion object {
    private var VALUE = 2876
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1438()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number5753()
      val right = Number5754()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2875()
    val b = Number2874()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2877 : StressfulInteger {

  companion object {
    private var VALUE = 2877
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1438()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number5755()
      val right = Number5756()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2876()
    val b = Number2875()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2878 : StressfulInteger {

  companion object {
    private var VALUE = 2878
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1439()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number5757()
      val right = Number5758()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2877()
    val b = Number2876()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2879 : StressfulInteger {

  companion object {
    private var VALUE = 2879
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1439()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number5759()
      val right = Number5760()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2878()
    val b = Number2877()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2880 : StressfulInteger {

  companion object {
    private var VALUE = 2880
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1440()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number5761()
      val right = Number5762()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2879()
    val b = Number2878()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2881 : StressfulInteger {

  companion object {
    private var VALUE = 2881
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1440()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number5763()
      val right = Number5764()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2880()
    val b = Number2879()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2882 : StressfulInteger {

  companion object {
    private var VALUE = 2882
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1441()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number5765()
      val right = Number5766()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2881()
    val b = Number2880()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2883 : StressfulInteger {

  companion object {
    private var VALUE = 2883
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1441()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number5767()
      val right = Number5768()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2882()
    val b = Number2881()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2884 : StressfulInteger {

  companion object {
    private var VALUE = 2884
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1442()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number5769()
      val right = Number5770()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2883()
    val b = Number2882()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2885 : StressfulInteger {

  companion object {
    private var VALUE = 2885
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1442()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number5771()
      val right = Number5772()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2884()
    val b = Number2883()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2886 : StressfulInteger {

  companion object {
    private var VALUE = 2886
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1443()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number5773()
      val right = Number5774()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2885()
    val b = Number2884()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2887 : StressfulInteger {

  companion object {
    private var VALUE = 2887
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1443()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number5775()
      val right = Number5776()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2886()
    val b = Number2885()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2888 : StressfulInteger {

  companion object {
    private var VALUE = 2888
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1444()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number5777()
      val right = Number5778()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2887()
    val b = Number2886()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2889 : StressfulInteger {

  companion object {
    private var VALUE = 2889
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1444()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number5779()
      val right = Number5780()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2888()
    val b = Number2887()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2890 : StressfulInteger {

  companion object {
    private var VALUE = 2890
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1445()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number5781()
      val right = Number5782()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2889()
    val b = Number2888()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2891 : StressfulInteger {

  companion object {
    private var VALUE = 2891
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1445()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number5783()
      val right = Number5784()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2890()
    val b = Number2889()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2892 : StressfulInteger {

  companion object {
    private var VALUE = 2892
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1446()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number5785()
      val right = Number5786()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2891()
    val b = Number2890()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2893 : StressfulInteger {

  companion object {
    private var VALUE = 2893
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1446()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number5787()
      val right = Number5788()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2892()
    val b = Number2891()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2894 : StressfulInteger {

  companion object {
    private var VALUE = 2894
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1447()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number5789()
      val right = Number5790()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2893()
    val b = Number2892()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2895 : StressfulInteger {

  companion object {
    private var VALUE = 2895
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1447()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number5791()
      val right = Number5792()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2894()
    val b = Number2893()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2896 : StressfulInteger {

  companion object {
    private var VALUE = 2896
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1448()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number5793()
      val right = Number5794()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2895()
    val b = Number2894()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2897 : StressfulInteger {

  companion object {
    private var VALUE = 2897
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1448()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number5795()
      val right = Number5796()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2896()
    val b = Number2895()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2898 : StressfulInteger {

  companion object {
    private var VALUE = 2898
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1449()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number5797()
      val right = Number5798()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2897()
    val b = Number2896()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2899 : StressfulInteger {

  companion object {
    private var VALUE = 2899
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1449()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number5799()
      val right = Number5800()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2898()
    val b = Number2897()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2900 : StressfulInteger {

  companion object {
    private var VALUE = 2900
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1450()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number5801()
      val right = Number5802()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2899()
    val b = Number2898()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2901 : StressfulInteger {

  companion object {
    private var VALUE = 2901
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1450()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number5803()
      val right = Number5804()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2900()
    val b = Number2899()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2902 : StressfulInteger {

  companion object {
    private var VALUE = 2902
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1451()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number5805()
      val right = Number5806()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2901()
    val b = Number2900()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2903 : StressfulInteger {

  companion object {
    private var VALUE = 2903
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1451()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number5807()
      val right = Number5808()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2902()
    val b = Number2901()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2904 : StressfulInteger {

  companion object {
    private var VALUE = 2904
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1452()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number5809()
      val right = Number5810()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2903()
    val b = Number2902()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2905 : StressfulInteger {

  companion object {
    private var VALUE = 2905
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1452()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number5811()
      val right = Number5812()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2904()
    val b = Number2903()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2906 : StressfulInteger {

  companion object {
    private var VALUE = 2906
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1453()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number5813()
      val right = Number5814()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2905()
    val b = Number2904()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2907 : StressfulInteger {

  companion object {
    private var VALUE = 2907
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1453()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number5815()
      val right = Number5816()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2906()
    val b = Number2905()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2908 : StressfulInteger {

  companion object {
    private var VALUE = 2908
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1454()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number5817()
      val right = Number5818()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2907()
    val b = Number2906()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2909 : StressfulInteger {

  companion object {
    private var VALUE = 2909
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1454()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number5819()
      val right = Number5820()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2908()
    val b = Number2907()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2910 : StressfulInteger {

  companion object {
    private var VALUE = 2910
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1455()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number5821()
      val right = Number5822()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2909()
    val b = Number2908()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2911 : StressfulInteger {

  companion object {
    private var VALUE = 2911
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1455()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number5823()
      val right = Number5824()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2910()
    val b = Number2909()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2912 : StressfulInteger {

  companion object {
    private var VALUE = 2912
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1456()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number5825()
      val right = Number5826()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2911()
    val b = Number2910()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2913 : StressfulInteger {

  companion object {
    private var VALUE = 2913
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1456()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number5827()
      val right = Number5828()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2912()
    val b = Number2911()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2914 : StressfulInteger {

  companion object {
    private var VALUE = 2914
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1457()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number5829()
      val right = Number5830()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2913()
    val b = Number2912()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2915 : StressfulInteger {

  companion object {
    private var VALUE = 2915
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1457()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number5831()
      val right = Number5832()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2914()
    val b = Number2913()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2916 : StressfulInteger {

  companion object {
    private var VALUE = 2916
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1458()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number5833()
      val right = Number5834()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2915()
    val b = Number2914()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2917 : StressfulInteger {

  companion object {
    private var VALUE = 2917
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1458()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number5835()
      val right = Number5836()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2916()
    val b = Number2915()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2918 : StressfulInteger {

  companion object {
    private var VALUE = 2918
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1459()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number5837()
      val right = Number5838()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2917()
    val b = Number2916()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2919 : StressfulInteger {

  companion object {
    private var VALUE = 2919
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1459()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number5839()
      val right = Number5840()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2918()
    val b = Number2917()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2920 : StressfulInteger {

  companion object {
    private var VALUE = 2920
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1460()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number5841()
      val right = Number5842()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2919()
    val b = Number2918()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2921 : StressfulInteger {

  companion object {
    private var VALUE = 2921
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1460()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number5843()
      val right = Number5844()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2920()
    val b = Number2919()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2922 : StressfulInteger {

  companion object {
    private var VALUE = 2922
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1461()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number5845()
      val right = Number5846()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2921()
    val b = Number2920()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2923 : StressfulInteger {

  companion object {
    private var VALUE = 2923
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1461()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number5847()
      val right = Number5848()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2922()
    val b = Number2921()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2924 : StressfulInteger {

  companion object {
    private var VALUE = 2924
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1462()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number5849()
      val right = Number5850()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2923()
    val b = Number2922()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2925 : StressfulInteger {

  companion object {
    private var VALUE = 2925
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1462()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number5851()
      val right = Number5852()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2924()
    val b = Number2923()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2926 : StressfulInteger {

  companion object {
    private var VALUE = 2926
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1463()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number5853()
      val right = Number5854()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2925()
    val b = Number2924()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2927 : StressfulInteger {

  companion object {
    private var VALUE = 2927
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1463()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number5855()
      val right = Number5856()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2926()
    val b = Number2925()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2928 : StressfulInteger {

  companion object {
    private var VALUE = 2928
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1464()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number5857()
      val right = Number5858()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2927()
    val b = Number2926()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2929 : StressfulInteger {

  companion object {
    private var VALUE = 2929
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1464()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number5859()
      val right = Number5860()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2928()
    val b = Number2927()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2930 : StressfulInteger {

  companion object {
    private var VALUE = 2930
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1465()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number5861()
      val right = Number5862()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2929()
    val b = Number2928()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2931 : StressfulInteger {

  companion object {
    private var VALUE = 2931
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1465()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number5863()
      val right = Number5864()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2930()
    val b = Number2929()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2932 : StressfulInteger {

  companion object {
    private var VALUE = 2932
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1466()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number5865()
      val right = Number5866()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2931()
    val b = Number2930()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2933 : StressfulInteger {

  companion object {
    private var VALUE = 2933
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1466()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number5867()
      val right = Number5868()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2932()
    val b = Number2931()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2934 : StressfulInteger {

  companion object {
    private var VALUE = 2934
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1467()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number5869()
      val right = Number5870()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2933()
    val b = Number2932()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2935 : StressfulInteger {

  companion object {
    private var VALUE = 2935
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1467()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number5871()
      val right = Number5872()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2934()
    val b = Number2933()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2936 : StressfulInteger {

  companion object {
    private var VALUE = 2936
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1468()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number5873()
      val right = Number5874()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2935()
    val b = Number2934()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2937 : StressfulInteger {

  companion object {
    private var VALUE = 2937
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1468()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number5875()
      val right = Number5876()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2936()
    val b = Number2935()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2938 : StressfulInteger {

  companion object {
    private var VALUE = 2938
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1469()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number5877()
      val right = Number5878()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2937()
    val b = Number2936()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2939 : StressfulInteger {

  companion object {
    private var VALUE = 2939
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1469()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number5879()
      val right = Number5880()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2938()
    val b = Number2937()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2940 : StressfulInteger {

  companion object {
    private var VALUE = 2940
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1470()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number5881()
      val right = Number5882()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2939()
    val b = Number2938()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2941 : StressfulInteger {

  companion object {
    private var VALUE = 2941
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1470()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number5883()
      val right = Number5884()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2940()
    val b = Number2939()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2942 : StressfulInteger {

  companion object {
    private var VALUE = 2942
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1471()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number5885()
      val right = Number5886()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2941()
    val b = Number2940()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2943 : StressfulInteger {

  companion object {
    private var VALUE = 2943
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1471()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number5887()
      val right = Number5888()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2942()
    val b = Number2941()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2944 : StressfulInteger {

  companion object {
    private var VALUE = 2944
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1472()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number5889()
      val right = Number5890()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2943()
    val b = Number2942()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2945 : StressfulInteger {

  companion object {
    private var VALUE = 2945
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1472()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number5891()
      val right = Number5892()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2944()
    val b = Number2943()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2946 : StressfulInteger {

  companion object {
    private var VALUE = 2946
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1473()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number5893()
      val right = Number5894()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2945()
    val b = Number2944()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2947 : StressfulInteger {

  companion object {
    private var VALUE = 2947
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1473()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number5895()
      val right = Number5896()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2946()
    val b = Number2945()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2948 : StressfulInteger {

  companion object {
    private var VALUE = 2948
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1474()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number5897()
      val right = Number5898()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2947()
    val b = Number2946()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2949 : StressfulInteger {

  companion object {
    private var VALUE = 2949
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1474()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number5899()
      val right = Number5900()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2948()
    val b = Number2947()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2950 : StressfulInteger {

  companion object {
    private var VALUE = 2950
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1475()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number5901()
      val right = Number5902()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2949()
    val b = Number2948()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2951 : StressfulInteger {

  companion object {
    private var VALUE = 2951
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1475()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number5903()
      val right = Number5904()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2950()
    val b = Number2949()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2952 : StressfulInteger {

  companion object {
    private var VALUE = 2952
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1476()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number5905()
      val right = Number5906()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2951()
    val b = Number2950()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2953 : StressfulInteger {

  companion object {
    private var VALUE = 2953
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1476()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number5907()
      val right = Number5908()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2952()
    val b = Number2951()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2954 : StressfulInteger {

  companion object {
    private var VALUE = 2954
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1477()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number5909()
      val right = Number5910()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2953()
    val b = Number2952()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2955 : StressfulInteger {

  companion object {
    private var VALUE = 2955
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1477()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number5911()
      val right = Number5912()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2954()
    val b = Number2953()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2956 : StressfulInteger {

  companion object {
    private var VALUE = 2956
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1478()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number5913()
      val right = Number5914()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2955()
    val b = Number2954()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2957 : StressfulInteger {

  companion object {
    private var VALUE = 2957
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1478()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number5915()
      val right = Number5916()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2956()
    val b = Number2955()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2958 : StressfulInteger {

  companion object {
    private var VALUE = 2958
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1479()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number5917()
      val right = Number5918()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2957()
    val b = Number2956()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2959 : StressfulInteger {

  companion object {
    private var VALUE = 2959
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1479()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number5919()
      val right = Number5920()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2958()
    val b = Number2957()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2960 : StressfulInteger {

  companion object {
    private var VALUE = 2960
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1480()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number5921()
      val right = Number5922()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2959()
    val b = Number2958()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2961 : StressfulInteger {

  companion object {
    private var VALUE = 2961
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1480()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number5923()
      val right = Number5924()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2960()
    val b = Number2959()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2962 : StressfulInteger {

  companion object {
    private var VALUE = 2962
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1481()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number5925()
      val right = Number5926()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2961()
    val b = Number2960()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2963 : StressfulInteger {

  companion object {
    private var VALUE = 2963
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1481()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number5927()
      val right = Number5928()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2962()
    val b = Number2961()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2964 : StressfulInteger {

  companion object {
    private var VALUE = 2964
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1482()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number5929()
      val right = Number5930()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2963()
    val b = Number2962()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2965 : StressfulInteger {

  companion object {
    private var VALUE = 2965
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1482()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number5931()
      val right = Number5932()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2964()
    val b = Number2963()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2966 : StressfulInteger {

  companion object {
    private var VALUE = 2966
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1483()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number5933()
      val right = Number5934()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2965()
    val b = Number2964()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2967 : StressfulInteger {

  companion object {
    private var VALUE = 2967
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1483()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number5935()
      val right = Number5936()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2966()
    val b = Number2965()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2968 : StressfulInteger {

  companion object {
    private var VALUE = 2968
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1484()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number5937()
      val right = Number5938()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2967()
    val b = Number2966()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2969 : StressfulInteger {

  companion object {
    private var VALUE = 2969
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1484()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number5939()
      val right = Number5940()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2968()
    val b = Number2967()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2970 : StressfulInteger {

  companion object {
    private var VALUE = 2970
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1485()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number5941()
      val right = Number5942()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2969()
    val b = Number2968()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2971 : StressfulInteger {

  companion object {
    private var VALUE = 2971
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1485()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number5943()
      val right = Number5944()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2970()
    val b = Number2969()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2972 : StressfulInteger {

  companion object {
    private var VALUE = 2972
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1486()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number5945()
      val right = Number5946()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2971()
    val b = Number2970()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2973 : StressfulInteger {

  companion object {
    private var VALUE = 2973
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1486()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number5947()
      val right = Number5948()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2972()
    val b = Number2971()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2974 : StressfulInteger {

  companion object {
    private var VALUE = 2974
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1487()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number5949()
      val right = Number5950()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2973()
    val b = Number2972()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2975 : StressfulInteger {

  companion object {
    private var VALUE = 2975
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1487()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number5951()
      val right = Number5952()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2974()
    val b = Number2973()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2976 : StressfulInteger {

  companion object {
    private var VALUE = 2976
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1488()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number5953()
      val right = Number5954()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2975()
    val b = Number2974()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2977 : StressfulInteger {

  companion object {
    private var VALUE = 2977
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1488()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number5955()
      val right = Number5956()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2976()
    val b = Number2975()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2978 : StressfulInteger {

  companion object {
    private var VALUE = 2978
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1489()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number5957()
      val right = Number5958()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2977()
    val b = Number2976()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2979 : StressfulInteger {

  companion object {
    private var VALUE = 2979
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1489()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number5959()
      val right = Number5960()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2978()
    val b = Number2977()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2980 : StressfulInteger {

  companion object {
    private var VALUE = 2980
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1490()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number5961()
      val right = Number5962()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2979()
    val b = Number2978()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2981 : StressfulInteger {

  companion object {
    private var VALUE = 2981
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1490()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number5963()
      val right = Number5964()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2980()
    val b = Number2979()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2982 : StressfulInteger {

  companion object {
    private var VALUE = 2982
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1491()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number5965()
      val right = Number5966()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2981()
    val b = Number2980()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2983 : StressfulInteger {

  companion object {
    private var VALUE = 2983
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1491()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number5967()
      val right = Number5968()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2982()
    val b = Number2981()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2984 : StressfulInteger {

  companion object {
    private var VALUE = 2984
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1492()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number5969()
      val right = Number5970()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2983()
    val b = Number2982()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2985 : StressfulInteger {

  companion object {
    private var VALUE = 2985
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1492()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number5971()
      val right = Number5972()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2984()
    val b = Number2983()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2986 : StressfulInteger {

  companion object {
    private var VALUE = 2986
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1493()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number5973()
      val right = Number5974()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2985()
    val b = Number2984()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2987 : StressfulInteger {

  companion object {
    private var VALUE = 2987
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1493()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number5975()
      val right = Number5976()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2986()
    val b = Number2985()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2988 : StressfulInteger {

  companion object {
    private var VALUE = 2988
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1494()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number5977()
      val right = Number5978()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2987()
    val b = Number2986()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2989 : StressfulInteger {

  companion object {
    private var VALUE = 2989
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1494()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number5979()
      val right = Number5980()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2988()
    val b = Number2987()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2990 : StressfulInteger {

  companion object {
    private var VALUE = 2990
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1495()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number5981()
      val right = Number5982()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2989()
    val b = Number2988()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2991 : StressfulInteger {

  companion object {
    private var VALUE = 2991
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1495()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number5983()
      val right = Number5984()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2990()
    val b = Number2989()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2992 : StressfulInteger {

  companion object {
    private var VALUE = 2992
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1496()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number5985()
      val right = Number5986()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2991()
    val b = Number2990()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2993 : StressfulInteger {

  companion object {
    private var VALUE = 2993
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1496()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number5987()
      val right = Number5988()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2992()
    val b = Number2991()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2994 : StressfulInteger {

  companion object {
    private var VALUE = 2994
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1497()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number5989()
      val right = Number5990()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2993()
    val b = Number2992()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2995 : StressfulInteger {

  companion object {
    private var VALUE = 2995
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1497()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number5991()
      val right = Number5992()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2994()
    val b = Number2993()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2996 : StressfulInteger {

  companion object {
    private var VALUE = 2996
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1498()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number5993()
      val right = Number5994()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2995()
    val b = Number2994()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2997 : StressfulInteger {

  companion object {
    private var VALUE = 2997
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1498()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number5995()
      val right = Number5996()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2996()
    val b = Number2995()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2998 : StressfulInteger {

  companion object {
    private var VALUE = 2998
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1499()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number5997()
      val right = Number5998()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2997()
    val b = Number2996()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number2999 : StressfulInteger {

  companion object {
    private var VALUE = 2999
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number1499()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number5999()
      val right = Number6000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number2998()
    val b = Number2997()
    return a.fib() + b.fib()
  }
}
