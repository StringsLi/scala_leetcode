package com.strings.offer

object Problem_17_printNumbers {

  def printNumbers(n: Int): Array[Int] = {
    val max_num = scala.math.pow(10,n).toInt
    (1 until max_num).toArray
  }

}
