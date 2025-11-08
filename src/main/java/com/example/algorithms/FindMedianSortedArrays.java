package com.example.algorithms;

public class FindMedianSortedArrays {
    /** 给定两个排序数组 nums1 和 nums2，找出两个排序数组的中位数。
     *  最优解：使用二分查找，并将问题转化为「找第 k 小元素」问题，时间 O(log(min(m,n))) */
    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        if (nums1 == null || nums2 == null) {
            throw new IllegalArgumentException("nums1 or nums2 cannot be null");
        }
        int m = nums1.length, n = nums2.length;
        if (m > n) {
            return findMedianSortedArrays(nums2, nums1);
        }
        int total = m + n;
        int half = (total + 1) / 2;
        int lo = 0, hi = m;
        while (lo <= hi) {
            int i = lo + (hi - lo) / 2;
            int j = half - i;
            int nums1LeftMax = (i == 0) ? Integer.MIN_VALUE : nums1[i - 1];
            int nums1RightMin = (i == m) ? Integer.MAX_VALUE : nums1[i];
            int nums2LeftMax = (j == 0) ? Integer.MIN_VALUE : nums2[j - 1];
            int nums2RightMin = (j == n) ? Integer.MAX_VALUE : nums2[j];
            if (nums1LeftMax <= nums2RightMin && nums2LeftMax <= nums1RightMin) {
                if (total % 2 == 1) {
                    return Math.max(nums1LeftMax, nums2LeftMax);
                } else {
                    return (Math.max(nums1LeftMax, nums2LeftMax) + Math.min(nums1RightMin, nums2RightMin)) / 2.0;
                }
            } else if (nums1LeftMax > nums2RightMin) {
                hi = i - 1;
            } else {
                lo = i + 1;
            }
        }
        throw new IllegalArgumentException("Input is not valid sorted arrays");
    }
}
