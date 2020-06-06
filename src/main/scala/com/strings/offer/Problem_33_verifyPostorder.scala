package com.strings.offer

/**
 *
 * 递归不当的话，导致堆栈溢出
 *  */

object Problem_33_verifyPostorder {

  def helper(sequece:Array[Int],start:Int,end:Int):Boolean = {
    if(start >= end) return true
    var i = start
    while (sequece(i) < sequece(end)) i += 1
    for(j <- i until end){
      if(sequece(j) < sequece(end)){
        return false
      }
    }
    helper(sequece,start,i-1) && helper(sequece, i,end -1)

  }

  def verifyPostorder(postorder: Array[Int]): Boolean = {
    if(postorder.length <= 0) return true
    helper(postorder,0,postorder.length-1)
  }

  def main(args: Array[String]): Unit = {
    val nums = Array(1,2,5,10,6,9,4,3)
    println(verifyPostorder(nums))
  }

}
