package com.strings.leetcode.array

object Problem_977_sortedSquares {


  def sortedSquares(A: Array[Int]): Array[Int] = {
    val powered: Array[Int] =  A.map(x => scala.math.pow(x,2).toInt)
    powered.sortWith(_ < _)
  }
}
