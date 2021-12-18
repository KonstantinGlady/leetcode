package arrays.introduction;

import java.util.Arrays;

public class SolutionRemoveElementTwoPointers {
    public static void main(String[] args) {

     /*   Input: nums = [3,2,2,3], val = 3
        Output: 2, nums = [2,2,_,_]
        Explanation: Your function should return k = 2, with the first two elements of nums being 2.
        It does not matter what you leave beyond the returned k (hence they are underscores).*/

        int[] nums = {3, 2, 2, 3};
        int v = 3;
        System.out.println(removeElement(nums, v));
    }

    public static int removeElement(int[] nums, int v) {
        int i;
        int j;
        int tmp;

        for (i = 0, j = 0; i < nums.length; i++) {
            if (nums[i] != v) {
                tmp = nums[i];
                nums[i] = nums[j];
                nums[j] = tmp;
                j++;
            }
        }

        return j;
    }
}
