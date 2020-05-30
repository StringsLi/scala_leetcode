package com.strings.leetcode.array

object Problem_1232_checkStraightLine {

  def main(args: Array[String]): Unit = {
    val cor = Array(Array(1, 2), Array(2, 3), Array(3, 4), Array(4, 5))
    val cor2 = Array(Array(1, 2), Array(2, 2), Array(3, 2), Array(4, 2))
    val cor3 = Array(Array(1, 2), Array(2, 2), Array(3, 2), Array(4, 3))
//    println(checkStraightLine(cor))
//    println(checkStraightLine(cor2))
    println(checkStraightLine(cor3))
  }

  def checkStraightLine(coordinates: Array[Array[Int]]): Boolean = {
    if (coordinates.length == 2) true
    else {
      val flag = new Array[Double](coordinates.length - 1)
      for (a <- 1 until coordinates.length) {
        val arr: Array[Int] = coordinates(a)
        if (arr(0) - coordinates(0)(0) == 0) {
          flag(a - 1) = Int.MaxValue
        } else {
          flag(a - 1) = (arr(1).toDouble - coordinates(0)(1).toDouble) / (arr(0).toDouble - coordinates(0)(0).toDouble)
        }
      }
      println(flag.mkString(" "))
      if(flag.toSet.seq.size == 1) true
      else false
    }
  }
}

