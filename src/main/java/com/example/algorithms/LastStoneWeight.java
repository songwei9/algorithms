package com.example.algorithms;

import java.util.PriorityQueue;

public class LastStoneWeight {
    /** 给定石头重量数组 stones，每次选取最重两个石头摧毁并减去差值，返回最后石头重量或 0。
     * 最优解：最大堆（优先队列）时间 O(n log n)，空间 O(n) */
    public static int lastStoneWeight(int[] stones) {
        if (stones == null) throw new IllegalArgumentException("stones cannot be null");
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>((a,b) -> b - a);
        for (int s : stones) maxHeap.offer(s);
        while (maxHeap.size() > 1) {
            int s1 = maxHeap.poll();
            int s2 = maxHeap.poll();
            if (s1 > s2) {
                maxHeap.offer(s1 - s2);
            }
        }
        return maxHeap.isEmpty() ? 0 : maxHeap.poll();
    }
}
