package com.example.algorithms;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class MinimumGeneticMutationTest {
    @Test
    void testMinMutationBasic() {
        String start = "AACCGGTT";
        String end = "AACCGGTA";
        String[] bank = {"AACCGGTA"};
        assertEquals(1, MinimumGeneticMutation.minMutation(start, end, bank));
    }

    @Test
    void testMinMutationTwoSteps() {
        String start = "AACCGGTT";
        String end = "AAACGGTA";
        String[] bank = {"AACCGGTA","AACCGCTA","AAACGGTA"};
        assertEquals(2, MinimumGeneticMutation.minMutation(start, end, bank));
    }

    @Test
    void testMinMutationImpossible() {
        String start = "AAAAACCC";
        String end = "AACCCCCC";
        String[] bank = {"AAAACCCC","AAACCCCC","AACCCCCC"};
        assertEquals(3, MinimumGeneticMutation.minMutation(start, end, bank));
    }

    @Test
    void testMinMutationInvalid() {
        assertThrows(IllegalArgumentException.class,
                () -> MinimumGeneticMutation.minMutation(null, "END", new String[]{"BANK"}));
    }
}
