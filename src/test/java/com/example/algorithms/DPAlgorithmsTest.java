package com.example.algorithms;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class DPAlgorithmsTest {

    @Test
    void testFib() {
        assertEquals(0L, DPAlgorithms.fib(0));
        assertEquals(1L, DPAlgorithms.fib(1));
        assertEquals(1L, DPAlgorithms.fib(2));
        assertEquals(2L, DPAlgorithms.fib(3));
        assertEquals(55L, DPAlgorithms.fib(10));
        assertEquals(6765L, DPAlgorithms.fib(20));
    }

    @Test
    void testClimbStairs() {
        assertEquals(1, DPAlgorithms.climbStairs(1));
        assertEquals(2, DPAlgorithms.climbStairs(2));
        assertEquals(3, DPAlgorithms.climbStairs(3));
        assertEquals(13, DPAlgorithms.climbStairs(6));
    }
}
