package com.example.algorithms;

import java.util.Deque;
import java.util.ArrayDeque;

public class MinStack {
    /** 支持 push, pop, top, 获取最小元素 getMin 的栈，且所有操作均为 O(1) 时间。
     *  最优解：使用两个栈或一个栈 + 保存当前最小值。这里采用双栈法。 */
    private Deque<Integer> stack;
    private Deque<Integer> minStack;

    public MinStack() {
        stack = new ArrayDeque<>();
        minStack = new ArrayDeque<>();
    }

    public void push(int x) {
        stack.push(x);
        if (minStack.isEmpty() || x <= minStack.peek()) {
            minStack.push(x);
        }
    }

    public void pop() {
        if (stack.isEmpty()) {
            throw new IllegalStateException("Stack is empty");
        }
        int x = stack.pop();
        if (x == minStack.peek()) {
            minStack.pop();
        }
    }

    public int top() {
        if (stack.isEmpty()) {
            throw new IllegalStateException("Stack is empty");
        }
        return stack.peek();
    }

    public int getMin() {
        if (minStack.isEmpty()) {
            throw new IllegalStateException("Stack is empty");
        }
        return minStack.peek();
    }
}
