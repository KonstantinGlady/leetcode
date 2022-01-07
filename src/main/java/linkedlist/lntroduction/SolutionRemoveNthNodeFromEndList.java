package linkedlist.lntroduction;

public class SolutionRemoveNthNodeFromEndList {

  /*  Input: head = [1,2,3,4,5], n = 2
    Output: [1,2,3,5]*/

    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode left = head;
        ListNode right = head;
        int count = 0;

        while (right.next != null) {
            right = right.next;
            if (count >= n) {
                left = left.next;
            }
            count++;
        }

        if (count < n) {
            head = head.next;
        } else {
            left.next = left.next.next;
        }
        return head;
    }


    public static class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }
}
