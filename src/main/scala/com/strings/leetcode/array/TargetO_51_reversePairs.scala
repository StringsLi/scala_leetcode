package com.strings.leetcode.array

object TargetO_51_reversePairs {

  def main(args: Array[String]): Unit = {
    val nums = Array(7,5,6,4)
    println(reversePairs(nums))
  }


  // 超时
  def reversePairs(nums: Array[Int]): Int = {
    var count = 0
    for(i <- 0 until nums.length){
      for(j <- 0 until nums.length if i > j){
        if(nums(j) > nums(i)) count += 1
      }
    }
    count
  }

}
