package citi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.toList;

/*Time Complexity : O(n)
        Alternate Efficient Solution is maintain tail
        pointer, traverse array elements from left to right, insert at tail and update tail after insertion.*/
public class ExampleArrayToList2 {

    static class Node {
        int val;
        Node next;
    }

    public static Node insert(Node root, int val) {
        Node tmp = new Node();
        tmp.val = val;
        tmp.next = root;
        root = tmp;
        return root;
    }

    public static void display(Node root) {
        while (root != null) {
            System.out.println("node val: " + root.val);
            root = root.next;
        }
    }

    public static Node arrayToList(int[] arr, int size) {
        Node root = null;
        for (int i = size - 1; i >= 0; i--) {
            root = insert(root, arr[i]);
        }
        return root;
    }

    public static void main(String[] args) {
        int[] arr = {2, 4, 5, 8, 1};
        Node root = arrayToList(arr, arr.length);
        display(root);

    }
}
