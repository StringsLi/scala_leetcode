package com.strings.offer

object Problem_45_minNumber {

  def main(args: Array[String]): Unit = {
    val nums = Array(3,30,34,5,9)
    println(minNumber(nums))

  }

  def minNumber(nums:Array[Int]): String ={
    nums.map(_.toString).sortWith((a, b) => (a + b) < (b + a)).mkString("")
  }

}
