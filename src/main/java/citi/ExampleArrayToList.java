package citi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Stream;

/*Time Complexity : O(n*n)
        Efficient Approach: We traverse array from end and insert every element at the beginning of the list.*/
public class ExampleArrayToList {

    static class Node {
        int val;
        Node next;
    }

    public static Node insert(Node root, int val) {

        Node tmp = new Node();
        tmp.val = val;
        tmp.next = null;

        if (root == null) {
            root = tmp;

        } else {
            Node ptr = root;
            while (ptr.next != null) {
                ptr = ptr.next;
            }
            ptr.next = tmp;
        }
        return root;
    }

    public static void display(Node root) {
        while (root != null) {
            System.out.println("root value: " + root.val);
            root = root.next;
        }
    }

    public static Node arrayToList(int[] arr, int size) {
        Node root = null;
        for (int i = 0; i < size; i++) {
            root = insert(root, arr[i]);
        }
        return root;
    }

    public static Node streamToList(Stream<Integer> stream) {
        Node root = null;
        Iterator<Integer> n = stream.iterator();
        while (n.hasNext()) {
            root = insert(root, n.next());
        }
        return root;
    }

    public static void main(String[] args) {
      /*  int[] arr = {2, 4, 6, 1, 8};
        Node root = arrayToList(arr, arr.length);
        display(root);*/

        List<Integer> list = new ArrayList<>(Arrays.asList(2, 4, 5, 8, 1));
        Stream<Integer> integers = list.stream();
        Node root2 = streamToList(integers);
        display(root2);


    }
}
