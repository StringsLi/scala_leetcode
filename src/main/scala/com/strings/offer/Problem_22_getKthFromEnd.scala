package com.strings.offer



object Problem_22_getKthFromEnd {
  class ListNode(var _x: Int = 0) {
    var next: ListNode = null
    var x: Int = _x
  }

  def getKthFromEnd(head: ListNode, k: Int): ListNode = {
    var fast = head
    var slow = head

    for(_ <- 0 until k){
      fast = fast.next
    }
    while (fast != null){
      fast = fast.next
      slow = slow.next
    }
    slow

  }

}
