package com.example.algorithms;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class MaximumDepthBinaryTreeTest {
    private TreeNode build(Integer[] arr) {
        if (arr == null || arr.length == 0) return null;
        TreeNode root = new TreeNode(arr[0]);
        java.util.Queue<TreeNode> q = new java.util.LinkedList<>();
        q.offer(root);
        int i = 1;
        while (i < arr.length) {
            TreeNode node = q.poll();
            if (node != null) {
                Integer left = arr[i++];
                if (left != null) { node.left = new TreeNode(left); q.offer(node.left); }
                if (i < arr.length) {
                    Integer right = arr[i++];
                    if (right != null) { node.right = new TreeNode(right); q.offer(node.right); }
                }
            }
        }
        return root;
    }

    @Test
    void testMaxDepthNormal() {
        TreeNode root = build(new Integer[]{3,9,20,null,null,15,7});
        assertEquals(3, MaximumDepthBinaryTree.maxDepth(root));
    }

    @Test
    void testMaxDepthSingleNode() {
        TreeNode root = new TreeNode(1);
        assertEquals(1, MaximumDepthBinaryTree.maxDepth(root));
    }

    @Test
    void testMaxDepthEmpty() {
        assertEquals(0, MaximumDepthBinaryTree.maxDepth(null));
    }
}
