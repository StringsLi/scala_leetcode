package com.strings.leetcode.hash

object Problem_500_findWords {

  def main(args: Array[String]): Unit = {
    val words = Array("Hello", "Alaska", "Dad", "Peace")
    println(findWords(words).toList)
  }

  def findWords(words: Array[String])= {
    val alpha1 = "QWERTYUIOP"
    val alpha2 = "ASDFGHJKL"
    val alpha3 = "ZXCVBNM"
//    val alpha = Array("QWERTYUIOP","ASDFGHJKL","ZXCVBNM")

    var map:Map[Char,Int] = Map()
    for(c <- alpha1){
      map += (c -> 1)
      map += ((c+32).toChar -> 1)
    }
    for(c <- alpha1){
      map += (c -> 1)
      map += ((c+32).toChar -> 1)
    }

    for(c <- alpha2){
      map += (c -> 2)
      map += ((c+32).toChar -> 2)
    }

    for(c <- alpha3){
      map += (c -> 3)
      map += ((c+32).toChar -> 3)
    }

    words.filter{word => word.toCharArray.map(map.getOrElse(_,0)).toSet.size == 1}
  }

}
