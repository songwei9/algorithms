package com.example.algorithms;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class TwoSumTest {
    @Test
    void testTwoSumBasic() {
        int[] nums = {2,7,11,15};
        int target = 9;
        int[] res = TwoSum.twoSum(nums, target);
        // 结果可能 {0,1} 或 {1,0}，但算法返回第一对
        assertArrayEquals(new int[]{0,1}, res);
    }

    @Test
    void testTwoSumNegative() {
        int[] nums = {-3,4,3,90};
        int target = 0;
        int[] res = TwoSum.twoSum(nums, target);
        assertArrayEquals(new int[]{0,2}, res);
    }

    @Test
    void testTwoSumThrows() {
        int[] nums = {1,2,3};
        int target = 7;
        assertThrows(IllegalArgumentException.class, () -> TwoSum.twoSum(nums, target));
    }
}
