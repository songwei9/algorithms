package com.example.algorithms;

public class NumberOfIslands {
    /** 给定二维 grid 仅由字符 '1'（陆地）和 '0'（水）组成，返回岛屿的数量（陆地连通块）。
     * 最优解：DFS/BFS 遍历，时间 O(m×n)，空间 O(m×n)（递归栈或队列） */
    public static int numIslands(char[][] grid) {
        if (grid == null) {
            throw new IllegalArgumentException("grid cannot be null");
        }
        int m = grid.length, n = grid[0].length;
        int count = 0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j] == '1') {
                    count++;
                    dfs(grid, i, j, m, n);
                }
            }
        }
        return count;
    }

    private static void dfs(char[][] grid, int i, int j, int m, int n) {
        if (i < 0 || j < 0 || i >= m || j >= n || grid[i][j] != '1') return;
        grid[i][j] = '0';
        dfs(grid, i + 1, j, m, n);
        dfs(grid, i - 1, j, m, n);
        dfs(grid, i, j + 1, m, n);
        dfs(grid, i, j - 1, m, n);
    }
}
