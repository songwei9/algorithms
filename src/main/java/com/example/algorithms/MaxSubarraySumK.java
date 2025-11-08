package com.example.algorithms;

public class MaxSubarraySumK {
    /** 给定整型数组 nums 和整数 k（可能是 k 子数组或固定长度），求长度 k 的子数组最大和。
     * 这里假设固定长度 k 子数组最大和。
     * 最优解：滑动窗口，时间 O(n)、空间 O(1) */
    public static int maxSubarraySumFixedK(int[] nums, int k) {
        if (nums == null) throw new IllegalArgumentException("nums cannot be null");
        if (k <= 0 || k > nums.length) throw new IllegalArgumentException("k is invalid");
        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += nums[i];
        }
        int max = sum;
        for (int i = k; i < nums.length; i++) {
            sum += nums[i] - nums[i - k];
            if (sum > max) {
                max = sum;
            }
        }
        return max;
    }
}
