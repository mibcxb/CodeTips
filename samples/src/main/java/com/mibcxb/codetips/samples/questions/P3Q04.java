package com.mibcxb.codetips.samples.questions;

import java.util.Arrays;

public class P3Q04 {
    public static void main(String[] args) {
        System.out.println(asciiSum("ABCDEFGHIJKLMNOPQRSTUVW"));
    }

    public static int asciiSum(String s) {
        int[] marks = new int[26];
        Arrays.fill(marks, 0);
        for (char c : s.toCharArray()) {
            if ('A' <= c && c <= 'Z') {
                marks[c - 'A'] = 1;
            }
        }
        int sum = 0;
        for (int i = 0; i < marks.length; i++) {
            if (marks[i] == 0) {
                sum += 'A' + i;
            }
        }
        return sum;
    }
}
