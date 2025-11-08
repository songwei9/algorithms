package com.example.algorithms;

import java.util.ArrayList;
import java.util.List;

public class GenerateParentheses {
    /** 给定 n，生成所有由 n 对括号组成且有效的括号字符串。
     *  最优解：回溯 + 剪枝，时间复杂度约为 Catalan 数 O(C_n)（输出规模） */
    public static List<String> generateParenthesis(int n) {
        List<String> res = new ArrayList<>();
        if (n < 0) throw new IllegalArgumentException("n must be non-negative");
        backtrack(res, new StringBuilder(), 0, 0, n);
        return res;
    }

    private static void backtrack(List<String> res, StringBuilder sb, int open, int close, int max) {
        if (sb.length() == max * 2) {
            res.add(sb.toString());
            return;
        }
        if (open < max) {
            sb.append('(');
            backtrack(res, sb, open + 1, close, max);
            sb.deleteCharAt(sb.length() - 1);
        }
        if (close < open) {
            sb.append(')');
            backtrack(res, sb, open, close + 1, max);
            sb.deleteCharAt(sb.length() - 1);
        }
    }
}
