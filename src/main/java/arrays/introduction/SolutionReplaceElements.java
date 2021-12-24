package arrays.introduction;

import java.util.Arrays;
import java.util.Collections;
import java.util.Objects;

public class SolutionReplaceElements {
    public static void main(String[] args) {

       /* Input: arr = [17,18,5,4,6,1]
        Output: [18,6,6,6,1,-1]*/

        int[] arr = {17, 18, 5, 4, 6, 1};
        // int[] arr = {56903, 18666, 60499, 57517, 26961};
        /*[60499,60499,57517,26961,-1]*/
        System.out.println(Arrays.toString(replaceElements(arr)));
    }

    public static int[] replaceElements(int[] arr) {
        int len = arr.length;
        int max = -1;
        int exMax = -1;
        int cur = 0;

        for (int i = len - 1; i >= 0; i--) {
            //with lib
   /*         cur = arr[i];
            arr[i] = max;
            max = Math.max(max, cur);*/

            //without lib
            if (max > arr[i]) {
                arr[i] = max;
            } else if (max < arr[i]) {
                exMax = max;
                max = arr[i];
                arr[i] = exMax;
            }
        }
        return arr;
    }
}
