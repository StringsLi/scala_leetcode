package com.strings.offer

object Problem_58II_reverseLeftWords {

  def reverseLeftWords(s: String, n: Int): String = {
    s.substring(n).concat(s.substring(0,n))
  }

  def main(args: Array[String]): Unit = {
    val s = "abcdefg"
    val k = 2
    println(reverseLeftWords(s,k))
  }

}
