package com.example.algorithms;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.Arrays;

class SlidingWindowMaximumTest {
    @Test
    void testMaxSlidingWindowBasic() {
        int[] nums = {1,3,-1,-3,5,3,6,7};
        int k = 3;
        int[] res = SlidingWindowMaximum.maxSlidingWindow(nums, k);
        assertArrayEquals(new int[]{3,3,5,5,6,7}, res);
    }

    @Test
    void testMaxSlidingWindowKEqualsLength() {
        int[] nums = {1,2};
        int[] res = SlidingWindowMaximum.maxSlidingWindow(nums, 2);
        assertArrayEquals(new int[]{2}, res);
    }

    @Test
    void testMaxSlidingWindowInvalid() {
        assertThrows(IllegalArgumentException.class,
                () -> SlidingWindowMaximum.maxSlidingWindow(null, 3));
    }
}
