package com.strings.offer

object Problem_11_minArr {

  def minArray(numbers: Array[Int]): Int = {
    if(numbers.length == 0) return 0
    var min = Int.MaxValue
    for(i <- 0 until numbers.length){
      if(min > numbers(i)){
        min = numbers(i)
      }
    }
    min
  }

  /**
   * 使用二分查找的方法
   * @param numbers
   * @return
   */
  def minArray2(numbers: Array[Int]): Int = {
    var left = 0
    var right = numbers.length - 1
    while (left < right){
      val mid = (left + right) /2
      if(numbers(mid) > numbers(right)) left = mid + 1
      else if(numbers(mid) < numbers(right)) right = mid
      else right = right - 1
    }
    numbers(left)
  }

  def main(args: Array[String]): Unit = {
    val nums = Array(1,2,4,5)
    println(minArray2(nums))
  }

}
