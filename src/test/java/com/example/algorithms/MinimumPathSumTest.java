package com.example.algorithms;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class MinimumPathSumTest {
    @Test
    void testMinPathSumSmall() {
        int[][] grid = {
                {1,3,1},
                {1,5,1},
                {4,2,1}
        };
        assertEquals(7, MinimumPathSum.minPathSum(grid));  // 1->3->1->1->1
    }

    @Test
    void testMinPathSumSingleRow() {
        int[][] grid = {
                {1,2,3}
        };
        assertEquals(6, MinimumPathSum.minPathSum(grid));
    }

    @Test
    void testMinPathSumInvalid() {
        assertThrows(IllegalArgumentException.class, () -> MinimumPathSum.minPathSum(null));
    }
}
