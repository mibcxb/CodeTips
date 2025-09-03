package com.mibcxb.codetips.samples.questions;

import java.util.Arrays;

public class P2Q16 {
    public static void main(String[] args) {
        drawLi(1);
    }

    public static void drawLi(int n) {
        int size = 11 * n;
        String dots = ".".repeat(size);
        String starLine = ".".repeat(2 * n) + "*".repeat(7 * n) + ".".repeat(2 * n);
        String dash3Str = ".".repeat(2 * n) + "*".repeat(n) + ".".repeat(2 * n) + "*".repeat(n) + ".".repeat(2 * n) + "*".repeat(n) + ".".repeat(2 * n);
        String dash1Str = ".".repeat(5 * n) + "*".repeat(n) + ".".repeat(5 * n);
        String lastLine = ".".repeat(n) + "*".repeat(9 * n) + ".".repeat(n);
        int j;
        for (int i = 0; i < size; i++) {
            j = i / n % 11;
            if (j == 9) {
                System.out.println(lastLine);
            } else if (j == 1 || j == 3 || j == 5 || j == 7) {
                System.out.println(starLine);
            } else if (j == 2 || j == 4) {
                System.out.println(dash3Str);
            } else if (j == 6 || j == 8) {
                System.out.println(dash1Str);
            } else {
                System.out.println(dots);
            }
        }
    }

    // 如果没有String.repeat(n)方法，可以用下面方法替换
    public static String repeat(char c, int n) {
        char[] chars = new char[n];
        Arrays.fill(chars, c);
        return new String(chars);
    }
}
