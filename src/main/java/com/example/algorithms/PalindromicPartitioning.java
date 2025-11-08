package com.example.algorithms;

import java.util.ArrayList;
import java.util.List;

public class PalindromicPartitioning {
    /** 给定字符串 s ，返回所有可能的分割方式，使得每一个子串都是回文串。
     * 最优解：回溯 + 预处理回文剪枝，时间复杂度依输出规模。 */
    public static List<List<String>> partition(String s) {
        if (s == null) throw new IllegalArgumentException("s cannot be null");
        int n = s.length();
        boolean[][] dp = new boolean[n][n];
        for (int right = 0; right < n; right++) {
            for (int left = 0; left <= right; left++) {
                if (s.charAt(left) == s.charAt(right) && (right - left <= 2 || dp[left+1][right-1])) {
                    dp[left][right] = true;
                }
            }
        }
        List<List<String>> res = new ArrayList<>();
        backtrack(s, 0, dp, new ArrayList<>(), res);
        return res;
    }

    private static void backtrack(String s, int start, boolean[][] dp, List<String> path, List<List<String>> res) {
        if (start == s.length()) {
            res.add(new ArrayList<>(path));
            return;
        }
        for (int end = start; end < s.length(); end++) {
            if (dp[start][end]) {
                path.add(s.substring(start, end + 1));
                backtrack(s, end + 1, dp, path, res);
                path.remove(path.size() - 1);
            }
        }
    }
}
