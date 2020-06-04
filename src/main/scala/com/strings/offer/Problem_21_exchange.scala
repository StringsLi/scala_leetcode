package com.strings.offer

object Problem_21_exchange {
  def exchange(nums: Array[Int]): Array[Int] = {

    nums.filter(_% 2 == 1) ++ nums.filter(_%2 == 0)

  }

}
