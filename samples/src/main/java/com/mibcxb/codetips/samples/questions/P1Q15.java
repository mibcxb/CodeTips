package com.mibcxb.codetips.samples.questions;

import java.util.Scanner;

public class P1Q15 {
    public static final char[] VOWELS = new char[]{'a', 'e', 'i', 'o', 'u'};

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(solve(str));
    }

    //是否是元音
    public static boolean isNotVowel(char c) {
        return "aeiou".indexOf(c) == -1;
    }

    //元音直接添加，辅音：辅音+最近且最靠前元音+后一个辅音
    public static String solve(String str) {
        StringBuilder sb = new StringBuilder();
        char ch;
        for (int i = 0; i < str.length(); i++) {
            ch = str.charAt(i);
            sb.append(ch);
            if (isNotVowel(ch)) {
                sb.append(closeVowel(ch));
                sb.append(nextChar(ch));
            }
        }
        return sb.toString();
    }

    //获取最近且最靠前元音
    public static char closeVowel(char ch) {
        char vowel = ' ';
        int dif = Integer.MAX_VALUE;
        for (char vc : VOWELS) {
            int abs = Math.abs(ch - vc);
            if (dif > abs) {
                dif = abs;
                vowel = vc;
            }
        }
        return vowel;
    }

    public static char nextChar(char ch) {
        char next = (char) (ch + 1);
        if (isNotVowel(next)) {
            return next;
        } else {
            return (char) (next + 1);
        }
    }
}
