package com.example.algorithms;

import java.util.Deque;
import java.util.LinkedList;

public class SlidingWindowMaximum {
    /** 给定数组 nums 和滑动窗口大小 k，返回每一个窗口中的最大值。
     * 最优解：使用双端队列（单调队列）时间 O(n)、空间 O(k) */
    public static int[] maxSlidingWindow(int[] nums, int k) {
        if (nums == null) throw new IllegalArgumentException("nums cannot be null");
        if (k <= 0) throw new IllegalArgumentException("k must > 0");
        int n = nums.length;
        if (k > n) throw new IllegalArgumentException("k must <= nums.length");
        int[] res = new int[n - k + 1];
        Deque<Integer> dq = new LinkedList<>();
        for (int i = 0; i < nums.length; i++) {
            // remove elements out of window
            while (!dq.isEmpty() && dq.peekFirst() < i - k + 1) {
                dq.pollFirst();
            }
            // remove smaller values from back
            while (!dq.isEmpty() && nums[dq.peekLast()] < nums[i]) {
                dq.pollLast();
            }
            dq.offerLast(i);
            if (i >= k - 1) {
                res[i - k + 1] = nums[dq.peekFirst()];
            }
        }
        return res;
    }
}
