package com.strings.leetcode.string

/**
 *
 * scala 版本的一直有问题【主要是使用s.split("\\+")】
 */

object Problem_557_reverseWords {

  def main(args: Array[String]): Unit = {
    val s = "Let's take LeetCode contest"
    println(reverseWords2(s))
    println(reverseWords(s))

  }

  def reverseWords(s: String): String = {
    val words = s.split(" ")
    val res = new StringBuilder
    for(word <- words){
      res.append(new StringBuffer(word).reverse().toString + " ")
    }
    res.toString().trim
  }

  def reverse(s:String) ={
    val  res=new StringBuilder()
    for(i <- 0 until s.length)
    res.insert(0,s.charAt(i))
    res.toString()
  }


  def reverseWords2(s: String) = {
    s.split(" ").map(x => x.reverse).mkString(" ")
  }

}
