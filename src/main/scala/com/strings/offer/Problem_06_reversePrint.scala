package com.strings.offer

import scala.collection.mutable.ArrayBuffer


class ListNode(var _x: Int = 0) {
   var next: ListNode = null
   var x: Int = _x
 }

object Problem_06_reversePrint {

  def reversePrint(head: ListNode): Array[Int] = {
    var node = head
    val res:ArrayBuffer[Int] = new ArrayBuffer[Int]()
    while (node != null){
      res.append(node.x)
      node = node.next
    }
    res.toArray.reverse
  }

  def main(args: Array[String]): Unit = {
    val head = new ListNode(1)
    head.next = new ListNode(3)
    head.next.next = new ListNode(2)

    println(reversePrint(head).toList)
  }

}
