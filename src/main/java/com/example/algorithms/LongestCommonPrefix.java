package com.example.algorithms;

public class LongestCommonPrefix {
    /** 编写一个函数来查找字符串数组 strs 中的最长公共前缀。如果不存在公共前缀则返回 ""。
     *  最优解：水平扫描 + 最小字符串长度控制，时间 O(n*m)（n 个字符串，每字符串最多 m 字符）空间 O(1)／O(m) */
    public static String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) return "";
        String prefix = strs[0];
        for (int i = 1; i < strs.length; i++) {
            prefix = commonPrefix(prefix, strs[i]);
            if (prefix.isEmpty()) {
                return "";
            }
        }
        return prefix;
    }

    private static String commonPrefix(String s1, String s2) {
        int minLen = Math.min(s1.length(), s2.length());
        int idx = 0;
        while (idx < minLen && s1.charAt(idx) == s2.charAt(idx)) {
            idx++;
        }
        return s1.substring(0, idx);
    }
}
