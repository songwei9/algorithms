package com.example.algorithms;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class MaximumSubarrayTest {
    @Test
    void testMaxSubArrayAllPositive() {
        int[] nums = {1,2,3,4};
        assertEquals(10, MaximumSubarray.maxSubArray(nums));
    }

    @Test
    void testMaxSubArrayMixed() {
        int[] nums = {-2,1,-3,4,-1,2,1,-5,4};
        assertEquals(6, MaximumSubarray.maxSubArray(nums));  // [4,-1,2,1]
    }

    @Test
    void testMaxSubArraySingle() {
        int[] nums = {-1};
        assertEquals(-1, MaximumSubarray.maxSubArray(nums));
    }
}
