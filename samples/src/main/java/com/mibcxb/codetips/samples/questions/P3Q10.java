package com.mibcxb.codetips.samples.questions;

public class P3Q10 {
    public static void main(String[] args) {
        System.out.println(sum(1)); // 1
        System.out.println(sum(2)); // 2
        System.out.println(sum(3)); // 5
        System.out.println(sum(4)); // 6
        System.out.println(sum(5)); // 11
    }

    public static long sum(long n) {
        long sum = 0;
        for (long i = 1; i <= n; i++) {
            sum += i / lsb(i);
        }
        return sum;
    }

    /**
     * Last Set Bit
     */
    public static long lsb(long x) {
        return x & (-x);
    }
}

