package com.mibcxb.codetips.samples.questions;

public class P2Q06 {
    public static void main(String[] args) {

    }

    public static int[] swapNumbers(int[] arr, int m) {
        for (int k = 1; k <= m; k++) {
            for (int i = 0; i < arr.length - 1; i++) {
                if (arr[i] % k > arr[i + 1] % k) {
                    int temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                }
            }
        }
        return arr;
    }
}
