package com.example.algorithms;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.Arrays;

class TopKFrequentTest {
    @Test
    void testTopKFrequentBasic() {
        int[] nums = {1,1,1,2,2,3};
        int[] res = TopKFrequent.topKFrequent(nums, 2);
        Arrays.sort(res);
        assertArrayEquals(new int[]{1,2}, res);
    }

    @Test
    void testTopKFrequentSingle() {
        int[] nums = {1};
        int[] res = TopKFrequent.topKFrequent(nums, 1);
        assertArrayEquals(new int[]{1}, res);
    }

    @Test
    void testTopKFrequentNull() {
        assertThrows(IllegalArgumentException.class, () -> TopKFrequent.topKFrequent(null, 1));
    }
}
