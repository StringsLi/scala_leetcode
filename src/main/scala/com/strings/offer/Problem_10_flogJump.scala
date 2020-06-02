package com.strings.offer

object Problem_10_flogJump {

  def numWays(n: Int): Int = {
    if(n <= 0) return 0
    if(n == 1) return 1
    if(n == 2) return 2

    var curr = 0
    var prev1 = 1
    var prev2 = 2
    for(_ <- 3 until n+1){
      curr = (prev1 + prev2)%1000000007
      prev1 = prev2
      prev2 = curr
    }
    curr
  }

  def main(args: Array[String]): Unit = {
    println(numWays(46))
  }

}
