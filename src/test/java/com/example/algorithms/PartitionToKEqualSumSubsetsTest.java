package com.example.algorithms;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class PartitionToKEqualSumSubsetsTest {
    @Test
    void testCanPartitionKSubsetsTrue() {
        assertTrue(PartitionToKEqualSumSubsets.canPartitionKSubsets(new int[]{4,3,2,3,5,2,1}, 4));
    }

    @Test
    void testCanPartitionKSubsetsFalse() {
        assertFalse(PartitionToKEqualSumSubsets.canPartitionKSubsets(new int[]{1,2,3,4}, 3));
    }

    @Test
    void testCanPartitionKSubsetsInvalid() {
        assertThrows(IllegalArgumentException.class, () -> PartitionToKEqualSumSubsets.canPartitionKSubsets(null, 2));
    }
}
