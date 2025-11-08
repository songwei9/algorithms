package com.example.algorithms;

public class PlusOne {
    /** 给定一个由整数组成的非空数组所表示的非负整数，在该数的基础上加一。
     *  最优解：从尾部开始处理，遇到 <9 则加一返回，否则设置为0继续。时间 O(n)、空间 O(1)（额外数组可能因全为9 时） */
    public static int[] plusOne(int[] digits) {
        if (digits == null || digits.length == 0) {
            throw new IllegalArgumentException("digits cannot be null or empty");
        }
        int n = digits.length;
        for (int i = n - 1; i >= 0; i--) {
            if (digits[i] < 9) {
                digits[i]++;
                return digits;
            }
            digits[i] = 0;
        }
        // 所有为9的情况，返回长度+1数组，如 [9,9] → [1,0,0]
        int[] res = new int[n + 1];
        res[0] = 1;
        return res;
    }
}
