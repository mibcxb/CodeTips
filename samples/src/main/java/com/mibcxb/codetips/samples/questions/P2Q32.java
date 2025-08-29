package com.mibcxb.codetips.samples.questions;

public class P2Q32 {
    public static void main(String[] args) {
        System.out.println(shareApples(15,5,4));
    }

    public static int shareApples(int m, int n, int k) {
        m -= n;
        int max = 1;
        while (m > 0) {
            int range = Math.min(k - 1, max - 1) + Math.min(n - k, max - 1) + 1;
            if (max >= range) {
                m -= range;
                max++;
            } else {
                break;
            }
        }
        return max;
    }
}
