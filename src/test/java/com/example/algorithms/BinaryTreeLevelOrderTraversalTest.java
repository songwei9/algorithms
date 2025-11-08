package com.example.algorithms;

import org.junit.jupiter.api.Test;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

class BinaryTreeLevelOrderTraversalTest {
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
    void testLevelOrderNormal() {
        TreeNode root = build(new Integer[]{3,9,20,null,null,15,7});
        List<List<Integer>> res = BinaryTreeLevelOrderTraversal.levelOrder(root);
        assertEquals(List.of(List.of(3), List.of(9,20), List.of(15,7)), res);
    }

    @Test
    void testLevelOrderEmpty() {
        assertTrue(BinaryTreeLevelOrderTraversal.levelOrder(null).isEmpty());
    }
}
