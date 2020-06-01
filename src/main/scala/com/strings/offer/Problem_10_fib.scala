package com.strings.offer

object Problem_10_fib {

  def fib(n: Int): Int = {
    if(n == 0){
      return 0
    }
    if(n <= 2){
      return 1
    }
    var curr = 0
    var prev1 = 1
    var prev2 = 1
    for(_ <- 3 until n+1) {
      curr = prev1 + prev2
      prev2 = prev1
      prev1 = curr
    }
    curr%1000000007
  }

  def main(args: Array[String]): Unit = {
    println(fib(48))
  }

}
