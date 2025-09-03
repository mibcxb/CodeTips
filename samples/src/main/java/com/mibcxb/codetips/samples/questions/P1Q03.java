package com.mibcxb.codetips.samples.questions;

public class P1Q03 {
    public static void main(String[] args) {
        System.out.println(noneZeroMaxLen("12340123045"));
    }

    public static String noneZeroMaxLen(String source) {
        int curStart = 0;
        int maxStart = 0;
        int maxLen = 0;
        for (int i = 0; i < source.length(); i++) {
            if (source.charAt(i) == '0') {
                curStart = i + 1;
            } else {
                if (i - curStart + 1 > maxLen) {
                    maxLen = i - curStart + 1;
                    maxStart = curStart;
                }
            }
        }
        return maxLen == 0 ? "" : source.substring(maxStart, maxStart + maxLen);
    }
}
