package arrays.introduction;

public class SolutionValidMountainArray {
    public static void main(String[] args) {
        // int[] arr = {3, 5, 5};
        //int[] arr = {0, 3, 2, 1};
       // int[] arr = {0,1,2,3,4,5,6,7,8,9};
        //int[] arr = {1,3,2};
        int[] arr =     {0,1,2,1,2};
        System.out.println(validMountainArray(arr));
    }

    public static boolean validMountainArray(int[] arr) {
        boolean up = true;
        boolean down = false;
        int len = arr.length;

        if (len < 3) {
            return false;
        }
        for (int i = 1; i < len; i++) {

            if (arr[i] == arr[i - 1]) {
                return false;
            }
            if (up) {
                if (arr[i] > arr[i - 1]) {
                    continue;
                } else {
                    if (i == 1) {
                        return false;
                    }
                    up = false;
                }
            }
            if (!up && arr[i] < arr[i - 1]) {
                down = true;
                continue;
            } else {
                return false;
            }
        }
        return down;
    }
}
