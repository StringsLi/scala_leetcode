package com.strings.leetcode.array

object Problem_1013_canThreePartsEqualSum {

  def main(args: Array[String]): Unit = {
//    val A = Array(0,2,1,-6,6,-7,9,1,2,0)
    val A = Array(10,-10,10,-10,10,-10,10,-10)
    println(canThreePartsEqualSum(A))
  }

  def canThreePartsEqualSum(A:Array[Int]) = {
    val rev = A.sum / 3
    var res = 0
    var count = 0

    for(i <- 0 until A.length){
      res += A(i)
      if(res == rev){
        count += 1
        res = 0
      }
    }
    count == 3 || (count > 3 && res == 0)
  }

}
