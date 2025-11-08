package com.example.algorithms;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    /** 给定整数数组 nums 和目标值 target，返回两个数的下标，使得它们相加之和为 target。
     *  最优解：一次遍历 + 哈希表，时间 O(n)、空间 O(n) */
    public static int[] twoSum(int[] nums, int target) {
        if (nums == null) throw new IllegalArgumentException("nums cannot be null");
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement)) {
                return new int[]{map.get(complement), i};
            }
            map.put(nums[i], i);
        }
        throw new IllegalArgumentException("No two sum solution");
    }
}
