package com.example.algorithms;

import org.junit.jupiter.api.Test;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

class WordBreakTest {
    @Test
    void testWordBreakTrue() {
        String s = "leetcode";
        List<String> dict = List.of("leet", "code");
        assertTrue(WordBreak.wordBreak(s, dict));
    }

    @Test
    void testWordBreakFalse() {
        String s = "applepenapple";
        List<String> dict = List.of("apple", "pen");
        assertTrue(WordBreak.wordBreak(s, dict));

        s = "catsandog";
        List<String> dict2 = List.of("cats", "dog", "sand", "and", "cat");
        assertFalse(WordBreak.wordBreak(s, dict2));
    }

    @Test
    void testWordBreakInvalid() {
        assertThrows(IllegalArgumentException.class,
                () -> WordBreak.wordBreak(null, List.of("x")));
    }
}
