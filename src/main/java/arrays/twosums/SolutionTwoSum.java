package arrays.twosums;

import java.util.Arrays;

public class SolutionTwoSum {
    public static void main(String[] args) {
       /* Input: nums = [3,2,4], target = 6
        Output: [1,2]*/

       /* int[] nums = {3, 2, 4};
        System.out.println(Arrays.toString(twoSum(nums, 6)));*/

       /* Input: nums = [3,3], target = 6
        Output: [0,1]*/

      /*  int[] nums = {3, 3};
        System.out.println(Arrays.toString(twoSum(nums, 6)));*/

     /*   Input: nums = [2,7,11,15], target = 9
        Output: [0,1]
        Output: Because nums[0] + nums[1] == 9, we return [0, 1].*/

        int[] nums = {2, 7, 11, 15, 14, 45, 23, 18, 4, 55};
        System.out.println(Arrays.toString(twoSum(nums, 9)));
        System.out.println(Arrays.toString(twoSumTwoPointers(nums, 9)));

    }

    //O(n*n)
    public static int[] twoSum(int[] nums, int target) {

        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        return new int[]{};
    }

    //two pointers
    private static int[] twoSumTwoPointers(int[] nums, int target) {
        int l = 0;
        int r = nums.length - 1;
        Arrays.sort(nums);// two pointers  works only with sorted array

        while (l < r) {
            int sum = nums[l] + nums[r];
            if (sum == target) {
                return new int[]{l, r};
            } else if (sum > target) {
                r--;
            } else {
                l++;
            }
        }
        return new int[]{};
    }
}
