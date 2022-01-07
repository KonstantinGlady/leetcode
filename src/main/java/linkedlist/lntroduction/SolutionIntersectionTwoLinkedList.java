package linkedlist.lntroduction;

public class SolutionIntersectionTwoLinkedList {

 /*       Input: intersectVal = 8, listA = [4,1,8,4,5], listB = [5,6,1,8,4,5], skipA = 2, skipB = 3
        Output: Intersected at '8'
        Explanation: The intersected node's value is 8 (note that this must not be 0 if the two lists intersect).
        From the head of A, it reads as [4,1,8,4,5]. From the head of B, it reads as [5,6,1,8,4,5]. There are 2 nodes
        before the intersected node in A; There are 3 nodes before the intersected node in B.
 */

    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {

        int lenA = getNodeLength(headA);
        int lenB = getNodeLength(headB);

        int dif = Math.abs(lenA - lenB);

        if (lenA > lenB) {
            for (int i = 0; i < dif; i++) {
                headA = headA.next;
            }
        } else {
            for (int i = 0; i < dif; i++) {
                headB = headB.next;
            }
        }

        while (headA != headB) {

            if (headA == null || headB == null) {
                return null;
            }
            headA = headA.next;
            headB = headB.next;
        }
        return headA;
    }

    private int getNodeLength(ListNode node) {
        int len = 0;
        while (node != null) {
            node = node.next;
            len++;
        }
        return len;
    }


    public static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
            next = null;
        }
    }
}
