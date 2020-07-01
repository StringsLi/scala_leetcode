package com.strings.offer

import scala.collection.mutable.ArrayBuffer

object Problem_62_lastRemaining {

  def main(args: Array[String]): Unit = {
    val m = 3
    val n = 5
    println(lastRemaining(n,m))
  }

  def lastRemaining(n: Int, m: Int): Int = {

    val lst:ArrayBuffer[Int]  = new ArrayBuffer[Int](n)
    for(i <- 0 until n){
      lst.append(i)
    }
    var idx = 0
    var _n = n
    while (_n > 1){
      idx = (idx + m - 1) % _n
      lst.remove(idx)
      _n -= 1
    }
    lst.apply(0)
  }

}
