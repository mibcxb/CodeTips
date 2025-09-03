package com.mibcxb.codetips.samples.questions;

import java.util.HashSet;
import java.util.Set;

public class P2Q09 {
    public static void main(String[] args) {

    }

    public static String countNum(String source) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < source.length(); i++) {
            Set<Character> set = new HashSet<>();
            for (int j = 0; j < i; j++) {
                set.add(source.charAt(j));
            }
            sb.append(set.size());
        }
        return sb.toString();
    }
}
