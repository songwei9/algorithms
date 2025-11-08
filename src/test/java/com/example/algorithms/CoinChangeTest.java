package com.example.algorithms;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CoinChangeTest {
    @Test
    void testCoinChangeBasic() {
        assertEquals(3, CoinChange.coinChange(new int[]{1,2,5}, 11));
    }

    @Test
    void testCoinChangeNoSolution() {
        assertEquals(-1, CoinChange.coinChange(new int[]{2}, 3));
    }

    @Test
    void testCoinChangeInvalid() {
        assertThrows(IllegalArgumentException.class,
                () -> CoinChange.coinChange(null, 100));
    }
}
