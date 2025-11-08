package com.example.algorithms;

import java.util.Arrays;

public class PerfectSquares {
    /** 给定正整数 n，返回 n 可以表示为最少完全平方数 （1,4,9,16…）之和的个数。
     *  最优解：动态规划，时间 O(n √n)、空间 O(n) */
    public static int numSquares(int n) {
        if (n <= 0) throw new IllegalArgumentException("n must be positive");
        int[] dp = new int[n + 1];
        Arrays.fill(dp, Integer.MAX_VALUE);
        dp[0] = 0;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j * j <= i; j++) {
                dp[i] = Math.min(dp[i], dp[i - j * j] + 1);
            }
        }
        return dp[n];
    }
}
