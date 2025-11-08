package com.example.algorithms;

public class TrappingRainWater {
    /** 给定 height 数组，表示柱状图，计算雨水能被困多少。
     *  最优解：双指针从两侧往中间，时间 O(n)、空间 O(1) */
    public static int trap(int[] height) {
        if (height == null) throw new IllegalArgumentException("height cannot be null");
        int left = 0, right = height.length - 1;
        int leftMax = 0, rightMax = 0;
        int water = 0;
        while (left < right) {
            if (height[left] < height[right]) {
                if (height[left] >= leftMax) leftMax = height[left];
                else water += (leftMax - height[left]);
                left++;
            } else {
                if (height[right] >= rightMax) rightMax = height[right];
                else water += (rightMax - height[right]);
                right--;
            }
        }
        return water;
    }
}
