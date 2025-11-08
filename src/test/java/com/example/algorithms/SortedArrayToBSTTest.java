package com.example.algorithms;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class SortedArrayToBSTTest {
    private int[] toArrayPreorder(TreeNode root) {
        java.util.List<Integer> list = new java.util.ArrayList<>();
        preorder(root, list);
        return list.stream().mapToInt(i->i).toArray();
    }
    private void preorder(TreeNode root, java.util.List<Integer> list) {
        if (root == null) return;
        list.add(root.val);
        preorder(root.left, list);
        preorder(root.right, list);
    }

    @Test
    void testSortedArrayToBST() {
        int[] nums = {-10,-3,0,5,9};
        TreeNode root = SortedArrayToBST.sortedArrayToBST(nums);
        int[] pre = toArrayPreorder(root);
        // 检查根为中间元素（0）或近似中间为平衡树
        assertTrue(pre.length == nums.length);
        assertEquals(0, root.val);
    }

    @Test
    void testSortedArrayToBSTEmpty() {
        TreeNode root = SortedArrayToBST.sortedArrayToBST(new int[]{});
        assertNull(root);
    }

    @Test
    void testSortedArrayToBSTSingle() {
        TreeNode root = SortedArrayToBST.sortedArrayToBST(new int[]{1});
        assertNotNull(root);
        assertEquals(1, root.val);
        assertNull(root.left);
        assertNull(root.right);
    }
}
