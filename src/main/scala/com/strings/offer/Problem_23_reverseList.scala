package com.strings.offer


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
