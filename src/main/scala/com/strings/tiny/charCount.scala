package com.strings.tiny

object charCount {

  def main(args: Array[String]): Unit = {
    val ss = "abcMMssdf".foldLeft(Map[Char,Int]())((m,c) => m + (c -> (m.getOrElse(c,0) + 1)))
    println(ss)
  }

}
