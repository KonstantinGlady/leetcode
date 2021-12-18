package arrays.introduction;

import java.util.Arrays;

public class SolutionRemoveDuplicatesFromSortedArray2 {
    public static void main(String[] args) {

/*        Input: nums = [1,1,2]
        Output: 2, nums = [1,2,_]*/
        // int[] arr = {0,0,0,0,3};
        int[] arr = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        //int[] arr = {1, 2};
        // System.out.println(removeDuplicates(arr));
        System.out.println(removeDuplicates2(arr));
    }

    public static int removeDuplicates2(int[] nums) {
        int p = 0;
        int shift = 1;

        while (p + shift < nums.length) {
            if (nums[p + shift] != nums[p]) {
                nums[p + 1] = nums[p + shift];
                p++;
                continue;
            }
            shift++;
        }

        System.out.println("second: ");
        System.out.println(Arrays.toString(nums));
        System.out.println(
                Arrays.toString(
                        Arrays.copyOf(
                                nums, p + 1)));
        return p + 1;
    }

    public static int removeDuplicates(int[] nums) {
        int pos;
        int tmp;
        int amount = 1;
        int i;

        if (nums == null || nums.length == 0) {
            return 0;
        }
        if (nums.length == 1) {
            return 1;
        }

        for (i = 0; i < amount; i++) {

            if (i + 1 >= nums.length) {
                break;
            }
            if (nums[i] < nums[i + 1]) {
                amount++;
                continue;
            }
            tmp = nums[i];
            pos = i + 1;
            for (int j = i + 1; j < nums.length - 1; j++) {
                if (tmp >= nums[j + 1]) {
                    continue;
                }
                nums[pos] = nums[j + 1];
                amount++;
                break;
            }

        }
        System.out.println(Arrays.toString(nums));
        System.out.println(Arrays.toString(Arrays.copyOf(nums, amount)));
        return amount;
    }
}
