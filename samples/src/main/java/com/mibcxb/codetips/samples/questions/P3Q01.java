package com.mibcxb.codetips.samples.questions;

public class P3Q01 {
    public static void main(String[] args) {
        System.out.println(makeNonDecreasing(new int[]{2, 1, 5, 4}));
    }

    public static int makeNonDecreasing(int[] arr) {
        if (arr.length < 2) {
            return 0;
        }
        int count = 0;
        int prev = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < prev) {
                count += prev - arr[i];
            } else {
                prev = arr[i];
            }
        }
        return count;
    }
}
