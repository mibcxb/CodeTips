package com.mibcxb.codetips.samples.questions;

public class P2Q24 {
    public static void main(String[] args) {

    }

    public static int countOpt(int[] arr, int k, int m) {
        int arrSum = 0;
        int minOpt = 0; // 使所有元素不小于K的操作数
        for (int a : arr) {
            if (a < k) {
                minOpt += k - a;
                arrSum += k;
            } else {
                arrSum += a;
            }
        }
        int avgOpt = Math.abs(m * arr.length - arrSum); // 使数组平均值等于m的操作数
        return avgOpt + minOpt;
    }
}
