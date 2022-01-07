package linkedlist.lntroduction;

public class SolutionMergeTwoSortedLists {
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

    public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {

        if (list1 == null || list2 == null) {
            return (list1 == null) ? list2 : list1;
        }

        ListNode listNode1 = list1.next;
        ListNode listNode2 = list2.next;
        ListNode temp = new ListNode();
        ListNode out = temp;

        while (listNode1 != null && listNode2 != null) {

            if (listNode1.val > listNode2.val) {
                temp.next = listNode2;
                temp = temp.next; // temp = listNode2; //тоже самое
                listNode2 = listNode2.next;
            } else {
                temp.next = listNode1;
                temp = temp.next; // temp = listNode1; //тоже самое
                listNode1 = listNode1.next;
            }
        }
        if (listNode2 != null) {
            temp.next = listNode2;
        }

        if (listNode1 != null) {
            temp.next = listNode1;
        }

        return out.next;
    }

    public static void main(String[] args) {
      /*  Input: list1 = [1,2,4], list2 = [1,3,4]
        Output: [1,1,2,3,4,4]*/

        MyLinkedList2 list1 = new MyLinkedList2();
        list1.addAtHead(4);
        list1.addAtHead(2);
        list1.addAtHead(1);

        MyLinkedList2 list2 = new MyLinkedList2();
        list2.addAtHead(4);
        list2.addAtHead(3);
        list2.addAtHead(1);
        mergeTwoLists(list1.first, list2.first);

    }

}
