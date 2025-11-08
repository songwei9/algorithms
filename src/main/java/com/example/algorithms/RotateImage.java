package com.example.algorithms;

public class RotateImage {
    /** 给定 n × n 矩阵 matrix，顺时针旋转 90 度。
     *  最优解：先转置再每行反转，时间 O(n²)、空间 O(1)（原地） */
    public static void rotate(int[][] matrix) {
        if (matrix == null || matrix.length == 0 || matrix.length != matrix[0].length) {
            throw new IllegalArgumentException("matrix must be non-empty square");
        }
        int n = matrix.length;
        // 转置
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                int tmp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = tmp;
            }
        }
        // 每行反转
        for (int i = 0; i < n; i++) {
            int left = 0, right = n - 1;
            while (left < right) {
                int tmp = matrix[i][left];
                matrix[i][left] = matrix[i][right];
                matrix[i][right] = tmp;
                left++;
                right--;
            }
        }
    }
}
