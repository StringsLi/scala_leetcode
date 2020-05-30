package com.strings.leetcode.math

object Problem_179_MaxNums {

  def main(args: Array[String]): Unit = {
    val nums = Array(3,30,34,5,9)
    largestNumber(nums)
  }

  def largestNumber(nums: Array[Int]): String = {
    val ss = nums.sortWith((x,y) => x.toString.charAt(0).toInt > y.toString.charAt(0).toInt )
    println(ss.mkString("-"))
    ""
  }
}
