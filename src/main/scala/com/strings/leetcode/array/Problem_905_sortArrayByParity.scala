package com.strings.leetcode.array

object Problem_905_sortArrayByParity {

  def sortArrayByParity(A: Array[Int]): Array[Int] = {
     A.filter(_%2==0) ++ A.filter(_%2==1)
  }

}
