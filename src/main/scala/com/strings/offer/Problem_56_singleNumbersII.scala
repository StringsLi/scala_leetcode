package com.strings.offer

object Problem_56_singleNumbersII {

  def singleNumbers(nums: Array[Int]): Int = {
    val count = nums.foldLeft(Map[Int,Int]())((m,c) => m + (c -> (m.getOrElse(c,0) + 1)))
    count.filter(x => x._2 == 1).keys.toList(0)

  }

}
