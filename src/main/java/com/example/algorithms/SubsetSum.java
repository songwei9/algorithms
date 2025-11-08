package com.example.algorithms;

public class SubsetSum {
    /** 给定非负整数数组 nums 和目标 sum，判断是否存在子集其和为 sum。
     *  最优解：DP （布尔表）或位运算优化，时间 O(n×sum)、空间 O(sum) */
    public static boolean canSubsetSum(int[] nums, int target) {
        if (nums == null) throw new IllegalArgumentException("nums cannot be null");
        if (target < 0) return false;
        boolean[] dp = new boolean[target + 1];
        dp[0] = true;
        for (int num : nums) {
            for (int j = target; j >= num; j--) {
                if (dp[j - num]) dp[j] = true;
            }
        }
        return dp[target];
    }
}
