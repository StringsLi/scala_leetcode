package com.strings.offer

object Problem_49_nthUglyNumber {

  def nthUglyNumber(n: Int): Int = {
    val dp = Array.fill(n)(1)
    var u2 = 0
    var u3 = 0
    var u5 = 0
    for(i <- 1 until n){
      dp(i) = scala.math.min(dp(u2)*2,scala.math.min(dp(u3)*3,dp(u5)*5))
      if(dp(i) == dp(u2) * 2) u2 +=1
      if(dp(i) == dp(u3) * 3) u3 +=1
      if(dp(i) == dp(u5) * 5) u5 +=1
    }
    dp(n-1)

  }

  def main(args: Array[String]): Unit = {
    println(nthUglyNumber(10))
  }

}
