package com.example.algorithms;

import java.util.HashSet;
import java.util.Set;

public class LongestConsecutiveSequence {
    /** 给定一个未排序的整数数组 nums，返回其中最长的连续元素序列的长度。要求 O(n) 时间复杂度。 */
    public static int longestConsecutive(int[] nums) {
        if (nums == null) throw new IllegalArgumentException("nums cannot be null");
        Set<Integer> set = new HashSet<>();
        for (int num : nums) {
            set.add(num);
        }
        int longest = 0;
        for (int num : set) {
            // 只从序列起点开始 (即 num-1 不在集合中)
            if (!set.contains(num - 1)) {
                int current = num;
                int length = 1;
                while (set.contains(current + 1)) {
                    current++;
                    length++;
                }
                longest = Math.max(longest, length);
            }
        }
        return longest;
    }
}
