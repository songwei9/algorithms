package com.example.algorithms;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class JumpGameTest {
    @Test
    void testCanJumpTrue() {
        assertTrue(JumpGame.canJump(new int[]{2,3,1,1,4}));
    }

    @Test
    void testCanJumpFalse() {
        assertFalse(JumpGame.canJump(new int[]{3,2,1,0,4}));
    }

    @Test
    void testCanJumpInvalid() {
        assertThrows(IllegalArgumentException.class,
                () -> JumpGame.canJump(null));
    }
}
