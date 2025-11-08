package com.example.algorithms;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ClimbingStairsTest {
    @Test
    void testClimbStairsSmall() {
        assertEquals(1, ClimbingStairs.climbStairs(1));
        assertEquals(2, ClimbingStairs.climbStairs(2));
        assertEquals(3, ClimbingStairs.climbStairs(3));
    }

    @Test
    void testClimbStairsLarger() {
        assertEquals(13, ClimbingStairs.climbStairs(6));  // 1+2+3+… = 8?
    }

    @Test
    void testClimbStairsZero() {
        assertEquals(0, ClimbingStairs.climbStairs(0));
    }
}
