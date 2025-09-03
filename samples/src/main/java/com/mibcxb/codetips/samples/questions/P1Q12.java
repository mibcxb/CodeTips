package com.mibcxb.codetips.samples.questions;

import java.util.Scanner;

public class P1Q12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        int len = 1;
        while (str.length() > len) {
            int num = Integer.parseInt(str.substring(0, len), 2);
            System.out.println(num);
            str = str.substring(len++);
        }
    }
}
