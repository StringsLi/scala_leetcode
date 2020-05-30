package com.strings.leetcode.hash

object Problem_136_SingleNum {

  def main(args: Array[String]): Unit = {
    val nums = Array(1,1,2,2,3)
    println(singleNumber(nums))
  }

  def singleNumber(nums: Array[Int]): Int =
    nums.foldLeft(0)((res, num) => res ^ num)

}
