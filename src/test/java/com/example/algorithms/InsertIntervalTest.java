package com.example.algorithms;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class InsertIntervalTest {
    @Test
    void testInsertIntervalBasic() {
        int[][] intervals = { {1,3}, {6,9} };
        int[] newInterval = {2,5};
        int[][] expect = { {1,5}, {6,9} };
        int[][] result = InsertInterval.insert(intervals, newInterval);
        assertArrayEquals(expect, result);
    }

    @Test
    void testInsertIntervalMergeEnd() {
        int[][] intervals = { {1,2}, {3,5}, {6,7}, {8,10}, {12,16} };
        int[] newInterval = {4,8};
        int[][] expect = { {1,2}, {3,10}, {12,16} };
        int[][] result = InsertInterval.insert(intervals, newInterval);
        assertArrayEquals(expect, result);
    }

    @Test
    void testInsertIntervalInvalid() {
        assertThrows(IllegalArgumentException.class,
                () -> InsertInterval.insert(null, new int[]{1,2}));
    }
}
