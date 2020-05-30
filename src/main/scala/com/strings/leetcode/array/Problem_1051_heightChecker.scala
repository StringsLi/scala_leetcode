package com.strings.leetcode.array

object Problem_1051_heightChecker {

  def main(args: Array[String]): Unit = {
    val heights = Array(1,1,4,2,1,3)
    println(heightChecker(heights))
  }

  def heightChecker(heights: Array[Int]): Int = {
    val sort = heights.sorted
    heights.zip(sort).filter(x => x._1 != x._2).length
  }

}
