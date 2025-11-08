package com.example.algorithms;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class WordSearchTest {
    @Test
    void testExistTrue() {
        char[][] board = {
                {'A','B','C','E'},
                {'S','F','C','S'},
                {'A','D','E','E'}
        };
        assertTrue(WordSearch.exist(board, "ABCCED"));
    }

    @Test
    void testExistFalse() {
        char[][] board = {
                {'A','B','C','E'},
                {'S','F','C','S'},
                {'A','D','E','E'}
        };
        assertFalse(WordSearch.exist(board, "SEEFS"));
    }

    @Test
    void testExistInvalid() {
        assertThrows(IllegalArgumentException.class,
                () -> WordSearch.exist(null, "ANY"));
    }
}
