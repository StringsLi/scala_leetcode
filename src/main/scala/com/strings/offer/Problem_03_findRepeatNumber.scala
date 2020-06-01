package com.strings.offer

object Problem_03_findRepeatNumber {

  def findRepeatNumber(nums: Array[Int]): Int = {
    val count = nums.foldLeft(Map[Int,Int]())((m,c) => m + (c -> (m.getOrElse(c,0) + 1)))
    count.toList.sortBy(x => -x._2).apply(0)._1
  }

  def main(args: Array[String]): Unit = {
    val nums = Array(2, 3, 1, 0, 2, 5, 3)
    println(findRepeatNumber(nums))
  }

}
