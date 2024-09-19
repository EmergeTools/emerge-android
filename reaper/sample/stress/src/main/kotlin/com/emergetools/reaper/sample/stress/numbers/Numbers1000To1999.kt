package com.emergetools.reaper.sample.stress.numbers

@Suppress("MatchingDeclarationName")
class Number1000 : StressfulInteger {

  companion object {
    private var VALUE = 1000
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number500()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number2001()
      val right = Number2002()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number999()
    val b = Number998()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1001 : StressfulInteger {

  companion object {
    private var VALUE = 1001
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number500()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number2003()
      val right = Number2004()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1000()
    val b = Number999()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1002 : StressfulInteger {

  companion object {
    private var VALUE = 1002
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number501()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number2005()
      val right = Number2006()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1001()
    val b = Number1000()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1003 : StressfulInteger {

  companion object {
    private var VALUE = 1003
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number501()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number2007()
      val right = Number2008()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1002()
    val b = Number1001()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1004 : StressfulInteger {

  companion object {
    private var VALUE = 1004
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number502()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number2009()
      val right = Number2010()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1003()
    val b = Number1002()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1005 : StressfulInteger {

  companion object {
    private var VALUE = 1005
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number502()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number2011()
      val right = Number2012()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1004()
    val b = Number1003()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1006 : StressfulInteger {

  companion object {
    private var VALUE = 1006
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number503()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number2013()
      val right = Number2014()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1005()
    val b = Number1004()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1007 : StressfulInteger {

  companion object {
    private var VALUE = 1007
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number503()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number2015()
      val right = Number2016()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1006()
    val b = Number1005()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1008 : StressfulInteger {

  companion object {
    private var VALUE = 1008
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number504()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number2017()
      val right = Number2018()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1007()
    val b = Number1006()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1009 : StressfulInteger {

  companion object {
    private var VALUE = 1009
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number504()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number2019()
      val right = Number2020()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1008()
    val b = Number1007()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1010 : StressfulInteger {

  companion object {
    private var VALUE = 1010
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number505()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number2021()
      val right = Number2022()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1009()
    val b = Number1008()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1011 : StressfulInteger {

  companion object {
    private var VALUE = 1011
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number505()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number2023()
      val right = Number2024()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1010()
    val b = Number1009()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1012 : StressfulInteger {

  companion object {
    private var VALUE = 1012
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number506()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number2025()
      val right = Number2026()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1011()
    val b = Number1010()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1013 : StressfulInteger {

  companion object {
    private var VALUE = 1013
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number506()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number2027()
      val right = Number2028()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1012()
    val b = Number1011()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1014 : StressfulInteger {

  companion object {
    private var VALUE = 1014
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number507()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number2029()
      val right = Number2030()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1013()
    val b = Number1012()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1015 : StressfulInteger {

  companion object {
    private var VALUE = 1015
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number507()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number2031()
      val right = Number2032()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1014()
    val b = Number1013()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1016 : StressfulInteger {

  companion object {
    private var VALUE = 1016
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number508()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number2033()
      val right = Number2034()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1015()
    val b = Number1014()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1017 : StressfulInteger {

  companion object {
    private var VALUE = 1017
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number508()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number2035()
      val right = Number2036()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1016()
    val b = Number1015()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1018 : StressfulInteger {

  companion object {
    private var VALUE = 1018
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number509()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number2037()
      val right = Number2038()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1017()
    val b = Number1016()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1019 : StressfulInteger {

  companion object {
    private var VALUE = 1019
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number509()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number2039()
      val right = Number2040()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1018()
    val b = Number1017()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1020 : StressfulInteger {

  companion object {
    private var VALUE = 1020
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number510()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number2041()
      val right = Number2042()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1019()
    val b = Number1018()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1021 : StressfulInteger {

  companion object {
    private var VALUE = 1021
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number510()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number2043()
      val right = Number2044()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1020()
    val b = Number1019()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1022 : StressfulInteger {

  companion object {
    private var VALUE = 1022
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number511()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number2045()
      val right = Number2046()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1021()
    val b = Number1020()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1023 : StressfulInteger {

  companion object {
    private var VALUE = 1023
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number511()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number2047()
      val right = Number2048()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1022()
    val b = Number1021()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1024 : StressfulInteger {

  companion object {
    private var VALUE = 1024
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number512()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number2049()
      val right = Number2050()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1023()
    val b = Number1022()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1025 : StressfulInteger {

  companion object {
    private var VALUE = 1025
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number512()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number2051()
      val right = Number2052()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1024()
    val b = Number1023()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1026 : StressfulInteger {

  companion object {
    private var VALUE = 1026
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number513()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number2053()
      val right = Number2054()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1025()
    val b = Number1024()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1027 : StressfulInteger {

  companion object {
    private var VALUE = 1027
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number513()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number2055()
      val right = Number2056()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1026()
    val b = Number1025()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1028 : StressfulInteger {

  companion object {
    private var VALUE = 1028
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number514()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number2057()
      val right = Number2058()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1027()
    val b = Number1026()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1029 : StressfulInteger {

  companion object {
    private var VALUE = 1029
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number514()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number2059()
      val right = Number2060()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1028()
    val b = Number1027()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1030 : StressfulInteger {

  companion object {
    private var VALUE = 1030
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number515()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number2061()
      val right = Number2062()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1029()
    val b = Number1028()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1031 : StressfulInteger {

  companion object {
    private var VALUE = 1031
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number515()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number2063()
      val right = Number2064()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1030()
    val b = Number1029()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1032 : StressfulInteger {

  companion object {
    private var VALUE = 1032
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number516()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number2065()
      val right = Number2066()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1031()
    val b = Number1030()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1033 : StressfulInteger {

  companion object {
    private var VALUE = 1033
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number516()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number2067()
      val right = Number2068()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1032()
    val b = Number1031()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1034 : StressfulInteger {

  companion object {
    private var VALUE = 1034
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number517()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number2069()
      val right = Number2070()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1033()
    val b = Number1032()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1035 : StressfulInteger {

  companion object {
    private var VALUE = 1035
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number517()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number2071()
      val right = Number2072()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1034()
    val b = Number1033()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1036 : StressfulInteger {

  companion object {
    private var VALUE = 1036
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number518()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number2073()
      val right = Number2074()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1035()
    val b = Number1034()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1037 : StressfulInteger {

  companion object {
    private var VALUE = 1037
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number518()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number2075()
      val right = Number2076()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1036()
    val b = Number1035()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1038 : StressfulInteger {

  companion object {
    private var VALUE = 1038
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number519()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number2077()
      val right = Number2078()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1037()
    val b = Number1036()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1039 : StressfulInteger {

  companion object {
    private var VALUE = 1039
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number519()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number2079()
      val right = Number2080()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1038()
    val b = Number1037()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1040 : StressfulInteger {

  companion object {
    private var VALUE = 1040
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number520()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number2081()
      val right = Number2082()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1039()
    val b = Number1038()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1041 : StressfulInteger {

  companion object {
    private var VALUE = 1041
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number520()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number2083()
      val right = Number2084()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1040()
    val b = Number1039()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1042 : StressfulInteger {

  companion object {
    private var VALUE = 1042
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number521()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number2085()
      val right = Number2086()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1041()
    val b = Number1040()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1043 : StressfulInteger {

  companion object {
    private var VALUE = 1043
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number521()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number2087()
      val right = Number2088()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1042()
    val b = Number1041()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1044 : StressfulInteger {

  companion object {
    private var VALUE = 1044
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number522()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number2089()
      val right = Number2090()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1043()
    val b = Number1042()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1045 : StressfulInteger {

  companion object {
    private var VALUE = 1045
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number522()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number2091()
      val right = Number2092()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1044()
    val b = Number1043()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1046 : StressfulInteger {

  companion object {
    private var VALUE = 1046
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number523()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number2093()
      val right = Number2094()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1045()
    val b = Number1044()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1047 : StressfulInteger {

  companion object {
    private var VALUE = 1047
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number523()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number2095()
      val right = Number2096()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1046()
    val b = Number1045()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1048 : StressfulInteger {

  companion object {
    private var VALUE = 1048
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number524()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number2097()
      val right = Number2098()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1047()
    val b = Number1046()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1049 : StressfulInteger {

  companion object {
    private var VALUE = 1049
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number524()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number2099()
      val right = Number2100()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1048()
    val b = Number1047()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1050 : StressfulInteger {

  companion object {
    private var VALUE = 1050
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number525()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number2101()
      val right = Number2102()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1049()
    val b = Number1048()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1051 : StressfulInteger {

  companion object {
    private var VALUE = 1051
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number525()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number2103()
      val right = Number2104()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1050()
    val b = Number1049()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1052 : StressfulInteger {

  companion object {
    private var VALUE = 1052
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number526()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number2105()
      val right = Number2106()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1051()
    val b = Number1050()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1053 : StressfulInteger {

  companion object {
    private var VALUE = 1053
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number526()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number2107()
      val right = Number2108()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1052()
    val b = Number1051()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1054 : StressfulInteger {

  companion object {
    private var VALUE = 1054
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number527()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number2109()
      val right = Number2110()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1053()
    val b = Number1052()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1055 : StressfulInteger {

  companion object {
    private var VALUE = 1055
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number527()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number2111()
      val right = Number2112()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1054()
    val b = Number1053()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1056 : StressfulInteger {

  companion object {
    private var VALUE = 1056
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number528()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number2113()
      val right = Number2114()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1055()
    val b = Number1054()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1057 : StressfulInteger {

  companion object {
    private var VALUE = 1057
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number528()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number2115()
      val right = Number2116()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1056()
    val b = Number1055()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1058 : StressfulInteger {

  companion object {
    private var VALUE = 1058
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number529()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number2117()
      val right = Number2118()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1057()
    val b = Number1056()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1059 : StressfulInteger {

  companion object {
    private var VALUE = 1059
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number529()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number2119()
      val right = Number2120()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1058()
    val b = Number1057()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1060 : StressfulInteger {

  companion object {
    private var VALUE = 1060
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number530()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number2121()
      val right = Number2122()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1059()
    val b = Number1058()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1061 : StressfulInteger {

  companion object {
    private var VALUE = 1061
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number530()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number2123()
      val right = Number2124()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1060()
    val b = Number1059()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1062 : StressfulInteger {

  companion object {
    private var VALUE = 1062
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number531()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number2125()
      val right = Number2126()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1061()
    val b = Number1060()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1063 : StressfulInteger {

  companion object {
    private var VALUE = 1063
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number531()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number2127()
      val right = Number2128()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1062()
    val b = Number1061()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1064 : StressfulInteger {

  companion object {
    private var VALUE = 1064
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number532()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number2129()
      val right = Number2130()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1063()
    val b = Number1062()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1065 : StressfulInteger {

  companion object {
    private var VALUE = 1065
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number532()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number2131()
      val right = Number2132()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1064()
    val b = Number1063()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1066 : StressfulInteger {

  companion object {
    private var VALUE = 1066
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number533()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number2133()
      val right = Number2134()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1065()
    val b = Number1064()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1067 : StressfulInteger {

  companion object {
    private var VALUE = 1067
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number533()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number2135()
      val right = Number2136()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1066()
    val b = Number1065()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1068 : StressfulInteger {

  companion object {
    private var VALUE = 1068
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number534()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number2137()
      val right = Number2138()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1067()
    val b = Number1066()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1069 : StressfulInteger {

  companion object {
    private var VALUE = 1069
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number534()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number2139()
      val right = Number2140()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1068()
    val b = Number1067()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1070 : StressfulInteger {

  companion object {
    private var VALUE = 1070
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number535()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number2141()
      val right = Number2142()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1069()
    val b = Number1068()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1071 : StressfulInteger {

  companion object {
    private var VALUE = 1071
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number535()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number2143()
      val right = Number2144()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1070()
    val b = Number1069()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1072 : StressfulInteger {

  companion object {
    private var VALUE = 1072
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number536()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number2145()
      val right = Number2146()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1071()
    val b = Number1070()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1073 : StressfulInteger {

  companion object {
    private var VALUE = 1073
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number536()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number2147()
      val right = Number2148()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1072()
    val b = Number1071()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1074 : StressfulInteger {

  companion object {
    private var VALUE = 1074
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number537()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number2149()
      val right = Number2150()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1073()
    val b = Number1072()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1075 : StressfulInteger {

  companion object {
    private var VALUE = 1075
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number537()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number2151()
      val right = Number2152()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1074()
    val b = Number1073()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1076 : StressfulInteger {

  companion object {
    private var VALUE = 1076
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number538()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number2153()
      val right = Number2154()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1075()
    val b = Number1074()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1077 : StressfulInteger {

  companion object {
    private var VALUE = 1077
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number538()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number2155()
      val right = Number2156()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1076()
    val b = Number1075()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1078 : StressfulInteger {

  companion object {
    private var VALUE = 1078
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number539()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number2157()
      val right = Number2158()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1077()
    val b = Number1076()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1079 : StressfulInteger {

  companion object {
    private var VALUE = 1079
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number539()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number2159()
      val right = Number2160()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1078()
    val b = Number1077()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1080 : StressfulInteger {

  companion object {
    private var VALUE = 1080
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number540()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number2161()
      val right = Number2162()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1079()
    val b = Number1078()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1081 : StressfulInteger {

  companion object {
    private var VALUE = 1081
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number540()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number2163()
      val right = Number2164()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1080()
    val b = Number1079()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1082 : StressfulInteger {

  companion object {
    private var VALUE = 1082
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number541()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number2165()
      val right = Number2166()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1081()
    val b = Number1080()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1083 : StressfulInteger {

  companion object {
    private var VALUE = 1083
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number541()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number2167()
      val right = Number2168()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1082()
    val b = Number1081()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1084 : StressfulInteger {

  companion object {
    private var VALUE = 1084
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number542()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number2169()
      val right = Number2170()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1083()
    val b = Number1082()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1085 : StressfulInteger {

  companion object {
    private var VALUE = 1085
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number542()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number2171()
      val right = Number2172()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1084()
    val b = Number1083()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1086 : StressfulInteger {

  companion object {
    private var VALUE = 1086
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number543()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number2173()
      val right = Number2174()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1085()
    val b = Number1084()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1087 : StressfulInteger {

  companion object {
    private var VALUE = 1087
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number543()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number2175()
      val right = Number2176()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1086()
    val b = Number1085()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1088 : StressfulInteger {

  companion object {
    private var VALUE = 1088
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number544()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number2177()
      val right = Number2178()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1087()
    val b = Number1086()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1089 : StressfulInteger {

  companion object {
    private var VALUE = 1089
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number544()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number2179()
      val right = Number2180()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1088()
    val b = Number1087()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1090 : StressfulInteger {

  companion object {
    private var VALUE = 1090
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number545()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number2181()
      val right = Number2182()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1089()
    val b = Number1088()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1091 : StressfulInteger {

  companion object {
    private var VALUE = 1091
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number545()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number2183()
      val right = Number2184()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1090()
    val b = Number1089()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1092 : StressfulInteger {

  companion object {
    private var VALUE = 1092
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number546()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number2185()
      val right = Number2186()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1091()
    val b = Number1090()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1093 : StressfulInteger {

  companion object {
    private var VALUE = 1093
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number546()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number2187()
      val right = Number2188()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1092()
    val b = Number1091()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1094 : StressfulInteger {

  companion object {
    private var VALUE = 1094
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number547()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number2189()
      val right = Number2190()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1093()
    val b = Number1092()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1095 : StressfulInteger {

  companion object {
    private var VALUE = 1095
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number547()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number2191()
      val right = Number2192()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1094()
    val b = Number1093()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1096 : StressfulInteger {

  companion object {
    private var VALUE = 1096
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number548()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number2193()
      val right = Number2194()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1095()
    val b = Number1094()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1097 : StressfulInteger {

  companion object {
    private var VALUE = 1097
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number548()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number2195()
      val right = Number2196()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1096()
    val b = Number1095()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1098 : StressfulInteger {

  companion object {
    private var VALUE = 1098
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number549()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number2197()
      val right = Number2198()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1097()
    val b = Number1096()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1099 : StressfulInteger {

  companion object {
    private var VALUE = 1099
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number549()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number2199()
      val right = Number2200()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1098()
    val b = Number1097()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1100 : StressfulInteger {

  companion object {
    private var VALUE = 1100
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number550()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number2201()
      val right = Number2202()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1099()
    val b = Number1098()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1101 : StressfulInteger {

  companion object {
    private var VALUE = 1101
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number550()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number2203()
      val right = Number2204()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1100()
    val b = Number1099()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1102 : StressfulInteger {

  companion object {
    private var VALUE = 1102
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number551()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number2205()
      val right = Number2206()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1101()
    val b = Number1100()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1103 : StressfulInteger {

  companion object {
    private var VALUE = 1103
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number551()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number2207()
      val right = Number2208()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1102()
    val b = Number1101()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1104 : StressfulInteger {

  companion object {
    private var VALUE = 1104
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number552()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number2209()
      val right = Number2210()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1103()
    val b = Number1102()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1105 : StressfulInteger {

  companion object {
    private var VALUE = 1105
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number552()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number2211()
      val right = Number2212()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1104()
    val b = Number1103()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1106 : StressfulInteger {

  companion object {
    private var VALUE = 1106
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number553()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number2213()
      val right = Number2214()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1105()
    val b = Number1104()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1107 : StressfulInteger {

  companion object {
    private var VALUE = 1107
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number553()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number2215()
      val right = Number2216()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1106()
    val b = Number1105()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1108 : StressfulInteger {

  companion object {
    private var VALUE = 1108
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number554()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number2217()
      val right = Number2218()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1107()
    val b = Number1106()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1109 : StressfulInteger {

  companion object {
    private var VALUE = 1109
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number554()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number2219()
      val right = Number2220()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1108()
    val b = Number1107()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1110 : StressfulInteger {

  companion object {
    private var VALUE = 1110
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number555()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number2221()
      val right = Number2222()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1109()
    val b = Number1108()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1111 : StressfulInteger {

  companion object {
    private var VALUE = 1111
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number555()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number2223()
      val right = Number2224()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1110()
    val b = Number1109()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1112 : StressfulInteger {

  companion object {
    private var VALUE = 1112
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number556()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number2225()
      val right = Number2226()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1111()
    val b = Number1110()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1113 : StressfulInteger {

  companion object {
    private var VALUE = 1113
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number556()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number2227()
      val right = Number2228()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1112()
    val b = Number1111()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1114 : StressfulInteger {

  companion object {
    private var VALUE = 1114
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number557()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number2229()
      val right = Number2230()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1113()
    val b = Number1112()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1115 : StressfulInteger {

  companion object {
    private var VALUE = 1115
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number557()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number2231()
      val right = Number2232()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1114()
    val b = Number1113()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1116 : StressfulInteger {

  companion object {
    private var VALUE = 1116
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number558()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number2233()
      val right = Number2234()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1115()
    val b = Number1114()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1117 : StressfulInteger {

  companion object {
    private var VALUE = 1117
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number558()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number2235()
      val right = Number2236()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1116()
    val b = Number1115()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1118 : StressfulInteger {

  companion object {
    private var VALUE = 1118
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number559()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number2237()
      val right = Number2238()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1117()
    val b = Number1116()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1119 : StressfulInteger {

  companion object {
    private var VALUE = 1119
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number559()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number2239()
      val right = Number2240()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1118()
    val b = Number1117()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1120 : StressfulInteger {

  companion object {
    private var VALUE = 1120
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number560()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number2241()
      val right = Number2242()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1119()
    val b = Number1118()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1121 : StressfulInteger {

  companion object {
    private var VALUE = 1121
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number560()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number2243()
      val right = Number2244()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1120()
    val b = Number1119()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1122 : StressfulInteger {

  companion object {
    private var VALUE = 1122
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number561()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number2245()
      val right = Number2246()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1121()
    val b = Number1120()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1123 : StressfulInteger {

  companion object {
    private var VALUE = 1123
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number561()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number2247()
      val right = Number2248()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1122()
    val b = Number1121()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1124 : StressfulInteger {

  companion object {
    private var VALUE = 1124
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number562()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number2249()
      val right = Number2250()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1123()
    val b = Number1122()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1125 : StressfulInteger {

  companion object {
    private var VALUE = 1125
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number562()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number2251()
      val right = Number2252()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1124()
    val b = Number1123()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1126 : StressfulInteger {

  companion object {
    private var VALUE = 1126
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number563()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number2253()
      val right = Number2254()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1125()
    val b = Number1124()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1127 : StressfulInteger {

  companion object {
    private var VALUE = 1127
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number563()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number2255()
      val right = Number2256()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1126()
    val b = Number1125()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1128 : StressfulInteger {

  companion object {
    private var VALUE = 1128
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number564()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number2257()
      val right = Number2258()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1127()
    val b = Number1126()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1129 : StressfulInteger {

  companion object {
    private var VALUE = 1129
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number564()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number2259()
      val right = Number2260()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1128()
    val b = Number1127()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1130 : StressfulInteger {

  companion object {
    private var VALUE = 1130
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number565()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number2261()
      val right = Number2262()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1129()
    val b = Number1128()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1131 : StressfulInteger {

  companion object {
    private var VALUE = 1131
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number565()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number2263()
      val right = Number2264()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1130()
    val b = Number1129()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1132 : StressfulInteger {

  companion object {
    private var VALUE = 1132
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number566()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number2265()
      val right = Number2266()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1131()
    val b = Number1130()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1133 : StressfulInteger {

  companion object {
    private var VALUE = 1133
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number566()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number2267()
      val right = Number2268()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1132()
    val b = Number1131()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1134 : StressfulInteger {

  companion object {
    private var VALUE = 1134
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number567()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number2269()
      val right = Number2270()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1133()
    val b = Number1132()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1135 : StressfulInteger {

  companion object {
    private var VALUE = 1135
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number567()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number2271()
      val right = Number2272()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1134()
    val b = Number1133()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1136 : StressfulInteger {

  companion object {
    private var VALUE = 1136
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number568()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number2273()
      val right = Number2274()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1135()
    val b = Number1134()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1137 : StressfulInteger {

  companion object {
    private var VALUE = 1137
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number568()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number2275()
      val right = Number2276()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1136()
    val b = Number1135()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1138 : StressfulInteger {

  companion object {
    private var VALUE = 1138
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number569()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number2277()
      val right = Number2278()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1137()
    val b = Number1136()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1139 : StressfulInteger {

  companion object {
    private var VALUE = 1139
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number569()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number2279()
      val right = Number2280()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1138()
    val b = Number1137()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1140 : StressfulInteger {

  companion object {
    private var VALUE = 1140
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number570()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number2281()
      val right = Number2282()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1139()
    val b = Number1138()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1141 : StressfulInteger {

  companion object {
    private var VALUE = 1141
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number570()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number2283()
      val right = Number2284()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1140()
    val b = Number1139()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1142 : StressfulInteger {

  companion object {
    private var VALUE = 1142
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number571()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number2285()
      val right = Number2286()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1141()
    val b = Number1140()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1143 : StressfulInteger {

  companion object {
    private var VALUE = 1143
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number571()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number2287()
      val right = Number2288()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1142()
    val b = Number1141()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1144 : StressfulInteger {

  companion object {
    private var VALUE = 1144
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number572()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number2289()
      val right = Number2290()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1143()
    val b = Number1142()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1145 : StressfulInteger {

  companion object {
    private var VALUE = 1145
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number572()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number2291()
      val right = Number2292()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1144()
    val b = Number1143()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1146 : StressfulInteger {

  companion object {
    private var VALUE = 1146
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number573()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number2293()
      val right = Number2294()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1145()
    val b = Number1144()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1147 : StressfulInteger {

  companion object {
    private var VALUE = 1147
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number573()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number2295()
      val right = Number2296()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1146()
    val b = Number1145()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1148 : StressfulInteger {

  companion object {
    private var VALUE = 1148
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number574()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number2297()
      val right = Number2298()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1147()
    val b = Number1146()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1149 : StressfulInteger {

  companion object {
    private var VALUE = 1149
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number574()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number2299()
      val right = Number2300()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1148()
    val b = Number1147()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1150 : StressfulInteger {

  companion object {
    private var VALUE = 1150
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number575()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number2301()
      val right = Number2302()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1149()
    val b = Number1148()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1151 : StressfulInteger {

  companion object {
    private var VALUE = 1151
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number575()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number2303()
      val right = Number2304()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1150()
    val b = Number1149()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1152 : StressfulInteger {

  companion object {
    private var VALUE = 1152
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number576()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number2305()
      val right = Number2306()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1151()
    val b = Number1150()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1153 : StressfulInteger {

  companion object {
    private var VALUE = 1153
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number576()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number2307()
      val right = Number2308()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1152()
    val b = Number1151()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1154 : StressfulInteger {

  companion object {
    private var VALUE = 1154
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number577()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number2309()
      val right = Number2310()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1153()
    val b = Number1152()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1155 : StressfulInteger {

  companion object {
    private var VALUE = 1155
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number577()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number2311()
      val right = Number2312()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1154()
    val b = Number1153()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1156 : StressfulInteger {

  companion object {
    private var VALUE = 1156
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number578()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number2313()
      val right = Number2314()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1155()
    val b = Number1154()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1157 : StressfulInteger {

  companion object {
    private var VALUE = 1157
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number578()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number2315()
      val right = Number2316()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1156()
    val b = Number1155()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1158 : StressfulInteger {

  companion object {
    private var VALUE = 1158
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number579()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number2317()
      val right = Number2318()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1157()
    val b = Number1156()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1159 : StressfulInteger {

  companion object {
    private var VALUE = 1159
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number579()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number2319()
      val right = Number2320()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1158()
    val b = Number1157()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1160 : StressfulInteger {

  companion object {
    private var VALUE = 1160
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number580()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number2321()
      val right = Number2322()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1159()
    val b = Number1158()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1161 : StressfulInteger {

  companion object {
    private var VALUE = 1161
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number580()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number2323()
      val right = Number2324()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1160()
    val b = Number1159()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1162 : StressfulInteger {

  companion object {
    private var VALUE = 1162
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number581()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number2325()
      val right = Number2326()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1161()
    val b = Number1160()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1163 : StressfulInteger {

  companion object {
    private var VALUE = 1163
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number581()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number2327()
      val right = Number2328()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1162()
    val b = Number1161()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1164 : StressfulInteger {

  companion object {
    private var VALUE = 1164
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number582()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number2329()
      val right = Number2330()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1163()
    val b = Number1162()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1165 : StressfulInteger {

  companion object {
    private var VALUE = 1165
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number582()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number2331()
      val right = Number2332()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1164()
    val b = Number1163()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1166 : StressfulInteger {

  companion object {
    private var VALUE = 1166
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number583()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number2333()
      val right = Number2334()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1165()
    val b = Number1164()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1167 : StressfulInteger {

  companion object {
    private var VALUE = 1167
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number583()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number2335()
      val right = Number2336()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1166()
    val b = Number1165()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1168 : StressfulInteger {

  companion object {
    private var VALUE = 1168
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number584()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number2337()
      val right = Number2338()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1167()
    val b = Number1166()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1169 : StressfulInteger {

  companion object {
    private var VALUE = 1169
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number584()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number2339()
      val right = Number2340()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1168()
    val b = Number1167()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1170 : StressfulInteger {

  companion object {
    private var VALUE = 1170
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number585()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number2341()
      val right = Number2342()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1169()
    val b = Number1168()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1171 : StressfulInteger {

  companion object {
    private var VALUE = 1171
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number585()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number2343()
      val right = Number2344()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1170()
    val b = Number1169()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1172 : StressfulInteger {

  companion object {
    private var VALUE = 1172
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number586()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number2345()
      val right = Number2346()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1171()
    val b = Number1170()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1173 : StressfulInteger {

  companion object {
    private var VALUE = 1173
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number586()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number2347()
      val right = Number2348()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1172()
    val b = Number1171()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1174 : StressfulInteger {

  companion object {
    private var VALUE = 1174
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number587()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number2349()
      val right = Number2350()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1173()
    val b = Number1172()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1175 : StressfulInteger {

  companion object {
    private var VALUE = 1175
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number587()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number2351()
      val right = Number2352()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1174()
    val b = Number1173()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1176 : StressfulInteger {

  companion object {
    private var VALUE = 1176
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number588()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number2353()
      val right = Number2354()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1175()
    val b = Number1174()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1177 : StressfulInteger {

  companion object {
    private var VALUE = 1177
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number588()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number2355()
      val right = Number2356()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1176()
    val b = Number1175()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1178 : StressfulInteger {

  companion object {
    private var VALUE = 1178
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number589()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number2357()
      val right = Number2358()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1177()
    val b = Number1176()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1179 : StressfulInteger {

  companion object {
    private var VALUE = 1179
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number589()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number2359()
      val right = Number2360()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1178()
    val b = Number1177()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1180 : StressfulInteger {

  companion object {
    private var VALUE = 1180
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number590()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number2361()
      val right = Number2362()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1179()
    val b = Number1178()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1181 : StressfulInteger {

  companion object {
    private var VALUE = 1181
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number590()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number2363()
      val right = Number2364()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1180()
    val b = Number1179()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1182 : StressfulInteger {

  companion object {
    private var VALUE = 1182
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number591()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number2365()
      val right = Number2366()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1181()
    val b = Number1180()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1183 : StressfulInteger {

  companion object {
    private var VALUE = 1183
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number591()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number2367()
      val right = Number2368()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1182()
    val b = Number1181()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1184 : StressfulInteger {

  companion object {
    private var VALUE = 1184
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number592()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number2369()
      val right = Number2370()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1183()
    val b = Number1182()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1185 : StressfulInteger {

  companion object {
    private var VALUE = 1185
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number592()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number2371()
      val right = Number2372()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1184()
    val b = Number1183()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1186 : StressfulInteger {

  companion object {
    private var VALUE = 1186
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number593()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number2373()
      val right = Number2374()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1185()
    val b = Number1184()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1187 : StressfulInteger {

  companion object {
    private var VALUE = 1187
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number593()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number2375()
      val right = Number2376()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1186()
    val b = Number1185()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1188 : StressfulInteger {

  companion object {
    private var VALUE = 1188
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number594()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number2377()
      val right = Number2378()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1187()
    val b = Number1186()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1189 : StressfulInteger {

  companion object {
    private var VALUE = 1189
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number594()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number2379()
      val right = Number2380()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1188()
    val b = Number1187()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1190 : StressfulInteger {

  companion object {
    private var VALUE = 1190
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number595()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number2381()
      val right = Number2382()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1189()
    val b = Number1188()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1191 : StressfulInteger {

  companion object {
    private var VALUE = 1191
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number595()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number2383()
      val right = Number2384()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1190()
    val b = Number1189()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1192 : StressfulInteger {

  companion object {
    private var VALUE = 1192
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number596()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number2385()
      val right = Number2386()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1191()
    val b = Number1190()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1193 : StressfulInteger {

  companion object {
    private var VALUE = 1193
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number596()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number2387()
      val right = Number2388()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1192()
    val b = Number1191()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1194 : StressfulInteger {

  companion object {
    private var VALUE = 1194
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number597()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number2389()
      val right = Number2390()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1193()
    val b = Number1192()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1195 : StressfulInteger {

  companion object {
    private var VALUE = 1195
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number597()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number2391()
      val right = Number2392()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1194()
    val b = Number1193()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1196 : StressfulInteger {

  companion object {
    private var VALUE = 1196
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number598()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number2393()
      val right = Number2394()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1195()
    val b = Number1194()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1197 : StressfulInteger {

  companion object {
    private var VALUE = 1197
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number598()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number2395()
      val right = Number2396()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1196()
    val b = Number1195()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1198 : StressfulInteger {

  companion object {
    private var VALUE = 1198
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number599()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number2397()
      val right = Number2398()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1197()
    val b = Number1196()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1199 : StressfulInteger {

  companion object {
    private var VALUE = 1199
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number599()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number2399()
      val right = Number2400()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1198()
    val b = Number1197()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1200 : StressfulInteger {

  companion object {
    private var VALUE = 1200
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number600()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number2401()
      val right = Number2402()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1199()
    val b = Number1198()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1201 : StressfulInteger {

  companion object {
    private var VALUE = 1201
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number600()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number2403()
      val right = Number2404()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1200()
    val b = Number1199()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1202 : StressfulInteger {

  companion object {
    private var VALUE = 1202
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number601()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number2405()
      val right = Number2406()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1201()
    val b = Number1200()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1203 : StressfulInteger {

  companion object {
    private var VALUE = 1203
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number601()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number2407()
      val right = Number2408()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1202()
    val b = Number1201()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1204 : StressfulInteger {

  companion object {
    private var VALUE = 1204
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number602()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number2409()
      val right = Number2410()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1203()
    val b = Number1202()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1205 : StressfulInteger {

  companion object {
    private var VALUE = 1205
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number602()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number2411()
      val right = Number2412()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1204()
    val b = Number1203()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1206 : StressfulInteger {

  companion object {
    private var VALUE = 1206
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number603()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number2413()
      val right = Number2414()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1205()
    val b = Number1204()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1207 : StressfulInteger {

  companion object {
    private var VALUE = 1207
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number603()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number2415()
      val right = Number2416()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1206()
    val b = Number1205()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1208 : StressfulInteger {

  companion object {
    private var VALUE = 1208
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number604()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number2417()
      val right = Number2418()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1207()
    val b = Number1206()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1209 : StressfulInteger {

  companion object {
    private var VALUE = 1209
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number604()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number2419()
      val right = Number2420()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1208()
    val b = Number1207()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1210 : StressfulInteger {

  companion object {
    private var VALUE = 1210
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number605()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number2421()
      val right = Number2422()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1209()
    val b = Number1208()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1211 : StressfulInteger {

  companion object {
    private var VALUE = 1211
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number605()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number2423()
      val right = Number2424()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1210()
    val b = Number1209()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1212 : StressfulInteger {

  companion object {
    private var VALUE = 1212
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number606()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number2425()
      val right = Number2426()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1211()
    val b = Number1210()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1213 : StressfulInteger {

  companion object {
    private var VALUE = 1213
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number606()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number2427()
      val right = Number2428()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1212()
    val b = Number1211()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1214 : StressfulInteger {

  companion object {
    private var VALUE = 1214
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number607()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number2429()
      val right = Number2430()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1213()
    val b = Number1212()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1215 : StressfulInteger {

  companion object {
    private var VALUE = 1215
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number607()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number2431()
      val right = Number2432()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1214()
    val b = Number1213()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1216 : StressfulInteger {

  companion object {
    private var VALUE = 1216
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number608()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number2433()
      val right = Number2434()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1215()
    val b = Number1214()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1217 : StressfulInteger {

  companion object {
    private var VALUE = 1217
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number608()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number2435()
      val right = Number2436()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1216()
    val b = Number1215()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1218 : StressfulInteger {

  companion object {
    private var VALUE = 1218
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number609()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number2437()
      val right = Number2438()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1217()
    val b = Number1216()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1219 : StressfulInteger {

  companion object {
    private var VALUE = 1219
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number609()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number2439()
      val right = Number2440()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1218()
    val b = Number1217()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1220 : StressfulInteger {

  companion object {
    private var VALUE = 1220
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number610()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number2441()
      val right = Number2442()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1219()
    val b = Number1218()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1221 : StressfulInteger {

  companion object {
    private var VALUE = 1221
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number610()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number2443()
      val right = Number2444()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1220()
    val b = Number1219()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1222 : StressfulInteger {

  companion object {
    private var VALUE = 1222
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number611()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number2445()
      val right = Number2446()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1221()
    val b = Number1220()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1223 : StressfulInteger {

  companion object {
    private var VALUE = 1223
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number611()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number2447()
      val right = Number2448()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1222()
    val b = Number1221()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1224 : StressfulInteger {

  companion object {
    private var VALUE = 1224
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number612()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number2449()
      val right = Number2450()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1223()
    val b = Number1222()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1225 : StressfulInteger {

  companion object {
    private var VALUE = 1225
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number612()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number2451()
      val right = Number2452()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1224()
    val b = Number1223()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1226 : StressfulInteger {

  companion object {
    private var VALUE = 1226
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number613()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number2453()
      val right = Number2454()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1225()
    val b = Number1224()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1227 : StressfulInteger {

  companion object {
    private var VALUE = 1227
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number613()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number2455()
      val right = Number2456()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1226()
    val b = Number1225()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1228 : StressfulInteger {

  companion object {
    private var VALUE = 1228
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number614()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number2457()
      val right = Number2458()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1227()
    val b = Number1226()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1229 : StressfulInteger {

  companion object {
    private var VALUE = 1229
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number614()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number2459()
      val right = Number2460()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1228()
    val b = Number1227()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1230 : StressfulInteger {

  companion object {
    private var VALUE = 1230
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number615()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number2461()
      val right = Number2462()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1229()
    val b = Number1228()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1231 : StressfulInteger {

  companion object {
    private var VALUE = 1231
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number615()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number2463()
      val right = Number2464()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1230()
    val b = Number1229()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1232 : StressfulInteger {

  companion object {
    private var VALUE = 1232
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number616()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number2465()
      val right = Number2466()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1231()
    val b = Number1230()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1233 : StressfulInteger {

  companion object {
    private var VALUE = 1233
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number616()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number2467()
      val right = Number2468()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1232()
    val b = Number1231()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1234 : StressfulInteger {

  companion object {
    private var VALUE = 1234
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number617()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number2469()
      val right = Number2470()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1233()
    val b = Number1232()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1235 : StressfulInteger {

  companion object {
    private var VALUE = 1235
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number617()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number2471()
      val right = Number2472()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1234()
    val b = Number1233()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1236 : StressfulInteger {

  companion object {
    private var VALUE = 1236
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number618()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number2473()
      val right = Number2474()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1235()
    val b = Number1234()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1237 : StressfulInteger {

  companion object {
    private var VALUE = 1237
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number618()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number2475()
      val right = Number2476()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1236()
    val b = Number1235()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1238 : StressfulInteger {

  companion object {
    private var VALUE = 1238
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number619()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number2477()
      val right = Number2478()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1237()
    val b = Number1236()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1239 : StressfulInteger {

  companion object {
    private var VALUE = 1239
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number619()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number2479()
      val right = Number2480()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1238()
    val b = Number1237()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1240 : StressfulInteger {

  companion object {
    private var VALUE = 1240
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number620()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number2481()
      val right = Number2482()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1239()
    val b = Number1238()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1241 : StressfulInteger {

  companion object {
    private var VALUE = 1241
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number620()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number2483()
      val right = Number2484()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1240()
    val b = Number1239()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1242 : StressfulInteger {

  companion object {
    private var VALUE = 1242
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number621()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number2485()
      val right = Number2486()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1241()
    val b = Number1240()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1243 : StressfulInteger {

  companion object {
    private var VALUE = 1243
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number621()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number2487()
      val right = Number2488()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1242()
    val b = Number1241()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1244 : StressfulInteger {

  companion object {
    private var VALUE = 1244
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number622()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number2489()
      val right = Number2490()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1243()
    val b = Number1242()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1245 : StressfulInteger {

  companion object {
    private var VALUE = 1245
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number622()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number2491()
      val right = Number2492()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1244()
    val b = Number1243()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1246 : StressfulInteger {

  companion object {
    private var VALUE = 1246
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number623()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number2493()
      val right = Number2494()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1245()
    val b = Number1244()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1247 : StressfulInteger {

  companion object {
    private var VALUE = 1247
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number623()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number2495()
      val right = Number2496()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1246()
    val b = Number1245()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1248 : StressfulInteger {

  companion object {
    private var VALUE = 1248
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number624()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number2497()
      val right = Number2498()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1247()
    val b = Number1246()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1249 : StressfulInteger {

  companion object {
    private var VALUE = 1249
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number624()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number2499()
      val right = Number2500()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1248()
    val b = Number1247()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1250 : StressfulInteger {

  companion object {
    private var VALUE = 1250
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number625()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number2501()
      val right = Number2502()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1249()
    val b = Number1248()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1251 : StressfulInteger {

  companion object {
    private var VALUE = 1251
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number625()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number2503()
      val right = Number2504()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1250()
    val b = Number1249()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1252 : StressfulInteger {

  companion object {
    private var VALUE = 1252
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number626()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number2505()
      val right = Number2506()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1251()
    val b = Number1250()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1253 : StressfulInteger {

  companion object {
    private var VALUE = 1253
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number626()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number2507()
      val right = Number2508()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1252()
    val b = Number1251()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1254 : StressfulInteger {

  companion object {
    private var VALUE = 1254
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number627()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number2509()
      val right = Number2510()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1253()
    val b = Number1252()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1255 : StressfulInteger {

  companion object {
    private var VALUE = 1255
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number627()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number2511()
      val right = Number2512()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1254()
    val b = Number1253()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1256 : StressfulInteger {

  companion object {
    private var VALUE = 1256
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number628()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number2513()
      val right = Number2514()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1255()
    val b = Number1254()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1257 : StressfulInteger {

  companion object {
    private var VALUE = 1257
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number628()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number2515()
      val right = Number2516()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1256()
    val b = Number1255()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1258 : StressfulInteger {

  companion object {
    private var VALUE = 1258
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number629()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number2517()
      val right = Number2518()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1257()
    val b = Number1256()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1259 : StressfulInteger {

  companion object {
    private var VALUE = 1259
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number629()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number2519()
      val right = Number2520()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1258()
    val b = Number1257()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1260 : StressfulInteger {

  companion object {
    private var VALUE = 1260
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number630()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number2521()
      val right = Number2522()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1259()
    val b = Number1258()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1261 : StressfulInteger {

  companion object {
    private var VALUE = 1261
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number630()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number2523()
      val right = Number2524()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1260()
    val b = Number1259()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1262 : StressfulInteger {

  companion object {
    private var VALUE = 1262
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number631()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number2525()
      val right = Number2526()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1261()
    val b = Number1260()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1263 : StressfulInteger {

  companion object {
    private var VALUE = 1263
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number631()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number2527()
      val right = Number2528()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1262()
    val b = Number1261()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1264 : StressfulInteger {

  companion object {
    private var VALUE = 1264
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number632()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number2529()
      val right = Number2530()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1263()
    val b = Number1262()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1265 : StressfulInteger {

  companion object {
    private var VALUE = 1265
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number632()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number2531()
      val right = Number2532()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1264()
    val b = Number1263()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1266 : StressfulInteger {

  companion object {
    private var VALUE = 1266
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number633()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number2533()
      val right = Number2534()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1265()
    val b = Number1264()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1267 : StressfulInteger {

  companion object {
    private var VALUE = 1267
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number633()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number2535()
      val right = Number2536()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1266()
    val b = Number1265()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1268 : StressfulInteger {

  companion object {
    private var VALUE = 1268
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number634()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number2537()
      val right = Number2538()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1267()
    val b = Number1266()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1269 : StressfulInteger {

  companion object {
    private var VALUE = 1269
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number634()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number2539()
      val right = Number2540()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1268()
    val b = Number1267()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1270 : StressfulInteger {

  companion object {
    private var VALUE = 1270
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number635()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number2541()
      val right = Number2542()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1269()
    val b = Number1268()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1271 : StressfulInteger {

  companion object {
    private var VALUE = 1271
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number635()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number2543()
      val right = Number2544()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1270()
    val b = Number1269()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1272 : StressfulInteger {

  companion object {
    private var VALUE = 1272
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number636()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number2545()
      val right = Number2546()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1271()
    val b = Number1270()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1273 : StressfulInteger {

  companion object {
    private var VALUE = 1273
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number636()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number2547()
      val right = Number2548()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1272()
    val b = Number1271()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1274 : StressfulInteger {

  companion object {
    private var VALUE = 1274
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number637()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number2549()
      val right = Number2550()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1273()
    val b = Number1272()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1275 : StressfulInteger {

  companion object {
    private var VALUE = 1275
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number637()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number2551()
      val right = Number2552()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1274()
    val b = Number1273()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1276 : StressfulInteger {

  companion object {
    private var VALUE = 1276
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number638()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number2553()
      val right = Number2554()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1275()
    val b = Number1274()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1277 : StressfulInteger {

  companion object {
    private var VALUE = 1277
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number638()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number2555()
      val right = Number2556()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1276()
    val b = Number1275()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1278 : StressfulInteger {

  companion object {
    private var VALUE = 1278
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number639()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number2557()
      val right = Number2558()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1277()
    val b = Number1276()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1279 : StressfulInteger {

  companion object {
    private var VALUE = 1279
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number639()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number2559()
      val right = Number2560()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1278()
    val b = Number1277()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1280 : StressfulInteger {

  companion object {
    private var VALUE = 1280
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number640()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number2561()
      val right = Number2562()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1279()
    val b = Number1278()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1281 : StressfulInteger {

  companion object {
    private var VALUE = 1281
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number640()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number2563()
      val right = Number2564()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1280()
    val b = Number1279()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1282 : StressfulInteger {

  companion object {
    private var VALUE = 1282
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number641()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number2565()
      val right = Number2566()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1281()
    val b = Number1280()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1283 : StressfulInteger {

  companion object {
    private var VALUE = 1283
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number641()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number2567()
      val right = Number2568()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1282()
    val b = Number1281()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1284 : StressfulInteger {

  companion object {
    private var VALUE = 1284
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number642()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number2569()
      val right = Number2570()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1283()
    val b = Number1282()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1285 : StressfulInteger {

  companion object {
    private var VALUE = 1285
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number642()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number2571()
      val right = Number2572()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1284()
    val b = Number1283()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1286 : StressfulInteger {

  companion object {
    private var VALUE = 1286
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number643()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number2573()
      val right = Number2574()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1285()
    val b = Number1284()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1287 : StressfulInteger {

  companion object {
    private var VALUE = 1287
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number643()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number2575()
      val right = Number2576()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1286()
    val b = Number1285()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1288 : StressfulInteger {

  companion object {
    private var VALUE = 1288
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number644()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number2577()
      val right = Number2578()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1287()
    val b = Number1286()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1289 : StressfulInteger {

  companion object {
    private var VALUE = 1289
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number644()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number2579()
      val right = Number2580()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1288()
    val b = Number1287()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1290 : StressfulInteger {

  companion object {
    private var VALUE = 1290
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number645()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number2581()
      val right = Number2582()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1289()
    val b = Number1288()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1291 : StressfulInteger {

  companion object {
    private var VALUE = 1291
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number645()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number2583()
      val right = Number2584()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1290()
    val b = Number1289()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1292 : StressfulInteger {

  companion object {
    private var VALUE = 1292
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number646()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number2585()
      val right = Number2586()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1291()
    val b = Number1290()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1293 : StressfulInteger {

  companion object {
    private var VALUE = 1293
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number646()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number2587()
      val right = Number2588()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1292()
    val b = Number1291()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1294 : StressfulInteger {

  companion object {
    private var VALUE = 1294
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number647()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number2589()
      val right = Number2590()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1293()
    val b = Number1292()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1295 : StressfulInteger {

  companion object {
    private var VALUE = 1295
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number647()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number2591()
      val right = Number2592()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1294()
    val b = Number1293()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1296 : StressfulInteger {

  companion object {
    private var VALUE = 1296
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number648()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number2593()
      val right = Number2594()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1295()
    val b = Number1294()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1297 : StressfulInteger {

  companion object {
    private var VALUE = 1297
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number648()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number2595()
      val right = Number2596()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1296()
    val b = Number1295()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1298 : StressfulInteger {

  companion object {
    private var VALUE = 1298
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number649()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number2597()
      val right = Number2598()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1297()
    val b = Number1296()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1299 : StressfulInteger {

  companion object {
    private var VALUE = 1299
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number649()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number2599()
      val right = Number2600()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1298()
    val b = Number1297()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1300 : StressfulInteger {

  companion object {
    private var VALUE = 1300
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number650()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number2601()
      val right = Number2602()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1299()
    val b = Number1298()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1301 : StressfulInteger {

  companion object {
    private var VALUE = 1301
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number650()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number2603()
      val right = Number2604()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1300()
    val b = Number1299()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1302 : StressfulInteger {

  companion object {
    private var VALUE = 1302
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number651()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number2605()
      val right = Number2606()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1301()
    val b = Number1300()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1303 : StressfulInteger {

  companion object {
    private var VALUE = 1303
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number651()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number2607()
      val right = Number2608()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1302()
    val b = Number1301()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1304 : StressfulInteger {

  companion object {
    private var VALUE = 1304
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number652()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number2609()
      val right = Number2610()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1303()
    val b = Number1302()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1305 : StressfulInteger {

  companion object {
    private var VALUE = 1305
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number652()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number2611()
      val right = Number2612()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1304()
    val b = Number1303()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1306 : StressfulInteger {

  companion object {
    private var VALUE = 1306
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number653()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number2613()
      val right = Number2614()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1305()
    val b = Number1304()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1307 : StressfulInteger {

  companion object {
    private var VALUE = 1307
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number653()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number2615()
      val right = Number2616()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1306()
    val b = Number1305()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1308 : StressfulInteger {

  companion object {
    private var VALUE = 1308
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number654()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number2617()
      val right = Number2618()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1307()
    val b = Number1306()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1309 : StressfulInteger {

  companion object {
    private var VALUE = 1309
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number654()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number2619()
      val right = Number2620()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1308()
    val b = Number1307()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1310 : StressfulInteger {

  companion object {
    private var VALUE = 1310
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number655()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number2621()
      val right = Number2622()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1309()
    val b = Number1308()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1311 : StressfulInteger {

  companion object {
    private var VALUE = 1311
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number655()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number2623()
      val right = Number2624()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1310()
    val b = Number1309()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1312 : StressfulInteger {

  companion object {
    private var VALUE = 1312
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number656()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number2625()
      val right = Number2626()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1311()
    val b = Number1310()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1313 : StressfulInteger {

  companion object {
    private var VALUE = 1313
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number656()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number2627()
      val right = Number2628()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1312()
    val b = Number1311()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1314 : StressfulInteger {

  companion object {
    private var VALUE = 1314
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number657()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number2629()
      val right = Number2630()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1313()
    val b = Number1312()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1315 : StressfulInteger {

  companion object {
    private var VALUE = 1315
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number657()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number2631()
      val right = Number2632()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1314()
    val b = Number1313()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1316 : StressfulInteger {

  companion object {
    private var VALUE = 1316
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number658()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number2633()
      val right = Number2634()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1315()
    val b = Number1314()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1317 : StressfulInteger {

  companion object {
    private var VALUE = 1317
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number658()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number2635()
      val right = Number2636()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1316()
    val b = Number1315()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1318 : StressfulInteger {

  companion object {
    private var VALUE = 1318
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number659()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number2637()
      val right = Number2638()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1317()
    val b = Number1316()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1319 : StressfulInteger {

  companion object {
    private var VALUE = 1319
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number659()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number2639()
      val right = Number2640()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1318()
    val b = Number1317()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1320 : StressfulInteger {

  companion object {
    private var VALUE = 1320
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number660()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number2641()
      val right = Number2642()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1319()
    val b = Number1318()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1321 : StressfulInteger {

  companion object {
    private var VALUE = 1321
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number660()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number2643()
      val right = Number2644()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1320()
    val b = Number1319()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1322 : StressfulInteger {

  companion object {
    private var VALUE = 1322
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number661()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number2645()
      val right = Number2646()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1321()
    val b = Number1320()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1323 : StressfulInteger {

  companion object {
    private var VALUE = 1323
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number661()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number2647()
      val right = Number2648()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1322()
    val b = Number1321()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1324 : StressfulInteger {

  companion object {
    private var VALUE = 1324
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number662()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number2649()
      val right = Number2650()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1323()
    val b = Number1322()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1325 : StressfulInteger {

  companion object {
    private var VALUE = 1325
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number662()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number2651()
      val right = Number2652()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1324()
    val b = Number1323()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1326 : StressfulInteger {

  companion object {
    private var VALUE = 1326
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number663()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number2653()
      val right = Number2654()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1325()
    val b = Number1324()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1327 : StressfulInteger {

  companion object {
    private var VALUE = 1327
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number663()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number2655()
      val right = Number2656()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1326()
    val b = Number1325()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1328 : StressfulInteger {

  companion object {
    private var VALUE = 1328
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number664()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number2657()
      val right = Number2658()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1327()
    val b = Number1326()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1329 : StressfulInteger {

  companion object {
    private var VALUE = 1329
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number664()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number2659()
      val right = Number2660()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1328()
    val b = Number1327()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1330 : StressfulInteger {

  companion object {
    private var VALUE = 1330
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number665()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number2661()
      val right = Number2662()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1329()
    val b = Number1328()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1331 : StressfulInteger {

  companion object {
    private var VALUE = 1331
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number665()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number2663()
      val right = Number2664()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1330()
    val b = Number1329()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1332 : StressfulInteger {

  companion object {
    private var VALUE = 1332
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number666()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number2665()
      val right = Number2666()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1331()
    val b = Number1330()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1333 : StressfulInteger {

  companion object {
    private var VALUE = 1333
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number666()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number2667()
      val right = Number2668()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1332()
    val b = Number1331()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1334 : StressfulInteger {

  companion object {
    private var VALUE = 1334
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number667()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number2669()
      val right = Number2670()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1333()
    val b = Number1332()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1335 : StressfulInteger {

  companion object {
    private var VALUE = 1335
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number667()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number2671()
      val right = Number2672()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1334()
    val b = Number1333()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1336 : StressfulInteger {

  companion object {
    private var VALUE = 1336
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number668()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number2673()
      val right = Number2674()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1335()
    val b = Number1334()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1337 : StressfulInteger {

  companion object {
    private var VALUE = 1337
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number668()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number2675()
      val right = Number2676()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1336()
    val b = Number1335()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1338 : StressfulInteger {

  companion object {
    private var VALUE = 1338
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number669()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number2677()
      val right = Number2678()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1337()
    val b = Number1336()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1339 : StressfulInteger {

  companion object {
    private var VALUE = 1339
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number669()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number2679()
      val right = Number2680()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1338()
    val b = Number1337()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1340 : StressfulInteger {

  companion object {
    private var VALUE = 1340
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number670()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number2681()
      val right = Number2682()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1339()
    val b = Number1338()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1341 : StressfulInteger {

  companion object {
    private var VALUE = 1341
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number670()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number2683()
      val right = Number2684()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1340()
    val b = Number1339()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1342 : StressfulInteger {

  companion object {
    private var VALUE = 1342
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number671()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number2685()
      val right = Number2686()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1341()
    val b = Number1340()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1343 : StressfulInteger {

  companion object {
    private var VALUE = 1343
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number671()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number2687()
      val right = Number2688()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1342()
    val b = Number1341()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1344 : StressfulInteger {

  companion object {
    private var VALUE = 1344
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number672()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number2689()
      val right = Number2690()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1343()
    val b = Number1342()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1345 : StressfulInteger {

  companion object {
    private var VALUE = 1345
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number672()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number2691()
      val right = Number2692()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1344()
    val b = Number1343()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1346 : StressfulInteger {

  companion object {
    private var VALUE = 1346
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number673()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number2693()
      val right = Number2694()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1345()
    val b = Number1344()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1347 : StressfulInteger {

  companion object {
    private var VALUE = 1347
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number673()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number2695()
      val right = Number2696()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1346()
    val b = Number1345()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1348 : StressfulInteger {

  companion object {
    private var VALUE = 1348
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number674()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number2697()
      val right = Number2698()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1347()
    val b = Number1346()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1349 : StressfulInteger {

  companion object {
    private var VALUE = 1349
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number674()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number2699()
      val right = Number2700()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1348()
    val b = Number1347()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1350 : StressfulInteger {

  companion object {
    private var VALUE = 1350
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number675()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number2701()
      val right = Number2702()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1349()
    val b = Number1348()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1351 : StressfulInteger {

  companion object {
    private var VALUE = 1351
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number675()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number2703()
      val right = Number2704()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1350()
    val b = Number1349()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1352 : StressfulInteger {

  companion object {
    private var VALUE = 1352
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number676()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number2705()
      val right = Number2706()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1351()
    val b = Number1350()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1353 : StressfulInteger {

  companion object {
    private var VALUE = 1353
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number676()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number2707()
      val right = Number2708()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1352()
    val b = Number1351()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1354 : StressfulInteger {

  companion object {
    private var VALUE = 1354
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number677()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number2709()
      val right = Number2710()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1353()
    val b = Number1352()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1355 : StressfulInteger {

  companion object {
    private var VALUE = 1355
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number677()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number2711()
      val right = Number2712()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1354()
    val b = Number1353()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1356 : StressfulInteger {

  companion object {
    private var VALUE = 1356
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number678()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number2713()
      val right = Number2714()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1355()
    val b = Number1354()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1357 : StressfulInteger {

  companion object {
    private var VALUE = 1357
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number678()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number2715()
      val right = Number2716()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1356()
    val b = Number1355()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1358 : StressfulInteger {

  companion object {
    private var VALUE = 1358
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number679()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number2717()
      val right = Number2718()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1357()
    val b = Number1356()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1359 : StressfulInteger {

  companion object {
    private var VALUE = 1359
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number679()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number2719()
      val right = Number2720()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1358()
    val b = Number1357()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1360 : StressfulInteger {

  companion object {
    private var VALUE = 1360
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number680()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number2721()
      val right = Number2722()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1359()
    val b = Number1358()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1361 : StressfulInteger {

  companion object {
    private var VALUE = 1361
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number680()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number2723()
      val right = Number2724()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1360()
    val b = Number1359()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1362 : StressfulInteger {

  companion object {
    private var VALUE = 1362
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number681()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number2725()
      val right = Number2726()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1361()
    val b = Number1360()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1363 : StressfulInteger {

  companion object {
    private var VALUE = 1363
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number681()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number2727()
      val right = Number2728()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1362()
    val b = Number1361()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1364 : StressfulInteger {

  companion object {
    private var VALUE = 1364
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number682()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number2729()
      val right = Number2730()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1363()
    val b = Number1362()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1365 : StressfulInteger {

  companion object {
    private var VALUE = 1365
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number682()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number2731()
      val right = Number2732()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1364()
    val b = Number1363()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1366 : StressfulInteger {

  companion object {
    private var VALUE = 1366
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number683()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number2733()
      val right = Number2734()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1365()
    val b = Number1364()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1367 : StressfulInteger {

  companion object {
    private var VALUE = 1367
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number683()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number2735()
      val right = Number2736()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1366()
    val b = Number1365()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1368 : StressfulInteger {

  companion object {
    private var VALUE = 1368
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number684()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number2737()
      val right = Number2738()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1367()
    val b = Number1366()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1369 : StressfulInteger {

  companion object {
    private var VALUE = 1369
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number684()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number2739()
      val right = Number2740()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1368()
    val b = Number1367()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1370 : StressfulInteger {

  companion object {
    private var VALUE = 1370
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number685()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number2741()
      val right = Number2742()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1369()
    val b = Number1368()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1371 : StressfulInteger {

  companion object {
    private var VALUE = 1371
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number685()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number2743()
      val right = Number2744()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1370()
    val b = Number1369()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1372 : StressfulInteger {

  companion object {
    private var VALUE = 1372
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number686()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number2745()
      val right = Number2746()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1371()
    val b = Number1370()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1373 : StressfulInteger {

  companion object {
    private var VALUE = 1373
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number686()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number2747()
      val right = Number2748()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1372()
    val b = Number1371()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1374 : StressfulInteger {

  companion object {
    private var VALUE = 1374
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number687()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number2749()
      val right = Number2750()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1373()
    val b = Number1372()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1375 : StressfulInteger {

  companion object {
    private var VALUE = 1375
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number687()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number2751()
      val right = Number2752()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1374()
    val b = Number1373()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1376 : StressfulInteger {

  companion object {
    private var VALUE = 1376
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number688()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number2753()
      val right = Number2754()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1375()
    val b = Number1374()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1377 : StressfulInteger {

  companion object {
    private var VALUE = 1377
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number688()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number2755()
      val right = Number2756()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1376()
    val b = Number1375()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1378 : StressfulInteger {

  companion object {
    private var VALUE = 1378
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number689()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number2757()
      val right = Number2758()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1377()
    val b = Number1376()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1379 : StressfulInteger {

  companion object {
    private var VALUE = 1379
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number689()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number2759()
      val right = Number2760()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1378()
    val b = Number1377()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1380 : StressfulInteger {

  companion object {
    private var VALUE = 1380
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number690()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number2761()
      val right = Number2762()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1379()
    val b = Number1378()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1381 : StressfulInteger {

  companion object {
    private var VALUE = 1381
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number690()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number2763()
      val right = Number2764()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1380()
    val b = Number1379()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1382 : StressfulInteger {

  companion object {
    private var VALUE = 1382
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number691()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number2765()
      val right = Number2766()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1381()
    val b = Number1380()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1383 : StressfulInteger {

  companion object {
    private var VALUE = 1383
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number691()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number2767()
      val right = Number2768()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1382()
    val b = Number1381()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1384 : StressfulInteger {

  companion object {
    private var VALUE = 1384
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number692()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number2769()
      val right = Number2770()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1383()
    val b = Number1382()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1385 : StressfulInteger {

  companion object {
    private var VALUE = 1385
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number692()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number2771()
      val right = Number2772()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1384()
    val b = Number1383()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1386 : StressfulInteger {

  companion object {
    private var VALUE = 1386
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number693()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number2773()
      val right = Number2774()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1385()
    val b = Number1384()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1387 : StressfulInteger {

  companion object {
    private var VALUE = 1387
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number693()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number2775()
      val right = Number2776()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1386()
    val b = Number1385()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1388 : StressfulInteger {

  companion object {
    private var VALUE = 1388
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number694()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number2777()
      val right = Number2778()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1387()
    val b = Number1386()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1389 : StressfulInteger {

  companion object {
    private var VALUE = 1389
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number694()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number2779()
      val right = Number2780()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1388()
    val b = Number1387()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1390 : StressfulInteger {

  companion object {
    private var VALUE = 1390
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number695()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number2781()
      val right = Number2782()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1389()
    val b = Number1388()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1391 : StressfulInteger {

  companion object {
    private var VALUE = 1391
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number695()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number2783()
      val right = Number2784()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1390()
    val b = Number1389()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1392 : StressfulInteger {

  companion object {
    private var VALUE = 1392
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number696()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number2785()
      val right = Number2786()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1391()
    val b = Number1390()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1393 : StressfulInteger {

  companion object {
    private var VALUE = 1393
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number696()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number2787()
      val right = Number2788()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1392()
    val b = Number1391()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1394 : StressfulInteger {

  companion object {
    private var VALUE = 1394
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number697()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number2789()
      val right = Number2790()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1393()
    val b = Number1392()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1395 : StressfulInteger {

  companion object {
    private var VALUE = 1395
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number697()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number2791()
      val right = Number2792()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1394()
    val b = Number1393()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1396 : StressfulInteger {

  companion object {
    private var VALUE = 1396
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number698()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number2793()
      val right = Number2794()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1395()
    val b = Number1394()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1397 : StressfulInteger {

  companion object {
    private var VALUE = 1397
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number698()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number2795()
      val right = Number2796()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1396()
    val b = Number1395()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1398 : StressfulInteger {

  companion object {
    private var VALUE = 1398
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number699()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number2797()
      val right = Number2798()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1397()
    val b = Number1396()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1399 : StressfulInteger {

  companion object {
    private var VALUE = 1399
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number699()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number2799()
      val right = Number2800()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1398()
    val b = Number1397()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1400 : StressfulInteger {

  companion object {
    private var VALUE = 1400
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number700()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number2801()
      val right = Number2802()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1399()
    val b = Number1398()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1401 : StressfulInteger {

  companion object {
    private var VALUE = 1401
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number700()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number2803()
      val right = Number2804()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1400()
    val b = Number1399()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1402 : StressfulInteger {

  companion object {
    private var VALUE = 1402
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number701()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number2805()
      val right = Number2806()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1401()
    val b = Number1400()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1403 : StressfulInteger {

  companion object {
    private var VALUE = 1403
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number701()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number2807()
      val right = Number2808()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1402()
    val b = Number1401()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1404 : StressfulInteger {

  companion object {
    private var VALUE = 1404
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number702()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number2809()
      val right = Number2810()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1403()
    val b = Number1402()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1405 : StressfulInteger {

  companion object {
    private var VALUE = 1405
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number702()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number2811()
      val right = Number2812()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1404()
    val b = Number1403()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1406 : StressfulInteger {

  companion object {
    private var VALUE = 1406
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number703()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number2813()
      val right = Number2814()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1405()
    val b = Number1404()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1407 : StressfulInteger {

  companion object {
    private var VALUE = 1407
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number703()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number2815()
      val right = Number2816()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1406()
    val b = Number1405()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1408 : StressfulInteger {

  companion object {
    private var VALUE = 1408
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number704()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number2817()
      val right = Number2818()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1407()
    val b = Number1406()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1409 : StressfulInteger {

  companion object {
    private var VALUE = 1409
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number704()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number2819()
      val right = Number2820()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1408()
    val b = Number1407()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1410 : StressfulInteger {

  companion object {
    private var VALUE = 1410
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number705()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number2821()
      val right = Number2822()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1409()
    val b = Number1408()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1411 : StressfulInteger {

  companion object {
    private var VALUE = 1411
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number705()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number2823()
      val right = Number2824()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1410()
    val b = Number1409()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1412 : StressfulInteger {

  companion object {
    private var VALUE = 1412
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number706()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number2825()
      val right = Number2826()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1411()
    val b = Number1410()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1413 : StressfulInteger {

  companion object {
    private var VALUE = 1413
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number706()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number2827()
      val right = Number2828()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1412()
    val b = Number1411()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1414 : StressfulInteger {

  companion object {
    private var VALUE = 1414
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number707()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number2829()
      val right = Number2830()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1413()
    val b = Number1412()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1415 : StressfulInteger {

  companion object {
    private var VALUE = 1415
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number707()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number2831()
      val right = Number2832()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1414()
    val b = Number1413()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1416 : StressfulInteger {

  companion object {
    private var VALUE = 1416
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number708()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number2833()
      val right = Number2834()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1415()
    val b = Number1414()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1417 : StressfulInteger {

  companion object {
    private var VALUE = 1417
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number708()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number2835()
      val right = Number2836()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1416()
    val b = Number1415()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1418 : StressfulInteger {

  companion object {
    private var VALUE = 1418
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number709()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number2837()
      val right = Number2838()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1417()
    val b = Number1416()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1419 : StressfulInteger {

  companion object {
    private var VALUE = 1419
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number709()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number2839()
      val right = Number2840()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1418()
    val b = Number1417()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1420 : StressfulInteger {

  companion object {
    private var VALUE = 1420
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number710()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number2841()
      val right = Number2842()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1419()
    val b = Number1418()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1421 : StressfulInteger {

  companion object {
    private var VALUE = 1421
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number710()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number2843()
      val right = Number2844()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1420()
    val b = Number1419()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1422 : StressfulInteger {

  companion object {
    private var VALUE = 1422
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number711()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number2845()
      val right = Number2846()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1421()
    val b = Number1420()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1423 : StressfulInteger {

  companion object {
    private var VALUE = 1423
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number711()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number2847()
      val right = Number2848()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1422()
    val b = Number1421()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1424 : StressfulInteger {

  companion object {
    private var VALUE = 1424
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number712()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number2849()
      val right = Number2850()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1423()
    val b = Number1422()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1425 : StressfulInteger {

  companion object {
    private var VALUE = 1425
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number712()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number2851()
      val right = Number2852()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1424()
    val b = Number1423()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1426 : StressfulInteger {

  companion object {
    private var VALUE = 1426
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number713()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number2853()
      val right = Number2854()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1425()
    val b = Number1424()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1427 : StressfulInteger {

  companion object {
    private var VALUE = 1427
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number713()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number2855()
      val right = Number2856()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1426()
    val b = Number1425()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1428 : StressfulInteger {

  companion object {
    private var VALUE = 1428
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number714()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number2857()
      val right = Number2858()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1427()
    val b = Number1426()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1429 : StressfulInteger {

  companion object {
    private var VALUE = 1429
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number714()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number2859()
      val right = Number2860()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1428()
    val b = Number1427()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1430 : StressfulInteger {

  companion object {
    private var VALUE = 1430
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number715()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number2861()
      val right = Number2862()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1429()
    val b = Number1428()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1431 : StressfulInteger {

  companion object {
    private var VALUE = 1431
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number715()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number2863()
      val right = Number2864()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1430()
    val b = Number1429()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1432 : StressfulInteger {

  companion object {
    private var VALUE = 1432
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number716()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number2865()
      val right = Number2866()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1431()
    val b = Number1430()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1433 : StressfulInteger {

  companion object {
    private var VALUE = 1433
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number716()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number2867()
      val right = Number2868()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1432()
    val b = Number1431()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1434 : StressfulInteger {

  companion object {
    private var VALUE = 1434
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number717()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number2869()
      val right = Number2870()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1433()
    val b = Number1432()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1435 : StressfulInteger {

  companion object {
    private var VALUE = 1435
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number717()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number2871()
      val right = Number2872()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1434()
    val b = Number1433()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1436 : StressfulInteger {

  companion object {
    private var VALUE = 1436
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number718()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number2873()
      val right = Number2874()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1435()
    val b = Number1434()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1437 : StressfulInteger {

  companion object {
    private var VALUE = 1437
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number718()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number2875()
      val right = Number2876()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1436()
    val b = Number1435()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1438 : StressfulInteger {

  companion object {
    private var VALUE = 1438
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number719()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number2877()
      val right = Number2878()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1437()
    val b = Number1436()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1439 : StressfulInteger {

  companion object {
    private var VALUE = 1439
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number719()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number2879()
      val right = Number2880()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1438()
    val b = Number1437()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1440 : StressfulInteger {

  companion object {
    private var VALUE = 1440
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number720()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number2881()
      val right = Number2882()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1439()
    val b = Number1438()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1441 : StressfulInteger {

  companion object {
    private var VALUE = 1441
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number720()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number2883()
      val right = Number2884()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1440()
    val b = Number1439()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1442 : StressfulInteger {

  companion object {
    private var VALUE = 1442
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number721()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number2885()
      val right = Number2886()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1441()
    val b = Number1440()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1443 : StressfulInteger {

  companion object {
    private var VALUE = 1443
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number721()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number2887()
      val right = Number2888()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1442()
    val b = Number1441()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1444 : StressfulInteger {

  companion object {
    private var VALUE = 1444
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number722()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number2889()
      val right = Number2890()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1443()
    val b = Number1442()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1445 : StressfulInteger {

  companion object {
    private var VALUE = 1445
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number722()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number2891()
      val right = Number2892()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1444()
    val b = Number1443()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1446 : StressfulInteger {

  companion object {
    private var VALUE = 1446
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number723()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number2893()
      val right = Number2894()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1445()
    val b = Number1444()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1447 : StressfulInteger {

  companion object {
    private var VALUE = 1447
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number723()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number2895()
      val right = Number2896()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1446()
    val b = Number1445()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1448 : StressfulInteger {

  companion object {
    private var VALUE = 1448
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number724()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number2897()
      val right = Number2898()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1447()
    val b = Number1446()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1449 : StressfulInteger {

  companion object {
    private var VALUE = 1449
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number724()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number2899()
      val right = Number2900()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1448()
    val b = Number1447()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1450 : StressfulInteger {

  companion object {
    private var VALUE = 1450
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number725()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number2901()
      val right = Number2902()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1449()
    val b = Number1448()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1451 : StressfulInteger {

  companion object {
    private var VALUE = 1451
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number725()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number2903()
      val right = Number2904()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1450()
    val b = Number1449()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1452 : StressfulInteger {

  companion object {
    private var VALUE = 1452
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number726()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number2905()
      val right = Number2906()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1451()
    val b = Number1450()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1453 : StressfulInteger {

  companion object {
    private var VALUE = 1453
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number726()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number2907()
      val right = Number2908()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1452()
    val b = Number1451()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1454 : StressfulInteger {

  companion object {
    private var VALUE = 1454
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number727()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number2909()
      val right = Number2910()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1453()
    val b = Number1452()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1455 : StressfulInteger {

  companion object {
    private var VALUE = 1455
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number727()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number2911()
      val right = Number2912()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1454()
    val b = Number1453()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1456 : StressfulInteger {

  companion object {
    private var VALUE = 1456
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number728()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number2913()
      val right = Number2914()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1455()
    val b = Number1454()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1457 : StressfulInteger {

  companion object {
    private var VALUE = 1457
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number728()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number2915()
      val right = Number2916()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1456()
    val b = Number1455()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1458 : StressfulInteger {

  companion object {
    private var VALUE = 1458
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number729()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number2917()
      val right = Number2918()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1457()
    val b = Number1456()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1459 : StressfulInteger {

  companion object {
    private var VALUE = 1459
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number729()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number2919()
      val right = Number2920()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1458()
    val b = Number1457()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1460 : StressfulInteger {

  companion object {
    private var VALUE = 1460
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number730()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number2921()
      val right = Number2922()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1459()
    val b = Number1458()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1461 : StressfulInteger {

  companion object {
    private var VALUE = 1461
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number730()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number2923()
      val right = Number2924()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1460()
    val b = Number1459()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1462 : StressfulInteger {

  companion object {
    private var VALUE = 1462
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number731()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number2925()
      val right = Number2926()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1461()
    val b = Number1460()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1463 : StressfulInteger {

  companion object {
    private var VALUE = 1463
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number731()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number2927()
      val right = Number2928()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1462()
    val b = Number1461()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1464 : StressfulInteger {

  companion object {
    private var VALUE = 1464
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number732()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number2929()
      val right = Number2930()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1463()
    val b = Number1462()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1465 : StressfulInteger {

  companion object {
    private var VALUE = 1465
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number732()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number2931()
      val right = Number2932()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1464()
    val b = Number1463()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1466 : StressfulInteger {

  companion object {
    private var VALUE = 1466
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number733()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number2933()
      val right = Number2934()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1465()
    val b = Number1464()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1467 : StressfulInteger {

  companion object {
    private var VALUE = 1467
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number733()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number2935()
      val right = Number2936()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1466()
    val b = Number1465()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1468 : StressfulInteger {

  companion object {
    private var VALUE = 1468
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number734()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number2937()
      val right = Number2938()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1467()
    val b = Number1466()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1469 : StressfulInteger {

  companion object {
    private var VALUE = 1469
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number734()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number2939()
      val right = Number2940()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1468()
    val b = Number1467()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1470 : StressfulInteger {

  companion object {
    private var VALUE = 1470
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number735()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number2941()
      val right = Number2942()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1469()
    val b = Number1468()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1471 : StressfulInteger {

  companion object {
    private var VALUE = 1471
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number735()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number2943()
      val right = Number2944()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1470()
    val b = Number1469()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1472 : StressfulInteger {

  companion object {
    private var VALUE = 1472
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number736()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number2945()
      val right = Number2946()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1471()
    val b = Number1470()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1473 : StressfulInteger {

  companion object {
    private var VALUE = 1473
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number736()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number2947()
      val right = Number2948()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1472()
    val b = Number1471()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1474 : StressfulInteger {

  companion object {
    private var VALUE = 1474
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number737()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number2949()
      val right = Number2950()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1473()
    val b = Number1472()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1475 : StressfulInteger {

  companion object {
    private var VALUE = 1475
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number737()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number2951()
      val right = Number2952()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1474()
    val b = Number1473()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1476 : StressfulInteger {

  companion object {
    private var VALUE = 1476
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number738()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number2953()
      val right = Number2954()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1475()
    val b = Number1474()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1477 : StressfulInteger {

  companion object {
    private var VALUE = 1477
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number738()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number2955()
      val right = Number2956()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1476()
    val b = Number1475()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1478 : StressfulInteger {

  companion object {
    private var VALUE = 1478
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number739()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number2957()
      val right = Number2958()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1477()
    val b = Number1476()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1479 : StressfulInteger {

  companion object {
    private var VALUE = 1479
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number739()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number2959()
      val right = Number2960()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1478()
    val b = Number1477()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1480 : StressfulInteger {

  companion object {
    private var VALUE = 1480
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number740()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number2961()
      val right = Number2962()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1479()
    val b = Number1478()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1481 : StressfulInteger {

  companion object {
    private var VALUE = 1481
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number740()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number2963()
      val right = Number2964()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1480()
    val b = Number1479()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1482 : StressfulInteger {

  companion object {
    private var VALUE = 1482
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number741()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number2965()
      val right = Number2966()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1481()
    val b = Number1480()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1483 : StressfulInteger {

  companion object {
    private var VALUE = 1483
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number741()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number2967()
      val right = Number2968()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1482()
    val b = Number1481()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1484 : StressfulInteger {

  companion object {
    private var VALUE = 1484
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number742()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number2969()
      val right = Number2970()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1483()
    val b = Number1482()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1485 : StressfulInteger {

  companion object {
    private var VALUE = 1485
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number742()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number2971()
      val right = Number2972()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1484()
    val b = Number1483()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1486 : StressfulInteger {

  companion object {
    private var VALUE = 1486
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number743()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number2973()
      val right = Number2974()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1485()
    val b = Number1484()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1487 : StressfulInteger {

  companion object {
    private var VALUE = 1487
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number743()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number2975()
      val right = Number2976()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1486()
    val b = Number1485()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1488 : StressfulInteger {

  companion object {
    private var VALUE = 1488
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number744()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number2977()
      val right = Number2978()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1487()
    val b = Number1486()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1489 : StressfulInteger {

  companion object {
    private var VALUE = 1489
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number744()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number2979()
      val right = Number2980()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1488()
    val b = Number1487()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1490 : StressfulInteger {

  companion object {
    private var VALUE = 1490
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number745()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number2981()
      val right = Number2982()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1489()
    val b = Number1488()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1491 : StressfulInteger {

  companion object {
    private var VALUE = 1491
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number745()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number2983()
      val right = Number2984()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1490()
    val b = Number1489()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1492 : StressfulInteger {

  companion object {
    private var VALUE = 1492
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number746()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number2985()
      val right = Number2986()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1491()
    val b = Number1490()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1493 : StressfulInteger {

  companion object {
    private var VALUE = 1493
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number746()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number2987()
      val right = Number2988()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1492()
    val b = Number1491()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1494 : StressfulInteger {

  companion object {
    private var VALUE = 1494
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number747()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number2989()
      val right = Number2990()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1493()
    val b = Number1492()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1495 : StressfulInteger {

  companion object {
    private var VALUE = 1495
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number747()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number2991()
      val right = Number2992()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1494()
    val b = Number1493()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1496 : StressfulInteger {

  companion object {
    private var VALUE = 1496
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number748()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number2993()
      val right = Number2994()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1495()
    val b = Number1494()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1497 : StressfulInteger {

  companion object {
    private var VALUE = 1497
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number748()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number2995()
      val right = Number2996()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1496()
    val b = Number1495()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1498 : StressfulInteger {

  companion object {
    private var VALUE = 1498
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number749()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number2997()
      val right = Number2998()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1497()
    val b = Number1496()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1499 : StressfulInteger {

  companion object {
    private var VALUE = 1499
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number749()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number2999()
      val right = Number3000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1498()
    val b = Number1497()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1500 : StressfulInteger {

  companion object {
    private var VALUE = 1500
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number750()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number3001()
      val right = Number3002()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1499()
    val b = Number1498()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1501 : StressfulInteger {

  companion object {
    private var VALUE = 1501
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number750()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number3003()
      val right = Number3004()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1500()
    val b = Number1499()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1502 : StressfulInteger {

  companion object {
    private var VALUE = 1502
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number751()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number3005()
      val right = Number3006()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1501()
    val b = Number1500()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1503 : StressfulInteger {

  companion object {
    private var VALUE = 1503
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number751()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number3007()
      val right = Number3008()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1502()
    val b = Number1501()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1504 : StressfulInteger {

  companion object {
    private var VALUE = 1504
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number752()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number3009()
      val right = Number3010()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1503()
    val b = Number1502()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1505 : StressfulInteger {

  companion object {
    private var VALUE = 1505
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number752()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number3011()
      val right = Number3012()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1504()
    val b = Number1503()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1506 : StressfulInteger {

  companion object {
    private var VALUE = 1506
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number753()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number3013()
      val right = Number3014()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1505()
    val b = Number1504()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1507 : StressfulInteger {

  companion object {
    private var VALUE = 1507
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number753()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number3015()
      val right = Number3016()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1506()
    val b = Number1505()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1508 : StressfulInteger {

  companion object {
    private var VALUE = 1508
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number754()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number3017()
      val right = Number3018()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1507()
    val b = Number1506()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1509 : StressfulInteger {

  companion object {
    private var VALUE = 1509
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number754()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number3019()
      val right = Number3020()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1508()
    val b = Number1507()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1510 : StressfulInteger {

  companion object {
    private var VALUE = 1510
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number755()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number3021()
      val right = Number3022()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1509()
    val b = Number1508()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1511 : StressfulInteger {

  companion object {
    private var VALUE = 1511
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number755()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number3023()
      val right = Number3024()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1510()
    val b = Number1509()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1512 : StressfulInteger {

  companion object {
    private var VALUE = 1512
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number756()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number3025()
      val right = Number3026()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1511()
    val b = Number1510()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1513 : StressfulInteger {

  companion object {
    private var VALUE = 1513
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number756()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number3027()
      val right = Number3028()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1512()
    val b = Number1511()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1514 : StressfulInteger {

  companion object {
    private var VALUE = 1514
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number757()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number3029()
      val right = Number3030()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1513()
    val b = Number1512()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1515 : StressfulInteger {

  companion object {
    private var VALUE = 1515
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number757()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number3031()
      val right = Number3032()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1514()
    val b = Number1513()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1516 : StressfulInteger {

  companion object {
    private var VALUE = 1516
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number758()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number3033()
      val right = Number3034()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1515()
    val b = Number1514()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1517 : StressfulInteger {

  companion object {
    private var VALUE = 1517
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number758()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number3035()
      val right = Number3036()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1516()
    val b = Number1515()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1518 : StressfulInteger {

  companion object {
    private var VALUE = 1518
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number759()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number3037()
      val right = Number3038()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1517()
    val b = Number1516()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1519 : StressfulInteger {

  companion object {
    private var VALUE = 1519
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number759()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number3039()
      val right = Number3040()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1518()
    val b = Number1517()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1520 : StressfulInteger {

  companion object {
    private var VALUE = 1520
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number760()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number3041()
      val right = Number3042()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1519()
    val b = Number1518()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1521 : StressfulInteger {

  companion object {
    private var VALUE = 1521
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number760()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number3043()
      val right = Number3044()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1520()
    val b = Number1519()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1522 : StressfulInteger {

  companion object {
    private var VALUE = 1522
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number761()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number3045()
      val right = Number3046()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1521()
    val b = Number1520()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1523 : StressfulInteger {

  companion object {
    private var VALUE = 1523
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number761()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number3047()
      val right = Number3048()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1522()
    val b = Number1521()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1524 : StressfulInteger {

  companion object {
    private var VALUE = 1524
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number762()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number3049()
      val right = Number3050()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1523()
    val b = Number1522()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1525 : StressfulInteger {

  companion object {
    private var VALUE = 1525
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number762()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number3051()
      val right = Number3052()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1524()
    val b = Number1523()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1526 : StressfulInteger {

  companion object {
    private var VALUE = 1526
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number763()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number3053()
      val right = Number3054()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1525()
    val b = Number1524()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1527 : StressfulInteger {

  companion object {
    private var VALUE = 1527
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number763()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number3055()
      val right = Number3056()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1526()
    val b = Number1525()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1528 : StressfulInteger {

  companion object {
    private var VALUE = 1528
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number764()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number3057()
      val right = Number3058()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1527()
    val b = Number1526()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1529 : StressfulInteger {

  companion object {
    private var VALUE = 1529
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number764()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number3059()
      val right = Number3060()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1528()
    val b = Number1527()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1530 : StressfulInteger {

  companion object {
    private var VALUE = 1530
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number765()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number3061()
      val right = Number3062()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1529()
    val b = Number1528()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1531 : StressfulInteger {

  companion object {
    private var VALUE = 1531
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number765()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number3063()
      val right = Number3064()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1530()
    val b = Number1529()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1532 : StressfulInteger {

  companion object {
    private var VALUE = 1532
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number766()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number3065()
      val right = Number3066()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1531()
    val b = Number1530()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1533 : StressfulInteger {

  companion object {
    private var VALUE = 1533
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number766()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number3067()
      val right = Number3068()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1532()
    val b = Number1531()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1534 : StressfulInteger {

  companion object {
    private var VALUE = 1534
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number767()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number3069()
      val right = Number3070()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1533()
    val b = Number1532()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1535 : StressfulInteger {

  companion object {
    private var VALUE = 1535
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number767()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number3071()
      val right = Number3072()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1534()
    val b = Number1533()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1536 : StressfulInteger {

  companion object {
    private var VALUE = 1536
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number768()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number3073()
      val right = Number3074()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1535()
    val b = Number1534()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1537 : StressfulInteger {

  companion object {
    private var VALUE = 1537
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number768()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number3075()
      val right = Number3076()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1536()
    val b = Number1535()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1538 : StressfulInteger {

  companion object {
    private var VALUE = 1538
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number769()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number3077()
      val right = Number3078()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1537()
    val b = Number1536()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1539 : StressfulInteger {

  companion object {
    private var VALUE = 1539
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number769()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number3079()
      val right = Number3080()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1538()
    val b = Number1537()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1540 : StressfulInteger {

  companion object {
    private var VALUE = 1540
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number770()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number3081()
      val right = Number3082()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1539()
    val b = Number1538()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1541 : StressfulInteger {

  companion object {
    private var VALUE = 1541
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number770()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number3083()
      val right = Number3084()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1540()
    val b = Number1539()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1542 : StressfulInteger {

  companion object {
    private var VALUE = 1542
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number771()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number3085()
      val right = Number3086()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1541()
    val b = Number1540()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1543 : StressfulInteger {

  companion object {
    private var VALUE = 1543
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number771()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number3087()
      val right = Number3088()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1542()
    val b = Number1541()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1544 : StressfulInteger {

  companion object {
    private var VALUE = 1544
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number772()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number3089()
      val right = Number3090()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1543()
    val b = Number1542()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1545 : StressfulInteger {

  companion object {
    private var VALUE = 1545
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number772()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number3091()
      val right = Number3092()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1544()
    val b = Number1543()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1546 : StressfulInteger {

  companion object {
    private var VALUE = 1546
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number773()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number3093()
      val right = Number3094()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1545()
    val b = Number1544()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1547 : StressfulInteger {

  companion object {
    private var VALUE = 1547
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number773()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number3095()
      val right = Number3096()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1546()
    val b = Number1545()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1548 : StressfulInteger {

  companion object {
    private var VALUE = 1548
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number774()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number3097()
      val right = Number3098()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1547()
    val b = Number1546()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1549 : StressfulInteger {

  companion object {
    private var VALUE = 1549
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number774()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number3099()
      val right = Number3100()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1548()
    val b = Number1547()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1550 : StressfulInteger {

  companion object {
    private var VALUE = 1550
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number775()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number3101()
      val right = Number3102()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1549()
    val b = Number1548()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1551 : StressfulInteger {

  companion object {
    private var VALUE = 1551
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number775()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number3103()
      val right = Number3104()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1550()
    val b = Number1549()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1552 : StressfulInteger {

  companion object {
    private var VALUE = 1552
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number776()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number3105()
      val right = Number3106()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1551()
    val b = Number1550()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1553 : StressfulInteger {

  companion object {
    private var VALUE = 1553
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number776()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number3107()
      val right = Number3108()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1552()
    val b = Number1551()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1554 : StressfulInteger {

  companion object {
    private var VALUE = 1554
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number777()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number3109()
      val right = Number3110()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1553()
    val b = Number1552()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1555 : StressfulInteger {

  companion object {
    private var VALUE = 1555
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number777()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number3111()
      val right = Number3112()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1554()
    val b = Number1553()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1556 : StressfulInteger {

  companion object {
    private var VALUE = 1556
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number778()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number3113()
      val right = Number3114()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1555()
    val b = Number1554()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1557 : StressfulInteger {

  companion object {
    private var VALUE = 1557
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number778()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number3115()
      val right = Number3116()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1556()
    val b = Number1555()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1558 : StressfulInteger {

  companion object {
    private var VALUE = 1558
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number779()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number3117()
      val right = Number3118()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1557()
    val b = Number1556()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1559 : StressfulInteger {

  companion object {
    private var VALUE = 1559
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number779()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number3119()
      val right = Number3120()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1558()
    val b = Number1557()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1560 : StressfulInteger {

  companion object {
    private var VALUE = 1560
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number780()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number3121()
      val right = Number3122()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1559()
    val b = Number1558()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1561 : StressfulInteger {

  companion object {
    private var VALUE = 1561
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number780()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number3123()
      val right = Number3124()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1560()
    val b = Number1559()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1562 : StressfulInteger {

  companion object {
    private var VALUE = 1562
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number781()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number3125()
      val right = Number3126()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1561()
    val b = Number1560()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1563 : StressfulInteger {

  companion object {
    private var VALUE = 1563
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number781()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number3127()
      val right = Number3128()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1562()
    val b = Number1561()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1564 : StressfulInteger {

  companion object {
    private var VALUE = 1564
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number782()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number3129()
      val right = Number3130()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1563()
    val b = Number1562()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1565 : StressfulInteger {

  companion object {
    private var VALUE = 1565
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number782()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number3131()
      val right = Number3132()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1564()
    val b = Number1563()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1566 : StressfulInteger {

  companion object {
    private var VALUE = 1566
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number783()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number3133()
      val right = Number3134()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1565()
    val b = Number1564()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1567 : StressfulInteger {

  companion object {
    private var VALUE = 1567
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number783()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number3135()
      val right = Number3136()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1566()
    val b = Number1565()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1568 : StressfulInteger {

  companion object {
    private var VALUE = 1568
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number784()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number3137()
      val right = Number3138()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1567()
    val b = Number1566()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1569 : StressfulInteger {

  companion object {
    private var VALUE = 1569
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number784()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number3139()
      val right = Number3140()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1568()
    val b = Number1567()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1570 : StressfulInteger {

  companion object {
    private var VALUE = 1570
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number785()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number3141()
      val right = Number3142()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1569()
    val b = Number1568()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1571 : StressfulInteger {

  companion object {
    private var VALUE = 1571
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number785()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number3143()
      val right = Number3144()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1570()
    val b = Number1569()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1572 : StressfulInteger {

  companion object {
    private var VALUE = 1572
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number786()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number3145()
      val right = Number3146()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1571()
    val b = Number1570()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1573 : StressfulInteger {

  companion object {
    private var VALUE = 1573
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number786()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number3147()
      val right = Number3148()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1572()
    val b = Number1571()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1574 : StressfulInteger {

  companion object {
    private var VALUE = 1574
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number787()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number3149()
      val right = Number3150()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1573()
    val b = Number1572()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1575 : StressfulInteger {

  companion object {
    private var VALUE = 1575
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number787()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number3151()
      val right = Number3152()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1574()
    val b = Number1573()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1576 : StressfulInteger {

  companion object {
    private var VALUE = 1576
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number788()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number3153()
      val right = Number3154()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1575()
    val b = Number1574()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1577 : StressfulInteger {

  companion object {
    private var VALUE = 1577
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number788()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number3155()
      val right = Number3156()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1576()
    val b = Number1575()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1578 : StressfulInteger {

  companion object {
    private var VALUE = 1578
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number789()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number3157()
      val right = Number3158()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1577()
    val b = Number1576()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1579 : StressfulInteger {

  companion object {
    private var VALUE = 1579
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number789()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number3159()
      val right = Number3160()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1578()
    val b = Number1577()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1580 : StressfulInteger {

  companion object {
    private var VALUE = 1580
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number790()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number3161()
      val right = Number3162()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1579()
    val b = Number1578()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1581 : StressfulInteger {

  companion object {
    private var VALUE = 1581
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number790()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number3163()
      val right = Number3164()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1580()
    val b = Number1579()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1582 : StressfulInteger {

  companion object {
    private var VALUE = 1582
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number791()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number3165()
      val right = Number3166()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1581()
    val b = Number1580()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1583 : StressfulInteger {

  companion object {
    private var VALUE = 1583
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number791()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number3167()
      val right = Number3168()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1582()
    val b = Number1581()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1584 : StressfulInteger {

  companion object {
    private var VALUE = 1584
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number792()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number3169()
      val right = Number3170()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1583()
    val b = Number1582()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1585 : StressfulInteger {

  companion object {
    private var VALUE = 1585
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number792()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number3171()
      val right = Number3172()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1584()
    val b = Number1583()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1586 : StressfulInteger {

  companion object {
    private var VALUE = 1586
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number793()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number3173()
      val right = Number3174()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1585()
    val b = Number1584()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1587 : StressfulInteger {

  companion object {
    private var VALUE = 1587
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number793()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number3175()
      val right = Number3176()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1586()
    val b = Number1585()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1588 : StressfulInteger {

  companion object {
    private var VALUE = 1588
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number794()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number3177()
      val right = Number3178()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1587()
    val b = Number1586()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1589 : StressfulInteger {

  companion object {
    private var VALUE = 1589
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number794()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number3179()
      val right = Number3180()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1588()
    val b = Number1587()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1590 : StressfulInteger {

  companion object {
    private var VALUE = 1590
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number795()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number3181()
      val right = Number3182()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1589()
    val b = Number1588()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1591 : StressfulInteger {

  companion object {
    private var VALUE = 1591
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number795()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number3183()
      val right = Number3184()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1590()
    val b = Number1589()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1592 : StressfulInteger {

  companion object {
    private var VALUE = 1592
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number796()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number3185()
      val right = Number3186()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1591()
    val b = Number1590()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1593 : StressfulInteger {

  companion object {
    private var VALUE = 1593
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number796()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number3187()
      val right = Number3188()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1592()
    val b = Number1591()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1594 : StressfulInteger {

  companion object {
    private var VALUE = 1594
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number797()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number3189()
      val right = Number3190()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1593()
    val b = Number1592()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1595 : StressfulInteger {

  companion object {
    private var VALUE = 1595
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number797()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number3191()
      val right = Number3192()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1594()
    val b = Number1593()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1596 : StressfulInteger {

  companion object {
    private var VALUE = 1596
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number798()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number3193()
      val right = Number3194()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1595()
    val b = Number1594()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1597 : StressfulInteger {

  companion object {
    private var VALUE = 1597
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number798()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number3195()
      val right = Number3196()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1596()
    val b = Number1595()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1598 : StressfulInteger {

  companion object {
    private var VALUE = 1598
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number799()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number3197()
      val right = Number3198()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1597()
    val b = Number1596()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1599 : StressfulInteger {

  companion object {
    private var VALUE = 1599
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number799()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number3199()
      val right = Number3200()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1598()
    val b = Number1597()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1600 : StressfulInteger {

  companion object {
    private var VALUE = 1600
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number800()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number3201()
      val right = Number3202()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1599()
    val b = Number1598()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1601 : StressfulInteger {

  companion object {
    private var VALUE = 1601
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number800()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number3203()
      val right = Number3204()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1600()
    val b = Number1599()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1602 : StressfulInteger {

  companion object {
    private var VALUE = 1602
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number801()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number3205()
      val right = Number3206()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1601()
    val b = Number1600()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1603 : StressfulInteger {

  companion object {
    private var VALUE = 1603
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number801()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number3207()
      val right = Number3208()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1602()
    val b = Number1601()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1604 : StressfulInteger {

  companion object {
    private var VALUE = 1604
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number802()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number3209()
      val right = Number3210()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1603()
    val b = Number1602()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1605 : StressfulInteger {

  companion object {
    private var VALUE = 1605
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number802()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number3211()
      val right = Number3212()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1604()
    val b = Number1603()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1606 : StressfulInteger {

  companion object {
    private var VALUE = 1606
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number803()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number3213()
      val right = Number3214()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1605()
    val b = Number1604()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1607 : StressfulInteger {

  companion object {
    private var VALUE = 1607
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number803()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number3215()
      val right = Number3216()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1606()
    val b = Number1605()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1608 : StressfulInteger {

  companion object {
    private var VALUE = 1608
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number804()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number3217()
      val right = Number3218()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1607()
    val b = Number1606()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1609 : StressfulInteger {

  companion object {
    private var VALUE = 1609
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number804()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number3219()
      val right = Number3220()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1608()
    val b = Number1607()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1610 : StressfulInteger {

  companion object {
    private var VALUE = 1610
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number805()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number3221()
      val right = Number3222()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1609()
    val b = Number1608()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1611 : StressfulInteger {

  companion object {
    private var VALUE = 1611
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number805()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number3223()
      val right = Number3224()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1610()
    val b = Number1609()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1612 : StressfulInteger {

  companion object {
    private var VALUE = 1612
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number806()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number3225()
      val right = Number3226()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1611()
    val b = Number1610()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1613 : StressfulInteger {

  companion object {
    private var VALUE = 1613
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number806()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number3227()
      val right = Number3228()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1612()
    val b = Number1611()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1614 : StressfulInteger {

  companion object {
    private var VALUE = 1614
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number807()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number3229()
      val right = Number3230()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1613()
    val b = Number1612()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1615 : StressfulInteger {

  companion object {
    private var VALUE = 1615
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number807()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number3231()
      val right = Number3232()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1614()
    val b = Number1613()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1616 : StressfulInteger {

  companion object {
    private var VALUE = 1616
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number808()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number3233()
      val right = Number3234()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1615()
    val b = Number1614()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1617 : StressfulInteger {

  companion object {
    private var VALUE = 1617
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number808()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number3235()
      val right = Number3236()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1616()
    val b = Number1615()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1618 : StressfulInteger {

  companion object {
    private var VALUE = 1618
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number809()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number3237()
      val right = Number3238()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1617()
    val b = Number1616()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1619 : StressfulInteger {

  companion object {
    private var VALUE = 1619
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number809()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number3239()
      val right = Number3240()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1618()
    val b = Number1617()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1620 : StressfulInteger {

  companion object {
    private var VALUE = 1620
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number810()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number3241()
      val right = Number3242()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1619()
    val b = Number1618()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1621 : StressfulInteger {

  companion object {
    private var VALUE = 1621
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number810()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number3243()
      val right = Number3244()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1620()
    val b = Number1619()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1622 : StressfulInteger {

  companion object {
    private var VALUE = 1622
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number811()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number3245()
      val right = Number3246()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1621()
    val b = Number1620()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1623 : StressfulInteger {

  companion object {
    private var VALUE = 1623
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number811()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number3247()
      val right = Number3248()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1622()
    val b = Number1621()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1624 : StressfulInteger {

  companion object {
    private var VALUE = 1624
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number812()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number3249()
      val right = Number3250()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1623()
    val b = Number1622()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1625 : StressfulInteger {

  companion object {
    private var VALUE = 1625
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number812()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number3251()
      val right = Number3252()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1624()
    val b = Number1623()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1626 : StressfulInteger {

  companion object {
    private var VALUE = 1626
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number813()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number3253()
      val right = Number3254()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1625()
    val b = Number1624()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1627 : StressfulInteger {

  companion object {
    private var VALUE = 1627
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number813()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number3255()
      val right = Number3256()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1626()
    val b = Number1625()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1628 : StressfulInteger {

  companion object {
    private var VALUE = 1628
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number814()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number3257()
      val right = Number3258()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1627()
    val b = Number1626()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1629 : StressfulInteger {

  companion object {
    private var VALUE = 1629
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number814()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number3259()
      val right = Number3260()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1628()
    val b = Number1627()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1630 : StressfulInteger {

  companion object {
    private var VALUE = 1630
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number815()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number3261()
      val right = Number3262()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1629()
    val b = Number1628()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1631 : StressfulInteger {

  companion object {
    private var VALUE = 1631
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number815()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number3263()
      val right = Number3264()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1630()
    val b = Number1629()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1632 : StressfulInteger {

  companion object {
    private var VALUE = 1632
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number816()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number3265()
      val right = Number3266()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1631()
    val b = Number1630()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1633 : StressfulInteger {

  companion object {
    private var VALUE = 1633
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number816()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number3267()
      val right = Number3268()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1632()
    val b = Number1631()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1634 : StressfulInteger {

  companion object {
    private var VALUE = 1634
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number817()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number3269()
      val right = Number3270()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1633()
    val b = Number1632()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1635 : StressfulInteger {

  companion object {
    private var VALUE = 1635
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number817()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number3271()
      val right = Number3272()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1634()
    val b = Number1633()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1636 : StressfulInteger {

  companion object {
    private var VALUE = 1636
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number818()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number3273()
      val right = Number3274()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1635()
    val b = Number1634()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1637 : StressfulInteger {

  companion object {
    private var VALUE = 1637
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number818()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number3275()
      val right = Number3276()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1636()
    val b = Number1635()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1638 : StressfulInteger {

  companion object {
    private var VALUE = 1638
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number819()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number3277()
      val right = Number3278()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1637()
    val b = Number1636()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1639 : StressfulInteger {

  companion object {
    private var VALUE = 1639
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number819()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number3279()
      val right = Number3280()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1638()
    val b = Number1637()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1640 : StressfulInteger {

  companion object {
    private var VALUE = 1640
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number820()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number3281()
      val right = Number3282()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1639()
    val b = Number1638()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1641 : StressfulInteger {

  companion object {
    private var VALUE = 1641
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number820()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number3283()
      val right = Number3284()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1640()
    val b = Number1639()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1642 : StressfulInteger {

  companion object {
    private var VALUE = 1642
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number821()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number3285()
      val right = Number3286()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1641()
    val b = Number1640()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1643 : StressfulInteger {

  companion object {
    private var VALUE = 1643
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number821()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number3287()
      val right = Number3288()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1642()
    val b = Number1641()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1644 : StressfulInteger {

  companion object {
    private var VALUE = 1644
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number822()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number3289()
      val right = Number3290()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1643()
    val b = Number1642()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1645 : StressfulInteger {

  companion object {
    private var VALUE = 1645
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number822()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number3291()
      val right = Number3292()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1644()
    val b = Number1643()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1646 : StressfulInteger {

  companion object {
    private var VALUE = 1646
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number823()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number3293()
      val right = Number3294()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1645()
    val b = Number1644()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1647 : StressfulInteger {

  companion object {
    private var VALUE = 1647
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number823()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number3295()
      val right = Number3296()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1646()
    val b = Number1645()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1648 : StressfulInteger {

  companion object {
    private var VALUE = 1648
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number824()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number3297()
      val right = Number3298()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1647()
    val b = Number1646()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1649 : StressfulInteger {

  companion object {
    private var VALUE = 1649
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number824()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number3299()
      val right = Number3300()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1648()
    val b = Number1647()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1650 : StressfulInteger {

  companion object {
    private var VALUE = 1650
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number825()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number3301()
      val right = Number3302()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1649()
    val b = Number1648()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1651 : StressfulInteger {

  companion object {
    private var VALUE = 1651
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number825()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number3303()
      val right = Number3304()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1650()
    val b = Number1649()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1652 : StressfulInteger {

  companion object {
    private var VALUE = 1652
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number826()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number3305()
      val right = Number3306()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1651()
    val b = Number1650()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1653 : StressfulInteger {

  companion object {
    private var VALUE = 1653
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number826()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number3307()
      val right = Number3308()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1652()
    val b = Number1651()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1654 : StressfulInteger {

  companion object {
    private var VALUE = 1654
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number827()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number3309()
      val right = Number3310()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1653()
    val b = Number1652()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1655 : StressfulInteger {

  companion object {
    private var VALUE = 1655
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number827()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number3311()
      val right = Number3312()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1654()
    val b = Number1653()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1656 : StressfulInteger {

  companion object {
    private var VALUE = 1656
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number828()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number3313()
      val right = Number3314()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1655()
    val b = Number1654()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1657 : StressfulInteger {

  companion object {
    private var VALUE = 1657
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number828()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number3315()
      val right = Number3316()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1656()
    val b = Number1655()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1658 : StressfulInteger {

  companion object {
    private var VALUE = 1658
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number829()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number3317()
      val right = Number3318()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1657()
    val b = Number1656()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1659 : StressfulInteger {

  companion object {
    private var VALUE = 1659
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number829()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number3319()
      val right = Number3320()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1658()
    val b = Number1657()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1660 : StressfulInteger {

  companion object {
    private var VALUE = 1660
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number830()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number3321()
      val right = Number3322()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1659()
    val b = Number1658()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1661 : StressfulInteger {

  companion object {
    private var VALUE = 1661
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number830()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number3323()
      val right = Number3324()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1660()
    val b = Number1659()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1662 : StressfulInteger {

  companion object {
    private var VALUE = 1662
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number831()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number3325()
      val right = Number3326()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1661()
    val b = Number1660()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1663 : StressfulInteger {

  companion object {
    private var VALUE = 1663
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number831()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number3327()
      val right = Number3328()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1662()
    val b = Number1661()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1664 : StressfulInteger {

  companion object {
    private var VALUE = 1664
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number832()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number3329()
      val right = Number3330()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1663()
    val b = Number1662()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1665 : StressfulInteger {

  companion object {
    private var VALUE = 1665
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number832()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number3331()
      val right = Number3332()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1664()
    val b = Number1663()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1666 : StressfulInteger {

  companion object {
    private var VALUE = 1666
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number833()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number3333()
      val right = Number3334()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1665()
    val b = Number1664()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1667 : StressfulInteger {

  companion object {
    private var VALUE = 1667
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number833()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number3335()
      val right = Number3336()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1666()
    val b = Number1665()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1668 : StressfulInteger {

  companion object {
    private var VALUE = 1668
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number834()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number3337()
      val right = Number3338()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1667()
    val b = Number1666()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1669 : StressfulInteger {

  companion object {
    private var VALUE = 1669
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number834()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number3339()
      val right = Number3340()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1668()
    val b = Number1667()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1670 : StressfulInteger {

  companion object {
    private var VALUE = 1670
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number835()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number3341()
      val right = Number3342()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1669()
    val b = Number1668()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1671 : StressfulInteger {

  companion object {
    private var VALUE = 1671
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number835()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number3343()
      val right = Number3344()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1670()
    val b = Number1669()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1672 : StressfulInteger {

  companion object {
    private var VALUE = 1672
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number836()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number3345()
      val right = Number3346()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1671()
    val b = Number1670()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1673 : StressfulInteger {

  companion object {
    private var VALUE = 1673
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number836()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number3347()
      val right = Number3348()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1672()
    val b = Number1671()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1674 : StressfulInteger {

  companion object {
    private var VALUE = 1674
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number837()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number3349()
      val right = Number3350()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1673()
    val b = Number1672()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1675 : StressfulInteger {

  companion object {
    private var VALUE = 1675
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number837()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number3351()
      val right = Number3352()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1674()
    val b = Number1673()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1676 : StressfulInteger {

  companion object {
    private var VALUE = 1676
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number838()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number3353()
      val right = Number3354()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1675()
    val b = Number1674()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1677 : StressfulInteger {

  companion object {
    private var VALUE = 1677
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number838()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number3355()
      val right = Number3356()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1676()
    val b = Number1675()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1678 : StressfulInteger {

  companion object {
    private var VALUE = 1678
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number839()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number3357()
      val right = Number3358()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1677()
    val b = Number1676()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1679 : StressfulInteger {

  companion object {
    private var VALUE = 1679
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number839()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number3359()
      val right = Number3360()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1678()
    val b = Number1677()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1680 : StressfulInteger {

  companion object {
    private var VALUE = 1680
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number840()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number3361()
      val right = Number3362()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1679()
    val b = Number1678()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1681 : StressfulInteger {

  companion object {
    private var VALUE = 1681
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number840()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number3363()
      val right = Number3364()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1680()
    val b = Number1679()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1682 : StressfulInteger {

  companion object {
    private var VALUE = 1682
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number841()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number3365()
      val right = Number3366()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1681()
    val b = Number1680()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1683 : StressfulInteger {

  companion object {
    private var VALUE = 1683
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number841()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number3367()
      val right = Number3368()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1682()
    val b = Number1681()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1684 : StressfulInteger {

  companion object {
    private var VALUE = 1684
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number842()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number3369()
      val right = Number3370()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1683()
    val b = Number1682()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1685 : StressfulInteger {

  companion object {
    private var VALUE = 1685
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number842()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number3371()
      val right = Number3372()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1684()
    val b = Number1683()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1686 : StressfulInteger {

  companion object {
    private var VALUE = 1686
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number843()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number3373()
      val right = Number3374()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1685()
    val b = Number1684()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1687 : StressfulInteger {

  companion object {
    private var VALUE = 1687
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number843()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number3375()
      val right = Number3376()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1686()
    val b = Number1685()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1688 : StressfulInteger {

  companion object {
    private var VALUE = 1688
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number844()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number3377()
      val right = Number3378()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1687()
    val b = Number1686()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1689 : StressfulInteger {

  companion object {
    private var VALUE = 1689
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number844()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number3379()
      val right = Number3380()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1688()
    val b = Number1687()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1690 : StressfulInteger {

  companion object {
    private var VALUE = 1690
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number845()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number3381()
      val right = Number3382()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1689()
    val b = Number1688()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1691 : StressfulInteger {

  companion object {
    private var VALUE = 1691
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number845()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number3383()
      val right = Number3384()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1690()
    val b = Number1689()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1692 : StressfulInteger {

  companion object {
    private var VALUE = 1692
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number846()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number3385()
      val right = Number3386()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1691()
    val b = Number1690()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1693 : StressfulInteger {

  companion object {
    private var VALUE = 1693
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number846()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number3387()
      val right = Number3388()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1692()
    val b = Number1691()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1694 : StressfulInteger {

  companion object {
    private var VALUE = 1694
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number847()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number3389()
      val right = Number3390()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1693()
    val b = Number1692()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1695 : StressfulInteger {

  companion object {
    private var VALUE = 1695
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number847()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number3391()
      val right = Number3392()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1694()
    val b = Number1693()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1696 : StressfulInteger {

  companion object {
    private var VALUE = 1696
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number848()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number3393()
      val right = Number3394()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1695()
    val b = Number1694()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1697 : StressfulInteger {

  companion object {
    private var VALUE = 1697
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number848()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number3395()
      val right = Number3396()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1696()
    val b = Number1695()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1698 : StressfulInteger {

  companion object {
    private var VALUE = 1698
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number849()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number3397()
      val right = Number3398()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1697()
    val b = Number1696()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1699 : StressfulInteger {

  companion object {
    private var VALUE = 1699
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number849()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number3399()
      val right = Number3400()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1698()
    val b = Number1697()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1700 : StressfulInteger {

  companion object {
    private var VALUE = 1700
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number850()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number3401()
      val right = Number3402()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1699()
    val b = Number1698()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1701 : StressfulInteger {

  companion object {
    private var VALUE = 1701
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number850()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number3403()
      val right = Number3404()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1700()
    val b = Number1699()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1702 : StressfulInteger {

  companion object {
    private var VALUE = 1702
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number851()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number3405()
      val right = Number3406()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1701()
    val b = Number1700()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1703 : StressfulInteger {

  companion object {
    private var VALUE = 1703
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number851()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number3407()
      val right = Number3408()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1702()
    val b = Number1701()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1704 : StressfulInteger {

  companion object {
    private var VALUE = 1704
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number852()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number3409()
      val right = Number3410()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1703()
    val b = Number1702()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1705 : StressfulInteger {

  companion object {
    private var VALUE = 1705
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number852()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number3411()
      val right = Number3412()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1704()
    val b = Number1703()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1706 : StressfulInteger {

  companion object {
    private var VALUE = 1706
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number853()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number3413()
      val right = Number3414()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1705()
    val b = Number1704()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1707 : StressfulInteger {

  companion object {
    private var VALUE = 1707
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number853()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number3415()
      val right = Number3416()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1706()
    val b = Number1705()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1708 : StressfulInteger {

  companion object {
    private var VALUE = 1708
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number854()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number3417()
      val right = Number3418()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1707()
    val b = Number1706()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1709 : StressfulInteger {

  companion object {
    private var VALUE = 1709
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number854()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number3419()
      val right = Number3420()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1708()
    val b = Number1707()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1710 : StressfulInteger {

  companion object {
    private var VALUE = 1710
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number855()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number3421()
      val right = Number3422()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1709()
    val b = Number1708()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1711 : StressfulInteger {

  companion object {
    private var VALUE = 1711
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number855()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number3423()
      val right = Number3424()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1710()
    val b = Number1709()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1712 : StressfulInteger {

  companion object {
    private var VALUE = 1712
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number856()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number3425()
      val right = Number3426()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1711()
    val b = Number1710()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1713 : StressfulInteger {

  companion object {
    private var VALUE = 1713
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number856()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number3427()
      val right = Number3428()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1712()
    val b = Number1711()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1714 : StressfulInteger {

  companion object {
    private var VALUE = 1714
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number857()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number3429()
      val right = Number3430()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1713()
    val b = Number1712()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1715 : StressfulInteger {

  companion object {
    private var VALUE = 1715
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number857()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number3431()
      val right = Number3432()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1714()
    val b = Number1713()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1716 : StressfulInteger {

  companion object {
    private var VALUE = 1716
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number858()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number3433()
      val right = Number3434()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1715()
    val b = Number1714()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1717 : StressfulInteger {

  companion object {
    private var VALUE = 1717
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number858()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number3435()
      val right = Number3436()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1716()
    val b = Number1715()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1718 : StressfulInteger {

  companion object {
    private var VALUE = 1718
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number859()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number3437()
      val right = Number3438()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1717()
    val b = Number1716()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1719 : StressfulInteger {

  companion object {
    private var VALUE = 1719
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number859()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number3439()
      val right = Number3440()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1718()
    val b = Number1717()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1720 : StressfulInteger {

  companion object {
    private var VALUE = 1720
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number860()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number3441()
      val right = Number3442()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1719()
    val b = Number1718()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1721 : StressfulInteger {

  companion object {
    private var VALUE = 1721
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number860()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number3443()
      val right = Number3444()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1720()
    val b = Number1719()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1722 : StressfulInteger {

  companion object {
    private var VALUE = 1722
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number861()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number3445()
      val right = Number3446()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1721()
    val b = Number1720()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1723 : StressfulInteger {

  companion object {
    private var VALUE = 1723
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number861()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number3447()
      val right = Number3448()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1722()
    val b = Number1721()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1724 : StressfulInteger {

  companion object {
    private var VALUE = 1724
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number862()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number3449()
      val right = Number3450()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1723()
    val b = Number1722()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1725 : StressfulInteger {

  companion object {
    private var VALUE = 1725
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number862()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number3451()
      val right = Number3452()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1724()
    val b = Number1723()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1726 : StressfulInteger {

  companion object {
    private var VALUE = 1726
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number863()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number3453()
      val right = Number3454()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1725()
    val b = Number1724()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1727 : StressfulInteger {

  companion object {
    private var VALUE = 1727
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number863()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number3455()
      val right = Number3456()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1726()
    val b = Number1725()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1728 : StressfulInteger {

  companion object {
    private var VALUE = 1728
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number864()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number3457()
      val right = Number3458()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1727()
    val b = Number1726()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1729 : StressfulInteger {

  companion object {
    private var VALUE = 1729
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number864()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number3459()
      val right = Number3460()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1728()
    val b = Number1727()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1730 : StressfulInteger {

  companion object {
    private var VALUE = 1730
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number865()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number3461()
      val right = Number3462()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1729()
    val b = Number1728()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1731 : StressfulInteger {

  companion object {
    private var VALUE = 1731
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number865()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number3463()
      val right = Number3464()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1730()
    val b = Number1729()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1732 : StressfulInteger {

  companion object {
    private var VALUE = 1732
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number866()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number3465()
      val right = Number3466()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1731()
    val b = Number1730()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1733 : StressfulInteger {

  companion object {
    private var VALUE = 1733
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number866()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number3467()
      val right = Number3468()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1732()
    val b = Number1731()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1734 : StressfulInteger {

  companion object {
    private var VALUE = 1734
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number867()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number3469()
      val right = Number3470()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1733()
    val b = Number1732()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1735 : StressfulInteger {

  companion object {
    private var VALUE = 1735
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number867()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number3471()
      val right = Number3472()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1734()
    val b = Number1733()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1736 : StressfulInteger {

  companion object {
    private var VALUE = 1736
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number868()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number3473()
      val right = Number3474()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1735()
    val b = Number1734()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1737 : StressfulInteger {

  companion object {
    private var VALUE = 1737
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number868()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number3475()
      val right = Number3476()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1736()
    val b = Number1735()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1738 : StressfulInteger {

  companion object {
    private var VALUE = 1738
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number869()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number3477()
      val right = Number3478()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1737()
    val b = Number1736()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1739 : StressfulInteger {

  companion object {
    private var VALUE = 1739
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number869()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number3479()
      val right = Number3480()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1738()
    val b = Number1737()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1740 : StressfulInteger {

  companion object {
    private var VALUE = 1740
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number870()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number3481()
      val right = Number3482()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1739()
    val b = Number1738()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1741 : StressfulInteger {

  companion object {
    private var VALUE = 1741
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number870()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number3483()
      val right = Number3484()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1740()
    val b = Number1739()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1742 : StressfulInteger {

  companion object {
    private var VALUE = 1742
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number871()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number3485()
      val right = Number3486()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1741()
    val b = Number1740()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1743 : StressfulInteger {

  companion object {
    private var VALUE = 1743
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number871()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number3487()
      val right = Number3488()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1742()
    val b = Number1741()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1744 : StressfulInteger {

  companion object {
    private var VALUE = 1744
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number872()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number3489()
      val right = Number3490()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1743()
    val b = Number1742()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1745 : StressfulInteger {

  companion object {
    private var VALUE = 1745
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number872()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number3491()
      val right = Number3492()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1744()
    val b = Number1743()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1746 : StressfulInteger {

  companion object {
    private var VALUE = 1746
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number873()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number3493()
      val right = Number3494()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1745()
    val b = Number1744()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1747 : StressfulInteger {

  companion object {
    private var VALUE = 1747
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number873()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number3495()
      val right = Number3496()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1746()
    val b = Number1745()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1748 : StressfulInteger {

  companion object {
    private var VALUE = 1748
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number874()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number3497()
      val right = Number3498()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1747()
    val b = Number1746()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1749 : StressfulInteger {

  companion object {
    private var VALUE = 1749
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number874()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number3499()
      val right = Number3500()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1748()
    val b = Number1747()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1750 : StressfulInteger {

  companion object {
    private var VALUE = 1750
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number875()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number3501()
      val right = Number3502()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1749()
    val b = Number1748()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1751 : StressfulInteger {

  companion object {
    private var VALUE = 1751
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number875()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number3503()
      val right = Number3504()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1750()
    val b = Number1749()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1752 : StressfulInteger {

  companion object {
    private var VALUE = 1752
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number876()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number3505()
      val right = Number3506()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1751()
    val b = Number1750()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1753 : StressfulInteger {

  companion object {
    private var VALUE = 1753
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number876()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number3507()
      val right = Number3508()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1752()
    val b = Number1751()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1754 : StressfulInteger {

  companion object {
    private var VALUE = 1754
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number877()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number3509()
      val right = Number3510()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1753()
    val b = Number1752()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1755 : StressfulInteger {

  companion object {
    private var VALUE = 1755
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number877()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number3511()
      val right = Number3512()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1754()
    val b = Number1753()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1756 : StressfulInteger {

  companion object {
    private var VALUE = 1756
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number878()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number3513()
      val right = Number3514()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1755()
    val b = Number1754()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1757 : StressfulInteger {

  companion object {
    private var VALUE = 1757
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number878()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number3515()
      val right = Number3516()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1756()
    val b = Number1755()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1758 : StressfulInteger {

  companion object {
    private var VALUE = 1758
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number879()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number3517()
      val right = Number3518()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1757()
    val b = Number1756()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1759 : StressfulInteger {

  companion object {
    private var VALUE = 1759
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number879()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number3519()
      val right = Number3520()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1758()
    val b = Number1757()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1760 : StressfulInteger {

  companion object {
    private var VALUE = 1760
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number880()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number3521()
      val right = Number3522()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1759()
    val b = Number1758()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1761 : StressfulInteger {

  companion object {
    private var VALUE = 1761
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number880()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number3523()
      val right = Number3524()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1760()
    val b = Number1759()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1762 : StressfulInteger {

  companion object {
    private var VALUE = 1762
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number881()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number3525()
      val right = Number3526()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1761()
    val b = Number1760()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1763 : StressfulInteger {

  companion object {
    private var VALUE = 1763
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number881()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number3527()
      val right = Number3528()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1762()
    val b = Number1761()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1764 : StressfulInteger {

  companion object {
    private var VALUE = 1764
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number882()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number3529()
      val right = Number3530()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1763()
    val b = Number1762()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1765 : StressfulInteger {

  companion object {
    private var VALUE = 1765
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number882()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number3531()
      val right = Number3532()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1764()
    val b = Number1763()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1766 : StressfulInteger {

  companion object {
    private var VALUE = 1766
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number883()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number3533()
      val right = Number3534()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1765()
    val b = Number1764()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1767 : StressfulInteger {

  companion object {
    private var VALUE = 1767
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number883()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number3535()
      val right = Number3536()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1766()
    val b = Number1765()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1768 : StressfulInteger {

  companion object {
    private var VALUE = 1768
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number884()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number3537()
      val right = Number3538()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1767()
    val b = Number1766()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1769 : StressfulInteger {

  companion object {
    private var VALUE = 1769
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number884()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number3539()
      val right = Number3540()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1768()
    val b = Number1767()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1770 : StressfulInteger {

  companion object {
    private var VALUE = 1770
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number885()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number3541()
      val right = Number3542()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1769()
    val b = Number1768()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1771 : StressfulInteger {

  companion object {
    private var VALUE = 1771
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number885()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number3543()
      val right = Number3544()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1770()
    val b = Number1769()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1772 : StressfulInteger {

  companion object {
    private var VALUE = 1772
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number886()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number3545()
      val right = Number3546()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1771()
    val b = Number1770()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1773 : StressfulInteger {

  companion object {
    private var VALUE = 1773
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number886()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number3547()
      val right = Number3548()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1772()
    val b = Number1771()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1774 : StressfulInteger {

  companion object {
    private var VALUE = 1774
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number887()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number3549()
      val right = Number3550()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1773()
    val b = Number1772()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1775 : StressfulInteger {

  companion object {
    private var VALUE = 1775
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number887()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number3551()
      val right = Number3552()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1774()
    val b = Number1773()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1776 : StressfulInteger {

  companion object {
    private var VALUE = 1776
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number888()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number3553()
      val right = Number3554()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1775()
    val b = Number1774()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1777 : StressfulInteger {

  companion object {
    private var VALUE = 1777
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number888()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number3555()
      val right = Number3556()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1776()
    val b = Number1775()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1778 : StressfulInteger {

  companion object {
    private var VALUE = 1778
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number889()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number3557()
      val right = Number3558()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1777()
    val b = Number1776()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1779 : StressfulInteger {

  companion object {
    private var VALUE = 1779
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number889()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number3559()
      val right = Number3560()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1778()
    val b = Number1777()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1780 : StressfulInteger {

  companion object {
    private var VALUE = 1780
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number890()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number3561()
      val right = Number3562()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1779()
    val b = Number1778()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1781 : StressfulInteger {

  companion object {
    private var VALUE = 1781
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number890()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number3563()
      val right = Number3564()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1780()
    val b = Number1779()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1782 : StressfulInteger {

  companion object {
    private var VALUE = 1782
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number891()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number3565()
      val right = Number3566()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1781()
    val b = Number1780()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1783 : StressfulInteger {

  companion object {
    private var VALUE = 1783
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number891()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number3567()
      val right = Number3568()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1782()
    val b = Number1781()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1784 : StressfulInteger {

  companion object {
    private var VALUE = 1784
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number892()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number3569()
      val right = Number3570()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1783()
    val b = Number1782()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1785 : StressfulInteger {

  companion object {
    private var VALUE = 1785
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number892()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number3571()
      val right = Number3572()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1784()
    val b = Number1783()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1786 : StressfulInteger {

  companion object {
    private var VALUE = 1786
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number893()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number3573()
      val right = Number3574()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1785()
    val b = Number1784()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1787 : StressfulInteger {

  companion object {
    private var VALUE = 1787
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number893()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number3575()
      val right = Number3576()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1786()
    val b = Number1785()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1788 : StressfulInteger {

  companion object {
    private var VALUE = 1788
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number894()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number3577()
      val right = Number3578()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1787()
    val b = Number1786()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1789 : StressfulInteger {

  companion object {
    private var VALUE = 1789
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number894()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number3579()
      val right = Number3580()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1788()
    val b = Number1787()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1790 : StressfulInteger {

  companion object {
    private var VALUE = 1790
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number895()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number3581()
      val right = Number3582()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1789()
    val b = Number1788()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1791 : StressfulInteger {

  companion object {
    private var VALUE = 1791
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number895()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number3583()
      val right = Number3584()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1790()
    val b = Number1789()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1792 : StressfulInteger {

  companion object {
    private var VALUE = 1792
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number896()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number3585()
      val right = Number3586()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1791()
    val b = Number1790()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1793 : StressfulInteger {

  companion object {
    private var VALUE = 1793
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number896()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number3587()
      val right = Number3588()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1792()
    val b = Number1791()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1794 : StressfulInteger {

  companion object {
    private var VALUE = 1794
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number897()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number3589()
      val right = Number3590()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1793()
    val b = Number1792()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1795 : StressfulInteger {

  companion object {
    private var VALUE = 1795
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number897()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number3591()
      val right = Number3592()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1794()
    val b = Number1793()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1796 : StressfulInteger {

  companion object {
    private var VALUE = 1796
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number898()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number3593()
      val right = Number3594()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1795()
    val b = Number1794()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1797 : StressfulInteger {

  companion object {
    private var VALUE = 1797
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number898()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number3595()
      val right = Number3596()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1796()
    val b = Number1795()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1798 : StressfulInteger {

  companion object {
    private var VALUE = 1798
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number899()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number3597()
      val right = Number3598()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1797()
    val b = Number1796()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1799 : StressfulInteger {

  companion object {
    private var VALUE = 1799
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number899()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number3599()
      val right = Number3600()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1798()
    val b = Number1797()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1800 : StressfulInteger {

  companion object {
    private var VALUE = 1800
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number900()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number3601()
      val right = Number3602()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1799()
    val b = Number1798()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1801 : StressfulInteger {

  companion object {
    private var VALUE = 1801
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number900()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number3603()
      val right = Number3604()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1800()
    val b = Number1799()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1802 : StressfulInteger {

  companion object {
    private var VALUE = 1802
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number901()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number3605()
      val right = Number3606()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1801()
    val b = Number1800()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1803 : StressfulInteger {

  companion object {
    private var VALUE = 1803
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number901()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number3607()
      val right = Number3608()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1802()
    val b = Number1801()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1804 : StressfulInteger {

  companion object {
    private var VALUE = 1804
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number902()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number3609()
      val right = Number3610()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1803()
    val b = Number1802()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1805 : StressfulInteger {

  companion object {
    private var VALUE = 1805
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number902()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number3611()
      val right = Number3612()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1804()
    val b = Number1803()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1806 : StressfulInteger {

  companion object {
    private var VALUE = 1806
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number903()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number3613()
      val right = Number3614()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1805()
    val b = Number1804()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1807 : StressfulInteger {

  companion object {
    private var VALUE = 1807
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number903()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number3615()
      val right = Number3616()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1806()
    val b = Number1805()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1808 : StressfulInteger {

  companion object {
    private var VALUE = 1808
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number904()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number3617()
      val right = Number3618()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1807()
    val b = Number1806()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1809 : StressfulInteger {

  companion object {
    private var VALUE = 1809
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number904()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number3619()
      val right = Number3620()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1808()
    val b = Number1807()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1810 : StressfulInteger {

  companion object {
    private var VALUE = 1810
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number905()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number3621()
      val right = Number3622()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1809()
    val b = Number1808()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1811 : StressfulInteger {

  companion object {
    private var VALUE = 1811
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number905()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number3623()
      val right = Number3624()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1810()
    val b = Number1809()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1812 : StressfulInteger {

  companion object {
    private var VALUE = 1812
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number906()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number3625()
      val right = Number3626()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1811()
    val b = Number1810()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1813 : StressfulInteger {

  companion object {
    private var VALUE = 1813
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number906()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number3627()
      val right = Number3628()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1812()
    val b = Number1811()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1814 : StressfulInteger {

  companion object {
    private var VALUE = 1814
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number907()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number3629()
      val right = Number3630()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1813()
    val b = Number1812()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1815 : StressfulInteger {

  companion object {
    private var VALUE = 1815
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number907()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number3631()
      val right = Number3632()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1814()
    val b = Number1813()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1816 : StressfulInteger {

  companion object {
    private var VALUE = 1816
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number908()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number3633()
      val right = Number3634()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1815()
    val b = Number1814()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1817 : StressfulInteger {

  companion object {
    private var VALUE = 1817
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number908()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number3635()
      val right = Number3636()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1816()
    val b = Number1815()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1818 : StressfulInteger {

  companion object {
    private var VALUE = 1818
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number909()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number3637()
      val right = Number3638()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1817()
    val b = Number1816()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1819 : StressfulInteger {

  companion object {
    private var VALUE = 1819
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number909()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number3639()
      val right = Number3640()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1818()
    val b = Number1817()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1820 : StressfulInteger {

  companion object {
    private var VALUE = 1820
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number910()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number3641()
      val right = Number3642()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1819()
    val b = Number1818()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1821 : StressfulInteger {

  companion object {
    private var VALUE = 1821
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number910()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number3643()
      val right = Number3644()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1820()
    val b = Number1819()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1822 : StressfulInteger {

  companion object {
    private var VALUE = 1822
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number911()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number3645()
      val right = Number3646()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1821()
    val b = Number1820()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1823 : StressfulInteger {

  companion object {
    private var VALUE = 1823
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number911()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number3647()
      val right = Number3648()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1822()
    val b = Number1821()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1824 : StressfulInteger {

  companion object {
    private var VALUE = 1824
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number912()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number3649()
      val right = Number3650()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1823()
    val b = Number1822()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1825 : StressfulInteger {

  companion object {
    private var VALUE = 1825
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number912()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number3651()
      val right = Number3652()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1824()
    val b = Number1823()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1826 : StressfulInteger {

  companion object {
    private var VALUE = 1826
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number913()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number3653()
      val right = Number3654()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1825()
    val b = Number1824()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1827 : StressfulInteger {

  companion object {
    private var VALUE = 1827
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number913()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number3655()
      val right = Number3656()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1826()
    val b = Number1825()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1828 : StressfulInteger {

  companion object {
    private var VALUE = 1828
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number914()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number3657()
      val right = Number3658()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1827()
    val b = Number1826()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1829 : StressfulInteger {

  companion object {
    private var VALUE = 1829
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number914()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number3659()
      val right = Number3660()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1828()
    val b = Number1827()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1830 : StressfulInteger {

  companion object {
    private var VALUE = 1830
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number915()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number3661()
      val right = Number3662()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1829()
    val b = Number1828()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1831 : StressfulInteger {

  companion object {
    private var VALUE = 1831
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number915()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number3663()
      val right = Number3664()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1830()
    val b = Number1829()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1832 : StressfulInteger {

  companion object {
    private var VALUE = 1832
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number916()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number3665()
      val right = Number3666()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1831()
    val b = Number1830()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1833 : StressfulInteger {

  companion object {
    private var VALUE = 1833
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number916()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number3667()
      val right = Number3668()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1832()
    val b = Number1831()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1834 : StressfulInteger {

  companion object {
    private var VALUE = 1834
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number917()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number3669()
      val right = Number3670()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1833()
    val b = Number1832()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1835 : StressfulInteger {

  companion object {
    private var VALUE = 1835
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number917()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number3671()
      val right = Number3672()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1834()
    val b = Number1833()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1836 : StressfulInteger {

  companion object {
    private var VALUE = 1836
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number918()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number3673()
      val right = Number3674()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1835()
    val b = Number1834()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1837 : StressfulInteger {

  companion object {
    private var VALUE = 1837
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number918()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number3675()
      val right = Number3676()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1836()
    val b = Number1835()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1838 : StressfulInteger {

  companion object {
    private var VALUE = 1838
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number919()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number3677()
      val right = Number3678()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1837()
    val b = Number1836()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1839 : StressfulInteger {

  companion object {
    private var VALUE = 1839
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number919()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number3679()
      val right = Number3680()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1838()
    val b = Number1837()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1840 : StressfulInteger {

  companion object {
    private var VALUE = 1840
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number920()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number3681()
      val right = Number3682()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1839()
    val b = Number1838()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1841 : StressfulInteger {

  companion object {
    private var VALUE = 1841
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number920()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number3683()
      val right = Number3684()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1840()
    val b = Number1839()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1842 : StressfulInteger {

  companion object {
    private var VALUE = 1842
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number921()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number3685()
      val right = Number3686()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1841()
    val b = Number1840()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1843 : StressfulInteger {

  companion object {
    private var VALUE = 1843
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number921()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number3687()
      val right = Number3688()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1842()
    val b = Number1841()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1844 : StressfulInteger {

  companion object {
    private var VALUE = 1844
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number922()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number3689()
      val right = Number3690()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1843()
    val b = Number1842()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1845 : StressfulInteger {

  companion object {
    private var VALUE = 1845
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number922()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number3691()
      val right = Number3692()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1844()
    val b = Number1843()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1846 : StressfulInteger {

  companion object {
    private var VALUE = 1846
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number923()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number3693()
      val right = Number3694()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1845()
    val b = Number1844()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1847 : StressfulInteger {

  companion object {
    private var VALUE = 1847
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number923()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number3695()
      val right = Number3696()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1846()
    val b = Number1845()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1848 : StressfulInteger {

  companion object {
    private var VALUE = 1848
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number924()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number3697()
      val right = Number3698()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1847()
    val b = Number1846()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1849 : StressfulInteger {

  companion object {
    private var VALUE = 1849
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number924()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number3699()
      val right = Number3700()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1848()
    val b = Number1847()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1850 : StressfulInteger {

  companion object {
    private var VALUE = 1850
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number925()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number3701()
      val right = Number3702()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1849()
    val b = Number1848()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1851 : StressfulInteger {

  companion object {
    private var VALUE = 1851
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number925()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number3703()
      val right = Number3704()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1850()
    val b = Number1849()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1852 : StressfulInteger {

  companion object {
    private var VALUE = 1852
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number926()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number3705()
      val right = Number3706()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1851()
    val b = Number1850()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1853 : StressfulInteger {

  companion object {
    private var VALUE = 1853
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number926()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number3707()
      val right = Number3708()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1852()
    val b = Number1851()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1854 : StressfulInteger {

  companion object {
    private var VALUE = 1854
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number927()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number3709()
      val right = Number3710()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1853()
    val b = Number1852()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1855 : StressfulInteger {

  companion object {
    private var VALUE = 1855
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number927()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number3711()
      val right = Number3712()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1854()
    val b = Number1853()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1856 : StressfulInteger {

  companion object {
    private var VALUE = 1856
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number928()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number3713()
      val right = Number3714()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1855()
    val b = Number1854()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1857 : StressfulInteger {

  companion object {
    private var VALUE = 1857
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number928()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number3715()
      val right = Number3716()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1856()
    val b = Number1855()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1858 : StressfulInteger {

  companion object {
    private var VALUE = 1858
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number929()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number3717()
      val right = Number3718()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1857()
    val b = Number1856()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1859 : StressfulInteger {

  companion object {
    private var VALUE = 1859
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number929()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number3719()
      val right = Number3720()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1858()
    val b = Number1857()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1860 : StressfulInteger {

  companion object {
    private var VALUE = 1860
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number930()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number3721()
      val right = Number3722()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1859()
    val b = Number1858()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1861 : StressfulInteger {

  companion object {
    private var VALUE = 1861
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number930()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number3723()
      val right = Number3724()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1860()
    val b = Number1859()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1862 : StressfulInteger {

  companion object {
    private var VALUE = 1862
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number931()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number3725()
      val right = Number3726()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1861()
    val b = Number1860()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1863 : StressfulInteger {

  companion object {
    private var VALUE = 1863
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number931()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number3727()
      val right = Number3728()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1862()
    val b = Number1861()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1864 : StressfulInteger {

  companion object {
    private var VALUE = 1864
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number932()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number3729()
      val right = Number3730()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1863()
    val b = Number1862()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1865 : StressfulInteger {

  companion object {
    private var VALUE = 1865
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number932()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number3731()
      val right = Number3732()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1864()
    val b = Number1863()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1866 : StressfulInteger {

  companion object {
    private var VALUE = 1866
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number933()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number3733()
      val right = Number3734()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1865()
    val b = Number1864()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1867 : StressfulInteger {

  companion object {
    private var VALUE = 1867
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number933()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number3735()
      val right = Number3736()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1866()
    val b = Number1865()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1868 : StressfulInteger {

  companion object {
    private var VALUE = 1868
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number934()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number3737()
      val right = Number3738()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1867()
    val b = Number1866()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1869 : StressfulInteger {

  companion object {
    private var VALUE = 1869
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number934()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number3739()
      val right = Number3740()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1868()
    val b = Number1867()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1870 : StressfulInteger {

  companion object {
    private var VALUE = 1870
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number935()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number3741()
      val right = Number3742()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1869()
    val b = Number1868()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1871 : StressfulInteger {

  companion object {
    private var VALUE = 1871
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number935()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number3743()
      val right = Number3744()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1870()
    val b = Number1869()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1872 : StressfulInteger {

  companion object {
    private var VALUE = 1872
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number936()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number3745()
      val right = Number3746()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1871()
    val b = Number1870()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1873 : StressfulInteger {

  companion object {
    private var VALUE = 1873
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number936()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number3747()
      val right = Number3748()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1872()
    val b = Number1871()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1874 : StressfulInteger {

  companion object {
    private var VALUE = 1874
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number937()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number3749()
      val right = Number3750()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1873()
    val b = Number1872()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1875 : StressfulInteger {

  companion object {
    private var VALUE = 1875
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number937()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number3751()
      val right = Number3752()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1874()
    val b = Number1873()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1876 : StressfulInteger {

  companion object {
    private var VALUE = 1876
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number938()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number3753()
      val right = Number3754()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1875()
    val b = Number1874()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1877 : StressfulInteger {

  companion object {
    private var VALUE = 1877
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number938()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number3755()
      val right = Number3756()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1876()
    val b = Number1875()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1878 : StressfulInteger {

  companion object {
    private var VALUE = 1878
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number939()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number3757()
      val right = Number3758()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1877()
    val b = Number1876()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1879 : StressfulInteger {

  companion object {
    private var VALUE = 1879
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number939()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number3759()
      val right = Number3760()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1878()
    val b = Number1877()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1880 : StressfulInteger {

  companion object {
    private var VALUE = 1880
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number940()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number3761()
      val right = Number3762()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1879()
    val b = Number1878()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1881 : StressfulInteger {

  companion object {
    private var VALUE = 1881
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number940()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number3763()
      val right = Number3764()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1880()
    val b = Number1879()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1882 : StressfulInteger {

  companion object {
    private var VALUE = 1882
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number941()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number3765()
      val right = Number3766()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1881()
    val b = Number1880()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1883 : StressfulInteger {

  companion object {
    private var VALUE = 1883
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number941()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number3767()
      val right = Number3768()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1882()
    val b = Number1881()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1884 : StressfulInteger {

  companion object {
    private var VALUE = 1884
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number942()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number3769()
      val right = Number3770()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1883()
    val b = Number1882()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1885 : StressfulInteger {

  companion object {
    private var VALUE = 1885
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number942()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number3771()
      val right = Number3772()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1884()
    val b = Number1883()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1886 : StressfulInteger {

  companion object {
    private var VALUE = 1886
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number943()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number3773()
      val right = Number3774()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1885()
    val b = Number1884()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1887 : StressfulInteger {

  companion object {
    private var VALUE = 1887
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number943()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number3775()
      val right = Number3776()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1886()
    val b = Number1885()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1888 : StressfulInteger {

  companion object {
    private var VALUE = 1888
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number944()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number3777()
      val right = Number3778()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1887()
    val b = Number1886()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1889 : StressfulInteger {

  companion object {
    private var VALUE = 1889
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number944()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number3779()
      val right = Number3780()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1888()
    val b = Number1887()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1890 : StressfulInteger {

  companion object {
    private var VALUE = 1890
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number945()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number3781()
      val right = Number3782()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1889()
    val b = Number1888()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1891 : StressfulInteger {

  companion object {
    private var VALUE = 1891
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number945()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number3783()
      val right = Number3784()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1890()
    val b = Number1889()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1892 : StressfulInteger {

  companion object {
    private var VALUE = 1892
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number946()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number3785()
      val right = Number3786()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1891()
    val b = Number1890()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1893 : StressfulInteger {

  companion object {
    private var VALUE = 1893
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number946()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number3787()
      val right = Number3788()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1892()
    val b = Number1891()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1894 : StressfulInteger {

  companion object {
    private var VALUE = 1894
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number947()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number3789()
      val right = Number3790()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1893()
    val b = Number1892()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1895 : StressfulInteger {

  companion object {
    private var VALUE = 1895
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number947()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number3791()
      val right = Number3792()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1894()
    val b = Number1893()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1896 : StressfulInteger {

  companion object {
    private var VALUE = 1896
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number948()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number3793()
      val right = Number3794()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1895()
    val b = Number1894()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1897 : StressfulInteger {

  companion object {
    private var VALUE = 1897
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number948()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number3795()
      val right = Number3796()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1896()
    val b = Number1895()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1898 : StressfulInteger {

  companion object {
    private var VALUE = 1898
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number949()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number3797()
      val right = Number3798()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1897()
    val b = Number1896()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1899 : StressfulInteger {

  companion object {
    private var VALUE = 1899
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number949()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number3799()
      val right = Number3800()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1898()
    val b = Number1897()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1900 : StressfulInteger {

  companion object {
    private var VALUE = 1900
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number950()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number3801()
      val right = Number3802()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1899()
    val b = Number1898()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1901 : StressfulInteger {

  companion object {
    private var VALUE = 1901
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number950()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number3803()
      val right = Number3804()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1900()
    val b = Number1899()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1902 : StressfulInteger {

  companion object {
    private var VALUE = 1902
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number951()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number3805()
      val right = Number3806()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1901()
    val b = Number1900()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1903 : StressfulInteger {

  companion object {
    private var VALUE = 1903
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number951()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number3807()
      val right = Number3808()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1902()
    val b = Number1901()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1904 : StressfulInteger {

  companion object {
    private var VALUE = 1904
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number952()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number3809()
      val right = Number3810()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1903()
    val b = Number1902()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1905 : StressfulInteger {

  companion object {
    private var VALUE = 1905
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number952()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number3811()
      val right = Number3812()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1904()
    val b = Number1903()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1906 : StressfulInteger {

  companion object {
    private var VALUE = 1906
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number953()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number3813()
      val right = Number3814()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1905()
    val b = Number1904()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1907 : StressfulInteger {

  companion object {
    private var VALUE = 1907
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number953()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number3815()
      val right = Number3816()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1906()
    val b = Number1905()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1908 : StressfulInteger {

  companion object {
    private var VALUE = 1908
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number954()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number3817()
      val right = Number3818()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1907()
    val b = Number1906()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1909 : StressfulInteger {

  companion object {
    private var VALUE = 1909
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number954()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number3819()
      val right = Number3820()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1908()
    val b = Number1907()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1910 : StressfulInteger {

  companion object {
    private var VALUE = 1910
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number955()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number3821()
      val right = Number3822()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1909()
    val b = Number1908()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1911 : StressfulInteger {

  companion object {
    private var VALUE = 1911
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number955()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number3823()
      val right = Number3824()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1910()
    val b = Number1909()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1912 : StressfulInteger {

  companion object {
    private var VALUE = 1912
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number956()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number3825()
      val right = Number3826()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1911()
    val b = Number1910()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1913 : StressfulInteger {

  companion object {
    private var VALUE = 1913
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number956()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number3827()
      val right = Number3828()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1912()
    val b = Number1911()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1914 : StressfulInteger {

  companion object {
    private var VALUE = 1914
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number957()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number3829()
      val right = Number3830()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1913()
    val b = Number1912()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1915 : StressfulInteger {

  companion object {
    private var VALUE = 1915
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number957()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number3831()
      val right = Number3832()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1914()
    val b = Number1913()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1916 : StressfulInteger {

  companion object {
    private var VALUE = 1916
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number958()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number3833()
      val right = Number3834()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1915()
    val b = Number1914()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1917 : StressfulInteger {

  companion object {
    private var VALUE = 1917
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number958()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number3835()
      val right = Number3836()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1916()
    val b = Number1915()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1918 : StressfulInteger {

  companion object {
    private var VALUE = 1918
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number959()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number3837()
      val right = Number3838()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1917()
    val b = Number1916()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1919 : StressfulInteger {

  companion object {
    private var VALUE = 1919
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number959()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number3839()
      val right = Number3840()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1918()
    val b = Number1917()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1920 : StressfulInteger {

  companion object {
    private var VALUE = 1920
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number960()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number3841()
      val right = Number3842()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1919()
    val b = Number1918()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1921 : StressfulInteger {

  companion object {
    private var VALUE = 1921
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number960()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number3843()
      val right = Number3844()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1920()
    val b = Number1919()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1922 : StressfulInteger {

  companion object {
    private var VALUE = 1922
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number961()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number3845()
      val right = Number3846()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1921()
    val b = Number1920()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1923 : StressfulInteger {

  companion object {
    private var VALUE = 1923
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number961()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number3847()
      val right = Number3848()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1922()
    val b = Number1921()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1924 : StressfulInteger {

  companion object {
    private var VALUE = 1924
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number962()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number3849()
      val right = Number3850()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1923()
    val b = Number1922()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1925 : StressfulInteger {

  companion object {
    private var VALUE = 1925
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number962()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number3851()
      val right = Number3852()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1924()
    val b = Number1923()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1926 : StressfulInteger {

  companion object {
    private var VALUE = 1926
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number963()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number3853()
      val right = Number3854()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1925()
    val b = Number1924()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1927 : StressfulInteger {

  companion object {
    private var VALUE = 1927
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number963()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number3855()
      val right = Number3856()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1926()
    val b = Number1925()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1928 : StressfulInteger {

  companion object {
    private var VALUE = 1928
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number964()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number3857()
      val right = Number3858()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1927()
    val b = Number1926()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1929 : StressfulInteger {

  companion object {
    private var VALUE = 1929
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number964()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number3859()
      val right = Number3860()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1928()
    val b = Number1927()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1930 : StressfulInteger {

  companion object {
    private var VALUE = 1930
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number965()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number3861()
      val right = Number3862()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1929()
    val b = Number1928()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1931 : StressfulInteger {

  companion object {
    private var VALUE = 1931
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number965()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number3863()
      val right = Number3864()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1930()
    val b = Number1929()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1932 : StressfulInteger {

  companion object {
    private var VALUE = 1932
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number966()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number3865()
      val right = Number3866()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1931()
    val b = Number1930()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1933 : StressfulInteger {

  companion object {
    private var VALUE = 1933
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number966()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number3867()
      val right = Number3868()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1932()
    val b = Number1931()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1934 : StressfulInteger {

  companion object {
    private var VALUE = 1934
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number967()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number3869()
      val right = Number3870()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1933()
    val b = Number1932()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1935 : StressfulInteger {

  companion object {
    private var VALUE = 1935
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number967()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number3871()
      val right = Number3872()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1934()
    val b = Number1933()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1936 : StressfulInteger {

  companion object {
    private var VALUE = 1936
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number968()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number3873()
      val right = Number3874()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1935()
    val b = Number1934()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1937 : StressfulInteger {

  companion object {
    private var VALUE = 1937
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number968()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number3875()
      val right = Number3876()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1936()
    val b = Number1935()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1938 : StressfulInteger {

  companion object {
    private var VALUE = 1938
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number969()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number3877()
      val right = Number3878()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1937()
    val b = Number1936()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1939 : StressfulInteger {

  companion object {
    private var VALUE = 1939
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number969()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number3879()
      val right = Number3880()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1938()
    val b = Number1937()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1940 : StressfulInteger {

  companion object {
    private var VALUE = 1940
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number970()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number3881()
      val right = Number3882()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1939()
    val b = Number1938()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1941 : StressfulInteger {

  companion object {
    private var VALUE = 1941
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number970()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number3883()
      val right = Number3884()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1940()
    val b = Number1939()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1942 : StressfulInteger {

  companion object {
    private var VALUE = 1942
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number971()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number3885()
      val right = Number3886()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1941()
    val b = Number1940()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1943 : StressfulInteger {

  companion object {
    private var VALUE = 1943
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number971()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number3887()
      val right = Number3888()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1942()
    val b = Number1941()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1944 : StressfulInteger {

  companion object {
    private var VALUE = 1944
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number972()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number3889()
      val right = Number3890()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1943()
    val b = Number1942()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1945 : StressfulInteger {

  companion object {
    private var VALUE = 1945
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number972()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number3891()
      val right = Number3892()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1944()
    val b = Number1943()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1946 : StressfulInteger {

  companion object {
    private var VALUE = 1946
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number973()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number3893()
      val right = Number3894()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1945()
    val b = Number1944()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1947 : StressfulInteger {

  companion object {
    private var VALUE = 1947
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number973()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number3895()
      val right = Number3896()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1946()
    val b = Number1945()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1948 : StressfulInteger {

  companion object {
    private var VALUE = 1948
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number974()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number3897()
      val right = Number3898()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1947()
    val b = Number1946()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1949 : StressfulInteger {

  companion object {
    private var VALUE = 1949
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number974()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number3899()
      val right = Number3900()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1948()
    val b = Number1947()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1950 : StressfulInteger {

  companion object {
    private var VALUE = 1950
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number975()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number3901()
      val right = Number3902()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1949()
    val b = Number1948()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1951 : StressfulInteger {

  companion object {
    private var VALUE = 1951
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number975()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number3903()
      val right = Number3904()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1950()
    val b = Number1949()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1952 : StressfulInteger {

  companion object {
    private var VALUE = 1952
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number976()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number3905()
      val right = Number3906()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1951()
    val b = Number1950()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1953 : StressfulInteger {

  companion object {
    private var VALUE = 1953
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number976()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number3907()
      val right = Number3908()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1952()
    val b = Number1951()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1954 : StressfulInteger {

  companion object {
    private var VALUE = 1954
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number977()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number3909()
      val right = Number3910()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1953()
    val b = Number1952()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1955 : StressfulInteger {

  companion object {
    private var VALUE = 1955
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number977()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number3911()
      val right = Number3912()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1954()
    val b = Number1953()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1956 : StressfulInteger {

  companion object {
    private var VALUE = 1956
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number978()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number3913()
      val right = Number3914()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1955()
    val b = Number1954()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1957 : StressfulInteger {

  companion object {
    private var VALUE = 1957
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number978()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number3915()
      val right = Number3916()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1956()
    val b = Number1955()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1958 : StressfulInteger {

  companion object {
    private var VALUE = 1958
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number979()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number3917()
      val right = Number3918()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1957()
    val b = Number1956()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1959 : StressfulInteger {

  companion object {
    private var VALUE = 1959
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number979()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number3919()
      val right = Number3920()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1958()
    val b = Number1957()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1960 : StressfulInteger {

  companion object {
    private var VALUE = 1960
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number980()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number3921()
      val right = Number3922()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1959()
    val b = Number1958()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1961 : StressfulInteger {

  companion object {
    private var VALUE = 1961
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number980()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number3923()
      val right = Number3924()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1960()
    val b = Number1959()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1962 : StressfulInteger {

  companion object {
    private var VALUE = 1962
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number981()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number3925()
      val right = Number3926()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1961()
    val b = Number1960()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1963 : StressfulInteger {

  companion object {
    private var VALUE = 1963
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number981()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number3927()
      val right = Number3928()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1962()
    val b = Number1961()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1964 : StressfulInteger {

  companion object {
    private var VALUE = 1964
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number982()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number3929()
      val right = Number3930()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1963()
    val b = Number1962()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1965 : StressfulInteger {

  companion object {
    private var VALUE = 1965
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number982()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number3931()
      val right = Number3932()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1964()
    val b = Number1963()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1966 : StressfulInteger {

  companion object {
    private var VALUE = 1966
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number983()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number3933()
      val right = Number3934()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1965()
    val b = Number1964()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1967 : StressfulInteger {

  companion object {
    private var VALUE = 1967
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number983()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number3935()
      val right = Number3936()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1966()
    val b = Number1965()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1968 : StressfulInteger {

  companion object {
    private var VALUE = 1968
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number984()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number3937()
      val right = Number3938()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1967()
    val b = Number1966()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1969 : StressfulInteger {

  companion object {
    private var VALUE = 1969
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number984()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number3939()
      val right = Number3940()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1968()
    val b = Number1967()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1970 : StressfulInteger {

  companion object {
    private var VALUE = 1970
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number985()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number3941()
      val right = Number3942()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1969()
    val b = Number1968()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1971 : StressfulInteger {

  companion object {
    private var VALUE = 1971
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number985()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number3943()
      val right = Number3944()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1970()
    val b = Number1969()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1972 : StressfulInteger {

  companion object {
    private var VALUE = 1972
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number986()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number3945()
      val right = Number3946()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1971()
    val b = Number1970()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1973 : StressfulInteger {

  companion object {
    private var VALUE = 1973
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number986()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number3947()
      val right = Number3948()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1972()
    val b = Number1971()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1974 : StressfulInteger {

  companion object {
    private var VALUE = 1974
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number987()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number3949()
      val right = Number3950()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1973()
    val b = Number1972()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1975 : StressfulInteger {

  companion object {
    private var VALUE = 1975
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number987()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number3951()
      val right = Number3952()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1974()
    val b = Number1973()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1976 : StressfulInteger {

  companion object {
    private var VALUE = 1976
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number988()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number3953()
      val right = Number3954()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1975()
    val b = Number1974()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1977 : StressfulInteger {

  companion object {
    private var VALUE = 1977
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number988()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number3955()
      val right = Number3956()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1976()
    val b = Number1975()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1978 : StressfulInteger {

  companion object {
    private var VALUE = 1978
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number989()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number3957()
      val right = Number3958()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1977()
    val b = Number1976()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1979 : StressfulInteger {

  companion object {
    private var VALUE = 1979
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number989()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number3959()
      val right = Number3960()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1978()
    val b = Number1977()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1980 : StressfulInteger {

  companion object {
    private var VALUE = 1980
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number990()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number3961()
      val right = Number3962()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1979()
    val b = Number1978()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1981 : StressfulInteger {

  companion object {
    private var VALUE = 1981
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number990()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number3963()
      val right = Number3964()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1980()
    val b = Number1979()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1982 : StressfulInteger {

  companion object {
    private var VALUE = 1982
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number991()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number3965()
      val right = Number3966()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1981()
    val b = Number1980()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1983 : StressfulInteger {

  companion object {
    private var VALUE = 1983
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number991()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number3967()
      val right = Number3968()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1982()
    val b = Number1981()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1984 : StressfulInteger {

  companion object {
    private var VALUE = 1984
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number992()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number3969()
      val right = Number3970()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1983()
    val b = Number1982()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1985 : StressfulInteger {

  companion object {
    private var VALUE = 1985
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number992()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number3971()
      val right = Number3972()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1984()
    val b = Number1983()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1986 : StressfulInteger {

  companion object {
    private var VALUE = 1986
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number993()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number3973()
      val right = Number3974()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1985()
    val b = Number1984()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1987 : StressfulInteger {

  companion object {
    private var VALUE = 1987
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number993()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number3975()
      val right = Number3976()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1986()
    val b = Number1985()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1988 : StressfulInteger {

  companion object {
    private var VALUE = 1988
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number994()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number3977()
      val right = Number3978()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1987()
    val b = Number1986()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1989 : StressfulInteger {

  companion object {
    private var VALUE = 1989
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number994()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number3979()
      val right = Number3980()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1988()
    val b = Number1987()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1990 : StressfulInteger {

  companion object {
    private var VALUE = 1990
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number995()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number3981()
      val right = Number3982()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1989()
    val b = Number1988()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1991 : StressfulInteger {

  companion object {
    private var VALUE = 1991
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number995()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number3983()
      val right = Number3984()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1990()
    val b = Number1989()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1992 : StressfulInteger {

  companion object {
    private var VALUE = 1992
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number996()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number3985()
      val right = Number3986()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1991()
    val b = Number1990()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1993 : StressfulInteger {

  companion object {
    private var VALUE = 1993
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number996()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number3987()
      val right = Number3988()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1992()
    val b = Number1991()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1994 : StressfulInteger {

  companion object {
    private var VALUE = 1994
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number997()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number3989()
      val right = Number3990()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1993()
    val b = Number1992()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1995 : StressfulInteger {

  companion object {
    private var VALUE = 1995
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number997()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number3991()
      val right = Number3992()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1994()
    val b = Number1993()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1996 : StressfulInteger {

  companion object {
    private var VALUE = 1996
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number998()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number3993()
      val right = Number3994()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1995()
    val b = Number1994()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1997 : StressfulInteger {

  companion object {
    private var VALUE = 1997
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number998()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number3995()
      val right = Number3996()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1996()
    val b = Number1995()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1998 : StressfulInteger {

  companion object {
    private var VALUE = 1998
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number999()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number3997()
      val right = Number3998()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1997()
    val b = Number1996()
    return a.fib() + b.fib()
  }
}

@Suppress("MatchingDeclarationName")
class Number1999 : StressfulInteger {

  companion object {
    private var VALUE = 1999
  }

  override fun value(): Int {
    return VALUE
  }

  override fun half(): StressfulInteger {
    return Number999()
  }

  override fun sumTo(limit: StressfulInteger): Int {
    if (value() >= limit.value()) {
      return 0
    } else {
      val left = Number3999()
      val right = Number4000()
      return value() + left.sumTo(limit) + right.sumTo(limit)
    }
  }

  override fun fib(): Int {
    val a = Number1998()
    val b = Number1997()
    return a.fib() + b.fib()
  }
}
