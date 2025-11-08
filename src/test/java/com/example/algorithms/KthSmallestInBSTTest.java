package com.example.algorithms;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class KthSmallestInBSTTest {
    private TreeNode buildBST(Integer[] arr) {
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
    void testKthSmallestBasic() {
        TreeNode root = buildBST(new Integer[]{3,1,4,null,2});
        assertEquals(1, KthSmallestInBST.kthSmallest(root, 1));
        assertEquals(2, KthSmallestInBST.kthSmallest(root, 2));
    }

    @Test
    void testKthSmallestInvalid() {
        assertThrows(IllegalArgumentException.class,
                () -> KthSmallestInBST.kthSmallest(null, 1));
    }
}
