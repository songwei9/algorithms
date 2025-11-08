package com.example.algorithms;

public class PartitionToKEqualSumSubsets {
    /** 给定一个整数数组 nums 和整数 k，如果可以将数组分成 k 个子集且每个子集的元素和相等，则返回 true。
     *  最优通常为回溯 + 剪枝（也可用 状态压缩 DP）。时间复杂度较高但用剪枝可处理中等规模。 */
    public static boolean canPartitionKSubsets(int[] nums, int k) {
        if (nums == null) throw new IllegalArgumentException("nums cannot be null");
        int total = 0;
        for (int v : nums) total += v;
        if (k <= 0 || total % k != 0) return false;
        int target = total / k;
        boolean[] used = new boolean[nums.length];
        // 排序降序有助于剪枝
        java.util.Arrays.sort(nums);
        for (int i = nums.length - 1; i >= 0; i--) {
            if (nums[i] > target) return false;
        }
        return backtrack(nums, k, target, 0, 0, used);
    }

    private static boolean backtrack(int[] nums, int k, int target, int startIndex, int currentSum, boolean[] used) {
        if (k == 1) return true; // 最后一组必然满足
        if (currentSum == target) {
            return backtrack(nums, k - 1, target, 0, 0, used);
        }
        for (int i = startIndex; i < nums.length; i++) {
            if (used[i] || currentSum + nums[i] > target) continue;
            used[i] = true;
            if (backtrack(nums, k, target, i + 1, currentSum + nums[i], used)) {
                return true;
            }
            used[i] = false;
            // 剪枝：如果当前 currentSum 为 0 且该 nums[i] 不能成功 → 后面同样大小也不会
            if (currentSum == 0) {
                return false;
            }
            // 剪枝：当前加上 nums[i] 刚好等于 target 但结果失败 → 后面类似也失败
            if (currentSum + nums[i] == target) {
                return false;
            }
        }
        return false;
    }
}
