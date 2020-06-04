package com.strings.offer

class ListNode(var _x: Int = 0) {
  var next: ListNode = null
  var x: Int = _x
}

/**
 * 好好理解下，并没有很好的掌握
 */


object Problem_23_reverseList {

  def reverseList(head: ListNode): ListNode = {
    var pre:ListNode = null
    var cur = head
    var tmp:ListNode = null
    while(cur != null){
      tmp = cur.next
      cur.next = pre
      pre = cur
      cur = tmp
    }

    pre

  }

}
