package com.mibcxb.codetips.samples.questions;

public class P1Q01 {
    public static void main(String[] args) {
        int[] source = {9, 0, 1, 2};
        int[] target = {1, 2, 3, 4};
        System.out.println(minOps(source, target));
    }

    public static int minOps(int[] source, int[] target) {
        int count = 0;
        for (int i = 0; i < source.length; i++) {
            count += (source[i] - target[i] + 10) % 10;
        }
        return count;
    }
}
