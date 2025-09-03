package com.mibcxb.codetips.samples.questions;

import java.util.Scanner;

public class P2Q31 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        String text = sc.next();
        int result = 0;
        for (int i = 0; i < m; i++) {
            String keyword = sc.next();
            result = result + checkStr(text, keyword);
        }
        System.out.println(result);
    }

    public static int checkStr(String text, String keyword) {
        int index = 0;
        int count = 0;
        while ((index = text.indexOf(keyword, index)) != -1) {
            index = index + keyword.length();
            count++;
        }
        return count;
    }
}
