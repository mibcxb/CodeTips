package com.mibcxb.codetips.samples.questions;

import java.util.Arrays;
import java.util.Scanner;

public class P1Q27 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] flowers = new int[n];
        for (int i = 0; i < n; i++) {
            flowers[i] = sc.nextInt();
        }
        Arrays.sort(flowers);
        long sum = 0;
        int c;
        for (int i = 0; i < n; i++) {
            c = flowers[i];
            if (n % 2 == 0 && i == 0) continue;
            if (c % 2 == 0) {
                sum += c - 1;
            } else {
                sum += c;
            }
        }
        System.out.println(sum);
    }
}
