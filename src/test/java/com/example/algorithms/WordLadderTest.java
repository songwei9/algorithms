package com.example.algorithms;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class WordLadderTest {
    @Test
    void testLadderLengthBasic() {
        String begin = "hit";
        String end = "cog";
        String[] wordList = {"hot","dot","dog","lot","log","cog"};
        assertEquals(5, WordLadder.ladderLength(begin, end, wordList));
    }

    @Test
    void testLadderLengthImpossible() {
        String begin = "hit";
        String end = "cog";
        String[] wordList = {"hot","dot","dog","lot","log"};
        assertEquals(0, WordLadder.ladderLength(begin, end, wordList));
    }

    @Test
    void testLadderLengthInvalid() {
        assertThrows(IllegalArgumentException.class,
                () -> WordLadder.ladderLength(null, "end", new String[]{"dict"}));
    }
}
