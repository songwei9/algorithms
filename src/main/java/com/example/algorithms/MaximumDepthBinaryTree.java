package com.example.algorithms;

public class MaximumDepthBinaryTree {
    /** 给定二叉树根节点，返回其最大深度。
     *  最优解：递归 DFS，时间 O(N)、空间 O(H)（H 为树高度） */
    public static int maxDepth(TreeNode root) {
        if (root == null) return 0;
        int left = maxDepth(root.left);
        int right = maxDepth(root.right);
        return Math.max(left, right) + 1;
    }
}
