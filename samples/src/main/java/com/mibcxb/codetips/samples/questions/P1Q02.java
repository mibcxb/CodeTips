package com.mibcxb.codetips.samples.questions;

public class P1Q02 {
    public static void main(String[] args) {
        System.out.println(convertByBitCount("ABCDEFG"));
    }

    public static String convertByBitCount(String source) {
        char[] chars = source.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (Integer.bitCount(i) % 2 == 0) {
                chars[i] = Character.toLowerCase(chars[i]);
            }
        }
        return new String(chars);
    }
}
