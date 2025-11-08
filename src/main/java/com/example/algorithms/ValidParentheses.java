package com.example.algorithms;

import java.util.ArrayDeque;
import java.util.Deque;

public class ValidParentheses {
    /** 使用栈，时间 O(n)、空间 O(n) */
    public static boolean isValid(String s) {
        if (s == null) return false;
        Deque<Character> stack = new ArrayDeque<>();
        for (char c : s.toCharArray()) {
            if (c == '(') stack.push(')');
            else if (c == '{') stack.push('}');
            else if (c == '[') stack.push(']');
            else {
                if (stack.isEmpty() || stack.pop() != c) {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
}
