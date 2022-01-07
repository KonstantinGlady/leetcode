package linkedlist.lntroduction;

import java.util.Arrays;
import java.util.stream.IntStream;

public class SolutionReverseLinkedList {

/*    Input: head = [1,2,3,4,5]
    Output: [5,4,3,2,1]*/

    /**
     * Definition for singly-linked list.
     * public class ListNode {
     * int val;
     * ListNode next;
     * ListNode() {}
     * ListNode(int val) { this.val = val; }
     * ListNode(int val, ListNode next) { this.val = val; this.next = next; }
     * }
     */

    public static ListNode reverseList(ListNode head) {
        ListNode left = null;
        ListNode right = null;
        ListNode mid = head;

        while (mid != null) {
            right = mid.next;
            mid.next = left;
            left = mid;
            mid = right;
        }

        return left;
    }

    public static void main(String[] args) {
        MyLinkedList2 list = new MyLinkedList2();
        list.addAtHead(4);
        list.addAtHead(3);
        list.addAtHead(2);
        list.addAtHead(1);
       reverseList(list.first);
    }

}
