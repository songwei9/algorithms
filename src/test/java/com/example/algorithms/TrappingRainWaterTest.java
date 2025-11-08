package com.example.algorithms;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class TrappingRainWaterTest {
    @Test
    void testTrapBasic() {
        assertEquals(6, TrappingRainWater.trap(new int[]{0,1,0,2,1,0,1,3,2,1,2,1}));
    }

    @Test
    void testTrapFlat() {
        assertEquals(0, TrappingRainWater.trap(new int[]{3,3,3}));
    }

    @Test
    void testTrapInvalid() {
        assertThrows(IllegalArgumentException.class,
                () -> TrappingRainWater.trap(null));
    }
}
