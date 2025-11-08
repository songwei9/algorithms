package com.example.algorithms;

public class WordSearch {
    /** 给定二维字符网格 board 和单词 word ，判断是否能在网格中找到该单词（字母来自相邻上下左右，且不重复使用同一格）。
     *  最优解：回溯 + 剪枝，时间 O(m×n×4^L)（m,n 网格尺寸，L 单词长度）。 */
    public static boolean exist(char[][] board, String word) {
        if (board == null || word == null) throw new IllegalArgumentException("inputs cannot be null");
        int m = board.length, n = board[0].length;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (dfs(board, i, j, word, 0)) {
                    return true;
                }
            }
        }
        return false;
    }

    private static boolean dfs(char[][] board, int i, int j, String word, int idx) {
        if (idx == word.length()) return true;
        if (i < 0 || j < 0 || i >= board.length || j >= board[0].length
                || board[i][j] != word.charAt(idx)) {
            return false;
        }
        char temp = board[i][j];
        board[i][j] = '#';  // mark visited
        boolean found = dfs(board, i+1, j, word, idx+1) ||
                dfs(board, i-1, j, word, idx+1) ||
                dfs(board, i, j+1, word, idx+1) ||
                dfs(board, i, j-1, word, idx+1);
        board[i][j] = temp;
        return found;
    }
}
