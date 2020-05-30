package com.strings.leetcode.math

/**
 *
给定一个正整数，检查他是否为交替位二进制数：换句话说，就是他的二进制数相邻的两个位数永不相等。

示例 1:

输入: 5
输出: True
解释:
5的二进制数是: 101
示例 2:

输入: 7
输出: False
解释:
7的二进制数是: 111

来源：力扣（LeetCode）
链接：https://leetcode-cn.com/problems/binary-number-with-alternating-bits
著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 *
 */

object Problem_693_hasAlternatingBits {

  def main(args: Array[String]): Unit = {
    println(hasAlternatingBits(22))
  }

  def hasAlternatingBits(N:Int):Boolean ={
    val N_string = N.toBinaryString
    for(i <- 1 until N_string.length){
      if(N_string(i) == N_string(i-1)) return false
    }
    true
  }



}
