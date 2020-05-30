package com.strings.leetcode.array

object Problem_55_canJump {

  def main(args: Array[String]): Unit = {
    val nums1 = Array(3,2,1,0,4)
    println(canJump(nums1))
  }

  def canJump(nums:Array[Int]):Boolean = {
    var k = 0
    for(i <- 0 until nums.length){
      if (i > k) return false
      k = scala.math.max(k, i + nums(i))
    }
    true
  }

}
