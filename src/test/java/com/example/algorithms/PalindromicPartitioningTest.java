package com.example.algorithms;

import org.junit.jupiter.api.Test;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

class PalindromicPartitioningTest {
    @Test
    void testPartitionSimple() {
        String s = "aab";
        List<List<String>> res = PalindromicPartitioning.partition(s);
        assertTrue(res.contains(List.of("a","a","b")));
        assertTrue(res.contains(List.of("aa","b")));
    }

    @Test
    void testPartitionSingle() {
        String s = "a";
        List<List<String>> res = PalindromicPartitioning.partition(s);
        assertEquals(1, res.size());
        assertEquals(List.of("a"), res.get(0));
    }

    @Test
    void testPartitionInvalid() {
        assertThrows(IllegalArgumentException.class,
                () -> PalindromicPartitioning.partition(null));
    }
}
