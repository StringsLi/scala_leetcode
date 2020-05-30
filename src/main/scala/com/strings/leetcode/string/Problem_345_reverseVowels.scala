package com.strings.leetcode.string

import scala.collection.mutable.ArrayBuffer

object Problem_345_reverseVowels {

  def main(args: Array[String]): Unit = {
    val s = "leetcode"
    println(reverseVowels(s))
  }

  def reverseVowels(s: String): String = {
    val vowels:ArrayBuffer[Char] = new ArrayBuffer[Char]()
    for(chr <- s.toCharArray){
      if(Array('a','e','i','o','u').contains(chr.toLower)){
        vowels.append(chr)
      }
    }
    val vowels_rev = vowels.reverse
    val res:Array[Char] = new Array[Char](s.length)
    var count = 0
    for(i <- 0 until s.length){
      if(Array('a','e','i','o','u').contains(s.charAt(i).toLower)){
        res(i) = vowels_rev(count)
        count += 1
      }else{
        res(i) = s.charAt(i)
      }
    }
    res.mkString("")
  }

}
