package com.strings.leetcode.array

object Problem_896__isMonotonic {

  def main(args: Array[String]): Unit = {
    val A = Array(4,2,2,1)
    println(isMonotonic(A))
  }

  def isMonotonic(A :Array[Int]): Boolean ={
    val size = A.length - 1
    val A_diff:Array[Int] = new Array[Int](size)
    for(i <- 0 until A.length - 1){
      A_diff(i) = A(i+1) - A(i)
    }

    A_diff.map(x => if(x >= 0) 1 else 0).sum == size |
      A_diff.map(x => if(x <= 0) 1 else 0).sum == size

  }

}
