package com.mibcxb.codetips.samples.questions;

import java.util.Scanner;

public class P3Q21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int k = sc.nextInt();
            int sum = 0;
            int i = 1;
            while (true) {
                if (sum + Math.pow(i, 2) <= k) {
                    sum += (int) Math.pow(i, 2);
                    i++;
                } else {
                    break;
                }
            }
            System.out.println(sum);
        }
    }
}
