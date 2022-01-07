package linkedlist.lntroduction;

public class SolutionFlattenMultilevel {

    private Node main;
    private Node tail;

    // Definition for a Node.
    class Node {
        public int val;
        public Node prev;
        public Node next;
        public Node child;

        public Node(int val) {
            this.val = val;
        }
    }

    public Node flatten(Node head) {
        multiFlatten(head);
        return this.main;
    }

    private void multiFlatten(Node head) {

        if (head == null) {
            return;
        }
        Node node = new Node(head.val);

        if (main == null) {
            main = node;
            tail = main;
        } else {
            node.prev = tail;
            tail.next = node;
            tail = node;
        }
        multiFlatten(head.child);
        multiFlatten(head.next);
    }
}
