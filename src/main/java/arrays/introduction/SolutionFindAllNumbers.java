package arrays.introduction;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SolutionFindAllNumbers {
    public static void main(String[] args) {
/*
        Input: nums = [4,3,2,7,8,2,3,1]
        Output: [5,6]*/
        int[] nums = {4, 3, 2, 7, 8, 2, 3, 1};
        //int[] nums = {2, 2};
        System.out.println(findDisappearedNumbers(nums));

    }

    public static List<Integer> findDisappearedNumbers(int[] nums) {
        boolean[] booleans = new boolean[nums.length + 1];
        for (int num : nums) {
            booleans[num] = true;
        }
        List<Integer> result = new ArrayList<>();
        for (int i = 1; i < booleans.length; i++) {
            if (!booleans[i]) {
                result.add(i);
            }
        }
        return result;
    }
}
