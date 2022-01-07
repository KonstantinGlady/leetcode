package linkedlist.lntroduction;

  class ListNode {
    int val;
    ListNode next;

    public ListNode() {
    }

    public ListNode(int val) {
        this.val = val;
    }
}

public class MyLinkedList2 {
    ListNode first;
    int size;

    public MyLinkedList2() {
        this.first = new ListNode();
        this.size = 0;
    }

    public int get(int index) {
        if (index >= size || size == 0) {
            return -1;
        }
        ListNode current = first;
        for (int i = 0; i < index; i++) {
            current = current.next;
        }
        return current.next.val;
    }

    public void addAtHead(int val) {
        addAtIndex(0, val);
    }

    public void addAtTail(int val) {
        addAtIndex(size, val);
    }

    public void addAtIndex(int index, int val) {
        ListNode newNode = new ListNode(val);
        ListNode current = first;
        if (index > size) {
            return;
        }
        for (int i = 0; i < index; i++) {
            current = current.next;
        }
        newNode.next = current.next;
        current.next = newNode;
        size++;
    }

    public void deleteAtIndex(int index) {
        if (index >= size || size < 0) {
            return;
        }
        ListNode current = first;
        for (int i = 0; i < index; i++) {
            current = current.next;
        }
        current.next = current.next.next;
        size--;
    }

/*
    private static class Node {
        int val;
        Node next;

        public Node() {
        }

        public Node(int val) {
            this.val = val;
        }
    }*/

    public static void main(String[] args) {
/*        MyLinkedList list = new MyLinkedList();
        list.addAtHead(1);
        list.addAtTail(3);
        list.addAtIndex(1, 2);      // linked list becomes 1->2->3
        list.get(1);                          // return 2
        list.deleteAtIndex(1);                // now the linked list is 1->3
        list.get(1);                          // return 3*/

     /*   MyLinkedList2 list = new MyLinkedList2();
        list.addAtHead(1);
        list.addAtTail(3);
        list.addAtIndex(1, 2);
        list.get(1);
        list.deleteAtIndex(1);
        list.get(1);*/
    }
}

