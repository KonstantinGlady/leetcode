package arrays.triangle;

import java.util.List;

class Solution2 {
    public static int minimumTotal(List<List<Integer>> triangle) {
        int len = triangle.get(triangle.size() - 1).size();
        int[] dp = new int[len];
        int start = 0;
        int flag = 0;
        int ans = 0;
        for (int i = 0; i < triangle.size(); i++) {
            List<Integer> arr = triangle.get(i);
            ans = Integer.MAX_VALUE;
            if (i == triangle.size() - 1)
                flag = 1;
            int[] newDp = new int[len];
            for (int j = 0; j <= start; j++) {
                int x = (j - 1 >= 0) ? Math.min(dp[j], dp[j - 1]) : dp[j];
                if (j == start && j - 1 >= 0)
                    x = dp[j - 1];
                newDp[j] = arr.get(j) + x;
                if (flag == 1)
                    ans = Math.min(ans, newDp[j]);
            }
            dp = newDp;
            start++;
        }
        return ans;
    }
}
