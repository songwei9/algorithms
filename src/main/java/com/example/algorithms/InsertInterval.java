package com.example.algorithms;

import java.util.ArrayList;
import java.util.List;

public class InsertInterval {
    /** 给定非重叠、按开始时间排序的区间 intervals 和一个新区间 newInterval，插入它并合并所有重叠区间。
     * 最优解：遍历 + 合并，时间 O(n)，空间 O(n) */
    public static int[][] insert(int[][] intervals, int[] newInterval) {
        if (intervals == null || newInterval == null) {
            throw new IllegalArgumentException("Inputs cannot be null");
        }
        List<int[]> result = new ArrayList<>();
        int i = 0;
        // add all intervals before newInterval
        while (i < intervals.length && intervals[i][1] < newInterval[0]) {
            result.add(intervals[i++]);
        }
        // merge overlapping
        while (i < intervals.length && intervals[i][0] <= newInterval[1]) {
            newInterval[0] = Math.min(newInterval[0], intervals[i][0]);
            newInterval[1] = Math.max(newInterval[1], intervals[i][1]);
            i++;
        }
        result.add(newInterval);
        // add remaining
        while (i < intervals.length) {
            result.add(intervals[i++]);
        }
        return result.toArray(new int[result.size()][]);
    }
}
