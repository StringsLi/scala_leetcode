package com.strings.offer

object Problem_53s_search {

  def main(args: Array[String]): Unit = {
    val nums = Array(5,7,7,8,8,10)
    println(search(nums,8))
  }

  def search(nums: Array[Int], target: Int): Int = {
    if(nums.length == 0) return 0
    var left = 0
    var right = nums.length - 1
    while (left <= right){
      val mid = left + (right - left) / 2
      if(target == nums(mid)) {
        var i = mid
        var j = mid
        while(i >= 0 && nums(i) == target) i -= 1
        while (j <= nums.length - 1 && nums(j) == target) j += 1
        return j - i - 1
      }else if(target > nums(mid)){
        left = mid + 1
      }else{
        right = mid - 1
      }
    }
    0
  }


}
