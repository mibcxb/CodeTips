package com.mibcxb.codetips.samples.questions;

import java.util.Arrays;

public class P2Q01 {
    public static void main(String[] args) {

    }

    public static int minGroups(int[] scores) {
        Arrays.sort(scores);
        int groups = 0;
        int n = scores.length;
        int l = 0;
        int r;
        while (l < n) {
            r = l + 2;
            if (r < n && scores[r] - scores[l] <= 10) {
                l = r + 1;
            } else {
                r = l + 1;
                if (r < n && scores[r] - scores[l] <= 20) {
                    l = r + 1;
                } else {
                    l = r;
                }
            }
            groups++;
        }
        return groups;
    }
}
