package com.example.algorithms;

public class RemoveDuplicatesFromSortedArray {
    /** 给定一个排序数组 nums，原地删除重复出现的元素，使每个元素只出现一次，返回“新长度”。
     *  最优解：双指针方式，时间 O(n)、空间 O(1) */
    public static int removeDuplicates(int[] nums) {
        if (nums == null) throw new IllegalArgumentException("nums cannot be null");
        int n = nums.length;
        if (n == 0) return 0;
        int slow = 0;
        for (int fast = 1; fast < n; fast++) {
            if (nums[fast] != nums[slow]) {
                slow++;
                nums[slow] = nums[fast];
            }
        }
        return slow + 1;
    }
}
