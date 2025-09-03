package com.mibcxb.codetips.samples.questions;

import java.util.Arrays;

public class P2Q25 {
    public static void main(String[] args) {

    }

    public static boolean remainOne(int[] arr) {
        Arrays.sort(arr);
        boolean result = true;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] - arr[i - 1] > 1) {
                result = false;
                break;
            }
        }
        return result;
    }
}
