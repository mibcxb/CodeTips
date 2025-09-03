package com.mibcxb.codetips.samples.questions;

public class P2Q12 {
    public static void main(String[] args) {

    }

    public static int maxLen(String s) {
        if (s == null || s.isEmpty()) return 0;
        int maxLen = 1;
        int curLen = 1;
        char[] chars = s.toCharArray();
        for (int i = 1; i < chars.length; i++) {
            if (Math.abs(chars[i] - chars[i - 1]) == 1) {
                curLen++;
                maxLen = Math.max(curLen, maxLen);
            } else {
                curLen = 1;
            }
        }
        return maxLen;
    }
}
