package com.strings.offer

object Problem_40_MaxsubArray {

  def main(args: Array[String]): Unit = {
    val nums = Array(-2,1,-3,4,-1,2,1,-5,4)
    println(maxSubArray(nums))
  }


  def maxSubArray(nums: Array[Int]): Int = {

    if (nums.length == 0) return 0
    if (nums.length == 1) return nums(0)
    val dp = new Array[Int](nums.length)
    dp(0) = nums(0)
    var max = dp(0)

    for(i <- 1 until nums.length) {
      if (dp(i - 1) > 0) dp(i) = dp(i - 1) + nums(i)
      else dp(i) = nums(i)
      max = Math.max(dp(i), max)
    }
    max
  }

}
