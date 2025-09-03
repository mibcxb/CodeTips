package com.mibcxb.codetips.samples.questions;

import java.util.Arrays;
import java.util.Scanner;

public class P2Q17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] cost = new int[m];
        int r;
        int g;
        for (int i = 0; i < m; i++) {
            r = sc.nextInt();
            g = sc.nextInt();
            if (r < g) {
                cost[i] = (g - r) / 2;
            } else {
                cost[i] = 0;
            }
        }
        Arrays.sort(cost);

        int result = 0;
        for (int i = 0; i < cost.length - 1; i++) {
            result = result + cost[i];
        }
        System.out.print(result);
    }
}
