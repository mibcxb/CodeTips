package com.mibcxb.codetips.samples.questions;

import java.util.Arrays;

public class P3Q03 {
    public static void main(String[] args) {
        isGoodNumArr(new int[]{1, 1, 1, 1, 1}, 3);
        isGoodNumArr(new int[]{1, 2, 3, 4}, 2);
    }

    public static void isGoodNumArr(int[] arr, int k) {
        int[] distinct = Arrays.stream(arr).distinct().toArray();
        boolean flag = arr.length % k <= distinct.length;
        System.out.println(flag ? "yes" : "no");
    }
}
