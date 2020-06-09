package com.strings.offer

object Problem_48_lengthOfLongestSubstring {

  def lengthOfLongestSubstring(s: String): Int = {
    val n = s.size
    val sets = scala.collection.mutable.Set[Char]()
    var ans = 0
    var left = 0
    var right = 0
    while (right < n){
      while (sets.contains(s(right))){
        sets.remove(s(left))
        left += 1
      }
      sets.add(s(right))
      right += 1
      ans = scala.math.max(ans,right-left)
    }
    ans
  }

  def main(args: Array[String]): Unit = {
    val s = "abcabcbb"
    println(lengthOfLongestSubstring(s))
  }

}
