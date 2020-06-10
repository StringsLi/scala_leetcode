package com.strings.offer

object Problem_58_reverseWords {

  def reverseWords(s: String): String = {
    s.trim.split("\\s++").map(_.trim).reverse.mkString(" ")
  }

  def main(args: Array[String]): Unit = {
    val s = Array("the sky is blue",
      "  hello world!  ",
      "a good   example")
    s.foreach(x => println(reverseWords(x)))
  }

}
