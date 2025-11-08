package com.example.algorithms;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class PerfectSquaresTest {
    @Test
    void testNumSquaresSmall() {
        assertEquals(1, PerfectSquares.numSquares(1));
        assertEquals(2, PerfectSquares.numSquares(2));
        assertEquals(2, PerfectSquares.numSquares(5)); // 4+1
    }

    @Test
    void testNumSquaresLarger() {
        assertEquals(3, PerfectSquares.numSquares(12)); // 4+4+4
    }

    @Test
    void testNumSquaresInvalid() {
        assertThrows(IllegalArgumentException.class,
                () -> PerfectSquares.numSquares(0));
    }
}
