package com.strings.offer

object Problem_59_maxSlidingWindow {

  def maxSlidingWindow(nums: Array[Int], k: Int): Array[Int] = {
    if(nums.length == 0) return Array()
    val res = new Array[Int](nums.length - k+1)
    for(i <- 0 until nums.length - k+1){
      res(i) = nums.slice(i,i+k).max
    }
    res
  }

  def main(args: Array[String]): Unit = {
    val nums = Array(1,3,-1,-3,5,3,6,7)
    val k = 3
    println(maxSlidingWindow(nums,k).toList)
  }

}
