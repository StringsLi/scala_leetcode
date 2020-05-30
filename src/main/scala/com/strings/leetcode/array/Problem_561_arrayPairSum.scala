package com.strings.leetcode.array

object Problem_561_arrayPairSum {
  def main(args: Array[String]): Unit = {
    val nums = Array(1,4,3,2)
    println(arrayPairSum(nums))
  }

  def arrayPairSum(nums: Array[Int]): Int = {
    nums.sorted.zipWithIndex.withFilter(_._2 % 2 == 0).map(_._1).sum
  }

}
