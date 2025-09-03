package com.mibcxb.codetips.samples.questions;

public class P1Q23 {
    public static void main(String[] args) {

    }

    public static int noRidiculeLen(int[] rs, int[] bs, int n) {
        if (n <= 1) return 1;
        int maxLen = 1;
        int curLen = 1;
        int rd, bd;
        for (int i = 1; i < n; i++) {
            rd = rs[i] - rs[i - 1];
            bd = bs[i] - bs[i - 1];
            if (rd == bd) {
                curLen++;
                maxLen = Math.max(maxLen, curLen);
            } else {
                curLen = 1;
            }
        }
        return maxLen;
    }
}
