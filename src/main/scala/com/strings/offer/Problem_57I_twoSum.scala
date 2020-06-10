package com.strings.offer

object Problem_57I_twoSum {

  def twoSum(nums: Array[Int], target: Int): Array[Int] = {

    var map: Map[Int, Int] = Map()
    for((value,index) <- nums.zipWithIndex){
      if(map.contains(value)) return Array(nums(map(value)),nums(index))
      else map += target - value -> index
    }
   Array()
  }

  def main(args: Array[String]): Unit = {
    val nums = Array(2,7,11,15)
    println(twoSum(nums,9).toList)
  }

}
