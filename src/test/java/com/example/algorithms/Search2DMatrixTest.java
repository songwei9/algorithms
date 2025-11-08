package com.example.algorithms;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class Search2DMatrixTest {
    @Test
    void testSearchMatrixFound() {
        int[][] matrix = {
                {1,3,5,7},
                {10,11,16,20},
                {23,30,34,50}
        };
        assertTrue(Search2DMatrix.searchMatrix(matrix, 3));
        assertTrue(Search2DMatrix.searchMatrix(matrix, 30));
    }

    @Test
    void testSearchMatrixNotFound() {
        int[][] matrix = {
                {1,3,5,7},
                {10,11,16,20},
                {23,30,34,50}
        };
        assertFalse(Search2DMatrix.searchMatrix(matrix, 13));
    }

    @Test
    void testSearchMatrixEmptyOrNull() {
        assertFalse(Search2DMatrix.searchMatrix(new int[][]{}, 1));
        assertFalse(Search2DMatrix.searchMatrix(null, 1));
    }
}
