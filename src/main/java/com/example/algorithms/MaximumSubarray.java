package com.example.algorithms;

public class MaximumSubarray {
    /** 使用 Kadane 算法，时间 O(n)、空间 O(1) */
    public static int maxSubArray(int[] nums) {
        if (nums == null || nums.length == 0) throw new IllegalArgumentException("nums cannot be null/empty");
        int maxSoFar = nums[0];
        int currentMax = nums[0];
        for (int i = 1; i < nums.length; i++) {
            currentMax = Math.max(nums[i], currentMax + nums[i]);
            maxSoFar = Math.max(maxSoFar, currentMax);
        }
        return maxSoFar;
    }
}
