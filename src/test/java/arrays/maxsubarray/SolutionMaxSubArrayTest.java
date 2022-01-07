package arrays.maxsubarray;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("max subarray of array")
public class SolutionMaxSubArrayTest {

    @Nested
    @DisplayName("naive algorithm ")
    class SolutionNaive {
        @Test
        @DisplayName("{-2, 1,} = 1")
        void maxSubArray() {
            int[] nums = {-2, 1,};
            int max = SolutionMaxSubArray.maxSubArray(nums);
            assertEquals(1, max);
        }

        @Test
        @DisplayName("{-2, 1, -3, 4, -1, 2, 1, -5, 4} = 6")
        void maxSubArraySix() {
            int[] nums = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
            int max = SolutionMaxSubArray.maxSubArray(nums);
            assertEquals(6, max);
        }

        @Test
        @DisplayName("{-1, 0, -2} = 0")
        void maxSubArrayOne() {
            int[] nums = {-1, 0, -2};
            int max = SolutionMaxSubArray.maxSubArray(nums);
            assertEquals(0, max);
        }
    }

    @Nested
    @DisplayName("Divide and conquer algorithm")
    class DivideAndConquer {

        @Test
        @DisplayName("{-2, 1, -3, 4, -1, 2, 1, -5, 4} = 6")
        void divideSix() {
            int[] nums = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
            int max = SolutionMaxSubArray.maxSubArrayDAC(nums);
            assertEquals(6, max);
        }
    }
}
