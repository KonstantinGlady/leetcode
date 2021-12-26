package arrays.introduction;

import java.util.Arrays;

public class ArrayOperations {
    public static void main(String[] args) {
        //adding operations
        int[] arr = new int[10];
        int count = 0;

        for (int i = 0; i < 5; i++) {
            arr[count] = i;
            count++;
        }
        printArray(arr);

        for (int i = 4; i >= 0; i--) {
            arr[i + 1] = arr[i];
        }
        printArray(arr);
        arr[0] = 7;
        printArray(arr);

        for (int i = 5; i >= 3; i--) {
            arr[i + 1] = arr[i];
        }
        printArray(arr);
        arr[3] = 4;
        printArray(arr);

        //deleting operations
        int length = 0;
        int[] arr2 = new int[10];
        for (int i = 0; i < 6; i++) {
            arr2[i] = i;
            length++;
        }
        System.out.println("deleting:");
        printArrayWithoutEmpty(length, arr2);
        //deleting first element
        for (int i = 1; i < length; i++) {
            arr2[i - 1] = arr2[i];
        }
        length--;
        printArrayWithoutEmpty(length, arr2);

    }

    private static void printArrayWithoutEmpty(int length, int[] arr2) {
        for (int i = 0; i < length; i++) {
            System.out.print(arr2[i] + " ");
        }
        System.out.println();
    }

    private static void printArray(int[] arr) {
        System.out.println(Arrays.toString(arr));
    }
}
