package com.mibcxb.codetips.samples.questions;

public class P1Q21 {
    public static void main(String[] args) {

    }

    public static int maxUpperCount(String s, int k) {
        int upperCount = 0;
        for (int i = 0; i < s.length(); i++) {
            if (Character.isUpperCase(s.charAt(i))) {
                upperCount++;
            }
        }
        int lowerCount = s.length() - upperCount;
        return upperCount + Math.min(lowerCount, k);
    }
}
