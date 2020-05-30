package com.strings.euler

object P004 {

  def palindrome (value :String) =
    value.substring(0, value.length/2) == value.substring(value.length/2).reverse

  def main(args: Array[String]): Unit = {
    val nums1 = scala.collection.immutable.List.range(999,100,-1)
    val nums2 = scala.collection.immutable.List.range(999,100,-1)

    val ret = for(a <- nums1;b<-nums2 if palindrome((a*b) .toString)) yield a * b

    println(ret.max)

  }

}
