package com.strings.leetcode.math

import scala.util.Random
object Problem_1317_getNoZeroIntegers {

  def main(args: Array[String]): Unit = {
    getNoZeroIntegers(11).foreach(println)
  }

  def getNoZeroIntegers(n: Int): Array[Int] = {
    var num1 = Random.nextInt(n-1)
    var num2 = n - num1
    while (containZero(num2) | containZero(num1)){
      num1 = Random.nextInt(n-1)
      num2 = n - num1
    }
    Array(num1,num2)
  }

  def containZero(nums:Int): Boolean ={
    val res = if(nums.toString.contains("0")) true else false
    res
  }

}
