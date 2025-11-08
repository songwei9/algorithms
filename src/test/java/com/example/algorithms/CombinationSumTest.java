package com.example.algorithms;

import org.junit.jupiter.api.Test;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

class CombinationSumTest {
    @Test
    void testCombinationSumBasic() {
        int[] candidates = {2,3,6,7};
        List<List<Integer>> res = CombinationSum.combinationSum(candidates, 7);
        assertTrue(res.contains(List.of(7)));
        assertTrue(res.contains(List.of(2,2,3)));
        assertEquals(2, res.size());
    }

    @Test
    void testCombinationSumEdge() {
        int[] candidates = {2};
        List<List<Integer>> res = CombinationSum.combinationSum(candidates, 1);
        assertTrue(res.isEmpty());
    }

    @Test
    void testCombinationSumInvalid() {
        assertThrows(IllegalArgumentException.class,
                () -> CombinationSum.combinationSum(null, 5));
    }
}
