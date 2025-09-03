package com.mibcxb.codetips.samples.questions;

import java.util.Arrays;

public class P2Q28 {
    public static void main(String[] args) {

    }

    public static int poolingOne(int[][] matrix) {
        while (matrix.length > 1) {
            matrix = poolingOpt(matrix);
        }
        return matrix[0][0];
    }

    public static int[][] poolingOpt(int[][] matrix) {
        int newSize = matrix.length / 2;
        int[][] output = new int[newSize][newSize];
        // 遍历每个2×2块
        for (int i = 0; i < newSize; i++) {
            for (int j = 0; j < newSize; j++) {
                // 提取当前2×2块
                int[] block = {
                        matrix[2 * i][2 * j],        // 左上
                        matrix[2 * i][2 * j + 1],    // 右上
                        matrix[2 * i + 1][2 * j],    // 左下
                        matrix[2 * i + 1][2 * j + 1] // 右下
                };
                Arrays.sort(block); // 排序块内元素（升序）
                output[i][j] = block[2];
            }
        }
        return output;
    }
}
