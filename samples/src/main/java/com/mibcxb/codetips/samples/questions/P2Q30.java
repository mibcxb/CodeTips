package com.mibcxb.codetips.samples.questions;

import java.util.Scanner;

public class P2Q30 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();
            String s = sc.next();
            StringBuilder sb = new StringBuilder();
            for (int j = 0; j < n; j++) {
                char target = s.charAt(j);
                String ss = s.substring(0, j);
                long count = ss.chars().filter(c -> c != target).count();
                sb.append(count).append(" ");
            }
            System.out.println(sb);
        }
    }
}
