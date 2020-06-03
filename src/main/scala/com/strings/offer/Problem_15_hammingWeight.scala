package com.strings.offer

object Problem_15_hammingWeight {

  def hammingWeight(n:Int)  ={
    var nn = n
    var res = 0
    while(nn != 0) {
      res += 1
      nn &= nn - 1
    }
    res
  }

  def main(args: Array[String]): Unit = {
    val n:Int = 0x209
    println(hammingWeight(n))
  }

}
