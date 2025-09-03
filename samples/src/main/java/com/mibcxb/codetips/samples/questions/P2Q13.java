package com.mibcxb.codetips.samples.questions;

import java.util.Scanner;

public class P2Q13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int minCost = 0;
        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length - 5; i++) {
            int cost = cost(chars[i], 'A') + cost(chars[i], 'c') + cost(chars[i], 'M') + cost(chars[i], 'e') + cost(chars[i], 'r');
            minCost = Math.min(minCost, cost);
        }
        System.out.println(minCost);
    }

    public static int cost(char src, char dst) {
        if (src == dst) {
            return 0;
        }
        if (Character.toLowerCase(src) == Character.toLowerCase(dst)) {
            return 5;
        }
        return 10;
    }
}
