package com.example.algorithms;

import java.util.ArrayList;
import java.util.List;

public class LongestIncreasingSubsequence {
    /** 给定整数数组 nums，返回其最长严格递增子序列的长度。
     *  最优解：时间 O(n log n)，使用 patience sorting（或 tails 数组 + 二分） */
    public static int lengthOfLIS(int[] nums) {
        if (nums == null) throw new IllegalArgumentException("nums cannot be null");
        List<Integer> tails = new ArrayList<>();
        for (int x : nums) {
            int idx = java.util.Collections.binarySearch(tails, x);
            if (idx < 0) idx = -idx - 1;
            if (idx == tails.size()) {
                tails.add(x);
            } else {
                tails.set(idx, x);
            }
        }
        return tails.size();
    }
}
