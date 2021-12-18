package arrays.maxsubarray;

public class SolutionMaxSubArray {
    /*  public static void main(String[] args) {
     *//*
        Input: nums = [-2,1,-3,4,-1,2,1,-5,4]
        Output: 6
        Explanation: [4,-1,2,1] has the largest sum = 6.*//*

     *//*   int[] nums = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        System.out.println(maxSubArray(nums));*//*

        int[] nums = {-2, 1,};
        System.out.println(maxSubArray(nums));
    }*/

    //naive O(n^2)
    public static int maxSubArray(int[] nums) {

        if (nums.length == 1) {
            return nums[0];
        }

        int sum = 0;
        int max = nums[0];

        for (int i = 0; i <= nums.length - 1; i++) {
            sum = nums[i];
            max = Math.max(max, sum);
            for (int j = i + 1; j < nums.length; j++) {
                sum += nums[j];
                max = Math.max(max, sum);
            }

        }
        return max;
    }

    //DAC
    public static int maxSubArrayDAC(int[] arr) {

        return maxSubArraySum(arr, 0, arr.length - 1);
    }

    private static int maxSubArraySum(int[] arr, int l, int h) {

        if (l == h) {
            return arr[l];
        }

        int m = (l + h) / 2;

        return Math.max(
                Math.max(maxSubArraySum(arr, l, m),
                        maxSubArraySum(arr, m + 1, h)),
                maxCrossingSum(arr, l, m, h)
        );
    }

    private static int maxCrossingSum(int[] arr, int l, int m, int h) {

        int sum = 0;
        int max_left = Integer.MIN_VALUE;
        for (int i = m; i >= l; i--) {
            sum += arr[i];
            if (sum > max_left) {
                max_left = sum;
            }
        }

        sum = 0;
        int max_right = Integer.MIN_VALUE;
        for (int i = m + 1; i <= h; i++) {
            sum += arr[i];
            if (sum > max_right) {
                max_right = sum;
            }
        }

        return Math.max(max_left + max_right,
                Math.max(max_left,
                        max_left));
    }
}
