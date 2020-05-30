package com.strings.leetcode.string

object Problem_383_canConstruct {

  def main(args: Array[String]): Unit = {
    val str = "aa"
    val str2 = "ab"
    println(canConstruct(str,str2))
    println(calFre(str).mkString("-"))
  }

  def canConstruct(ransomNote: String, magazine: String): Boolean = {
    val ransomCount = calFre(ransomNote)
    val magazieCount = calFre(magazine)
    var count = 0
    for(i <- 0 until 26){
      if (ransomCount(i) > magazieCount(i))
        count = count + 1
    }

    if (count > 0) {
      false
    } else {
      true
    }

  }

  def calFre(str: String): Array[Int] = {
    val fre: Array[Int] = Array.ofDim(26)
    for (chr <- str) {
      fre(chr - 'a') = fre(chr - 'a') + 1
    }
    fre
  }

}
