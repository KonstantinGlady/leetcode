package arrays.introduction;

import java.util.Arrays;

public class SolutionSortArrayByParity {
    public static void main(String[] args) {

    /*    Input: nums = [3,1,2,4]
        Output: [2,4,3,1]
        Explanation: The outputs [4,2,3,1], [2,4,1,3], and [4,2,1,3] would also be accepted.*/
        int[] nums = {3, 1, 2, 4};

        System.out.println(
                Arrays.toString(
                        sortArrayByParity(nums)));
    }

    public static int[] sortArrayByParity(int[] nums) {
        int tmp;

        for (int i = 0, j = 0; i < nums.length; i++) {
            if (nums[i] % 2 == 0) {
                tmp = nums[i];
                nums[i] = nums[j];
                nums[j] = tmp;
                j++;
            }
        }

        return nums;
    }
}
