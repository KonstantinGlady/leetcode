package arrays.introduction;

import java.util.Arrays;

public class SolutionMoveZero {
    public static void main(String[] args) {

/*        Input: nums = [0,1,0,3,12]
        Output: [1,3,12,0,0]*/
        int[] nums = {0,1,0,3,12};
        //int [] nums = {1,0,1};
        moveZeroes2(nums);

    }
    public static void moveZeroes2(int[] nums) {
        int tmp;

        for (int reader = 0, writer = 0; reader < nums.length; reader++) {
            if (nums[reader] != 0) {
                tmp = nums[reader];
                nums[reader] = nums[writer];
                nums[writer]= tmp;
                writer++;
            }
        }
        System.out.println(Arrays.toString(nums));
    }

    public static void moveZeroes(int[] nums) {
        int writePointer = 0;
        int tmp;

        for (int readPointer = 1; readPointer < nums.length; readPointer++) {

            if (nums[readPointer-1] !=0) {
                writePointer++;
                continue;
            }
            if (nums[readPointer - 1] == 0 && nums[readPointer] != 0) {
                tmp = nums[readPointer - 1];
                nums[writePointer] = nums[readPointer];
                nums[readPointer] = tmp;
                writePointer++;
            }
        }
        System.out.println(Arrays.toString(nums));
    }
}
