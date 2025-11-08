package com.example.algorithms;

public class SearchInsertPosition {
    /** 在排序数组中查找目标值 target，如果找到返回索引，否则返回按顺序插入的位置。
     *  最优解：使用二分查找，时间 O(log n)、空间 O(1) */
    public static int searchInsert(int[] nums, int target) {
        if (nums == null) {
            throw new IllegalArgumentException("nums cannot be null");
        }
        int left = 0, right = nums.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        // 退出后 left 指向应插入位置
        return left;
    }
}
