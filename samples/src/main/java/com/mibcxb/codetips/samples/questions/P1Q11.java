package com.mibcxb.codetips.samples.questions;

import java.util.Scanner;

public class P1Q11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int result = 0;
        for (int i = 1; i <= n; i++) {
            String str = sc.next();
            int num = Integer.parseInt(str, 2);
            if (Integer.bitCount(num) % 2 == 0) {
                result ^= num;
            }
        }
        System.out.println(result);
    }
}
