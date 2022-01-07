package linkedlist.lntroduction;

public class SolutionOddEvenLinkedList {

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
    public static ListNode oddEvenList(ListNode head) {

        if (head == null) {
            return head;
        }
        ListNode odd = head;
        ListNode even = head.next;
        ListNode evenHead = even;

        while (even != null && even.next != null) {
            odd.next = odd.next.next;
            even.next = even.next.next;
            odd = odd.next;
            even = even.next;
        }
        odd.next = evenHead;
        return head;
    }

    public static void main(String[] args) {

       /* Input: head = [1,2,3,4,5]
        Output: [1,3,5,2,4]*/

        MyLinkedList2 list = new MyLinkedList2();
        list.addAtHead(5);
        list.addAtHead(4);
        list.addAtHead(3);
        list.addAtHead(2);
        list.addAtHead(1);

        oddEvenList(list.first);
    }
}
