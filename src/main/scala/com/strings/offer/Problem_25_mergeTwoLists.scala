package com.strings.offer

class ListNode(var _x: Int = 0) {
  var next: ListNode = null
  var x: Int = _x
}

object Problem_25_mergeTwoLists {

  def mergeTwoLists(l1: ListNode, l2: ListNode): ListNode = {
    val dummy = new ListNode(-1)
    var p = dummy

    var _l1 = l1
    var _l2 = l2
    while (_l1 != null && _l2 != null){
      if(_l1.x < _l2.x){
        p.next = _l1
        _l1 = _l1.next
      }else{
        p.next = _l2
        _l2 = _l2.next
      }
      p = p.next
    }

    p.next = if(_l1 != null) _l1 else _l2

    dummy.next

  }

}
