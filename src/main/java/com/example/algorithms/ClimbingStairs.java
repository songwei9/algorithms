package com.example.algorithms;

public class ClimbingStairs {
    /** 用迭代方式实现，时间 O(n)、空间 O(1) */
    public static int climbStairs(int n) {
        if (n <= 0) return 0;
        if (n == 1) return 1;
        int a = 1, b = 2;
        for (int i = 3; i <= n; i++) {
            int c = a + b;
            a = b;
            b = c;
        }
        return b;
    }
}
