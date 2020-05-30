package com.strings.leetcode.array

object Problem_697_findShortestSubArray {

  def main(args: Array[String]): Unit = {
    val nums = Array(1,2,2,3,1,4,2)
    findShortestSubArray(nums)
  }

  def findShortestSubArray(nums: Array[Int]): Int = {
   val map =  nums.map((_,1)).groupBy(_._1).map(x => (x._1,x._2.size))
    println(map)
    val degree = map.values.max
    1
  }
}
