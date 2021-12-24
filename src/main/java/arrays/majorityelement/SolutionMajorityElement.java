package arrays.majorityelement;

import java.util.*;

public class SolutionMajorityElement {

    public static int majorityElement(int[] nums) {

        TreeMap<Integer, Integer> map = new TreeMap<>();
        for (int i : nums) {
            int v = map.getOrDefault(i, 0) + 1;
            map.put(i, v);
        }

        Map.Entry<Integer, Integer> n = map.entrySet().stream().max(Map.Entry.comparingByValue()).get();
        return n.getKey();
    }
}
