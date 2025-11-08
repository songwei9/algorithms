package com.example.algorithms;

public class JumpGame {
    /** 给定整数数组 nums ，每个元素代表你在该位置可以跳跃的最大长度，判断你是否能到达最后一个位置。
     *  最优解：贪心算法，时间 O(n)、空间 O(1) */
    public static boolean canJump(int[] nums) {
        if (nums == null) throw new IllegalArgumentException("nums cannot be null");
        int reach = 0;
        for (int i = 0; i < nums.length; i++) {
            if (i > reach) return false;
            reach = Math.max(reach, i + nums[i]);
        }
        return true;
    }
}
