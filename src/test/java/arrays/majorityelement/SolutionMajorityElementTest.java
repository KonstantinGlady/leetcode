package arrays.majorityelement;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("Majority Elements in")
class SolutionMajorityElementTest {

  /*  Input: nums = [3,2,3]
    Output: 3*/
   /* Input: nums = [2,2,1,1,1,2,2]
    Output: 2*/

    @DisplayName("array of {2, 2, 1, 1, 1, 2, 2} = 2")
    @Test
    void majorityElementFirst() {

        int[] nums = {2, 2, 1, 1, 1, 2, 2};
        int result = SolutionMajorityElement.majorityElement(nums);
        assertEquals(2, result);
    }

    @DisplayName("array of {3, 3, 4} = 3")
    @Test
    void majorityElementSecond() {
        int[] nums = {3, 3, 4};
        int result = SolutionMajorityElement.majorityElement(nums);
        assertEquals(3, result);
    }
}