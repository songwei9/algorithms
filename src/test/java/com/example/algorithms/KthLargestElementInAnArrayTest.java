package com.example.algorithms;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class KthLargestElementInAnArrayTest {
    @Test
    void testFindKthLargestBasic() {
        int[] nums = {3,2,1,5,6,4};
        assertEquals(5, KthLargestElementInAnArray.findKthLargest(nums, 2));
    }

    @Test
    void testFindKthLargestAllSame() {
        int[] nums = {1,1,1,1,1};
        assertEquals(1, KthLargestElementInAnArray.findKthLargest(nums, 3));
    }

    @Test
    void testFindKthLargestInvalid() {
        assertThrows(IllegalArgumentException.class,
                () -> KthLargestElementInAnArray.findKthLargest(null, 1));
    }
}
