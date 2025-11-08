package com.example.algorithms;

public class KthSmallestInBST {
    /** 给定二叉搜索树 (BST)，返回其中第 k 小的元素。
     *  最优解：中序遍历（递归或迭代）时间 O(H + k)、空间 O(H) 其中 H 是树高度。 */
    private static int count;
    private static int result;

    public static int kthSmallest(TreeNode root, int k) {
        if (root == null || k <= 0) {
            throw new IllegalArgumentException("root cannot be null and k must be >0");
        }
        count = 0;
        result = Integer.MIN_VALUE;
        inorder(root, k);
        return result;
    }

    private static void inorder(TreeNode node, int k) {
        if (node == null) return;
        inorder(node.left, k);
        if (++count == k) {
            result = node.val;
            return;
        }
        if (count < k) inorder(node.right, k);
    }
}
