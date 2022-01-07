package linkedlist.lntroduction;

public class MyDoubleLinkedList {

/*
    private LinkNode head;
    private LinkNode tail;
    private int size = 0;

    class LinkNode {
        private final int val;
        public LinkNode next;
        public LinkNode prev;

        LinkNode(int val) {
            this.val = val;
        }
    }

    public MyDoubleLinkedList() {
        head = null;
    }


    public int get(int index) {

        LinkNode currentNode = head;
        int count = 0;

        while (currentNode != null) {

            if (count == index) {
                return currentNode.val;
            }

            count++;
            currentNode = currentNode.next;
        }

        return -1;
    }

    public void addAtHead(int val) {
        LinkNode newHead = new LinkNode(val);
        newHead.next = head;
        if (head != null) {
            head.prev = newHead;
        }
        head = newHead;


        if (tail == null) {
            tail = head;
        }

        size++;
    }


    public void addAtTail(int val) {
        LinkNode newHead = new LinkNode(val);

        if (tail != null) {
            tail.next = newHead;
            newHead.prev = tail;
        }

        tail = newHead;

        if (head == null) {
            head = tail;
        }

        size++;
    }

    public void addAtIndex(int index, int val) {

        if (index == 0) {
            addAtHead(val);
            return;
        }

        if (index == size) {
            addAtTail(val);
            return;
        }

        if (index > size) {
            return;
        }

        LinkNode currentNode = head.next;
        LinkNode prevNode = head;
        int count = 1;

        while (currentNode != null) {

            if (index == count) {

                LinkNode newNode = new LinkNode(val);
                newNode.prev = prevNode;
                newNode.next = currentNode;
                currentNode.prev = newNode;

                if (prevNode != null) {
                    prevNode.next = newNode;
                }

                size++;
                return;
            }

            prevNode = currentNode;
            currentNode = currentNode.next;
            count++;
        }

        return;
    }

    public void deleteAtIndex(int index) {

        LinkNode currentNode = head;
        LinkNode prevNode = null;
        int count = 0;

        while (currentNode != null) {

            if (index == count) {

                if (prevNode != null) {
                    prevNode.next = currentNode.next;
                }

                if (currentNode.next != null) {
                    currentNode.next.prev = prevNode;
                }

                //reset head
                if (index == 0) {
                    head = currentNode.next;
                }

                if (index == (size - 1)) {
                    tail = tail.prev;
                }

                size--;
                return;
            }

            prevNode = currentNode;
            currentNode = currentNode.next;
            count++;
        }

        return;
    }
*/
}
