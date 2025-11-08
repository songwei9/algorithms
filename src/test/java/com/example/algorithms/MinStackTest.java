package com.example.algorithms;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class MinStackTest {
    @Test
    void testMinStackOperations() {
        MinStack stack = new MinStack();
        stack.push(-2);
        stack.push(0);
        stack.push(-3);
        assertEquals(-3, stack.getMin());
        stack.pop();
        assertEquals(0, stack.top());
        assertEquals(-2, stack.getMin());
    }

    @Test
    void testMinStackEmptyPop() {
        MinStack stack = new MinStack();
        assertThrows(IllegalStateException.class, () -> stack.pop());
    }

    @Test
    void testMinStackEmptyTop() {
        MinStack stack = new MinStack();
        assertThrows(IllegalStateException.class, () -> stack.top());
    }

    @Test
    void testMinStackEmptyGetMin() {
        MinStack stack = new MinStack();
        assertThrows(IllegalStateException.class, () -> stack.getMin());
    }
}
