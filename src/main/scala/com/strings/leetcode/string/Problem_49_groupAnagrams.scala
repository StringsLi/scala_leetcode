package com.strings.leetcode.string

object Problem_49_groupAnagrams {

  def groupAnagrams(strs: Array[String]): List[List[String]] = {
//    var map:Map[String,List[String]] = Map()
//
//    for(str <- strs){
//      val keys = str.sorted
//      if(!map.contains(keys)){
//        map += (keys -> scala.collection.immutable.List(str))
//      }else{
//        map.getOrElse(keys,Nil) :+ str
//      }
//    }
//
//    map.values.toList


    strs.map(x => (x.sorted, x)).groupBy(_._1).map(y => y._2.map(_._2).toList).toList

  }

  def main(args: Array[String]): Unit = {
    val strs = Array("eat", "tea", "tan", "ate", "nat", "bat")
    println(groupAnagrams(strs))
  }

}
