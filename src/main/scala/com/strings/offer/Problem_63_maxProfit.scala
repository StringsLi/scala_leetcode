package com.strings.offer

object Problem_63_maxProfit {

  def main(args: Array[String]): Unit = {
    val prices = Array(7,1,5,3,6,4)
    println(maxProfit(prices))
  }

  def maxProfit(prices: Array[Int]): Int = {
    if(prices.length == 0) return 0
    var profit = 0
    var minV = prices(0)
    for(i <- 1 until prices.length){
      minV = math.min(prices(i),minV)
      profit = math.max(profit,prices(i) - minV)
    }

    profit

  }

}
