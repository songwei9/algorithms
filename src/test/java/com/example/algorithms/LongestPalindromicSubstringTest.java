package com.example.algorithms;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class LongestPalindromicSubstringTest {
    @Test
    void testLongestPalindromeSimple() {
        assertEquals("aba", LongestPalindromicSubstring.longestPalindrome("aba"));
        assertEquals("bab", LongestPalindromicSubstring.longestPalindrome("babad"));
    }

    @Test
    void testLongestPalindromeSingleChar() {
        assertEquals("a", LongestPalindromicSubstring.longestPalindrome("a"));
    }

    @Test
    void testLongestPalindromeEmpty() {
        assertEquals("", LongestPalindromicSubstring.longestPalindrome(""));
        assertEquals("", LongestPalindromicSubstring.longestPalindrome(null));
    }
}
