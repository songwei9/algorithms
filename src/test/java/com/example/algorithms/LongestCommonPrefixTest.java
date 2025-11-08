package com.example.algorithms;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class LongestCommonPrefixTest {
    @Test
    void testLongestCommonPrefixNormal() {
        String[] strs = {"flower","flow","flight"};
        assertEquals("fl", LongestCommonPrefix.longestCommonPrefix(strs));
    }

    @Test
    void testLongestCommonPrefixNoCommon() {
        String[] strs = {"dog","racecar","car"};
        assertEquals("", LongestCommonPrefix.longestCommonPrefix(strs));
    }

    @Test
    void testLongestCommonPrefixSingleString() {
        String[] strs = {"alone"};
        assertEquals("alone", LongestCommonPrefix.longestCommonPrefix(strs));
    }

    @Test
    void testLongestCommonPrefixEmptyArray() {
        assertEquals("", LongestCommonPrefix.longestCommonPrefix(new String[]{}));
    }

    @Test
    void testLongestCommonPrefixNullArray() {
        assertEquals("", LongestCommonPrefix.longestCommonPrefix(null));
    }
}
