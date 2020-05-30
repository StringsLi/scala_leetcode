package com.strings.leetcode.string

object Problem_1221_balancedStringSplit {

  def main(args: Array[String]): Unit = {
    val s = "LRLRLLRRRL"
    println(balancedStringSplit(s))
  }

  def balancedStringSplit(s:String)={
    var num:Int = 0
    var res:Int = 0
    for(c <- s.toCharArray){
      if(c == 'L') num = num + 1
      else num = num - 1
      if(num == 0) res = res + 1
    }
    res
  }

}
