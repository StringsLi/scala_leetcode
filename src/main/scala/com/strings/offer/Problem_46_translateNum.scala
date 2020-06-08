package com.strings.offer

object Problem_46_translateNum {

  def main(args: Array[String]): Unit = {
    val num  =12258
    println(translateNum(num))
  }

  def translateNum(num: Int): Int = {
    val strNums = num.toString.toCharArray
    val size = strNums.size
    val dp = Array.fill(size+1)(0)
    dp(0) = 1
    for(i <- 1 until size+1){
      if(strNums(i-1) >= '0' && strNums(i-1) <= '9'){
        dp(i) += dp(i-1)
      }
      if(i > 1){
        val a = (strNums(i-2) - '0') * 10 + (strNums(i-1) - '0')
        if(a <= 25 && a >= 10){
          dp(i) += dp(i-2)
        }
      }
    }
    dp(size)
  }

}
