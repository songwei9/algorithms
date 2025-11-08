package com.example.algorithms;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class RotateImageTest {
    @Test
    void testRotateSimple() {
        int[][] input = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };
        int[][] expected = {
                {7,4,1},
                {8,5,2},
                {9,6,3}
        };
        RotateImage.rotate(input);
        assertArrayEquals(expected, input);
    }

    @Test
    void testRotateInvalid() {
        assertThrows(IllegalArgumentException.class,
                () -> RotateImage.rotate(new int[][]{{1,2,3},{4,5,6}}));
    }
}
