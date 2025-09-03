package com.mibcxb.codetips.samples.questions;

public class P2Q05 {
    public static void main(String[] args) {

    }

    public static int minMessageCount(int[][] scores) {
        int students = scores.length;
        if (students == 0) return 0;
        int courses = scores[0].length;

        double[] courseAverages = new double[courses];
        for (int c = 0; c < courses; c++) {
            double sum = 0;
            for (int[] score : scores) {
                sum += score[c];
            }
            courseAverages[c] = sum / students;
        }

        int count = 0;
        for (int[] score : scores) {
            boolean flag = false;
            for (int c = 0; c < courses; c++) {
                if (score[c] > courseAverages[c]) {
                    flag = true;
                    break;
                }
            }
            if (flag) {
                count++;
            }
        }
        return count;
    }
}
