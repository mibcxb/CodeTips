package com.mibcxb.codetips.samples.questions;

import java.util.Scanner;

public class P2Q19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int bits = 0;
        while (sc.hasNext()) {
            bits |= sc.nextInt();
        }
        int result = Integer.bitCount(bits);
        System.out.print(result);
    }
}
