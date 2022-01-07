package linkedlist.lntroduction;

class SolutionAddTwoNumbers {

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        int a = 0;
        int b = 0;
        int dig = 0;
        int prevDig = 0;
        ListNode result = new ListNode();
        ListNode out = result;

        while (l1 != null || l2 != null) {
            a = (l1 != null) ? l1.val : 0;
            b = (l2 != null) ? l2.val : 0;
            dig = (a + b + prevDig) % 10;
            prevDig = (a + b + prevDig) / 10;
            result.next = new ListNode(dig);
            result = result.next;

            if (l1 != null) {
                l1 = l1.next;
            }
            if (l2 != null) {
                l2 = l2.next;
            }
        }

        if (prevDig > 0) {
            result.next = new ListNode(prevDig);
        }
        return out.next;
    }

    public static void main(String[] args) {

        /*  Input: l1 = [2,4,3], l2 = [5,6,4]
    Output: [7,0,8]
    Explanation: 342 + 465 = 807.*/

     /*   MyLinkedList2 list1 = new MyLinkedList2();
        list1.addAtTail(2);
        list1.addAtTail(4);
        list1.addAtTail(3);

        MyLinkedList2 list2 = new MyLinkedList2();
        list2.addAtTail(5);
        list2.addAtTail(6);
        list2.addAtTail(4);

        addTwoNumbers(list1.first, list2.first);*/

         /*    Input:
             [9,9,9,9,9,9,9]
             [9,9,9,9]
               Expected:
            [8,9,9,9,0,0,0,1]*/

        MyLinkedList2 list1 = new MyLinkedList2();
        list1.addAtTail(9);
        list1.addAtTail(9);
        list1.addAtTail(9);
        list1.addAtTail(9);
        list1.addAtTail(9);
        list1.addAtTail(9);
        list1.addAtTail(9);

        MyLinkedList2 list2 = new MyLinkedList2();
        list2.addAtTail(9);
        list2.addAtTail(9);
        list2.addAtTail(9);
        list1.addAtTail(9);

        addTwoNumbers(list1.first, list2.first);

    }
}
