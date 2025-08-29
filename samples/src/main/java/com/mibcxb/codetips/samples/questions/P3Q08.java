package com.mibcxb.codetips.samples.questions;

public class P3Q08 {
    public static void main(String[] args) {
        System.out.println(longestLength("()()"));
        System.out.println(longestLength("())"));
        System.out.println(longestLength(")())"));
    }

    public static int longestLength(String s) {
        int balance = 0;
        int best = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                balance++;
            } else {
                balance--;
            }
            if (balance < 0) {
                break;
            }
            if (balance == 0) {
                best = i + 1;
            }
        }
        return best;
    }
}
