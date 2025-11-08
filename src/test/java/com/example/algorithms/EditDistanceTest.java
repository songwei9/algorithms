package com.example.algorithms;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class EditDistanceTest {
    @Test
    void testMinDistanceEqual() {
        assertEquals(0, EditDistance.minDistance("abc", "abc"));
    }

    @Test
    void testMinDistanceInsert() {
        assertEquals(1, EditDistance.minDistance("horse", "hors"));
    }

    @Test
    void testMinDistanceReplaceAndDelete() {
        assertEquals(5, EditDistance.minDistance("intention", "execution"));
    }

    @Test
    void testMinDistanceInvalid() {
        assertThrows(IllegalArgumentException.class,
                () -> EditDistance.minDistance(null, "abc"));
    }
}
