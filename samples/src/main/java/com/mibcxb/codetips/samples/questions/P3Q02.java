package com.mibcxb.codetips.samples.questions;

public class P3Q02 {
    public static void main(String[] args) {
        System.out.println(lca(8, 13)); // 1
        System.out.println(lca(14, 15)); // 7
        System.out.println(lca(10, 9)); // 2
        System.out.println(lca(6, 14)); // 3
    }

    public static long lca(int a, int b) {
        if (a <= 0 || b <= 0) {
            return -1;
        }
        while (a != b) {
            if (a > b) {
                a >>= 1;
            } else {
                b >>= 1;
            }
        }
        return a;
    }
}
