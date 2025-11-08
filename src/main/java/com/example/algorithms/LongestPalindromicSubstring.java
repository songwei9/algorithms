package com.example.algorithms;

public class LongestPalindromicSubstring {
    /** 给定字符串 s，返回其最长回文子串。
     *  最优解（一种比较通用的方法）：中心扩展法，时间 O(n^2)、空间 O(1)（如果只输出长度或位置信息）
     *  对于字符串长度较大或需最优可以用 Manacher 算法时间 O(n)，但实现较复杂。这里采用中心扩展为实用“最优”解。 */
    public static String longestPalindrome(String s) {
        if (s == null || s.length() < 1) return "";
        int start = 0, end = 0;
        for (int i = 0; i < s.length(); i++) {
            int len1 = expandAroundCenter(s, i, i);
            int len2 = expandAroundCenter(s, i, i + 1);
            int len = Math.max(len1, len2);
            if (len > end - start + 1) {
                start = i - (len - 1) / 2;
                end = i + len / 2;
            }
        }
        return s.substring(start, end + 1);
    }

    private static int expandAroundCenter(String s, int left, int right) {
        while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
            left--;
            right++;
        }
        // 返回回文长度
        return right - left - 1;
    }
}
