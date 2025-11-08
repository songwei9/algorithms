package com.example.algorithms;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class MaxSubarraySumKTest {
    @Test
    void testMaxSubarraySumFixedKBasic() {
        int[] nums = {2,1,5,1,3,2};
        assertEquals(9, MaxSubarraySumK.maxSubarraySumFixedK(nums, 3)); // [5,1,3]
    }

    @Test
    void testMaxSubarraySumFixedKAllNeg() {
        int[] nums = {-2,-3,-1,-5};
        assertEquals(-1, MaxSubarraySumK.maxSubarraySumFixedK(nums, 1));
    }

    @Test
    void testMaxSubarraySumFixedKInvalid() {
        assertThrows(IllegalArgumentException.class,
                () -> MaxSubarraySumK.maxSubarraySumFixedK(new int[]{1,2}, 3));
    }
}
