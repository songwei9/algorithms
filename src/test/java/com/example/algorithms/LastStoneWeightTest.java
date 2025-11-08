package com.example.algorithms;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class LastStoneWeightTest {
    @Test
    void testLastStoneWeightBasic() {
        int[] stones = {2,7,4,1,8,1};
        assertEquals(1, LastStoneWeight.lastStoneWeight(stones));
    }

    @Test
    void testLastStoneWeightEmpty() {
        int[] stones = {};
        assertEquals(0, LastStoneWeight.lastStoneWeight(stones));
    }

    @Test
    void testLastStoneWeightInvalid() {
        assertThrows(IllegalArgumentException.class,
                () -> LastStoneWeight.lastStoneWeight(null));
    }
}
