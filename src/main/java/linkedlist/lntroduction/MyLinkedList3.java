package linkedlist.lntroduction;

public class MyLinkedList3 {

    private int size;
    private Node first;

    public MyLinkedList3() {
        this.first = new Node();
        this.size = 0;
    }

    public int get(int index) {

        if (index >= size || size == 0) {
            return -1;
        }
        Node cur = first;
        for (int i = 0; i < index; i++) {
            cur = cur.next;
        }
        return cur.next.val;
    }

    public void addAtHead(int val) {
        addAtHead(val, null);
    }

    public void addAtHead(int val, Node random) {
        addAtIndex(0, val, random);
    }

    public void addAtTail(int val) {
        addAtTail(val, null);
    }

    public void addAtTail(int val, Node random) {
        addAtIndex(size, val, random);
    }

    public void addAtIndex(int index, int val, Node random) {
        if (index > size) {
            return;
        }
        Node newNode = new Node(val);
        newNode.random = random;
        Node cur = first;
        for (int i = 0; i < index; i++) {
            cur = cur.next;
        }
        newNode.next = cur.next;
        cur.next = newNode;
        size++;
    }

    public void deleteAtIndex(int index) {
        if (index >= size || size == 0) {
            return;
        }
        Node cur = first;
        for (int i = 0; i < index; i++) {
            cur = cur.next;
        }
        cur.next = cur.next.next;
        size--;
    }

    public Node reverse() {
        Node mid = first;
        Node left = null;
        Node right;

        for (int i = 0; i < size; i++) {
            right = mid.next;
            mid.next = left;
            left = mid;
            mid = right;
        }
        return left;
    }

    static class Node {

        private int val;
        private Node next;
        private Node random;

        public Node() {
        }

        public Node(int val, Node random) {
            this.val = val;
            this.random = random;
        }

        public Node(int val) {
            this.val = val;
            this.random = null;
        }
    }
}
