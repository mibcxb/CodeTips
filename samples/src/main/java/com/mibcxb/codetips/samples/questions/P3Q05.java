package com.mibcxb.codetips.samples.questions;

public class P3Q05 {
    public static void main(String[] args) {
        System.out.println(countDivisibility(7)); // 1，7被自己整除，因此答案是1
        System.out.println(countDivisibility(121)); // 2，121可以被1整除，不能被2整除，且1出现了两次因此答案是2
        System.out.println(countDivisibility(1248)); // 4，可以被它每一位上的数字整除，因此答案是4
    }

    public static int countDivisibility(int num) {
        int count = 0;
        int n = num;
        int d;
        while (n != 0) {
            d = n % 10;
            if (num % d == 0) {
                count++;
            }
            n /= 10;
        }
        return count;
    }
}
