package com.mibcxb.codetips.samples.questions;

import java.util.Scanner;

public class P3Q15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            int sum = 0;
            for (int j = 0; j < n; j++) {
                sum += sc.nextInt();
            }
            if (sum >= m) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        }
    }
}
