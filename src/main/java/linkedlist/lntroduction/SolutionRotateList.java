package linkedlist.lntroduction;

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
class SolutionRotateList {


    public static ListNode rotateRight(ListNode head, int k) {

        if (head == null) {
            return head;
        }
        ListNode left;
        ListNode countNode = head;
        ListNode last = null;
        int size = 0;

        while (countNode != null) {
            last = countNode;
            countNode = countNode.next;
            size++;
        }

        k = size - (k % size);
        left = head;

        for (int i = 1; i < k; i++) {
            left = left.next;
        }

        last.next = head;
        head = left.next;
        left.next = null;

        return head;
    }

    public static void main(String[] args) {

        /* Input: head = [1,2,3,4,5], k = 2
        Output: [4,5,1,2,3]*/

        MyLinkedList2 list = new MyLinkedList2();
        list.addAtTail(1);
        list.addAtTail(2);
        list.addAtTail(3);
        list.addAtTail(4);
        list.addAtTail(5);

        rotateRight(list.first, 2);
    }
}
