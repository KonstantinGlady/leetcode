package arrays.introduction;

import java.util.Arrays;
import java.util.Comparator;

public class SolutionThirdMaximumNumber {
    public static void main(String[] args) {

       /* Input: nums = [2,2,3,1]
        Output: 1*/

        int[] nums = {2, 2, 3, 1};
        System.out.println(thirdMax(nums));
    }

    public static int thirdMax(int[] nums) {

        Arrays.sort(nums);
        int i;
        int count = 1;

        for (i = nums.length - 1; i > 0; i--) {
            if (nums[i] > nums[i - 1]) {
                count++;
                if (count == 3) {
                    return nums[i - 1];
                }
            }
        }
        return nums[nums.length-1];
    }
}
