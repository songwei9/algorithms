package com.example.algorithms;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class LongestIncreasingSubsequenceTest {
    @Test
    void testLengthOfLISSimple() {
        int[] nums = {10,9,2,5,3,7,101,18};
        assertEquals(4, LongestIncreasingSubsequence.lengthOfLIS(nums));
    }

    @Test
    void testLengthOfLISEmpty() {
        assertEquals(0, LongestIncreasingSubsequence.lengthOfLIS(new int[]{}));
    }

    @Test
    void testLengthOfLISInvalid() {
        assertThrows(IllegalArgumentException.class,
                () -> LongestIncreasingSubsequence.lengthOfLIS(null));
    }
}
