package com.example.algorithms;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class TopKFrequent {
    /** 给定整数数组 nums 和整数 k，返回出现频率最高的 k 个元素。
     *  最优解：哈希表 + 小顶堆（或桶排序），时间 O(n log k)、空间 O(n) */
    public static int[] topKFrequent(int[] nums, int k) {
        if (nums == null) throw new IllegalArgumentException("nums cannot be null");
        Map<Integer, Integer> freq = new HashMap<>();
        for (int x : nums) {
            freq.put(x, freq.getOrDefault(x, 0) + 1);
        }
        PriorityQueue<Map.Entry<Integer, Integer>> heap =
                new PriorityQueue<>((a,b) -> a.getValue() - b.getValue());
        for (Map.Entry<Integer, Integer> entry : freq.entrySet()) {
            heap.offer(entry);
            if (heap.size() > k) heap.poll();
        }
        int[] res = new int[k];
        for (int i = k - 1; i >= 0; i--) {
            res[i] = heap.poll().getKey();
        }
        return res;
    }
}
