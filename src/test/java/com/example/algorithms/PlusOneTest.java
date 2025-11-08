package com.example.algorithms;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class PlusOneTest {
    @Test
    void testPlusOneSimple() {
        assertArrayEquals(new int[]{1,2,4}, PlusOne.plusOne(new int[]{1,2,3}));
    }

    @Test
    void testPlusOneWithCarry() {
        assertArrayEquals(new int[]{4,3,2,2}, PlusOne.plusOne(new int[]{4,3,2,1}));
    }

    @Test
    void testPlusOneAll9s() {
        assertArrayEquals(new int[]{1,0,0,0}, PlusOne.plusOne(new int[]{9,9,9}));
    }

    @Test
    void testPlusOneSingle9() {
        assertArrayEquals(new int[]{1,0}, PlusOne.plusOne(new int[]{9}));
    }

    @Test
    void testPlusOneInvalid() {
        assertThrows(IllegalArgumentException.class, () -> PlusOne.plusOne(new int[]{}));
    }
}
