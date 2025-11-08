package com.example.algorithms;

import java.util.HashSet;
import java.util.Set;

public class ValidSudoku {
    /** 判断 9×9 数独是否有效。仅验证已填数字是否符合规则：每行每列每 3×3 子盒不能有重复。
     *  最优解：一次遍历 + 三个集合/位图，时间 O(9×9) = O(1)、空间 O(1) */
    public static boolean isValidSudoku(char[][] board) {
        if (board == null || board.length != 9 || board[0].length != 9) {
            throw new IllegalArgumentException("board must be 9×9");
        }
        for (int i = 0; i < 9; i++) {
            Set<Character> rows = new HashSet<>();
            Set<Character> cols = new HashSet<>();
            Set<Character> cube = new HashSet<>();
            for (int j = 0; j < 9; j++) {
                // check row
                char c1 = board[i][j];
                if (c1 != '.') {
                    if (!rows.add(c1)) return false;
                }
                // check column
                char c2 = board[j][i];
                if (c2 != '.') {
                    if (!cols.add(c2)) return false;
                }
                // check cube
                int rowIndex = 3 * (i / 3) + j / 3;
                int colIndex = 3 * (i % 3) + j % 3;
                char c3 = board[rowIndex][colIndex];
                if (c3 != '.') {
                    if (!cube.add(c3)) return false;
                }
            }
        }
        return true;
    }
}
