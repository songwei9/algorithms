package com.example.algorithms;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class SortAlgorithmsTest {

    @Test
    void testSortEmpty() {
        int[] arr = {};
        SortAlgorithms.sort(arr);
        assertArrayEquals(new int[]{}, arr);
    }

    @Test
    void testSortSingle() {
        int[] arr = {1};
        SortAlgorithms.sort(arr);
        assertArrayEquals(new int[]{1}, arr);
    }

    @Test
    void testSortGeneral() {
        int[] arr = {5,3,8,1,2,9,4,7,6,0};
        int[] expected = {0,1,2,3,4,5,6,7,8,9};
        SortAlgorithms.sort(arr);
        assertArrayEquals(expected, arr);
    }

    @Test
    void testQuickSortGeneral() {
        int[] arr = {10,9,8,7,6,5,4,3,2,1};
        int[] expected = {1,2,3,4,5,6,7,8,9,10};
        SortAlgorithms.quickSort(arr);
        assertArrayEquals(expected, arr);
    }
}
