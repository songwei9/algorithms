package com.example.algorithms;

import java.util.PriorityQueue;
import java.util.Random;

public class KthLargestElementInAnArray {
    /** 寻找数组中第 k 大的元素。
     *  最优解：快速选择（期望 O(n)）或者堆（O(n log k)）。这里用快速选择。 */
    public static int findKthLargest(int[] nums, int k) {
        if (nums == null) throw new IllegalArgumentException("nums cannot be null");
        int n = nums.length;
        if (k < 1 || k > n) throw new IllegalArgumentException("k is invalid");
        return quickSelect(nums, 0, n - 1, n - k);
    }

    private static int quickSelect(int[] a, int lo, int hi, int kIndex) {
        Random rand = new Random();
        while (lo <= hi) {
            int pivotIndex = lo + rand.nextInt(hi - lo + 1);
            int pivot = a[pivotIndex];
            int i = lo, j = hi;
            while (i <= j) {
                while (a[i] < pivot) i++;
                while (a[j] > pivot) j--;
                if (i <= j) {
                    int tmp = a[i]; a[i] = a[j]; a[j] = tmp;
                    i++; j--;
                }
            }
            if (lo + kIndex <= j) {
                hi = j;
            } else if (lo + kIndex >= i) {
                kIndex -= (i - lo);
                lo = i;
            } else {
                return a[j + 1];
            }
        }
        return Integer.MIN_VALUE; // unreachable
    }
}
