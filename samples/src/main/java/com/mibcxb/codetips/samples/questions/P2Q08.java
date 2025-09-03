package com.mibcxb.codetips.samples.questions;

public class P2Q08 {
    public static void main(String[] args) {

    }

    public static int findMissingNum(int n, int xorSum) {
        int curSum = 0;
        for (int k = 1; k <= n; k++) {
            curSum ^= k;
        }
        return curSum ^ xorSum;
    }
}
