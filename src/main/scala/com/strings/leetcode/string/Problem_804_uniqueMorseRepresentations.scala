package com.strings.leetcode.string

import scala.collection.mutable

object Problem_804_uniqueMorseRepresentations {

  def main(args: Array[String]): Unit = {
    val words = Array("gin", "zen", "gig", "msg")
    println(uniqueMorseRepresentations(words))
  }

  def uniqueMorseRepresentations(words:Array[String]) = {
      val mose:Array[String] = Array(".-","-...","-.-.","-..",".","..-.","--.",
                                      "....","..",".---","-.-",".-..","--","-.",
                                      "---",".--.","--.-",".-.","...","-","..-",
                                      "...-",".--","-..-","-.--","--..")
      val set = new mutable.HashSet[String]()
      for(word <- words){
        val sb = new mutable.StringBuilder()
        for(c <- word.toCharArray){
          sb.append(mose(c-'a'))
        }

        set.add(sb.toString())
      }

     set.size
  }

}
