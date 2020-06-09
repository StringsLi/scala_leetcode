package com.strings.offer

object Problem_50_firstUniqChar {

  def firstUniqChar(s: String): Char = {
    val sChar =  s.toCharArray
    val hash = sChar.foldLeft(Map[Char,Int]())((m,c) => m + (c -> (m.getOrElse(c,0) + 1)))
    sChar.foreach{
      char => if(hash.getOrElse(char,0) == 1) return char
    }
    ' '
  }

  def main(args: Array[String]): Unit = {
    val s = ""
    println(firstUniqChar(s))
  }

}
