package com.mibcxb.codetips.samples.questions;

import java.util.Arrays;
import java.util.Scanner;

public class P1Q06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        Arrays.sort(a);
        int sum = 0;
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (sum + a[i] < k) {
                sum += a[i];
                count++;
            } else {
                break;
            }
        }
        System.out.println(count);
    }
}
