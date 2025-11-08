package com.example.algorithms;

import java.util.Arrays;

public class ThreeSumClosest {
    /** 给定整数数组 nums 和目标 target，找到 3 个整数使其和最接近 target ，返回这三个数的和。
     *  最优解：排序 + 三指针，时间 O(n²)、空间 O(1) */
    public static int threeSumClosest(int[] nums, int target) {
        if (nums == null || nums.length < 3) {
            throw new IllegalArgumentException("nums must have at least 3 elements");
        }
        Arrays.sort(nums);
        int n = nums.length;
        int bestSum = nums[0] + nums[1] + nums[2];
        for (int i = 0; i < n - 2; i++) {
            int left = i + 1, right = n - 1;
            while (left < right) {
                int sum = nums[i] + nums[left] + nums[right];
                if (Math.abs(sum - target) < Math.abs(bestSum - target)) {
                    bestSum = sum;
                }
                if (sum < target) {
                    left++;
                } else if (sum > target) {
                    right--;
                } else {
                    return target; // 最优情况
                }
            }
        }
        return bestSum;
    }
}
