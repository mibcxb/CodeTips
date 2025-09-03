package com.mibcxb.codetips.samples.questions;

public class P2Q14 {
    public static void main(String[] args) {

    }

    public static int clusterZombies(int[][] source) {
        if (source == null || source.length == 0 || source[0].length == 0) {
            return 0;
        }
        int count = 0;
        int rows = source.length;
        int cols = source[0].length;
        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < cols; col++) {
                if (source[row][col] == 1) { // 发现未访问的非零元素
                    count++; // 增加区域计数
                    dfs(source, row, col); // 标记相邻区域
                }
            }
        }
        return count;
    }

    public static void dfs(int[][] grid, int i, int j) {
        if (i < 0 || i >= grid.length || j < 0 || j >= grid[0].length) {
            return; // 边界检测
        }
        if (grid[i][j] == 0) {
            return; // 没有僵尸
        }
        grid[i][j] = 0; // 标记已访问元素
        // 递归检查四周
        dfs(grid, i + 1, j); // 下
        dfs(grid, i - 1, j); // 上
        dfs(grid, i, j + 1); // 右
        dfs(grid, i, j - 1); // 左
    }
}
