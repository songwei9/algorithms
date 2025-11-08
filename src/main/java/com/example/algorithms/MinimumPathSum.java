package com.example.algorithms;

public class MinimumPathSum {
    /** 给定一个 m x n 的非负数矩阵 grid ，从左上角走到右下角，每次只能向下或向右，求路径上的最小和。
     *  最优解：DP 表填充法，时间 O(mn)，空间 O(n)（可降维优化） */
    public static int minPathSum(int[][] grid) {
        if (grid == null || grid.length == 0 || grid[0].length == 0) {
            throw new IllegalArgumentException("grid cannot be null or empty");
        }
        int m = grid.length, n = grid[0].length;
        int[] dp = new int[n];
        dp[0] = grid[0][0];
        // 初始化第一行
        for (int j = 1; j < n; j++) {
            dp[j] = dp[j - 1] + grid[0][j];
        }
        for (int i = 1; i < m; i++) {
            dp[0] += grid[i][0];
            for (int j = 1; j < n; j++) {
                dp[j] = Math.min(dp[j - 1], dp[j]) + grid[i][j];
            }
        }
        return dp[n - 1];
    }
}
