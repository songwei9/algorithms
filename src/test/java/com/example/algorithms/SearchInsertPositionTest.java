package com.example.algorithms;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class SearchInsertPositionTest {
    @Test
    void testSearchInsertFound() {
        int[] nums = {1,3,5,6};
        assertEquals(2, SearchInsertPosition.searchInsert(nums,5));
    }

    @Test
    void testSearchInsertInsertMiddle() {
        int[] nums = {1,3,5,6};
        assertEquals(1, SearchInsertPosition.searchInsert(nums,2));
    }

    @Test
    void testSearchInsertInsertEnd() {
        int[] nums = {1,3,5,6};
        assertEquals(4, SearchInsertPosition.searchInsert(nums,7));
    }

    @Test
    void testSearchInsertInsertStart() {
        int[] nums = {1,3,5,6};
        assertEquals(0, SearchInsertPosition.searchInsert(nums,0));
    }

    @Test
    void testSearchInsertInvalid() {
        assertThrows(IllegalArgumentException.class, () -> SearchInsertPosition.searchInsert(null,5));
    }
}
