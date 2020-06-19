package com.strings.leetcode.twopoints

import util.control.Breaks._

object Problem_125_isPalindrome {


  def main(args: Array[String]): Unit = {
    val s = "./"
    println(isPalindrome(s))
    val ss = ':'
    println(ss.isLetterOrDigit)

  }

  def isPalindrome(s: String): Boolean = {
    if(s == null || "".equals(s)) return true
    val ss = s.replace(" ","")
    var left = 0
    var right = ss.length - 1
    // scala 的while 在不满足条件时，还要继续向下执行？？
    while (left < right){
      breakable {
        if (!ss.charAt(left).isLetterOrDigit) {
          left += 1
          break()
        }
      }
      breakable {
        if (!ss.charAt(right).isLetterOrDigit) {
          right -= 1
          break()
        }
      }
      if(ss.charAt(left).toLower != ss.charAt(right).toLower) return false
      left += 1
      right -= 1
    }
    true
  }

}
