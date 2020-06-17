package com.strings.leetcode.math

object Problem_1014_maxScoreSightseeingPair {

  def main(args: Array[String]): Unit = {
    val A = Array(8, 1, 5, 2, 6)
    println(maxScoreSightseeingPair(A))
  }


  def maxScoreSightseeingPair(A: Array[Int]): Int = {
    var ans = 0
    var mx = A(0) + 0
    for (j <- 1 until  A.length) {
      ans = math.max(ans, mx + A(j) - j)
      mx = math.max(mx, A(j) + j)
    }
    ans


  }

}
