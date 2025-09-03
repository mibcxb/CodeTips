package com.mibcxb.codetips.samples.questions;

import java.util.Arrays;

public class P2Q11 {
    public static void main(String[] args) {

    }

    public static int ostrichHeight(int[] arr, int h) {
        Arrays.sort(arr);
        int height = h;
        for (int i : arr) {
            if (i <= height) {
                height++;
            }
        }
        return height;
    }
}
