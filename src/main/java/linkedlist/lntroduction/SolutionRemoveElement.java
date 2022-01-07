package linkedlist.lntroduction;

public class SolutionRemoveElement {

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

    public static ListNode removeElements(ListNode head, int val) {
        ListNode first = head;

        if (first == null) {
            return head;
        }

        while (first.next != null) {

            if (first.next.val == val) {
                first.next = first.next.next;

            } else {
                first = first.next;
            }
        }
        return (head.val == val) ? head.next : head;
    }

    public static void main(String[] args) {
/*
        Input: head = [1,2,6,3,4,5,6], val = 6
        Output: [1,2,3,4,5]*/

        MyLinkedList2 list = new MyLinkedList2();
        list.addAtHead(6);
        list.addAtHead(5);
        list.addAtHead(4);
        list.addAtHead(3);
        list.addAtHead(6);
        list.addAtHead(2);
        list.addAtHead(1);

        removeElements(list.first, 6);
    }
}
