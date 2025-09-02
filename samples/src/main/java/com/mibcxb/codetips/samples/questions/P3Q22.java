package com.mibcxb.codetips.samples.questions;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.List;

public class P3Q22 {
    public static void main(String[] args) {
        detectNumStr("sfr123456fdgrt28r");
    }

    public static void detectNumStr(String s) {
        Pattern pattern = Pattern.compile("\\d+");
        Matcher matcher = pattern.matcher(s);
        List<String> list = new ArrayList<>();
        while (matcher.find()) {
            list.add(matcher.group());
        }
        if (list.isEmpty()) {
            System.out.println("false");
            return;
        }

        String flag = "false";
        for (String str : list) {
            if (isConsecutive(str)) {
                flag = "true";
            }
        }
        System.out.println(flag);
    }

    public static boolean isConsecutive(String str) {
        int trend = 0;
        char prev, curr;
        for (int i = 1; i < str.length(); i++) {
            prev = str.charAt(i - 1);
            curr = str.charAt(i);
            if (prev == curr) {
                return false;
            }
            if (trend == 0) {
                trend = curr - prev;
                if (Math.abs(trend) != 1) {
                    return false;
                }
            } else {
                if (curr - prev != trend) {
                    return false;
                }
            }
        }
        return true;
    }
}
