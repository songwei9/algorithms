package com.example.algorithms;

import java.util.Arrays;

public class CoinChange {
    /** 给定硬币面额 coins 和金额 amount ，求最少的硬币数量使其组成 amount。如果无解，返回 -1。
     * 最优解：一维动态规划，时间 O(amount × nCoins)，空间 O(amount) */
    public static int coinChange(int[] coins, int amount) {
        if (coins == null) {
            throw new IllegalArgumentException("coins cannot be null");
        }
        int max = amount + 1;
        int[] dp = new int[amount + 1];
        Arrays.fill(dp, max);
        dp[0] = 0;
        for (int coin : coins) {
            for (int j = coin; j <= amount; j++) {
                dp[j] = Math.min(dp[j], dp[j - coin] + 1);
            }
        }
        return dp[amount] > amount ? -1 : dp[amount];
    }
}
