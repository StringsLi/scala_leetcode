package com.strings.offer


class ListNode(var _x: Int = 0) {
   var next: ListNode = null
    var x: Int = _x
  }

object Problem_18_deletNode {

  def deleteNode(head: ListNode, `val`: Int): ListNode = {
    var _head = head
    val dummy = new ListNode(-1)
    dummy.next = _head

    if(_head.x == `val`){
      return _head.next
    }
    while(_head != null && _head.next != null){
      if(_head.next.x == `val`){
        _head.next = _head.next.next
      }
      _head = _head.next
    }

    dummy.next
  }

}
