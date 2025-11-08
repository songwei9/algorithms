package com.example.algorithms;

public class EditDistance {
    /** 给定两个字符串 word1 和 word2，返回将 word1 转换为 word2 所使用的最少操作数（插入、删除、替换）。
     *  最优解：经典动态规划，时间 O(m×n)、空间 O(min(m,n))（可优化） */
    public static int minDistance(String word1, String word2) {
        if (word1 == null || word2 == null) {
            throw new IllegalArgumentException("Inputs cannot be null");
        }
        int m = word1.length(), n = word2.length();
        // 降低空间复杂度：取短的作为列
        if (m < n) {
            return minDistance(word2, word1);
        }
        // now m ≥ n
        int[] dp = new int[n + 1];
        for (int j = 0; j <= n; j++) {
            dp[j] = j;
        }
        for (int i = 1; i <= m; i++) {
            int prev = dp[0]; // dp[i-1][j-1]
            dp[0] = i;
            for (int j = 1; j <= n; j++) {
                int temp = dp[j];
                if (word1.charAt(i - 1) == word2.charAt(j - 1)) {
                    dp[j] = prev;
                } else {
                    dp[j] = Math.min(Math.min(dp[j] + 1,   // delete from word1
                                    dp[j - 1] + 1), // insert into word1
                            prev + 1);         // replace
                }
                prev = temp;
            }
        }
        return dp[n];
    }
}
