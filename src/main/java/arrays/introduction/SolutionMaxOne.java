package arrays.introduction;

public class SolutionMaxOne {
    public static void main(String[] args) {
        int[] nums = {1, 0, 1, 1, 0, 0, 0, 1, 0, 1 , 1, 1, 1};
        System.out.println(findMaxConsecutiveOnes(nums));
    }

    public static int findMaxConsecutiveOnes(int[] nums) {
        int count = 0;
        int max = 0;

        for (int i : nums) {

            if (i == 1) {
                count++;
            } else {
                max = (count > max) ? count : max;
                count = 0;
            }

        }
        return Math.max(max, count);
    }
}
