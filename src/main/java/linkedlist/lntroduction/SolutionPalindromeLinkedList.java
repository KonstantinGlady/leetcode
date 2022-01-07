package linkedlist.lntroduction;

public class SolutionPalindromeLinkedList {

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

    public static boolean isPalindrome(ListNode head) {

        ListNode slow = head;
        ListNode fast = head;

        if (fast == null || fast.next == null ) {
            return true;
        }

        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        slow = reverseRightSide(slow.next);

        while (slow != null) {
            if (head.next.val != slow.val) {
                return false;
            }
            slow = slow.next;
            head = head.next;
        }
        return true;
    }

    private static ListNode reverseRightSide(ListNode next) {
        ListNode mid = next;
        ListNode left = null;
        ListNode right = null;

        while (mid != null) {
            right = mid.next;
            mid.next = left;
            left = mid;
            mid = right;
        }
        return left;
    }

    public static void main(String[] args) {

    /*    Input: head = [1,2,2,1]
        Output: true*/

        MyLinkedList2 list = new MyLinkedList2();
      /*  list.addAtHead(1);
        list.addAtHead(2);*/
        list.addAtHead(2);
        list.addAtHead(1);
        System.out.println(isPalindrome(list.first));
    }

}
