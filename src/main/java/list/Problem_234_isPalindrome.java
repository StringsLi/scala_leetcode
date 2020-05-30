package list;

import java.util.ArrayList;
import java.util.List;

public class Problem_234_isPalindrome {

    public static  class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }

    public static boolean isPalindrome(ListNode head) {
        if(head == null || head.next == null){
            return true;
        }
        List<Integer> lst = new ArrayList<>();
        while (head != null){
            lst.add(head.val);
            head = head.next;
        }
//        System.out.println(lst);

        int left = 0, right = lst.size() -1;

        while (left < right){
            if(lst.get(left).compareTo(lst.get(right)) != 0){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    public static void main(String[] args) {
        ListNode node = new ListNode(1);
        node.next = new ListNode(2);
        node.next.next = new ListNode(1);

        System.out.println(isPalindrome(node));

    }
}
