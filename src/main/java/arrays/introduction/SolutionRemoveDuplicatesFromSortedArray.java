package arrays.introduction;

public class SolutionRemoveDuplicatesFromSortedArray {
    public static void main(String[] args) {

       /* Input: nums = [1,1,2]
        Output: 2, nums = [1,2,_]
        Explanation: Your function should return k = 2, with the first two elements of nums being 1 and 2 respectively.
        It does not matter what you leave beyond the returned k (hence they are underscores).*/

        int[] nums = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        System.out.println(removeDuplicates(nums));
    }

    public static int removeDuplicates(int[] nums) {
        int count = 0;

        for (int i = 1; i < nums.length; i++) {
            if (nums[count] >= nums[i]) {
                continue;
            }
            nums[count + 1] = nums[i];
            count++;
        }
        return count + 1;
    }
}
