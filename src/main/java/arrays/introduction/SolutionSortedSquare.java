package arrays.introduction;

import java.util.Arrays;

public class SolutionSortedSquare {

    public static void main(String[] args) {
        int[] nums = {-4, -1, 0, 3, 10};
        System.out.println(Arrays.toString(sortedSquares(nums)));
    }
    public static int[] sortedSquares(int[] nums) {

        for (int i =0; i< nums.length; i++) {
           nums[i] *= nums[i];// (int) Math.pow(nums[i],2);
        }
         Arrays.sort(nums);
        return nums;
    }
}
