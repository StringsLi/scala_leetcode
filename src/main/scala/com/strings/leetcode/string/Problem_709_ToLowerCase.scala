package com.strings.leetcode.string

object Problem_709_ToLowerCase {

  def main(args: Array[String]): Unit = {
    val str  = "LOVELY"
    println(toLowerCase2(str))
    println(toLowerCase(str))
  }

  def toLowerCase(str: String): String = {
    str.map{
      chr => if( chr >= 'A' & chr <= 'Z') (chr + 32).toChar else chr
    }
  }

  def toLowerCase2(str: String): String = {
    str.toLowerCase
  }

}
