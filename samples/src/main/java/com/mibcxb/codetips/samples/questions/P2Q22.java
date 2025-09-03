package com.mibcxb.codetips.samples.questions;

public class P2Q22 {
    public static void main(String[] args) {

    }

    public static double hexagonArea(int length, int[] grades, int[] totals) {
        double sin60 = Math.sin(Math.PI / 3);
        double areaSum = 0f;
        for (int i = 0; i < 6; i++) {
            areaSum += (grades[i] * length) * (grades[(i + 1) % 6] * length * sin60) / 2;
        }
        return areaSum / 10000;
    }
}
