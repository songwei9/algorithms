package com.example.algorithms;

import java.util.List;

public class WordBreak {
    /** 给定字符串 s 和字符串字典 wordDict ，判断 s 是否能被拆分成一个或多个字典里的单词。
     *  最优解：DP + 快速判断（哈希表）时间 O(n²)、空间 O(n) */
    public static boolean wordBreak(String s, List<String> wordDict) {
        if (s == null || wordDict == null) {
            throw new IllegalArgumentException("Inputs cannot be null");
        }
        java.util.Set<String> set = new java.util.HashSet<>(wordDict);
        boolean[] dp = new boolean[s.length() + 1];
        dp[0] = true;
        for (int i = 1; i <= s.length(); i++) {
            for (int j = 0; j < i; j++) {
                if (!dp[j]) continue;
                if (set.contains(s.substring(j, i))) {
                    dp[i] = true;
                    break;
                }
            }
        }
        return dp[s.length()];
    }
}
