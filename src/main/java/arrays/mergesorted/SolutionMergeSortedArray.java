package arrays.mergesorted;

import java.util.Arrays;

public class SolutionMergeSortedArray {

      /*  Input: nums1 = [1,2,3,0,0,0], m = 3, nums2 = [2,5,6], n = 3
        Output: [1,2,2,3,5,6]
        Explanation: The arrays we are merging are [1,2,3] and [2,5,6].
        The result of the merge is [1,2,2,3,5,6] with the underlined elements coming from nums1.*/

    //two-pointers approach O(n+m)
    public static int[] merge(int[] nums1, int m, int[] nums2, int n) {
        int i = m - 1;
        int j = n - 1;

        for (int k = m + n - 1; k >= 0; k--) {
            if (i <= -1) {
                nums1[k] = nums2[j];
                j--;
            } else if (j <= -1) {
                nums1[k] = nums1[i];
                i--;
            } else if (nums1[i] >= nums2[j]) {
                nums1[k] = nums1[i];
                i--;
            } else {
                nums1[k] = nums2[j];
                j--;
            }
        }
        return nums1;
    }
}
