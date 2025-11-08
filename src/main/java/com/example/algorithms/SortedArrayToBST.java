package com.example.algorithms;

public class SortedArrayToBST {
    /** 给定一个升序整数数组，将其转换为一个高度平衡的 BST。
     *  最优解：递归 divide and conquer，时间 O(n)、空间 O(log n) 递归栈 */
    public static TreeNode sortedArrayToBST(int[] nums) {
        if (nums == null) return null;
        return buildBST(nums, 0, nums.length - 1);
    }

    private static TreeNode buildBST(int[] nums, int lo, int hi) {
        if (lo > hi) return null;
        int mid = lo + (hi - lo) / 2;
        TreeNode node = new TreeNode(nums[mid]);
        node.left = buildBST(nums, lo, mid - 1);
        node.right = buildBST(nums, mid + 1, hi);
        return node;
    }
}
