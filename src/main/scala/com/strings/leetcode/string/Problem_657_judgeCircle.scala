package com.strings.leetcode.string

object Problem_657_judgeCircle {

  def main(args: Array[String]): Unit = {
    val moves = "LL"
    println(judgeCircle(moves))
  }


  def judgeCircle(moves: String): Boolean = {
    var num_vertical = 0
    var num_horizontal = 0
    for(c <- moves.toCharArray){
      if(c == 'R') num_horizontal = num_horizontal + 1
      if(c == 'L') num_horizontal = num_horizontal - 1
      if(c == 'U') num_vertical = num_vertical + 1
      if(c == 'D') num_vertical = num_vertical - 1
    }
    if(scala.math.abs(num_horizontal) + scala.math.abs(num_vertical)== 0) true
    else false
  }

}
