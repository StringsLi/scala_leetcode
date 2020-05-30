package com.strings.leetcode.string

/**
 *
 * 1347. 制造字母异位词的最小步骤数
 */

object TwoWeek_01_minSteps {

  def main(args: Array[String]): Unit = {

    val s = "friend"
    val t = "family"

    println(minSteps(s,t))

  }

  def minSteps(s: String, t: String): Int = {
    val s_freq = calFre(s)
    val t_freq = calFre(t)

    val same_size = s_freq.zip(t_freq).map(x => scala.math.min(x._1,x._2)).sum

    s.length - same_size

  }


  def calFre(str: String): Array[Int] = {
    val fre: Array[Int] = Array.ofDim(26)
    for (chr <- str) {
      fre(chr - 'a') += 1
    }
    fre
  }

}
