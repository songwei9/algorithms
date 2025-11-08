package com.example.algorithms;

public class Search2DMatrix {
    /** 给定一个 m x n 矩阵 matrix，其中每行从左到右升序，每行的第一个元素大于前一行的最后一个元素。
     *  编写一个高效算法在矩阵中搜索 target 值。
     *  最优：将二维矩阵视作一维有序数组，用二分查找，时间 O(log(mn))，空间 O(1) */
    public static boolean searchMatrix(int[][] matrix, int target) {
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) return false;
        int m = matrix.length, n = matrix[0].length;
        int left = 0, right = m * n - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            int midValue = matrix[mid / n][mid % n];
            if (midValue == target) {
                return true;
            } else if (midValue < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return false;
    }
}
