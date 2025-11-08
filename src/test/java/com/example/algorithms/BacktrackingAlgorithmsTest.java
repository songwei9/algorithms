package com.example.algorithms;

import org.junit.jupiter.api.Test;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

class BacktrackingAlgorithmsTest {

    @Test
    void testSubsetsEmpty() {
        List<List<Integer>> res = BacktrackingAlgorithms.subsets(new int[]{});
        assertEquals(1, res.size());
        assertTrue(res.contains(List.of()));
    }

    @Test
    void testSubsetsGeneral() {
        int[] nums = {1,2,3};
        List<List<Integer>> res = BacktrackingAlgorithms.subsets(nums);
        // 幂集大小应为 2^3 = 8
        assertEquals(8, res.size());
        // 简单检查部分子集存在
        assertTrue(res.contains(List.of()));
        assertTrue(res.contains(List.of(1)));
        assertTrue(res.contains(List.of(2,3)));
        assertTrue(res.contains(List.of(1,2,3)));
    }
}
