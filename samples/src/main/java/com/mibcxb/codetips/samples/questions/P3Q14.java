package com.mibcxb.codetips.samples.questions;

import java.util.Scanner;

public class P3Q14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();
        int countA = 0;
        int countB = 0;
        int v;
        for (int i = 0; i < n; i++) {
            v = sc.nextInt();
            if (v == a) countA++;
            if (v == b) countB++;
        }
        double pA = (double) countA / (double) n;
        double pB = (double) countB / (double) n;
        double result = 1d / (pA * pB);
        System.out.printf("%.1f", result);
    }

}
