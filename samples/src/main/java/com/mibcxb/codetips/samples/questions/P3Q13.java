package com.mibcxb.codetips.samples.questions;

public class P3Q13 {
    public static void main(String[] args) {
        int[] arr = {1, 0, 2, 3, 5, 0, 1, 1, 1, 1, 1};
        System.out.println(maxLen(arr));
    }

    public static int maxLen(int[] arr) {
        int max = 0;
        int len = 0;
        for (int i : arr) {
            if (i == 0) {
                len = 0;
            } else {
                len++;
                max = Math.max(max, len);
            }
        }
        return max;
    }
}
