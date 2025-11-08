package com.example.algorithms;

/**
 * 二叉树节点类
 */
public class TreeNode {
    // 节点存储的值
    public int val;
    // 左子节点引用
    public TreeNode left;
    // 右子节点引用
    public TreeNode right;

    /**
     * 构造方法：初始化节点值，左右子节点默认为null
     * @param val 节点存储的值
     */
    public TreeNode(int val) {
        this.val = val;
        this.left = null;
        this.right = null;
    }
}