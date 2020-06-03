package com.strings.offer

object Problem_16_myPow {

  /**
   *  这种写法会堆栈溢出，查找一下原因
   * @param x
   * @param n
   * @return
   */
  def myPow2(x: Double, n: Int): Double = {
    if(n == 0){
      return 1.0
    }
    if(x == 1.0) return 1.0
    if(n < 0){
      return 1/myPow(x,-n)
    }
    if(n % 2 == 1){
      return x * myPow(x,n-1)
    }
    myPow(x * x, n / 2)

  }

  def fastPow(x:Double,n:Long):Double = {
    if(n == 0) return 1.0
    val A = fastPow(x,n/2)
    if(n % 2 == 0)  A * A
    else  A * A * x
  }

  def myPow(x: Double, n: Int): Double = {
    var N:Long = n
    var _x = x
    if(N < 0){
      _x = 1 / _x
      N = -N
    }
    fastPow(_x,N)
  }

  def main(args: Array[String]): Unit = {
    println(myPow(2.00000,
      -2147483648))
  }
}
