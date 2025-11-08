package com.example.algorithms;

import java.util.ArrayList;
import java.util.List;

public class BacktrackingAlgorithms {

    /** 求集合 nums 的所有子集（幂集）
     *  最优思路：递归 + 状态 “当前位置” 控制 + 每一步选择“加入”或“不加入”，时间 O(2^n * n) 输出规模限定。 */
    public static List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        if (nums == null) return result;
        backtrack(nums, 0, new ArrayList<>(), result);
        return result;
    }

    private static void backtrack(int[] nums, int index, List<Integer> path, List<List<Integer>> result) {
        // 每次先加入当前路径
        result.add(new ArrayList<>(path));
        for (int i = index; i < nums.length; i++) {
            path.add(nums[i]);
            backtrack(nums, i + 1, path, result);
            path.remove(path.size() - 1);
        }
    }
}
