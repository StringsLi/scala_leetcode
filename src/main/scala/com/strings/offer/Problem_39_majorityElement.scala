package com.strings.offer

object Problem_39_majorityElement {

  def majorityElement(nums: Array[Int]): Int = {
    val nums_sort = nums.sorted
    nums_sort(nums.length/2)
  }

}
