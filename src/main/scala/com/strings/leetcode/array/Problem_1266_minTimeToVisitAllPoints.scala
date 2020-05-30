package com.strings.leetcode.array

object Problem_1266_minTimeToVisitAllPoints {

  def main(args: Array[String]): Unit = {
    val points = Array(Array(1, 1), Array(3, 4), Array(-1, 0))
    println(minTimeToVisitAllPoints(points))
  }

  def minTimeToVisitAllPoints(points: Array[Array[Int]]): Int = {
    var sum = 0
    for (i <- 0 until points.length - 1) {
      val x1 = points(i)
      val x2 = points(i + 1)
      val x_abs = scala.math.abs(x1(0) - x2(0))
      val y_abs = scala.math.abs(x1(1) - x2(1))
      sum += scala.math.max(x_abs, y_abs)
    }
    sum
  }

}
