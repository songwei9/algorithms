package com.example.algorithms;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class RemoveDuplicatesFromSortedArrayTest {
    @Test
    void testRemoveDuplicatesAllUnique() {
        int[] nums = {1,2,3};
        assertEquals(3, RemoveDuplicatesFromSortedArray.removeDuplicates(nums));
    }

    @Test
    void testRemoveDuplicatesWithRepeats() {
        int[] nums = {1,1,2};
        assertEquals(2, RemoveDuplicatesFromSortedArray.removeDuplicates(nums));
        assertEquals(1, nums[0]);
        assertEquals(2, nums[1]);
    }

    @Test
    void testRemoveDuplicatesEmpty() {
        int[] nums = {};
        assertEquals(0, RemoveDuplicatesFromSortedArray.removeDuplicates(nums));
    }

    @Test
    void testRemoveDuplicatesInvalid() {
        assertThrows(IllegalArgumentException.class, () -> RemoveDuplicatesFromSortedArray.removeDuplicates(null));
    }
}
