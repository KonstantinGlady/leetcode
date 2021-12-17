package arrays.introduction;

import java.util.Arrays;

public class SolutionMergeSortedArray {
    public static void main(String[] args) {

      /*  Input: nums1 = [1,2,3,0,0,0], m = 3, nums2 = [2,5,6], n = 3
        Output: [1,2,2,3,5,6]*/

        int[] nums1 = {1, 2, 3, 0, 0, 0};
        int m = 3;
        int[] nums2 = {2, 5, 6};
        int n = 3;
        merge(nums1, m, nums2, n);
    }

    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int c = 0;
        for (int i = m; i <= m + n - 1; i++) {
            nums1[i] = nums2[c++];
        }
        Arrays.sort(nums1);
        System.out.println(Arrays.toString(nums1));
    }
}
