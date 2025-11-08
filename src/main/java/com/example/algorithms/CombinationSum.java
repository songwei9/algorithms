package com.example.algorithms;

import java.util.ArrayList;
import java.util.List;

public class CombinationSum {
    /** 给定无重复正整数数组 candidates 和目标 target，求所有候选数相加之和等于 target 的组合。
     *  最优解：回溯 + 剪枝，时间复杂度依组合输出而定。 */
    public static List<List<Integer>> combinationSum(int[] candidates, int target) {
        if (candidates == null) throw new IllegalArgumentException("candidates cannot be null");
        List<List<Integer>> res = new ArrayList<>();
        backtrack(candidates, target, 0, new ArrayList<>(), res);
        return res;
    }

    private static void backtrack(int[] candidates, int remain, int start,
                                  List<Integer> path, List<List<Integer>> res) {
        if (remain == 0) {
            res.add(new ArrayList<>(path));
            return;
        }
        if (remain < 0) {
            return;
        }
        for (int i = start; i < candidates.length; i++) {
            path.add(candidates[i]);
            backtrack(candidates, remain - candidates[i], i, path, res);
            path.remove(path.size() - 1);
        }
    }
}
