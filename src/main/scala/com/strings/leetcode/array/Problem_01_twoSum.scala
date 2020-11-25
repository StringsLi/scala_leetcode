package com.strings.leetcode.array

import scala.collection.mutable

object Problem_01_twoSum {

  def twoSum(nums: Array[Int], target: Int): Array[Int] = {
    var map:Map[Int,Int] = Map()
    nums.zipWithIndex.foreach{case (value,index) =>
        if(map.contains(target-value)){
          return  Array(map(target - value),index)
        }
        map += (value -> index)
    }
    Array()
  }

  def main(args: Array[String]): Unit = {
    val nums = Array(3,2,4)
    println(twoSum(nums,6).mkString(","))
  }

}
