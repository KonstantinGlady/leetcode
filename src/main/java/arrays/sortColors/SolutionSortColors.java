package arrays.sortColors;

import java.util.Arrays;

public class SolutionSortColors {

    public static void main(String[] args) {

      /*  Input: nums = [2,0,2,1,1,0]
        Output: [0,0,1,1,2,2]*/

        int[] nums = {2, 0, 2, 1, 1, 0};
        sortColors(nums);
    }

    public static void sortColors(int[] nums) {

        int tmp = 0;
        int lo = 0;
        int mid = 0;
        int hi = nums.length - 1;

        while (mid <= hi) {
            switch (nums[mid]) {
                case 0:
                    tmp = nums[lo];
                    nums[lo] = nums[mid];
                    nums[mid] = tmp;
                    lo++;
                    mid++;
                    break;
                case 1:
                    mid++;
                    break;
                case 2:
                    tmp = nums[hi];
                    nums[hi] = nums[mid];
                    nums[mid] = tmp;
                    hi--;
                    break;
            }
        }
        System.out.println(Arrays.toString(nums));
    }
}
