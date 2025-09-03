package com.mibcxb.codetips.samples.questions;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class P1Q14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.next();
        String s2 = sc.next();

        Set<Character> cSet = new HashSet<>();
        for (char c : s2.toCharArray()) {
            cSet.add(c);
        }

        StringBuilder sb = new StringBuilder();
        for (char c : s1.toCharArray()) {
            if (!cSet.contains(c)) {
                sb.append(c);
            }
        }
        System.out.println(sb.toString());
    }
}
