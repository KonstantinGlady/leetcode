package arrays.mergesorted;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("Checking merging 2 sorted arrays in one")
class SolutionMergeSortedArrayTest {

    @Test
    @DisplayName("must be equals [1,2,2,3,5,6]")
    void merge() {

        int[] nums1 = {1, 2, 3, 0, 0, 0};
        int[] nums2 = {2, 5, 6};
        int m = 3;
        int n = 3;

        int[] result = SolutionMergeSortedArray.merge(nums1, m, nums2, n);
        int[] expected = {1, 2, 2, 3, 5, 6};
        assertArrayEquals(expected, result);

    }
}