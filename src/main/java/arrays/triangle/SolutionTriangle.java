package arrays.triangle;

import java.util.Arrays;
import java.util.List;


public class SolutionTriangle {

    private static int[][] dp;

    public static int minimumTotal(List<List<Integer>> triangle) {

        int n = triangle.size();
        dp = new int[n][n];
        for (int i = 0; i < n; i++) {
            Arrays.fill(dp[i], Integer.MAX_VALUE);
        }

        return dfs(0, 0, 0, n, triangle);

    }

    private static int dfs(int i, int j, int sum, int n, List<List<Integer>> triangle) {
        int v = triangle.get(i).get(j);
        if (dp[i][j] != Integer.MAX_VALUE) {
            return dp[i][j];
        }
        if (i == n - 1) {
            dp[i][j] = sum + v;
            return dp[i][j];
        }

        int ret = Math.min(dfs(i + 1, j + 1, sum, n, triangle), dfs(i + 1, j, sum, n, triangle)) + v;
        dp[i][j] = ret;
        return ret;
    }
}
