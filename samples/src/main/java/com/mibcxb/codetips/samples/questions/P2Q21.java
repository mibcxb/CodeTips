package com.mibcxb.codetips.samples.questions;

public class P2Q21 {
    public static void main(String[] args) {
        System.out.println(isABStr("aabb"));
        System.out.println(isABStr("abab"));
        System.out.println(isABStr("aabbb"));
        System.out.println(isABStr("baba"));
    }

    public static boolean isABStr(String s) {
        while (s.contains("ab")) {
            s = s.replaceAll("ab", "");
        }
        return s.isEmpty();
    }
}
