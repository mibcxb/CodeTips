package com.mibcxb.codetips.samples.questions;

import java.util.Scanner;

public class P2Q27 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();
        int rounds = n / m;
        int remain = n % m;
        int roundsTime = Math.min(a, b * m) + m;
        int remainTime = Math.min(a, b * remain) + remain;
        int minutes = rounds * roundsTime + remainTime;
        System.out.print(minutes);
    }
}
