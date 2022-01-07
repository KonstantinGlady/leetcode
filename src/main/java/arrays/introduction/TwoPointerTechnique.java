package arrays.introduction;

public class TwoPointerTechnique {
    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 2, 4, 5};
        System.out.println(removeDuplicate(arr));
    }

    public static int removeDuplicate(int[] arr) {
        int writePointer = 1;

        for (int readPointer = 1; readPointer < arr.length; readPointer++) {
            if (arr[readPointer] != arr[readPointer - 1]) {
                arr[writePointer] = arr[readPointer];
                writePointer++;
            }
        }
        return writePointer;
    }
}
