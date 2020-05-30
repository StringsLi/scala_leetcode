package com.strings.leetcode.string

object Problem_925_isLongPressedName {

  def main(args: Array[String]): Unit = {
    val name = "saeed"
    val typed = "ssaaedd"
    println(isLongPressedName2(name, typed))
    println(isLongPressedName(name, typed))
  }

  /**
   * 还是有些问题
   * @param name
   * @param typed
   * @return
   */
  def isLongPressedName2(name: String, typed: String): Boolean ={
    val c1 = name.toCharArray
    val c2 = typed.toCharArray
    var p1 = 0
    var p2 = 0
    while (p1 < c1.length & p2 < c2.length){
      if(c1(p1) == c2(p2)) p1 += 1
      else p2 += 1
    }
    p1 == c1.length
}


  /**
   *  有问题，
   * @param name
   * @param typed
   * @return
   */
  def isLongPressedName(name: String, typed: String): Boolean = {
    val name_size = calFre(name)
    val tpyed_size = calFre(typed)
    name_size.zip(tpyed_size).map(x => x._2 - x._1).map(x => if(x >= 0) 1 else 0).sum >= 26
  }

  def calFre(str: String): Array[Int] = {
    val fre: Array[Int] = Array.ofDim(26)
    for (chr <- str) {
      fre(chr - 'a') += 1
    }
    fre
  }

}
