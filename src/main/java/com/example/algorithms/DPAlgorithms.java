package com.example.algorithms;

public class DPAlgorithms {

    /** 斐波那契数列：使用迭代版本，时间 O(n) 空间 O(1) */
    public static long fib(int n) {
        if (n < 0) throw new IllegalArgumentException("n must >= 0");
        if (n == 0) return 0L;
        if (n == 1) return 1L;
        long prev = 0L, curr = 1L;
        for (int i = 2; i <= n; i++) {
            long next = prev + curr;
            prev = curr;
            curr = next;
        }
        return curr;
    }

    /** 动态规划 — 典型：爬楼梯 (n 阶可走1或2阶) 返回方案数 */
    public static int climbStairs(int n) {
        if (n <= 2) return n;
        int a = 1, b = 2;
        for (int i = 3; i <= n; i++) {
            int c = a + b;
            a = b;
            b = c;
        }
        return b;
    }

    static void main() {
        System.out.println(climbStairs(6));
    }
}
