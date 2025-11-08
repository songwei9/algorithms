package com.example.algorithms;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ThreeSumClosestTest {
    @Test
    void testThreeSumClosestBasic() {
        int[] nums = {-1,2,1,-4};
        int target = 1;
        assertEquals(2, ThreeSumClosest.threeSumClosest(nums, target));
    }

    @Test
    void testThreeSumClosestExact() {
        int[] nums = {0,0,0};
        int target = 1;
        assertEquals(0, ThreeSumClosest.threeSumClosest(nums, target));
    }

    @Test
    void testThreeSumClosestInvalid() {
        assertThrows(IllegalArgumentException.class,
                () -> ThreeSumClosest.threeSumClosest(new int[]{1,2}, 3));
    }
}
