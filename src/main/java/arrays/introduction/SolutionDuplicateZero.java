package arrays.introduction;

import java.util.Arrays;

public class SolutionDuplicateZero {
    public static void main(String[] args) {

   /*     Input: arr = [1,0,2,3,0,4,5,0]
        Output: [1,0,0,2,3,0,0,4]*/

        int[] arr = {1, 0, 2, 3, 0, 4, 5, 0};
        int len = arr.length - 1;
        int count = len;

        for (int i = len; i >= 0; i--) {


            if (arr[i] != 0) {
                count--;
                continue;
            }

            for (int y = len; y >= count; y--) {

                if (y + 1 > len) {
                    continue;
                }
                arr[y + 1] = arr[y];

            }
            count--;
        }
        System.out.println(Arrays.toString(arr));
    }
}
