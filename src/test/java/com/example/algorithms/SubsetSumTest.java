package com.example.algorithms;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class SubsetSumTest {
    @Test
    void testCanSubsetSumTrue() {
        assertTrue(SubsetSum.canSubsetSum(new int[]{3,34,4,12,5,2}, 9));
    }

    @Test
    void testCanSubsetSumFalse() {
        assertFalse(SubsetSum.canSubsetSum(new int[]{3,34,4,12,5,2}, 30));
    }

    @Test
    void testCanSubsetSumInvalid() {
        assertThrows(IllegalArgumentException.class,
                () -> SubsetSum.canSubsetSum(null, 5));
    }
}
