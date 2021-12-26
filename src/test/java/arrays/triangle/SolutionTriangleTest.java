package arrays.triangle;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTriangleTest {
    /*    Input: triangle = [[2],[3,4],[6,5,7],[4,1,8,3]]
        Output: 11
        Explanation: The triangle looks like:
                2
                3 4
                6 5 7
                4 1 8 3
        The minimum path sum from top to bottom is 2 + 3 + 5 + 1 = 11 (underlined above).*/

    @Test
    void minimumTotal() {
        Integer[][] triangle = {
                {2},
                {3, 4},
                {6, 5, 7},
                {4, 1, 8, 3}
        };

        List<List<Integer>> list = new ArrayList<>();
        for (Integer[] ints : triangle) {
            list.add(Arrays.asList(ints));
        }

        int result = SolutionTriangle.minimumTotal(list);
        assertEquals(11, result);
    }
}