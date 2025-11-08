package com.example.algorithms;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class NumberOfIslandsTest {
    @Test
    void testNumIslandsBasic() {
        char[][] grid = {
                {'1','1','1','1','0'},
                {'1','1','0','1','0'},
                {'1','1','0','0','0'},
                {'0','0','0','0','0'}
        };
        assertEquals(1, NumberOfIslands.numIslands(grid));
    }

    @Test
    void testNumIslandsMultiple() {
        char[][] grid = {
                {'1','1','0','0','0'},
                {'1','1','0','0','0'},
                {'0','0','1','0','0'},
                {'0','0','0','1','1'}
        };
        assertEquals(3, NumberOfIslands.numIslands(grid));
    }

    @Test
    void testNumIslandsInvalid() {
        assertThrows(IllegalArgumentException.class,
                () -> NumberOfIslands.numIslands(null));
    }
}
