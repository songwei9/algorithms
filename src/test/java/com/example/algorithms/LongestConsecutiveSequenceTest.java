package com.example.algorithms;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class LongestConsecutiveSequenceTest {
    @Test
    void testLongestConsecutiveBasic() {
        int[] nums = {100, 4, 200, 1, 3, 2};
        assertEquals(4, LongestConsecutiveSequence.longestConsecutive(nums));
    }

    @Test
    void testLongestConsecutiveSingle() {
        int[] nums = {1};
        assertEquals(1, LongestConsecutiveSequence.longestConsecutive(nums));
    }

    @Test
    void testLongestConsecutiveEmpty() {
        int[] nums = {};
        assertEquals(0, LongestConsecutiveSequence.longestConsecutive(nums));
    }

    @Test
    void testLongestConsecutiveInvalid() {
        assertThrows(IllegalArgumentException.class,
                () -> LongestConsecutiveSequence.longestConsecutive(null));
    }
}
