package com.mibcxb.codetips.samples.questions;

public class P3Q09 {
    public static void main(String[] args) {
        removeOneChar("2012");
        removeOneChar("2012+2013+2015-2019+2020");
    }

    public static void removeOneChar(String str) {
        long max = Long.MIN_VALUE;
        for (int i = 0; i < str.length(); i++) {
            String s = str.substring(0, i) + str.substring(i + 1);
            max = Math.max(max, calc(s));
        }
        System.out.println(max);
    }

    public static long calc(String s) {
        if (s.isEmpty()) {
            return 0;
        }
        long result = 0;
        String[] pArr = s.split("\\+");
        String[] mArr;
        String text;
        long parsed;
        for (String pStr : pArr) {
            if (pStr.isEmpty()) {
                continue;
            }
            mArr = pStr.split("-");
            for (int j = 0; j < mArr.length; j++) {
                text = mArr[j];
                parsed = text.isEmpty() ? 0 : Long.parseLong(text);
                if (j == 0) {
                    result += parsed;
                } else {
                    result -= parsed;
                }
            }
        }
        return result;
    }

    public static long calculate(String s) {
        //String[] pArr = s.split("\\+");
        boolean flag = false;
        long result = 0;
        int l = -1;
        char c;
        long v;
        for (int r = 0; r <= s.length(); r++) {
            if (r == s.length() && l != -1) {
                v = Long.parseLong(s.substring(l, r));
                if (flag) {
                    v = -v;
                }
                result += v;
                continue;
            }
            c = s.charAt(r);
            if (c == '+') {
                if (l != -1) {
                    v = Long.parseLong(s.substring(l, r));
                    if (flag) {
                        v = -v;
                    }
                    result += v;
                }
                flag = false;
                l = -1;
            } else if (c == '-') {
                if (l != -1) {
                    v = Long.parseLong(s.substring(l, r));
                    if (flag) {
                        v = -v;
                    }
                    result += v;
                }
                flag = true;
                l = -1;
            } else {
                if (l == -1) {
                    l = r;
                }
            }
        }
        return result;
    }

}
