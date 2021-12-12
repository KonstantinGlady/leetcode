package arrays.introduction;

import java.util.Arrays;

public class SolutionHeightChecker {
    public static void main(String[] args) {

      /*  Input: heights = [1,1,4,2,1,3]
        Output: 3
        Explanation:
        heights:  [1,1,4,2,1,3]
        expected: [1,1,1,2,3,4]
        Indices 2, 4, and 5 do not match.*/
        int[] nums = {1, 1, 4, 2, 1, 3};
        System.out.println(heightChecker(nums));

    }

    public static int heightChecker(int[] heights) {
        int l = 0;
        int[] arr = Arrays.copyOf(heights, heights.length);
        Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != heights[i]) {
                l++;
            }
        }
        return l;
    }

}
