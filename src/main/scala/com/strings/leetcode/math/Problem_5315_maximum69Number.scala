package com.strings.leetcode.math

object Problem_5315_maximum69Number {

  def main(args: Array[String]): Unit = {
    println(maximum69Number(9669))
  }

  def maximum69Number (num: Int) = {
      val num_str = num.toString.toCharArray
      var flag = true
      for( i <- 0 until num_str.length if flag){
        if(num_str(i) == '6') {
          num_str(i) = '9'
          flag = false
        }
      }
    num_str.mkString("").toInt
  }

}
