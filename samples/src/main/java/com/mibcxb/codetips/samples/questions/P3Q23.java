package com.mibcxb.codetips.samples.questions;

public class P3Q23 {
    public static void main(String[] args) {
        System.out.println(findMaxY(5, 4));
    }

    public static int findMaxY(int x, int m) {
        int y = 0;
        int t;
        for (int i = 30; i >= 0; i--) {
            t = 1 << i;
            if ((x & t) == 0 && (y | t) <= m) {
                y |= t;
            }
        }
        return y;
    }
}
