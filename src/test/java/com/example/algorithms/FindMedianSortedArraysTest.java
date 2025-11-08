package com.example.algorithms;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class FindMedianSortedArraysTest {
    @Test
    void testFindMedianSortedArraysOdd() {
        int[] a = {1,3};
        int[] b = {2};
        assertEquals(2.0, FindMedianSortedArrays.findMedianSortedArrays(a,b));
    }

    @Test
    void testFindMedianSortedArraysEven() {
        int[] a = {1,2};
        int[] b = {3,4};
        assertEquals(2.5, FindMedianSortedArrays.findMedianSortedArrays(a,b));
    }

    @Test
    void testFindMedianSortedArraysEmptyOne() {
        int[] a = {};
        int[] b = {1};
        assertEquals(1.0, FindMedianSortedArrays.findMedianSortedArrays(a,b));
    }

    @Test
    void testFindMedianSortedArraysInvalid() {
        assertThrows(IllegalArgumentException.class,
                () -> FindMedianSortedArrays.findMedianSortedArrays(null, new int[]{1}));
    }
}
